package com.xiaomi.fitness.sport.route.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/PointType;", "", "type", "", "<init>", "(I)V", "getType", "()I", "setType", "StartPoint", "EndPoint", "WptPoint", "TurnPoint", "TrackPoint", "Reserve", "Lcom/xiaomi/fitness/sport/route/detail/PointType$EndPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType$Reserve;", "Lcom/xiaomi/fitness/sport/route/detail/PointType$StartPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType$TrackPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType$TurnPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType$WptPoint;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PointType {
    private int type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/PointType$EndPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EndPoint extends PointType {

        @NotNull
        public static final EndPoint INSTANCE = new EndPoint();

        private EndPoint() {
            super(2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/PointType$Reserve;", "Lcom/xiaomi/fitness/sport/route/detail/PointType;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Reserve extends PointType {

        @NotNull
        public static final Reserve INSTANCE = new Reserve();

        private Reserve() {
            super(32, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/PointType$StartPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StartPoint extends PointType {

        @NotNull
        public static final StartPoint INSTANCE = new StartPoint();

        private StartPoint() {
            super(1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/PointType$TrackPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TrackPoint extends PointType {

        @NotNull
        public static final TrackPoint INSTANCE = new TrackPoint();

        private TrackPoint() {
            super(16, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/PointType$TurnPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TurnPoint extends PointType {

        @NotNull
        public static final TurnPoint INSTANCE = new TurnPoint();

        private TurnPoint() {
            super(8, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/PointType$WptPoint;", "Lcom/xiaomi/fitness/sport/route/detail/PointType;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WptPoint extends PointType {

        @NotNull
        public static final WptPoint INSTANCE = new WptPoint();

        private WptPoint() {
            super(4, null);
        }
    }

    public /* synthetic */ PointType(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    private PointType(int i) {
        this.type = i;
    }
}
