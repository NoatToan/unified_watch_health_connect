package com.xiaomi.fitness.baseui.dialog;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.passport.ui.settings.SimpleDialogFragment;
import defpackage.nfe;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B3\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/baseui/dialog/DialogCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lnfe;", "", "dismiss", "()V", "launch", "()Lcom/xiaomi/fitness/baseui/dialog/DialogCoroutineScope;", Constants.EXTRA_CLOSE_TAI, "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", SimpleDialogFragment.ARG_CANCELABLE, "Z", "getCancelable", "()Z", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;ZLkotlinx/coroutines/CoroutineDispatcher;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class DialogCoroutineScope implements CoroutineScope, Closeable, nfe {

    @NotNull
    private final FragmentActivity activity;
    private final boolean cancelable;

    @Nullable
    private CommonDialog<?> dialog;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: com.xiaomi.fitness.baseui.dialog.DialogCoroutineScope$launch$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.baseui.dialog.DialogCoroutineScope$launch$1", f = "DialogCoroutineScope.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DialogCoroutineScope.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CommonDialog<?> dialog = DialogCoroutineScope.this.getDialog();
            if (dialog != null) {
                dialog.showIfNeed(DialogCoroutineScope.this.getActivity().getSupportFragmentManager());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DialogCoroutineScope(@NotNull FragmentActivity activity, @Nullable CommonDialog<?> commonDialog, boolean z, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.activity = activity;
        this.dialog = commonDialog;
        this.cancelable = z;
        this.dispatcher = dispatcher;
        activity.getLifecycle().addObserver(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dismiss();
    }

    @c(Lifecycle.Event.ON_DESTROY)
    public final void dismiss() {
        CommonDialog<?> commonDialog;
        CommonDialog<?> commonDialog2 = this.dialog;
        if (commonDialog2 != null) {
            Intrinsics.checkNotNull(commonDialog2);
            if (commonDialog2.isShowing() && (commonDialog = this.dialog) != null) {
                commonDialog.dismissAllowingStateLoss();
            }
        }
        this.dialog = null;
        this.activity.getLifecycle().removeObserver(this);
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    }

    @Nullable
    public final CommonDialog<?> getDialog() {
        return this.dialog;
    }

    @NotNull
    public final DialogCoroutineScope launch() {
        BuildersKt__Builders_commonKt.launch$default(this, EmptyCoroutineContext.INSTANCE, null, new AnonymousClass1(null), 2, null);
        return this;
    }

    public final void setDialog(@Nullable CommonDialog<?> commonDialog) {
        this.dialog = commonDialog;
    }

    public /* synthetic */ DialogCoroutineScope(FragmentActivity fragmentActivity, CommonDialog commonDialog, boolean z, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i & 2) != 0 ? null : commonDialog, (i & 4) != 0 ? true : z, (i & 8) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }
}
