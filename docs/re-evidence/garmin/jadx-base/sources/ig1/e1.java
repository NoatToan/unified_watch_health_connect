package ig1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.text.NumberFormat;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lig1/e1;", "Lig1/m0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lvk1/b;", "hrZonesConfigDTO", "<init>", "(Landroid/content/Context;Lvk1/b;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends m0 {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Context context, vk1.b bVar) {
        super(context, bVar);
        context.getClass();
        bVar.getClass();
    }

    @Override // ig1.m0
    public final int q() {
        return 0;
    }

    @Override // ig1.m0
    public final String[] s(vk1.f fVar) {
        ArrayList arrayList = new ArrayList();
        NumberFormat numberFormat = NumberFormat.getInstance();
        StringBuilder sbL = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(1L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178615e)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178616f) - 1)));
        sbL.append(")");
        arrayList.add(sbL.toString());
        StringBuilder sbL2 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(2L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178616f)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178617g) - 1)));
        sbL2.append(")");
        arrayList.add(sbL2.toString());
        StringBuilder sbL3 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(3L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178617g)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178618h) - 1)));
        sbL3.append(")");
        arrayList.add(sbL3.toString());
        StringBuilder sbL4 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(4L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178618h)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar.f178619i) - 1)));
        sbL4.append(")");
        arrayList.add(sbL4.toString());
        StringBuilder sbL5 = e5.l(this.f70343a.getString(R.string.heart_rate_zone_name, numberFormat.format(5L)), " (", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178619i)), " - ", this.f70343a.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar.f178621k)));
        sbL5.append(")");
        arrayList.add(sbL5.toString());
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lig1/e1$a;", "", "<init>", "()V", "", "DEFAULT_ZONE_INDEX", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
