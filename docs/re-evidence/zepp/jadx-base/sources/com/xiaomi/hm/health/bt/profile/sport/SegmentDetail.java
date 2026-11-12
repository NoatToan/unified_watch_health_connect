package com.xiaomi.hm.health.bt.profile.sport;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 (2\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001b\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u001e\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R$\u0010%\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail;", "Ljava/io/Serializable;", "", "isSegmentName", "", "getSegmentNameByteArray", "", "toString", "a", "[B", "getData", "()[B", "data", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "b", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "getSportType", "()Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "sportType", "", "c", LogUtil.I, "getType", "()I", "type", GoogleApiAvailabilityLight.a, "getAvgHR", "avgHR", "e", "getMaxHR", "maxHR", "f", "Ljava/lang/String;", "getSegmentName", "()Ljava/lang/String;", "setSegmentName", "(Ljava/lang/String;)V", "segmentName", "<init>", "([B)V", "Companion", "SportType", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SegmentDetail implements Serializable {
    public static final int DATA_LEN = 6;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final byte[] data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SportType sportType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int avgHR;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int maxHR;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String segmentName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0011\u0014\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "", "", "toString", "a", "Ljava/lang/String;", "getName$bluetooth_release", "()Ljava/lang/String;", "name", "", "b", LogUtil.I, "getType", "()I", "type", "<init>", "(Ljava/lang/String;I)V", "Companion", "Btwb", "Coach", "CrossFit", "SegmentName", "Unknown", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$Coach;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$CrossFit;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$Btwb;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$SegmentName;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$Unknown;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class SportType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$Btwb;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Btwb extends SportType {

            @NotNull
            public static final Btwb INSTANCE = new Btwb();

            private Btwb() {
                super("BTWB", 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$Coach;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Coach extends SportType {

            @NotNull
            public static final Coach INSTANCE = new Coach();

            private Coach() {
                super("Coach", 0, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final SportType valueOf(int type) {
                Coach coach = Coach.INSTANCE;
                if (type == coach.getType()) {
                    return coach;
                }
                CrossFit crossFit = CrossFit.INSTANCE;
                if (type == crossFit.getType()) {
                    return crossFit;
                }
                Btwb btwb = Btwb.INSTANCE;
                if (type == btwb.getType()) {
                    return btwb;
                }
                SegmentName segmentName = SegmentName.INSTANCE;
                return type == segmentName.getType() ? segmentName : Unknown.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$CrossFit;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class CrossFit extends SportType {

            @NotNull
            public static final CrossFit INSTANCE = new CrossFit();

            private CrossFit() {
                super("CrossFit", 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$SegmentName;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class SegmentName extends SportType {

            @NotNull
            public static final SegmentName INSTANCE = new SegmentName();

            private SegmentName() {
                super("SegmentName", 3, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/sport/SegmentDetail$SportType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Unknown extends SportType {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super("Unknown", -1, null);
            }
        }

        private SportType(String str, int i) {
            this.name = str;
            this.type = i;
        }

        public /* synthetic */ SportType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        @JvmStatic
        @NotNull
        public static final SportType valueOf(int i) {
            return INSTANCE.valueOf(i);
        }

        @NotNull
        /* JADX INFO: renamed from: getName$bluetooth_release, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public String toString() {
            return "SportType(name='" + this.name + "', type='" + this.type + "')";
        }
    }

    public SegmentDetail(@NotNull byte[] bArr) {
        this.data = bArr;
        if (bArr.length < 6) {
            this.sportType = SportType.Unknown.INSTANCE;
            this.type = -1;
            this.avgHR = -1;
            this.maxHR = -1;
            return;
        }
        this.sportType = SportType.INSTANCE.valueOf(ByteUtilsKt.toInt(bArr, 1, 0));
        this.type = ByteUtilsKt.toInt(bArr, 1, 1);
        this.avgHR = ByteUtilsKt.toInt(bArr, 1, 2);
        this.maxHR = ByteUtilsKt.toInt(bArr, 1, 3);
    }

    public final int getAvgHR() {
        return this.avgHR;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getMaxHR() {
        return this.maxHR;
    }

    @Nullable
    public final String getSegmentName() {
        return this.segmentName;
    }

    @NotNull
    public final byte[] getSegmentNameByteArray() {
        return ArraysKt___ArraysJvmKt.copyOfRange(this.data, 1, 6);
    }

    @NotNull
    public final SportType getSportType() {
        return this.sportType;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isSegmentName() {
        return this.sportType.getType() == SportType.SegmentName.INSTANCE.getType();
    }

    public final void setSegmentName(@Nullable String str) {
        this.segmentName = str;
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this.sportType, SportType.SegmentName.INSTANCE)) {
            return "SegmentDetail(sportType=" + this.sportType + ", segmentName=" + ArraysKt___ArraysKt.toList(this.data).subList(1, this.data.length) + ')';
        }
        return "SegmentDetail(sportType=" + this.sportType + ", type=" + this.type + ", avgHR=" + this.avgHR + ", maxHR=" + this.maxHR + ", segmentName=" + ((Object) this.segmentName) + ')';
    }
}
