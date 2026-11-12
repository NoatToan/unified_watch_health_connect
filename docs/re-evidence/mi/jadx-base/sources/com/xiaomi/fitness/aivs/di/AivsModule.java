package com.xiaomi.fitness.aivs.di;

import android.os.IBinder;
import com.example.aivs.export.AivsHelper;
import com.mi.fitness.capability.export.model.CapabilityModel;
import com.xiaomi.fitness.account.token.CookieFetcher;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.aivs.di.AivsModule;
import com.xiaomi.fitness.aivs.impl.CourseScheduleManagerRemoteImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/aivs/di/AivsModule;", "", "<init>", "()V", "bindAivsHelper", "Lcom/example/aivs/export/AivsHelper;", "aivsHelperImpl", "Lcom/xiaomi/fitness/aivs/di/AivsHelperImpl;", "bindFitnessSyncRemote", "Landroid/os/IBinder;", "remote", "Lcom/xiaomi/fitness/aivs/impl/CourseScheduleManagerRemoteImpl;", "Companion", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AivsModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/aivs/di/AivsModule$Companion;", "", "<init>", "()V", "provideCookie", "Lcom/xiaomi/fitness/account/token/CookieFetcher;", "provideTTS", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            String serviceToken = token.getServiceToken();
            Intrinsics.checkNotNull(serviceToken);
            map.put("oauth2.0_serviceToken", serviceToken);
            return Unit.INSTANCE;
        }

        @NotNull
        public final CookieFetcher provideCookie() {
            return CookieFetcher.INSTANCE.newInstance("oauth2.0", new Function2() { // from class: i01
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AivsModule.Companion.provideCookie$lambda$0((MiAccessToken) obj, (Map) obj2);
                }
            });
        }

        @NotNull
        public final CapabilityModel provideTTS() {
            return new CapabilityModel(4);
        }
    }

    @NotNull
    public abstract AivsHelper bindAivsHelper(@NotNull AivsHelperImpl aivsHelperImpl);

    @NotNull
    public abstract IBinder bindFitnessSyncRemote(@NotNull CourseScheduleManagerRemoteImpl remote);
}
