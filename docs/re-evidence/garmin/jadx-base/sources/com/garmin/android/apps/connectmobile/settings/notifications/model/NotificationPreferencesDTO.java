package com.garmin.android.apps.connectmobile.settings.notifications.model;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(NotificationPreferencesDTODeserializer.class)
public class NotificationPreferencesDTO extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43628a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43630b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43632c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43634d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43636e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43638f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43640g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43641h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43642i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43643j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43644k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f43646l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43647m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f43648n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43649o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f43650p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f43651q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43652r = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f43653t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f43654v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f43655w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f43656x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f43657y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f43658z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = true;
    public boolean D = true;
    public boolean E = true;
    public boolean F = true;
    public boolean I = true;
    public boolean P = true;
    public boolean T = true;
    public boolean X = true;
    public boolean Y = true;
    public boolean Z = true;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f43645k0 = true;
    public boolean H0 = true;
    public boolean I0 = true;
    public boolean J0 = true;
    public boolean K0 = true;
    public boolean L0 = true;
    public boolean M0 = true;
    public boolean N0 = true;
    public boolean O0 = true;
    public boolean P0 = true;
    public boolean Q0 = true;
    public boolean R0 = true;
    public boolean S0 = true;
    public boolean T0 = true;
    public boolean U0 = true;
    public boolean V0 = true;
    public boolean W0 = true;
    public boolean X0 = true;
    public boolean Y0 = true;
    public boolean Z0 = true;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f43629a1 = true;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f43631b1 = true;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f43633c1 = true;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f43635d1 = true;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f43637e1 = true;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f43639f1 = true;

    public static class NotificationPreferencesDTODeserializer implements JsonDeserializer<NotificationPreferencesDTO>, JsonSerializer<NotificationPreferencesDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final NotificationPreferencesDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                NotificationPreferencesDTO notificationPreferencesDTO = new NotificationPreferencesDTO();
                notificationPreferencesDTO.k(new JSONObject(jsonElement.toString()));
                return notificationPreferencesDTO;
            } catch (Exception e4) {
                i2.g(e4, "NotificationPreferencesDTO");
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(NotificationPreferencesDTO notificationPreferencesDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return (JsonElement) GsonUtil.f47253b.fromJson(notificationPreferencesDTO.C().toString(), JsonElement.class);
            } catch (Exception e4) {
                i2.g(e4, "NotificationPreferencesDTO");
                return null;
            }
        }
    }

    public final JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("allowEmailChallengeComment", this.f43628a);
            jSONObject.put("allowEmailChallengeInvitation", this.f43630b);
            jSONObject.put("allowEmailChallengeReminder", this.f43632c);
            jSONObject.put("allowEmailChallengeResults", this.f43634d);
            jSONObject.put("allowEmailCommentOnActivities", this.f43636e);
            jSONObject.put("allowEmailConnectionConfirmations", this.f43638f);
            jSONObject.put("allowEmailConnectionRequest", this.f43640g);
            jSONObject.put("allowEmailGearMaxDistanceAlerts", this.f43641h);
            jSONObject.put("allowEmailLikeOnPost", this.f43644k);
            jSONObject.put("allowEmailLikeOnPostComment", this.f43646l);
            jSONObject.put("allowEmailGroupCommentOnMyPosts", this.f43642i);
            jSONObject.put("allowEmailGroupCommentOnOtherPosts", this.f43643j);
            jSONObject.put("allowEmailGroupInvitations", this.f43647m);
            jSONObject.put("allowEmailGroupMemberConfirmations", this.f43648n);
            jSONObject.put("allowEmailGroupPost", this.f43649o);
            jSONObject.put("allowEmailLikeOnActivity", this.f43650p);
            jSONObject.put("allowEmailLikeOnActivityComment", this.f43651q);
            jSONObject.put("allowEmailNotification", this.f43652r);
            jSONObject.put("allowEmailReplyToComments", this.f43653t);
            jSONObject.put("allowEmailSegmentComment", this.f43654v);
            jSONObject.put("allowEmailSegmentUpdate", this.f43655w);
            jSONObject.put("allowEmailTaggedOnActivityComment", this.f43656x);
            jSONObject.put("allowEmailWeightScaleInvitation", this.f43657y);
            jSONObject.put("allowEmailWellnessWeeklySummary", this.f43658z);
            jSONObject.put("allowEmailMonthlySummary", this.A);
            jSONObject.put("allowEmailWellnessWeeklySummary", this.B);
            jSONObject.put("allowPushActivityUploads", this.C);
            jSONObject.put("allowPushUserActivityThreadComment", this.E);
            jSONObject.put("allowPushUserActivityComment", this.D);
            jSONObject.put("allowPushChallengeComment", this.I);
            jSONObject.put("allowPushChallengeInvitation", this.P);
            jSONObject.put("allowPushChallengeReminder", this.T);
            jSONObject.put("allowPushChallengeResults", this.X);
            jSONObject.put("allowPushChallengeUpdate", this.Y);
            jSONObject.put("allowPushBadgeReminder", this.Z);
            jSONObject.put("allowPushFollowRequest", this.f43645k0);
            jSONObject.put("allowPushFollowRequestAccepted", this.H0);
            jSONObject.put("allowPushConnectionConfirmation", this.J0);
            jSONObject.put("allowPushConnectionRequest", this.I0);
            jSONObject.put("allowPushLikeOnActivity", this.K0);
            jSONObject.put("allowPushLikeOnActivityComment", this.L0);
            jSONObject.put("allowPushTaggedOnActivityComment", this.O0);
            jSONObject.put("allowPushLiveActivityStart", this.M0);
            jSONObject.put("allowPushBadges", this.F);
            jSONObject.put("allowPushNotification", this.N0);
            jSONObject.put("allowPushAdaptiveTrainingPlan", this.P0);
            jSONObject.put("allowLowLevelBatteryNotification", this.Q0);
            jSONObject.put("allowPushGroupMemberConfirmations", this.R0);
            jSONObject.put("allowPushGroupInvitations", this.S0);
            jSONObject.put("allowPushGroupPost", this.T0);
            jSONObject.put("allowPushGroupCommentOnMyPosts", this.U0);
            jSONObject.put("allowPushGroupCommentOnOtherPosts", this.V0);
            jSONObject.put("allowPushLikeOnPost", this.W0);
            jSONObject.put("allowPushLikeOnPostComment", this.X0);
            jSONObject.put("allowPushGSPSubscriptionAlerts", this.Y0);
            jSONObject.put("allowPushExclusiveDiscount", this.Z0);
            jSONObject.put("allowPushForConsentPermissions", this.f43629a1);
            jSONObject.put("allowEmailForConsentPermissions", this.f43631b1);
            jSONObject.put("allowPushLivetrackContactChanges", this.f43633c1);
            jSONObject.put("allowPushManagedAccountLivetrackContactChanges", this.f43635d1);
            jSONObject.put("allowPushGearMaxUsageAlerts", this.f43637e1);
            jSONObject.put("allowPushPendingActivity", this.f43639f1);
            return jSONObject;
        } catch (JSONException e4) {
            i2.a(a2.SETTINGS, "NotificationPreferencesDTO", "Error while converting to JSON object: " + e4);
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NotificationPreferencesDTO notificationPreferencesDTO = (NotificationPreferencesDTO) obj;
            if (this.f43628a == notificationPreferencesDTO.f43628a && this.f43630b == notificationPreferencesDTO.f43630b && this.f43632c == notificationPreferencesDTO.f43632c && this.f43634d == notificationPreferencesDTO.f43634d && this.f43636e == notificationPreferencesDTO.f43636e && this.f43638f == notificationPreferencesDTO.f43638f && this.f43640g == notificationPreferencesDTO.f43640g && this.f43641h == notificationPreferencesDTO.f43641h && this.f43642i == notificationPreferencesDTO.f43642i && this.f43643j == notificationPreferencesDTO.f43643j && this.f43644k == notificationPreferencesDTO.f43644k && this.f43646l == notificationPreferencesDTO.f43646l && this.f43647m == notificationPreferencesDTO.f43647m && this.f43648n == notificationPreferencesDTO.f43648n && this.f43649o == notificationPreferencesDTO.f43649o && this.f43650p == notificationPreferencesDTO.f43650p && this.f43651q == notificationPreferencesDTO.f43651q && this.f43652r == notificationPreferencesDTO.f43652r && this.f43653t == notificationPreferencesDTO.f43653t && this.f43654v == notificationPreferencesDTO.f43654v && this.f43655w == notificationPreferencesDTO.f43655w && this.f43656x == notificationPreferencesDTO.f43656x && this.f43657y == notificationPreferencesDTO.f43657y && this.f43658z == notificationPreferencesDTO.f43658z && this.B == notificationPreferencesDTO.B && this.A == notificationPreferencesDTO.A && this.C == notificationPreferencesDTO.C && this.D == notificationPreferencesDTO.D && this.E == notificationPreferencesDTO.E && this.F == notificationPreferencesDTO.F && this.I == notificationPreferencesDTO.I && this.P == notificationPreferencesDTO.P && this.T == notificationPreferencesDTO.T && this.X == notificationPreferencesDTO.X && this.Y == notificationPreferencesDTO.Y && this.Z == notificationPreferencesDTO.Z && this.f43645k0 == notificationPreferencesDTO.f43645k0 && this.H0 == notificationPreferencesDTO.H0 && this.J0 == notificationPreferencesDTO.J0 && this.I0 == notificationPreferencesDTO.I0 && this.K0 == notificationPreferencesDTO.K0 && this.L0 == notificationPreferencesDTO.L0 && this.M0 == notificationPreferencesDTO.M0 && this.N0 == notificationPreferencesDTO.N0 && this.O0 == notificationPreferencesDTO.O0 && this.P0 == notificationPreferencesDTO.P0 && this.Q0 == notificationPreferencesDTO.Q0 && this.R0 == notificationPreferencesDTO.R0 && this.S0 == notificationPreferencesDTO.S0 && this.T0 == notificationPreferencesDTO.T0 && this.U0 == notificationPreferencesDTO.U0 && this.V0 == notificationPreferencesDTO.V0 && this.W0 == notificationPreferencesDTO.W0 && this.X0 == notificationPreferencesDTO.X0 && this.Y0 == notificationPreferencesDTO.Y0 && this.Z0 == notificationPreferencesDTO.Z0 && this.f43629a1 == notificationPreferencesDTO.f43629a1 && this.f43633c1 == notificationPreferencesDTO.f43633c1 && this.f43635d1 == notificationPreferencesDTO.f43635d1 && this.f43631b1 == notificationPreferencesDTO.f43631b1 && this.f43637e1 == notificationPreferencesDTO.f43637e1 && this.f43639f1 == notificationPreferencesDTO.f43639f1) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f43628a), Boolean.valueOf(this.f43630b), Boolean.valueOf(this.f43632c), Boolean.valueOf(this.f43634d), Boolean.valueOf(this.f43636e), Boolean.valueOf(this.f43638f), Boolean.valueOf(this.f43640g), Boolean.valueOf(this.f43641h), Boolean.valueOf(this.f43642i), Boolean.valueOf(this.f43643j), Boolean.valueOf(this.f43644k), Boolean.valueOf(this.f43646l), Boolean.valueOf(this.f43647m), Boolean.valueOf(this.f43648n), Boolean.valueOf(this.f43649o), Boolean.valueOf(this.f43650p), Boolean.valueOf(this.f43651q), Boolean.valueOf(this.f43652r), Boolean.valueOf(this.f43653t), Boolean.valueOf(this.f43654v), Boolean.valueOf(this.f43655w), Boolean.valueOf(this.f43656x), Boolean.valueOf(this.f43657y), Boolean.valueOf(this.f43658z), Boolean.valueOf(this.A), Boolean.valueOf(this.B), Boolean.valueOf(this.C), Boolean.valueOf(this.D), Boolean.valueOf(this.E), Boolean.valueOf(this.M0), Boolean.valueOf(this.F), Boolean.valueOf(this.I), Boolean.valueOf(this.P), Boolean.valueOf(this.T), Boolean.valueOf(this.X), Boolean.valueOf(this.Y), Boolean.valueOf(this.Z), Boolean.valueOf(this.f43645k0), Boolean.valueOf(this.H0), Boolean.valueOf(this.J0), Boolean.valueOf(this.I0), Boolean.valueOf(this.K0), Boolean.valueOf(this.L0), Boolean.valueOf(this.N0), Boolean.valueOf(this.O0), Boolean.valueOf(this.P0), Boolean.valueOf(this.Q0), Boolean.valueOf(this.R0), Boolean.valueOf(this.S0), Boolean.valueOf(this.T0), Boolean.valueOf(this.U0), Boolean.valueOf(this.V0), Boolean.valueOf(this.W0), Boolean.valueOf(this.X0), Boolean.valueOf(this.Y0), Boolean.valueOf(this.Z0), Boolean.valueOf(this.f43629a1), Boolean.valueOf(this.f43633c1), Boolean.valueOf(this.f43635d1), Boolean.valueOf(this.f43631b1), Boolean.valueOf(this.f43637e1), Boolean.valueOf(this.f43639f1));
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f43652r = jSONObject.optBoolean("allowEmailNotification", true);
            this.f43658z = jSONObject.optBoolean("allowEmailWellnessWeeklySummary");
            this.f43640g = jSONObject.optBoolean("allowEmailConnectionRequest", true);
            this.f43638f = jSONObject.optBoolean("allowEmailConnectionConfirmations", false);
            this.f43636e = jSONObject.optBoolean("allowEmailCommentOnActivities", false);
            this.f43653t = jSONObject.optBoolean("allowEmailReplyToComments", false);
            this.f43650p = jSONObject.optBoolean("allowEmailLikeOnActivity", false);
            this.f43651q = jSONObject.optBoolean("allowEmailLikeOnActivityComment", false);
            this.f43656x = jSONObject.optBoolean("allowEmailTaggedOnActivityComment", false);
            this.f43657y = jSONObject.optBoolean("allowEmailWeightScaleInvitation", false);
            this.f43630b = jSONObject.optBoolean("allowEmailChallengeInvitation", true);
            this.f43628a = jSONObject.optBoolean("allowEmailChallengeComment", false);
            this.f43632c = jSONObject.optBoolean("allowEmailChallengeReminder", false);
            this.f43634d = jSONObject.optBoolean("allowEmailChallengeResults", true);
            this.f43641h = jSONObject.optBoolean("allowEmailGearMaxDistanceAlerts", false);
            this.f43647m = jSONObject.optBoolean("allowEmailGroupInvitations", false);
            this.f43648n = jSONObject.optBoolean("allowEmailGroupMemberConfirmations", false);
            this.f43649o = jSONObject.optBoolean("allowEmailGroupPost", false);
            boolean zOptBoolean = jSONObject.optBoolean("allowEmailGroupCommentOnMyPosts", false);
            this.f43642i = zOptBoolean;
            this.f43643j = jSONObject.optBoolean("allowEmailGroupCommentOnOtherPosts", zOptBoolean);
            this.f43644k = jSONObject.optBoolean("allowEmailLikeOnPost", false);
            this.f43646l = jSONObject.optBoolean("allowEmailLikeOnPostComment", false);
            this.A = jSONObject.optBoolean("allowEmailMonthlySummary", false);
            this.B = jSONObject.optBoolean("allowEmailWeeklySummary", false);
            this.f43654v = jSONObject.optBoolean("allowEmailSegmentComment", false);
            this.f43655w = jSONObject.optBoolean("allowEmailSegmentUpdate", false);
            this.N0 = jSONObject.optBoolean("allowPushNotification", true);
            this.F = jSONObject.optBoolean("allowPushBadges", true);
            this.f43645k0 = jSONObject.optBoolean("allowPushFollowRequest", true);
            this.H0 = jSONObject.optBoolean("allowPushFollowRequestAccepted", true);
            this.I0 = jSONObject.optBoolean("allowPushConnectionRequest", true);
            this.J0 = jSONObject.optBoolean("allowPushConnectionConfirmation", true);
            this.C = jSONObject.optBoolean("allowPushActivityUploads", true);
            this.E = jSONObject.optBoolean("allowPushUserActivityThreadComment", true);
            this.D = jSONObject.optBoolean("allowPushUserActivityComment", true);
            this.K0 = jSONObject.optBoolean("allowPushLikeOnActivity", true);
            this.L0 = jSONObject.optBoolean("allowPushLikeOnActivityComment", true);
            this.O0 = jSONObject.optBoolean("allowPushTaggedOnActivityComment", true);
            this.M0 = jSONObject.optBoolean("allowPushLiveActivityStart", true);
            this.P = jSONObject.optBoolean("allowPushChallengeInvitation", true);
            this.T = jSONObject.optBoolean("allowPushChallengeReminder", true);
            this.Y = jSONObject.optBoolean("allowPushChallengeUpdate", true);
            this.Z = jSONObject.optBoolean("allowPushBadgeReminder", true);
            this.I = jSONObject.optBoolean("allowPushChallengeComment", true);
            this.X = jSONObject.optBoolean("allowPushChallengeResults", true);
            this.P0 = jSONObject.optBoolean("allowPushAdaptiveTrainingPlan", true);
            this.Q0 = jSONObject.optBoolean("allowLowLevelBatteryNotification", true);
            this.R0 = jSONObject.optBoolean("allowPushGroupMemberConfirmations", true);
            this.S0 = jSONObject.optBoolean("allowPushGroupInvitations", true);
            this.T0 = jSONObject.optBoolean("allowPushGroupPost", true);
            this.U0 = jSONObject.optBoolean("allowPushGroupCommentOnMyPosts", true);
            this.V0 = jSONObject.optBoolean("allowPushGroupCommentOnOtherPosts", true);
            this.W0 = jSONObject.optBoolean("allowPushLikeOnPost", true);
            this.X0 = jSONObject.optBoolean("allowPushLikeOnPostComment", true);
            this.Y0 = jSONObject.optBoolean("allowPushGSPSubscriptionAlerts", true);
            this.Z0 = jSONObject.optBoolean("allowPushExclusiveDiscount", true);
            this.f43629a1 = jSONObject.optBoolean("allowPushForConsentPermissions", true);
            this.f43631b1 = jSONObject.optBoolean("allowEmailForConsentPermissions", true);
            this.f43633c1 = jSONObject.optBoolean("allowPushLivetrackContactChanges", true);
            this.f43635d1 = jSONObject.optBoolean("allowPushManagedAccountLivetrackContactChanges", true);
            this.f43637e1 = jSONObject.optBoolean("allowPushGearMaxUsageAlerts", true);
            this.f43639f1 = jSONObject.optBoolean("allowPushPendingActivity", true);
        }
    }
}
