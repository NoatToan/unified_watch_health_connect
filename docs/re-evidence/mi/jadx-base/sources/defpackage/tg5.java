package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class tg5 extends oe {
    public tg5(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.oe
    public oe a() {
        return this;
    }

    @Override // defpackage.oe
    public oe b() {
        return this;
    }

    @Override // defpackage.oe
    public void j(gd gdVar) throws IOException {
        if (gdVar == null) {
            throw new IOException("null object detected");
        }
        gdVar.toASN1Primitive().l().h(this);
    }
}
