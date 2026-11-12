package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.protocol.headset.HeadsetDeviceInfo;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.miui.headset.api.IHeadset;
import com.miui.headset.api.MultipointInfo;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class knb extends jyc<lnb> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHeadset f24018b;
    public final Context c;
    public ifh d;

    public knb(IHeadset iHeadset) {
        this.f24018b = iHeadset;
        Context contextB = gx3.e().b();
        this.c = contextB;
        if (TextUtils.equals("com.milink.service", contextB.getPackageName()) || Build.VERSION.SDK_INT < 30) {
            return;
        }
        this.d = ifh.i(contextB);
    }

    public final int g(CirculateDeviceInfo circulateDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo) {
        return this.f24018b.getProfile().getHeadsetProperty(p(circulateDeviceInfo), headsetDeviceInfo.f10300b, headsetDeviceInfo.d);
    }

    public final int h(CirculateDeviceInfo circulateDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo, int i) {
        return this.f24018b.getProfile().updateHeadsetMode(p(circulateDeviceInfo), headsetDeviceInfo.f10300b, headsetDeviceInfo.d, i);
    }

    public final int i(CirculateDeviceInfo circulateDeviceInfo, HeadsetDeviceInfo headsetDeviceInfo, int i) {
        return this.f24018b.getProfile().updateHeadsetVolume(p(circulateDeviceInfo), headsetDeviceInfo.f10300b, headsetDeviceInfo.d, i);
    }

    public final int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? -1 : 0;
        }
        return 2;
    }

    public HeadsetDeviceInfo k(CirculateServiceInfo circulateServiceInfo) {
        tpe.a("HeadsetServiceController", "get bluetooth device info");
        HeadsetDeviceInfo headsetDeviceInfoG = omb.f().g(circulateServiceInfo.f10304a);
        tpe.f("HeadsetServiceController", "bluetooth headset info: " + headsetDeviceInfoG);
        return headsetDeviceInfoG;
    }

    public int l(CirculateServiceInfo circulateServiceInfo) {
        int i = k(circulateServiceInfo) == null ? -1 : k(circulateServiceInfo).h;
        tpe.f("HeadsetServiceController", "get bluetooth device anc mode:" + pmb.a(i));
        return i;
    }

    public String m(CirculateServiceInfo circulateServiceInfo) {
        HeadsetDeviceInfo headsetDeviceInfoK = k(circulateServiceInfo);
        String str = headsetDeviceInfoK == null ? null : headsetDeviceInfoK.c;
        tpe.f("HeadsetServiceController", "get bluetooth device name:" + str);
        return str;
    }

    public final CirculateDeviceInfo n(CirculateServiceInfo circulateServiceInfo) {
        for (CirculateDeviceInfo circulateDeviceInfo : qx3.g().k(393216)) {
            if (circulateDeviceInfo.i.contains(circulateServiceInfo)) {
                return circulateDeviceInfo;
            }
        }
        return null;
    }

    public boolean o(CirculateServiceInfo circulateServiceInfo) {
        tpe.a("HeadsetServiceController", "get headset output");
        CirculateDeviceInfo circulateDeviceInfoI = qx3.g().i("local_device_id");
        if (circulateDeviceInfoI == null || circulateServiceInfo == null || circulateDeviceInfoI.c(393216) == null || !circulateServiceInfo.f10304a.equals(circulateDeviceInfoI.c(393216).f10304a)) {
            tpe.f("HeadsetServiceController", "cannot find headset or not local headset, return false");
            return false;
        }
        boolean zA = t33.a(this.c);
        tpe.f("HeadsetServiceController", "headset output:" + zA);
        return zA;
    }

    public String p(CirculateDeviceInfo circulateDeviceInfo) {
        String str = circulateDeviceInfo.d;
        ExtraBundle extraBundle = circulateDeviceInfo.h;
        String strF = extraBundle != null ? extraBundle.f(CirculateDeviceInfo.MIPLAY_ID, "") : "";
        return (!TextUtils.equals(str, "TV") || TextUtils.isEmpty(strF)) ? circulateDeviceInfo.f10301a : strF;
    }

    public MultipointInfo q(String str) {
        return this.f24018b.getQuery().getMultipointInfo(str);
    }

    public final /* synthetic */ Integer r(CirculateServiceInfo circulateServiceInfo) {
        CirculateDeviceInfo circulateDeviceInfoN = n(circulateServiceInfo);
        if (circulateDeviceInfoN == null) {
            tpe.i("HeadsetServiceController", "set volume error,connected device not found");
            return 201;
        }
        HeadsetDeviceInfo headsetDeviceInfoG = omb.f().g(circulateServiceInfo.f10304a);
        int iG = g(circulateDeviceInfoN, headsetDeviceInfoG);
        tpe.f("HeadsetServiceController", "stateCode = " + iG);
        if (iG != 100) {
            headsetDeviceInfoG.h = -2;
            headsetDeviceInfoG.f = Arrays.asList(-1, -1, -1, 0, 0, 0);
        }
        return Integer.valueOf(iG);
    }

    public final /* synthetic */ Integer s(CirculateServiceInfo circulateServiceInfo, int i) {
        if (n(circulateServiceInfo) == null) {
            tpe.i("HeadsetServiceController", "getConnectedDevice is null");
            return 201;
        }
        if (j(i) >= 0) {
            return Integer.valueOf(h(n(circulateServiceInfo), omb.f().g(circulateServiceInfo.f10304a), j(i)));
        }
        tpe.i("HeadsetServiceController", "set noise cancelling fail, type error");
        return 208;
    }

    public final /* synthetic */ Integer t(CirculateServiceInfo circulateServiceInfo, int i) {
        CirculateDeviceInfo circulateDeviceInfoN = n(circulateServiceInfo);
        if (circulateDeviceInfoN == null) {
            tpe.i("HeadsetServiceController", "set volume error,connected device not found");
            return 201;
        }
        if (i >= 0 && i <= 100) {
            return Integer.valueOf(i(circulateDeviceInfoN, omb.f().g(circulateServiceInfo.f10304a), i));
        }
        tpe.i("HeadsetServiceController", "set volume error,wrong volume");
        return 201;
    }

    @SuppressLint({"NewApi"})
    public CompletableFuture<Integer> u(final CirculateServiceInfo circulateServiceInfo) {
        tpe.a("HeadsetServiceController", "get headset property");
        return CompletableFuture.supplyAsync(new Supplier() { // from class: jnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f22942a.r(circulateServiceInfo);
            }
        }, wcp.b());
    }

    public void v(boolean z, CirculateDeviceInfo circulateDeviceInfo) {
        tpe.f("HeadsetServiceController", "set output2: " + z);
        if (this.d == null) {
            tpe.f("HeadsetServiceController", "mOutputSwitcher is null ");
            return;
        }
        CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfo.c(393216);
        if (circulateServiceInfoC == null) {
            tpe.f("HeadsetServiceController", "serviceInfo is null");
            return;
        }
        String str = circulateServiceInfoC.f10304a;
        if (str == null || str.equals("")) {
            tpe.f("HeadsetServiceController", "btMac is null");
        } else if (Build.VERSION.SDK_INT >= 30) {
            if (z) {
                this.d.z(circulateDeviceInfo);
            } else {
                this.d.B();
            }
        }
    }

    @SuppressLint({"NewApi"})
    public CompletableFuture<Integer> w(final CirculateServiceInfo circulateServiceInfo, final int i) {
        tpe.f("HeadsetServiceController", "set noise cancelling: " + i);
        return CompletableFuture.supplyAsync(new Supplier() { // from class: inb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f21317a.s(circulateServiceInfo, i);
            }
        }, wcp.b());
    }

    @SuppressLint({"NewApi"})
    public CompletableFuture<Integer> x(final CirculateServiceInfo circulateServiceInfo, final int i) {
        tpe.f("HeadsetServiceController", "set volume: " + i);
        return CompletableFuture.supplyAsync(new Supplier() { // from class: hnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f20256a.t(circulateServiceInfo, i);
            }
        }, wcp.b());
    }
}
