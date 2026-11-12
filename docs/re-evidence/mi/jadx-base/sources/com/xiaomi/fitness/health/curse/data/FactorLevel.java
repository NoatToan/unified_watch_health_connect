package com.xiaomi.fitness.health.curse.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/FactorLevel;", "", "<init>", "()V", "None", "Lite", "Mid", "Bad", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel$Bad;", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel$Lite;", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel$Mid;", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel$None;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FactorLevel {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/FactorLevel$Bad;", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bad extends FactorLevel {

        @NotNull
        public static final Bad INSTANCE = new Bad();

        private Bad() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/FactorLevel$Lite;", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Lite extends FactorLevel {

        @NotNull
        public static final Lite INSTANCE = new Lite();

        private Lite() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/FactorLevel$Mid;", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mid extends FactorLevel {

        @NotNull
        public static final Mid INSTANCE = new Mid();

        private Mid() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/FactorLevel$None;", "Lcom/xiaomi/fitness/health/curse/data/FactorLevel;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends FactorLevel {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    private FactorLevel() {
    }

    public /* synthetic */ FactorLevel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
