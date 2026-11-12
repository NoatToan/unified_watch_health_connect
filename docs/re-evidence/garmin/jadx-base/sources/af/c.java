package af;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laf/c;", "Laf/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lef/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lef/b;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, ef.b bVar) {
        super(context, bVar);
        context.getClass();
        bVar.getClass();
    }

    @Override // af.g
    public final Object a() {
        Intent intentRegisterReceiver = this.f3019b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            u uVarA = u.a();
            int i14 = d.f3014a;
            uVarA.getClass();
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z14 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Override // af.e
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // af.e
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        u uVarA = u.a();
        int i14 = d.f3014a;
        intent.getAction();
        uVarA.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    b(Boolean.TRUE);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                b(Boolean.FALSE);
            }
        }
    }
}
