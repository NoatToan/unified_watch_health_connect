package com.xiaomi.hm.health.device.message;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.alipay.sdk.m.x.d;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/message/MessageHookManager;", "", "", "a", "Landroid/app/Activity;", "activity", "regUI", "", "title", "phoneNo", "openUI", "Ljava/lang/String;", "getPhoneNo", "()Ljava/lang/String;", "setPhoneNo", "(Ljava/lang/String;)V", "b", "getTitle", d.o, "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "beforeContext", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MessageHookManager {

    @NotNull
    public static final MessageHookManager INSTANCE = new MessageHookManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static String phoneNo = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static String title = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static WeakReference<Activity> beforeContext;

    private MessageHookManager() {
    }

    private final void a() {
        Activity activity;
        WeakReference<Activity> weakReference = beforeContext;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        activity.finish();
    }

    @NotNull
    public final String getPhoneNo() {
        return phoneNo;
    }

    @NotNull
    public final String getTitle() {
        return title;
    }

    public final void openUI(@NotNull String title2, @NotNull String phoneNo2) {
        phoneNo = phoneNo2;
        title = title2;
        a();
        Application context = DeviceXFunctionsKt.getContext();
        Intent intent = new Intent(context, (Class<?>) MessageHookActivity.class);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public final void regUI(@NotNull Activity activity) {
        a();
        beforeContext = new WeakReference<>(activity);
    }

    public final void setPhoneNo(@NotNull String str) {
        phoneNo = str;
    }

    public final void setTitle(@NotNull String str) {
        title = str;
    }
}
