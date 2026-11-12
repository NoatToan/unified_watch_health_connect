package org.acra.sender;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;
import org.acra.util.IOUtils;

/* JADX INFO: loaded from: classes23.dex */
public class LegacySenderService extends Service {
    public static final String EXTRA_ACRA_CONFIG = "acraConfig";
    public static final String EXTRA_ONLY_SEND_SILENT_REPORTS = "onlySendSilentReports";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(CoreConfiguration coreConfiguration, Intent intent) {
        new SendingConductor(this, coreConfiguration).sendReports(false, org.acra.util.a.d(intent.getExtras()));
        stopSelf();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, int i2) {
        if (!intent.hasExtra(EXTRA_ACRA_CONFIG)) {
            if (!ACRA.DEV_LOGGING) {
                return 3;
            }
            ACRA.log.d(ACRA.LOG_TAG, "SenderService was started but no valid intent was delivered, will now quit");
            return 3;
        }
        final CoreConfiguration coreConfiguration = (CoreConfiguration) IOUtils.deserialize(CoreConfiguration.class, intent.getStringExtra(EXTRA_ACRA_CONFIG));
        if (coreConfiguration == null) {
            return 3;
        }
        new Thread(new Runnable() { // from class: fm4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(coreConfiguration, intent);
            }
        }).start();
        return 3;
    }
}
