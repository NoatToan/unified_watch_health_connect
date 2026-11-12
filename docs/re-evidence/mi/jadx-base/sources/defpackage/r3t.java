package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.OtaModule;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareInvokeCallback;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class r3t {
    public String d;
    public IFirmwareProgressCallback e;
    public boolean g;
    public OtaResult h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicBoolean f32160a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32161b = HuamiDevice.CONNECTING;
    public Vector<xd> c = new Vector<>();
    public final Executor f = let.a();

    public class a implements yh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IFirmwareInvokeCallback f32162a;

        public a(IFirmwareInvokeCallback iFirmwareInvokeCallback) {
            this.f32162a = iFirmwareInvokeCallback;
        }

        @Override // defpackage.yh
        public void a(yd ydVar, Progress progress) {
            this.f32162a.upgradingProgress(FwType.get(ydVar), progress);
        }

        @Override // defpackage.yh
        public void onError(int i) {
            this.f32162a.onError(i);
        }

        @Override // defpackage.yh, defpackage.jys
        public void onFwProgress(Progress progress) {
            this.f32162a.onFwProgress(progress);
        }

        @Override // defpackage.yh, defpackage.jys
        public void onFwStop(boolean z) {
            this.f32162a.onFwStop(z);
        }

        @Override // defpackage.yh, defpackage.jys
        public void a(int i) {
            this.f32162a.onFwStart();
        }
    }

    public class b extends HMCallback<OtaResult> {
        public final /* synthetic */ String e;
        public final /* synthetic */ ne f;
        public final /* synthetic */ xd g;

        public b(String str, ne neVar, xd xdVar) {
            this.e = str;
            this.f = neVar;
            this.g = xdVar;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(OtaResult otaResult) {
            Long lValueOf;
            try {
                lValueOf = Long.valueOf(hb.a(this.e));
            } catch (IOException e) {
                t5t.d("FwUpgradeHelper", "getCrc32:" + e.getMessage());
                lValueOf = null;
            }
            if (otaResult == null || lValueOf == null || !lValueOf.equals(otaResult.getCrc())) {
                r3t.this.q(this.f, this.g);
            } else {
                r3t.this.e.onTransmissionFinish();
                r3t.this.h = otaResult;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r3t f32164a = new r3t();
    }

    public static int e(String str) throws Throwable {
        FileInputStream fileInputStream;
        int iA = -1;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    int iAvailable = fileInputStream.available() - 96;
                    long jSkip = fileInputStream.skip(iAvailable);
                    byte[] bArr = new byte[32];
                    int i = fileInputStream.read(bArr);
                    x4s x4sVarB = x4s.b(bArr);
                    t5t.d("FwUpgradeHelper", "read:" + i);
                    t5t.d("FwUpgradeHelper", "HMFwHeader:" + x4sVarB);
                    t5t.d("FwUpgradeHelper", "skipped:" + jSkip + ",skip:" + iAvailable);
                    if (x4sVarB != null && x4sVarB.c()) {
                        iA = x4sVarB.a();
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        t5t.d("FwUpgradeHelper", e.toString());
                    }
                    return iA;
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream2 = fileInputStream;
                    t5t.d("FwUpgradeHelper", e.getMessage());
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e3) {
                            t5t.d("FwUpgradeHelper", e3.toString());
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            t5t.d("FwUpgradeHelper", e4.toString());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static r3t y() {
        return c.f32164a;
    }

    public synchronized void A(ne neVar) {
        if (this.f32160a.get()) {
            return;
        }
        G(neVar);
    }

    public final boolean B() {
        return this.c.size() > 0;
    }

    public final void C(ne neVar) throws Exception {
        if (x()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xd xdVar : this.c) {
            arrayList.add(new ib(xdVar.g(), xdVar.h()));
        }
        jv jvVar = new jv(4, 0, 0, true);
        jvVar.a(arrayList);
        String strA = jvVar.a();
        xd xdVar2 = new xd(strA, yd.FIRMWARE_BATCH);
        xdVar2.d(!this.g);
        xdVar2.b(this.g ? nv.FOREGROUND : nv.BACKGROUND);
        OtaModule otaModule = (OtaModule) neVar.y(OtaModule.class);
        if (otaModule == null) {
            q(neVar, xdVar2);
        } else {
            otaModule.getOtaInfo(new b(strA, neVar, xdVar2));
        }
    }

    public boolean D() {
        return this.f32160a.get();
    }

    public final void E(ne neVar) {
        if (x()) {
            return;
        }
        Vector<xd> vector = new Vector<>();
        int length = 0;
        for (xd xdVar : this.c) {
            length = (int) (((long) length) + new File(xdVar.g()).length());
            vector.add(xdVar);
            if (xdVar.h() == yd.FIRMWARE) {
                break;
            }
        }
        p(neVar, vector, 0, length);
    }

    public final void F(final ne neVar) {
        if (x()) {
            return;
        }
        this.f32160a.set(true);
        final xd xdVar = this.c.get(0);
        this.f.execute(new h1t(neVar, xdVar, this.e, new zet() { // from class: q3t
            @Override // defpackage.zet
            public final void onResult(boolean z) {
                this.f31059a.s(xdVar, neVar, z);
            }
        }));
    }

    public final synchronized void G(ne neVar) {
        IFirmwareProgressCallback iFirmwareProgressCallback = this.e;
        if (iFirmwareProgressCallback == null) {
            t5t.d("FwUpgradeHelper", "progressCallback is null");
            this.f32160a.set(false);
        } else {
            if (!eb.a(neVar, this.g, iFirmwareProgressCallback)) {
                g();
                return;
            }
            if (x()) {
                return;
            }
            if (eb.b(neVar)) {
                C(neVar);
            } else if (eb.a(neVar)) {
                E(neVar);
            } else {
                F(neVar);
            }
        }
    }

    public final xd f(String str, yd ydVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        return new xd(str, ydVar);
    }

    public synchronized void g() {
        this.f32160a.set(false);
        this.c.clear();
    }

    public void h(int i) {
        IFirmwareProgressCallback iFirmwareProgressCallback = this.e;
        if (iFirmwareProgressCallback == null) {
            return;
        }
        iFirmwareProgressCallback.onError(i);
    }

    public final void i(Context context, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String strA;
        xd xdVarF = f(str, yd.FIRMWARE);
        xd xdVarF2 = f(str5, yd.FONT);
        xd xdVarF3 = f(str6, yd.FIRMWARE_GPS);
        xd xdVarF4 = (TextUtils.isEmpty(str7) || (strA = gb.a(i, str7, context)) == null) ? null : f(strA, yd.FIRMWARE_CHANGE_LOG);
        xd xdVarF5 = f(str4, yd.RESOURCE_EXTERNAL);
        xd xdVarF6 = f(str3, yd.RESOURCE_COMPRESS);
        xd xdVarF7 = f(str2, yd.RESOURCE_BASE);
        if (xdVarF != null) {
            this.c.add(xdVarF);
        }
        if (xdVarF2 != null) {
            this.c.add(xdVarF2);
        }
        if (xdVarF3 != null) {
            this.c.add(xdVarF3);
        }
        if (xdVarF4 != null) {
            this.c.add(xdVarF4);
        }
        if (xdVarF5 != null) {
            this.c.add(xdVarF5);
        }
        if (xdVarF6 != null) {
            this.c.add(xdVarF6);
        }
        if (xdVarF7 != null) {
            this.c.add(xdVarF7);
        }
    }

    public void j(Context context, boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, ne neVar, IFirmwareProgressCallback iFirmwareProgressCallback) {
        if (z(neVar)) {
            iFirmwareProgressCallback.onCancel();
            return;
        }
        this.e = iFirmwareProgressCallback;
        this.g = z;
        if (eb.b(neVar)) {
            i(context, i, str, str2, str3, str4, str5, str6, str7);
        } else {
            k(str, str2, str3, str4, str5, str6, neVar);
        }
        G(neVar);
    }

    public final void k(String str, String str2, String str3, String str4, String str5, String str6, ne neVar) {
        xd xdVarF = f(str, yd.FIRMWARE);
        xd xdVarF2 = f(str2, yd.RESOURCE_BASE);
        xd xdVarF3 = f(str4, yd.RESOURCE_EXTERNAL);
        xd xdVarF4 = f(str3, yd.RESOURCE_COMPRESS);
        xd xdVarF5 = f(str5, yd.FONT);
        xd xdVarF6 = f(str6, yd.FIRMWARE_GPS);
        boolean z = xdVarF != null && u(neVar, str);
        if (z) {
            if (xdVarF6 != null) {
                this.c.add(xdVarF6);
            }
        } else if (xdVarF != null) {
            this.c.add(xdVarF);
        }
        if (xdVarF5 != null) {
            this.c.add(xdVarF5);
        }
        if (xdVarF2 != null) {
            this.c.add(xdVarF2);
        }
        if (xdVarF3 != null) {
            this.c.add(xdVarF3);
        }
        if (xdVarF4 != null) {
            this.c.add(xdVarF4);
        }
        if (z) {
            this.c.add(xdVarF);
        } else if (xdVarF6 != null) {
            this.c.add(xdVarF6);
        }
    }

    public final void l(ne neVar) {
        String strV = v(neVar);
        if (TextUtils.isEmpty(strV)) {
            t5t.d("FwUpgradeHelper", "macAddress is empty");
            return;
        }
        if (!TextUtils.equals(strV, this.d)) {
            t5t.d("FwUpgradeHelper", "another device");
            return;
        }
        if (!B()) {
            t5t.d("FwUpgradeHelper", "has not fw upgrading");
            return;
        }
        t5t.d("FwUpgradeHelper", "isUpgrading:" + this.f32160a.get());
        if (this.f32161b != HuamiDevice.CONNECTED || this.f32160a.get()) {
            return;
        }
        G(neVar);
    }

    public void m(ne neVar, int i) {
        this.f32161b = i;
        l(neVar);
        t5t.d("FwUpgradeHelper", "updateState:" + i);
    }

    public void n(final ne neVar, final IFirmwareInvokeCallback iFirmwareInvokeCallback) {
        if (this.h == null) {
            eb.a(neVar, new un() { // from class: o3t
                @Override // defpackage.un
                public final void a(OtaResult otaResult) {
                    this.f28716a.o(neVar, iFirmwareInvokeCallback, otaResult);
                }
            });
        } else {
            w(neVar, iFirmwareInvokeCallback);
        }
    }

    public final /* synthetic */ void o(ne neVar, IFirmwareInvokeCallback iFirmwareInvokeCallback, OtaResult otaResult) {
        this.h = otaResult;
        w(neVar, iFirmwareInvokeCallback);
    }

    public final void p(final ne neVar, final Vector<xd> vector, final int i, final int i2) {
        if (x()) {
            return;
        }
        this.f32160a.set(true);
        boolean z = vector.size() - 1 == i;
        final xd xdVar = vector.get(i);
        xd xdVar2 = new xd(xdVar.g(), xdVar.h(), z ? xd.a.LAST : xd.a.CONTINUE, i2);
        xdVar2.c(new o5(i, vector.size(), i2));
        xdVar2.b(nv.CONTINUE_UPGRADE);
        this.f.execute(new h1t(neVar, xdVar2, this.e, new zet() { // from class: p3t
            @Override // defpackage.zet
            public final void onResult(boolean z2) {
                this.f29974a.r(xdVar, vector, i, neVar, i2, z2);
            }
        }));
    }

    public final void q(ne neVar, xd xdVar) {
        this.f32160a.set(true);
        this.f.execute(new h1t(neVar, xdVar, this.e, new zet() { // from class: n3t
            @Override // defpackage.zet
            public final void onResult(boolean z) {
                this.f27522a.t(z);
            }
        }));
    }

    public final /* synthetic */ void r(xd xdVar, Vector vector, int i, ne neVar, int i2, boolean z) {
        t5t.d("FwUpgradeHelper", "result:" + z);
        if (!z) {
            this.f32160a.set(false);
            return;
        }
        this.c.remove(xdVar);
        if (x()) {
            return;
        }
        if (vector.size() - 1 == i) {
            E(neVar);
        } else {
            p(neVar, vector, i + 1, i2);
        }
    }

    public final /* synthetic */ void s(xd xdVar, ne neVar, boolean z) {
        t5t.d("FwUpgradeHelper", "result:" + z);
        if (!z) {
            this.f32160a.set(false);
            return;
        }
        this.c.remove(xdVar);
        if (xdVar.h() != yd.FIRMWARE) {
            F(neVar);
        } else {
            if (x()) {
                return;
            }
            this.f32160a.set(false);
        }
    }

    public final /* synthetic */ void t(boolean z) {
        if (!z) {
            g();
        } else {
            this.c.clear();
            x();
        }
    }

    public final boolean u(ne neVar, String str) {
        com.xiaomi.hm.health.bt.profile.base.a aVarM0;
        int iE;
        g4s g4sVarO = neVar.O();
        return (g4sVarO == null || (aVarM0 = g4sVarO.m0()) == null || (iE = e(str)) == -1 || iE != aVarM0.k()) ? false : true;
    }

    public final String v(ne neVar) {
        if (neVar == null) {
            t5t.d("FwUpgradeHelper", "has not device");
            return null;
        }
        if (neVar.V()) {
            return neVar.L().getAddress();
        }
        t5t.d("FwUpgradeHelper", "device has not connected");
        return null;
    }

    public final void w(ne neVar, IFirmwareInvokeCallback iFirmwareInvokeCallback) {
        Long crc;
        Long fileSize;
        Byte fileType;
        OtaResult otaResult = this.h;
        if (otaResult == null || (crc = otaResult.getCrc()) == null || (fileSize = this.h.getFileSize()) == null || (fileType = this.h.getFileType()) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("invokeUpgrade:");
            OtaResult otaResult2 = this.h;
            sb.append(otaResult2 == null ? null : otaResult2.toString());
            t5t.d("FwUpgradeHelper", sb.toString());
            iFirmwareInvokeCallback.onFwStop(false);
        } else {
            neVar.m2(crc.longValue(), fileSize.intValue(), yd.a(fileType.byteValue() & 255), new a(iFirmwareInvokeCallback));
        }
        this.h = null;
    }

    public final boolean x() {
        if (B()) {
            return false;
        }
        t5t.d("FwUpgradeHelper", "upgrade finish");
        this.e.onFwFinish();
        this.f32160a.set(false);
        return true;
    }

    public final boolean z(ne neVar) {
        String strV = v(neVar);
        if (TextUtils.isEmpty(strV)) {
            t5t.d("FwUpgradeHelper", "macAddress is empty");
            return true;
        }
        if (TextUtils.equals(strV, this.d) && B()) {
            t5t.d("FwUpgradeHelper", "has fw upgrading");
            return true;
        }
        if (!TextUtils.isEmpty(this.d) && TextUtils.equals(strV, this.d)) {
            return false;
        }
        this.d = strV;
        this.c.clear();
        return false;
    }
}
