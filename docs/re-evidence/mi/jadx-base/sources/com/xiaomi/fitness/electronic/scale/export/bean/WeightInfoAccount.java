package com.xiaomi.fitness.electronic.scale.export.bean;

import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\tHÖ\u0001J\t\u00107\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/WeightInfoAccount;", "Ljava/io/Serializable;", "uid", "", Column.ACCOUNT_ID, "name", "", "icon", "type", "", "sex", "height", "weightTarget", MedicalIdSPContract.PREF_BIRTHDAY, "<init>", "(JJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUid", "()J", "setUid", "(J)V", "getAccountId", "setAccountId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getType", "()I", "setType", "(I)V", "getSex", "setSex", "getHeight", "setHeight", "getWeightTarget", "setWeightTarget", "getBirth", "setBirth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeightInfoAccount implements Serializable {
    private long accountId;

    @NotNull
    private String birth;

    @NotNull
    private String height;

    @NotNull
    private String icon;

    @NotNull
    private String name;

    @NotNull
    private String sex;
    private int type;
    private long uid;

    @NotNull
    private String weightTarget;

    public WeightInfoAccount() {
        this(0L, 0L, null, null, 0, null, null, null, null, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWeightTarget() {
        return this.weightTarget;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBirth() {
        return this.birth;
    }

    @NotNull
    public final WeightInfoAccount copy(long uid, long accountId, @NotNull String name, @NotNull String icon, int type, @NotNull String sex, @NotNull String height, @NotNull String weightTarget, @NotNull String birth) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(weightTarget, "weightTarget");
        Intrinsics.checkNotNullParameter(birth, "birth");
        return new WeightInfoAccount(uid, accountId, name, icon, type, sex, height, weightTarget, birth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightInfoAccount)) {
            return false;
        }
        WeightInfoAccount weightInfoAccount = (WeightInfoAccount) other;
        return this.uid == weightInfoAccount.uid && this.accountId == weightInfoAccount.accountId && Intrinsics.areEqual(this.name, weightInfoAccount.name) && Intrinsics.areEqual(this.icon, weightInfoAccount.icon) && this.type == weightInfoAccount.type && Intrinsics.areEqual(this.sex, weightInfoAccount.sex) && Intrinsics.areEqual(this.height, weightInfoAccount.height) && Intrinsics.areEqual(this.weightTarget, weightInfoAccount.weightTarget) && Intrinsics.areEqual(this.birth, weightInfoAccount.birth);
    }

    public final long getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getBirth() {
        return this.birth;
    }

    @NotNull
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    @NotNull
    public final String getWeightTarget() {
        return this.weightTarget;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.uid) * 31) + Long.hashCode(this.accountId)) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + this.sex.hashCode()) * 31) + this.height.hashCode()) * 31) + this.weightTarget.hashCode()) * 31) + this.birth.hashCode();
    }

    public final void setAccountId(long j) {
        this.accountId = j;
    }

    public final void setBirth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.birth = str;
    }

    public final void setHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.height = str;
    }

    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sex = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setWeightTarget(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weightTarget = str;
    }

    @NotNull
    public String toString() {
        return "WeightInfoAccount(uid=" + this.uid + ", accountId=" + this.accountId + ", name=" + this.name + ", icon=" + this.icon + ", type=" + this.type + ", sex=" + this.sex + ", height=" + this.height + ", weightTarget=" + this.weightTarget + ", birth=" + this.birth + ")";
    }

    public WeightInfoAccount(long j, long j2, @NotNull String name, @NotNull String icon, int i, @NotNull String sex, @NotNull String height, @NotNull String weightTarget, @NotNull String birth) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(weightTarget, "weightTarget");
        Intrinsics.checkNotNullParameter(birth, "birth");
        this.uid = j;
        this.accountId = j2;
        this.name = name;
        this.icon = icon;
        this.type = i;
        this.sex = sex;
        this.height = height;
        this.weightTarget = weightTarget;
        this.birth = birth;
    }

    public /* synthetic */ WeightInfoAccount(long j, long j2, String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) == 0 ? str6 : "");
    }
}
