package kv2;

import android.view.View;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import cx2.h;
import cx2.i;
import gw2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;
import p13.x;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.c f106809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dx2.c f106810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f106811d;

    public /* synthetic */ a(com.garmin.realtimesettings.app.presentationlayer.c cVar, dx2.c cVar2, Map map, int i14) {
        this.f106808a = i14;
        this.f106809b = cVar;
        this.f106810c = cVar2;
        this.f106811d = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f106808a) {
            case 0:
                com.garmin.realtimesettings.app.presentationlayer.c cVar = this.f106809b;
                m mVarRequireActivity = cVar.requireActivity();
                mVarRequireActivity.getClass();
                View currentFocus = mVarRequireActivity.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                    return;
                }
                i.f56681a.getClass();
                if (!i.a.a(cVar)) {
                    return;
                }
                dx2.c cVar2 = this.f106810c;
                cVar2.getClass();
                Map map = this.f106811d;
                List listR4 = dx2.c.R4(map);
                rw2.a aVar = cVar2.f61484a;
                if (listR4 == null || listR4.isEmpty()) {
                    h hVar = b.f106813b;
                    dx2.c.P4(map);
                    hVar.getClass();
                    return;
                }
                rw2.a aVar2 = new rw2.a();
                Iterator it = listR4.iterator();
                int i14 = 0;
                while (true) {
                    Map map2 = null;
                    if (!it.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listR4) {
                            Map map3 = (Map) obj;
                            gw2.i iVar = gw2.i.TYPE;
                            if (s.g(map3.get(iVar.f79975a), j.MULTI_SELECTION_ITEM.f80000a) || s.g(map3.get(iVar.f79975a), j.HEADER.f80000a)) {
                                arrayList.add(obj);
                            }
                        }
                        aVar2.f154866f = new ArrayList(arrayList);
                        aVar2.f154868h = dx2.c.S4(map);
                        aVar2.f154869i = aVar.f154869i;
                        Map<String, Object> map4 = aVar.f154867g;
                        map4.getClass();
                        aVar2.f154867g = map4;
                        aVar2.f154864d = dx2.c.M4(map);
                        aVar2.f154871k = aVar.f154871k;
                        aVar2.f154872l = aVar.f154872l;
                        com.garmin.realtimesettings.app.presentationlayer.c.a aVar3 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                        int i15 = aVar2.f154869i;
                        aVar3.getClass();
                        com.garmin.realtimesettings.app.presentationlayer.c cVarA = com.garmin.realtimesettings.app.presentationlayer.c.a.a(aVar2, i15, false);
                        v supportFragmentManager = mVarRequireActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager);
                        aVar4.l(R.id.settings_fragment_container, cVarA, null);
                        aVar4.d(cVarA.getTag());
                        aVar4.e();
                        return;
                    }
                    Object next = it.next();
                    int i16 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    Map map5 = (Map) next;
                    try {
                        if (y0.h(map5)) {
                            map2 = map5;
                        }
                    } catch (ClassCastException unused) {
                    }
                    if (map2 != null) {
                        map2.put(gw2.i.INDEX.f79975a, Integer.valueOf(i14));
                    }
                    i14 = i16;
                }
                break;
            default:
                i.f56681a.getClass();
                com.garmin.realtimesettings.app.presentationlayer.c cVar3 = this.f106809b;
                if (i.a.a(cVar3)) {
                    dx2.c cVar4 = this.f106810c;
                    cVar4.getClass();
                    Map<String, ? extends Object> map6 = this.f106811d;
                    List listR5 = dx2.c.R4(map6);
                    if (listR5 != null && !listR5.isEmpty()) {
                        cVar4.U4(map6);
                        lv2.a.f115049b.getClass();
                        lv2.a.f115048a.getClass();
                        lv2.a.C2189a.a(cVar3, listR5, cVar4, map6, null);
                        return;
                    }
                    lv2.a.f115049b.d(null, "setSingleLabelSelectionClickListener: Did not get selection options for " + map6 + ".");
                    return;
                }
                return;
        }
    }
}
