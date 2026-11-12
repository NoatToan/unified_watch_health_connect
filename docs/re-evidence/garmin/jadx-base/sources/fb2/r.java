package fb2;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableTwoLineRow;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r<T, V> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70372e;

    public r(Context context) {
        super(context);
        this.f70371d = null;
        this.f70372e = false;
    }

    @Override // fb2.e
    public final View a() {
        if (this.f70371d == null) {
            View viewInflate = LayoutInflater.from(this.f70343a).inflate(R.layout.gcm3_single_line_checkable, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.single_line_checkable_container);
            linearLayout.setId(t());
            TextView textView = (TextView) viewInflate.findViewById(R.id.header);
            int iW = w();
            if (iW > 0) {
                textView.setText(iW);
            } else {
                textView.setVisibility(8);
            }
            V[] vArrV = v(this.f70344b);
            Map<V, CharSequence> mapR = r(vArrV);
            Map<V, Integer> mapX = x();
            Context context = this.f70343a;
            int i14 = 0;
            if (this.f70372e) {
                Map<V, CharSequence> mapQ = q(vArrV);
                while (i14 < vArrV.length) {
                    V v14 = vArrV[i14];
                    GCMCheckableTwoLineRow gCMCheckableTwoLineRow = new GCMCheckableTwoLineRow(context);
                    gCMCheckableTwoLineRow.setId(mapX.get(v14).intValue());
                    gCMCheckableTwoLineRow.setTopLabel(mapR.get(v14).toString());
                    if (mapQ != null) {
                        gCMCheckableTwoLineRow.setBottomLabel(((CharSequence) ((HashMap) mapQ).get(v14)).toString());
                    }
                    linearLayout.addView(gCMCheckableTwoLineRow);
                    i14++;
                }
            } else {
                while (i14 < vArrV.length) {
                    V v15 = vArrV[i14];
                    GCMCheckableRow gCMCheckableRow = new GCMCheckableRow(context);
                    gCMCheckableRow.setId(mapX.get(v15).intValue());
                    gCMCheckableRow.setDefaultText(mapR.get(v15).toString());
                    linearLayout.addView(gCMCheckableRow);
                    i14++;
                }
            }
            String strU = u();
            if (!TextUtils.isEmpty(strU)) {
                linearLayout.addView(g.c(context, strU));
            }
            this.f70371d = viewInflate;
        }
        return this.f70371d;
    }

    @Override // fb2.e
    public boolean g(i.c cVar, T t7) {
        View viewFindViewById = cVar.findViewById(t());
        if (viewFindViewById != null) {
            this.f70371d = viewFindViewById;
            o(viewFindViewById);
            return y(viewFindViewById, cVar, t7);
        }
        this.f70344b = t7;
        View viewA = a();
        o(viewA);
        return y(viewA, cVar, t7);
    }

    @Override // fb2.e
    public final boolean k(T t7) {
        if (t7 == null) {
            vb.h.s("Model is required");
            return false;
        }
        if (!d()) {
            vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
            return false;
        }
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH) {
            boolean z14 = this.f70372e;
            b0 b0Var = this.f70345c;
            if (z14) {
                ((c) b0Var).k(s(t7), x());
                return zH;
            }
            d dVar = (d) b0Var;
            V vS = s(t7);
            V[] vArrV = v(t7);
            Map<V, Integer> mapX = x();
            SparseArray<GCMCheckableRow> sparseArray = dVar.f70340c;
            HashMap map = dVar.f70339b;
            if (vS == null) {
                vb.h.s("Current field value is required");
                return false;
            }
            if (vArrV == null || vArrV.length == 0) {
                vb.h.s("Field values are required");
                return false;
            }
            if (mapX == null || mapX.size() == 0) {
                vb.h.s("Field view ID dictionary is required");
                return false;
            }
            map.clear();
            map.putAll(mapX);
            sparseArray.clear();
            for (V v14 : vArrV) {
                int iIntValue = mapX.get(v14).intValue();
                GCMCheckableRow gCMCheckableRow = (GCMCheckableRow) dVar.f70341d.findViewById(iIntValue);
                gCMCheckableRow.c(false);
                gCMCheckableRow.setOnCheckChangeListener(dVar);
                sparseArray.put(iIntValue, gCMCheckableRow);
            }
            int iIntValue2 = map.containsKey(vS) ? ((Integer) map.get(vS)).intValue() : -1;
            if (iIntValue2 != -1) {
                GCMCheckableRow gCMCheckableRow2 = dVar.f70342e;
                if (gCMCheckableRow2 != null) {
                    gCMCheckableRow2.c(false);
                }
                GCMCheckableRow gCMCheckableRow3 = dVar.f70340c.get(iIntValue2);
                dVar.f70342e = gCMCheckableRow3;
                if (gCMCheckableRow3 != null) {
                    gCMCheckableRow3.c(true);
                    return zH;
                }
            }
        }
        return zH;
    }

    public Map<V, CharSequence> q(V[] vArr) {
        return null;
    }

    public abstract Map<V, CharSequence> r(V[] vArr);

    public abstract V s(T t7);

    public abstract int t();

    public String u() {
        return null;
    }

    public abstract V[] v(T t7);

    public abstract int w();

    public abstract Map<V, Integer> x();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y(View view2, i.c cVar, Object obj) {
        q qVar = new q(this);
        if (this.f70372e) {
            this.f70345c = new c(view2, cVar, qVar);
        } else {
            this.f70345c = new d(view2, cVar, qVar);
        }
        return k(obj);
    }

    public abstract void z(V v14, T t7);
}
