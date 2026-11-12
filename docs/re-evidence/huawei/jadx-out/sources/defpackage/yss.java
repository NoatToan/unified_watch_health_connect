package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.OpusUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.ultrasoniclibrary.ultrasoundcore.classfun.FreqParam;
import com.ultrasoniclibrary.ultrasoundcore.functions.ProductID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes46.dex */
public class yss {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static yss f53810b = null;
    private static int ch = 6;
    public int ab;
    public int ap;
    public boolean as;
    public Map<Integer, Double> az;
    public String be;
    yti bf;
    ysx bh;
    public int br;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double[] f53812c;
    public double cc;
    public double cd;
    public double ce;
    public double cf;
    public double cg;
    public double ci;
    public double ck;
    public double cl;
    private ytc cu;
    double[] d;
    private ytd[] db;
    private ytd[] dc;
    private ytd[] dd;
    private ytd[] de;
    private ytd[] df;
    private ytd[] dj;
    private double[] dv;
    private ytd[] dx;
    private ytd[] dy;
    private ytd[] dz;
    double[] e;
    private double[] ea;
    private double[] eb;
    private double[] ec;
    private double[] ed;
    private double[] ee;
    private double ef;
    private double eg;
    private double eh;
    private double ej;
    private float ek;
    private String em;
    public float f;
    public float g;
    public float h;
    public float j;
    double[] k;
    double[] n;
    double[] o;
    public ytb u;
    private static long[] cq = new long[6];
    private static long[] cp = new long[6];
    private static int[] cn = new int[6];
    private static List<Float> cm = new ArrayList();
    private static List<Integer> co = new ArrayList();
    private int ct = 0;
    private int cs = 0;
    private boolean ei = true;
    public int ak = 0;
    public int aj = 0;
    public int ao = 0;
    public int q = 2;
    public int bj = 0;
    public int ag = 0;
    public boolean bd = false;
    public int al = 0;
    public int i = 0;
    public int cj = 0;
    public boolean am = false;
    public int ai = 0;
    public boolean v = false;
    public int aq = 2;
    public int r = 0;
    private double cv = 0.0d;
    private int dg = 0;
    private int dh = 0;
    private boolean di = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CopyOnWriteArrayList<float[]> f53811a = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Float> ae = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Float> bi = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Float> bo = new CopyOnWriteArrayList<>();
    CopyOnWriteArrayList<Float> bn = new CopyOnWriteArrayList<>();
    public float w = 20.0f;
    public float y = 15.0f;
    public int bw = 3;
    public double ar = 1.0d;
    public double aw = 1.0d;
    public double au = 1.0d;
    public double av = 1.0d;
    public int t = 1;
    public float p = 15.0f;
    public float ac = 34.0f;
    public int x = 23;
    public float bt = 3.45E-4f;
    public double cb = 8.0d;
    public double bz = 5.0d;
    public double ah = 8.0d;
    private double ev = 300.0d;
    public double an = 24.0d;
    public float af = 70.0f;
    public boolean bc = false;
    private ProductID dn = ProductID.PIANO;
    private int cw = 4096;
    public int m = 0;
    public float ba = 40.0f;
    public float ay = -1.6f;
    public long l = 1000000000;
    public long bq = 1000000;
    private float cr = 34.0f;
    public double bl = 0.5d;
    private double er = 600.0d;
    private double ep = 500.0d;
    private double eu = 0.0d;
    private double ew = 0.0d;
    private int ey = 600;
    public long bu = 0;
    public long bx = 1000000000;
    public int z = 0;
    public int aa = 0;
    public int s = 3;
    public int bs = 0;
    private float da = -500.0f;
    public float at = 0.0f;
    public boolean ax = false;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final int f9do = 20;
    int ad = 0;
    public double bk = 0.0d;
    public double bp = 0.0d;
    public boolean bm = false;
    public int bv = 0;
    public float bb = -500.0f;
    int bg = 1;
    int by = 0;
    int ca = 0;
    private int ex = 0;
    private boolean ds = false;
    private double eq = 20.0d;
    private double et = 120.0d;
    private double es = 340.0d;
    private double eo = 30.0d;
    private double el = 60.0d;
    private double cy = 10.0d;
    private int dp = 0;
    private int du = 0;
    private int dm = 0;
    private int dt = 0;
    private int dq = 0;
    private double dw = 0.0d;
    private double dr = 0.0d;
    private int dk = 0;
    private Boolean dl = false;
    private boolean cz = false;
    private int cx = 0;
    private int en = 0;

    public float b(float f, float f2) {
        if (f >= 0.0f || f < f2) {
            return f;
        }
        return 0.5f;
    }

    public static yss c() {
        if (f53810b == null) {
            synchronized (yss.class) {
                if (f53810b == null) {
                    f53810b = new yss();
                }
            }
        }
        return f53810b;
    }

    public boolean b(Context context, String str, int i) {
        ysz.d dVarD = ysz.d().d(context);
        boolean zE = dVarD.e();
        int iB = dVarD.b();
        int iD = dVarD.d();
        this.m = dVarD.a();
        boolean z = false;
        if (!zE) {
            Log.e("CheckPreciseSearch", "isContainInCSV result: false");
        } else {
            Log.i("CheckPreciseSearch", "target productId:  " + str + "  sequence: " + i);
            boolean zB = ysz.d().b(context, str, i).b();
            boolean z2 = ysz.d().b(context, iB) && ysz.d().c(context, iD);
            if (zB && z2) {
                z = true;
            }
            Log.e("CheckPreciseSearch", "isDevicesMatch result: " + zB + "  isOSVerCorrect result: " + z2);
        }
        Log.e("CheckPreciseSearch", str + Constants.LINK + i + " CheckPreciseResult result: " + z);
        return z;
    }

    public int b() {
        return this.m;
    }

