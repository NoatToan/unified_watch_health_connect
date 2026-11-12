package com.huami.step.model;

import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J2\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/step/model/ChildInfo;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "", "component3", "age", "gender", ParamKey.createTime, "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;J)Lcom/huami/step/model/ChildInfo;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getAge", "b", "getGender", "c", "J", "getCreateTime", "()J", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;J)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChildInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer age;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer gender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long createTime;

    public ChildInfo(@Nullable Integer num, @Nullable Integer num2, long j) {
        this.age = num;
        this.gender = num2;
        this.createTime = j;
    }

    public static /* synthetic */ ChildInfo copy$default(ChildInfo childInfo, Integer num, Integer num2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            num = childInfo.age;
        }
        if ((i & 2) != 0) {
            num2 = childInfo.gender;
        }
        if ((i & 4) != 0) {
            j = childInfo.createTime;
        }
        return childInfo.copy(num, num2, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final ChildInfo copy(@Nullable Integer age, @Nullable Integer gender, long createTime) {
        return new ChildInfo(age, gender, createTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildInfo)) {
            return false;
        }
        ChildInfo childInfo = (ChildInfo) other;
        return Intrinsics.areEqual(this.age, childInfo.age) && Intrinsics.areEqual(this.gender, childInfo.gender) && this.createTime == childInfo.createTime;
    }

    @Nullable
    public final Integer getAge() {
        return this.age;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Integer getGender() {
        return this.gender;
    }

    public int hashCode() {
        Integer num = this.age;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.gender;
        return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + b.a(this.createTime);
    }

    @NotNull
    public String toString() {
        return "ChildInfo(age=" + this.age + ", gender=" + this.gender + ", createTime=" + this.createTime + ")";
    }
}
