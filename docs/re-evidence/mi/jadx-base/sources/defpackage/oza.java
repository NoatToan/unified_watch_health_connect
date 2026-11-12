package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class oza implements lyp<kza> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lyp<Bitmap> f29840b;

    public oza(lyp<Bitmap> lypVar) {
        this.f29840b = (lyp) a6i.d(lypVar);
    }

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        this.f29840b.a(messageDigest);
    }

    @Override // defpackage.lyp
    public kqk<kza> b(Context context, kqk<kza> kqkVar, int i, int i2) {
        kza kzaVar = kqkVar.get();
        kqk<Bitmap> gq2Var = new gq2(kzaVar.e(), a.d(context).g());
        kqk<Bitmap> kqkVarB = this.f29840b.b(context, gq2Var, i, i2);
        if (!gq2Var.equals(kqkVarB)) {
            gq2Var.recycle();
        }
        kzaVar.m(this.f29840b, kqkVarB.get());
        return kqkVar;
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        if (obj instanceof oza) {
            return this.f29840b.equals(((oza) obj).f29840b);
        }
        return false;
    }

    @Override // defpackage.pzd
    public int hashCode() {
        return this.f29840b.hashCode();
    }
}
