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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huami/thirdparty/webauth/client/MapMyFitness;", "Lcom/huami/thirdparty/webauth/client/AuthClient;", "", "getUrl", "getName", "getHost", "getWebsite", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getDefaultTitle", "getRedirectUrl", "", "sourceParams", "redirectParamsEncode", "b", "Ljava/lang/String;", "WEBSITE", "c", "NAME", GoogleApiAvailabilityLight.a, HTTP.HOST, "e", DTransferConstants.URL, "<init>", "()V", "User", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class MapMyFitness extends AuthClient {

    @NotNull
    public static final MapMyFitness INSTANCE = new MapMyFitness();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String WEBSITE = "https://www.mapmyfitness.com";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String NAME = "mapmyfitness";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String HOST = "https://www.mapmyfitness.com/";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String URL = "v7.1/oauth2/authorize";

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rHÖ\u0001R\u001c\u0010\b\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\n\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006#"}, d2 = {"Lcom/huami/thirdparty/webauth/client/MapMyFitness$User;", "Lcom/huami/thirdparty/webauth/client/AuthUser;", "Landroid/os/Parcelable;", "", "getDisplayName", "component1", "component2", "component3", "userId", "firstName", "lastName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getFirstName", "c", "getLastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "webauth_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class User implements AuthUser, Parcelable {
        public static final Parcelable.Creator<User> CREATOR = new Creator();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @SerializedName("user_id")
        @NotNull
        private final String userId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @SerializedName("firstname")
        @NotNull
        private final String firstName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @SerializedName("lastname")
        @NotNull
        private final String lastName;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
        public static class Creator implements Parcelable.Creator<User> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final User createFromParcel(@NotNull Parcel parcel) {
                return new User(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final User[] newArray(int i) {
                return new User[i];
            }
        }

        public User(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.userId = str;
            this.firstName = str2;
            this.lastName = str3;
        }

        public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = user.userId;
            }
            if ((i & 2) != 0) {
                str2 = user.firstName;
            }
            if ((i & 4) != 0) {
                str3 = user.lastName;
            }
            return user.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        @NotNull
        public final User copy(@NotNull String userId, @NotNull String firstName, @NotNull String lastName) {
            return new User(userId, firstName, lastName);
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
            return Intrinsics.areEqual(this.userId, user.userId) && Intrinsics.areEqual(this.firstName, user.firstName) && Intrinsics.areEqual(this.lastName, user.lastName);
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
        public final String getLastName() {
            return this.lastName;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.userId;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.firstName;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.lastName;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "User(userId=" + this.userId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            parcel.writeString(this.userId);
            parcel.writeString(this.firstName);
            parcel.writeString(this.lastName);
        }
    }

    private MapMyFitness() {
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getDefaultTitle(@NotNull Context context) {
        return context.getResources().getString(R.string.mapmyfitness);
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getHost() {
        return HOST;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getName() {
        return getParam().getName().length() == 0 ? NAME : getParam().getName();
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getRedirectUrl() {
        return '/' + getName();
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getUrl() {
        return URL;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public String getWebsite() {
        return WEBSITE;
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> redirectParamsEncode() {
        return r.emptyMap();
    }

    @Override // com.huami.thirdparty.webauth.client.AuthClient
    @NotNull
    public Map<String, String> sourceParams() {
        return r.hashMapOf(TuplesKt.to("client_id", getParam().getClientId()), TuplesKt.to(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, "code"), TuplesKt.to("state", ExtensionKt.jsonObject(TuplesKt.to("userId", getParam().getUid()))));
    }
}
