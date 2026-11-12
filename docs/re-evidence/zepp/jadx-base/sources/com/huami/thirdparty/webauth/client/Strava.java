package com.huami.thirdparty.webauth.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.thirdparty.webauth.ExtensionKt;
import com.huami.thirdparty.webauth.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huami/thirdparty/webauth/client/Strava;", "Lcom/huami/thirdparty/webauth/client/AuthClient;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getDefaultTitle", "getUrl", "getUserUrl", "getName", "getHost", "getWebsite", "", "sourceParams", "redirectParamsEncode", "redirectParams", "b", "Ljava/lang/String;", "NAME", "c", HTTP.HOST, GoogleApiAvailabilityLight.a, DTransferConstants.URL, "e", "USER_URL", "<init>", "()V", "User", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class Strava extends AuthClient {

    @NotNull
    public static final Strava INSTANCE = new Strava();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String NAME = "strava";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String HOST = "https://www.strava.com/";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String URL = "oauth/authorize";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String USER_URL = "https://www.strava.com/api/v3/athlete";

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u001c\u0010\t\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u000b\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\f\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e¨\u0006'"}, d2 = {"Lcom/huami/thirdparty/webauth/client/Strava$User;", "Lcom/huami/thirdparty/webauth/client/AuthUser;", "Landroid/os/Parcelable;", "", "getDisplayName", "component1", "component2", "component3", "component4", "id", "userName", "firstName", "lastName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getUserName", "c", "getFirstName", GoogleApiAvailabilityLight.a, "getLastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class User implements AuthUser, Parcelable {
        public static final Parcelable.Creator<User> CREATOR = new Creator();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("username")
        @NotNull
        private final String userName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @SerializedName("firstname")
        @NotNull
        private final String firstName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @SerializedName("lastname")
        @NotNull
        private final String lastName;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
        public static class Creator implements Parcelable.Creator<User> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final User createFromParcel(@NotNull Parcel parcel) {
                return new User(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final User[] newArray(int i) {
                return new User[i];
            }
        }

        public User(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.id = str;
            this.userName = str2;
            this.firstName = str3;
            this.lastName = str4;
        }

        public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = user.id;
            }
            if ((i & 2) != 0) {
                str2 = user.userName;
            }
            if ((i & 4) != 0) {
                str3 = user.firstName;
            }
            if ((i & 8) != 0) {
                str4 = user.lastName;
            }
            return user.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        @NotNull
        public final User copy(@NotNull String id, @NotNull String userName, @NotNull String firstName, @NotNull String lastName) {
            return new User(id, userName, firstName, lastName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.userName, user.userName) && Intrinsics.areEqual(this.firstName, user.firstName) && Intrinsics.areEqual(this.lastName, user.lastName);
        }

        @Override // com.huami.thirdparty.webauth.client.AuthUser
        @NotNull
        public String getDisplayName() {
            return this.firstName + StringUtil.SPACE + this.lastName;
        }

        @NotNull
        public final String getFirstName() {
            return this.firstName;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getLastName() {
            return this.lastName;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.userName;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.firstName;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.lastName;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "User(id=" + this.id + ", userName=" + this.userName + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.userName);
            parcel.writeString(this.firstName);
            parcel.writeString(this.lastName);
        }
    }

    private Strava() {
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getDefaultTitle(@NotNull Context context) {
        return context.getResources().getString(R.string.strava);
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getHost() {
        return HOST;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getName() {
        return getParam().getName().length() == 0 ? "strava" : getParam().getName();
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getUrl() {
        return "oauth/authorize";
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getUserUrl() {
        return USER_URL;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getWebsite() {
        return HOST;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> redirectParams() {
        return r.hashMapOf(TuplesKt.to("state", ExtensionKt.jsonObject(TuplesKt.to("userId", getParam().getUid()))));
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> redirectParamsEncode() {
        return r.hashMapOf(TuplesKt.to("name", getName()), TuplesKt.to("countryCode", getParam().getCountryCode()), TuplesKt.to("region", getParam().getRegion()));
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> sourceParams() {
        return r.hashMapOf(TuplesKt.to("client_id", getParam().getClientId()), TuplesKt.to(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code"), TuplesKt.to("scope", "activity:write"), TuplesKt.to("approval_prompt", "auto"));
    }
}
