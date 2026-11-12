package js0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import yr0.j;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljs0/c;", "Lcom/garmin/android/apps/connectmobile/f1;", "Ljs0/g;", "interval", "Lkotlin/Function1;", "", "", "onItemSelected", "<init>", "(Ljs0/g;Le23/l;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f100616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Integer, Unit> f100617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f100618e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(g gVar, l<? super Integer, Unit> lVar) {
        gVar.getClass();
        lVar.getClass();
        this.f100616c = gVar;
        this.f100617d = lVar;
        this.f100618e = new ArrayList();
    }

    public final void A(Long l14) {
        Object next;
        ArrayList arrayList = this.f100618e;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((o) next).f199036a, l14));
        o oVar = (o) next;
        if (oVar != null) {
            int iIndexOf = arrayList.indexOf(oVar);
            arrayList.remove(oVar);
            notifyItemRemoved(iIndexOf);
        }
    }

    public final void B(List<o> list) {
        ArrayList arrayList = this.f100618e;
        arrayList.clear();
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final int u() {
        return this.f100618e.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        j jVar;
        if (f0Var instanceof f) {
            f fVar = (f) f0Var;
            ks0.c cVar = fVar.f100637a;
            o oVar = (o) this.f100618e.get(i14);
            if (this.f100616c == g.UPCOMING) {
                ns0.b.f127812a.getClass();
                if (!ns0.b.q(oVar)) {
                    yr0.f fVar2 = oVar.f199041f;
                    int severity = fVar2 != null ? fVar2.getSeverity() : -1;
                    String strG = cVar.g(Integer.valueOf(severity), null);
                    TextView textView = fVar.f100641e;
                    textView.setText(strG);
                    v22.e.v(textView, severity >= 1);
                }
            }
            TextView textView2 = fVar.f100639c;
            TextView textView3 = fVar.f100638b;
            oVar.getClass();
            ns0.b bVar = ns0.b.f127812a;
            List<j> list = oVar.f199040e;
            String originLocation = (list == null || (jVar = (j) h0.d0(list)) == null) ? null : jVar.getOriginLocation();
            bVar.getClass();
            String strE = ns0.b.e(originLocation);
            String strF = ns0.b.f(oVar);
            p pVarL = ns0.b.l(oVar);
            cVar.getClass();
            textView3.setText(strE + " - " + strF);
            textView3.setVisibility(0);
            textView2.setText(cVar.a(pVarL != null ? (DateTime) pVarL.f128594a : null, pVarL != null ? (DateTime) pVarL.f128595b : null));
            textView2.setVisibility(0);
            v22.e.v(fVar.f100640d, ns0.b.q(oVar));
            fVar.itemView.setOnClickListener(new b0(this, i14, 10));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        f.f100636f.getClass();
        View viewInflate = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(R.layout.gcm_trip_list_item, viewGroup, false);
        viewInflate.getClass();
        return new f(viewInflate);
    }
}
