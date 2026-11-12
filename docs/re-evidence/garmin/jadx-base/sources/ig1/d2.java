package ig1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class d2 extends d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f93297m = 0;

    public d2(Context context) {
        super(context);
        this.f93295j = hg1.j.ALERT_TYPE_SWIM_DISTANCE;
        this.f93296k = new m3[]{m3.YARD, m3.METER};
    }

    @Override // ig1.d0
    public final String q(m3 m3Var) {
        return m3Var == m3.YARD ? b(R.string.common_yards_string) : b(R.string.common_meters_string);
    }

    @Override // ig1.d0
    public final m3 r(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        return fVar.C0();
    }

    @Override // ig1.d0
    public final CharSequence[] s() {
        return new CharSequence[]{this.f70343a.getString(R.string.common_yards_string), this.f70343a.getString(R.string.common_meters_string)};
    }

    @Override // ig1.d0
    public final void u(final com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        final int i14 = 0;
        this.f93324g.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d2 f93291b;

            {
                this.f93291b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
                d2 d2Var = this.f93291b;
                switch (i15) {
                    case 0:
                        int i16 = d2.f93297m;
                        new com.garmin.android.apps.connectmobile.settings.activityoptions.b(d2Var.f70343a, new hc0.c(5, d2Var, fVar2), d2Var.f93324g.getButtonRightLabel(), d2Var.f70343a.getString(R.string.lbl_distance), 8192, d2Var.f70343a.getString(fVar2.C0().f23164e), "0123456789.", d2Var.f93295j, -1, -1);
                        break;
                    default:
                        int i17 = d2.f93297m;
                        m3 m3VarC0 = fVar2.C0();
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            m3[] m3VarArr = d2Var.f93296k;
                            if (i19 < m3VarArr.length) {
                                if (m3VarC0 == m3VarArr[i19]) {
                                    i18 = i19;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        CharSequence[] charSequenceArrS = d2Var.s();
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(d2Var.f70343a);
                        aVar.setTitle(R.string.lbl_units).setSingleChoiceItems(charSequenceArrS, i18, new hg1.g(9, d2Var, fVar2));
                        aVar.create().show();
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f93325h.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d2 f93291b;

            {
                this.f93291b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
                d2 d2Var = this.f93291b;
                switch (i16) {
                    case 0:
                        int i17 = d2.f93297m;
                        new com.garmin.android.apps.connectmobile.settings.activityoptions.b(d2Var.f70343a, new hc0.c(5, d2Var, fVar2), d2Var.f93324g.getButtonRightLabel(), d2Var.f70343a.getString(R.string.lbl_distance), 8192, d2Var.f70343a.getString(fVar2.C0().f23164e), "0123456789.", d2Var.f93295j, -1, -1);
                        break;
                    default:
                        int i18 = d2.f93297m;
                        m3 m3VarC0 = fVar2.C0();
                        int i19 = 0;
                        int i110 = 0;
                        while (true) {
                            m3[] m3VarArr = d2Var.f93296k;
                            if (i110 < m3VarArr.length) {
                                if (m3VarC0 == m3VarArr[i110]) {
                                    i19 = i110;
                                } else {
                                    i110++;
                                }
                            }
                        }
                        CharSequence[] charSequenceArrS = d2Var.s();
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(d2Var.f70343a);
                        aVar.setTitle(R.string.lbl_units).setSingleChoiceItems(charSequenceArrS, i19, new hg1.g(9, d2Var, fVar2));
                        aVar.create().show();
                        break;
                }
            }
        });
    }

    @Override // ig1.d0
    public final void v(com.garmin.android.apps.connectmobile.devices.model.f fVar, m3 m3Var, Double d14) {
        fVar.Y1(m3Var);
        fVar.V1(d14.doubleValue());
    }

    @Override // ig1.d0
    public final void w(double d14, m3 m3Var) {
        this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_distance));
        this.f93324g.setButtonRightLabel(Double.toString(d14));
        this.f93324g.setVisibility(0);
        this.f93325h.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_units));
        this.f93325h.setButtonRightLabel(q(m3Var));
        this.f93325h.setVisibility(0);
    }

    @Override // ig1.d0
    public final void x() {
        TextView textView = this.f93326i;
        Context context = this.f70343a;
        textView.setText(context.getString(R.string.string_space_string_pattern, context.getString(R.string.activity_options_alerts_distance_footer), this.f70343a.getString(R.string.msg_incorrect_distance_increments, String.valueOf(25), String.valueOf(9975), String.valueOf(25))));
        this.f93326i.setVisibility(0);
    }
}
