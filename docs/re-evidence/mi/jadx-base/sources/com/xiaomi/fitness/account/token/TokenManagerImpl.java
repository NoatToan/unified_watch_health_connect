package com.xiaomi.fitness.account.token;

import android.accounts.Account;
import android.content.Intent;
import com.miui.tsmclient.account.OAuthAccountManager;
import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.fitness.account.manager.BroadcastsKt;
import com.xiaomi.fitness.account.manager.IMiAccountManager;
import com.xiaomi.fitness.account.token.TokenManagerImpl;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0016J\"\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010&\u001a\u00020\rH\u0016J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u001a\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020\"H\u0002J\u001a\u0010*\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010,\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0019H\u0003J\u0018\u0010.\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0019H\u0003J\b\u0010/\u001a\u00020%H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/account/token/TokenManagerImpl;", "Lcom/xiaomi/fitness/account/token/TokenManager;", "<init>", "()V", "mAccessManager", "Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "getMAccessManager", "()Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "setMAccessManager", "(Lcom/xiaomi/fitness/account/manager/IMiAccountManager;)V", "mAccessTokens", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "mLoginSemaphore", "Ljava/util/concurrent/CountDownLatch;", "mUpdateLock", "Ljava/lang/Object;", "isUpdating", "", "mRefreshing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mTokenObservers", "Ljava/util/HashMap;", "", "Lcom/xiaomi/fitness/account/token/AccessTokenObserver;", "getMTokenObservers", "()Ljava/util/HashMap;", "mTokenObservers$delegate", "Lkotlin/Lazy;", "getServiceToken", "sid", "forceRefresh", "loginPolicy", "", "getToken", "setServiceToken", "", OAuthAccountManager.MiOAuthConstant.TOKEN, "notifyAuthenticate", "intent", "Landroid/content/Intent;", "notifyObserver", "token", "registerObserver", "observer", "unregisterObserver", "update", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TokenManagerImpl implements TokenManager {
    private volatile boolean isUpdating;
    public IMiAccountManager mAccessManager;

    @NotNull
    private final ConcurrentHashMap<String, MiAccessToken> mAccessTokens = new ConcurrentHashMap<>();

    @NotNull
    private final CountDownLatch mLoginSemaphore = new CountDownLatch(1);

    @NotNull
    private final Object mUpdateLock = new Object();

    @NotNull
    private final AtomicBoolean mRefreshing = new AtomicBoolean(false);

    /* JADX INFO: renamed from: mTokenObservers$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTokenObservers = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hip
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TokenManagerImpl.mTokenObservers_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.token.TokenManagerImpl$notifyObserver$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.token.TokenManagerImpl$notifyObserver$1", f = "TokenManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTokenManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenManagerImpl.kt\ncom/xiaomi/fitness/account/token/TokenManagerImpl$notifyObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1863#2,2:214\n*S KotlinDebug\n*F\n+ 1 TokenManagerImpl.kt\ncom/xiaomi/fitness/account/token/TokenManagerImpl$notifyObserver$1\n*L\n188#1:214,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $sid;
        final /* synthetic */ MiAccessToken $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, MiAccessToken miAccessToken, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sid = str;
            this.$token = miAccessToken;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TokenManagerImpl.this.new AnonymousClass1(this.$sid, this.$token, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) TokenManagerImpl.this.getMTokenObservers().get(this.$sid);
            if (list != null) {
                MiAccessToken miAccessToken = this.$token;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AccessTokenObserver) it.next()).onChange(miAccessToken);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HashMap<String, List<AccessTokenObserver>> getMTokenObservers() {
        return (HashMap) this.mTokenObservers.getValue();
    }

    private final MiAccessToken getToken(String sid, boolean forceRefresh, int loginPolicy) throws InterruptedException {
        String str;
        Account miAccount = getMAccessManager().getMiAccount();
        if (miAccount == null) {
            boolean zIsUseLocal = getMAccessManager().isUseLocal();
            StringBuilder sb = new StringBuilder();
            sb.append("getServiceToken, account==null, invalidate=");
            sb.append(forceRefresh);
            sb.append(", isLocal:");
            sb.append(zIsUseLocal);
            sb.append(", sid=");
            str = sid;
            sb.append(str);
            LogExtKt.logi(sb.toString());
            notifyAuthenticate(null, loginPolicy);
            miAccount = getMAccessManager().getMiAccount();
            if (miAccount == null) {
                return null;
            }
        } else {
            str = sid;
        }
        String sid2 = sid.length() == 0 ? getMAccessManager().getSid() : str;
        if (!forceRefresh) {
            MiAccessToken miAccessToken = this.mAccessTokens.get(sid2);
            LogExtKt.logi("getToken: mAccessTokens[" + sid2 + "] is " + miAccessToken);
            if (miAccessToken != null) {
                miAccessToken.setUpdated(false);
                return miAccessToken;
            }
        }
        ServiceTokenResult serviceToken = getMAccessManager().getServiceToken(sid2, forceRefresh);
        LogExtKt.safePrintI("getToken: ServiceTokenResult: " + serviceToken);
        LogExtKt.logi("getToken: get a new service token, forceRefresh is " + forceRefresh + ", sidTemp is " + sid2);
        ServiceTokenResult.ErrorCode errorCode = serviceToken.errorCode;
        if (errorCode == ServiceTokenResult.ErrorCode.ERROR_NONE) {
            String name = serviceToken.userId;
            if (name == null) {
                name = miAccount.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
            }
            MiAccessToken miAccessToken2 = new MiAccessToken(name, serviceToken.cUserId, serviceToken.serviceToken, serviceToken.security, 0L, true, 16, null);
            this.mAccessTokens.put(sid2, miAccessToken2);
            notifyObserver(sid2, miAccessToken2);
            LogExtKt.logi("accessToken is " + miAccessToken2);
            return miAccessToken2;
        }
        if (errorCode == ServiceTokenResult.ErrorCode.ERROR_USER_INTERACTION_NEEDED && serviceToken.intent != null) {
            LogExtKt.logi("getSystemToken, notifyAuthenticate, invalidate=" + forceRefresh + ", isLocal:" + getMAccessManager().isUseLocal());
            notifyAuthenticate(serviceToken.intent, loginPolicy);
        }
        LogExtKt.logi("getSystemToken,errorCode=" + serviceToken.errorCode + ",invalidate=" + forceRefresh + ",isLocal:" + getMAccessManager().isUseLocal());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap mTokenObservers_delegate$lambda$0() {
        return new HashMap();
    }

    private final void notifyAuthenticate(Intent intent, int loginPolicy) throws InterruptedException {
        if (loginPolicy != 2) {
            return;
        }
        if (this.mRefreshing.compareAndSet(false, true)) {
            BroadcastsKt.broadcastLogin$default(intent, null, 2, null);
        }
        this.mLoginSemaphore.await();
    }

    private final void notifyObserver(String sid, MiAccessToken token) {
        AnyExtKt.main$default(null, new AnonymousClass1(sid, token, null), 1, null);
    }

    private final void registerObserver(String sid, AccessTokenObserver observer) {
        List<AccessTokenObserver> arrayList = getMTokenObservers().get(sid);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            getMTokenObservers().put(sid, arrayList);
        }
        arrayList.add(observer);
    }

    private final void unregisterObserver(String sid, AccessTokenObserver observer) {
        List<AccessTokenObserver> list = getMTokenObservers().get(sid);
        if (list != null) {
            list.remove(observer);
        }
    }

    @NotNull
    public final IMiAccountManager getMAccessManager() {
        IMiAccountManager iMiAccountManager = this.mAccessManager;
        if (iMiAccountManager != null) {
            return iMiAccountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccessManager");
        return null;
    }

    @Override // com.xiaomi.fitness.account.token.TokenManager
    @Nullable
    public MiAccessToken getServiceToken(@NotNull String sid, boolean forceRefresh, int loginPolicy) {
        MiAccessToken token;
        Intrinsics.checkNotNullParameter(sid, "sid");
        if (loginPolicy != 2 && getMAccessManager().getMiAccount() == null) {
            LogExtKt.logi("getServiceToken() null , login maybe");
            return null;
        }
        synchronized (this.mUpdateLock) {
            try {
                if (this.isUpdating) {
                    LogExtKt.logi("It is updating token, wait!");
                    this.mUpdateLock.wait();
                    token = getServiceToken(sid, false);
                } else {
                    this.isUpdating = true;
                    token = getToken(sid, forceRefresh, loginPolicy);
                    this.isUpdating = false;
                    this.mUpdateLock.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return token;
    }

    public final void setMAccessManager(@NotNull IMiAccountManager iMiAccountManager) {
        Intrinsics.checkNotNullParameter(iMiAccountManager, "<set-?>");
        this.mAccessManager = iMiAccountManager;
    }

    @Override // com.xiaomi.fitness.account.token.TokenManager
    public void setServiceToken(@NotNull String sid, @NotNull MiAccessToken accessToken) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.mAccessTokens.put(sid, accessToken);
    }

    @Override // com.xiaomi.fitness.account.token.TokenManager
    public void update() {
        this.mLoginSemaphore.countDown();
        this.mRefreshing.set(false);
    }

    private final MiAccessToken getServiceToken(String sid, boolean forceRefresh) {
        Account miAccount = getMAccessManager().getMiAccount();
        if (miAccount == null) {
            Logger.i("getServiceToken, account==null, invalidate=" + forceRefresh + ", isLocal:" + getMAccessManager().isUseLocal() + ", sid=" + sid, new Object[0]);
            miAccount = getMAccessManager().getMiAccount();
            if (miAccount == null) {
                return null;
            }
        }
        if (sid.length() == 0) {
            sid = getMAccessManager().getSid();
        }
        ServiceTokenResult serviceToken = getMAccessManager().getServiceToken(sid, forceRefresh);
        LogExtKt.safePrintI("getServiceToken: ServiceTokenResult: " + serviceToken);
        LogExtKt.logi("getServiceToken: get new token, forceRefresh is " + forceRefresh + ", sidTemp is " + sid);
        if (serviceToken.errorCode != ServiceTokenResult.ErrorCode.ERROR_NONE) {
            return null;
        }
        String name = serviceToken.userId;
        if (name == null) {
            name = miAccount.name;
            Intrinsics.checkNotNullExpressionValue(name, "name");
        }
        String str = name;
        MiAccessToken miAccessToken = this.mAccessTokens.get(sid);
        MiAccessToken miAccessToken2 = new MiAccessToken(str, serviceToken.cUserId, serviceToken.serviceToken, serviceToken.security, 0L, !Intrinsics.areEqual(miAccessToken != null ? miAccessToken.getServiceToken() : null, serviceToken.serviceToken), 16, null);
        this.mAccessTokens.put(sid, miAccessToken2);
        return miAccessToken2;
    }
}
