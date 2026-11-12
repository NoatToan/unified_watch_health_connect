package com.facebook.gamingservices;

import android.media.Image;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.x.d;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.DateFormatter;
import com.facebook.gamingservices.internal.TournamentScoreType;
import com.facebook.gamingservices.internal.TournamentSortOrder;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u000210B\u0011\b\u0012\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\u0011\b\u0010\u0012\u0006\u0010.\u001a\u00020\u0004¢\u0006\u0004\b,\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u0004\u0018\u00010!8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\r¨\u00062"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig;", "Lcom/facebook/share/model/ShareModel;", "", "describeContents", "Landroid/os/Parcel;", Argument.OUT, DataCacher.j, "", "writeToParcel", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "b", "Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "getSortOrder", "()Lcom/facebook/gamingservices/internal/TournamentSortOrder;", SDKConstants.PARAM_SORT_ORDER, "Lcom/facebook/gamingservices/internal/TournamentScoreType;", "c", "Lcom/facebook/gamingservices/internal/TournamentScoreType;", "getScoreType", "()Lcom/facebook/gamingservices/internal/TournamentScoreType;", "scoreType", "Ljava/time/Instant;", GoogleApiAvailabilityLight.a, "Ljava/time/Instant;", "getEndTime", "()Ljava/time/Instant;", "endTime", "Landroid/media/Image;", "e", "Landroid/media/Image;", "getImage", "()Landroid/media/Image;", "image", "f", "getPayload", "payload", "Lcom/facebook/gamingservices/TournamentConfig$Builder;", "builder", "<init>", "(Lcom/facebook/gamingservices/TournamentConfig$Builder;)V", Argument.IN, "(Landroid/os/Parcel;)V", "CREATOR", ShareStoryContent.Builder.k, "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentConfig implements ShareModel {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final TournamentSortOrder sortOrder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final TournamentScoreType scoreType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Instant endTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Image image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String payload;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 ¨\u0006>"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/gamingservices/TournamentConfig;", "", "title", "setTournamentTitle", "Lcom/facebook/gamingservices/internal/TournamentSortOrder;", SDKConstants.PARAM_SORT_ORDER, "setTournamentSortOrder", "Lcom/facebook/gamingservices/internal/TournamentScoreType;", "scoreType", "setTournamentScoreType", "Ljava/time/Instant;", "endTime", "setTournamentEndTime", "Landroid/media/Image;", "image", "setTournamentImage", "payload", "setTournamentPayload", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/os/Parcel;", "parcel", "readFrom$facebook_gamingservices_release", "(Landroid/os/Parcel;)Lcom/facebook/gamingservices/TournamentConfig$Builder;", "readFrom", "model", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "b", "Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "getSortOrder", "()Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "setSortOrder", "(Lcom/facebook/gamingservices/internal/TournamentSortOrder;)V", "c", "Lcom/facebook/gamingservices/internal/TournamentScoreType;", "getScoreType", "()Lcom/facebook/gamingservices/internal/TournamentScoreType;", "setScoreType", "(Lcom/facebook/gamingservices/internal/TournamentScoreType;)V", GoogleApiAvailabilityLight.a, "Ljava/time/Instant;", "getEndTime", "()Ljava/time/Instant;", "setEndTime", "(Ljava/time/Instant;)V", "e", "Landroid/media/Image;", "getImage", "()Landroid/media/Image;", "setImage", "(Landroid/media/Image;)V", "f", "getPayload", "setPayload", "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder implements ShareModelBuilder<TournamentConfig, Builder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private TournamentSortOrder sortOrder;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private TournamentScoreType scoreType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private Instant endTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private Image image;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private String payload;

        @Nullable
        public final Instant getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final Image getImage() {
            return this.image;
        }

        @Nullable
        public final String getPayload() {
            return this.payload;
        }

        @Nullable
        public final TournamentScoreType getScoreType() {
            return this.scoreType;
        }

        @Nullable
        public final TournamentSortOrder getSortOrder() {
            return this.sortOrder;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final Builder readFrom$facebook_gamingservices_release(@NotNull Parcel parcel) {
            return readFrom((TournamentConfig) parcel.readParcelable(TournamentConfig.class.getClassLoader()));
        }

        public final void setEndTime(@Nullable Instant instant) {
            this.endTime = instant;
        }

        public final void setImage(@Nullable Image image) {
            this.image = image;
        }

        public final void setPayload(@Nullable String str) {
            this.payload = str;
        }

        public final void setScoreType(@Nullable TournamentScoreType tournamentScoreType) {
            this.scoreType = tournamentScoreType;
        }

        public final void setSortOrder(@Nullable TournamentSortOrder tournamentSortOrder) {
            this.sortOrder = tournamentSortOrder;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public final Builder setTournamentEndTime(@NotNull Instant endTime) {
            this.endTime = endTime;
            return this;
        }

        @NotNull
        public final Builder setTournamentImage(@Nullable Image image) {
            this.image = image;
            return this;
        }

        @NotNull
        public final Builder setTournamentPayload(@Nullable String payload) {
            this.payload = payload;
            return this;
        }

        @NotNull
        public final Builder setTournamentScoreType(@NotNull TournamentScoreType scoreType) {
            this.scoreType = scoreType;
            return this;
        }

        @NotNull
        public final Builder setTournamentSortOrder(@NotNull TournamentSortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        @NotNull
        public final Builder setTournamentTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public TournamentConfig build() {
            return new TournamentConfig(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @Nullable
        public Builder readFrom(@Nullable TournamentConfig model) {
            if (model == null) {
                return this;
            }
            TournamentSortOrder sortOrder = model.getSortOrder();
            if (sortOrder != null) {
                setTournamentSortOrder(sortOrder);
            }
            TournamentScoreType scoreType = model.getScoreType();
            if (scoreType != null) {
                setTournamentScoreType(scoreType);
            }
            Instant endTime = model.getEndTime();
            if (endTime != null) {
                setTournamentEndTime(endTime);
            }
            String title = model.getTitle();
            if (title != null) {
                setTournamentTitle(title);
            }
            setTournamentPayload(model.getPayload());
            return this;
        }
    }

    /* JADX INFO: renamed from: com.facebook.gamingservices.TournamentConfig$CREATOR, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/facebook/gamingservices/TournamentConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/gamingservices/TournamentConfig;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/facebook/gamingservices/TournamentConfig;", "<init>", "()V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements Parcelable.Creator<TournamentConfig> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public TournamentConfig createFromParcel(@NotNull Parcel parcel) {
            return new TournamentConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public TournamentConfig[] newArray(int size) {
            return new TournamentConfig[size];
        }
    }

    public /* synthetic */ TournamentConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Instant getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Image getImage() {
        return this.image;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final TournamentScoreType getScoreType() {
        return this.scoreType;
    }

    @Nullable
    public final TournamentSortOrder getSortOrder() {
        return this.sortOrder;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        out.writeString(String.valueOf(this.sortOrder));
        out.writeString(String.valueOf(this.scoreType));
        out.writeString(String.valueOf(this.endTime));
        out.writeString(this.title);
        out.writeString(this.payload);
    }

    private TournamentConfig(Builder builder) {
        this.title = builder.getTitle();
        this.sortOrder = builder.getSortOrder();
        this.scoreType = builder.getScoreType();
        this.endTime = builder.getEndTime();
        this.image = builder.getImage();
        this.payload = builder.getPayload();
    }

    public TournamentConfig(@NotNull Parcel parcel) {
        TournamentSortOrder tournamentSortOrder;
        TournamentScoreType tournamentScoreType;
        this.title = parcel.readString();
        TournamentSortOrder[] tournamentSortOrderArrValues = TournamentSortOrder.values();
        int length = tournamentSortOrderArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                tournamentSortOrder = null;
                break;
            }
            tournamentSortOrder = tournamentSortOrderArrValues[i2];
            if (Intrinsics.areEqual(tournamentSortOrder.name(), parcel.readString())) {
                break;
            } else {
                i2++;
            }
        }
        this.sortOrder = tournamentSortOrder;
        TournamentScoreType[] tournamentScoreTypeArrValues = TournamentScoreType.values();
        int length2 = tournamentScoreTypeArrValues.length;
        while (true) {
            if (i >= length2) {
                tournamentScoreType = null;
                break;
            }
            tournamentScoreType = tournamentScoreTypeArrValues[i];
            if (Intrinsics.areEqual(tournamentScoreType.name(), parcel.readString())) {
                break;
            } else {
                i++;
            }
        }
        this.scoreType = tournamentScoreType;
        this.endTime = Build.VERSION.SDK_INT >= 26 ? Instant.from(DateFormatter.INSTANCE.format$facebook_gamingservices_release(parcel.readString())) : null;
        this.payload = parcel.readString();
        this.image = null;
    }
}
