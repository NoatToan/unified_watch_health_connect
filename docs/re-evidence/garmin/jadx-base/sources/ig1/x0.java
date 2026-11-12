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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lig1/x0;", "Lig1/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 extends g0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f93425j = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        final com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        cVar.getClass();
        fVar2.getClass();
        Object systemService = cVar.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.gcm3_activity_options_expandable_field, (ViewGroup) null);
        this.f93321d = viewInflate;
        this.f93322e = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.expansionBtn);
        this.f93323f = (LinearLayout) this.f93321d.findViewById(R.id.expandableDetails);
        this.f93324g = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.firstDetailBtn);
        this.f93325h = (GCMComplexOneLineButton) this.f93321d.findViewById(R.id.secondDetailBtn);
        this.f93326i = (TextView) this.f93321d.findViewById(R.id.toolTipTextViewLabel);
        this.f93322e.setOnCheckedChangeListener(new bl0.b(5, this, fVar2));
        final int i14 = 0;
        this.f93324g.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f93418b;

            {
                this.f93418b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                final com.garmin.android.apps.connectmobile.devices.model.f fVar3 = fVar2;
                final x0 x0Var = this.f93418b;
                switch (i15) {
                    case 0:
                        int i16 = x0.f93425j;
                        Context context = x0Var.f70343a;
                        final int i17 = 0;
                        new hg1.m(context, context.getString(R.string.run_mode_alerts_setting_run_time), new hg1.m.a() { // from class: ig1.w0
                            @Override // hg1.m.a
                            public final void b(int i18) {
                                int i19 = i17;
                                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = fVar3;
                                x0 x0Var2 = x0Var;
                                switch (i19) {
                                    case 0:
                                        int i24 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton = x0Var2.f93324g;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton.setButtonRightLabel(l3.a.n1(i18));
                                        fVar4.G1(i18);
                                        x0Var2.p();
                                        break;
                                    default:
                                        int i25 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton2 = x0Var2.f93325h;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton2.setButtonRightLabel(l3.a.n1(i18));
                                        fVar4.I1(i18);
                                        x0Var2.p();
                                        break;
                                }
                            }
                        }, hg1.j.ALERT_TYPE_VIRTUAL_PACER, fVar3.i0());
                        break;
                    default:
                        int i18 = x0.f93425j;
                        Context context2 = x0Var.f70343a;
                        final int i19 = 1;
                        new hg1.m(context2, context2.getString(R.string.run_mode_alerts_setting_walk_time), new hg1.m.a() { // from class: ig1.w0
                            @Override // hg1.m.a
                            public final void b(int i110) {
                                int i111 = i19;
                                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = fVar3;
                                x0 x0Var2 = x0Var;
                                switch (i111) {
                                    case 0:
                                        int i24 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton = x0Var2.f93324g;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton.setButtonRightLabel(l3.a.n1(i110));
                                        fVar4.G1(i110);
                                        x0Var2.p();
                                        break;
                                    default:
                                        int i25 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton2 = x0Var2.f93325h;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton2.setButtonRightLabel(l3.a.n1(i110));
                                        fVar4.I1(i110);
                                        x0Var2.p();
                                        break;
                                }
                            }
                        }, hg1.j.ALERT_TYPE_VIRTUAL_PACER, fVar3.j0());
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f93325h.setOnClickListener(new View.OnClickListener(this) { // from class: ig1.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f93418b;

            {
                this.f93418b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                final com.garmin.android.apps.connectmobile.devices.model.f fVar3 = fVar2;
                final x0 x0Var = this.f93418b;
                switch (i16) {
                    case 0:
                        int i17 = x0.f93425j;
                        Context context = x0Var.f70343a;
                        final int i18 = 0;
                        new hg1.m(context, context.getString(R.string.run_mode_alerts_setting_run_time), new hg1.m.a() { // from class: ig1.w0
                            @Override // hg1.m.a
                            public final void b(int i110) {
                                int i111 = i18;
                                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = fVar3;
                                x0 x0Var2 = x0Var;
                                switch (i111) {
                                    case 0:
                                        int i24 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton = x0Var2.f93324g;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton.setButtonRightLabel(l3.a.n1(i110));
                                        fVar4.G1(i110);
                                        x0Var2.p();
                                        break;
                                    default:
                                        int i25 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton2 = x0Var2.f93325h;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton2.setButtonRightLabel(l3.a.n1(i110));
                                        fVar4.I1(i110);
                                        x0Var2.p();
                                        break;
                                }
                            }
                        }, hg1.j.ALERT_TYPE_VIRTUAL_PACER, fVar3.i0());
                        break;
                    default:
                        int i19 = x0.f93425j;
                        Context context2 = x0Var.f70343a;
                        final int i110 = 1;
                        new hg1.m(context2, context2.getString(R.string.run_mode_alerts_setting_walk_time), new hg1.m.a() { // from class: ig1.w0
                            @Override // hg1.m.a
                            public final void b(int i111) {
                                int i112 = i110;
                                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = fVar3;
                                x0 x0Var2 = x0Var;
                                switch (i112) {
                                    case 0:
                                        int i24 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton = x0Var2.f93324g;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton.setButtonRightLabel(l3.a.n1(i111));
                                        fVar4.G1(i111);
                                        x0Var2.p();
                                        break;
                                    default:
                                        int i25 = x0.f93425j;
                                        GCMComplexOneLineButton gCMComplexOneLineButton2 = x0Var2.f93325h;
                                        l3.f23124b.getClass();
                                        gCMComplexOneLineButton2.setButtonRightLabel(l3.a.n1(i111));
                                        fVar4.I1(i111);
                                        x0Var2.p();
                                        break;
                                }
                            }
                        }, hg1.j.ALERT_TYPE_VIRTUAL_PACER, fVar3.j0());
                        break;
                }
            }
        });
        return k(fVar2);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        return fVar2.R0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        this.f70344b = fVar;
        boolean zR0 = fVar.R0();
        if (zR0) {
            this.f93322e.setButtonLeftLabel(this.f70343a.getString(R.string.activity_options_running_mode_run_or_walk_title));
            boolean zEquals = fVar.j1().equals(Boolean.TRUE);
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zEquals) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            this.f93324g.setButtonLeftLabel(this.f70343a.getString(R.string.run_mode_alerts_setting_run_time));
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f93324g;
            l3.a aVar = l3.f23124b;
            int iI0 = fVar.i0();
            aVar.getClass();
            gCMComplexOneLineButton2.setButtonRightLabel(l3.a.n1(iI0));
            this.f93324g.setVisibility(0);
            this.f93325h.setButtonLeftLabel(this.f70343a.getString(R.string.run_mode_alerts_setting_walk_time));
            this.f93325h.setButtonRightLabel(l3.a.n1(fVar.j0()));
            this.f93325h.setVisibility(0);
            this.f93326i.setText(this.f70343a.getString(R.string.activity_options_running_mode_run_or_walk_description_v2));
            this.f93326i.setVisibility(0);
        }
        return zR0;
    }
}
