package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a2 extends fb2.r<wi1.j, wi1.j.d> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f27290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27292h;

    static {
        HashMap map = new HashMap();
        f27290f = map;
        map.put(wi1.j.d.AUTO, Integer.valueOf(View.generateViewId()));
        map.put(wi1.j.d.HR_ZONES, Integer.valueOf(View.generateViewId()));
        f27291g = new HashMap();
        f27292h = View.generateViewId();
    }

    public a2(Context context) {
        super(context);
    }

    public static wi1.j.d A(wi1.j jVar) {
        jVar.getClass();
        wi1.j.d.a aVar = wi1.j.d.f185568c;
        String str = jVar.f185553p;
        aVar.getClass();
        if (str != null) {
            w13.c cVar = wi1.j.d.f185572g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                wi1.j.d dVar = (wi1.j.d) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(dVar.f185573a, str)) {
                    return dVar;
                }
            }
        }
        return wi1.j.d.AUTO;
    }

    @Override // fb2.r, fb2.e
    public final boolean g(i.c cVar, Object obj) {
        return y(cVar.findViewById(f27292h), cVar, (wi1.j) obj);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.r
    public final Map<wi1.j.d, CharSequence> r(wi1.j.d[] dVarArr) {
        HashMap map = f27291g;
        if (map.isEmpty()) {
            wi1.j.d dVar = wi1.j.d.AUTO;
            map.put(dVar, this.f70343a.getString(dVar.f185574b));
            wi1.j.d dVar2 = wi1.j.d.HR_ZONES;
            map.put(dVar2, this.f70343a.getString(dVar2.f185574b));
        }
        return map;
    }

    @Override // fb2.r
    public final /* bridge */ /* synthetic */ wi1.j.d s(wi1.j jVar) {
        return A(jVar);
    }

    @Override // fb2.r
    public final int t() {
        return f27292h;
    }

    @Override // fb2.r
    public final wi1.j.d[] v(wi1.j jVar) {
        return new wi1.j.d[]{wi1.j.d.AUTO, wi1.j.d.HR_ZONES};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.intensity_minutes_config_lbl_based_on;
    }

    @Override // fb2.r
    public final Map<wi1.j.d, Integer> x() {
        return f27290f;
    }

    @Override // fb2.r
    public final void z(wi1.j.d dVar, wi1.j jVar) {
        wi1.j.d dVar2 = dVar;
        wi1.j jVar2 = jVar;
        jVar2.getClass();
        dVar2.getClass();
        jVar2.f185553p = dVar2.f185573a;
    }
}
