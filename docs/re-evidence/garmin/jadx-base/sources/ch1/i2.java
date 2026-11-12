package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lch1/i2;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lfb2/b0$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class i2 extends fb2.m<DeviceSettingsDTO> implements fb2.b0.a<String> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27375g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMComplexOneLineButton f27376f;

    static {
        new a(null);
        f27375g = R.id.device_settings_audio_prompts_btn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.m, fb2.e
    public final View a() {
        if (this.f27376f == null) {
            GCMComplexOneLineButton gCMComplexOneLineButtonB = fb2.g.b(this.f70343a, f27375g, u(), null, null, GCMComplexOneLineButton.a.TEXT);
            this.f27376f = gCMComplexOneLineButtonB;
            gCMComplexOneLineButtonB.setRightLabelColor(a7.b.getColor(this.f70343a, R.color.gcm_text_primary));
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f27376f;
            if (gCMComplexOneLineButton != null) {
                gCMComplexOneLineButton.setRightLabelPaddingRight((int) this.f70343a.getResources().getDimension(R.dimen.spacing_micro));
            }
        }
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f27376f;
        gCMComplexOneLineButton2.getClass();
        return gCMComplexOneLineButton2;
    }

    @Override // fb2.b0.a
    public final void e(String str) {
        str.getClass();
        setChanged();
        notifyObservers();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return f27375g;
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(R.string.device_settings_audio_prompts);
        string.getClass();
        return string;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String q(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        Boolean bool = deviceSettingsDTO.f33886m1;
        return (bool != null ? bool.booleanValue() : false) || deviceSettingsDTO.k0() || deviceSettingsDTO.x0() || deviceSettingsDTO.o0() ? b(R.string.lbl_on) : b(R.string.lbl_off);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/i2$a;", "", "<init>", "()V", "", "DEFAULT_BUTTON_ID", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
