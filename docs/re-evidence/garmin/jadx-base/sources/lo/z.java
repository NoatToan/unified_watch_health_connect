package lo;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.ActivityPoolLengthActivity;

/* JADX INFO: loaded from: classes7.dex */
public class z extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113991b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f0 f0Var) {
        super(f0Var, 0);
        this.f113991b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113991b;
        double d14 = f0Var.M1;
        String str = f0Var.N1;
        t tVar = (t) dVar;
        tVar.getClass();
        int i14 = ActivityPoolLengthActivity.f28765n;
        Intent intent = new Intent(tVar.getActivity(), (Class<?>) ActivityPoolLengthActivity.class);
        intent.putExtra("GCM_extra_activity_pool_length_value", d14);
        intent.putExtra("GCM_extra_activity_pool_length_unit", str);
        tVar.startActivityForResult(intent, 11);
    }
}
