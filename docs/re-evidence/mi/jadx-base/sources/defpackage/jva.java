package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class jva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f23172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ova f23173b;
    public Runnable c;
    public Executor d;
    public Executor e;
    public cp5<w14<u14>> f;

    public class a extends k22 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f23174a;

        public a(Uri uri) {
            this.f23174a = uri;
        }

        @Override // defpackage.n62
        public void onFailureImpl(cp5<w14<u14>> cp5Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to load '");
            sb.append(this.f23174a.getPath());
            sb.append("'");
            cp5Var.b();
        }

        @Override // defpackage.k22
        public void onNewResultImpl(Bitmap bitmap) {
            jva.this.e(bitmap);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f23176a;

        public b(Bitmap bitmap) {
            this.f23176a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            jva.this.f23173b.f(this.f23176a);
            this.f23176a.recycle();
            jva.this.c.run();
        }
    }

    public jva(Executor executor, Executor executor2, Runnable runnable) {
        this.c = runnable;
        this.d = executor;
        this.e = executor2;
        this.f23173b = new ova(executor);
    }

    public static Uri c(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase().replace("-", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR), "drawable", context.getPackageName()))).build();
    }

    public ova d() {
        return this.f23173b;
    }

    public void e(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmapCreateBitmap.setHasAlpha(true);
        this.d.execute(new b(bitmapCreateBitmap));
    }

    public final void f() {
        cp5<w14<u14>> cp5Var = this.f;
        if (cp5Var != null && !cp5Var.a()) {
            this.f.close();
        }
        Uri uri = this.f23172a;
        cp5<w14<u14>> cp5VarD = apa.a().d(ImageRequestBuilder.r(uri).s(false).a(), null);
        this.f = cp5VarD;
        cp5VarD.c(new a(uri), this.e);
    }

    public void g(Uri uri) {
        Uri uri2 = this.f23172a;
        if (uri2 != uri) {
            if (uri2 == null || !uri2.equals(uri)) {
                this.f23172a = uri;
                f();
            }
        }
    }
}
