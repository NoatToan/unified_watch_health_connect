package d10;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> extends com.garmin.android.apps.connectmobile.c implements c<T> {
    public abstract Fragment ca();

    public final void da(i iVar) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.filter_frame, iVar, null);
        aVar.d(null);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.filter_activity);
        initActionBar(true, R.string.lbl_filter);
        Fragment fragmentCa = ca();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.filter_frame, fragmentCa, null);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || getSupportFragmentManager() == null || getSupportFragmentManager().M() <= 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        getSupportFragmentManager().Z();
        return true;
    }
}
