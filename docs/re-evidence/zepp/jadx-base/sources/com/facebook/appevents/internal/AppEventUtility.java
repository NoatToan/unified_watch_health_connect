package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\f8C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/internal/AppEventUtility;", "", "", "assertIsNotMainThread", "assertIsMainThread", "", "value", "", "normalizePrice", "", HTTP.CONTENT_RANGE_BYTES, "bytesToHex", "", "isEmulator", "getAppVersion", "Landroid/app/Activity;", "activity", "Landroid/view/View;", "getRootView", "a", "Ljava/lang/String;", "PRICE_REGEX", "()Z", "isMainThread", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppEventUtility {

    @NotNull
    public static final AppEventUtility INSTANCE = new AppEventUtility();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    private AppEventUtility() {
    }

    @JvmStatic
    private static final boolean a() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    @JvmStatic
    public static final void assertIsMainThread() {
    }

    @JvmStatic
    public static final void assertIsNotMainThread() {
    }

    @JvmStatic
    @NotNull
    public static final String bytesToHex(@NotNull byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bytes) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            stringBuffer.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return stringBuffer.toString();
    }

    @JvmStatic
    @NotNull
    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @JvmStatic
    @Nullable
    public static final View getRootView(@Nullable Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window != null) {
                return window.getDecorView().getRootView();
            }
            return null;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventUtility.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isEmulator() {
        String str = Build.FINGERPRINT;
        if (!m.startsWith$default(str, MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE, false, 2, null) && !m.startsWith$default(str, "unknown", false, 2, null)) {
            String str2 = Build.MODEL;
            if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "Emulator", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "Android SDK built for x86", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) Build.MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null) && ((!m.startsWith$default(Build.BRAND, MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE, false, 2, null) || !m.startsWith$default(Build.DEVICE, MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE, false, 2, null)) && !Intrinsics.areEqual("google_sdk", Build.PRODUCT))) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final double normalizePrice(@Nullable String value) {
        try {
            Matcher matcher = Pattern.compile(PRICE_REGEX, 8).matcher(value);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
