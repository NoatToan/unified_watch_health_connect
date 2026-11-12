package pg2;

import android.app.Activity;
import android.content.Intent;
import e23.l;
import p005kotlin.Unit;
import p3.i0;
import sa2.p;
import sg2.i;
import sg2.k;
import ug2.q0;
import vu0.j;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f137637b;

    public /* synthetic */ d(Activity activity, int i14) {
        this.f137636a = i14;
        this.f137637b = activity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer numValueOf;
        int i14 = this.f137636a;
        Activity activity = this.f137637b;
        switch (i14) {
            case 0:
                ((i0) obj).getClass();
                numValueOf = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
                if (activity != null) {
                    activity.setRequestedOrientation(0);
                }
                return new f(numValueOf, activity);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                wa2.b bVar = p.f158386b;
                if (zBooleanValue) {
                    activity.finish();
                }
                return Unit.INSTANCE;
            case 2:
                ((i0) obj).getClass();
                numValueOf = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
                if (activity != null) {
                    activity.setRequestedOrientation(0);
                }
                return new i(numValueOf, activity);
            case 3:
                ((i0) obj).getClass();
                numValueOf = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
                if (activity != null) {
                    activity.setRequestedOrientation(0);
                }
                return new k.a(numValueOf, activity);
            case 4:
                ((i0) obj).getClass();
                numValueOf = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
                if (activity != null) {
                    activity.setRequestedOrientation(1);
                }
                return new q0.a(activity, numValueOf);
            case 5:
                int i15 = j.f180247o;
                ((f.a) obj).getClass();
                if (activity != null) {
                    activity.setResult(-1);
                }
                return Unit.INSTANCE;
            default:
                long jLongValue = ((Long) obj).longValue();
                Intent intent = new Intent();
                intent.putExtra("progress_report_new_plan_id", jLongValue);
                activity.setResult(12, intent);
                activity.finish();
                return Unit.INSTANCE;
        }
    }
}
