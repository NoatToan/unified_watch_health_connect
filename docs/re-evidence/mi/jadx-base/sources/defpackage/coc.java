package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.f;
import miuix.appcompat.internal.view.menu.j;
import miuix.appcompat.view.menu.HyperMenuContract$CheckableType;

/* JADX INFO: loaded from: classes3.dex */
public class coc extends znc {
    public List<eoc> d = new ArrayList();
    public Map<Integer, BaseAdapter> e = new HashMap();
    public Map<Integer, ArrayList<eoc>> f = new HashMap();
    public Map<Integer, Boolean> g = new HashMap();
    public Map<Integer, Boolean[]> h = new HashMap();
    public boolean i;

    public coc(Context context, d dVar, boolean z) {
        this.f41487b = LayoutInflater.from(context);
        this.f41486a = this.d;
        this.i = z;
        if (dVar != null) {
            m(dVar);
        }
    }

    @Override // defpackage.znc
    public eoc a(int i) {
        return this.d.get(i);
    }

    @Override // defpackage.znc, android.widget.Adapter
    /* JADX INFO: renamed from: b */
    public MenuItem getItem(int i) {
        return this.d.get(i).b();
    }

    @Override // defpackage.znc, android.widget.Adapter
    public long getItemId(int i) {
        return this.d.get(i).a();
    }

    public final void i(Map<Integer, ArrayList<eoc>> map, ArrayList<f> arrayList) {
        int intExtra;
        for (int i = 0; i < arrayList.size(); i++) {
            f fVar = arrayList.get(i);
            int groupId = fVar.getGroupId();
            Intent intent = fVar.getIntent();
            if (intent != null) {
                groupId = intent.getIntExtra("miuix:hyperMenu:groupId", fVar.getGroupId());
                intExtra = intent.getIntExtra("miuix:hyperMenu:itemForeignKey", -1);
            } else {
                intExtra = -1;
            }
            ArrayList<eoc> arrayList2 = map.get(Integer.valueOf(groupId));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            foc focVar = new foc(fVar);
            if (intExtra != -1) {
                focVar.c = true;
                focVar.e = intExtra;
            } else {
                focVar.c = false;
                focVar.e = -1;
            }
            arrayList2.add(focVar);
            map.put(Integer.valueOf(groupId), arrayList2);
        }
    }

