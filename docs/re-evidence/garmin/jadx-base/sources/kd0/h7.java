package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseActivity;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkd0/h7;", "Lg/a;", "Ls52/n;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h7 extends g.a<s52.n, com.garmin.android.apps.connectmobile.repcounting.model.d> {
    @Override // g.a
    public final Intent a(Context context, s52.n nVar) {
        s52.n nVar2 = nVar;
        context.getClass();
        nVar2.getClass();
        am.x0 x0Var = am.x0.f4309n1;
        String strB = hq.j.b(context, x0Var);
        String strA = hq.j.a(context, x0Var);
        SelectExerciseActivity.a aVar = SelectExerciseActivity.f29833f;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = nVar2.f157457a;
        List<s52.o> list = nVar2.f157458b;
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) SelectExerciseActivity.class);
        Bundle bundleA = h7.c.a(new o13.p("EXTRA_EXERCISE_LIST", cVar), new o13.p("EXTRA_SUGGESTED_EXERCISE_LIST", null), new o13.p("EXTRA_TITLE", strB), new o13.p("EXTRA_SEARCH_HINT", strA));
        if (list != null && (!list.isEmpty())) {
            bundleA.putParcelableArrayList("EXTRA_DISABLED_EXERCISE_LIST", new ArrayList<>(list));
        }
        com.airbnb.lottie.animation.keyframe.a.q(com.garmin.android.apps.connectmobile.l2.f37135b, intent, bundleA);
        return intent;
    }

    @Override // g.a
    public final com.garmin.android.apps.connectmobile.repcounting.model.d c(int i14, Intent intent) {
        Parcelable parcelable;
        if (i14 != -1 || intent == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("RESULT_SELECTED_EXERCISE");
            parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) (parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d ? parcelableExtra : null);
        }
        return (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
    }
}
