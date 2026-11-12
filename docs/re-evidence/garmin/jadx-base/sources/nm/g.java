package nm;

import am.x0;
import am.z0;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnm/g;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "", "isFullscreen", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f126539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, zm.p pVar, zm.p pVar2, boolean z14) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
        this.f126539e = z14;
    }

    @Override // nm.b
    public final i53.c b() {
        Context context = this.f126526a;
        String string = context.getString(R.string.lbl_course_point_obstacle);
        string.getClass();
        return i53.a.a(new j82.f(string, new j82.g.n(f0.b(a7.b.getColor(context, R.color.gray_55_static)), null), null, 4, null));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return j0.f134944a;
    }

    @Override // nm.b
    public final boolean d() {
        zm.p pVar = this.f126527b;
        if (!sm.c.d(pVar)) {
            return false;
        }
        String f113501k1 = pVar.getF113501k1();
        z0 z0Var = z0.f4390a;
        return z0.b(x0.O0, f113501k1) && this.f126539e;
    }
}
