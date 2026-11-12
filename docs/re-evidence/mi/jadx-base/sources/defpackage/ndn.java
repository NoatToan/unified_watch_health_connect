package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sport_manager.recorder.manager.bean.BeanDataHelper;
import com.xiaomi.fitness.sport_manager.recorder.manager.bean.BeanDataProcesser;
import com.xiaomi.fitness.sport_manager.recorder.utils.RecorderUtils;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_xms.data.SportXmsFinishData;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class ndn implements ISportDataChangedListener, ISportStateChangedListener {
    public static volatile ndn h0;
    public boolean B;
    public double C;
    public double D;
    public int E;
    public int F;
    public int G;
    public float H;
    public double I;
    public long M;
    public short N;
    public long O;
    public long P;
    public SportData Q;
    public FinishSportData R;
    public int S;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f27817a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f27818b;
    public int b0;
    public byte c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public int f;
    public BeanDataProcesser f0;
    public int g;
    public int h;
    public double i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27819k;
    public int m;
    public float n;
    public double o;
    public double p;
    public double q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f27820r;
    public double s;
    public double t;
    public double u;
    public double v;
    public int w;
    public int x;
    public int y;
    public int l = Integer.MAX_VALUE;
    public int z = 1;
    public int A = 0;
    public boolean J = false;
    public final ArrayMap<String, wyc> K = new ArrayMap<>();
    public Handler L = new Handler(Looper.getMainLooper());
    public int T = 0;
    public int U = 0;
    public int V = 0;
    public LinkedList<Integer> W = new LinkedList<>();
    public int X = 0;
    public HrZone e0 = new HrZone();
    public boolean g0 = false;

    public static ndn i() {
        if (h0 == null) {
            synchronized (ndn.class) {
                try {
                    if (h0 == null) {
                        h0 = new ndn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FitnessLogUtils.i("SportDataManager", "reset()");
        this.R = null;
        this.f27817a = (byte) 0;
        this.f27818b = (byte) 0;
        this.c = (byte) 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0.0d;
        this.j = 0;
        this.l = Integer.MAX_VALUE;
        this.m = 0;
        this.n = 0.0f;
        this.o = 0.0d;
        this.p = 0.0d;
        this.q = 0.0d;
        this.f27820r = 0.0d;
        this.s = 0.0d;
        this.t = 0.0d;
        this.u = 0.0d;
        this.v = 0.0d;
        this.K.clear();
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 1;
        this.B = false;
        this.C = 0.0d;
        this.D = 0.0d;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.0f;
        this.I = 0.0d;
        this.J = false;
        this.f27819k = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        f2o.x().j0(getClass(), this);
        jdn.h().r(getClass(), this);
        this.Q = null;
        this.W.clear();
        this.X = 0;
    }

    public final void b() {
        if (BeanSportUtils.INSTANCE.isBeanSport()) {
            BeanDataProcesser beanDataProcesser = new BeanDataProcesser();
            this.f0 = beanDataProcesser;
            this.K.put("Bean", beanDataProcesser);
        }
    }

    public void c(String str, wyc wycVar) {
        if (wycVar != null) {
            this.K.put(str, wycVar);
        }
    }

    public final void d(PhoneSportData phoneSportData) {
        this.i = phoneSportData.distance;
        float f = this.H;
        if (f == 0.0f || f < phoneSportData.stepRate) {
            this.H = phoneSportData.stepRate;
        }
        short s = this.N;
        if (s == 0 || s < phoneSportData.stride_frequency) {
            this.N = (short) phoneSportData.stride_frequency;
        }
        p(phoneSportData.pace);
        q(phoneSportData.speed);
        this.w = phoneSportData.heart_rate;
        this.j = ((int) phoneSportData.calorie) / 1000;
        this.F = phoneSportData.step;
        this.S = phoneSportData.revolutionCount;
        int i = phoneSportData.runStyle;
        if (i == 1) {
            this.T++;
        } else if (i == 2) {
            this.U++;
        } else {
            if (i != 3) {
                return;
            }
            this.V++;
        }
    }

    public final byte e(int i, int i2) {
        return (byte) ((i & 15) | (i2 << 4));
    }

    public final long f(FinishSportData finishSportData) {
        if (finishSportData == null) {
            return 0L;
        }
        if (finishSportData.getSportXmsFinishSportData() != null) {
            return finishSportData.getSportXmsFinishSportData().getCourseId();
        }
        if (finishSportData.getTrainingPlanFinishData() == null || finishSportData.getTrainingPlanFinishData().getServerCourseId() == null) {
            return 0L;
        }
        return finishSportData.getTrainingPlanFinishData().getServerCourseId().longValue();
    }

    public final int g(int i, int i2) {
        int i3 = i - i2;
        FitnessLogUtils.d("SportDataManager", "duration:" + i + ", count :" + i2 + ", diff:" + i3);
        return i3;
    }

    public final byte h() {
        int i = 0;
        if (this.J) {
            this.J = false;
            FitnessLogUtils.d("SportDataManager", "isWholeKm : " + this.J);
            i = 1;
        }
        return (byte) (((this.B ? 1 : 0) << 6) | (i << 7) | (((int) (this.C * 10.0d)) & 63));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:103:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:106:0x0304  */
    /* JADX WARN: Code duplicated, block: B:107:0x0306  */
    /* JADX WARN: Code duplicated, block: B:111:0x0314  */
    /* JADX WARN: Code duplicated, block: B:114:0x0320  */
    /* JADX WARN: Code duplicated, block: B:115:0x0322  */
    /* JADX WARN: Code duplicated, block: B:118:0x032d  */
    /* JADX WARN: Code duplicated, block: B:119:0x032f  */
    /* JADX WARN: Code duplicated, block: B:122:0x033a  */
    /* JADX WARN: Code duplicated, block: B:123:0x033c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0347  */
    /* JADX WARN: Code duplicated, block: B:127:0x0349  */
    /* JADX WARN: Code duplicated, block: B:130:0x037a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0395  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:151:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:29:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x012f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:50:0x019f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01df  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:81:0x0217  */
    /* JADX WARN: Code duplicated, block: B:88:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x025b  */
    @NotNull
    public SportData j() {
        long planId;
        int iIntValue;
        FinishSportData finishSportData;
        int maxPace;
        SportData sportData;
        int i;
        FinishSportData finishSportData2;
        int degree;
        FinishSportData finishSportData3;
        int avgPace;
        FinishSportData finishSportData4;
        int maxPace2;
        FinishSportData finishSportData5;
        float avgSpeed;
        FinishSportData finishSportData6;
        float maxSpeed;
        FinishSportData finishSportData7;
        int avgFrequency;
        FinishSportData finishSportData8;
        int avgStried;
        float maxPushStrength;
        float maxHit;
        int totalPunches;
        int perfect;
        int good;
        int miss;
        FinishSportData finishSportData9;
        int avgVerticalStrideRatio;
        FinishSportData finishSportData10;
        int minVerticalStrideRatio;
        FinishSportData finishSportData11;
        int maxVerticalStrideRatio;
        FinishSportData finishSportData12;
        int avgVerticalAmplitude;
        FinishSportData finishSportData13;
        int minVerticalAmplitude;
        FinishSportData finishSportData14;
        f2o.x();
        SportData sportData2 = this.Q;
        if (sportData2 != null) {
            int i2 = this.f27818b & 255;
            int i3 = sportData2.maxHrRate & 255;
            if (Math.max(i2, i3) == i3) {
                this.f27818b = this.Q.maxHrRate;
            }
            if (this.f27817a == 0) {
                this.f27817a = this.Q.aveHrRate;
            }
            this.n = Math.max(this.n, this.Q.fastestSpeed);
            FitnessLogUtils.i("SportDataManager", "SportReport maxSpeed : " + this.n);
            int i4 = this.Q.fastestPace;
            if (i4 != 0) {
                this.l = Math.min(this.l, i4);
            }
            this.m = Math.max(this.m, this.Q.slowestPace);
        }
        FinishSportData finishSportData15 = this.R;
        SportXmsFinishData sportXmsFinishSportData = finishSportData15 != null ? finishSportData15.getSportXmsFinishSportData() : null;
        FinishSportData finishSportData16 = this.R;
        int maxVerticalAmplitude = 0;
        if (finishSportData16 != null && finishSportData16.getTrainingPlanFinishData() != null) {
            planId = this.R.getTrainingPlanFinishData().getPlanId();
            if (this.R.getTrainingPlanFinishData().getSportCourseId() != null) {
                iIntValue = this.R.getTrainingPlanFinishData().getSportCourseId().intValue();
            }
            long jF = f(this.R);
            Logger.d("SportDataManager", "generate sport data：" + planId + "-" + iIntValue + "-" + jF);
            SportData.a aVarO1 = new SportData.a().a2(this.f).x1((int) (System.currentTimeMillis() / 1000)).h2(this.E).u1((int) this.i).e2(this.g).o1((short) this.j);
            if (f2o.x().L() == 1 || (finishSportData = this.R) == null || finishSportData.getExtraData() == null) {
                maxPace = this.l;
            } else {
                maxPace = this.R.getExtraData().getMaxPace();
            }
            SportData.a aVarZ1 = aVarO1.y1(maxPace).Z1(this.m);
            int i5 = this.F;
            sportData = this.Q;
            if (sportData == null) {
                i = 0;
            } else {
                i = sportData.totalStep;
            }
            SportData.a aVarG2 = aVarZ1.g2(i5 + i);
            short s = this.N;
            SportData.a aVarI1 = aVarG2.Q1(s <= 255 ? s : (short) 255).Y1((float) this.o).w1((float) this.p).l1((float) this.t).M1((float) this.u).m1(this.f27817a).O1(this.f27818b).z1(this.n).R1(this.c).F1(this.b0).G1(this.a0).H1(this.c0).K1(this.d0).I1(this.Z);
            FinishSportData finishSportData17 = this.R;
            SportData.a aVarS0 = aVarI1.S0(finishSportData17 == null && finishSportData17.getExtraData() != null);
            finishSportData2 = this.R;
            if (finishSportData2 == null && finishSportData2.getExtraData() != null) {
                degree = this.R.getExtraData().getDegree();
            } else {
                degree = 0;
            }
            SportData.a aVarT1 = aVarS0.t1((byte) degree);
            finishSportData3 = this.R;
            if (finishSportData3 == null && finishSportData3.getExtraData() != null) {
                avgPace = this.R.getExtraData().getAvgPace();
            } else {
                avgPace = 0;
            }
            SportData.a aVarN1 = aVarT1.n1(avgPace);
            finishSportData4 = this.R;
            if (finishSportData4 == null && finishSportData4.getExtraData() != null) {
                maxPace2 = this.R.getExtraData().getMaxPace();
            } else {
                maxPace2 = this.l;
            }
            SportData.a aVarX0 = aVarN1.X0(maxPace2);
            finishSportData5 = this.R;
            if (finishSportData5 == null && finishSportData5.getExtraData() != null) {
                avgSpeed = this.R.getExtraData().getAvgSpeed();
            } else {
                avgSpeed = 0.0f;
            }
            SportData.a aVarI0 = aVarX0.I0(avgSpeed);
            finishSportData6 = this.R;
            if (finishSportData6 == null && finishSportData6.getExtraData() != null) {
                maxSpeed = this.R.getExtraData().getMaxSpeed();
            } else {
                maxSpeed = 0.0f;
            }
            SportData.a aVarY0 = aVarI0.Y0(maxSpeed);
            finishSportData7 = this.R;
            if (finishSportData7 == null && finishSportData7.getExtraData() != null) {
                avgFrequency = this.R.getExtraData().getAvgFrequency();
            } else {
                avgFrequency = 0;
            }
            SportData.a aVarD0 = aVarY0.D0(avgFrequency);
            BeanDataHelper beanDataHelper = BeanDataHelper.INSTANCE;
            SportData.a aVarU0 = aVarD0.U0(beanDataHelper.maxFrequency(this.R, this.N));
            finishSportData8 = this.R;
            if (finishSportData8 == null && finishSportData8.getExtraData() != null) {
                avgStried = this.R.getExtraData().getAvgStried();
            } else {
                avgStried = 0;
            }
            SportData.a aVarC1 = aVarU0.J0(avgStried).T0(beanDataHelper.mainRunStyle(this.R, this.f0)).P0(beanDataHelper.forefootRatio(this.R, this.f0)).Q0(beanDataHelper.heelRatio(this.R, this.f0)).E0(beanDataHelper.avgImpact(this.R, this.f0)).V0(beanDataHelper.maxImpact(this.R, this.f0)).G0(beanDataHelper.avgOnGround(this.R, this.f0)).b1(beanDataHelper.minOnGround(this.R, this.f0)).F0(beanDataHelper.avgOffGround(this.R, this.f0)).W0(beanDataHelper.maxOffGround(this.R, this.f0)).H0(beanDataHelper.avgOnOffRatio(this.R, this.f0)).c1(beanDataHelper.minOnOffRatio(this.R, this.f0));
            if (sportXmsFinishSportData == null) {
                maxPushStrength = 0.0f;
            } else {
                maxPushStrength = sportXmsFinishSportData.getMaxPushStrength();
            }
            SportData.a aVarP1 = aVarC1.P1(maxPushStrength);
            if (sportXmsFinishSportData == null) {
                maxHit = 0.0f;
            } else {
                maxHit = sportXmsFinishSportData.getMaxHit();
            }
            SportData.a aVarE1 = aVarP1.N1((short) maxHit).E1((byte) (sportXmsFinishSportData != null ? sportXmsFinishSportData.getHitRate() : 0.0f));
            if (sportXmsFinishSportData == null) {
                totalPunches = 0;
            } else {
                totalPunches = sportXmsFinishSportData.getTotalPunches();
            }
            SportData.a aVarF2 = aVarE1.f2((short) totalPunches);
            if (sportXmsFinishSportData == null) {
                perfect = 0;
            } else {
                perfect = sportXmsFinishSportData.getPerfect();
            }
            SportData.a aVarV1 = aVarF2.V1((short) perfect);
            if (sportXmsFinishSportData == null) {
                good = 0;
            } else {
                good = sportXmsFinishSportData.getGood();
            }
            SportData.a aVarC2 = aVarV1.C1((short) good);
            if (sportXmsFinishSportData == null) {
                miss = 0;
            } else {
                miss = sportXmsFinishSportData.getMiss();
            }
            SportData.a aVarD1 = aVarC2.S1((short) miss).q1(jF).i1(planId).i2(iIntValue).X1(this.S).B1(this.T).A1(this.U).D1(this.V);
            finishSportData9 = this.R;
            if (finishSportData9 == null && finishSportData9.getExtraData() != null) {
                avgVerticalStrideRatio = this.R.getExtraData().getAvgVerticalStrideRatio();
            } else {
                avgVerticalStrideRatio = 0;
            }
            SportData.a aVarL0 = aVarD1.L0(avgVerticalStrideRatio);
            finishSportData10 = this.R;
            if (finishSportData10 == null && finishSportData10.getExtraData() != null) {
                minVerticalStrideRatio = this.R.getExtraData().getMinVerticalStrideRatio();
            } else {
                minVerticalStrideRatio = 0;
            }
            SportData.a aVarE2 = aVarL0.e1(minVerticalStrideRatio);
            finishSportData11 = this.R;
            if (finishSportData11 == null && finishSportData11.getExtraData() != null) {
                maxVerticalStrideRatio = this.R.getExtraData().getMaxVerticalStrideRatio();
            } else {
                maxVerticalStrideRatio = 0;
            }
            SportData.a aVarA1 = aVarE2.a1(maxVerticalStrideRatio);
            finishSportData12 = this.R;
            if (finishSportData12 == null && finishSportData12.getExtraData() != null) {
                avgVerticalAmplitude = this.R.getExtraData().getAvgVerticalAmplitude();
            } else {
                avgVerticalAmplitude = 0;
            }
            SportData.a aVarK0 = aVarA1.K0(avgVerticalAmplitude);
            finishSportData13 = this.R;
            if (finishSportData13 == null && finishSportData13.getExtraData() != null) {
                minVerticalAmplitude = this.R.getExtraData().getMinVerticalAmplitude();
            } else {
                minVerticalAmplitude = 0;
            }
            SportData.a aVarD2 = aVarK0.d1(minVerticalAmplitude);
            finishSportData14 = this.R;
            if (finishSportData14 != null && finishSportData14.getExtraData() != null) {
                maxVerticalAmplitude = this.R.getExtraData().getMaxVerticalAmplitude();
            }
            return aVarD2.Z0(maxVerticalAmplitude).M0();
        }
        planId = 0;
        iIntValue = 0;
        long jF2 = f(this.R);
        Logger.d("SportDataManager", "generate sport data：" + planId + "-" + iIntValue + "-" + jF2);
        SportData.a aVarO2 = new SportData.a().a2(this.f).x1((int) (System.currentTimeMillis() / 1000)).h2(this.E).u1((int) this.i).e2(this.g).o1((short) this.j);
        if (f2o.x().L() == 1) {
            maxPace = this.l;
        } else {
            maxPace = this.R.getExtraData().getMaxPace();
        }
        SportData.a aVarZ2 = aVarO2.y1(maxPace).Z1(this.m);
        int i6 = this.F;
        sportData = this.Q;
        if (sportData == null) {
            i = 0;
        } else {
            i = sportData.totalStep;
        }
        SportData.a aVarG3 = aVarZ2.g2(i6 + i);
        short s2 = this.N;
        SportData.a aVarI2 = aVarG3.Q1(s2 <= 255 ? s2 : (short) 255).Y1((float) this.o).w1((float) this.p).l1((float) this.t).M1((float) this.u).m1(this.f27817a).O1(this.f27818b).z1(this.n).R1(this.c).F1(this.b0).G1(this.a0).H1(this.c0).K1(this.d0).I1(this.Z);
        FinishSportData finishSportData18 = this.R;
        SportData.a aVarS1 = aVarI2.S0(finishSportData18 == null && finishSportData18.getExtraData() != null);
        finishSportData2 = this.R;
        if (finishSportData2 == null) {
            degree = 0;
        } else {
            degree = this.R.getExtraData().getDegree();
        }
        SportData.a aVarT2 = aVarS1.t1((byte) degree);
        finishSportData3 = this.R;
        if (finishSportData3 == null) {
            avgPace = 0;
        } else {
            avgPace = this.R.getExtraData().getAvgPace();
        }
        SportData.a aVarN2 = aVarT2.n1(avgPace);
        finishSportData4 = this.R;
        if (finishSportData4 == null) {
            maxPace2 = this.l;
        } else {
            maxPace2 = this.R.getExtraData().getMaxPace();
        }
        SportData.a aVarX1 = aVarN2.X0(maxPace2);
        finishSportData5 = this.R;
        if (finishSportData5 == null) {
            avgSpeed = 0.0f;
        } else {
            avgSpeed = this.R.getExtraData().getAvgSpeed();
        }
        SportData.a aVarI3 = aVarX1.I0(avgSpeed);
        finishSportData6 = this.R;
        if (finishSportData6 == null) {
            maxSpeed = 0.0f;
        } else {
            maxSpeed = this.R.getExtraData().getMaxSpeed();
        }
        SportData.a aVarY1 = aVarI3.Y0(maxSpeed);
        finishSportData7 = this.R;
        if (finishSportData7 == null) {
            avgFrequency = 0;
        } else {
            avgFrequency = this.R.getExtraData().getAvgFrequency();
        }
        SportData.a aVarD3 = aVarY1.D0(avgFrequency);
        BeanDataHelper beanDataHelper2 = BeanDataHelper.INSTANCE;
        SportData.a aVarU1 = aVarD3.U0(beanDataHelper2.maxFrequency(this.R, this.N));
        finishSportData8 = this.R;
        if (finishSportData8 == null) {
            avgStried = 0;
        } else {
            avgStried = this.R.getExtraData().getAvgStried();
        }
        SportData.a aVarC3 = aVarU1.J0(avgStried).T0(beanDataHelper2.mainRunStyle(this.R, this.f0)).P0(beanDataHelper2.forefootRatio(this.R, this.f0)).Q0(beanDataHelper2.heelRatio(this.R, this.f0)).E0(beanDataHelper2.avgImpact(this.R, this.f0)).V0(beanDataHelper2.maxImpact(this.R, this.f0)).G0(beanDataHelper2.avgOnGround(this.R, this.f0)).b1(beanDataHelper2.minOnGround(this.R, this.f0)).F0(beanDataHelper2.avgOffGround(this.R, this.f0)).W0(beanDataHelper2.maxOffGround(this.R, this.f0)).H0(beanDataHelper2.avgOnOffRatio(this.R, this.f0)).c1(beanDataHelper2.minOnOffRatio(this.R, this.f0));
        if (sportXmsFinishSportData == null) {
            maxPushStrength = 0.0f;
        } else {
            maxPushStrength = sportXmsFinishSportData.getMaxPushStrength();
        }
        SportData.a aVarP2 = aVarC3.P1(maxPushStrength);
        if (sportXmsFinishSportData == null) {
            maxHit = 0.0f;
        } else {
            maxHit = sportXmsFinishSportData.getMaxHit();
        }
        SportData.a aVarE3 = aVarP2.N1((short) maxHit).E1((byte) (sportXmsFinishSportData != null ? sportXmsFinishSportData.getHitRate() : 0.0f));
        if (sportXmsFinishSportData == null) {
            totalPunches = 0;
        } else {
            totalPunches = sportXmsFinishSportData.getTotalPunches();
        }
        SportData.a aVarF3 = aVarE3.f2((short) totalPunches);
        if (sportXmsFinishSportData == null) {
            perfect = 0;
        } else {
            perfect = sportXmsFinishSportData.getPerfect();
        }
        SportData.a aVarV2 = aVarF3.V1((short) perfect);
        if (sportXmsFinishSportData == null) {
            good = 0;
        } else {
            good = sportXmsFinishSportData.getGood();
        }
        SportData.a aVarC4 = aVarV2.C1((short) good);
        if (sportXmsFinishSportData == null) {
            miss = 0;
        } else {
            miss = sportXmsFinishSportData.getMiss();
        }
        SportData.a aVarD4 = aVarC4.S1((short) miss).q1(jF2).i1(planId).i2(iIntValue).X1(this.S).B1(this.T).A1(this.U).D1(this.V);
        finishSportData9 = this.R;
        if (finishSportData9 == null) {
            avgVerticalStrideRatio = 0;
        } else {
            avgVerticalStrideRatio = this.R.getExtraData().getAvgVerticalStrideRatio();
        }
        SportData.a aVarL1 = aVarD4.L0(avgVerticalStrideRatio);
        finishSportData10 = this.R;
        if (finishSportData10 == null) {
            minVerticalStrideRatio = 0;
        } else {
            minVerticalStrideRatio = this.R.getExtraData().getMinVerticalStrideRatio();
        }
        SportData.a aVarE4 = aVarL1.e1(minVerticalStrideRatio);
        finishSportData11 = this.R;
        if (finishSportData11 == null) {
            maxVerticalStrideRatio = 0;
        } else {
            maxVerticalStrideRatio = this.R.getExtraData().getMaxVerticalStrideRatio();
        }
        SportData.a aVarA2 = aVarE4.a1(maxVerticalStrideRatio);
        finishSportData12 = this.R;
        if (finishSportData12 == null) {
            avgVerticalAmplitude = 0;
        } else {
            avgVerticalAmplitude = this.R.getExtraData().getAvgVerticalAmplitude();
        }
        SportData.a aVarK1 = aVarA2.K0(avgVerticalAmplitude);
        finishSportData13 = this.R;
        if (finishSportData13 == null) {
            minVerticalAmplitude = 0;
        } else {
            minVerticalAmplitude = this.R.getExtraData().getMinVerticalAmplitude();
        }
        SportData.a aVarD5 = aVarK1.d1(minVerticalAmplitude);
        finishSportData14 = this.R;
        if (finishSportData14 != null) {
            maxVerticalAmplitude = this.R.getExtraData().getMaxVerticalAmplitude();
        }
        return aVarD5.Z0(maxVerticalAmplitude).M0();
    }

    public List<Integer> k() {
        return this.W;
    }

    public void l(int i) {
        Iterator<wyc> it = this.K.values().iterator();
        while (it.hasNext()) {
            it.next().onAdjustmentDis(i);
        }
        if (f2o.x().N() != null) {
            SportData sportDataJ = j();
            sportDataJ.adjustmentDis = i;
            FitnessLogUtils.i("SportDataManager", "hadAdjustmentDistance");
            f2o.x().N().onSportReportData(sportDataJ);
        }
        this.L.postDelayed(new ldn(this), 1000L);
    }

    public final boolean m(int i, double d) {
        return i == 3 && d >= 100.0d;
    }

    public final void o(int i) {
        int iAbs = Math.abs(i);
        if (iAbs >= (this.f27818b & 255)) {
            this.f27818b = (byte) iAbs;
        }
        byte b2 = this.c;
        if (b2 == 0 || iAbs <= b2) {
            this.c = (byte) iAbs;
        }
        if (iAbs != 0) {
            this.d++;
        }
        int i2 = this.e + iAbs;
        this.e = i2;
        int i3 = this.d;
        if (i3 != 0) {
            this.f27817a = (byte) (i2 / i3);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(SportLocationResult sportLocationResult) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportDataManager", "onPhoneDataChanged:" + phoneSportData);
        this.E = phoneSportData.duration;
        if (this.Q == null) {
            SportData sportDataE = f2o.x().E();
            this.Q = sportDataE;
            if (sportDataE != null) {
                this.z = sportDataE.kmCount;
            }
        }
        d(phoneSportData);
        r(phoneSportData);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(x7r x7rVar) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, @Nullable byte[] bArr, FinishSportData finishSportData) {
        SportTarget sportTarget;
        FitnessLogUtils.i("SportDataManager", "onSportFinished,isFinish:" + this.g0 + ",finishSportData:" + finishSportData);
        if (this.g0) {
            return;
        }
        this.g0 = true;
        if (finishSportData != null && finishSportData.getExtraData() != null) {
            FitnessLogUtils.i("SportDataManager", "FinishSportData : " + finishSportData.getExtraData().toString());
        }
        this.O = 0L;
        this.M = 0L;
        this.R = finishSportData;
        this.Y = 0;
        SportData sportDataJ = j();
        if (this.W.size() == 0) {
            this.W.add(Integer.valueOf((int) (((double) this.E) / (this.i / 1000.0d))));
            FitnessLogUtils.i("SportDataManager", "duration:" + this.E + ", distance :" + this.i + ",pace:" + this.W.get(0));
        }
        SportRequestData sportRequestDataO = f2o.x().O();
        if (sportRequestDataO != null && (sportTarget = sportRequestDataO.sportTargetArr) != null) {
            int type = sportTarget.getType();
            if (type == 1) {
                sportDataJ.targetDurution = sportRequestDataO.sportTargetArr.getValue();
            } else if (type == 2) {
                sportDataJ.targetCal = sportRequestDataO.sportTargetArr.getValue();
            } else if (type == 3) {
                sportDataJ.targetDis = sportRequestDataO.sportTargetArr.getValue();
            }
        }
        Iterator<wyc> it = this.K.values().iterator();
        while (it.hasNext()) {
            it.next().onSportReportData(z, sportDataJ);
        }
        if (m(this.h, this.i)) {
            return;
        }
        if (f2o.x().N() != null) {
            FitnessLogUtils.i("SportDataManager", "onSportReportData , sportReportData:" + sportDataJ);
            f2o.x().N().onSportReportData(sportDataJ);
        }
        this.L.postDelayed(new ldn(this), VibrateModeProgressBar.sLongToLong);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        this.y = (int) (System.currentTimeMillis() / 1000);
        this.O = 0L;
        this.M = 0L;
        Iterator<wyc> it = this.K.values().iterator();
        while (it.hasNext()) {
            it.next().onSportPaused(this.y);
        }
        FitnessLogUtils.i("SportDataManager", "onSportPaused");
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.x = iCurrentTimeMillis;
        this.O = iCurrentTimeMillis;
        this.M = iCurrentTimeMillis;
        Iterator<wyc> it = this.K.values().iterator();
        while (it.hasNext()) {
            it.next().onSportRestart(this.x);
        }
        FitnessLogUtils.i("SportDataManager", "onSportRestarted");
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        for (wyc wycVar : this.K.values()) {
            FitnessLogUtils.i("SportDataManager", "onSportSegment:" + i + "-" + wycVar);
            try {
                if (wycVar instanceof f1l) {
                    wycVar.onSportSegment(i, i2);
                }
            } catch (Exception e) {
                Logger.e("SportDataManager", "onSportSegment exception", e);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4, int i5) {
        this.f = i2;
        this.g = i3;
        this.h = i4;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.O = seconds;
        this.M = seconds;
        b();
        Iterator<wyc> it = this.K.values().iterator();
        while (it.hasNext()) {
            it.next().onSportStart();
        }
        this.g0 = false;
        FitnessLogUtils.i("SportDataManager", "onSportStarted , isFinish:" + this.g0);
    }

    public void p(int i) {
        if (this.l > i && i != 0) {
            this.l = i;
        }
        if (this.m <= i) {
            this.m = i;
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }

    public void q(float f) {
        if (this.n <= f) {
            this.n = f;
            FitnessLogUtils.i("SportDataManager", "maxSpeed : " + this.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0114  */
    public void r(PhoneSportData phoneSportData) {
        int iCeil;
        boolean z;
        int iCeil2;
        int i;
        boolean z2;
        SportData sportData;
        PhoneSportData phoneSportData2 = phoneSportData;
        int iG = g(phoneSportData2.duration, this.Y);
        this.Y += iG;
        if (iG == 0) {
            FitnessLogUtils.i("SportDataManager", ">>>>>>>>>>>>>> diff:" + iG);
            return;
        }
        o(this.w);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.O = seconds;
        int i2 = this.F;
        int i3 = this.G;
        if (i2 > i3) {
            iCeil = (int) ((Math.ceil(i2 - i3) * 1.0d) / ((double) iG));
            this.G = this.F;
            z = iCeil <= 16 || seconds - this.M <= ((long) iG);
            this.M = seconds;
        } else {
            iCeil = 0;
            z = true;
        }
        int i4 = this.j;
        int i5 = this.f27819k;
        if (i4 > i5) {
            iCeil2 = (int) ((Math.ceil(i4 - i5) * 1.0d) / ((double) iG));
            this.f27819k = this.j;
        } else {
            iCeil2 = 0;
        }
        double d = this.i;
        int i6 = iCeil2;
        double d2 = this.D;
        if (d == d2) {
            i = 0;
        } else if (this.h == 6) {
            i = (int) (((d - d2) * 1.0d) / ((double) iG));
            this.D = d2 + ((double) (i * iG));
        } else {
            i = (int) ((((d - d2) * 1.0d) / ((double) iG)) * 10.0d);
            this.D = d;
        }
        if (d > 1000.0d) {
            int i7 = this.z;
            if (d >= i7 * 1000) {
                z2 = true;
                this.z = i7 + 1;
                this.J = true;
                this.W.add(Integer.valueOf(phoneSportData2.duration - this.X));
                FitnessLogUtils.i("SportDataManager", "current distance : " + this.i + ", kmCount : " + this.z + ",duration:" + phoneSportData2.duration + ",last:" + this.W.getLast() + ", preWholeKiloPace:" + this.X);
                this.X = phoneSportData2.duration;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        s(phoneSportData2.heart_rate);
        int i8 = 0;
        while (i8 < iG) {
            int i9 = i6;
            SportData sportDataM0 = new SportData.a().k1(0.0f).a2(this.f).d2(this.x).p1(e(iCeil, i9)).J1((byte) this.w).v1(h()).j1((byte) i).u1((int) this.i).b2(phoneSportData2.stride_frequency).D0(phoneSportData2.stride_frequency).T0(phoneSportData2.runStyle).r1(this.j).s1(this.F).c2((byte) phoneSportData2.stride).L1(phoneSportData2.impact).U1(phoneSportData2.onGround).T1(phoneSportData2.offGround).W1(z).N0(phoneSportData2.pace).O0(phoneSportData2.speed * 10.0f).h1(phoneSportData2.onOffRatio).T0(phoneSportData2.runStyle).g1(phoneSportData2.onGround).f1(phoneSportData2.offGround).R0(phoneSportData2.impact).j2(phoneSportData2.verticalAmplitude).k2(phoneSportData2.verticalStrideRatio).M0();
            if (i8 == iG - 1) {
                if (this.P == 0) {
                    this.P = seconds;
                }
                boolean z3 = seconds - this.P >= 15 ? z2 : false;
                if (z3) {
                    FitnessLogUtils.i("SportDataManager", "currentTime : " + seconds + ",lastAddToFileTime : " + this.P + ", Thread:" + Thread.currentThread().getName() + " , this : " + this);
                    SportData sportDataJ = j();
                    sportDataJ.cal = (short) this.j;
                    sportDataJ.sportType = f2o.x().T();
                    sportDataJ.appLaunchType = f2o.x().t();
                    sportDataJ.maxHrRate = this.f27818b;
                    sportDataJ.kmCount = this.z;
                    sportDataJ.aveHrRate = this.f27817a;
                    sportDataJ.cacheTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    String strC = h4b.c(sportDataJ);
                    FitnessLogUtils.i("SportDataManager", "save RecoverSport : " + strC);
                    if (RecorderUtils.INSTANCE.isSupportRecover(this.h)) {
                        SportManagerPreference.INSTANCE.setKEY_RECOVER_SPORT_REPORT(strC);
                    }
                    this.P = seconds;
                    sportData = sportDataM0;
                } else {
                    sportData = sportDataM0;
                }
                sportData.addToFile = z3;
            } else {
                iG = iG;
                sportData = sportDataM0;
            }
            Iterator<wyc> it = this.K.values().iterator();
            while (it.hasNext()) {
                it.next().onSportRecordData(sportData);
            }
            i8++;
            phoneSportData2 = phoneSportData;
            i6 = i9;
            iG = iG;
            z2 = true;
        }
    }

    public final void s(int i) {
        HrZoneLevel hrZone = this.e0.getHrZone(i);
        if (hrZone == HrZoneLevel.WarmUp) {
            this.d0++;
        }
        if (hrZone == HrZoneLevel.FatBurning) {
            this.c0++;
        }
        if (hrZone == HrZoneLevel.Aerobic) {
            this.b0++;
        }
        if (hrZone == HrZoneLevel.Anaerobic) {
            this.a0++;
        }
        if (hrZone == HrZoneLevel.Extreme) {
            this.Z++;
        }
    }
}
