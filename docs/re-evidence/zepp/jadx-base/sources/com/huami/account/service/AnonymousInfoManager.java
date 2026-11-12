package com.huami.account.service;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0007R*\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/account/service/AnonymousInfoManager;", "", "Lcom/huami/account/service/AnonymousInfo;", "getAnonymousInfo", "Lkotlin/Function0;", "provider", "", "setAnonymousInfoProvider", "a", "Lkotlin/jvm/functions/Function0;", "getAnonymousInfoProvider$service_release", "()Lkotlin/jvm/functions/Function0;", "setAnonymousInfoProvider$service_release", "(Lkotlin/jvm/functions/Function0;)V", "anonymousInfoProvider", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
public final class AnonymousInfoManager {

    @NotNull
    public static final AnonymousInfoManager INSTANCE = new AnonymousInfoManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static Function0<AnonymousInfo> anonymousInfoProvider = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    private AnonymousInfoManager() {
    }

    @JvmStatic
    @Nullable
    public static final AnonymousInfo getAnonymousInfo() {
        return anonymousInfoProvider.invoke();
    }

    @JvmStatic
    public static final void setAnonymousInfoProvider(@NotNull Function0<AnonymousInfo> provider) {
        anonymousInfoProvider = provider;
    }

    @NotNull
    public final Function0<AnonymousInfo> getAnonymousInfoProvider$service_release() {
        return anonymousInfoProvider;
    }

    public final void setAnonymousInfoProvider$service_release(@NotNull Function0<AnonymousInfo> function0) {
        anonymousInfoProvider = function0;
    }
}
