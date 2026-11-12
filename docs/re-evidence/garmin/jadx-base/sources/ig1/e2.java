package ig1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lig1/e2;", "Lig1/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e2 extends g0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f93302k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f93303j;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(Context context) {
        super(context);
        context.getClass();
        this.f93303j = 4;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        cVar.getClass();
        fVar2.getClass();
        this.f93303j = (int) (fVar2.Z() / fVar2.k0());
        gg1.o0 o0VarN0 = fVar2.n0();
        fVar2.Y1((o0VarN0 == null || !o0VarN0.a()) ? m3.YARD : m3.METER);
        Object systemService = cVar.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.gcm3_activity_options_expandable_field, (ViewGroup) null);
        this.f93321d = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.expansionBtn);
        viewFindViewById.getClass();
        this.f93322e = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = this.f93321d.findViewById(R.id.expandableDetails);
        viewFindViewById2.getClass();
        this.f93323f = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = this.f93321d.findViewById(R.id.firstDetailBtn);
        viewFindViewById3.getClass();
        this.f93324g = (GCMComplexOneLineButton) viewFindViewById3;
        View viewFindViewById4 = this.f93321d.findViewById(R.id.toolTipTextViewLabel);
        viewFindViewById4.getClass();
        this.f93326i = (TextView) viewFindViewById4;
        this.f93322e.setOnCheckedChangeListener(new bl0.b(8, this, fVar2));
        this.f93324g.setOnClickListener(new hx0.k(12, this, fVar2));
        return k(fVar2);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        return fVar2.Q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        this.f70344b = fVar;
        if (!fVar.Q0()) {
            return false;
        }
        this.f93322e.setButtonLeftLabel(b(R.string.activity_options_distance_alert));
        boolean zEquals = fVar.e1().equals(Boolean.TRUE);
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
        if (zEquals) {
            gCMComplexOneLineButton.k();
            this.f93323f.setVisibility(0);
        } else {
            gCMComplexOneLineButton.j();
            this.f93323f.setVisibility(8);
        }
        this.f93324g.setButtonLeftLabel(b(R.string.lbl_length));
        l3.a aVar = l3.f23124b;
        double dZ = fVar.Z();
        m3 m3VarC0 = fVar.C0();
        aVar.getClass();
        String strN = l3.a.N(dZ, m3VarC0, l3.f23131i);
        String strC = fVar.C0().f23160a ? c(R.string.common_n_meters_label, strN) : c(R.string.common_n_yards_label, strN);
        strC.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f93324g;
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        gCMComplexOneLineButton2.setButtonRightLabel(String.format("%s (%s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f93303j), strC}, 2)));
        this.f93324g.setVisibility(0);
        this.f93326i.setText(b(R.string.activity_options_distance_alert_footer));
        this.f93326i.setVisibility(0);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lig1/e2$a;", "", "<init>", "()V", "", "DEFAULT_LENGTH_VALUE", "I", "MAX_LENGTH_VALUE", "MIN_LENGTH_VALUE", "LENGTH_DIALOG_NUMBER_OF_PICKERS", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
