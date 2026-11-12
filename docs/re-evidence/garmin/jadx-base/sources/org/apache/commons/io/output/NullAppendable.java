package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes3.dex */
public class NullAppendable implements Appendable {
    public static final NullAppendable INSTANCE = new NullAppendable();

    private NullAppendable() {
    }

    @Override // java.lang.Appendable
    public Appendable append(char c14) {
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i14, int i15) {
        return this;
    }
}
