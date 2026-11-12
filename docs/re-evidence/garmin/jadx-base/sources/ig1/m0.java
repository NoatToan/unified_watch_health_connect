package ig1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import i3.e5;
import java.text.NumberFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lig1/m0;", "Lig1/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lvk1/b;", "hrZonesConfigDTO", "<init>", "(Landroid/content/Context;Lvk1/b;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class m0 extends g0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f93361m = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vk1.b f93362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f93363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f93364l;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, vk1.b bVar) {
        super(context);
        context.getClass();
        this.f93362j = bVar;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        cVar.getClass();
        fVar2.getClass();
        Object systemService = cVar.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.gcm3_activity_options_alert_heart_rate, (ViewGroup) null);
        this.f93321d = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.heartRateAlertsBtn);
        viewFindViewById.getClass();
        this.f93322e = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = this.f93321d.findViewById(R.id.hrAlertTypeExpandableLayout);
        viewFindViewById2.getClass();
        this.f93323f = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = this.f93321d.findViewById(R.id.hrAlertTypeLayout);
        viewFindViewById3.getClass();
        View viewFindViewById4 = this.f93321d.findViewById(R.id.heartRateZoneValueTextViewLabel);
        viewFindViewById4.getClass();
        this.f93363k = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.f93321d.findViewById(R.id.customZonesDetailsLayout);
        viewFindViewById5.getClass();
        this.f93364l = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = this.f93321d.findViewById(R.id.lowZoneComplexBtn1);
        viewFindViewById6.getClass();
        this.f93324g = (GCMComplexOneLineButton) viewFindViewById6;
        View viewFindViewById7 = this.f93321d.findViewById(R.id.highZoneComplexBtn2);
        viewFindViewById7.getClass();
        this.f93325h = (GCMComplexOneLineButton) viewFindViewById7;
        View viewFindViewById8 = this.f93321d.findViewById(R.id.toolTipTextViewLabel);
        viewFindViewById8.getClass();
        this.f93326i = (TextView) viewFindViewById8;
        this.f93322e.setOnCheckedChangeListener(new bl0.b(3, this, fVar2));
        ((LinearLayout) viewFindViewById3).setOnClickListener(new n0(fVar2, this, cVar));
        this.f93324g.setOnClickListener(new o0(this, fVar2));
        this.f93325h.setOnClickListener(new p0(this, fVar2));
        return k(fVar2);
    }

    @Override // fb2.e
    public final boolean h(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        return fVar2.f34132b.containsKey("heartRateAlertEnabled");
    }

    public int q() {
        return 5;
    }

    public final String[] r() {
        vk1.f fVar;
        vk1.b bVar = this.f93362j;
        if (bVar == null || !bVar.f178581a) {
            fVar = bVar != null ? bVar.f178585e : null;
        } else {
            fVar = bVar.f178586f;
        }
        fVar.getClass();
        if (fVar.f178621k == 0) {
            fVar.f178621k = 250;
        }
        return s(fVar);
    }

    public String[] s(vk1.f fVar) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        StringBuilder sbL = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(1L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178615e)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178616f) - 1)));
        sbL.append(")");
        String string = sbL.toString();
        StringBuilder sbL2 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(2L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178616f)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178617g) - 1)));
        sbL2.append(")");
        String string2 = sbL2.toString();
        StringBuilder sbL3 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(3L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178617g)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178618h) - 1)));
        sbL3.append(")");
        String string3 = sbL3.toString();
        StringBuilder sbL4 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(4L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178618h)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178619i) - 1)));
        sbL4.append(")");
        String string4 = sbL4.toString();
        StringBuilder sbL5 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(5L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178619i)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178621k)));
        sbL5.append(")");
        String string5 = sbL5.toString();
        String string6 = this.f70343a.getString(R.string.lbl_custom);
        string6.getClass();
        return new String[]{string, string2, string3, string4, string5, string6};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        fVar.getClass();
        this.f70344b = fVar;
        boolean zContainsKey = fVar.f34132b.containsKey("heartRateAlertEnabled");
        if (zContainsKey) {
            boolean zBooleanValue = fVar.h1().booleanValue();
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f93322e;
            if (zBooleanValue) {
                gCMComplexOneLineButton.k();
                this.f93323f.setVisibility(0);
            } else {
                gCMComplexOneLineButton.j();
                this.f93323f.setVisibility(8);
            }
            int iH0 = fVar.h0();
            String[] strArrR = r();
            LinearLayout linearLayout = this.f93364l;
            if (iH0 == 0) {
                linearLayout.getClass();
                linearLayout.setVisibility(0);
                TextView textView = this.f93363k;
                textView.getClass();
                textView.setText(strArrR[q()]);
                String strA = oi0.d.a(this.f70343a, strArrR[q()], new cg1.e(27));
                TextView textView2 = this.f93363k;
                textView2.getClass();
                textView2.setContentDescription(strA);
            } else {
                linearLayout.getClass();
                linearLayout.setVisibility(8);
                try {
                    TextView textView3 = this.f93363k;
                    textView3.getClass();
                    int i14 = iH0 - 1;
                    textView3.setText(strArrR[i14]);
                    String strA2 = oi0.d.a(this.f70343a, strArrR[i14], new cg1.e(28));
                    TextView textView4 = this.f93363k;
                    textView4.getClass();
                    textView4.setContentDescription(strA2);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    LinearLayout linearLayout2 = this.f93364l;
                    linearLayout2.getClass();
                    linearLayout2.setVisibility(0);
                    TextView textView5 = this.f93363k;
                    textView5.getClass();
                    textView5.setText(strArrR[q()]);
                    String strA3 = oi0.d.a(this.f70343a, strArrR[q()], new cg1.e(29));
                    TextView textView6 = this.f93363k;
                    textView6.getClass();
                    textView6.setContentDescription(strA3);
                }
            }
            this.f93324g.setButtonRightLabel(this.f70343a.getString(R.string.devices_lbl_bpm_with_format, NumberFormat.getInstance().format(fVar.g0())));
            this.f93324g.setVisibility(0);
            this.f93325h.setButtonRightLabel(this.f70343a.getString(R.string.devices_lbl_bpm_with_format, NumberFormat.getInstance().format(fVar.f0())));
            this.f93325h.setVisibility(0);
            this.f93326i.setText(this.f70343a.getString(R.string.activity_options_heart_rate_alert_description));
            this.f93326i.setVisibility(0);
        }
        return zContainsKey;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lig1/m0$a;", "", "<init>", "()V", "", "NUMBER_OF_HR_ZONES", "I", "CUSTOM_ZONE_INDEX", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
