package com.huami.pay.cashier;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.model.ShareStoryContent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.GlobalFunctionKt;
import com.huami.module.ktx.NumberExtKt;
import com.huami.module.ktx.ViewExtKt;
import com.huami.module.utils.VectorDrawablePathColorHelper;
import com.huami.pay.cashier.PayCashierFragment;
import com.huami.pay.service.PayChannel;
import com.huami.pay.service.PayProgress;
import com.huami.pay.service.PayResult;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0003D\"EB\u0007¢\u0006\u0004\bB\u0010CJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0003J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0003J\b\u0010\u0014\u001a\u00020\nH\u0002J$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fR\u0016\u0010$\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006F"}, d2 = {"Lcom/huami/pay/cashier/PayCashierFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "", "progressTint", "", "f", "buttonTint", "buttonTextColor", z.j, "l", "", "show", "", "progressText", com.google.android.exoplayer2.text.ttml.b.r, "success", "resultText", "o", "", GoogleApiAvailabilityLight.b, "m", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onResume", "onStop", "Lcom/huami/pay/service/PayProgress;", "payProgress", "updatePayProgressView", "a", "Landroid/view/View;", "payView", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "payChannelRv", "Landroidx/appcompat/widget/AppCompatButton;", "c", "Landroidx/appcompat/widget/AppCompatButton;", "payButton", "Landroidx/appcompat/widget/AppCompatTextView;", GoogleApiAvailabilityLight.a, "Landroidx/appcompat/widget/AppCompatTextView;", "payTitleTv", "e", "payStateTv", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "payStateIcon", "Lcom/airbnb/lottie/LottieAnimationView;", "g", "Lcom/airbnb/lottie/LottieAnimationView;", "payStateAnim", "Lcom/huami/pay/cashier/PayChannelAdapter;", "h", "Lcom/huami/pay/cashier/PayChannelAdapter;", "payChannelAdapter", "Lcom/huami/pay/cashier/PayCashierFragment$Param;", "i", "Lcom/huami/pay/cashier/PayCashierFragment$Param;", "param", "<init>", "()V", ShareStoryContent.Builder.k, "Param", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
public final class PayCashierFragment extends AppCompatDialogFragment {

    @Deprecated
    public static final int BACKGROUND_INDEX = 0;

    @Deprecated
    public static final int BUTTON_TEXT_COLOR_INDEX = 3;

    @Deprecated
    public static final int BUTTON_TINT_INDEX = 2;

    @Deprecated
    public static final long DELAY_TIME = 1000;

    @Deprecated
    public static final int PROGRESS_TINT_INDEX = 4;

    @Deprecated
    public static final float RADIUS = 6.0f;

    @Deprecated
    public static final int TITLE_COLOR_INDEX = 1;

    @NotNull
    private static final a j = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private View payView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RecyclerView payChannelRv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private AppCompatButton payButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AppCompatTextView payTitleTv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private AppCompatTextView payStateTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private AppCompatImageView payStateIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private LottieAnimationView payStateAnim;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final PayChannelAdapter payChannelAdapter = new PayChannelAdapter();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Param param;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001a\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tJ\u0019\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/pay/cashier/PayCashierFragment$Builder;", "", "", FirebaseAnalytics.Param.PRICE, "setPrice", "", "Lcom/huami/pay/service/PayChannel;", "channels", "setSupportChannel", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPayClickButton", "", "theme", "Lcom/huami/pay/cashier/PayCashierFragment;", "create", "(Ljava/lang/Integer;)Lcom/huami/pay/cashier/PayCashierFragment;", "Lcom/huami/pay/cashier/PayCashierFragment$Param;", "a", "Lcom/huami/pay/cashier/PayCashierFragment$Param;", "param", "<init>", "()V", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Param param = new Param(null, null, null, 7, null);

        @NotNull
        public final PayCashierFragment create(@StyleRes @Nullable Integer theme) {
            PayCashierFragment payCashierFragment = new PayCashierFragment();
            payCashierFragment.param = this.param;
            payCashierFragment.setStyle(1, theme == null ? R.style.PayCashierDialogTheme : theme.intValue());
            return payCashierFragment;
        }

        @NotNull
        public final Builder setPayClickButton(@NotNull Function1<? super PayChannel, Unit> listener) {
            this.param.setPayClickListener(listener);
            return this;
        }

        @NotNull
        public final Builder setPrice(@NotNull String price) {
            this.param.setPrice(price);
            return this;
        }

        @NotNull
        public final Builder setSupportChannel(@NotNull List<? extends PayChannel> channels) {
            this.param.setSupportChannel(channels);
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"com/huami/pay/cashier/PayCashierFragment$a", "", "", "BACKGROUND_INDEX", LogUtil.I, "BUTTON_TEXT_COLOR_INDEX", "BUTTON_TINT_INDEX", "", "DELAY_TIME", "J", "PROGRESS_TINT_INDEX", "", "RADIUS", "F", "TITLE_COLOR_INDEX", "<init>", "()V", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.cashier.PayCashierFragment$showPayEndView$2", f = "PayCashierFragment.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_TAP_DANCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PayCashierFragment.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PayCashierFragment.this.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
    }

    @SuppressLint({"RestrictedApi"})
    private final void f(@ColorInt final int progressTint) {
        View view = this.payView;
        if (view == null) {
            view = null;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.pay_cashier_state_tv);
        appCompatTextView.setTextColor(progressTint);
        Unit unit = Unit.INSTANCE;
        this.payStateTv = appCompatTextView;
        View view2 = this.payView;
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) (view2 != null ? view2 : null).findViewById(R.id.pay_cashier_state_lv);
        lottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: ps5
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                PayCashierFragment.g(lottieAnimationView, progressTint, lottieComposition);
            }
        });
        this.payStateAnim = lottieAnimationView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(LottieAnimationView lottieAnimationView, final int i, LottieComposition lottieComposition) {
        for (KeyPath keyPath : lottieAnimationView.resolveKeyPath(new KeyPath("**"))) {
            if (keyPath.matches("描边 1", 1) || keyPath.matches("描边 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<Integer>) new SimpleLottieValueCallback() { // from class: rs5
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return PayCashierFragment.h(i, lottieFrameInfo);
                    }
                });
            } else if (keyPath.matches("填充 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.COLOR, (SimpleLottieValueCallback<Integer>) new SimpleLottieValueCallback() { // from class: qs5
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return PayCashierFragment.i(i, lottieFrameInfo);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer h(int i, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer i(int i, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(i);
    }

    private final void j(@ColorInt int buttonTint, int buttonTextColor) {
        View view = this.payView;
        if (view == null) {
            view = null;
        }
        AppCompatButton appCompatButton = (AppCompatButton) view.findViewById(R.id.pay_cashier_pay_bt);
        ViewExtKt.setShape(appCompatButton, 6.0f, Integer.valueOf(buttonTint));
        appCompatButton.setTextColor(buttonTextColor);
        int i = R.string.pay_cashier_pay_connect;
        Object[] objArr = new Object[2];
        Param param = this.param;
        objArr[0] = (param != null ? param : null).getPrice();
        objArr[1] = getString(R.string.pay_cashier_pay_at_once);
        appCompatButton.setText(getString(i, objArr));
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: os5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PayCashierFragment.k(this.a, view2);
            }
        });
        Unit unit = Unit.INSTANCE;
        this.payButton = appCompatButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PayCashierFragment payCashierFragment, View view) {
        Object next;
        Dialog dialog = payCashierFragment.getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = payCashierFragment.getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        Iterator<T> it2 = payCashierFragment.payChannelAdapter.getCurrentList().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((PayItem) next).getSelect());
        PayItem payItem = (PayItem) next;
        if (payItem == null) {
            return;
        }
        Param param = payCashierFragment.param;
        Function1<PayChannel, Unit> payClickListener = (param != null ? param : null).getPayClickListener();
        if (payClickListener == null) {
            return;
        }
        payClickListener.invoke(payItem.getPayChannel());
    }

    private final void l() {
        View view = this.payView;
        if (view == null) {
            view = null;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.pay_cashier_rv);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huami.pay.cashier.PayCashierFragment$initRv$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view2, parent, state);
                outRect.set(NumberExtKt.getDp(15), NumberExtKt.getDp(6), NumberExtKt.getDp(15), NumberExtKt.getDp(6));
            }
        });
        recyclerView.setAdapter(this.payChannelAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setDescendantFocusability(393216);
        Unit unit = Unit.INSTANCE;
        this.payChannelRv = recyclerView;
        PayChannelAdapter payChannelAdapter = this.payChannelAdapter;
        Param param = this.param;
        List<PayChannel> supportChannel = (param != null ? param : null).getSupportChannel();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supportChannel, 10));
        int i = 0;
        for (Object obj : supportChannel) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new PayItem((PayChannel) obj, i == 0));
            i = i2;
        }
        payChannelAdapter.submitList(arrayList);
    }

    private final boolean m() {
        Context context;
        Dialog dialog = getDialog();
        if (dialog == null || (context = dialog.getContext()) == null) {
            return false;
        }
        return context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside}).getBoolean(0, false);
    }

    @SuppressLint({"ResourceType"})
    private final int[] n() {
        Context context;
        Dialog dialog = getDialog();
        int[] iArr = null;
        if (dialog != null && (context = dialog.getContext()) != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.payCashierBackground, R.attr.payCashierTitleTextColor, R.attr.payCashierButtonColor, R.attr.payCashierButtonTextColor, R.attr.payCashierLoadingColor});
            int color = typedArrayObtainStyledAttributes.getColor(0, ContextExtKt.loadColor(context, R.color.s39));
            int i = R.color.s1;
            iArr = new int[]{color, typedArrayObtainStyledAttributes.getColor(1, ContextExtKt.loadColor(context, i)), typedArrayObtainStyledAttributes.getColor(2, ContextExtKt.loadColor(context, R.color.s12)), typedArrayObtainStyledAttributes.getColor(3, ContextExtKt.loadColor(context, R.color.s5)), typedArrayObtainStyledAttributes.getColor(4, ContextExtKt.loadColor(context, i))};
        }
        if (iArr != null) {
            return iArr;
        }
        Context contextRequireContext = requireContext();
        int i2 = R.color.s1;
        return new int[]{ContextExtKt.loadColor(contextRequireContext, R.color.s39), ContextExtKt.loadColor(contextRequireContext, i2), ContextExtKt.loadColor(contextRequireContext, R.color.s12), ContextExtKt.loadColor(contextRequireContext, R.color.s5), ContextExtKt.loadColor(contextRequireContext, i2)};
    }

    private final void o(boolean success, String resultText) {
        AppCompatTextView appCompatTextView = this.payTitleTv;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        ViewExtKt.setVisible(appCompatTextView, false);
        RecyclerView recyclerView = this.payChannelRv;
        if (recyclerView == null) {
            recyclerView = null;
        }
        ViewExtKt.setVisible(recyclerView, false);
        AppCompatButton appCompatButton = this.payButton;
        if (appCompatButton == null) {
            appCompatButton = null;
        }
        ViewExtKt.setVisible(appCompatButton, false);
        AppCompatTextView appCompatTextView2 = this.payStateTv;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        ViewExtKt.setVisible(appCompatTextView2, true);
        AppCompatImageView appCompatImageView = this.payStateIcon;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        ViewExtKt.setVisible(appCompatImageView, true);
        LottieAnimationView lottieAnimationView = this.payStateAnim;
        if (lottieAnimationView == null) {
            lottieAnimationView = null;
        }
        ViewExtKt.setVisible(lottieAnimationView, false);
        AppCompatTextView appCompatTextView3 = this.payStateTv;
        if (appCompatTextView3 == null) {
            appCompatTextView3 = null;
        }
        appCompatTextView3.setText(resultText);
        LottieAnimationView lottieAnimationView2 = this.payStateAnim;
        if (lottieAnimationView2 == null) {
            lottieAnimationView2 = null;
        }
        lottieAnimationView2.cancelAnimation();
        AppCompatImageView appCompatImageView2 = this.payStateIcon;
        if (appCompatImageView2 == null) {
            appCompatImageView2 = null;
        }
        appCompatImageView2.setImageDrawable(success ? new VectorDrawablePathColorHelper(appCompatImageView2.getContext(), R.drawable.ic_done_44).setPartPathColor("done", ViewExtKt.loadColor(appCompatImageView2, R.color.s5), true).setPartPathColor("done_bg", ViewExtKt.loadColor(appCompatImageView2, R.color.s20), true).create() : new VectorDrawablePathColorHelper(appCompatImageView2.getContext(), R.drawable.ic_alert_44).setPartPathColor("alert", ViewExtKt.loadColor(appCompatImageView2, R.color.s5), true).setPartPathColor("alert_bg", ViewExtKt.loadColor(appCompatImageView2, R.color.p3), true).create());
        e.f(LifecycleOwnerKt.getLifecycleScope(requireActivity()), null, null, new b(null), 3, null);
    }

    private final void p(boolean show, String progressText) {
        AppCompatTextView appCompatTextView = this.payTitleTv;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        ViewExtKt.setVisible(appCompatTextView, !show);
        RecyclerView recyclerView = this.payChannelRv;
        if (recyclerView == null) {
            recyclerView = null;
        }
        ViewExtKt.setVisible(recyclerView, !show);
        AppCompatButton appCompatButton = this.payButton;
        if (appCompatButton == null) {
            appCompatButton = null;
        }
        ViewExtKt.setVisible(appCompatButton, !show);
        AppCompatTextView appCompatTextView2 = this.payStateTv;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = null;
        }
        ViewExtKt.setVisible(appCompatTextView2, show);
        AppCompatImageView appCompatImageView = this.payStateIcon;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        ViewExtKt.setVisible(appCompatImageView, false);
        LottieAnimationView lottieAnimationView = this.payStateAnim;
        if (lottieAnimationView == null) {
            lottieAnimationView = null;
        }
        ViewExtKt.setVisible(lottieAnimationView, show);
        if (show) {
            AppCompatTextView appCompatTextView3 = this.payStateTv;
            if (appCompatTextView3 == null) {
                appCompatTextView3 = null;
            }
            appCompatTextView3.setText(progressText);
            LottieAnimationView lottieAnimationView2 = this.payStateAnim;
            if (lottieAnimationView2 == null) {
                lottieAnimationView2 = null;
            }
            if (lottieAnimationView2.isAnimating()) {
                return;
            }
            LottieAnimationView lottieAnimationView3 = this.payStateAnim;
            (lottieAnimationView3 != null ? lottieAnimationView3 : null).playAnimation();
        }
    }

    public static /* synthetic */ void q(PayCashierFragment payCashierFragment, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        payCashierFragment.p(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(PayProgress payProgress, PayCashierFragment payCashierFragment) {
        if (payProgress instanceof PayProgress.Prepare) {
            payCashierFragment.p(true, payCashierFragment.getString(R.string.pay_cashier_prepare));
            return;
        }
        if (Intrinsics.areEqual(payProgress, PayProgress.GenerateOrder.INSTANCE)) {
            payCashierFragment.p(true, payCashierFragment.getString(R.string.pay_cashier_generate_order));
            return;
        }
        if (Intrinsics.areEqual(payProgress, PayProgress.Paying.INSTANCE)) {
            payCashierFragment.p(true, payCashierFragment.getString(R.string.pay_cashier_paying));
            return;
        }
        if (Intrinsics.areEqual(payProgress, PayProgress.Notification.INSTANCE)) {
            payCashierFragment.p(true, payCashierFragment.getString(R.string.pay_cashier_notification));
            return;
        }
        if (Intrinsics.areEqual(payProgress, PayProgress.QueryOrderState.INSTANCE)) {
            payCashierFragment.p(true, payCashierFragment.getString(R.string.pay_cashier_order_state));
        } else if (payProgress instanceof PayProgress.PayEnd) {
            boolean z = ((PayProgress.PayEnd) payProgress).getPayResult() == PayResult.CODE_SUCCESS;
            payCashierFragment.o(z, payCashierFragment.getString(z ? R.string.pay_cashier_pay_success : R.string.pay_cashier_pay_fail));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.requestFeature(1);
            window.setGravity(80);
        }
        int[] iArrN = n();
        int i = iArrN[0];
        int i2 = iArrN[1];
        int i3 = iArrN[2];
        int i4 = iArrN[3];
        int i5 = iArrN[4];
        View viewInflate = inflater.inflate(R.layout.pay_cashier_fragment, container);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(GlobalFunctionKt.screenWidth(), -2));
        ViewExtKt.setShape(viewInflate, 6.0f, Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        this.payView = viewInflate;
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R.id.pay_cashier_title);
        appCompatTextView.setTextColor(i2);
        this.payTitleTv = appCompatTextView;
        View view = this.payView;
        if (view == null) {
            view = null;
        }
        this.payStateIcon = (AppCompatImageView) view.findViewById(R.id.pay_cashier_state_icon);
        f(i5);
        j(i3, i4);
        l();
        q(this, false, null, 2, null);
        View view2 = this.payView;
        if (view2 == null) {
            return null;
        }
        return view2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.setCanceledOnTouchOutside(m());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        dismissAllowingStateLoss();
    }

    public final void updatePayProgressView(@NotNull final PayProgress payProgress) {
        requireActivity().runOnUiThread(new Runnable() { // from class: ss5
            @Override // java.lang.Runnable
            public final void run() {
                PayCashierFragment.r(payProgress, this);
            }
        });
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/pay/cashier/PayCashierFragment$Param;", "", "", "component1", "", "Lcom/huami/pay/service/PayChannel;", "component2", "Lkotlin/Function1;", "", "component3", FirebaseAnalytics.Param.PRICE, "supportChannel", "payClickListener", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "setPrice", "(Ljava/lang/String;)V", "b", "Ljava/util/List;", "getSupportChannel", "()Ljava/util/List;", "setSupportChannel", "(Ljava/util/List;)V", "c", "Lkotlin/jvm/functions/Function1;", "getPayClickListener", "()Lkotlin/jvm/functions/Function1;", "setPayClickListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Param {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private String price;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private List<? extends PayChannel> supportChannel;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private Function1<? super PayChannel, Unit> payClickListener;

        public Param() {
            this(null, null, null, 7, null);
        }

        public Param(@NotNull String str, @NotNull List<? extends PayChannel> list, @Nullable Function1<? super PayChannel, Unit> function1) {
            this.price = str;
            this.supportChannel = list;
            this.payClickListener = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Param copy$default(Param param, String str, List list, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.price;
            }
            if ((i & 2) != 0) {
                list = param.supportChannel;
            }
            if ((i & 4) != 0) {
                function1 = param.payClickListener;
            }
            return param.copy(str, list, function1);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @NotNull
        public final List<PayChannel> component2() {
            return this.supportChannel;
        }

        @Nullable
        public final Function1<PayChannel, Unit> component3() {
            return this.payClickListener;
        }

        @NotNull
        public final Param copy(@NotNull String price, @NotNull List<? extends PayChannel> supportChannel, @Nullable Function1<? super PayChannel, Unit> payClickListener) {
            return new Param(price, supportChannel, payClickListener);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Param)) {
                return false;
            }
            Param param = (Param) other;
            return Intrinsics.areEqual(this.price, param.price) && Intrinsics.areEqual(this.supportChannel, param.supportChannel) && Intrinsics.areEqual(this.payClickListener, param.payClickListener);
        }

        @Nullable
        public final Function1<PayChannel, Unit> getPayClickListener() {
            return this.payClickListener;
        }

        @NotNull
        public final String getPrice() {
            return this.price;
        }

        @NotNull
        public final List<PayChannel> getSupportChannel() {
            return this.supportChannel;
        }

        public int hashCode() {
            int iHashCode = ((this.price.hashCode() * 31) + this.supportChannel.hashCode()) * 31;
            Function1<? super PayChannel, Unit> function1 = this.payClickListener;
            return iHashCode + (function1 == null ? 0 : function1.hashCode());
        }

        public final void setPayClickListener(@Nullable Function1<? super PayChannel, Unit> function1) {
            this.payClickListener = function1;
        }

        public final void setPrice(@NotNull String str) {
            this.price = str;
        }

        public final void setSupportChannel(@NotNull List<? extends PayChannel> list) {
            this.supportChannel = list;
        }

        @NotNull
        public String toString() {
            return "Param(price=" + this.price + ", supportChannel=" + this.supportChannel + ", payClickListener=" + this.payClickListener + ")";
        }

        public /* synthetic */ Param(String str, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : function1);
        }
    }
}
