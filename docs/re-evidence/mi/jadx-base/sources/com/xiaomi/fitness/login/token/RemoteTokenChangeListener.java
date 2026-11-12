package com.xiaomi.fitness.login.token;

import com.xiaomi.fitness.account.token.AccessTokenObserver;
import com.xiaomi.fitness.account.token.MiAccessToken;
import defpackage.kip;
import defpackage.n7h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/login/token/RemoteTokenChangeListener;", "Ln7h$a;", "", "sid", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "token", "", "onChange", "(Ljava/lang/String;Lcom/xiaomi/fitness/account/token/MiAccessToken;)V", "Lkip;", "remoteTokenManager", "addToRemote", "(Lkip;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/xiaomi/fitness/account/token/AccessTokenObserver;", "mListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRemoteTokenChangeListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteTokenChangeListener.kt\ncom/xiaomi/fitness/login/token/RemoteTokenChangeListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,30:1\n1863#2,2:31\n216#3,2:33\n*S KotlinDebug\n*F\n+ 1 RemoteTokenChangeListener.kt\ncom/xiaomi/fitness/login/token/RemoteTokenChangeListener\n*L\n17#1:31,2\n26#1:33,2\n*E\n"})
public final class RemoteTokenChangeListener extends n7h.a {

    @NotNull
    private final ConcurrentHashMap<String, Collection<AccessTokenObserver>> mListeners;

    public RemoteTokenChangeListener(@NotNull ConcurrentHashMap<String, Collection<AccessTokenObserver>> mListeners) {
        Intrinsics.checkNotNullParameter(mListeners, "mListeners");
        this.mListeners = mListeners;
    }

    public final void addToRemote(@Nullable kip remoteTokenManager) {
        if (remoteTokenManager == null) {
            return;
        }
        Iterator<Map.Entry<String, Collection<AccessTokenObserver>>> it = this.mListeners.entrySet().iterator();
        while (it.hasNext()) {
            remoteTokenManager.addTokenChangeListener(it.next().getKey(), this);
        }
    }

    @Override // defpackage.n7h
    public void onChange(@NotNull String sid, @Nullable MiAccessToken token) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Collection<AccessTokenObserver> collection = this.mListeners.get(sid);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((AccessTokenObserver) it.next()).onChange(token);
            }
        }
    }
}
