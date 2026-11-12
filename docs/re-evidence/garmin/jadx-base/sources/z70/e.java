package z70;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f202802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q53.t f202803c;

    public /* synthetic */ e(d dVar, q53.t tVar, int i14) {
        this.f202801a = i14;
        this.f202802b = dVar;
        this.f202803c = tVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f202801a) {
            case 0:
                if (str != null && str.equals("KEY_SHOULD_IGNORE_PAIRED_DEVICE_VALIDATOR")) {
                    this.f202803c.i(Boolean.valueOf(this.f202802b.r()));
                    break;
                }
                break;
            case 1:
                if (str != null && str.equals("KEY_SHOULD_IGNORE_SUBSCRIPTION_VALIDATOR")) {
                    this.f202803c.i(Boolean.valueOf(this.f202802b.a()));
                    break;
                }
                break;
            default:
                if (str != null && str.equals("KEY_SHOULD_IGNORE_TIME_CONSTRAINT")) {
                    this.f202803c.i(Boolean.valueOf(this.f202802b.w()));
                    break;
                }
                break;
        }
    }
}
