package com.xiaomi.hm.health.bt.profile.sport.coaching;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0003B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÂ\u0003J\t\u0010\t\u001a\u00020\bHÂ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0013\u0010\u001b\u001a\u00020\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingSegment;", "", "", "a", "b", "c", GoogleApiAvailabilityLight.a, "e", "", "f", "type", "icon", "goalType", "goalValue", "hrZone", "name", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "Ljava/lang/String;", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(IIIIILjava/lang/String;)V", "g", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMCoachingSegment {

    @Deprecated
    public static final int NAME_MAX_LEN = 39;

    @NotNull
    private static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int goalType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int goalValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int hrZone;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingSegment$a", "", "", "NAME_MAX_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HMCoachingSegment(int i, int i2, int i3, int i4, int i5, @NotNull String str) {
        this.type = i;
        this.icon = i2;
        this.goalType = i3;
        this.goalValue = i4;
        this.hrZone = i5;
        this.name = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final int getGoalType() {
        return this.goalType;
    }

    public static /* synthetic */ HMCoachingSegment copy$default(HMCoachingSegment hMCoachingSegment, int i, int i2, int i3, int i4, int i5, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = hMCoachingSegment.type;
        }
        if ((i6 & 2) != 0) {
            i2 = hMCoachingSegment.icon;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = hMCoachingSegment.goalType;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = hMCoachingSegment.goalValue;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = hMCoachingSegment.hrZone;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            str = hMCoachingSegment.name;
        }
        return hMCoachingSegment.copy(i, i7, i8, i9, i10, str);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    private final int getGoalValue() {
        return this.goalValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    private final int getHrZone() {
        return this.hrZone;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    private final String getName() {
        return this.name;
    }

    @NotNull
    public final HMCoachingSegment copy(int type, int icon, int goalType, int goalValue, int hrZone, @NotNull String name) {
        return new HMCoachingSegment(type, icon, goalType, goalValue, hrZone, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMCoachingSegment)) {
            return false;
        }
        HMCoachingSegment hMCoachingSegment = (HMCoachingSegment) other;
        return this.type == hMCoachingSegment.type && this.icon == hMCoachingSegment.icon && this.goalType == hMCoachingSegment.goalType && this.goalValue == hMCoachingSegment.goalValue && this.hrZone == hMCoachingSegment.hrZone && Intrinsics.areEqual(this.name, hMCoachingSegment.name);
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.type);
        byteArrayOutputStream.write(this.icon);
        byteArrayOutputStream.write(this.goalType);
        byteArrayOutputStream.write(GattUtils.intToBytes(this.goalValue));
        byteArrayOutputStream.write(GattUtils.intToBytes(this.hrZone));
        String str = this.name;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        if (bytes.length < 39) {
            byteArrayOutputStream.write(bytes);
        } else {
            byteArrayOutputStream.write(bytes, 0, 39);
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return (((((((((this.type * 31) + this.icon) * 31) + this.goalType) * 31) + this.goalValue) * 31) + this.hrZone) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "HMCoachingSegment(type=" + this.type + ", icon=" + this.icon + ", goalType=" + this.goalType + ", goalValue=" + this.goalValue + ", hrZone=" + this.hrZone + ", name=" + this.name + ')';
    }
}
