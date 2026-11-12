package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import p005kotlin.Metadata;
import z10.p3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeDetailsActivity;", "Lz10/p3;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdHocChallengeDetailsActivity extends p3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37168h = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdHocChallengeDTO f37171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37173g;

    @Override // z10.p3
    public final Fragment ca() {
        if (this.f37172f) {
            boolean z14 = this.f37173g;
            if (!z14) {
                b.a aVar = b.f37321p;
                String str = this.f37169c;
                String str2 = this.f37170d;
                aVar.getClass();
                b bVar = new b();
                Bundle bundleD = tn.k.d("GCM_challenge_uuid", str, "GCM_challenge_invitation_id", str2);
                bundleD.putBoolean("GCM_challenge_is_vivokid", true);
                bVar.setArguments(bundleD);
                return bVar;
            }
            b.a aVar2 = b.f37321p;
            String str3 = this.f37169c;
            aVar2.getClass();
            b bVar2 = new b();
            Bundle bundle = new Bundle();
            bundle.putString("GCM_challenge_uuid", str3);
            bundle.putBoolean("GCM_challenge_is_vivokid", true);
            bundle.putBoolean("GCM_challenge_focus_on_comments", z14);
            bVar2.setArguments(bundle);
            return bVar2;
        }
        String str4 = this.f37169c;
        if (str4 == null) {
            b.a aVar3 = b.f37321p;
            AdHocChallengeDTO adHocChallengeDTO = this.f37171e;
            aVar3.getClass();
            b bVar3 = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("GCM_ad_hoc_challenge", adHocChallengeDTO);
            bVar3.setArguments(bundle2);
            return bVar3;
        }
        String str5 = this.f37170d;
        if (str5 != null) {
            b.f37321p.getClass();
            b bVar4 = new b();
            Bundle bundle3 = new Bundle();
            bundle3.putString("GCM_challenge_uuid", str4);
            bundle3.putString("GCM_challenge_invitation_id", str5);
            bVar4.setArguments(bundle3);
            return bVar4;
        }
        boolean z15 = this.f37173g;
        b.f37321p.getClass();
        b bVar5 = new b();
        Bundle bundle4 = new Bundle();
        bundle4.putString("GCM_challenge_uuid", str4);
        bundle4.putBoolean("GCM_challenge_focus_on_comments", z15);
        bVar5.setArguments(bundle4);
        return bVar5;
    }

    @Override // z10.p3
    public final String da() {
        if (this.f37172f) {
            String string = getString(R.string.social_vvf_jr_challenge);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.challenge_title);
        string2.getClass();
        return string2;
    }

    @Override // z10.p3
    public final void ga() {
        Parcelable parcelable;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_ad_hoc_challenge", AdHocChallengeDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_ad_hoc_challenge");
                if (!(parcelable2 instanceof AdHocChallengeDTO)) {
                    parcelable2 = null;
                }
                parcelable = (AdHocChallengeDTO) parcelable2;
            }
            this.f37171e = (AdHocChallengeDTO) parcelable;
            this.f37169c = extras.getString("GCM_challenge_uuid");
            this.f37170d = extras.getString("GCM_challenge_invitation_id");
            this.f37173g = extras.getBoolean("GCM_challenge_focus_on_comments");
            this.f37172f = extras.getBoolean("GCM_challenge_is_vivokid");
        }
        if (this.f37171e == null && this.f37169c == null) {
            Toast.makeText(this, R.string.txt_error_occurred, 0).show();
            finish();
        }
    }

    @Override // z10.p3
    public final boolean ja() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/AdHocChallengeDetailsActivity$a;", "", "<init>", "()V", "", "RES_CODE_INVALID_CHALLENGE_UUID", "I", "", "EXTRA_VIEW_DETAIL_RESULT", "Ljava/lang/String;", "VIVOKID_PARAM_CHALLENGE_ID", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, String str, String str2, Boolean bool) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) AdHocChallengeDetailsActivity.class);
            intent.putExtra("GCM_challenge_uuid", str);
            intent.putExtra("GCM_challenge_focus_on_comments", bool);
            intent.putExtra("GCM_challenge_invitation_id", str2);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, String str, String str2, int i14) {
            if ((i14 & 4) != 0) {
                str2 = null;
            }
            aVar.getClass();
            return a(context, str, str2, null);
        }

        public static Intent c(Context context, String str, String str2) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) AdHocChallengeDetailsActivity.class);
            intent.putExtra("GCM_challenge_uuid", str);
            intent.putExtra("GCM_challenge_invitation_id", str2);
            intent.putExtra("GCM_challenge_is_vivokid", true);
            return intent;
        }

        public static void d(Activity activity, String str, String str2, boolean z14, boolean z15) {
            if (z14 && x.u(activity)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(z15 ? "vivokid://challengePending" : "vivokid://challenge"));
                intent.putExtra("challengeId", str);
                try {
                    activity.startActivityForResult(intent, 7);
                    return;
                } catch (ActivityNotFoundException unused) {
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.CHALLENGES;
                    aVar.getClass();
                    i2.a.f(a2Var, "AdHocChallengeDetailsActivity", "Vivofit Jr. app installed but doesn't support GCM challenges");
                }
            }
            Intent intent2 = new Intent(activity, (Class<?>) AdHocChallengeDetailsActivity.class);
            intent2.putExtra("GCM_challenge_uuid", str);
            intent2.putExtra("GCM_challenge_invitation_id", str2);
            intent2.putExtra("GCM_challenge_is_vivokid", true);
            activity.startActivityForResult(intent2, 7);
        }

        private a() {
        }
    }
}
