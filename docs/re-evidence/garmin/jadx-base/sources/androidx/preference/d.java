package androidx.preference;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class d implements Preference.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroup f10216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f10217b;

    public d(c cVar, PreferenceGroup preferenceGroup) {
        this.f10217b = cVar;
        this.f10216a = preferenceGroup;
    }

    @Override // androidx.preference.Preference.d
    public final boolean X3(Preference preference) {
        this.f10216a.Q0 = Integer.MAX_VALUE;
        c cVar = this.f10217b;
        Handler handler = cVar.f10210e;
        c.a aVar = cVar.f10211f;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
        return true;
    }
}
