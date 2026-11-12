package com.xiaomi.fitness.medal.di;

import com.xiaomi.fitness.account.token.CookieFetcher;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.medal.MedalManagerImpl;
import com.xiaomi.fitness.medal.di.MedalSingleModule;
import com.xiaomi.fitness.medal.export.MedalManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/medal/di/MedalSingleModule;", "", "<init>", "()V", "bindDeviceManager", "Lcom/xiaomi/fitness/medal/export/MedalManager;", "medalManagerImpl", "Lcom/xiaomi/fitness/medal/MedalManagerImpl;", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MedalSingleModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/medal/di/MedalSingleModule$Companion;", "", "<init>", "()V", "provideCookie", "Lcom/xiaomi/fitness/account/token/CookieFetcher;", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit provideCookie$lambda$0(MiAccessToken token, Map map) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(map, "map");
            String cUserId = token.getCUserId();
            Intrinsics.checkNotNull(cUserId);
            map.put("cUserId", cUserId);
            map.put("auth_key", "rwelJuWBFJxmbMKD");
            String serviceToken = token.getServiceToken();
            Intrinsics.checkNotNull(serviceToken);
            map.put("serviceToken", serviceToken);
            map.put("locale", LocaleUtil.getCurrentLocale());
            return Unit.INSTANCE;
        }

        @NotNull
        public final CookieFetcher provideCookie() {
            return CookieFetcher.INSTANCE.newInstance("miothealth", new Function2() { // from class: whf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MedalSingleModule.Companion.provideCookie$lambda$0((MiAccessToken) obj, (Map) obj2);
                }
            });
        }
    }

    @NotNull
    public abstract MedalManager bindDeviceManager(@NotNull MedalManagerImpl medalManagerImpl);
}
