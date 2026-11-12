package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u67 extends odm {
    public final v67 o;

    public u67(List<byte[]> list) {
        super("DvbDecoder");
        okh okhVar = new okh(list.get(0));
        this.o = new v67(okhVar.J(), okhVar.J());
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.r();
        }
        return new w67(this.o.b(bArr, i));
    }
}
