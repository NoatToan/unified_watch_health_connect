package com.huami.account.ui.register;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountStatEvent;
import com.huami.account.HMLoginManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.bean.LoginResult;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.R;
import com.huami.account.ui.bind.PhoneBindPasswordActivity;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.ui.common.entity.AutoLoginForm;
import com.huami.account.ui.common.entity.PhoneBaseForm;
import com.huami.account.ui.common.entity.PhoneLoginResponse;
import com.huami.account.ui.common.entity.PhoneLoginResponseKt;
import com.huami.account.ui.common.viewmodel.PhoneRegisterViewModelFactory;
import com.huami.account.ui.register.PhoneRegisterFormFragment;
import com.huami.account.ui.register.viewmodel.PhoneRegisterViewModel;
import com.huami.account.usecase.RegisterFailedCustomTipUseCase;
import com.huami.account.utils.AccountConstants;
import com.huami.account.utils.UtilsKt;
import com.huami.http.serverfault.handler.AccountFaultHandler;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.SmsCode;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001aB\u0007¢\u0006\u0004\b_\u0010`J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0016J\u001a\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0016J\u000e\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001dJ\b\u0010&\u001a\u00020\u0003H\u0016J\u0016\u0010*\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'J\b\u0010+\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020,H\u0016R\u0019\u00103\u001a\u00020.8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u001d\u0010F\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010I\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010ER\u001d\u0010L\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010ER\u001d\u0010P\u001a\u00020M8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bN\u0010OR\u001d\u0010R\u001a\u00020M8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bQ\u0010OR\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030S8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010TR0\u0010Y\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010'0W\u0012\u0004\u0012\u00020\u00030V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010XR\"\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010XR\u0016\u0010^\u001a\u00020[8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006b"}, d2 = {"Lcom/huami/account/ui/register/PhoneRegisterFormFragment;", "Lcom/huami/account/ui/register/BaseRegisterFragment;", "Lkotlinx/coroutines/CoroutineScope;", "", "o", "E", LogUtil.D, "Landroidx/fragment/app/FragmentActivity;", "activity", DTransferConstants.SEARCH_KEY, "Lcom/huami/passport/entity/SmsCode;", PhoneBindPasswordActivity.EXTRA_SMS_CODE, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/passport/ErrorCode;", "errorCode", "z", "C", "Lkotlinx/coroutines/Job;", "i", "y", "Lcom/huami/passport/entity/LoginInfo;", "loginInfo", "B", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "state", "Landroid/view/View;", "onCreateView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "onViewCreated", "initViews", "updateBtnState", "", "result", "code", "analyticsPhoneRegisterResult", "onDetach", "", "isFormEmpty", "Lkotlinx/coroutines/CompletableJob;", "a", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "job", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "b", "Lcom/huami/account/ui/common/entity/PhoneBaseForm;", "sendCodeForm", "Lcom/huami/account/ui/register/viewmodel/PhoneRegisterViewModel;", "c", "Lcom/huami/account/ui/register/viewmodel/PhoneRegisterViewModel;", "phoneRegisterViewModel", GoogleApiAvailabilityLight.a, "Z", "isCountingDown", "e", "isVerifyCodeSent", "Landroid/widget/EditText;", "f", "Lkotlin/Lazy;", z.j, "()Landroid/widget/EditText;", "inputPasswordText", "g", hl.k, "inputPhoneNumber", "h", "l", "inputVerificationCode", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.b, "()Landroid/widget/TextView;", "sendVerifyBtn", "m", "registerNowBtn", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "onLoading", "Lkotlin/Function1;", "Lkotlin/Pair;", "Lkotlin/jvm/functions/Function1;", "onSuccess", "onError", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneRegisterFormFragment extends BaseRegisterFragment implements CoroutineScope {
    public static final int PASSWORD_MIN_LENGTH = 8;
    public static final int RESEND_DELAY_SECONDS = 60;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PhoneBaseForm sendCodeForm;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private PhoneRegisterViewModel phoneRegisterViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isCountingDown;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isVerifyCodeSent;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CompletableJob job = JobKt__JobKt.d(null, 1, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPasswordText = LazyKt__LazyJVMKt.lazy(new k());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputPhoneNumber = LazyKt__LazyJVMKt.lazy(new l());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputVerificationCode = LazyKt__LazyJVMKt.lazy(new m());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendVerifyBtn = LazyKt__LazyJVMKt.lazy(new s());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy registerNowBtn = LazyKt__LazyJVMKt.lazy(new r());

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onLoading = new o();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Function1<Pair<Boolean, String>, Unit> onSuccess = new q();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Function1<ErrorCode, Unit> onError = new n();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.ui.register.PhoneRegisterFormFragment$enableResendAfterDelay$1", f = "PhoneRegisterFormFragment.kt", i = {0}, l = {355}, m = "invokeSuspend", n = {"timeRemain"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PhoneRegisterFormFragment.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004a  */
        /* JADX WARN: Code duplicated, block: B:12:0x007d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007b -> B:13:0x007e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.e
                r2 = 60
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 != r4) goto L20
                int r1 = r9.d
                int r2 = r9.c
                java.lang.Object r5 = r9.b
                com.huami.account.ui.register.PhoneRegisterFormFragment r5 = (com.huami.account.ui.register.PhoneRegisterFormFragment) r5
                java.lang.Object r6 = r9.a
                kotlin.jvm.internal.Ref$IntRef r6 = (kotlin.jvm.internal.Ref.IntRef) r6
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r1
                r1 = r9
                goto L7e
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                kotlin.ResultKt.throwOnFailure(r10)
                com.huami.account.ui.register.PhoneRegisterFormFragment r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.this
                android.widget.TextView r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.access$getSendVerifyBtn(r10)
                r10.setEnabled(r3)
                com.huami.account.ui.register.PhoneRegisterFormFragment r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.this
                com.huami.account.ui.register.PhoneRegisterFormFragment.access$setCountingDown$p(r10, r4)
                kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
                r10.<init>()
                r10.element = r2
                com.huami.account.ui.register.PhoneRegisterFormFragment r1 = com.huami.account.ui.register.PhoneRegisterFormFragment.this
                r6 = r10
                r5 = r1
                r10 = 60
                r2 = 0
                r1 = r9
            L48:
                if (r2 >= r10) goto L86
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
                r7.intValue()
                int r7 = r6.element
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r7)
                java.lang.String r7 = "s"
                r8.append(r7)
                java.lang.String r7 = r8.toString()
                android.widget.TextView r8 = com.huami.account.ui.register.PhoneRegisterFormFragment.access$getSendVerifyBtn(r5)
                r8.setText(r7)
                r7 = 1000(0x3e8, double:4.94E-321)
                r1.a = r6
                r1.b = r5
                r1.c = r2
                r1.d = r10
                r1.e = r4
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r7, r1)
                if (r7 != r0) goto L7e
                return r0
            L7e:
                int r7 = r6.element
                int r7 = r7 + (-1)
                r6.element = r7
                int r2 = r2 + r4
                goto L48
            L86:
                com.huami.account.ui.register.PhoneRegisterFormFragment r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.this
                com.huami.account.ui.register.PhoneRegisterFormFragment.access$setCountingDown$p(r10, r3)
                com.huami.account.ui.register.PhoneRegisterFormFragment r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.this
                android.widget.TextView r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.access$getSendVerifyBtn(r10)
                com.huami.account.ui.register.PhoneRegisterFormFragment r0 = com.huami.account.ui.register.PhoneRegisterFormFragment.this
                android.content.res.Resources r0 = r0.getResources()
                int r2 = com.huami.account.ui.R.string.account_ui_register_phone_resend_code
                java.lang.String r0 = r0.getString(r2)
                r10.setText(r0)
                com.huami.account.ui.register.PhoneRegisterFormFragment r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.this
                android.widget.TextView r10 = com.huami.account.ui.register.PhoneRegisterFormFragment.access$getSendVerifyBtn(r10)
                r10.setEnabled(r4)
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.account.ui.register.PhoneRegisterFormFragment.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FragmentActivity fragmentActivity) {
            super(0);
            this.a = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialogContainerKt.showLoadingDialog(((RegisterActivity) this.a).getDialog$accountui_release(), R.string.account_ui_register_phone_registering);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/LoginInfo;", "loginInfo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<LoginInfo, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull LoginInfo loginInfo) {
            PhoneRegisterFormFragment.this.B(loginInfo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LoginInfo loginInfo) {
            a(loginInfo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "errorCode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<ErrorCode, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull ErrorCode errorCode) {
            PhoneRegisterFormFragment.this.z(errorCode);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FragmentActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FragmentActivity fragmentActivity) {
            super(0);
            this.a = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialogContainerKt.showLoadingDialog(((RegisterActivity) this.a).getDialog$accountui_release(), R.string.account_ui_phone_code_in_verify);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/SmsCode;", PhoneBindPasswordActivity.EXTRA_SMS_CODE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<SmsCode, Unit> {
        public f() {
            super(1);
        }

        public final void a(@NotNull SmsCode smsCode) {
            PhoneRegisterFormFragment.this.A(smsCode);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SmsCode smsCode) {
            a(smsCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<ErrorCode, Unit> {
        public final /* synthetic */ FragmentActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(FragmentActivity fragmentActivity) {
            super(1);
            this.b = fragmentActivity;
        }

        public final void a(@NotNull ErrorCode errorCode) {
            PhoneRegisterFormFragment.this.l().setText("");
            LoadingDialogContainerKt.setFailed$default(((RegisterActivity) this.b).getDialog$accountui_release(), R.string.account_ui_phone_code_verify_failed, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Unit> {
        public final /* synthetic */ RegisterActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RegisterActivity registerActivity) {
            super(0);
            this.a = registerActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LoadingDialogContainerKt.showLoadingDialog(this.a.getDialog$accountui_release(), R.string.account_ui_logining);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/entity/LoginToken;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<LoginToken, Unit> {
        public final /* synthetic */ RegisterActivity a;
        public final /* synthetic */ FragmentActivity b;
        public final /* synthetic */ PhoneRegisterFormFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RegisterActivity registerActivity, FragmentActivity fragmentActivity, PhoneRegisterFormFragment phoneRegisterFormFragment) {
            super(1);
            this.a = registerActivity;
            this.b = fragmentActivity;
            this.c = phoneRegisterFormFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(LoginToken loginToken, FragmentActivity fragmentActivity, PhoneRegisterFormFragment phoneRegisterFormFragment, LoginResult loginResult) {
            if (loginResult.isSuccess()) {
                HMLoginManager.verifyLoginSuccessHref(loginToken);
                ((RegisterActivity) fragmentActivity).onLoginSuccess();
            } else {
                phoneRegisterFormFragment.y();
            }
            phoneRegisterFormFragment.analyticsPhoneRegisterResult("Success", "200");
        }

        public final void b(@NotNull final LoginToken loginToken) {
            this.a.saveUxPreference();
            final FragmentActivity fragmentActivity = this.b;
            final PhoneRegisterFormFragment phoneRegisterFormFragment = this.c;
            HMProcessLoginDataManager.processRegisterLoginSuccess(new HMProcessLoginDataManager.LoginCallBack() { // from class: com.huami.account.ui.register.a
                @Override // com.huami.account.HMProcessLoginDataManager.LoginCallBack
                public final void onResult(LoginResult loginResult) {
                    PhoneRegisterFormFragment.i.c(loginToken, fragmentActivity, phoneRegisterFormFragment, loginResult);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LoginToken loginToken) {
            b(loginToken);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "errorCode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<ErrorCode, Unit> {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ PhoneRegisterFormFragment b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ PhoneRegisterFormFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PhoneRegisterFormFragment phoneRegisterFormFragment) {
                super(0);
                this.a = phoneRegisterFormFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.C();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(FragmentActivity fragmentActivity, PhoneRegisterFormFragment phoneRegisterFormFragment) {
            super(1);
            this.a = fragmentActivity;
            this.b = phoneRegisterFormFragment;
        }

        public final void a(@NotNull ErrorCode errorCode) {
            if (Intrinsics.areEqual(errorCode.getErrorCode(), "0129")) {
                ((RegisterActivity) this.a).getDialog$accountui_release().hideDialog();
                RegisterFailedCustomTipUseCase.execute(this.b.getChildFragmentManager(), errorCode, new a(this.b));
            } else {
                this.b.y();
            }
            this.b.analyticsPhoneRegisterResult("Fail", String.valueOf(errorCode.getCode()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<EditText> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(PhoneRegisterFormFragment.this, R.id.input_password_text);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<EditText> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(PhoneRegisterFormFragment.this, R.id.input_phone_number);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<EditText> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText getA() {
            return (EditText) UtilsKt.findViewById(PhoneRegisterFormFragment.this, R.id.input_verification_code);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/passport/ErrorCode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<ErrorCode, Unit> {
        public n() {
            super(1);
        }

        public final void a(@NotNull ErrorCode errorCode) {
            String errorCode2 = errorCode.getErrorCode();
            if (Intrinsics.areEqual(errorCode2, "404")) {
                FragmentActivity activity = PhoneRegisterFormFragment.this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
                LoadingDialogContainerKt.setFailed$default(((RegisterActivity) activity).getDialog$accountui_release(), R.string.account_ui_phone_not_register, null, 2, null);
            } else if (Intrinsics.areEqual(errorCode2, "429")) {
                FragmentActivity activity2 = PhoneRegisterFormFragment.this.getActivity();
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
                LoadingDialogContainerKt.setFailed$default(((RegisterActivity) activity2).getDialog$accountui_release(), UtilsKt.toSmsLimitPrompt(errorCode.getMessage()), null, 2, null);
            } else {
                FragmentActivity activity3 = PhoneRegisterFormFragment.this.getActivity();
                Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
                LoadingDialogContainerKt.setFailed$default(((RegisterActivity) activity3).getDialog$accountui_release(), R.string.account_ui_phone_request_reset_pwd_code_failed, null, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorCode errorCode) {
            a(errorCode);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<Unit> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FragmentActivity activity = PhoneRegisterFormFragment.this.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
            LoadingDialogContainerKt.showLoadingDialog(((RegisterActivity) activity).getDialog$accountui_release(), R.string.account_ui_phone_code_sending);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Unit> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PhoneRegisterFormFragment.this.C();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "", "<name for destructuring parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<Pair<? extends Boolean, ? extends String>, Unit> {
        public q() {
            super(1);
        }

        public final void a(@NotNull Pair<Boolean, String> pair) {
            boolean zBooleanValue = pair.component1().booleanValue();
            FragmentActivity activity = PhoneRegisterFormFragment.this.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
            ((RegisterActivity) activity).getDialog$accountui_release().hideDialog();
            if (!zBooleanValue) {
                PhoneRegisterFormFragment.this.isVerifyCodeSent = true;
                PhoneRegisterFormFragment.this.i();
                return;
            }
            FragmentActivity activity2 = PhoneRegisterFormFragment.this.getActivity();
            RegisterActivity registerActivity = activity2 instanceof RegisterActivity ? (RegisterActivity) activity2 : null;
            if (registerActivity == null) {
                return;
            }
            registerActivity.onAlreadyRegister(PhoneRegisterFormFragment.this.k().getText().toString(), PhoneRegisterFormFragment.this.j().getText().toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends String> pair) {
            a(pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<TextView> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) UtilsKt.findViewById(PhoneRegisterFormFragment.this, R.id.register_now_btn);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<TextView> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView getA() {
            return (TextView) UtilsKt.findViewById(PhoneRegisterFormFragment.this, R.id.send_verify_btn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(SmsCode smsCode) {
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
        ((RegisterActivity) activity).getDialog$accountui_release().hideDialog();
        PhoneBaseForm phoneBaseForm = this.sendCodeForm;
        if (phoneBaseForm == null) {
            return;
        }
        PhoneRegisterViewModel phoneRegisterViewModel = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel);
        phoneRegisterViewModel.postRegisterForm(phoneBaseForm.getPhoneNumber(), phoneBaseForm.getAreaCode(), j().getText().toString(), smsCode.getCode(), phoneBaseForm.getCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(LoginInfo loginInfo) {
        analyticsPhoneRegisterResult("Success", "200");
        PhoneBaseForm phoneBaseForm = this.sendCodeForm;
        if (phoneBaseForm != null && NetUtil.isNetworkConnected(getActivity())) {
            PhoneRegisterViewModel phoneRegisterViewModel = this.phoneRegisterViewModel;
            Objects.requireNonNull(phoneRegisterViewModel);
            phoneRegisterViewModel.getPhoneLoginForm$accountui_release().postValue(new AutoLoginForm(loginInfo, phoneBaseForm.getCountryCode()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
        LoadingDialogContainerKt.setFailed$default(((RegisterActivity) activity).getDialog$accountui_release(), R.string.account_ui_phone_register_failed, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    private final void D() {
        boolean z;
        TextView textViewM = m();
        if (k().length() > 0 && j().length() > 0 && l().length() > 0 && this.sendCodeForm != null) {
            FragmentActivity activity = getActivity();
            RegisterActivity registerActivity = activity instanceof RegisterActivity ? (RegisterActivity) activity : null;
            if (registerActivity != null && registerActivity.getHasSelectedArea()) {
                FragmentActivity activity2 = getActivity();
                RegisterActivity registerActivity2 = activity2 instanceof RegisterActivity ? (RegisterActivity) activity2 : null;
                z = registerActivity2 != null && registerActivity2.isAgreementChecked();
            }
        }
        textViewM.setEnabled(z);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    private final void E() {
        boolean z;
        TextView textViewN = n();
        if (k().getText().toString().length() > 0) {
            FragmentActivity activity = getActivity();
            RegisterActivity registerActivity = activity instanceof RegisterActivity ? (RegisterActivity) activity : null;
            z = (registerActivity != null && registerActivity.getHasSelectedArea()) && !this.isCountingDown;
        }
        textViewN.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job i() {
        return kotlinx.coroutines.e.f(this, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText j() {
        return (EditText) this.inputPasswordText.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText k() {
        return (EditText) this.inputPhoneNumber.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText l() {
        return (EditText) this.inputVerificationCode.getValue();
    }

    private final TextView m() {
        return (TextView) this.registerNowBtn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView n() {
        return (TextView) this.sendVerifyBtn.getValue();
    }

    private final void o() {
        AccountFaultHandler.INSTANCE.getShouldShowTip().observe(getViewLifecycleOwner(), new Observer() { // from class: mx5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneRegisterFormFragment.p(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(PhoneRegisterFormFragment phoneRegisterFormFragment, Boolean bool) {
        View view = phoneRegisterFormFragment.getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.server_fault_view);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    private final void q(final FragmentActivity activity) {
        PhoneRegisterViewModel phoneRegisterViewModel = (PhoneRegisterViewModel) new ViewModelProvider(this, new PhoneRegisterViewModelFactory(activity.getApplication())).get(PhoneRegisterViewModel.class);
        this.phoneRegisterViewModel = phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel);
        phoneRegisterViewModel.getPhoneGetVerifyResponse$accountui_release().observe(this, new Observer() { // from class: lx5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneRegisterFormFragment.t(this.a, (PhoneLoginResponse) obj);
            }
        });
        PhoneRegisterViewModel phoneRegisterViewModel2 = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel2);
        phoneRegisterViewModel2.getPhoneRegisterResponse$accountui_release().observe(this, new Observer() { // from class: hx5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneRegisterFormFragment.u(activity, this, (PhoneLoginResponse) obj);
            }
        });
        PhoneRegisterViewModel phoneRegisterViewModel3 = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel3);
        phoneRegisterViewModel3.getPhoneVerifyResponse$accountui_release().observe(this, new Observer() { // from class: jx5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneRegisterFormFragment.v(activity, this, (PhoneLoginResponse) obj);
            }
        });
        PhoneRegisterViewModel phoneRegisterViewModel4 = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel4);
        phoneRegisterViewModel4.getPhoneSendCodeFormLiveData$accountui_release().observe(this, new Observer() { // from class: kx5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneRegisterFormFragment.r(this.a, (PhoneBaseForm) obj);
            }
        });
        PhoneRegisterViewModel phoneRegisterViewModel5 = this.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel5);
        phoneRegisterViewModel5.getPhoneLoginResponse$accountui_release().observe(this, new Observer() { // from class: ix5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PhoneRegisterFormFragment.s(activity, this, (PhoneLoginResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(PhoneRegisterFormFragment phoneRegisterFormFragment, PhoneBaseForm phoneBaseForm) {
        phoneRegisterFormFragment.sendCodeForm = phoneBaseForm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(FragmentActivity fragmentActivity, PhoneRegisterFormFragment phoneRegisterFormFragment, PhoneLoginResponse phoneLoginResponse) {
        RegisterActivity registerActivity = fragmentActivity instanceof RegisterActivity ? (RegisterActivity) fragmentActivity : null;
        if (registerActivity == null || phoneLoginResponse == null) {
            return;
        }
        PhoneLoginResponseKt.deal(phoneLoginResponse, new h(registerActivity), new i(registerActivity, fragmentActivity, phoneRegisterFormFragment), new j(fragmentActivity, phoneRegisterFormFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(PhoneRegisterFormFragment phoneRegisterFormFragment, PhoneLoginResponse phoneLoginResponse) {
        PhoneLoginResponseKt.deal(phoneLoginResponse, phoneRegisterFormFragment.onLoading, phoneRegisterFormFragment.onSuccess, phoneRegisterFormFragment.onError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(FragmentActivity fragmentActivity, PhoneRegisterFormFragment phoneRegisterFormFragment, PhoneLoginResponse phoneLoginResponse) {
        PhoneLoginResponseKt.deal(phoneLoginResponse, new b(fragmentActivity), phoneRegisterFormFragment.new c(), phoneRegisterFormFragment.new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(FragmentActivity fragmentActivity, PhoneRegisterFormFragment phoneRegisterFormFragment, PhoneLoginResponse phoneLoginResponse) {
        PhoneLoginResponseKt.deal(phoneLoginResponse, new e(fragmentActivity), phoneRegisterFormFragment.new f(), phoneRegisterFormFragment.new g(fragmentActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(PhoneRegisterFormFragment phoneRegisterFormFragment, View view) {
        if (!UtilsKt.isPhoneNumFormat(phoneRegisterFormFragment.k().getText().toString())) {
            IconToast.showError(phoneRegisterFormFragment.getActivity(), phoneRegisterFormFragment.getString(R.string.account_ui_login_phone_format_error));
        } else {
            if (!NetUtil.isNetworkConnected(phoneRegisterFormFragment.getActivity())) {
                IconToast.showError(phoneRegisterFormFragment.getActivity(), phoneRegisterFormFragment.getString(R.string.account_ui_no_network_connection));
                return;
            }
            PhoneRegisterViewModel phoneRegisterViewModel = phoneRegisterFormFragment.phoneRegisterViewModel;
            Objects.requireNonNull(phoneRegisterViewModel);
            phoneRegisterViewModel.postSendCodeForm(phoneRegisterFormFragment.k().getText().toString(), AccountConstants.DEFAULT_AREA_CODE, "CN");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(PhoneRegisterFormFragment phoneRegisterFormFragment, View view) {
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_REGISTER_ACCOUNT_SIGNUP).addExtra("type", "Phone"));
        String string = phoneRegisterFormFragment.j().getText().toString();
        if (string.length() < 8) {
            IconToast.showError(phoneRegisterFormFragment.getActivity(), R.string.account_ui_account_pwd_length_error);
            return;
        }
        if (!UtilsKt.validPassword(string)) {
            IconToast.showError(phoneRegisterFormFragment.getActivity(), R.string.account_ui_login_email_password_format_error);
            return;
        }
        if (!NetUtil.isNetworkConnected(phoneRegisterFormFragment.getActivity())) {
            IconToast.showError(phoneRegisterFormFragment.getActivity(), phoneRegisterFormFragment.getString(R.string.account_ui_no_network_connection));
            return;
        }
        PhoneBaseForm phoneBaseForm = phoneRegisterFormFragment.sendCodeForm;
        if (phoneBaseForm == null) {
            return;
        }
        PhoneRegisterViewModel phoneRegisterViewModel = phoneRegisterFormFragment.phoneRegisterViewModel;
        Objects.requireNonNull(phoneRegisterViewModel);
        phoneRegisterViewModel.postVerifyForm(phoneBaseForm.getPhoneNumber(), phoneBaseForm.getAreaCode(), phoneRegisterFormFragment.l().getText().toString(), "register");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        PhoneBaseForm phoneBaseForm = this.sendCodeForm;
        if (phoneBaseForm == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
        ((RegisterActivity) activity).registerSuccessButLoginError(phoneBaseForm.getPhoneNumber(), j().getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(ErrorCode errorCode) {
        analyticsPhoneRegisterResult("Fail", String.valueOf(errorCode.getCode()));
        if (Intrinsics.areEqual(errorCode.getErrorCode(), HMProcessLoginDataManager.REGISTER_ERROR_EMAIL_HAD_REGISTERED)) {
            FragmentActivity activity = getActivity();
            RegisterActivity registerActivity = activity instanceof RegisterActivity ? (RegisterActivity) activity : null;
            if (registerActivity == null) {
                return;
            }
            registerActivity.onAlreadyRegister(k().getText().toString(), j().getText().toString());
            return;
        }
        if (!Intrinsics.areEqual(errorCode.getErrorCode(), "0129")) {
            C();
            return;
        }
        FragmentActivity activity2 = getActivity();
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.huami.account.ui.register.RegisterActivity");
        ((RegisterActivity) activity2).getDialog$accountui_release().hideDialog();
        RegisterFailedCustomTipUseCase.execute(getChildFragmentManager(), errorCode, new p());
    }

    public final void analyticsPhoneRegisterResult(@NotNull String result, @NotNull String code) {
        Analytics.recordEvent(new CountEventBuilder(AccountStatEvent.EVENT_SIGNUP_RESULT).putExtras(kotlin.collections.r.mapOf(TuplesKt.to("Result", result), TuplesKt.to("Source", "Phone"), TuplesKt.to("Code", code))));
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

    public final void initViews(@NotNull View view) {
        BaseRegisterFragmentKt.setupPasswordVisible(j(), (ImageView) view.findViewById(R.id.input_password_text_show));
        k().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.register.PhoneRegisterFormFragment$initViews$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s2) {
                this.a.updateBtnState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        j().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.register.PhoneRegisterFormFragment$initViews$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s2) {
                this.a.updateBtnState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        l().addTextChangedListener(new TextWatcher() { // from class: com.huami.account.ui.register.PhoneRegisterFormFragment$initViews$$inlined$doAfterTextChanged$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s2) {
                this.a.updateBtnState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        n().setOnClickListener(new View.OnClickListener() { // from class: fx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PhoneRegisterFormFragment.w(this.a, view2);
            }
        });
        m().setOnClickListener(new View.OnClickListener() { // from class: gx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PhoneRegisterFormFragment.x(this.a, view2);
            }
        });
        o();
    }

    @Override // com.huami.account.ui.register.BaseRegisterFragment
    public boolean isFormEmpty() {
        return k().length() == 0 && j().length() == 0 && l().length() == 0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        q(activity);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle state) {
        return inflater.inflate(R.layout.account_ui_fragment_phone_register, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        Job.DefaultImpls.cancel$default((Job) this.job, (CancellationException) null, 1, (Object) null);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    @Override // com.huami.account.ui.register.BaseRegisterFragment
    public void updateBtnState() {
        E();
        D();
    }
}
