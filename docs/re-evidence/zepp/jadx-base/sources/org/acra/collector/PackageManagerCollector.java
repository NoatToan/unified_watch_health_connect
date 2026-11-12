package org.acra.collector;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.annotation.NonNull;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.acra.util.PackageManagerWrapper;

/* JADX INFO: loaded from: classes23.dex */
public final class PackageManagerCollector extends BaseReportFieldCollector {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            a = iArr;
            try {
                iArr[ReportField.APP_VERSION_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReportField.APP_VERSION_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PackageManagerCollector() {
        super(ReportField.APP_VERSION_NAME, ReportField.APP_VERSION_CODE);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws CollectorException {
        PackageInfo packageInfo = new PackageManagerWrapper(context).getPackageInfo();
        if (packageInfo == null) {
            throw new CollectorException("Failed to get package info");
        }
        int i = a.a[reportField.ordinal()];
        if (i == 1) {
            crashReportData.put(ReportField.APP_VERSION_NAME, packageInfo.versionName);
        } else {
            if (i != 2) {
                return;
            }
            crashReportData.put(ReportField.APP_VERSION_CODE, packageInfo.versionCode);
        }
    }
}
