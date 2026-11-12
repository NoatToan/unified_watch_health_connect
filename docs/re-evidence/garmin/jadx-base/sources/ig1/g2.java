package ig1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class g2 extends g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f93329j = 0;

    public g2(Context context) {
        super(context);
    }

    @Override // fb2.e
    @SuppressLint({"InflateParams"})
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        LayoutInflater layoutInflater = (LayoutInflater) this.f70343a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return false;
        }
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_activity_options_expandable_field, (ViewGroup) null);
        this.f93321d = viewInflate;
        this.f93322e = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.expansionBtn);
        this.f93323f = (LinearLayout) this.f93321d.findViewById(R.id.expandableDetails);
        this.f93324g = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.firstDetailBtn);
        this.f93325h = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.secondDetailBtn);
        this.f93326i = (TextView) this.f93321d.findViewById(R.id.toolTipTextViewLabel);
        this.f93322e.setOnCheckedChangeListener(new bl0.b(10, this, fVar2));
        this.f93324g.setOnClickListener(new hx0.k(13, this, fVar2));
        return k(fVar2);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        return fVar.S0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        this.f70344b = fVar;
        boolean zS0 = fVar.S0();
        if (zS0) {
            this.f93322e.setButtonLeftLabel(this.f70343a.getString(R.string.activity_options_time_alert));
            boolean zBooleanValue = fVar.v1().booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zBooleanValue) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            int iE0 = fVar.E0();
            l3.f23124b.getClass();
            String strN1 = l3.a.n1(iE0);
            this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_time));
            this.f93324g.setButtonRightLabel(strN1);
            this.f93324g.setVisibility(0);
            this.f93325h.setVisibility(8);
            this.f93326i.setText(this.f70343a.getString(R.string.activity_options_alerts_time_footer));
            this.f93326i.setVisibility(0);
        }
        return zS0;
    }
}
