package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.fit.FitRuntimeException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class b7 {
    public static boolean G = false;
    public int D;
    public int E;
    public final byte[] F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f19690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f19691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f19692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bk f19696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19697i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19705q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f19708t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InputStream f19710v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f19713y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fk[] f19698j = new fk[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<Short, e7> f19699k = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<Short, HashMap<Short, yc>> f19700l = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19701m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f19706r = new byte[255];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f19709u = new c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19712x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f19714z = 0;
    public final ArrayList<hk> A = new ArrayList<>();
    public final ArrayList<gk> B = new ArrayList<>();
    public final ArrayList<j7> C = new ArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19711w = true;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19716b;

        static {
            int[] iArr = new int[e.values().length];
            f19716b = iArr;
            try {
                iArr[e.FILE_HDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19716b[e.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19716b[e.RESERVED1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19716b[e.ARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19716b[e.MESG_NUM_0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19716b[e.MESG_NUM_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19716b[e.NUM_FIELDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19716b[e.FIELD_NUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19716b[e.FIELD_SIZE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19716b[e.FIELD_TYPE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19716b[e.NUM_DEV_FIELDS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19716b[e.DEV_FIELD_NUM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19716b[e.DEV_FIELD_SIZE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19716b[e.DEV_FIELD_DEV_ID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19716b[e.FIELD_DATA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19716b[e.DEV_FIELD_DATA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[d.values().length];
            f19715a = iArr2;
            try {
                iArr2[d.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19715a[d.MESG.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f19715a[d.MESG_DEF.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19715a[d.END_OF_FILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f19719c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f19720d = 0;

        public b(b7 b7Var, int i14, int i15) {
            this.f19717a = i14;
            this.f19718b = i15;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<b> f19721a = new ArrayList<>();

        public c() {
        }
    }

    public enum d {
        CONTINUE,
        MESG,
        MESG_DEF,
        END_OF_FILE
    }

    public enum e {
        FILE_HDR,
        RECORD,
        RESERVED1,
        ARCH,
        MESG_NUM_0,
        MESG_NUM_1,
        NUM_FIELDS,
        FIELD_NUM,
        FIELD_SIZE,
        FIELD_TYPE,
        NUM_DEV_FIELDS,
        DEV_FIELD_NUM,
        DEV_FIELD_SIZE,
        DEV_FIELD_DEV_ID,
        FIELD_DATA,
        DEV_FIELD_DATA,
        FILE_CRC_HIGH
    }

    public b7() {
        d();
        this.D = 0;
        this.E = 0;
        this.F = new byte[512];
        int i14 = sd.f20481a;
    }

    public final void a(int i14, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            for (int i17 = 0; i17 < i14 / 2; i17++) {
                int i18 = i16 * i14;
                int i19 = i18 + i17;
                byte[] bArr = this.f19706r;
                byte b14 = bArr[i19];
                int i24 = ((i18 + i14) - i17) - 1;
                bArr[i19] = bArr[i24];
                bArr[i24] = b14;
            }
        }
    }

    public final boolean b(FileInputStream fileInputStream) {
        boolean z14 = true;
        while (true) {
            try {
                int i14 = this.E;
                int i15 = this.D;
                byte[] bArr = this.F;
                if (i14 < i15) {
                    int i16 = a.f19715a[e(bArr[i14]).ordinal()];
                    if (i16 != 1 && i16 != 2 && i16 != 3) {
                        if (i16 != 4) {
                            z14 = false;
                        } else {
                            d();
                        }
                    }
                    this.E++;
                } else {
                    this.E = 0;
                    int i17 = fileInputStream.read(bArr, 0, bArr.length);
                    this.D = i17;
                    if (i17 < 0) {
                        return z14;
                    }
                }
            } catch (FitRuntimeException unused) {
                if (this.f19712x) {
                    d();
                }
                this.D = 0;
                this.E = 0;
                return false;
            } catch (IOException e4) {
                throw new FitRuntimeException(e4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    public final void c(rc rcVar, ArrayList<vc> arrayList) {
        int i14;
        int i15;
        b bVar;
        Long lValueOf;
        double d14;
        b bVar2;
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            vc vcVar = arrayList.get(i16);
            int i18 = vcVar.f20614a;
            double d15 = vcVar.f20617d;
            double d16 = vcVar.f20618e;
            int i19 = vcVar.f20616c;
            if (i18 != 255) {
                rc rcVarA = wb.a(this.f19696h.f19751a, i18);
                ArrayList<vc> arrayList2 = rcVarA.f20459h;
                int i24 = rcVarA.f20454c;
                pw pwVarH = rcVarA.h(this.f19696h.f(i18));
                i14 = i16;
                int i25 = rcVarA.f20455d;
                i15 = i17;
                boolean z14 = i25 == 1 || i25 == 131 || i25 == 133 || i25 == 142;
                rcVar.getClass();
                boolean z15 = z14;
                int i26 = i15;
                long j8 = 0;
                int i27 = 0;
                int i28 = 0;
                while (true) {
                    bVar = null;
                    if (i28 >= i19) {
                        if (z15) {
                            long j14 = 1 << (i19 - 1);
                            if ((j8 & j14) != 0) {
                                j8 = (-j14) + (j8 & (j14 - 1));
                            }
                        }
                        lValueOf = Long.valueOf(j8);
                        break;
                    }
                    i27++;
                    int i29 = i28;
                    Object obj = i27 >= rcVar.f20480a.size() ? null : rcVar.f20480a.get(i27);
                    if (obj == null || !(obj instanceof Number)) {
                        d15 = d15;
                        lValueOf = null;
                        break;
                    }
                    long jLongValue = ((Number) obj).longValue() >> i26;
                    int[] iArr = sd.f20499s;
                    int i30 = rcVar.f20455d;
                    int i34 = (iArr[i30 & 31] * 8) - i26;
                    i26 -= iArr[i30 & 31] * 8;
                    if (i34 > 0) {
                        int i35 = i19 - i29;
                        if (i34 > i35) {
                            i34 = i35;
                        }
                        j8 |= (jLongValue & ((1 << i34) - 1)) << i29;
                        i28 = i29 + i34;
                        i26 = 0;
                    } else {
                        i28 = i29;
                    }
                }
                if (lValueOf == null) {
                    return;
                }
                if (vcVar.f20615b) {
                    int i36 = this.f19696h.f19751a;
                    long jLongValue2 = lValueOf.longValue();
                    c cVar = this.f19709u;
                    ArrayList<b> arrayList3 = cVar.f19721a;
                    int i37 = 0;
                    while (true) {
                        if (i37 >= arrayList3.size()) {
                            d14 = d16;
                            break;
                        }
                        b bVar3 = arrayList3.get(i37);
                        d14 = d16;
                        if (bVar3.f19717a == i36 && bVar3.f19718b == i18) {
                            bVar = bVar3;
                            break;
                        } else {
                            i37++;
                            bVar = bVar3;
                            d16 = d14;
                        }
                    }
                    if (i37 == arrayList3.size()) {
                        bVar2 = new b(b7.this, i36, i18);
                        arrayList3.add(bVar2);
                    } else {
                        bVar2 = bVar;
                    }
                    long j15 = bVar2.f19720d + (((1 << i19) - 1) & (jLongValue2 - bVar2.f19719c));
                    bVar2.f19720d = j15;
                    bVar2.f19719c = jLongValue2;
                    lValueOf = Long.valueOf(j15);
                } else {
                    d14 = d16;
                }
                if (arrayList2.size() == 1) {
                    Double dValueOf = Double.valueOf((((lValueOf.longValue() / d15) - d14) + arrayList2.get(0).f20618e) * arrayList2.get(0).f20617d);
                    if (this.f19696h.m(i24)) {
                        this.f19696h.g(i24).a(dValueOf);
                    } else {
                        rcVarA.a(dValueOf);
                        this.f19696h.e(rcVarA);
                    }
                } else if (arrayList2.size() > 1) {
                    int i38 = 0;
                    while (i38 < i19) {
                        int[] iArr2 = sd.f20499s;
                        long j16 = (1 << iArr2[rcVarA.f20455d & 31]) - 1;
                        if (this.f19696h.m(i24)) {
                            this.f19696h.g(i24).b(Long.valueOf(j16 & lValueOf.longValue()));
                        } else {
                            rcVarA.b(Long.valueOf(j16 & lValueOf.longValue()));
                            this.f19696h.e(rcVarA);
                        }
                        lValueOf = Long.valueOf(lValueOf.longValue() >>> iArr2[rcVarA.f20455d & 31]);
                        i38 += iArr2[rcVarA.f20455d & 31];
                    }
                } else {
                    Double dValueOf2 = pwVarH == null ? Double.valueOf((((lValueOf.longValue() / d15) - d14) + rcVarA.f20457f) * rcVarA.f20456e) : Double.valueOf((((lValueOf.longValue() / d15) - d14) + pwVarH.f20412c) * pwVarH.f20411b);
                    if (this.f19696h.m(i24)) {
                        this.f19696h.g(i24).a(dValueOf2);
                    } else {
                        rcVarA.a(dValueOf2);
                        this.f19696h.e(rcVarA);
                    }
                }
            } else {
                i14 = i16;
                i15 = i17;
            }
            i16 = i14 + 1;
            i17 = i15 + i19;
        }
    }

    public final void d() {
        if (this.f19711w) {
            this.f19694f = 3L;
            this.f19691c = (byte) 0;
            this.f19695g = 0;
            this.f19690b = e.FILE_HDR;
            this.f19707s = 0;
            G = false;
            this.f19712x = false;
            this.f19713y = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:107:0x0203  */
    /* JADX WARN: Code duplicated, block: B:108:0x0206  */
    /* JADX WARN: Code duplicated, block: B:109:0x0209  */
    /* JADX WARN: Code duplicated, block: B:110:0x020c  */
    /* JADX WARN: Code duplicated, block: B:111:0x020f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0212  */
    /* JADX WARN: Code duplicated, block: B:113:0x0215  */
    /* JADX WARN: Code duplicated, block: B:114:0x0218  */
    /* JADX WARN: Code duplicated, block: B:115:0x021b  */
    /* JADX WARN: Code duplicated, block: B:116:0x021e  */
    /* JADX WARN: Code duplicated, block: B:120:0x023c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0242  */
    /* JADX WARN: Code duplicated, block: B:123:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:128:0x0256  */
    /* JADX WARN: Code duplicated, block: B:130:0x025c  */
    /* JADX WARN: Code duplicated, block: B:131:0x025e  */
    /* JADX WARN: Code duplicated, block: B:133:0x026a  */
    /* JADX WARN: Code duplicated, block: B:136:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0283  */
    /* JADX WARN: Code duplicated, block: B:141:0x028b  */
    /* JADX WARN: Code duplicated, block: B:142:0x028d  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0318  */
    /* JADX WARN: Code duplicated, block: B:172:0x032e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0339  */
    /* JADX WARN: Code duplicated, block: B:177:0x0350  */
    /* JADX WARN: Code duplicated, block: B:179:0x0360  */
    /* JADX WARN: Code duplicated, block: B:180:0x037a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0392  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:187:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:337:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec  */
    public final d e(byte b14) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iF;
        bk bkVar;
        int[] iArr;
        int i19;
        int i24;
        rc rcVarA;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Iterator<rc> it;
        int i29;
        c cVar;
        ArrayList<b> arrayList;
        b bVar;
        int i30;
        Object objJ;
        Long lValueOf;
        int i34;
        int i35;
        zn znVar;
        int i36;
        g7 g7Var;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        ArrayList<g7> arrayList2;
        short s8;
        h7 h7Var;
        int i46 = sd.f20481a;
        long j8 = this.f19694f;
        if (j8 > 0 && j8 != Long.MAX_VALUE) {
            this.f19695g = q4.a(b14, this.f19695g);
            long j14 = this.f19694f - 1;
            this.f19694f = j14;
            if (j14 == 1 && this.f19690b.ordinal() > e.FILE_HDR.ordinal()) {
                if (this.f19690b == e.RECORD) {
                    return d.CONTINUE;
                }
                b71.i.m(this.f19714z, "FIT decode error: Decoder not in correct state after last data byte in file.  Check message definitions. Error at byte: ");
                return null;
            }
            if (this.f19694f == 0 && this.f19690b.ordinal() > e.FILE_HDR.ordinal()) {
                if (this.f19695g == 0) {
                    return d.END_OF_FILE;
                }
                b71.i.m(this.f19714z, "FIT decode error: File CRC failed. Error at byte: ");
                return null;
            }
        }
        int i47 = a.f19716b[this.f19690b.ordinal()];
        byte[] bArr = this.f19706r;
        int i48 = 0;
        fk[] fkVarArr = this.f19698j;
        switch (i47) {
            case 1:
                byte b15 = this.f19691c;
                this.f19691c = (byte) (b15 + 1);
                if (b15 != 0) {
                    if (b15 == 1) {
                        int i49 = b14 & 240;
                        int i54 = sd.f20481a;
                        if (i49 > (i54 << 4)) {
                            StringBuilder sb3 = new StringBuilder("FIT decode error: Protocol version ");
                            sb3.append(i49 >> 4);
                            sb3.append(".");
                            ds.e0.m(b14 & Ascii.SI, i54, " not supported.  Must be ", ".", sb3);
                            this.f19713y = am.j.q(sb3, sd.f20482b, " or earlier.");
                        }
                    } else if (b15 != 13) {
                        switch (b15) {
                            case 4:
                                this.f19693e = b14 & UnsignedBytes.MAX_VALUE;
                                break;
                            case 5:
                                this.f19693e |= ((long) (b14 & UnsignedBytes.MAX_VALUE)) << 8;
                                break;
                            case 6:
                                this.f19693e |= ((long) (b14 & UnsignedBytes.MAX_VALUE)) << 16;
                                break;
                            case 7:
                                long j15 = this.f19693e | (((long) (b14 & UnsignedBytes.MAX_VALUE)) << 24);
                                this.f19693e = j15;
                                if (j15 == 0 && (!G || !this.f19712x)) {
                                    G = true;
                                    this.f19712x = true;
                                    this.f19713y = "FIT decode error: File Size is 0. Error at byte: " + this.f19714z;
                                }
                                break;
                            case 8:
                                if (b14 != 46) {
                                    this.f19713y = "FIT decode error: File is not FIT format.  Check file header data type. Error at byte: " + this.f19714z;
                                }
                                break;
                            case 9:
                                if (b14 != 70) {
                                    this.f19713y = "FIT decode error: File is not FIT format.  Check file header data type. Error at byte: " + this.f19714z;
                                }
                                break;
                            case 10:
                                if (b14 != 73) {
                                    this.f19713y = "FIT decode error: File is not FIT format.  Check file header data type. Error at byte: " + this.f19714z;
                                }
                                break;
                            case 11:
                                if (b14 != 84) {
                                    this.f19713y = "FIT decode error: File is not FIT format.  Check file header data type. Error at byte: " + this.f19714z;
                                }
                                String str = this.f19713y;
                                if (str != null && this.f19692d == 12) {
                                    throw new FitRuntimeException(str);
                                }
                                break;
                        }
                    } else {
                        String str2 = this.f19713y;
                        if (str2 != null) {
                            this.E++;
                            throw new FitRuntimeException(str2);
                        }
                    }
                } else if (b14 == 0) {
                    this.f19694f++;
                    this.f19691c = (byte) 0;
                    this.f19713y = null;
                    this.f19695g = 0;
                } else if (b14 < 12) {
                    this.f19713y = "FIT decode error: Header size is invalid. Error at byte: " + this.f19714z;
                } else {
                    this.f19692d = b14;
                    this.f19694f = b14 + 2;
                }
                byte b16 = this.f19691c;
                byte b17 = this.f19692d;
                if (b16 == b17 && b17 != 0) {
                    if (G && this.f19712x) {
                        this.f19694f = Long.MAX_VALUE;
                    } else {
                        this.f19694f = this.f19693e + 2;
                    }
                    this.f19690b = e.RECORD;
                }
                break;
            case 2:
                this.f19703o = 0;
                this.f19705q = 0;
                if (this.f19694f <= 1) {
                    this.f19690b = e.FILE_CRC_HIGH;
                } else if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    int i55 = b14 & Ascii.SI;
                    this.f19697i = i55;
                    if ((b14 & SignedBytes.MAX_POWER_OF_TWO) == 0) {
                        fk fkVar = fkVarArr[i55];
                        if (fkVar == null) {
                            b71.i.r(". Error at byte: ", this.f19697i, this.f19714z, "FIT decode error: Missing message definition for local message number ");
                            return null;
                        }
                        bk bkVarB = wb.b(fkVar.f20133a);
                        this.f19696h = bkVarB;
                        int i56 = this.f19697i;
                        bkVarB.f19752b = i56;
                        this.f19701m++;
                        if (fkVarArr[i56].f20136d.size() == 0) {
                            if (fkVarArr[this.f19697i].a() <= 0) {
                                return d.MESG;
                            }
                            this.f19690b = e.DEV_FIELD_DATA;
                        } else {
                            this.f19690b = e.FIELD_DATA;
                        }
                    } else {
                        fkVarArr[i55] = new fk();
                        int i57 = this.f19697i;
                        fkVarArr[i57].f20134b = i57;
                        this.f19689a = false;
                        if ((b14 & 32) != 0) {
                            this.f19689a = true;
                        }
                        this.f19690b = e.RESERVED1;
                    }
                } else {
                    int i58 = b14 & Ascii.US;
                    int i59 = (b14 & 96) >> 5;
                    this.f19697i = i59;
                    fk fkVar2 = fkVarArr[i59];
                    if (fkVar2 == null) {
                        b71.i.r(". Error at byte: ", this.f19697i, this.f19714z, "FIT decode error: Missing message definition for local message number ");
                        return null;
                    }
                    rc rcVarA2 = wb.a(fkVar2.f20133a, 253);
                    long j16 = this.f19708t + ((long) ((i58 - this.f19707s) & 31));
                    this.f19708t = j16;
                    this.f19707s = i58;
                    rcVarA2.m(Long.valueOf(j16), null);
                    bk bkVarB2 = wb.b(fkVarArr[this.f19697i].f20133a);
                    this.f19696h = bkVarB2;
                    bkVarB2.f19752b = this.f19697i;
                    this.f19701m++;
                    bkVarB2.e(rcVarA2);
                    if (fkVarArr[this.f19697i].f20136d.size() == 0) {
                        if (fkVarArr[this.f19697i].a() <= 0) {
                            return d.MESG;
                        }
                        this.f19690b = e.DEV_FIELD_DATA;
                    } else {
                        this.f19690b = e.FIELD_DATA;
                    }
                }
                break;
            case 3:
                this.f19690b = e.ARCH;
                break;
            case 4:
                fkVarArr[this.f19697i].f20135c = b14 & UnsignedBytes.MAX_VALUE;
                this.f19690b = e.MESG_NUM_0;
                break;
            case 5:
                fkVarArr[this.f19697i].f20133a = b14 & UnsignedBytes.MAX_VALUE;
                this.f19690b = e.MESG_NUM_1;
                break;
            case 6:
                fk fkVar3 = fkVarArr[this.f19697i];
                int i64 = ((b14 & UnsignedBytes.MAX_VALUE) << 8) | fkVar3.f20133a;
                fkVar3.f20133a = i64;
                int i65 = fkVar3.f20135c;
                if (i65 == 1) {
                    fkVar3.f20133a = ((i64 & 255) << 8) | (i64 >> 8);
                } else if (i65 != 0) {
                    b71.i.r(" not supported. Error at byte: ", fkVarArr[this.f19697i].f20135c, this.f19714z, "FIT decode error: Endian ");
                    return null;
                }
                this.f19690b = e.NUM_FIELDS;
                break;
            case 7:
                int i66 = b14 & UnsignedBytes.MAX_VALUE;
                this.f19702n = i66;
                if (i66 == 0) {
                    if (!this.f19689a) {
                        this.f19690b = e.RECORD;
                        return d.MESG_DEF;
                    }
                    this.f19690b = e.NUM_DEV_FIELDS;
                } else {
                    this.f19690b = e.FIELD_NUM;
                }
                break;
            case 8:
                fkVarArr[this.f19697i].f20136d.add(new wc());
                fkVarArr[this.f19697i].f20136d.get(this.f19703o).f20643a = b14 & UnsignedBytes.MAX_VALUE;
                this.f19690b = e.FIELD_SIZE;
                break;
            case 9:
                fkVarArr[this.f19697i].f20136d.get(this.f19703o).f20644b = b14 & UnsignedBytes.MAX_VALUE;
                this.f19690b = e.FIELD_TYPE;
                break;
            case 10:
                fkVarArr[this.f19697i].f20136d.get(this.f19703o).f20645c = b14 & UnsignedBytes.MAX_VALUE;
                int i67 = this.f19703o + 1;
                this.f19703o = i67;
                if (i67 >= this.f19702n) {
                    if (!this.f19689a) {
                        this.f19690b = e.RECORD;
                        return d.MESG_DEF;
                    }
                    this.f19690b = e.NUM_DEV_FIELDS;
                } else {
                    this.f19690b = e.FIELD_NUM;
                }
                break;
            case 11:
                this.f19703o = 0;
                int i68 = b14 & UnsignedBytes.MAX_VALUE;
                this.f19702n = i68;
                if (i68 == 0) {
                    this.f19690b = e.RECORD;
                    return d.MESG_DEF;
                }
                this.f19690b = e.DEV_FIELD_NUM;
                break;
                break;
            case 12:
                fkVarArr[this.f19697i].f20137e.add(new h7());
                fkVarArr[this.f19697i].f20137e.get(this.f19703o).f20182e = (short) (b14 & UnsignedBytes.MAX_VALUE);
                this.f19690b = e.DEV_FIELD_SIZE;
                break;
            case 13:
                fkVarArr[this.f19697i].f20137e.get(this.f19703o).f20180c = b14 & UnsignedBytes.MAX_VALUE;
                this.f19690b = e.DEV_FIELD_DEV_ID;
                break;
            case 14:
                h7 h7Var2 = fkVarArr[this.f19697i].f20137e.get(this.f19703o);
                short s14 = b14;
                Short shValueOf = Short.valueOf(s14);
                HashMap<Short, HashMap<Short, yc>> map = this.f19700l;
                if (map.containsKey(shValueOf)) {
                    h7Var2.f20179b = this.f19699k.get(Short.valueOf(s14));
                    if (map.get(Short.valueOf(s14)).containsKey(Short.valueOf(h7Var2.f20182e))) {
                        h7Var2.c(map.get(Short.valueOf(s14)).get(Short.valueOf(h7Var2.f20182e)));
                    }
                }
                int i69 = this.f19703o + 1;
                this.f19703o = i69;
                if (i69 >= this.f19702n) {
                    this.f19690b = e.RECORD;
                    return d.MESG_DEF;
                }
                this.f19690b = e.DEV_FIELD_NUM;
                break;
                break;
            case 15:
                wc wcVar = fkVarArr[this.f19697i].f20136d.get(this.f19703o);
                while (this.f19705q == 0) {
                    this.f19704p = 0;
                    int i74 = wcVar.f20644b;
                    this.f19705q = i74;
                    if (i74 == 0) {
                        if (this.f19703o + 1 >= fkVarArr[this.f19697i].f20136d.size()) {
                            int i75 = this.f19704p;
                            this.f19704p = i75 + 1;
                            bArr[i75] = b14;
                            i14 = this.f19705q - 1;
                            this.f19705q = i14;
                            if (i14 == 0) {
                                i15 = wcVar.f20645c;
                                i16 = i15 & 31;
                                if (i16 < 17) {
                                    iArr = sd.f20499s;
                                    i19 = iArr[i16];
                                    i24 = wcVar.f20644b / i19;
                                    if ((i15 & 128) != 0 && (fkVarArr[this.f19697i].f20135c & 1) != 1) {
                                        a(i19, i24);
                                    }
                                    rcVarA = wb.a(this.f19696h.f19751a, wcVar.f20643a);
                                    if (rcVarA.f20453b.equals(PrivacyUpdateRequestError.UNKNOWN)) {
                                        int i76 = wcVar.f20643a;
                                        i35 = wcVar.f20645c;
                                        if (i35 != 1) {
                                            znVar = zn.SINT8;
                                        } else if (i35 != 2) {
                                            znVar = zn.UINT8;
                                        } else if (i35 != 7) {
                                            znVar = zn.STRING;
                                        } else if (i35 != 10) {
                                            znVar = zn.UINT8Z;
                                        } else if (i35 != 136) {
                                            znVar = zn.FLOAT32;
                                        } else if (i35 != 137) {
                                            znVar = zn.FLOAT64;
                                        } else if (i35 != 139) {
                                            znVar = zn.UINT16Z;
                                        } else if (i35 != 140) {
                                            switch (i35) {
                                                case 131:
                                                    znVar = zn.SINT16;
                                                    break;
                                                case 132:
                                                    znVar = zn.UINT16;
                                                    break;
                                                case 133:
                                                    znVar = zn.SINT32;
                                                    break;
                                                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                                    znVar = zn.UINT32;
                                                    break;
                                                default:
                                                    switch (i35) {
                                                        case 142:
                                                            znVar = zn.SINT64;
                                                            break;
                                                        case 143:
                                                            znVar = zn.UINT64;
                                                            break;
                                                        case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                                            znVar = zn.UINT64Z;
                                                            break;
                                                        default:
                                                            znVar = zn.ENUM;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            znVar = zn.UINT32Z;
                                        }
                                        rcVarA = new rc(PrivacyUpdateRequestError.UNKNOWN, i76, i35, 1.0d, 0.0d, "", false, znVar);
                                    }
                                    i25 = rcVarA.f20454c;
                                    i26 = rcVarA.f20455d;
                                    i27 = wcVar.f20645c;
                                    if (i26 == i27) {
                                        rcVarA.l(new ByteArrayInputStream(bArr), wcVar.f20644b);
                                    } else {
                                        i34 = iArr[i26 & 31];
                                        if (i19 < i34) {
                                            rcVarA.f20455d = i27;
                                        } else if (i19 == i34) {
                                        }
                                        rcVarA.l(new ByteArrayInputStream(bArr), wcVar.f20644b);
                                    }
                                    if (wcVar.f20643a == 253) {
                                        objJ = rcVarA.j(null);
                                        if (objJ == null) {
                                            lValueOf = null;
                                        } else {
                                            lValueOf = Long.valueOf(((Number) objJ).longValue());
                                        }
                                        if (lValueOf != null) {
                                            long jLongValue = lValueOf.longValue();
                                            this.f19708t = jLongValue;
                                            this.f19707s = (int) (jLongValue & 31);
                                        }
                                    }
                                    if (rcVarA.f20458g) {
                                        for (i28 = 0; i28 < rcVarA.f20480a.size(); i28++) {
                                            if (i28 >= rcVarA.f20480a.size()) {
                                                obj = null;
                                            } else {
                                                obj = rcVarA.f20480a.get(i28);
                                            }
                                            long jLongValue2 = ((Number) obj).longValue();
                                            it = this.f19696h.f19753c.iterator();
                                            while (it.hasNext()) {
                                                for (vc vcVar : it.next().f20459h) {
                                                    if (vcVar.f20614a != i25 && vcVar.f20615b) {
                                                        jLongValue2 = (long) ((((jLongValue2 / rcVarA.f20456e) - rcVarA.f20457f) + vcVar.f20618e) * vcVar.f20617d);
                                                    }
                                                }
                                            }
                                            i29 = this.f19696h.f19751a;
                                            cVar = this.f19709u;
                                            arrayList = cVar.f19721a;
                                            bVar = null;
                                            for (i30 = 0; i30 < arrayList.size(); i30++) {
                                                bVar = arrayList.get(i30);
                                                if (bVar.f19717a != i29 && bVar.f19718b == i25) {
                                                    if (i30 == arrayList.size()) {
                                                        bVar = new b(b7.this, i29, i25);
                                                        arrayList.add(bVar);
                                                    }
                                                    bVar.f19720d = jLongValue2;
                                                    bVar.f19719c = jLongValue2;
                                                }
                                            }
                                            if (i30 == arrayList.size()) {
                                                bVar = new b(b7.this, i29, i25);
                                                arrayList.add(bVar);
                                            }
                                            bVar.f19720d = jLongValue2;
                                            bVar.f19719c = jLongValue2;
                                        }
                                    }
                                    if (rcVarA.f20480a.size() > 0) {
                                        this.f19696h.e(rcVarA);
                                    }
                                }
                                i17 = this.f19703o + 1;
                                this.f19703o = i17;
                                if (i17 >= fkVarArr[this.f19697i].f20136d.size()) {
                                    for (i18 = 0; i18 < this.f19696h.f19753c.size(); i18++) {
                                        bk bkVar2 = this.f19696h;
                                        iF = bkVar2.f(bkVar2.f19753c.get(i18).f20454c);
                                        bkVar = this.f19696h;
                                        if (iF == 65535) {
                                            if (bkVar.f19753c.get(i18).f20459h.size() > 0) {
                                                c(this.f19696h.f19753c.get(i18), this.f19696h.f19753c.get(i18).f20459h);
                                            }
                                        } else if (bkVar.f19753c.get(i18).f20460i.get(iF).f20414e.size() > 0) {
                                            c(this.f19696h.f19753c.get(i18), this.f19696h.f19753c.get(i18).f20460i.get(iF).f20414e);
                                        }
                                    }
                                    if (fkVarArr[this.f19697i].a() > 0) {
                                        this.f19690b = e.RECORD;
                                        return d.MESG;
                                    }
                                    this.f19703o = 0;
                                    this.f19705q = 0;
                                    this.f19690b = e.DEV_FIELD_DATA;
                                }
                            }
                        } else {
                            ArrayList<wc> arrayList3 = fkVarArr[this.f19697i].f20136d;
                            int i77 = this.f19703o + 1;
                            this.f19703o = i77;
                            wcVar = arrayList3.get(i77);
                        }
                        break;
                    }
                }
                int i78 = this.f19704p;
                this.f19704p = i78 + 1;
                bArr[i78] = b14;
                i14 = this.f19705q - 1;
                this.f19705q = i14;
                if (i14 == 0) {
                    i15 = wcVar.f20645c;
                    i16 = i15 & 31;
                    if (i16 < 17) {
                        iArr = sd.f20499s;
                        i19 = iArr[i16];
                        i24 = wcVar.f20644b / i19;
                        if ((i15 & 128) != 0) {
                            a(i19, i24);
                        }
                        rcVarA = wb.a(this.f19696h.f19751a, wcVar.f20643a);
                        if (rcVarA.f20453b.equals(PrivacyUpdateRequestError.UNKNOWN)) {
                            int i79 = wcVar.f20643a;
                            i35 = wcVar.f20645c;
                            if (i35 != 1) {
                                znVar = zn.SINT8;
                            } else if (i35 != 2) {
                                znVar = zn.UINT8;
                            } else if (i35 != 7) {
                                znVar = zn.STRING;
                            } else if (i35 != 10) {
                                znVar = zn.UINT8Z;
                            } else if (i35 != 136) {
                                znVar = zn.FLOAT32;
                            } else if (i35 != 137) {
                                znVar = zn.FLOAT64;
                            } else if (i35 != 139) {
                                znVar = zn.UINT16Z;
                            } else if (i35 != 140) {
                                switch (i35) {
                                    case 131:
                                        znVar = zn.SINT16;
                                        break;
                                    case 132:
                                        znVar = zn.UINT16;
                                        break;
                                    case 133:
                                        znVar = zn.SINT32;
                                        break;
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                        znVar = zn.UINT32;
                                        break;
                                    default:
                                        switch (i35) {
                                            case 142:
                                                znVar = zn.SINT64;
                                                break;
                                            case 143:
                                                znVar = zn.UINT64;
                                                break;
                                            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                                znVar = zn.UINT64Z;
                                                break;
                                            default:
                                                znVar = zn.ENUM;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                znVar = zn.UINT32Z;
                            }
                            rcVarA = new rc(PrivacyUpdateRequestError.UNKNOWN, i79, i35, 1.0d, 0.0d, "", false, znVar);
                        }
                        i25 = rcVarA.f20454c;
                        i26 = rcVarA.f20455d;
                        i27 = wcVar.f20645c;
                        if (i26 == i27) {
                            rcVarA.l(new ByteArrayInputStream(bArr), wcVar.f20644b);
                        } else {
                            i34 = iArr[i26 & 31];
                            if (i19 < i34) {
                                rcVarA.f20455d = i27;
                            } else if (i19 == i34) {
                            }
                            rcVarA.l(new ByteArrayInputStream(bArr), wcVar.f20644b);
                        }
                        if (wcVar.f20643a == 253) {
                            objJ = rcVarA.j(null);
                            if (objJ == null) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(((Number) objJ).longValue());
                            }
                            if (lValueOf != null) {
                                long jLongValue3 = lValueOf.longValue();
                                this.f19708t = jLongValue3;
                                this.f19707s = (int) (jLongValue3 & 31);
                            }
                        }
                        if (rcVarA.f20458g) {
                            while (i28 < rcVarA.f20480a.size()) {
                                if (i28 >= rcVarA.f20480a.size()) {
                                    obj = null;
                                } else {
                                    obj = rcVarA.f20480a.get(i28);
                                }
                                long jLongValue4 = ((Number) obj).longValue();
                                it = this.f19696h.f19753c.iterator();
                                while (it.hasNext()) {
                                    while (r9.hasNext()) {
                                        if (vcVar.f20614a != i25) {
                                        }
                                    }
                                }
                                i29 = this.f19696h.f19751a;
                                cVar = this.f19709u;
                                arrayList = cVar.f19721a;
                                bVar = null;
                                while (i30 < arrayList.size()) {
                                    bVar = arrayList.get(i30);
                                    if (bVar.f19717a != i29) {
                                    }
                                }
                                if (i30 == arrayList.size()) {
                                    bVar = new b(b7.this, i29, i25);
                                    arrayList.add(bVar);
                                }
                                bVar.f19720d = jLongValue4;
                                bVar.f19719c = jLongValue4;
                            }
                        }
                        if (rcVarA.f20480a.size() > 0) {
                            this.f19696h.e(rcVarA);
                        }
                    }
                    i17 = this.f19703o + 1;
                    this.f19703o = i17;
                    if (i17 >= fkVarArr[this.f19697i].f20136d.size()) {
                        while (i18 < this.f19696h.f19753c.size()) {
                            bk bkVar3 = this.f19696h;
                            iF = bkVar3.f(bkVar3.f19753c.get(i18).f20454c);
                            bkVar = this.f19696h;
                            if (iF == 65535) {
                                if (bkVar.f19753c.get(i18).f20459h.size() > 0) {
                                    c(this.f19696h.f19753c.get(i18), this.f19696h.f19753c.get(i18).f20459h);
                                }
                            } else if (bkVar.f19753c.get(i18).f20460i.get(iF).f20414e.size() > 0) {
                                c(this.f19696h.f19753c.get(i18), this.f19696h.f19753c.get(i18).f20460i.get(iF).f20414e);
                            }
                        }
                        if (fkVarArr[this.f19697i].a() > 0) {
                            this.f19690b = e.RECORD;
                            return d.MESG;
                        }
                        this.f19703o = 0;
                        this.f19705q = 0;
                        this.f19690b = e.DEV_FIELD_DATA;
                    }
                }
                break;
            case 16:
                fk fkVar4 = fkVarArr[this.f19697i];
                h7 h7Var3 = fkVar4.f20137e.get(this.f19703o);
                while (this.f19705q == 0) {
                    this.f19704p = 0;
                    int i84 = h7Var3.f20180c;
                    this.f19705q = i84;
                    if (i84 == 0) {
                        if (this.f19703o + 1 >= fkVarArr[this.f19697i].f20137e.size()) {
                            int i85 = this.f19704p;
                            this.f19704p = i85 + 1;
                            bArr[i85] = b14;
                            i36 = this.f19705q - 1;
                            this.f19705q = i36;
                            if (i36 == 0) {
                                g7Var = new g7(h7Var3);
                                i37 = h7Var3.f20181d;
                                i38 = i37 & 31;
                                if (i38 < 17) {
                                    i44 = sd.f20499s[i38];
                                    i45 = h7Var3.f20180c / i44;
                                    if ((i37 & 128) != 0 && (fkVar4.f20135c & 1) != 1) {
                                        a(i44, i45);
                                    }
                                    g7Var.l(new ByteArrayInputStream(bArr), h7Var3.f20180c);
                                    if (g7Var.f20480a.size() > 0) {
                                        arrayList2 = this.f19696h.f19754d;
                                        while (true) {
                                            if (i48 < arrayList2.size()) {
                                                h7 h7Var4 = arrayList2.get(i48).f20153b;
                                                s8 = h7Var4.f20182e;
                                                h7Var = g7Var.f20153b;
                                                if (s8 == h7Var.f20182e || h7Var4.b() != h7Var.b()) {
                                                    i48++;
                                                } else {
                                                    arrayList2.set(i48, g7Var);
                                                }
                                            } else {
                                                arrayList2.add(g7Var);
                                            }
                                        }
                                    }
                                }
                                i39 = this.f19703o + 1;
                                this.f19703o = i39;
                                if (i39 >= fkVar4.f20137e.size()) {
                                    this.f19690b = e.RECORD;
                                    return d.MESG;
                                }
                            }
                        } else {
                            ArrayList<h7> arrayList4 = fkVarArr[this.f19697i].f20137e;
                            int i86 = this.f19703o + 1;
                            this.f19703o = i86;
                            this.f19705q = arrayList4.get(i86).f20180c;
                        }
                    }
                }
                int i87 = this.f19704p;
                this.f19704p = i87 + 1;
                bArr[i87] = b14;
                i36 = this.f19705q - 1;
                this.f19705q = i36;
                if (i36 == 0) {
                    g7Var = new g7(h7Var3);
                    i37 = h7Var3.f20181d;
                    i38 = i37 & 31;
                    if (i38 < 17) {
                        i44 = sd.f20499s[i38];
                        i45 = h7Var3.f20180c / i44;
                        if ((i37 & 128) != 0) {
                            a(i44, i45);
                        }
                        g7Var.l(new ByteArrayInputStream(bArr), h7Var3.f20180c);
                        if (g7Var.f20480a.size() > 0) {
                            arrayList2 = this.f19696h.f19754d;
                            while (true) {
                                if (i48 < arrayList2.size()) {
                                    h7 h7Var5 = arrayList2.get(i48).f20153b;
                                    s8 = h7Var5.f20182e;
                                    h7Var = g7Var.f20153b;
                                    if (s8 == h7Var.f20182e) {
                                    }
                                    i48++;
                                } else {
                                    arrayList2.add(g7Var);
                                }
                            }
                        }
                    }
                    i39 = this.f19703o + 1;
                    this.f19703o = i39;
                    if (i39 >= fkVar4.f20137e.size()) {
                        this.f19690b = e.RECORD;
                        return d.MESG;
                    }
                }
                break;
        }
        return d.CONTINUE;
    }

    public final void f(InputStream inputStream, ck ckVar) {
        ArrayList<hk> arrayList = this.A;
        if (!arrayList.contains(ckVar)) {
            arrayList.add(ckVar);
        }
        this.f19710v = inputStream;
        d dVarE = d.CONTINUE;
        while (true) {
            try {
                int i14 = this.E;
                int i15 = this.D;
                byte[] bArr = this.F;
                if (i14 < i15) {
                    dVarE = e(bArr[i14]);
                    int i16 = a.f19715a[dVarE.ordinal()];
                    if (i16 != 1) {
                        if (i16 == 2) {
                            int i17 = this.f19696h.f19751a;
                            HashMap<Short, e7> map = this.f19699k;
                            HashMap<Short, HashMap<Short, yc>> map2 = this.f19700l;
                            if (i17 == 206) {
                                yc ycVar = new yc(this.f19696h);
                                Short shK = ycVar.k(0);
                                shK.getClass();
                                if (map2.containsKey(shK)) {
                                    map2.get(shK).put(ycVar.k(1), ycVar);
                                    new i7(map.get(shK), ycVar);
                                    Iterator<j7> it = this.C.iterator();
                                    while (it.hasNext()) {
                                        it.next().a();
                                    }
                                }
                            } else if (i17 == 207) {
                                e7 e7Var = new e7(this.f19696h);
                                Short shK2 = e7Var.k(3);
                                shK2.getClass();
                                map.put(shK2, e7Var);
                                map2.put(shK2, new HashMap<>());
                            }
                            Iterator<hk> it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                it3.next().a(this.f19696h);
                            }
                        } else {
                            if (i16 != 3) {
                                if (i16 == 4) {
                                    this.E++;
                                    this.f19714z++;
                                    return;
                                }
                                this.f19714z++;
                                throw new FitRuntimeException("FIT decode error: " + dVarE + " at byte: " + this.f19714z);
                            }
                            Iterator<gk> it4 = this.B.iterator();
                            while (it4.hasNext()) {
                                it4.next().b(this.f19698j[this.f19697i]);
                            }
                        }
                    }
                    this.f19714z++;
                    this.E++;
                } else {
                    this.E = 0;
                    int i18 = this.f19710v.read(bArr, 0, bArr.length);
                    this.D = i18;
                    if (i18 < 0) {
                        boolean z14 = this.f19711w;
                        if (z14 && this.f19694f != Long.MAX_VALUE) {
                            b71.i.m(this.f19714z, "FIT decode error: Unexpected end of input stream at byte: ");
                            return;
                        }
                        if (!z14) {
                            if (dVarE != d.MESG) {
                                d dVar = d.CONTINUE;
                                return;
                            }
                            return;
                        } else {
                            if (dVarE == d.MESG || dVarE == d.MESG_DEF) {
                                return;
                            }
                            if (G && this.f19712x) {
                                return;
                            }
                            b71.i.m(this.f19714z, "FIT decode error: Unexpected end of input stream at byte: ");
                            return;
                        }
                    }
                }
            } catch (IOException e4) {
                throw new FitRuntimeException(e4);
            }
        }
    }

    public final void g() {
        if (this.f19710v != null) {
            throw new FitRuntimeException("Can't set skipHeader option after Decode started!");
        }
        this.f19690b = e.RECORD;
        this.f19694f = Long.MAX_VALUE;
    }
}
