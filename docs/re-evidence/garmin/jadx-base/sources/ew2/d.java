package ew2;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import cx2.h;
import gw2.i;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lew2/d;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66899a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f66900b = new h("BasicClickHelper", null, 2, null);

    /* JADX WARN: Code duplicated, block: B:88:0x012d  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r1.equals("INTERNAL") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0145, code lost:
    
        if (r1.equals("SELECTION_WITH_CONFIRMATION") == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0149, code lost:
    
        r5 = 0;
        r0 = new ew2.b(r14, r15, r12, r13, r5);
        r6.getClass();
        ew2.d.a.a(r0, r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final Fragment fragment, final dx2.c cVar, final Map<String, ? extends Object> map) {
        Exception exc;
        Map map2;
        Long l14;
        Map map3;
        Map map4;
        String str;
        String str2;
        String str3;
        String str4;
        dv2.a aVar;
        fragment.getClass();
        cVar.getClass();
        h hVar = f66900b;
        hVar.getClass();
        String strL4 = dx2.c.L4(map);
        if (strL4 != null) {
            int iHashCode = strL4.hashCode();
            a aVar2 = f66899a;
            switch (iHashCode) {
                case -2056372865:
                    exc = null;
                    if (strL4.equals("INTERNAL_APP")) {
                        Object obj = map.get(i.LINK_OPTIONS.f79975a);
                        try {
                            if (!(obj instanceof Map)) {
                                obj = null;
                            }
                            map2 = (Map) obj;
                        } catch (ClassCastException unused) {
                            map2 = null;
                        }
                        Object obj2 = map2 != null ? map2.get(i.DEST_COMPOSITION_ID.f79975a) : null;
                        try {
                            if (!(obj2 instanceof Long)) {
                                obj2 = null;
                            }
                            l14 = (Long) obj2;
                        } catch (ClassCastException unused2) {
                            l14 = null;
                        }
                        Integer numValueOf = l14 != null ? Integer.valueOf((int) l14.longValue()) : null;
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            g.f66907a.getClass();
                            g.a.b(iIntValue, fragment, true);
                        } else {
                            hVar.d(null, "handleClickEvent: Did not get compositions " + map.get(i.ROW_ID.f79975a));
                        }
                    }
                    break;
                case -1038134325:
                    exc = null;
                    if (strL4.equals("EXTERNAL")) {
                        String strC4 = dx2.c.C4(map);
                        hVar.b("handleClickEvent: External " + strC4 + " clicked.");
                        if (s.g(strC4, "DEVICE_GENERATED_ACTIVITIES")) {
                            if (strC4 != null) {
                                g.f66907a.getClass();
                                g.a.c(strC4, map, fragment);
                            }
                            break;
                        } else {
                            cx2.i.f56681a.getClass();
                            if (cx2.i.a.b(fragment) && strC4 != null) {
                                g.f66907a.getClass();
                                g.a.c(strC4, map, fragment);
                                break;
                            }
                        }
                    }
                    break;
                case -979005701:
                    exc = null;
                    break;
                case -718500082:
                    exc = null;
                    if (strL4.equals("CIQ_LINK")) {
                        cx2.i.f56681a.getClass();
                        if (cx2.i.a.b(fragment)) {
                            h hVar2 = cVar.f61485b;
                            Object obj3 = map.get(i.LINK_OPTIONS.f79975a);
                            try {
                                if (!(obj3 instanceof Map)) {
                                    obj3 = null;
                                }
                                map3 = (Map) obj3;
                            } catch (ClassCastException unused3) {
                                map3 = null;
                            }
                            if (map3 != null) {
                                Object obj4 = map3.get(i.CIQ_LINK_OPTIONS.f79975a);
                                try {
                                    if (!(obj4 instanceof Map)) {
                                        obj4 = null;
                                    }
                                    map4 = (Map) obj4;
                                } catch (ClassCastException unused4) {
                                    map4 = null;
                                }
                                if (map4 == null) {
                                    hVar2.getClass();
                                } else {
                                    String strValueOf = String.valueOf(map4.get(i.DEVICE_ID.f79975a));
                                    Object obj5 = map4.get(i.MAC_ADDRESS.f79975a);
                                    try {
                                        if (!(obj5 instanceof String)) {
                                            obj5 = null;
                                        }
                                        str = (String) obj5;
                                    } catch (ClassCastException unused5) {
                                        str = null;
                                    }
                                    String strA = str != null ? cx2.g.a(str) : null;
                                    Object obj6 = map4.get(i.APP_VERSION.f79975a);
                                    try {
                                        if (!(obj6 instanceof String)) {
                                            obj6 = null;
                                        }
                                        str2 = (String) obj6;
                                    } catch (ClassCastException unused6) {
                                        str2 = null;
                                    }
                                    Object obj7 = map4.get(i.STORE_APP_ID.f79975a);
                                    try {
                                        if (!(obj7 instanceof String)) {
                                            obj7 = null;
                                        }
                                        str3 = (String) obj7;
                                    } catch (ClassCastException unused7) {
                                        str3 = null;
                                    }
                                    String strA2 = str3 != null ? cx2.g.a(str3) : null;
                                    Object obj8 = map4.get(i.APP_TYPE.f79975a);
                                    try {
                                        if (!(obj8 instanceof String)) {
                                            obj8 = null;
                                        }
                                        str4 = (String) obj8;
                                    } catch (ClassCastException unused8) {
                                        str4 = null;
                                    }
                                    for (gw2.c cVar2 : gw2.c.values()) {
                                        if (s.g(cVar2.f79874a, str4)) {
                                            str4 = cVar2.f79875b;
                                            dv2.a aVar3 = new dv2.a(strValueOf, strA2, strA, str2, str4);
                                            hVar2.getClass();
                                            aVar = aVar3;
                                        }
                                    }
                                    dv2.a aVar4 = new dv2.a(strValueOf, strA2, strA, str2, str4);
                                    hVar2.getClass();
                                    aVar = aVar4;
                                }
                                if (aVar == null) {
                                    g.a aVar5 = g.f66907a;
                                    m mVarRequireActivity = fragment.requireActivity();
                                    mVarRequireActivity.getClass();
                                    aVar5.getClass();
                                    g.a.a(mVarRequireActivity, aVar);
                                    break;
                                }
                            } else {
                                hVar2.getClass();
                            }
                            aVar = null;
                            if (aVar == null) {
                                g.a aVar6 = g.f66907a;
                                m mVarRequireActivity2 = fragment.requireActivity();
                                mVarRequireActivity2.getClass();
                                aVar6.getClass();
                                g.a.a(mVarRequireActivity2, aVar);
                                break;
                            }
                        }
                    }
                    break;
                case 639484917:
                    exc = null;
                    if (strL4.equals("DEVICE_ONLY")) {
                        ew2.a aVar7 = new ew2.a(fragment, 0);
                        aVar2.getClass();
                        a.a(aVar7, fragment);
                    }
                    break;
                case 1353037501:
                    exc = null;
                    break;
                case 1854879925:
                    if (strL4.equals("INTERNAL_REINSTANTIATE")) {
                        final int i14 = 1;
                        e23.a aVar8 = new e23.a(cVar, map, this, fragment, i14) { // from class: ew2.b

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ int f66890a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ dx2.c f66891b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ Map f66892c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ Fragment f66893d;

                            {
                                this.f66890a = i14;
                                this.f66893d = fragment;
                            }

                            @Override // e23.a
                            public final Object invoke() {
                                int i15 = this.f66890a;
                                Fragment fragment2 = this.f66893d;
                                Map map5 = this.f66892c;
                                dx2.c cVar3 = this.f66891b;
                                switch (i15) {
                                    case 0:
                                        d.a aVar9 = d.f66899a;
                                        cVar3.getClass();
                                        Integer numY4 = dx2.c.y4(map5);
                                        h hVar3 = d.f66900b;
                                        hVar3.getClass();
                                        if (numY4 != null) {
                                            int iIntValue2 = numY4.intValue();
                                            g.f66907a.getClass();
                                            g.a.b(iIntValue2, fragment2, false);
                                        } else {
                                            hVar3.d(null, "handleClickEvent: Did not get compositions " + map5.get(i.ROW_ID.f79975a));
                                        }
                                        break;
                                    default:
                                        d.a aVar10 = d.f66899a;
                                        cVar3.getClass();
                                        Integer numY5 = dx2.c.y4(map5);
                                        h hVar4 = d.f66900b;
                                        hVar4.getClass();
                                        if (numY5 != null) {
                                            int iIntValue3 = numY5.intValue();
                                            g.f66907a.getClass();
                                            fragment2.getClass();
                                            g.f66908b.getClass();
                                            m activity = fragment2.getActivity();
                                            SettingsDeviceActivity settingsDeviceActivity = activity instanceof SettingsDeviceActivity ? (SettingsDeviceActivity) activity : null;
                                            if (settingsDeviceActivity != null) {
                                                SettingsDeviceActivity.a aVar11 = SettingsDeviceActivity.f52599w;
                                                int iIntValue4 = ((Number) settingsDeviceActivity.f52603t.getValue()).intValue();
                                                aVar11.getClass();
                                                SettingsDeviceActivity.a.a(settingsDeviceActivity, iIntValue3, iIntValue4, false);
                                            } else {
                                                e.a aVar12 = e.f66901a;
                                                m mVarRequireActivity3 = fragment2.requireActivity();
                                                mVarRequireActivity3.getClass();
                                                String string = fragment2.getString(R.string.txt_something_went_wrong_try_again);
                                                string.getClass();
                                                e.a.d(aVar12, mVarRequireActivity3, string);
                                            }
                                        } else {
                                            hVar4.d(null, "handleClickEvent: Did not get compositions " + map5.get(i.ROW_ID.f79975a));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        aVar2.getClass();
                        a.a(aVar8, fragment);
                    } else {
                        exc = null;
                    }
                    break;
                default:
                    exc = null;
                    break;
            }
            return;
        }
        exc = null;
        hVar.d(exc, "handleClickEvent: Unknown link option " + map.get(i.ROW_ID.f79975a));
    }

    public final void b(Fragment fragment, View view2, dx2.c cVar, Map<String, ? extends Object> map) {
        view2.getClass();
        cVar.getClass();
        f66900b.getClass();
        view2.setOnClickListener(new c(this, fragment, cVar, map, 0));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew2/d$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(e23.a aVar, Fragment fragment) {
            fragment.getClass();
            cx2.i.f56681a.getClass();
            if (cx2.i.a.a(fragment)) {
                aVar.invoke();
            }
        }

        private a() {
        }
    }
}
