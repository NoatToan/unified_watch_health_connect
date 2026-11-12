package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class np2 implements xqk<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f28214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xqk<Bitmap> f28215b;

    public np2(cq2 cq2Var, xqk<Bitmap> xqkVar) {
        this.f28214a = cq2Var;
        this.f28215b = xqkVar;
    }

    @Override // defpackage.xqk
    public EncodeStrategy a(cch cchVar) {
        return this.f28215b.a(cchVar);
    }

    @Override // defpackage.x98
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(kqk<BitmapDrawable> kqkVar, File file, cch cchVar) {
        return this.f28215b.b((Bitmap) new gq2(kqkVar.get().getBitmap(), this.f28214a), file, cchVar);
    }
}
