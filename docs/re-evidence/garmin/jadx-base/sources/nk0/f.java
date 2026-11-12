package nk0;

import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GearActivity f126390b;

    public /* synthetic */ f(GearActivity gearActivity, int i14) {
        this.f126389a = i14;
        this.f126390b = gearActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f126389a;
        GearActivity gearActivity = this.f126390b;
        switch (i14) {
            case 0:
                GearActivity.a aVar = GearActivity.f35500b;
                hf.j.a aVar2 = new hf.j.a(gearActivity);
                hf.f.c<List<bg.a>> cVar = wf.g.f184981a;
                hf.f.c<cg.d.a> cVar2 = wf.h.f184985a;
                aVar2.f83571h.b(wf.h.f184985a, new cg.b.a(200, false, 2, null));
                wf.f.b bVarA = wf.f.b.a(aVar2.f83565b, wf.c.ENABLED, null, null, 16367);
                aVar2.f83565b = bVarA;
                aVar2.f83565b = wf.f.b.a(bVarA, null, wf.c.DISABLED, null, 16351);
                return aVar2.a();
            case 1:
                GearActivity.a aVar3 = GearActivity.f35500b;
                gearActivity.finish();
                return Unit.INSTANCE;
            default:
                GearActivity.a aVar4 = GearActivity.f35500b;
                gearActivity.setResult(-1);
                gearActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
