package com.xiaomi.hm.health.bt.profile.sport.coaching;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B5\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÂ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003JA\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0013\u0010#\u001a\u00020 8F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingWorkout;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "a", "", "b", "", "c", "", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/HMCoachingSequence;", GoogleApiAvailabilityLight.a, "", "component1", "id", "type", "repeat", "title", "sequences", "copy", "toString", "hashCode", "other", "", "equals", "J", "getId", "()J", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", LogUtil.I, "Ljava/lang/String;", "e", "Ljava/util/List;", "", "getBytes", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(JLcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;ILjava/lang/String;Ljava/util/List;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMCoachingWorkout {
    public static final int DATA_LEN_WORKOUT_ID = 8;
    private static final int f = 39;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final CoachingWorkoutType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int repeat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<HMCoachingSequence> sequences;

    public HMCoachingWorkout(long j, @NotNull CoachingWorkoutType coachingWorkoutType, int i, @NotNull String str, @NotNull List<HMCoachingSequence> list) {
        this.id = j;
        this.type = coachingWorkoutType;
        this.repeat = i;
        this.title = str;
        this.sequences = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final CoachingWorkoutType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final int getRepeat() {
        return this.repeat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMCoachingWorkout copy$default(HMCoachingWorkout hMCoachingWorkout, long j, CoachingWorkoutType coachingWorkoutType, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hMCoachingWorkout.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            coachingWorkoutType = hMCoachingWorkout.type;
        }
        CoachingWorkoutType coachingWorkoutType2 = coachingWorkoutType;
        if ((i2 & 4) != 0) {
            i = hMCoachingWorkout.repeat;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = hMCoachingWorkout.title;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            list = hMCoachingWorkout.sequences;
        }
        return hMCoachingWorkout.copy(j2, coachingWorkoutType2, i3, str2, list);
    }

    private final List<HMCoachingSequence> d() {
        return this.sequences;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    public final HMCoachingWorkout copy(long id, @NotNull CoachingWorkoutType type, int repeat, @NotNull String title, @NotNull List<HMCoachingSequence> sequences) {
        return new HMCoachingWorkout(id, type, repeat, title, sequences);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMCoachingWorkout)) {
            return false;
        }
        HMCoachingWorkout hMCoachingWorkout = (HMCoachingWorkout) other;
        return this.id == hMCoachingWorkout.id && Intrinsics.areEqual(this.type, hMCoachingWorkout.type) && this.repeat == hMCoachingWorkout.repeat && Intrinsics.areEqual(this.title, hMCoachingWorkout.title) && Intrinsics.areEqual(this.sequences, hMCoachingWorkout.sequences);
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.type.getType());
        byteArrayOutputStream.write(this.repeat);
        String str = this.title;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        if (bytes.length < 39) {
            byteArrayOutputStream.write(bytes);
        } else {
            byteArrayOutputStream.write(bytes, 0, 39);
        }
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(this.sequences.size());
        Iterator<T> it2 = this.sequences.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(((HMCoachingSequence) it2.next()).getBytes());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((((b.a(this.id) * 31) + this.type.hashCode()) * 31) + this.repeat) * 31) + this.title.hashCode()) * 31) + this.sequences.hashCode();
    }

    @NotNull
    public String toString() {
        return "HMCoachingWorkout(id=" + this.id + ", type=" + this.type + ", repeat=" + this.repeat + ", title=" + this.title + ", sequences=" + this.sequences + ')';
    }
}
