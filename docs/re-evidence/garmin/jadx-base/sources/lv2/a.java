package lv2;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import cx2.g;
import cx2.h;
import gw2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;
import p13.x;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llv2/a;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2189a f115048a = new C2189a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f115049b = new h("SelectionClickHelper", null, 2, null);

    /* JADX INFO: renamed from: lv2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llv2/a$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2189a {
        public /* synthetic */ C2189a(j jVar) {
            this();
        }

        public static void a(Fragment fragment, List list, dx2.c cVar, Map map, String str) {
            Map map2;
            list.getClass();
            cVar.getClass();
            rw2.a aVar = cVar.f61484a;
            a.f115049b.getClass();
            m mVarRequireActivity = fragment.requireActivity();
            mVarRequireActivity.getClass();
            View currentFocus = mVarRequireActivity.getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
                return;
            }
            rw2.a aVar2 = new rw2.a();
            Iterator it = list.iterator();
            int i14 = 0;
            while (true) {
                Map map3 = null;
                if (!it.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        Map map4 = (Map) obj;
                        i iVar = i.TYPE;
                        if (s.g(map4.get(iVar.f79975a), gw2.j.SELECTION_ITEM.f80000a) || s.g(map4.get(iVar.f79975a), gw2.j.HEADER.f80000a)) {
                            arrayList.add(obj);
                        }
                    }
                    aVar2.f154866f = new ArrayList(arrayList);
                    aVar2.f154868h = dx2.c.S4(map);
                    aVar2.f154869i = aVar.f154869i;
                    Map<String, Object> map5 = aVar.f154867g;
                    map5.getClass();
                    aVar2.f154867g = map5;
                    Map mapT4 = dx2.c.T4(map);
                    Object obj2 = mapT4 != null ? mapT4.get(i.TITLE.f79975a) : null;
                    try {
                        if (!(obj2 instanceof Map)) {
                            obj2 = null;
                        }
                        map2 = (Map) obj2;
                    } catch (ClassCastException unused) {
                        map2 = null;
                    }
                    tv2.c cVarB = map2 == null ? null : g.b(map2);
                    if (cVarB == null) {
                        cVarB = dx2.c.M4(map);
                    }
                    aVar2.f154864d = cVarB;
                    aVar2.f154871k = aVar.f154871k;
                    aVar2.f154872l = aVar.f154872l;
                    aVar2.f154865e = dx2.c.b5(map);
                    if (str != null) {
                        aVar.f154870j = str;
                    }
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
                Map map6 = (Map) next;
                try {
                    if (y0.h(map6)) {
                        map3 = map6;
                    }
                } catch (ClassCastException unused2) {
                }
                if (map3 != null) {
                    map3.put(i.INDEX.f79975a, Integer.valueOf(i14));
                }
                i14 = i16;
            }
        }

        private C2189a() {
        }
    }
}
