package com.xiaomi.fitness.electronic.scale.export.bean;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity(primaryKeys = {"createTime"}, tableName = "virtual_account")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\bG\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0001dBÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010J\u001a\u00020\u000bJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u000bHÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\t\u0010S\u001a\u00020\u000eHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u000eHÆ\u0003J\t\u0010Z\u001a\u00020\u000eHÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\u000eHÆ\u0003J\t\u0010]\u001a\u00020\u0019HÆ\u0003JÇ\u0001\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\u0013\u0010_\u001a\u00020\u000b2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020\u000eHÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010,\"\u0004\b-\u0010.R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010,\"\u0004\b/\u0010.R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\u001e\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001e\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\u001e\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00101\"\u0004\bA\u00103R\u001e\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010#\"\u0004\bC\u0010%R\u001e\u0010\u0017\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00101\"\u0004\bE\u00103R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "Ljava/io/Serializable;", "did", "", "model", "uid", "", Column.ACCOUNT_ID, "name", "icon", "isDel", "", "isSyn", "type", "", "bodyComposition", "createDate", "createTime", "creationTime", "sn", "dataVersion", "sex", MedicalIdSPContract.PREF_BIRTHDAY, "height", "weightTarget", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ZZILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;IIJIF)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getModel", "setModel", "getUid", "()J", "setUid", "(J)V", "getAccountId", "setAccountId", "getName", "setName", "getIcon", "setIcon", "()Z", "setDel", "(Z)V", "setSyn", "getType", "()I", "setType", "(I)V", "getBodyComposition", "setBodyComposition", "getCreateDate", "setCreateDate", "getCreateTime", "setCreateTime", "getCreationTime", "setCreationTime", "getSn", "setSn", "getDataVersion", "setDataVersion", "getSex", "setSex", "getBirth", "setBirth", "getHeight", "setHeight", "getWeightTarget", "()F", "setWeightTarget", "(F)V", "isIncomplete", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VirtualAccount implements Serializable {
    public static final int TYPE_MAIN_ACCOUNT = 1;
    public static final int TYPE_VIRTUAL_ACCOUNT = 2;
    private long accountId;

    @ColumnInfo(defaultValue = "0", name = MedicalIdSPContract.PREF_BIRTHDAY)
    private long birth;

    @NotNull
    private String bodyComposition;

    @NotNull
    private String createDate;
    private long createTime;
    private long creationTime;

    @ColumnInfo(defaultValue = "0", name = "dataVersion")
    private int dataVersion;

    @NotNull
    private String did;

    @ColumnInfo(defaultValue = "0", name = "height")
    private int height;

    @NotNull
    private String icon;
    private boolean isDel;
    private boolean isSyn;

    @NotNull
    private String model;

    @NotNull
    private String name;

    @ColumnInfo(defaultValue = "-1", name = "sex")
    private int sex;

    @ColumnInfo(defaultValue = "", name = "sn")
    @NotNull
    private String sn;
    private int type;
    private long uid;

    @ColumnInfo(defaultValue = "0", name = "weightTarget")
    private float weightTarget;

    public VirtualAccount() {
        this(null, null, 0L, 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524287, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBodyComposition() {
        return this.bodyComposition;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCreateDate() {
        return this.createDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getDataVersion() {
        return this.dataVersion;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getBirth() {
        return this.birth;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final float getWeightTarget() {
        return this.weightTarget;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDel() {
        return this.isDel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsSyn() {
        return this.isSyn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final VirtualAccount copy(@NotNull String did, @NotNull String model, long uid, long accountId, @NotNull String name, @NotNull String icon, boolean isDel, boolean isSyn, int type, @NotNull String bodyComposition, @NotNull String createDate, long createTime, long creationTime, @NotNull String sn, int dataVersion, int sex, long birth, int height, float weightTarget) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(bodyComposition, "bodyComposition");
        Intrinsics.checkNotNullParameter(createDate, "createDate");
        Intrinsics.checkNotNullParameter(sn, "sn");
        return new VirtualAccount(did, model, uid, accountId, name, icon, isDel, isSyn, type, bodyComposition, createDate, createTime, creationTime, sn, dataVersion, sex, birth, height, weightTarget);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VirtualAccount)) {
            return false;
        }
        VirtualAccount virtualAccount = (VirtualAccount) other;
        return Intrinsics.areEqual(this.did, virtualAccount.did) && Intrinsics.areEqual(this.model, virtualAccount.model) && this.uid == virtualAccount.uid && this.accountId == virtualAccount.accountId && Intrinsics.areEqual(this.name, virtualAccount.name) && Intrinsics.areEqual(this.icon, virtualAccount.icon) && this.isDel == virtualAccount.isDel && this.isSyn == virtualAccount.isSyn && this.type == virtualAccount.type && Intrinsics.areEqual(this.bodyComposition, virtualAccount.bodyComposition) && Intrinsics.areEqual(this.createDate, virtualAccount.createDate) && this.createTime == virtualAccount.createTime && this.creationTime == virtualAccount.creationTime && Intrinsics.areEqual(this.sn, virtualAccount.sn) && this.dataVersion == virtualAccount.dataVersion && this.sex == virtualAccount.sex && this.birth == virtualAccount.birth && this.height == virtualAccount.height && Float.compare(this.weightTarget, virtualAccount.weightTarget) == 0;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final long getBirth() {
        return this.birth;
    }

    @NotNull
    public final String getBodyComposition() {
        return this.bodyComposition;
    }

    @NotNull
    public final String getCreateDate() {
        return this.createDate;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final int getDataVersion() {
        return this.dataVersion;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getSex() {
        return this.sex;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    public final float getWeightTarget() {
        return this.weightTarget;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.did.hashCode() * 31) + this.model.hashCode()) * 31) + Long.hashCode(this.uid)) * 31) + Long.hashCode(this.accountId)) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.isDel)) * 31) + Boolean.hashCode(this.isSyn)) * 31) + Integer.hashCode(this.type)) * 31) + this.bodyComposition.hashCode()) * 31) + this.createDate.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.creationTime)) * 31) + this.sn.hashCode()) * 31) + Integer.hashCode(this.dataVersion)) * 31) + Integer.hashCode(this.sex)) * 31) + Long.hashCode(this.birth)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.weightTarget);
    }

    public final boolean isDel() {
        return this.isDel;
    }

    public final boolean isIncomplete() {
        return this.height == 0 || this.birth == 0;
    }

    public final boolean isSyn() {
        return this.isSyn;
    }

    public final void setAccountId(long j) {
        this.accountId = j;
    }

    public final void setBirth(long j) {
        this.birth = j;
    }

    public final void setBodyComposition(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bodyComposition = str;
    }

    public final void setCreateDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createDate = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public final void setDel(boolean z) {
        this.isDel = z;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setSn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    public final void setSyn(boolean z) {
        this.isSyn = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setWeightTarget(float f) {
        this.weightTarget = f;
    }

    @NotNull
    public String toString() {
        return "VirtualAccount(did=" + this.did + ", model=" + this.model + ", uid=" + this.uid + ", accountId=" + this.accountId + ", name=" + this.name + ", icon=" + this.icon + ", isDel=" + this.isDel + ", isSyn=" + this.isSyn + ", type=" + this.type + ", bodyComposition=" + this.bodyComposition + ", createDate=" + this.createDate + ", createTime=" + this.createTime + ", creationTime=" + this.creationTime + ", sn=" + this.sn + ", dataVersion=" + this.dataVersion + ", sex=" + this.sex + ", birth=" + this.birth + ", height=" + this.height + ", weightTarget=" + this.weightTarget + ")";
    }

    public VirtualAccount(@NotNull String did, @NotNull String model, long j, long j2, @NotNull String name, @NotNull String icon, boolean z, boolean z2, int i, @NotNull String bodyComposition, @NotNull String createDate, long j3, long j4, @NotNull String sn, int i2, int i3, long j5, int i4, float f) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(bodyComposition, "bodyComposition");
        Intrinsics.checkNotNullParameter(createDate, "createDate");
        Intrinsics.checkNotNullParameter(sn, "sn");
        this.did = did;
        this.model = model;
        this.uid = j;
        this.accountId = j2;
        this.name = name;
        this.icon = icon;
        this.isDel = z;
        this.isSyn = z2;
        this.type = i;
        this.bodyComposition = bodyComposition;
        this.createDate = createDate;
        this.createTime = j3;
        this.creationTime = j4;
        this.sn = sn;
        this.dataVersion = i2;
        this.sex = i3;
        this.birth = j5;
        this.height = i4;
        this.weightTarget = f;
    }

    public /* synthetic */ VirtualAccount(String str, String str2, long j, long j2, String str3, String str4, boolean z, boolean z2, int i, String str5, String str6, long j3, long j4, String str7, int i2, int i3, long j5, int i4, float f, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 0L : j, (i5 & 8) != 0 ? 0L : j2, (i5 & 16) != 0 ? "" : str3, (i5 & 32) != 0 ? "" : str4, (i5 & 64) != 0 ? false : z, (i5 & 128) != 0 ? false : z2, (i5 & 256) != 0 ? 0 : i, (i5 & 512) != 0 ? "" : str5, (i5 & 1024) != 0 ? "" : str6, (i5 & 2048) != 0 ? 0L : j3, (i5 & 4096) != 0 ? 0L : j4, (i5 & 8192) == 0 ? str7 : "", (i5 & 16384) != 0 ? 0 : i2, (i5 & 32768) != 0 ? -1 : i3, (i5 & 65536) != 0 ? 0L : j5, (i5 & 131072) != 0 ? 0 : i4, (i5 & 262144) != 0 ? 0.0f : f);
    }
}
