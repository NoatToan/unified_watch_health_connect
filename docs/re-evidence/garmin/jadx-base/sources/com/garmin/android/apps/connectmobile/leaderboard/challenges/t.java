package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/t;", "Landroid/text/style/ClickableSpan;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f37888a;

    public t(s sVar) {
        this.f37888a = sVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        view2.getClass();
        AutoChallengeActivity.a aVar = AutoChallengeActivity.f37184c;
        androidx.fragment.app.m mVarRequireActivity = this.f37888a.requireActivity();
        mVarRequireActivity.getClass();
        aVar.getClass();
        Intent intent = new Intent(mVarRequireActivity, (Class<?>) AutoChallengeActivity.class);
        intent.putExtra("GCM_show_current_challenge", true);
        mVarRequireActivity.startActivity(intent);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setColor(a7.b.getColor(this.f37888a.requireContext(), R.color.gcm_text_primary_action));
        textPaint.setUnderlineText(false);
    }
}
