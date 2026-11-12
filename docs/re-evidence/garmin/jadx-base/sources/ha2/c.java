package ha2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import java.util.TimerTask;
import oa2.d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lha2/c;", "Ljava/util/TimerTask;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "macAddress", "Lha2/c$a;", "callback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lha2/c$a;)V", "a", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f82715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f82716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f82717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82720f;

    public interface a {
        void a(int i14);

        void b();
    }

    public c(Context context, String str, a aVar) {
        context.getClass();
        str.getClass();
        aVar.getClass();
        this.f82715a = aVar;
        this.f82716b = context.getApplicationContext();
        this.f82717c = LoggerFactory.getLogger(d.b("GDI#", "BatteryStatusTask", str, -1L, this));
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a aVar = this.f82715a;
        Context context = this.f82716b;
        Logger logger = this.f82717c;
        logger.debug("Timer tick run()");
        boolean z14 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
            if (intExtra == 2 || intExtra == 5) {
                this.f82718d = false;
                this.f82719e = false;
                this.f82720f = false;
                aVar.b();
                return;
            }
        } catch (Exception unused) {
            logger.warn("Failed to get battery status.");
        }
        context.getClass();
        Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra2 = intentRegisterReceiver2 != null ? intentRegisterReceiver2.getIntExtra("level", -1) : -1;
        int intExtra3 = intentRegisterReceiver2 != null ? intentRegisterReceiver2.getIntExtra("scale", -1) : -1;
        int i14 = (intExtra2 == -1 || intExtra3 == -1) ? -1 : (intExtra2 * 100) / intExtra3;
        if (i14 != -1) {
            if (i14 <= 5) {
                z14 = !this.f82718d;
                this.f82718d = true;
            } else if (i14 <= 10) {
                z14 = !this.f82719e;
                this.f82719e = true;
            } else if (i14 <= 15) {
                z14 = !this.f82720f;
                this.f82720f = true;
            }
            if (z14) {
                aVar.a(i14);
            }
        }
    }
}
