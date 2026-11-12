package m80;

import android.content.Context;
import android.os.Build;
import d53.w;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import v13.i;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2223a f117132a = C2223a.f117133a;

    /* JADX INFO: renamed from: m80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm80/a$a;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C2223a f117133a = new C2223a();

        private C2223a() {
        }

        public static boolean a(String str) {
            if (Build.VERSION.SDK_INT < 35) {
                return false;
            }
            ic0.b bVar = (ic0.b) KoinJavaComponent.get$default(ic0.b.class, null, null, 6, null);
            return (str == null || w.J(str) || u0.t(str) || bVar.d(str) || bVar.a(str) || bVar.e(str)) ? false : true;
        }
    }

    boolean a();

    void b();

    void c();

    boolean d();

    boolean e(sd2.f fVar);

    Object f(Context context, String str, String str2, boolean z14, p80.f.a aVar);

    Object g(v13.c cVar);

    void h(String str);

    void i(String str);

    Object j(boolean z14, i iVar);
}
