package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ah5 implements ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bf f1010a;

    public ah5(bf bfVar) {
        this.f1010a = bfVar;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        return new yg5(this.f1010a.d());
    }

    @Override // defpackage.hd
    public re toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
