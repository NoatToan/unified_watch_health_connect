package ch1;

import android.content.Context;
import android.view.View;
import bs2.yt;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch1/a4;", "Lfb2/t;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lbs2/yt;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a4 extends fb2.t<DeviceSettingsDTO, yt> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f27298e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27299a;

        static {
            int[] iArr = new int[yt.values().length];
            try {
                iArr[yt.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yt.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yt.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27299a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context) {
        super(context);
        context.getClass();
        HashMap map = new HashMap();
        this.f27298e = map;
        map.put(yt.SHORT, c(R.string.lbl_plural_more_than_one_second, "30"));
        map.put(yt.MEDIUM, b(R.string.one_minute));
        map.put(yt.LONG, c(R.string.lbl_plural_more_than_one_minute, "3"));
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.Y0 != null;
    }

    @Override // fb2.t
    public final Map<yt, CharSequence> q(yt[] ytVarArr) {
        ytVarArr.getClass();
        return this.f27298e;
    }

    @Override // fb2.t
    public final yt r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        String str = deviceSettingsDTO2.Y0;
        yt ytVar = yt.SHORT;
        if (p005kotlin.jvm.internal.s.g(str, ytVar.name())) {
            return ytVar;
        }
        yt ytVar2 = yt.MEDIUM;
        return p005kotlin.jvm.internal.s.g(str, ytVar2.name()) ? ytVar2 : yt.LONG;
    }

    @Override // fb2.t
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.t
    public final String u() {
        String strB = b(R.string.device_setting_timeout);
        strB.getClass();
        return strB;
    }

    @Override // fb2.t
    public final yt[] v(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        return new yt[]{yt.SHORT, yt.MEDIUM, yt.LONG};
    }

    @Override // fb2.t
    public final void w(yt ytVar, DeviceSettingsDTO deviceSettingsDTO) {
        yt ytVar2;
        yt ytVar3 = ytVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (ytVar3 != null) {
            int i14 = a.f27299a[ytVar3.ordinal()];
            if (i14 == 1) {
                yt ytVar4 = yt.SHORT;
                if (ytVar4 != null) {
                    deviceSettingsDTO2.Y0 = ytVar4.name();
                    return;
                }
                return;
            }
            if (i14 != 2) {
                if (i14 == 3 && (ytVar2 = yt.LONG) != null) {
                    deviceSettingsDTO2.Y0 = ytVar2.name();
                    return;
                }
                return;
            }
            yt ytVar5 = yt.MEDIUM;
            if (ytVar5 != null) {
                deviceSettingsDTO2.Y0 = ytVar5.name();
            }
        }
    }
}
