package com.mi.health.course.export.data;

import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/mi/health/course/export/data/CourseListRequestV3;", "", "rule_key", "", "types", "", "tags", RouteRequest.KEY_NEXT_KEY, "count", "", "<init>", "(Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;I)V", "getRule_key", "()Ljava/lang/String;", "getTypes", "()[I", "getTags", "getNext_key", "getCount", "()I", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseListRequestV3 {
    private final int count;

    @Nullable
    private final String next_key;

    @Nullable
    private final String rule_key;

    @Nullable
    private final String tags;

    @Nullable
    private final int[] types;

    public CourseListRequestV3() {
        this(null, null, null, null, 0, 31, null);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final String getNext_key() {
        return this.next_key;
    }

    @Nullable
    public final String getRule_key() {
        return this.rule_key;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    @Nullable
    public final int[] getTypes() {
        return this.types;
    }

    public CourseListRequestV3(@Nullable String str, @Nullable int[] iArr, @Nullable String str2, @Nullable String str3, int i) {
        this.rule_key = str;
        this.types = iArr;
        this.tags = str2;
        this.next_key = str3;
        this.count = i;
    }

    public /* synthetic */ CourseListRequestV3(String str, int[] iArr, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : iArr, (i2 & 4) != 0 ? null : str2, (i2 & 8) == 0 ? str3 : null, (i2 & 16) != 0 ? 30 : i);
    }
}
