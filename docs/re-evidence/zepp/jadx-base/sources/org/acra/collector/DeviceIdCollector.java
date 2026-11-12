package org.acra.collector;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.acra.prefs.SharedPreferencesFactory;
import org.acra.util.PackageManagerWrapper;
import org.acra.util.SystemServices;

/* JADX INFO: loaded from: classes23.dex */
public final class DeviceIdCollector extends BaseReportFieldCollector {
    public DeviceIdCollector() {
        super(ReportField.DEVICE_ID, new ReportField[0]);
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws Exception {
        crashReportData.put(ReportField.DEVICE_ID, SystemServices.getTelephonyManager(context).getDeviceId());
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public boolean shouldCollect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportField reportField, @NonNull ReportBuilder reportBuilder) {
        return super.shouldCollect(context, coreConfiguration, reportField, reportBuilder) && new SharedPreferencesFactory(context, coreConfiguration).create().getBoolean(ACRA.PREF_ENABLE_DEVICE_ID, true) && new PackageManagerWrapper(context).hasPermission("android.permission.READ_PHONE_STATE");
    }
}
