package ci2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.x0;
import androidx.core.view.z0;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import com.garmin.androiddynamicsettings.app.features.search.SettingsSearchActivity;
import fi2.a0;
import fi2.b0;
import fi2.c0;
import fi2.d0;
import fi2.e0;
import fi2.f0;
import fi2.g0;
import fi2.i0;
import fi2.n;
import fi2.o;
import fi2.q;
import fi2.r;
import fi2.t;
import fi2.w;
import fi2.z;
import h0.r0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import lh2.p;
import lh2.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lci2/m;", "Lci2/f;", "Llh2/p$a;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends f implements p.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f27713k = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nh2.d f27715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ii2.b f27716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f27718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public jh2.c f27719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27720h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jh2.a f27722j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f27714b = new hi2.d("SettingsFragment", null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mh2.a f27721i = mh2.a.Back;

    @Override // lh2.p.a
    public final void l2() {
        androidx.fragment.app.m activity;
        v supportFragmentManager;
        nh2.d dVar = this.f27715c;
        if (dVar == null) {
            s.m("settingsDataModel");
            throw null;
        }
        if (dVar.f126166f || (activity = getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f27717e = context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        hi2.d dVar = this.f27714b;
        if (arguments != null) {
            nh2.d dVar2 = (nh2.d) arguments.getParcelable("SETTINGS_DATA_MODEL_BUNDLE");
            if (dVar2 != null) {
                this.f27715c = dVar2;
                unit3 = Unit.INSTANCE;
            } else {
                unit3 = null;
            }
            if (unit3 == null) {
                dVar.b("Data model not received");
                u6();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Logger logger = hi2.d.f83889c;
            dVar.getClass();
            u6();
        }
        nh2.d dVar3 = this.f27715c;
        if (dVar3 == null) {
            s.m("settingsDataModel");
            throw null;
        }
        boolean z14 = true;
        this.f27720h = !dVar3.f126169i.isEmpty();
        nh2.d dVar4 = this.f27715c;
        if (dVar4 == null) {
            s.m("settingsDataModel");
            throw null;
        }
        List<Map<String, Object>> list = dVar4.f126170j;
        if ((list == null || list.size() <= 0) && !this.f27720h) {
            z14 = false;
        }
        setHasOptionsMenu(z14);
        this.f27722j = new jh2.a(this);
        try {
            androidx.fragment.app.m activity = getActivity();
            if (activity != null) {
                nh2.d dVar5 = this.f27715c;
                if (dVar5 == null) {
                    s.m("settingsDataModel");
                    throw null;
                }
                this.f27716d = (ii2.b) new x1(activity, new ii2.c(dVar5)).b(s0.f105811a.b(ii2.b.class));
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                u6();
            }
            ii2.b bVar = this.f27716d;
            if (bVar == null) {
                s.m("settingsViewModel");
                throw null;
            }
            Context context = this.f27717e;
            if (context == null) {
                s.m("activityContext");
                throw null;
            }
            nh2.d dVar6 = bVar.f93791a;
            if (dVar6.f126168h.isEmpty()) {
                throw new IllegalStateException("Data not initialized");
            }
            bVar.f93793c.m(dVar6.f126168h);
            bVar.f93794d = context;
        } catch (IllegalStateException unused) {
            dVar.b("Data value not initialized and used in ViewModel..");
            u6();
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.view.Menu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        String str;
        int i14;
        Unit unit;
        ?? r14;
        int i15;
        int i16;
        char c14;
        mh2.g gVar;
        boolean zBooleanValue;
        menu.getClass();
        menuInflater.getClass();
        jh2.a aVar = this.f27722j;
        String str2 = "menuController";
        if (aVar == null) {
            s.m("menuController");
            throw null;
        }
        Context context = this.f27717e;
        if (context == null) {
            s.m("activityContext");
            throw null;
        }
        nh2.d dVar = this.f27715c;
        if (dVar == null) {
            s.m("settingsDataModel");
            throw null;
        }
        ii2.b bVar = this.f27716d;
        if (bVar == null) {
            s.m("settingsViewModel");
            throw null;
        }
        boolean z14 = this.f27720h;
        mh2.a aVar2 = this.f27721i;
        aVar2.getClass();
        aVar.f98757a.getClass();
        menu.clear();
        SparseArray<o13.p<String, Object>> sparseArray = aVar.f98759c;
        sparseArray.clear();
        SparseArray<Map<String, Object>> sparseArray2 = aVar.f98758b;
        sparseArray2.clear();
        int i17 = 0;
        int i18 = 2;
        if (z14) {
            MenuItem menuItemAdd = menu.add(0, 99, 65536, "");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(R.drawable.icon_settings_search);
            Drawable icon = menuItemAdd.getIcon();
            if (icon != null) {
                icon.setTint(a7.b.getColor(aVar.f98760d, R.color.dsl_settings_icon_tint));
            }
        }
        if (aVar2 == mh2.a.CancelConfirm) {
            jh2.b.a(menu, context);
        }
        List<Map<String, Object>> list = dVar.f126170j;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map<String, ? extends Object> map = (Map) it.next();
                int iGenerateViewId = View.generateViewId();
                map.getClass();
                Object obj = map.get(mh2.i.SHOWN_ON_ACTION_BAR.f118617a);
                if (!(obj instanceof Boolean)) {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    r14 = i17;
                }
                if (r14 != 0) {
                    r14 = zBooleanValue;
                    i15 = i18;
                } else {
                    r14 = zBooleanValue;
                    i15 = i17;
                }
                String strH4 = bVar.H4(map);
                String str3 = strH4 == null ? mh2.h.MENU_DEFAULT.f118578a : strH4;
                gi2.c cVar = (gi2.c) aVar.a(context, str3);
                if (cVar.r(map)) {
                    String strK = cVar.k(bVar, map);
                    if (r14 != 0) {
                        strK = sn.a.g(strK);
                    }
                    String strH5 = bVar.H4(map);
                    if (strH5 == null) {
                        strH5 = mh2.h.DEFAULT.f118578a;
                    }
                    mh2.g[] gVarArrValues = mh2.g.values();
                    int length = gVarArrValues.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= length) {
                            gVar = null;
                            break;
                        }
                        int i24 = length;
                        gVar = gVarArrValues[i19];
                        int i25 = i19;
                        if (s.g(strH5, gVar.f118552a)) {
                            break;
                        }
                        i19 = i25 + 1;
                        length = i24;
                    }
                    int i26 = gVar != null ? gVar.f118553b : 0;
                    i16 = 0;
                    MenuItem menuItemAdd2 = menu.add(0, iGenerateViewId, 0, strK);
                    menuItemAdd2.setShowAsAction(i15);
                    if (i26 > 0) {
                        menuItemAdd2.setIcon(i26);
                        Drawable icon2 = menuItemAdd2.getIcon();
                        if (icon2 != null) {
                            c14 = 387;
                            icon2.setTint(a7.b.getColor(context, R.color.dsl_settings_icon_tint));
                        } else {
                            c14 = 387;
                        }
                    } else {
                        c14 = 387;
                    }
                    sparseArray2.put(iGenerateViewId, map);
                    sparseArray.put(iGenerateViewId, new o13.p<>(str3, null));
                } else {
                    i16 = i17;
                    c14 = 387;
                }
                i17 = i16;
                aVar = aVar;
                str2 = str2;
                i18 = 2;
            }
            str = str2;
            i14 = i17;
            unit = Unit.INSTANCE;
        } else {
            str = "menuController";
            i14 = 0;
            unit = null;
        }
        if (unit == null) {
            Logger logger = hi2.d.f83889c;
        }
        int size = menu.size();
        for (int i27 = i14; i27 < size; i27++) {
            MenuItem item = menu.getItem(i27);
            if (getActivity() != null) {
                jh2.a aVar3 = this.f27722j;
                if (aVar3 == null) {
                    s.m(str);
                    throw null;
                }
                hi2.d dVar2 = aVar3.f98757a;
                item.getClass();
                SparseArray<o13.p<String, Object>> sparseArray3 = aVar3.f98759c;
                o13.p<String, Object> pVar = sparseArray3.get(item.getItemId());
                if (pVar != null) {
                    String str4 = pVar.f128594a;
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    gi2.c cVar2 = (gi2.c) aVar3.a(contextRequireContext, str4);
                    if (str4.equals(mh2.h.MENU_SYNC.f118578a)) {
                        u uVar = new u(this, (gi2.b) cVar2, item);
                        sparseArray3.put(item.getItemId(), new o13.p<>(str4, uVar));
                        new Handler().postDelayed(new r0(23, cVar2, uVar), 1000L);
                    } else {
                        dVar2.getClass();
                    }
                } else {
                    dVar2.getClass();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dsl_fragment_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        jh2.c cVar = this.f27719g;
        if (cVar == null) {
            s.m("viewController");
            throw null;
        }
        Iterator<View> it = new x0(cVar.f98761a.v6()).iterator();
        while (true) {
            z0 z0Var = (z0) it;
            if (!z0Var.hasNext()) {
                break;
            }
            KeyEvent.Callback callback = (View) z0Var.next();
            if (callback instanceof zh2.b) {
                ((zh2.b) callback).a();
            }
        }
        jh2.a aVar = this.f27722j;
        if (aVar == null) {
            s.m("menuController");
            throw null;
        }
        SparseArray<o13.p<String, Object>> sparseArray = aVar.f98759c;
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            sparseArray.keyAt(i14);
            o13.p<String, Object> pVarValueAt = sparseArray.valueAt(i14);
            if (s.g(pVarValueAt.f128594a, mh2.h.MENU_SYNC.f118578a)) {
                Object obj = pVarValueAt.f128595b;
                u uVar = obj instanceof u ? (u) obj : null;
                if (uVar == null) {
                    continue;
                } else {
                    gi2.b bVar = uVar.f112559d;
                    if (bVar == null) {
                        s.m("transform");
                        throw null;
                    }
                    bVar.w();
                }
            }
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        kh2.c.a aVar = kh2.c.f104782a;
        ii2.b bVar = this.f27716d;
        Unit unit = null;
        if (bVar == null) {
            s.m("settingsViewModel");
            throw null;
        }
        int itemId = menuItem.getItemId();
        jh2.a aVar2 = this.f27722j;
        if (aVar2 == null) {
            s.m("menuController");
            throw null;
        }
        Map<String, ? extends Object> map = (Map) aVar2.f98758b.get(menuItem.getItemId());
        aVar.getClass();
        androidx.fragment.app.m activity = getActivity();
        if (!(activity instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b)) {
            activity = null;
        }
        com.garmin.androiddynamicsettings.app.presentationlayer.b bVar2 = (com.garmin.androiddynamicsettings.app.presentationlayer.b) activity;
        if (bVar2 == null || !bVar2.S9()) {
            if (bVar2 != null) {
                return true;
            }
            zh2.e.f204807a.getClass();
            if (!((uc0.d) zh2.e.a()).i()) {
                return true;
            }
        }
        if (itemId == 99) {
            kh2.c.f104783b.getClass();
            Intent intent = new Intent(requireContext(), (Class<?>) SettingsSearchActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("SETTINGS_SEARCH_DATA_BUNDLE", bVar.f93791a);
            intent.putExtra("SETTINGS_DATA_MODEL_BUNDLE", bundle);
            requireActivity().startActivity(intent);
            return true;
        }
        if (map != null) {
            String strH4 = bVar.H4(map);
            if (strH4 != null) {
                if (strH4.equals(mh2.h.MENU_REMOVE_DEVICE.f118578a)) {
                    kh2.k.f104801a.getClass();
                    kh2.k.f104802b.getClass();
                    zh2.e.f204807a.getClass();
                    zh2.a aVarA = zh2.e.a();
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    ei2.h hVarG = ((uc0.d) aVarA).g(contextRequireContext, strH4);
                    hVarG.getClass();
                    gi2.e eVar = (gi2.e) hVarG;
                    String f177020i = eVar.getF77486c();
                    String f177021j = eVar.getF177021j();
                    String string = requireContext().getString(R.string.lbl_common_remove);
                    string.getClass();
                    String string2 = requireContext().getString(R.string.lbl_cancel);
                    string2.getClass();
                    androidx.fragment.app.m activity2 = getActivity();
                    if (activity2 == null || !hi2.c.a(activity2)) {
                        Logger logger = hi2.d.f83889c;
                    } else {
                        kh2.g.a aVar3 = kh2.g.f104792a;
                        Context contextRequireContext2 = requireContext();
                        contextRequireContext2.getClass();
                        kh2.g.a.c(kh2.g.a.a(aVar3, contextRequireContext2, f177020i, f177021j, new o13.p(string, new kh2.h(this, eVar)), new o13.p(string2, kh2.i.f104799a), 480), activity2);
                    }
                } else if (strH4.equals(mh2.h.MENU_SYNC.f118578a)) {
                    kh2.k.f104801a.getClass();
                    kh2.k.f104802b.getClass();
                    zh2.e.f204807a.getClass();
                    zh2.a aVarA2 = zh2.e.a();
                    Context contextRequireContext3 = requireContext();
                    contextRequireContext3.getClass();
                    ei2.h hVarG2 = ((uc0.d) aVarA2).g(contextRequireContext3, strH4);
                    hVarG2.getClass();
                    ((gi2.b) hVarG2).v();
                } else if (strH4.equals(mh2.h.MENU_MANAGE_DEVICE_PRIORITY.f118578a)) {
                    kh2.k.f104801a.getClass();
                    kh2.k.f104802b.getClass();
                    zh2.e.f204807a.getClass();
                    zh2.a aVarA3 = zh2.e.a();
                    Context contextRequireContext4 = requireContext();
                    contextRequireContext4.getClass();
                    gi2.d dVar = (gi2.d) ((uc0.d) aVarA3).g(contextRequireContext4, strH4);
                    if (dVar != null) {
                        dVar.s();
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        Logger logger2 = hi2.d.f83889c;
                    }
                } else {
                    hi2.d dVar2 = kh2.c.f104783b;
                    "No custom action defined for menu transform type ".concat(strH4);
                    dVar2.getClass();
                }
            }
            kh2.k.a aVar4 = kh2.k.f104801a;
            Map<String, Object> mapZ4 = bVar.z4(map);
            aVar4.getClass();
            kh2.k.a.a(this, bVar, map, mapZ4);
            unit = Unit.INSTANCE;
        }
        if (unit != null) {
            return true;
        }
        kh2.c.f104783b.getClass();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:248:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0048 A[SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Iterator<T> it;
        mh2.a aVar;
        View view3;
        View viewInflate;
        Unit unit;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.settings_linear_layout);
        viewFindViewById.getClass();
        this.f27718f = (LinearLayout) viewFindViewById;
        this.f27719g = new jh2.c(this);
        this.f27714b.a("onViewCreated: building viewController with settingsDataModel");
        jh2.c cVar = this.f27719g;
        if (cVar == null) {
            s.m("viewController");
            throw null;
        }
        nh2.d dVar = this.f27715c;
        if (dVar == null) {
            s.m("settingsDataModel");
            throw null;
        }
        ii2.b bVar = this.f27716d;
        if (bVar == null) {
            s.m("settingsViewModel");
            throw null;
        }
        hi2.d dVar2 = cVar.f98762b;
        try {
            cVar.a((Map) h0.b0(dVar.f126167g));
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map<String, ? extends Object> map = (Map) it.next();
                Objects.toString(map);
                dVar2.getClass();
                map.getClass();
                Object obj = map.get(mh2.i.PLATFORM.f118617a);
                if (s.g(obj != null ? obj.toString() : null, mh2.m.IOS.f118678a)) {
                    dVar2.a("build: " + map.get(mh2.i.TITLE.f118617a) + " is not supported. skipping...");
                } else {
                    m mVar = cVar.f98761a;
                    dVar2.a("frameView:");
                    String strH4 = bVar.H4(map);
                    if (strH4 == null) {
                        strH4 = mh2.h.DEFAULT.f118578a;
                    }
                    Context contextRequireContext = mVar.requireContext();
                    contextRequireContext.getClass();
                    zh2.e.f204807a.getClass();
                    ei2.h hVarG = ((uc0.d) zh2.e.a()).g(contextRequireContext, strH4);
                    if (hVarG == null) {
                        if (strH4.equals(mh2.h.AGE.f118578a)) {
                            hVarG = new fi2.a(contextRequireContext);
                        } else if (strH4.equals(mh2.h.ALERT_TONES.f118578a)) {
                            hVarG = new fi2.b(contextRequireContext);
                        } else if (strH4.equals(mh2.h.ALL_BOOLEAN.f118578a)) {
                            hVarG = new fi2.f(true, contextRequireContext);
                        } else if (strH4.equals(mh2.h.ANY_BOOLEAN.f118578a)) {
                            hVarG = new fi2.f(false, contextRequireContext);
                        } else if (strH4.equals(mh2.h.AUDIO_PROMPT_FREQUENCY.f118578a)) {
                            hVarG = new fi2.d(contextRequireContext);
                        } else if (strH4.equals(mh2.h.BLOOD_EFFICIENCY.f118578a)) {
                            hVarG = new fi2.e(contextRequireContext);
                        } else if (strH4.equals(mh2.h.CRITICAL_SWIM_SPEED_PICKER.f118578a)) {
                            hVarG = new fi2.g(contextRequireContext);
                        } else if (strH4.equals(mh2.h.CUSTOM_STRIDE_CALCULATION.f118578a)) {
                            hVarG = new fi2.h(contextRequireContext);
                        } else if (strH4.equals(mh2.h.CUSTOM_STRIDE_DISTANCE.f118578a)) {
                            hVarG = new fi2.i(contextRequireContext);
                        } else if (strH4.equals(mh2.h.CUSTOM_STRIDE_STEPS.f118578a)) {
                            hVarG = new fi2.j(contextRequireContext);
                        } else if (strH4.equals(mh2.h.DAILY_STEPS.f118578a)) {
                            hVarG = new fi2.k(contextRequireContext);
                        } else if (strH4.equals(mh2.h.DATE_PICKER.f118578a)) {
                            hVarG = new fi2.l(contextRequireContext);
                        } else if (strH4.equals(mh2.h.FLOORS_CLIMBED.f118578a)) {
                            hVarG = new n(contextRequireContext);
                        } else if (strH4.equals(mh2.h.HEIGHT_PICKER.f118578a)) {
                            hVarG = new o(contextRequireContext);
                        } else if (strH4.equals(mh2.h.HYDRATION_CONTAINER.f118578a)) {
                            hVarG = new fi2.p(contextRequireContext);
                        } else if (strH4.equals(mh2.h.HYDRATION_DAILY_GOAL.f118578a)) {
                            hVarG = new q(contextRequireContext);
                        } else if (strH4.equals(mh2.h.INTENSITY_MINUTES.f118578a)) {
                            hVarG = new r(contextRequireContext);
                        } else if (strH4.equals(mh2.h.MODERATE_INTENSITY_ZONE.f118578a)) {
                            hVarG = new fi2.s(contextRequireContext);
                        } else if (strH4.equals(mh2.h.PERIOD_CYCLE_LENGTH.f118578a)) {
                            hVarG = new fi2.u(contextRequireContext);
                        } else if (strH4.equals(mh2.h.PERIOD_DURATION.f118578a)) {
                            hVarG = new fi2.v(contextRequireContext);
                        } else {
                            if (strH4.equals(mh2.h.PICKER.f118578a) ? true : strH4.equals(mh2.h.PICKER_LABEL.f118578a)) {
                                hVarG = new t(contextRequireContext);
                            } else if (strH4.equals(mh2.h.PULSE_OX_III.f118578a)) {
                                hVarG = new w(contextRequireContext);
                            } else if (strH4.equals(mh2.h.SLEEP_BED_TIME_PICKER.f118578a)) {
                                hVarG = new a0(contextRequireContext);
                            } else if (strH4.equals(mh2.h.SLEEP_WAKE_TIME_PICKER.f118578a)) {
                                hVarG = new b0(contextRequireContext);
                            } else if (strH4.equals(mh2.h.SMART_NOTIFICATIONS.f118578a)) {
                                hVarG = new c0(contextRequireContext);
                            } else if (strH4.equals(mh2.h.TIME_PICKER.f118578a)) {
                                hVarG = new e0(contextRequireContext);
                            } else if (strH4.equals(mh2.h.TOTAL_BOTTOM_TIME.f118578a)) {
                                hVarG = new f0(contextRequireContext);
                            } else if (strH4.equals(mh2.h.TOTAL_BOTTOM_TIME_ALL_DIVES.f118578a)) {
                                hVarG = new fi2.c(contextRequireContext);
                            } else if (strH4.equals(mh2.h.TOTAL_STEPS.f118578a)) {
                                hVarG = new g0(contextRequireContext);
                            } else if (strH4.equals(mh2.h.VIGOROUS_INTENSITY_ZONE.f118578a)) {
                                hVarG = new fi2.h0(contextRequireContext);
                            } else {
                                hVarG = strH4.equals(mh2.h.WEIGHT_PICKER.f118578a) ? new i0(contextRequireContext) : new fi2.m(contextRequireContext);
                            }
                        }
                    }
                    Object obj2 = map.get(mh2.i.TYPE.f118617a);
                    if (s.g(obj2, mh2.l.CONTAINER.f118654a)) {
                        Object obj3 = map.get(mh2.i.CONTENT.f118617a);
                        if (!(obj3 instanceof String)) {
                            obj3 = null;
                        }
                        String str = (String) obj3;
                        if (s.g(str, mh2.c.PULSE_OX_RANGE.f118536a)) {
                            viewInflate = mVar.getLayoutInflater().inflate(R.layout.dsl_pulseox_range, (ViewGroup) null);
                        } else {
                            if (s.g(str, mh2.c.INTENSITY_MINUTES_EQUATION.f118536a)) {
                                viewInflate = mVar.getLayoutInflater().inflate(R.layout.dsl_intensity_minute_equation, (ViewGroup) null);
                            } else {
                                zh2.e.a();
                                bVar.f93793c.getClass();
                                view3 = null;
                            }
                            if (view3 != null) {
                                kh2.a.f104778a.getClass();
                                kh2.a.f104779b.getClass();
                                view3.setOnClickListener(new bv2.c(mVar, bVar, map, hVarG, strH4));
                                mVar.v6().addView(view3);
                            }
                        }
                        view3 = viewInflate;
                        if (view3 != null) {
                            kh2.a.f104778a.getClass();
                            kh2.a.f104779b.getClass();
                            view3.setOnClickListener(new bv2.c(mVar, bVar, map, hVarG, strH4));
                            mVar.v6().addView(view3);
                        }
                    } else if (!s.g(obj2, mh2.l.DEVICE.f118654a)) {
                        if (s.g(obj2, mh2.l.CRITICAL_SWIM_SPEED.f118654a) ? true : s.g(obj2, mh2.l.DOUBLE_LABEL.f118654a)) {
                            lh2.h hVar = new lh2.h(mVar, hVarG, bVar, map);
                            kh2.a.f104778a.getClass();
                            kh2.a.f104779b.getClass();
                            hVar.setOnClickListener(new bv2.c(mVar, bVar, map, hVarG, strH4));
                            kh2.b.a aVar2 = kh2.b.f104780a;
                            ii2.b bVar2 = bVar;
                            StyledTextView removeTextView = hVar.getRemoveTextView();
                            aVar2.getClass();
                            removeTextView.getClass();
                            kh2.b.f104781b.getClass();
                            bw2.a aVar3 = new bw2.a(mVar, removeTextView, bVar2, map, hVarG, strH4);
                            bVar = bVar2;
                            removeTextView.setOnClickListener(aVar3);
                            mVar.v6().addView(hVar);
                        } else {
                            String str2 = strH4;
                            ei2.h hVar2 = hVarG;
                            if (s.g(obj2, mh2.l.FEATURE_SETUP.f118654a)) {
                                if (hVar2 instanceof ei2.a) {
                                    lh2.a aVar4 = new lh2.a(mVar, bVar, (ei2.a) hVar2, map);
                                    kh2.d.f104784a.getClass();
                                    kh2.d.a.a(mVar, aVar4, bVar, map);
                                    mVar.v6().addView(aVar4);
                                } else {
                                    dVar2.b("frameView: required BadgeTransform and found " + s0.f105811a.b(hVar2.getClass()).D());
                                }
                            } else if (s.g(obj2, mh2.l.HEADER.f118654a)) {
                                lh2.j jVar = new lh2.j(mVar, bVar, hVar2, map);
                                kh2.b.a aVar5 = kh2.b.f104780a;
                                ii2.b bVar3 = bVar;
                                StyledTextView headerActionTextView = jVar.getHeaderActionTextView();
                                aVar5.getClass();
                                headerActionTextView.getClass();
                                kh2.b.f104781b.getClass();
                                bw2.a aVar6 = new bw2.a(mVar, headerActionTextView, bVar3, map, null, null);
                                bVar = bVar3;
                                headerActionTextView.setOnClickListener(aVar6);
                                mVar.v6().addView(jVar);
                            } else if (s.g(obj2, mh2.l.INTERACTIVE_TEXT.f118654a)) {
                                mVar.v6().addView(new lh2.m(mVar, bVar, hVar2, map));
                            } else if (s.g(obj2, mh2.l.LINK_BUTTON.f118654a)) {
                                lh2.n nVar = new lh2.n(mVar, bVar, hVar2, map);
                                kh2.d.f104784a.getClass();
                                kh2.d.a.a(mVar, nVar, bVar, map);
                                mVar.v6().addView(nVar);
                            } else {
                                if (s.g(obj2, mh2.l.PREFERRED_ACTIVITY_TRACKER.f118654a) ? true : s.g(obj2, mh2.l.FIND_MY_DEVICE.f118654a) ? true : s.g(obj2, mh2.l.ALERT_VOLUME.f118654a) ? true : s.g(obj2, mh2.l.HAND_ALIGNMENT.f118654a)) {
                                    try {
                                        lh2.r rVar = new lh2.r(mVar, bVar, (ei2.j) hVar2, map);
                                        kh2.d.f104784a.getClass();
                                        kh2.d.f104785b.getClass();
                                        rVar.setOnClickListener(new bv2.j(mVar, (ei2.j) hVar2, rVar, 18));
                                        mVar.v6().addView(rVar);
                                    } catch (ClassCastException unused) {
                                        dVar2.b("Type: " + str2 + " Transform: " + hVar2 + " is not of type ViewAccessoryStateTransform");
                                    }
                                } else {
                                    if (s.g(obj2, mh2.l.PULSE_OX.f118654a) ? true : s.g(obj2, mh2.l.BLOOD_EFFICIENCY.f118654a)) {
                                        z zVar = (z) (!(hVar2 instanceof z) ? null : hVar2);
                                        if (zVar != null) {
                                            lh2.o oVar = new lh2.o(mVar, bVar, zVar, map);
                                            kh2.f.a aVar7 = kh2.f.f104790a;
                                            SwitchCompat acclimationSwitchView = oVar.getAcclimationSwitchView();
                                            aVar7.getClass();
                                            kh2.f.a.a(mVar, acclimationSwitchView, bVar, hVar2, map);
                                            kh2.f.a.a(mVar, oVar.getSleepTrackingSwitchView(), bVar, hVar2, map);
                                            mVar.v6().addView(oVar);
                                            unit = Unit.INSTANCE;
                                        } else {
                                            unit = null;
                                        }
                                        if (unit == null) {
                                            dVar2.b("Transform not of type PulseOxTransform");
                                        }
                                    } else if (s.g(obj2, mh2.l.SELECTION.f118654a)) {
                                        zh2.a aVarA = zh2.e.a();
                                        Context contextRequireContext2 = mVar.requireContext();
                                        contextRequireContext2.getClass();
                                        ei2.h hVarG2 = ((uc0.d) aVarA).g(contextRequireContext2, str2);
                                        if (!(hVarG2 instanceof ei2.e)) {
                                            hVarG2 = null;
                                        }
                                        ei2.e eVar = (ei2.e) hVarG2;
                                        if (eVar == null) {
                                            Context contextRequireContext3 = mVar.requireContext();
                                            contextRequireContext3.getClass();
                                            eVar = new ei2.e(contextRequireContext3);
                                        }
                                        p pVar = new p(mVar, eVar, bVar, map);
                                        kh2.b.f104780a.getClass();
                                        pVar.setOnClickListener(new ew2.c((ei2.h) eVar, bVar, (Map) map, (Object) mVar, 11));
                                        mVar.v6().addView(pVar);
                                    } else if (s.g(obj2, mh2.l.SINGLE_LABEL.f118654a)) {
                                        lh2.q qVar = new lh2.q(mVar, bVar, hVar2, map);
                                        kh2.d.f104784a.getClass();
                                        kh2.d.a.a(mVar, qVar, bVar, map);
                                        mVar.v6().addView(qVar);
                                    } else if (s.g(obj2, mh2.l.SPACER.f118654a)) {
                                        mVar.v6().addView(new lh2.s(mVar, bVar, map));
                                    } else if (s.g(obj2, mh2.l.SWITCH.f118654a)) {
                                        Context contextRequireContext4 = mVar.requireContext();
                                        contextRequireContext4.getClass();
                                        d0 d0Var = new d0(contextRequireContext4);
                                        lh2.t tVar = new lh2.t(mVar, d0Var, bVar, map);
                                        kh2.f.a aVar8 = kh2.f.f104790a;
                                        SwitchCompat switchView = tVar.getSwitchView();
                                        aVar8.getClass();
                                        kh2.f.a.a(mVar, switchView, bVar, d0Var, map);
                                        mVar.v6().addView(tVar);
                                    } else if (s.g(obj2, mh2.l.TEXT.f118654a)) {
                                        mVar.v6().addView(new lh2.k(mVar, bVar, hVar2, map));
                                    }
                                }
                            }
                        }
                    } else if (hVarG instanceof ei2.d) {
                        mVar.v6().addView(new lh2.e(mVar, (ei2.d) hVarG, bVar, map));
                    } else {
                        dVar2.b("frameView: required DeviceTransform and found " + s0.f105811a.b(hVarG.getClass()).D());
                    }
                }
            }
        } catch (NoSuchElementException unused2) {
            dVar2.getClass();
        }
        it = dVar.f126167g.iterator();
        androidx.fragment.app.m activity = getActivity();
        if (activity instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b) {
            com.garmin.androiddynamicsettings.app.presentationlayer.b bVar4 = (com.garmin.androiddynamicsettings.app.presentationlayer.b) activity;
            if (bVar4.getSupportFragmentManager().M() == 0) {
                nh2.d dVar3 = this.f27715c;
                if (dVar3 == null) {
                    s.m("settingsDataModel");
                    throw null;
                }
                aVar = dVar3.f126165e;
            } else {
                aVar = mh2.a.Back;
            }
            this.f27721i = aVar;
            hi2.i.a aVar9 = hi2.i.f83907a;
            Context contextRequireContext5 = requireContext();
            contextRequireContext5.getClass();
            nh2.d dVar4 = this.f27715c;
            if (dVar4 == null) {
                s.m("settingsDataModel");
                throw null;
            }
            String str3 = dVar4.f126164d;
            aVar9.getClass();
            com.garmin.androiddynamicsettings.app.presentationlayer.b.Q9(bVar4, hi2.i.a.c(contextRequireContext5, str3, null), this.f27721i, 2);
            bVar4.hideProgressOverlay();
        }
    }

    public final void u6() {
        v supportFragmentManager;
        Context context = this.f27717e;
        if (context == null) {
            s.m("activityContext");
            throw null;
        }
        Toast.makeText(context, getString(R.string.txt_something_went_wrong_try_again), 0).show();
        androidx.fragment.app.m activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.k(this);
        aVar.e();
    }

    public final LinearLayout v6() {
        LinearLayout linearLayout = this.f27718f;
        if (linearLayout != null) {
            return linearLayout;
        }
        s.m("linearLayout");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci2/m$a;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(nh2.d dVar) {
            dVar.getClass();
            m mVar = new m();
            Bundle bundle = new Bundle();
            bundle.putParcelable("SETTINGS_DATA_MODEL_BUNDLE", dVar);
            mVar.setArguments(bundle);
            return mVar;
        }

        private a() {
        }
    }
}
