package com.facebook.gamingservices;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.x.d;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 $2\u00020\u0001:\u0002%$B/\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b \u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001c\u0010\u000e\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\n\u0010\u001e¨\u0006&"}, d2 = {"Lcom/facebook/gamingservices/Tournament;", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", Argument.OUT, DataCacher.j, "", "writeToParcel", "", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "b", "getTitle", "title", "c", "getPayload", "payload", GoogleApiAvailabilityLight.a, "getEndTime$facebook_gamingservices_release", "setEndTime$facebook_gamingservices_release", "(Ljava/lang/String;)V", "endTime", "Ljava/time/ZonedDateTime;", "newValue", "getExpiration", "()Ljava/time/ZonedDateTime;", "(Ljava/time/ZonedDateTime;)V", Configs.Params.EXPIRATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", ShareStoryContent.Builder.k, "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class Tournament implements ShareModel {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("id")
    @NotNull
    private final String identifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(SDKConstants.PARAM_TOURNAMENTS_TITLE)
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD)
    @Nullable
    private final String payload;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("tournament_end_time")
    @Nullable
    private String endTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lcom/facebook/gamingservices/Tournament$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/gamingservices/Tournament;", "", "identifier", "Ljava/time/ZonedDateTime;", Configs.Params.EXPIRATION, "title", "payload", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "tournament", "readFrom", "component1", "component2", "component3", "component4", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getEndTime", "()Ljava/lang/String;", "setEndTime", "(Ljava/lang/String;)V", "endTime", "b", "getIdentifier", "setIdentifier", "c", "Ljava/time/ZonedDateTime;", "getExpiration", "()Ljava/time/ZonedDateTime;", "setExpiration", "(Ljava/time/ZonedDateTime;)V", GoogleApiAvailabilityLight.a, "getTitle", d.o, "e", "getPayload", "setPayload", "<init>", "(Ljava/lang/String;Ljava/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;)V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Builder implements ShareModelBuilder<Tournament, Builder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private String endTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private String identifier;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @Nullable
        private ZonedDateTime expiration;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        private String title;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        private String payload;

        public Builder(@NotNull String str, @Nullable ZonedDateTime zonedDateTime, @Nullable String str2, @Nullable String str3) {
            this.identifier = str;
            this.expiration = zonedDateTime;
            this.title = str2;
            this.payload = str3;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = builder.identifier;
            }
            if ((i & 2) != 0) {
                zonedDateTime = builder.expiration;
            }
            if ((i & 4) != 0) {
                str2 = builder.title;
            }
            if ((i & 8) != 0) {
                str3 = builder.payload;
            }
            return builder.copy(str, zonedDateTime, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ZonedDateTime getExpiration() {
            return this.expiration;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        @NotNull
        public final Builder copy(@NotNull String identifier, @Nullable ZonedDateTime expiration, @Nullable String title, @Nullable String payload) {
            return new Builder(identifier, expiration, title, payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.identifier, builder.identifier) && Intrinsics.areEqual(this.expiration, builder.expiration) && Intrinsics.areEqual(this.title, builder.title) && Intrinsics.areEqual(this.payload, builder.payload);
        }

        @NotNull
        public final Builder expiration(@Nullable ZonedDateTime expiration) {
            this.expiration = expiration;
            if (Build.VERSION.SDK_INT >= 26 && expiration != null) {
                this.endTime = expiration.format(DateTimeFormatter.ISO_DATE_TIME);
            }
            return this;
        }

        @Nullable
        public final String getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final ZonedDateTime getExpiration() {
            return this.expiration;
        }

        @NotNull
        public final String getIdentifier() {
            return this.identifier;
        }

        @Nullable
        public final String getPayload() {
            return this.payload;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.identifier;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            ZonedDateTime zonedDateTime = this.expiration;
            int iHashCode2 = (iHashCode + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31;
            String str2 = this.title;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.payload;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public final Builder identifier(@NotNull String identifier) {
            this.identifier = identifier;
            return this;
        }

        @NotNull
        public final Builder payload(@Nullable String payload) {
            this.payload = payload;
            return this;
        }

        public final void setEndTime(@Nullable String str) {
            this.endTime = str;
        }

        public final void setExpiration(@Nullable ZonedDateTime zonedDateTime) {
            this.expiration = zonedDateTime;
        }

        public final void setIdentifier(@NotNull String str) {
            this.identifier = str;
        }

        public final void setPayload(@Nullable String str) {
            this.payload = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public final Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(identifier=" + this.identifier + ", expiration=" + this.expiration + ", title=" + this.title + ", payload=" + this.payload + ")";
        }

        public /* synthetic */ Builder(String str, ZonedDateTime zonedDateTime, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : zonedDateTime, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public Tournament build() {
            return new Tournament(this.identifier, this.endTime, this.title, this.payload);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable Tournament tournament) {
            Builder builderPayload;
            return (tournament == null || (builderPayload = identifier(tournament.getIdentifier()).expiration(tournament.getExpiration()).title(tournament.getTitle()).payload(tournament.getPayload())) == null) ? this : builderPayload;
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.Tournament$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/facebook/gamingservices/Tournament$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/gamingservices/Tournament;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/facebook/gamingservices/Tournament;", "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<Tournament> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Tournament createFromParcel(@NotNull Parcel parcel) {
            return new Tournament(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Tournament[] newArray(int size) {
            return new Tournament[size];
        }
    }

    public Tournament(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.identifier = str;
        this.endTime = str2;
        this.title = str3;
        this.payload = str4;
        a(DateFormatter.INSTANCE.format$facebook_gamingservices_release(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ZonedDateTime zonedDateTime) {
        if (Build.VERSION.SDK_INT < 26 || zonedDateTime == null) {
            return;
        }
        this.endTime = zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        a(zonedDateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: getEndTime$facebook_gamingservices_release, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final ZonedDateTime getExpiration() {
        return DateFormatter.INSTANCE.format$facebook_gamingservices_release(this.endTime);
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setEndTime$facebook_gamingservices_release(@Nullable String str) {
        this.endTime = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        out.writeString(this.identifier);
        out.writeString(this.endTime);
        out.writeString(this.title);
        out.writeString(this.payload);
    }

    public Tournament(@NotNull Parcel parcel) {
        this(parcel.toString(), parcel.toString(), parcel.toString(), parcel.toString());
    }
}
