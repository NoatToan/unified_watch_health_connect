package fv0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c.q;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import p005kotlin.Unit;
import ro0.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f73634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f73635c;

    public /* synthetic */ d(Context context, q qVar, int i14) {
        this.f73633a = i14;
        this.f73634b = context;
        this.f73635c = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f73633a;
        Context context = this.f73634b;
        q qVar = this.f73635c;
        switch (i14) {
            case 0:
                if (hb2.g.b(context, hb2.g.a.STRAVA)) {
                    qVar.a(lv0.f.a(), null);
                } else {
                    lv0.f.b(context);
                }
                break;
            case 1:
                if (hb2.g.b(context, hb2.g.a.STRAVA)) {
                    qVar.a(lv0.f.a(), null);
                } else {
                    lv0.f.b(context);
                }
                break;
            case 2:
                if (hb2.g.b(context, hb2.g.a.STRAVA)) {
                    qVar.a(lv0.f.a(), null);
                } else {
                    lv0.f.b(context);
                }
                break;
            case 3:
                if (hb2.g.b(context, hb2.g.a.STRAVA)) {
                    qVar.a(lv0.f.a(), null);
                } else {
                    lv0.f.b(context);
                }
                break;
            case 4:
                if (hb2.g.b(context, hb2.g.a.STRAVA)) {
                    qVar.a(lv0.f.a(), null);
                } else {
                    lv0.f.b(context);
                }
                break;
            case 5:
                context.getClass();
                qVar.a(new Intent(context, (Class<?>) WorkoutListActivity.class), null);
                break;
            case 6:
                qVar.a(new Intent(context, (Class<?>) CompletedTrainingPlansActivity.class), null);
                break;
            case 7:
                EditProfileImageActivity.f46576j.getClass();
                context.getClass();
                qVar.a(new Intent(context, (Class<?>) EditProfileImageActivity.class), null);
                break;
            case 8:
                int i15 = wt0.h.f187018c;
                qVar.a(new Intent(context, (Class<?>) LeaderboardActivity.class), null);
                break;
            case 9:
                int i16 = wt0.h.f187018c;
                qVar.a(new Intent(context, (Class<?>) LeaderboardActivity.class), null);
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putBoolean("GCM_extra_key_child_restrictions", true);
                bundle.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                qVar.a(HelpActivity.a.b(HelpActivity.f36653a, context, l.LIVETRACK, bundle, 4), null);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(q qVar, Context context, int i14) {
        this.f73633a = i14;
        this.f73635c = qVar;
        this.f73634b = context;
    }
}
