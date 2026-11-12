package ht;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht/a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f85464a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f85465b = new f();

    static {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnalyticsLogger", "constructor: creating firebase logger");
    }

    private a() {
    }

    public static void a(Bundle bundle, String str) {
        str.getClass();
        s.f85508a.getClass();
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.containsKey("Client")) {
            bundle.putString("Client", "GCM");
        }
        f fVar = f85465b;
        fVar.getClass();
        FirebaseAnalytics firebaseAnalytics = fVar.f85472a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.logEvent(str, bundle);
        }
    }

    public static void b(String str, o13.p... pVarArr) {
        str.getClass();
        w0 w0Var = new w0(2);
        w0Var.a(new o13.p("Screen", str));
        w0Var.b(pVarArr);
        ArrayList<Object> arrayList = w0Var.f105816a;
        a(h7.c.a((o13.p[]) arrayList.toArray(new o13.p[arrayList.size()])), "PageView");
    }

    public static void c(String str, String str2) {
        str.getClass();
        s.f85508a.getClass();
        f fVar = f85465b;
        fVar.getClass();
        FirebaseAnalytics firebaseAnalytics = fVar.f85472a;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.setUserProperty(str, str2);
        }
    }
}
