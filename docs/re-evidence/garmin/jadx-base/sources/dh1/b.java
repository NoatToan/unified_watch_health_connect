package dh1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import fb2.t;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldh1/b;", "Lfb2/t;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Lzb0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends t<DeviceSettingsDTO, zb0.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f59626f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f59627e;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.f59627e = new ArrayList();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.t, fb2.e
    public final boolean k(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        boolean zK = super.k(deviceSettingsDTO);
        zb0.a aVarF = deviceSettingsDTO.F();
        zb0.a aVar = zb0.a.AudioPromptsInvalid;
        if (aVarF == aVar && (this.f59627e.size() > 1 || (this.f59627e.size() == 1 && this.f59627e.get(0) != aVar))) {
            try {
                Field declaredField = b.class.getSuperclass().getDeclaredField("fieldView");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                obj2.getClass();
                ((GCMComplexTwoLineButton) obj2).setButtonBottomLeftLabel(aVar.f203418a);
                return zK;
            } catch (IllegalAccessException e4) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.SETTINGS;
                aVar2.getClass();
                i2.a.g(a2Var, "DialectsField", e4);
            } catch (NoSuchFieldException e14) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.SETTINGS;
                aVar3.getClass();
                i2.a.g(a2Var2, "DialectsField", e14);
            }
        }
        return zK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.e
    public final void l(boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) this.f70344b;
        if (deviceSettingsDTO != null && this.f59627e.size() == 1 && this.f59627e.get(0) == deviceSettingsDTO.F()) {
            z14 = false;
        }
        super.l(z14);
    }

    @Override // fb2.t
    public final Map<zb0.a, CharSequence> q(zb0.a[] aVarArr) {
        zb0.a[] aVarArr2 = aVarArr;
        aVarArr2.getClass();
        HashMap map = new HashMap();
        for (zb0.a aVar : aVarArr2) {
            map.put(aVar, b(aVar.f203418a));
        }
        return map;
    }

    @Override // fb2.t
    public final zb0.a r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return deviceSettingsDTO2.F();
    }

    @Override // fb2.t
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.t
    public final String u() {
        String strB = b(R.string.device_setting_language);
        strB.getClass();
        return strB;
    }

    @Override // fb2.t
    public final zb0.a[] v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (this.f59627e.isEmpty()) {
            this.f59627e.add(deviceSettingsDTO2.F());
        }
        Collections.sort(this.f59627e, new a61.c(new dh1.a(this, 0), 6));
        return (zb0.a[]) this.f59627e.toArray(new zb0.a[0]);
    }

    @Override // fb2.t
    public final void w(zb0.a aVar, DeviceSettingsDTO deviceSettingsDTO) {
        zb0.a aVar2 = aVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (aVar2 != null) {
            deviceSettingsDTO2.f33910z1 = aVar2.f203419b;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldh1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
