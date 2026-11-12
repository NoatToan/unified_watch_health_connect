package com.xiaomi.fitness.access;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.access.AccessViewModel;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.access.request.BoolRetResult;
import com.xiaomi.fitness.access.request.MiscModel;
import com.xiaomi.fitness.access.request.ThirdPartyBindResultModel;
import com.xiaomi.fitness.access.request.ThirdPartyBindStatusResultModel;
import com.xiaomi.fitness.access.request.ThirdPartyResultConstants;
import com.xiaomi.fitness.access.request.ThirdPartyUnbindResultModel;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.AndroidScope;
import defpackage.h4b;
import defpackage.mzi;
import defpackage.vq1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import util.WechatFileUtil;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001jB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u00020GJ\u000e\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020KJ\u000e\u0010L\u001a\u00020G2\u0006\u0010M\u001a\u00020NJ\u001e\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u0013J\u0006\u0010S\u001a\u00020GJ\u0006\u0010T\u001a\u00020GJ\u0006\u0010U\u001a\u00020GJ\u0006\u0010V\u001a\u00020GJ\u0014\u0010W\u001a\u00020G2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020G0YJ\u0006\u0010Z\u001a\u00020GJ\u0006\u0010]\u001a\u00020GJ\u0006\u0010^\u001a\u00020GJ\u0006\u0010_\u001a\u00020GJ\u0006\u0010g\u001a\u00020GJ\u0006\u0010h\u001a\u00020GJ\u0006\u0010i\u001a\u00020GR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R,\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R \u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R \u0010-\u001a\b\u0012\u0004\u0012\u00020.0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011R \u00104\u001a\b\u0012\u0004\u0012\u00020.0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R \u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0011R \u0010:\u001a\b\u0012\u0004\u0012\u00020.0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u0010\u0011R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010\u0011R \u0010[\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u000f\"\u0004\b\\\u0010\u0011R \u0010`\u001a\b\u0012\u0004\u0012\u00020a0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u000f\"\u0004\bc\u0010\u0011R \u0010d\u001a\b\u0012\u0004\u0012\u00020\u001e0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u000f\"\u0004\bf\u0010\u0011¨\u0006k"}, d2 = {"Lcom/xiaomi/fitness/access/AccessViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/access/AccessModel;", "<init>", "()V", "mAccessRequest", "Lcom/xiaomi/fitness/access/request/AccessRequest;", "getMAccessRequest", "()Lcom/xiaomi/fitness/access/request/AccessRequest;", "setMAccessRequest", "(Lcom/xiaomi/fitness/access/request/AccessRequest;)V", "mAlipayLoadBindChange", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/access/request/MiscModel$AlipayBindResult;", "getMAlipayLoadBindChange", "()Landroidx/lifecycle/MutableLiveData;", "setMAlipayLoadBindChange", "(Landroidx/lifecycle/MutableLiveData;)V", "mAlipayLoadBindError", "", "getMAlipayLoadBindError", "setMAlipayLoadBindError", "mAlipayUnBindChange", "getMAlipayUnBindChange", "setMAlipayUnBindChange", "mAlipayBindOtherChange", "getMAlipayBindOtherChange", "setMAlipayBindOtherChange", "mAlipayBindOtherData", "", "", "getMAlipayBindOtherData", "setMAlipayBindOtherData", "mAlipayAuthorBindChange", "getMAlipayAuthorBindChange", "setMAlipayAuthorBindChange", "mStartLoading", "getMStartLoading", "setMStartLoading", "mRequestError", "getMRequestError", "setMRequestError", "mStravaStartLoading", "getMStravaStartLoading", "setMStravaStartLoading", "mStravaLoadBindChange", "Lcom/xiaomi/fitness/access/request/MiscModel$StravaBindResult;", "getMStravaLoadBindChange", "setMStravaLoadBindChange", "mStravaRequestBindChange", "getMStravaRequestBindChange", "setMStravaRequestBindChange", "mStravaBindStateChange", "getMStravaBindStateChange", "setMStravaBindStateChange", "mStravaRequestBindStateChange", "getMStravaRequestBindStateChange", "setMStravaRequestBindStateChange", "mStravaUnBindStateChange", "getMStravaUnBindStateChange", "setMStravaUnBindStateChange", "mStravaRequestUnBindStateChange", "getMStravaRequestUnBindStateChange", "setMStravaRequestUnBindStateChange", "deviceBound", "getDeviceBound", "setDeviceBound", "wechatSupportBindDevice", "getWechatSupportBindDevice", "setWechatSupportBindDevice", "loadBindStatus", "", "unBind", "author", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "parseAlipay", "msg", "", "bindAlipay", TSMAuthContants.PARAM_AUTH_CODE, "userId", "force_bind", "checkBindStatus", "bindStrava", "unbindStrava", "checkWechatSupportBindDevice", "unbindWechat", "callback", "Lkotlin/Function0;", "bindWechat", "isLoadingLiveData", "setLoadingLiveData", "bindGoogleFit", "unbindGoogleFit", "getGoogleFitBindStatus", "bindStatusLiveData", "", "getBindStatusLiveData", "setBindStatusLiveData", "authCodeLiveData", "getAuthCodeLiveData", "setAuthCodeLiveData", "inquirySuuntoBindStatus", "connectSuunto", "disconnectSuunto", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccessViewModel extends BaseViewModel<AccessModel> {

    @NotNull
    public static final String ALIPAY_TAG = "THIRD_PARTY_ACCESS_ALIPAY";

    @NotNull
    public static final String GOOGLE_FIT_TAG = "THIRD_PARTY_ACCESS_GOOGLE_FIT";

    @NotNull
    public static final String STRAVA_TAG = "THIRD_PARTY_ACCESS_STRAVA";

    @NotNull
    public static final String SUUNTO_TAG = "THIRD_PARTY_ACCESS_SUUNTO";

    @NotNull
    public static final String WECHAT_TAG = "THIRD_PARTY_ACCESS_WECHAT";
    public AccessRequest mAccessRequest;

    @NotNull
    private MutableLiveData<MiscModel.AlipayBindResult> mAlipayLoadBindChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mAlipayLoadBindError = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiscModel.AlipayBindResult> mAlipayUnBindChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiscModel.AlipayBindResult> mAlipayBindOtherChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Map<String, String>> mAlipayBindOtherData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiscModel.AlipayBindResult> mAlipayAuthorBindChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mStartLoading = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mRequestError = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mStravaStartLoading = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiscModel.StravaBindResult> mStravaLoadBindChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mStravaRequestBindChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiscModel.StravaBindResult> mStravaBindStateChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mStravaRequestBindStateChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiscModel.StravaBindResult> mStravaUnBindStateChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mStravaRequestUnBindStateChange = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> deviceBound = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> wechatSupportBindDevice = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> isLoadingLiveData = new MutableLiveData<>(Boolean.FALSE);

    @NotNull
    private MutableLiveData<Integer> bindStatusLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<String> authCodeLiveData = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$author$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$author$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStartLoading().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$bindAlipay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$bindAlipay$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17231(Continuation<? super C17231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17231(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStartLoading().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$bindAlipay$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$bindAlipay$2", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $authCode;
        final /* synthetic */ Ref.ObjectRef<String> $forceBind;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Ref.ObjectRef<String> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$authCode = str;
            this.$userId = str2;
            this.$forceBind = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new AnonymousClass2(this.$authCode, this.$userId, this.$forceBind, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMAlipayBindOtherData().setValue(MapsKt__MapsKt.mapOf(TuplesKt.to(ThirdPartAccessConstants.PARAM_AUTH_CODE, this.$authCode), TuplesKt.to("third_user_id", this.$userId), TuplesKt.to("force_bind", this.$forceBind.element)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$bindStrava$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$bindStrava$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17241(Continuation<? super C17241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17241(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStravaStartLoading().setValue(Boxing.boxBoolean(true));
            AccessViewModel.this.isLoadingLiveData().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$checkBindStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$checkBindStatus$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17251(Continuation<? super C17251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17251(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStravaStartLoading().setValue(Boxing.boxBoolean(true));
            AccessViewModel.this.isLoadingLiveData().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$checkWechatSupportBindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$checkWechatSupportBindDevice$1", f = "AccessViewModel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<MiscModel.ProductResult> $listProductList;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17261(Ref.ObjectRef<MiscModel.ProductResult> objectRef, Continuation<? super C17261> continuation) {
            super(2, continuation);
            this.$listProductList = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17261(this.$listProductList, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<MiscModel.ProductResult> objectRef;
            T t;
            List<String> list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger.i(AccessViewModel.this.getTAG(), "getProductList request");
                Ref.ObjectRef<MiscModel.ProductResult> objectRef2 = this.$listProductList;
                AccessRequest mAccessRequest = AccessViewModel.this.getMAccessRequest();
                this.L$0 = objectRef2;
                this.label = 1;
                Object productList = mAccessRequest.getProductList(this);
                if (productList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t = productList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
            }
            objectRef.element = t;
            for (T t2 : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels()) {
                MiscModel.ProductResult productResult = this.$listProductList.element;
                if (productResult != null && (list = productResult.productList) != null && list.contains(t2.getProduct().getModel())) {
                    Logger.i(AccessViewModel.this.getTAG(), "wechatSupportBindDevice is true");
                    AccessViewModel.this.getWechatSupportBindDevice().setValue(Boxing.boxBoolean(true));
                    break;
                }
            }
            if (!Intrinsics.areEqual(AccessViewModel.this.getWechatSupportBindDevice().getValue(), Boxing.boxBoolean(true))) {
                Logger.i(AccessViewModel.this.getTAG(), "wechatSupportBindDevice is false");
                AccessViewModel.this.getWechatSupportBindDevice().setValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$loadBindStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$loadBindStatus$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17271(Continuation<? super C17271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17271(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStartLoading().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$parseAlipay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$parseAlipay$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17281(Continuation<? super C17281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17281(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStartLoading().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$parseAlipay$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$parseAlipay$2", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17292 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17292(Continuation<? super C17292> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17292(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStartLoading().setValue(Boxing.boxBoolean(false));
            AccessViewModel.this.getMRequestError().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17292) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$unBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$unBind$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17301(Continuation<? super C17301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17301(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStartLoading().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.AccessViewModel$unbindStrava$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$unbindStrava$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C17311(Continuation<? super C17311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccessViewModel.this.new C17311(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccessViewModel.this.getMStravaStartLoading().setValue(Boxing.boxBoolean(true));
            AccessViewModel.this.isLoadingLiveData().setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit author$lambda$4(AccessViewModel this$0, MiscModel.AlipayBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$author$2$1(this$0, it, null), 1, null);
        Logger.i(ALIPAY_TAG, "author getAlipayQueryString success. alipayBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit author$lambda$5(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$author$3$1(this$0, null), 1, null);
        Logger.i(ALIPAY_TAG, "author getAlipayQueryString failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAlipay$lambda$6(AccessViewModel this$0, MiscModel.AlipayBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$bindAlipay$3$1(this$0, it, null), 1, null);
        Logger.i(ALIPAY_TAG, "bindAlipay success. alipayBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAlipay$lambda$7(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$bindAlipay$4$1(this$0, null), 1, null);
        Logger.i(ALIPAY_TAG, "bindAlipay failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindGoogleFit$lambda$19(AccessViewModel this$0, ThirdPartyBindResultModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int bindStatus = it.getBindStatus();
        ThirdPartyResultConstants thirdPartyResultConstants = ThirdPartyResultConstants.INSTANCE;
        Logger.i(GOOGLE_FIT_TAG, "bindGoogleFit succeed. bindResult=" + bindStatus + " resultName=" + thirdPartyResultConstants.getResultName(bindStatus));
        if (bindStatus == 0) {
            Logger.i(GOOGLE_FIT_TAG, "bindGoogleFit failed. bindResult=" + bindStatus + " resultName=" + thirdPartyResultConstants.getResultName(bindStatus));
            ThirdPartyAccessExtKt.showOperationToast(1);
        } else if (bindStatus == 1) {
            this$0.bindStatusLiveData.setValue(1);
            ThirdPartyAccessExtKt.showOperationToast(0);
        }
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindGoogleFit$lambda$20(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(GOOGLE_FIT_TAG, "bindGoogleFit error. error=" + it);
        ThirdPartyAccessExtKt.showOperationToast(1);
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStrava$lambda$10(AccessViewModel this$0, MiscModel.StravaBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$bindStrava$2$1(this$0, it, null), 1, null);
        Logger.i(STRAVA_TAG, "bindStrava success. stravaBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStrava$lambda$11(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$bindStrava$3$1(this$0, null), 1, null);
        Logger.i(STRAVA_TAG, "bindStrava error:" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWechat$lambda$17(AccessViewModel this$0, MiscModel.WechatBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.deviceBound.setValue(Boolean.valueOf(it.isBound()));
        Logger.i(WECHAT_TAG, "bindWechat success. wechatBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindWechat$lambda$18(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WechatFileUtil.INSTANCE.showToastShort(mzi.d);
        Logger.i(WECHAT_TAG, "bindWechat failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkBindStatus$lambda$8(AccessViewModel this$0, MiscModel.StravaBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$checkBindStatus$2$1(this$0, it, null), 1, null);
        Logger.i(STRAVA_TAG, "checkBindStatus strava success. stravaBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkBindStatus$lambda$9(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$checkBindStatus$3$1(this$0, null), 1, null);
        Logger.i(STRAVA_TAG, "checkBindStatus strava error:" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkWechatSupportBindDevice$lambda$14(AccessViewModel this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.wechatSupportBindDevice.setValue(Boolean.FALSE);
        Logger.d(this$0.getTAG(), "ApiException is " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectSuunto$lambda$27(AccessViewModel this$0, ThirdPartyBindResultModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int bindStatus = it.getBindStatus();
        ThirdPartyResultConstants thirdPartyResultConstants = ThirdPartyResultConstants.INSTANCE;
        Logger.i(SUUNTO_TAG, "connectSuunto bindStatus=" + bindStatus + " resultName=" + thirdPartyResultConstants.getStatusName(bindStatus));
        if (bindStatus == 0) {
            Logger.i(SUUNTO_TAG, "connectSuunto failed. bindStatus=" + bindStatus + " resultName=" + thirdPartyResultConstants.getStatusName(bindStatus));
            ThirdPartyAccessExtKt.showOperationToast(1);
        } else if (bindStatus == 1) {
            this$0.bindStatusLiveData.setValue(1);
            ThirdPartyAccessExtKt.showOperationToast(0);
        }
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectSuunto$lambda$28(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(SUUNTO_TAG, "connectSuunto failed. error=" + it);
        ThirdPartyAccessExtKt.showOperationToast(1);
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disconnectSuunto$lambda$29(AccessViewModel this$0, ThirdPartyUnbindResultModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        boolean result = it.getResult();
        if (result) {
            this$0.bindStatusLiveData.setValue(0);
            ThirdPartyAccessExtKt.showOperationToast(2);
            Logger.i(SUUNTO_TAG, "disconnectSuunto succeeded. unbindResult=" + result);
        } else {
            this$0.bindStatusLiveData.setValue(1);
            ThirdPartyAccessExtKt.showOperationToast(3);
            Logger.i(SUUNTO_TAG, "disconnectSuunto failed. unbindResult=" + result);
        }
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disconnectSuunto$lambda$30(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(SUUNTO_TAG, "disconnectSuunto error. error=" + it);
        ThirdPartyAccessExtKt.showOperationToast(3);
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getGoogleFitBindStatus$lambda$23(AccessViewModel this$0, ThirdPartyBindStatusResultModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int bindStatus = it.getBindStatus();
        Logger.i(GOOGLE_FIT_TAG, "getGoogleFitBindStatus succeed. bindStatus=" + bindStatus + " statusName=" + ThirdPartyResultConstants.INSTANCE.getStatusName(bindStatus));
        this$0.bindStatusLiveData.setValue(Integer.valueOf(bindStatus));
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getGoogleFitBindStatus$lambda$24(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(GOOGLE_FIT_TAG, "getGoogleFitBindStatus error. error=" + it);
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inquirySuuntoBindStatus$lambda$25(AccessViewModel this$0, ThirdPartyBindStatusResultModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int bindStatus = it.getBindStatus();
        this$0.bindStatusLiveData.setValue(Integer.valueOf(bindStatus));
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        Logger.i(SUUNTO_TAG, "inquirySuuntoBindStatus succeeded. bindStatus=" + bindStatus + " statusName=" + ThirdPartyResultConstants.INSTANCE.getStatusName(bindStatus));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inquirySuuntoBindStatus$lambda$26(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        Logger.i(SUUNTO_TAG, "inquirySuuntoBindStatus failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBindStatus$lambda$0(AccessViewModel this$0, MiscModel.AlipayBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$loadBindStatus$2$1(this$0, it, null), 1, null);
        Logger.i(ALIPAY_TAG, "loadBindStatus success. miscModelAlipayBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBindStatus$lambda$1(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$loadBindStatus$3$1(this$0, null), 1, null);
        Logger.i(ALIPAY_TAG, "loadBindStatus failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unBind$lambda$2(AccessViewModel this$0, MiscModel.AlipayBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$unBind$2$1(this$0, it, null), 1, null);
        Logger.i(ALIPAY_TAG, "unBind Alipay success. alipayBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unBind$lambda$3(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$unBind$3$1(this$0, null), 1, null);
        Logger.i(ALIPAY_TAG, "unBind Alipay failed. error=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindGoogleFit$lambda$21(AccessViewModel this$0, ThirdPartyUnbindResultModel it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        boolean result = it.getResult();
        if (result) {
            this$0.bindStatusLiveData.setValue(0);
            Logger.i(GOOGLE_FIT_TAG, "unbindGoogleFit succeed. unbindResult=" + result);
            ThirdPartyAccessExtKt.showOperationToast(2);
        } else {
            this$0.bindStatusLiveData.setValue(1);
            Logger.i(GOOGLE_FIT_TAG, "unbindGoogleFit failed. unbindResult=" + result);
            ThirdPartyAccessExtKt.showOperationToast(3);
        }
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindGoogleFit$lambda$22(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(GOOGLE_FIT_TAG, "unbindGoogleFit error. error=" + it);
        ThirdPartyAccessExtKt.showOperationToast(3);
        this$0.isLoadingLiveData.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindStrava$lambda$12(AccessViewModel this$0, MiscModel.StravaBindResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$unbindStrava$disposable$1$1(this$0, it, null), 1, null);
        Logger.i(STRAVA_TAG, "unbindStrava success. stravaBindResult=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindStrava$lambda$13(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new AccessViewModel$unbindStrava$disposable$2$1(this$0, null), 1, null);
        Logger.i(STRAVA_TAG, "unbindStrava error:" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindWechat$lambda$15(AccessViewModel this$0, Function0 callback, BoolRetResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.i(this$0.getTAG(), "unbindWechat success. result=" + result.ret);
        callback.invoke();
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), mzi.s0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindWechat$lambda$16(AccessViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "unbindWechat failed. error=" + it);
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), mzi.common_set_error);
        return Unit.INSTANCE;
    }

    public final void author(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
        AccessRequest mAccessRequest = getMAccessRequest();
        String strC = h4b.c(MiscModel.AlipayQueryQuest.create());
        Intrinsics.checkNotNullExpressionValue(strC, "toJsonString(...)");
        mAccessRequest.getAlipayQueryString(strC, new Function1() { // from class: x60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.author$lambda$4(this.f38738a, (MiscModel.AlipayBindResult) obj);
            }
        }, new Function1() { // from class: z60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.author$lambda$5(this.f40932a, (ApiException) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindAlipay(@NotNull String authCode, @NotNull String userId, boolean force_bind) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(userId, "userId");
        AnyExtKt.main$default(null, new C17231(null), 1, null);
        String strB = h4b.b(MapsKt__MapsKt.mapOf(TuplesKt.to(ThirdPartAccessConstants.PARAM_AUTH_CODE, authCode), TuplesKt.to("third_user_id", userId), TuplesKt.to("force_bind", Boolean.valueOf(force_bind))));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = force_bind ? "1" : "0";
        AnyExtKt.main$default(null, new AnonymousClass2(authCode, userId, objectRef, null), 1, null);
        AccessRequest mAccessRequest = getMAccessRequest();
        Intrinsics.checkNotNull(strB);
        mAccessRequest.bindAlipay(strB, new Function1() { // from class: u60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindAlipay$lambda$6(this.f35441a, (MiscModel.AlipayBindResult) obj);
            }
        }, new Function1() { // from class: v60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindAlipay$lambda$7(this.f36517a, (ApiException) obj);
            }
        });
    }

    public final void bindGoogleFit() {
        String value = this.authCodeLiveData.getValue();
        if (value == null) {
            return;
        }
        this.isLoadingLiveData.setValue(Boolean.TRUE);
        getMAccessRequest().bindThirdParty("google", value, new Function1() { // from class: q60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindGoogleFit$lambda$19(this.f31153a, (ThirdPartyBindResultModel) obj);
            }
        }, new Function1() { // from class: r60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindGoogleFit$lambda$20(this.f32224a, (ApiException) obj);
            }
        });
    }

    public final void bindStrava() {
        String value = this.authCodeLiveData.getValue();
        if (value == null) {
            return;
        }
        AnyExtKt.main$default(null, new C17241(null), 1, null);
        getMAccessRequest().bindStrava(value, new Function1() { // from class: s60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindStrava$lambda$10(this.f33335a, (MiscModel.StravaBindResult) obj);
            }
        }, new Function1() { // from class: t60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindStrava$lambda$11(this.f34355a, (ApiException) obj);
            }
        });
    }

    public final void bindWechat() {
        AccessRequest.bindWechat$default(getMAccessRequest(), 0, new Function1() { // from class: c70
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindWechat$lambda$17(this.f5004a, (MiscModel.WechatBindResult) obj);
            }
        }, new Function1() { // from class: d70
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.bindWechat$lambda$18((ApiException) obj);
            }
        }, 1, null);
    }

    public final void checkBindStatus() {
        AnyExtKt.main$default(null, new C17251(null), 1, null);
        getMAccessRequest().getStravaBindStatus(new Function1() { // from class: k60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.checkBindStatus$lambda$8(this.f23506a, (MiscModel.StravaBindResult) obj);
            }
        }, new Function1() { // from class: l60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.checkBindStatus$lambda$9(this.f24706a, (ApiException) obj);
            }
        });
    }

    public final void checkWechatSupportBindDevice() {
        ScopeExtKt.scopeNet$default(null, new C17261(new Ref.ObjectRef(), null), 1, null).m503catch(new Function2() { // from class: p60
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccessViewModel.checkWechatSupportBindDevice$lambda$14(this.f30047a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void connectSuunto() {
        String value = this.authCodeLiveData.getValue();
        if (value == null || StringsKt__StringsKt.isBlank(value)) {
            return;
        }
        this.isLoadingLiveData.setValue(Boolean.TRUE);
        getMAccessRequest().bindThirdParty("suunto", value, new Function1() { // from class: g60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.connectSuunto$lambda$27(this.f18633a, (ThirdPartyBindResultModel) obj);
            }
        }, new Function1() { // from class: h60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.connectSuunto$lambda$28(this.f19732a, (ApiException) obj);
            }
        });
    }

    public final void disconnectSuunto() {
        this.isLoadingLiveData.setValue(Boolean.TRUE);
        getMAccessRequest().unbindThirdParty("suunto", new Function1() { // from class: c60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.disconnectSuunto$lambda$29(this.f4972a, (ThirdPartyUnbindResultModel) obj);
            }
        }, new Function1() { // from class: d60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.disconnectSuunto$lambda$30(this.f15121a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<String> getAuthCodeLiveData() {
        return this.authCodeLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getBindStatusLiveData() {
        return this.bindStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceBound() {
        return this.deviceBound;
    }

    public final void getGoogleFitBindStatus() {
        this.isLoadingLiveData.setValue(Boolean.TRUE);
        getMAccessRequest().getThirdPartyBindStatus("google", new Function1() { // from class: e60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.getGoogleFitBindStatus$lambda$23(this.f16299a, (ThirdPartyBindStatusResultModel) obj);
            }
        }, new Function1() { // from class: f60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.getGoogleFitBindStatus$lambda$24(this.f17451a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final AccessRequest getMAccessRequest() {
        AccessRequest accessRequest = this.mAccessRequest;
        if (accessRequest != null) {
            return accessRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccessRequest");
        return null;
    }

    @NotNull
    public final MutableLiveData<MiscModel.AlipayBindResult> getMAlipayAuthorBindChange() {
        return this.mAlipayAuthorBindChange;
    }

    @NotNull
    public final MutableLiveData<MiscModel.AlipayBindResult> getMAlipayBindOtherChange() {
        return this.mAlipayBindOtherChange;
    }

    @NotNull
    public final MutableLiveData<Map<String, String>> getMAlipayBindOtherData() {
        return this.mAlipayBindOtherData;
    }

    @NotNull
    public final MutableLiveData<MiscModel.AlipayBindResult> getMAlipayLoadBindChange() {
        return this.mAlipayLoadBindChange;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMAlipayLoadBindError() {
        return this.mAlipayLoadBindError;
    }

    @NotNull
    public final MutableLiveData<MiscModel.AlipayBindResult> getMAlipayUnBindChange() {
        return this.mAlipayUnBindChange;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMRequestError() {
        return this.mRequestError;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMStartLoading() {
        return this.mStartLoading;
    }

    @NotNull
    public final MutableLiveData<MiscModel.StravaBindResult> getMStravaBindStateChange() {
        return this.mStravaBindStateChange;
    }

    @NotNull
    public final MutableLiveData<MiscModel.StravaBindResult> getMStravaLoadBindChange() {
        return this.mStravaLoadBindChange;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMStravaRequestBindChange() {
        return this.mStravaRequestBindChange;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMStravaRequestBindStateChange() {
        return this.mStravaRequestBindStateChange;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMStravaRequestUnBindStateChange() {
        return this.mStravaRequestUnBindStateChange;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMStravaStartLoading() {
        return this.mStravaStartLoading;
    }

    @NotNull
    public final MutableLiveData<MiscModel.StravaBindResult> getMStravaUnBindStateChange() {
        return this.mStravaUnBindStateChange;
    }

    @NotNull
    public final MutableLiveData<Boolean> getWechatSupportBindDevice() {
        return this.wechatSupportBindDevice;
    }

    public final void inquirySuuntoBindStatus() {
        this.isLoadingLiveData.setValue(Boolean.TRUE);
        getMAccessRequest().getThirdPartyBindStatus("suunto", new Function1() { // from class: a70
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.inquirySuuntoBindStatus$lambda$25(this.f698a, (ThirdPartyBindStatusResultModel) obj);
            }
        }, new Function1() { // from class: b70
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.inquirySuuntoBindStatus$lambda$26(this.f3873a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Boolean> isLoadingLiveData() {
        return this.isLoadingLiveData;
    }

    public final void loadBindStatus() {
        AnyExtKt.main$default(null, new C17271(null), 1, null);
        getMAccessRequest().getAlipayBindStatus(new Function1() { // from class: b60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.loadBindStatus$lambda$0(this.f3839a, (MiscModel.AlipayBindResult) obj);
            }
        }, new Function1() { // from class: m60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.loadBindStatus$lambda$1(this.f25794a, (ApiException) obj);
            }
        });
    }

    public final void parseAlipay(@NotNull Object msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        AnyExtKt.main$default(null, new C17281(null), 1, null);
        vq1 vq1Var = new vq1((Map) msg, true);
        String strC = vq1Var.c();
        Intrinsics.checkNotNullExpressionValue(strC, "getResultStatus(...)");
        if (!TextUtils.equals(strC, "9000") || !TextUtils.equals(vq1Var.b(), "200")) {
            AnyExtKt.main$default(null, new C17292(null), 1, null);
            return;
        }
        String strA = vq1Var.a();
        Intrinsics.checkNotNullExpressionValue(strA, "getAuthCode(...)");
        String strD = vq1Var.d();
        Intrinsics.checkNotNullExpressionValue(strD, "getUserId(...)");
        bindAlipay(strA, strD, false);
    }

    public final void setAuthCodeLiveData(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.authCodeLiveData = mutableLiveData;
    }

    public final void setBindStatusLiveData(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bindStatusLiveData = mutableLiveData;
    }

    public final void setDeviceBound(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.deviceBound = mutableLiveData;
    }

    public final void setLoadingLiveData(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isLoadingLiveData = mutableLiveData;
    }

    public final void setMAccessRequest(@NotNull AccessRequest accessRequest) {
        Intrinsics.checkNotNullParameter(accessRequest, "<set-?>");
        this.mAccessRequest = accessRequest;
    }

    public final void setMAlipayAuthorBindChange(@NotNull MutableLiveData<MiscModel.AlipayBindResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mAlipayAuthorBindChange = mutableLiveData;
    }

    public final void setMAlipayBindOtherChange(@NotNull MutableLiveData<MiscModel.AlipayBindResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mAlipayBindOtherChange = mutableLiveData;
    }

    public final void setMAlipayBindOtherData(@NotNull MutableLiveData<Map<String, String>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mAlipayBindOtherData = mutableLiveData;
    }

    public final void setMAlipayLoadBindChange(@NotNull MutableLiveData<MiscModel.AlipayBindResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mAlipayLoadBindChange = mutableLiveData;
    }

    public final void setMAlipayLoadBindError(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mAlipayLoadBindError = mutableLiveData;
    }

    public final void setMAlipayUnBindChange(@NotNull MutableLiveData<MiscModel.AlipayBindResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mAlipayUnBindChange = mutableLiveData;
    }

    public final void setMRequestError(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mRequestError = mutableLiveData;
    }

    public final void setMStartLoading(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStartLoading = mutableLiveData;
    }

    public final void setMStravaBindStateChange(@NotNull MutableLiveData<MiscModel.StravaBindResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStravaBindStateChange = mutableLiveData;
    }

    public final void setMStravaLoadBindChange(@NotNull MutableLiveData<MiscModel.StravaBindResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStravaLoadBindChange = mutableLiveData;
    }

    public final void setMStravaRequestBindChange(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStravaRequestBindChange = mutableLiveData;
    }

    public final void setMStravaRequestBindStateChange(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStravaRequestBindStateChange = mutableLiveData;
    }

    public final void setMStravaRequestUnBindStateChange(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStravaRequestUnBindStateChange = mutableLiveData;
    }

    public final void setMStravaStartLoading(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStravaStartLoading = mutableLiveData;
    }

    public final void setMStravaUnBindStateChange(@NotNull MutableLiveData<MiscModel.StravaBindResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mStravaUnBindStateChange = mutableLiveData;
    }

    public final void setWechatSupportBindDevice(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.wechatSupportBindDevice = mutableLiveData;
    }

    public final void unBind() {
        AnyExtKt.main$default(null, new C17301(null), 1, null);
        getMAccessRequest().unBindAlipay(new Function1() { // from class: n60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unBind$lambda$2(this.f27582a, (MiscModel.AlipayBindResult) obj);
            }
        }, new Function1() { // from class: o60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unBind$lambda$3(this.f28779a, (ApiException) obj);
            }
        });
    }

    public final void unbindGoogleFit() {
        this.isLoadingLiveData.setValue(Boolean.TRUE);
        getMAccessRequest().unbindThirdParty("google", new Function1() { // from class: e70
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unbindGoogleFit$lambda$21(this.f16336a, (ThirdPartyUnbindResultModel) obj);
            }
        }, new Function1() { // from class: f70
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unbindGoogleFit$lambda$22(this.f17477a, (ApiException) obj);
            }
        });
    }

    public final void unbindStrava() {
        AnyExtKt.main$default(null, new C17311(null), 1, null);
        getMAccessRequest().unbindStrava(new Function1() { // from class: i60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unbindStrava$lambda$12(this.f20821a, (MiscModel.StravaBindResult) obj);
            }
        }, new Function1() { // from class: j60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unbindStrava$lambda$13(this.f22452a, (ApiException) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
    }

    public final void unbindWechat(@NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getMAccessRequest().unBindWechat(new Function1() { // from class: w60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unbindWechat$lambda$15(this.f37649a, callback, (BoolRetResult) obj);
            }
        }, new Function1() { // from class: y60
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccessViewModel.unbindWechat$lambda$16(this.f39824a, (ApiException) obj);
            }
        });
    }
}
