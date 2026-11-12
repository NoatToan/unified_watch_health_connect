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
public class pcn extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<SportCourseInfoModel> f30250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f30251b;
    public LayoutInflater c;
    public int f;
    public b9h i;
    public SportBasicReport j;
    public int d = 1;
    public int e = 0;
    public int g = 1;
    public boolean h = true;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30253b;
        public TextView c;
        public TextView d;
        public TextView e;

        public a(View view) {
            super(view);
            this.f30252a = (TextView) view.findViewById(bsi.J8);
            this.f30253b = (TextView) view.findViewById(bsi.L8);
            this.c = (TextView) view.findViewById(bsi.B8);
            this.d = (TextView) view.findViewById(bsi.c9);
            this.e = (TextView) view.findViewById(bsi.G8);
        }

        public void a(int i, SportCourseInfoModel sportCourseInfoModel) {
            if (sportCourseInfoModel.getBestInfoModel()) {
                this.f30252a.setTextColor(pcn.this.f30251b.getColor(dki.E0));
                this.f30253b.setTextColor(pcn.this.f30251b.getColor(dki.E0));
                this.c.setTextColor(pcn.this.f30251b.getColor(dki.E0));
                this.d.setTextColor(pcn.this.f30251b.getColor(dki.E0));
                this.e.setTextColor(pcn.this.f30251b.getColor(dki.E0));
            } else {
                this.f30252a.setTextColor(pcn.this.f30251b.getColor(dki.G0));
                this.f30253b.setTextColor(pcn.this.f30251b.getColor(dki.G0));
                this.c.setTextColor(pcn.this.f30251b.getColor(dki.G0));
                this.d.setTextColor(pcn.this.f30251b.getColor(dki.G0));
                this.e.setTextColor(pcn.this.f30251b.getColor(dki.G0));
            }
            if (i == 1) {
                pcn.this.g = 1;
            }
            this.f30252a.setText(b(sportCourseInfoModel.getSportState(), sportCourseInfoModel.getIndex()));
            if (pcn.this.h) {
                this.f30253b.setText(c(sportCourseInfoModel.getSportState()));
            } else {
                this.f30253b.setVisibility(8);
            }
            int duration = (int) sportCourseInfoModel.getDuration();
            this.c.setText(TimeDateUtil.getTimeStrWithSecDef(duration));
            int i2 = pcn.this.f;
            if (i2 == 313 || i2 == 334) {
                if (sportCourseInfoModel.getActionCount() != null) {
                    this.d.setText("" + sportCourseInfoModel.getActionCount());
                } else if (sportCourseInfoModel.getSportState() == 1) {
                    this.d.setText("0");
                } else {
                    this.d.setText("--");
                }
                this.e.setVisibility(8);
                return;
            }
            switch (i2) {
                case 1:
                case 3:
                    Float distance = sportCourseInfoModel.getDistance();
                    if (distance != null) {
                        this.d.setText(pz6.a(Math.round(distance.floatValue())));
                        if (sportCourseInfoModel.getAvgPace() != null) {
                            this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getAvgPace().intValue()));
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    Float distance2 = sportCourseInfoModel.getDistance();
                    if (distance2 != null) {
                        this.d.setText(pz6.a(Math.round(distance2.floatValue())));
                    }
                    if (sportCourseInfoModel.getTotalSteps() == null) {
                        this.e.setText("--");
                        return;
                    }
                    this.e.setText("" + sportCourseInfoModel.getTotalSteps());
                    return;
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (i2) {
                        case 9:
                        case 10:
                            this.c.setText(TimeDateUtil.getTimeStrWithHourSecDef(duration, false));
                            Float distance3 = sportCourseInfoModel.getDistance();
                            if (distance3 != null) {
                                this.d.setText(pz6.c(AppUtil.getApp(), Math.round(distance3.floatValue()), 2));
                                if (sportCourseInfoModel.getAvgPace() != null) {
                                    this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getAvgPace().intValue()));
                                    return;
                                }
                                return;
                            }
                            return;
                        case 11:
                            if (sportCourseInfoModel.getTotalSteps() != null) {
                                this.d.setText("" + sportCourseInfoModel.getTotalSteps());
                            } else {
                                this.d.setText("--");
                            }
                            if (sportCourseInfoModel.getAvgHr() == null) {
                                this.e.setText("--");
                                return;
                            }
                            this.e.setText("" + sportCourseInfoModel.getAvgHr());
                            return;
                        default:
                            switch (i2) {
                                case 13:
                                case 14:
                                    if (sportCourseInfoModel.getCount() == null) {
                                        this.d.setText("--");
                                        this.e.setText("--");
                                    } else {
                                        this.d.setText("" + sportCourseInfoModel.getCount());
                                        int iComputeStrokeOneMinute = SportReportComputeUtil.computeStrokeOneMinute(sportCourseInfoModel.getCount().intValue(), duration);
                                        if (iComputeStrokeOneMinute <= 0) {
                                            this.e.setText("--");
                                        } else {
                                            this.e.setText("" + iComputeStrokeOneMinute);
                                        }
                                    }
                                    break;
                                case 15:
                                    break;
                                default:
                                    if (sportCourseInfoModel.getCalories() != null) {
                                        this.d.setText("" + sportCourseInfoModel.getCalories());
                                    } else {
                                        this.d.setText("--");
                                    }
                                    if (sportCourseInfoModel.getAvgHr() == null) {
                                        this.e.setText("--");
                                    } else {
                                        this.e.setText("" + sportCourseInfoModel.getAvgHr());
                                    }
                                    break;
                            }
                            return;
                    }
            }
            Float distance4 = sportCourseInfoModel.getDistance();
            if (distance4 != null) {
                this.d.setText(pz6.a(Math.round(distance4.floatValue())));
                if (pcn.this.j.supportPace()) {
                    if (sportCourseInfoModel.getAvgPace() != null) {
                        this.e.setText(TimeDateUtil.getSportPaceStrWithSecDef(sportCourseInfoModel.getAvgPace().intValue()));
                        return;
                    }
                    return;
                }
                if (sportCourseInfoModel.getAvgSpeed() != null) {
                    this.e.setText(xr5.g(1, sportCourseInfoModel.getAvgSpeed().floatValue()));
                }
            }
        }

        public final String b(int i, int i2) {
            int i3 = pcn.this.f;
            if (i3 == 9 || i3 == 10) {
                return "" + i2;
            }
            if (i == 2) {
                return "R";
            }
            return "" + i2;
        }

        public final String c(int i) {
            pcn pcnVar = pcn.this;
            int i2 = pcnVar.f;
            if (i2 == 10 || i2 == 9) {
                if (i == 3) {
                    return pcnVar.f30251b.getString(j1j.Z9);
                }
                if (i == 0) {
                    return pcnVar.f30251b.getString(j1j.da);
                }
                if (i == 2) {
                    return pcnVar.f30251b.getString(j1j.ca);
                }
                if (i == 4) {
                    return pcnVar.f30251b.getString(j1j.ba);
                }
                return i == 1 ? pcnVar.f30251b.getString(j1j.aa) : "";
            }
            if (i == 0) {
                return pcnVar.f30251b.getString(j1j.g2);
            }
            if (i == 1) {
                return pcnVar.f30251b.getString(j1j.f2);
            }
            if (i == 2) {
                return pcnVar.f30251b.getString(j1j.d2);
            }
            if (i == 3) {
                return pcnVar.f30251b.getString(j1j.c2);
            }
            if (i == 4) {
                return pcnVar.f30251b.getString(j1j.a2);
            }
            if (i == 5) {
                return pcnVar.f30251b.getString(j1j.e2);
            }
            if (i == 6) {
                return pcnVar.f30251b.getString(j1j.b2);
            }
            if (i == 7) {
                return pcnVar.f30251b.getString(j1j.Z1);
            }
            if (i == 8) {
                return pcnVar.f30251b.getString(j1j.Y1);
            }
            if (i == 10) {
                return pcnVar.f30251b.getString(j1j.Fa);
            }
            if (i == 11) {
                return pcnVar.f30251b.getString(j1j.Ga);
            }
            return i == 12 ? pcnVar.f30251b.getString(j1j.Ea) : "";
        }
    }

    public class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Boolean f30255b;

        public b(View view) {
            super(view);
            this.f30255b = Boolean.FALSE;
            this.f30254a = (TextView) view.findViewById(bsi.i9);
        }

        public final /* synthetic */ void b(View view) {
            if (pcn.this.i != null) {
                if (this.f30255b.booleanValue()) {
                    pcn.this.i.onShowPassage();
                    this.f30255b = Boolean.FALSE;
                    this.f30254a.setText(j1j.a7);
                } else {
                    pcn.this.i.onLoadMore();
                    this.f30255b = Boolean.TRUE;
                    this.f30254a.setText(j1j.b7);
                }
            }
        }

        public void bindData() {
            this.f30254a.setOnClickListener(new View.OnClickListener() { // from class: qcn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f31378a.b(view);
                }
            });
        }
    }

    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f30256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30257b;
        public TextView c;
        public TextView d;
        public TextView e;

        public c(View view) {
            super(view);
            this.e = (TextView) view.findViewById(bsi.q9);
            this.f30256a = (TextView) view.findViewById(bsi.t9);
            this.f30257b = (TextView) view.findViewById(bsi.u9);
            this.d = (TextView) view.findViewById(bsi.r9);
            this.c = (TextView) view.findViewById(bsi.s9);
        }

        public void bindData() {
            if (pcn.this.h) {
                this.d.setVisibility(0);
            } else {
                this.d.setVisibility(8);
            }
            pcn pcnVar = pcn.this;
            int i = pcnVar.f;
            if (i == 313 || i == 334) {
                this.f30256a.setText(pcnVar.f30251b.getString(j1j.x0));
                this.f30257b.setVisibility(8);
                return;
            }
            switch (i) {
                case 1:
                case 3:
                    this.f30256a.setText(pcnVar.f30251b.getString(j1j.e3));
                    this.f30257b.setText(pcn.this.f30251b.getString(j1j.f3));
                    return;
                case 2:
                    this.f30256a.setText(pcnVar.f30251b.getString(j1j.e3));
                    this.f30257b.setText(pcn.this.f30251b.getString(j1j.t8));
                    return;
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (i) {
                        case 9:
                        case 10:
                            this.e.setText(j1j.q2);
                            this.d.setText(j1j.Y9);
                            this.c.setText(j1j.s1);
                            this.f30256a.setText(j1j.e3);
                            this.f30257b.setText(j1j.f3);
                            return;
                        case 11:
                            this.f30256a.setText(pcnVar.f30251b.getString(j1j.t8));
                            this.f30257b.setText(pcn.this.f30251b.getString(j1j.X4));
                            return;
                        default:
                            switch (i) {
                                case 13:
                                    this.f30256a.setText(pcnVar.f30251b.getString(j1j.K8));
                                    this.f30257b.setText(pcn.this.f30251b.getString(j1j.T9));
                                    break;
                                case 14:
                                    this.f30256a.setText(pcnVar.f30251b.getString(j1j.o7));
                                    this.f30257b.setText(pcn.this.f30251b.getString(j1j.M3));
                                    break;
                                case 15:
                                    break;
                                default:
                                    this.f30256a.setText(pcnVar.f30251b.getString(j1j.ea));
                                    this.f30257b.setText(pcn.this.f30251b.getString(j1j.X4));
                                    break;
                            }
                            return;
                    }
            }
            this.f30256a.setText(pcnVar.f30251b.getString(j1j.e3));
            if (pcn.this.j.supportPace()) {
                this.f30257b.setText(pcn.this.f30251b.getString(j1j.f3));
            } else {
                this.f30257b.setText(pcn.this.f30251b.getString(j1j.g3));
            }
        }
    }

    public pcn(Context context, List<SportCourseInfoModel> list, int i, SportBasicReport sportBasicReport, b9h b9hVar) {
        this.f30251b = context;
        this.f30250a = list;
        this.f = i;
        this.j = sportBasicReport;
        this.i = b9hVar;
        this.c = LayoutInflater.from(context);
    }

    public int getContentItemCount() {
        return this.f30250a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.d + getContentItemCount() + this.e;
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
        if (d0Var instanceof a) {
            a aVar = (a) d0Var;
            SportCourseInfoModel sportCourseInfoModel = this.f30250a.get(i - this.d);
            if (sportCourseInfoModel != null) {
                aVar.a(i, sportCourseInfoModel);
                return;
            }
            return;
        }
        if (d0Var instanceof b) {
            ((b) d0Var).bindData();
        } else if (d0Var instanceof c) {
            ((c) d0Var).bindData();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 101) {
            return new c(this.c.inflate(ivi.A0, viewGroup, false));
        }
        return i == 102 ? new b(this.c.inflate(ivi.n1, viewGroup, false)) : new a(this.c.inflate(ivi.z0, viewGroup, false));
    }

    public void setFooterViewCount(int i) {
        this.e = i;
    }
}
