package com.xiaomi.hm.health.device.webapi.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.webapi.device.api.NewDeviceBindApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0003\f\u000b\rB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI;", "", "Lcom/huami/network/base/model/HMHttpResponseData;", "item", "Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$Result;", "a", "Lcom/xiaomi/hm/health/device/webapi/device/HMWebBindInfo;", "bindInfo", "bindDevice", "<init>", "()V", "Companion", "AdditionInfo", "Result", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NewDeviceWebAPI {

    @NotNull
    private static final String a = "NewDeviceWebAPI";

    @NotNull
    private static final String b = "additionalInfo";

    @NotNull
    private static final String c = "color_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Result d = new Result(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$AdditionInfo;", "", "", "component1", "colorId", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getColorId", "()I", "<init>", "(I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class AdditionInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int colorId;

        public AdditionInfo(int i) {
            this.colorId = i;
        }

        public static /* synthetic */ AdditionInfo copy$default(AdditionInfo additionInfo, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = additionInfo.colorId;
            }
            return additionInfo.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getColorId() {
            return this.colorId;
        }

        @NotNull
        public final AdditionInfo copy(int colorId) {
            return new AdditionInfo(colorId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdditionInfo) && this.colorId == ((AdditionInfo) other).colorId;
        }

        public final int getColorId() {
            return this.colorId;
        }

        public int hashCode() {
            return this.colorId;
        }

        @NotNull
        public String toString() {
            return "AdditionInfo(colorId=" + this.colorId + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$Companion;", "", "Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$Result;", "fail", "Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$Result;", "getFail", "()Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$Result;", "getFail$annotations", "()V", "", "KEY_ADDITIONAL_INFO", "Ljava/lang/String;", "KEY_COLOR_ID", "TAG", "<init>", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getFail$annotations() {
        }

        @NotNull
        public final Result getFail() {
            return NewDeviceWebAPI.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$Result;", "", "", "component1", "Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$AdditionInfo;", "component2", "success", "additionInfo", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getSuccess", "()Z", "b", "Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$AdditionInfo;", "getAdditionInfo", "()Lcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$AdditionInfo;", "<init>", "(ZLcom/xiaomi/hm/health/device/webapi/device/NewDeviceWebAPI$AdditionInfo;)V", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final boolean success;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private final AdditionInfo additionInfo;

        public Result(boolean z, @Nullable AdditionInfo additionInfo) {
            this.success = z;
            this.additionInfo = additionInfo;
        }

        public static /* synthetic */ Result copy$default(Result result, boolean z, AdditionInfo additionInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                z = result.success;
            }
            if ((i & 2) != 0) {
                additionInfo = result.additionInfo;
            }
            return result.copy(z, additionInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdditionInfo getAdditionInfo() {
            return this.additionInfo;
        }

        @NotNull
        public final Result copy(boolean success, @Nullable AdditionInfo additionInfo) {
            return new Result(success, additionInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.success == result.success && Intrinsics.areEqual(this.additionInfo, result.additionInfo);
        }

        @Nullable
        public final AdditionInfo getAdditionInfo() {
            return this.additionInfo;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.success;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            AdditionInfo additionInfo = this.additionInfo;
            return i + (additionInfo == null ? 0 : additionInfo.hashCode());
        }

        @NotNull
        public String toString() {
            return "Result(success=" + this.success + ", additionInfo=" + this.additionInfo + ")";
        }

        public /* synthetic */ Result(boolean z, AdditionInfo additionInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : additionInfo);
        }

        public Result(boolean z) {
            this(z, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseResult error: " + this.a;
        }
    }

    private final Result a(HMHttpResponseData item) {
        Object objM3845constructorimpl;
        boolean z = item.getSuccess() && item.getStatusCode() == 200;
        byte[] responseBody = item.getResponseBody();
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl((!z || responseBody == null) ? new Result(z) : new Result(z, new AdditionInfo(new JSONObject(new JSONObject(new String(responseBody, Charsets.UTF_8)).getString(b)).getInt(c))));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(a, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        Result result = new Result(z);
        if (kotlin.Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = result;
        }
        return (Result) objM3845constructorimpl;
    }

    @NotNull
    public static final Result getFail() {
        return INSTANCE.getFail();
    }

    @NotNull
    public final Result bindDevice(@NotNull HMWebBindInfo bindInfo) throws JSONException {
        final HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        new NewDeviceBindApi().request(bindInfo, true, new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.webapi.device.NewDeviceWebAPI.bindDevice.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.device.NewDeviceWebAPI$bindDevice$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onCancel: " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.device.NewDeviceWebAPI$bindDevice$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onCompleted";
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.device.NewDeviceWebAPI$bindDevice$2$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onError: " + this.a;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.device.NewDeviceWebAPI$bindDevice$2$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onItem: " + this.a;
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
                HMLog.info(NewDeviceWebAPI.a, new a(type));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
                HMLog.info(NewDeviceWebAPI.a, b.a);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.error$default(NewDeviceWebAPI.a, null, null, new c(throwable), 6, null);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                HMLog.info(NewDeviceWebAPI.a, new d(item));
                if (item != null) {
                    hMHttpResponseData.copy(item);
                }
            }
        });
        return a(hMHttpResponseData);
    }
}
