package au1;

import com.garmin.android.apps.connectmobile.training.atp.create.steps.j;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f13044b;

    public /* synthetic */ g(j jVar, int i14) {
        this.f13043a = i14;
        this.f13044b = jVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f13043a;
        j jVar = this.f13044b;
        switch (i14) {
            case 0:
                j.a aVar = j.f45297p;
                return new j.b(jVar);
            default:
                j.a aVar2 = j.f45297p;
                jVar.E6();
                return Unit.INSTANCE;
        }
    }
}
