package com.xiaomi.fitness.rn.share.request;

import android.text.TextUtils;
import com.smarthome.core.SmartHomeSDK;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeViewModel;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import com.xiaomi.fitness.rn.sdk.MiJiaSDKCompat;
import com.xiaomi.fitness.rn.share.bean.AcceptItemBean;
import com.xiaomi.fitness.rn.share.bean.AcceptListResult;
import com.xiaomi.fitness.rn.share.bean.AcceptResult;
import com.xiaomi.fitness.rn.share.bean.CancelShareBean;
import com.xiaomi.fitness.rn.share.bean.CancelShareResult;
import com.xiaomi.fitness.rn.share.bean.DeleteShareBean;
import com.xiaomi.fitness.rn.share.bean.DeleteShareGetBean;
import com.xiaomi.fitness.rn.share.bean.DeleteShareResult;
import com.xiaomi.fitness.rn.share.bean.DeviceListShareUserListGetBean;
import com.xiaomi.fitness.rn.share.bean.DeviceListShareUserListResult;
import com.xiaomi.fitness.rn.share.bean.DeviceListUserBean;
import com.xiaomi.fitness.rn.share.bean.ShareResult;
import com.xiaomi.fitness.rn.share.bean.UserListBean;
import com.xiaomi.fitness.rn.share.bean.UserListBeanResult;
import com.xiaomi.fitness.rn.share.bean.UserListGetBean;
import com.xiaomi.fitness.rn.share.ui.DeviceShareActivity;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import defpackage.vo6;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rJf\u0010\u0013\u001a\u00020\u00052$\u0010\t\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014\u0012\u0004\u0012\u00020\u00050\n28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rJi\u0010\u0017\u001a\u00020\u00052'\u0010\t\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00050\n28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rJs\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00050\n28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rJq\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\t\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001f0\u0015¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00050\n28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rJd\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rJ\\\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n28\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\r¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/rn/share/request/MijiaRequest;", "", "<init>", "()V", "shareDevice", "", "did", "", AuthorizeActivityBase.KEY_USERID, "success", "Lkotlin/Function1;", "", "error", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "code", "msg", "mineDeviceShareUser", "", "", "Lcom/xiaomi/fitness/rn/share/bean/DeviceListUserBean;", "loadAcceptList", "Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;", DeviceShareActivity.sPageAcceptList, PrivacyAgreeModel.TYPE_ACCEPT, "inv_id", "isAccept", "isSuccess", "loadDeviceShareList", "Lcom/xiaomi/fitness/rn/share/bean/UserListBean;", "userList", "deleteShare", "cancelShare", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMijiaRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n+ 2 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat\n*L\n1#1,162:1\n104#2,12:163\n160#2:175\n104#2,12:176\n160#2:188\n104#2,12:189\n160#2:201\n104#2,12:202\n160#2:214\n104#2,12:215\n160#2:227\n104#2,12:228\n160#2:240\n104#2,12:241\n160#2:253\n*S KotlinDebug\n*F\n+ 1 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n26#1:163,12\n26#1:175\n46#1:176,12\n46#1:188\n61#1:189,12\n61#1:201\n77#1:202,12\n77#1:214\n99#1:215,12\n99#1:227\n120#1:228,12\n120#1:240\n147#1:241,12\n147#1:253\n*E\n"})
public final class MijiaRequest {

    @NotNull
    public static final MijiaRequest INSTANCE = new MijiaRequest();

    private MijiaRequest() {
    }

