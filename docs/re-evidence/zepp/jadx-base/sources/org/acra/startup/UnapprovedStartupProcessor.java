package org.acra.startup;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.l16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.acra.config.CoreConfiguration;
import org.acra.file.LastModifiedComparator;
import org.acra.startup.Report;
import org.acra.startup.UnapprovedStartupProcessor;

/* JADX INFO: loaded from: classes23.dex */
public class UnapprovedStartupProcessor implements StartupProcessor {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$processReports$0(LastModifiedComparator lastModifiedComparator, Report report, Report report2) {
        return lastModifiedComparator.compare(report.getFile(), report2.getFile());
    }

    @Override // org.acra.plugins.Plugin
    public /* synthetic */ boolean enabled(CoreConfiguration coreConfiguration) {
        return l16.a(this, coreConfiguration);
    }

    @Override // org.acra.startup.StartupProcessor
    public void processReports(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, List<Report> list) {
        if (coreConfiguration.deleteUnapprovedReportsOnApplicationStart()) {
            ArrayList arrayList = new ArrayList();
            for (Report report : list) {
                if (!report.isApproved()) {
                    arrayList.add(report);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            final LastModifiedComparator lastModifiedComparator = new LastModifiedComparator();
            Collections.sort(arrayList, new Comparator() { // from class: z08
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return UnapprovedStartupProcessor.lambda$processReports$0(lastModifiedComparator, (Report) obj, (Report) obj2);
                }
            });
            if (coreConfiguration.deleteUnapprovedReportsOnApplicationStart()) {
                for (int i = 0; i < arrayList.size() - 1; i++) {
                    ((Report) arrayList.get(i)).delete();
                }
            }
            ((Report) arrayList.get(arrayList.size() - 1)).approve();
        }
    }
}
