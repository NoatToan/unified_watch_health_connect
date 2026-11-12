package n12;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122288b;

    public /* synthetic */ p(com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar, int i14) {
        this.f122287a = i14;
        this.f122288b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f122287a;
        com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar = this.f122288b;
        switch (i14) {
            case 0:
                List list = (List) obj;
                RecyclerView recyclerView = aVar.f46647e;
                if (recyclerView == null) {
                    p005kotlin.jvm.internal.s.m("avatarGridView");
                    throw null;
                }
                recyclerView.setAdapter(aVar.f46648f);
                RecyclerView recyclerView2 = aVar.f46647e;
                if (recyclerView2 == null) {
                    p005kotlin.jvm.internal.s.m("avatarGridView");
                    throw null;
                }
                recyclerView2.setHasFixedSize(true);
                com.garmin.android.apps.connectmobile.userprofile.editimage.g gVar = aVar.f46648f;
                if (gVar != null) {
                    ArrayList arrayList = gVar.f46710b;
                    if (list != null) {
                        arrayList.clear();
                        arrayList.addAll(list);
                        gVar.notifyItemRangeChanged(0, arrayList.size());
                    }
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                str.getClass();
                com.garmin.android.apps.connectmobile.userprofile.editimage.g gVar2 = aVar.f46648f;
                if (gVar2 != null) {
                    ArrayList arrayList2 = gVar2.f46710b;
                    ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((com.garmin.android.apps.connectmobile.userprofile.model.a) it.next()).getUuid());
                    }
                    int iIndexOf = arrayList3.indexOf(str);
                    if (iIndexOf >= 0) {
                        gVar2.r(iIndexOf);
                    }
                }
                return Unit.INSTANCE;
            default:
                int i16 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                ((Uri) obj).getClass();
                com.garmin.android.apps.connectmobile.userprofile.editimage.g gVar3 = aVar.f46648f;
                if (gVar3 != null) {
                    gVar3.r(-1);
                }
                return Unit.INSTANCE;
        }
    }
}