    public final void accept(@NotNull String inv_id, boolean isAccept, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(inv_id, "inv_id");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MiJiaSDKCompat.INSTANCE.getInstance();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("inv_id", inv_id);
        pairArr[1] = TuplesKt.to("msgid", "1");
        pairArr[2] = TuplesKt.to("value", isAccept ? PrivacyAgreeModel.TYPE_ACCEPT : "reject");
        HashMap mapHashMapOf = MapsKt__MapsKt.hashMapOf(pairArr);
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapHashMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/share/share_response";
        if (!StringsKt__StringsJVMKt.startsWith$default("/share/share_response", "/v2", false, 2, null)) {
            str = "/v2/share/share_response";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$1", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,129:1\n89#2,3:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    String message = ((BaseBean) this.$t.element).getMessage();
                    vo6.a("accept code:" + code + " msg:" + message);
                    this.$error$inlined.invoke(Boxing.boxInt(code), message);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$2", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,134:1\n82#2,7:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$success$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AcceptResult acceptResult = (AcceptResult) this.$t.element;
                    vo6.a("accept success " + (acceptResult != null ? Boxing.boxBoolean(acceptResult.getResult()) : null));
                    if ((acceptResult != null ? Boxing.boxBoolean(acceptResult.getResult()) : null) != null) {
                        this.$success$inlined.invoke2(Boxing.boxBoolean(acceptResult.getResult()));
                    } else {
                        this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$3", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,139:1\n89#2,3:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    vo6.a("accept code:-1 msg:" + ((String) null));
                    this.$error$inlined.invoke(Boxing.boxInt(-1), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$4", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,145:1\n82#2,7:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$success$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    vo6.a("accept success " + ((Object) null));
                    this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$accept$$inlined$http$1$5", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,157:1\n89#2,3:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        String detail = this.$error.getDetail();
                        vo6.a("accept code:" + code + " msg:" + detail);
                        this.$error$inlined.invoke(Boxing.boxInt(code), detail);
                    } else {
                        vo6.a("accept code:" + SwitchWearModeViewModel.EXIT_ACCESSORY_MODE + " msg:" + ((String) null));
                        this.$error$inlined.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error2) {
                Integer numValueOf = error2 != null ? Integer.valueOf(error2.getCode()) : null;
                String detail = error2 != null ? error2.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new AnonymousClass5(error2, null, error), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) AcceptResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, success), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, error), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, error), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, success), 1, null);
            }
        });
    }

    public final void cancelShare(@NotNull String did, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MiJiaSDKCompat.INSTANCE.getInstance();
        HashMap mapHashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.to("did", did), TuplesKt.to("pid", 0));
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapHashMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/share/cancel";
        if (!StringsKt__StringsJVMKt.startsWith$default("/share/cancel", "/v2", false, 2, null)) {
            str = "/v2/share/cancel";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$1", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,129:1\n157#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$error$inlined.invoke(Boxing.boxInt(code), ((BaseBean) this.$t.element).getMessage());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$2", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,134:1\n151#2,6:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$success$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CancelShareResult cancelShareResult = (CancelShareResult) this.$t.element;
                    if ((cancelShareResult != null ? cancelShareResult.getResult() : null) != null) {
                        Function1 function1 = this.$success$inlined;
                        CancelShareBean result = cancelShareResult.getResult();
                        Intrinsics.checkNotNull(result);
                        function1.invoke2(Boxing.boxBoolean(result.getRet() == 0));
                    } else {
                        this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$3", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,139:1\n157#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$error$inlined.invoke(Boxing.boxInt(-1), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$4", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,145:1\n151#2,6:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$success$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$cancelShare$$inlined$http$1$5", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,157:1\n157#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$error$inlined.invoke(Boxing.boxInt(code), this.$error.getDetail());
                    } else {
                        this.$error$inlined.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error2) {
                Integer numValueOf = error2 != null ? Integer.valueOf(error2.getCode()) : null;
                String detail = error2 != null ? error2.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new AnonymousClass5(error2, null, error), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) CancelShareResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, success), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, error), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, error), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, success), 1, null);
            }
        });
    }

    public final void deleteShare(@NotNull String did, @NotNull String userid, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(userid, "userid");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MiJiaSDKCompat.INSTANCE.getInstance();
        HashMap mapHashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.to("list", CollectionsKt__CollectionsKt.arrayListOf(MapsKt__MapsKt.hashMapOf(TuplesKt.to("did", did), TuplesKt.to("pid", 0), TuplesKt.to(AuthorizeActivityBase.KEY_USERID, CollectionsKt__CollectionsKt.arrayListOf(userid))))));
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapHashMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/share/delete_user";
        if (!StringsKt__StringsJVMKt.startsWith$default("/share/delete_user", "/v2", false, 2, null)) {
            str = "/v2/share/delete_user";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$1", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,129:1\n138#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$error$inlined.invoke(Boxing.boxInt(code), ((BaseBean) this.$t.element).getMessage());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$2", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,134:1\n127#2,11:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Function1 $success$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$success$inlined = function1;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$success$inlined, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DeleteShareResult deleteShareResult = (DeleteShareResult) this.$t.element;
                    if ((deleteShareResult != null ? deleteShareResult.getResult() : null) != null) {
                        DeleteShareGetBean result = deleteShareResult.getResult();
                        Intrinsics.checkNotNull(result);
                        List<DeleteShareBean> list = result.getList();
                        List<DeleteShareBean> list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            this.$error$inlined.invoke(Boxing.boxInt(-1), "");
                        } else {
                            this.$success$inlined.invoke2(Boxing.boxBoolean(list.get(0).isDeleteSuccess()));
                        }
                    } else {
                        this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$3", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,139:1\n138#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$error$inlined.invoke(Boxing.boxInt(-1), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$4", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,145:1\n127#2,11:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Function1 $success$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1, Function2 function2) {
                    super(2, continuation);
                    this.$success$inlined = function1;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$success$inlined, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$deleteShare$$inlined$http$1$5", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,157:1\n138#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$error$inlined.invoke(Boxing.boxInt(code), this.$error.getDetail());
                    } else {
                        this.$error$inlined.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error2) {
                Integer numValueOf = error2 != null ? Integer.valueOf(error2.getCode()) : null;
                String detail = error2 != null ? error2.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new AnonymousClass5(error2, null, error), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) DeleteShareResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, success, error), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, error), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, error), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, success, error), 1, null);
            }
        });
    }

    public final void loadAcceptList(@NotNull final Function1<? super List<AcceptItemBean>, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MiJiaSDKCompat.INSTANCE.getInstance();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(map);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/share/receive_share_list";
        if (!StringsKt__StringsJVMKt.startsWith$default("/share/receive_share_list", "/v2", false, 2, null)) {
            str = "/v2/share/receive_share_list";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$1", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,129:1\n68#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$error$inlined.invoke(Boxing.boxInt(code), ((BaseBean) this.$t.element).getMessage());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$2", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,134:1\n62#2,6:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$success$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AcceptListResult acceptListResult = (AcceptListResult) this.$t.element;
                    if ((acceptListResult != null ? acceptListResult.getResult() : null) != null) {
                        Function1 function1 = this.$success$inlined;
                        List<AcceptItemBean> result = acceptListResult.getResult();
                        Intrinsics.checkNotNull(result);
                        function1.invoke2(result);
                    } else {
                        this.$success$inlined.invoke2(new ArrayList());
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$3", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,139:1\n68#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$error$inlined.invoke(Boxing.boxInt(-1), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$4", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,145:1\n62#2,6:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$success$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success$inlined.invoke2(new ArrayList());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadAcceptList$$inlined$http$1$5", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,157:1\n68#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$error$inlined.invoke(Boxing.boxInt(code), this.$error.getDetail());
                    } else {
                        this.$error$inlined.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error2) {
                Integer numValueOf = error2 != null ? Integer.valueOf(error2.getCode()) : null;
                String detail = error2 != null ? error2.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new AnonymousClass5(error2, null, error), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) AcceptListResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, success), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, error), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, error), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, success), 1, null);
            }
        });
    }

    public final void loadDeviceShareList(@NotNull String did, @NotNull final Function1<? super List<UserListBean>, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MiJiaSDKCompat.INSTANCE.getInstance();
        HashMap mapHashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.to("did", did), TuplesKt.to("pid", 0));
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapHashMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/share/get_share_user";
        if (!StringsKt__StringsJVMKt.startsWith$default("/share/get_share_user", "/v2", false, 2, null)) {
            str = "/v2/share/get_share_user";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$1", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,129:1\n109#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$error$inlined.invoke(Boxing.boxInt(code), ((BaseBean) this.$t.element).getMessage());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$2", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,134:1\n103#2,6:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$success$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UserListBeanResult userListBeanResult = (UserListBeanResult) this.$t.element;
                    if ((userListBeanResult != null ? userListBeanResult.getResult() : null) != null) {
                        Function1 function1 = this.$success$inlined;
                        UserListGetBean result = userListBeanResult.getResult();
                        Intrinsics.checkNotNull(result);
                        List<UserListBean> list = result.getList();
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        function1.invoke2(list);
                    } else {
                        this.$success$inlined.invoke2(new ArrayList());
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$3", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,139:1\n109#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$error$inlined.invoke(Boxing.boxInt(-1), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$4", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,145:1\n103#2,6:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$success$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success$inlined.invoke2(new ArrayList());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$loadDeviceShareList$$inlined$http$1$5", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,157:1\n109#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$error$inlined.invoke(Boxing.boxInt(code), this.$error.getDetail());
                    } else {
                        this.$error$inlined.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error2) {
                Integer numValueOf = error2 != null ? Integer.valueOf(error2.getCode()) : null;
                String detail = error2 != null ? error2.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new AnonymousClass5(error2, null, error), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) UserListBeanResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, success), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, error), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, error), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, success), 1, null);
            }
        });
    }

    public final void mineDeviceShareUser(@NotNull final Function1<? super Map<String, ? extends List<DeviceListUserBean>>, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MiJiaSDKCompat.INSTANCE.getInstance();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(map);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/share/device_share_list";
        if (!StringsKt__StringsJVMKt.startsWith$default("/share/device_share_list", "/v2", false, 2, null)) {
            str = "/v2/share/device_share_list";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$1", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,129:1\n53#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$error$inlined.invoke(Boxing.boxInt(code), ((BaseBean) this.$t.element).getMessage());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$2", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,134:1\n47#2,6:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$success$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DeviceListShareUserListResult deviceListShareUserListResult = (DeviceListShareUserListResult) this.$t.element;
                    if ((deviceListShareUserListResult != null ? deviceListShareUserListResult.getResult() : null) != null) {
                        Function1 function1 = this.$success$inlined;
                        DeviceListShareUserListGetBean result = deviceListShareUserListResult.getResult();
                        Intrinsics.checkNotNull(result);
                        function1.invoke2(result.getList());
                    } else {
                        this.$success$inlined.invoke2(MapsKt__MapsKt.emptyMap());
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$3", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,139:1\n53#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$error$inlined.invoke(Boxing.boxInt(-1), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$4", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,145:1\n47#2,6:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$success$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$success$inlined.invoke2(MapsKt__MapsKt.emptyMap());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$mineDeviceShareUser$$inlined$http$1$5", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,157:1\n53#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$error$inlined.invoke(Boxing.boxInt(code), this.$error.getDetail());
                    } else {
                        this.$error$inlined.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error2) {
                Integer numValueOf = error2 != null ? Integer.valueOf(error2.getCode()) : null;
                String detail = error2 != null ? error2.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new AnonymousClass5(error2, null, error), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) DeviceListShareUserListResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, success), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, error), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, error), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, success), 1, null);
            }
        });
    }

    public final void shareDevice(@NotNull String did, @NotNull String userid, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function2<? super Integer, ? super String, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(userid, "userid");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        MiJiaSDKCompat.INSTANCE.getInstance();
        HashMap mapHashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.to("type", ""), TuplesKt.to("did", did), TuplesKt.to(AuthorizeActivityBase.KEY_USERID, userid));
        ArrayList arrayList = new ArrayList();
        String strA = xpd.a(mapHashMapOf);
        arrayList.add(new KeyValuePair("data", strA));
        String str = "/share/share_request";
        if (!StringsKt__StringsJVMKt.startsWith$default("/share/share_request", "/v2", false, 2, null)) {
            str = "/v2/share/share_request";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("request realUrl ");
        sb.append(str);
        sb.append("  ");
        sb.append(strA);
        final NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
        SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$1", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,129:1\n38#2,2:130\n*E\n"})
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Ref.ObjectRef objectRef, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$t, continuation, this.$error$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int code = ((BaseBean) this.$t.element).getCode();
                    this.$error$inlined.invoke(Boxing.boxInt(code), ((BaseBean) this.$t.element).getMessage());
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$2", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$2\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,134:1\n31#2,7:135\n*E\n"})
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                final /* synthetic */ Ref.ObjectRef $t;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Ref.ObjectRef objectRef, Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$t = objectRef;
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$t, continuation, this.$success$inlined);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ShareResult shareResult = (ShareResult) this.$t.element;
                    String result = shareResult != null ? shareResult.getResult() : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("request resultBean ");
                    sb.append(result);
                    if ((shareResult != null ? shareResult.getResult() : null) != null) {
                        this.$success$inlined.invoke2(Boxing.boxBoolean(Intrinsics.areEqual(shareResult != null ? shareResult.getResult() : null, "true")));
                    } else {
                        this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$3", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$3\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,139:1\n38#2,2:140\n*E\n"})
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$error$inlined.invoke(Boxing.boxInt(-1), null);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$4", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onSuccess$4\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,145:1\n31#2,7:146\n*E\n"})
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1 $success$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(Continuation continuation, Function1 function1) {
                    super(2, continuation);
                    this.$success$inlined = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(continuation, this.$success$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    StringBuilder sb = new StringBuilder();
                    sb.append("request resultBean ");
                    sb.append((String) null);
                    this.$success$inlined.invoke2(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.MijiaRequest$shareDevice$$inlined$http$1$5", f = "MijiaRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nMiJiaSDKCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiJiaSDKCompat.kt\ncom/xiaomi/fitness/rn/sdk/MiJiaSDKCompat$http$1$onFailure$1\n+ 2 MijiaRequest.kt\ncom/xiaomi/fitness/rn/share/request/MijiaRequest\n*L\n1#1,157:1\n38#2,2:158\n*E\n"})
            public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NetError $error;
                final /* synthetic */ Function2 $error$inlined;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(NetError netError, Continuation continuation, Function2 function2) {
                    super(2, continuation);
                    this.$error = netError;
                    this.$error$inlined = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass5(this.$error, continuation, this.$error$inlined);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NetError netError = this.$error;
                    if (netError != null) {
                        int code = netError.getCode();
                        this.$error$inlined.invoke(Boxing.boxInt(code), this.$error.getDetail());
                    } else {
                        this.$error$inlined.invoke(Boxing.boxInt(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE), null);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult p0) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError error2) {
                Integer numValueOf = error2 != null ? Integer.valueOf(error2.getCode()) : null;
                String detail = error2 != null ? error2.getDetail() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onFailure ");
                sb2.append(numValueOf);
                sb2.append(" ");
                sb2.append(detail);
                AnyExtKt.main$default(null, new AnonymousClass5(error2, null, error), 1, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.Object] */
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netRequestBuild != null) {
                    Intrinsics.checkNotNull(netResult);
                    if (!TextUtils.isEmpty(netResult.mResponse)) {
                        String str2 = netResult.mResponse;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onSuccess mResponse:");
                        sb2.append(str2);
                        try {
                            String str3 = netResult.mResponse;
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            ?? FromJson = MiJiaSDKCompat.INSTANCE.getGson().fromJson(str3, (Class<??>) ShareResult.class);
                            objectRef.element = FromJson;
                            if (((BaseBean) FromJson).isSuccess()) {
                                AnyExtKt.main$default(null, new AnonymousClass2(objectRef, null, success), 1, null);
                                return;
                            }
                            int code = ((BaseBean) objectRef.element).getCode();
                            String message = ((BaseBean) objectRef.element).getMessage();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("onSuccess not  ");
                            sb3.append(code);
                            sb3.append("  ");
                            sb3.append(message);
                            AnyExtKt.main$default(null, new AnonymousClass1(objectRef, null, error), 1, null);
                            return;
                        } catch (Exception e) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("onSuccess ");
                            sb4.append(e);
                            AnyExtKt.main$default(null, new AnonymousClass3(null, error), 1, null);
                            return;
                        }
                    }
                }
                AnyExtKt.main$default(null, new AnonymousClass4(null, success), 1, null);
            }
        });
    }
}
