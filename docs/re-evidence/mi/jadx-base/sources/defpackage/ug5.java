package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ug5 extends ke {
    public ug5(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.ke
    public ke a() {
        return this;
    }

    @Override // defpackage.ke
    public ke b() {
        return this;
    }

    @Override // defpackage.ke
    public void j(hd hdVar) throws IOException {
        if (hdVar == null) {
            throw new IOException("null object detected");
        }
        hdVar.toASN1Primitive().l().h(this);
    }
}
