package v;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements androidx.concurrent.futures.b.c, w1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f173936b;

    public /* synthetic */ n(s sVar, int i14) {
        this.f173935a = i14;
        this.f173936b = sVar;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        switch (this.f173935a) {
            case 0:
                s sVar = this.f173936b;
                sVar.f174008c.execute(new p(sVar, aVar, 0));
                return "Release[request=" + sVar.f174020n.getAndIncrement() + "]";
            default:
                s sVar2 = this.f173936b;
                try {
                    ArrayList arrayList = new ArrayList(sVar2.f174006a.b().b().f5604c);
                    arrayList.add(sVar2.E.f173781f);
                    arrayList.add(new t(sVar2, aVar));
                    sVar2.f174007b.f5368a.a(sVar2.f174015j.f174094a, sVar2.f174008c, r0.a(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | RuntimeException e4) {
                    e4.getMessage();
                    sVar2.toString();
                    aVar.d(e4);
                    return "configAndCloseTask";
                }
        }
    }
}
