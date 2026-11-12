package com.huami.utils.permissionx.rationale;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.utils.permissionx.Logger;
import com.huami.utils.permissionx.LoggerKt;
import com.huami.utils.permissionx.PermissionRationaleConfig;
import com.huami.utils.permissionx.PermissionX;
import com.huami.utils.permissionx.R;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroid/app/Activity;", "Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;", "info", "", "positiveText", "negativeText", "", "showRationaleDialog", "(Landroid/app/Activity;Lcom/huami/utils/permissionx/rationale/PermissionRationaleInfo;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "permissionx_release"}, k = 2, mv = {1, 5, 1})
public final class RationaleDialogKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ Continuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super Boolean> continuation) {
            this.a = continuation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Continuation<Boolean> continuation = this.a;
            Boolean bool = Boolean.TRUE;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(bool));
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Function1<Activity, Unit> goPermissionDetails$permissionx_release;
            PermissionRationaleConfig rationalesConfig = PermissionX.INSTANCE.getRationalesConfig();
            if (rationalesConfig != null && (goPermissionDetails$permissionx_release = rationalesConfig.getGoPermissionDetails$permissionx_release()) != null) {
                goPermissionDetails$permissionx_release.invoke(this.a);
            }
            Logger logger = LoggerKt.getLogger();
            if (logger == null) {
                return;
            }
            logger.info("进入权限说明详情页面...");
        }
    }

    @Nullable
    public static final Object showRationaleDialog(@NotNull Activity activity, @NotNull PermissionRationaleInfo permissionRationaleInfo, int i, int i2, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (!(activity instanceof FragmentActivity)) {
            throw new IllegalStateException("请在 FragmentActivity 中调用请求权限的方法，否则无法弹框。");
        }
        new AlertDialogFragment.Builder(activity).setMessage(permissionRationaleInfo.getMessageResId()).setPositiveButton(activity.getString(i), new a(safeContinuation)).setNegativeButton(activity.getString(i2), new b(activity)).autoDismiss(false).setCancelable(false).show(((FragmentActivity) activity).getSupportFragmentManager()).setGravity(17);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ Object showRationaleDialog$default(Activity activity, PermissionRationaleInfo permissionRationaleInfo, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = R.string.easypermission_permission_dialog_know;
        }
        if ((i3 & 4) != 0) {
            i2 = R.string.easypermission_permission_detail;
        }
        return showRationaleDialog(activity, permissionRationaleInfo, i, i2, continuation);
    }
}
