package com.xiaomi.fitness.membership.impl;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.membership.api.MembershipRequest;
import com.xiaomi.fitness.membership.constant.MembershipStatusConstantKt;
import com.xiaomi.fitness.membership.dialog.MembershipDialogManager;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.data.MembershipListResponse;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import com.xiaomi.fitness.membership.export.data.VipInfoResult;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.webview.bean.WebViewPayModel;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001bH\u0016J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001d\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u0004\u0018\u00010\"H\u0096@¢\u0006\u0002\u0010 J\b\u0010#\u001a\u00020\u0018H\u0016J\u001c\u0010$\u001a\u00020\u00122\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u001c\u0010&\u001a\u00020\u00122\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/membership/impl/MembershipHelperImpl;", "Lcom/xiaomi/fitness/membership/export/MembershipHelper;", "<init>", "()V", "mRequest", "Lcom/xiaomi/fitness/membership/api/MembershipRequest;", "getMRequest", "()Lcom/xiaomi/fitness/membership/api/MembershipRequest;", "setMRequest", "(Lcom/xiaomi/fitness/membership/api/MembershipRequest;)V", "vipInfo", "Lcom/xiaomi/fitness/membership/export/data/VipInfo;", "vipConfig", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "mListeners", "", "Lkotlin/Function1;", "", "", "broadcastReceiver", "com/xiaomi/fitness/membership/impl/MembershipHelperImpl$broadcastReceiver$1", "Lcom/xiaomi/fitness/membership/impl/MembershipHelperImpl$broadcastReceiver$1;", "showVipPurchaseDialog", "contentSource", "", "showVipExpiredFaceDialog", "dismissAction", "Lkotlin/Function0;", "getVipInfo", "refresh", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOperationConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVipList", "Lcom/xiaomi/fitness/membership/export/data/MembershipListResponse;", "getMemberStatus", "addMemberStatusChangeListener", "callback", "removeMemberStatusChangeListener", "onPay", "context", "Landroid/content/Context;", "jsonParams", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMembershipHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MembershipHelperImpl.kt\ncom/xiaomi/fitness/membership/impl/MembershipHelperImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,161:1\n1863#2,2:162\n53#3,7:164\n*S KotlinDebug\n*F\n+ 1 MembershipHelperImpl.kt\ncom/xiaomi/fitness/membership/impl/MembershipHelperImpl\n*L\n100#1:162,2\n142#1:164,7\n*E\n"})
public final class MembershipHelperImpl implements MembershipHelper {

    @NotNull
    private final MembershipHelperImpl$broadcastReceiver$1 broadcastReceiver;

    @NotNull
    private final List<Function1<Boolean, Unit>> mListeners = new ArrayList();
    public MembershipRequest mRequest;

    @Nullable
    private VipConfigInfo vipConfig;