    public final void j(Map<Integer, ArrayList<eoc>> map, ArrayList<f> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            f fVar = arrayList.get(i);
            Intent intent = fVar.getIntent();
            int intExtra = intent != null ? intent.getIntExtra("miuix:hyperMenu:groupForeignKey", -1) : -1;
            if (intExtra != -1) {
                ArrayList<eoc> arrayList2 = map.get(Integer.valueOf(fVar.getGroupId()));
                eoc eocVarQ = q(this.d, intExtra);
                if (arrayList2 != null && eocVarQ != null && eocVarQ.b() != null) {
                    ArrayList arrayList3 = new ArrayList(arrayList2);
                    s(arrayList3, false, eocVarQ.b().getItemId());
                    foc focVar = new foc(eocVarQ.b());
                    focVar.f = true;
                    arrayList3.add(0, focVar);
                    arrayList3.add(1, new doc());
                    this.e.put(Integer.valueOf(eocVarQ.a()), new ooc(this.f41487b, arrayList3, this.h));
                }
            }
        }
    }

    public final void k(Map<Integer, ArrayList<eoc>> map, ArrayList<f> arrayList, ArrayList<Integer> arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            f fVar = arrayList.get(i);
            int groupId = fVar.getGroupId();
            if (!arrayList2.contains(Integer.valueOf(groupId))) {
                arrayList2.add(Integer.valueOf(groupId));
            }
            ArrayList<eoc> arrayList3 = map.get(Integer.valueOf(groupId));
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>();
            }
            boolean zHasSubMenu = fVar.hasSubMenu();
            foc focVar = new foc(fVar);
            focVar.c = zHasSubMenu;
            arrayList3.add(focVar);
            map.put(Integer.valueOf(groupId), arrayList3);
            ArrayList<eoc> arrayListL = (zHasSubMenu && (fVar.getSubMenu() instanceof j)) ? l((j) fVar.getSubMenu(), fVar.getItemId()) : null;
            if (arrayListL != null) {
                foc focVar2 = new foc(fVar);
                focVar2.f = true;
                arrayListL.add(0, focVar2);
                arrayListL.add(1, new doc());
                this.e.put(Integer.valueOf(fVar.getItemId()), new ooc(this.f41487b, arrayListL, this.h));
            }
        }
    }

    public final ArrayList<eoc> l(j jVar, int i) {
        boolean z;
        if (jVar != null && i != -1) {
            ArrayList<eoc> arrayList = new ArrayList<>();
            ArrayList<f> arrayListC = jVar.C();
            if (arrayListC != null && arrayListC.size() != 0) {
                Boolean[] boolArr = this.h.get(Integer.valueOf(i));
                if (boolArr == null) {
                    boolArr = new Boolean[arrayListC.size()];
                    z = true;
                } else {
                    z = false;
                }
                for (int i2 = 0; i2 < arrayListC.size(); i2++) {
                    f fVar = arrayListC.get(i2);
                    if (z) {
                        boolArr[i2] = Boolean.valueOf(fVar.isChecked());
                    }
                    foc focVar = new foc(fVar);
                    if (fVar != null && fVar.isCheckable()) {
                        focVar.d = Boolean.TRUE.equals(boolArr[i2]) ? HyperMenuContract$CheckableType.CHECKED : HyperMenuContract$CheckableType.NOT_CHECKED;
                        fVar.setChecked(focVar.c());
                    }
                    arrayList.add(focVar);
                }
                this.h.put(Integer.valueOf(i), boolArr);
                return arrayList;
            }
        }
        return null;
    }

    public final void m(d dVar) {
        Map<Integer, BaseAdapter> map;
        if (dVar == null || (map = this.e) == null || this.d == null || this.f == null) {
            return;
        }
        map.clear();
        this.d.clear();
        this.f.clear();
        ArrayList<f> arrayListX = this.i ? dVar.x() : dVar.C();
        if (arrayListX != null) {
            i(this.f, arrayListX);
        }
        w(this.f);
        if (arrayListX != null) {
            j(this.f, arrayListX);
        }
    }

    public final void n(d dVar) {
        List<eoc> list;
        if (dVar == null || this.e == null || (list = this.d) == null || this.f == null) {
            return;
        }
        list.clear();
        this.e.clear();
        this.f.clear();
        ArrayList<f> arrayListX = this.i ? dVar.x() : dVar.C();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (arrayListX != null) {
            k(this.f, arrayListX, arrayList);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList<eoc> arrayList2 = this.f.get(arrayList.get(i));
            List<eoc> list2 = this.d;
            list2.addAll(list2.size(), arrayList2);
            this.d.add(new doc());
        }
        List<eoc> list3 = this.d;
        list3.remove(list3.size() - 1);
        s(this.d, true, -1);
    }

    public void o(Map<Integer, Boolean> map) {
        Map<Integer, Boolean> map2;
        if (map == null || (map2 = this.g) == null) {
            return;
        }
        for (Integer num : map2.keySet()) {
            num.intValue();
            Boolean bool = this.g.get(num);
            if (bool != null) {
                map.put(num, bool);
            }
        }
    }

    public void p(Map<Integer, Boolean[]> map) {
        Map<Integer, Boolean[]> map2;
        if (map == null || (map2 = this.h) == null) {
            return;
        }
        for (Integer num : map2.keySet()) {
            num.intValue();
            Boolean[] boolArr = this.h.get(num);
            Boolean[] boolArr2 = new Boolean[boolArr.length];
            System.arraycopy(boolArr, 0, boolArr2, 0, boolArr.length);
            map.put(num, boolArr2);
        }
    }

    public final eoc q(List<eoc> list, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                return null;
            }
            eoc eocVar = list.get(i2);
            Intent intent = eocVar.b() != null ? eocVar.b().getIntent() : null;
            int intExtra = intent != null ? intent.getIntExtra("miuix:hyperMenu:itemForeignKey", -1) : -1;
            if (intExtra != -1 && intExtra == i) {
                return eocVar;
            }
            i2++;
        }
    }

    public BaseAdapter r(long j) {
        return this.e.get(Integer.valueOf((int) j));
    }

    public final void s(List<eoc> list, boolean z, int i) {
        if (list == null || list.size() == 0) {
            return;
        }
        boolean z2 = true;
        boolean z3 = (z || i == -1) ? false : true;
        Boolean[] boolArr = z3 ? this.h.get(Integer.valueOf(i)) : null;
        if (z3 && boolArr == null) {
            boolArr = new Boolean[list.size()];
        } else {
            z2 = false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            eoc eocVar = list.get(i2);
            f fVarB = eocVar instanceof foc ? eocVar.b() : null;
            if (fVarB == null || !fVarB.isCheckable()) {
                if (z) {
                    this.g.put(Integer.valueOf(i2), Boolean.FALSE);
                }
            } else if (z) {
                Boolean bool = this.g.get(Integer.valueOf(i2));
                this.g.put(Integer.valueOf(i2), Boolean.valueOf(bool != null ? bool.booleanValue() : fVarB.isChecked()));
                ((foc) eocVar).d = Boolean.TRUE.equals(this.g.get(Integer.valueOf(i2))) ? HyperMenuContract$CheckableType.CHECKED : HyperMenuContract$CheckableType.NOT_CHECKED;
            } else if (z3) {
                if (z2) {
                    boolArr[i2] = Boolean.valueOf(fVarB.isChecked());
                }
                ((foc) eocVar).d = Boolean.TRUE.equals(boolArr[i2]) ? HyperMenuContract$CheckableType.CHECKED : HyperMenuContract$CheckableType.NOT_CHECKED;
            }
        }
        if (z3) {
            this.h.put(Integer.valueOf(i), boolArr);
        }
    }

    public void t(Map<Integer, Boolean> map) {
        if (map == null) {
            return;
        }
        for (Integer num : map.keySet()) {
            num.intValue();
            this.g.put(num, map.get(num));
        }
    }

    public void u(Map<Integer, Boolean[]> map) {
        if (map == null) {
            return;
        }
        for (Integer num : map.keySet()) {
            num.intValue();
            this.h.put(num, map.get(num));
        }
    }

    public void v(int i, int i2) {
        eoc eocVar;
        f fVarB;
        f fVarB2;
        List<eoc> list = this.d;
        if (list == null || list.size() == 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.d.size()) {
                eocVar = null;
                break;
            }
            eocVar = this.d.get(i3);
            if (eocVar.a() == i) {
                break;
            } else {
                i3++;
            }
        }
        if (eocVar == null || (fVarB = eocVar.b()) == null) {
            return;
        }
        Intent intent = fVarB.getIntent();
        ArrayList<eoc> arrayList = this.f.get(Integer.valueOf(intent != null ? intent.getIntExtra("miuix:hyperMenu:groupId", fVarB.getGroupId()) : fVarB.getGroupId()));
        int i4 = -1;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            eoc eocVar2 = arrayList.get(i5);
            foc focVar = eocVar2 instanceof foc ? (foc) eocVar2 : null;
            if (focVar != null) {
                fVarB2 = focVar.b();
                if (focVar.a() == i) {
                    i4 = i5;
                }
            } else {
                fVarB2 = null;
            }
            if (fVarB2 != null && fVarB2.isCheckable() && !focVar.c) {
                focVar.d = focVar.a() == i ? HyperMenuContract$CheckableType.CHECKED : HyperMenuContract$CheckableType.NOT_CHECKED;
                fVarB2.setChecked(focVar.c());
            }
        }
        if (i4 != -1) {
            int i6 = i2 - i4;
            int size = ((i2 + arrayList.size()) - i4) - 1;
            int i7 = i6;
            while (i7 >= i6 && i7 <= size) {
                this.g.put(Integer.valueOf(i7), Boolean.valueOf(i7 == i6 + i4));
                i7++;
            }
        }
        notifyDataSetChanged();
    }

    public final void w(Map<Integer, ArrayList<eoc>> map) {
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            ArrayList<eoc> arrayList = map.get(it.next());
            if (arrayList != null && arrayList.size() > 0 && arrayList.get(0).b().getGroupId() == 0) {
                List<eoc> list = this.d;
                list.addAll(list.size(), arrayList);
                this.d.add(new doc());
            }
        }
        List<eoc> list2 = this.d;
        list2.remove(list2.size() - 1);
        s(this.d, true, -1);
    }

    public void x(d dVar) {
        y(dVar, false);
    }

    public void y(d dVar, boolean z) {
        if (z) {
            m(dVar);
        } else {
            n(dVar);
        }
        notifyDataSetChanged();
    }
}
