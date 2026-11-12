package com.xiaomi.fitness.health.sleep.ui.setting.util;

import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.auto.start.AutoStarterImpl;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.ui.setting.util.SleepPermissionSettingUtil;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/util/SleepPermissionSettingUtil;", "", "<init>", "()V", "TAG", "", "SLEEP", "updateSleepPermissionSettingInstructionCard", "", "instructionCard", "Landroid/view/View;", "textView", "Landroid/widget/TextView;", "autoStartOn", "runInBgWithoutRestrictionOn", "(Landroid/view/View;Landroid/widget/TextView;Ljava/lang/Boolean;Ljava/lang/Boolean;)Z", "getAutoStartEnabled", "setAutoStart", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepPermissionSettingUtil {

    @NotNull
    public static final SleepPermissionSettingUtil INSTANCE = new SleepPermissionSettingUtil();

    @NotNull
    private static final String SLEEP = "sleep";

    @NotNull
    public static final String TAG = "SleepPermissionSettingUtil";

    private SleepPermissionSettingUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAutoStart$lambda$3(boolean z) {
        AutoStarterImpl.INSTANCE.setAutoStart(ApplicationExtKt.getApplication(), z, "sleep", new Function1() { // from class: drm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepPermissionSettingUtil.setAutoStart$lambda$3$lambda$2((PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAutoStart$lambda$3$lambda$2(PermissionBuilder setAutoStart) {
        Intrinsics.checkNotNullParameter(setAutoStart, "$this$setAutoStart");
        setAutoStart.granted(new Function1() { // from class: brm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepPermissionSettingUtil.setAutoStart$lambda$3$lambda$2$lambda$0((String) obj);
            }
        });
        setAutoStart.denied(new Function1() { // from class: crm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepPermissionSettingUtil.setAutoStart$lambda$3$lambda$2$lambda$1((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAutoStart$lambda$3$lambda$2$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "setAutoStart permission granted.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAutoStart$lambda$3$lambda$2$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "setAutoStart permission denied.");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAutoStart$lambda$4(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final boolean getAutoStartEnabled() {
        boolean zCanAutoStart = AutoStarterImpl.INSTANCE.canAutoStart(ApplicationExtKt.getApplication());
        Logger.i(TAG, "getAutoStartEnabled getAutoStartEnabled=" + zCanAutoStart);
        return zCanAutoStart;
    }

    public final void setAutoStart(final boolean autoStartOn) {
        final Function0 function0 = new Function0() { // from class: zqm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepPermissionSettingUtil.setAutoStart$lambda$3(autoStartOn);
            }
        };
        ExecutorHelper.runInBackground(new Runnable() { // from class: arm
            @Override // java.lang.Runnable
            public final void run() {
                SleepPermissionSettingUtil.setAutoStart$lambda$4(function0);
            }
        });
    }

    public final boolean updateSleepPermissionSettingInstructionCard(@Nullable View instructionCard, @NotNull TextView textView, @Nullable Boolean autoStartOn, @Nullable Boolean runInBgWithoutRestrictionOn) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Integer numValueOf = null;
        if (autoStartOn != null && runInBgWithoutRestrictionOn != null) {
            if (!autoStartOn.booleanValue() && !runInBgWithoutRestrictionOn.booleanValue()) {
                numValueOf = Integer.valueOf(c0j.yd);
            } else if (autoStartOn.booleanValue() && !runInBgWithoutRestrictionOn.booleanValue()) {
                numValueOf = Integer.valueOf(c0j.xh);
            } else if (!autoStartOn.booleanValue() && runInBgWithoutRestrictionOn.booleanValue()) {
                numValueOf = Integer.valueOf(c0j.wh);
            }
        }
        if (numValueOf == null) {
            if (instructionCard != null) {
                ExtUtilKt.gone(instructionCard);
            }
            ExtUtilKt.gone(textView);
        } else {
            if (instructionCard != null) {
                ExtUtilKt.visible(instructionCard);
            }
            ExtUtilKt.visible(textView);
            Logger.i(TAG, "updateSleepPermissionSettingInstructionTextView " + ExtUtilKt.getString(numValueOf.intValue()));
            textView.setText(ExtUtilKt.getString(numValueOf.intValue()));
        }
        return numValueOf != null;
    }
}
