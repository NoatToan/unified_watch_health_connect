package fd0;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import androidx.fragment.app.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfd0/e;", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.targetedselection.j f70470a;

    public e(com.garmin.android.apps.connectmobile.devices.targetedselection.j jVar) {
        this.f70470a = jVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        com.garmin.android.apps.connectmobile.devices.targetedselection.j.a aVar = com.garmin.android.apps.connectmobile.devices.targetedselection.j.f34605k;
        m mVarRequireActivity = this.f70470a.requireActivity();
        Intent intent = new Intent();
        intent.putExtra("KEY_SNACKBAR_MESSAGE", (String) null);
        intent.putExtra("extra_start_workout", false);
        Unit unit = Unit.INSTANCE;
        mVarRequireActivity.setResult(0, intent);
        mVarRequireActivity.finish();
        return true;
    }
}
