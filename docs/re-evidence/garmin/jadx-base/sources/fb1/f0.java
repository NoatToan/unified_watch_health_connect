package fb1;

import android.os.Handler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfb1/f0;", "Le32/e;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends e32.e<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l f70235a;

    public f0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l lVar) {
        this.f70235a = lVar;
    }

    @Override // e32.e
    public final void a(Integer num) {
        int iIntValue = num.intValue();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.l lVar = this.f70235a;
        Handler handler = lVar.f40702n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = new Handler();
        lVar.f40702n = handler2;
        androidx.media3.exoplayer.d dVar = new androidx.media3.exoplayer.d(lVar, iIntValue, 4);
        long j8 = 50;
        j23.l lVar2 = new j23.l(100, 300);
        h23.c.a aVar = h23.c.f81216a;
        aVar.getClass();
        try {
            handler2.postDelayed(dVar, j8 + ((long) gl1.d.N(aVar, lVar2)));
        } catch (IllegalArgumentException e4) {
            n23.j.s(e4.getMessage());
        }
    }
}
