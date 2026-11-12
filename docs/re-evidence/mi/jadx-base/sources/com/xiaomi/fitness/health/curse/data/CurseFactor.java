package com.xiaomi.fitness.health.curse.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "", "<init>", "()V", "Hurt", "Blood", "Motion", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor$Blood;", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor$Hurt;", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor$Motion;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CurseFactor {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/CurseFactor$Blood;", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Blood extends CurseFactor {

        @NotNull
        public static final Blood INSTANCE = new Blood();

        private Blood() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/CurseFactor$Hurt;", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hurt extends CurseFactor {

        @NotNull
        public static final Hurt INSTANCE = new Hurt();

        private Hurt() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/CurseFactor$Motion;", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Motion extends CurseFactor {

        @NotNull
        public static final Motion INSTANCE = new Motion();

        private Motion() {
            super(null);
        }
    }

    private CurseFactor() {
    }

    public /* synthetic */ CurseFactor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
