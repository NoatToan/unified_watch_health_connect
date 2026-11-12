package ve0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lve0/a;", "", "Landroid/net/Uri;", "launchUri", "<init>", "(Landroid/net/Uri;)V", "b", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f177664a;

    static {
        new b(null);
    }

    public a(Uri uri) {
        uri.getClass();
        this.f177664a = uri;
    }

    public static String a(Context context, boolean z14) {
        ActivityInfo activityInfo;
        String str = null;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.fromParts("https", "", null)), z14 ? 65536 : 131072);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            str = activityInfo.packageName;
        }
        String strG = j.g("launchReadOnlyView, browsersIntentName: ", str, " (matchDefaultOnly: ", z14, ")");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AuthorizedViewerLauncher", strG);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public final void b(Context context) {
        context.getClass();
        Uri uri = this.f177664a;
        String strJ = am.j.j(uri, "launchReadOnlyView: open link by action view, uri: ");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AuthorizedViewerLauncher", strJ);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        String strA = a(context, true);
        if (strA == null) {
            strA = a(context, false);
        } else {
            if (strA.equals("android")) {
                strA = null;
            }
            if (strA == null) {
                strA = a(context, false);
            }
        }
        intent.setPackage(strA);
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var2, "AuthorizedViewerLauncher", "open link failed by action view, uri: " + uri);
                intent.setPackage(null);
                context.startActivity(intent);
            }
        } catch (Throwable unused2) {
            String strJ2 = am.j.j(uri, "open link failed by action view directly, uri: ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "AuthorizedViewerLauncher", strJ2);
        }
    }

    /* JADX INFO: renamed from: ve0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lve0/a$a;", "", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3319a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f177665a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f177666b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f177667c = "";

        static {
            new C3320a(null);
        }

        /* JADX INFO: renamed from: ve0.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lve0/a$a$a;", "", "<init>", "()V", "", "AUTHORIZED_VIEWER_LAUNCH_PATH", "Ljava/lang/String;", "AUTH_CODE_PARAM_KEY", "CODE_VERIFIER_PARAM_KEY", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3320a {
            public /* synthetic */ C3320a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3320a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lve0/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ANDROID_DEFAULT_PACKAGE_NAME", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
