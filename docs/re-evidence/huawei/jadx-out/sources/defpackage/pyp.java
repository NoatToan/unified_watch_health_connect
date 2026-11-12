package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.view.LayoutInflaterCompat;
import com.huawei.skinner.attrentry.SkinAttr;
import com.huawei.skinner.internal.IDynamicNewView;
import com.huawei.skinner.internal.ISkinUpdate2;
import com.huawei.skinner.internal.ISkinnableViewManager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class pyp implements ISkinUpdate2, IDynamicNewView, ISkinnableViewManager2 {
    private static final String d = "SkinnableProcessor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f45981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pyu f45982b;
    private ConcurrentHashMap<pyk, pyk> h = new ConcurrentHashMap<>();
    private boolean e = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45983c = false;

    public pyp(Activity activity) {
        this.f45981a = activity;
    }

    public void d() {
        if (this.e) {
            this.f45982b = new pyu(this);
            LayoutInflater layoutInflater = this.f45981a.getLayoutInflater();
            if (layoutInflater.getFactory() == null) {
                LayoutInflaterCompat.setFactory2(layoutInflater, this.f45982b);
            } else {
                if (layoutInflater.getFactory2() instanceof pyu) {
                    return;
                }
                pyt.f45989b.info(d, "init() The Activity's LayoutInflater already has a Factory installed so we can not install Skinner's");
            }
        }
    }

    public void e() {
        pyt.a(this.f45981a).attach(this);
    }

    public void c() {
        pyt.a(this.f45981a).detach(this);
        clean();
    }

    @Override // com.huawei.skinner.internal.ISkinUpdate
    public void onThemeServiceUpdate() {
        if (this.h.size() > 0) {
            for (pyk pykVar : this.h.keySet()) {
                if (pykVar != null && pykVar.b() != null) {
                    pykVar.e();
                }
            }
        }
    }

    @Override // com.huawei.skinner.internal.ISkinUpdate
    public void onThemeUpdate() {
        onThemeUpdate(false);
    }

    @Override // com.huawei.skinner.internal.ISkinUpdate2
    public void onThemeUpdate(boolean z) {
        applySkin(z);
    }

    @Override // com.huawei.skinner.internal.IDynamicNewView
    public void dynamicAddSkinableView(View view, String str, int i) {
        if (h()) {
            this.f45982b.c(this.f45981a, view, str, i);
        }
    }

    private boolean h() {
        return this.e && this.f45982b != null;
    }

    @Override // com.huawei.skinner.internal.IDynamicNewView
    public void dynamicAddSkinableView(View view, List<pye> list) {
        if (h()) {
            this.f45982b.c(this.f45981a, view, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public pyk addSkinnableView(pyk pykVar) {
        if (this.h.size() > 5000) {
            Iterator<Map.Entry<pyk, pyk>> it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<pyk, pyk> next = it.next();
                if (next == null || next.getValue() == null || next.getValue().b() == null) {
                    it.remove();
                }
            }
        }
        pyk pykVar2 = this.h.get(pykVar);
        if (pykVar2 != null) {
            List<SkinAttr> listC = pykVar2.c();
            for (SkinAttr skinAttr : pykVar.c()) {
                int iIndexOf = listC.indexOf(skinAttr);
                if (iIndexOf >= 0) {
                    listC.set(iIndexOf, skinAttr);
                } else {
                    listC.add(skinAttr);
                }
            }
            if (pykVar.a() == null) {
                pykVar.a(pyq.b().e(pykVar.b().getClass()));
            }
            return pykVar2;
        }
        try {
            this.h.put(pykVar, pykVar);
        } catch (Exception e) {
            pyt.f45989b.error(d, "addSkinnableView()", e);
        }
        pykVar.a(pyq.b().e(pykVar.b().getClass()));
        return pykVar;
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public pyk removeSkinnableView(pyk pykVar) {
        pyk pykVar2 = this.h.get(pykVar);
        if (pykVar2 == null) {
            return null;
        }
        Iterator<SkinAttr> it = pykVar2.c().iterator();
        while (it.hasNext()) {
            it.next().setCancled(true);
        }
        try {
            this.h.remove(pykVar2);
            return pykVar2;
        } catch (Exception e) {
            pyt.f45989b.error(d, "removeSkinnableView()", e);
            return pykVar2;
        }
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public void applySkin() {
        applySkin(false);
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager2
    public void applySkin(boolean z) {
        if (pyy.b(this.h)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (pyk pykVar : this.h.keySet()) {
            if (pykVar == null || pykVar.b() == null) {
                arrayList.add(pykVar);
            } else {
                pykVar.e = pykVar.b().isShown() && this.f45983c;
                pykVar.c(false);
            }
        }
        if (pyy.d((List) arrayList)) {
            return;
        }
        try {
            this.h.keySet().removeAll(arrayList);
        } catch (Exception e) {
            pyt.f45989b.error(d, "applySkin(isAnimateEnable)", e);
        }
    }

    @Override // com.huawei.skinner.internal.ISkinnableViewManager
    public void clean() {
        if (pyy.b(this.h)) {
            return;
        }
        for (pyk pykVar : this.h.keySet()) {
            if (pykVar == null) {
                pyt.f45989b.error(d, "clean() si is null");
            } else {
                pykVar.d();
            }
        }
    }

    public void d(boolean z) {
        this.e = z;
    }

    public boolean b() {
        return this.e;
    }

    public void b(boolean z) {
        this.f45983c = z;
    }

    public boolean a() {
        return this.f45983c;
    }
}
