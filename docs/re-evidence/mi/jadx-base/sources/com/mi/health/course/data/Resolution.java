package com.mi.health.course.data;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B%\b\u0004\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/mi/health/course/data/Resolution;", "", "range", "Lkotlin/Pair;", "", "resolutionDes", "", "<init>", "(Lkotlin/Pair;Ljava/lang/String;)V", "getRange", "()Lkotlin/Pair;", "getResolutionDes", "()Ljava/lang/String;", "id", "getId", "()I", "toString", "Lcom/mi/health/course/data/Resolution1080;", "Lcom/mi/health/course/data/Resolution4K;", "Lcom/mi/health/course/data/Resolution720;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Resolution {
    private final int id;

    @NotNull
    private final Pair<Integer, Integer> range;

    @NotNull
    private final String resolutionDes;

    public /* synthetic */ Resolution(Pair pair, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(pair, str);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Pair<Integer, Integer> getRange() {
        return this.range;
    }

    @NotNull
    public final String getResolutionDes() {
        return this.resolutionDes;
    }

    @NotNull
    public String toString() {
        return "Resolution(range=" + this.range + ", resolutionDes='" + this.resolutionDes + "', id=" + this.id + ")";
    }

    private Resolution(Pair<Integer, Integer> pair, String str) {
        this.range = pair;
        this.resolutionDes = str;
        this.id = pair.getFirst().intValue();
    }
}
