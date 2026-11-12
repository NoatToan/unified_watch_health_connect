package defpackage;

import android.os.Binder;
import com.duokan.airkan.rc_sdk.airkan.AirkanService;

/* JADX INFO: loaded from: classes4.dex */
public interface cpc {

    public static class a extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public cpc f14588a;

        public a(cpc cpcVar) {
            this.f14588a = cpcVar;
        }

        public cpc a() {
            return this.f14588a;
        }
    }

    public interface b {
        void a(String str, int i, boolean z);

        void b(String str, boolean z, int i, boolean z2, ae4 ae4Var);
    }

    qz0 a();

    void b(String str, AirkanService.k kVar);

    void c();

    void d(String str, boolean z);

    void e(String str, String str2, String str3, String str4, ikk ikkVar);

    void f(String str, cqc cqcVar);

    int g(int i, int i2);

    void h();

    void registeOnRCEventListener(n6j n6jVar);

    void registeonAirkanConnectListener(b bVar);

    void unregisteOnRCEventListener(n6j n6jVar);

    void unregisteonAirkanConnectListener(b bVar);
}
