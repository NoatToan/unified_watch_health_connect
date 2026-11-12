package com.huami.privacy.plugin;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0003J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/privacy/plugin/CurrentProcessName;", "Lcom/huami/privacy/plugin/PrivacyPlugin;", "", "a", "c", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Landroid/content/Context;", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "isPrivacyAgreed", "Ljava/lang/String;", "currentProcessName", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class CurrentProcessName implements PrivacyPlugin<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isPrivacyAgreed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String currentProcessName;

    public CurrentProcessName(@NotNull Context context, @NotNull Function0<Boolean> function0) {
        this.context = context;
        this.isPrivacyAgreed = function0;
    }

    private final String a() {
        String str = this.currentProcessName;
        if (!(str == null || str.length() == 0)) {
            return this.currentProcessName;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.currentProcessName = Application.getProcessName();
        }
        String str2 = this.currentProcessName;
        if (!(str2 == null || str2.length() == 0)) {
            return this.currentProcessName;
        }
        String strC = c();
        this.currentProcessName = strC;
        if (!(strC == null || strC.length() == 0)) {
            return this.currentProcessName;
        }
        if (this.isPrivacyAgreed.invoke().booleanValue()) {
            this.currentProcessName = b(this.context);
        }
        String str3 = this.currentProcessName;
        if (!(str3 == null || str3.length() == 0)) {
            return this.currentProcessName;
        }
        String strD = d();
        this.currentProcessName = strD;
        return strD;
    }

    private final String b(Context context) {
        try {
            Result.Companion companion = Result.Companion;
            Object systemService = context.getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) systemService).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == Process.myPid()) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        }
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private final String c() {
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private final String d() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            InputStream fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/cmdline");
            byte[] bytes = ByteStreamsKt.readBytes(fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192));
            ArrayList arrayList = new ArrayList();
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                byte b = bytes[i];
                if (b > 0) {
                    arrayList.add(Byte.valueOf(b));
                }
            }
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(CollectionsKt___CollectionsKt.toByteArray(arrayList)), Charsets.ISO_8859_1);
            try {
                String text = TextStreamsKt.readText(inputStreamReader);
                CloseableKt.closeFinally(inputStreamReader, null);
                objM3845constructorimpl = Result.m3845constructorimpl(text);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th3));
        }
        return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Override // com.huami.privacy.plugin.PrivacyPlugin
    @Nullable
    public String getValue() {
        return a();
    }
}
