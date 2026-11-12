package nk0;

import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import java.util.ArrayList;
import lc.v;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f126384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f126385c;

    public /* synthetic */ d(p1 p1Var, v vVar, int i14) {
        this.f126383a = i14;
        this.f126384b = p1Var;
        this.f126385c = vVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f126383a;
        v vVar = this.f126385c;
        x3 x3Var = this.f126384b;
        e23.l lVar = (e23.l) obj;
        switch (i14) {
            case 0:
                GearActivity.a aVar = GearActivity.f35500b;
                lVar.getClass();
                ArrayList arrayList = (ArrayList) x3Var.getF182175a();
                if (arrayList != null) {
                    lVar.invoke(arrayList);
                    vVar.a().f(null, "ManageCollectionGearScreen_SelectedGear");
                }
                break;
            case 1:
                GearActivity.a aVar2 = GearActivity.f35500b;
                lVar.getClass();
                qk0.d dVar = (qk0.d) x3Var.getF182175a();
                if (dVar != null) {
                    lVar.invoke(dVar);
                    vVar.a().f(null, "MultiActivitySelectionScreen_Selected");
                }
                break;
            case 2:
                GearActivity.a aVar3 = GearActivity.f35500b;
                lVar.getClass();
                qk0.d dVar2 = (qk0.d) x3Var.getF182175a();
                if (dVar2 != null) {
                    lVar.invoke(dVar2);
                    vVar.a().f(null, "MultiActivitySelectionScreen_Selected");
                }
                break;
            case 3:
                GearActivity.a aVar4 = GearActivity.f35500b;
                lVar.getClass();
                pk0.f fVar = (pk0.f) x3Var.getF182175a();
                if (fVar != null) {
                    lVar.invoke(fVar);
                    vVar.a().f(null, "BrandModelSelectionResult");
                }
                break;
            case 4:
                GearActivity.a aVar5 = GearActivity.f35500b;
                lVar.getClass();
                qk0.d dVar3 = (qk0.d) x3Var.getF182175a();
                if (dVar3 != null) {
                    lVar.invoke(dVar3);
                    vVar.a().f(null, "MultiActivitySelectionScreen_Selected");
                }
                break;
            case 5:
                GearActivity.a aVar6 = GearActivity.f35500b;
                lVar.getClass();
                pk0.f fVar2 = (pk0.f) x3Var.getF182175a();
                if (fVar2 != null) {
                    lVar.invoke(fVar2);
                    vVar.a().f(null, "BrandModelSelectionResult");
                }
                break;
            case 6:
                GearActivity.a aVar7 = GearActivity.f35500b;
                lVar.getClass();
                ArrayList arrayList2 = (ArrayList) x3Var.getF182175a();
                if (arrayList2 != null) {
                    lVar.invoke(arrayList2);
                    vVar.a().f(null, "ManageCollectionGearScreen_SelectedGear");
                }
                break;
            case 7:
                GearActivity.a aVar8 = GearActivity.f35500b;
                lVar.getClass();
                qk0.d dVar4 = (qk0.d) x3Var.getF182175a();
                if (dVar4 != null) {
                    lVar.invoke(dVar4);
                    vVar.a().f(null, "MultiActivitySelectionScreen_Selected");
                }
                break;
            case 8:
                GearActivity.a aVar9 = GearActivity.f35500b;
                lVar.getClass();
                qk0.d dVar5 = (qk0.d) x3Var.getF182175a();
                if (dVar5 != null) {
                    lVar.invoke(dVar5);
                    vVar.a().f(null, "MultiActivitySelectionScreen_Selected");
                }
                break;
            default:
                GearActivity.a aVar10 = GearActivity.f35500b;
                lVar.getClass();
                pk0.f fVar3 = (pk0.f) x3Var.getF182175a();
                if (fVar3 != null) {
                    lVar.invoke(fVar3);
                    vVar.a().f(null, "BrandModelSelectionResult");
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
