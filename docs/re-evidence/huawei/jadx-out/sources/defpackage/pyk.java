package defpackage;

import android.view.View;
import com.huawei.skinner.R;
import com.huawei.skinner.attrentry.SkinAttr;
import com.huawei.skinner.theme.ThemeServiceInterceptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pyk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThemeServiceInterceptor f45969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<View> f45970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45971c;
    public boolean e = false;
    private List<SkinAttr> d = new ArrayList();

    public void c(boolean z) {
        View viewB;
        if (pyy.d((List) this.d) || (viewB = b()) == null) {
            return;
        }
        viewB.setTag(R.id.hw_tag_animate_enable, Boolean.valueOf(this.e));
        for (SkinAttr skinAttr : this.d) {
            if (!skinAttr.isCancled) {
                skinAttr.apply(viewB, z);
            }
        }
    }

    public void e() {
        ThemeServiceInterceptor themeServiceInterceptor;
        View viewB = b();
        if (viewB == null || !this.f45971c || (themeServiceInterceptor = this.f45969a) == null) {
            return;
        }
        themeServiceInterceptor.process(viewB);
    }

    public View b() {
        WeakReference<View> weakReference = this.f45970b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void c(View view) {
        Object tag = view.getTag(R.id.hw_theme_service_tag);
        if ((tag instanceof String) && "hwThemeServiceEnable".equals((String) tag)) {
            this.f45971c = true;
        }
        this.f45970b = new WeakReference<>(view);
    }

    public List<SkinAttr> c() {
        return this.d;
    }

    public ThemeServiceInterceptor a() {
        return this.f45969a;
    }

    public void a(ThemeServiceInterceptor themeServiceInterceptor) {
        this.f45969a = themeServiceInterceptor;
    }

    public void d() {
        if (pyy.d((List) this.d)) {
            return;
        }
        Iterator<SkinAttr> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().setCancled(true);
        }
        this.d.clear();
    }

    public String toString() {
        View viewB = b();
        StringBuilder sb = new StringBuilder("SkinnableView [view=");
        sb.append(viewB != null ? viewB.getClass().getSimpleName() : "Unknow");
        sb.append(", attrs=");
        sb.append(this.d);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        View viewB = b();
        return viewB != null ? viewB.hashCode() : super.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pyk)) {
            return false;
        }
        pyk pykVar = (pyk) obj;
        if (super.equals(obj)) {
            return true;
        }
        View viewB = b();
        return viewB != null && viewB.equals(pykVar.b());
    }
}
