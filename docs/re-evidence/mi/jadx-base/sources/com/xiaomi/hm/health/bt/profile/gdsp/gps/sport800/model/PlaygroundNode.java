package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import defpackage.d3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundNode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "time", "", "gpsDistance", "", "loopDistance", "toleranceDistance", "playgroundTemplatePara", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "(JFFFLcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;)V", "getGpsDistance", "()F", "getLoopDistance", "getPlaygroundTemplatePara", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundTemplatePara;", "getTime", "()J", "getToleranceDistance", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PlaygroundNode extends BaseNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float gpsDistance;
    private final float loopDistance;

    @NotNull
    private final PlaygroundTemplatePara playgroundTemplatePara;
    private final long time;
    private final float toleranceDistance;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundNode$Companion;", "", "()V", "parse", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/PlaygroundNode;", "byteArray", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlaygroundNode parse(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            d3 d3Var = new d3(byteArray);
            long jC = d3.c(d3Var, 0, 1, null);
            float fA = d3Var.a();
            float fA2 = d3Var.a();
            float fA3 = d3Var.a();
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new GPSPointCoorInt32[]{new GPSPointCoorInt32(d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null)), new GPSPointCoorInt32(d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null)), new GPSPointCoorInt32(d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null)), new GPSPointCoorInt32(d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null))});
            return new PlaygroundNode(jC, fA, fA2, fA3, new PlaygroundTemplatePara(d3Var.a(), d3Var.a(), new GPSPointCoorInt32(d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null)), listListOf, new GPSPointCoorInt32(d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null)), new GPSPointCoorInt32(d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null)), d3.b(d3Var, 0, 1, null), d3Var.a()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaygroundNode(long j, float f, float f2, float f3, @NotNull PlaygroundTemplatePara playgroundTemplatePara) {
        super(j);
        Intrinsics.checkNotNullParameter(playgroundTemplatePara, "playgroundTemplatePara");
        this.time = j;
        this.gpsDistance = f;
        this.loopDistance = f2;
        this.toleranceDistance = f3;
        this.playgroundTemplatePara = playgroundTemplatePara;
    }

    public final float getGpsDistance() {
        return this.gpsDistance;
    }

    public final float getLoopDistance() {
        return this.loopDistance;
    }

    @NotNull
    public final PlaygroundTemplatePara getPlaygroundTemplatePara() {
        return this.playgroundTemplatePara;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getToleranceDistance() {
        return this.toleranceDistance;
    }
}
