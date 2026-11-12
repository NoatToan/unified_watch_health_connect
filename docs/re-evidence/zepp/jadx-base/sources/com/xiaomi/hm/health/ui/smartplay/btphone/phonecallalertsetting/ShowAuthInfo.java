package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import androidx.annotation.StringRes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b7\u00108B=\b\u0016\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b7\u00109J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004JZ\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\f2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004\"\u0004\b\u001e\u0010\u001fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0004\"\u0004\b\"\u0010\u001fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010-R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u0004\"\u0004\b6\u0010\u001f¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "", "", "component1", "()Ljava/lang/Integer;", "component2", "", "component3", "", "", "component4", "()[Ljava/lang/String;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "component5", "component6", "titleRes", "subTitleRes", "show", PointCategory.PERMISSION, DataCacher.o, "denyPromoteId", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z[Ljava/lang/String;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/Integer;", "getTitleRes", "setTitleRes", "(Ljava/lang/Integer;)V", "b", "getSubTitleRes", "setSubTitleRes", "c", "Z", "getShow", "()Z", "setShow", "(Z)V", GoogleApiAvailabilityLight.a, "[Ljava/lang/String;", "getPermission", "setPermission", "([Ljava/lang/String;)V", "e", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "getOwner", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "setOwner", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;)V", "f", "getDenyPromoteId", "setDenyPromoteId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Z[Ljava/lang/String;Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;Ljava/lang/Integer;)V", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/Integer;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ShowAuthInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer titleRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer subTitleRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean show;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String[] permission;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private SettingType owner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer denyPromoteId;

    public ShowAuthInfo(@StringRes @Nullable Integer num, @StringRes @Nullable Integer num2, boolean z, @Nullable String[] strArr, @NotNull SettingType settingType, @StringRes @Nullable Integer num3) {
        this.titleRes = num;
        this.subTitleRes = num2;
        this.show = z;
        this.permission = strArr;
        this.owner = settingType;
        this.denyPromoteId = num3;
    }

    public static /* synthetic */ ShowAuthInfo copy$default(ShowAuthInfo showAuthInfo, Integer num, Integer num2, boolean z, String[] strArr, SettingType settingType, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = showAuthInfo.titleRes;
        }
        if ((i & 2) != 0) {
            num2 = showAuthInfo.subTitleRes;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            z = showAuthInfo.show;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            strArr = showAuthInfo.permission;
        }
        String[] strArr2 = strArr;
        if ((i & 16) != 0) {
            settingType = showAuthInfo.owner;
        }
        SettingType settingType2 = settingType;
        if ((i & 32) != 0) {
            num3 = showAuthInfo.denyPromoteId;
        }
        return showAuthInfo.copy(num, num4, z2, strArr2, settingType2, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTitleRes() {
        return this.titleRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSubTitleRes() {
        return this.subTitleRes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String[] getPermission() {
        return this.permission;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SettingType getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getDenyPromoteId() {
        return this.denyPromoteId;
    }

    @NotNull
    public final ShowAuthInfo copy(@StringRes @Nullable Integer titleRes, @StringRes @Nullable Integer subTitleRes, boolean show, @Nullable String[] permission, @NotNull SettingType owner, @StringRes @Nullable Integer denyPromoteId) {
        return new ShowAuthInfo(titleRes, subTitleRes, show, permission, owner, denyPromoteId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowAuthInfo)) {
            return false;
        }
        ShowAuthInfo showAuthInfo = (ShowAuthInfo) other;
        return Intrinsics.areEqual(this.titleRes, showAuthInfo.titleRes) && Intrinsics.areEqual(this.subTitleRes, showAuthInfo.subTitleRes) && this.show == showAuthInfo.show && Intrinsics.areEqual(this.permission, showAuthInfo.permission) && this.owner == showAuthInfo.owner && Intrinsics.areEqual(this.denyPromoteId, showAuthInfo.denyPromoteId);
    }

    @Nullable
    public final Integer getDenyPromoteId() {
        return this.denyPromoteId;
    }

    @NotNull
    public final SettingType getOwner() {
        return this.owner;
    }

    @Nullable
    public final String[] getPermission() {
        return this.permission;
    }

    public final boolean getShow() {
        return this.show;
    }

    @Nullable
    public final Integer getSubTitleRes() {
        return this.subTitleRes;
    }

    @Nullable
    public final Integer getTitleRes() {
        return this.titleRes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public int hashCode() {
        Integer num = this.titleRes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.subTitleRes;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z = this.show;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        String[] strArr = this.permission;
        int iHashCode3 = (((i + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31) + this.owner.hashCode()) * 31;
        Integer num3 = this.denyPromoteId;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setDenyPromoteId(@Nullable Integer num) {
        this.denyPromoteId = num;
    }

    public final void setOwner(@NotNull SettingType settingType) {
        this.owner = settingType;
    }

    public final void setPermission(@Nullable String[] strArr) {
        this.permission = strArr;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setSubTitleRes(@Nullable Integer num) {
        this.subTitleRes = num;
    }

    public final void setTitleRes(@Nullable Integer num) {
        this.titleRes = num;
    }

    @NotNull
    public String toString() {
        return "ShowAuthInfo(titleRes=" + this.titleRes + ", subTitleRes=" + this.subTitleRes + ", show=" + this.show + ", permission=" + Arrays.toString(this.permission) + ", owner=" + this.owner + ", denyPromoteId=" + this.denyPromoteId + ")";
    }

    public /* synthetic */ ShowAuthInfo(Integer num, Integer num2, boolean z, String[] strArr, SettingType settingType, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : num2, z, strArr, (i & 16) != 0 ? SettingType.None : settingType, (i & 32) != 0 ? null : num3);
    }

    public /* synthetic */ ShowAuthInfo(Integer num, Integer num2, boolean z, String str, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : num2, z, str, (i & 16) != 0 ? null : num3);
    }

    public ShowAuthInfo(@StringRes @Nullable Integer num, @StringRes @Nullable Integer num2, boolean z, @NotNull String str, @StringRes @Nullable Integer num3) {
        this(num, num2, z, new String[]{str}, null, num3, 16, null);
    }
}
