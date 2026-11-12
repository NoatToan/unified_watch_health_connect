package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ii5 extends oe {
    public ii5(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.oe
    public void j(gd gdVar) throws IOException {
        if (gdVar == null) {
            throw new IOException("null object detected");
        }
        gdVar.toASN1Primitive().m().h(this);
    }
}
