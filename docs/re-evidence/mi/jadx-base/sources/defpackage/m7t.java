package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class m7t extends mbt {
    public m7t(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override // defpackage.mbt
    public final int b(CharSequence charSequence) {
        try {
            return super.b(charSequence);
        } catch (Throwable th) {
            fbt.a(th);
            return super.b("");
        }
    }
}
