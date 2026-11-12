package a80;

import android.content.SharedPreferences;
import q53.t;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1930c;

    public /* synthetic */ d(c cVar, t tVar, int i14) {
        this.f1928a = i14;
        this.f1929b = cVar;
        this.f1930c = tVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f1928a) {
            case 0:
                if (str != null && str.equals("keyHasEnteredExclusiveOffersPage")) {
                    this.f1930c.i(Boolean.valueOf(this.f1929b.m()));
                    break;
                }
                break;
            case 1:
                if (str != null && str.equals("key_should_show_unpublished_contentful_content")) {
                    this.f1930c.i(Boolean.valueOf(this.f1929b.h()));
                    break;
                }
                break;
            case 2:
                if (str != null && str.equals("key_should_target_uac")) {
                    this.f1930c.i(Boolean.valueOf(this.f1929b.f1927a.W2("key_should_target_uac", true)));
                    break;
                }
                break;
            default:
                if (str != null && str.equals("key_should_use_contentful_test_environment")) {
                    this.f1930c.i(Boolean.valueOf(this.f1929b.d()));
                    break;
                }
                break;
        }
    }
}
