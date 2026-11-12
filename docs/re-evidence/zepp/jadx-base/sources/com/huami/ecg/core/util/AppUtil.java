package com.huami.ecg.core.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0013\u0010\u0012\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0016\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/huami/ecg/core/util/AppUtil;", "", "", "getOSVersion", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getVersionName", "", "getVersionCode", "getVersionNameAndCode", "getMetaDataChannel", "", "isExternalStorageAvailable", "a", "Ljava/lang/String;", "DEFAULT_CHANNEL", "getSystemVersion", "()Ljava/lang/String;", "systemVersion", "getPhoneBrand", "phoneBrand", "getPhoneModel", "phoneModel", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class AppUtil {
    public static final AppUtil INSTANCE = new AppUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String DEFAULT_CHANNEL = "inner";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ext state =" + this.a;
        }
    }

    private AppUtil() {
    }

    @NotNull
    public final String getMetaDataChannel(@NotNull Context context) {
        String string;
        try {
            string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("hm_channel");
        } catch (Exception e) {
            e.printStackTrace();
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            string = "inner";
        }
        return string != null ? string : "inner";
    }

    @Nullable
    public final String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    @NotNull
    public final String getPhoneBrand() {
        return Build.BRAND;
    }

    @NotNull
    public final String getPhoneModel() {
        return Build.MODEL;
    }

    @NotNull
    public final String getSystemVersion() {
        return "Android_" + Build.VERSION.SDK_INT;
    }

    public final int getVersionCode(@NotNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @NotNull
    public final String getVersionName(@NotNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @NotNull
    public final String getVersionNameAndCode(@NotNull Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName + Constants.ACCEPT_TIME_SEPARATOR_SERVER + packageInfo.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final boolean isExternalStorageAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        HMLog.debug("PhoneUtils", new a(externalStorageState));
        return Intrinsics.areEqual("mounted", externalStorageState);
    }
}
