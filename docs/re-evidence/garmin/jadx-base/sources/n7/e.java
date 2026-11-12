package n7;

import am.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import k32.n;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class e extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f123981c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f123982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f123983b;

    public e(Context context, List<b> list) {
        super(context);
        this.f123982a = new ArrayList();
        setProtections(list);
    }

    private f getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof f) {
            return (f) tag;
        }
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, fVar);
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[LOOP:0: B:7:0x0028->B:27:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba A[SYNTHETIC] */
    public final void a() {
        int i14;
        int i15;
        int i16;
        FrameLayout.LayoutParams layoutParams;
        View view2;
        d dVar;
        ArrayList arrayList = this.f123982a;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        f orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.f123983b = new c(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.f123983b.f123973a.size();
        for (int i17 = 0; i17 < size; i17++) {
            b bVar = this.f123983b.f123973a.get(i17);
            Context context = getContext();
            int i18 = i17 + childCount;
            b.a aVar = bVar.f123958b;
            int i19 = bVar.f123957a;
            int i24 = -1;
            if (i19 != 1) {
                if (i19 == 2) {
                    i16 = aVar.f123965b;
                    i15 = 48;
                } else if (i19 == 4) {
                    i14 = aVar.f123964a;
                    i15 = 5;
                } else if (i19 != 8) {
                    h.s(j.h(i19, "Unexpected side: "));
                    return;
                } else {
                    i16 = aVar.f123965b;
                    i15 = 80;
                }
                layoutParams = new FrameLayout.LayoutParams(i24, i16, i15);
                c7.e eVar = aVar.f123966c;
                layoutParams.leftMargin = eVar.f25190a;
                layoutParams.topMargin = eVar.f25191b;
                layoutParams.rightMargin = eVar.f25192c;
                layoutParams.bottomMargin = eVar.f25193d;
                view2 = new View(context);
                view2.setTag(f123981c);
                view2.setTranslationX(aVar.f123969f);
                view2.setTranslationY(aVar.f123970g);
                view2.setAlpha(aVar.f123971h);
                view2.setVisibility(aVar.f123967d ? 0 : 8);
                view2.setBackground(aVar.f123968e);
                dVar = new d(this, layoutParams, view2);
                if (aVar.f123972i == null) {
                    h.z("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    aVar.f123972i = dVar;
                    addView(view2, i18, layoutParams);
                }
            } else {
                i14 = aVar.f123964a;
                i15 = 3;
            }
            i24 = i14;
            i16 = -1;
            layoutParams = new FrameLayout.LayoutParams(i24, i16, i15);
            c7.e eVar2 = aVar.f123966c;
            layoutParams.leftMargin = eVar2.f25190a;
            layoutParams.topMargin = eVar2.f25191b;
            layoutParams.rightMargin = eVar2.f25192c;
            layoutParams.bottomMargin = eVar2.f25193d;
            view2 = new View(context);
            view2.setTag(f123981c);
            view2.setTranslationX(aVar.f123969f);
            view2.setTranslationY(aVar.f123970g);
            view2.setAlpha(aVar.f123971h);
            view2.setVisibility(aVar.f123967d ? 0 : 8);
            view2.setBackground(aVar.f123968e);
            dVar = new d(this, layoutParams, view2);
            if (aVar.f123972i == null) {
                h.z("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                return;
            } else {
                aVar.f123972i = dVar;
                addView(view2, i18, layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        if (view2 != null && view2.getTag() != f123981c) {
            c cVar = this.f123983b;
            int childCount = getChildCount() - (cVar != null ? cVar.f123973a.size() : 0);
            if (i14 > childCount || i14 < 0) {
                i14 = childCount;
            }
        }
        super.addView(view2, i14, layoutParams);
    }

    public final void b() {
        c cVar;
        if (this.f123983b != null) {
            removeViews(getChildCount() - this.f123983b.f123973a.size(), this.f123983b.f123973a.size());
            int size = this.f123983b.f123973a.size();
            int i14 = 0;
            while (true) {
                cVar = this.f123983b;
                if (i14 >= size) {
                    break;
                }
                b.a aVar = cVar.f123973a.get(i14).f123958b;
                b.a.InterfaceC2332a interfaceC2332a = aVar.f123972i;
                aVar.f123972i = null;
                i14++;
            }
            ArrayList<b> arrayList = cVar.f123973a;
            if (!cVar.f123978f) {
                cVar.f123978f = true;
                cVar.f123974b.f123985b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    arrayList.get(size2).f123963g = null;
                }
                arrayList.clear();
            }
            this.f123983b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof f) {
            f fVar = (f) tag;
            if (fVar.f123985b.isEmpty()) {
                fVar.f123984a.post(new n(fVar, 23));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<b> list) {
        ArrayList arrayList = this.f123982a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.f123982a = new ArrayList();
    }

    public e(Context context) {
        super(context);
        this.f123982a = new ArrayList();
    }
}
