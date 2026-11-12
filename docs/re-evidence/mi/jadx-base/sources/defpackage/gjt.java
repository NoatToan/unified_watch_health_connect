package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class gjt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jjt f19069a;

    public gjt(jjt jjtVar) {
        this.f19069a = jjtVar;
    }

    @Override // defpackage.pjt
    public final void a(qjt qjtVar, File file, boolean z) throws IOException {
        this.f19069a.f22876b.add(file);
        if (z) {
            return;
        }
        this.f19069a.c.set(false);
    }
}
