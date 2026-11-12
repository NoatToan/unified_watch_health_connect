package com.xiaomi.fitness.smarthome.mijiasdk;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import com.xiaomi.smarthome.setting.LoginSetting;
import defpackage.h4b;
import defpackage.ikg;
import defpackage.ixl;
import defpackage.n2n;
import defpackage.tkg;
import defpackage.wjg;
import defpackage.x0e;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JQ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/smarthome/mijiasdk/NetUtils;", "", "", "path", "", "map", "", "isPost", "Lwjg;", "networkCallback", "uidKey", "", "sendRequest", "(Ljava/lang/String;Ljava/util/Map;ZLwjg;Ljava/lang/String;)V", "Lcom/xiaomi/fitness/smarthome/mijiasdk/MiServiceTokenInfo;", "getMiServiceTokenInfo", "()Lcom/xiaomi/fitness/smarthome/mijiasdk/MiServiceTokenInfo;", "sendPostRequest", "(Ljava/lang/String;Ljava/util/Map;Lwjg;Ljava/lang/String;)V", "<init>", "()V", "smarthome_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NetUtils {

    @NotNull
    public static final NetUtils INSTANCE = new NetUtils();

    /* JADX INFO: renamed from: com.xiaomi.fitness.smarthome.mijiasdk.NetUtils$sendRequest$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.smarthome.mijiasdk.NetUtils$sendRequest$1", f = "NetUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isPost;
        final /* synthetic */ Map<String, Object> $map;
        final /* synthetic */ wjg $networkCallback;
        final /* synthetic */ String $path;
        final /* synthetic */ String $uidKey;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.smarthome.mijiasdk.NetUtils$sendRequest$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.smarthome.mijiasdk.NetUtils$sendRequest$1$1", f = "NetUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isPost;
            final /* synthetic */ Map<String, Object> $map;
            final /* synthetic */ wjg $networkCallback;
            final /* synthetic */ String $path;
            final /* synthetic */ String $uidKey;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07381(wjg wjgVar, boolean z, String str, String str2, Map<String, Object> map, Continuation<? super C07381> continuation) {
                super(2, continuation);
                this.$networkCallback = wjgVar;
                this.$isPost = z;
                this.$path = str;
                this.$uidKey = str2;
                this.$map = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07381(this.$networkCallback, this.$isPost, this.$path, this.$uidKey, this.$map, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MiServiceTokenInfo miServiceTokenInfo = NetUtils.INSTANCE.getMiServiceTokenInfo();
                if (miServiceTokenInfo == null) {
                    wjg wjgVar = this.$networkCallback;
                    if (wjgVar != null) {
                        wjgVar.onFailed("miServiceTokenInfo is null");
                    }
                    return Unit.INSTANCE;
                }
                ikg ikgVar = new ikg();
                ikgVar.f21254a = this.$isPost ? "POST" : "GET";
                ikgVar.f21255b = this.$path;
                ArrayList arrayList = new ArrayList();
                String str = this.$uidKey;
                if (str != null) {
                    Map<String, Object> map = this.$map;
                    if (map != null) {
                        map.put(str, miServiceTokenInfo.f12912b);
                    } else {
                        MapsKt__MapsKt.mutableMapOf(TuplesKt.to(str, miServiceTokenInfo.f12912b));
                    }
                }
                Map<String, Object> map2 = this.$map;
                if (map2 != null) {
                    Boxing.boxBoolean(arrayList.add(new x0e("data", h4b.b(map2))));
                }
                ikgVar.c = arrayList;
                tkg.k(ApplicationExtKt.getApplication(), miServiceTokenInfo, ikgVar, this.$networkCallback);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wjg wjgVar, boolean z, String str, String str2, Map<String, Object> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$networkCallback = wjgVar;
            this.$isPost = z;
            this.$path = str;
            this.$uidKey = str2;
            this.$map = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$networkCallback, this.$isPost, this.$path, this.$uidKey, this.$map, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnyExtKt.io$default(null, new C07381(this.$networkCallback, this.$isPost, this.$path, this.$uidKey, this.$map, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private NetUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MiServiceTokenInfo getMiServiceTokenInfo() {
        Account xiaomiAccount = XiaomiAccountManager.get(ApplicationExtKt.getApplication()).getXiaomiAccount();
        if (xiaomiAccount == null) {
            n2n.a("getMiServiceTokenInfo xiaomiAccount is null");
            return null;
        }
        MiAccessToken serviceToken = AccountManagerExtKt.getInstance(TokenManager.INSTANCE).getServiceToken(LoginSetting.SID_XIAOMI_IO, true, 3);
        if (serviceToken == null) {
            n2n.a("getMiServiceTokenInfo serviceToken is null");
            return null;
        }
        if (TextUtils.isEmpty(serviceToken.getSecurity()) || TextUtils.isEmpty(serviceToken.getServiceToken())) {
            n2n.a("getMiServiceTokenInfo security or serviceToken is null");
            return null;
        }
        Pair<Long, Boolean> pairA = ixl.a();
        Intrinsics.checkNotNullExpressionValue(pairA, "getServerTimeSync(...)");
        if (!((Boolean) pairA.second).booleanValue()) {
            n2n.a("getMiServiceTokenInfo serverTimeSync.second:" + pairA.second);
            return null;
        }
        n2n.c("getMiServiceTokenInfo ok");
        MiServiceTokenInfo miServiceTokenInfo = new MiServiceTokenInfo();
        miServiceTokenInfo.f12911a = LoginSetting.SID_XIAOMI_IO;
        miServiceTokenInfo.f12912b = xiaomiAccount.name;
        miServiceTokenInfo.c = serviceToken.getCUserId();
        miServiceTokenInfo.g = LoginSetting.COOKIE_DOMAIN_XIAOMI_IO;
        miServiceTokenInfo.e = serviceToken.getSecurity();
        miServiceTokenInfo.d = serviceToken.getServiceToken();
        miServiceTokenInfo.f = ((Number) pairA.first).longValue();
        return miServiceTokenInfo;
    }

    public static /* synthetic */ void sendPostRequest$default(NetUtils netUtils, String str, Map map, wjg wjgVar, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            wjgVar = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        netUtils.sendPostRequest(str, map, wjgVar, str2);
    }

    private final void sendRequest(String path, Map<String, Object> map, boolean isPost, wjg networkCallback, String uidKey) {
        new NetCoroutineScope(null, null, null, 7, null).launch((Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(networkCallback, isPost, path, uidKey, map, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendRequest$default(NetUtils netUtils, String str, Map map, boolean z, wjg wjgVar, String str2, int i, Object obj) {
        Map map2 = (i & 2) != 0 ? null : map;
        if ((i & 4) != 0) {
            z = true;
        }
        netUtils.sendRequest(str, map2, z, (i & 8) != 0 ? null : wjgVar, (i & 16) != 0 ? null : str2);
    }

    public final void sendPostRequest(@NotNull String path, @Nullable Map<String, Object> map, @Nullable wjg networkCallback, @Nullable String uidKey) {
        Intrinsics.checkNotNullParameter(path, "path");
        sendRequest$default(this, path, map, false, networkCallback, uidKey, 4, null);
    }
}
