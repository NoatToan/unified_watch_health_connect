package com.huami.femalehealth.logiclib.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import defpackage.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0012\u0010\u000e¨\u0006!"}, d2 = {"Lcom/huami/femalehealth/logiclib/dto/Section;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "component1", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "start", "end", EcgData.TIMESTAMP_SERVER_UPDATED, "isEnd", "copy", "(JJJLjava/lang/Boolean;)Lcom/huami/femalehealth/logiclib/dto/Section;", "a", "J", "getStart", "()J", "b", "getEnd", "c", "getUpdateTime", GoogleApiAvailabilityLight.a, "Ljava/lang/Boolean;", "<init>", "(JJJLjava/lang/Boolean;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Section {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long updateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Boolean isEnd;

    public Section(long j, long j2, long j3, @Nullable Boolean bool) {
        this.start = j;
        this.end = j2;
        this.updateTime = j3;
        this.isEnd = bool;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsEnd() {
        return this.isEnd;
    }

    @NotNull
    public final Section copy(long start, long end, long updateTime, @Nullable Boolean isEnd) {
        return new Section(start, end, updateTime, isEnd);
    }

    public boolean equals(@Nullable Object other) {
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.femalehealth.logiclib.dto.Section");
        Section section = (Section) other;
        return this.start == section.start && this.end == section.end;
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (b.a(this.start) * 31) + b.a(this.end);
    }

    @Nullable
    public final Boolean isEnd() {
        return this.isEnd;
    }

    @NotNull
    public String toString() {
        return "start:" + NumberExtKt.dateFormat(this.start) + ",end:" + NumberExtKt.dateFormat(this.end) + ",update:" + NumberExtKt.dateFormat(this.updateTime) + ",isEnd:" + this.isEnd;
    }

    public /* synthetic */ Section(long j, long j2, long j3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, (i & 8) != 0 ? null : bool);
    }
}
