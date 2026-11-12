package tv;

import com.garmin.android.apps.connectmobile.i2;
import ds.e0;

/* JADX INFO: loaded from: classes7.dex */
public class r extends uv.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f166536a;

    public r(s sVar) {
        this.f166536a = sVar;
    }

    @Override // uv.g, da2.m
    public final void a(String str) {
        i2.d("VectorSettingsManager", "onFileSaved: file saved successfully with itemId: " + str);
        xv.g gVar = new xv.g(0);
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        c2513a.getClass();
        l73.c.b().e(gVar);
        this.f166536a.getClass();
        xv.a aVar = new xv.a();
        c2513a.getClass();
        l73.c.b().e(aVar);
    }

    @Override // uv.g, da2.m
    public final void d(String str, String str2) {
        i2.i("VectorSettingsManager", "onFileSaveFailure: file save failed for itemId: " + str + " failureReason: " + str2);
        xv.g gVar = new xv.g(4);
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        c2513a.getClass();
        l73.c.b().e(gVar);
        this.f166536a.getClass();
        xv.a aVar = new xv.a();
        c2513a.getClass();
        l73.c.b().e(aVar);
    }

    @Override // uv.g, da2.m
    public final void e(long j8) {
        long j14 = (100 * j8) / this.f166536a.f166540c;
        StringBuilder sbK = e0.k(j8, "onFileSaveProgress: progressPercentage: ", " calculated progress: ");
        sbK.append(j14);
        i2.d("VectorSettingsManager", sbK.toString());
        xv.h hVar = new xv.h(j14);
        oi2.a.f132270a.getClass();
        l73.c.b().e(hVar);
    }
}
