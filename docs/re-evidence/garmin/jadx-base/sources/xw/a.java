package xw;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.BloodPressureAlarmReceiver;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxw/a;", "Lud1/a;", "<init>", "()V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ud1.a {
    @Override // ud1.a
    public final Intent d(Context context) {
        return sn.a.d(context, context, BloodPressureAlarmReceiver.class);
    }

    @Override // ud1.a
    public final String e(Context context) {
        context.getClass();
        return k.g(context.getPackageName(), ".action.ACTION_BLOOD_PRESSURE_REMINDER");
    }

    @Override // ud1.a
    public final pd1.c g() {
        return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).w3();
    }

    @Override // ud1.a
    public final boolean i(pd1.b bVar) {
        Boolean enabled = bVar.getEnabled();
        if (enabled != null) {
            return enabled.booleanValue();
        }
        return false;
    }

    @Override // ud1.a
    public final void m(pd1.c cVar) {
        cVar.getClass();
        ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).Z0(cVar);
    }
}
