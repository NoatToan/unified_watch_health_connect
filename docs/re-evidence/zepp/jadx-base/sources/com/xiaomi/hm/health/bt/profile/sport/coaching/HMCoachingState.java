package com.xiaomi.hm.health.bt.profile.sport.coaching;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingState;", "", "", "", "getCoachIds", "()[Ljava/lang/Long;", "", "index", "", "hasCoaching", "isFull", "", "toString", "a", LogUtil.I, "version", "", "b", "Ljava/util/Map;", "workouts", "", "data", "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMCoachingState {
    public static final int MAX_COUNT = 6;
    private static final int c = 1;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 1;
    private static final int g = 8;
    private static final int h = 9;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Long> workouts;

    public HMCoachingState(@NotNull byte[] bArr) {
        int i = 0;
        if (bArr.length < 2) {
            this.version = 0;
            this.workouts = r.emptyMap();
            return;
        }
        this.version = ByteUtilsKt.toInt$default(bArr, 1, 0, 2, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = ByteUtilsKt.toInt(bArr, 1, 1);
        if (i2 != 0) {
            int length = bArr.length;
            if (i2 > 0) {
                while (true) {
                    int i3 = i + 1;
                    int i4 = (i * 9) + 2;
                    int i5 = i4 + 9;
                    if (i4 > length || i5 > length) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(ByteUtilsKt.toInt(bArr, 1, i4)), Long.valueOf(ByteUtilsKt.toLong(bArr, 8, i4 + 1)));
                    if (i3 >= i2) {
                        break;
                    } else {
                        i = i3;
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        this.workouts = r.toMap(linkedHashMap);
    }

    @NotNull
    public final Long[] getCoachIds() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            arrayList.add(i, this.workouts.get(Integer.valueOf(i)));
            if (i2 >= 6) {
                Object[] array = arrayList.toArray(new Long[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return (Long[]) array;
            }
            i = i2;
        }
    }

    public final boolean hasCoaching(int index) {
        return this.workouts.get(Integer.valueOf(index)) != null;
    }

    public final boolean isFull() {
        return this.workouts.size() == 6;
    }

    @NotNull
    public String toString() {
        return "HMCoachingState(version = " + this.version + ", workouts = " + this.workouts + ')';
    }
}
