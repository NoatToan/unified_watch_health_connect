package com.xiaomi.fitness.account.token;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/account/token/CookieFetcher;", "", "sid", "", "getSid", "()Ljava/lang/String;", "fetch", "", "token", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "refreshToken", "", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CookieFetcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072B\u0010\b\u001a>\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\t¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/account/token/CookieFetcher$Companion;", "", "<init>", "()V", "newInstance", "Lcom/xiaomi/fitness/account/token/CookieFetcher;", "sid", "", "block", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "Lkotlin/ParameterName;", "name", "token", "", "map", "", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CookieFetcher newInstance(@NotNull final String sid, @NotNull final Function2<? super MiAccessToken, ? super Map<String, Object>, Unit> block) {
            Intrinsics.checkNotNullParameter(sid, "sid");
            Intrinsics.checkNotNullParameter(block, "block");
            return new CookieFetcher() { // from class: com.xiaomi.fitness.account.token.CookieFetcher$Companion$newInstance$1
                @Override // com.xiaomi.fitness.account.token.CookieFetcher
                public Map<String, Object> fetch(MiAccessToken token, boolean refreshToken) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (token != null) {
                        block.invoke(token, linkedHashMap);
                    }
                    return linkedHashMap;
                }

                @Override // com.xiaomi.fitness.account.token.CookieFetcher
                /* JADX INFO: renamed from: getSid, reason: from getter */
                public String get$sid() {
                    return sid;
                }
            };
        }
    }

    @NotNull
    Map<String, Object> fetch(@Nullable MiAccessToken token, boolean refreshToken);

    @NotNull
    /* JADX INFO: renamed from: getSid */
    String get$sid();
}
