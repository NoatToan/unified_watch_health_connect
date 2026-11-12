package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DayType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.TimeSubType;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class fq5 extends yb8 {
    public String d;
    public dq5 e;
    public dq5 f;
    public DateType g;
    public GrainType h;
    public DayType i;
    public TimeSubType j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18077k;
    public int l;
    public boolean m;
    public int n;
    public boolean o;

    public fq5(String str, dq5 dq5Var, GrainType grainType) {
        super(0, 0, null);
        this.d = str;
        this.e = dq5Var;
        this.f = dq5Var;
        this.h = grainType;
        this.i = DayType.MORNING;
        this.f18077k = 0L;
        this.l = 0;
    }

    @Override // defpackage.yb8
    public String c() {
        return "<DateTime>";
    }

    @Override // defpackage.yb8
    public List<q69> h() {
        HashMap map = new HashMap();
        mq5 mq5VarD = dq5.d(this.e, this.f, this.g, this.o);
        mq5VarD.k(this.h);
        TimeSubType timeSubType = this.j;
        if (timeSubType != null) {
            mq5VarD.n(timeSubType);
        }
        map.put(this.g.getType(), mq5VarD);
        return Collections.singletonList(new q69(d(), b(), this.d.substring(d(), b()), null, map));
    }

    @Override // defpackage.yb8
    public JsonObject i() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("start_idx", Integer.valueOf(d()));
        jsonObject.addProperty("end_idx", Integer.valueOf(b()));
        jsonObject.addProperty("text", this.d.substring(d(), b()));
        TimeZone timeZoneP = this.e.p();
        jsonObject.addProperty("start_dt", this.e.D(this.g.getFormat(), timeZoneP));
        jsonObject.addProperty("end_dt", this.f.D(this.g.getFormat(), timeZoneP));
        jsonObject.addProperty("date_type", this.g.toString());
        jsonObject.addProperty("day_type", this.i.toString());
        jsonObject.addProperty("grain_type", this.h.toString());
        TimeSubType timeSubType = this.j;
        if (timeSubType != null) {
            jsonObject.addProperty("sub_type", timeSubType.toString());
        }
        return jsonObject;
    }

    public boolean j() {
        return this.h != null;
    }

    public void k(fq5 fq5Var) {
        DayType dayType;
        g(fq5Var.d());
        this.d = fq5Var.d;
        this.e = fq5Var.e;
        if (this.h == null) {
            f(fq5Var.b());
            this.f = fq5Var.f;
            this.g = fq5Var.g;
            this.h = fq5Var.h;
            this.i = fq5Var.i;
            this.j = fq5Var.j;
            return;
        }
        int i = this.l;
        if (i < fq5Var.l && !this.m) {
            if (i < 8) {
                this.f = this.f.P(fq5Var.e.q());
            }
            if (this.l < 7) {
                this.f = this.f.K(fq5Var.e.m());
            }
            if (this.l < 6) {
                this.f = this.f.F(fq5Var.e.f());
            }
            if (this.l < 5) {
                this.f = this.f.E(fq5Var.e.e());
            }
            if (this.l < 4 && (dayType = fq5Var.i) != DayType.MORNING && dayType != DayType.EARLY_MORNING && this.f.g() < 12) {
                this.f = this.f.w(12);
            }
            if (this.l < 3) {
                this.f = this.f.G(fq5Var.e.g());
            }
            if (this.l < 2) {
                this.f = this.f.J(fq5Var.e.l());
            }
            if (this.l < 1) {
                this.f = this.f.L(fq5Var.e.o());
            }
        }
        this.g = DateType.DURATION;
        this.h = GrainType.ARBITRARY;
    }

    public void l(vq5 vq5Var, int i) {
        dq5 dq5Var;
        dq5 dq5Var2;
        int iMin;
        dq5 dq5VarN = vq5Var.n();
        dq5 dq5VarL = vq5Var.l();
        GrainType grainTypeM = vq5Var.m();
        DateType dateTypeJ = vq5Var.j();
        TimeSubType timeSubTypeO = vq5Var.o();
        long jK = vq5Var.k();
        boolean zP = vq5Var.p();
        if (this.h == null) {
            g(vq5Var.d());
            f(vq5Var.b());
            this.e = dq5VarN;
            this.f = dq5VarL;
            if (i == 5 && (iMin = Math.min(((cr5) vq5Var).z(), this.f.h())) > 0) {
                this.e = this.e.E(iMin);
                this.f = this.f.E(iMin);
            }
            this.h = grainTypeM;
            if (grainTypeM == GrainType.DATE) {
                this.e = this.e.O();
                this.f = this.f.N();
            }
            this.g = dateTypeJ;
            if (i == 5) {
                this.i = ((cr5) vq5Var).A();
            }
            this.j = vq5Var.o();
            if (jK > 0) {
                this.f18077k += jK;
            }
            this.l = i;
            if (i == 5 && vq5Var.m() == GrainType.PARTOFDAY) {
                this.l = 4;
            }
            if (this.l == 2 && (vq5Var instanceof a5g) && ((a5g) vq5Var).A()) {
                this.l = 3;
            }
            this.m = zP;
            this.n = i;
            return;
        }
        f(vq5Var.b());
        if (zP) {
            this.h = grainTypeM;
            this.g = dateTypeJ;
            if (i == 5) {
                this.i = ((cr5) vq5Var).A();
            }
            this.j = timeSubTypeO;
            if (this.n <= 8 && (dq5Var2 = this.e) != null && this.f != null) {
                dq5VarN = dq5VarN.P(dq5Var2.q());
                dq5VarL = dq5VarL.P(this.f.q());
            }
            if (this.n <= 7 && (dq5Var = this.e) != null && this.f != null) {
                dq5VarN = dq5VarN.K(dq5Var.m());
                dq5VarL = dq5VarL.K(this.f.m());
            }
            this.e = dq5VarN;
            this.f = dq5VarL;
            if (this.f18077k > 0 && this.j == TimeSubType.OFFSET) {
                if (vq5Var.e().endsWith("后")) {
                    dq5 dq5VarZ = this.f.z((int) (this.f18077k / 1000));
                    this.f = dq5VarZ;
                    this.e = dq5VarZ;
                } else if (vq5Var.e().endsWith("前")) {
                    dq5 dq5VarZ2 = this.e.z((int) (this.f18077k / 1000));
                    this.f = dq5VarZ2;
                    this.e = dq5VarZ2;
                }
            }
        } else {
            switch (i) {
                case 1:
                    bql bqlVar = (bql) vq5Var;
                    if (this.h == GrainType.DATETIME) {
                        dq5 dq5VarL2 = this.e.L(bqlVar.z());
                        this.f = dq5VarL2;
                        this.e = dq5VarL2;
                        this.j = TimeSubType.CONCRETE;
                    } else if (jK >= 0) {
                        long j = this.f18077k + jK;
                        this.f18077k = j;
                        this.f = this.e.z((int) (j / 1000));
                        this.h = GrainType.SECOND;
                    }
                    break;
                case 2:
                    a5g a5gVar = (a5g) vq5Var;
                    if (a5gVar.A()) {
                        int iS = dq5.s(this.i, dq5VarN.g());
                        int iS2 = dq5.s(this.i, dq5VarL.g());
                        dq5 dq5VarG = this.e.G(iS % 24);
                        this.e = dq5VarG;
                        if (iS >= 24) {
                            this.e = dq5VarG.v(iS / 24);
                        }
                        dq5 dq5VarG2 = this.f.G(iS2 % 24);
                        this.f = dq5VarG2;
                        if (iS2 >= 24) {
                            this.f = dq5VarG2.v(iS2 / 24);
                        }
                    }
                    GrainType grainType = this.h;
                    GrainType grainType2 = GrainType.DATETIME;
                    if (grainType == grainType2 || a5gVar.A()) {
                        dq5 dq5VarL3 = this.e.J(a5gVar.z()).L(0);
                        this.e = dq5VarL3;
                        this.f = dq5VarL3.J(a5gVar.z()).L(0);
                        this.h = grainType2;
                        this.j = TimeSubType.CONCRETE;
                    } else if (jK >= 0) {
                        long j2 = this.f18077k + jK;
                        this.f18077k = j2;
                        this.f = this.e.z((int) (j2 / 1000));
                        this.h = GrainType.MINUTE;
                    }
                    break;
                case 3:
                    if (jK >= 0) {
                        long j3 = this.f18077k + jK;
                        this.f18077k = j3;
                        this.f = this.e.z((int) (j3 / 1000));
                    } else {
                        int iS3 = dq5.s(this.i, dq5VarN.g());
                        int iS4 = dq5.s(this.i, dq5VarL.g());
                        dq5 dq5VarM = this.e.M(iS3 % 24, dq5VarN.l(), dq5VarN.o());
                        this.e = dq5VarM;
                        if (iS3 >= 24) {
                            this.e = dq5VarM.v(iS3 / 24);
                        }
                        dq5 dq5VarM2 = this.f.M(iS4 % 24, dq5VarL.l(), dq5VarL.o());
                        this.f = dq5VarM2;
                        if (iS4 >= 24) {
                            this.f = dq5VarM2.v(iS4 / 24);
                        }
                    }
                    this.h = grainTypeM;
                    this.j = timeSubTypeO;
                    break;
                case 5:
                    cr5 cr5Var = (cr5) vq5Var;
                    int iZ = cr5Var.z();
                    int iMin2 = Math.min(iZ, this.f.h());
                    if (iMin2 > 0) {
                        this.e = this.e.E(iMin2);
                        this.f = this.f.E(iMin2);
                        if (iMin2 < iZ) {
                            this.o = true;
                        }
                    } else if (grainTypeM == GrainType.PARTOFDAY) {
                        this.e = this.e.M(dq5VarN.g(), dq5VarN.l(), dq5VarN.o());
                        this.f = this.f.M(dq5VarL.g(), dq5VarL.l(), dq5VarL.o());
                    } else if (jK > 0) {
                        long j4 = this.f18077k + jK;
                        this.f18077k = j4;
                        this.f = this.e.z((int) (j4 / 1000));
                    }
                    this.j = timeSubTypeO;
                    this.h = grainTypeM;
                    this.i = cr5Var.A();
                    break;
                case 6:
                    if (jK > 0) {
                        long j5 = this.f18077k + jK;
                        this.f18077k = j5;
                        this.f = this.e.z((int) (j5 / 1000));
                    }
                    break;
                case 7:
                    this.e = this.e.K(dq5VarN.m()).I();
                    this.f = this.f.E(1).K(dq5VarL.m()).H();
                    this.h = grainTypeM;
                    break;
                case 8:
                    this.e = dq5VarN;
                    this.f = dq5VarL;
                    this.h = grainTypeM;
                    break;
            }
            GrainType grainType3 = this.h;
            if (grainType3 == GrainType.DATE) {
                this.g = DateType.DATE;
                this.e = this.e.O();
                this.f = this.f.N();
            } else if (grainType3 == GrainType.DATETIME) {
                this.g = DateType.DATETIME;
            } else {
                this.g = DateType.DURATION;
            }
        }
        this.n = i;
    }
}
