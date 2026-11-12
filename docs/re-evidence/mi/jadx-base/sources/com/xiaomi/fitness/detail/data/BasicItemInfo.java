package com.xiaomi.fitness.detail.data;

import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "", "title", "", "data", "", "unit", "index", "remindUrl", "pluralTitle", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTitle", "()I", "getData", "()Ljava/lang/String;", "getUnit", "getIndex", "getRemindUrl", "getPluralTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BasicItemInfo {

    @NotNull
    private final String data;
    private final int index;

    @Nullable
    private final String pluralTitle;

    @Nullable
    private final String remindUrl;
    private final int title;

    @NotNull
    private final String unit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int SPORT_INFO_DURATION = 1;
    private static final int SPORT_INFO_CALORIE = 2;
    private static final int SPORT_INFO_AVG_PACE = 4;
    private static final int SPORT_INFO_AVG_SPEED = 8;
    private static final int SPORT_INFO_AVG_HRM = 16;
    private static final int SPORT_INFO_TOTAL_GOLF_SCORES = 32;
    private static final int SPORT_INFO_AVG_SWING_SPEED = 64;
    private static final int SPORT_INFO_AVG_SWING_TIME = 128;
    private static final int SPORT_INFO_AVG_DOWN_SWING_TIME = 256;
    private static final int SPORT_INFO_AVG_SWING_RHYTHM = 512;
    private static final int SPORT_INFO_TIMES = 1024;
    private static final int SPORT_INFO_STEPS = 2048;
    private static final int SPORT_INFO_RISE_HEIGHT = 4096;
    private static final int SPORT_INFO_FALL_HEIGHT = 8192;
    private static final int SPORT_INFO_POSTURE = 16384;
    private static final int SPORT_INFO_SKIING_COUNT = 32768;
    private static final int SPORT_INFO_AVG_ROW_FREQ = 65536;
    private static final int SPORT_INFO_SWING_COUNT = 131072;
    private static final int SPORT_INFO_MAX_SLOPE = 262144;
    private static final int SPORT_INFO_AVG_RESISTANCE = 524288;
    private static final int SPORT_INFO_AVG_STRESS = EventRecurrence.TH;
    private static final int SPORT_INFO_STUMBLE_TIMES = 2097152;
    private static final int SPORT_INFO_SOMATOSENSORY_GAME = 4194304;
    private static final int SPORT_INFO_MAX_SPEED = NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
    private static final int SPORT_INFO_SKIING_TIME = 16777216;
    private static final int SPORT_INFO_AVG_CADENCE = 33554432;
    private static final int SPORT_INFO_AVG_POWER = 67108864;
    private static final int SPORT_INFO_AVG_HEIGHT = 134217728;
    private static final int SPORT_DATA_INFO_STEPS_FREQ = 1;
    private static final int SPORT_DATA_INFO_STEP_LENGTH = 2;
    private static final int SPORT_DATA_INFO_AVG_SWOLF = 4;
    private static final int SPORT_DATA_INFO_BEST_SWOLF = 8;
    private static final int SPORT_DATA_AVG_STROKE_FREQ = 16;
    private static final int SPORT_DATA_INFO_DURATION = 32;
    private static final int SPORT_DATA_INFO_REST_DURATION = 64;
    private static final int SPORT_DATA_INFO_CHANGE_DURATION = 128;
    private static final int SPORT_DATA_INFO_HANG_IN_AIR_DURATION = 256;
    private static final int SPORT_DATA_INFO_DISTANCE = 512;
    private static final int SPORT_DATA_INFO_SHOOT_COUNT = 1024;
    private static final int SPORT_DATA_INFO_DRIBBLE_DURATION = 2048;
    private static final int SPORT_DATA_INFO_FOREHAND_SWING_COUNT = 4096;
    private static final int SPORT_DATA_INFO_BACKHAND_SWING_COUNT = 8192;
    private static final int SPORT_DATA_INFO_SMASH_BALL_COUNT = 16384;
    private static final int SPORT_DATA_INFO_AVG_SKIP_FREQ = 32768;
    private static final int SPORT_DATA_INFO_BEST_SKIP_FREQ = 65536;
    private static final int SPORT_DATA_INFO_LAY_OARS = 131072;
    private static final int SPORT_DATA_INFO_PULL_OARS = 262144;
    private static final int SPORT_DATA_INFO_RECOVERY_HRM = 524288;
    private static final int SPORT_DATA_INFO_ENERGY_WORKING = EventRecurrence.TH;
    private static final int SPORT_DATA_INFO_TOTAL_CLIMBING = 2097152;
    private static final int SPORT_DATA_INFO_MAX_HEIGHT = 4194304;
    private static final int SPORT_DATA_INFO_AVG_HEIGHT = NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
    private static final int SPORT_DATA_INFO_MAX_HRM = 16777216;
    private static final int SPORT_DATA_INFO_BEST_ROW_FREQ = 33554432;
    private static final int SPORT_DATA_INFO_AVG_STARTING_HEIGHT = 67108864;
    private static final int SPORT_DATA_INFO_MIN_STARTING_HEIGHT = 134217728;
    private static final int SPORT_DATA_INFO_SERVE_BALL_COUNT = 1073741824;
    private static final int SPORT_DATA_VALUE_RANGE = Integer.MIN_VALUE;
    private static final int SPORT_DATA_STEP_SPEED_VALUE = 1;
    private static final int SPORT_DATA_INFO_PACE = 2;

    @Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0003\bµ\u0001\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b \u0010\bR\u001c\u0010!\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b#\u0010\bR\u001c\u0010$\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0003\u001a\u0004\b&\u0010\bR\u001c\u0010'\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0003\u001a\u0004\b)\u0010\bR\u001c\u0010*\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0003\u001a\u0004\b,\u0010\bR\u001c\u0010-\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0003\u001a\u0004\b/\u0010\bR\u001c\u00100\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u0003\u001a\u0004\b2\u0010\bR\u001c\u00103\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u0003\u001a\u0004\b5\u0010\bR\u001c\u00106\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u0003\u001a\u0004\b8\u0010\bR\u001c\u00109\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u0003\u001a\u0004\b;\u0010\bR\u001c\u0010<\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010\u0003\u001a\u0004\b>\u0010\bR\u001c\u0010?\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\u0003\u001a\u0004\bA\u0010\bR\u001c\u0010B\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010\u0003\u001a\u0004\bD\u0010\bR\u001c\u0010E\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010\u0003\u001a\u0004\bG\u0010\bR\u001c\u0010H\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010\u0003\u001a\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010\u0003\u001a\u0004\bM\u0010\bR\u001c\u0010N\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010\u0003\u001a\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010\u0003\u001a\u0004\bS\u0010\bR\u001c\u0010T\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010\u0003\u001a\u0004\bV\u0010\bR\u001c\u0010W\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010\u0003\u001a\u0004\bY\u0010\bR\u001c\u0010Z\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010\u0003\u001a\u0004\b\\\u0010\bR\u001c\u0010]\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010\u0003\u001a\u0004\b_\u0010\bR\u001c\u0010`\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\ba\u0010\u0003\u001a\u0004\bb\u0010\bR\u001c\u0010c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bd\u0010\u0003\u001a\u0004\be\u0010\bR\u001c\u0010f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bg\u0010\u0003\u001a\u0004\bh\u0010\bR\u001c\u0010i\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bj\u0010\u0003\u001a\u0004\bk\u0010\bR\u001c\u0010l\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bm\u0010\u0003\u001a\u0004\bn\u0010\bR\u001c\u0010o\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u0010\u0003\u001a\u0004\bq\u0010\bR\u001c\u0010r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u0010\u0003\u001a\u0004\bt\u0010\bR\u001c\u0010u\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bv\u0010\u0003\u001a\u0004\bw\u0010\bR\u001c\u0010x\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010\u0003\u001a\u0004\bz\u0010\bR\u001c\u0010{\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b|\u0010\u0003\u001a\u0004\b}\u0010\bR\u001d\u0010~\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b\u007f\u0010\u0003\u001a\u0005\b\u0080\u0001\u0010\bR\u001f\u0010\u0081\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0082\u0001\u0010\u0003\u001a\u0005\b\u0083\u0001\u0010\bR\u001f\u0010\u0084\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0001\u0010\u0003\u001a\u0005\b\u0086\u0001\u0010\bR\u001f\u0010\u0087\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0088\u0001\u0010\u0003\u001a\u0005\b\u0089\u0001\u0010\bR\u001f\u0010\u008a\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0001\u0010\u0003\u001a\u0005\b\u008c\u0001\u0010\bR\u001f\u0010\u008d\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008e\u0001\u0010\u0003\u001a\u0005\b\u008f\u0001\u0010\bR\u001f\u0010\u0090\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0091\u0001\u0010\u0003\u001a\u0005\b\u0092\u0001\u0010\bR\u001f\u0010\u0093\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0094\u0001\u0010\u0003\u001a\u0005\b\u0095\u0001\u0010\bR\u001f\u0010\u0096\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0097\u0001\u0010\u0003\u001a\u0005\b\u0098\u0001\u0010\bR\u001f\u0010\u0099\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009a\u0001\u0010\u0003\u001a\u0005\b\u009b\u0001\u0010\bR\u001f\u0010\u009c\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009d\u0001\u0010\u0003\u001a\u0005\b\u009e\u0001\u0010\bR\u001f\u0010\u009f\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b \u0001\u0010\u0003\u001a\u0005\b¡\u0001\u0010\bR\u001f\u0010¢\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b£\u0001\u0010\u0003\u001a\u0005\b¤\u0001\u0010\bR\u001f\u0010¥\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¦\u0001\u0010\u0003\u001a\u0005\b§\u0001\u0010\bR\u001f\u0010¨\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b©\u0001\u0010\u0003\u001a\u0005\bª\u0001\u0010\bR\u001f\u0010«\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¬\u0001\u0010\u0003\u001a\u0005\b\u00ad\u0001\u0010\bR\u001f\u0010®\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¯\u0001\u0010\u0003\u001a\u0005\b°\u0001\u0010\bR\u001f\u0010±\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b²\u0001\u0010\u0003\u001a\u0005\b³\u0001\u0010\bR\u001f\u0010´\u0001\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bµ\u0001\u0010\u0003\u001a\u0005\b¶\u0001\u0010\bR\u001f\u0010·\u0001\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0010\n\u0000\u0012\u0005\b¸\u0001\u0010\u0003\u001a\u0005\b¹\u0001\u0010\b¨\u0006º\u0001"}, d2 = {"Lcom/xiaomi/fitness/detail/data/BasicItemInfo$Companion;", "", "<init>", "()V", "SPORT_INFO_DURATION", "", "getSPORT_INFO_DURATION$annotations", "getSPORT_INFO_DURATION", "()I", "SPORT_INFO_CALORIE", "getSPORT_INFO_CALORIE$annotations", "getSPORT_INFO_CALORIE", "SPORT_INFO_AVG_PACE", "getSPORT_INFO_AVG_PACE$annotations", "getSPORT_INFO_AVG_PACE", "SPORT_INFO_AVG_SPEED", "getSPORT_INFO_AVG_SPEED$annotations", "getSPORT_INFO_AVG_SPEED", "SPORT_INFO_AVG_HRM", "getSPORT_INFO_AVG_HRM$annotations", "getSPORT_INFO_AVG_HRM", "SPORT_INFO_TOTAL_GOLF_SCORES", "getSPORT_INFO_TOTAL_GOLF_SCORES$annotations", "getSPORT_INFO_TOTAL_GOLF_SCORES", "SPORT_INFO_AVG_SWING_SPEED", "getSPORT_INFO_AVG_SWING_SPEED$annotations", "getSPORT_INFO_AVG_SWING_SPEED", "SPORT_INFO_AVG_SWING_TIME", "getSPORT_INFO_AVG_SWING_TIME$annotations", "getSPORT_INFO_AVG_SWING_TIME", "SPORT_INFO_AVG_DOWN_SWING_TIME", "getSPORT_INFO_AVG_DOWN_SWING_TIME$annotations", "getSPORT_INFO_AVG_DOWN_SWING_TIME", "SPORT_INFO_AVG_SWING_RHYTHM", "getSPORT_INFO_AVG_SWING_RHYTHM$annotations", "getSPORT_INFO_AVG_SWING_RHYTHM", "SPORT_INFO_TIMES", "getSPORT_INFO_TIMES$annotations", "getSPORT_INFO_TIMES", "SPORT_INFO_STEPS", "getSPORT_INFO_STEPS$annotations", "getSPORT_INFO_STEPS", "SPORT_INFO_RISE_HEIGHT", "getSPORT_INFO_RISE_HEIGHT$annotations", "getSPORT_INFO_RISE_HEIGHT", "SPORT_INFO_FALL_HEIGHT", "getSPORT_INFO_FALL_HEIGHT$annotations", "getSPORT_INFO_FALL_HEIGHT", "SPORT_INFO_POSTURE", "getSPORT_INFO_POSTURE$annotations", "getSPORT_INFO_POSTURE", "SPORT_INFO_SKIING_COUNT", "getSPORT_INFO_SKIING_COUNT$annotations", "getSPORT_INFO_SKIING_COUNT", "SPORT_INFO_AVG_ROW_FREQ", "getSPORT_INFO_AVG_ROW_FREQ$annotations", "getSPORT_INFO_AVG_ROW_FREQ", "SPORT_INFO_SWING_COUNT", "getSPORT_INFO_SWING_COUNT$annotations", "getSPORT_INFO_SWING_COUNT", "SPORT_INFO_MAX_SLOPE", "getSPORT_INFO_MAX_SLOPE$annotations", "getSPORT_INFO_MAX_SLOPE", "SPORT_INFO_AVG_RESISTANCE", "getSPORT_INFO_AVG_RESISTANCE$annotations", "getSPORT_INFO_AVG_RESISTANCE", "SPORT_INFO_AVG_STRESS", "getSPORT_INFO_AVG_STRESS$annotations", "getSPORT_INFO_AVG_STRESS", "SPORT_INFO_STUMBLE_TIMES", "getSPORT_INFO_STUMBLE_TIMES$annotations", "getSPORT_INFO_STUMBLE_TIMES", "SPORT_INFO_SOMATOSENSORY_GAME", "getSPORT_INFO_SOMATOSENSORY_GAME$annotations", "getSPORT_INFO_SOMATOSENSORY_GAME", "SPORT_INFO_MAX_SPEED", "getSPORT_INFO_MAX_SPEED$annotations", "getSPORT_INFO_MAX_SPEED", "SPORT_INFO_SKIING_TIME", "getSPORT_INFO_SKIING_TIME$annotations", "getSPORT_INFO_SKIING_TIME", "SPORT_INFO_AVG_CADENCE", "getSPORT_INFO_AVG_CADENCE$annotations", "getSPORT_INFO_AVG_CADENCE", "SPORT_INFO_AVG_POWER", "getSPORT_INFO_AVG_POWER$annotations", "getSPORT_INFO_AVG_POWER", "SPORT_INFO_AVG_HEIGHT", "getSPORT_INFO_AVG_HEIGHT$annotations", "getSPORT_INFO_AVG_HEIGHT", "SPORT_DATA_INFO_STEPS_FREQ", "getSPORT_DATA_INFO_STEPS_FREQ$annotations", "getSPORT_DATA_INFO_STEPS_FREQ", "SPORT_DATA_INFO_STEP_LENGTH", "getSPORT_DATA_INFO_STEP_LENGTH$annotations", "getSPORT_DATA_INFO_STEP_LENGTH", "SPORT_DATA_INFO_AVG_SWOLF", "getSPORT_DATA_INFO_AVG_SWOLF$annotations", "getSPORT_DATA_INFO_AVG_SWOLF", "SPORT_DATA_INFO_BEST_SWOLF", "getSPORT_DATA_INFO_BEST_SWOLF$annotations", "getSPORT_DATA_INFO_BEST_SWOLF", "SPORT_DATA_AVG_STROKE_FREQ", "getSPORT_DATA_AVG_STROKE_FREQ$annotations", "getSPORT_DATA_AVG_STROKE_FREQ", "SPORT_DATA_INFO_DURATION", "getSPORT_DATA_INFO_DURATION$annotations", "getSPORT_DATA_INFO_DURATION", "SPORT_DATA_INFO_REST_DURATION", "getSPORT_DATA_INFO_REST_DURATION$annotations", "getSPORT_DATA_INFO_REST_DURATION", "SPORT_DATA_INFO_CHANGE_DURATION", "getSPORT_DATA_INFO_CHANGE_DURATION$annotations", "getSPORT_DATA_INFO_CHANGE_DURATION", "SPORT_DATA_INFO_HANG_IN_AIR_DURATION", "getSPORT_DATA_INFO_HANG_IN_AIR_DURATION$annotations", "getSPORT_DATA_INFO_HANG_IN_AIR_DURATION", "SPORT_DATA_INFO_DISTANCE", "getSPORT_DATA_INFO_DISTANCE$annotations", "getSPORT_DATA_INFO_DISTANCE", "SPORT_DATA_INFO_SHOOT_COUNT", "getSPORT_DATA_INFO_SHOOT_COUNT$annotations", "getSPORT_DATA_INFO_SHOOT_COUNT", "SPORT_DATA_INFO_DRIBBLE_DURATION", "getSPORT_DATA_INFO_DRIBBLE_DURATION$annotations", "getSPORT_DATA_INFO_DRIBBLE_DURATION", "SPORT_DATA_INFO_FOREHAND_SWING_COUNT", "getSPORT_DATA_INFO_FOREHAND_SWING_COUNT$annotations", "getSPORT_DATA_INFO_FOREHAND_SWING_COUNT", "SPORT_DATA_INFO_BACKHAND_SWING_COUNT", "getSPORT_DATA_INFO_BACKHAND_SWING_COUNT$annotations", "getSPORT_DATA_INFO_BACKHAND_SWING_COUNT", "SPORT_DATA_INFO_SMASH_BALL_COUNT", "getSPORT_DATA_INFO_SMASH_BALL_COUNT$annotations", "getSPORT_DATA_INFO_SMASH_BALL_COUNT", "SPORT_DATA_INFO_AVG_SKIP_FREQ", "getSPORT_DATA_INFO_AVG_SKIP_FREQ$annotations", "getSPORT_DATA_INFO_AVG_SKIP_FREQ", "SPORT_DATA_INFO_BEST_SKIP_FREQ", "getSPORT_DATA_INFO_BEST_SKIP_FREQ$annotations", "getSPORT_DATA_INFO_BEST_SKIP_FREQ", "SPORT_DATA_INFO_LAY_OARS", "getSPORT_DATA_INFO_LAY_OARS$annotations", "getSPORT_DATA_INFO_LAY_OARS", "SPORT_DATA_INFO_PULL_OARS", "getSPORT_DATA_INFO_PULL_OARS$annotations", "getSPORT_DATA_INFO_PULL_OARS", "SPORT_DATA_INFO_RECOVERY_HRM", "getSPORT_DATA_INFO_RECOVERY_HRM$annotations", "getSPORT_DATA_INFO_RECOVERY_HRM", "SPORT_DATA_INFO_ENERGY_WORKING", "getSPORT_DATA_INFO_ENERGY_WORKING$annotations", "getSPORT_DATA_INFO_ENERGY_WORKING", "SPORT_DATA_INFO_TOTAL_CLIMBING", "getSPORT_DATA_INFO_TOTAL_CLIMBING$annotations", "getSPORT_DATA_INFO_TOTAL_CLIMBING", "SPORT_DATA_INFO_MAX_HEIGHT", "getSPORT_DATA_INFO_MAX_HEIGHT$annotations", "getSPORT_DATA_INFO_MAX_HEIGHT", "SPORT_DATA_INFO_AVG_HEIGHT", "getSPORT_DATA_INFO_AVG_HEIGHT$annotations", "getSPORT_DATA_INFO_AVG_HEIGHT", "SPORT_DATA_INFO_MAX_HRM", "getSPORT_DATA_INFO_MAX_HRM$annotations", "getSPORT_DATA_INFO_MAX_HRM", "SPORT_DATA_INFO_BEST_ROW_FREQ", "getSPORT_DATA_INFO_BEST_ROW_FREQ$annotations", "getSPORT_DATA_INFO_BEST_ROW_FREQ", "SPORT_DATA_INFO_AVG_STARTING_HEIGHT", "getSPORT_DATA_INFO_AVG_STARTING_HEIGHT$annotations", "getSPORT_DATA_INFO_AVG_STARTING_HEIGHT", "SPORT_DATA_INFO_MIN_STARTING_HEIGHT", "getSPORT_DATA_INFO_MIN_STARTING_HEIGHT$annotations", "getSPORT_DATA_INFO_MIN_STARTING_HEIGHT", "SPORT_DATA_INFO_SERVE_BALL_COUNT", "getSPORT_DATA_INFO_SERVE_BALL_COUNT$annotations", "getSPORT_DATA_INFO_SERVE_BALL_COUNT", "SPORT_DATA_VALUE_RANGE", "getSPORT_DATA_VALUE_RANGE$annotations", "getSPORT_DATA_VALUE_RANGE", "SPORT_DATA_STEP_SPEED_VALUE", "getSPORT_DATA_STEP_SPEED_VALUE$annotations", "getSPORT_DATA_STEP_SPEED_VALUE", "SPORT_DATA_INFO_PACE", "getSPORT_DATA_INFO_PACE$annotations", "getSPORT_DATA_INFO_PACE", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_AVG_STROKE_FREQ$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_AVG_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_AVG_SKIP_FREQ$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_AVG_STARTING_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_AVG_SWOLF$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_BACKHAND_SWING_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_BEST_ROW_FREQ$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_BEST_SKIP_FREQ$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_BEST_SWOLF$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_CHANGE_DURATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_DISTANCE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_DRIBBLE_DURATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_DURATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_ENERGY_WORKING$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_FOREHAND_SWING_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_HANG_IN_AIR_DURATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_LAY_OARS$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_MAX_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_MAX_HRM$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_MIN_STARTING_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_PACE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_PULL_OARS$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_RECOVERY_HRM$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_REST_DURATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_SERVE_BALL_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_SHOOT_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_SMASH_BALL_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_STEPS_FREQ$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_STEP_LENGTH$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_INFO_TOTAL_CLIMBING$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_STEP_SPEED_VALUE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_DATA_VALUE_RANGE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_CADENCE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_DOWN_SWING_TIME$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_HRM$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_PACE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_POWER$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_RESISTANCE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_ROW_FREQ$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_SPEED$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_STRESS$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_SWING_RHYTHM$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_SWING_SPEED$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_AVG_SWING_TIME$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_CALORIE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_DURATION$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_FALL_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_MAX_SLOPE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_MAX_SPEED$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_POSTURE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_RISE_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_SKIING_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_SKIING_TIME$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_SOMATOSENSORY_GAME$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_STEPS$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_STUMBLE_TIMES$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_SWING_COUNT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_TIMES$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSPORT_INFO_TOTAL_GOLF_SCORES$annotations() {
        }

        public final int getSPORT_DATA_AVG_STROKE_FREQ() {
            return BasicItemInfo.SPORT_DATA_AVG_STROKE_FREQ;
        }

        public final int getSPORT_DATA_INFO_AVG_HEIGHT() {
            return BasicItemInfo.SPORT_DATA_INFO_AVG_HEIGHT;
        }

        public final int getSPORT_DATA_INFO_AVG_SKIP_FREQ() {
            return BasicItemInfo.SPORT_DATA_INFO_AVG_SKIP_FREQ;
        }

        public final int getSPORT_DATA_INFO_AVG_STARTING_HEIGHT() {
            return BasicItemInfo.SPORT_DATA_INFO_AVG_STARTING_HEIGHT;
        }

        public final int getSPORT_DATA_INFO_AVG_SWOLF() {
            return BasicItemInfo.SPORT_DATA_INFO_AVG_SWOLF;
        }

        public final int getSPORT_DATA_INFO_BACKHAND_SWING_COUNT() {
            return BasicItemInfo.SPORT_DATA_INFO_BACKHAND_SWING_COUNT;
        }

        public final int getSPORT_DATA_INFO_BEST_ROW_FREQ() {
            return BasicItemInfo.SPORT_DATA_INFO_BEST_ROW_FREQ;
        }

        public final int getSPORT_DATA_INFO_BEST_SKIP_FREQ() {
            return BasicItemInfo.SPORT_DATA_INFO_BEST_SKIP_FREQ;
        }

        public final int getSPORT_DATA_INFO_BEST_SWOLF() {
            return BasicItemInfo.SPORT_DATA_INFO_BEST_SWOLF;
        }

        public final int getSPORT_DATA_INFO_CHANGE_DURATION() {
            return BasicItemInfo.SPORT_DATA_INFO_CHANGE_DURATION;
        }

        public final int getSPORT_DATA_INFO_DISTANCE() {
            return BasicItemInfo.SPORT_DATA_INFO_DISTANCE;
        }

        public final int getSPORT_DATA_INFO_DRIBBLE_DURATION() {
            return BasicItemInfo.SPORT_DATA_INFO_DRIBBLE_DURATION;
        }

        public final int getSPORT_DATA_INFO_DURATION() {
            return BasicItemInfo.SPORT_DATA_INFO_DURATION;
        }

        public final int getSPORT_DATA_INFO_ENERGY_WORKING() {
            return BasicItemInfo.SPORT_DATA_INFO_ENERGY_WORKING;
        }

        public final int getSPORT_DATA_INFO_FOREHAND_SWING_COUNT() {
            return BasicItemInfo.SPORT_DATA_INFO_FOREHAND_SWING_COUNT;
        }

        public final int getSPORT_DATA_INFO_HANG_IN_AIR_DURATION() {
            return BasicItemInfo.SPORT_DATA_INFO_HANG_IN_AIR_DURATION;
        }

        public final int getSPORT_DATA_INFO_LAY_OARS() {
            return BasicItemInfo.SPORT_DATA_INFO_LAY_OARS;
        }

        public final int getSPORT_DATA_INFO_MAX_HEIGHT() {
            return BasicItemInfo.SPORT_DATA_INFO_MAX_HEIGHT;
        }

        public final int getSPORT_DATA_INFO_MAX_HRM() {
            return BasicItemInfo.SPORT_DATA_INFO_MAX_HRM;
        }

        public final int getSPORT_DATA_INFO_MIN_STARTING_HEIGHT() {
            return BasicItemInfo.SPORT_DATA_INFO_MIN_STARTING_HEIGHT;
        }

        public final int getSPORT_DATA_INFO_PACE() {
            return BasicItemInfo.SPORT_DATA_INFO_PACE;
        }

        public final int getSPORT_DATA_INFO_PULL_OARS() {
            return BasicItemInfo.SPORT_DATA_INFO_PULL_OARS;
        }

        public final int getSPORT_DATA_INFO_RECOVERY_HRM() {
            return BasicItemInfo.SPORT_DATA_INFO_RECOVERY_HRM;
        }

        public final int getSPORT_DATA_INFO_REST_DURATION() {
            return BasicItemInfo.SPORT_DATA_INFO_REST_DURATION;
        }

        public final int getSPORT_DATA_INFO_SERVE_BALL_COUNT() {
            return BasicItemInfo.SPORT_DATA_INFO_SERVE_BALL_COUNT;
        }

        public final int getSPORT_DATA_INFO_SHOOT_COUNT() {
            return BasicItemInfo.SPORT_DATA_INFO_SHOOT_COUNT;
        }

        public final int getSPORT_DATA_INFO_SMASH_BALL_COUNT() {
            return BasicItemInfo.SPORT_DATA_INFO_SMASH_BALL_COUNT;
        }

        public final int getSPORT_DATA_INFO_STEPS_FREQ() {
            return BasicItemInfo.SPORT_DATA_INFO_STEPS_FREQ;
        }

        public final int getSPORT_DATA_INFO_STEP_LENGTH() {
            return BasicItemInfo.SPORT_DATA_INFO_STEP_LENGTH;
        }

        public final int getSPORT_DATA_INFO_TOTAL_CLIMBING() {
            return BasicItemInfo.SPORT_DATA_INFO_TOTAL_CLIMBING;
        }

        public final int getSPORT_DATA_STEP_SPEED_VALUE() {
            return BasicItemInfo.SPORT_DATA_STEP_SPEED_VALUE;
        }

        public final int getSPORT_DATA_VALUE_RANGE() {
            return BasicItemInfo.SPORT_DATA_VALUE_RANGE;
        }

        public final int getSPORT_INFO_AVG_CADENCE() {
            return BasicItemInfo.SPORT_INFO_AVG_CADENCE;
        }

        public final int getSPORT_INFO_AVG_DOWN_SWING_TIME() {
            return BasicItemInfo.SPORT_INFO_AVG_DOWN_SWING_TIME;
        }

        public final int getSPORT_INFO_AVG_HEIGHT() {
            return BasicItemInfo.SPORT_INFO_AVG_HEIGHT;
        }

        public final int getSPORT_INFO_AVG_HRM() {
            return BasicItemInfo.SPORT_INFO_AVG_HRM;
        }

        public final int getSPORT_INFO_AVG_PACE() {
            return BasicItemInfo.SPORT_INFO_AVG_PACE;
        }

        public final int getSPORT_INFO_AVG_POWER() {
            return BasicItemInfo.SPORT_INFO_AVG_POWER;
        }

        public final int getSPORT_INFO_AVG_RESISTANCE() {
            return BasicItemInfo.SPORT_INFO_AVG_RESISTANCE;
        }

        public final int getSPORT_INFO_AVG_ROW_FREQ() {
            return BasicItemInfo.SPORT_INFO_AVG_ROW_FREQ;
        }

        public final int getSPORT_INFO_AVG_SPEED() {
            return BasicItemInfo.SPORT_INFO_AVG_SPEED;
        }

        public final int getSPORT_INFO_AVG_STRESS() {
            return BasicItemInfo.SPORT_INFO_AVG_STRESS;
        }

        public final int getSPORT_INFO_AVG_SWING_RHYTHM() {
            return BasicItemInfo.SPORT_INFO_AVG_SWING_RHYTHM;
        }

        public final int getSPORT_INFO_AVG_SWING_SPEED() {
            return BasicItemInfo.SPORT_INFO_AVG_SWING_SPEED;
        }

        public final int getSPORT_INFO_AVG_SWING_TIME() {
            return BasicItemInfo.SPORT_INFO_AVG_SWING_TIME;
        }

        public final int getSPORT_INFO_CALORIE() {
            return BasicItemInfo.SPORT_INFO_CALORIE;
        }

        public final int getSPORT_INFO_DURATION() {
            return BasicItemInfo.SPORT_INFO_DURATION;
        }

        public final int getSPORT_INFO_FALL_HEIGHT() {
            return BasicItemInfo.SPORT_INFO_FALL_HEIGHT;
        }

        public final int getSPORT_INFO_MAX_SLOPE() {
            return BasicItemInfo.SPORT_INFO_MAX_SLOPE;
        }

        public final int getSPORT_INFO_MAX_SPEED() {
            return BasicItemInfo.SPORT_INFO_MAX_SPEED;
        }

        public final int getSPORT_INFO_POSTURE() {
            return BasicItemInfo.SPORT_INFO_POSTURE;
        }

        public final int getSPORT_INFO_RISE_HEIGHT() {
            return BasicItemInfo.SPORT_INFO_RISE_HEIGHT;
        }

        public final int getSPORT_INFO_SKIING_COUNT() {
            return BasicItemInfo.SPORT_INFO_SKIING_COUNT;
        }

        public final int getSPORT_INFO_SKIING_TIME() {
            return BasicItemInfo.SPORT_INFO_SKIING_TIME;
        }

        public final int getSPORT_INFO_SOMATOSENSORY_GAME() {
            return BasicItemInfo.SPORT_INFO_SOMATOSENSORY_GAME;
        }

        public final int getSPORT_INFO_STEPS() {
            return BasicItemInfo.SPORT_INFO_STEPS;
        }

        public final int getSPORT_INFO_STUMBLE_TIMES() {
            return BasicItemInfo.SPORT_INFO_STUMBLE_TIMES;
        }

        public final int getSPORT_INFO_SWING_COUNT() {
            return BasicItemInfo.SPORT_INFO_SWING_COUNT;
        }

        public final int getSPORT_INFO_TIMES() {
            return BasicItemInfo.SPORT_INFO_TIMES;
        }

        public final int getSPORT_INFO_TOTAL_GOLF_SCORES() {
            return BasicItemInfo.SPORT_INFO_TOTAL_GOLF_SCORES;
        }
    }

    public BasicItemInfo(int i, @NotNull String data, @NotNull String unit, int i2, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.title = i;
        this.data = data;
        this.unit = unit;
        this.index = i2;
        this.remindUrl = str;
        this.pluralTitle = str2;
    }

    public static /* synthetic */ BasicItemInfo copy$default(BasicItemInfo basicItemInfo, int i, String str, String str2, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = basicItemInfo.title;
        }
        if ((i3 & 2) != 0) {
            str = basicItemInfo.data;
        }
        String str5 = str;
        if ((i3 & 4) != 0) {
            str2 = basicItemInfo.unit;
        }
        String str6 = str2;
        if ((i3 & 8) != 0) {
            i2 = basicItemInfo.index;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            str3 = basicItemInfo.remindUrl;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = basicItemInfo.pluralTitle;
        }
        return basicItemInfo.copy(i, str5, str6, i4, str7, str4);
    }

    public static final int getSPORT_DATA_AVG_STROKE_FREQ() {
        return INSTANCE.getSPORT_DATA_AVG_STROKE_FREQ();
    }

    public static final int getSPORT_DATA_INFO_AVG_HEIGHT() {
        return INSTANCE.getSPORT_DATA_INFO_AVG_HEIGHT();
    }

    public static final int getSPORT_DATA_INFO_AVG_SKIP_FREQ() {
        return INSTANCE.getSPORT_DATA_INFO_AVG_SKIP_FREQ();
    }

    public static final int getSPORT_DATA_INFO_AVG_STARTING_HEIGHT() {
        return INSTANCE.getSPORT_DATA_INFO_AVG_STARTING_HEIGHT();
    }

    public static final int getSPORT_DATA_INFO_AVG_SWOLF() {
        return INSTANCE.getSPORT_DATA_INFO_AVG_SWOLF();
    }

    public static final int getSPORT_DATA_INFO_BACKHAND_SWING_COUNT() {
        return INSTANCE.getSPORT_DATA_INFO_BACKHAND_SWING_COUNT();
    }

    public static final int getSPORT_DATA_INFO_BEST_ROW_FREQ() {
        return INSTANCE.getSPORT_DATA_INFO_BEST_ROW_FREQ();
    }

    public static final int getSPORT_DATA_INFO_BEST_SKIP_FREQ() {
        return INSTANCE.getSPORT_DATA_INFO_BEST_SKIP_FREQ();
    }

    public static final int getSPORT_DATA_INFO_BEST_SWOLF() {
        return INSTANCE.getSPORT_DATA_INFO_BEST_SWOLF();
    }

    public static final int getSPORT_DATA_INFO_CHANGE_DURATION() {
        return INSTANCE.getSPORT_DATA_INFO_CHANGE_DURATION();
    }

    public static final int getSPORT_DATA_INFO_DISTANCE() {
        return INSTANCE.getSPORT_DATA_INFO_DISTANCE();
    }

    public static final int getSPORT_DATA_INFO_DRIBBLE_DURATION() {
        return INSTANCE.getSPORT_DATA_INFO_DRIBBLE_DURATION();
    }

    public static final int getSPORT_DATA_INFO_DURATION() {
        return INSTANCE.getSPORT_DATA_INFO_DURATION();
    }

    public static final int getSPORT_DATA_INFO_ENERGY_WORKING() {
        return INSTANCE.getSPORT_DATA_INFO_ENERGY_WORKING();
    }

    public static final int getSPORT_DATA_INFO_FOREHAND_SWING_COUNT() {
        return INSTANCE.getSPORT_DATA_INFO_FOREHAND_SWING_COUNT();
    }

    public static final int getSPORT_DATA_INFO_HANG_IN_AIR_DURATION() {
        return INSTANCE.getSPORT_DATA_INFO_HANG_IN_AIR_DURATION();
    }

    public static final int getSPORT_DATA_INFO_LAY_OARS() {
        return INSTANCE.getSPORT_DATA_INFO_LAY_OARS();
    }

    public static final int getSPORT_DATA_INFO_MAX_HEIGHT() {
        return INSTANCE.getSPORT_DATA_INFO_MAX_HEIGHT();
    }

    public static final int getSPORT_DATA_INFO_MAX_HRM() {
        return INSTANCE.getSPORT_DATA_INFO_MAX_HRM();
    }

    public static final int getSPORT_DATA_INFO_MIN_STARTING_HEIGHT() {
        return INSTANCE.getSPORT_DATA_INFO_MIN_STARTING_HEIGHT();
    }

    public static final int getSPORT_DATA_INFO_PACE() {
        return INSTANCE.getSPORT_DATA_INFO_PACE();
    }

    public static final int getSPORT_DATA_INFO_PULL_OARS() {
        return INSTANCE.getSPORT_DATA_INFO_PULL_OARS();
    }

    public static final int getSPORT_DATA_INFO_RECOVERY_HRM() {
        return INSTANCE.getSPORT_DATA_INFO_RECOVERY_HRM();
    }

    public static final int getSPORT_DATA_INFO_REST_DURATION() {
        return INSTANCE.getSPORT_DATA_INFO_REST_DURATION();
    }

    public static final int getSPORT_DATA_INFO_SERVE_BALL_COUNT() {
        return INSTANCE.getSPORT_DATA_INFO_SERVE_BALL_COUNT();
    }

    public static final int getSPORT_DATA_INFO_SHOOT_COUNT() {
        return INSTANCE.getSPORT_DATA_INFO_SHOOT_COUNT();
    }

    public static final int getSPORT_DATA_INFO_SMASH_BALL_COUNT() {
        return INSTANCE.getSPORT_DATA_INFO_SMASH_BALL_COUNT();
    }

    public static final int getSPORT_DATA_INFO_STEPS_FREQ() {
        return INSTANCE.getSPORT_DATA_INFO_STEPS_FREQ();
    }

    public static final int getSPORT_DATA_INFO_STEP_LENGTH() {
        return INSTANCE.getSPORT_DATA_INFO_STEP_LENGTH();
    }

    public static final int getSPORT_DATA_INFO_TOTAL_CLIMBING() {
        return INSTANCE.getSPORT_DATA_INFO_TOTAL_CLIMBING();
    }

    public static final int getSPORT_DATA_STEP_SPEED_VALUE() {
        return INSTANCE.getSPORT_DATA_STEP_SPEED_VALUE();
    }

    public static final int getSPORT_DATA_VALUE_RANGE() {
        return INSTANCE.getSPORT_DATA_VALUE_RANGE();
    }

    public static final int getSPORT_INFO_AVG_CADENCE() {
        return INSTANCE.getSPORT_INFO_AVG_CADENCE();
    }

    public static final int getSPORT_INFO_AVG_DOWN_SWING_TIME() {
        return INSTANCE.getSPORT_INFO_AVG_DOWN_SWING_TIME();
    }

    public static final int getSPORT_INFO_AVG_HEIGHT() {
        return INSTANCE.getSPORT_INFO_AVG_HEIGHT();
    }

    public static final int getSPORT_INFO_AVG_HRM() {
        return INSTANCE.getSPORT_INFO_AVG_HRM();
    }

    public static final int getSPORT_INFO_AVG_PACE() {
        return INSTANCE.getSPORT_INFO_AVG_PACE();
    }

    public static final int getSPORT_INFO_AVG_POWER() {
        return INSTANCE.getSPORT_INFO_AVG_POWER();
    }

    public static final int getSPORT_INFO_AVG_RESISTANCE() {
        return INSTANCE.getSPORT_INFO_AVG_RESISTANCE();
    }

    public static final int getSPORT_INFO_AVG_ROW_FREQ() {
        return INSTANCE.getSPORT_INFO_AVG_ROW_FREQ();
    }

    public static final int getSPORT_INFO_AVG_SPEED() {
        return INSTANCE.getSPORT_INFO_AVG_SPEED();
    }

    public static final int getSPORT_INFO_AVG_STRESS() {
        return INSTANCE.getSPORT_INFO_AVG_STRESS();
    }

    public static final int getSPORT_INFO_AVG_SWING_RHYTHM() {
        return INSTANCE.getSPORT_INFO_AVG_SWING_RHYTHM();
    }

    public static final int getSPORT_INFO_AVG_SWING_SPEED() {
        return INSTANCE.getSPORT_INFO_AVG_SWING_SPEED();
    }

    public static final int getSPORT_INFO_AVG_SWING_TIME() {
        return INSTANCE.getSPORT_INFO_AVG_SWING_TIME();
    }

    public static final int getSPORT_INFO_CALORIE() {
        return INSTANCE.getSPORT_INFO_CALORIE();
    }

    public static final int getSPORT_INFO_DURATION() {
        return INSTANCE.getSPORT_INFO_DURATION();
    }

    public static final int getSPORT_INFO_FALL_HEIGHT() {
        return INSTANCE.getSPORT_INFO_FALL_HEIGHT();
    }

    public static final int getSPORT_INFO_MAX_SLOPE() {
        return INSTANCE.getSPORT_INFO_MAX_SLOPE();
    }

    public static final int getSPORT_INFO_MAX_SPEED() {
        return INSTANCE.getSPORT_INFO_MAX_SPEED();
    }

    public static final int getSPORT_INFO_POSTURE() {
        return INSTANCE.getSPORT_INFO_POSTURE();
    }

    public static final int getSPORT_INFO_RISE_HEIGHT() {
        return INSTANCE.getSPORT_INFO_RISE_HEIGHT();
    }

    public static final int getSPORT_INFO_SKIING_COUNT() {
        return INSTANCE.getSPORT_INFO_SKIING_COUNT();
    }

    public static final int getSPORT_INFO_SKIING_TIME() {
        return INSTANCE.getSPORT_INFO_SKIING_TIME();
    }

    public static final int getSPORT_INFO_SOMATOSENSORY_GAME() {
        return INSTANCE.getSPORT_INFO_SOMATOSENSORY_GAME();
    }

    public static final int getSPORT_INFO_STEPS() {
        return INSTANCE.getSPORT_INFO_STEPS();
    }

    public static final int getSPORT_INFO_STUMBLE_TIMES() {
        return INSTANCE.getSPORT_INFO_STUMBLE_TIMES();
    }

    public static final int getSPORT_INFO_SWING_COUNT() {
        return INSTANCE.getSPORT_INFO_SWING_COUNT();
    }

    public static final int getSPORT_INFO_TIMES() {
        return INSTANCE.getSPORT_INFO_TIMES();
    }

    public static final int getSPORT_INFO_TOTAL_GOLF_SCORES() {
        return INSTANCE.getSPORT_INFO_TOTAL_GOLF_SCORES();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRemindUrl() {
        return this.remindUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPluralTitle() {
        return this.pluralTitle;
    }

    @NotNull
    public final BasicItemInfo copy(int title, @NotNull String data, @NotNull String unit, int index, @Nullable String remindUrl, @Nullable String pluralTitle) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new BasicItemInfo(title, data, unit, index, remindUrl, pluralTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicItemInfo)) {
            return false;
        }
        BasicItemInfo basicItemInfo = (BasicItemInfo) other;
        return this.title == basicItemInfo.title && Intrinsics.areEqual(this.data, basicItemInfo.data) && Intrinsics.areEqual(this.unit, basicItemInfo.unit) && this.index == basicItemInfo.index && Intrinsics.areEqual(this.remindUrl, basicItemInfo.remindUrl) && Intrinsics.areEqual(this.pluralTitle, basicItemInfo.pluralTitle);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getPluralTitle() {
        return this.pluralTitle;
    }

    @Nullable
    public final String getRemindUrl() {
        return this.remindUrl;
    }

    public final int getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.title) * 31) + this.data.hashCode()) * 31) + this.unit.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
        String str = this.remindUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pluralTitle;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BasicItemInfo(title=" + this.title + ", data=" + this.data + ", unit=" + this.unit + ", index=" + this.index + ", remindUrl=" + this.remindUrl + ", pluralTitle=" + this.pluralTitle + ")";
    }

    public /* synthetic */ BasicItemInfo(int i, String str, String str2, int i2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4);
    }
}
