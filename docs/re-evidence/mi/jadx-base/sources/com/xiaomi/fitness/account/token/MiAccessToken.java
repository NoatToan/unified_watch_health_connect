package com.xiaomi.fitness.account.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.passport.ui.onetrack.TrackConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u000e\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\u0003H\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003JM\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u00103\u001a\u000204J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000204HÖ\u0001J\u0016\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u000204R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\bX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0014\u0010&\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001c¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/account/token/MiAccessToken;", "Lcom/xiaomi/fitness/account/token/AccessToken;", "userId", "", "cUserId", "serviceToken", "security", "timeDiff", "", "updated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getCUserId", "setCUserId", "getServiceToken", "setServiceToken", "getSecurity", "setSecurity", "getTimeDiff", "()J", "setTimeDiff", "(J)V", "getUpdated", "()Z", "setUpdated", "(Z)V", Constants.KEY_EXPIRED_TIME, "getExpireTime$annotations", "()V", "isLogin", TrackConstants.LOGOUT, "", CervicalMucusRecord.Appearance.CLEAR, "isExpires", "setExpireTime", "readFromParcel", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "Landroid/os/Parcel;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "writeToParcel", "dest", "flags", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MiAccessToken implements AccessToken {

    @NotNull
    public static final Parcelable.Creator<MiAccessToken> CREATOR = new Creator();

    @Nullable
    private String cUserId;
    private long expireTime;

    @Nullable
    private String security;

    @Nullable
    private String serviceToken;
    private long timeDiff;
    private boolean updated;

    @Nullable
    private String userId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiAccessToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MiAccessToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MiAccessToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MiAccessToken[] newArray(int i) {
            return new MiAccessToken[i];
        }
    }

    public MiAccessToken() {
        this(null, null, null, null, 0L, false, 63, null);
    }

    public static /* synthetic */ MiAccessToken copy$default(MiAccessToken miAccessToken, String str, String str2, String str3, String str4, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = miAccessToken.userId;
        }
        if ((i & 2) != 0) {
            str2 = miAccessToken.cUserId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = miAccessToken.serviceToken;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = miAccessToken.security;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = miAccessToken.timeDiff;
        }
        long j2 = j;
        if ((i & 32) != 0) {
            z = miAccessToken.updated;
        }
        return miAccessToken.copy(str, str5, str6, str7, j2, z);
    }

    private static /* synthetic */ void getExpireTime$annotations() {
    }

    @Override // com.xiaomi.fitness.account.token.AccessToken
    public void clear() {
        logout();
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCUserId() {
        return this.cUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServiceToken() {
        return this.serviceToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecurity() {
        return this.security;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimeDiff() {
        return this.timeDiff;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUpdated() {
        return this.updated;
    }

    @NotNull
    public final MiAccessToken copy(@Nullable String userId, @Nullable String cUserId, @Nullable String serviceToken, @Nullable String security, long timeDiff, boolean updated) {
        return new MiAccessToken(userId, cUserId, serviceToken, security, timeDiff, updated);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiAccessToken)) {
            return false;
        }
        MiAccessToken miAccessToken = (MiAccessToken) other;
        return Intrinsics.areEqual(this.userId, miAccessToken.userId) && Intrinsics.areEqual(this.cUserId, miAccessToken.cUserId) && Intrinsics.areEqual(this.serviceToken, miAccessToken.serviceToken) && Intrinsics.areEqual(this.security, miAccessToken.security) && this.timeDiff == miAccessToken.timeDiff && this.updated == miAccessToken.updated;
    }

    @Nullable
    public final String getCUserId() {
        return this.cUserId;
    }

    @Nullable
    public final String getSecurity() {
        return this.security;
    }

    @Nullable
    public final String getServiceToken() {
        return this.serviceToken;
    }

    public final long getTimeDiff() {
        return this.timeDiff;
    }

    public final boolean getUpdated() {
        return this.updated;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cUserId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.security;
        return ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.timeDiff)) * 31) + Boolean.hashCode(this.updated);
    }

    @Override // com.xiaomi.fitness.account.token.AccessToken
    public boolean isExpires() {
        return false;
    }

    @Override // com.xiaomi.fitness.account.token.AccessToken
    public boolean isLogin() {
        return (TextUtils.isEmpty(this.serviceToken) || TextUtils.isEmpty(this.userId)) ? false : true;
    }

    @Override // com.xiaomi.fitness.account.token.AccessToken
    public void logout() {
        this.cUserId = null;
        this.userId = null;
        this.serviceToken = null;
        this.updated = false;
    }

    public final void readFromParcel(@NotNull Parcel p) {
        Intrinsics.checkNotNullParameter(p, "p");
        this.userId = p.readString();
        this.cUserId = p.readString();
        this.serviceToken = p.readString();
        this.security = p.readString();
        this.timeDiff = p.readLong();
        this.updated = p.readInt() != 0;
    }

    public final void setCUserId(@Nullable String str) {
        this.cUserId = str;
    }

    public final void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public final void setSecurity(@Nullable String str) {
        this.security = str;
    }

    public final void setServiceToken(@Nullable String str) {
        this.serviceToken = str;
    }

    public final void setTimeDiff(long j) {
        this.timeDiff = j;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "MiAccessToken()";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userId);
        dest.writeString(this.cUserId);
        dest.writeString(this.serviceToken);
        dest.writeString(this.security);
        dest.writeLong(this.timeDiff);
        dest.writeInt(this.updated ? 1 : 0);
    }

    public MiAccessToken(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, boolean z) {
        this.userId = str;
        this.cUserId = str2;
        this.serviceToken = str3;
        this.security = str4;
        this.timeDiff = j;
        this.updated = z;
    }

    public /* synthetic */ MiAccessToken(String str, String str2, String str3, String str4, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? false : z);
    }
}
