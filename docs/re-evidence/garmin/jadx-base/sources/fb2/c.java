package fb2;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableTwoLineRow;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class c<T> extends b0 implements GCMCheckableTwoLineRow.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f70335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<GCMCheckableTwoLineRow> f70336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f70337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMCheckableTwoLineRow f70338e;

    public c(View view2, Activity activity, b0.a aVar) {
        super(aVar);
        this.f70335b = new HashMap();
        this.f70336c = new SparseArray<>();
        if (activity == null) {
            vb.h.s("Activity is required");
            throw null;
        }
        if (view2 != null) {
            this.f70337d = view2;
        } else {
            vb.h.s("View container is required");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableTwoLineRow.a
    public final void a(View view2, boolean z14) {
        Object next;
        int id3 = view2.getId();
        Integer numValueOf = Integer.valueOf(id3);
        HashMap map = this.f70335b;
        if (!map.containsValue(numValueOf)) {
            next = null;
            break;
        }
        Iterator it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Integer) map.get(next)).intValue() != id3);
        if (next != null) {
            if (id3 != -1) {
                GCMCheckableTwoLineRow gCMCheckableTwoLineRow = this.f70338e;
                if (gCMCheckableTwoLineRow != null) {
                    gCMCheckableTwoLineRow.b(false);
                }
                GCMCheckableTwoLineRow gCMCheckableTwoLineRow2 = this.f70336c.get(id3);
                this.f70338e = gCMCheckableTwoLineRow2;
                if (gCMCheckableTwoLineRow2 != null) {
                    gCMCheckableTwoLineRow2.b(true);
                }
            }
            i2.l("CheckableListViewDecorator", "onCheckedChanged(): notifyListener with selectedOption=" + next);
            f(next);
        }
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70337d);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70337d);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70337d, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70337d, z14);
    }

    public final void k(T t7, Map<T, Integer> map) {
        if (t7 == null) {
            vb.h.s("Current field value is required");
            return;
        }
        if (map == null || map.size() == 0) {
            vb.h.s("Field view ID dictionary is required");
            return;
        }
        HashMap map2 = this.f70335b;
        map2.clear();
        map2.putAll(map);
        SparseArray<GCMCheckableTwoLineRow> sparseArray = this.f70336c;
        sparseArray.clear();
        for (Integer num : map2.values()) {
            GCMCheckableTwoLineRow gCMCheckableTwoLineRow = (GCMCheckableTwoLineRow) this.f70337d.findViewById(num.intValue());
            gCMCheckableTwoLineRow.b(false);
            gCMCheckableTwoLineRow.setOnCheckChangeListener(this);
            sparseArray.put(num.intValue(), gCMCheckableTwoLineRow);
        }
        int iIntValue = ((Integer) map2.get(t7)).intValue();
        if (iIntValue != -1) {
            GCMCheckableTwoLineRow gCMCheckableTwoLineRow2 = this.f70338e;
            if (gCMCheckableTwoLineRow2 != null) {
                gCMCheckableTwoLineRow2.b(false);
            }
            GCMCheckableTwoLineRow gCMCheckableTwoLineRow3 = sparseArray.get(iIntValue);
            this.f70338e = gCMCheckableTwoLineRow3;
            if (gCMCheckableTwoLineRow3 != null) {
                gCMCheckableTwoLineRow3.b(true);
            }
        }
    }
}
