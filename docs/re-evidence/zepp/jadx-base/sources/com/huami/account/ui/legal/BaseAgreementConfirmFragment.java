package com.huami.account.ui.legal;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.account.ui.R;
import com.huami.account.ui.legal.BaseAgreementConfirmFragment;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.discovery.bridge.WebFragment;
import com.huami.discovery.bridge.WebLoadCallback;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.util.net.NetUtil;
import com.huami.web.container.WebActivity;
import com.loc.z;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u0000 62\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0011\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\u00020 8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0016\u00103\u001a\u00020,8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.¨\u00068"}, d2 = {"Lcom/huami/account/ui/legal/BaseAgreementConfirmFragment;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", "e", "", "delaySeconds", "Landroid/widget/TextView;", "countdown", "Landroid/view/View;", "rootView", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/account/ui/legal/BaseAgreementConfirmFragment$OnDialogListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "initView", "onResume", "", "hasPadding", "hasBackground", "Lcom/huami/account/ui/legal/BaseAgreementConfirmFragment$OnDialogListener;", "dialogListener", "Lkotlinx/coroutines/Job;", "f", "Lkotlinx/coroutines/Job;", "countdownJob", "g", LogUtil.I, "getDelaySeconds", "()I", "", "J", "getDelayDuration", "()J", "delayDuration", "i", "Z", "isErrorOccurred", "Lcom/huami/discovery/bridge/WebFragment;", z.j, "Lcom/huami/discovery/bridge/WebFragment;", "webFragment", "", "getAgreementUrl", "()Ljava/lang/String;", "agreementUrl", "getAgreeText", "agreeText", "getDisagreeText", "disagreeText", "<init>", "()V", "Companion", "OnDialogListener", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseAgreementConfirmFragment extends BaseDialogFragment {
    public static final long DEFAULT_DELAY_DURATION = 1000;
    public static final int DEFAULT_DELAY_SECONDS = 3;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private OnDialogListener dialogListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Job countdownJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int delaySeconds = 3;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long delayDuration = 1000;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isErrorOccurred;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private WebFragment webFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/account/ui/legal/BaseAgreementConfirmFragment$OnDialogListener;", "", "", "onAgree", "onCancel", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public interface OnDialogListener {
        void onAgree();

        void onCancel();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.legal.BaseAgreementConfirmFragment$showAgreeCountDown$1", f = "BaseAgreementConfirmFragment.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;
        public final /* synthetic */ BaseAgreementConfirmFragment e;
        public final /* synthetic */ TextView f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, TextView textView, BaseAgreementConfirmFragment baseAgreementConfirmFragment, TextView textView2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = textView;
            this.e = baseAgreementConfirmFragment;
            this.f = textView2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            if (r11 >= r1.c) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0050 -> B:15:0x0051). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar;
            int i;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = this;
                if (this.c > 0) {
                    i = 0;
                    int i3 = i + 1;
                    aVar.d.setText(aVar.e.getString(R.string.account_ui_read_agreement_tip_countdown, String.valueOf(aVar.c - i)));
                    long delayDuration = aVar.e.getDelayDuration();
                    aVar.a = i3;
                    aVar.b = 1;
                    if (DelayKt.delay(delayDuration, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = i3;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = this.a;
                ResultKt.throwOnFailure(obj);
                i = i4;
                aVar = this;
            }
            aVar.d.setText(aVar.e.getString(R.string.account_ui_read_agreement_tip));
            aVar.f.setEnabled(true);
            aVar.e.countdownJob = null;
            return Unit.INSTANCE;
        }
    }

    private final void e() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || !(activity instanceof WebActivity)) {
            return;
        }
        ((WebActivity) activity).getWebFragment().reload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BaseAgreementConfirmFragment baseAgreementConfirmFragment, View view) {
        baseAgreementConfirmFragment.dismiss();
        OnDialogListener onDialogListener = baseAgreementConfirmFragment.dialogListener;
        if (onDialogListener == null) {
            return;
        }
        onDialogListener.onCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BaseAgreementConfirmFragment baseAgreementConfirmFragment, View view) {
        baseAgreementConfirmFragment.dismiss();
        OnDialogListener onDialogListener = baseAgreementConfirmFragment.dialogListener;
        if (onDialogListener != null) {
            onDialogListener.onAgree();
        }
        baseAgreementConfirmFragment.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int delaySeconds, TextView countdown, View rootView) {
        TextView textView = (TextView) rootView.findViewById(R.id.useragreement_btn_agree);
        Job job = this.countdownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        textView.setEnabled(false);
        this.countdownJob = LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new a(delaySeconds, countdown, this, textView, null));
    }

    @NotNull
    public String getAgreeText() {
        return getString(R.string.account_ui_startup_agree_continue);
    }

    @NotNull
    public abstract String getAgreementUrl();

    public long getDelayDuration() {
        return this.delayDuration;
    }

    public int getDelaySeconds() {
        return this.delaySeconds;
    }

    @NotNull
    public String getDisagreeText() {
        return getString(R.string.exit);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        final View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.account_ui_startup_agreement_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.useragreement_btn_cancel);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.useragreement_btn_agree);
        final TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_countdown);
        textView2.setText(getAgreeText());
        textView.setText(getDisagreeText());
        WebFragment webFragmentNewInstance = WebFragment.newInstance(new WebItem(getAgreementUrl()));
        this.webFragment = webFragmentNewInstance;
        getChildFragmentManager().beginTransaction().replace(R.id.web_container, webFragmentNewInstance).commit();
        webFragmentNewInstance.setLoadingCallback(new WebLoadCallback() { // from class: com.huami.account.ui.legal.BaseAgreementConfirmFragment.initView.1
            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onError(int errorCode) {
                BaseAgreementConfirmFragment.this.isErrorOccurred = true;
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onPageFinish() {
                if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect() || BaseAgreementConfirmFragment.this.isErrorOccurred) {
                    return;
                }
                BaseAgreementConfirmFragment baseAgreementConfirmFragment = BaseAgreementConfirmFragment.this;
                baseAgreementConfirmFragment.h(baseAgreementConfirmFragment.getDelaySeconds(), textView3, viewInflate);
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onPageStart() {
                BaseAgreementConfirmFragment.this.isErrorOccurred = false;
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onProgressChanged(int progress) {
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onReceivedTitle(@Nullable String title) {
            }

            @Override // com.huami.discovery.bridge.WebLoadCallback
            public void onSslError(@NotNull SslError error) {
                BaseAgreementConfirmFragment.this.isErrorOccurred = true;
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: qn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseAgreementConfirmFragment.f(this.a, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: pn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseAgreementConfirmFragment.g(this.a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        WebFragment webFragment = this.webFragment;
        if (this.isErrorOccurred) {
            boolean z = false;
            if (webFragment != null && webFragment.isAdded()) {
                z = true;
            }
            if (z) {
                webFragment.reload();
            }
        }
    }

    public final void setListener(@Nullable OnDialogListener listener) {
        this.dialogListener = listener;
    }
}
