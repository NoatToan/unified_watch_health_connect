package hd1;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements SharedPreferences.OnSharedPreferenceChangeListener {
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        t tVar = t.f83397a;
        if (str != null) {
            f12.l.f68084a.getClass();
            if (str.equals("keyRegisteredRealTimeHeartRateDeviceId") || str.equals("key_primary_activity_tracker_id")) {
                boolean z14 = t.E;
                t.f83397a.getClass();
                boolean z15 = f12.l.a.a().C3() > 0;
                t.E = z15;
                if (z14 != z15) {
                    t.d();
                }
            }
        }
    }
}
