package com.huami.thirdparty.webauth;

import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B?\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006'"}, d2 = {"Lcom/huami/thirdparty/webauth/Param;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "clientId", "uid", "countryCode", "region", "name", "title", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "b", "getUid", "c", "getCountryCode", GoogleApiAvailabilityLight.a, "getRegion", "e", "getName", "f", "getTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", ShareStoryContent.Builder.k, "webauth_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class Param {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String clientId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String uid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String region;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huami/thirdparty/webauth/Param$Builder;", "", "", "clientId", "uid", "countryCode", "region", "title", "name", "Lcom/huami/thirdparty/webauth/Param;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Ljava/lang/String;", "b", "c", GoogleApiAvailabilityLight.a, "e", "f", "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private String clientId = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private String uid = "";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private String countryCode = "";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private String region = "";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private String name = "";

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private String title = "";

        @NotNull
        public final Param build() {
            return new Param(this.clientId, this.uid, this.countryCode, this.region, this.name, this.title);
        }

        @NotNull
        public final Builder clientId(@NotNull String clientId) {
            this.clientId = clientId;
            return this;
        }

        @NotNull
        public final Builder countryCode(@NotNull String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String name) {
            this.name = name;
            return this;
        }

        @NotNull
        public final Builder region(@NotNull String region) {
            this.region = region;
            return this;
        }

        @NotNull
        public final Builder title(@NotNull String title) {
            this.title = title;
            return this;
        }

        @NotNull
        public final Builder uid(@NotNull String uid) {
            this.uid = uid;
            return this;
        }
    }

    public Param(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        this.clientId = str;
        this.uid = str2;
        this.countryCode = str3;
        this.region = str4;
        this.name = str5;
        this.title = str6;
    }

    public static /* synthetic */ Param copy$default(Param param, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = param.clientId;
        }
        if ((i & 2) != 0) {
            str2 = param.uid;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = param.countryCode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = param.region;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = param.name;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = param.title;
        }
        return param.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Param copy(@NotNull String clientId, @NotNull String uid, @NotNull String countryCode, @NotNull String region, @NotNull String name, @NotNull String title) {
        return new Param(clientId, uid, countryCode, region, name, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Param)) {
            return false;
        }
        Param param = (Param) other;
        return Intrinsics.areEqual(this.clientId, param.clientId) && Intrinsics.areEqual(this.uid, param.uid) && Intrinsics.areEqual(this.countryCode, param.countryCode) && Intrinsics.areEqual(this.region, param.region) && Intrinsics.areEqual(this.name, param.name) && Intrinsics.areEqual(this.title, param.title);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.clientId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.region;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.name;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.title;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Param(clientId=" + this.clientId + ", uid=" + this.uid + ", countryCode=" + this.countryCode + ", region=" + this.region + ", name=" + this.name + ", title=" + this.title + ")";
    }

    public /* synthetic */ Param(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
