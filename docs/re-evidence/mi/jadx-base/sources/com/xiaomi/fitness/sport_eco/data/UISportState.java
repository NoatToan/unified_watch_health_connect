package com.xiaomi.fitness.sport_eco.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "", "<init>", "()V", "Start", "Pause", "Restart", "Rest", "Finish", "Lcom/xiaomi/fitness/sport_eco/data/UISportState$Finish;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState$Pause;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState$Rest;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState$Restart;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState$Start;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UISportState {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/data/UISportState$Finish;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "validSport", "", "<init>", "(Z)V", "getValidSport", "()Z", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Finish extends UISportState {
        private final boolean validSport;

        public Finish(boolean z) {
            super(null);
            this.validSport = z;
        }

        public final boolean getValidSport() {
            return this.validSport;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/data/UISportState$Pause;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pause extends UISportState {

        @NotNull
        public static final Pause INSTANCE = new Pause();

        private Pause() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/data/UISportState$Rest;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Rest extends UISportState {

        @NotNull
        public static final Rest INSTANCE = new Rest();

        private Rest() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/data/UISportState$Restart;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Restart extends UISportState {

        @NotNull
        public static final Restart INSTANCE = new Restart();

        private Restart() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/data/UISportState$Start;", "Lcom/xiaomi/fitness/sport_eco/data/UISportState;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Start extends UISportState {

        @NotNull
        public static final Start INSTANCE = new Start();

        private Start() {
            super(null);
        }
    }

    private UISportState() {
    }

    public /* synthetic */ UISportState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
