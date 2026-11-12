package hf2;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import e23.l;
import java.io.File;
import java.io.FileOutputStream;
import nj.c;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import qj.e;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhf2/a;", "", "<init>", "()V", "a", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1650a f83640a = new C1650a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f83641b = m.b(new ha0.a(6));

    /* JADX INFO: renamed from: hf2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhf2/a$a;", "", "<init>", "()V", "", "FILE_PATH", "Ljava/lang/String;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1650a {

        /* JADX INFO: renamed from: hf2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"hf2/a$a$a", "Lnj/c;", "Landroid/graphics/Bitmap;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1651a extends c<Bitmap> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ File f83642d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ l<Boolean, Unit> f83643e;

            /* JADX WARN: Multi-variable type inference failed */
            public C1651a(File file, l<? super Boolean, Unit> lVar) {
                this.f83642d = file;
                this.f83643e = lVar;
            }

            @Override // nj.h
            public final void a(Drawable drawable) {
            }

            @Override // nj.c, nj.h
            public final void c(Drawable drawable) {
                a.f83640a.getClass();
                C1650a.e().debug("onLoadFailed: ");
                this.f83643e.invoke(Boolean.FALSE);
            }

            @Override // nj.h
            public final void f(Object obj) throws Throwable {
                boolean zCompress;
                Bitmap bitmap = (Bitmap) obj;
                a.f83640a.getClass();
                Logger loggerE = C1650a.e();
                File file = this.f83642d;
                com.airbnb.lottie.animation.keyframe.a.w("writeImageToFile: ", file.getPath(), loggerE);
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            C1650a.e().debug("Compressing bitmap: ");
                            zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                            fileOutputStream2.close();
                        } catch (Exception e4) {
                            e = e4;
                            fileOutputStream = fileOutputStream2;
                            C1650a.e().error("Failed to store image: " + file.getPath() + " with error " + e);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            zCompress = false;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                    a.f83640a.getClass();
                    g.y("onResourceReady: writing image to file: ", zCompress, C1650a.e());
                    this.f83643e.invoke(Boolean.valueOf(zCompress));
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }

        public /* synthetic */ C1650a(j jVar) {
            this();
        }

        public static boolean a(Context context, long j8) {
            for (kf2.c cVar : kf2.c.values()) {
                a.f83640a.getClass();
                File fileC = c(context, b(j8, cVar));
                e().debug("isImageDownloaded for " + fileC.getPath() + ": " + fileC.exists());
                if (!fileC.exists()) {
                    return false;
                }
            }
            return true;
        }

        public static String b(long j8, kf2.c cVar) {
            return cVar.f104665a + j8;
        }

        public static File c(Context context, String str) {
            return new File(new ContextWrapper(context).getDir("campaignimages", 0), str);
        }

        public static void d(Context context, String str, long j8, kf2.c cVar, l lVar) {
            str.getClass();
            cVar.getClass();
            File fileC = c(context, b(j8, cVar));
            if (fileC.exists()) {
                a.f83640a.getClass();
                g.v("Image for ", j8, " already exists", e());
                lVar.invoke(Boolean.TRUE);
            } else {
                com.bumptech.glide.j<Bitmap> jVarJ = b.c(context).c(context).g().J(str);
                C1651a c1651a = new C1651a(fileC, lVar);
                jVarJ.getClass();
                jVarJ.F(c1651a, null, jVarJ, e.f144968a);
            }
        }

        public static Logger e() {
            return (Logger) a.f83641b.getValue();
        }

        private C1650a() {
        }
    }
}
