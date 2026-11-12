package com.huami.utils.permissionx.rationale;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.utils.permissionx.Logger;
import com.huami.utils.permissionx.LoggerKt;
import com.huami.utils.permissionx.PermissionKvData;
import com.huami.utils.permissionx.PermissionRationaleConfig;
import com.huami.utils.permissionx.PermissionRationaleConfigKt;
import com.huami.utils.permissionx.PermissionX;
import com.huami.utils.permissionx.R;
import com.huami.utils.permissionx.business.PermissionsRationaleWithCode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/utils/permissionx/rationale/DefaultPermissionsRationale;", "Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "Landroid/app/Activity;", "activity", "", "", "permissions", "code", "", "shouldShowRationale", "(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showRationale", "", "a", LogUtil.I, "positiveText", "b", "negativeText", "<init>", "(II)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public class DefaultPermissionsRationale implements PermissionsRationaleWithCode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int positiveText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int negativeText;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.rationale.DefaultPermissionsRationale", f = "DefaultPermissionsRationale.kt", i = {}, l = {53}, m = "showRationale$suspendImpl", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return DefaultPermissionsRationale.b(DefaultPermissionsRationale.this, null, null, null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultPermissionsRationale() {
        int i = 0;
        this(i, i, 3, null);
    }

    public DefaultPermissionsRationale(int i, int i2) {
        this.positiveText = i;
        this.negativeText = i2;
    }

    public static /* synthetic */ Object a(DefaultPermissionsRationale defaultPermissionsRationale, Activity activity, List list, String str, Continuation continuation) {
        return Boxing.boxBoolean(PermissionKvData.INSTANCE.shouldShowRationaleOnceADay(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(DefaultPermissionsRationale defaultPermissionsRationale, Activity activity, List list, String str, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = defaultPermissionsRationale.new a(continuation);
            }
        } else {
            aVar = defaultPermissionsRationale.new a(continuation);
        }
        Object objShowRationaleDialog = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objShowRationaleDialog);
            PermissionRationaleConfig rationalesConfig = PermissionX.INSTANCE.getRationalesConfig();
            if (rationalesConfig == null) {
                throw new IllegalStateException(("在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n未在 PermissionRationaleConfig 配置列表中找到 " + list + " 配置，请调用 PermissionX.rationalesConfig 添加。").toString());
            }
            Map<String, PermissionRationaleInfo> rationalesMap$permissionx_release = rationalesConfig.getRationalesMap$permissionx_release();
            if (!rationalesMap$permissionx_release.containsKey(PermissionRationaleConfigKt.getId(list))) {
                String str2 = "在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n未在 PermissionRationaleConfig 配置列表中找到 " + list + " 配置，请调用 PermissionX.rationalesConfig 添加。";
                Logger logger = LoggerKt.getLogger();
                if (logger != null) {
                    logger.error(str2);
                }
                NotImplementedError notImplementedError = new NotImplementedError(str2);
                notImplementedError.printStackTrace();
                throw notImplementedError;
            }
            if (!(activity instanceof FragmentActivity)) {
                String str3 = "在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n请在 FragmentActivity 中调用请求权限的方法，否则无法弹框。";
                Logger logger2 = LoggerKt.getLogger();
                if (logger2 != null) {
                    logger2.error(str3);
                }
                IllegalStateException illegalStateException = new IllegalStateException(str3);
                illegalStateException.printStackTrace();
                throw illegalStateException;
            }
            PermissionRationaleInfo permissionRationaleInfo = rationalesMap$permissionx_release.get(PermissionRationaleConfigKt.getId(list));
            int i3 = defaultPermissionsRationale.positiveText;
            int i4 = defaultPermissionsRationale.negativeText;
            aVar.a = str;
            aVar.d = 1;
            objShowRationaleDialog = RationaleDialogKt.showRationaleDialog(activity, permissionRationaleInfo, i3, i4, aVar);
            if (objShowRationaleDialog == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar.a;
            ResultKt.throwOnFailure(objShowRationaleDialog);
        }
        ((Boolean) objShowRationaleDialog).booleanValue();
        PermissionKvData.INSTANCE.saveShowTime(str, System.currentTimeMillis());
        return objShowRationaleDialog;
    }

    @Override // com.huami.utils.permissionx.business.PermissionsRationaleWithCode
    @Nullable
    public Object shouldShowRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return a(this, activity, list, str, continuation);
    }

    @Override // com.huami.utils.permissionx.business.PermissionsRationaleWithCode
    @Nullable
    public Object showRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return b(this, activity, list, str, continuation);
    }

    public /* synthetic */ DefaultPermissionsRationale(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? R.string.easypermission_permission_dialog_know : i, (i3 & 2) != 0 ? R.string.easypermission_permission_detail : i2);
    }
}
