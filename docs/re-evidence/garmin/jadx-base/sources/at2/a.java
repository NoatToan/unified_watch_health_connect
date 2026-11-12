package at2;

import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.room.w0;
import bs2.b5;
import bs2.c5;
import com.garmin.gfdi.GfdiException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.common.primitives.UnsignedBytes;
import d53.n;
import e23.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.c0;
import o53.f0;
import o53.l1;
import o53.s;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import p13.h0;
import p13.l0;
import r1.q2;
import rs2.h;
import rs2.u;
import rs2.v;
import rs2.w;
import rs2.x;
import rs2.y;
import u53.d;
import us2.f;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u000e\u000fB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lat2/a;", "Lrs2/w;", "Lrs2/h;", "Lbs2/c5;", "", "connectionId", "Lus2/a;", "messenger", "Lzs2/h;", "fitHandler", "Lrs2/u;", "hostConfig", "<init>", "(Ljava/lang/String;Lus2/a;Lzs2/h;Lrs2/u;)V", "a", "b", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements w, h, c5 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set<Integer> f12795m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final us2.a f12797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs2.h f12798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f12799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f12800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<b> f12801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f12802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f12803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<f> f12804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<byte[]> f12805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12806l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lat2/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        NOT_STARTED,
        IN_PROGRESS,
        COMPLETE
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.gfdi.handshake.HandshakeHandler$onMesg$1", f = "HandshakeHandler.kt", l = {455}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12811a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f12813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m0 f12814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f12815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ byte[] f12816f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m0 m0Var, m0 m0Var2, f fVar, byte[] bArr, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f12813c = m0Var;
            this.f12814d = m0Var2;
            this.f12815e = fVar;
            this.f12816f = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(this.f12813c, this.f12814d, this.f12815e, this.f12816f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Exception exc;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f12811a;
            a aVar2 = a.this;
            if (i14 == 0) {
                r.b(obj);
                try {
                    zs2.h hVar = aVar2.f12798d;
                    boolean z14 = this.f12813c.f105804a;
                    boolean z15 = this.f12814d.f105804a;
                    this.f12811a = 1;
                    int i15 = zs2.h.f206893f;
                    cVar = this;
                    try {
                        if (hVar.b(false, z14, z15, false, false, cVar) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                        aVar2.f12800f.error("Failed to send FIT capabilities to device", (Throwable) exc);
                        a.e(aVar2, exc);
                    }
                } catch (Exception e14) {
                    e = e14;
                    exc = e;
                    aVar2.f12800f.error("Failed to send FIT capabilities to device", (Throwable) exc);
                    a.e(aVar2, exc);
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    r.b(obj);
                    cVar = this;
                } catch (Exception e15) {
                    exc = e15;
                    aVar2.f12800f.error("Failed to send FIT capabilities to device", (Throwable) exc);
                    a.e(aVar2, exc);
                }
            }
            f fVar = cVar.f12815e;
            byte[] bArr = cVar.f12816f;
            Set<Integer> set = a.f12795m;
            a.b(aVar2, aVar2.j(fVar, bArr, true));
            return Unit.INSTANCE;
        }
    }

    static {
        new C0181a(null);
        f12795m = p13.u.m0(new Integer[]{3192, 3307});
    }

    public a(String str, us2.a aVar, zs2.h hVar, u uVar) {
        str.getClass();
        aVar.getClass();
        hVar.getClass();
        uVar.getClass();
        this.f12796b = str;
        this.f12797c = aVar;
        this.f12798d = hVar;
        this.f12799e = uVar;
        rs2.d.f154380a.getClass();
        this.f12800f = LoggerFactory.getLogger(rs2.d.a("HandshakeHandler", -1L, this, str));
        this.f12801g = new AtomicReference<>(b.NOT_STARTED);
        d dVarL = q2.l("HandshakeHandler");
        this.f12802h = dVarL;
        this.f12803i = new s((l1) dVarL.f168725a.get(l1.f129368i0));
        this.f12804j = new AtomicReference<>();
        this.f12805k = new AtomicReference<>();
        aVar.d(5024, this);
        aVar.d(5050, this);
        aVar.d(5027, this);
        hVar.f206896d.f20007x.add(this);
    }

    public static final void b(a aVar, f fVar) {
        AtomicReference<b> atomicReference = aVar.f12801g;
        b bVar = b.IN_PROGRESS;
        b bVar2 = b.COMPLETE;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        aVar.f12800f.info("Handshake complete");
        aVar.f12804j.set(fVar);
        aVar.f12803i.g0(fVar);
    }

    public static final void e(a aVar, Exception exc) {
        AtomicReference<b> atomicReference = aVar.f12801g;
        b bVar = b.COMPLETE;
        if (atomicReference.getAndSet(bVar) != bVar) {
            aVar.f12800f.info("Handshake failed", (Throwable) exc);
            aVar.f12803i.O(exc);
        }
    }

    public static void f(long j8, byte[] bArr) {
        i(3, bArr, j8, 8L);
        i(4, bArr, j8, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        i(5, bArr, j8, 268435456L);
        i(9, bArr, j8, 134217728L);
        i(12, bArr, j8, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        i(13, bArr, j8, PlaybackStateCompat.ACTION_PREPARE_FROM_URI);
        i(14, bArr, j8, PlaybackStateCompat.ACTION_SET_REPEAT_MODE);
        i(15, bArr, j8, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED);
        i(16, bArr, j8, 1048576L);
        i(17, bArr, j8, 16L);
        i(18, bArr, j8, 32L);
        i(19, bArr, j8, 16384L);
        i(22, bArr, j8, 64L);
        i(23, bArr, j8, 536870912L);
        i(24, bArr, j8, 1073741824L);
        i(26, bArr, j8, 128L);
        i(27, bArr, j8, 256L);
        i(28, bArr, j8, 512L);
        i(29, bArr, j8, 1024L);
        i(30, bArr, j8, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        i(31, bArr, j8, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED);
        i(32, bArr, j8, 8388608L);
        i(33, bArr, j8, 67108864L);
        i(34, bArr, j8, -2147483648L);
        if ((4096 & j8) == 0) {
            h(48, bArr);
        }
    }

    public static void h(int i14, byte[] bArr) {
        int i15 = i14 / 8;
        bArr[i15] = (byte) (((byte) ((1 << (i14 % 8)) & 255)) | bArr[i15]);
    }

    public static void i(int i14, byte[] bArr, long j8, long j14) {
        if ((j8 & j14) != 0) {
            h(i14, bArr);
        }
    }

    @Override // bs2.c5
    public final void a(b5 b5Var) {
        f fVar = this.f12804j.get();
        Logger logger = this.f12800f;
        if (fVar == null) {
            logger.warn("FIT capabilities received: Not ready for configuration message.");
            return;
        }
        byte[] bArr = new byte[8];
        try {
            Long lJ = b5Var.j(23, 65535);
            f(lJ != null ? lJ.longValue() : 0L, bArr);
        } catch (Throwable th3) {
            logger.error("Failed to parse FIT connectivity capabilities", th3);
        }
        try {
            Long lJ2 = b5Var.j(26, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            long jLongValue = lJ2 != null ? lJ2.longValue() : 0L;
            i(36, bArr, jLongValue, 1L);
            i(37, bArr, jLongValue, 2L);
            i(38, bArr, jLongValue, 4L);
            i(39, bArr, jLongValue, 8L);
            i(40, bArr, jLongValue, 16L);
            i(41, bArr, jLongValue, 32L);
        } catch (Throwable th4) {
            logger.error("Failed to parse FIT audio prompt capabilities", th4);
        }
        try {
            Short shK = b5Var.k(1);
            long jShortValue = shK != null ? shK.shortValue() : 0L;
            i(42, bArr, jShortValue, 1L);
            i(43, bArr, jShortValue, 2L);
            i(44, bArr, jShortValue, 4L);
            i(45, bArr, jShortValue, 8L);
            i(46, bArr, jShortValue, 16L);
            i(47, bArr, jShortValue, 32L);
        } catch (Throwable th5) {
            logger.error("Failed to parse FIT sports capabilities", th5);
        }
        try {
            Long lJ3 = b5Var.j(25, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            long jLongValue2 = lJ3 != null ? lJ3.longValue() : 0L;
            i(35, bArr, jLongValue2, 1L);
            i(35, bArr, jLongValue2, 2L);
        } catch (Throwable th6) {
            logger.error("Failed to parse FIT segment capabilities", th6);
        }
        h(6, bArr);
        h(8, bArr);
        h(52, bArr);
        m0 m0Var = new m0();
        m0 m0Var2 = new m0();
        u uVar = this.f12799e;
        bt2.c cVar = uVar instanceof bt2.c ? (bt2.c) uVar : null;
        if (cVar != null) {
            m0Var.f105804a = cVar.d(fVar);
            m0Var2.f105804a = cVar.i(fVar);
        }
        ft2.d.b(this.f12802h, new c(m0Var, m0Var2, fVar, bArr, null));
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        c0.d(this.f12802h, "HandshakeHandler closed");
    }

    public final void g(int i14, us2.e.a aVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        rs2.d.f154380a.getClass();
        if (!rs2.d.f154381b || i14 < 150) {
            lg.d.P(byteArrayOutputStream, 113);
        } else {
            lg.d.P(byteArrayOutputStream, 150);
        }
        lg.d.P(byteArrayOutputStream, 65535);
        lg.d.Q(byteArrayOutputStream, 4294967295L);
        u uVar = this.f12799e;
        lg.d.P(byteArrayOutputStream, uVar.getAppVersion());
        lg.d.P(byteArrayOutputStream, 65535);
        lg.d.R(byteArrayOutputStream, uVar.getFriendlyName());
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = "";
        }
        lg.d.R(byteArrayOutputStream, str);
        String str2 = Build.MODEL;
        lg.d.R(byteArrayOutputStream, str2 != null ? str2 : "");
        byteArrayOutputStream.write(1);
        y yVar = y.ACK;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        ft2.d.a(aVar, this.f12802h, yVar, byteArray);
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    public final f j(f fVar, byte[] bArr, boolean z14) {
        Set set;
        Set set2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = bArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = bArr[i14] & UnsignedBytes.MAX_VALUE;
            for (int i16 = 0; i16 < 8; i16++) {
                if (((1 << i16) & i15) != 0) {
                    linkedHashSet.add(Integer.valueOf((i14 * 8) + i16));
                }
            }
        }
        this.f12800f.debug("Configuration received: " + linkedHashSet);
        if (!linkedHashSet.contains(3) || linkedHashSet.contains(4) || linkedHashSet.contains(90)) {
            set = linkedHashSet;
            set2 = set;
        } else {
            Set setF1 = h0.f1(linkedHashSet);
            setF1.add(4);
            set = setF1;
            set2 = linkedHashSet;
        }
        return new f(fVar.f172493a, fVar.f172494b, fVar.f172495c, fVar.f172496d, fVar.f172497e, fVar.f172498f, fVar.f172499g, set, fVar.f172501i, fVar.f172502j, set2, z14, this.f12805k.get(), fVar.f172506n);
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) throws IOException {
        d dVar;
        String str;
        String strK0;
        boolean z14;
        int i15;
        String str2;
        String str3;
        bArr.getClass();
        AtomicReference<byte[]> atomicReference = this.f12805k;
        AtomicReference<f> atomicReference2 = this.f12804j;
        Logger logger = this.f12800f;
        d dVar2 = this.f12802h;
        if (i14 != 5024) {
            if (i14 == 5027) {
                atomicReference.set(bArr);
                ft2.d.a(xVar, dVar2, y.ACK, new byte[]{0});
                return;
            }
            if (i14 != 5050) {
                return;
            }
            f fVar = atomicReference2.get();
            if (fVar == null) {
                logger.warn("5050 Config received: Not ready for configuration message.");
                return;
            }
            if (bArr.length != 0) {
                int length = bArr.length;
                int i16 = (bArr[0] & UnsignedBytes.MAX_VALUE) + 1;
                if (length >= i16) {
                    f fVarJ = j(fVar, p13.s.k(1, i16, bArr), false);
                    ft2.d.a(xVar, dVar2, y.ACK, new byte[0]);
                    Set<Integer> setA = this.f12799e.a(fVarJ);
                    Integer num = (Integer) h0.o0(setA);
                    int iIntValue = ((num != null ? num.intValue() : 0) / 8) + 1;
                    byte[] bArr2 = new byte[iIntValue];
                    Iterator<Integer> it = setA.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = it.next().intValue();
                        int i17 = iIntValue2 / 8;
                        bArr2[i17] = (byte) (((byte) (1 << (iIntValue2 % 8))) | bArr2[i17]);
                    }
                    logger.debug("Sending host configuration: " + h0.M0(setA));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(iIntValue);
                    byteArrayOutputStream.write(bArr2);
                    ft2.d.b(dVar2, new at2.b(this, byteArrayOutputStream, fVarJ, fVar, null));
                    return;
                }
            }
            logger.error("Failed to parse Configuration: not enough data");
            ft2.d.a(xVar, dVar2, y.LENGTH_ERROR, new byte[0]);
            return;
        }
        us2.a aVar = this.f12797c;
        int i18 = this.f12806l + 1;
        this.f12806l = i18;
        if (Build.VERSION.SDK_INT >= 34 && i18 > 2) {
            this.f12803i.O(new GfdiException("device repeatedly sends 5024, possible LENGTH_ERROR mismatch", null, 2, null));
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        try {
            int i19 = byteBufferWrap.getShort() & 65535;
            int i24 = byteBufferWrap.getShort() & 65535;
            dVar = dVar2;
            long j8 = ((long) byteBufferWrap.getInt()) & 4294967295L;
            try {
                int i25 = byteBufferWrap.getShort() & 65535;
                int i26 = byteBufferWrap.getShort() & 65535;
                String strC = f0.C(byteBufferWrap.get() & UnsignedBytes.MAX_VALUE, byteBufferWrap);
                String strC2 = f0.C(byteBufferWrap.get() & UnsignedBytes.MAX_VALUE, byteBufferWrap);
                String strC3 = f0.C(byteBufferWrap.get() & UnsignedBytes.MAX_VALUE, byteBufferWrap);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strC2);
                AtomicReference<f> atomicReference3 = atomicReference2;
                sb3.append(StringUtils.SPACE);
                sb3.append(strC3);
                String string = d53.w.i0(sb3.toString()).toString();
                if (!byteBufferWrap.hasRemaining() || i24 == 2787 || f12795m.contains(Integer.valueOf(i24))) {
                    aVar = aVar;
                    str = null;
                    strK0 = null;
                    z14 = false;
                    i15 = 0;
                } else {
                    boolean z15 = true;
                    if ((byteBufferWrap.get() & UnsignedBytes.MAX_VALUE) != 1) {
                        z15 = false;
                    }
                    if (z15) {
                        byte[] bArr3 = new byte[6];
                        byteBufferWrap.get(bArr3);
                        ArrayList arrayList = new ArrayList(6);
                        int i27 = 0;
                        for (int i28 = 6; i27 < i28; i28 = 6) {
                            arrayList.add(Byte.valueOf(bArr3[i27]));
                            i27++;
                        }
                        Collections.reverse(arrayList);
                        String strK1 = h0.k0(arrayList, ":", null, null, new w0(7), 30);
                        byte[] bArr4 = new byte[6];
                        byteBufferWrap.get(bArr4);
                        ArrayList arrayList2 = new ArrayList(6);
                        int i29 = 0;
                        for (int i30 = 6; i29 < i30; i30 = 6) {
                            arrayList2.add(Byte.valueOf(bArr4[i29]));
                            i29++;
                        }
                        Collections.reverse(arrayList2);
                        strK0 = h0.k0(arrayList2, ":", null, null, new w0(8), 30);
                        str = strK1;
                    } else {
                        str = null;
                        strK0 = null;
                    }
                    i15 = byteBufferWrap.hasRemaining() ? byteBufferWrap.get() & UnsignedBytes.MAX_VALUE : 0;
                    z14 = z15;
                }
                try {
                    logger.debug(n.c("\n                DeviceInformation received: {\n                    protocol version: " + i19 + "\n                    product number: " + i24 + "\n                    unit ID: " + j8 + "\n                    software version: " + i25 + "\n                    max packet size: " + i26 + "\n                    bt friendly name: " + strC + "\n                    device name: " + strC2 + "\n                    model name: " + strC3 + "\n                    is dual pairing: " + z14 + "\n                    ble mac: " + str + "\n                    btc mac: " + strK0 + "\n                    limitation: " + i15 + "\n                }\n            "));
                    try {
                        String str4 = this.f12796b;
                        l0 l0Var = l0.f134950a;
                        if (str != null) {
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            str2 = upperCase;
                        } else {
                            str2 = null;
                        }
                        if (strK0 != null) {
                            String upperCase2 = strK0.toUpperCase(Locale.ROOT);
                            upperCase2.getClass();
                            str3 = upperCase2;
                        } else {
                            str3 = null;
                        }
                        f fVar2 = new f(str4, j8, i24, string, i25, z14, i15, l0Var, str2, str3, l0Var, false, atomicReference.get(), i19);
                        AtomicReference<b> atomicReference4 = this.f12801g;
                        b bVar = b.NOT_STARTED;
                        b bVar2 = b.IN_PROGRESS;
                        while (!atomicReference4.compareAndSet(bVar, bVar2)) {
                            AtomicReference<f> atomicReference5 = atomicReference3;
                            us2.a aVar2 = aVar;
                            if (atomicReference4.get() != bVar) {
                                g(i19, (us2.e.a) xVar);
                            } else {
                                aVar = aVar2;
                                atomicReference3 = atomicReference5;
                            }
                        }
                        logger.info("DeviceInformation message received: Begin Handshake");
                        us2.a aVar3 = aVar;
                        aVar3.e(i26);
                        rs2.d.f154380a.getClass();
                        if (rs2.d.f154381b && i19 >= 150) {
                            aVar3.a();
                        }
                        atomicReference3.set(fVar2);
                        g(i19, (us2.e.a) xVar);
                    } catch (BufferUnderflowException e4) {
                        e = e4;
                        logger.error("Failed to parse Device Info: ".concat(lg.d.x(bArr)), (Throwable) e);
                        ft2.d.a(xVar, dVar, y.LENGTH_ERROR, new byte[0]);
                    }
                } catch (BufferUnderflowException e14) {
                    e = e14;
                }
            } catch (BufferUnderflowException e15) {
                e = e15;
            }
        } catch (BufferUnderflowException e16) {
            e = e16;
            dVar = dVar2;
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
    }

    /* JADX INFO: renamed from: at2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lat2/a$a;", "", "<init>", "()V", "", "PROTOCOL_VERSION_PRE_TRANSACTION_IDS", "I", "PROTOCOL_VERSION_WITH_TRANSACTION_IDS", "DEFAULT_PRODUCT_NUMBER", "", "DEFAULT_UNIT_ID", "J", "DEFAULT_MAX_PACKET_SIZE", "VECTOR_3_PRODUCT_NUMBER", "", "SPEED_SENSOR_2_PRODUCT_NUMBERS", "Ljava/util/Set;", "AUDIO_PROMPTS_SUPPORTED_FIELD_NUM", "SEGMENTS_SUPPORTED_FIELD_NUM", "AUDIO_PROMPT_LAP", "AUDIO_PROMPT_PACE_SPEED", "AUDIO_PROMPT_HEART_RATE", "AUDIO_PROMPT_POWER", "AUDIO_PROMPT_NAVIGATION", "AUDIO_PROMPT_CADENCE", "SEGMENT_CAPABILITY_SEGMENTS", "SEGMENT_CAPABILITY_SEGMENT_FILES", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0181a {
        public /* synthetic */ C0181a(j jVar) {
            this();
        }

        private C0181a() {
        }
    }
}
