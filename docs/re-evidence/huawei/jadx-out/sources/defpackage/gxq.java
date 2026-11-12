package defpackage;

import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class gxq implements Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SleepViewConstants.ViewTypeEnum f36199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36201c;
    private gxk d;
    private int e;
    private gxm f;
    private gxs g;
    private gxj h;
    private long j;
    private SleepViewConstants.SleepTypeEnum k;
    private Map<String, Object> l = new ConcurrentHashMap();
    private List<String> i = new CopyOnWriteArrayList();

    public gxs k() {
        return this.g;
    }

    public void c(gxs gxsVar) {
        this.g = gxsVar;
    }

    public gxj h() {
        return this.h;
    }

    public void c(gxj gxjVar) {
        this.h = gxjVar;
    }

    public gxk b() {
        return this.d;
    }

    public void e(gxk gxkVar) {
        this.d = gxkVar;
    }

    public gxm g() {
        return this.f;
    }

    public void b(gxm gxmVar) {
        this.f = gxmVar;
    }

    public Map<String, Object> m() {
        return this.l;
    }

    public void e(Map<String, Object> map) {
        this.l = map;
    }

    public void a(String str) {
        this.f36200b = str;
    }

    public SleepViewConstants.SleepTypeEnum n() {
        return this.k;
    }

    public void b(SleepViewConstants.SleepTypeEnum sleepTypeEnum) {
        this.k = sleepTypeEnum;
    }

    public void e(int i) {
        this.e = i;
    }

    public SleepViewConstants.ViewTypeEnum d() {
        return this.f36199a;
    }

    public boolean t() {
        return this.f36201c;
    }

    public void e(boolean z) {
        this.f36201c = z;
    }

    public long f() {
        return this.j;
    }

    public void e(long j) {
        this.j = j;
    }

    public List<String> j() {
        return this.i;
    }

    public void b(List<String> list) {
        this.i = new CopyOnWriteArrayList(list);
    }

    public boolean r() {
        return this.g.n() || this.f.n() || this.h.n() || this.d.n();
    }

    public boolean q() {
        if (this.f36199a == SleepViewConstants.ViewTypeEnum.DAY) {
            return false;
        }
        int i = AnonymousClass1.d[this.k.ordinal()];
        if (i == 1) {
            return ((gxo) this.f).ao();
        }
        if (i == 2) {
            return ((gxn) this.h).ah();
        }
        if (i == 3) {
            return ((gxp) this.g).bz();
        }
        if (i != 4) {
            return false;
        }
        return ((gxl) this.d).aa();
    }

    /* JADX INFO: renamed from: gxq$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[SleepViewConstants.SleepTypeEnum.values().length];
            d = iArr;
            try {
                iArr[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[SleepViewConstants.SleepTypeEnum.SCIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[SleepViewConstants.SleepTypeEnum.COMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean s() {
        return (((gxp) this.g).bt() == 0 && ((gxn) this.h).ac() == 0 && ((gxo) this.f).al() == 0 && ((gxl) this.d).v() == 0) ? false : true;
    }

    public gxq(SleepViewConstants.ViewTypeEnum viewTypeEnum) {
        if (viewTypeEnum == SleepViewConstants.ViewTypeEnum.DAY) {
            this.g = new gxs();
            this.h = new gxj();
            this.d = new gxk();
            this.f = new gxm();
        } else {
            this.g = new gxp();
            this.h = new gxn();
            this.d = new gxl();
            this.f = new gxo();
        }
        this.f36199a = viewTypeEnum;
        this.k = SleepViewConstants.SleepTypeEnum.UNKNOWN;
    }

    public void e(List<gxq> list) {
        for (gxq gxqVar : list) {
            if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                ((gxo) this.f).d(gxqVar.g());
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
                ((gxn) this.h).b(gxqVar.h());
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
                ((gxl) this.d).c(gxqVar.b());
            } else if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                ((gxp) this.g).b(gxqVar.k());
            } else {
                LogUtil.e("SleepViewData", "errorSleepType: ", gxqVar.n());
            }
        }
    }

    public void c() {
        ((gxo) this.f).ae();
        ((gxn) this.h).u();
        ((gxl) this.d).w();
        ((gxp) this.g).bd();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public gxq clone() {
        try {
            gxq gxqVar = (gxq) super.clone();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Map<String, Object> map = this.l;
            if (map != null) {
                concurrentHashMap.putAll(map);
            }
            gxqVar.e(concurrentHashMap);
            return gxqVar;
        } catch (CloneNotSupportedException unused) {
            LogUtil.e("SleepViewData", "CloneNotSupportedException");
            return new gxq(SleepViewConstants.ViewTypeEnum.DAY);
        }
    }

    public int l() {
        int i;
        gxj gxjVar;
        gxs gxsVar = this.g;
        if (gxsVar != null) {
            i = gxsVar.i();
            if (i <= 0) {
                i = this.g.o();
            }
        } else {
            i = 0;
        }
        if (i > 0) {
            return i;
        }
        gxk gxkVar = this.d;
        if (gxkVar != null && (i = gxkVar.i()) <= 0) {
            i = this.d.o();
        }
        if (i > 0) {
            return i;
        }
        gxm gxmVar = this.f;
        if (gxmVar != null && (i = gxmVar.i()) <= 0) {
            i = this.f.o();
        }
        if (i > 0 || (gxjVar = this.h) == null) {
            return i;
        }
        int i2 = gxjVar.i();
        return i2 <= 0 ? this.h.o() : i2;
    }

    public int i() {
        gxm gxmVar;
        gxs gxsVar = this.g;
        int iAr = gxsVar != null ? gxsVar.ar() : 0;
        return (iAr <= 0 && (gxmVar = this.f) != null) ? gxmVar.u() : iAr;
    }

    public long o() {
        long jL;
        gxj gxjVar;
        gxs gxsVar = this.g;
        if (gxsVar != null) {
            jL = gxsVar.l();
            if (jL <= 0) {
                jL = this.g.d();
            }
        } else {
            jL = 0;
        }
        if (jL > 0) {
            return jL;
        }
        gxk gxkVar = this.d;
        if (gxkVar != null) {
            jL = gxkVar.l();
            if (jL <= 0) {
                jL = this.d.d();
            }
        }
        if (jL > 0) {
            return jL;
        }
        gxm gxmVar = this.f;
        if (gxmVar != null) {
            jL = gxmVar.l();
            if (jL <= 0) {
                jL = this.f.d();
            }
        }
        if (jL <= 0 && (gxjVar = this.h) != null) {
            jL = gxjVar.l();
            if (jL <= 0) {
                return this.h.d();
            }
        }
        return jL;
    }

    public long a() {
        long jB;
        gxj gxjVar;
        gxs gxsVar = this.g;
        if (gxsVar != null) {
            jB = gxsVar.b();
            if (jB <= 0) {
                jB = this.g.a();
            }
        } else {
            jB = 0;
        }
        if (jB > 0) {
            return jB;
        }
        gxk gxkVar = this.d;
        if (gxkVar != null) {
            jB = gxkVar.b();
            if (jB <= 0) {
                jB = this.d.a();
            }
        }
        if (jB > 0) {
            return jB;
        }
        gxm gxmVar = this.f;
        if (gxmVar != null) {
            jB = gxmVar.b();
            if (jB <= 0) {
                jB = this.f.a();
            }
        }
        if (jB <= 0 && (gxjVar = this.h) != null) {
            jB = gxjVar.b();
            if (jB <= 0) {
                return this.h.a();
            }
        }
        return jB;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(this.g);
        stringBuffer.append(",");
        stringBuffer.append(this.h);
        stringBuffer.append(",");
        stringBuffer.append(this.d);
        stringBuffer.append(",");
        stringBuffer.append(this.f);
        stringBuffer.append(",");
        stringBuffer.append(this.l);
        stringBuffer.append(",");
        stringBuffer.append("mDeviceId=" + this.f36200b);
        stringBuffer.append(",");
        stringBuffer.append(this.k);
        stringBuffer.append(",");
        stringBuffer.append("mDeviceType=" + this.e);
        stringBuffer.append(",");
        stringBuffer.append(this.e);
        stringBuffer.append(",");
        stringBuffer.append(this.f36199a);
        stringBuffer.append(",");
        stringBuffer.append(this.f36201c);
        stringBuffer.append(",");
        stringBuffer.append(this.i);
        return stringBuffer.toString();
    }
}
