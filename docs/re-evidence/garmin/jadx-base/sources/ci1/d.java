package ci1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.y;
import com.garmin.android.apps.connectmobile.devices.model.z;
import fb2.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lci1/d;", "Lfb2/t;", "Lcom/garmin/android/apps/connectmobile/devices/model/z;", "Lcom/garmin/android/apps/connectmobile/devices/model/y;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends t<z, y> {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        z zVar = (z) obj;
        zVar.getClass();
        return zVar.f34343c != null;
    }

    @Override // fb2.t
    public final Map<y, CharSequence> q(y[] yVarArr) {
        y[] yVarArr2 = yVarArr;
        yVarArr2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (y yVar : yVarArr2) {
            if (yVar.f34330c) {
                y.c.a aVar = y.c.f34331c;
                String str = yVar.f34328a;
                aVar.getClass();
                Integer numA = y.c.a.a(str);
                if (numA != null) {
                    linkedHashMap.put(yVar, b(numA.intValue()));
                }
                if (yVar.f34329b == -1) {
                    linkedHashMap.put(yVar, this.f70343a.getString(R.string.device_screen_last_displayed));
                }
            }
        }
        return linkedHashMap;
    }

    @Override // fb2.t
    public final y r(z zVar) {
        z zVar2 = zVar;
        zVar2.getClass();
        boolean z14 = zVar2.f34342b;
        List<y> list = zVar2.f34343c;
        boolean z15 = false;
        Object obj = null;
        if (z14) {
            if (list != null) {
                for (Object obj2 : list) {
                    if (((y) obj2).f34329b == -1) {
                        if (z15) {
                            h.s("Collection contains more than one matching element.");
                            return null;
                        }
                        obj = obj2;
                        z15 = true;
                    }
                }
                if (z15) {
                    return (y) obj;
                }
                j.s("Collection contains no element matching the predicate.");
                return null;
            }
        } else if (list != null) {
            for (Object obj3 : list) {
                if (((y) obj3).f34329b == 0) {
                    if (z15) {
                        h.s("Collection contains more than one matching element.");
                        return null;
                    }
                    obj = obj3;
                    z15 = true;
                }
            }
            if (z15) {
                return (y) obj;
            }
            j.s("Collection contains no element matching the predicate.");
            return null;
        }
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.t
    public final String u() {
        String string = this.f70343a.getResources().getString(R.string.device_settings_home_widget);
        string.getClass();
        return string;
    }

    @Override // fb2.t
    public final y[] v(z zVar) {
        z zVar2 = zVar;
        zVar2.getClass();
        List<y> list = zVar2.f34343c;
        list.getClass();
        List listN0 = h0.N0(list, new e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            y yVar = (y) obj;
            if (yVar.f34330c && !s.g(yVar.f34328a, "APP_NATIVE_ID_HEART_RATE")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            y yVar2 = new y();
            yVar2.f34329b = -1;
            yVar2.f34330c = true;
            arrayList2.add(0, yVar2);
        } else {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((y) it.next()).f34329b == -1) {
                }
            }
            y yVar3 = new y();
            yVar3.f34329b = -1;
            yVar3.f34330c = true;
            arrayList2.add(0, yVar3);
        }
        return (y[]) arrayList2.toArray(new y[0]);
    }

    @Override // fb2.t
    public final void w(y yVar, z zVar) {
        int i14;
        y yVar2 = yVar;
        z zVar2 = zVar;
        zVar2.getClass();
        if (yVar2 != null) {
            zVar2.f34342b = yVar2.f34329b == -1;
            List<y> list = zVar2.f34343c;
            ArrayList arrayListL = androidx.core.view.j.l(list);
            for (Object obj : list) {
                if (((y) obj).f34329b != -1) {
                    arrayListL.add(obj);
                }
            }
            List<y> list2 = zVar2.f34343c;
            list2.getClass();
            Iterator<T> it = list2.iterator();
            boolean z14 = false;
            Object obj2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (z14) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    Object next = it.next();
                    if (((y) next).f34329b == -1) {
                        if (!z14) {
                            z14 = true;
                            obj2 = next;
                        }
                    }
                }
                obj2 = null;
                break;
            }
            y yVar3 = (y) obj2;
            if (yVar3 == null) {
                yVar3 = new y();
                yVar3.f34329b = -1;
                yVar3.f34330c = true;
            }
            if (arrayListL.isEmpty()) {
                i14 = 0;
            } else {
                Iterator it3 = arrayListL.iterator();
                i14 = 0;
                while (it3.hasNext()) {
                    if (((y) it3.next()).f34330c && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            }
            ArrayList arrayListD1 = h0.d1(h0.N0(arrayListL, new f()));
            Collections.rotate(arrayListD1.subList(0, i14), -arrayListD1.indexOf(yVar2));
            int size = arrayListD1.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((y) arrayListD1.get(i15)).f34329b = i15;
            }
            arrayListD1.add(0, yVar3);
            zVar2.f34343c = new ArrayList(arrayListD1);
            k(zVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lci1/d$a;", "", "<init>", "()V", "", "LAST_DISPLAYED_WIDGET_SCREEN_INDEX", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
