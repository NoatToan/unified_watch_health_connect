package r;

import am.j;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.common.net.HttpHeaders;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f148677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f148678b;

    public static class a {
        private a() {
        }

        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        private b() {
        }

        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class c {
        private c() {
        }

        public static void a(ActivityOptions activityOptions, boolean z14) {
            activityOptions.setShareIdentityEnabled(z14);
        }
    }

    public e(Intent intent, Bundle bundle) {
        this.f148677a = intent;
        this.f148678b = bundle;
    }

    public static r.a a(int i14, Intent intent) {
        Bundle bundle;
        if (i14 < 0 || i14 > 2 || i14 == 0) {
            h.s(j.h(i14, "Invalid colorScheme: "));
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return r.a.a(null);
        }
        r.a aVarA = r.a.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS");
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i14)) == null) {
            return aVarA;
        }
        r.a aVarA2 = r.a.a(bundle);
        Integer num = aVarA2.f148632a;
        if (num == null) {
            num = aVarA.f148632a;
        }
        Integer num2 = aVarA2.f148633b;
        if (num2 == null) {
            num2 = aVarA.f148633b;
        }
        Integer num3 = aVarA2.f148634c;
        if (num3 == null) {
            num3 = aVarA.f148634c;
        }
        Integer num4 = aVarA2.f148635d;
        if (num4 == null) {
            num4 = aVarA.f148635d;
        }
        return new r.a(num, num2, num3, num4);
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ActivityOptions f148681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SparseArray<Bundle> f148682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f148683e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f148679a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.a.C2800a f148680b = new r.a.C2800a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f148684f = true;

        public d(g gVar) {
            if (gVar != null) {
                b(gVar);
            }
        }

        public final e a() {
            Intent intent = this.f148679a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f148684f);
            r.a.C2800a c2800a = this.f148680b;
            intent.putExtras(new r.a(c2800a.f148636a, null, c2800a.f148637b, c2800a.f148638c).b());
            Bundle bundle2 = this.f148683e;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            if (this.f148682d != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f148682d);
                intent.putExtras(bundle3);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            String strA = b.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey(HttpHeaders.ACCEPT_LANGUAGE)) {
                    bundleExtra.putString(HttpHeaders.ACCEPT_LANGUAGE, strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.f148681c == null) {
                    this.f148681c = a.a();
                }
                c.a(this.f148681c, false);
            }
            ActivityOptions activityOptions = this.f148681c;
            return new e(intent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b(g gVar) {
            String packageName = gVar.f148687c.getPackageName();
            Intent intent = this.f148679a;
            intent.setPackage(packageName);
            IBinder iBinderAsBinder = gVar.f148686b.asBinder();
            PendingIntent pendingIntent = gVar.f148688d;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }

        public d() {
        }
    }
}
