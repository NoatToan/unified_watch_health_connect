package com.huami.pai.vo;

import androidx.annotation.Keep;
import com.xiaomi.hm.health.Constant;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u00010\u0004\u0012\b\u00102\u001a\u0004\u0018\u00010\u0007\u0012\b\u00103\u001a\u0004\u0018\u00010\u0007\u0012\b\u00104\u001a\u0004\u0018\u00010\u0004\u0012\b\u00105\u001a\u0004\u0018\u00010\u0004\u0012\b\u00106\u001a\u0004\u0018\u00010\u0007\u0012\b\u00107\u001a\u0004\u0018\u00010\u0007\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\b\u0010<\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010=\u001a\u00020\u001d\u0012\u0006\u0010>\u001a\u00020\u001d\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010@\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010A\u001a\u00020\u0002\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bt\u0010uJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0006J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u0006J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\tJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0006J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0006J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\tJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0006J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0006J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\tJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0006J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010 \u001a\u00020\u001dHÆ\u0003J\t\u0010!\u001a\u00020\u001dHÆ\u0003J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\tJ\u0012\u0010#\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\t\u0010$\u001a\u00020\u0002HÆ\u0003J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u0006Jâ\u0002\u0010C\u001a\u00020\u00002\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010+\u001a\u00020\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010;\u001a\u00020\u00022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010=\u001a\u00020\u001d2\b\b\u0002\u0010>\u001a\u00020\u001d2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010A\u001a\u00020\u00022\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bC\u0010DJ\t\u0010E\u001a\u00020\u0002HÖ\u0001J\t\u0010F\u001a\u00020\u0004HÖ\u0001J\u0013\u0010I\u001a\u00020H2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010J\u001a\u0004\bK\u0010LR$\u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010M\u001a\u0004\bN\u0010\u0006\"\u0004\bO\u0010PR\u001b\u0010(\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010Q\u001a\u0004\bR\u0010\tR\u001b\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010J\u001a\u0004\bS\u0010LR$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010M\u001a\u0004\bT\u0010\u0006\"\u0004\bU\u0010PR\u0019\u0010+\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\bV\u0010LR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010M\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010PR$\u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010M\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010PR\u001b\u0010.\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010Q\u001a\u0004\b[\u0010\tR\u001b\u0010/\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010Q\u001a\u0004\b\\\u0010\tR\u001b\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010M\u001a\u0004\b]\u0010\u0006R\u001b\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010M\u001a\u0004\b^\u0010\u0006R\u001b\u00102\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010Q\u001a\u0004\b_\u0010\tR\u001b\u00103\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010Q\u001a\u0004\b`\u0010\tR$\u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010M\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010PR\u001b\u00105\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010M\u001a\u0004\bc\u0010\u0006R\u001b\u00106\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010Q\u001a\u0004\bd\u0010\tR\u001b\u00107\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010Q\u001a\u0004\be\u0010\tR\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010J\u001a\u0004\bf\u0010LR\u001b\u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010M\u001a\u0004\bg\u0010\u0006R\u001b\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010J\u001a\u0004\bh\u0010LR\u0019\u0010;\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010J\u001a\u0004\bi\u0010LR\u001b\u0010<\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010j\u001a\u0004\bk\u0010\u001fR\u0019\u0010=\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010l\u001a\u0004\bm\u0010nR\u0019\u0010>\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010l\u001a\u0004\bo\u0010nR\u001b\u0010?\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010Q\u001a\u0004\bp\u0010\tR\u001b\u0010@\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010j\u001a\u0004\bq\u0010\u001fR\u0019\u0010A\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010J\u001a\u0004\br\u0010LR\u001b\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010M\u001a\u0004\bs\u0010\u0006¨\u0006v"}, d2 = {"Lcom/huami/pai/vo/PaiRemoteVo;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "", "component3", "()Ljava/lang/Float;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "", "component23", "()Ljava/lang/Long;", "component24", "component25", "component26", "component27", "component28", "component29", "activityScores", "age", "dailyPai", "deviceId", "deviceSource", "eventType", "gender", "highZoneLowerLimit", "highZoneMinutes", "highZonePai", "index", "lowZoneLowerLimit", "lowZoneMinutes", "lowZonePai", Constant.PAI_KEY_MAX_HR, "mediumZoneLowerLimit", "mediumZoneMinutes", "mediumZonePai", "nextActivityScores", Constant.PAI_KEY_RHR, "sn", "subType", "time", "timeZone", "timestamp", "totalPai", "uploadTimestamp", "userId", "version", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JJLjava/lang/Float;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/pai/vo/PaiRemoteVo;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getActivityScores", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getAge", "setAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Float;", "getDailyPai", "getDeviceId", "getDeviceSource", "setDeviceSource", "getEventType", "getGender", "setGender", "getHighZoneLowerLimit", "setHighZoneLowerLimit", "getHighZoneMinutes", "getHighZonePai", "getIndex", "getLowZoneLowerLimit", "getLowZoneMinutes", "getLowZonePai", "getMaxHr", "setMaxHr", "getMediumZoneLowerLimit", "getMediumZoneMinutes", "getMediumZonePai", "getNextActivityScores", "getRestHr", "getSn", "getSubType", "Ljava/lang/Long;", "getTime", "J", "getTimeZone", "()J", "getTimestamp", "getTotalPai", "getUploadTimestamp", "getUserId", "getVersion", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;JJLjava/lang/Float;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PaiRemoteVo {

    @Nullable
    private final String activityScores;

    @Nullable
    private Integer age;

    @Nullable
    private final Float dailyPai;

    @Nullable
    private final String deviceId;

    @Nullable
    private Integer deviceSource;

    @NotNull
    private final String eventType;

    @Nullable
    private Integer gender;

    @Nullable
    private Integer highZoneLowerLimit;

    @Nullable
    private final Float highZoneMinutes;

    @Nullable
    private final Float highZonePai;

    @Nullable
    private final Integer index;

    @Nullable
    private final Integer lowZoneLowerLimit;

    @Nullable
    private final Float lowZoneMinutes;

    @Nullable
    private final Float lowZonePai;

    @Nullable
    private Integer maxHr;

    @Nullable
    private final Integer mediumZoneLowerLimit;

    @Nullable
    private final Float mediumZoneMinutes;

    @Nullable
    private final Float mediumZonePai;

    @Nullable
    private final String nextActivityScores;

    @Nullable
    private final Integer restHr;

    @Nullable
    private final String sn;

    @NotNull
    private final String subType;

    @Nullable
    private final Long time;
    private final long timeZone;
    private final long timestamp;

    @Nullable
    private final Float totalPai;

    @Nullable
    private final Long uploadTimestamp;

    @NotNull
    private final String userId;

    @Nullable
    private final Integer version;

    public PaiRemoteVo(@Nullable String str, @Nullable Integer num, @Nullable Float f, @Nullable String str2, @Nullable Integer num2, @NotNull String str3, @Nullable Integer num3, @Nullable Integer num4, @Nullable Float f2, @Nullable Float f3, @Nullable Integer num5, @Nullable Integer num6, @Nullable Float f4, @Nullable Float f5, @Nullable Integer num7, @Nullable Integer num8, @Nullable Float f6, @Nullable Float f7, @Nullable String str4, @Nullable Integer num9, @Nullable String str5, @NotNull String str6, @Nullable Long l, long j, long j2, @Nullable Float f8, @Nullable Long l2, @NotNull String str7, @Nullable Integer num10) {
        this.activityScores = str;
        this.age = num;
        this.dailyPai = f;
        this.deviceId = str2;
        this.deviceSource = num2;
        this.eventType = str3;
        this.gender = num3;
        this.highZoneLowerLimit = num4;
        this.highZoneMinutes = f2;
        this.highZonePai = f3;
        this.index = num5;
        this.lowZoneLowerLimit = num6;
        this.lowZoneMinutes = f4;
        this.lowZonePai = f5;
        this.maxHr = num7;
        this.mediumZoneLowerLimit = num8;
        this.mediumZoneMinutes = f6;
        this.mediumZonePai = f7;
        this.nextActivityScores = str4;
        this.restHr = num9;
        this.sn = str5;
        this.subType = str6;
        this.time = l;
        this.timeZone = j;
        this.timestamp = j2;
        this.totalPai = f8;
        this.uploadTimestamp = l2;
        this.userId = str7;
        this.version = num10;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityScores() {
        return this.activityScores;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Float getHighZonePai() {
        return this.highZonePai;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getLowZoneLowerLimit() {
        return this.lowZoneLowerLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Float getLowZoneMinutes() {
        return this.lowZoneMinutes;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Float getLowZonePai() {
        return this.lowZonePai;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getMediumZoneLowerLimit() {
        return this.mediumZoneLowerLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Float getMediumZoneMinutes() {
        return this.mediumZoneMinutes;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Float getMediumZonePai() {
        return this.mediumZonePai;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getNextActivityScores() {
        return this.nextActivityScores;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getRestHr() {
        return this.restHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final long getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Float getTotalPai() {
        return this.totalPai;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getDailyPai() {
        return this.dailyPai;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getHighZoneLowerLimit() {
        return this.highZoneLowerLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Float getHighZoneMinutes() {
        return this.highZoneMinutes;
    }

    @NotNull
    public final PaiRemoteVo copy(@Nullable String activityScores, @Nullable Integer age, @Nullable Float dailyPai, @Nullable String deviceId, @Nullable Integer deviceSource, @NotNull String eventType, @Nullable Integer gender, @Nullable Integer highZoneLowerLimit, @Nullable Float highZoneMinutes, @Nullable Float highZonePai, @Nullable Integer index, @Nullable Integer lowZoneLowerLimit, @Nullable Float lowZoneMinutes, @Nullable Float lowZonePai, @Nullable Integer maxHr, @Nullable Integer mediumZoneLowerLimit, @Nullable Float mediumZoneMinutes, @Nullable Float mediumZonePai, @Nullable String nextActivityScores, @Nullable Integer restHr, @Nullable String sn, @NotNull String subType, @Nullable Long time, long timeZone, long timestamp, @Nullable Float totalPai, @Nullable Long uploadTimestamp, @NotNull String userId, @Nullable Integer version) {
        return new PaiRemoteVo(activityScores, age, dailyPai, deviceId, deviceSource, eventType, gender, highZoneLowerLimit, highZoneMinutes, highZonePai, index, lowZoneLowerLimit, lowZoneMinutes, lowZonePai, maxHr, mediumZoneLowerLimit, mediumZoneMinutes, mediumZonePai, nextActivityScores, restHr, sn, subType, time, timeZone, timestamp, totalPai, uploadTimestamp, userId, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaiRemoteVo)) {
            return false;
        }
        PaiRemoteVo paiRemoteVo = (PaiRemoteVo) other;
        return Intrinsics.areEqual(this.activityScores, paiRemoteVo.activityScores) && Intrinsics.areEqual(this.age, paiRemoteVo.age) && Intrinsics.areEqual((Object) this.dailyPai, (Object) paiRemoteVo.dailyPai) && Intrinsics.areEqual(this.deviceId, paiRemoteVo.deviceId) && Intrinsics.areEqual(this.deviceSource, paiRemoteVo.deviceSource) && Intrinsics.areEqual(this.eventType, paiRemoteVo.eventType) && Intrinsics.areEqual(this.gender, paiRemoteVo.gender) && Intrinsics.areEqual(this.highZoneLowerLimit, paiRemoteVo.highZoneLowerLimit) && Intrinsics.areEqual((Object) this.highZoneMinutes, (Object) paiRemoteVo.highZoneMinutes) && Intrinsics.areEqual((Object) this.highZonePai, (Object) paiRemoteVo.highZonePai) && Intrinsics.areEqual(this.index, paiRemoteVo.index) && Intrinsics.areEqual(this.lowZoneLowerLimit, paiRemoteVo.lowZoneLowerLimit) && Intrinsics.areEqual((Object) this.lowZoneMinutes, (Object) paiRemoteVo.lowZoneMinutes) && Intrinsics.areEqual((Object) this.lowZonePai, (Object) paiRemoteVo.lowZonePai) && Intrinsics.areEqual(this.maxHr, paiRemoteVo.maxHr) && Intrinsics.areEqual(this.mediumZoneLowerLimit, paiRemoteVo.mediumZoneLowerLimit) && Intrinsics.areEqual((Object) this.mediumZoneMinutes, (Object) paiRemoteVo.mediumZoneMinutes) && Intrinsics.areEqual((Object) this.mediumZonePai, (Object) paiRemoteVo.mediumZonePai) && Intrinsics.areEqual(this.nextActivityScores, paiRemoteVo.nextActivityScores) && Intrinsics.areEqual(this.restHr, paiRemoteVo.restHr) && Intrinsics.areEqual(this.sn, paiRemoteVo.sn) && Intrinsics.areEqual(this.subType, paiRemoteVo.subType) && Intrinsics.areEqual(this.time, paiRemoteVo.time) && this.timeZone == paiRemoteVo.timeZone && this.timestamp == paiRemoteVo.timestamp && Intrinsics.areEqual((Object) this.totalPai, (Object) paiRemoteVo.totalPai) && Intrinsics.areEqual(this.uploadTimestamp, paiRemoteVo.uploadTimestamp) && Intrinsics.areEqual(this.userId, paiRemoteVo.userId) && Intrinsics.areEqual(this.version, paiRemoteVo.version);
    }

    @Nullable
    public final String getActivityScores() {
        return this.activityScores;
    }

    @Nullable
    public final Integer getAge() {
        return this.age;
    }

    @Nullable
    public final Float getDailyPai() {
        return this.dailyPai;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    public final Integer getHighZoneLowerLimit() {
        return this.highZoneLowerLimit;
    }

    @Nullable
    public final Float getHighZoneMinutes() {
        return this.highZoneMinutes;
    }

    @Nullable
    public final Float getHighZonePai() {
        return this.highZonePai;
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final Integer getLowZoneLowerLimit() {
        return this.lowZoneLowerLimit;
    }

    @Nullable
    public final Float getLowZoneMinutes() {
        return this.lowZoneMinutes;
    }

    @Nullable
    public final Float getLowZonePai() {
        return this.lowZonePai;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Integer getMediumZoneLowerLimit() {
        return this.mediumZoneLowerLimit;
    }

    @Nullable
    public final Float getMediumZoneMinutes() {
        return this.mediumZoneMinutes;
    }

    @Nullable
    public final Float getMediumZonePai() {
        return this.mediumZonePai;
    }

    @Nullable
    public final String getNextActivityScores() {
        return this.nextActivityScores;
    }

    @Nullable
    public final Integer getRestHr() {
        return this.restHr;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public final long getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Float getTotalPai() {
        return this.totalPai;
    }

    @Nullable
    public final Long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.activityScores;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.age;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.dailyPai;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.deviceId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.deviceSource;
        int iHashCode5 = (((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.eventType.hashCode()) * 31;
        Integer num3 = this.gender;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.highZoneLowerLimit;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f2 = this.highZoneMinutes;
        int iHashCode8 = (iHashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.highZonePai;
        int iHashCode9 = (iHashCode8 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num5 = this.index;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.lowZoneLowerLimit;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Float f4 = this.lowZoneMinutes;
        int iHashCode12 = (iHashCode11 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.lowZonePai;
        int iHashCode13 = (iHashCode12 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Integer num7 = this.maxHr;
        int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.mediumZoneLowerLimit;
        int iHashCode15 = (iHashCode14 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Float f6 = this.mediumZoneMinutes;
        int iHashCode16 = (iHashCode15 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.mediumZonePai;
        int iHashCode17 = (iHashCode16 + (f7 == null ? 0 : f7.hashCode())) * 31;
        String str3 = this.nextActivityScores;
        int iHashCode18 = (iHashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num9 = this.restHr;
        int iHashCode19 = (iHashCode18 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str4 = this.sn;
        int iHashCode20 = (((iHashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.subType.hashCode()) * 31;
        Long l = this.time;
        int iHashCode21 = (((((iHashCode20 + (l == null ? 0 : l.hashCode())) * 31) + b.a(this.timeZone)) * 31) + b.a(this.timestamp)) * 31;
        Float f8 = this.totalPai;
        int iHashCode22 = (iHashCode21 + (f8 == null ? 0 : f8.hashCode())) * 31;
        Long l2 = this.uploadTimestamp;
        int iHashCode23 = (((iHashCode22 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.userId.hashCode()) * 31;
        Integer num10 = this.version;
        return iHashCode23 + (num10 != null ? num10.hashCode() : 0);
    }

    public final void setAge(@Nullable Integer num) {
        this.age = num;
    }

    public final void setDeviceSource(@Nullable Integer num) {
        this.deviceSource = num;
    }

    public final void setGender(@Nullable Integer num) {
        this.gender = num;
    }

    public final void setHighZoneLowerLimit(@Nullable Integer num) {
        this.highZoneLowerLimit = num;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    @NotNull
    public String toString() {
        return "PaiRemoteVo(activityScores=" + this.activityScores + ", age=" + this.age + ", dailyPai=" + this.dailyPai + ", deviceId=" + this.deviceId + ", deviceSource=" + this.deviceSource + ", eventType=" + this.eventType + ", gender=" + this.gender + ", highZoneLowerLimit=" + this.highZoneLowerLimit + ", highZoneMinutes=" + this.highZoneMinutes + ", highZonePai=" + this.highZonePai + ", index=" + this.index + ", lowZoneLowerLimit=" + this.lowZoneLowerLimit + ", lowZoneMinutes=" + this.lowZoneMinutes + ", lowZonePai=" + this.lowZonePai + ", maxHr=" + this.maxHr + ", mediumZoneLowerLimit=" + this.mediumZoneLowerLimit + ", mediumZoneMinutes=" + this.mediumZoneMinutes + ", mediumZonePai=" + this.mediumZonePai + ", nextActivityScores=" + this.nextActivityScores + ", restHr=" + this.restHr + ", sn=" + this.sn + ", subType=" + this.subType + ", time=" + this.time + ", timeZone=" + this.timeZone + ", timestamp=" + this.timestamp + ", totalPai=" + this.totalPai + ", uploadTimestamp=" + this.uploadTimestamp + ", userId=" + this.userId + ", version=" + this.version + ")";
    }
}
