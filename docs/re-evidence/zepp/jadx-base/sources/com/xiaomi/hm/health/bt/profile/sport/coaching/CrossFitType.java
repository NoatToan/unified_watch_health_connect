package com.xiaomi.hm.health.bt.profile.sport.coaching;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0013\u0011\u0014\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "", "", "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "b", LogUtil.I, "getType", "()I", "type", "<init>", "(Ljava/lang/String;I)V", "Companion", "Amrap", "CoachCrossfit", "Emom", "ForTime", "Unknown", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$CoachCrossfit;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$Amrap;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$Emom;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$ForTime;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$Unknown;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class CrossFitType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$Amrap;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Amrap extends CrossFitType {

        @NotNull
        public static final Amrap INSTANCE = new Amrap();

        private Amrap() {
            super("Amrap", 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$CoachCrossfit;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class CoachCrossfit extends CrossFitType {

        @NotNull
        public static final CoachCrossfit INSTANCE = new CoachCrossfit();

        private CoachCrossfit() {
            super("CoachCrossfit", 0, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CrossFitType valueOf(int type) {
            Amrap amrap = Amrap.INSTANCE;
            if (type == amrap.getType()) {
                return amrap;
            }
            Emom emom = Emom.INSTANCE;
            if (type == emom.getType()) {
                return emom;
            }
            ForTime forTime = ForTime.INSTANCE;
            return type == forTime.getType() ? forTime : Unknown.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$Emom;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Emom extends CrossFitType {

        @NotNull
        public static final Emom INSTANCE = new Emom();

        private Emom() {
            super("Emom", 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$ForTime;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ForTime extends CrossFitType {

        @NotNull
        public static final ForTime INSTANCE = new ForTime();

        private ForTime() {
            super("ForTime", 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CrossFitType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Unknown extends CrossFitType {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("Unknown", -1, null);
        }
    }

    private CrossFitType(String str, int i) {
        this.name = str;
        this.type = i;
    }

    public /* synthetic */ CrossFitType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @JvmStatic
    @NotNull
    public static final CrossFitType valueOf(int i) {
        return INSTANCE.valueOf(i);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public String toString() {
        return "CrossFitType(name='" + this.name + "', type='" + this.type + "')";
    }
}
