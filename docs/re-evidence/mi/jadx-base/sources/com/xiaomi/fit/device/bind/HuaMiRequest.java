package com.xiaomi.fit.device.bind;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.device.bind.HuaMiRequest;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001f !\"#B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JQ\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\f`\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000f¢\u0006\u0002\u0010\u0011JG\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142,\u0010\n\u001a(\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00060\rj\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0016`\u000b¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bJI\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\f`\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000f¢\u0006\u0002\u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fit/device/bind/HuaMiService;", "<init>", "()V", "checkDeviceBind", "", "mac", "", "model", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "batchCheckDeviceBind", "devices", "", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$CheckedDevice;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getServerSign", "random", "publicKey", "bindDevice", "data", "Lcom/xiaomi/fit/device/bind/BindRequestData;", "(Lcom/xiaomi/fit/device/bind/BindRequestData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "CheckBind", "ServerSign", "BindCode", "BatchCheckBind", "CheckedDevice", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuaMiRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaMiRequest.kt\ncom/xiaomi/fit/device/bind/HuaMiRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,119:1\n89#2,5:120\n89#2,5:125\n89#2,5:130\n89#2,5:135\n*S KotlinDebug\n*F\n+ 1 HuaMiRequest.kt\ncom/xiaomi/fit/device/bind/HuaMiRequest\n*L\n26#1:120,5\n42#1:125,5\n60#1:130,5\n82#1:135,5\n*E\n"})
public final class HuaMiRequest extends BaseRequest<HuaMiService> {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiRequest$BatchCheckBind;", "", "deviceList", "", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$CheckedDevice;", "<init>", "(Ljava/util/List;)V", "getDeviceList", "()Ljava/util/List;", "setDeviceList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BatchCheckBind {

        @SerializedName(alternate = {"bind_status_list"}, value = "check_bind_list")
        @NotNull
        private List<CheckedDevice> deviceList;

        public BatchCheckBind(@NotNull List<CheckedDevice> deviceList) {
            Intrinsics.checkNotNullParameter(deviceList, "deviceList");
            this.deviceList = deviceList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BatchCheckBind copy$default(BatchCheckBind batchCheckBind, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = batchCheckBind.deviceList;
            }
            return batchCheckBind.copy(list);
        }

        @NotNull
        public final List<CheckedDevice> component1() {
            return this.deviceList;
        }

        @NotNull
        public final BatchCheckBind copy(@NotNull List<CheckedDevice> deviceList) {
            Intrinsics.checkNotNullParameter(deviceList, "deviceList");
            return new BatchCheckBind(deviceList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BatchCheckBind) && Intrinsics.areEqual(this.deviceList, ((BatchCheckBind) other).deviceList);
        }

        @NotNull
        public final List<CheckedDevice> getDeviceList() {
            return this.deviceList;
        }

        public int hashCode() {
            return this.deviceList.hashCode();
        }

        public final void setDeviceList(@NotNull List<CheckedDevice> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.deviceList = list;
        }

        @NotNull
        public String toString() {
            return "BatchCheckBind(deviceList=" + this.deviceList + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiRequest$BindCode;", "", "bindCode", "", "<init>", "(I)V", "getBindCode", "()I", "setBindCode", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BindCode {

        @SerializedName("bind_code")
        private int bindCode;

        public BindCode(int i) {
            this.bindCode = i;
        }

        public static /* synthetic */ BindCode copy$default(BindCode bindCode, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bindCode.bindCode;
            }
            return bindCode.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getBindCode() {
            return this.bindCode;
        }

        @NotNull
        public final BindCode copy(int bindCode) {
            return new BindCode(bindCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindCode) && this.bindCode == ((BindCode) other).bindCode;
        }

        public final int getBindCode() {
            return this.bindCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.bindCode);
        }

        public final void setBindCode(int i) {
            this.bindCode = i;
        }

        @NotNull
        public String toString() {
            return "BindCode(bindCode=" + this.bindCode + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0006\"\u0004\b\u0007\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiRequest$CheckBind;", "", "isBind", "", "<init>", "(Z)V", "()Z", "setBind", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckBind {

        @SerializedName("is_bind")
        private boolean isBind;

        public CheckBind() {
            this(false, 1, null);
        }

        public static /* synthetic */ CheckBind copy$default(CheckBind checkBind, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = checkBind.isBind;
            }
            return checkBind.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsBind() {
            return this.isBind;
        }

        @NotNull
        public final CheckBind copy(boolean isBind) {
            return new CheckBind(isBind);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckBind) && this.isBind == ((CheckBind) other).isBind;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isBind);
        }

        public final boolean isBind() {
            return this.isBind;
        }

        public final void setBind(boolean z) {
            this.isBind = z;
        }

        @NotNull
        public String toString() {
            return "CheckBind(isBind=" + this.isBind + ")";
        }

        public CheckBind(boolean z) {
            this.isBind = z;
        }

        public /* synthetic */ CheckBind(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiRequest$ServerSign;", "", "sign", "", "<init>", "(Ljava/lang/String;)V", "getSign", "()Ljava/lang/String;", "setSign", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerSign {

        @SerializedName("server_sign")
        @NotNull
        private String sign;

        public ServerSign(@NotNull String sign) {
            Intrinsics.checkNotNullParameter(sign, "sign");
            this.sign = sign;
        }

        public static /* synthetic */ ServerSign copy$default(ServerSign serverSign, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverSign.sign;
            }
            return serverSign.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSign() {
            return this.sign;
        }

        @NotNull
        public final ServerSign copy(@NotNull String sign) {
            Intrinsics.checkNotNullParameter(sign, "sign");
            return new ServerSign(sign);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ServerSign) && Intrinsics.areEqual(this.sign, ((ServerSign) other).sign);
        }

        @NotNull
        public final String getSign() {
            return this.sign;
        }

        public int hashCode() {
            return this.sign.hashCode();
        }

        public final void setSign(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.sign = str;
        }

        @NotNull
        public String toString() {
            return "ServerSign(sign=" + this.sign + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.HuaMiRequest$batchCheckDeviceBind$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$BatchCheckBind;", "it", "Lcom/xiaomi/fit/device/bind/HuaMiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.HuaMiRequest$batchCheckDeviceBind$1", f = "HuaMiRequest.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<HuaMiService, Continuation<? super BaseResult<BatchCheckBind>>, Object> {
        final /* synthetic */ List<CheckedDevice> $devices;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HuaMiRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<CheckedDevice> list, HuaMiRequest huaMiRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$devices = list;
            this.this$0 = huaMiRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$devices, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HuaMiService huaMiService, Continuation<? super BaseResult<BatchCheckBind>> continuation) {
            return ((AnonymousClass1) create(huaMiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HuaMiService huaMiService = (HuaMiService) this.L$0;
                String json = this.this$0.getMGson().toJson(new BatchCheckBind(this.$devices));
                Intrinsics.checkNotNull(json);
                this.label = 1;
                obj = huaMiService.batchCheckDeviceBind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.HuaMiRequest$bindDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$BindCode;", "it", "Lcom/xiaomi/fit/device/bind/HuaMiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.HuaMiRequest$bindDevice$1", f = "HuaMiRequest.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15091 extends SuspendLambda implements Function2<HuaMiService, Continuation<? super BaseResult<BindCode>>, Object> {
        final /* synthetic */ BindRequestData $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15091(BindRequestData bindRequestData, Continuation<? super C15091> continuation) {
            super(2, continuation);
            this.$data = bindRequestData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C15091 c15091 = HuaMiRequest.this.new C15091(this.$data, continuation);
            c15091.L$0 = obj;
            return c15091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HuaMiService huaMiService, Continuation<? super BaseResult<BindCode>> continuation) {
            return ((C15091) create(huaMiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HuaMiService huaMiService = (HuaMiService) this.L$0;
                String currentLocale = LocaleUtil.getCurrentLocale();
                String json = HuaMiRequest.this.getMGson().toJson(this.$data);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = huaMiService.bindDevice(currentLocale, json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.HuaMiRequest$checkDeviceBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$CheckBind;", "it", "Lcom/xiaomi/fit/device/bind/HuaMiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.HuaMiRequest$checkDeviceBind$1", f = "HuaMiRequest.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15101 extends SuspendLambda implements Function2<HuaMiService, Continuation<? super BaseResult<CheckBind>>, Object> {
        final /* synthetic */ String $mac;
        final /* synthetic */ String $model;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HuaMiRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15101(String str, String str2, HuaMiRequest huaMiRequest, Continuation<? super C15101> continuation) {
            super(2, continuation);
            this.$mac = str;
            this.$model = str2;
            this.this$0 = huaMiRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C15101 c15101 = new C15101(this.$mac, this.$model, this.this$0, continuation);
            c15101.L$0 = obj;
            return c15101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HuaMiService huaMiService, Continuation<? super BaseResult<CheckBind>> continuation) {
            return ((C15101) create(huaMiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HuaMiService huaMiService = (HuaMiService) this.L$0;
                HashMap map = new HashMap();
                map.put("mac_address", this.$mac);
                map.put("model", this.$model);
                String json = this.this$0.getMGson().toJson(map);
                Intrinsics.checkNotNull(json);
                this.label = 1;
                obj = huaMiService.checkDeviceBind(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.device.bind.HuaMiRequest$getServerSign$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fit/device/bind/HuaMiRequest$ServerSign;", "it", "Lcom/xiaomi/fit/device/bind/HuaMiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.device.bind.HuaMiRequest$getServerSign$1", f = "HuaMiRequest.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15111 extends SuspendLambda implements Function2<HuaMiService, Continuation<? super BaseResult<ServerSign>>, Object> {
        final /* synthetic */ String $mac;
        final /* synthetic */ String $publicKey;
        final /* synthetic */ String $random;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HuaMiRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15111(String str, String str2, String str3, HuaMiRequest huaMiRequest, Continuation<? super C15111> continuation) {
            super(2, continuation);
            this.$mac = str;
            this.$random = str2;
            this.$publicKey = str3;
            this.this$0 = huaMiRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C15111 c15111 = new C15111(this.$mac, this.$random, this.$publicKey, this.this$0, continuation);
            c15111.L$0 = obj;
            return c15111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HuaMiService huaMiService, Continuation<? super BaseResult<ServerSign>> continuation) {
            return ((C15111) create(huaMiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HuaMiService huaMiService = (HuaMiService) this.L$0;
                HashMap map = new HashMap();
                map.put("mac", this.$mac);
                map.put("random", this.$random);
                map.put("publicKeyHashString", this.$publicKey);
                map.put("hash_algo", Boxing.boxInt(0));
                StringBuilder sb = new StringBuilder();
                sb.append("getServerSign: params=");
                sb.append(map);
                String json = this.this$0.getMGson().toJson(map);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = huaMiService.getServerSign(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit batchCheckDeviceBind$lambda$1(Function1 success, ApiException it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e("HuaMiRequest", "batchCheckDeviceBind: error=" + it);
        success.invoke2(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit batchCheckDeviceBind$lambda$2(Function1 success, BatchCheckBind it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it.getDeviceList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDevice$lambda$5(Function1 success, Function1 fail, BindCode it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getBindCode() == 1) {
            success.invoke2(Boolean.TRUE);
        } else {
            fail.invoke2(new ApiException("华米设备绑定失败", 0, 2, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkDeviceBind$lambda$0(Function1 success, Function1 fail, CheckBind it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isBind()) {
            success.invoke2(Boolean.TRUE);
        } else {
            fail.invoke2(new ApiException("未绑定", 0, 2, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getServerSign$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("getServerSign: ");
        sb.append(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    public static final Unit getServerSign$lambda$4(Ref.ObjectRef sign, CountDownLatch countDownLatch, ServerSign it) {
        Intrinsics.checkNotNullParameter(sign, "$sign");
        Intrinsics.checkNotNullParameter(countDownLatch, "$countDownLatch");
        Intrinsics.checkNotNullParameter(it, "it");
        sign.element = it.getSign();
        countDownLatch.countDown();
        return Unit.INSTANCE;
    }

    public final void batchCheckDeviceBind(@NotNull List<CheckedDevice> devices, @NotNull final Function1<? super List<CheckedDevice>, Unit> success) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(success, "success");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(devices, this, null)).error(new Function1() { // from class: pic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiRequest.batchCheckDeviceBind$lambda$1(success, (ApiException) obj);
            }
        }).success(new Function1() { // from class: qic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiRequest.batchCheckDeviceBind$lambda$2(success, (HuaMiRequest.BatchCheckBind) obj);
            }
        });
    }

    public final void bindDevice(@NotNull BindRequestData data, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C15091(data, null)).error(fail).success(new Function1() { // from class: oic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiRequest.bindDevice$lambda$5(success, fail, (HuaMiRequest.BindCode) obj);
            }
        });
    }

    public final void checkDeviceBind(@NotNull String mac, @NotNull String model, @NotNull final Function1<? super Boolean, Unit> success, @NotNull final Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C15101(mac, model, this, null)).error(fail).success(new Function1() { // from class: lic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiRequest.checkDeviceBind$lambda$0(success, fail, (HuaMiRequest.CheckBind) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String getServerSign(@NotNull String mac, @NotNull String random, @NotNull String publicKey) throws InterruptedException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C15111(mac, random, publicKey, this, null)).error(new Function1() { // from class: mic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiRequest.getServerSign$lambda$3((ApiException) obj);
            }
        }).success(new Function1() { // from class: nic
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuaMiRequest.getServerSign$lambda$4(objectRef, countDownLatch, (HuaMiRequest.ServerSign) obj);
            }
        });
        countDownLatch.await();
        return (String) objectRef.element;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/device/bind/HuaMiRequest$CheckedDevice;", "", "macAddress", "", "deviceSource", "", "isBind", "", "<init>", "(Ljava/lang/String;IZ)V", "getMacAddress", "()Ljava/lang/String;", "setMacAddress", "(Ljava/lang/String;)V", "getDeviceSource", "()I", "setDeviceSource", "(I)V", "()Z", "setBind", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckedDevice {

        @SerializedName("device_source")
        private int deviceSource;

        @SerializedName("is_bind")
        private boolean isBind;

        @SerializedName("mac_address")
        @NotNull
        private String macAddress;

        public CheckedDevice(@NotNull String macAddress, int i, boolean z) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            this.macAddress = macAddress;
            this.deviceSource = i;
            this.isBind = z;
        }

        public static /* synthetic */ CheckedDevice copy$default(CheckedDevice checkedDevice, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = checkedDevice.macAddress;
            }
            if ((i2 & 2) != 0) {
                i = checkedDevice.deviceSource;
            }
            if ((i2 & 4) != 0) {
                z = checkedDevice.isBind;
            }
            return checkedDevice.copy(str, i, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMacAddress() {
            return this.macAddress;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDeviceSource() {
            return this.deviceSource;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsBind() {
            return this.isBind;
        }

        @NotNull
        public final CheckedDevice copy(@NotNull String macAddress, int deviceSource, boolean isBind) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            return new CheckedDevice(macAddress, deviceSource, isBind);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckedDevice)) {
                return false;
            }
            CheckedDevice checkedDevice = (CheckedDevice) other;
            return Intrinsics.areEqual(this.macAddress, checkedDevice.macAddress) && this.deviceSource == checkedDevice.deviceSource && this.isBind == checkedDevice.isBind;
        }

        public final int getDeviceSource() {
            return this.deviceSource;
        }

        @NotNull
        public final String getMacAddress() {
            return this.macAddress;
        }

        public int hashCode() {
            return (((this.macAddress.hashCode() * 31) + Integer.hashCode(this.deviceSource)) * 31) + Boolean.hashCode(this.isBind);
        }

        public final boolean isBind() {
            return this.isBind;
        }

        public final void setBind(boolean z) {
            this.isBind = z;
        }

        public final void setDeviceSource(int i) {
            this.deviceSource = i;
        }

        public final void setMacAddress(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.macAddress = str;
        }

        @NotNull
        public String toString() {
            return "CheckedDevice(macAddress=" + this.macAddress + ", deviceSource=" + this.deviceSource + ", isBind=" + this.isBind + ")";
        }

        public /* synthetic */ CheckedDevice(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? false : z);
        }
    }
}
