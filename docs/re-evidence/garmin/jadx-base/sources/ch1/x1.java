package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lch1/x1;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x1 extends fb2.m<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27494g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27495f;

    static {
        new a(null);
        f27494g = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(Context context) {
        super(context, true, true);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.m
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        return this.f27495f;
    }

    @Override // fb2.m
    public final String s() {
        String string = this.f70343a.getString(R.string.msg_choose_fixed_location);
        string.getClass();
        return string;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return f27494g;
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(R.string.lbl_location);
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(DeviceSettingsDTO deviceSettingsDTO, v13.c cVar) throws Throwable {
        y1 y1Var;
        String string;
        DeviceSettingsDTO deviceSettingsDTO2;
        x1 x1Var;
        if (cVar instanceof y1) {
            y1Var = (y1) cVar;
            int i14 = y1Var.f27503e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                y1Var.f27503e = i14 - Integer.MIN_VALUE;
            } else {
                y1Var = new y1(this, cVar);
            }
        } else {
            y1Var = new y1(this, cVar);
        }
        Object objE0 = y1Var.f27501c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = y1Var.f27503e;
        if (i15 == 0) {
            o13.r.b(objE0);
            Double d14 = deviceSettingsDTO.C1;
            Double d15 = deviceSettingsDTO.D1;
            if (d14 == null || d15 == null) {
                string = this.f70343a.getString(R.string.lbl_default);
                deviceSettingsDTO2 = deviceSettingsDTO;
                x1Var = this;
            } else {
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                z1 z1Var = new z1(this, d14, d15, null);
                y1Var.f27499a = deviceSettingsDTO;
                y1Var.f27500b = this;
                y1Var.f27503e = 1;
                objE0 = ge1.b.e0(bVar, z1Var, y1Var);
                if (objE0 == aVar) {
                    return aVar;
                }
                deviceSettingsDTO2 = deviceSettingsDTO;
                x1Var = this;
            }
            x1Var.f27495f = string;
            k(deviceSettingsDTO2);
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        x1Var = y1Var.f27500b;
        deviceSettingsDTO2 = y1Var.f27499a;
        o13.r.b(objE0);
        string = (String) objE0;
        x1Var.f27495f = string;
        k(deviceSettingsDTO2);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/x1$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
