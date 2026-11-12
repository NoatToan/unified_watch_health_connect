package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes3.dex */
public interface UncheckedAppendable extends Appendable {
    @Override // java.lang.Appendable
    UncheckedAppendable append(char c2);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence, int i, int i2);

    static UncheckedAppendable on(Appendable appendable) {
        return new UncheckedAppendableImpl(appendable);
    }
}
