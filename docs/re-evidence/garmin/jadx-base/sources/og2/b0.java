package og2;

import java.util.Timer;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b0<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f132009a;

    public b0(v vVar) {
        this.f132009a = vVar;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        v vVar = this.f132009a;
        if (zBooleanValue) {
            zg2.c.f204692a.getClass();
            zg2.c.d("LiveActivityAnimatedChartDataProvider", "Pause chart update cycle.");
            Timer timer = vVar.f132118m;
            if (timer != null) {
                timer.cancel();
            }
            vVar.f132118m = null;
        } else {
            zg2.c.f204692a.getClass();
            zg2.c.d("LiveActivityAnimatedChartDataProvider", "Resume chart update cycle.");
            int i14 = v.f132105p;
            vVar.u();
        }
        return Unit.INSTANCE;
    }
}
