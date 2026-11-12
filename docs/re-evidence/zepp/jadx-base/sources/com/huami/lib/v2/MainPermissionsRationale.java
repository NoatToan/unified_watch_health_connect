package com.huami.lib.v2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.permission.R;
import com.huami.utils.easypermission.manager.PermissionManagerActivity;
import com.huami.utils.permissionx.PermissionKvData;
import com.huami.utils.permissionx.business.PermissionsRationaleWithCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/lib/v2/MainPermissionsRationale;", "Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "Landroidx/fragment/app/FragmentActivity;", "", "message", "", "messageGravity", "", "a", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "", "permissions", "code", "shouldShowRationale", "(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showRationale", "Ljava/lang/String;", "b", "Z", "onlyOnce", "c", LogUtil.I, "<init>", "(Ljava/lang/String;ZI)V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class MainPermissionsRationale implements PermissionsRationaleWithCode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean onlyOnce;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int messageGravity;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.lib.v2.MainPermissionsRationale", f = "MainPermissionsRationale.kt", i = {0}, l = {56}, m = "showRationale", n = {"code"}, s = {"L$0"})
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
            return MainPermissionsRationale.this.showRationale(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ FragmentActivity a;

        public c(FragmentActivity fragmentActivity) {
            this.a = fragmentActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.startActivity(new Intent(this.a, (Class<?>) PermissionManagerActivity.class));
        }
    }

    public MainPermissionsRationale(@NotNull String str, boolean z, int i) {
        this.message = str;
        this.onlyOnce = z;
        this.messageGravity = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(FragmentActivity fragmentActivity, String str, int i, Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        new AlertDialogFragment.Builder(fragmentActivity).setMessage(str).setMessageGravity(i).setPositiveButton(fragmentActivity.getString(R.string.easypermission_permission_dialog_know), new b(safeContinuation)).setNegativeButton(fragmentActivity.getString(R.string.easypermission_permission_detail), new c(fragmentActivity)).maxHeightConstraint().autoDismiss(false).show(fragmentActivity.getSupportFragmentManager()).setGravity(17);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.huami.utils.permissionx.business.PermissionsRationaleWithCode
    @Nullable
    public Object shouldShowRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.onlyOnce ? PermissionKvData.INSTANCE.shouldShowRationaleOnlyOnce(str) : PermissionKvData.INSTANCE.shouldShowRationaleOnceADay(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.utils.permissionx.business.PermissionsRationaleWithCode
    @Nullable
    public Object showRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            if (!(activity instanceof FragmentActivity)) {
                throw new IllegalStateException("在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n请在 FragmentActivity 中调用请求权限的方法，否则无法弹框。");
            }
            String str2 = this.message;
            int i3 = this.messageGravity;
            aVar.a = str;
            aVar.d = 1;
            objA = a((FragmentActivity) activity, str2, i3, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar.a;
            ResultKt.throwOnFailure(objA);
        }
        ((Boolean) objA).booleanValue();
        PermissionKvData.INSTANCE.saveShowTime(str, System.currentTimeMillis());
        return objA;
    }

    public /* synthetic */ MainPermissionsRationale(String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 17 : i);
    }
}
