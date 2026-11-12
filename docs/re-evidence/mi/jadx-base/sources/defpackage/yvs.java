package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class yvs extends mvs {
    public yvs() {
        l("PING", null);
        k("0");
        h(0);
    }

    @Override // defpackage.mvs
    public ByteBuffer f(ByteBuffer byteBuffer) {
        return p().length == 0 ? byteBuffer : super.f(byteBuffer);
    }

    @Override // defpackage.mvs
    public int x() {
        if (p().length == 0) {
            return 0;
        }
        return super.x();
    }
}
