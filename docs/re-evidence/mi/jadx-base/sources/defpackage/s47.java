package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class s47 implements lyp<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lyp<Bitmap> f33266b;
    public final boolean c;

    public s47(lyp<Bitmap> lypVar, boolean z) {
        this.f33266b = lypVar;
        this.c = z;
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        this.f33266b.a(messageDigest);
    }

    @Override // defpackage.lyp
    public kqk<Drawable> b(Context context, kqk<Drawable> kqkVar, int i, int i2) {
        cq2 cq2VarG = a.d(context).g();
        Drawable drawable = kqkVar.get();
        kqk<Bitmap> kqkVarA = r47.a(cq2VarG, drawable, i, i2);
        if (kqkVarA != null) {
            kqk<Bitmap> kqkVarB = this.f33266b.b(context, kqkVarA, i, i2);
            if (!kqkVarB.equals(kqkVarA)) {
                return d(context, kqkVarB);
            }
            kqkVarB.recycle();
            return kqkVar;
        }
        if (!this.c) {
            return kqkVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public lyp<BitmapDrawable> c() {
        return this;
    }

    public final kqk<Drawable> d(Context context, kqk<Bitmap> kqkVar) {
        return gee.c(context.getResources(), kqkVar);
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (obj instanceof s47) {
            return this.f33266b.equals(((s47) obj).f33266b);
        }
        return false;
    }

    @Override // defpackage.pzd
    public int hashCode() {
        return this.f33266b.hashCode();
    }
}
