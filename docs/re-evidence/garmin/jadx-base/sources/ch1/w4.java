package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class w4 extends fb2.m<vk1.f> {
    public w4(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.m
    public final String q(vk1.f fVar) {
        vk1.j jVarG;
        vk1.f fVar2 = fVar;
        if (fVar2 == null || (jVarG = vk1.c.g(fVar2)) == null) {
            return null;
        }
        return b(jVarG.f178642b);
    }

    @Override // fb2.m
    public final String r(vk1.f fVar) {
        return vk1.c.f(fVar);
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF180422f() {
        return View.generateViewId();
    }

    @Override // fb2.m
    public final String u() {
        return b(R.string.hr_zones_lbl_based_on);
    }
}
