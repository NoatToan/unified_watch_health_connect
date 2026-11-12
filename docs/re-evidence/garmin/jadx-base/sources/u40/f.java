package u40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Set;
import p13.u;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<com.garmin.android.apps.connectmobile.courses.model.f> f168568a = u.m0(new com.garmin.android.apps.connectmobile.courses.model.f[]{com.garmin.android.apps.connectmobile.courses.model.f.SPRINT, com.garmin.android.apps.connectmobile.courses.model.f.HC_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T1_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T2_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T3_CLIMB, com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T4_CLIMB});

    public static final Drawable a(com.garmin.android.apps.connectmobile.courses.model.f fVar, Context context, int i14, int i15) {
        Drawable drawableA;
        Set<com.garmin.android.apps.connectmobile.courses.model.f> set = f168568a;
        int iE = set.contains(fVar) ? i14 : fb2.g.e(14, context);
        int i16 = fVar.f32923b;
        com.garmin.android.apps.connectmobile.courses.model.h hVar = fVar.f32928g;
        u4.d dVar = hVar != null ? hVar.f32966b : null;
        if (dVar != null) {
            drawableA = s40.c.b(dVar, context, iE, i15);
        } else {
            drawableA = i16 != 0 ? j.a.a(context, i16) : null;
        }
        if (drawableA == null) {
            return null;
        }
        if (set.contains(fVar)) {
            drawableA.setBounds(0, 0, i14, i14);
        } else {
            drawableA.setBounds(fb2.g.e(5, context), fb2.g.e(5, context), fb2.g.e(19, context), fb2.g.e(19, context));
        }
        drawableA.setTint(i15);
        return drawableA;
    }
}