    public yta d(ysy ysyVar) {
        synchronized (this) {
            Log.i("UltraAlg", "Begin: " + this.bf.toString());
            int actionFlag = ysyVar.j.getActionFlag();
            Log.i("UltraAlg", "actionFlag: " + actionFlag + " workFlag: " + this.ex);
            yta ytaVar = new yta();
            boolean z = this.cz;
            if (!z && actionFlag == 0) {
                this.cx = 0;
                int i = this.ex;
                if (i == 2) {
                    this.ex = 1;
                } else if (i == 3) {
                    this.ex = 0;
                }
                ytaVar = e(this.ex, ysyVar);
            } else if (!z && actionFlag == 1) {
                Log.e("FrequencySwitch", "`Positioning` doubleCheckFlag false,wait change actionFlag ");
                ytaVar = e(this.ex, ysyVar);
            } else if (!z && actionFlag == 2) {
                this.cx = 0;
                Log.i("FrequencySwitch", "`Positioning` doubleCheckFlag false, change workFlag ");
                int i2 = this.ex;
                if (i2 == 2) {
                    this.ex = 1;
                } else if (i2 == 3) {
                    this.ex = 0;
                }
                ytaVar = e(this.ex, ysyVar);
            } else if (z) {
                if (actionFlag == 1) {
                    this.cx++;
                    Log.i("FrequencySwitch", "doubleCheckCount: " + this.cx);
                    if (this.cx >= 20) {
                        Log.i("FrequencySwitch", "doubleCheck failed, change workFlag");
                        int i3 = this.ex;
                        if (i3 == 2) {
                            this.ex = 0;
                        } else if (i3 == 3) {
                            this.ex = 1;
                        }
                        this.cx = 0;
                        this.cz = false;
                        return e(this.ex, ysyVar);
                    }
                }
                this.bf = new yti(OpusUtil.SAMPLE_RATE, 4000, 14000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
                this.bh = ytk.d().c(this.em, this.bg, this.bf.a());
                c(this.bf);
                yta ytaVarB = b(ysyVar);
                this.bf = new yti(OpusUtil.SAMPLE_RATE, 5000, 6000, 8500);
                this.bh = ytk.d().c(this.em, this.bg, this.bf.a());
                c(this.bf);
                yta ytaVarB2 = b(ysyVar);
                Log.e("FrequencySwitch", " rssi1418: " + this.eg + " rssi611: " + this.eh);
                int i4 = this.ex;
                if (i4 == 2) {
                    if (this.eh < this.eg * 5.0d) {
                        double d = this.dw;
                        if (d <= 350.0d || d < this.dr * 3.0d) {
                            Log.i("FrequencySwitch", "res = res1418");
                            ytaVar = ytaVarB;
                        }
                    }
                    Log.i("FrequencySwitch", "workFlag: " + this.ex + " maxValue611: " + this.dw + " maxValue1418: " + this.dr);
                    this.cz = false;
                    ytaVar = ytaVarB2;
                } else if (i4 == 3) {
                    if (this.eh > this.eg * 3.0d) {
                        double d2 = this.dr;
                        if (d2 <= 350.0d || d2 < this.dw * 3.0d) {
                            Log.i("FrequencySwitch", "res = res611");
                            ytaVar = ytaVarB2;
                        }
                    }
                    Log.i("FrequencySwitch", "workFlag: " + this.ex + " maxValue611: " + this.dw + " maxValue1418: " + this.dr);
                    this.cz = false;
                    ytaVar = ytaVarB;
                }
                Log.e("FrequencySwitch", "Positioning doubleCheckFlag: " + this.cz);
            }
            Log.i("FrequencySwitch", "PositioningResult: " + ytaVar.toString());
            return ytaVar;
        }
    }

    private yta e(int i, ysy ysyVar) {
        new yta();
        if (i != 0) {
            if (i != 1) {
                Log.e("UltraAlg", "getResult failed");
                return new yta(2, new float[]{1.0f, -500.0f}, new FreqParam());
            }
            this.bh = ytk.d().c(this.em, this.bg, 6000);
            Log.e("UltraAlg", "posParam initialize based on: " + this.em);
            yti ytiVar = new yti(OpusUtil.SAMPLE_RATE, 5000, 6000, 8500);
            this.bf = ytiVar;
            c(ytiVar);
            return b(ysyVar);
        }
        if (this.em.equals(ProductID.HWTAG.getProductID())) {
            this.bh = ytk.d().c(this.em, this.bg, 14000);
            this.bf = new yti(OpusUtil.SAMPLE_RATE, 4000, 14000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
        }
        Log.i("UltraAlg", "workFlag: " + this.bh.toString());
        c(this.bf);
        Log.i("UltraAlg", "Positioning Begin: " + this.bf.toString());
        return b(ysyVar);
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0406 A[Catch: all -> 0x041c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0042, B:9:0x0056, B:10:0x0067, B:12:0x006d, B:13:0x008e, B:15:0x009d, B:16:0x00a4, B:18:0x0116, B:20:0x0128, B:22:0x01d2, B:24:0x01d8, B:26:0x01dd, B:31:0x01e7, B:33:0x01eb, B:35:0x01f2, B:37:0x023d, B:38:0x0245, B:45:0x026d, B:47:0x0272, B:49:0x027c, B:51:0x0288, B:53:0x029d, B:55:0x02b6, B:59:0x02f5, B:65:0x0301, B:67:0x032c, B:70:0x0331, B:76:0x035a, B:78:0x0369, B:80:0x036d, B:82:0x0374, B:83:0x038d, B:85:0x03be, B:87:0x03c6, B:89:0x03d9, B:94:0x03fe, B:96:0x0416, B:90:0x03e4, B:92:0x03ec, B:95:0x0406, B:64:0x02ff, B:34:0x01ee, B:29:0x01e3, B:19:0x0122), top: B:102:0x0003 }] */
    public yta b(ysy ysyVar) {
        ytb ytbVarD;
        float fRound;
        FreqParam freqParamC;
        synchronized (this) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.ca = this.by;
            this.by = ysyVar.m;
            Log.e("UltraAlg", "tagStateLast: " + this.ca);
            Log.e("UltraAlg", "tagState: " + this.by);
            if (1 == this.by) {
                FreqParam freqParam = new FreqParam();
                a();
                d();
                return new yta(3, new float[2], freqParam);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(ysyVar.c());
            int size = copyOnWriteArrayList.size();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Log.e("UltraAlg", "orientation: " + Arrays.toString((float[]) it.next()));
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(ysyVar.e());
            if (copyOnWriteArrayList2.size() != 0) {
                ytm.d(this.f53811a, 40, copyOnWriteArrayList2);
            }
            int iD = ytm.d(this.f53811a);
            Log.e("UltraAlg", "moveState: " + iD);
            byte[] bArrF = ysyVar.f();
            double[] dArrD = d(bArrF);
            Log.e("UltraAlg", "bufferDataTmp: " + ((int) bArrF[10]));
            float fD = ysyVar.d();
            this.bt = ytm.e(fD);
            Log.e("UltraAlg", "tempFromTag: " + fD);
            int iB = ysyVar.b();
            this.ab = iB;
            Double d = this.az.get(Integer.valueOf(iB));
            if (d == null) {
                Log.e("UltraAlg", "measurementBiasMap get disCalDelta value failed");
                this.ac = 34.0f;
            } else {
                this.ac = d.floatValue();
            }
            Log.e("UltraAlg", "disCalDelta: " + this.ac);
            float f = this.ac / 345.0f;
            float f2 = this.bt;
            this.cr = f * f2 * 1000000.0f;
            this.x = ytm.b(this.cc, this.cg, this.ce, this.ci, f2, this.bf.d());
            this.z++;
            long j = ysyVar.j();
            long jA = ysyVar.a();
            Log.e("UltraAlg", "disCalCount: " + this.z);
            Log.e("UltraAlg", "tT2: " + jA);
            Log.e("UltraAlg", "tT1: " + j);
            d(j, jA);
            int iE = this.em.equals(ProductID.HWTAG.getProductID()) ? e() : 1;
            if (((1 == this.s && this.z > 1) || (iE == 0 && this.z > 1)) && !this.cz) {
                ytbVarD = this.u;
            } else {
                ytbVarD = d(dArrD);
            }
            ytb ytbVar = ytbVarD;
            this.u = ytbVar;
            float fB = ytm.b(ytbVar.e.f53873a, this.x);
            Log.e("UltraAlg", "getAngle: " + fB);
            int i = ytbVar.e.d;
            Log.e("UltraAlg", "sigStartPoint is：" + i);
            float fA = a(i, j, jA, iD, iE);
            if (this.s != 1) {
                this.ek = ytm.b(i, size, copyOnWriteArrayList, iE);
            }
            int i2 = ytbVar.f53836a;
            Log.e("UltraAlg", "dataFlagOri before deM: " + i2);
            if (i2 == 8 && fA <= 5.0f && fA > 0.0f) {
                i2 = 4;
            }
            int i3 = i2;
            if (!this.am || Math.abs(fB) < 9.0f || Math.abs(this.cv) < 9.0d || Math.abs(this.cv - 90.0d) <= 1.0E-5d) {
                fRound = fB;
            } else {
                Log.i("UltraAlg", "do angleCal ");
                fRound = Math.round((((double) fB) + this.cv) / 10.0d) * 10;
            }
            float fA2 = a(fRound, i3, ytbVar.d, fA, iE);
            Log.e("UltraAlg", "deM_Angle: " + fA2);
            Log.i("UltraAlg", "disCalFinal: " + fA);
            if (this.s == 1 || iE == 0) {
                i3 = this.aq;
            } else if (this.as && i3 != 9) {
                i3 = 8;
            }
            this.aq = i3;
            Log.e("UltraAlg", "flagFuzzy-flagFuzzyLast: " + i3 + "; " + this.aq);
            int iB2 = b(i3, iE, fA);
            if (this.ca == 1 && this.by == 0) {
                iB2 = 3;
            }
            Log.e("UltraAlg", "dataProcFlagFilter: " + iB2);
            int i4 = (this.bf.a() != 6000 || fA <= 15.0f) ? iB2 : 2;
            e(fA, ytbVar.d, this.ah, i4);
            if (this.bc && (!this.di || fA > 20.0d)) {
                Log.i("UltraAlg", "firstBoxDisDisplayFlag: " + this.di);
                i4 = 2;
            }
            Log.e("UltraAlg", "caseNum-calFlag-runTime: " + this.s + "; " + iE + "; " + (System.currentTimeMillis() - jCurrentTimeMillis));
            if (this.ds) {
                int i5 = this.dk;
                this.dk = i5 + 1;
                if (i5 >= 8) {
                    freqParamC = new FreqParam();
                    if (this.em.equals(ProductID.HWTAG.getProductID())) {
                        freqParamC = a(fA, this.bf.a());
                    } else if (ProductID.isInvolveHeadsetProduct(this.em)) {
                        freqParamC = ytk.d().c(this.em, this.bf.a());
                    }
                    if (freqParamC == null) {
                        Log.e("UltraAlg", "finalResult freqParam error");
                    }
                } else {
                    freqParamC = ytk.d().c(this.em, this.bf.a());
                }
            } else {
                freqParamC = ytk.d().c(this.em, this.bf.a());
            }
            return ytm.d(fA2, fA, i4, freqParamC);
        }
    }

    public FreqParam a(float f, int i) {
        FreqParam freqParam = new FreqParam();
        int i2 = this.ex;
        if (i2 == 2 || i2 == 3) {
            if (i == 14000) {
                this.eg = this.ej;
                freqParam = ytk.d().c(this.em, 14000);
            } else if (i == 6000) {
                this.eh = this.ej;
                freqParam = ytk.d().c(this.em, 6000);
            }
        }
        if (this.ex == 0) {
            double d = f;
            double d2 = (this.eq - (0.7d * d)) * this.ar;
            Log.i("FrequencySwitch", " checkFrequencySwitch disCalFinal: " + f + " rssiFinalMin: " + this.ef + " thrRssih2l: " + d2);
            StringBuilder sb = new StringBuilder(" checkFrequencySwitch highToLowCount:");
            sb.append(this.dm);
            sb.append(" rssiFinal < thrRssih2l: ");
            sb.append(this.ef < d2);
            Log.i("FrequencySwitch", sb.toString());
            if (f > 0.0f && this.ef <= d2 && d < this.cy) {
                this.dm++;
            } else {
                this.dm = 0;
            }
            freqParam = ytk.d().c(this.em, 14000);
            Log.e("FrequencySwitch", " checkFrequencySwitch highToLowCount: " + this.dm + " disCalFinal: " + f + " rssiFinalmin: " + this.ef);
        }
        if (this.ex == 1) {
            double d3 = this.et;
            double d4 = this.ar;
            double d5 = this.bg == 1 ? 1.0d : 0.8d;
            double d6 = f < 5.0f ? d5 * 280.0d : d5 * (this.es - ((double) (12.0f * f)));
            Log.i("FrequencySwitch", " checkFrequencySwitch disCalFinal: " + f + " rssiFinalMax: " + this.ej + " thrRssil2h: " + d6);
            if (f > 0.0f && this.ej >= d6 && f < 15.0f) {
                this.dt++;
            } else {
                this.dt = 0;
            }
            Log.e("FrequencySwitch", " checkFrequencySwitch lowToHighCount1: " + this.dt + " disCalFinal: " + f + " rssiFinalmax: " + this.ej);
            if (Float.compare(f, -500.0f) == 0 && this.ej > d3 * d4) {
                this.dq++;
            } else {
                this.dq = 0;
            }
            Log.e("FrequencySwitch", " checkFrequencySwitch lowToHighCount2:" + this.dq);
            freqParam = ytk.d().c(this.em, 6000);
        }
        if (this.dl.booleanValue() && this.bg == 1 && f <= 1.5d && this.ej < 800.0d) {
            this.dt = 0;
            this.dq = 0;
            this.du = 0;
        }
        boolean z = this.dm >= 5 && this.dp >= 4;
        if (this.ex == 0 && z) {
            Log.e("FrequencySwitch", " checkFrequencySwitch high->low");
            Log.e("FrequencySwitch", " checkFrequencySwitch latest disCalFinal:" + f);
            Log.e("FrequencySwitch", " checkFrequencySwitch latest sigRssi:" + this.ef);
            this.ex = 2;
            this.dm = 0;
            this.dp = 0;
            this.dl = true;
            freqParam = ytk.d().c(this.em, 6000);
            freqParam.setActionFlag(1);
            this.cz = true;
        }
        boolean z2 = this.dt >= 5 || this.dq >= 10 || this.du >= 5;
        if (this.ex == 1 && z2) {
            Log.e("FrequencySwitch", " checkFrequencySwitch low->high");
            Log.e("FrequencySwitch", " checkFrequencySwitch latest disCalFinal:" + f);
            Log.e("FrequencySwitch", " checkFrequencySwitch latest sigRssi:" + this.ej);
            this.ex = 3;
            this.dt = 0;
            this.dq = 0;
            this.du = 0;
            this.dl = false;
            freqParam = ytk.d().c(this.em, 14000);
            freqParam.setActionFlag(1);
            this.cz = true;
        }
        Log.i("FrequencySwitch", " freqParam: " + freqParam.toString());
        return freqParam;
    }

    public double[] d(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return ytp.e(bArr2);
    }

    public void d(long j, long j2) {
        Log.e("UltraAlg", "tT2-tT1: " + (j2 - j) + " us");
        StringBuilder sb = new StringBuilder("tT2Last: ");
        sb.append(this.bx);
        Log.e("UltraAlg", sb.toString());
        Log.e("UltraAlg", "tT1Last: " + this.bu);
        if (this.z > 1) {
            long j3 = this.bu;
            if ((j != j3 && j2 == this.bx) || (j == j3 && j2 == this.bx)) {
                this.s = 1;
            } else if (j == j3 && j2 != this.bx) {
                this.s = 2;
            } else if (j != j3 && j2 != this.bx) {
                this.s = 3;
            }
        }
        Log.e("UltraAlg", "caseNum is: " + this.s);
        this.bu = j;
        this.bx = j2;
        if (this.z <= 1) {
            for (int i = 0; i < ch; i++) {
                cp[i] = this.l;
            }
            this.u = new ytb(6, new ytp.b(), 0.0d);
        }
    }

    public int e() {
        if (this.s != 1) {
            this.r++;
        }
        int i = this.r % 2 != 1 ? 0 : 1;
        Log.e("UltraAlg", "getCalFlag: calCount：" + this.r);
        Log.e("UltraAlg", "getCalFlag: calFlag：" + i);
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:39:0x0453  */
    /* JADX WARN: Code duplicated, block: B:40:0x0458  */
    /* JADX WARN: Code duplicated, block: B:43:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x04c4 A[LOOP:0: B:44:0x04c2->B:45:0x04c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x04d1 A[LOOP:1: B:47:0x04cf->B:48:0x04d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x04da  */
    /* JADX WARN: Code duplicated, block: B:51:0x04de A[LOOP:2: B:50:0x04dc->B:51:0x04de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x04eb A[LOOP:3: B:53:0x04e9->B:54:0x04eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0589  */
    /* JADX WARN: Code duplicated, block: B:58:0x0592  */
    /* JADX WARN: Code duplicated, block: B:61:0x066b  */
    /* JADX WARN: Code duplicated, block: B:62:0x066e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0672  */
    /* JADX WARN: Code duplicated, block: B:65:0x0675  */
    /* JADX WARN: Code duplicated, block: B:68:0x069b  */
    /* JADX WARN: Code duplicated, block: B:69:0x069d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0766  */
    /* JADX WARN: Code duplicated, block: B:82:0x0778  */
    /* JADX WARN: Code duplicated, block: B:85:0x077d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0789  */
    /* JADX WARN: Code duplicated, block: B:89:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x07d2  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0789, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x07b3, please report this as an issue */
    public ytb d(double[] dArr) {
        double d;
        int i;
        double[] dArr2;
        double[] dArrD;
        double[] dArrD2;
        double d2;
        double d3;
        double d4;
        ytp.e eVar;
        ytp.e eVar2;
        double d5;
        double d6;
        int i2;
        int i3;
        double d7;
        double d8;
        ytd[] ytdVarArrC;
        double[] dArrD3;
        ytd[] ytdVarArrB;
        double[] dArrD4;
        ytd[] ytdVarArrB2;
        ytp.c cVarA;
        ytp.c cVarA2;
        int[] iArr;
        int[] iArr2;
        int length;
        double[] dArr3;
        int length2;
        double[] dArr4;
        int i4;
        int i5;
        ytp.c cVar;
        ytp.c cVar2;
        ytp.b bVarA;
        double dMax;
        int i6;
        int i7;
        double d9;
        double d10;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iE = this.bh.e();
        int i13 = this.x;
        if (this.ds) {
            if (this.bf.a() >= 14000) {
                dArr2 = this.ed;
                this.dd = this.df;
                this.dc = this.de;
                i12 = this.x + 7;
                this.cb = 8.0d;
                this.bz = 5.0d;
                d = this.ar;
                if (d < 0.6d) {
                    d *= 1.2d;
                }
            } else {
                dArr2 = this.ea;
                this.dd = this.db;
                this.dc = this.dj;
                i12 = this.x + 7;
                this.cb = 25.0d;
                this.bz = 20.0d;
                d = this.bg == 1 ? 1.0d : 0.9d;
            }
            i = i12;
        } else {
            double[] dArr5 = this.ed;
            d = this.ar;
            if (d < 0.6d) {
                d *= 1.2d;
            }
            i = i13 + 7;
            dArr2 = dArr5;
        }
        double d11 = d;
        Log.e("UltraAlg", "channelOrder: " + this.t);
        yth.b bVarE = yth.e(dArr, this.t);
        double[] dArr6 = bVarE.f53850a;
        double[] dArr7 = bVarE.f53851b;
        Log.i("UltraAlg", "data_processing: " + this.bh.toString());
        if (!this.ds || this.bf.a() >= 14000) {
            dArrD = yth.d(this.o, this.e, dArr6);
            dArrD2 = yth.d(this.o, this.e, dArr7);
        } else {
            dArrD = yth.d(this.k, this.f53812c, dArr6);
            dArrD2 = yth.d(this.k, this.f53812c, dArr7);
        }
        int iD = this.bh.d() * this.bh.c();
        double[] dArr8 = new double[iD];
        System.arraycopy(dArrD, 0, dArr8, 0, iD);
        double[] dArr9 = new double[iD];
        System.arraycopy(dArrD2, 0, dArr9, 0, iD);
        int iA = this.bh.a();
        double[] dArr10 = new double[iE];
        System.arraycopy(dArr2, 0, dArr10, 0, iE);
        int i14 = iD - iA;
        double[] dArr11 = new double[i14];
        System.arraycopy(dArr8, iA, dArr11, 0, i14);
        int i15 = i14 - iE;
        double[] dArr12 = new double[i15];
        double[] dArrD5 = ytp.d(dArr10, dArr11, d11, dArr12);
        ytp.e eVarH = ytp.h(dArrD5);
        double[] dArr13 = new double[i14];
        System.arraycopy(dArr9, iA, dArr13, 0, i14);
        double[] dArr14 = new double[i15];
        double[] dArrD6 = ytp.d(dArr10, dArr13, d11, dArr14);
        ytp.e eVarH2 = ytp.h(dArrD6);
        if (this.ds) {
            if (this.bf.a() >= 14000) {
                ytp.e eVarH3 = ytp.h(dArrD5);
                ytp.e eVarH4 = ytp.h(dArrD6);
                d11 = d11;
                double d12 = eVarH3.d;
                d4 = eVarH4.d;
                eVar = eVarH4;
                eVar2 = eVarH3;
                d5 = d12;
            } else {
                eVarH = ytp.h(dArr12);
                eVarH2 = ytp.h(dArr14);
                d2 = dArrD5[eVarH.e];
                d3 = dArrD6[eVarH2.e];
            }
            d6 = d5;
            Log.e("UltraAlg", "startpointLeft: " + eVar2.e);
            Log.e("UltraAlg", "startpointRight: " + eVar.e);
            int iB = iE + iA + this.bh.b();
            ytp.e eVarA = yth.a(iD, iB, iA, eVar2, dArrD5, dArr12, this.bf.a());
            eVar2.e = eVarA.e;
            double d13 = eVarA.d;
            ytp.e eVarA2 = yth.a(iD, iB, iA, eVar, dArrD6, dArr14, this.bf.a());
            eVar.e = eVarA2.e;
            double d14 = eVarA2.d;
            Log.e("UltraAlg", "startpointTmpLeft2.index New: " + eVar2.e);
            Log.e("UltraAlg", "startpointTmpRight2.index New: " + eVar.e);
            Log.e("UltraAlg", "corrTmpLeft2Final: " + d13);
            Log.e("UltraAlg", "corrTmpRight2Final: " + d14);
            i2 = eVar2.e;
            i3 = eVar.e;
            double[] dArr15 = new double[iE];
            System.arraycopy(dArr11, i2, dArr15, 0, iE);
            double d15 = ytp.d(dArr15);
            Log.e("UltraAlg", "Tag_RSSI_Left1: " + d15);
            double[] dArr16 = new double[iE];
            System.arraycopy(dArr13, i2, dArr16, 0, iE);
            double d16 = ytp.d(dArr16);
            Log.e("UltraAlg", "Tag_RSSI_Right1: " + d16);
            System.arraycopy(dArr11, i3, dArr15, 0, iE);
            double d17 = ytp.d(dArr15);
            Log.e("UltraAlg", "Tag_RSSI_Left2: " + d17);
            System.arraycopy(dArr13, i3, dArr16, 0, iE);
            double d18 = ytp.d(dArr16);
            Log.e("UltraAlg", "Tag_RSSI_Right2: " + d18);
            yth.d dVarD = yth.d(eVar2.e, eVar.e, d15, d16, d17, d18);
            this.ad = dVarD.e;
            eVar2.e = dVarD.f53852a;
            eVar.e = dVarD.f53854c;
            d7 = dVarD.f53853b;
            d8 = dVarD.d;
            Log.e("UltraAlg", "Left-Right.index: " + eVar2.e + "; " + eVar.e);
            StringBuilder sb = new StringBuilder("deviceA2bRssi: ");
            sb.append(d7);
            Log.e("UltraAlg", sb.toString());
            Log.e("UltraAlg", "deviceA2bRssiRight: " + d8);
            double[] dArr17 = new double[iB];
            System.arraycopy(dArr8, eVar2.e, dArr17, 0, Math.min(iB, iD - eVar2.e));
            ytd[] ytdVarArrA = yth.a(dArr17, this.bf.a() + (this.bf.e() / 2), this.bf.d(), this.bf.e());
            double[] dArr18 = new double[iB];
            System.arraycopy(dArr9, eVar.e, dArr18, 0, Math.min(iB, iD - eVar.e));
            ytd[] ytdVarArrA2 = yth.a(dArr18, this.bf.a() + (this.bf.e() / 2), this.bf.d(), this.bf.e());
            new ytp.c();
            new ytp.c();
            ytdVarArrC = yth.c(ytg.b().d(), ytg.b().a());
            ytd[] ytdVarArrA3 = ytp.a(4096);
            System.arraycopy(ytdVarArrA, 0, ytdVarArrA3, 0, iB);
            double d19 = d11;
            dArrD3 = ytn.d(this.dd, ytdVarArrA3, iE, iB, d19);
            ytdVarArrB = ytn.b(this.dd, ytdVarArrA3, iE, iB, d19);
            ytd[] ytdVarArrA4 = ytp.a(4096);
            System.arraycopy(ytdVarArrA2, 0, ytdVarArrA4, 0, iB);
            double d20 = d11;
            dArrD4 = ytn.d(this.dc, ytdVarArrA4, iE, iB, d20);
            ytdVarArrB2 = ytn.b(this.dc, ytdVarArrA4, iE, iB, d20);
            if (this.bf.a() == 14000) {
                cVarA = ytp.c(dArrD3);
            } else {
                cVarA = ytp.a(ytdVarArrB, ytdVarArrC, 61);
            }
            Log.e("UltraAlg", "pathLeftClass2: " + Arrays.toString(cVarA.d));
            Log.e("UltraAlg", "pathLeftClass2.disIdx: " + cVarA.f53877c);
            Log.e("MultipathCancel", "pathLeftClass2: " + Arrays.toString(cVarA.d));
            Log.e("MultipathCancel", "pathLeftClass2.disIdx: " + cVarA.f53877c);
            if (this.bf.a() == 14000) {
                cVarA2 = ytp.c(dArrD4);
            } else {
                cVarA2 = ytp.a(ytdVarArrB2, ytdVarArrC, 61);
            }
            Log.e("UltraAlg", "pathRightClass2: " + Arrays.toString(cVarA2.d));
            Log.e("UltraAlg", "pathRightClass2.disIdx: " + cVarA2.f53877c);
            Log.e("MultipathCancel", "pathRightClass2: " + Arrays.toString(cVarA2.d));
            Log.e("MultipathCancel", "pathRightClass2.disIdx: " + cVarA2.f53877c);
            iArr = cVarA.d;
            iArr2 = cVarA2.d;
            length = iArr.length;
            dArr3 = new double[length];
            length2 = iArr2.length;
            dArr4 = new double[length2];
            if (this.bf.a() >= 14000) {
                for (i10 = 0; i10 < length; i10++) {
                    dArr3[i10] = dArrD3[iArr[i10]];
                }
                for (i11 = 0; i11 < length2; i11++) {
                    dArr4[i11] = dArrD4[iArr2[i11]];
                }
            } else {
                for (i4 = 0; i4 < length; i4++) {
                    dArr3[i4] = cVarA.f53876a[i4];
                }
                for (i5 = 0; i5 < length2; i5++) {
                    dArr4[i5] = cVarA2.f53876a[i5];
                }
            }
            Log.i("UltraAlg", "pathTargetAbsLeft2: " + Arrays.toString(dArr3));
            Log.i("UltraAlg", "pathTargetAbsRight2: " + Arrays.toString(dArr4));
            Log.i("MultipathCancel", "pathTargetAbsLeft2: " + Arrays.toString(dArr3));
            Log.i("MultipathCancel", "pathTargetAbsRight2: " + Arrays.toString(dArr4));
            int[] iArrC = ytp.c(iArr, eVar2.e);
            int[] iArrC2 = ytp.c(iArr2, eVar.e);
            cVar = cVarA2;
            cVar2 = cVarA;
            double d21 = d11;
            ytp.e eVar3 = eVar2;
            ytp.e eVar4 = eVar;
            bVarA = ytp.a(iArrC, dArr3, cVarA.e, iArrC2, dArr4, cVarA2.e, i, this.bf.a());
            double d22 = this.cb * d21;
            double d23 = this.bz * d21;
            if (this.bf.a() >= 14000) {
                dMax = Math.min(d6, d4);
            } else {
                dMax = Math.max(d6, d4);
            }
            Log.e("UltraAlg", "startpointTmpLeft2.max: " + eVar3.d);
            Log.e("UltraAlg", "startpointTmpRight2.max: " + eVar4.d);
            Log.e("UltraAlg", "micGain: " + d21);
            Log.e("UltraAlg", "weakSigTh: " + d22);
            Log.e("UltraAlg", "weakSigTh2: " + d23);
            int iC = yth.c(d7, d8, d22, d23, this.ev, dMax, bVarA.f53875c);
            Log.i("DelayGap", "delayGap: " + bVarA.f53873a);
            Log.e("UltraAlg", "dataProcFlagOri: " + iC);
            Log.e("UltraAlg", "delayPoint2.delayPoints: " + bVarA.f53873a);
            Log.e("UltraAlg", "delayPoint2-L-R-Points: " + bVarA.d + "; " + bVarA.e);
            i6 = bVarA.d - eVar3.e;
            i7 = bVarA.e - eVar4.e;
            if (i6 < 0) {
                d9 = dArrD3[0];
            } else {
                d9 = dArrD3[i6];
            }
            if (i7 < 0) {
                d10 = dArrD4[0];
            } else {
                d10 = dArrD4[i7];
            }
            Log.e("UltraAlg", "pointValueLeft-Rit: " + d9 + "; " + d10);
            if (Math.max(d9, d10) < 150.0d) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            Log.e("UltraAlg", "disCalFlag: " + i8);
            bVarA.d = yth.b(this.ad, i8, bVarA, cVar2.f53877c, cVar.f53877c, eVar3.e, eVar4.e);
            Log.e("UltraAlg", "delayPoint2.delayPointsLeft: " + bVarA.d);
            if (this.ds && (((i9 = this.ex) == 0 || i9 == 1) && this.em.equals(ProductID.HWTAG.getProductID()))) {
                b(yth.d(this.k, this.f53812c, dArr6), yth.d(this.k, this.f53812c, dArr7), bVarA.d);
            }
            double dMin = Math.min(d7, d8);
            Log.e("UltraAlg", "firstAngleDisRssi: " + dMin);
            this.ej = Math.max(d7, d8);
            this.ef = Math.min(d7, d8);
            Log.e("UltraAlg", "finalRssiMax: " + this.ej + "  finalRssiMin: " + this.ef);
            if (this.bf.a() >= 14000) {
                this.eu = Math.min(dArrD5[i2], dArrD6[i3]);
                this.ew = Math.max(d7, d8);
            }
            if (this.ds) {
                if (this.bf.a() >= 14000) {
                    Log.e("UltraAlg", "1418 resRssiMax: " + this.ej + "resRssiMin: " + this.ef);
                    if (this.cz) {
                        this.dr = Math.max(cVar2.e, cVar.e);
                    }
                } else {
                    Log.e("UltraAlg", "611 resRssiMax: " + this.ej + "resRssiMin: " + this.ef);
                    if (this.cz) {
                        this.dw = Math.max(cVar2.e, cVar.e);
                    }
                }
            }
            return new ytb(iC, bVarA, dMin);
        }
        d2 = dArrD5[eVarH.e];
        d3 = dArrD6[eVarH2.e];
        d4 = d3;
        double d24 = d2;
        eVar = eVarH2;
        eVar2 = eVarH;
        d5 = d24;
        d6 = d5;
        Log.e("UltraAlg", "startpointLeft: " + eVar2.e);
        Log.e("UltraAlg", "startpointRight: " + eVar.e);
        int iB2 = iE + iA + this.bh.b();
        ytp.e eVarA3 = yth.a(iD, iB2, iA, eVar2, dArrD5, dArr12, this.bf.a());
        eVar2.e = eVarA3.e;
        double d110 = eVarA3.d;
        ytp.e eVarA4 = yth.a(iD, iB2, iA, eVar, dArrD6, dArr14, this.bf.a());
        eVar.e = eVarA4.e;
        double d111 = eVarA4.d;
        Log.e("UltraAlg", "startpointTmpLeft2.index New: " + eVar2.e);
        Log.e("UltraAlg", "startpointTmpRight2.index New: " + eVar.e);
        Log.e("UltraAlg", "corrTmpLeft2Final: " + d110);
        Log.e("UltraAlg", "corrTmpRight2Final: " + d111);
        i2 = eVar2.e;
        i3 = eVar.e;
        double[] dArr19 = new double[iE];
        System.arraycopy(dArr11, i2, dArr19, 0, iE);
        double d112 = ytp.d(dArr19);
        Log.e("UltraAlg", "Tag_RSSI_Left1: " + d112);
        double[] dArr110 = new double[iE];
        System.arraycopy(dArr13, i2, dArr110, 0, iE);
        double d113 = ytp.d(dArr110);
        Log.e("UltraAlg", "Tag_RSSI_Right1: " + d113);
        System.arraycopy(dArr11, i3, dArr19, 0, iE);
        double d114 = ytp.d(dArr19);
        Log.e("UltraAlg", "Tag_RSSI_Left2: " + d114);
        System.arraycopy(dArr13, i3, dArr110, 0, iE);
        double d115 = ytp.d(dArr110);
        Log.e("UltraAlg", "Tag_RSSI_Right2: " + d115);
        yth.d dVarD2 = yth.d(eVar2.e, eVar.e, d112, d113, d114, d115);
        this.ad = dVarD2.e;
        eVar2.e = dVarD2.f53852a;
        eVar.e = dVarD2.f53854c;
        d7 = dVarD2.f53853b;
        d8 = dVarD2.d;
        Log.e("UltraAlg", "Left-Right.index: " + eVar2.e + "; " + eVar.e);
        StringBuilder sb2 = new StringBuilder("deviceA2bRssi: ");
        sb2.append(d7);
        Log.e("UltraAlg", sb2.toString());
        Log.e("UltraAlg", "deviceA2bRssiRight: " + d8);
        double[] dArr111 = new double[iB2];
        System.arraycopy(dArr8, eVar2.e, dArr111, 0, Math.min(iB2, iD - eVar2.e));
        ytd[] ytdVarArrA5 = yth.a(dArr111, this.bf.a() + (this.bf.e() / 2), this.bf.d(), this.bf.e());
        double[] dArr112 = new double[iB2];
        System.arraycopy(dArr9, eVar.e, dArr112, 0, Math.min(iB2, iD - eVar.e));
        ytd[] ytdVarArrA6 = yth.a(dArr112, this.bf.a() + (this.bf.e() / 2), this.bf.d(), this.bf.e());
        new ytp.c();
        new ytp.c();
        ytdVarArrC = yth.c(ytg.b().d(), ytg.b().a());
        ytd[] ytdVarArrA7 = ytp.a(4096);
        System.arraycopy(ytdVarArrA5, 0, ytdVarArrA7, 0, iB2);
        double d116 = d11;
        dArrD3 = ytn.d(this.dd, ytdVarArrA7, iE, iB2, d116);
        ytdVarArrB = ytn.b(this.dd, ytdVarArrA7, iE, iB2, d116);
        ytd[] ytdVarArrA8 = ytp.a(4096);
        System.arraycopy(ytdVarArrA6, 0, ytdVarArrA8, 0, iB2);
        double d25 = d11;
        dArrD4 = ytn.d(this.dc, ytdVarArrA8, iE, iB2, d25);
        ytdVarArrB2 = ytn.b(this.dc, ytdVarArrA8, iE, iB2, d25);
        if (this.bf.a() == 14000) {
            cVarA = ytp.c(dArrD3);
        } else {
            cVarA = ytp.a(ytdVarArrB, ytdVarArrC, 61);
        }
        Log.e("UltraAlg", "pathLeftClass2: " + Arrays.toString(cVarA.d));
        Log.e("UltraAlg", "pathLeftClass2.disIdx: " + cVarA.f53877c);
        Log.e("MultipathCancel", "pathLeftClass2: " + Arrays.toString(cVarA.d));
        Log.e("MultipathCancel", "pathLeftClass2.disIdx: " + cVarA.f53877c);
        if (this.bf.a() == 14000) {
            cVarA2 = ytp.c(dArrD4);
        } else {
            cVarA2 = ytp.a(ytdVarArrB2, ytdVarArrC, 61);
        }
        Log.e("UltraAlg", "pathRightClass2: " + Arrays.toString(cVarA2.d));
        Log.e("UltraAlg", "pathRightClass2.disIdx: " + cVarA2.f53877c);
        Log.e("MultipathCancel", "pathRightClass2: " + Arrays.toString(cVarA2.d));
        Log.e("MultipathCancel", "pathRightClass2.disIdx: " + cVarA2.f53877c);
        iArr = cVarA.d;
        iArr2 = cVarA2.d;
        length = iArr.length;
        dArr3 = new double[length];
        length2 = iArr2.length;
        dArr4 = new double[length2];
        if (this.bf.a() >= 14000) {
            while (i10 < length) {
                dArr3[i10] = dArrD3[iArr[i10]];
            }
            while (i11 < length2) {
                dArr4[i11] = dArrD4[iArr2[i11]];
            }
        } else {
            while (i4 < length) {
                dArr3[i4] = cVarA.f53876a[i4];
            }
            while (i5 < length2) {
                dArr4[i5] = cVarA2.f53876a[i5];
            }
        }
        Log.i("UltraAlg", "pathTargetAbsLeft2: " + Arrays.toString(dArr3));
        Log.i("UltraAlg", "pathTargetAbsRight2: " + Arrays.toString(dArr4));
        Log.i("MultipathCancel", "pathTargetAbsLeft2: " + Arrays.toString(dArr3));
        Log.i("MultipathCancel", "pathTargetAbsRight2: " + Arrays.toString(dArr4));
        int[] iArrC3 = ytp.c(iArr, eVar2.e);
        int[] iArrC4 = ytp.c(iArr2, eVar.e);
        cVar = cVarA2;
        cVar2 = cVarA;
        double d26 = d11;
        ytp.e eVar5 = eVar2;
        ytp.e eVar6 = eVar;
        bVarA = ytp.a(iArrC3, dArr3, cVarA.e, iArrC4, dArr4, cVarA2.e, i, this.bf.a());
        double d27 = this.cb * d26;
        double d28 = this.bz * d26;
        if (this.bf.a() >= 14000) {
            dMax = Math.min(d6, d4);
        } else {
            dMax = Math.max(d6, d4);
        }
        Log.e("UltraAlg", "startpointTmpLeft2.max: " + eVar5.d);
        Log.e("UltraAlg", "startpointTmpRight2.max: " + eVar6.d);
        Log.e("UltraAlg", "micGain: " + d26);
        Log.e("UltraAlg", "weakSigTh: " + d27);
        Log.e("UltraAlg", "weakSigTh2: " + d28);
        int iC2 = yth.c(d7, d8, d27, d28, this.ev, dMax, bVarA.f53875c);
        Log.i("DelayGap", "delayGap: " + bVarA.f53873a);
        Log.e("UltraAlg", "dataProcFlagOri: " + iC2);
        Log.e("UltraAlg", "delayPoint2.delayPoints: " + bVarA.f53873a);
        Log.e("UltraAlg", "delayPoint2-L-R-Points: " + bVarA.d + "; " + bVarA.e);
        i6 = bVarA.d - eVar5.e;
        i7 = bVarA.e - eVar6.e;
        if (i6 < 0) {
            d9 = dArrD3[0];
        } else {
            d9 = dArrD3[i6];
        }
        if (i7 < 0) {
            d10 = dArrD4[0];
        } else {
            d10 = dArrD4[i7];
        }
        Log.e("UltraAlg", "pointValueLeft-Rit: " + d9 + "; " + d10);
        if (Math.max(d9, d10) < 150.0d) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        Log.e("UltraAlg", "disCalFlag: " + i8);
        bVarA.d = yth.b(this.ad, i8, bVarA, cVar2.f53877c, cVar.f53877c, eVar5.e, eVar6.e);
        Log.e("UltraAlg", "delayPoint2.delayPointsLeft: " + bVarA.d);
        if (this.ds) {
            b(yth.d(this.k, this.f53812c, dArr6), yth.d(this.k, this.f53812c, dArr7), bVarA.d);
        }
        double dMin2 = Math.min(d7, d8);
        Log.e("UltraAlg", "firstAngleDisRssi: " + dMin2);
        this.ej = Math.max(d7, d8);
        this.ef = Math.min(d7, d8);
        Log.e("UltraAlg", "finalRssiMax: " + this.ej + "  finalRssiMin: " + this.ef);
        if (this.bf.a() >= 14000) {
            this.eu = Math.min(dArrD5[i2], dArrD6[i3]);
            this.ew = Math.max(d7, d8);
        }
        if (this.ds) {
            if (this.bf.a() >= 14000) {
                Log.e("UltraAlg", "1418 resRssiMax: " + this.ej + "resRssiMin: " + this.ef);
                if (this.cz) {
                    this.dr = Math.max(cVar2.e, cVar.e);
                }
            } else {
                Log.e("UltraAlg", "611 resRssiMax: " + this.ej + "resRssiMin: " + this.ef);
                if (this.cz) {
                    this.dw = Math.max(cVar2.e, cVar.e);
                }
            }
        }
        return new ytb(iC2, bVarA, dMin2);
    }

    public void c(yti ytiVar) {
        ytl ytlVar = new ytl();
        ytlVar.c(6, ytiVar.d(), ytiVar.a(), ytiVar.a() + ytiVar.e(), true);
        this.o = ytlVar.d();
        this.e = ytlVar.c();
        ytlVar.c(6, ytiVar.d(), ytiVar.c(), ytiVar.c() + ytiVar.e(), true);
        this.n = ytlVar.d();
        this.d = ytlVar.c();
        if (this.ds && this.em.equals(ProductID.HWTAG.getProductID())) {
            yti ytiVar2 = new yti(OpusUtil.SAMPLE_RATE, 5000, 6000, 8500);
            ytlVar.c(6, ytiVar2.d(), ytiVar2.a(), ytiVar2.a() + ytiVar2.e(), true);
            this.k = ytlVar.d();
            this.f53812c = ytlVar.c();
        }
    }

    public FreqParam b(ytj ytjVar, Context context) {
        Log.i("UltraAlg", "Positioning is initialize... Version_ParameterSinking_TAG 2025-0625");
        this.be = ytjVar.b();
        this.br = ytjVar.d();
        this.ap = ytjVar.c();
        Log.i("UltraAlg", "Positioning is initialize... productId:  " + this.be + "  sequence: " + this.br + "  foldState: " + this.ap);
        ysz.d dVarA = ysz.d().a(context, this.ap);
        ytc ytcVarC = dVarA.c();
        this.cu = ytcVarC;
        Map<Integer, List<ytf>> mapB = ytcVarC.b();
        this.bg = dVarA.b();
        ysz.c cVarB = ysz.d().b(context, this.be, this.br);
        this.az = cVarB.d().e();
        ytf ytfVar = mapB.get(Integer.valueOf(this.ap)).get(0);
        this.cd = ytfVar.c();
        this.ck = ytfVar.d();
        this.au = ytfVar.e();
        ytf ytfVar2 = mapB.get(Integer.valueOf(this.ap)).get(1);
        this.cf = ytfVar2.c();
        this.cl = ytfVar2.d();
        this.av = ytfVar2.e();
        ytf ytfVar3 = mapB.get(Integer.valueOf(this.ap)).get(2);
        this.cc = ytfVar3.c();
        this.cg = ytfVar3.d();
        ytf ytfVar4 = mapB.get(Integer.valueOf(this.ap)).get(3);
        this.ce = ytfVar4.c();
        this.ci = ytfVar4.d();
        this.ar = cVarB.d().d();
        this.t = this.cu.e();
        Log.e("UltraAlg", "channelOrder is: " + this.t);
        int i = ch;
        cq = new long[i];
        cp = new long[i];
        cn = new int[i];
        this.bu = 0L;
        this.bx = this.l;
        this.z = 0;
        this.aa = 0;
        this.s = 3;
        this.bs = 0;
        this.da = -500.0f;
        this.at = 0.0f;
        this.ax = false;
        this.ad = 0;
        this.bk = 0.0d;
        this.bp = 0.0d;
        this.bm = false;
        this.bt = 3.45E-4f;
        this.bv = 0;
        this.bb = -500.0f;
        this.en = 0;
        this.eu = 0.0d;
        this.ew = 0.0d;
        this.x = 23;
        this.ek = 0.0f;
        Log.i("UltraAlg", "xMic1: " + this.cc + " xMic2: " + this.ce + " yMic1: " + this.cg + " yMic2: " + this.ci);
        this.cv = c(this.cu.d());
        StringBuilder sb = new StringBuilder("angleCal: ");
        sb.append(this.cv);
        Log.i("UltraAlg", sb.toString());
        this.ct = 0;
        this.cs = 0;
        this.g = 0.0f;
        this.h = 0.0f;
        this.f = 0.0f;
        this.j = 0.0f;
        this.ei = true;
        this.ak = 0;
        this.aj = 0;
        this.ao = 0;
        this.q = 2;
        this.bj = 0;
        this.ag = 0;
        this.bd = false;
        this.al = 0;
        this.f53811a = new CopyOnWriteArrayList<>();
        this.ae = new CopyOnWriteArrayList<>();
        this.bi = new CopyOnWriteArrayList<>();
        this.i = 0;
        this.cj = 0;
        this.am = false;
        this.ai = 0;
        this.v = false;
        this.aq = 2;
        this.r = 0;
        this.bo = new CopyOnWriteArrayList<>();
        this.bn = new CopyOnWriteArrayList<>();
        this.by = 0;
        this.ca = 0;
        this.cz = false;
        this.ex = 0;
        this.em = cVarB.d().a().split(Constants.LINK)[0];
        FreqParam freqParamC = ytk.d().c(this.em, 14000);
        Log.e("UltraAlg", "freqParam initialize based on: " + this.em);
        this.bc = ProductID.isInvolveHeadsetProduct(this.be) && this.br == 0;
        if (this.em.equals(ProductID.HWTAG.getProductID())) {
            this.ds = true;
            this.dl = false;
            this.dk = 0;
            this.ed = ytk.d().a(context, this.bg, this.em, 14000);
            this.ec = ytk.d().c(context, this.bg, this.em, 14000);
            this.dv = ytk.d().d(context, this.bg, this.em, 14000);
            if (this.ds) {
                this.ea = ytk.d().a(context, this.bg, this.em, 6000);
                this.ee = ytk.d().c(context, this.bg, this.em, 6000);
                this.eb = ytk.d().d(context, this.bg, this.em, 6000);
            }
        } else if (ProductID.isInvolveHeadsetProduct(this.em)) {
            this.ds = false;
            for (ProductID productID : EnumSet.of(ProductID.PIANO, ProductID.DOVE, ProductID.PIANOP, ProductID.HARPER)) {
                if (productID.getProductID().equals(this.em)) {
                    this.dn = productID;
                    break;
                }
            }
            Log.e("UltraAlg", " originalSigLp initialize based on: " + this.em);
            this.ed = ytk.d().a(context, this.bg, this.em, this.dn.getInitFreq());
            this.ec = ytk.d().c(context, this.bg, this.em, this.dn.getInitFreq());
            this.dv = ytk.d().d(context, this.bg, this.em, this.dn.getInitFreq());
        }
        Log.i("UltraAlg", "gMic1: " + this.ar);
        if (this.ds) {
            this.dx = yth.c(this.ec, this.dv);
            this.bf = new yti(OpusUtil.SAMPLE_RATE, 4000, 14000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
            this.bh = ytk.d().c(this.em, this.bg, this.bf.a());
            Log.i("UltraAlg", "posParam initialize based on: " + this.em);
            int iE = this.bh.e();
            ytd[] ytdVarArrA = ytp.a(this.cw);
            this.df = ytdVarArrA;
            System.arraycopy(this.dx, 0, ytdVarArrA, 0, iE);
            this.df = ytn.e(this.df);
            ytd[] ytdVarArrA2 = ytp.a(this.cw);
            this.de = ytdVarArrA2;
            System.arraycopy(this.dx, 0, ytdVarArrA2, 0, iE);
            this.de = ytn.e(this.de);
            this.dz = yth.c(this.ee, this.eb);
            this.bf = new yti(OpusUtil.SAMPLE_RATE, 5000, 6000, 8500);
            this.bh = ytk.d().c(this.em, this.bg, this.bf.a());
            Log.i("UltraAlg", "posParam initialize based on: " + this.em);
            int iE2 = this.bh.e();
            ytd[] ytdVarArrA3 = ytp.a(this.cw);
            this.db = ytdVarArrA3;
            System.arraycopy(this.dz, 0, ytdVarArrA3, 0, iE2);
            this.db = ytn.e(this.db);
            ytd[] ytdVarArrA4 = ytp.a(this.cw);
            this.dj = ytdVarArrA4;
            System.arraycopy(this.dz, 0, ytdVarArrA4, 0, iE2);
            this.dj = ytn.e(this.dj);
        } else {
            this.dy = yth.c(this.ec, this.dv);
            this.bf = new yti(OpusUtil.SAMPLE_RATE, 4000, this.dn.getInitFreq(), this.dn.getInitFreq() + 2000);
            this.bh = ytk.d().c(this.em, this.bg, this.bf.a());
            Log.i("UltraAlg", "posParam initialize based on: " + this.em);
            int iE3 = this.bh.e();
            ytd[] ytdVarArrA5 = ytp.a(this.cw);
            this.dd = ytdVarArrA5;
            System.arraycopy(this.dy, 0, ytdVarArrA5, 0, iE3);
            this.dd = ytn.e(this.dd);
            ytd[] ytdVarArrA6 = ytp.a(this.cw);
            this.dc = ytdVarArrA6;
            System.arraycopy(this.dy, 0, ytdVarArrA6, 0, iE3);
            this.dc = ytn.e(this.dc);
        }
        if (this.bh.d() == 680) {
            this.ey = 600;
        } else {
            this.ey = 300;
        }
        Log.i("UltraAlg", "Init: " + this.bh.toString());
        return freqParamC;
    }

    public void a() {
        Log.e("UltraAlg", " angle Meas initialize... ");
        this.x = 23;
        this.ek = 0.0f;
        this.ct = 0;
        this.cs = 0;
        this.g = 0.0f;
        this.h = 0.0f;
        this.f = 0.0f;
        this.j = 0.0f;
        this.ei = true;
        this.ak = 0;
        this.aj = 0;
        this.ao = 0;
        this.q = 2;
        this.bj = 0;
        this.ag = 0;
        this.bd = false;
        this.al = 0;
        this.f53811a = new CopyOnWriteArrayList<>();
        this.ae = new CopyOnWriteArrayList<>();
        this.bi = new CopyOnWriteArrayList<>();
        this.i = 0;
        this.cj = 0;
        this.am = false;
        this.ai = 0;
        this.v = false;
        this.aq = 2;
        this.bo = new CopyOnWriteArrayList<>();
        this.bn = new CopyOnWriteArrayList<>();
    }

    public void d() {
        Log.e("UltraAlg", " dis Meas initialize... ");
        int i = ch;
        cq = new long[i];
        cp = new long[i];
        cn = new int[i];
        this.bu = 0L;
        this.bx = this.l;
        this.z = 0;
        this.aa = 0;
        this.s = 3;
        this.bs = 0;
        this.da = -500.0f;
        this.at = 0.0f;
        this.ax = false;
        this.ad = 0;
        this.bk = 0.0d;
        this.bp = 0.0d;
        this.bm = false;
        this.bv = 0;
        this.bb = -500.0f;
    }

    private double c(String str) {
        double dAtan = ProductID.isInvolveHeadsetProduct(this.be) ? (Math.atan((this.cc - this.ce) / (this.cg - this.ci)) / 3.141592653589793d) * 180.0d : 0.0d;
        if (str.equals("GRL-AL10") && this.ap == 0) {
            return 90.0d;
        }
        return dAtan;
    }

    private void b(double[] dArr, double[] dArr2, int i) {
        double d;
        double dMax;
        double d2;
        double d3;
        double dAbs;
        int i2;
        int i3 = this.ex;
        if (i3 == 0) {
            int i4 = 0;
            double dMax2 = 0.0d;
            double dMax3 = 0.0d;
            double dMax4 = 0.0d;
            while (i4 < 3) {
                int i5 = (i4 * 2400) + 12480;
                double dAbs2 = 0.0d;
                double dAbs3 = 0.0d;
                while (true) {
                    i2 = i4 + 1;
                    if (i5 < (i2 * 2400) + 12480) {
                        dAbs2 += Math.abs(dArr[i5]);
                        dAbs3 += Math.abs(dArr2[i5]);
                        i5++;
                    }
                }
                double d4 = 2400;
                double d5 = dAbs2 / d4;
                dMax3 = Math.max(d5, dMax3);
                double d6 = dAbs3 / d4;
                dMax4 = Math.max(d6, dMax4);
                Log.i("FrequencySwitch", "sigPowMean1: " + d5 + " sigPowMean2: " + d6);
                i4 = i2;
                dMax2 = Math.max(dMax3, dMax4);
            }
            double d7 = this.eo;
            Log.i("FrequencySwitch", "611sigInterfereH2LPowMean1: " + dMax3 + " 611sigInterfereH2LPowMean2: " + dMax4);
            StringBuilder sb = new StringBuilder("sigPowMean: ");
            sb.append(dMax2);
            sb.append(" thrH2L: ");
            sb.append(d7);
            sb.append(" sigPowMean < thrH2L: ");
            sb.append(dMax2 < d7);
            Log.i("FrequencySwitch", sb.toString());
            if (dMax2 < d7) {
                this.dp++;
            } else {
                this.dp = 0;
            }
            Log.i("FrequencySwitch", "interfere-611H2LCount: " + this.dp);
            return;
        }
        if (i3 == 1) {
            int i6 = i + 9000;
            int i7 = i + 11400;
            int iMin = Math.min(i7, dArr.length);
            if (i7 <= dArr.length) {
                double dAbs4 = 0.0d;
                for (int i8 = i6; i8 < iMin; i8++) {
                    dAbs4 += Math.abs(dArr[i8]);
                }
                double dAbs5 = 0.0d;
                for (int i9 = i6; i9 < iMin; i9++) {
                    dAbs5 += Math.abs(dArr2[i9]);
                }
                double d8 = iMin - i6;
                d = dAbs4 / d8;
                dMax = dAbs5 / d8;
            } else {
                d = 0.0d;
                dMax = 0.0d;
            }
            Log.i("FrequencySwitch", "9000  sigPowMean1: " + d + " sigPowMean2: " + dMax);
            int i10 = i + (-7000);
            int iMax = Math.max(i10, 0);
            int i11 = iMax + 2400;
            if (i10 >= 0) {
                double dAbs6 = 0.0d;
                for (int i12 = iMax; i12 < i11; i12++) {
                    dAbs6 += Math.abs(dArr[i12]);
                }
                dAbs = 0.0d;
                for (int i13 = iMax; i13 < i11; i13++) {
                    dAbs += Math.abs(dArr2[i13]);
                }
                double d9 = i11 - iMax;
                double dMax5 = Math.max(d, dAbs6 / d9);
                dMax = Math.max(dMax, dAbs / d9);
                d2 = dMax5;
                d3 = dAbs6;
            } else {
                d2 = d;
                d3 = 0.0d;
                dAbs = 0.0d;
            }
            double d10 = i11 - iMax;
            double dMax6 = Math.max(d2, dMax);
            Log.i("FrequencySwitch", "7000  sigPowMean1: " + (d3 / d10) + " sigPowMean2: " + (dAbs / d10));
            StringBuilder sb2 = new StringBuilder("sigPowMean: ");
            sb2.append(dMax6);
            Log.i("FrequencySwitch", sb2.toString());
            Log.i("FrequencySwitch", "611sigInterfereL2HPowMean1: " + d2 + " 611sigInterfereL2HPowMean2: " + dMax);
            if (dMax6 > this.el) {
                this.du++;
            } else {
                this.du = 0;
            }
            Log.i("FrequencySwitch", "interf611L2HCount: " + this.du);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x028d  */
    /* JADX WARN: Code duplicated, block: B:41:0x028f  */
    /* JADX WARN: Code duplicated, block: B:47:0x029f  */
    /* JADX WARN: Code duplicated, block: B:53:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x02df  */
    /* JADX WARN: Code duplicated, block: B:64:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0305 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0307  */
    /* JADX WARN: Code duplicated, block: B:68:0x0393  */
    /* JADX WARN: Code duplicated, block: B:71:0x0402  */
    /* JADX WARN: Code duplicated, block: B:72:0x04a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x02bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x02e3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0307, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0393, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0402, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x04a0, please report this as an issue */
    public float a(float f, int i, double d, float f2, int i2) {
        String str;
        float f3;
        float f4;
        String str2;
        double d2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f5;
        float f6;
        this.ct++;
        Log.e("UltraAlg", "angleCalCount: " + this.ct);
        Log.e("UltraAlg", "angle_now: " + f);
        ytm.c(this.bn, 4, this.ek);
        if (i2 == 1) {
            ytm.c(this.bo, 4, this.ek);
        }
        Log.e("UltraAlg", "sensorAll: " + this.bn.toString());
        Log.e("UltraAlg", "sensorJustCount: " + this.bo.toString());
        int size = this.bn.size();
        int i3 = size + (-1);
        float fFloatValue = this.bn.get(i3).floatValue();
        float fA = ytm.a(fFloatValue);
        if (i3 >= 1) {
            fFloatValue = this.bn.get(i3).floatValue() - this.bn.get(size - 2).floatValue();
            fA = ytm.a(fFloatValue);
        }
        float f7 = fA;
        if (this.bo.size() == 0) {
            ytm.c(this.bo, 4, 0.0f);
        }
        int size2 = this.bo.size();
        int i4 = size2 - 1;
        float fA2 = ytm.a(this.bo.get(i4).floatValue());
        if (i4 >= 1) {
            fA2 = ytm.a(this.bo.get(i4).floatValue() - this.bo.get(size2 - 2).floatValue());
        }
        Log.e("UltraAlg", "rotateFlag: " + this.ei);
        Log.e("UltraAlg", "resultFlag: " + i);
        a(i, i2, f, f7);
        float fB = b(fA2, i4);
        Log.e("UltraAlg", "angleLast: " + this.g);
        Log.e("UltraAlg", "deltaRotateAngle: " + fB);
        int iC = c(i2, fB);
        Log.e("UltraAlg", "angleStaticCount: " + this.i);
        float fB2 = ytm.b(fFloatValue);
        Log.e("UltraAlg", "deltaRotateAngle1TmpTmp: " + fB2);
        Log.e("UltraAlg", "expCount: " + this.ag);
        Log.e("UltraAlg", "sigRssi: " + d);
        double dB = b(i, f2);
        Log.e("UltraAlg", "firstDisplayThr: " + this.an);
        Log.e("UltraAlg", "distance: " + f2);
        Log.e("UltraAlg", "firstThr: " + dB);
        float f8 = fB2;
        float f9 = fB;
        c(i2, f, d, dB);
        Log.e("UltraAlg", "firstCondCnt: " + this.ai);
        Log.e("UltraAlg", "firstDisplayFlag: " + this.am);
        Log.e("UltraAlg", "firstRotateCount: " + this.al);
        this.as = false;
        String str3 = "rotateAngleArray2: ";
        String str4 = "filterAngleArray: ";
        if (this.s == 1 || i2 == 0 || i != 4) {
            str3 = str3;
            str4 = str4;
            str = "fuzzyFlag: ";
            f8 = f8;
            f3 = f7;
            f4 = 1.0f;
        } else {
            String str5 = "angleOri-angleDeM-deltaRotateAngle1: ";
            if (this.ct >= 1 && this.am) {
                if (this.ei) {
                    Log.e("UltraAlg", "first time to deM ");
                    boolean z5 = Math.abs(f9) >= this.w && Math.abs(this.g - f) >= 1.0E-6f;
                    if (Math.abs(f) <= this.af) {
                        d2 = dB;
                        boolean z6 = d >= d2;
                        if (this.ct > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.i >= this.bw || this.cj < 3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (Math.abs(f) <= 20.0f || d < d2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z5 && z6 && z) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z2) {
                            Log.e("UltraAlg", "cond02 zeroAngleCnt1: " + this.cj);
                            this.j = 0.0f;
                            this.bd = true;
                            j();
                            this.v = true;
                        } else {
                            if (z3) {
                                this.j = 0.0f;
                                this.bd = true;
                                this.v = false;
                                this.al = 0;
                                this.cj++;
                                Log.e("UltraAlg", "cond03 zeroAngleCnt1: " + this.cj);
                            } else if (z4) {
                                Log.e("UltraAlg", "first Time deM ");
                                this.ei = false;
                                this.bd = true;
                                this.v = false;
                                this.cj = 0;
                                float f10 = this.g;
                                f6 = f9;
                                float f11 = f10 - f6;
                                float f12 = (-f10) - f6;
                                Log.e("UltraAlg", "phi_11_now: " + f11);
                                Log.e("UltraAlg", "phi_12_now: " + f12);
                                float fD = ytm.d(Math.abs(f11 - f));
                                float fD2 = ytm.d(Math.abs(f11 + f));
                                float fD3 = ytm.d(Math.abs(f12 - f));
                                float fMin = Math.min(Math.min(fD, fD2), Math.min(fD3, ytm.d(Math.abs(f12 + f))));
                                b(fMin, fD, fD3, f);
                                Log.e("UltraAlg", "A_target: " + fMin);
                                this.al = 0;
                                f9 = f6;
                                f5 = 1.0f;
                            } else {
                                Log.e("UltraAlg", "not 0° around, The deM condition is not met.··· ");
                                this.v = false;
                                this.cj = 0;
                                this.al++;
                                Log.e("UltraAlg", str4 + this.ae.toString());
                                Log.e("UltraAlg", str3 + this.bi.toString());
                                float[] fArrB = ytm.b(this.ae, this.bi, f8);
                                Log.e("UltraAlg", "angleBetaArray2: " + Arrays.toString(fArrB));
                                f5 = 1.0f;
                                a(fArrB, d, d2);
                                i();
                            }
                            if (this.ag <= iC) {
                                Log.e("UltraAlg", "exception count in notDeM··· ");
                                Log.e("UltraAlg", str4 + this.ae.toString());
                                Log.e("UltraAlg", str3 + this.bi.toString());
                                float[] fArrB2 = ytm.b(this.ae, this.bi, f8);
                                float fA3 = ytm.a(fArrB2);
                                Log.e("UltraAlg", "angleBetaArray2: " + Arrays.toString(fArrB2));
                                Log.e("UltraAlg", "angleBetaMean2: " + fA3);
                                float fE = e(f);
                                float fMin2 = Math.min(Math.abs(ytm.a(fE - fA3)), Math.abs(ytm.a((-fE) - fA3)));
                                Log.e("UltraAlg", "minTmpCc0: " + fMin2);
                                b(fMin2, fArrB2, 0, 0.0f, 0.0f);
                                str = "fuzzyFlag: ";
                                f4 = f5;
                                str2 = "; ";
                                f3 = f7;
                                str5 = "angleOri-angleDeM-deltaRotateAngle1: ";
                            } else {
                                a();
                                this.j = f5;
                                Log.e("UltraAlg", ((String) r20) + this.as);
                                Log.e("UltraAlg", "angleOri-angleDeM-deltaRotateAngle1: " + f + "; " + this.j + "; " + f7);
                                return this.j;
                            }
                        }
                        f6 = f9;
                        f9 = f6;
                        f5 = 1.0f;
                        if (this.ag <= iC) {
                            Log.e("UltraAlg", "exception count in notDeM··· ");
                            Log.e("UltraAlg", str4 + this.ae.toString());
                            Log.e("UltraAlg", str3 + this.bi.toString());
                            float[] fArrB3 = ytm.b(this.ae, this.bi, f8);
                            float fA4 = ytm.a(fArrB3);
                            Log.e("UltraAlg", "angleBetaArray2: " + Arrays.toString(fArrB3));
                            Log.e("UltraAlg", "angleBetaMean2: " + fA4);
                            float fE2 = e(f);
                            float fMin3 = Math.min(Math.abs(ytm.a(fE2 - fA4)), Math.abs(ytm.a((-fE2) - fA4)));
                            Log.e("UltraAlg", "minTmpCc0: " + fMin3);
                            b(fMin3, fArrB3, 0, 0.0f, 0.0f);
                            str = "fuzzyFlag: ";
                            f4 = f5;
                            str2 = "; ";
                            f3 = f7;
                            str5 = "angleOri-angleDeM-deltaRotateAngle1: ";
                        } else {
                            a();
                            this.j = f5;
                            Log.e("UltraAlg", ((String) r20) + this.as);
                            Log.e("UltraAlg", "angleOri-angleDeM-deltaRotateAngle1: " + f + "; " + this.j + "; " + f7);
                            return this.j;
                        }
                    } else {
                        d2 = dB;
                    }
                    if (this.ct > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.i >= this.bw) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (Math.abs(f) <= 20.0f) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (!z5) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z2) {
                        Log.e("UltraAlg", "cond02 zeroAngleCnt1: " + this.cj);
                        this.j = 0.0f;
                        this.bd = true;
                        j();
                        this.v = true;
                    } else {
                        if (z3) {
                            this.j = 0.0f;
                            this.bd = true;
                            this.v = false;
                            this.al = 0;
                            this.cj++;
                            Log.e("UltraAlg", "cond03 zeroAngleCnt1: " + this.cj);
                        } else if (z4) {
                            Log.e("UltraAlg", "first Time deM ");
                            this.ei = false;
                            this.bd = true;
                            this.v = false;
                            this.cj = 0;
                            float f13 = this.g;
                            f6 = f9;
                            float f14 = f13 - f6;
                            float f15 = (-f13) - f6;
                            Log.e("UltraAlg", "phi_11_now: " + f14);
                            Log.e("UltraAlg", "phi_12_now: " + f15);
                            float fD4 = ytm.d(Math.abs(f14 - f));
                            float fD5 = ytm.d(Math.abs(f14 + f));
                            float fD6 = ytm.d(Math.abs(f15 - f));
                            float fMin4 = Math.min(Math.min(fD4, fD5), Math.min(fD6, ytm.d(Math.abs(f15 + f))));
                            b(fMin4, fD4, fD6, f);
                            Log.e("UltraAlg", "A_target: " + fMin4);
                            this.al = 0;
                            f9 = f6;
                            f5 = 1.0f;
                        } else {
                            Log.e("UltraAlg", "not 0° around, The deM condition is not met.··· ");
                            this.v = false;
                            this.cj = 0;
                            this.al++;
                            Log.e("UltraAlg", str4 + this.ae.toString());
                            Log.e("UltraAlg", str3 + this.bi.toString());
                            float[] fArrB4 = ytm.b(this.ae, this.bi, f8);
                            Log.e("UltraAlg", "angleBetaArray2: " + Arrays.toString(fArrB4));
                            f5 = 1.0f;
                            a(fArrB4, d, d2);
                            i();
                        }
                        if (this.ag <= iC) {
                            Log.e("UltraAlg", "exception count in notDeM··· ");
                            Log.e("UltraAlg", str4 + this.ae.toString());
                            Log.e("UltraAlg", str3 + this.bi.toString());
                            float[] fArrB5 = ytm.b(this.ae, this.bi, f8);
                            float fA5 = ytm.a(fArrB5);
                            Log.e("UltraAlg", "angleBetaArray2: " + Arrays.toString(fArrB5));
                            Log.e("UltraAlg", "angleBetaMean2: " + fA5);
                            float fE3 = e(f);
                            float fMin5 = Math.min(Math.abs(ytm.a(fE3 - fA5)), Math.abs(ytm.a((-fE3) - fA5)));
                            Log.e("UltraAlg", "minTmpCc0: " + fMin5);
                            b(fMin5, fArrB5, 0, 0.0f, 0.0f);
                            str = "fuzzyFlag: ";
                            f4 = f5;
                            str2 = "; ";
                            f3 = f7;
                            str5 = "angleOri-angleDeM-deltaRotateAngle1: ";
                        } else {
                            a();
                            this.j = f5;
                            Log.e("UltraAlg", ((String) r20) + this.as);
                            Log.e("UltraAlg", "angleOri-angleDeM-deltaRotateAngle1: " + f + "; " + this.j + "; " + f7);
                            return this.j;
                        }
                    }
                    f6 = f9;
                    f9 = f6;
                    f5 = 1.0f;
                    if (this.ag <= iC) {
                        Log.e("UltraAlg", "exception count in notDeM··· ");
                        Log.e("UltraAlg", str4 + this.ae.toString());
                        Log.e("UltraAlg", str3 + this.bi.toString());
                        float[] fArrB6 = ytm.b(this.ae, this.bi, f8);
                        float fA6 = ytm.a(fArrB6);
                        Log.e("UltraAlg", "angleBetaArray2: " + Arrays.toString(fArrB6));
                        Log.e("UltraAlg", "angleBetaMean2: " + fA6);
                        float fE4 = e(f);
                        float fMin6 = Math.min(Math.abs(ytm.a(fE4 - fA6)), Math.abs(ytm.a((-fE4) - fA6)));
                        Log.e("UltraAlg", "minTmpCc0: " + fMin6);
                        b(fMin6, fArrB6, 0, 0.0f, 0.0f);
                        str = "fuzzyFlag: ";
                        f4 = f5;
                        str2 = "; ";
                        f3 = f7;
                        str5 = "angleOri-angleDeM-deltaRotateAngle1: ";
                    } else {
                        a();
                        this.j = f5;
                        Log.e("UltraAlg", ((String) r20) + this.as);
                        Log.e("UltraAlg", "angleOri-angleDeM-deltaRotateAngle1: " + f + "; " + this.j + "; " + f7);
                        return this.j;
                    }
                } else {
                    str3 = str3;
                    str4 = str4;
                    Log.e("UltraAlg", "Follow-up deM ");
                    if (this.ag <= iC) {
                        Log.e("UltraAlg", str4 + this.ae.toString());
                        Log.e("UltraAlg", str3 + this.bi.toString());
                        float[] fArrB7 = ytm.b(this.ae, this.bi, f8);
                        Log.e("UltraAlg", "angleBetaArray2: " + Arrays.toString(fArrB7));
                        float fA7 = ytm.a(fArrB7);
                        Log.e("UltraAlg", "angleBetaMean2: " + fA7);
                        float fA8 = a(f);
                        Log.e("UltraAlg", "zeroAngleCnt1: " + this.cj);
                        if (this.i >= this.bw && this.cj >= 3) {
                            this.j = 0.0f;
                            j();
                            this.v = true;
                            str2 = "; ";
                            str5 = "angleOri-angleDeM-deltaRotateAngle1: ";
                            str = "fuzzyFlag: ";
                            f4 = 1.0f;
                            f3 = f7;
                        } else {
                            this.v = false;
                            float fAbs = Math.abs(ytm.a(fA8 - fA7));
                            float fMin7 = Math.min(fAbs, Math.abs(ytm.a((-fA8) - fA7)));
                            Log.e("UltraAlg", "minTmp: " + fMin7);
                            f3 = f7;
                            str5 = "angleOri-angleDeM-deltaRotateAngle1: ";
                            b(fMin7, fArrB7, 1, fA8, fAbs);
                            str = "fuzzyFlag: ";
                            str2 = "; ";
                            f4 = 1.0f;
                        }
                    } else {
                        a();
                        this.j = 1.0f;
                        Log.e("UltraAlg", "fuzzyFlag: " + this.as);
                        Log.e("UltraAlg", "exceptions exceeds the threshold, prompts the user to rotate and restarts the deM.");
                        Log.e("UltraAlg", "angleOri-angleDeM-deltaRotateAngle1: " + f + "; " + this.j + "; " + f7);
                        return this.j;
                    }
                }
            } else {
                str3 = str3;
                str = "fuzzyFlag: ";
                str2 = "; ";
                f4 = 1.0f;
                str4 = str4;
                f3 = f7;
                this.j = 1.0f;
                d(d, dB);
                Log.e("UltraAlg", "prompted to rotate for the first time ");
            }
            this.f = this.h;
            this.h = this.g;
            this.g = f;
            Log.e("UltraAlg", "angle_final: " + this.j);
            Log.e("UltraAlg", str5 + f + str2 + this.j + str2 + f3);
        }
        Log.e("UltraAlg", str + this.as);
        Log.e("UltraAlg", "directZeroFlagOri: " + this.v);
        b(f9);
        Log.e("UltraAlg", "directZeroFlag: " + this.v);
        Log.e("UltraAlg", "recordFlag: " + this.bd);
        float fE5 = this.j;
        boolean z7 = Math.abs(fE5 - f4) > 1.0E-5f && i == 4 && Math.abs(f3 - 0.0f) >= 0.0f;
        if (z7) {
            Log.e("UltraAlg", "is result normal? : Yes");
            this.cs++;
            Log.e("UltraAlg", "angleFilterCount : " + this.cs);
            Log.e("UltraAlg", str4 + this.ae.toString());
            Log.e("UltraAlg", str3 + this.bi.toString());
            float f16 = f8;
            float[] fArrB8 = ytm.b(this.ae, this.bi, f16);
            Log.e("UltraAlg", "angleBetaArrayTmp: " + Arrays.toString(fArrB8));
            float[] fArr = new float[fArrB8.length + 1];
            System.arraycopy(fArrB8, 0, fArr, 0, fArrB8.length);
            fArr[fArrB8.length] = ytm.b(this.j);
            float fA9 = ytm.a(fArr);
            Log.e("UltraAlg", "angleBetaArray: " + Arrays.toString(fArr));
            Log.e("UltraAlg", "angleBetaMean: " + fA9);
            fE5 = e(fE5, fArr, fA9, fArrB8);
            if (this.s != 1) {
                this.ae = ytm.c(this.ae, 4, ytm.b(fE5));
                this.bi = ytm.c(this.bi, 4, f16);
            }
        } else {
            float f17 = f8;
            if (this.bd) {
                Log.e("UltraAlg", "is result normal? : No");
                fE5 = this.j;
                e(fE5, f17);
            }
        }
        Log.e("UltraAlg", "angleFilter: " + fE5);
        Log.e("UltraAlg", str4 + this.ae.toString());
        Log.e("UltraAlg", str3 + this.bi.toString());
        g(fE5);
        if (this.am && this.cu.d().equals("GRL-AL10") && z7 && this.ap == 0) {
            Log.e("UltraAlg", "GRL-AL10 angleCal foldState 0");
            float f18 = (float) (((double) this.j) + this.cv);
            this.j = f18;
            if (f18 > 180.0f) {
                this.j = f18 - 360.0f;
            }
        }
        return this.j;
    }

    public int c(int i, float f) {
        if (i == 1) {
            if (Math.abs(f) <= 5.0f) {
                this.i++;
            } else {
                this.i = 0;
            }
        }
        return (this.i < this.bw || !ProductID.isInvolveHeadsetProduct(this.em)) ? 3 : 6;
    }

    public double b(int i, float f) {
        double d;
        if (this.bf.a() >= 14000) {
            this.an = 24.0d;
            d = this.ar * 24.0d;
        } else {
            d = 32.0d;
            this.an = 32.0d;
        }
        if (i == 2 || f > 5.0f || f <= 0.0f) {
            return d;
        }
        double d2 = this.bz * this.ar;
        if (d2 < 5.0d) {
            return 4.0d;
        }
        return d2;
    }

    public void c(int i, float f, double d, double d2) {
        if (this.s != 1 && i != 0) {
            if (Math.abs(f) <= this.af && d >= d2) {
                this.ai++;
            } else {
                this.ai = 0;
            }
        }
        if (this.ai >= 3) {
            this.am = true;
        }
    }

    public void j() {
        if (this.v) {
            return;
        }
        this.ae = new CopyOnWriteArrayList<>();
        this.bi = new CopyOnWriteArrayList<>();
    }

    public void b(float f, float f2, float f3, float f4) {
        if (Math.abs(f - f2) < 0.001d || Math.abs(f - f3) < 0.001d) {
            this.j = f4;
        } else {
            this.j = -f4;
        }
    }

    public void a(float[] fArr, double d, double d2) {
        if (this.al < 4 && this.bd) {
            if (this.ae.size() >= 1) {
                this.j = Math.round(ytm.a(fArr[fArr.length - 1]) / 10.0f) * 10.0f;
                return;
            } else {
                this.j = this.j;
                return;
            }
        }
        this.j = 1.0f;
        this.ei = true;
        Log.e("UltraAlg", "The first deM fails, prompts the user to rotate. ");
    }

    public void i() {
        if (Math.abs(this.j) >= 30.0f) {
            this.ei = false;
            this.bd = true;
            this.al = 0;
        }
    }

    public void b(float f, float[] fArr, int i, float f2, float f3) {
        if (f > 40.0f) {
            this.ag++;
            this.j = Math.round(ytm.a(fArr[fArr.length - 1]) / 10.0f) * 10.0f;
            return;
        }
        this.ag = 0;
        if (i == 1) {
            if (Math.abs(f2 - 0.0f) < 0.001d) {
                this.j = f2;
            } else if (Math.abs(f - f3) < 0.001d) {
                this.j = f2;
            } else {
                this.j = -f2;
            }
        }
    }

    public void d(double d, double d2) {
        double d3 = this.bf.a() >= 14000 ? this.bz * this.ar : this.bz;
        if (d >= d2 || d <= d3) {
            return;
        }
        this.as = true;
    }

    public float a(float f) {
        if (Math.abs(f) <= 20.0f) {
            this.cj++;
            return 0.0f;
        }
        this.cj = 0;
        return f;
    }

    public float e(float f) {
        if (Math.abs(f - 20.0f) < 0.001d) {
            return 0.0f;
        }
        return f;
    }

    public void a(int i, int i2, float f, float f2) {
        if (i != 4 && this.s != 1 && i2 != 0) {
            this.f = this.h;
            this.h = this.g;
            this.g = f;
            if (!this.ei) {
                float f3 = this.j;
                Log.e("UltraAlg", "angleFinalFlag: " + f3);
                float f4 = f2 / 10.0f;
                this.j = ytm.a(f3 - (((float) Math.round(f4)) * 10.0f));
                Log.e("UltraAlg", " Math.round(deltaRotateAngle1 / 10f) * 10f: " + (Math.round(f4) * 10.0f));
                Log.e("UltraAlg", "angle_final: " + this.j);
            }
            Log.e("UltraAlg", "angleOri-angleDeM-deltaRotateAngle1: " + f + "; " + this.j + "; " + f2);
        }
        if (this.s == 1 || i2 == 0) {
            Log.e("UltraAlg", "This is calFlag = 0 or no change, case: " + i2 + "; " + this.s);
            if (!this.ei) {
                float f5 = f2 / 10.0f;
                this.j = ytm.a(this.j - (Math.round(f5) * 10.0f));
                Log.e("UltraAlg", "Math.round(sensorGap / 10) * 10: " + (Math.round(f5) * 10.0f));
                this.f = this.h;
                this.h = this.g;
                this.g = Math.abs(this.j);
            } else {
                this.f = this.h;
                this.h = this.g;
            }
            Log.e("UltraAlg", "angle_final: " + this.j);
            Log.e("UltraAlg", "angleOri-angleDeM-deltaRotateAngle1: " + f + "; " + this.j + "; " + f2);
        }
    }

    public float b(float f, int i) {
        if (this.bo.size() >= 4) {
            float fA = ytm.a(this.bo.get(i).floatValue() - this.bo.get(i - 1).floatValue());
            float fA2 = ytm.a(this.bo.get(i).floatValue() - this.bo.get(i - 2).floatValue());
            if (Math.abs(fA) < this.w && Math.abs(fA2) >= this.w) {
                this.g = this.h;
                f = fA2;
            }
        }
        if (this.bo.size() >= 5) {
            float fA3 = ytm.a(this.bo.get(i).floatValue() - this.bo.get(i - 1).floatValue());
            float fA4 = ytm.a(this.bo.get(i).floatValue() - this.bo.get(i - 2).floatValue());
            float fA5 = ytm.a(this.bo.get(i).floatValue() - this.bo.get(i - 3).floatValue());
            if (Math.abs(fA3) < this.w && Math.abs(fA4) < this.w && Math.abs(fA5) >= this.w) {
                this.g = this.f;
                return fA5;
            }
        }
        return f;
    }

    public void b(float f) {
        if (Math.abs(f) > 5.0f) {
            this.v = false;
        }
    }

    public float e(float f, float[] fArr, float f2, float[] fArr2) {
        float fE = this.v ? 0.0f : ytm.e(fArr, f2, 45.0f);
        if (Math.abs(f - 1.0f) >= 1.0E-5f) {
            return fE;
        }
        if (fArr2.length < 1) {
            return this.j;
        }
        return Math.round(ytm.a(fArr2[fArr2.length - 1]) / 10.0f) * 10.0f;
    }

    public void e(float f, float f2) {
        if (this.s != 1) {
            if (Math.abs(this.j - 1.0f) < 0.001d) {
                this.ae = ytm.c(this.ae, 4, 800.0f);
            } else {
                this.ae = ytm.c(this.ae, 4, ytm.b(f));
            }
            this.bi = ytm.c(this.bi, 4, f2);
        }
    }

    public void g(float f) {
        if (Math.abs(f - 1.0f) <= 0.5d) {
            f = this.j;
        }
        this.j = f;
        Log.e("UltraAlg", "angleFinal2: " + f);
        if (Math.abs(Math.abs(this.j) - 180.0f) < 0.001d) {
            this.j = 180.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x0142  */
    /* JADX WARN: Code duplicated, block: B:43:0x0161  */
    /* JADX WARN: Code duplicated, block: B:47:0x016a  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:52:0x019a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a3 A[LOOP:0: B:53:0x019f->B:55:0x01a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0228  */
    /* JADX WARN: Code duplicated, block: B:64:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0300 A[LOOP:1: B:68:0x02fc->B:70:0x0300, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0367  */
    /* JADX WARN: Code duplicated, block: B:79:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0408  */
    /* JADX WARN: Code duplicated, block: B:82:0x0410  */
    /* JADX WARN: Code duplicated, block: B:85:0x041b A[LOOP:2: B:83:0x0417->B:85:0x041b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x05ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0142, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x016f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x02aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x03e5, please report this as an issue */
    public float a(int i, long j, long j2, int i2, int i3) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        float f;
        float f2;
        float f3;
        float f4;
        float fMin;
        boolean z4;
        float f5;
        int i4;
        long j3;
        float[] fArr;
        float[] fArr2;
        int i5;
        float[] fArr3;
        int i6;
        ytp.d dVarD;
        float[] fArr4;
        int i7;
        ytp.d dVarD2;
        long j4 = j;
        Log.e("UltraAlg", "sigStartPoint-tT2-tT1: " + i + "; " + j2 + "; " + j4);
        if (i3 == 0) {
            Log.e("UltraAlg", "calFlag = 0. ");
            return this.bb;
        }
        long jD = this.bf.d();
        if (this.bf.a() >= 14000) {
            if (this.eu >= this.ep) {
                str = "UltraAlg";
                if (this.ew >= this.er * this.ar) {
                    this.en++;
                }
                if (j4 >= 0 || j2 < 0 || i < 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                str2 = str;
                Log.i(str2, "valueNorm: " + this.eu + " valueMicMax: " + this.ew + " rssiNearCount: " + this.en);
                if (this.en >= 3 || this.bf.a() < 14000) {
                    z3 = z;
                } else {
                    z3 = true;
                }
                if (z3) {
                    f = 0.5f;
                } else {
                    f = -500.0f;
                    if (z2) {
                        this.bb = -500.0f;
                        Log.e(str2, "lastDisCalFinal: " + this.bb);
                        Log.e(str2, "tT1-tT2-sigStartPoint negative numbers. ");
                        return -500.0f;
                    }
                }
                float f6 = j2 - j4;
                f2 = i;
                f3 = f;
                f4 = jD;
                fMin = (this.bt * (((this.bq * f2) / f4) + f6)) + this.cr;
                Log.e(str2, "soundSpeed: " + fMin);
                Log.e(str2, "(tT2 - tT1 + (float) sigStartPoint * secToMicsec / samplingRate): " + (f6 + ((((float) this.bq) * f2) / f4)));
                Log.e(str2, "delayDisDelta : " + this.cr);
                Log.e(str2, "original disFinal1: " + fMin);
                if (this.s != 1) {
                    fMin = ytm.d(fMin, this.bt, i, this.ey);
                    Log.e(str2, "original disFinal and caseNum is not 1: " + fMin);
                }
                if (fMin < this.ba || fMin < this.ay) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3) {
                    f5 = f3;
                } else {
                    if (z4) {
                        Log.e(str2, "inst match is success or not: Fail");
                        this.aa++;
                        Log.e(str2, "disFailCount: " + this.aa);
                        i4 = this.s;
                        if (1 == i4) {
                            fArr4 = new float[ch];
                            i7 = 0;
                            while (i7 < ch) {
                                fArr4[i7] = (this.bt * ((cp[i7] - j4) + ((cn[i7] * this.bq) / f4))) + this.cr;
                                i7++;
                                j4 = j;
                            }
                            Log.e(str2, "case1 tT2Array：" + Arrays.toString(cp));
                            Log.e(str2, "case1 sigStartPointArray：" + Arrays.toString(cn));
                            Log.e(str2, "case1 disFinalArray1：" + Arrays.toString(fArr4));
                            dVarD2 = ytp.d(fArr4, this.ay);
                            Log.e(str2, "disFinalTmp: " + dVarD2.e);
                            if (dVarD2.e < this.ba || dVarD2.e < this.ay) {
                                Log.e(str2, "case1 match is success or not: Fail");
                                cq = ytm.b(cq, ch, j);
                                Log.e(str2, "case1 tT1Array：" + Arrays.toString(cq));
                                if (1 == this.aa) {
                                    cp = ytm.b(cp, ch, j2);
                                    Log.e(str2, "case2 tT2Array：" + Arrays.toString(cp));
                                    cn = ytm.e(cn, ch, i);
                                    Log.e(str2, "case2 sigStartPoint：" + Arrays.toString(cn));
                                }
                                f5 = f3;
                            } else {
                                Log.e(str2, "case1 match is success or not: Success");
                                float f7 = dVarD2.e;
                                cp = ytm.e(cp, ch, dVarD2.d);
                                Log.e(str2, "case1 tT2Array：" + Arrays.toString(cp));
                                cn = ytm.a(cn, ch, dVarD2.d);
                                Log.e(str2, "case1 sigStartPoint：" + Arrays.toString(cn));
                                f5 = f7;
                            }
                        } else {
                            if (2 == i4) {
                                fArr3 = new float[ch];
                                for (i6 = 0; i6 < ch; i6++) {
                                    fArr3[i6] = (this.bt * ((j2 - cq[i6]) + ((this.bq * f2) / f4))) + this.cr;
                                }
                                Log.e(str2, "case2 tT1Array：" + Arrays.toString(cq));
                                Log.e(str2, "case2 disFinalArray1：" + Arrays.toString(fArr3));
                                dVarD = ytp.d(fArr3, this.ay);
                                Log.e(str2, "disFinalTmp: " + dVarD.e);
                                if (dVarD.e < this.ba || dVarD.e < this.ay) {
                                    Log.e(str2, "case2 match is success or not: Fail");
                                    cp = ytm.b(cp, ch, j2);
                                    Log.e(str2, "case2 tT2Array：" + Arrays.toString(cp));
                                    cn = ytm.e(cn, ch, i);
                                    Log.e(str2, "case2 sigStartPoint：" + Arrays.toString(cn));
                                    if (1 == this.aa) {
                                        cq = ytm.b(cq, ch, j);
                                        Log.e(str2, "case1 tT1Array：" + Arrays.toString(cq));
                                    }
                                } else {
                                    Log.e(str2, "case2 match is success or not: Success");
                                    float f8 = dVarD.e;
                                    cq = ytm.e(cq, ch, dVarD.d);
                                    Log.e(str2, "case2 tT1Array：" + Arrays.toString(cq));
                                    f5 = f8;
                                }
                            } else {
                                j3 = j4;
                                if (3 == i4) {
                                    int i8 = ch;
                                    fArr = new float[i8];
                                    fArr2 = new float[i8];
                                    i5 = 0;
                                    while (i5 < ch) {
                                        float f9 = this.bt;
                                        float f10 = cp[i5] - j3;
                                        float f11 = cn[i5];
                                        float f12 = this.bq;
                                        float f13 = this.cr;
                                        fArr[i5] = ((f10 + ((f11 * f12) / f4)) * f9) + f13;
                                        fArr2[i5] = (((j2 - cq[i5]) + ((f12 * f2) / f4)) * f9) + f13;
                                        i5++;
                                        j3 = j;
                                    }
                                    Log.e(str2, "case3 tT2Array：" + Arrays.toString(cp));
                                    Log.e(str2, "case3 sigStartPointArray：" + Arrays.toString(cn));
                                    Log.e(str2, "case3 tT1Array：" + Arrays.toString(cq));
                                    Log.e(str2, "case3 disFinalArray2：" + Arrays.toString(fArr));
                                    Log.e(str2, "case3 disFinalArray3：" + Arrays.toString(fArr2));
                                    ytp.d dVarD3 = ytp.d(fArr, this.ay);
                                    ytp.d dVarD4 = ytp.d(fArr2, this.ay);
                                    fMin = Math.min(dVarD3.e, dVarD4.e);
                                    Log.e(str2, "disFinalTmp2: " + dVarD3.e);
                                    Log.e(str2, "disFinalTmp3: " + dVarD4.e);
                                    if (fMin < this.ba || fMin < this.ay) {
                                        Log.e(str2, "case3 match is success or not: Fail");
                                        cq = ytm.b(cq, ch, j);
                                        cp = ytm.b(cp, ch, j2);
                                        cn = ytm.e(cn, ch, i);
                                        Log.e(str2, "case3 tT1Array：" + Arrays.toString(cq));
                                        Log.e(str2, "case3 tT2Array：" + Arrays.toString(cp));
                                        Log.e(str2, "case3 sigStartPoint：" + Arrays.toString(cn));
                                    } else {
                                        Log.e(str2, "case3 match is success or not: Success");
                                        if (Math.abs(fMin - dVarD3.e) < 1.0E-6f) {
                                            cp = ytm.e(cp, ch, dVarD3.d);
                                            cn = ytm.a(cn, ch, dVarD3.d);
                                            Log.e(str2, "case3 tT2Array：" + Arrays.toString(cp));
                                            Log.e(str2, "case3 sigStartPoint：" + Arrays.toString(cn));
                                        } else if (Math.abs(fMin - dVarD4.e) < 1.0E-6f) {
                                            cq = ytm.e(cq, ch, dVarD4.d);
                                            Log.e(str2, "case3 tT1Array：" + Arrays.toString(cq));
                                        }
                                    }
                                }
                            }
                            f5 = f3;
                        }
                    } else {
                        Log.e(str2, "inst match is success or not: Success");
                    }
                    f5 = fMin;
                }
                Log.e(str2, "disCalFinal: " + f5);
                float fRound = ((float) Math.round(b(f5, this.ay) * 10.0f)) / 10.0f;
                Log.e(str2, "disCalFinalTmp1: " + fRound);
                float fD = d(fRound);
                Log.e(str2, "stayOriCount: " + this.bs);
                Log.e(str2, "disValueLast: " + this.da);
                Log.e(str2, "disCalFinalTmp2: " + fD);
                float fE = e(i2);
                Log.e(str2, "disFilterCoef: " + fE);
                Log.e(str2, "staticFlagCount: " + this.bv);
                float fA = a(d(fD, a(i2).booleanValue(), c(fD)), fE);
                Log.e(str2, "hisInitFlag: " + this.ax);
                Log.e(str2, "historyDis: " + this.at);
                Log.e(str2, "dis Final: " + fA);
                this.bb = fA;
                Log.e(str2, "lastDisCalFinal: " + this.bb);
                return fA;
            }
            str = "UltraAlg";
            z = false;
            this.en = 0;
            if (j4 >= 0) {
                z2 = true;
            } else {
                z2 = true;
            }
            str2 = str;
            Log.i(str2, "valueNorm: " + this.eu + " valueMicMax: " + this.ew + " rssiNearCount: " + this.en);
            if (this.en >= 3) {
                z3 = z;
            } else {
                z3 = z;
            }
            if (z3) {
                f = 0.5f;
            } else {
                f = -500.0f;
                if (z2) {
                    this.bb = -500.0f;
                    Log.e(str2, "lastDisCalFinal: " + this.bb);
                    Log.e(str2, "tT1-tT2-sigStartPoint negative numbers. ");
                    return -500.0f;
                }
            }
            float f14 = j2 - j4;
            f2 = i;
            f3 = f;
            f4 = jD;
            fMin = (this.bt * (((this.bq * f2) / f4) + f14)) + this.cr;
            Log.e(str2, "soundSpeed: " + fMin);
            Log.e(str2, "(tT2 - tT1 + (float) sigStartPoint * secToMicsec / samplingRate): " + (f14 + ((((float) this.bq) * f2) / f4)));
            Log.e(str2, "delayDisDelta : " + this.cr);
            Log.e(str2, "original disFinal1: " + fMin);
            if (this.s != 1) {
                fMin = ytm.d(fMin, this.bt, i, this.ey);
                Log.e(str2, "original disFinal and caseNum is not 1: " + fMin);
            }
            if (fMin < this.ba) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (z3) {
                f5 = f3;
            } else {
                if (z4) {
                    Log.e(str2, "inst match is success or not: Fail");
                    this.aa++;
                    Log.e(str2, "disFailCount: " + this.aa);
                    i4 = this.s;
                    if (1 == i4) {
                        fArr4 = new float[ch];
                        i7 = 0;
                        while (i7 < ch) {
                            fArr4[i7] = (this.bt * ((cp[i7] - j4) + ((cn[i7] * this.bq) / f4))) + this.cr;
                            i7++;
                            j4 = j;
                        }
                        Log.e(str2, "case1 tT2Array：" + Arrays.toString(cp));
                        Log.e(str2, "case1 sigStartPointArray：" + Arrays.toString(cn));
                        Log.e(str2, "case1 disFinalArray1：" + Arrays.toString(fArr4));
                        dVarD2 = ytp.d(fArr4, this.ay);
                        Log.e(str2, "disFinalTmp: " + dVarD2.e);
                        if (dVarD2.e < this.ba) {
                        }
                        Log.e(str2, "case1 match is success or not: Fail");
                        cq = ytm.b(cq, ch, j);
                        Log.e(str2, "case1 tT1Array：" + Arrays.toString(cq));
                        if (1 == this.aa) {
                            cp = ytm.b(cp, ch, j2);
                            Log.e(str2, "case2 tT2Array：" + Arrays.toString(cp));
                            cn = ytm.e(cn, ch, i);
                            Log.e(str2, "case2 sigStartPoint：" + Arrays.toString(cn));
                        }
                        f5 = f3;
                    } else {
                        if (2 == i4) {
                            fArr3 = new float[ch];
                            while (i6 < ch) {
                                fArr3[i6] = (this.bt * ((j2 - cq[i6]) + ((this.bq * f2) / f4))) + this.cr;
                            }
                            Log.e(str2, "case2 tT1Array：" + Arrays.toString(cq));
                            Log.e(str2, "case2 disFinalArray1：" + Arrays.toString(fArr3));
                            dVarD = ytp.d(fArr3, this.ay);
                            Log.e(str2, "disFinalTmp: " + dVarD.e);
                            if (dVarD.e < this.ba) {
                            }
                            Log.e(str2, "case2 match is success or not: Fail");
                            cp = ytm.b(cp, ch, j2);
                            Log.e(str2, "case2 tT2Array：" + Arrays.toString(cp));
                            cn = ytm.e(cn, ch, i);
                            Log.e(str2, "case2 sigStartPoint：" + Arrays.toString(cn));
                            if (1 == this.aa) {
                                cq = ytm.b(cq, ch, j);
                                Log.e(str2, "case1 tT1Array：" + Arrays.toString(cq));
                            }
                        } else {
                            j3 = j4;
                            if (3 == i4) {
                                int i9 = ch;
                                fArr = new float[i9];
                                fArr2 = new float[i9];
                                i5 = 0;
                                while (i5 < ch) {
                                    float f15 = this.bt;
                                    float f16 = cp[i5] - j3;
                                    float f17 = cn[i5];
                                    float f18 = this.bq;
                                    float f19 = this.cr;
                                    fArr[i5] = ((f16 + ((f17 * f18) / f4)) * f15) + f19;
                                    fArr2[i5] = (((j2 - cq[i5]) + ((f18 * f2) / f4)) * f15) + f19;
                                    i5++;
                                    j3 = j;
                                }
                                Log.e(str2, "case3 tT2Array：" + Arrays.toString(cp));
                                Log.e(str2, "case3 sigStartPointArray：" + Arrays.toString(cn));
                                Log.e(str2, "case3 tT1Array：" + Arrays.toString(cq));
                                Log.e(str2, "case3 disFinalArray2：" + Arrays.toString(fArr));
                                Log.e(str2, "case3 disFinalArray3：" + Arrays.toString(fArr2));
                                ytp.d dVarD5 = ytp.d(fArr, this.ay);
                                ytp.d dVarD6 = ytp.d(fArr2, this.ay);
                                fMin = Math.min(dVarD5.e, dVarD6.e);
                                Log.e(str2, "disFinalTmp2: " + dVarD5.e);
                                Log.e(str2, "disFinalTmp3: " + dVarD6.e);
                                if (fMin < this.ba) {
                                }
                                Log.e(str2, "case3 match is success or not: Fail");
                                cq = ytm.b(cq, ch, j);
                                cp = ytm.b(cp, ch, j2);
                                cn = ytm.e(cn, ch, i);
                                Log.e(str2, "case3 tT1Array：" + Arrays.toString(cq));
                                Log.e(str2, "case3 tT2Array：" + Arrays.toString(cp));
                                Log.e(str2, "case3 sigStartPoint：" + Arrays.toString(cn));
                            }
                        }
                        f5 = f3;
                    }
                } else {
                    Log.e(str2, "inst match is success or not: Success");
                }
                f5 = fMin;
            }
            Log.e(str2, "disCalFinal: " + f5);
            float fRound2 = ((float) Math.round(b(f5, this.ay) * 10.0f)) / 10.0f;
            Log.e(str2, "disCalFinalTmp1: " + fRound2);
            float fD2 = d(fRound2);
            Log.e(str2, "stayOriCount: " + this.bs);
            Log.e(str2, "disValueLast: " + this.da);
            Log.e(str2, "disCalFinalTmp2: " + fD2);
            float fE2 = e(i2);
            Log.e(str2, "disFilterCoef: " + fE2);
            Log.e(str2, "staticFlagCount: " + this.bv);
            float fA2 = a(d(fD2, a(i2).booleanValue(), c(fD2)), fE2);
            Log.e(str2, "hisInitFlag: " + this.ax);
            Log.e(str2, "historyDis: " + this.at);
            Log.e(str2, "dis Final: " + fA2);
            this.bb = fA2;
            Log.e(str2, "lastDisCalFinal: " + this.bb);
            return fA2;
        }
        str = "UltraAlg";
        z = false;
        if (j4 >= 0) {
            z2 = true;
        } else {
            z2 = true;
        }
        str2 = str;
        Log.i(str2, "valueNorm: " + this.eu + " valueMicMax: " + this.ew + " rssiNearCount: " + this.en);
        if (this.en >= 3) {
            z3 = z;
        } else {
            z3 = z;
        }
        if (z3) {
            f = 0.5f;
        } else {
            f = -500.0f;
            if (z2) {
                this.bb = -500.0f;
                Log.e(str2, "lastDisCalFinal: " + this.bb);
                Log.e(str2, "tT1-tT2-sigStartPoint negative numbers. ");
                return -500.0f;
            }
        }
        float f110 = j2 - j4;
        f2 = i;
        f3 = f;
        f4 = jD;
        fMin = (this.bt * (((this.bq * f2) / f4) + f110)) + this.cr;
        Log.e(str2, "soundSpeed: " + fMin);
        Log.e(str2, "(tT2 - tT1 + (float) sigStartPoint * secToMicsec / samplingRate): " + (f110 + ((((float) this.bq) * f2) / f4)));
        Log.e(str2, "delayDisDelta : " + this.cr);
        Log.e(str2, "original disFinal1: " + fMin);
        if (this.s != 1) {
            fMin = ytm.d(fMin, this.bt, i, this.ey);
            Log.e(str2, "original disFinal and caseNum is not 1: " + fMin);
        }
        if (fMin < this.ba) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z3) {
            f5 = f3;
        } else {
            if (z4) {
                Log.e(str2, "inst match is success or not: Fail");
                this.aa++;
                Log.e(str2, "disFailCount: " + this.aa);
                i4 = this.s;
                if (1 == i4) {
                    fArr4 = new float[ch];
                    i7 = 0;
                    while (i7 < ch) {
                        fArr4[i7] = (this.bt * ((cp[i7] - j4) + ((cn[i7] * this.bq) / f4))) + this.cr;
                        i7++;
                        j4 = j;
                    }
                    Log.e(str2, "case1 tT2Array：" + Arrays.toString(cp));
                    Log.e(str2, "case1 sigStartPointArray：" + Arrays.toString(cn));
                    Log.e(str2, "case1 disFinalArray1：" + Arrays.toString(fArr4));
                    dVarD2 = ytp.d(fArr4, this.ay);
                    Log.e(str2, "disFinalTmp: " + dVarD2.e);
                    if (dVarD2.e < this.ba) {
                    }
                    Log.e(str2, "case1 match is success or not: Fail");
                    cq = ytm.b(cq, ch, j);
                    Log.e(str2, "case1 tT1Array：" + Arrays.toString(cq));
                    if (1 == this.aa) {
                        cp = ytm.b(cp, ch, j2);
                        Log.e(str2, "case2 tT2Array：" + Arrays.toString(cp));
                        cn = ytm.e(cn, ch, i);
                        Log.e(str2, "case2 sigStartPoint：" + Arrays.toString(cn));
                    }
                    f5 = f3;
                } else {
                    if (2 == i4) {
                        fArr3 = new float[ch];
                        while (i6 < ch) {
                            fArr3[i6] = (this.bt * ((j2 - cq[i6]) + ((this.bq * f2) / f4))) + this.cr;
                        }
                        Log.e(str2, "case2 tT1Array：" + Arrays.toString(cq));
                        Log.e(str2, "case2 disFinalArray1：" + Arrays.toString(fArr3));
                        dVarD = ytp.d(fArr3, this.ay);
                        Log.e(str2, "disFinalTmp: " + dVarD.e);
                        if (dVarD.e < this.ba) {
                        }
                        Log.e(str2, "case2 match is success or not: Fail");
                        cp = ytm.b(cp, ch, j2);
                        Log.e(str2, "case2 tT2Array：" + Arrays.toString(cp));
                        cn = ytm.e(cn, ch, i);
                        Log.e(str2, "case2 sigStartPoint：" + Arrays.toString(cn));
                        if (1 == this.aa) {
                            cq = ytm.b(cq, ch, j);
                            Log.e(str2, "case1 tT1Array：" + Arrays.toString(cq));
                        }
                    } else {
                        j3 = j4;
                        if (3 == i4) {
                            int i10 = ch;
                            fArr = new float[i10];
                            fArr2 = new float[i10];
                            i5 = 0;
                            while (i5 < ch) {
                                float f111 = this.bt;
                                float f112 = cp[i5] - j3;
                                float f113 = cn[i5];
                                float f114 = this.bq;
                                float f115 = this.cr;
                                fArr[i5] = ((f112 + ((f113 * f114) / f4)) * f111) + f115;
                                fArr2[i5] = (((j2 - cq[i5]) + ((f114 * f2) / f4)) * f111) + f115;
                                i5++;
                                j3 = j;
                            }
                            Log.e(str2, "case3 tT2Array：" + Arrays.toString(cp));
                            Log.e(str2, "case3 sigStartPointArray：" + Arrays.toString(cn));
                            Log.e(str2, "case3 tT1Array：" + Arrays.toString(cq));
                            Log.e(str2, "case3 disFinalArray2：" + Arrays.toString(fArr));
                            Log.e(str2, "case3 disFinalArray3：" + Arrays.toString(fArr2));
                            ytp.d dVarD7 = ytp.d(fArr, this.ay);
                            ytp.d dVarD8 = ytp.d(fArr2, this.ay);
                            fMin = Math.min(dVarD7.e, dVarD8.e);
                            Log.e(str2, "disFinalTmp2: " + dVarD7.e);
                            Log.e(str2, "disFinalTmp3: " + dVarD8.e);
                            if (fMin < this.ba) {
                            }
                            Log.e(str2, "case3 match is success or not: Fail");
                            cq = ytm.b(cq, ch, j);
                            cp = ytm.b(cp, ch, j2);
                            cn = ytm.e(cn, ch, i);
                            Log.e(str2, "case3 tT1Array：" + Arrays.toString(cq));
                            Log.e(str2, "case3 tT2Array：" + Arrays.toString(cp));
                            Log.e(str2, "case3 sigStartPoint：" + Arrays.toString(cn));
                        }
                    }
                    f5 = f3;
                }
            } else {
                Log.e(str2, "inst match is success or not: Success");
            }
            f5 = fMin;
        }
        Log.e(str2, "disCalFinal: " + f5);
        float fRound3 = ((float) Math.round(b(f5, this.ay) * 10.0f)) / 10.0f;
        Log.e(str2, "disCalFinalTmp1: " + fRound3);
        float fD3 = d(fRound3);
        Log.e(str2, "stayOriCount: " + this.bs);
        Log.e(str2, "disValueLast: " + this.da);
        Log.e(str2, "disCalFinalTmp2: " + fD3);
        float fE3 = e(i2);
        Log.e(str2, "disFilterCoef: " + fE3);
        Log.e(str2, "staticFlagCount: " + this.bv);
        float fA3 = a(d(fD3, a(i2).booleanValue(), c(fD3)), fE3);
        Log.e(str2, "hisInitFlag: " + this.ax);
        Log.e(str2, "historyDis: " + this.at);
        Log.e(str2, "dis Final: " + fA3);
        this.bb = fA3;
        Log.e(str2, "lastDisCalFinal: " + this.bb);
        return fA3;
    }

    public float d(float f) {
        if (Math.abs(Math.abs(f) - 500.0f) < 1.0E-6f) {
            int i = this.bs + 1;
            this.bs = i;
            return i <= 3 ? this.da : f;
        }
        this.da = f;
        this.bs = 0;
        return f;
    }

    public float e(int i) {
        if (i == 0) {
            this.bv++;
        } else {
            this.bv = 0;
        }
        return this.bv >= 3 ? 0.2f : 0.5f;
    }

    public float a(float f, float f2) {
        if (Math.abs(Math.abs(f) - 500.0f) < 1.0E-6f) {
            return f;
        }
        if (!this.ax) {
            this.at = f;
        } else {
            if (Math.abs(f - this.at) >= 1.0f) {
                float f3 = this.at;
                f = f - f3 > 0.0f ? f3 + 1.0f : f3 - 1.0f;
            }
            this.at = ((1.0f - f2) * this.at) + (f2 * f);
        }
        this.ax = true;
        return Math.round(this.at * 10.0f) / 10.0f;
    }

    public float d(float f, boolean z, float f2) {
        return (Math.abs(f) - 500.0f <= 0.0f || z || f2 - 0.0f <= 0.0f || Math.abs(f2 - f) <= 3.5f) ? f : this.at;
    }

    public int b(int i, int i2, float f) {
        int i3 = (f > 5.0f || f <= 0.0f) ? 1 : 2;
        if (i == 2) {
            if (i2 != 0 && this.s != 1) {
                this.ak++;
            }
            this.aj = 0;
            this.ao = 0;
            if (this.ak < i3 * 3) {
                i = this.q;
            } else {
                this.q = i;
            }
        } else if (i == 8) {
            if (i2 != 0 && this.s != 1) {
                this.aj++;
            }
            this.ak = 0;
            this.ao = 0;
            if (this.aj < 3) {
                i = this.q;
            } else {
                this.q = i;
            }
        } else if (i == 9) {
            if (i2 != 0 && this.s != 1) {
                this.ao++;
            }
            this.ak = 0;
            this.aj = 0;
            if (this.ao < 3) {
                i = this.q;
            } else {
                this.q = i;
            }
        } else {
            this.q = i;
            this.ak = 0;
            this.aj = 0;
            this.ao = 0;
        }
        Log.e("UltraAlg", "flag2Cnt: " + this.ak);
        Log.e("UltraAlg", "flag8Cnt: " + this.aj);
        Log.e("UltraAlg", "flag9Cnt: " + this.ao);
        Log.e("UltraAlg", "dataFlagLast: " + this.q);
        return i;
    }

    public void e(float f, double d, double d2, int i) {
        double d3 = this.ar;
        if (d3 < 0.6d) {
            d3 *= 1.2d;
        }
        if (f <= 15.0d || d >= d2 * d3) {
            this.dg++;
        } else {
            this.dg = 0;
        }
        if (i == 2) {
            this.dh++;
        } else {
            this.dh = 0;
        }
        if (this.dg >= 3) {
            this.di = true;
        }
        if (this.dh >= 6) {
            this.di = false;
        }
    }

    public float c(float f) {
        float fFloatValue = 0.0f;
        if (cm.size() < 20) {
            if (Math.abs(f) - 500.0f < 1.0E-6d) {
                if (!cm.isEmpty()) {
                    List<Float> list = cm;
                    list.add(list.get(list.size() - 1));
                }
                return 0.0f;
            }
            cm.add(Float.valueOf(f));
            return 0.0f;
        }
        if (cm.isEmpty()) {
            Log.e("UltraAlg", "hisDis Queue is empty！");
            return -1.0f;
        }
        cm.remove(0);
        cm.add(Float.valueOf(f));
        for (int i = 0; i < 20; i++) {
            fFloatValue += cm.get(i).floatValue();
        }
        return fFloatValue / 20.0f;
    }

    public Boolean a(int i) {
        boolean z = false;
        float fIntValue = 0.0f;
        if (co.size() < 20) {
            co.add(Integer.valueOf(i));
        } else {
            if (co.isEmpty()) {
                Log.e("UltraAlg", "hisMoveState Queue is empty！");
                return false;
            }
            co.remove(0);
            co.add(Integer.valueOf(i));
            for (int i2 = 0; i2 < 20; i2++) {
                fIntValue += co.get(i2).intValue();
            }
        }
        if (co.size() >= 20 ? fIntValue > 3.0f : i == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
