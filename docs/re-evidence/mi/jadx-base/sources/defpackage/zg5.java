package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zg5 implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public af f41244a;

    public zg5(af afVar) {
        this.f41244a = afVar;
    }

    @Override // defpackage.d7d
    public pe getLoadedObject() throws IOException {
        return new xg5(this.f41244a.d());
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
