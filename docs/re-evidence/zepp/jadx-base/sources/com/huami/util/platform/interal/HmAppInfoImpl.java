package com.huami.util.platform.interal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.tools.log.HMLog;
import com.huami.util.platform.HmAppInfoApi;
import com.huami.util.platform.device.DeviceType;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/util/platform/interal/HmAppInfoImpl;", "Lcom/huami/util/platform/HmAppInfoApi;", "", "packageName", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/ApplicationInfo;", "applicationInfo", "versionName", "", "versionNumber", "()Ljava/lang/Long;", "Landroid/os/Bundle;", "getMetaData", "Lcom/huami/util/platform/device/DeviceType;", "deviceType", "deviceBrand", "hardWare", "findCPUFre", "Landroid/app/ActivityManager$MemoryInfo;", "findMemoryInfo", "Landroid/app/Application;", "a", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "b", "Ljava/lang/String;", "tag", "<init>", "(Landroid/app/Application;)V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class HmAppInfoImpl implements HmAppInfoApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application application;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag = HmAppInfoImpl.class.getSimpleName();

    public HmAppInfoImpl(@NotNull Application application) {
        this.application = application;
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @Nullable
    public ApplicationInfo applicationInfo() {
        try {
            return this.application.getPackageManager().getApplicationInfo(packageName(), 128);
        } catch (Exception e) {
            HMLog.e(this.tag, e);
            return null;
        }
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @Nullable
    public String deviceBrand() {
        return Build.BRAND;
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @NotNull
    public DeviceType deviceType() {
        return DeviceType.PHONE;
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @NotNull
    public String findCPUFre() {
        String[] strArr = {"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"};
        InputStream inputStream = new ProcessBuilder(strArr[0], strArr[1]).start().getInputStream();
        try {
            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            String text = TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(inputStream, null);
            return text;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @NotNull
    public ActivityManager.MemoryInfo findMemoryInfo() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            Object systemService = this.application.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            }
        } catch (Exception e) {
            HMLog.e(this.tag, e);
        }
        return memoryInfo;
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @NotNull
    public Bundle getMetaData() {
        ApplicationInfo applicationInfo = applicationInfo();
        Bundle bundle = applicationInfo == null ? null : applicationInfo.metaData;
        return bundle == null ? new Bundle() : bundle;
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @Nullable
    public String hardWare() {
        return Build.HARDWARE;
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @Nullable
    public PackageInfo packageInfo() {
        try {
            return this.application.getPackageManager().getPackageInfo(packageName(), 16384);
        } catch (Exception e) {
            HMLog.e(this.tag, e);
            return null;
        }
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @NotNull
    public String packageName() {
        return this.application.getPackageName();
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @Nullable
    public String versionName() {
        PackageInfo packageInfo = packageInfo();
        if (packageInfo == null) {
            return null;
        }
        return packageInfo.versionName;
    }

    @Override // com.huami.util.platform.HmAppInfoApi
    @Nullable
    public Long versionNumber() {
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = packageInfo();
            if (packageInfo == null) {
                return null;
            }
            return Long.valueOf(packageInfo.getLongVersionCode());
        }
        PackageInfo packageInfo2 = packageInfo();
        if (packageInfo2 == null) {
            return null;
        }
        return Long.valueOf(packageInfo2.versionCode);
    }
}
