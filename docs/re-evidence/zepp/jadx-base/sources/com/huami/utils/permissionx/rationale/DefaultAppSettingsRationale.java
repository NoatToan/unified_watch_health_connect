package com.huami.utils.permissionx.rationale;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.utils.permissionx.Logger;
import com.huami.utils.permissionx.LoggerKt;
import com.huami.utils.permissionx.PermissionRationaleConfig;
import com.huami.utils.permissionx.PermissionRationaleConfigKt;
import com.huami.utils.permissionx.PermissionX;
import com.huami.utils.permissionx.R;
import com.huami.utils.permissionx.business.AppSettingsRationaleWithCode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR.\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/utils/permissionx/rationale/DefaultAppSettingsRationale;", "Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", "Landroid/app/Activity;", "activity", "", "", "permissions", "code", "", "showAppSettingRationale", "(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", LogUtil.I, "positiveText", "b", "negativeText", "c", "moreLinkText", "Lkotlin/Function2;", "", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function2;", "onMoreLinkClicked", "<init>", "(IIILkotlin/jvm/functions/Function2;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultAppSettingsRationale implements AppSettingsRationaleWithCode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int positiveText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int negativeText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int moreLinkText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function2<Activity, List<String>, Unit> onMoreLinkClicked;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ Activity b;
        public final /* synthetic */ List<String> c;

        public a(Activity activity, List<String> list) {
            this.b = activity;
            this.c = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DefaultAppSettingsRationale.this.onMoreLinkClicked.invoke(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ Continuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Continuation<? super Boolean> continuation) {
            this.a = continuation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Continuation<Boolean> continuation = this.a;
            Boolean bool = Boolean.TRUE;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(bool));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ Continuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Continuation<? super Boolean> continuation) {
            this.a = continuation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Continuation<Boolean> continuation = this.a;
            Boolean bool = Boolean.FALSE;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(bool));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAppSettingsRationale(int i, int i2, int i3, @NotNull Function2<? super Activity, ? super List<String>, Unit> function2) {
        this.positiveText = i;
        this.negativeText = i2;
        this.moreLinkText = i3;
        this.onMoreLinkClicked = function2;
    }

    @Override // com.huami.utils.permissionx.business.AppSettingsRationaleWithCode
    public boolean shouldShowAppSettingRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str) {
        return AppSettingsRationaleWithCode.DefaultImpls.shouldShowAppSettingRationale(this, activity, list, str);
    }

    @Override // com.huami.utils.permissionx.business.AppSettingsRationaleWithCode
    @Nullable
    public Object showAppSettingRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        PermissionRationaleConfig rationalesConfig = PermissionX.INSTANCE.getRationalesConfig();
        if (rationalesConfig == null) {
            throw new IllegalStateException(("在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n未在 PermissionRationaleConfig 配置列表中找到 " + list + " 配置，请调用 PermissionX.rationalesConfig 添加。").toString());
        }
        Map<String, PermissionRationaleInfo> appSettingsMap$permissionx_release = rationalesConfig.getAppSettingsMap$permissionx_release();
        if (!appSettingsMap$permissionx_release.containsKey(PermissionRationaleConfigKt.getId(list))) {
            String str2 = "在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n未在 PermissionRationaleConfig 配置列表中找到 " + appSettingsMap$permissionx_release + " 配置，请调用 PermissionX.rationalesConfig 添加。";
            Logger logger = LoggerKt.getLogger();
            if (logger != null) {
                logger.error(str2);
            }
            NotImplementedError notImplementedError = new NotImplementedError(str2);
            notImplementedError.printStackTrace();
            throw notImplementedError;
        }
        if (activity instanceof FragmentActivity) {
            new AlertDialogFragment.Builder(activity).setMessage(appSettingsMap$permissionx_release.get(PermissionRationaleConfigKt.getId(list)).getMessageResId()).setLink(activity.getString(this.moreLinkText), new a(activity, list)).setPositiveButton(activity.getString(this.positiveText), new b(safeContinuation)).setNegativeButton(activity.getString(this.negativeText), new c(safeContinuation)).show(((FragmentActivity) activity).getSupportFragmentManager()).setGravity(17);
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return orThrow;
        }
        String str3 = "在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n请在 FragmentActivity 中调用请求权限的方法，否则无法弹框。";
        Logger logger2 = LoggerKt.getLogger();
        if (logger2 != null) {
            logger2.error(str3);
        }
        IllegalStateException illegalStateException = new IllegalStateException(str3);
        illegalStateException.printStackTrace();
        throw illegalStateException;
    }

    public /* synthetic */ DefaultAppSettingsRationale(int i, int i2, int i3, Function2 function2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? R.string.easypermission_permission_go_to_setting : i, (i4 & 2) != 0 ? R.string.easypermission_permission_dialog_cancel : i2, (i4 & 4) != 0 ? R.string.easypermission_permission_link_detail : i3, function2);
    }
}
