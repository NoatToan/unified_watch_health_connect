package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.hm.health.bt.profile.grsp.GRSPModule;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class tgt {
    public static final UUID p = tet.C(2);
    public static final UUID q = tet.C(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2 f34687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n2 f34688b;
    public qc c;
    public w5 d;
    public b e;
    public int f;
    public int g;
    public HashMap<vr, d> h;
    public HashMap<vr, c> i;
    public HashMap<vr, tft> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ByteBuffer f34689k;
    public HashMap<vr, b4> l;
    public GRSPModule m;
    public jet n;
    public HashMap<vr, Boolean> o;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f34691b;

        static {
            int[] iArr = new int[a4.values().length];
            f34691b = iArr;
            try {
                iArr[a4.INT_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34691b[a4.INT_16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34691b[a4.INT_32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34691b[a4.INT_64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34691b[a4.UINT_8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34691b[a4.UINT_16.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34691b[a4.UINT_32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34691b[a4.UINT_64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34691b[a4.FLOAT_32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34691b[a4.FLOAT_64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[vr.values().length];
            f34690a = iArr2;
            try {
                iArr2[vr.GSENSOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34690a[vr.PPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34690a[vr.ECG.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34690a[vr.NMEA.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34690a[vr.GYRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34690a[vr.ADATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34690a[vr.GEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34690a[vr.SPO2.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f34690a[vr.HR.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34690a[vr.PRESSURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34690a[vr.BAROMETER.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f34690a[vr.PP.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public interface b {
        void a(bft bftVar);

        void a(byte[] bArr);

        boolean a();
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f34693b;

        public c(int i, long j) {
            this.f34692a = i;
            this.f34693b = j;
        }

        public int a() {
            return this.f34692a;
        }

        public String toString() {
            return "IndexData{index=" + this.f34692a + ", timestamp=" + this.f34693b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f34695b;
        public int c = -1;

        public d(int i, long j) {
            this.f34694a = i;
            this.f34695b = j;
        }

        public void a(int i) {
            this.c = i;
        }

        public String toString() {
            return "TimeData{sensorType=" + this.f34694a + ", timestamp=" + this.f34695b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public tgt(jet jetVar) {
        this(jetVar, g(jetVar, q), g(jetVar, p));
        this.n = jetVar;
    }

    public static nd g(jet jetVar, UUID uuid) {
        return new nd(jetVar, a6t.UUID_SERVICE_MILI_SERVICE, uuid);
    }

    public static /* synthetic */ void j(qe qeVar, CountDownLatch countDownLatch, byte[] bArr) {
        qeVar.b(bArr);
        countDownLatch.countDown();
    }

    public final void A() {
        Iterator<tft> it = this.j.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void B(byte[] bArr) {
        d dVarRemove;
        vr vrVar = vr.GSENSOR;
        int i = bArr[1] & 255;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        b bVar = this.e;
        int i2 = 0;
        boolean zA = bVar != null ? bVar.a() : false;
        c cVar = this.i.get(vrVar);
        if (cVar != null) {
            int iB = b(i, cVar.a());
            if (iB > 5 && !zA) {
                E();
            } else if (iB > 0 && !zA) {
                for (int i3 = 0; i3 < iB; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList.add(new hdt(65535, 65535, 65535));
                    }
                }
            }
            i2 = iB;
        }
        this.i.put(vrVar, new c(i, System.currentTimeMillis()));
        for (int i5 = 2; i5 < length; i5 += 6) {
            hdt hdtVar = new hdt((((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8)) << 16) >> 16, (((bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8)) << 16) >> 16, (((bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8)) << 16) >> 16);
            if (i5 == 2 && (dVarRemove = this.h.remove(vrVar)) != null) {
                hdtVar.b(dVarRemove.f34695b);
            }
            t5t.m("HMProSensorDataProfile", "GSensor:" + hdtVar);
            arrayList.add(hdtVar);
        }
        if (this.e != null) {
            bft bftVar = new bft(arrayList);
            bftVar.a(i2);
            this.e.a(bftVar);
        }
    }

    public CheckData C() {
        qe qeVarP = P(new byte[]{3});
        t5t.d("HMProSensorDataProfile", "stop response: " + qeVarP);
        G();
        if (!this.f34687a.d()) {
            t5t.d("HMProSensorDataProfile", "unregisterControlCallback failed!!!");
        }
        boolean z = qeVarP != null && qeVarP.k();
        CheckData checkData = new CheckData(z);
        t5t.d("HMProSensorDataProfile", "stop response sucess = " + z + "; data = " + (qeVarP == null ? AbstractJsonLexerKt.NULL : tet.x(qeVarP.i())));
        if (qeVarP != null) {
            checkData.a(qeVarP.i());
        }
        this.e = null;
        return checkData;
    }

    public final void D(byte[] bArr) {
        d dVarRemove;
        vr vrVar = vr.GYRO;
        int i = bArr[1] & 255;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        c cVar = this.i.get(vrVar);
        int i2 = 0;
        if (cVar != null) {
            int iB = b(i, cVar.a());
            if (iB > 5) {
                E();
            } else if (iB > 0) {
                for (int i3 = 0; i3 < iB; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList.add(new hbs(65535, 65535, 65535));
                    }
                }
            }
            i2 = iB;
        }
        this.i.put(vrVar, new c(i, System.currentTimeMillis()));
        for (int i5 = 2; i5 < length; i5 += 6) {
            hbs hbsVar = new hbs((((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8)) << 16) >> 16, (((bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8)) << 16) >> 16, (((bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8)) << 16) >> 16);
            if (i5 == 2 && (dVarRemove = this.h.remove(vrVar)) != null) {
                hbsVar.b(dVarRemove.f34695b);
            }
            t5t.m("HMProSensorDataProfile", "GSensor:" + hbsVar);
            arrayList.add(hbsVar);
        }
        if (this.e != null) {
            bft bftVar = new bft(arrayList);
            bftVar.a(i2);
            this.e.a(bftVar);
        }
    }

    public final void E() {
        C();
        n2 n2Var = this.f34688b;
        if (n2Var instanceof nd) {
            ((nd) n2Var).disconnect();
        }
    }

    public final void F(byte[] bArr) {
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < length; i += 9) {
            arrayList.add(new nht(tet.u(bArr, i + 1), bArr[i] & 255));
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(new bft(arrayList));
        }
    }

    public final void G() {
        Iterator<tft> it = this.j.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public final void H(byte[] bArr) {
        d dVarRemove;
        d dVarRemove2;
        vr vrVar = vr.PPG;
        int i = bArr[1] & 255;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        b bVar = this.e;
        int i2 = 0;
        boolean zA = bVar != null ? bVar.a() : false;
        c cVar = this.i.get(vrVar);
        if (cVar != null) {
            int iB = b(i, cVar.a());
            if (iB > 5 && !zA) {
                E();
            } else if (iB > 0 && !zA) {
                for (int i3 = 0; i3 < iB; i3++) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        arrayList.add(new pts(255L));
                    }
                }
            }
            i2 = iB;
        }
        this.i.put(vrVar, new c(i, System.currentTimeMillis()));
        if (x() || z()) {
            for (int i5 = 2; i5 < length; i5 += 4) {
                long jV = tet.v(bArr, i5, 4);
                if (x()) {
                    jV = (jV << 32) >> 32;
                }
                pts ptsVar = new pts(jV);
                arrayList.add(ptsVar);
                if (i5 == 2 && (dVarRemove = this.h.remove(vrVar)) != null) {
                    ptsVar.b(dVarRemove.f34695b);
                }
            }
        } else {
            for (int i6 = 2; i6 < length; i6 += 2) {
                pts ptsVar2 = new pts((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8));
                if (i6 == 2 && (dVarRemove2 = this.h.remove(vrVar)) != null) {
                    ptsVar2.b(dVarRemove2.f34695b);
                }
                t5t.m("HMProSensorDataProfile", "PPG:" + ptsVar2);
                arrayList.add(ptsVar2);
            }
        }
        if (this.e != null) {
            bft bftVar = new bft(arrayList);
            bftVar.a(i2);
            this.e.a(bftVar);
        }
    }

    public final void I(byte[] bArr) {
        d dVarRemove;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < length; i += 2) {
            i0t i0tVar = new i0t((((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) << 16) >> 16);
            if (i == 2 && (dVarRemove = this.h.remove(vr.PRESSURE)) != null) {
                i0tVar.b(dVarRemove.f34695b);
            }
            arrayList.add(i0tVar);
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(new bft(arrayList));
        }
    }

    public boolean J() {
        return this.f34688b.b(new byte[]{0});
    }

    public final synchronized void K(byte[] bArr) {
        try {
            t5t.m("HMProSensorDataProfile", "parseSenorDataX:" + tet.x(bArr));
            if (bArr != null && bArr.length >= 3) {
                int i = bArr[0] & 255;
                t5t.m("HMProSensorDataProfile", "sensorType:" + i + ",index:" + (bArr[1] & 255));
                if (i == vr.GSENSOR.a()) {
                    B(bArr);
                } else if (i == vr.PPG.a()) {
                    H(bArr);
                } else if (i == vr.TIME.a()) {
                    O(bArr);
                } else if (i == vr.GEO.a()) {
                    y(bArr);
                } else if (i == vr.ADATA.a()) {
                    t(bArr);
                } else if (i == vr.ECG.a()) {
                    w(bArr);
                } else if (i == vr.GYRO.a()) {
                    D(bArr);
                } else {
                    b bVar = this.e;
                    if (bVar != null) {
                        bVar.a(bArr);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void L(byte[] bArr) {
        d dVarRemove;
        d dVarRemove2;
        if (bArr == null) {
            t5t.d("HMProSensorDataProfile", "sensor data is null!!!");
            return;
        }
        int length = bArr.length;
        if (length < 2) {
            t5t.d("HMProSensorDataProfile", "invalid sensor data length!!!");
            return;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        byte b2 = bArr[1];
        int iQ = q(b2, this.f);
        b bVar = this.e;
        boolean zA = bVar != null ? bVar.a() : false;
        t5t.m("HMProSensorDataProfile", "flag:" + i2 + ",index:" + ((int) b2));
        if (i2 == vr.GSENSOR.a()) {
            ArrayList arrayList = new ArrayList();
            if (iQ > 0 && !zA) {
                t5t.d("HMProSensorDataProfile", "GSensor missingPackets:" + iQ);
                while (i < iQ) {
                    arrayList.add(new hdt(65535, 65535, 65535));
                    i++;
                }
            }
            for (int i3 = 2; i3 < length; i3 += 6) {
                hdt hdtVar = new hdt((((bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8)) << 16) >> 16, (((bArr[i3 + 2] & 255) | ((bArr[i3 + 3] & 255) << 8)) << 16) >> 16, (((bArr[i3 + 4] & 255) | ((bArr[i3 + 5] & 255) << 8)) << 16) >> 16);
                arrayList.add(hdtVar);
                if (i3 == 2 && (dVarRemove2 = this.h.remove(vr.GSENSOR)) != null) {
                    hdtVar.b(dVarRemove2.f34695b);
                }
            }
            r(vr.GSENSOR, length / 6);
            if (this.e != null) {
                bft bftVar = new bft(arrayList);
                bftVar.a(iQ);
                this.e.a(bftVar);
            }
        } else if (i2 == vr.GYRO.a()) {
            ArrayList arrayList2 = new ArrayList();
            if (iQ > 0) {
                t5t.d("HMProSensorDataProfile", "missingPackets:" + iQ);
                while (i < iQ) {
                    arrayList2.add(new hbs(65535, 65535, 65535));
                    i++;
                }
            }
            for (int i4 = 2; i4 < length; i4 += 6) {
                arrayList2.add(new hbs((((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8)) << 16) >> 16, (((bArr[i4 + 2] & 255) | ((bArr[i4 + 3] & 255) << 8)) << 16) >> 16, (((bArr[i4 + 4] & 255) | ((bArr[i4 + 5] & 255) << 8)) << 16) >> 16));
            }
            r(vr.GYRO, length / 6);
            if (this.e != null) {
                bft bftVar2 = new bft(arrayList2);
                bftVar2.a(iQ);
                this.e.a(bftVar2);
            }
        } else if (i2 == vr.PPG.a()) {
            ArrayList arrayList3 = new ArrayList();
            if (iQ > 0 && !zA) {
                t5t.d("HMProSensorDataProfile", "PPG missingPackets:" + iQ);
                while (i < iQ) {
                    arrayList3.add(new pts(WebSocketProtocol.PAYLOAD_SHORT_MAX));
                    i++;
                }
            }
            for (int i5 = 2; i5 < length; i5 += 2) {
                pts ptsVar = new pts((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8));
                arrayList3.add(ptsVar);
                if (i5 == 2 && (dVarRemove = this.h.remove(vr.PPG)) != null) {
                    ptsVar.b(dVarRemove.f34695b);
                }
            }
            r(vr.PPG, length / 2);
            if (this.e != null) {
                bft bftVar3 = new bft(arrayList3);
                bftVar3.a(iQ);
                this.e.a(bftVar3);
            }
        } else if (i2 == vr.ECG.a()) {
            ArrayList arrayList4 = new ArrayList();
            for (int i6 = 2; i6 < length; i6 += 2) {
                arrayList4.add(new lft(((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8)) & 32767));
            }
            r(vr.ECG, length / 2);
            if (this.e != null) {
                bft bftVar4 = new bft(arrayList4);
                bftVar4.a(iQ);
                this.e.a(bftVar4);
            }
        } else {
            b bVar2 = this.e;
            if (bVar2 != null) {
                bVar2.a(bArr);
            }
        }
        this.f = b2;
    }

    public final void M(byte[] bArr) {
        t5t.m("HMProSensorDataProfile", "parseSensorDataExtend:" + tet.x(bArr));
        if (bArr == null || bArr.length < 3) {
            return;
        }
        int i = bArr[0] & 255;
        t5t.d("HMProSensorDataProfile", "type: " + i + ", index: " + (bArr[1] & 255));
        vr vrVarB = vr.b(i);
        if (v(vrVarB)) {
            s(vrVarB, bArr);
        }
        switch (i) {
            case 0:
                B(bArr);
                break;
            case 1:
                H(bArr);
                break;
            case 2:
                w(bArr);
                break;
            case 3:
            case 11:
            case 12:
            case 13:
            default:
                b bVar = this.e;
                if (bVar != null) {
                    bVar.a(bArr);
                }
                break;
            case 4:
                D(bArr);
                break;
            case 5:
                t(bArr);
                break;
            case 6:
                y(bArr);
                break;
            case 7:
                O(bArr);
                break;
            case 8:
                N(bArr);
                break;
            case 9:
                F(bArr);
                break;
            case 10:
                I(bArr);
                break;
            case 14:
                if (this.g < 4) {
                    k(vr.PP);
                }
                l(vr.PP, bArr);
                break;
            case 15:
                if (this.g < 4) {
                    k(vr.BAROMETER);
                }
                l(vr.BAROMETER, bArr);
                break;
            case 16:
                l(vr.BODY_TEMPERATURE, bArr);
                break;
        }
    }

    public final void N(byte[] bArr) {
        int iB;
        vr vrVar = vr.SPO2;
        boolean z = true;
        int i = bArr[1] & 255;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        c cVar = this.i.get(vrVar);
        b bVar = this.e;
        boolean zA = bVar != null ? bVar.a() : false;
        if (cVar != null) {
            iB = b(i, cVar.a());
            if (iB > 5 && !zA) {
                E();
            } else if (iB > 0 && !zA) {
                for (int i2 = 0; i2 < iB; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        arrayList.add(new cht(-1, -1, -1));
                    }
                }
            }
        } else {
            iB = 0;
        }
        this.i.put(vrVar, new c(i, System.currentTimeMillis()));
        int i4 = 2;
        while (i4 < length) {
            int i5 = ((bArr[i4 + 1] & 255) << 8) | (bArr[i4] & 255) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24);
            int i6 = ((bArr[i4 + 5] & 255) << 8) | (bArr[i4 + 4] & 255) | ((bArr[i4 + 6] & 255) << 16) | ((bArr[i4 + 7] & 255) << 24);
            int i7 = i4 + 11;
            int i8 = ((bArr[i4 + 9] & 255) << 8) | (bArr[i4 + 8] & 255) | ((bArr[i4 + 10] & 255) << 16);
            i4 += 12;
            cht chtVar = new cht(i5, i6, i8 | ((bArr[i7] & 255) << 24));
            if (z) {
                d dVarRemove = this.h.remove(vrVar);
                if (dVarRemove != null) {
                    chtVar.b(dVarRemove.f34695b);
                }
                z = false;
            }
            arrayList.add(chtVar);
        }
        if (this.e != null) {
            bft bftVar = new bft(arrayList);
            bftVar.a(iB);
            this.e.a(bftVar);
        }
    }

    public final void O(byte[] bArr) {
        int i = bArr[1] & 255;
        int iA = bArr[2] & 255;
        if (this.g >= 2) {
            iA = vr.b(iA).a();
        }
        d dVar = new d(iA, tet.u(bArr, 3));
        dVar.a(i);
        t5t.m("HMProSensorDataProfile", "timeData:" + dVar);
        this.h.put(vr.a(iA), dVar);
    }

    public final qe P(byte[] bArr) {
        final qe qeVar = new qe();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!this.f34688b.a(new w5() { // from class: qgt
            @Override // defpackage.w5
            public final void a(byte[] bArr2) {
                tgt.j(qeVar, countDownLatch, bArr2);
            }
        })) {
            return null;
        }
        this.f34688b.b(bArr);
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        this.f34688b.d();
        return qeVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    public final int b(int i, int i2) {
        int i3;
        if (i2 + 1 != i) {
            i3 = 255;
            if (i2 == 255 && i == 0) {
                i3 = 0;
            } else if (i > i2) {
                i3 = i - i2;
            } else if (i != i2) {
                i3 = (255 - i2) + i;
            }
        } else {
            i3 = 0;
        }
        t5t.m("HMProSensorDataProfile", "index delta:" + i3);
        return i3;
    }

    public final int c(vr vrVar, int i) {
        c cVar = this.i.get(vrVar);
        return cVar == null ? i : b(i, cVar.a());
    }

    public final Number d(a4 a4Var, byte[] bArr) {
        switch (a.f34691b[a4Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return tet.z(bArr, 0, a4Var.getU());
            case 5:
            case 6:
            case 7:
            case 8:
                return Long.valueOf(tet.v(bArr, 0, a4Var.getU()));
            case 9:
                return Float.valueOf(Float.intBitsToFloat(((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16)));
            case 10:
                long j = bArr[0] & 255;
                long j2 = bArr[1] & 65280;
                long j3 = bArr[2] & 16711680;
                long j4 = bArr[3] & (-16777216);
                long j5 = ((long) (bArr[4] & 255)) << 32;
                long j6 = ((long) (bArr[5] & 255)) << 40;
                return Double.valueOf(Double.longBitsToDouble(j3 | j | j2 | j4 | j5 | j6 | (((long) (bArr[6] & 255)) << 48) | (((long) (bArr[7] & 255)) << 56)));
            default:
                throw new RuntimeException("Unsupported type: " + a4Var);
        }
    }

    public final HashMap<vr, Boolean> e(HashMap<vr, b4> map) {
        HashMap<vr, Boolean> map2 = new HashMap<>();
        for (Map.Entry<vr, b4> entry : map.entrySet()) {
            vr key = entry.getKey();
            map2.put(key, Boolean.valueOf(!sr.a(key, entry.getValue())));
        }
        return map2;
    }

    public final List<CommonSensorData> f(vr vrVar, b4 b4Var, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList<a4> arrayListA = b4Var.a();
        if (bArr != null && bArr.length >= 3 && !arrayListA.isEmpty()) {
            int i = 0;
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            t5t.m("HMProSensorDataProfile", "sensorType: " + vrVar + ", notifyType:" + i2 + ", index:" + i3);
            int iC = c(vrVar, i3);
            if (iC > 0) {
                t5t.d("HMProSensorDataProfile", "Add " + vrVar + " miss data: " + iC);
                i(arrayList, vrVar, iC, arrayListA.size());
                if (iC > 5) {
                    E();
                }
            }
            this.i.put(vrVar, new c(i3, System.currentTimeMillis()));
            int length = bArr.length;
            int size = arrayListA.size();
            int u = 2;
            int i4 = 0;
            while (u < length) {
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = i; i5 < size; i5++) {
                    a4 a4Var = arrayListA.get(i5);
                    int u2 = a4Var.getU() + u;
                    if (u2 > length) {
                        break;
                    }
                    arrayList2.add(d(a4Var, Arrays.copyOfRange(bArr, u, u2)));
                    u += a4Var.getU();
                }
                d dVarRemove = this.h.remove(vrVar);
                arrayList.add(dVarRemove == null ? new CommonSensorData(vrVar, arrayList2) : new CommonSensorData(vrVar, arrayList2, Long.valueOf(dVarRemove.f34695b)));
                i4++;
                length = length;
                i = 0;
            }
            t5t.d("HMProSensorDataProfile", "Add " + vrVar + " data: " + i4);
        }
        return arrayList;
    }

    public final void h(int i) {
        vr vrVar = vr.GSENSOR;
        if ((vrVar.a() & i) != 0) {
            this.j.put(vrVar, new tft(vrVar));
        }
        vr vrVar2 = vr.PPG;
        if ((vrVar2.a() & i) != 0) {
            this.j.put(vrVar2, new tft(vrVar2));
        }
        vr vrVar3 = vr.GYRO;
        if ((vrVar3.a() & i) != 0) {
            this.j.put(vrVar3, new tft(vrVar3));
        }
        vr vrVar4 = vr.ECG;
        if ((vrVar4.a() & i) != 0) {
            this.j.put(vrVar4, new tft(vrVar4));
        }
        vr vrVar5 = vr.TIME;
        if ((i & vrVar5.a()) != 0) {
            this.j.put(vrVar5, new tft(vrVar5));
        }
    }

    public final void i(List<CommonSensorData> list, vr vrVar, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(0);
            }
            list.add(new CommonSensorData(vrVar, arrayList));
        }
    }

    public final void k(vr vrVar) {
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        if (this.l.get(vrVar) != null) {
            return;
        }
        int i = a.f34690a[vrVar.ordinal()];
        if (i == 11) {
            b4 b4Var = new b4();
            b4Var.a().add(a4.INT_32);
            t5t.d("HMProSensorDataProfile", "Add " + vrVar + " desc: " + b4Var);
            this.l.put(vrVar, b4Var);
            return;
        }
        if (i != 12) {
            return;
        }
        b4 b4Var2 = new b4();
        b4Var2.a().add(a4.UINT_32);
        t5t.d("HMProSensorDataProfile", "Add " + vrVar + " desc: " + b4Var2);
        this.l.put(vrVar, b4Var2);
    }

    public final void l(vr vrVar, byte[] bArr) {
        HashMap<vr, b4> map = this.l;
        b4 b4Var = map == null ? null : map.get(vrVar);
        if (b4Var == null) {
            return;
        }
        List<CommonSensorData> listF = f(vrVar, b4Var, bArr);
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(new bft(new ArrayList(listF)));
        }
    }

    public final /* synthetic */ void m(byte[] bArr) {
        t5t.d("HMProSensorDataProfile", "OnReceived SensorData: " + tet.x(bArr) + ", Length: " + bArr.length);
        int i = this.g;
        if (i >= 2) {
            M(bArr);
        } else if (i == 1) {
            K(bArr);
        } else {
            L(bArr);
        }
    }

    public boolean n() {
        return this.f34688b.init() && this.f34687a.init();
    }

    public boolean o(int i, byte b2) {
        GRSPModule gRSPModule;
        jet jetVar = this.n;
        if (jetVar instanceof x7t) {
            this.m = (GRSPModule) ((x7t) jetVar).i1(GRSPModule.class);
        }
        qe qeVarP = P(new byte[]{1, (byte) i, b2});
        t5t.d("HMProSensorDataProfile", "config response:" + qeVarP);
        if (qeVarP == null) {
            return false;
        }
        byte[] bArrI = qeVarP.i();
        if (bArrI != null && bArrI.length == 1) {
            this.g = bArrI[0];
        }
        int i2 = this.g;
        if (i2 >= 4) {
            if (i2 != 5 || (gRSPModule = this.m) == null) {
                byte[] bArrA = this.c.a(i);
                t5t.d("HMProSensorDataProfile", "descData: " + tet.x(bArrA));
                if (bArrA == null) {
                    return false;
                }
                this.l = z5.a(bArrA);
            } else {
                this.l = gRSPModule.getSensorDescSync(i);
            }
            t5t.d("HMProSensorDataProfile", "SensorDescription: " + this.l);
            HashMap<vr, b4> map = this.l;
            if (map == null) {
                t5t.d("HMProSensorDataProfile", "sensorDescription null");
                return false;
            }
            HashMap<vr, Boolean> mapE = e(map);
            this.o = mapE;
            mapE.put(vr.TIME, Boolean.FALSE);
            qeVarP = P(new byte[]{1, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), b2});
            t5t.d("HMProSensorDataProfile", "config response version 4:" + qeVarP);
        } else {
            boolean z = i2 == 2 || i2 == 3;
            if (!qeVarP.d((byte) 1) && z) {
                qeVarP = P(new byte[]{1, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), b2});
                t5t.d("HMProSensorDataProfile", "config response new:" + qeVarP);
            }
        }
        if (qeVarP == null || !qeVarP.d((byte) 1)) {
            return false;
        }
        h(i);
        return true;
    }

    public boolean p(b bVar) {
        this.e = bVar;
        this.f = -1;
        this.h.clear();
        this.i.clear();
        this.f34689k.clear();
        if (!this.f34687a.a(this.d)) {
            t5t.d("HMProSensorDataProfile", "registerDataCallback failed!!!");
            return false;
        }
        boolean zB = this.f34688b.b(new byte[]{2});
        t5t.d("HMProSensorDataProfile", "start ret: " + zB);
        A();
        return zB;
    }

    public final int q(int i, int i2) {
        t5t.d("HMProSensorDataProfile", "data index:" + i + ",last index:" + i2);
        if ((i2 == 255 && i == 0) || i2 + 1 == i) {
            return 0;
        }
        return (i - i2) - 1;
    }

    public final void r(vr vrVar, int i) {
        tft tftVar = this.j.get(vrVar);
        if (tftVar != null) {
            tftVar.e(i);
        }
    }

    public final void s(vr vrVar, byte[] bArr) {
        l(vrVar, bArr);
    }

    public final void t(byte[] bArr) {
        this.f34689k.put(bArr, 2, bArr.length - 2);
        int i = this.f34689k.get(0) & 255;
        while (this.f34689k.position() > i) {
            int i2 = i + 1;
            byte[] bArr2 = new byte[i2];
            this.f34689k.flip();
            this.f34689k.get(bArr2);
            t5t.d("HMProSensorDataProfile", "oneFrame:" + i2 + "," + tet.x(bArr2));
            ByteBuffer byteBufferSlice = this.f34689k.slice();
            this.f34689k.clear();
            if (byteBufferSlice.capacity() > 0) {
                this.f34689k.put(byteBufferSlice);
            }
            i = this.f34689k.get(0) & 255;
            b bVar = this.e;
            if (bVar != null) {
                bVar.a(new bft(new v2t(bArr2)));
            }
        }
    }

    public final boolean u() {
        if (this.g == 3) {
            return true;
        }
        HashMap<vr, b4> map = this.l;
        if (map == null) {
            return false;
        }
        b4 b4Var = map.get(vr.ECG);
        return b4Var != null && b4Var.toString().equals(a4.INT_32.toString());
    }

    public final boolean v(vr vrVar) {
        if (this.g < 4) {
            return false;
        }
        HashMap<vr, Boolean> map = this.o;
        if (map == null) {
            return true;
        }
        return map.getOrDefault(vrVar, Boolean.TRUE).booleanValue();
    }

    public final void w(byte[] bArr) {
        int iB;
        boolean z;
        d dVarRemove;
        d dVarRemove2;
        vr vrVar = vr.ECG;
        int i = bArr[1] & 255;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        c cVar = this.i.get(vrVar);
        b bVar = this.e;
        boolean zA = bVar != null ? bVar.a() : false;
        if (cVar != null) {
            iB = b(i, cVar.a());
            if (iB > 5 && !zA) {
                E();
            } else if (iB > 0 && !zA) {
                for (int i2 = 0; i2 < iB; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        arrayList.add(new lft(-1L));
                    }
                }
            }
        } else {
            iB = 0;
        }
        this.i.put(vrVar, new c(i, System.currentTimeMillis()));
        if (u() || this.g == 3) {
            z = false;
            for (int i4 = 2; i4 < length; i4 += 4) {
                int iC = tet.c(bArr, i4);
                lft lftVar = new lft(iC);
                arrayList.add(lftVar);
                if (iC == 1 || iC == -1) {
                    z = true;
                }
                if (i4 == 2 && (dVarRemove = this.h.remove(vrVar)) != null) {
                    lftVar.b(dVarRemove.f34695b);
                }
            }
        } else {
            z = false;
            for (int i5 = 2; i5 < length; i5 += 2) {
                int i6 = i5 + 1;
                lft lftVar2 = new lft(((bArr[i5] & 255) | ((bArr[i6] & 255) << 8)) & 32767);
                arrayList.add(lftVar2);
                if (i5 == 2 && (dVarRemove2 = this.h.remove(vrVar)) != null) {
                    lftVar2.b(dVarRemove2.f34695b);
                }
                if ((bArr[i6] & 128) > 0) {
                    z = true;
                }
            }
        }
        if (this.e != null) {
            bft bftVar = new bft(arrayList);
            bftVar.b(z);
            bftVar.a(iB);
            this.e.a(bftVar);
        }
    }

    public final boolean x() {
        b4 b4Var;
        HashMap<vr, b4> map = this.l;
        return (map == null || (b4Var = map.get(vr.PPG)) == null || !b4Var.toString().equals(a4.INT_32.toString())) ? false : true;
    }

    public final void y(byte[] bArr) {
        d dVarRemove;
        vr vrVar = vr.GEO;
        int i = bArr[1] & 255;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        c cVar = this.i.get(vrVar);
        int i2 = 0;
        if (cVar != null) {
            int iB = b(i, cVar.a());
            if (iB > 5) {
                E();
            } else if (iB > 0) {
                for (int i3 = 0; i3 < iB; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList.add(new pgt(65535, 65535, 65535));
                    }
                }
            }
            i2 = iB;
        }
        this.i.put(vrVar, new c(i, System.currentTimeMillis()));
        for (int i5 = 2; i5 < length; i5 += 6) {
            pgt pgtVar = new pgt((((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8)) << 16) >> 16, (((bArr[i5 + 2] & 255) | ((bArr[i5 + 3] & 255) << 8)) << 16) >> 16, (((bArr[i5 + 4] & 255) | ((bArr[i5 + 5] & 255) << 8)) << 16) >> 16);
            if (i5 == 2 && (dVarRemove = this.h.remove(vrVar)) != null) {
                pgtVar.b(dVarRemove.f34695b);
            }
            t5t.m("HMProSensorDataProfile", "GSensor:" + pgtVar);
            arrayList.add(pgtVar);
        }
        if (this.e != null) {
            bft bftVar = new bft(arrayList);
            bftVar.a(i2);
            this.e.a(bftVar);
        }
    }

    public final boolean z() {
        b4 b4Var;
        HashMap<vr, b4> map = this.l;
        return (map == null || (b4Var = map.get(vr.PPG)) == null || !b4Var.toString().equals(a4.UINT_32.toString())) ? false : true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tgt(jet jetVar, final nd ndVar, n2 n2Var) {
        this(ndVar, n2Var, new rc(new z1(jetVar, new Function0() { // from class: rgt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ndVar.g();
            }
        })));
        Objects.requireNonNull(ndVar);
    }

    public tgt(n2 n2Var, n2 n2Var2, qc qcVar) {
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = new HashMap<>();
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.f34689k = ByteBuffer.allocate(1024);
        this.o = new HashMap<>();
        this.f34688b = n2Var;
        this.f34687a = n2Var2;
        this.c = qcVar;
        this.d = new w5() { // from class: sgt
            @Override // defpackage.w5
            public final void a(byte[] bArr) {
                this.f33627a.m(bArr);
            }
        };
    }
}
