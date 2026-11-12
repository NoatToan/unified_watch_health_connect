package mt0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120714b;

    public /* synthetic */ m1(com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar, int i14) {
        this.f120713a = i14;
        this.f120714b = sVar;
    }

    @Override // e23.a
    public final Object invoke() throws IllegalAccessException {
        int i14 = this.f120713a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120714b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_progress_details);
            case 1:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_join_date);
            case 2:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_reward_details);
            case 3:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                View view2 = sVar.getView();
                if (view2 != null) {
                    return view2;
                }
                com.nimbusds.jose.shaded.gson.internal.a.t("Access view after onCreateView has been called");
                return null;
            case 4:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_limited_title);
            case 5:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_limited_details);
            case 6:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar7 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return sVar.C6().findViewById(R.id.partner_info_container);
            case 7:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar8 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.partner_name);
            case 8:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar9 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (ImageView) sVar.C6().findViewById(R.id.partner_icon);
            case 9:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar10 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.adventure_warning);
            case 10:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar11 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (ViewGroup) sVar.C6().findViewById(R.id.challenge_container);
            case 11:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar12 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.badge_challenge_title);
            case 12:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar13 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.badge_challenge_subtitle);
            case 13:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar14 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_message_completed);
            case 14:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar15 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_message_completed_date);
            case 15:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (ImageView) sVar.C6().findViewById(R.id.banner_image);
            case 16:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (ImageView) sVar.C6().findViewById(R.id.badge_image);
            case 17:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (ViewGroup) sVar.C6().findViewById(R.id.rules_container);
            case 18:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.detailed_rules_text);
            case 19:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar20 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.detailed_rules_additional_subhead_text);
            case 20:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar21 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.detailed_rules_additional_summary_text);
            case 21:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar22 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (TextView) sVar.C6().findViewById(R.id.tv_view_badge_btn);
            case 22:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar23 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (ComposeView) sVar.C6().findViewById(R.id.join_challenge_button_compose);
            case 23:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (LinearProgressIndicator) sVar.C6().findViewById(R.id.badge_progress);
            case 24:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                return (Group) sVar.C6().findViewById(R.id.progress_group);
            default:
                f.c<Intent> cVar = sVar.E;
                ub1.g gVar = (ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null);
                Context contextRequireContext = sVar.requireContext();
                contextRequireContext.getClass();
                cVar.a(gVar.g(contextRequireContext, c80.q.SOCIAL, false), null);
                return Unit.INSTANCE;
        }
    }
}
