package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class j0a {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f22286b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a(int i, b[] bVarArr) {
            this.f22285a = i;
            this.f22286b = bVarArr;
        }

        public static a a(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] b() {
            return this.f22286b;
        }

        public int c() {
            return this.f22285a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f22287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22288b;
        public final int c;
        public final boolean d;
        public final int e;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            this.f22287a = (Uri) g6i.g(uri);
            this.f22288b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public static b a(Uri uri, @IntRange(from = 0) int i, @IntRange(from = 1, to = 1000) int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        @IntRange(from = 0)
        public int c() {
            return this.f22288b;
        }

        public Uri d() {
            return this.f22287a;
        }

        @IntRange(from = 1, to = 1000)
        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class c {
        public void a(int i) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return q5q.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e0a e0aVar) throws PackageManager.NameNotFoundException {
        return d0a.e(context, e0aVar, cancellationSignal);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface c(Context context, e0a e0aVar, int i, boolean z, @IntRange(from = 0) int i2, Handler handler, c cVar) {
        db3 db3Var = new db3(cVar, handler);
        return z ? g0a.e(context, e0aVar, db3Var, i, i2) : g0a.d(context, e0aVar, i, null, db3Var);
    }
}
