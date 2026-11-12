package zr;

import com.garmin.android.apps.connectmobile.activities.ui.RPESeekBar;
import p005kotlin.Metadata;
import p3.p1;
import sr.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzr/l;", "Lcom/garmin/android/apps/connectmobile/activities/ui/RPESeekBar$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements RPESeekBar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f206748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<String> f206749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Integer> f206750c;

    public l(r rVar, p1<String> p1Var, p1<Integer> p1Var2) {
        this.f206748a = rVar;
        this.f206749b = p1Var;
        this.f206750c = p1Var2;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.ui.RPESeekBar.b
    public final void a(int i14) {
        this.f206749b.setValue(this.f206748a.a(Integer.valueOf(i14)));
        this.f206750c.setValue(i14 == 0 ? null : Integer.valueOf(i14));
    }
}
