package ig1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lig1/m1;", "Lig1/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m1 extends g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f93365j = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        cVar.getClass();
        fVar2.getClass();
        Object systemService = this.f70343a.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.gcm3_activity_options_expandable_field, (ViewGroup) null);
        this.f93321d = viewInflate;
        this.f93322e = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.expansionBtn);
        this.f93323f = (LinearLayout) this.f93321d.findViewById(R.id.expandableDetails);
        this.f93324g = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.firstDetailBtn);
        this.f93325h = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.secondDetailBtn);
        this.f93326i = (TextView) this.f93321d.findViewById(R.id.toolTipTextViewLabel);
        this.f93322e.setOnCheckedChangeListener(new bl0.b(7, this, fVar2));
        this.f93324g.setOnClickListener(new hx0.k(11, this, fVar2));
        return k(fVar2);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        return fVar2.V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        this.f70344b = fVar;
        boolean zV0 = fVar.V0();
        if (zV0) {
            this.f93322e.setButtonLeftLabel(this.f70343a.getString(R.string.run_mode_alerts_setting_pace_alert));
            boolean zEquals = fVar.x1().equals(Boolean.TRUE);
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zEquals) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            l3.a aVar = l3.f23124b;
            int iJ0 = fVar.J0();
            aVar.getClass();
            String strN1 = l3.a.n1(iJ0);
            this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.lbl_pace));
            this.f93324g.setButtonRightLabel(strN1);
            this.f93324g.setVisibility(0);
            this.f93325h.setVisibility(8);
            this.f93326i.setText(this.f70343a.getString(R.string.activity_options_running_mode_virtual_pacer_description));
            this.f93326i.setVisibility(0);
        }
        return zV0;
    }
}
