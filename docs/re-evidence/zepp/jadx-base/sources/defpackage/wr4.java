package defpackage;

import androidx.annotation.Nullable;
import com.huami.mifit.analytics.function.Supplier;
import com.huami.mifit.analytics.log.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class wr4 {
    public static void a(@Nullable Logger _this, @Nullable String str, Supplier supplier) {
        _this.log(3, str, null, supplier);
    }

    public static void b(@Nullable Logger _this, @Nullable String str, Supplier supplier) {
        _this.log(6, str, null, supplier);
    }

    public static void c(@Nullable Logger _this, @Nullable String str, Throwable th) {
        _this.log(6, str, th, null);
    }

    public static void d(@Nullable Logger _this, @Nullable String str, @Nullable Throwable th, Supplier supplier) {
        _this.log(6, str, th, supplier);
    }

    public static void e(@Nullable Logger _this, @Nullable String str, Supplier supplier) {
        _this.log(4, str, null, supplier);
    }

    public static void f(@Nullable Logger _this, @Nullable String str, Supplier supplier) {
        _this.log(2, str, null, supplier);
    }

    public static void g(@Nullable Logger _this, @Nullable String str, Supplier supplier) {
        _this.log(5, str, null, supplier);
    }

    public static void h(@Nullable Logger _this, @Nullable String str, Throwable th) {
        _this.log(5, str, th, null);
    }

    public static void i(@Nullable Logger _this, @Nullable String str, @Nullable Throwable th, Supplier supplier) {
        _this.log(5, str, th, supplier);
    }

    public static void j(@Nullable Logger _this, @Nullable String str, Supplier supplier) {
        _this.log(7, str, null, supplier);
    }

    public static void k(@Nullable Logger _this, @Nullable String str, Throwable th) {
        _this.log(7, str, th, null);
    }

    public static void l(@Nullable Logger _this, @Nullable String str, @Nullable Throwable th, Supplier supplier) {
        _this.log(7, str, th, supplier);
    }
}
