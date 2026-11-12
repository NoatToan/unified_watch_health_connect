package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.nimbusds.jose.jwk.JWKParameterNames;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lg/e;", "Lg/a;", "Lf/j;", "Landroid/net/Uri;", "<init>", "()V", "a", "g", "d", "f", "c", JWKParameterNames.RSA_EXPONENT, "b", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class e extends g.a<f.j, Uri> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f74070a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg/e$c;", "Lg/e$g;", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f74073a = new c();

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg/e$d;", "Lg/e$g;", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f74074a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: g.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg/e$e;", "Lg/e$g;", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1503e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74075a;

        public C1503e(String str) {
            str.getClass();
            this.f74075a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg/e$f;", "Lg/e$g;", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements g {
        static {
            new f();
        }

        private f() {
        }
    }

    public interface g {
    }

    @Override // g.a
    public final Intent a(Context context, f.j jVar) {
        f.j jVar2 = jVar;
        context.getClass();
        jVar2.getClass();
        f74070a.getClass();
        if (a.c()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(a.b(jVar2.f67617a));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", jVar2.f67619c.a());
            return intent;
        }
        if (a.a(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(a.b(jVar2.f67617a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = a.a(context);
        if (resolveInfoA == null) {
            vb.h.z("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(a.b(jVar2.f67617a));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", jVar2.f67619c.a());
        return intent3;
    }

    @Override // g.a
    public final g.a.C1502a<Uri> b(Context context, f.j jVar) {
        context.getClass();
        jVar.getClass();
        return null;
    }

    @Override // g.a
    public final Uri c(int i14, Intent intent) {
        if (i14 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        g.c.f74067a.getClass();
        return (Uri) h0.d0(g.c.a.a(intent));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lg/e$a;", "", "<init>", "()V", "", "GMS_ACTION_PICK_IMAGES", "Ljava/lang/String;", "GMS_EXTRA_PICK_IMAGES_MAX", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static ResolveInfo a(Context context) {
            context.getClass();
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public static String b(g gVar) {
            gVar.getClass();
            if (gVar instanceof d) {
                return "image/*";
            }
            if (gVar instanceof f) {
                return "video/*";
            }
            if (gVar instanceof C1503e) {
                return ((C1503e) gVar).f74075a;
            }
            if (gVar instanceof c) {
                return null;
            }
            u0.r();
            return null;
        }

        @SuppressLint({"NewApi"})
        public static boolean c() {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                return true;
            }
            return i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg/e$b;", "", "<init>", "()V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg/e$b$a;", "Lg/e$b;", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f74071a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f74072b = 1;

            private a() {
                super(null);
            }

            @Override // g.e.b
            public final int a() {
                return f74072b;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public abstract int a();

        private b() {
        }
    }
}
