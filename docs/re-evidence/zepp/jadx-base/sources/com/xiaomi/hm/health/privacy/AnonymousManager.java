package com.xiaomi.hm.health.privacy;

import android.content.Context;
import com.huami.account.HMLoginManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.service.AnonymousInfo;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.di.koin.KoinLifecycleManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/privacy/AnonymousManager;", "", "", "isAnonymousLogin", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "initAnonymousUser", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AnonymousManager {

    @NotNull
    public static final AnonymousManager INSTANCE = new AnonymousManager();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/account/service/AnonymousInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AnonymousInfo> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousInfo invoke() {
            if (!AnonymousManager.isAnonymousLogin() || HMProcessLoginDataManager.isInLoginProcess()) {
                return null;
            }
            return new AnonymousInfo("0", "_ANONYMOUS", "1");
        }
    }

    private AnonymousManager() {
    }

    @JvmStatic
    public static final void initAnonymousUser(@NotNull Context context) {
        HMLoginManager.initAnonymousUser(context);
        KoinLifecycleManager.INSTANCE.startUserLifecycle();
        AnonymousInfoManager.setAnonymousInfoProvider(a.a);
    }

    @JvmStatic
    public static final boolean isAnonymousLogin() {
        return Language.isSimplifiedChinese() && HMLoginManager.isUnInit() && !GlobalConfig.get().isBuildPlay();
    }
}
