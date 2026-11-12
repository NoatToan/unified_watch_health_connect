package com.huami.nfc.web.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0001=BS\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b;\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001b\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001f\u001a\u00020\rHÖ\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\rHÖ\u0001R\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010\bR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u000f¨\u0006>"}, d2 = {"Lcom/huami/nfc/web/entity/ProtocolEntity;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Integer;", "url", "id", "needConfirm", "serviceName", "title", SecondaryScreen.KEY_UPDATED, "needPhone", "captchaVerifyType", "copy", "(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/huami/nfc/web/entity/ProtocolEntity;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", "J", "getId", "()J", "c", "Ljava/lang/Boolean;", "getNeedConfirm", GoogleApiAvailabilityLight.a, "getServiceName", "e", "getTitle", "f", "getUpdated", "g", "getNeedPhone", "h", "Ljava/lang/Integer;", "getCaptchaVerifyType", "<init>", "(Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Companion", "web_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProtocolEntity implements Parcelable {

    @NotNull
    public static final String ACTION_TYPE_ISSUE = "ISSUE";

    @NotNull
    public static final String ACTION_TYPE_RECHARGE = "RECHARGE";

    @NotNull
    public static final String ACTION_TYPE_UPDATE = "UPDATE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("content")
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("id")
    private final long id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("needConfirm")
    @Nullable
    private final Boolean needConfirm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("serviceName")
    @Nullable
    private final String serviceName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName(SecondaryScreen.KEY_UPDATED)
    @Nullable
    private final Boolean updated;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("needPhone")
    @Nullable
    private final Boolean needPhone;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("captchaVerifyType")
    @Nullable
    private final Integer captchaVerifyType;

    @NotNull
    public static final Parcelable.Creator<ProtocolEntity> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<ProtocolEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProtocolEntity createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProtocolEntity(string, j, boolValueOf, string2, string3, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProtocolEntity[] newArray(int i) {
            return new ProtocolEntity[i];
        }
    }

    public ProtocolEntity(@NotNull String str, long j, @Nullable Boolean bool, @Nullable String str2, @NotNull String str3, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num) {
        this.url = str;
        this.id = j;
        this.needConfirm = bool;
        this.serviceName = str2;
        this.title = str3;
        this.updated = bool2;
        this.needPhone = bool3;
        this.captchaVerifyType = num;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getUpdated() {
        return this.updated;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getNeedPhone() {
        return this.needPhone;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getCaptchaVerifyType() {
        return this.captchaVerifyType;
    }

    @NotNull
    public final ProtocolEntity copy(@NotNull String url, long id, @Nullable Boolean needConfirm, @Nullable String serviceName, @NotNull String title, @Nullable Boolean updated, @Nullable Boolean needPhone, @Nullable Integer captchaVerifyType) {
        return new ProtocolEntity(url, id, needConfirm, serviceName, title, updated, needPhone, captchaVerifyType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolEntity)) {
            return false;
        }
        ProtocolEntity protocolEntity = (ProtocolEntity) other;
        return Intrinsics.areEqual(this.url, protocolEntity.url) && this.id == protocolEntity.id && Intrinsics.areEqual(this.needConfirm, protocolEntity.needConfirm) && Intrinsics.areEqual(this.serviceName, protocolEntity.serviceName) && Intrinsics.areEqual(this.title, protocolEntity.title) && Intrinsics.areEqual(this.updated, protocolEntity.updated) && Intrinsics.areEqual(this.needPhone, protocolEntity.needPhone) && Intrinsics.areEqual(this.captchaVerifyType, protocolEntity.captchaVerifyType);
    }

    @Nullable
    public final Integer getCaptchaVerifyType() {
        return this.captchaVerifyType;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    @Nullable
    public final Boolean getNeedPhone() {
        return this.needPhone;
    }

    @Nullable
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Boolean getUpdated() {
        return this.updated;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + b.a(this.id)) * 31;
        Boolean bool = this.needConfirm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.serviceName;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31;
        Boolean bool2 = this.updated;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.needPhone;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.captchaVerifyType;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProtocolEntity(url=" + this.url + ", id=" + this.id + ", needConfirm=" + this.needConfirm + ", serviceName=" + ((Object) this.serviceName) + ", title=" + this.title + ", updated=" + this.updated + ", needPhone=" + this.needPhone + ", captchaVerifyType=" + this.captchaVerifyType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.url);
        parcel.writeLong(this.id);
        Boolean bool = this.needConfirm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.serviceName);
        parcel.writeString(this.title);
        Boolean bool2 = this.updated;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.needPhone;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Integer num = this.captchaVerifyType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public /* synthetic */ ProtocolEntity(String str, long j, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, j, bool, str2, str3, bool2, bool3, num);
    }
}
