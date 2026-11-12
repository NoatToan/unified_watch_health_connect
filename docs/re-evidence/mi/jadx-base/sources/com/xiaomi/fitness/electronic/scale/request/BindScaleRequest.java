package com.xiaomi.fitness.electronic.scale.request;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.request.BindScaleRequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import dagger.hilt.android.EntryPointAccessors;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0003\u0010\u0004JJ\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010H\u0002JB\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0015Jh\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010JR\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010JZ\u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010J8\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010Jj\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010J,\u0010+\u001a\u00020\u00112\b\b\u0002\u0010,\u001a\u00020&2\b\b\u0002\u0010-\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020&H\u0086@¢\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u00101J&\u00102\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u00104JB\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010JN\u00107\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010JZ\u00109\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010;\u001a\u00020&2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010JD\u0010<\u001a\u00020\n2\b\b\u0002\u0010;\u001a\u00020&2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010JR\u0010=\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010J~\u0010>\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010?\u001a\u00020@2\u0006\u00106\u001a\u00020@2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010D\u001a\u00020&2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u000b\u001a\u00020\fJB\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020&2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00102\b\b\u0002\u0010\u000b\u001a\u00020\fJB\u0010G\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0010JR\u0010H\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010I\u001a\u00020\u00062\u0006\u00106\u001a\u00020@2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00102\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/request/BindScaleRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleService;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "getEcoApiProxy", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "eco_api", "params", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getEcoApiProxySync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bind", "bindIndex", "bindSign", "bindDid", "thirdNodeId", "peripheralId", "sn", "name", "shareBind", "shareId", "ecdh", "pubD", "signD", "shareEcdh", "hello", "mode", "", "did", "model", "mac", "randomD", "getEcoDevices", "page", "pageSize", "status", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShareListSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbind", "tokenKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAccountWhetherExist", Column.ACCOUNT_ID, "createShare", "userId", "acceptShare", "shareUserId", "type", "getShareList", "delShare", "addWeight", "uid", "", "createTime", "data", "dataVersion", "fromSource", "getAccountByWeight", "weightKg", "getVirtualAccount", "updateWeightToAccount", "weightTarget", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindScaleRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindScaleRequest.kt\ncom/xiaomi/fitness/electronic/scale/request/BindScaleRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,429:1\n110#2,2:430\n104#2,8:432\n141#2:440\n31#3:441\n28#3,2:442\n*S KotlinDebug\n*F\n+ 1 BindScaleRequest.kt\ncom/xiaomi/fitness/electronic/scale/request/BindScaleRequest\n*L\n33#1:430,2\n50#1:432,8\n66#1:440\n66#1:441\n66#1:442,2\n*E\n"})
public final class BindScaleRequest extends BaseRequest<ScaleService> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int SHARE_LIST_TYPE_SHARE_TO_ME = 2;
    public static final int SHARE_LIST_TYPE_SHARE_TO_OTHER = 1;

    @NotNull
    private final String TAG = "BindDeviceHm";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002JD\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000fJZ\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/request/BindScaleRequest$Companion;", "", "<init>", "()V", "SHARE_LIST_TYPE_SHARE_TO_OTHER", "", "SHARE_LIST_TYPE_SHARE_TO_ME", "isShareDeviceBind", "", "getShareList", "", "type", "scope", "Lkotlinx/coroutines/CoroutineScope;", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "error", "", "acceptShare", "userId", "shareUserId", "shareId", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void acceptShare$default(Companion companion, String str, String str2, String str3, int i, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i2, Object obj) throws JSONException {
            CoroutineScope netCoroutineScope;
            if ((i2 & 16) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            companion.acceptShare(str, str2, str3, i, netCoroutineScope, function1, (i2 & 64) != 0 ? new Function1() { // from class: go2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.Companion.acceptShare$lambda$2((String) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit acceptShare$lambda$2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit acceptShare$lambda$3(Function1 error, ApiException it) {
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(it, "it");
            error.invoke2(error.toString());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getShareList$default(Companion companion, int i, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i2, Object obj) throws JSONException {
            if ((i2 & 1) != 0) {
                i = 2;
            }
            if ((i2 & 2) != 0) {
                coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            }
            if ((i2 & 8) != 0) {
                function2 = new Function1() { // from class: fo2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return BindScaleRequest.Companion.getShareList$lambda$0((String) obj2);
                    }
                };
            }
            companion.getShareList(i, coroutineScope, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit getShareList$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit getShareList$lambda$1(Function1 error, ApiException it) {
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(it, "it");
            error.invoke2(error.toString());
            return Unit.INSTANCE;
        }

        private final boolean isShareDeviceBind() {
            return true;
        }

        public final void acceptShare(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull final Function1<? super String, Unit> error) throws JSONException {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
            Intrinsics.checkNotNullParameter(shareId, "shareId");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(error, "error");
            new BindScaleRequest().acceptShare(userId, shareUserId, shareId, type, scope, success, new Function1() { // from class: eo2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BindScaleRequest.Companion.acceptShare$lambda$3(error, (ApiException) obj);
                }
            });
        }

        public final void getShareList(int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull final Function1<? super String, Unit> error) throws JSONException {
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(error, "error");
            new BindScaleRequest().getShareList(type, scope, success, new Function1() { // from class: do2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BindScaleRequest.Companion.getShareList$lambda$1(error, (ApiException) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$getEcoApiProxy$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "it", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$getEcoApiProxy$2", f = "BindScaleRequest.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<ScaleService, Continuation<? super BaseResult<ScaleData>>, Object> {
        final /* synthetic */ Ref.ObjectRef<JSONObject> $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<JSONObject> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScaleService scaleService, Continuation<? super BaseResult<ScaleData>> continuation) {
            return ((AnonymousClass2) create(scaleService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScaleService scaleService = (ScaleService) this.L$0;
                String string = this.$data.element.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.label = 1;
                obj = scaleService.getEcoApiProxy(string, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$getEcoApiProxy$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "it", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$getEcoApiProxy$4", f = "BindScaleRequest.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<ScaleService, Continuation<? super BaseResult<ScaleData>>, Object> {
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(JSONObject jSONObject, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$data = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$data, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScaleService scaleService, Continuation<? super BaseResult<ScaleData>> continuation) {
            return ((AnonymousClass4) create(scaleService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScaleService scaleService = (ScaleService) this.L$0;
                String string = this.$data.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.label = 1;
                obj = scaleService.getEcoApiProxy(string, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$getEcoApiProxySync$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.BindScaleRequest", f = "BindScaleRequest.kt", i = {}, l = {66}, m = "getEcoApiProxySync", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return BindScaleRequest.this.getEcoApiProxySync(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$unbind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.BindScaleRequest", f = "BindScaleRequest.kt", i = {0}, l = {209}, m = "unbind", n = {"this"}, s = {"L$0"})
    public static final class C23811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C23811(Continuation<? super C23811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BindScaleRequest.this.unbind(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$unbind$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.request.BindScaleRequest$unbind$2", f = "BindScaleRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBindScaleRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindScaleRequest.kt\ncom/xiaomi/fitness/electronic/scale/request/BindScaleRequest$unbind$2\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,429:1\n141#2:430\n31#3:431\n28#3,2:432\n*S KotlinDebug\n*F\n+ 1 BindScaleRequest.kt\ncom/xiaomi/fitness/electronic/scale/request/BindScaleRequest$unbind$2\n*L\n211#1:430\n211#1:431\n211#1:432,2\n*E\n"})
    public static final class C23822 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseResult<ScaleData> $baseResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23822(BaseResult<ScaleData> baseResult, Continuation<? super C23822> continuation) {
            super(2, continuation);
            this.$baseResult = baseResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BindScaleRequest.this.new C23822(this.$baseResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(this.$baseResult);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void acceptShare$default(BindScaleRequest bindScaleRequest, String str, String str2, String str3, int i, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i2, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i2 & 16) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        bindScaleRequest.acceptShare(str, str2, str3, i, netCoroutineScope, function1, (i2 & 64) != 0 ? new Function1() { // from class: bo2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return BindScaleRequest.acceptShare$lambda$10((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptShare$lambda$10(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkAccountWhetherExist$default(BindScaleRequest bindScaleRequest, String str, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: nn2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.checkAccountWhetherExist$lambda$8((ApiException) obj2);
                }
            };
        }
        bindScaleRequest.checkAccountWhetherExist(str, coroutineScope, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAccountWhetherExist$lambda$8(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createShare$default(BindScaleRequest bindScaleRequest, String str, String str2, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i & 4) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        bindScaleRequest.createShare(str, str2, netCoroutineScope, function1, (i & 16) != 0 ? new Function1() { // from class: yn2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return BindScaleRequest.createShare$lambda$9((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createShare$lambda$9(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void delShare$default(BindScaleRequest bindScaleRequest, String str, String str2, String str3, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i & 8) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        bindScaleRequest.delShare(str, str2, str3, netCoroutineScope, function1, (i & 32) != 0 ? new Function1() { // from class: rn2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return BindScaleRequest.delShare$lambda$12((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit delShare$lambda$12(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void ecdh$default(BindScaleRequest bindScaleRequest, String str, String str2, String str3, String str4, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i & 16) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        bindScaleRequest.ecdh(str, str2, str3, str4, netCoroutineScope, function1, (i & 64) != 0 ? new Function1() { // from class: xn2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return BindScaleRequest.ecdh$lambda$4((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ecdh$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAccountByWeight$default(BindScaleRequest bindScaleRequest, int i, Function1 function1, Function1 function2, CoroutineScope coroutineScope, int i2, Object obj) throws JSONException {
        if ((i2 & 4) != 0) {
            function2 = new Function1() { // from class: zn2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.getAccountByWeight$lambda$13((ApiException) obj2);
                }
            };
        }
        if ((i2 & 8) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        bindScaleRequest.getAccountByWeight(i, function1, function2, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountByWeight$lambda$13(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONObject] */
    private final void getEcoApiProxy(CoroutineScope scope, String eco_api, String params, Function1<? super ScaleData, Unit> success, Function1<? super ApiException, Unit> error) throws JSONException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? jSONObject = new JSONObject();
        objectRef.element = jSONObject;
        jSONObject.put("eco_api", eco_api);
        ((JSONObject) objectRef.element).put("params", params);
        Intrinsics.checkNotNull(scope);
        new HttpFlow(scope, getMService(), new AnonymousClass2(objectRef, null)).error(error).success(success);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getEcoApiProxy$default(BindScaleRequest bindScaleRequest, CoroutineScope coroutineScope, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 16) != 0) {
            function2 = new Function1() { // from class: qn2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.getEcoApiProxy$lambda$0((ApiException) obj2);
                }
            };
        }
        bindScaleRequest.getEcoApiProxy(coroutineScope, str, str2, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEcoApiProxy$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEcoApiProxy$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEcoApiProxySync(String str, String str2, Continuation<? super ScaleData> continuation) throws JSONException {
        AnonymousClass1 anonymousClass1;
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
        Object ecoApiProxy = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(ecoApiProxy);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eco_api", str);
            jSONObject.put("params", str2);
            StringBuilder sb = new StringBuilder();
            sb.append("getEcoApiProxySync data is ");
            sb.append(jSONObject);
            ScaleService mService = getMService();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            anonymousClass1.label = 1;
            ecoApiProxy = mService.getEcoApiProxy(string, anonymousClass1);
            if (ecoApiProxy == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(ecoApiProxy);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(ecoApiProxy);
    }

    public static /* synthetic */ Object getEcoDevices$default(BindScaleRequest bindScaleRequest, int i, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 1;
        }
        if ((i4 & 2) != 0) {
            i2 = 10;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        return bindScaleRequest.getEcoDevices(i, i2, i3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getShareList$default(BindScaleRequest bindScaleRequest, int i, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i2, Object obj) throws JSONException {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i2 & 8) != 0) {
            function2 = new Function1() { // from class: pn2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.getShareList$lambda$11((ApiException) obj2);
                }
            };
        }
        bindScaleRequest.getShareList(i, coroutineScope, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getShareList$lambda$11(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getVirtualAccount$default(BindScaleRequest bindScaleRequest, long j, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        if ((i & 2) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        bindScaleRequest.getVirtualAccount(j, netCoroutineScope, function1, (i & 8) != 0 ? new Function1() { // from class: on2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return BindScaleRequest.getVirtualAccount$lambda$14((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccount$lambda$14(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hello$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void shareBind$default(BindScaleRequest bindScaleRequest, String str, String str2, String str3, String str4, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 32) != 0) {
            function2 = new Function1() { // from class: ao2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.shareBind$lambda$3((ApiException) obj2);
                }
            };
        }
        bindScaleRequest.shareBind(str, str2, str3, str4, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareBind$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void shareEcdh$default(BindScaleRequest bindScaleRequest, String str, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: co2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.shareEcdh$lambda$5((ApiException) obj2);
                }
            };
        }
        bindScaleRequest.shareEcdh(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareEcdh$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbind$lambda$7(AndroidScope androidScope, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((it instanceof ApiException) && ((ApiException) it).getErrorCode() == -1) {
            return Unit.INSTANCE;
        }
        throw it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateWeightToAccount$default(BindScaleRequest bindScaleRequest, long j, String str, long j2, Function1 function1, Function1 function2, CoroutineScope coroutineScope, int i, Object obj) throws JSONException {
        CoroutineScope netCoroutineScope;
        Function1 function3 = (i & 16) != 0 ? new Function1() { // from class: tn2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return BindScaleRequest.updateWeightToAccount$lambda$15((ApiException) obj2);
            }
        } : function2;
        if ((i & 32) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        bindScaleRequest.updateWeightToAccount(j, str, j2, function1, function3, netCoroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateWeightToAccount$lambda$15(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void acceptShare(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shareUserId", shareUserId);
        jSONObject.put("userId", userId);
        jSONObject.put("shareId", shareId);
        jSONObject.put("type", type);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/bs/share/shareConfirm", string, success, error);
    }

    public final void addWeight(@NotNull String model, long uid, long accountId, @NotNull String did, long createTime, @NotNull String data, int dataVersion, @NotNull String sn, int fromSource, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope) throws JSONException {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(scope, "scope");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("model", model);
        jSONObject.put("uid", uid);
        jSONObject.put(Column.ACCOUNT_ID, accountId);
        jSONObject.put("did", did);
        jSONObject.put("createTime", createTime);
        jSONObject.put("data", data);
        jSONObject.put("dataVersion", dataVersion);
        jSONObject.put("sn", sn);
        jSONObject.put("fromSource", fromSource);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/eco/common/scale/add", string, success, error);
    }

    public final void bind(@NotNull String bindIndex, @NotNull String bindSign, @NotNull String bindDid, @NotNull String thirdNodeId, @NotNull String peripheralId, @NotNull String sn, @NotNull String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindSign, "bindSign");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(thirdNodeId, "thirdNodeId");
        Intrinsics.checkNotNullParameter(peripheralId, "peripheralId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bindIndex", bindIndex);
        jSONObject.put("bindSign", bindSign);
        jSONObject.put("bindDid", bindDid);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("thirdNodeId", thirdNodeId);
        jSONObject2.put("peripheralId", peripheralId);
        jSONObject2.put("sn", sn);
        jSONObject2.put("name", name);
        jSONObject.put("extraValues", jSONObject2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy("/bs/bind/bind", string, success, error);
    }

    public final void checkAccountWhetherExist(@NotNull String accountId, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userInfo", accountId);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/bs/share/userExist", string, success, error);
    }

    public final void createShare(@Nullable String userId, @Nullable String did, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        jSONObject.put("shareUserId", userId);
        jSONObject.put("did", did);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/bs/share/shareDevice", string, success, error);
    }

    public final void delShare(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shareUserId", shareUserId);
        jSONObject.put("userId", userId);
        jSONObject.put("shareId", shareId);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/bs/share/shareCancel", string, success, error);
    }

    public final void ecdh(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String pubD, @NotNull String signD, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(pubD, "pubD");
        Intrinsics.checkNotNullParameter(signD, "signD");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bindIndex", bindIndex);
        jSONObject.put("bindDid", bindDid);
        jSONObject.put("pubD", pubD);
        jSONObject.put("signD", signD);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy("/bs/bind/ecdh", string, success, error);
    }

    public final void getAccountByWeight(int weightKg, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope) throws JSONException {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(scope, "scope");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("weight", weightKg);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/scale/account/getAccountByWeight", string, success, error);
    }

    @Nullable
    public final Object getEcoDevices(int i, int i2, int i3, @NotNull Continuation<? super ScaleData> continuation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page", i);
        jSONObject.put("pageSize", i2);
        jSONObject.put("status", i3);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return getEcoApiProxySync("/bs/bind/devices", string, continuation);
    }

    public final void getShareList(int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", type);
        jSONObject.put("userId", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "/bs/share/sharedDevicesList", string, success, error);
    }

    @Nullable
    public final Object getShareListSync(@NotNull Continuation<? super ScaleData> continuation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 2);
        jSONObject.put("userId", AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return getEcoApiProxySync("/bs/share/sharedDevicesList", string, continuation);
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final void getVirtualAccount(long uid, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", uid);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/account/list", string, success, error);
    }

    public final void hello(int mode, @NotNull String did, @NotNull String model, @NotNull String sn, @NotNull String mac, @NotNull String randomD, @Nullable String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(randomD, "randomD");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mode", mode);
        jSONObject.put("did", did);
        jSONObject.put("model", model);
        jSONObject.put("sn", sn);
        jSONObject.put("mac", mac);
        jSONObject.put("randomD", randomD);
        jSONObject.put("name", name);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy("/bs/bind/hello", string, success, error);
    }

    public final void shareBind(@NotNull String shareId, @Nullable String bindDid, @NotNull String sn, @NotNull String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shareId", shareId);
        jSONObject.put("bindDid", bindDid);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sn", sn);
        jSONObject2.put("name", name);
        jSONObject.put("extraValues", jSONObject2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy("/bs/bind/shareBind", string, success, error);
    }

    public final void shareEcdh(@NotNull String shareId, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shareId", shareId);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy("/bs/bind/shareEcdh", string, success, error);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object unbind(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Integer> continuation) throws JSONException {
        C23811 c23811;
        BindScaleRequest bindScaleRequest;
        if (continuation instanceof C23811) {
            c23811 = (C23811) continuation;
            int i = c23811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23811.label = i - Integer.MIN_VALUE;
            } else {
                c23811 = new C23811(continuation);
            }
        } else {
            c23811 = new C23811(continuation);
        }
        Object ecoApiProxy = c23811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c23811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(ecoApiProxy);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bindDid", str);
            jSONObject.put("mac", str2);
            jSONObject.put("tokenKey", str3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("eco_api", "/bs/bind/relieve");
            jSONObject2.put("params", jSONObject.toString());
            ScaleService mService = getMService();
            String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            c23811.L$0 = this;
            c23811.label = 1;
            ecoApiProxy = mService.getEcoApiProxy(string, c23811);
            if (ecoApiProxy == coroutine_suspended) {
                return coroutine_suspended;
            }
            bindScaleRequest = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bindScaleRequest = (BindScaleRequest) c23811.L$0;
            ResultKt.throwOnFailure(ecoApiProxy);
        }
        BaseResult baseResult = (BaseResult) ecoApiProxy;
        ScopeExtKt.scopeNet$default(null, bindScaleRequest.new C23822(baseResult, null), 1, null).m503catch(new Function2() { // from class: un2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BindScaleRequest.unbind$lambda$7((AndroidScope) obj, (Throwable) obj2);
            }
        });
        return Boxing.boxInt(baseResult.getCode());
    }

    public final void updateWeightToAccount(long uid, @NotNull String weightTarget, long accountId, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope) throws JSONException {
        Intrinsics.checkNotNullParameter(weightTarget, "weightTarget");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(scope, "scope");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", uid);
        jSONObject.put("weightTarget", weightTarget);
        jSONObject.put(Column.ACCOUNT_ID, accountId);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        getEcoApiProxy(scope, "eco/scale/account/updateWeight", string, success, error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getEcoApiProxy$default(BindScaleRequest bindScaleRequest, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: sn2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BindScaleRequest.getEcoApiProxy$lambda$1((ApiException) obj2);
                }
            };
        }
        bindScaleRequest.getEcoApiProxy(str, str2, function1, function2);
    }

    private final void getEcoApiProxy(String eco_api, String params, Function1<? super ScaleData, Unit> success, Function1<? super ApiException, Unit> error) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eco_api", eco_api);
        jSONObject.put("params", params);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass4(jSONObject, null)).error(error).success(success);
    }
}
