package com.garmin.android.apps.connectmobile.leaderboard.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/n;", "", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38238g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f38243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Date f38244f;

    public final String toString() {
        String str = this.f38239a;
        String str2 = this.f38240b;
        String str3 = this.f38241c;
        String str4 = this.f38242d;
        Date date = this.f38243e;
        Date date2 = this.f38244f;
        StringBuilder sbI = p6.b.i("AutoChallengeUserOptDTO [userOptionalFeaturePK=", str, ", userProfilePK=", str2, ", optionalFeatureType=");
        sn.a.t(sbI, str3, ", userOptionType=", str4, ", createDate=");
        sbI.append(date);
        sbI.append(", updateDate=");
        sbI.append(date2);
        sbI.append("]");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/n$a;", "", "<init>", "()V", "", "USER_OPTIONAL_FEATURE_PK", "Ljava/lang/String;", "USER_PROFILE_PK", "OPTIONAL_FETURE_TYPE", "USER_OPTION_TYPE", "CREATE_DATE", "UPDATE_DATE", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static n a(JSONObject jSONObject) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            n nVar = new n();
            if (!jSONObject.isNull("userOptionalFeaturePK")) {
                nVar.f38239a = jSONObject.getString("userOptionalFeaturePK");
            }
            if (!jSONObject.isNull("userProfilePK")) {
                nVar.f38240b = jSONObject.getString("userProfilePK");
            }
            if (!jSONObject.isNull("optionalFeatureType")) {
                nVar.f38241c = jSONObject.getString("optionalFeatureType");
            }
            if (!jSONObject.isNull("userOptionType")) {
                nVar.f38242d = jSONObject.getString("userOptionType");
            }
            if (!jSONObject.isNull("createDate")) {
                nVar.f38243e = simpleDateFormat.parse(jSONObject.getString("createDate"));
            }
            if (!jSONObject.isNull("updateDate")) {
                nVar.f38244f = simpleDateFormat.parse(jSONObject.getString("updateDate"));
            }
            return nVar;
        }

        private a() {
        }
    }
}
