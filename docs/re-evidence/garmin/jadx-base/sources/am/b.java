package am;

import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class b extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f3854b;

    public class a implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d80.b f3855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f3856b;

        public a(b bVar, d80.b bVar2, long j8) {
            this.f3855a = bVar2;
            this.f3856b = j8;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            this.f3855a.a(bVar);
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            this.f3855a.b(obj, aVar);
            ((f12.l) KoinJavaComponent.get(f12.l.class)).T3(true);
            ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class)).m(new DateTime(this.f3856b));
        }
    }

    private b() {
    }

    public static synchronized b M() {
        try {
            if (f3854b == null) {
                f3854b = new b();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f3854b;
    }

    public final d80.f<Object> N(long j8, long j14, String str, d80.b bVar) {
        lj0.a aVar = lj0.a.f112935h;
        Object[] objArr = {Long.toString(j8)};
        aVar.f112948f = str;
        d80.f.b bVar2 = new d80.f.b(objArr, aVar);
        bVar2.f58274d = new a(this, bVar, j14);
        bVar2.f58275e = d80.g.NO_PARSING;
        d80.f<Object> fVarA = bVar2.a();
        fVarA.b();
        return fVarA;
    }
}
