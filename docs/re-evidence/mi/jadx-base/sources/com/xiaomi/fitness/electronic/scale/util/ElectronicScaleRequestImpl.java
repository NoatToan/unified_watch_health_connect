package com.xiaomi.fitness.electronic.scale.util;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.request.BindScaleRequest;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jh\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016JR\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016JX\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J8\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016Jj\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J&\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010*J&\u0010+\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010-J@\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016JL\u00100\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J@\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016JP\u00104\u001a\u00020\u00072\u0006\u00101\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016JX\u00106\u001a\u00020\u00072\u0006\u00101\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u00103\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0011H\u0016J\u0080\u0001\u00107\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\t2\u0006\u00108\u001a\u0002092\u0006\u0010/\u001a\u0002092\u0006\u0010 \u001a\u00020\t2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u001f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J@\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u001f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J@\u0010@\u001a\u00020\u00072\u0006\u00108\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0011H\u0016JP\u0010A\u001a\u00020\u00072\u0006\u00108\u001a\u0002092\u0006\u0010B\u001a\u00020\t2\u0006\u0010/\u001a\u0002092\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/ElectronicScaleRequestImpl;", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest;", "<init>", "()V", "bindScaleRequest", "Lcom/xiaomi/fitness/electronic/scale/request/BindScaleRequest;", "bind", "", "bindIndex", "", "bindSign", "bindDid", "thirdNodeId", "peripheralId", "sn", "name", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ScaleData;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "shareBind", "shareId", "ecdh", "pubD", "signD", "scope", "Lkotlinx/coroutines/CoroutineScope;", "shareEcdh", "hello", "mode", "", "did", "model", "mac", "randomD", "getEcoDevices", "page", "pageSize", "status", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShareListSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbind", "tokenKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAccountWhetherExist", Column.ACCOUNT_ID, "createShare", "userId", "getShareList", "type", "delShare", "shareUserId", "acceptShare", "addWeight", "uid", "", "createTime", "data", "dataVersion", "fromSource", "getAccountByWeight", "weightKg", "getVirtualAccount", "updateWeightToAccount", "weightTarget", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleRequestImpl implements ElectronicScaleRequest {

    @NotNull
    private final BindScaleRequest bindScaleRequest = new BindScaleRequest();

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void acceptShare(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super String, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        BindScaleRequest.acceptShare$default(this.bindScaleRequest, userId, shareUserId, shareId, type, scope, success, null, 64, null);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void addWeight(@NotNull String model, long uid, long accountId, @NotNull String did, long createTime, @NotNull String data, int dataVersion, @NotNull String sn, int fromSource, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope) throws JSONException {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.bindScaleRequest.addWeight(model, uid, accountId, did, createTime, data, dataVersion, sn, fromSource, success, error, scope);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void bind(@NotNull String bindIndex, @NotNull String bindSign, @NotNull String bindDid, @NotNull String thirdNodeId, @NotNull String peripheralId, @NotNull String sn, @NotNull String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindSign, "bindSign");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(thirdNodeId, "thirdNodeId");
        Intrinsics.checkNotNullParameter(peripheralId, "peripheralId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.bind(bindIndex, bindSign, bindDid, thirdNodeId, peripheralId, sn, name, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void checkAccountWhetherExist(@NotNull String accountId, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.checkAccountWhetherExist(accountId, scope, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void createShare(@Nullable String userId, @Nullable String did, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.createShare(userId, did, scope, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void delShare(@NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.delShare(userId, shareUserId, shareId, scope, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void ecdh(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String pubD, @NotNull String signD, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(pubD, "pubD");
        Intrinsics.checkNotNullParameter(signD, "signD");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.ecdh(bindIndex, bindDid, pubD, signD, scope, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void getAccountByWeight(int weightKg, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope) throws JSONException {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.bindScaleRequest.getAccountByWeight(weightKg, success, error, scope);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    @Nullable
    public Object getEcoDevices(int i, int i2, int i3, @NotNull Continuation<? super ScaleData> continuation) {
        return this.bindScaleRequest.getEcoDevices(i, i2, i3, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void getShareList(int type, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.getShareList(type, scope, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    @Nullable
    public Object getShareListSync(@NotNull Continuation<? super ScaleData> continuation) {
        return this.bindScaleRequest.getShareListSync(continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void getVirtualAccount(long uid, @NotNull CoroutineScope scope, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.getVirtualAccount(uid, scope, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void hello(int mode, @NotNull String did, @NotNull String model, @NotNull String sn, @NotNull String mac, @NotNull String randomD, @Nullable String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(randomD, "randomD");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.hello(mode, did, model, sn, mac, randomD, name, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void shareBind(@NotNull String shareId, @Nullable String bindDid, @NotNull String sn, @NotNull String name, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.shareBind(shareId, bindDid, sn, name, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void shareEcdh(@NotNull String shareId, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error) throws JSONException {
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.shareEcdh(shareId, success, error);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    @Nullable
    public Object unbind(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Integer> continuation) {
        return this.bindScaleRequest.unbind(str, str2, str3, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest
    public void updateWeightToAccount(long uid, @NotNull String weightTarget, long accountId, @NotNull Function1<? super ScaleData, Unit> success, @NotNull Function1<? super ApiException, Unit> error, @NotNull CoroutineScope scope) throws JSONException {
        Intrinsics.checkNotNullParameter(weightTarget, "weightTarget");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.bindScaleRequest.updateWeightToAccount(uid, weightTarget, accountId, success, error, scope);
    }
}
