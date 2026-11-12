package com.huami.account.ui.forget;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.ui.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H&J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/account/ui/forget/HMPhoneFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlinx/coroutines/CoroutineScope;", "", "getTitleRes", "", "checkNetWork", "Landroid/widget/EditText;", "editText", "", "requestPopSoftKeyboard", "hideSoftKeyBoard", "onDestroy", "Lkotlinx/coroutines/CompletableJob;", "a", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "job", "Landroid/view/View;", "b", "Landroid/view/View;", "getRequestView", "()Landroid/view/View;", "setRequestView", "(Landroid/view/View;)V", "requestView", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class HMPhoneFragment extends Fragment implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CompletableJob job = JobKt__JobKt.d(null, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View requestView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.forget.HMPhoneFragment$requestPopSoftKeyboard$1", f = "HMPhoneFragment.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EditText c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EditText editText, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = editText;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMPhoneFragment.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMPhoneFragment.this.setRequestView(this.c);
                this.a = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.c.requestFocus();
            FragmentActivity activity = HMPhoneFragment.this.getActivity();
            InputMethodManager inputMethodManager = (InputMethodManager) (activity == null ? null : activity.getSystemService("input_method"));
            if (inputMethodManager != null) {
                Boxing.boxBoolean(inputMethodManager.showSoftInput(this.c, 2));
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean checkNetWork() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        if (NetUtil.isNetworkConnected(context)) {
            return true;
        }
        IconToast.showError(context, R.string.account_ui_no_network_connection);
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.job.plus(Dispatchers.getMain());
    }

    @NotNull
    public final CompletableJob getJob() {
        return this.job;
    }

    @Nullable
    public final View getRequestView() {
        return this.requestView;
    }

    public abstract int getTitleRes();

    public void hideSoftKeyBoard() {
        FragmentActivity activity = getActivity();
        InputMethodManager inputMethodManager = (InputMethodManager) (activity == null ? null : activity.getSystemService("input_method"));
        if (inputMethodManager == null) {
            return;
        }
        View view = this.requestView;
        inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Job.DefaultImpls.cancel$default((Job) this.job, (CancellationException) null, 1, (Object) null);
    }

    public final void requestPopSoftKeyboard(@NotNull EditText editText) {
        e.f(this, null, null, new a(editText, null), 3, null);
    }

    public final void setRequestView(@Nullable View view) {
        this.requestView = view;
    }
}
