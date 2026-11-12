package com.xiaomi.fitness.helper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.DeadSystemException;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.helper.CrashHandler;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.bg4;
import defpackage.t5l;
import io.reactivex.exceptions.UndeliverableException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\b\u0010\n\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000fH\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u001d\u0010\u001c\u001a\u00020\b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010 R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/helper/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "<init>", "()V", "mContext", "Landroid/content/Context;", "mDefaultHandler", "init", "", "context", "setRxErrorHandler", "uncaughtException", DeviceTagInterface.CUSTOM_TAG_TYPE, "Ljava/lang/Thread;", "ex", "", "causedByDeadSystemException", "", "causedByStartForegroundService", "ignoreException", "causedByDevelopmentDatabaseMigrationException", "exitApp", "saveErrorInfo", "throwable", "getPhoneInfo", "", "sendEmail", "msg", "clearFiles", "files", "", "Ljava/io/File;", "([Ljava/io/File;)V", "Companion", "app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final int MAX_CRASH_FILE_NUMBER = 3;

    @NotNull
    public static final String sTag = "CrashHandler";

    @Nullable
    private Context mContext;

    @Nullable
    private Thread.UncaughtExceptionHandler mDefaultHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<CrashHandler> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: p05
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CrashHandler.instance_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/helper/CrashHandler$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/helper/CrashHandler;", "getInstance", "()Lcom/xiaomi/fitness/helper/CrashHandler;", "instance$delegate", "Lkotlin/Lazy;", "MAX_CRASH_FILE_NUMBER", "", "sTag", "", "app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CrashHandler getInstance() {
            return (CrashHandler) CrashHandler.instance$delegate.getValue();
        }
    }

    private final boolean causedByDeadSystemException(Throwable ex) {
        if (!(ex instanceof RuntimeException)) {
            return false;
        }
        Throwable cause = ex.getCause();
        return (cause instanceof RuntimeException) && (((RuntimeException) cause).getCause() instanceof DeadSystemException);
    }

    private final boolean causedByDevelopmentDatabaseMigrationException(Throwable t) {
        String message;
        if (!StringsKt__StringsJVMKt.startsWith$default("3.46.1", UserConfig.KEY_LITE_SCENE_ORDER, false, 2, null) || !(t instanceof IllegalStateException) || (message = t.getMessage()) == null || !StringsKt__StringsKt.contains((CharSequence) message, (CharSequence) "migration", true)) {
            return false;
        }
        Logger.i(sTag, "causedByDevelopmentDatabaseMigrationException() called with: t = " + t);
        return true;
    }

    private final boolean causedByStartForegroundService(Throwable t) {
        String message;
        return Build.VERSION.SDK_INT == 30 && (t instanceof RuntimeException) && (message = t.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "SleepTraceService", false, 2, (Object) null);
    }

    private final void clearFiles(File[] files) {
        if (files == null || files.length <= 3) {
            return;
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(files, files.length));
        Collections.sort(listListOf, new Comparator() { // from class: n05
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CrashHandler.clearFiles$lambda$1((File) obj, (File) obj2);
            }
        });
        for (File file : listListOf.subList(2, listListOf.size())) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int clearFiles$lambda$1(File file, File file2) {
        long jLastModified = file.lastModified() - file2.lastModified();
        if (jLastModified > 0) {
            return -1;
        }
        return jLastModified == 0 ? 0 : 1;
    }

    private final void exitApp(Thread t, Throwable ex) {
        if (this.mDefaultHandler == null || ignoreException(ex)) {
            AppManager.INSTANCE.getInstance().appExit();
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mDefaultHandler;
        Intrinsics.checkNotNull(uncaughtExceptionHandler);
        uncaughtExceptionHandler.uncaughtException(t, ex);
    }

    private final String getPhoneInfo(Context context) {
        Intrinsics.checkNotNull(context);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            String str = "APP Version:" + packageInfo.versionName + '_' + packageInfo.versionCode + "\nOS Version:" + Build.VERSION.RELEASE + '_' + Build.VERSION.SDK_INT + "\nVendor:" + Build.MANUFACTURER + "\nModel:" + Build.MODEL + "\nCUP ABI:" + Build.CPU_ABI + "\nProcess:" + ApplicationExtKt.getProcessName(AppUtil.getApp()) + "\n";
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    private final boolean ignoreException(Throwable t) {
        return causedByDeadSystemException(t) || causedByStartForegroundService(t) || causedByDevelopmentDatabaseMigrationException(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrashHandler instance_delegate$lambda$2() {
        return new CrashHandler();
    }

    private final void saveErrorInfo(Throwable throwable) {
        try {
            String strValueOf = String.valueOf(new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date(System.currentTimeMillis())));
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            printWriter.close();
            Logger.e(sTag, getPhoneInfo(this.mContext), strValueOf, new Object[0]);
            String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.e(sTag, string, strValueOf, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void sendEmail(String msg) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:yujiangtao@xiaomi.com"));
        intent.putExtra("android.intent.extra.SUBJECT", "mi watch crash report");
        intent.putExtra("android.intent.extra.TEXT", msg);
        Context context = this.mContext;
        Intrinsics.checkNotNull(context);
        context.startActivity(intent);
    }

    private final void setRxErrorHandler() {
        t5l.u(new bg4() { // from class: o05
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CrashHandler.setRxErrorHandler$lambda$0(this.f28603a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRxErrorHandler$lambda$0(CrashHandler this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (th instanceof UndeliverableException) {
            th = ((UndeliverableException) th).getCause();
        }
        if ((th instanceof IOException) || (th instanceof SocketException) || (th instanceof InterruptedException)) {
            return;
        }
        if ((th instanceof NullPointerException) || (th instanceof IllegalArgumentException)) {
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "currentThread(...)");
            this$0.uncaughtException(threadCurrentThread, th);
        } else if (th instanceof IllegalStateException) {
            Thread threadCurrentThread2 = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread2, "currentThread(...)");
            this$0.uncaughtException(threadCurrentThread2, th);
        }
    }

    public final void init(@Nullable Context context) {
        this.mContext = context;
        this.mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        setRxErrorHandler();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread t, @NotNull Throwable ex) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(ex, "ex");
        saveErrorInfo(ex);
        exitApp(t, ex);
    }
}
