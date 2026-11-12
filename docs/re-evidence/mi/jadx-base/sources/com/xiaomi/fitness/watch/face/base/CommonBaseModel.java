package com.xiaomi.fitness.watch.face.base;

import com.xiaomi.fitness.account.token.CookieFetcher;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.watch.face.base.CommonBaseModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/watch/face/base/CommonBaseModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonBaseModel extends BaseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/watch/face/base/CommonBaseModel$Companion;", "", "<init>", "()V", "provideCookie", "Lcom/xiaomi/fitness/account/token/CookieFetcher;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            map.put("serviceToken", serviceToken);
            return Unit.INSTANCE;
        }

        @NotNull
        public final CookieFetcher provideCookie() {
            return CookieFetcher.INSTANCE.newInstance("miothealth", new Function2() { // from class: n54
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommonBaseModel.Companion.provideCookie$lambda$0((MiAccessToken) obj, (Map) obj2);
                }
            });
        }
    }
}
