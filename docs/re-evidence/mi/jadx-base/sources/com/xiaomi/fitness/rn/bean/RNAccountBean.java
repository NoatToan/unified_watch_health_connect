package com.xiaomi.fitness.rn.bean;

import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J3\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/rn/bean/RNAccountBean;", "", "name", "", "sex", MedicalIdSPContract.PREF_BIRTHDAY, "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSex", "setSex", "getBirth", "()J", "setBirth", "(J)V", "getHeight", "()I", "setHeight", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RNAccountBean {
    private long birth;
    private int height;

    @Nullable
    private String name;

    @NotNull
    private String sex;

    public RNAccountBean(@Nullable String str, @NotNull String sex, long j, int i) {
        Intrinsics.checkNotNullParameter(sex, "sex");
        this.name = str;
        this.sex = sex;
        this.birth = j;
        this.height = i;
    }

    public static /* synthetic */ RNAccountBean copy$default(RNAccountBean rNAccountBean, String str, String str2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rNAccountBean.name;
        }
        if ((i2 & 2) != 0) {
            str2 = rNAccountBean.sex;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = rNAccountBean.birth;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = rNAccountBean.height;
        }
        return rNAccountBean.copy(str, str3, j2, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getBirth() {
        return this.birth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final RNAccountBean copy(@Nullable String name, @NotNull String sex, long birth, int height) {
        Intrinsics.checkNotNullParameter(sex, "sex");
        return new RNAccountBean(name, sex, birth, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RNAccountBean)) {
            return false;
        }
        RNAccountBean rNAccountBean = (RNAccountBean) other;
        return Intrinsics.areEqual(this.name, rNAccountBean.name) && Intrinsics.areEqual(this.sex, rNAccountBean.sex) && this.birth == rNAccountBean.birth && this.height == rNAccountBean.height;
    }

    public final long getBirth() {
        return this.birth;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    public int hashCode() {
        String str = this.name;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.sex.hashCode()) * 31) + Long.hashCode(this.birth)) * 31) + Integer.hashCode(this.height);
    }

    public final void setBirth(long j) {
        this.birth = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    @NotNull
    public String toString() {
        return "RNAccountBean(name=" + this.name + ", sex=" + this.sex + ", birth=" + this.birth + ", height=" + this.height + ")";
    }
}
