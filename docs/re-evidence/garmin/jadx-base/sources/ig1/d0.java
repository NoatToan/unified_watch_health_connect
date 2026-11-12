package ig1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes10.dex */
public class d0 extends g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f93294l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hg1.j f93295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m3[] f93296k;

    public d0(Context context) {
        super(context);
        this.f93295j = hg1.j.ALERT_TYPE_DISTANCE;
        this.f93296k = new m3[]{m3.MILE, m3.KILOMETER};
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (cVar == null) {
            vb.h.s("Activity is required");
            return false;
        }
        if (fVar2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        View viewInflate = ((LayoutInflater) cVar.getSystemService("layout_inflater")).inflate(R.layout.gcm3_activity_options_expandable_field, (ViewGroup) null);
        this.f93321d = viewInflate;
        this.f93322e = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.expansionBtn);
        this.f93323f = (LinearLayout) this.f93321d.findViewById(R.id.expandableDetails);
        this.f93324g = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.firstDetailBtn);
        this.f93325h = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.secondDetailBtn);
        this.f93326i = (TextView) this.f93321d.findViewById(R.id.toolTipTextViewLabel);
        this.f93322e.setOnCheckedChangeListener(new bl0.b(2, this, fVar2));
        u(fVar2);
        return k(fVar2);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2.Q0();
        }
        vb.h.s("Model is required");
        return false;
    }

    public String q(m3 m3Var) {
        return b(m3Var.f23164e);
    }

    public m3 r(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        return fVar.w0();
    }

    public CharSequence[] s() {
        CharSequence[] charSequenceArr = new CharSequence[this.f93296k.length];
        int i14 = 0;
        while (true) {
            m3[] m3VarArr = this.f93296k;
            if (i14 >= m3VarArr.length) {
                return charSequenceArr;
            }
            charSequenceArr[i14] = b(m3VarArr[i14].f23164e);
            i14++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar == 0) {
            vb.h.s("Model is required");
            return false;
        }
        this.f70344b = fVar;
        boolean zQ0 = fVar.Q0();
        if (zQ0) {
            this.f93322e.setButtonLeftLabel(this.f70343a.getString(R.string.activity_options_distance_alert));
            boolean zBooleanValue = fVar.e1().booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zBooleanValue) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            w(fVar.Z(), r(fVar));
            x();
        }
        return zQ0;
    }

    public void u(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String string = this.f70343a.getString(r(fVar).f23164e);
        this.f93324g.setOnClickListener(new ew2.c(this, fVar, string, oi0.d.a(this.f70343a, string, new cg1.e(26)), 7));
        this.f93325h.setOnClickListener(new hx0.k(10, this, fVar));
    }

    public void v(com.garmin.android.apps.connectmobile.devices.model.f fVar, m3 m3Var, Double d14) {
        fVar.S1(m3Var);
        fVar.M1(d14.doubleValue());
    }

    public void w(double d14, m3 m3Var) {
        this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_distance));
        DecimalFormat decimalFormatN = l3.n();
        l3.f23124b.getClass();
        this.f93324g.setButtonRightLabel(l3.a.N(d14, m3Var, decimalFormatN));
        this.f93324g.setVisibility(0);
        String strA = oi0.d.a(this.f70343a, q(m3Var), new cg1.e(25));
        this.f93325h.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_units));
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f93325h;
        gCMComplexOneLineButton.setButtonRightLabel(q(m3Var));
        gCMComplexOneLineButton.f47763c.setContentDescription(strA);
        this.f93325h.setVisibility(0);
    }

    public void x() {
        this.f93326i.setText(this.f70343a.getString(R.string.activity_options_alerts_distance_footer));
        this.f93326i.setVisibility(0);
    }
}
