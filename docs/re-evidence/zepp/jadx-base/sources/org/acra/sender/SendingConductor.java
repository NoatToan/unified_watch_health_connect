package org.acra.sender;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.acra.ACRA;
import org.acra.collections.ImmutableList;
import org.acra.config.CoreConfiguration;
import org.acra.file.CrashReportFileNameParser;
import org.acra.file.ReportLocator;
import org.acra.log.ACRALog;
import org.acra.util.BundleWrapper;
import org.acra.util.InstanceCreator;
import org.acra.util.ToastSender;

/* JADX INFO: loaded from: classes23.dex */
public class SendingConductor {
    private final Context a;
    private final CoreConfiguration b;
    private final ReportLocator c;

    public SendingConductor(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        this.a = context;
        this.b = coreConfiguration;
        this.c = new ReportLocator(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        ToastSender.sendToast(this.a, str, 1);
    }

    @NonNull
    public List<ReportSender> getSenderInstances(boolean z) {
        List listCreate;
        ImmutableList<Class<? extends ReportSenderFactory>> immutableListReportSenderFactoryClasses = this.b.reportSenderFactoryClasses();
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "config#reportSenderFactoryClasses : " + immutableListReportSenderFactoryClasses);
        }
        if (immutableListReportSenderFactoryClasses.isEmpty()) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Using PluginLoader to find ReportSender factories");
            }
            listCreate = this.b.pluginLoader().loadEnabled(this.b, ReportSenderFactory.class);
        } else {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Creating reportSenderFactories for reportSenderFactory config");
            }
            listCreate = new InstanceCreator().create(immutableListReportSenderFactoryClasses);
        }
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "reportSenderFactories : " + listCreate);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listCreate.iterator();
        while (it2.hasNext()) {
            ReportSender reportSenderCreate = ((ReportSenderFactory) it2.next()).create(this.a, this.b);
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Adding reportSender : " + reportSenderCreate);
            }
            if (z == reportSenderCreate.requiresForeground()) {
                arrayList.add(reportSenderCreate);
            }
        }
        return arrayList;
    }

    public void sendReports(boolean z, BundleWrapper bundleWrapper) {
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "About to start sending reports from SenderService");
        }
        try {
            List<ReportSender> senderInstances = getSenderInstances(z);
            if (senderInstances.isEmpty()) {
                if (ACRA.DEV_LOGGING) {
                    ACRA.log.d(ACRA.LOG_TAG, "No ReportSenders configured - adding NullSender");
                }
                senderInstances.add(new a());
            }
            File[] approvedReports = this.c.getApprovedReports();
            b bVar = new b(this.a, this.b, senderInstances, bundleWrapper);
            CrashReportFileNameParser crashReportFileNameParser = new CrashReportFileNameParser();
            int i = 0;
            boolean z2 = false;
            for (File file : approvedReports) {
                boolean z3 = !crashReportFileNameParser.isSilent(file.getName());
                if (!bundleWrapper.getBoolean(LegacySenderService.EXTRA_ONLY_SEND_SILENT_REPORTS) || !z3) {
                    z2 |= z3;
                    if (i >= 5) {
                        break;
                    } else if (bVar.a(file)) {
                        i++;
                    }
                }
            }
            if (z2) {
                final String strReportSendSuccessToast = i > 0 ? this.b.reportSendSuccessToast() : this.b.reportSendFailureToast();
                if (strReportSendSuccessToast != null) {
                    if (ACRA.DEV_LOGGING) {
                        ACRALog aCRALog = ACRA.log;
                        String str = ACRA.LOG_TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("About to show ");
                        sb.append(i > 0 ? "success" : com.facebook.login.a.K);
                        sb.append(" toast");
                        aCRALog.d(str, sb.toString());
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dn6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b(strReportSendSuccessToast);
                        }
                    });
                }
            }
        } catch (Exception e) {
            ACRA.log.e(ACRA.LOG_TAG, "", e);
        }
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Finished sending reports from SenderService");
        }
    }
}
