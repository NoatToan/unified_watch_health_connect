package d10;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import lc.m0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ld10/g;", "T", "Lcom/garmin/android/apps/connectmobile/c;", "Ld10/c;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g<T> extends com.garmin.android.apps.connectmobile.c implements c<T> {
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.navigation_filter_activity);
        initActionBar(true, R.string.lbl_filter);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        fragmentF.getClass();
        m0 m0VarU6 = ((NavHostFragment) fragmentF).u6();
        m0VarU6.f111904b.x(m0VarU6.e().b(R.navigation.nav_ecg_filter), null);
    }
}
