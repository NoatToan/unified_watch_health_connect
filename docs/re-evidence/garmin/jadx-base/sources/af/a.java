package af;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laf/a;", "Laf/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lef/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lef/b;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ef.b bVar) {
        super(context, bVar);
        context.getClass();
        bVar.getClass();
    }

    @Override // af.g
    public final Object a() {
        Intent intentRegisterReceiver = this.f3019b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            return Boolean.valueOf(intExtra == 2 || intExtra == 5);
        }
        u uVarA = u.a();
        int i14 = b.f3013a;
        uVarA.getClass();
        return Boolean.FALSE;
    }

    @Override // af.e
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // af.e
    public final void f(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        u uVarA = u.a();
        int i14 = b.f3013a;
        "Received ".concat(action);
        uVarA.getClass();
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b(Boolean.FALSE);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    b(Boolean.FALSE);
                    break;
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    b(Boolean.TRUE);
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    b(Boolean.TRUE);
                    break;
                }
                break;
        }
    }
}
