package dj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class o implements ui.l<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui.l<Bitmap> f59861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59862c;

    public o(ui.l<Bitmap> lVar, boolean z14) {
        this.f59861b = lVar;
        this.f59862c = z14;
    }

    @Override // ui.l
    public final wi.u<Drawable> a(Context context, wi.u<Drawable> uVar, int i14, int i15) {
        xi.d dVar = com.bumptech.glide.b.b(context).f28454b;
        Drawable drawable = uVar.get();
        e eVarA = n.a(dVar, drawable, i14, i15);
        if (eVarA == null) {
            if (!this.f59862c) {
                return uVar;
            }
            org.apache.commons.lang3.e.l("Unable to convert ", drawable, " to a Bitmap");
            return null;
        }
        wi.u<Bitmap> uVarA = this.f59861b.a(context, eVarA, i14, i15);
        if (!uVarA.equals(eVarA)) {
            return w.c(context.getResources(), uVarA);
        }
        uVarA.b();
        return uVar;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        this.f59861b.b(messageDigest);
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f59861b.equals(((o) obj).f59861b);
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        return this.f59861b.hashCode();
    }
}
