package hj;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import ui.l;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class f implements l<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Bitmap> f83934b;

    public f(l<Bitmap> lVar) {
        qj.l.c(lVar, "Argument must not be null");
        this.f83934b = lVar;
    }

    @Override // ui.l
    public final u<c> a(Context context, u<c> uVar, int i14, int i15) {
        c cVar = uVar.get();
        u<Bitmap> eVar = new dj.e(cVar.f83923a.f83933a.f83946l, com.bumptech.glide.b.b(context).f28454b);
        l<Bitmap> lVar = this.f83934b;
        u<Bitmap> uVarA = lVar.a(context, eVar, i14, i15);
        if (!eVar.equals(uVarA)) {
            eVar.b();
        }
        cVar.f83923a.f83933a.c(lVar, uVarA.get());
        return uVar;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        this.f83934b.b(messageDigest);
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f83934b.equals(((f) obj).f83934b);
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        return this.f83934b.hashCode();
    }
}
