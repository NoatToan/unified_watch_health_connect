package b30;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.e f15506b;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.courses.model.e eVar, int i14) {
        this.f15505a = i14;
        this.f15506b = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f15505a;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f15506b;
        List list = (List) obj;
        switch (i14) {
            case 0:
                list.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    eVar.b((com.garmin.android.apps.connectmobile.courses.model.g) it.next());
                }
                break;
            case 1:
                list.getClass();
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        eVar.f((com.garmin.android.apps.connectmobile.courses.model.g) it3.next());
                    }
                }
                break;
            case 2:
                list.getClass();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    eVar.b((com.garmin.android.apps.connectmobile.courses.model.g) it4.next());
                }
                break;
            case 3:
                int i15 = z20.d.f201889b;
                list.getClass();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    eVar.b((com.garmin.android.apps.connectmobile.courses.model.g) it5.next());
                }
                break;
            default:
                int i16 = z20.d.f201889b;
                list.getClass();
                if (!list.isEmpty()) {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        eVar.f((com.garmin.android.apps.connectmobile.courses.model.g) it6.next());
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
