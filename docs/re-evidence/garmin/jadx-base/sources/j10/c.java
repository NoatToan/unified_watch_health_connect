package j10;

import am.x0;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeSubTypeSelectionFragment;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupActivityFeedTypeSubTypeSelectionFragment f96349b;

    public /* synthetic */ c(GroupActivityFeedTypeSubTypeSelectionFragment groupActivityFeedTypeSubTypeSelectionFragment, int i14) {
        this.f96348a = i14;
        this.f96349b = groupActivityFeedTypeSubTypeSelectionFragment;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0071, please report this as an issue */
    @Override // e23.l
    public final Object invoke(Object obj) {
        com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar;
        int i14 = this.f96348a;
        Object obj2 = null;
        GroupActivityFeedTypeSubTypeSelectionFragment groupActivityFeedTypeSubTypeSelectionFragment = this.f96349b;
        List list = (List) obj;
        switch (i14) {
            case 0:
                int i15 = GroupActivityFeedTypeSubTypeSelectionFragment.f31397f;
                list.getClass();
                GroupActivityFeedTypeSubTypeSelectionFragment.d dVar = groupActivityFeedTypeSubTypeSelectionFragment.f31399b;
                if (dVar != null) {
                    dVar.t(list);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            default:
                int i16 = GroupActivityFeedTypeSubTypeSelectionFragment.f31397f;
                com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVarU6 = groupActivityFeedTypeSubTypeSelectionFragment.u6();
                if (bVarU6 == null) {
                    return Unit.INSTANCE;
                }
                list.getClass();
                com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVarD = com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b.d(bVarU6, list);
                com.garmin.android.apps.connectmobile.connections.groups.details.a aVar = (com.garmin.android.apps.connectmobile.connections.groups.details.a) groupActivityFeedTypeSubTypeSelectionFragment.f31400c.getValue();
                x0 x0Var = bVarD.f31474b;
                y0<List<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a>> y0Var = aVar.f31467c;
                List<com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a> listD = y0Var.d();
                if (listD == null) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.f(a2Var, "GroupActivityFeedTypeViewModel", "fullActivityTypeList value is null");
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listD) {
                        if (obj3 instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) {
                            arrayList.add(obj3);
                        }
                    }
                    for (Object obj4 : arrayList) {
                        if (((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) obj4).f31474b == x0Var) {
                            obj2 = obj4;
                            bVar = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) obj2;
                            if (bVar == null) {
                                i2.a aVar3 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar3.getClass();
                                i2.a.f(a2Var2, "GroupActivityFeedTypeViewModel", "Did not find subType item: " + x0Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList(listD);
                                arrayList2.set(arrayList2.indexOf(bVar), com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b.d(bVar, bVarD.f31476d));
                                y0Var.j(arrayList2);
                            }
                        }
                    }
                    bVar = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) obj2;
                    if (bVar == null) {
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var3, "GroupActivityFeedTypeViewModel", "Did not find subType item: " + x0Var);
                    } else {
                        ArrayList arrayList3 = new ArrayList(listD);
                        arrayList3.set(arrayList3.indexOf(bVar), com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b.d(bVar, bVarD.f31476d));
                        y0Var.j(arrayList3);
                    }
                }
                NavHostFragment.f10124e.getClass();
                NavHostFragment.a.a(groupActivityFeedTypeSubTypeSelectionFragment).n();
                return Unit.INSTANCE;
        }
    }
}
