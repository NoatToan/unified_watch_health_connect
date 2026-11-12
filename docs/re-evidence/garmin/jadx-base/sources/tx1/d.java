package tx1;

import am.a2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTWorkoutScheduleActivity;
import dy1.n;
import java.util.List;
import jv1.e0;
import p005kotlin.Metadata;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltx1/d;", "Lg/a;", "Ldy1/n$f;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends g.a<n.f, Boolean> {
    @Override // g.a
    public final Intent a(Context context, n.f fVar) {
        n.f fVar2 = fVar;
        context.getClass();
        fVar2.getClass();
        FBTWorkoutScheduleActivity.a aVar = FBTWorkoutScheduleActivity.f45552c;
        m mVar = fVar2.f61588a;
        e0 e0Var = fVar2.f61589b;
        List<av1.d> list = fVar2.f61590c;
        List<ActivityListItemDTO> list2 = fVar2.f61591d;
        aVar.getClass();
        Intent intent = new Intent((Activity) context, (Class<?>) FBTWorkoutScheduleActivity.class);
        Bundle bundle = new Bundle();
        a2.b(bundle, "extra_training_plan", mVar);
        a2.b(bundle, "extra_user_settings", e0Var);
        a2.a("extra_fitness_stats_Activity", bundle, list);
        a2.a("extra_completed_activity_list", bundle, list2);
        com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
        return intent;
    }

    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        return Boolean.valueOf(i14 == -1);
    }
}
