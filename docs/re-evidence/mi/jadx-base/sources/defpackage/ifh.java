package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RoutingSessionInfo;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 30)
public class ifh {
    public static final ComponentName d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static Method h;
    public static Class<?> i;
    public static Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Method f21089k;
    public static Method l;
    public static Method m;
    public static ifh n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21090a = k(new b() { // from class: dfh
        @Override // ifh.b
        public final Object call() {
            return this.f15483a.q();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager f21091b;
    public final Context c;

    public class a extends MediaRouter2$RouteCallback {
        public a() {
        }

        public void onRoutesAdded(List<MediaRoute2Info> list) {
            super.onRoutesAdded(list);
        }

        public void onRoutesChanged(List<MediaRoute2Info> list) {
            super.onRoutesChanged(list);
        }

        public void onRoutesRemoved(List<MediaRoute2Info> list) {
            super.onRoutesRemoved(list);
        }
    }

    public interface b<T> {
        T call() throws Exception;
    }

    public interface c {
        void call() throws Exception;
    }

    static {
        ComponentName componentName = new ComponentName("com.android.server.media", "com.android.server.media.SystemMediaRoute2Provider");
        d = componentName;
        String strFlattenToShortString = componentName.flattenToShortString();
        e = strFlattenToShortString;
        f = C(strFlattenToShortString, "DEVICE_ROUTE");
        g = C(strFlattenToShortString, "ROUTE_ID_BUILTIN_SPEAKER");
    }

    public ifh(Context context) {
        this.c = context;
        this.f21091b = (AudioManager) context.getSystemService("audio");
        MediaRouter2 mediaRouter2 = MediaRouter2.getInstance(context);
        Executor mainExecutor = context.getMainExecutor();
        a aVar = new a();
        seh.a();
        mediaRouter2.registerRouteCallback(mainExecutor, aVar, peh.a(new ArrayList(), false).build());
    }

    public static String C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            tpe.i("OutputSwitcher", "toUniqueId: providerId shouldn't be empty");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            tpe.i("OutputSwitcher", "toUniqueId: id shouldn't be null");
            return null;
        }
        return str + ":" + str2;
    }

    public static synchronized ifh i(Context context) {
        try {
            if (n == null) {
                n = new ifh(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return n;
    }

    public static <T> T k(b<T> bVar) {
        try {
            return bVar.call();
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T l(b<T> bVar, T t) {
        try {
            return bVar.call();
        } catch (Exception e2) {
            tpe.d("OutputSwitcher", "", e2);
            return t;
        }
    }

    public static void m(c cVar) {
        try {
            cVar.call();
        } catch (Exception e2) {
            tpe.d("OutputSwitcher", "", e2);
        }
    }

    public static /* synthetic */ Class p() throws Exception {
        return Class.forName("android.media.MediaRouter2Manager");
    }

    public static /* synthetic */ boolean s(String str, MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getId().equals(C(e, str));
    }

    public static /* synthetic */ boolean t(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getId().equals(f) || mediaRoute2Info.getId().equals(g);
    }

    public final void A(final String str) {
        MediaRoute2Info mediaRoute2InfoA = teh.a(h().stream().filter(new Predicate() { // from class: bfh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ifh.s(str, (MediaRoute2Info) obj);
            }
        }).findFirst().orElse(null));
        if (mediaRoute2InfoA == null) {
            tpe.i("OutputSwitcher", "active bluetooth route info is null, skip select");
            return;
        }
        try {
            v(this.c.getPackageName(), mediaRoute2InfoA);
            tpe.f("OutputSwitcher", "isDeviceRouteActive false, switch bt");
        } catch (Exception e2) {
            tpe.d("OutputSwitcher", "selectBluetooth", e2);
        }
    }

    public void B() {
        tpe.f("OutputSwitcher", "selectPhone");
        MediaRoute2Info mediaRoute2InfoA = teh.a(h().stream().filter(new Predicate() { // from class: cfh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ifh.t((MediaRoute2Info) obj);
            }
        }).findFirst().orElse(null));
        if (mediaRoute2InfoA == null) {
            tpe.i("OutputSwitcher", "phone route info is null, skip select");
            return;
        }
        try {
            v(this.c.getPackageName(), mediaRoute2InfoA);
            tpe.a("OutputSwitcher", "isDeviceRouteActive true, switch local");
        } catch (Exception e2) {
            tpe.d("OutputSwitcher", "switchToLocal", e2);
        }
    }

    public final List<MediaRoute2Info> h() {
        tpe.f("OutputSwitcher", "getAllRoutes");
        return (List) l(new b() { // from class: gfh
            @Override // ifh.b
            public final Object call() {
                return this.f18926a.n();
            }
        }, Collections.emptyList());
    }

    public final List<RoutingSessionInfo> j(final String str) {
        return (List) l(new b() { // from class: hfh
            @Override // ifh.b
            public final Object call() {
                return this.f20011a.o(str);
            }
        }, Collections.emptyList());
    }

    public final /* synthetic */ List n() throws Exception {
        if (f21089k == null) {
            Method declaredMethod = u().getDeclaredMethod("getAllRoutes", new Class[0]);
            f21089k = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return (List) f21089k.invoke(this.f21090a, new Object[0]);
    }

    public final /* synthetic */ List o(String str) throws Exception {
        if (m == null) {
            Method declaredMethod = u().getDeclaredMethod("getRoutingSessions", String.class);
            m = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return (List) m.invoke(this.f21090a, str);
    }

    public final /* synthetic */ Object q() throws Exception {
        if (h == null) {
            Method declaredMethod = u().getDeclaredMethod("getInstance", Context.class);
            h = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return h.invoke(null, this.c);
    }

    public final /* synthetic */ void r(String str, MediaRoute2Info mediaRoute2Info) throws Exception {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 35) {
            y(str, mediaRoute2Info, UserHandle.getUserHandleForUid(Process.myUid()));
        } else if (i2 == 34) {
            x(str, mediaRoute2Info);
        } else {
            w(str, mediaRoute2Info);
        }
    }

    public final Class<?> u() {
        if (i == null) {
            i = (Class) k(new b() { // from class: efh
                @Override // ifh.b
                public final Object call() {
                    return ifh.p();
                }
            });
        }
        return i;
    }

    public final void v(final String str, final MediaRoute2Info mediaRoute2Info) {
        tpe.f("OutputSwitcher", "selectRoute, p:" + str + ", r:" + ((Object) mediaRoute2Info.getName()));
        m(new c() { // from class: ffh
            @Override // ifh.c
            public final void call() throws Exception {
                this.f17739a.r(str, mediaRoute2Info);
            }
        });
    }

    public final void w(String str, MediaRoute2Info mediaRoute2Info) throws Exception {
        if (j == null) {
            Method declaredMethod = u().getDeclaredMethod("selectRoute", String.class, qeh.a());
            j = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        j.invoke(this.f21090a, str, mediaRoute2Info);
    }

    public final void x(String str, MediaRoute2Info mediaRoute2Info) throws Exception {
        if (l == null) {
            Method declaredMethod = u().getDeclaredMethod("transfer", afh.a(), qeh.a());
            l = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        List<RoutingSessionInfo> listJ = j(str);
        if (listJ.isEmpty()) {
            tpe.f("OutputSwitcher", "sessionInfos is empty");
        } else {
            l.invoke(this.f21090a, reh.a(listJ.get(listJ.size() - 1)), mediaRoute2Info);
        }
    }

    public final void y(String str, MediaRoute2Info mediaRoute2Info, UserHandle userHandle) throws Exception {
        if (l == null) {
            Method declaredMethod = u().getDeclaredMethod("transfer", afh.a(), qeh.a(), UserHandle.class, String.class);
            l = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        List<RoutingSessionInfo> listJ = j(str);
        if (listJ.isEmpty()) {
            tpe.f("OutputSwitcher", "sessionInfos is empty");
        } else {
            l.invoke(this.f21090a, reh.a(listJ.get(listJ.size() - 1)), mediaRoute2Info, userHandle, str);
        }
    }

    public void z(CirculateDeviceInfo circulateDeviceInfo) {
        CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfo.c(393216);
        if (circulateServiceInfoC == null) {
            tpe.f("OutputSwitcher", "serviceInfo is null");
            return;
        }
        String str = circulateServiceInfoC.f10304a;
        if (TextUtils.isEmpty(str)) {
            tpe.f("OutputSwitcher", "btMac is null");
            return;
        }
        try {
            if (this.f21091b.isWiredHeadsetOn()) {
                Iterator<CirculateDeviceInfo> it = qx3.g().k(393216).iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().c(393216).f10304a)) {
                        tpe.f("OutputSwitcher", "findDevice true");
                        A(str);
                        return;
                    }
                }
                tpe.i("OutputSwitcher", "do not find device");
                return;
            }
        } catch (Exception e2) {
            tpe.d("OutputSwitcher", "isWiredHeadsetActive.get", e2);
        }
        A(str);
    }
}
