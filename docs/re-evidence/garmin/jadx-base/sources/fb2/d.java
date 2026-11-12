package fb2;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class d<T> extends b0 implements GCMCheckableRow.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f70339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<GCMCheckableRow> f70340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f70341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMCheckableRow f70342e;

    public d(View view2, Activity activity, b0.a aVar) {
        super(aVar);
        this.f70339b = new HashMap();
        this.f70340c = new SparseArray<>();
        if (activity == null) {
            vb.h.s("Activity is required");
            throw null;
        }
        if (view2 != null) {
            this.f70341d = view2;
        } else {
            vb.h.s("View container is required");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow.b
    public final void a(View view2, boolean z14) {
        Object next;
        int id3 = view2.getId();
        Integer numValueOf = Integer.valueOf(id3);
        HashMap map = this.f70339b;
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
                GCMCheckableRow gCMCheckableRow = this.f70342e;
                if (gCMCheckableRow != null) {
                    gCMCheckableRow.c(false);
                }
                GCMCheckableRow gCMCheckableRow2 = this.f70340c.get(id3);
                this.f70342e = gCMCheckableRow2;
                if (gCMCheckableRow2 != null) {
                    gCMCheckableRow2.c(true);
                }
            }
            i2.l("CheckableListViewSingleLineRowDecorator", "onCheckedChanged(): notifyListener with selectedOption=" + next);
            f(next);
        }
    }

    @Override // fb2.b0
    public final boolean b() {
        return b0.c(this.f70341d);
    }

    @Override // fb2.b0
    public final boolean d() {
        return b0.e(this.f70341d);
    }

    @Override // fb2.b0
    public final void h(boolean z14) {
        b0.g(this.f70341d, z14);
    }

    @Override // fb2.b0
    public final void j(boolean z14) {
        b0.i(this.f70341d, z14);
    }
}
