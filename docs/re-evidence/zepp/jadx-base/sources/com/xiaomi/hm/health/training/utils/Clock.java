package com.xiaomi.hm.health.training.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/training/utils/Clock;", "", "", "currentTimeMillis", "Companion", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
public interface Clock {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/training/utils/Clock$Companion;", "", "Lcom/xiaomi/hm/health/training/utils/Clock;", "getDefault", "()Lcom/xiaomi/hm/health/training/utils/Clock;", "default", "<init>", "()V", "trainingcomponent_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final Clock getDefault() {
            return new Clock() { // from class: com.xiaomi.hm.health.training.utils.Clock$Companion$default$1
                @Override // com.xiaomi.hm.health.training.utils.Clock
                public long currentTimeMillis() {
                    return Clock.DefaultImpls.currentTimeMillis(this);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static long currentTimeMillis(@NotNull Clock clock) {
            return System.currentTimeMillis();
        }
    }

    long currentTimeMillis();
}
