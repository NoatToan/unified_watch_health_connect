package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lch1/e;", "Lch1/a5;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lch1/e$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Landroid/content/Context;Lch1/e$b;)V", "b", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends a5<DeviceSettingsDTO, Integer> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27324h = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f27325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<String> f27327g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        HIGH_THRESHOLD,
        LOW_THRESHOLD
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27331a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.HIGH_THRESHOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.LOW_THRESHOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27331a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, b bVar) {
        ArrayList<String> arrayListD;
        super(context);
        context.getClass();
        bVar.getClass();
        this.f27325e = bVar;
        this.f27326f = View.generateViewId();
        int i14 = c.f27331a[bVar.ordinal()];
        if (i14 == 1) {
            arrayListD = p13.x.d("100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200+");
        } else {
            if (i14 != 2) {
                lc.u0.r();
                throw null;
            }
            arrayListD = p13.x.d("40", "45", "50", "55", "60");
        }
        this.f27327g = arrayListD;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        int i14 = c.f27331a[this.f27325e.ordinal()];
        if (i14 == 1) {
            return deviceSettingsDTO.f33885m != null;
        }
        if (i14 == 2) {
            return deviceSettingsDTO.f33885m != null;
        }
        lc.u0.r();
        return false;
    }

    @Override // ch1.a5
    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getF27326f() {
        return this.f27326f;
    }

    @Override // ch1.a5
    public final String u() {
        int i14 = c.f27331a[this.f27325e.ordinal()];
        if (i14 == 1) {
            String strB = b(R.string.device_settings_high_alert_threshold_lbl);
            strB.getClass();
            return strB;
        }
        if (i14 != 2) {
            lc.u0.r();
            return null;
        }
        String strB2 = b(R.string.device_settings_low_alert_threshold_lbl);
        strB2.getClass();
        return strB2;
    }

    @Override // ch1.a5
    public final xg1.c<Integer> v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return new a0.h(12, this, deviceSettingsDTO2);
    }

    @Override // ch1.a5
    public final xg1.r<Integer> w() {
        return new g(this);
    }

    @Override // ch1.a5
    public final void x(Integer num, DeviceSettingsDTO deviceSettingsDTO) {
        Integer num2 = num;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (num2 != null) {
            try {
                String str = this.f27327g.get(num2.intValue());
                str.getClass();
                int i14 = Integer.parseInt(d53.u.v(str, Marker.ANY_NON_NULL_MARKER, "", false));
                int i15 = c.f27331a[this.f27325e.ordinal()];
                if (i15 == 1) {
                    com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO2.f33885m;
                    if (hVar != null) {
                        hVar.z(i14);
                        return;
                    }
                    return;
                }
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.garmin.android.apps.connectmobile.devices.model.h hVar2 = deviceSettingsDTO2.f33885m;
                if (hVar2 != null) {
                    hVar2.C(i14);
                }
            } catch (NumberFormatException e4) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SETTINGS;
                String strN = fb1.c.n("could not parse HR spinner value: ", e4.getMessage());
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "AlertThresholdField2", strN);
            }
        }
    }

    @Override // ch1.a5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Integer s(DeviceSettingsDTO deviceSettingsDTO) {
        int highHrAlertThreshold;
        deviceSettingsDTO.getClass();
        int i14 = c.f27331a[this.f27325e.ordinal()];
        if (i14 == 1) {
            com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO.f33885m;
            highHrAlertThreshold = hVar != null ? hVar.getHighHrAlertThreshold() : 100;
        } else {
            if (i14 != 2) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.devices.model.h hVar2 = deviceSettingsDTO.f33885m;
            highHrAlertThreshold = hVar2 != null ? hVar2.getLowHrAlertThreshold() : 40;
        }
        ArrayList<String> arrayList = this.f27327g;
        if (highHrAlertThreshold > arrayList.size()) {
            highHrAlertThreshold = highHrAlertThreshold == 200 ? arrayList.indexOf("200+") : arrayList.indexOf(String.valueOf(highHrAlertThreshold));
            if (highHrAlertThreshold > arrayList.size()) {
                highHrAlertThreshold = 0;
            }
        }
        return Integer.valueOf(highHrAlertThreshold);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lch1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "HIGH_HR_NO_VALUE_DEFAULT", "I", "LOW_HR_NO_VALUE_DEFAULT", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(Context context, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? b.HIGH_THRESHOLD : bVar);
    }
}
