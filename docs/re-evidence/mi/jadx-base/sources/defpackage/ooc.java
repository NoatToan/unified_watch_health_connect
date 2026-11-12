package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import miuix.appcompat.internal.view.menu.f;
import miuix.appcompat.view.menu.HyperMenuContract$CheckableType;

/* JADX INFO: loaded from: classes3.dex */
public class ooc extends znc {
    public View d;
    public Map<Integer, Boolean[]> e;

    public ooc(LayoutInflater layoutInflater, List<eoc> list, Map<Integer, Boolean[]> map) {
        super(layoutInflater, list);
        this.e = map;
    }

    @Override // defpackage.znc, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (i == 0) {
            view2.setId(vsi.k0);
            this.d = view2;
        }
        return view2;
    }

    public void i(int i) {
        List<eoc> list = this.f41486a;
        if (list == null || list.size() <= 2) {
            return;
        }
        int iA = this.f41486a.get(0).a();
        Boolean[] boolArr = this.e.get(Integer.valueOf(iA));
        if (boolArr == null) {
            boolArr = new Boolean[this.f41486a.size() - 2];
        }
        for (int i2 = 0; i2 < this.f41486a.size(); i2++) {
            eoc eocVar = this.f41486a.get(i2);
            foc focVar = eocVar instanceof foc ? (foc) eocVar : null;
            f fVarB = focVar != null ? focVar.b() : null;
            if (fVarB != null && fVarB.isCheckable() && !focVar.f && i2 >= 2) {
                int i3 = i2 - 2;
                Boolean boolValueOf = Boolean.valueOf(focVar.a() == i);
                boolArr[i3] = boolValueOf;
                focVar.d = Boolean.TRUE.equals(boolValueOf) ? HyperMenuContract$CheckableType.CHECKED : HyperMenuContract$CheckableType.NOT_CHECKED;
                fVarB.setChecked(focVar.c());
            }
        }
        this.e.put(Integer.valueOf(iA), boolArr);
        notifyDataSetChanged();
    }
}
