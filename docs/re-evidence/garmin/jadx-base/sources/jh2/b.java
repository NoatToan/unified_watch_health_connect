package jh2;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import zh2.e;
import zh2.f;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static final void a(Menu menu, Context context) {
        context.getClass();
        e.f204807a.getClass();
        f fVar = e.f204812f;
        com.garmin.androiddynamicsettings.app.presentationlayer.b.f50687j.getClass();
        MenuItem menuItemAdd = menu.add(0, com.garmin.androiddynamicsettings.app.presentationlayer.b.f50688k, 0, fVar.f204818e);
        if (menuItemAdd != null) {
            menuItemAdd.setShowAsAction(2);
            Integer num = fVar.f204817d;
            if (num != null) {
                menuItemAdd.setIcon(a7.b.getDrawable(context, num.intValue()));
            }
        }
    }
}
