package com.xiaomi.fitness.electronic.scale.export;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u000b\bf\u0018\u0000 ?2\u00020\u0001:\u0001?Jj\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&JT\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&J\\\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&J:\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&Jl\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&J,\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010#\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010&J&\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010)JD\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&JP\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&JF\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&JT\u00100\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&J\\\u00102\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\rH&J\u0084\u0001\u00103\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u00104\u001a\u0002052\u0006\u0010+\u001a\u0002052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u001b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H&JD\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u001b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H&JD\u0010<\u001a\u00020\u00032\u0006\u00104\u001a\u0002052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\rH&JT\u0010=\u001a\u00020\u00032\u0006\u00104\u001a\u0002052\u0006\u0010>\u001a\u00020\u00052\u0006\u0010+\u001a\u0002052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H&¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest;", "", "bind", "", "bindIndex", "", "bindSign", "bindDid", "thirdNodeId", "peripheralId", "sn", "name", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "shareBind", "shareId", "ecdh", "pubD", "signD", "scope", "Lkotlinx/coroutines/CoroutineScope;", "shareEcdh", "hello", "mode", "", "did", "model", "mac", "randomD", "getEcoDevices", "page", "pageSize", "status", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShareListSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbind", "tokenKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAccountWhetherExist", Column.ACCOUNT_ID, "createShare", "userId", "getShareList", "type", "delShare", "shareUserId", "acceptShare", "addWeight", "uid", "", "createTime", "data", "dataVersion", "fromSource", "getAccountByWeight", "weightKg", "getVirtualAccount", "updateWeightToAccount", "weightTarget", "Companion", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ElectronicScaleRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest$Companion;", "", "<init>", "()V", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void acceptShare$default(ElectronicScaleRequest electronicScaleRequest, String str, String str2, String str3, int i, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i2, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptShare");
            }
            if ((i2 & 16) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            electronicScaleRequest.acceptShare(str, str2, str3, i, netCoroutineScope, function1, (i2 & 64) != 0 ? new Function1() { // from class: k58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.acceptShare$lambda$9((String) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit acceptShare$lambda$9(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addWeight$default(ElectronicScaleRequest electronicScaleRequest, String str, long j, long j2, String str2, long j3, String str3, int i, String str4, int i2, Function1 function1, Function1 function2, CoroutineScope coroutineScope, int i3, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWeight");
            }
            Function1 function3 = (i3 & 1024) != 0 ? new Function1() { // from class: n58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.addWeight$lambda$10((ApiException) obj2);
                }
            } : function2;
            if ((i3 & 2048) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            electronicScaleRequest.addWeight(str, j, j2, str2, j3, str3, i, str4, i2, function1, function3, netCoroutineScope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit addWeight$lambda$10(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(ElectronicScaleRequest electronicScaleRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            electronicScaleRequest.bind(str, str2, str3, str4, str5, str6, str7, function1, (i & 256) != 0 ? new Function1() { // from class: m58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.bind$lambda$0((ApiException) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit bind$lambda$0(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void checkAccountWhetherExist$default(ElectronicScaleRequest electronicScaleRequest, String str, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAccountWhetherExist");
            }
            if ((i & 2) != 0) {
                coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            }
            if ((i & 8) != 0) {
                function2 = new Function1() { // from class: d58
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return ElectronicScaleRequest.DefaultImpls.checkAccountWhetherExist$lambda$5((ApiException) obj2);
                    }
                };
            }
            electronicScaleRequest.checkAccountWhetherExist(str, coroutineScope, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit checkAccountWhetherExist$lambda$5(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void createShare$default(ElectronicScaleRequest electronicScaleRequest, String str, String str2, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createShare");
            }
            if ((i & 4) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            electronicScaleRequest.createShare(str, str2, netCoroutineScope, function1, (i & 16) != 0 ? new Function1() { // from class: o58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.createShare$lambda$6((ApiException) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit createShare$lambda$6(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void delShare$default(ElectronicScaleRequest electronicScaleRequest, String str, String str2, String str3, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delShare");
            }
            if ((i & 8) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            electronicScaleRequest.delShare(str, str2, str3, netCoroutineScope, function1, (i & 32) != 0 ? new Function1() { // from class: g58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.delShare$lambda$8((ApiException) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit delShare$lambda$8(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void ecdh$default(ElectronicScaleRequest electronicScaleRequest, String str, String str2, String str3, String str4, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ecdh");
            }
            if ((i & 16) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            electronicScaleRequest.ecdh(str, str2, str3, str4, netCoroutineScope, function1, (i & 64) != 0 ? new Function1() { // from class: c58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.ecdh$lambda$2((ApiException) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit ecdh$lambda$2(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getAccountByWeight$default(ElectronicScaleRequest electronicScaleRequest, int i, Function1 function1, Function1 function2, CoroutineScope coroutineScope, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccountByWeight");
            }
            if ((i2 & 4) != 0) {
                function2 = new Function1() { // from class: j58
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return ElectronicScaleRequest.DefaultImpls.getAccountByWeight$lambda$11((ApiException) obj2);
                    }
                };
            }
            if ((i2 & 8) != 0) {
                coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            }
            electronicScaleRequest.getAccountByWeight(i, function1, function2, coroutineScope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit getAccountByWeight$lambda$11(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object getEcoDevices$default(ElectronicScaleRequest electronicScaleRequest, int i, int i2, int i3, Continuation continuation, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEcoDevices");
            }
            if ((i4 & 1) != 0) {
                i = 1;
            }
            if ((i4 & 2) != 0) {
                i2 = 10;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return electronicScaleRequest.getEcoDevices(i, i2, i3, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getShareList$default(ElectronicScaleRequest electronicScaleRequest, int i, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShareList");
            }
            if ((i2 & 1) != 0) {
                i = 2;
            }
            if ((i2 & 2) != 0) {
                coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            }
            if ((i2 & 8) != 0) {
                function2 = new Function1() { // from class: b58
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return ElectronicScaleRequest.DefaultImpls.getShareList$lambda$7((ApiException) obj2);
                    }
                };
            }
            electronicScaleRequest.getShareList(i, coroutineScope, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit getShareList$lambda$7(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getVirtualAccount$default(ElectronicScaleRequest electronicScaleRequest, long j, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVirtualAccount");
            }
            if ((i & 2) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            electronicScaleRequest.getVirtualAccount(j, netCoroutineScope, function1, (i & 8) != 0 ? new Function1() { // from class: f58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.getVirtualAccount$lambda$12((ApiException) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit getVirtualAccount$lambda$12(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void hello$default(ElectronicScaleRequest electronicScaleRequest, int i, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, Function1 function2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hello");
            }
            electronicScaleRequest.hello(i, str, str2, str3, str4, str5, str6, function1, (i2 & 256) != 0 ? new Function1() { // from class: e58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.hello$lambda$4((ApiException) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit hello$lambda$4(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void shareBind$default(ElectronicScaleRequest electronicScaleRequest, String str, String str2, String str3, String str4, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareBind");
            }
            if ((i & 32) != 0) {
                function2 = new Function1() { // from class: l58
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return ElectronicScaleRequest.DefaultImpls.shareBind$lambda$1((ApiException) obj2);
                    }
                };
            }
            electronicScaleRequest.shareBind(str, str2, str3, str4, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit shareBind$lambda$1(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void shareEcdh$default(ElectronicScaleRequest electronicScaleRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareEcdh");
            }
            if ((i & 4) != 0) {
                function2 = new Function1() { // from class: i58
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return ElectronicScaleRequest.DefaultImpls.shareEcdh$lambda$3((ApiException) obj2);
                    }
                };
            }
            electronicScaleRequest.shareEcdh(str, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit shareEcdh$lambda$3(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateWeightToAccount$default(ElectronicScaleRequest electronicScaleRequest, long j, String str, long j2, Function1 function1, Function1 function2, CoroutineScope coroutineScope, int i, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateWeightToAccount");
            }
            Function1 function3 = (i & 16) != 0 ? new Function1() { // from class: h58
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ElectronicScaleRequest.DefaultImpls.updateWeightToAccount$lambda$13((ApiException) obj2);
                }
            } : function2;
            if ((i & 32) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            electronicScaleRequest.updateWeightToAccount(j, str, j2, function1, function3, netCoroutineScope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit updateWeightToAccount$lambda$13(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    void acceptShare(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super String, Unit> error);

    void addWeight(@NotNull String model, long uid, long accountId, @NotNull String did, long createTime, @NotNull String data, int dataVersion, @NotNull String sn, int fromSource, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope);

    void bind(@NotNull String bindIndex, @NotNull String bindSign, @NotNull String bindDid, @NotNull String thirdNodeId, @NotNull String peripheralId, @NotNull String sn, @NotNull String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void checkAccountWhetherExist(@NotNull String accountId, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void createShare(@Nullable String userId, @Nullable String did, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void delShare(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void ecdh(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String pubD, @NotNull String signD, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void getAccountByWeight(int weightKg, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope);

    @Nullable
    Object getEcoDevices(int i, int i2, int i3, @NotNull Continuation<? super ScaleData> continuation);

    void getShareList(int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    @Nullable
    Object getShareListSync(@NotNull Continuation<? super ScaleData> continuation);

    void getVirtualAccount(long uid, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void hello(int mode, @NotNull String did, @NotNull String model, @NotNull String sn, @NotNull String mac, @NotNull String randomD, @Nullable String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void shareBind(@NotNull String shareId, @Nullable String bindDid, @NotNull String sn, @NotNull String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void shareEcdh(@NotNull String shareId, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    @Nullable
    Object unbind(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Integer> continuation);

    void updateWeightToAccount(long uid, @NotNull String weightTarget, long accountId, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope);
}
