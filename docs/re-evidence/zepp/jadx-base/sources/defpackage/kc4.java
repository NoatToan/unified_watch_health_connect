package defpackage;

import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.observer.IServiceSportObserver;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class kc4 {
    public static void a(IServiceSportObserver _this, GPSPoint gPSPoint) {
        LogKit.i("InaccuracyLocationChanged", gPSPoint.toString());
    }
}
