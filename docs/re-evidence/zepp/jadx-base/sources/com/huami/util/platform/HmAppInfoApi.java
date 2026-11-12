package com.huami.util.platform;

import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.huami.util.platform.device.DeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/huami/util/platform/HmAppInfoApi;", "", "", "packageName", "versionName", "", "versionNumber", "()Ljava/lang/Long;", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/ApplicationInfo;", "applicationInfo", "Landroid/os/Bundle;", "getMetaData", "Lcom/huami/util/platform/device/DeviceType;", "deviceType", "deviceBrand", "hardWare", "findCPUFre", "Landroid/app/ActivityManager$MemoryInfo;", "findMemoryInfo", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public interface HmAppInfoApi {
    @Nullable
    ApplicationInfo applicationInfo();

    @Nullable
    String deviceBrand();

    @NotNull
    DeviceType deviceType();

    @NotNull
    String findCPUFre();

    @NotNull
    ActivityManager.MemoryInfo findMemoryInfo();

    @NotNull
    Bundle getMetaData();

    @Nullable
    String hardWare();

    @Nullable
    PackageInfo packageInfo();

    @NotNull
    String packageName();

    @Nullable
    String versionName();

    @Nullable
    Long versionNumber();
}
