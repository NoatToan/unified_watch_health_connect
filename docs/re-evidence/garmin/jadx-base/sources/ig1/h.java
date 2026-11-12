package ig1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import java.lang.ref.WeakReference;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class h extends g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f93330j = {1, 5};

    public h(Context context, String str) {
        super(context);
        this.f93321d = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.gcm3_activity_options_expandable_field, (ViewGroup) null);
    }

    public static m3 r() {
        return ((f12.l) KoinJavaComponent.get(f12.l.class)).g() == gg1.o0.METRIC ? m3.KILOMETER : m3.MILE;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (cVar == null) {
            vb.h.s("Activity is required");
            return false;
        }
        WeakReference weakReference = new WeakReference(cVar);
        if (fVar2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        this.f93322e = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.expansionBtn);
        this.f93323f = (LinearLayout) this.f93321d.findViewById(R.id.expandableDetails);
        this.f93324g = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.firstDetailBtn);
        this.f93326i = (TextView) this.f93321d.findViewById(R.id.toolTipTextViewLabel);
        this.f93322e.setOnCheckedChangeListener(new f(this));
        this.f93324g.setOnClickListener(new hx0.k(9, this, weakReference));
        return k(fVar2);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        if (fVar2 != null) {
            return fVar2.f34132b.containsKey("autoLapEnabled");
        }
        vb.h.s("Model is required");
        return false;
    }

    public final CharSequence[] q() {
        m3 m3VarR = r();
        String[] strArr = new String[2];
        for (int i14 = 0; i14 < 2; i14++) {
            strArr[i14] = f93330j[i14] + StringUtils.SPACE + this.f70343a.getString(m3VarR.f23164e);
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        if (fVar == 0) {
            vb.h.s("Model is required");
            return false;
        }
        this.f70344b = fVar;
        boolean zContainsKey = fVar.f34132b.containsKey("autoLapEnabled");
        if (zContainsKey) {
            this.f93322e.setButtonLeftLabel(this.f70343a.getString(R.string.run_options_auto_lap));
            boolean zBooleanValue = fVar.Z0().booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zBooleanValue) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_distance));
            double dF = fVar.F();
            int i14 = 0;
            while (i14 < 2) {
                int i15 = (int) dF;
                double d14 = f93330j[i14];
                m3 m3VarR = r();
                l3.f23124b.getClass();
                if (i15 == ((int) l3.a.h(d14, m3VarR))) {
                    this.f93324g.setButtonRightLabel((String) q()[i14]);
                    this.f93324g.setVisibility(0);
                    this.f93326i.setText(this.f70343a.getString(R.string.activity_options_auto_lap_footer));
                    this.f93326i.setVisibility(0);
                } else {
                    i14++;
                }
            }
            i14 = 0;
            this.f93324g.setButtonRightLabel((String) q()[i14]);
            this.f93324g.setVisibility(0);
            this.f93326i.setText(this.f70343a.getString(R.string.activity_options_auto_lap_footer));
            this.f93326i.setVisibility(0);
        }
        return zContainsKey;
    }
}
