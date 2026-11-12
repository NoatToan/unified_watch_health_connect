package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class eu1 implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public af f17066a;

    public eu1(af afVar) {
        this.f17066a = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return new cu1(this.f17066a.d());
    }

    @Override // defpackage.gd
    public pe toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
