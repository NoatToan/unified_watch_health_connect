package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020\r\u0012\u0006\u0010'\u001a\u00020\"\u0012\b\b\u0002\u0010-\u001a\u00020(¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u001b\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u001e\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010!\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\u0019\u0010'\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010-\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/FamilyMemberInfo;", "", "", "toString", "", "a", "J", "getId", "()J", "id", "b", "getMemberId", ParamKey.memberId, "", "c", LogUtil.I, "getAvatarId", "()I", "avatarId", GoogleApiAvailabilityLight.a, "getGender", "gender", "e", "getHeight", "height", "f", "getMeasureMode", "measureMode", "g", "getBirthDayYear", "birthDayYear", "h", "getBirthDayMonth", "birthDayMonth", "", "i", "[B", "getNickName", "()[B", "nickName", "", z.j, "F", "getWeight", "()F", "weight", "<init>", "(JJIIIIII[BF)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FamilyMemberInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long memberId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int avatarId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int gender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int height;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int measureMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int birthDayYear;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int birthDayMonth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] nickName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final float weight;

    public FamilyMemberInfo(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, @NotNull byte[] bArr, float f) {
        this.id = j;
        this.memberId = j2;
        this.avatarId = i;
        this.gender = i2;
        this.height = i3;
        this.measureMode = i4;
        this.birthDayYear = i5;
        this.birthDayMonth = i6;
        this.nickName = bArr;
        this.weight = f;
    }

    public final int getAvatarId() {
        return this.avatarId;
    }

    public final int getBirthDayMonth() {
        return this.birthDayMonth;
    }

    public final int getBirthDayYear() {
        return this.birthDayYear;
    }

    public final int getGender() {
        return this.gender;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.id;
    }

    public final int getMeasureMode() {
        return this.measureMode;
    }

    public final long getMemberId() {
        return this.memberId;
    }

    @NotNull
    public final byte[] getNickName() {
        return this.nickName;
    }

    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    public String toString() {
        return "FamilyMemberInfo(id=" + this.id + ", memberId=" + this.memberId + ", avatarId=" + this.avatarId + ", gender=" + this.gender + ", height=" + this.height + ", measureMode=" + this.measureMode + ", birthDayYear=" + this.birthDayYear + ", birthDayMonth=" + this.birthDayMonth + ", nickName=" + Arrays.toString(this.nickName) + ", weight=" + this.weight + ')';
    }

    public /* synthetic */ FamilyMemberInfo(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, float f, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, i2, i3, i4, i5, i6, bArr, (i7 & 512) != 0 ? 0.0f : f);
    }
}