    @Nullable
    private VipInfo vipInfo;

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.impl.MembershipHelperImpl$getOperationConfig$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.impl.MembershipHelperImpl", f = "MembershipHelperImpl.kt", i = {0}, l = {113}, m = "getOperationConfig", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipHelperImpl.this.getOperationConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.impl.MembershipHelperImpl$getVipInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.impl.MembershipHelperImpl", f = "MembershipHelperImpl.kt", i = {0}, l = {98}, m = "getVipInfo", n = {"this"}, s = {"L$0"})
    public static final class C26141 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C26141(Continuation<? super C26141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MembershipHelperImpl.this.getVipInfo(false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.membership.impl.MembershipHelperImpl$showVipExpiredFaceDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.membership.impl.MembershipHelperImpl$showVipExpiredFaceDialog$1", f = "MembershipHelperImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $dismissAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26151(Function0<Unit> function0, Continuation<? super C26151> continuation) {
            super(2, continuation);
            this.$dismissAction = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MembershipHelperImpl.this.new C26151(this.$dismissAction, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003d  */
        /* JADX WARN: Code duplicated, block: B:20:0x0041  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function0<Unit> function0;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MembershipHelperImpl membershipHelperImpl = MembershipHelperImpl.this;
                this.label = 1;
                obj = membershipHelperImpl.getVipInfo(false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            VipInfo vipInfo = (VipInfo) obj;
            if (vipInfo == null || !vipInfo.getActive()) {
                AppManager.Companion companion = AppManager.INSTANCE;
                if (companion.getInstance().getCurrentActivity() == null) {
                    function0 = this.$dismissAction;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (companion.getInstance().getCurrentActivity() instanceof FragmentActivity) {
                    Activity currentActivity = companion.getInstance().getCurrentActivity();
                    Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    MembershipDialogManager.INSTANCE.requestMembershipExpiredFaceDialog((FragmentActivity) currentActivity, this.$dismissAction);
                } else {
                    Function0<Unit> function1 = this.$dismissAction;
                    if (function1 != null) {
                        function1.invoke();
                    }
                }
            } else {
                function0 = this.$dismissAction;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.BroadcastReceiver, com.xiaomi.fitness.membership.impl.MembershipHelperImpl$broadcastReceiver$1] */
    public MembershipHelperImpl() {
        ?? r0 = new BroadcastReceiver() { // from class: com.xiaomi.fitness.membership.impl.MembershipHelperImpl$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context p0, Intent intent) {
                if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, MembershipStatusConstantKt.ACTION_MEMBERSHIP_PAY_ACTION) && intent.getBooleanExtra(MembershipStatusConstantKt.ACTION_MEMBERSHIP_PAY_RESULT, false)) {
                    AnyExtKt.io$default(null, new MembershipHelperImpl$broadcastReceiver$1$onReceive$1(this.this$0, null), 1, null);
                }
            }
        };
        this.broadcastReceiver = r0;
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(r0, new IntentFilter(MembershipStatusConstantKt.ACTION_MEMBERSHIP_PAY_ACTION), 2);
        } else {
            ni4.k(ApplicationExtKt.getApplication(), r0, new IntentFilter(MembershipStatusConstantKt.ACTION_MEMBERSHIP_PAY_ACTION), 4);
        }
    }

    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    public void addMemberStatusChangeListener(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mListeners.add(callback);
    }

    @NotNull
    public final MembershipRequest getMRequest() {
        MembershipRequest membershipRequest = this.mRequest;
        if (membershipRequest != null) {
            return membershipRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRequest");
        return null;
    }

    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    @NotNull
    public String getMemberStatus() {
        VipInfo vipInfo = this.vipInfo;
        if (vipInfo != null && vipInfo.getDeprecatedMember()) {
            return "4";
        }
        VipInfo vipInfo2 = this.vipInfo;
        String expiredAt = vipInfo2 != null ? vipInfo2.getExpiredAt() : null;
        if (expiredAt == null || expiredAt.length() == 0) {
            return "2";
        }
        VipInfo vipInfo3 = this.vipInfo;
        return (vipInfo3 == null || !vipInfo3.getActive()) ? "3" : "1";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    @Nullable
    public Object getOperationConfig(@NotNull Continuation<? super VipConfigInfo> continuation) {
        AnonymousClass1 anonymousClass1;
        MembershipHelperImpl membershipHelperImpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object operationConfig = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(operationConfig);
            VipConfigInfo vipConfigInfo = this.vipConfig;
            if (vipConfigInfo != null) {
                return vipConfigInfo;
            }
            MembershipRequest mRequest = getMRequest();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            operationConfig = mRequest.getOperationConfig(anonymousClass1);
            if (operationConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
            membershipHelperImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            membershipHelperImpl = (MembershipHelperImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(operationConfig);
        }
        VipConfigInfo vipConfigInfo2 = (VipConfigInfo) operationConfig;
        membershipHelperImpl.vipConfig = vipConfigInfo2;
        return vipConfigInfo2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    @Nullable
    public Object getVipInfo(boolean z, @NotNull Continuation<? super VipInfo> continuation) {
        C26141 c26141;
        MembershipHelperImpl membershipHelperImpl;
        VipInfo vipInfo;
        if (continuation instanceof C26141) {
            c26141 = (C26141) continuation;
            int i = c26141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26141.label = i - Integer.MIN_VALUE;
            } else {
                c26141 = new C26141(continuation);
            }
        } else {
            c26141 = new C26141(continuation);
        }
        Object vipInfo2 = c26141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(vipInfo2);
            if (!z && (vipInfo = this.vipInfo) != null) {
                return vipInfo;
            }
            try {
                MembershipRequest mRequest = getMRequest();
                c26141.L$0 = this;
                c26141.label = 1;
                vipInfo2 = mRequest.getVipInfo(c26141);
                if (vipInfo2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                membershipHelperImpl = this;
            } catch (Exception e) {
                e = e;
                membershipHelperImpl = this;
                e.printStackTrace();
                return membershipHelperImpl.vipInfo;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            membershipHelperImpl = (MembershipHelperImpl) c26141.L$0;
            try {
                ResultKt.throwOnFailure(vipInfo2);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return membershipHelperImpl.vipInfo;
            }
        }
        VipInfoResult vipInfoResult = (VipInfoResult) vipInfo2;
        VipInfo membership = vipInfoResult != null ? vipInfoResult.getMembership() : null;
        membershipHelperImpl.vipInfo = membership;
        Iterator<T> it = membershipHelperImpl.mListeners.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            boolean z2 = false;
            if (membership != null && membership.getActive()) {
                z2 = true;
            }
            function1.invoke2(Boxing.boxBoolean(z2));
        }
        return membership;
    }

    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    @Nullable
    public Object getVipList(@NotNull Continuation<? super MembershipListResponse> continuation) {
        return getMRequest().getVipList(continuation);
    }

    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    public void onPay(@NotNull Context context, @NotNull String jsonParams) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
            Gson gsonCreate = gsonBuilder.create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
            WebViewPayModel webViewPayModel = (WebViewPayModel) gsonCreate.fromJson(jsonParams, WebViewPayModel.class);
            PaymentManager.Companion companion = PaymentManager.INSTANCE;
            SkuObject skuObjectBuildSkuObject$default = PaymentManager.DefaultImpls.buildSkuObject$default(PayManagerExtKt.getInstance(companion), webViewPayModel.getSpuId(), webViewPayModel.getSpuVer(), webViewPayModel.getId(), webViewPayModel.getPrice(), 0L, null, null, 112, null);
            PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(companion);
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(skuObjectBuildSkuObject$default);
            String webSource = webViewPayModel.getWebSource();
            if (webSource == null) {
                webSource = "";
            }
            PaymentManager.DefaultImpls.intentToPay$default(payManagerExtKt, fragmentActivity, listMutableListOf, 0, false, false, false, false, 5, webSource, null, null, 636, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    public void removeMemberStatusChangeListener(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mListeners.remove(callback);
    }

    public final void setMRequest(@NotNull MembershipRequest membershipRequest) {
        Intrinsics.checkNotNullParameter(membershipRequest, "<set-?>");
        this.mRequest = membershipRequest;
    }

    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    public void showVipExpiredFaceDialog(@Nullable Function0<Unit> dismissAction) {
        AnyExtKt.main$default(null, new C26151(dismissAction, null), 1, null);
    }

    @Override // com.xiaomi.fitness.membership.export.MembershipHelper
    public void showVipPurchaseDialog(@NotNull String contentSource) {
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        BaseActivity baseActivity = currentActivity instanceof BaseActivity ? (BaseActivity) currentActivity : null;
        if (baseActivity == null) {
            return;
        }
        MembershipDialogManager.INSTANCE.requestMembershipDialog(baseActivity, contentSource);
    }
}
