package q70;

import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f143216b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f143215a = i14;
        this.f143216b = bVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f143215a;
        b bVar = this.f143216b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = b.f143217h;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    bVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = b.f143217h;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    String strP = y.P(R.string.string_space_string_pattern, new Object[]{y.Q(mVar2, R.string.lbl_help_in_focus_description), y.P(R.string.msg_section_accommodate_number_cards, new Object[]{"6"}, mVar2)}, mVar2);
                    String strP2 = y.P(R.string.string_space_string_pattern, new Object[]{y.Q(mVar2, R.string.lbl_help_at_a_glance_description), y.P(R.string.msg_choose_number_stats_for_section_number_shown, new Object[]{"20", "8"}, mVar2)}, mVar2);
                    int i17 = (iIntValue2 << 6) & 896;
                    rVar.E(y.Q(mVar2, R.string.lbl_home_settings), mVar2, i17);
                    rVar.m(i17, 2, y.Q(mVar2, R.string.msg_home_screen_customizability), null, mVar2);
                    int i18 = (iIntValue2 << 3) & 112;
                    rVar.q(y.Q(mVar2, R.string.lbl_help_home_setting_sections_overview), mVar2, i18);
                    rVar.E(y.Q(mVar2, R.string.lbl_in_focus), mVar2, i17);
                    rVar.q(strP, mVar2, i18);
                    if (bVar.f143219g) {
                        mVar2.C(-2118770359);
                        rVar.E(y.Q(mVar2, R.string.lbl_sleep_coach), mVar2, i17);
                        rVar.q(y.Q(mVar2, R.string.lbl_sleep_coach_help), mVar2, i18);
                        mVar2.f();
                    } else {
                        mVar2.C(-2118601223);
                        mVar2.f();
                    }
                    rVar.E(y.Q(mVar2, R.string.lbl_at_a_glance), mVar2, i17);
                    rVar.q(strP2, mVar2, i18);
                    rVar.E(y.Q(mVar2, R.string.lbl_adding_your_own_data), mVar2, i17);
                    rVar.q(y.Q(mVar2, R.string.msg_stat_manual_data_at_a_glance_plus_symbol), mVar2, i18);
                    rVar.E(y.Q(mVar2, R.string.event_garmin_coach_plans_and_challenges), mVar2, i17);
                    rVar.q(y.Q(mVar2, R.string.lbl_help_events_training_plans_challenges_sections_description), mVar2, i18);
                    rVar.E(y.Q(mVar2, R.string.lbl_yesterday_and_last_seven_days), mVar2, i17);
                    rVar.q(y.Q(mVar2, R.string.msg_like_to_view_historic_reports_in_focus_and_at_a_glance), mVar2, i18);
                    rVar.E(y.Q(mVar2, R.string.lbl_help_other_home_screen_details), mVar2, i17);
                    rVar.q(y.Q(mVar2, R.string.msg_any_activities_workouts_events_appear_auto_home_screen), mVar2, i18);
                    if (bVar.f143218f) {
                        mVar2.C(-2117631295);
                        rVar.E(y.Q(mVar2, R.string.lbl_reset_home), mVar2, i17);
                        rVar.q(y.Q(mVar2, R.string.lbl_help_reset_custom_changes), mVar2, i18);
                        mVar2.f();
                    } else {
                        mVar2.C(-2117454471);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
