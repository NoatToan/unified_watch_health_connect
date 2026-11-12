package kq0;

import android.os.RemoteException;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkq0/a;", "", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f106152a;

    static {
        new a();
        f106152a = a2.INCIDENT_DETECTION;
    }

    private a() {
    }

    public static final void a(String str, String str2) {
        i2.f36769a.getClass();
        i2.a.b(f106152a, str, str2);
    }

    public static final void b(String str, String str2, RemoteException remoteException) {
        i2.a aVar = i2.f36769a;
        String str3 = str2 + " : " + remoteException.getMessage();
        aVar.getClass();
        i2.a.f(f106152a, str, str3);
    }
}
