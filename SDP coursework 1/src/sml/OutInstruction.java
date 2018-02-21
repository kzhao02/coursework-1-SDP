package sml;

public class OutInstruction extends Instruction {
    private int op1;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int op1) {
        this(label, "out");
        this.op1 = op1;

    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        System.out.println("from OutInstruction we get ," + value1);
    }

    @Override
    public String toString() {
        return super.toString()+" print the contents of register " + op1 + " on the Java console";
    }
}
