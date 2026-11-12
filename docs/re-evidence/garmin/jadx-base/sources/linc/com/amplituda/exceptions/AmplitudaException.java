package linc.com.amplituda.exceptions;

import tn.k;

/* JADX INFO: loaded from: classes3.dex */
public class AmplitudaException extends Exception {
    protected final int code;

    public AmplitudaException(String str, int i14) {
        super(k.g(str, "\nRead Amplituda doc here: https://github.com/lincollincol/Amplituda"));
        this.code = i14;
    }

    public int getCode() {
        return this.code;
    }

    public AmplitudaException() {
        this("Something went wrong!", 1);
    }
}
