package lv0;

import com.garmin.android.apps.connectmobile.R;
import d53.u;
import gl1.y;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final String a(m mVar, int i14) {
        x1 x1Var = n.f135158a;
        if (i14 == 1) {
            return sn.a.h(mVar, -165899520, R.string.lbl_visible_to_following_singular, mVar);
        }
        mVar.C(-165819664);
        String strP = y.P(R.string.lbl_visible_to_following_plural, new Object[]{String.valueOf(i14)}, mVar);
        mVar.f();
        return strP;
    }

    public static final String b(String str, m mVar) {
        str.getClass();
        x1 x1Var = n.f135158a;
        return u.v(str, y.Q(mVar, R.string.lbl_grouptrack), y.Q(mVar, R.string.lbl_group_track), false);
    }
}
