package com.xiaomi.hm.health.ui.smartplay;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.activity.StartUpActivity;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.ui.smartplay.AvoidSpiteBindingHelper;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/AvoidSpiteBindingHelper;", "", "", "c", "", "count", "recordSpiteBind", "checkWhenEnterForeground", "a", "Ljava/lang/Object;", "syncObj", "", "TAG", "Ljava/lang/String;", "b", LogUtil.I, "COUNT_LIMIT", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AvoidSpiteBindingHelper {

    @NotNull
    public static final String TAG = "AvoidSpiteBindingHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int COUNT_LIMIT = 5;

    @NotNull
    public static final AvoidSpiteBindingHelper INSTANCE = new AvoidSpiteBindingHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Object syncObj = new Object();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "hasShowDialog: " + this.a + ", showFlag: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "check today has show dialog";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "count: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "today has show dialog";
        }
    }

    private AvoidSpiteBindingHelper() {
    }

    private final void c() {
        Activity topActivity = BraceletForegroundCallBack.getTopActivity();
        final AppCompatActivity appCompatActivity = topActivity instanceof AppCompatActivity ? (AppCompatActivity) topActivity : null;
        if (appCompatActivity == null) {
            return;
        }
        new AlertDialogFragment.Builder(appCompatActivity).setMessage(HMDeviceConfig.isWatch() ? R.string.avoid_spite_binding_tips_4_watch : R.string.avoid_spite_binding_tips_4).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: bl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AvoidSpiteBindingHelper.d(dialogInterface, i);
            }
        }).setPositiveButton(R.string.avoid_spite_binding_go_to_open, new DialogInterface.OnClickListener() { // from class: al
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AvoidSpiteBindingHelper.e(appCompatActivity, dialogInterface, i);
            }
        }).show(appCompatActivity.getSupportFragmentManager());
        HMKeeper.setShowAvoidSpiteBindDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AppCompatActivity appCompatActivity, DialogInterface dialogInterface, int i) {
        appCompatActivity.startActivity(new Intent(appCompatActivity, (Class<?>) AvoidSpiteBindingActivity.class));
        dialogInterface.dismiss();
    }

    public final void checkWhenEnterForeground() {
        if (HMDeviceConfig.hasFeatureAvoidSpiteBind()) {
            synchronized (syncObj) {
                boolean zHasShowAvoidSpiteBindDialog = HMKeeper.hasShowAvoidSpiteBindDialog();
                boolean showAvoidSpiteBindFlag = HMKeeper.getShowAvoidSpiteBindFlag();
                HMLog.info(TAG, new a(zHasShowAvoidSpiteBindDialog, showAvoidSpiteBindFlag));
                if (zHasShowAvoidSpiteBindDialog) {
                    HMLog.info(TAG, b.a);
                    return;
                }
                if (showAvoidSpiteBindFlag) {
                    INSTANCE.c();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void recordSpiteBind(int count) {
        if (HMDeviceConfig.hasFeatureAvoidSpiteBind()) {
            HMLog.info(TAG, new c(count));
            synchronized (syncObj) {
                if (HMKeeper.hasShowAvoidSpiteBindDialog()) {
                    HMLog.info(TAG, d.a);
                    return;
                }
                if (count <= 5) {
                    return;
                }
                if (!BraceletForegroundCallBack.getInstance().isForeground() || (BraceletForegroundCallBack.getTopActivity() instanceof StartUpActivity)) {
                    HMKeeper.setShowSpiteBindFlag(System.currentTimeMillis());
                } else {
                    INSTANCE.c();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
