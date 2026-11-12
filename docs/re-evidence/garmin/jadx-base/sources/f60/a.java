package f60;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf60/a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69195a = new a();

    private a() {
    }

    public static final void a(b bVar, String str, String str2, String str3) {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        if (str != null) {
            firebaseCrashlytics.log(str);
        }
        if (str2 != null) {
            firebaseCrashlytics.setCustomKey("code", str2);
        }
        if (str3 != null) {
            firebaseCrashlytics.setCustomKey("extras", str3);
        }
        firebaseCrashlytics.recordException(bVar);
    }
}
