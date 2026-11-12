package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.onetrack.util.z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.jmdns.ServiceTypeListener;
import javax.jmdns.impl.HostInfo;
import javax.jmdns.impl.JmDNSImpl;

/* JADX INFO: loaded from: classes11.dex */
public class t6q extends Thread {
    public final r6q c;
    public final Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile AtomicBoolean f34381a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f34382b = new byte[0];
    public WifiManager.MulticastLock f = null;
    public h g = new h();
    public InetAddress h = null;
    public Handler i = null;
    public JmDNS j = null;
    public final boolean d = n6q.g();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t6q.this.z();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t6q.this.i();
            t6q.this.z();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.myLooper().quit();
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kyl f34386a;

        public d(kyl kylVar) {
            this.f34386a = kylVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            t6q.this.u(this.f34386a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kyl f34388a;

        public e(kyl kylVar) {
            this.f34388a = kylVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            t6q.this.x(this.f34388a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34390a;

        public f(String str) {
            this.f34390a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            t6q.this.v(this.f34390a);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34392a;

        public g(String str) {
            this.f34392a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            t6q.this.y(this.f34392a);
        }
    }

    public class h implements ServiceListener, ServiceTypeListener {
        public h() {
        }
    }

    public static class i {
        public static InetAddress b(Context context, int[] iArr) {
            NetworkInfo activeNetworkInfo;
            Boolean bool;
            WifiManager wifiManager;
            Boolean bool2 = Boolean.FALSE;
            if (iArr == null) {
                return null;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return null;
                }
                if (activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        bool = bool2;
                        bool2 = Boolean.TRUE;
                    } else {
                        if (type != 9) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown active connectivity: ");
                            sb.append(activeNetworkInfo.getType());
                            return null;
                        }
                        bool = Boolean.TRUE;
                    }
                } else {
                    bool = bool2;
                }
                try {
                    if (bool2.booleanValue() && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && 3 == wifiManager.getWifiState()) {
                        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                        InetAddress byAddress = InetAddress.getByAddress(t6q.j(dhcpInfo.ipAddress));
                        iArr[0] = dhcpInfo.netmask;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("get wifi IP: ");
                        sb2.append(byAddress);
                        return byAddress;
                    }
                    if (bool.booleanValue()) {
                        Class<?> cls = Class.forName("mitv.network.ethernet.EthernetManager");
                        Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            int iIntValue = ((Integer) cls.getDeclaredMethod("getState", new Class[0]).invoke(objInvoke, new Object[0])).intValue();
                            Field declaredField = cls.getDeclaredField("ETHERNET_STATE_ENABLED");
                            declaredField.setAccessible(true);
                            if (declaredField.getInt(cls) == iIntValue) {
                                DhcpInfo dhcpInfo2 = (DhcpInfo) cls.getDeclaredMethod("getDhcpInfo", new Class[0]).invoke(objInvoke, new Object[0]);
                                InetAddress byAddress2 = InetAddress.getByAddress(t6q.j(dhcpInfo2.ipAddress));
                                iArr[0] = dhcpInfo2.netmask;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("get ethernet IP:");
                                sb3.append(byAddress2);
                                return byAddress2;
                            }
                        }
                    }
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    InetAddress inetAddress = null;
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("DisplayName:");
                        sb4.append(networkInterfaceNextElement.getDisplayName());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Name:");
                        sb5.append(networkInterfaceNextElement.getName());
                        if (!networkInterfaceNextElement.isLoopback()) {
                            Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                if (inetAddressNextElement instanceof Inet4Address) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("IP:");
                                    sb6.append(inetAddressNextElement.getHostAddress());
                                    inetAddress = inetAddressNextElement;
                                    break;
                                }
                                if (inetAddressNextElement instanceof Inet6Address) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("IPv6:");
                                    sb7.append(inetAddressNextElement.getHostAddress());
                                }
                            }
                        }
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("IP: ");
                    sb8.append(inetAddress);
                    iArr[0] = 0;
                    return inetAddress;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public static class j {
        public static InetAddress b(Context context, int[] iArr) {
            NetworkInfo activeNetworkInfo;
            WifiManager wifiManager;
            Boolean bool = Boolean.FALSE;
            if (iArr == null) {
                return null;
            }
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return null;
                }
                if (activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        bool = Boolean.TRUE;
                    } else if (type != 9) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown active connectivity: ");
                        sb.append(activeNetworkInfo.getType());
                        return null;
                    }
                }
                try {
                    if (bool.booleanValue() && (wifiManager = (WifiManager) context.getSystemService("wifi")) != null && 3 == wifiManager.getWifiState()) {
                        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                        InetAddress byAddress = InetAddress.getByAddress(t6q.j(dhcpInfo.ipAddress));
                        iArr[0] = dhcpInfo.netmask;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("get wifi IP: ");
                        sb2.append(byAddress);
                        return byAddress;
                    }
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    InetAddress inetAddress = null;
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("DisplayName:");
                        sb3.append(networkInterfaceNextElement.getDisplayName());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Name:");
                        sb4.append(networkInterfaceNextElement.getName());
                        if (!networkInterfaceNextElement.isLoopback()) {
                            Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress inetAddressNextElement = inetAddresses.nextElement();
                                if (inetAddressNextElement instanceof Inet4Address) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("IP:");
                                    sb5.append(inetAddressNextElement.getHostAddress());
                                    inetAddress = inetAddressNextElement;
                                    break;
                                }
                                if (inetAddressNextElement instanceof Inet6Address) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("IPv6:");
                                    sb6.append(inetAddressNextElement.getHostAddress());
                                }
                            }
                        }
                    }
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("IP: ");
                    sb7.append(inetAddress);
                    iArr[0] = 0;
                    return inetAddress;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public t6q(Context context, r6q r6qVar) {
        this.e = context;
        this.c = r6qVar;
    }

    public static byte[] j(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 24) & 255)};
    }

    public final void h() {
        WifiManager wifiManager = (WifiManager) this.e.getSystemService("wifi");
        if (this.f == null) {
            WifiManager.MulticastLock multicastLockCreateMulticastLock = wifiManager.createMulticastLock("UDTDiscover");
            this.f = multicastLockCreateMulticastLock;
            multicastLockCreateMulticastLock.setReferenceCounted(true);
            this.f.acquire();
        }
    }

    public final void i() {
        synchronized (this.f34382b) {
            JmDNS jmDNS = this.j;
            if (jmDNS != null) {
                try {
                    jmDNS.unregisterAllServices();
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unregisterAllServices error:");
                    sb.append(e2.toString());
                }
                try {
                    this.j.close();
                } catch (Exception e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Close JmDNS failed: ");
                    sb2.append(e3.toString());
                }
                this.j = null;
            }
        }
    }

    public boolean k() {
        synchronized (this.f34382b) {
            try {
                JmDNS jmDNS = this.j;
                if (jmDNS != null && jmDNS.isAlive()) {
                    int[] iArr = new int[1];
                    if (this.d) {
                        this.h = i.b(this.e, iArr);
                    } else {
                        this.h = j.b(this.e, iArr);
                    }
                    if (this.h == null) {
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Local address: ");
                    sb.append(this.h);
                    HostInfo localHost = this.j.getLocalHost();
                    if (localHost == null) {
                        return false;
                    }
                    InetAddress inetAddress = localHost.getInetAddress();
                    if (inetAddress == null) {
                        return false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("JmDNS address:");
                    sb2.append(inetAddress);
                    return this.h.equals(inetAddress);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l() {
        return this.f34381a.get();
    }

    public final boolean m(kyl kylVar) {
        for (ServiceInfo serviceInfo : this.j.getServices().values()) {
            if (serviceInfo.getName().startsWith(kylVar.f24425a) && kylVar.f24426b.equalsIgnoreCase(serviceInfo.getType())) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exist: ");
                sb.append(serviceInfo.getName());
                sb.append(serviceInfo.getType());
                sb.append(serviceInfo.getPort());
                return true;
            }
        }
        return false;
    }

    public void n() {
        Handler handler = this.i;
        if (handler != null) {
            handler.post(new c());
        }
    }

    public int o(kyl kylVar) {
        Handler handler = this.i;
        if (handler == null) {
            return -1;
        }
        handler.post(new d(kylVar));
        return 0;
    }

    public int p(String str) {
        Handler handler = this.i;
        if (handler == null) {
            return -1;
        }
        handler.post(new f(str));
        return 0;
    }

    public int q(kyl kylVar) {
        Handler handler = this.i;
        if (handler == null) {
            return -1;
        }
        handler.post(new e(kylVar));
        return 0;
    }

    public int r(String str) {
        Handler handler = this.i;
        if (handler == null) {
            return -1;
        }
        handler.post(new g(str));
        return 0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        h();
        Looper.prepare();
        this.i = new Handler();
        t();
        this.f34381a.set(true);
        Looper.loop();
        this.f34381a.set(false);
        i();
        w();
    }

    public void s() {
        Handler handler = this.i;
        if (handler != null) {
            handler.post(new b());
        }
    }

    public void t() {
        Handler handler = this.i;
        if (handler != null) {
            handler.post(new a());
        }
    }

    public final int u(kyl kylVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("To REGIST: ");
        sb.append(kylVar.f24425a);
        sb.append(".");
        sb.append(kylVar.f24426b);
        sb.append(" port:");
        sb.append(kylVar.c);
        sb.append(" text:");
        sb.append(kylVar.f);
        synchronized (this.f34382b) {
            try {
                if (this.j == null) {
                    return -1;
                }
                if (m(kylVar)) {
                    return 0;
                }
                try {
                    String strReplaceAll = kylVar.f24425a.replaceAll(z.f14007a, " ");
                    kylVar.f24425a = strReplaceAll;
                    String strReplaceAll2 = strReplaceAll.replaceAll("\\\\", " ");
                    kylVar.f24425a = strReplaceAll2;
                    ServiceInfo serviceInfoCreate = ServiceInfo.create(kylVar.f24426b, strReplaceAll2, kylVar.c, 0, 0, false, kylVar.f);
                    if (serviceInfoCreate.getKey() == null) {
                        return -1;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Service info key: ");
                    sb2.append(serviceInfoCreate.getKey());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("REGIST SERVICE: ");
                    sb3.append(kylVar.f24425a);
                    sb3.append(".");
                    sb3.append(kylVar.f24426b);
                    this.j.registerService(serviceInfoCreate);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("REGISTER DONE: ");
                    sb4.append(kylVar.f24425a);
                    sb4.append(".");
                    sb4.append(kylVar.f24426b);
                    sb4.append(" port:");
                    sb4.append(kylVar.c);
                    sb4.append(" text:");
                    sb4.append(kylVar.f);
                    return 0;
                } catch (Exception e2) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Regist service error: ");
                    sb5.append(e2.toString());
                    return -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(String str) {
        JmDNS jmDNS = this.j;
        if (jmDNS != null) {
            jmDNS.addServiceListener(str, this.g);
        }
    }

    public final void w() {
        WifiManager.MulticastLock multicastLock = this.f;
        if (multicastLock != null) {
            if (multicastLock.isHeld()) {
                this.f.release();
            }
            this.f = null;
        }
    }

    public final int x(kyl kylVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("To REMOVE: ");
        sb.append(kylVar.f24425a);
        sb.append(".");
        sb.append(kylVar.f24426b);
        sb.append(" port:");
        sb.append(kylVar.c);
        sb.append(" text:");
        sb.append(kylVar.f);
        synchronized (this.f34382b) {
            try {
                JmDNSImpl jmDNSImpl = this.j;
                if (jmDNSImpl == null) {
                    return -1;
                }
                for (ServiceInfo serviceInfo : jmDNSImpl.getServices().values()) {
                    String name = serviceInfo.getName();
                    String type = serviceInfo.getType();
                    if (name.startsWith(kylVar.f24425a) && type.equalsIgnoreCase(kylVar.f24426b)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("REMOVE SERVICE: ");
                        sb2.append(name);
                        sb2.append(".");
                        sb2.append(type);
                        this.j.unregisterService(serviceInfo);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("REMOVE DONE: ");
                        sb3.append(name);
                        sb3.append(".");
                        sb3.append(type);
                        sb3.append(" port:");
                        sb3.append(kylVar.c);
                        sb3.append(" text:");
                        sb3.append(kylVar.f);
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(String str) {
        JmDNS jmDNS = this.j;
        if (jmDNS != null) {
            jmDNS.removeServiceListener(str, this.g);
        }
    }

    public final void z() {
        synchronized (this.f34382b) {
            try {
                if (this.j == null) {
                    int[] iArr = new int[1];
                    if (this.d) {
                        this.h = i.b(this.e, iArr);
                    } else {
                        this.h = j.b(this.e, iArr);
                    }
                    if (this.h == null) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("IP: ");
                    sb.append(this.h);
                    sb.append(" NetMask: ");
                    sb.append(String.format("%08x", Integer.valueOf(iArr[0])));
                    try {
                        this.j = JmDNS.create(this.h, "milink" + Integer.toString((int) System.currentTimeMillis()), iArr[0]);
                    } catch (Exception e2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Create JmDNS failed: ");
                        sb2.append(e2.toString());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
