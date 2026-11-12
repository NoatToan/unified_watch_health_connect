package yr2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import dj.a0;
import dj.q;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f199148a;

    static {
        int i14 = gt2.c.f79010a;
        f199148a = gt2.b.f79005a.h("PAY#ImageViewExtensions");
    }

    public static final void a(ImageView imageView, String str, Integer num, String str2) {
        imageView.getClass();
        Object[] objArr = num != null ? new dj.f[]{new q(), new a0(num.intValue())} : new q[]{new q()};
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        com.bumptech.glide.k kVarC = com.bumptech.glide.b.c(contextC).c(contextC);
        kVarC.getClass();
        com.bumptech.glide.j<Drawable> jVarL = kVarC.l(str);
        jVarL.getClass();
        mj.a aVarG = jVarL.G(new h(new wn2.f(str2, 22, imageView, objArr)));
        aVarG.getClass();
        ui.l<Bitmap>[] lVarArr = (ui.l[]) Arrays.copyOf(objArr, objArr.length);
        if (lVarArr.length > 1) {
            aVarG = aVarG.w(new ui.f<>(lVarArr), true);
        } else if (lVarArr.length == 1) {
            aVarG = aVarG.w(lVarArr[0], true);
        } else {
            aVarG.o();
        }
        ((com.bumptech.glide.j) aVarG).d(wi.j.f185367d).E(imageView);
    }

    public static /* synthetic */ void b(ImageView imageView, String str, Integer num, int i14) {
        if ((i14 & 2) != 0) {
            num = null;
        }
        a(imageView, str, num, null);
    }
}
