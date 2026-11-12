package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengePromoCodeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengePromoCodeView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setClickListener", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengePromoCodeView$a;)V", "", "promoCodeText", "setPromotionCode", "(Ljava/lang/String;)V", "c", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengePromoCodeView$a;", "getCopyClickListener", "()Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/ChallengePromoCodeView$a;", "setCopyClickListener", "copyClickListener", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChallengePromoCodeView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f37222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f37223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a copyClickListener;

    public interface a {
        void E();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengePromoCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        View.inflate(context, R.layout.challenge_promo_code_view, this);
        View viewFindViewById = findViewById(R.id.promo_code_tv);
        viewFindViewById.getClass();
        this.f37222a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.copy_promo_code_btn);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.promo_code_detail_tv);
        viewFindViewById3.getClass();
        this.f37223b = (TextView) viewFindViewById3;
        textView.setOnClickListener(new mt0.h0(this, 3));
        String string = context.getText(R.string.common_copy).toString();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        textView.setText(upperCase);
    }

    public final a getCopyClickListener() {
        return this.copyClickListener;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
    }

    public final void setClickListener(a listener) {
        listener.getClass();
        this.copyClickListener = listener;
    }

    public final void setCopyClickListener(a aVar) {
        this.copyClickListener = aVar;
    }

    public final void setPromotionCode(String promoCodeText) {
        this.f37222a.setText(promoCodeText);
    }
}
