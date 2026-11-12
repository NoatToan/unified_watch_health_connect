package ig1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class t extends g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f93402j = 0;

    public class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f93403a;

        public a(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f93403a = fVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            t tVar = t.this;
            if (z14) {
                tVar.f93323f.setVisibility(0);
            } else {
                tVar.f93323f.setVisibility(8);
            }
            this.f93403a.y1("caloriesAlertEnabled", Boolean.valueOf(z14));
            tVar.p();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f93405a;

        public class a implements com.garmin.android.apps.connectmobile.settings.activityoptions.b.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l22.b f93407a;

            public a(l22.b bVar) {
                this.f93407a = bVar;
            }

            @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.b.a
            public final void e(double d14) {
                b bVar = b.this;
                int i14 = (int) d14;
                t.this.f93324g.setButtonRightLabel(l3.c(this.f93407a, i14, true));
                bVar.f93405a.D1(i14);
                t.this.p();
            }
        }

        public b(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f93405a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = t.f93402j;
            t tVar = t.this;
            l22.a aVar = new l22.a(tVar.f70343a);
            new com.garmin.android.apps.connectmobile.settings.activityoptions.b(tVar.f70343a, new a(aVar), l3.c(aVar, this.f93405a.H(), false), tVar.f70343a.getString(R.string.lbl_calories), 2, tVar.f70343a.getString(R.string.calories_abbreviation), "0123456789", hg1.j.ALERT_TYPE_CALORIES, -1, -1).f41720h.setContentDescription(tVar.f70343a.getString(R.string.lbl_calories));
        }
    }

    public t(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2.M0();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (cVar == null) {
            vb.h.s("Activity is required");
            return false;
        }
        if (fVar == null) {
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
        this.f93322e.setOnCheckedChangeListener(new a(fVar));
        this.f93324g.setOnClickListener(new b(fVar));
        return k(fVar);
    }

    @Override // fb2.e
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar == null) {
            vb.h.s("Model is required");
            return false;
        }
        boolean zM0 = fVar.M0();
        if (zM0) {
            this.f93322e.setButtonLeftLabel(this.f70343a.getString(R.string.activity_options_calories_alert));
            boolean zBooleanValue = fVar.c1().booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zBooleanValue) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            l22.a aVar = new l22.a(this.f70343a);
            this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_calories));
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f93324g;
            String strC = l3.c(aVar, fVar.H(), true);
            String string = this.f70343a.getString(R.string.lbl_calories);
            gCMComplexOneLineButton2.setButtonRightLabel(strC);
            gCMComplexOneLineButton2.f47763c.setContentDescription(string);
            this.f93324g.setVisibility(0);
            this.f93325h.setVisibility(8);
            this.f93326i.setText(this.f70343a.getString(R.string.activity_options_alerts_calories_footer));
            this.f93326i.setVisibility(0);
        }
        return zM0;
    }
}
