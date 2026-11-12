package fo;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import java.util.List;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivitiesListActivity f72256b;

    public /* synthetic */ a(ActivitiesListActivity activitiesListActivity, int i14) {
        this.f72255a = i14;
        this.f72256b = activitiesListActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        Object value;
        int i14 = this.f72255a;
        String stringExtra = null;
        ActivitiesListActivity activitiesListActivity = this.f72256b;
        switch (i14) {
            case 0:
                ActivitiesListActivity.a aVar = ActivitiesListActivity.f29099d;
                return (am.d) AndroidKoinScopeExtKt.getKoinScope(activitiesListActivity).get((k23.d<?>) s0.f105811a.b(am.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
            case 1:
                ActivitiesListActivity.a aVar2 = ActivitiesListActivity.f29099d;
                Intent intent = activitiesListActivity.getIntent();
                intent.getClass();
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 33) {
                    parcelable = (Parcelable) intent.getParcelableExtra("activity_list_mode", am.g.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("activity_list_mode");
                    if (!(parcelableExtra instanceof am.g)) {
                        parcelableExtra = null;
                    }
                    parcelable = (am.g) parcelableExtra;
                }
                am.g gVar = (am.g) parcelable;
                if (gVar == null) {
                    gVar = am.g.f3942f;
                }
                int intExtra = intent.getIntExtra("GCM_extra_badge_id", -1);
                List parcelableArrayListExtra = i15 >= 33 ? intent.getParcelableArrayListExtra("activity_list_filters", jo.d.class) : intent.getParcelableArrayListExtra("activity_list_filters");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = jo.d.f99741m;
                }
                if (gVar == am.g.f3944h && (stringExtra = intent.getStringExtra("GCM_userDisplayName")) == null) {
                    stringExtra = "";
                }
                return ParametersHolderKt.parametersOf(new eo.a(gVar, intExtra, stringExtra, parcelableArrayListExtra));
            case 2:
                ActivitiesListActivity.a aVar3 = ActivitiesListActivity.f29099d;
                activitiesListActivity.finish();
                return Unit.INSTANCE;
            case 3:
                ActivitiesListActivity.a aVar4 = ActivitiesListActivity.f29099d;
                am.d dVar = (am.d) activitiesListActivity.f29101b.getValue();
                am.g gVar2 = activitiesListActivity.f29100a;
                if (gVar2 != null) {
                    dVar.u(activitiesListActivity, gVar2);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("activityListMode");
                throw null;
            default:
                ActivitiesListActivity.a aVar5 = ActivitiesListActivity.f29099d;
                activitiesListActivity.setResult(-1);
                p2 p2Var = activitiesListActivity.da().f72420e;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, q.a((q) value, null, false, false, 0, false, null, null, null, null, null, null, 7679)));
                return Unit.INSTANCE;
        }
    }
}
