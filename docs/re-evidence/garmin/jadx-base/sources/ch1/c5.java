package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c5 extends fb2.t<wi1.j, wi1.j.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27313e = View.generateViewId();

    public c5(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.t
    public final Map<wi1.j.c, CharSequence> q(wi1.j.c[] cVarArr) {
        HashMap map = new HashMap();
        for (wi1.j.c cVar : cVarArr) {
            map.put(cVar, this.f70343a.getString(cVar.f185567b));
        }
        return map;
    }

    @Override // fb2.t
    public final wi1.j.c r(wi1.j jVar) {
        int i14 = jVar.f185555r;
        if (i14 <= 0) {
            return wi1.j.c.ZONE_4;
        }
        int i15 = i14 - 1;
        wi1.j.c.f185560c.getClass();
        if (i15 < 0) {
            i15 = 0;
        }
        return (wi1.j.c) wi1.j.c.f185565h.get(i15);
    }

    @Override // fb2.t
    public final int t() {
        return f27313e;
    }

    @Override // fb2.t
    public final String u() {
        return b(R.string.lbl_intensity_vigorous);
    }

    @Override // fb2.t
    public final wi1.j.c[] v(wi1.j jVar) {
        wi1.j.c[] cVarArrValues = wi1.j.c.values();
        return (wi1.j.c[]) Arrays.copyOfRange(cVarArrValues, 1, cVarArrValues.length);
    }

    @Override // fb2.t
    public final void w(wi1.j.c cVar, wi1.j jVar) {
        jVar.D(cVar);
    }

    @Override // fb2.t, fb2.e
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final boolean k(wi1.j jVar) {
        wi1.j.c cVar;
        wi1.j.c cVar2;
        int i14 = jVar.f185555r;
        if (i14 <= 0) {
            cVar = wi1.j.c.ZONE_4;
        } else {
            int i15 = i14 - 1;
            wi1.j.c.f185560c.getClass();
            if (i15 < 0) {
                i15 = 0;
            }
            cVar = (wi1.j.c) wi1.j.c.f185565h.get(i15);
        }
        int i16 = jVar.f185554q;
        if (i16 <= 0) {
            cVar2 = wi1.j.c.ZONE_3;
        } else {
            int i17 = i16 - 1;
            wi1.j.c.f185560c.getClass();
            cVar2 = (wi1.j.c) wi1.j.c.f185565h.get(i17 >= 0 ? i17 : 0);
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal <= cVar2.ordinal()) {
            jVar.C(wi1.j.c.values()[iOrdinal - 1]);
        }
        return super.k(jVar);
    }
}
