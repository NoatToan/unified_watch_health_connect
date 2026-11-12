package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J<\u0010\u0011\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u0019\u0010\u0016\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingHelper;", "", "", "msg", "Lkotlin/Function0;", "", "action", "c", GoogleApiAvailabilityLight.a, "a", "b", "Landroid/app/Activity;", "activity", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "loadingVo", "successAction", "failAction", "responseToLoadingStatus", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LoadingHelper {

    @NotNull
    private static final String c = "LoadingHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadingStatus.values().length];
            iArr[LoadingStatus.START.ordinal()] = 1;
            iArr[LoadingStatus.SUCCESS.ordinal()] = 2;
            iArr[LoadingStatus.CANCEL.ordinal()] = 3;
            iArr[LoadingStatus.FAIL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "activity was finished!";
        }
    }

    public LoadingHelper(@NotNull Context context) {
        this.context = context;
    }

    private final void a() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        if (!loadingDialog.isShowing()) {
            loadingDialog = null;
        }
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void b(String msg, final Function0<Unit> action) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        if (!loadingDialog.isShowing()) {
            loadingDialog = null;
        }
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setSuccess(msg, new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper$setSuccess$2
            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(@Nullable LoadingDialog dialog) {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(@Nullable LoadingDialog dialog) {
                Function0<Unit> function0 = action;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }
        });
    }

    private final void c(String msg, final Function0<Unit> action) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        if (!loadingDialog.isShowing()) {
            loadingDialog = null;
        }
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(msg, new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper$showFail$2
            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(@Nullable LoadingDialog dialog) {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(@Nullable LoadingDialog dialog) {
                Function0<Unit> function0 = action;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }
        });
    }

    private final void d(String msg) {
        if (this.loadingDialog == null) {
            LoadingDialog loadingDialog = new LoadingDialog(this.context);
            loadingDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            this.loadingDialog = loadingDialog;
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 == null) {
            return;
        }
        if (!(!loadingDialog2.isShowing())) {
            loadingDialog2 = null;
        }
        if (loadingDialog2 == null) {
            return;
        }
        loadingDialog2.setMessage(msg);
        loadingDialog2.setCancelable(false);
        loadingDialog2.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void responseToLoadingStatus$default(LoadingHelper loadingHelper, Activity activity, LoadingVo loadingVo, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        loadingHelper.responseToLoadingStatus(activity, loadingVo, function0, function1);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void responseToLoadingStatus(@Nullable Activity activity, @NotNull LoadingVo loadingVo, @Nullable Function0<Unit> successAction, @Nullable Function0<Unit> failAction) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            HMLog.error$default(c, null, null, a.a, 6, null);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[loadingVo.getLoadingStatus().ordinal()];
        if (i == 1) {
            d(loadingVo.getMsg());
            return;
        }
        if (i == 2) {
            b(loadingVo.getMsg(), successAction);
        } else if (i == 3) {
            a();
        } else {
            if (i != 4) {
                return;
            }
            c(loadingVo.getMsg(), failAction);
        }
    }
}
