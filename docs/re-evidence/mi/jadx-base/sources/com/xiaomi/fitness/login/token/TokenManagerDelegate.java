package com.xiaomi.fitness.login.token;

import android.os.IBinder;
import android.os.RemoteException;
import com.miui.tsmclient.account.OAuthAccountManager;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.token.AccessTokenObserver;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.token.TokenManagerDelegate;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.kip;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b+\u0010\u0015J)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R/\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/login/token/TokenManagerDelegate;", "Lcom/xiaomi/fitness/login/token/TokenManagerInternal;", "", "sid", "", "forceRefresh", "", "loginPolicy", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "getServiceToken", "(Ljava/lang/String;ZI)Lcom/xiaomi/fitness/account/token/MiAccessToken;", OAuthAccountManager.MiOAuthConstant.TOKEN, "", "setServiceToken", "(Ljava/lang/String;Lcom/xiaomi/fitness/account/token/MiAccessToken;)V", "Lcom/xiaomi/fitness/account/token/AccessTokenObserver;", "observer", "registerObserver", "(Ljava/lang/String;Lcom/xiaomi/fitness/account/token/AccessTokenObserver;)V", "unregisterObserver", "update", "()V", "Lkip;", "<set-?>", "mRemoteTokenManager$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMRemoteTokenManager", "()Lkip;", "setMRemoteTokenManager", "(Lkip;)V", "mRemoteTokenManager", "Ljava/util/concurrent/ConcurrentHashMap;", "", "mListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/fitness/login/token/RemoteTokenChangeListener;", "mRemoteTokenChangeListener", "Lcom/xiaomi/fitness/login/token/RemoteTokenChangeListener;", "Ljava/lang/Object;", "mRemoteConnectLock", "Ljava/lang/Object;", "mWaiting", "Z", "<init>", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TokenManagerDelegate implements TokenManagerInternal {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TokenManagerDelegate.class, "mRemoteTokenManager", "getMRemoteTokenManager()Lcom/xiaomi/fitness/login/TokenManagerRemote;", 0))};

    @NotNull
    private final ConcurrentHashMap<String, Collection<AccessTokenObserver>> mListeners;

    @NotNull
    private final Object mRemoteConnectLock;

    @NotNull
    private final RemoteTokenChangeListener mRemoteTokenChangeListener;

    /* JADX INFO: renamed from: mRemoteTokenManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mRemoteTokenManager = new BinderDelegate("mRemoteTokenManager");
    private volatile boolean mWaiting;

    public TokenManagerDelegate() {
        ConcurrentHashMap<String, Collection<AccessTokenObserver>> concurrentHashMap = new ConcurrentHashMap<>();
        this.mListeners = concurrentHashMap;
        this.mRemoteTokenChangeListener = new RemoteTokenChangeListener(concurrentHashMap);
        this.mRemoteConnectLock = new Object();
        ServiceConnector.INSTANCE.getBinder(9, new Function1() { // from class: gip
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TokenManagerDelegate._init_$lambda$0(this.f19039a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(TokenManagerDelegate this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setMRemoteTokenManager(kip.a.asInterface(iBinder));
        Logger.i("init:getBinder: TokenManagerRemote(" + this$0.getMRemoteTokenManager() + ")", new Object[0]);
        this$0.mRemoteTokenChangeListener.addToRemote(this$0.getMRemoteTokenManager());
        AnyExtKt.io$default(null, new TokenManagerDelegate$1$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    private final kip getMRemoteTokenManager() {
        return (kip) this.mRemoteTokenManager.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMRemoteTokenManager(kip kipVar) {
        this.mRemoteTokenManager.setValue((Object) this, $$delegatedProperties[0], kipVar);
    }

    @Override // com.xiaomi.fitness.account.token.TokenManager
    @Nullable
    public MiAccessToken getServiceToken(@NotNull String sid, boolean forceRefresh, int loginPolicy) {
        MiAccessToken serviceToken;
        Intrinsics.checkNotNullParameter(sid, "sid");
        if (loginPolicy != 2) {
            boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
            Logger.i("getServiceToken not login request loginPolicy " + loginPolicy + ", login " + zIsLogin, new Object[0]);
            if (!zIsLogin) {
                return null;
            }
        }
        synchronized (this.mRemoteConnectLock) {
            try {
                if (getMRemoteTokenManager() == null) {
                    Logger.i("mRemoteTokenManager is null, wait up to 5s", new Object[0]);
                    this.mWaiting = true;
                    this.mRemoteConnectLock.wait(5000L);
                    this.mWaiting = false;
                }
                Logger.i("Remote is connected, then get token", new Object[0]);
                kip mRemoteTokenManager = getMRemoteTokenManager();
                serviceToken = mRemoteTokenManager != null ? mRemoteTokenManager.getServiceToken(sid, forceRefresh, loginPolicy) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceToken;
    }

    @Override // com.xiaomi.fitness.login.token.TokenManagerInternal
    public void registerObserver(@NotNull String sid, @NotNull AccessTokenObserver observer) throws RemoteException {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<AccessTokenObserver> arrayList = this.mListeners.get(sid);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mListeners.put(sid, arrayList);
            kip mRemoteTokenManager = getMRemoteTokenManager();
            if (mRemoteTokenManager != null) {
                mRemoteTokenManager.addTokenChangeListener(sid, this.mRemoteTokenChangeListener);
            }
        }
        arrayList.add(observer);
    }

    @Override // com.xiaomi.fitness.account.token.TokenManager
    public void setServiceToken(@NotNull String sid, @NotNull MiAccessToken accessToken) throws RemoteException {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        kip mRemoteTokenManager = getMRemoteTokenManager();
        if (mRemoteTokenManager != null) {
            mRemoteTokenManager.setServiceToken(sid, accessToken);
        }
    }

    @Override // com.xiaomi.fitness.login.token.TokenManagerInternal
    public void unregisterObserver(@NotNull String sid, @NotNull AccessTokenObserver observer) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Collection<AccessTokenObserver> collection = this.mListeners.get(sid);
        if (collection != null) {
            collection.remove(observer);
        }
    }

    @Override // com.xiaomi.fitness.account.token.TokenManager
    public void update() throws RemoteException {
        kip mRemoteTokenManager = getMRemoteTokenManager();
        if (mRemoteTokenManager != null) {
            mRemoteTokenManager.update();
        }
    }
}
