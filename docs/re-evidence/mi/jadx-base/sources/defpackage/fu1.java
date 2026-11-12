package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class fu1 implements ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bf f18241a;

    public fu1(bf bfVar) {
        this.f18241a = bfVar;
    }

    @Override // defpackage.e7d
    public re getLoadedObject() throws IOException {
        return new du1(this.f18241a.d());
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
