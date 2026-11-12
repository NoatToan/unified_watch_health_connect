package miuix.autodensity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import defpackage.ebk;
import defpackage.qr5;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigurationChangeFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26611a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AutoDensityConfig f26612b;

    public void a() {
        this.f26611a = true;
    }

    public void b(AutoDensityConfig autoDensityConfig) {
        this.f26612b = autoDensityConfig;
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        qr5.d("->ConfigurationChangeFragment onAttach newConfig " + context.getResources().getConfiguration() + " context: " + context);
        AutoDensityConfig.updateDensity(context);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Activity activity = getActivity();
        qr5.d("->ConfigurationChangeFragment onConfigurationChanged newConfig " + configuration + " activity: " + activity);
        this.f26612b.updateDensityOnConfigChanged(activity, configuration);
        super.onConfigurationChanged(configuration);
        try {
            if (this.f26611a) {
                ((ActivityInfo) ebk.j(Activity.class, activity, "mActivityInfo")).configChanges &= -4097;
                this.f26611a = false;
            }
        } catch (Exception unused) {
        }
    }
}
