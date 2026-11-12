package defpackage;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.ArraySet;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.miui.circulate.device.api.Constant;
import com.miui.circulate.device.api.Icon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes.dex */
public class qx3 {
    public static volatile qx3 f;
    public qwh d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, CirculateDeviceInfo> f31924a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, Map<String, CirculateDeviceInfo>> f31925b = new ConcurrentHashMap();
    public final Map<String, Set<String>> c = new ConcurrentHashMap();
    public List<e9h> e = new CopyOnWriteArrayList();

    public static qx3 g() {
        if (f == null) {
            synchronized (qx3.class) {
                try {
                    if (f == null) {
                        f = new qx3();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static boolean n() {
        return f != null;
    }

    public static /* synthetic */ boolean o(CirculateServiceInfo circulateServiceInfo, CirculateServiceInfo circulateServiceInfo2) {
        return circulateServiceInfo2.equals(circulateServiceInfo);
    }

    public static /* synthetic */ void p(CirculateServiceInfo circulateServiceInfo, CirculateServiceInfo circulateServiceInfo2) {
        tpe.a("CirculateDeviceManager", "merge service: old(" + circulateServiceInfo + ")");
        circulateServiceInfo.d = circulateServiceInfo2.d;
        circulateServiceInfo.h(circulateServiceInfo2.d());
        ExtraBundle.b bVar = new ExtraBundle.b();
        bVar.b(circulateServiceInfo.f.c()).b(circulateServiceInfo2.f.c());
        circulateServiceInfo.f = bVar.a();
        tpe.a("CirculateDeviceManager", "merge service: new(" + circulateServiceInfo + ")");
    }

    public static /* synthetic */ void q(CirculateDeviceInfo circulateDeviceInfo, final CirculateServiceInfo circulateServiceInfo) {
        circulateDeviceInfo.i.stream().filter(new Predicate() { // from class: ox3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return qx3.o(circulateServiceInfo, (CirculateServiceInfo) obj);
            }
        }).forEach(new Consumer() { // from class: px3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                qx3.p(circulateServiceInfo, (CirculateServiceInfo) obj);
            }
        });
    }

    public final void d() {
        this.f31924a.clear();
        this.f31925b.clear();
        this.c.clear();
        this.d.i();
        this.d = null;
    }

    public void e(int i) {
        f(i, true);
    }

    public void f(int i, boolean z) {
        int i2;
        int iA = fx3.a(i);
        Map<String, CirculateDeviceInfo> map = this.f31925b.get(Integer.valueOf(iA));
        Collection<CirculateDeviceInfo> collectionValues = map != null ? map.values() : null;
        tpe.f("CirculateDeviceManager", "clear device protocol: " + i + ", ignoreConnectDevice=" + z);
        if (collectionValues == null || collectionValues.size() <= 0) {
            return;
        }
        for (CirculateDeviceInfo circulateDeviceInfo : collectionValues) {
            tpe.a("CirculateDeviceManager", "clear device: " + circulateDeviceInfo.j());
            CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfo.c(i);
            if (circulateServiceInfoC != null && z && ((i2 = circulateServiceInfoC.d) == 2 || i2 == 3)) {
                tpe.i("CirculateDeviceManager", "clear device: skip connect device " + circulateDeviceInfo.c + "/" + circulateServiceInfoC.d);
                circulateServiceInfoC.f(false);
            } else if (circulateServiceInfoC != null) {
                t(circulateDeviceInfo, circulateServiceInfoC);
            }
        }
        if (gx3.d()) {
            try {
                Map<String, CirculateDeviceInfo> map2 = this.f31925b.get(Integer.valueOf(iA));
                if (map2 == null || map2.size() <= 0) {
                    tpe.a("CirculateDeviceManager", "clearDevice result clean, finalProtocol=" + iA + ", protocol=" + i);
                    return;
                }
                Collection<CirculateDeviceInfo> collectionValues2 = map2.values();
                tpe.a("CirculateDeviceManager", "dump clearDevice result, finalProtocol=" + iA + ", protocol=" + i);
                tpe.a("CirculateDeviceManager", "---------------------start dump-----------------------------");
                StringBuilder sb = new StringBuilder();
                sb.append("devices size = ");
                sb.append(collectionValues2.size());
                tpe.a("CirculateDeviceManager", sb.toString());
                for (CirculateDeviceInfo circulateDeviceInfo2 : collectionValues2) {
                    tpe.a("CirculateDeviceManager", "deviceId=" + circulateDeviceInfo2.f10301a + ", devicesName=" + circulateDeviceInfo2.c);
                    for (CirculateServiceInfo circulateServiceInfo : circulateDeviceInfo2.i) {
                        tpe.a("CirculateDeviceManager", "devicesName=" + circulateDeviceInfo2.c + ", protocolType = " + circulateServiceInfo.c + ", connectState = " + circulateServiceInfo.d);
                    }
                }
                tpe.a("CirculateDeviceManager", "---------------------end dump-------------------------------");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Collection<CirculateDeviceInfo> h() {
        return this.f31924a.values();
    }

    public CirculateDeviceInfo i(String str) {
        if (!TextUtils.equals(str, "local_device_id")) {
            if (TextUtils.isEmpty(str) || !this.f31924a.containsKey(str)) {
                return null;
            }
            return this.f31924a.get(str);
        }
        tpe.a("CirculateDeviceManager", "get device, id=" + str);
        return ((e96) gx3.e().a("DeviceManager")).d();
    }

    @SuppressLint({"NewApi"})
    public List<CirculateDeviceInfo> j(String str) {
        Set<String> set = this.c.get(str);
        if (set == null || set.size() <= 0) {
            return null;
        }
        Stream<String> stream = set.stream();
        final Map<String, CirculateDeviceInfo> map = this.f31924a;
        Objects.requireNonNull(map);
        return (List) stream.map(new Function() { // from class: lx3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (CirculateDeviceInfo) map.get((String) obj);
            }
        }).filter(new Predicate() { // from class: mx3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((CirculateDeviceInfo) obj);
            }
        }).distinct().collect(Collectors.toList());
    }

    public List<CirculateDeviceInfo> k(int i) {
        ArrayList arrayList = new ArrayList();
        int iA = fx3.a(i);
        if (this.f31925b.get(Integer.valueOf(iA)) != null) {
            arrayList.addAll(this.f31925b.get(Integer.valueOf(iA)).values());
        }
        tpe.f("CirculateDeviceManager", "get device " + i + ":" + arrayList.size());
        return arrayList;
    }

    public List<CirculateDeviceInfo> l(List<Integer> list) {
        ArraySet arraySet = new ArraySet();
        for (Integer num : list) {
            int iA = fx3.a(num.intValue());
            Map<String, CirculateDeviceInfo> map = this.f31925b.get(Integer.valueOf(iA));
            if (map != null) {
                Collection<CirculateDeviceInfo> collectionValues = map.values();
                tpe.a("CirculateDeviceManager", "getDevices realProtocol device size = " + collectionValues.size());
                arraySet.addAll(collectionValues);
                if (gx3.d()) {
                    try {
                        tpe.a("CirculateDeviceManager", "dump getDevices result, realProtocol=" + iA + ", protocol=" + num);
                        tpe.a("CirculateDeviceManager", "---------------------start dump-----------------------------");
                        StringBuilder sb = new StringBuilder();
                        sb.append("devices size = ");
                        sb.append(collectionValues.size());
                        tpe.a("CirculateDeviceManager", sb.toString());
                        for (CirculateDeviceInfo circulateDeviceInfo : collectionValues) {
                            tpe.a("CirculateDeviceManager", "deviceId=" + circulateDeviceInfo.f10301a + ", devicesName=" + circulateDeviceInfo.c);
                            for (CirculateServiceInfo circulateServiceInfo : circulateDeviceInfo.i) {
                                tpe.a("CirculateDeviceManager", "devicesName=" + circulateDeviceInfo.c + ", protocolType = " + circulateServiceInfo.c + ", connectState = " + circulateServiceInfo.d);
                            }
                        }
                        tpe.a("CirculateDeviceManager", "---------------------end dump-------------------------------");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        tpe.f("CirculateDeviceManager", "getDevices protocol size: " + list.size() + ", device size=" + arraySet.size());
        return new ArrayList(arraySet);
    }

    public final qwh m() {
        if (this.d == null) {
            this.d = new qwh(gx3.e().b());
        }
        return this.d;
    }

    @SuppressLint({"NewApi"})
    public final CirculateDeviceInfo r(CirculateDeviceInfo circulateDeviceInfo, final CirculateDeviceInfo circulateDeviceInfo2, int i) {
        if (circulateDeviceInfo == null || circulateDeviceInfo == circulateDeviceInfo2) {
            tpe.i("CirculateDeviceManager", "merge device: return new");
            return circulateDeviceInfo2;
        }
        tpe.a("CirculateDeviceManager", "merge device: old (" + circulateDeviceInfo + ")");
        if (i == 262144 && !TextUtils.isEmpty(circulateDeviceInfo2.f10302b)) {
            circulateDeviceInfo.f10302b = circulateDeviceInfo2.f10302b;
        }
        if (i == 196608 && TextUtils.equals(circulateDeviceInfo2.d, Constant.DeviceType.WINDOWS_PC)) {
            circulateDeviceInfo.f10303k = circulateDeviceInfo2.f10303k;
        }
        if (!TextUtils.isEmpty(circulateDeviceInfo2.c) && (i != 65536 || !TextUtils.equals(circulateDeviceInfo2.d, Constant.DeviceType.WINDOWS_PC))) {
            circulateDeviceInfo.c = circulateDeviceInfo2.c;
        }
        if (!TextUtils.isEmpty(circulateDeviceInfo2.d)) {
            circulateDeviceInfo.d = circulateDeviceInfo2.d;
        }
        Integer num = circulateDeviceInfo2.m;
        if (num != null) {
            circulateDeviceInfo.m = num;
        }
        Map<String, String> map = circulateDeviceInfo2.f;
        if (map != null) {
            circulateDeviceInfo.f = map;
        }
        Icon icon = circulateDeviceInfo2.l;
        if (icon != null) {
            circulateDeviceInfo.l = icon;
        }
        circulateDeviceInfo.j = circulateDeviceInfo2.j;
        if (circulateDeviceInfo2.h == null) {
            circulateDeviceInfo2.h = circulateDeviceInfo.h;
        } else {
            ExtraBundle.b bVar = new ExtraBundle.b();
            ExtraBundle extraBundle = circulateDeviceInfo.h;
            if (extraBundle != null) {
                bVar.b(extraBundle.c());
            }
            ExtraBundle extraBundle2 = circulateDeviceInfo2.h;
            if (extraBundle2 != null) {
                bVar.b(extraBundle2.c());
            }
            circulateDeviceInfo.h = bVar.a();
        }
        circulateDeviceInfo.i.forEach(new Consumer() { // from class: nx3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                qx3.q(circulateDeviceInfo2, (CirculateServiceInfo) obj);
            }
        });
        circulateDeviceInfo.i.addAll(circulateDeviceInfo2.i);
        tpe.f("CirculateDeviceManager", "merge device: result (" + circulateDeviceInfo + ")");
        return circulateDeviceInfo;
    }

    public CirculateDeviceInfo s(CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
        tpe.a("CirculateDeviceManager", "onDeviceFound: device: " + circulateDeviceInfo.j() + " | protocolType=" + circulateServiceInfo.c);
        int iA = fx3.a(circulateServiceInfo.c);
        CirculateDeviceInfo circulateDeviceInfoR = TextUtils.equals(circulateDeviceInfo.f10301a, "local_device_id") ? r(((e96) gx3.e().a("DeviceManager")).d(), circulateDeviceInfo, iA) : r(this.f31924a.get(circulateDeviceInfo.f10301a), circulateDeviceInfo, iA);
        for (e9h e9hVar : this.e) {
            if (circulateDeviceInfo.d != Constant.DeviceType.WINDOWS_PC || circulateDeviceInfo.h.d(CirculateDeviceInfo.IS_LYRA, false)) {
                e9hVar.a(circulateDeviceInfoR);
            }
        }
        m().h(circulateDeviceInfoR);
        if (!this.f31925b.containsKey(Integer.valueOf(iA))) {
            this.f31925b.put(Integer.valueOf(iA), new ConcurrentHashMap());
        }
        this.f31925b.get(Integer.valueOf(iA)).put(circulateDeviceInfo.f10301a, circulateDeviceInfoR);
        this.f31924a.put(circulateDeviceInfo.f10301a, circulateDeviceInfoR);
        if (65536 == iA) {
            v(true, circulateServiceInfo.f10304a, circulateDeviceInfoR.f10301a);
        }
        return circulateDeviceInfoR;
    }

    public CirculateDeviceInfo t(CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
        tpe.a("CirculateDeviceManager", "onDeviceLost: device: " + circulateDeviceInfo.j() + " | protocolType=" + circulateServiceInfo.c);
        if (!this.f31924a.containsKey(circulateDeviceInfo.f10301a)) {
            tpe.f("CirculateDeviceManager", "onDeviceLost: no cache device for " + circulateDeviceInfo.c + " (" + circulateServiceInfo.c + ")");
            return null;
        }
        int iA = fx3.a(circulateServiceInfo.c);
        CirculateDeviceInfo circulateDeviceInfo2 = this.f31924a.get(circulateDeviceInfo.f10301a);
        if (circulateDeviceInfo2 != null) {
            circulateDeviceInfo2.h(circulateServiceInfo);
            Set<CirculateServiceInfo> set = circulateDeviceInfo2.i;
            if (set == null || set.size() == 0) {
                this.f31924a.remove(circulateDeviceInfo.f10301a);
            }
        }
        Map<String, CirculateDeviceInfo> map = this.f31925b.get(Integer.valueOf(iA));
        if (map != null) {
            map.remove(circulateDeviceInfo.f10301a);
            tpe.a("CirculateDeviceManager", "onDeviceLost remove: " + this.f31924a.containsKey(circulateDeviceInfo.f10301a) + "," + map.containsKey(circulateDeviceInfo.f10301a));
        }
        if (65536 == iA) {
            v(false, circulateServiceInfo.f10304a, circulateDeviceInfo.f10301a);
        }
        return circulateDeviceInfo2;
    }

    public CirculateDeviceInfo u(CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo) {
        tpe.a("CirculateDeviceManager", "onDeviceUpdate: device: " + circulateDeviceInfo.j() + " | protocolType=" + circulateServiceInfo.c);
        if (!this.f31924a.containsKey(circulateDeviceInfo.f10301a)) {
            tpe.f("CirculateDeviceManager", "onDeviceUpdate: no cache device for " + circulateDeviceInfo.c + " (" + circulateServiceInfo.c + ")");
            return null;
        }
        int iA = fx3.a(circulateServiceInfo.c);
        CirculateDeviceInfo circulateDeviceInfoR = r(this.f31924a.get(circulateDeviceInfo.f10301a), circulateDeviceInfo, iA);
        if (!this.f31925b.containsKey(Integer.valueOf(iA))) {
            this.f31925b.put(Integer.valueOf(iA), new ConcurrentHashMap());
        }
        this.f31925b.get(Integer.valueOf(iA)).put(circulateDeviceInfo.f10301a, circulateDeviceInfoR);
        this.f31924a.put(circulateDeviceInfo.f10301a, circulateDeviceInfoR);
        if (65536 == iA) {
            v(true, circulateServiceInfo.f10304a, circulateDeviceInfoR.f10301a);
        }
        return circulateDeviceInfoR;
    }

    public final void v(boolean z, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            tpe.i("CirculateDeviceManager", "refresh device id cache fail, empty id");
            return;
        }
        tpe.a("CirculateDeviceManager", "refresh device id cache: " + z + ", " + str + "," + tpe.e(str2));
        if (z) {
            if (!this.c.containsKey(str)) {
                this.c.put(str, new LinkedHashSet());
            }
            this.c.get(str).add(str2);
        } else if (this.c.containsKey(str)) {
            this.c.get(str).remove(str2);
        }
    }

    public void w() {
        d();
    }
}
