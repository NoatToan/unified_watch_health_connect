package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/BadgeChallengeRedeemActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengePromoCodeView$a;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgeChallengeRedeemActivity extends com.garmin.android.apps.connectmobile.c implements ChallengePromoCodeView.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f37213i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f37214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChallengePromoCodeView f37215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37221h;

    @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.ChallengePromoCodeView.a
    public final void E() {
        a2 a2Var = a2.CHALLENGES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "BadgeChallengeRedeemActivity", "copyButtonClicked: ");
        Object systemService = getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("PromoCodeValue", this.f37219f));
        Object systemService2 = getSystemService("vibrator");
        systemService2.getClass();
        ((Vibrator) systemService2).vibrate(VibrationEffect.createOneShot(50L, 255));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Bundle extras5;
        Bundle extras6;
        super.onCreate(bundle);
        setContentView(R.layout.activity_badge_challenge_redeem);
        initActionBar(true, R.string.lbl_get_reward);
        Intent intent = getIntent();
        this.f37216c = (intent == null || (extras6 = intent.getExtras()) == null) ? null : extras6.getString("EXTRA_REDEEM_BANNER");
        Intent intent2 = getIntent();
        this.f37217d = (intent2 == null || (extras5 = intent2.getExtras()) == null) ? null : extras5.getString("EXTRA_REDEEM_TITLE");
        Intent intent3 = getIntent();
        this.f37218e = (intent3 == null || (extras4 = intent3.getExtras()) == null) ? null : extras4.getString("EXTRA_REDEEM_DESCRIPTION");
        Intent intent4 = getIntent();
        this.f37219f = (intent4 == null || (extras3 = intent4.getExtras()) == null) ? null : extras3.getString("EXTRA_REDEEM_PROMOTION_CODE");
        Intent intent5 = getIntent();
        this.f37220g = (intent5 == null || (extras2 = intent5.getExtras()) == null) ? null : extras2.getString("EXTRA_REDEEM_FOOTER");
        Intent intent6 = getIntent();
        this.f37221h = (intent6 == null || (extras = intent6.getExtras()) == null) ? null : extras.getString("EXTRA_REDEEM_PARTNER_LINK");
        View viewFindViewById = findViewById(R.id.redeem_banner_view);
        viewFindViewById.getClass();
        this.f37214a = (ImageView) viewFindViewById;
        zp0.c cVar = new zp0.c((androidx.fragment.app.m) this);
        cVar.f206565e = this.f37216c;
        cVar.f206578r = "cache_availability_today";
        ImageView imageView = this.f37214a;
        if (imageView == null) {
            p005kotlin.jvm.internal.s.m("redeemBannerView");
            throw null;
        }
        cVar.h(imageView);
        View viewFindViewById2 = findViewById(R.id.redeem_title_view);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(this.f37217d);
        View viewFindViewById3 = findViewById(R.id.redeem_description_view);
        viewFindViewById3.getClass();
        v22.d.c((TextView) viewFindViewById3, this.f37218e);
        View viewFindViewById4 = findViewById(R.id.redeem_promo_code_view);
        viewFindViewById4.getClass();
        ChallengePromoCodeView challengePromoCodeView = (ChallengePromoCodeView) viewFindViewById4;
        this.f37215b = challengePromoCodeView;
        challengePromoCodeView.setClickListener(this);
        ChallengePromoCodeView challengePromoCodeView2 = this.f37215b;
        if (challengePromoCodeView2 == null) {
            p005kotlin.jvm.internal.s.m("redeemChallengePromoCodeView");
            throw null;
        }
        challengePromoCodeView2.setPromotionCode(this.f37219f);
        ChallengePromoCodeView challengePromoCodeView3 = this.f37215b;
        if (challengePromoCodeView3 == null) {
            p005kotlin.jvm.internal.s.m("redeemChallengePromoCodeView");
            throw null;
        }
        String str = this.f37220g;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        challengePromoCodeView3.f37223b.setText(str != null ? d53.u.v(str, "[expiration_date]", c22.j0.m(dateTimeNow), false) : null);
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        View viewFindViewById5 = findViewById(R.id.shop_now_button);
        viewFindViewById5.getClass();
        ((Button) viewFindViewById5).setOnClickListener(new mt0.h0(this, 2));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/BadgeChallengeRedeemActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_REDEEM_BANNER", "EXTRA_REDEEM_TITLE", "EXTRA_REDEEM_DESCRIPTION", "EXTRA_REDEEM_PROMOTION_CODE", "EXTRA_REDEEM_PROMOTION_FOOTER", "EXTRA_REDEEM_PARTNER_LINK", "", "MAX_AMPLITUDE", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
