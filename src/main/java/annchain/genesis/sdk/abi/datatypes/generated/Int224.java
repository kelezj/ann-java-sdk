package annchain.genesis.sdk.abi.datatypes.generated;

import annchain.genesis.sdk.abi.datatypes.Int;

import java.math.BigInteger;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.anChain.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/anChain/anChain/tree/master/codegen">codegen module</a> to update.
 */
public class Int224 extends Int {
    public static final Int224 DEFAULT = new Int224(BigInteger.ZERO);

    public Int224(BigInteger value) {
        super(224, value);
    }

    public Int224(long value) {
        this(BigInteger.valueOf(value));
    }
}