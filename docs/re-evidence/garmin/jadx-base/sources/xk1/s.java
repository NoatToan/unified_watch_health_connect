package xk1;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxk1/s;", "Landroidx/lifecycle/x1$c;", "Landroidx/lifecycle/y0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "statusListener", "<init>", "(Landroidx/lifecycle/y0;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<g3<List<PowerZonesDTO>>> f191287a;

    public s(y0<g3<List<PowerZonesDTO>>> y0Var) {
        y0Var.getClass();
        this.f191287a = y0Var;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(p.class)) {
            return new p(this.f191287a);
        }
        vb.h.s("Incompatible ViewModel class!");
        return null;
    }
}
