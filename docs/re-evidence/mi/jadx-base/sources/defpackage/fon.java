package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.model.SportCourseInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class fon extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<SportCourseInfoModel> f18007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f18008b;
    public LayoutInflater c;
    public int f;
    public SportBasicReport o;
    public int d = 1;
    public int e = 0;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18009k = false;
    public boolean l = false;
    public boolean m = true;
    public int n = 1;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f18010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f18011b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public TextView h;
        public TextView i;
        public TextView j;

        public a(View view) {
            super(view);
            this.f18010a = (TextView) view.findViewById(bsi.J8);
            this.f18011b = (TextView) view.findViewById(bsi.L8);
            this.c = (TextView) view.findViewById(bsi.B8);
            this.d = (TextView) view.findViewById(bsi.c9);
            this.e = (TextView) view.findViewById(bsi.G8);
            this.f = (TextView) view.findViewById(bsi.F8);
            this.g = (TextView) view.findViewById(bsi.S8);
            this.h = (TextView) view.findViewById(bsi.R8);
            this.i = (TextView) view.findViewById(bsi.C8);
            this.j = (TextView) view.findViewById(bsi.P8);
        }

        private String b(int i, int i2) {
            int i3 = fon.this.f;
            if (i3 == 9 || i3 == 10) {
                return "" + i2;
            }
            if (i == 2) {
                return "R";
            }
            return "" + i2;
        }

        private String c(int i) {
            fon fonVar = fon.this;
            int i2 = fonVar.f;
            if (i2 == 10 || i2 == 9) {
                if (i == 3) {
                    return fonVar.f18008b.getString(j1j.Z9);
                }
                if (i == 0) {
                    return fonVar.f18008b.getString(j1j.da);
                }
                if (i == 2) {
                    return fonVar.f18008b.getString(j1j.ca);
                }
                if (i == 4) {
                    return fonVar.f18008b.getString(j1j.ba);
                }
                return i == 1 ? fonVar.f18008b.getString(j1j.aa) : "";
            }
            if (i == 0) {
                return fonVar.f18008b.getString(j1j.g2);
            }
            if (i == 1) {
                return fonVar.f18008b.getString(j1j.f2);
            }
            if (i == 2) {
                return fonVar.f18008b.getString(j1j.d2);
            }
            if (i == 3) {
                return fonVar.f18008b.getString(j1j.c2);
            }
            if (i == 4) {
                return fonVar.f18008b.getString(j1j.a2);
            }
            if (i == 5) {
                return fonVar.f18008b.getString(j1j.e2);
            }
            if (i == 6) {
                return fonVar.f18008b.getString(j1j.b2);
            }
            if (i == 7) {
                return fonVar.f18008b.getString(j1j.Z1);
            }
            if (i == 8) {
                return fonVar.f18008b.getString(j1j.Y1);
            }
            if (i == 11) {
                return fonVar.f18008b.getString(j1j.Ga);
            }
            if (i == 10) {
                return fonVar.f18008b.getString(j1j.Fa);
            }
            return i == 12 ? fonVar.f18008b.getString(j1j.Ea) : "";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:75:0x03a7  */
        /* JADX WARN: Code duplicated, block: B:77:0x03ad  */
        /* JADX WARN: Code duplicated, block: B:79:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:81:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:82:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:83:0x03ef  */
        /* JADX WARN: Code duplicated, block: B:85:0x03f5  */
        /* JADX WARN: Code duplicated, block: B:86:0x0407  */
        /* JADX WARN: Code duplicated, block: B:89:0x0423  */
        /* JADX WARN: Code duplicated, block: B:91:0x042b  */
        /* JADX WARN: Code duplicated, block: B:92:0x045c  */
        /* JADX WARN: Code duplicated, block: B:93:0x0463  */
        /* JADX WARN: Instruction removed from duplicated block: B:91:0x042b, please report this as an issue */
        public void a(int i, SportCourseInfoModel sportCourseInfoModel) {
            Float distance;
            int iRound;
            if (sportCourseInfoModel.getBestInfoModel()) {
                this.f18010a.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.f18011b.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.c.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.d.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.e.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.f.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.g.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.h.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.i.setTextColor(fon.this.f18008b.getColor(dki.E0));
                this.j.setTextColor(fon.this.f18008b.getColor(dki.E0));
            } else {
                this.f18010a.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.f18011b.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.c.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.d.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.e.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.f.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.g.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.h.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.i.setTextColor(fon.this.f18008b.getColor(dki.G0));
                this.j.setTextColor(fon.this.f18008b.getColor(dki.G0));
            }
            if (i == 1) {
                fon.this.n = 1;
            }
            this.f18010a.setText(b(sportCourseInfoModel.getSportState(), sportCourseInfoModel.getIndex()));
            if (fon.this.m) {
                this.f18011b.setText(c(sportCourseInfoModel.getSportState()));
            } else {
                this.f18011b.setVisibility(8);
            }
            int duration = (int) sportCourseInfoModel.getDuration();
            this.c.setText(TimeDateUtil.getTimeStrWithSecDef(duration));
            int i2 = fon.this.f;
            if (i2 != 313 && i2 != 334) {
                switch (i2) {
                    case 1:
                    case 3:
                        Float distance2 = sportCourseInfoModel.getDistance();
                        if (distance2 != null) {
                            int iRound2 = Math.round(distance2.floatValue());
                            this.d.setText(pz6.a(iRound2));
                            if (sportCourseInfoModel.getAvgPace() != null) {
                                this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getAvgPace().intValue()));
                            } else {
                                this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(SportReportComputeUtil.computeAvgPace(iRound2, duration)));
                            }
                            if (!fon.this.g) {
                                this.f.setVisibility(8);
                            } else if (sportCourseInfoModel.getMaxPace() != null) {
                                this.f.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getMaxPace().intValue()));
                            } else {
                                this.f.setText("--");
                            }
                            if (!fon.this.j) {
                                this.g.setVisibility(8);
                            } else if (sportCourseInfoModel.getTotalUpHeight() <= 0.0f) {
                                this.g.setText("--");
                            } else {
                                this.g.setText(xr5.f(sportCourseInfoModel.getTotalUpHeight()) + fon.this.f18008b.getResources().getQuantityString(byi.f4728k, (int) sportCourseInfoModel.getTotalUpHeight()));
                            }
                        }
                        break;
                    case 2:
                        Float distance3 = sportCourseInfoModel.getDistance();
                        if (distance3 != null) {
                            this.d.setText(pz6.a(Math.round(distance3.floatValue())));
                        }
                        if (sportCourseInfoModel.getTotalSteps() != null) {
                            this.e.setText("" + sportCourseInfoModel.getTotalSteps());
                        } else {
                            this.e.setText("--");
                        }
                        this.f.setVisibility(8);
                        this.g.setVisibility(8);
                        break;
                    case 4:
                    case 5:
                        distance = sportCourseInfoModel.getDistance();
                        if (distance != null) {
                            iRound = Math.round(distance.floatValue());
                            this.d.setText(pz6.a(iRound));
                            if (fon.this.o.supportPace()) {
                                if (sportCourseInfoModel.getAvgPace() != null) {
                                    this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getAvgPace().intValue()));
                                } else {
                                    this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(SportReportComputeUtil.computeAvgPace(iRound, duration)));
                                }
                            } else if (sportCourseInfoModel.getAvgSpeed() != null) {
                                this.e.setText(xr5.g(1, sportCourseInfoModel.getAvgSpeed().floatValue()));
                            } else {
                                this.e.setText(xr5.g(1, SportReportComputeUtil.computeAvgSpeed(distance.floatValue(), duration)));
                            }
                            this.f.setVisibility(8);
                            if (fon.this.j) {
                                this.g.setVisibility(8);
                            } else if (sportCourseInfoModel.getTotalUpHeight() > 0.0f) {
                                this.g.setText("--");
                            } else {
                                this.g.setText(xr5.f(sportCourseInfoModel.getTotalUpHeight()) + fon.this.f18008b.getResources().getQuantityString(byi.f4728k, (int) sportCourseInfoModel.getTotalUpHeight()));
                            }
                        }
                        break;
                    case 6:
                        Float distance4 = sportCourseInfoModel.getDistance();
                        if (distance4 != null) {
                            this.d.setText(pz6.a(Math.round(distance4.floatValue())));
                            if (sportCourseInfoModel.getAvgSpeed() != null) {
                                this.e.setText(xr5.g(1, sportCourseInfoModel.getAvgSpeed().floatValue()));
                            } else {
                                this.e.setText(xr5.g(1, SportReportComputeUtil.computeAvgSpeed(distance4.floatValue(), duration)));
                            }
                            if (!fon.this.g) {
                                this.f.setVisibility(8);
                            } else if (sportCourseInfoModel.getMaxPace() == null || sportCourseInfoModel.getMaxPace().intValue() <= 0) {
                                this.f.setText("--");
                            } else {
                                this.f.setText(xr5.g(1, 3600.0f / sportCourseInfoModel.getMaxPace().intValue()));
                            }
                            if (!fon.this.j) {
                                this.g.setVisibility(8);
                            } else if (sportCourseInfoModel.getTotalUpHeight() <= 0.0f) {
                                this.g.setText("--");
                            } else {
                                this.g.setText(xr5.f(sportCourseInfoModel.getTotalUpHeight()) + fon.this.f18008b.getResources().getQuantityString(byi.f4728k, (int) sportCourseInfoModel.getTotalUpHeight()));
                            }
                        }
                        break;
                    default:
                        switch (i2) {
                            case 9:
                            case 10:
                                this.c.setText(TimeDateUtil.getTimeStrWithHourSecDef(duration, false));
                                Float distance5 = sportCourseInfoModel.getDistance();
                                if (distance5 != null) {
                                    this.d.setText(pz6.c(AppUtil.getApp(), Math.round(distance5.floatValue()), 2));
                                    if (sportCourseInfoModel.getAvgPace() != null) {
                                        this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getAvgPace().intValue()));
                                    }
                                }
                                if (fon.this.f18009k) {
                                    this.f.setVisibility(0);
                                    if (sportCourseInfoModel.getCount() != null) {
                                        this.f.setText("" + sportCourseInfoModel.getCount());
                                    }
                                } else {
                                    this.f.setVisibility(8);
                                }
                                if (fon.this.l) {
                                    this.g.setVisibility(0);
                                    if (sportCourseInfoModel.getSwolf() != null) {
                                        this.g.setText("" + sportCourseInfoModel.getSwolf());
                                    }
                                } else {
                                    this.g.setVisibility(8);
                                }
                                this.h.setVisibility(8);
                                this.i.setVisibility(8);
                                this.j.setVisibility(8);
                                break;
                            case 11:
                                if (sportCourseInfoModel.getTotalSteps() != null) {
                                    this.d.setText("" + sportCourseInfoModel.getTotalSteps());
                                } else {
                                    this.d.setText("--");
                                }
                                this.e.setVisibility(8);
                                this.f.setVisibility(8);
                                this.g.setVisibility(8);
                                break;
                            default:
                                switch (i2) {
                                    case 13:
                                    case 14:
                                        if (sportCourseInfoModel.getCount() != null) {
                                            this.d.setText("" + sportCourseInfoModel.getCount());
                                            int iComputeStrokeOneMinute = SportReportComputeUtil.computeStrokeOneMinute(sportCourseInfoModel.getCount().intValue(), duration);
                                            if (iComputeStrokeOneMinute > 0) {
                                                this.e.setText("" + iComputeStrokeOneMinute);
                                            } else {
                                                this.e.setText("--");
                                            }
                                        } else {
                                            this.d.setText("--");
                                            this.e.setText("--");
                                        }
                                        this.f.setVisibility(8);
                                        this.g.setVisibility(8);
                                        break;
                                    case 15:
                                        distance = sportCourseInfoModel.getDistance();
                                        if (distance != null) {
                                            iRound = Math.round(distance.floatValue());
                                            this.d.setText(pz6.a(iRound));
                                            if (fon.this.o.supportPace()) {
                                                if (sportCourseInfoModel.getAvgPace() != null) {
                                                    this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getAvgPace().intValue()));
                                                } else {
                                                    this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(SportReportComputeUtil.computeAvgPace(iRound, duration)));
                                                }
                                            } else if (sportCourseInfoModel.getAvgSpeed() != null) {
                                                this.e.setText(xr5.g(1, sportCourseInfoModel.getAvgSpeed().floatValue()));
                                            } else {
                                                this.e.setText(xr5.g(1, SportReportComputeUtil.computeAvgSpeed(distance.floatValue(), duration)));
                                            }
                                            this.f.setVisibility(8);
                                            if (fon.this.j) {
                                                this.g.setVisibility(8);
                                            } else if (sportCourseInfoModel.getTotalUpHeight() > 0.0f) {
                                                this.g.setText("--");
                                            } else {
                                                this.g.setText(xr5.f(sportCourseInfoModel.getTotalUpHeight()) + fon.this.f18008b.getResources().getQuantityString(byi.f4728k, (int) sportCourseInfoModel.getTotalUpHeight()));
                                            }
                                        }
                                        break;
                                    default:
                                        this.d.setVisibility(8);
                                        this.e.setVisibility(8);
                                        this.f.setVisibility(8);
                                        this.g.setVisibility(8);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (sportCourseInfoModel.getActionCount() != null) {
                    this.d.setText("" + sportCourseInfoModel.getActionCount());
                } else if (sportCourseInfoModel.getSportState() == 1) {
                    this.d.setText("0");
                } else {
                    this.d.setText("--");
                }
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.g.setVisibility(8);
                this.h.setVisibility(8);
                this.i.setVisibility(8);
                this.j.setVisibility(8);
            }
            if (!fon.this.h) {
                this.i.setVisibility(8);
            } else if (sportCourseInfoModel.getMaxHr() == null || sportCourseInfoModel.getMaxHr().intValue() <= 0) {
                this.i.setText("--");
            } else {
                this.i.setText("" + sportCourseInfoModel.getMaxHr());
            }
            if (sportCourseInfoModel.getAvgHr() != null) {
                this.h.setText("" + sportCourseInfoModel.getAvgHr());
            } else {
                this.h.setText("--");
            }
            if (sportCourseInfoModel.getCalories() == null) {
                this.j.setText("--");
                return;
            }
            this.j.setText("" + sportCourseInfoModel.getCalories());
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f18013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f18014b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public TextView g;
        public TextView h;
        public TextView i;
        public TextView j;

        public b(View view) {
            super(view);
            this.d = (TextView) view.findViewById(bsi.t9);
            this.e = (TextView) view.findViewById(bsi.u9);
            this.f = (TextView) view.findViewById(bsi.v9);
            this.g = (TextView) view.findViewById(bsi.w9);
            this.h = (TextView) view.findViewById(bsi.x9);
            this.i = (TextView) view.findViewById(bsi.y9);
            this.f18014b = (TextView) view.findViewById(bsi.r9);
            this.f18013a = (TextView) view.findViewById(bsi.q9);
            this.c = (TextView) view.findViewById(bsi.s9);
            this.j = (TextView) view.findViewById(bsi.z9);
        }

        public void bindData() {
            if (fon.this.m) {
                this.f18014b.setVisibility(0);
            } else {
                this.f18014b.setVisibility(8);
            }
            if (fon.this.h) {
                this.i.setVisibility(0);
            } else {
                this.i.setVisibility(8);
            }
            fon fonVar = fon.this;
            if (fonVar.i) {
                this.j.setText(fonVar.f18008b.getString(j1j.ea));
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
            }
            this.h.setText(fon.this.f18008b.getString(j1j.X));
            fon fonVar2 = fon.this;
            int i = fonVar2.f;
            if (i == 313 || i == 334) {
                this.d.setText(fonVar2.f18008b.getString(j1j.e1));
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.g.setVisibility(8);
                this.h.setVisibility(8);
                this.i.setVisibility(8);
                this.j.setVisibility(8);
                return;
            }
            switch (i) {
                case 1:
                case 3:
                    this.d.setText(fonVar2.f18008b.getString(j1j.e3));
                    this.e.setText(fon.this.f18008b.getString(j1j.f3));
                    fon fonVar3 = fon.this;
                    if (fonVar3.g) {
                        this.f.setText(fonVar3.f18008b.getString(j1j.R));
                    } else {
                        this.f.setVisibility(8);
                    }
                    fon fonVar4 = fon.this;
                    if (fonVar4.j) {
                        this.g.setText(fonVar4.f18008b.getString(j1j.L3));
                        return;
                    } else {
                        this.g.setVisibility(8);
                        return;
                    }
                case 2:
                    this.d.setText(fonVar2.f18008b.getString(j1j.e3));
                    this.e.setText(fon.this.f18008b.getString(j1j.t8));
                    this.f.setVisibility(8);
                    this.g.setVisibility(8);
                    return;
                case 4:
                case 5:
                    break;
                case 6:
                    this.d.setText(fonVar2.f18008b.getString(j1j.e3));
                    this.e.setText(fon.this.f18008b.getString(j1j.g3));
                    fon fonVar5 = fon.this;
                    if (fonVar5.g) {
                        this.f.setText(fonVar5.f18008b.getString(j1j.S));
                    } else {
                        this.f.setVisibility(8);
                    }
                    fon fonVar6 = fon.this;
                    if (fonVar6.j) {
                        this.g.setText(fonVar6.f18008b.getString(j1j.L3));
                        return;
                    } else {
                        this.g.setVisibility(8);
                        return;
                    }
                default:
                    switch (i) {
                        case 9:
                        case 10:
                            if (fonVar2.f18009k) {
                                this.f.setVisibility(0);
                            } else {
                                this.f.setVisibility(8);
                            }
                            if (fon.this.l) {
                                this.g.setVisibility(0);
                            } else {
                                this.g.setVisibility(8);
                            }
                            this.f18013a.setText(j1j.q2);
                            this.f18014b.setText(j1j.Y9);
                            this.c.setText(j1j.s1);
                            this.d.setText(j1j.e3);
                            this.e.setText(j1j.f3);
                            this.f.setText(j1j.L9);
                            this.g.setText(j1j.L8);
                            this.h.setVisibility(8);
                            return;
                        case 11:
                            this.d.setText(fonVar2.f18008b.getString(j1j.t8));
                            this.e.setVisibility(8);
                            this.f.setVisibility(8);
                            this.g.setVisibility(8);
                            return;
                        default:
                            switch (i) {
                                case 13:
                                    this.d.setText(fonVar2.f18008b.getString(j1j.K8));
                                    this.e.setText(fon.this.f18008b.getString(j1j.T9));
                                    this.f.setVisibility(8);
                                    this.g.setVisibility(8);
                                    break;
                                case 14:
                                    this.d.setText(fonVar2.f18008b.getString(j1j.o7));
                                    this.e.setText(fon.this.f18008b.getString(j1j.M3));
                                    this.f.setVisibility(8);
                                    this.g.setVisibility(8);
                                    break;
                                case 15:
                                    break;
                                default:
                                    this.d.setVisibility(8);
                                    this.e.setVisibility(8);
                                    this.f.setVisibility(8);
                                    this.g.setVisibility(8);
                                    break;
                            }
                            return;
                    }
            }
            this.d.setText(fonVar2.f18008b.getString(j1j.e3));
            if (fon.this.o.supportPace()) {
                this.e.setText(fon.this.f18008b.getString(j1j.f3));
            } else {
                this.e.setText(fon.this.f18008b.getString(j1j.g3));
            }
            this.f.setVisibility(8);
            fon fonVar7 = fon.this;
            if (fonVar7.j) {
                this.g.setText(fonVar7.f18008b.getString(j1j.L3));
            } else {
                this.g.setVisibility(8);
            }
        }
    }

    public fon(Context context, List<SportCourseInfoModel> list, int i, SportBasicReport sportBasicReport) {
        this.f18008b = context;
        this.f18007a = list;
        this.f = i;
        this.o = sportBasicReport;
        this.c = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.f18007a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.d + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = this.d;
        if (i2 == 0 || i >= i2) {
            return (this.e == 0 || i < i2 + getContentItemCount()) ? 1 : 102;
        }
        return 101;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (!(d0Var instanceof a)) {
            if (d0Var instanceof b) {
                ((b) d0Var).bindData();
            }
        } else {
            a aVar = (a) d0Var;
            SportCourseInfoModel sportCourseInfoModel = this.f18007a.get(i - this.d);
            if (sportCourseInfoModel != null) {
                aVar.a(i, sportCourseInfoModel);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 101 ? new b(this.c.inflate(ivi.f22137a, viewGroup, false)) : new a(this.c.inflate(ivi.f22138b, viewGroup, false));
    }
}
