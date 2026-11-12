package ph2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import com.garmin.androiddynamicsettings.app.features.controlsmenu.boundedcontrolsupport.presenter.BoundedControlsMenuActivity;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lph2/d;", "Lfe/a;", "Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/boundedcontrolsupport/presenter/BoundedControlsMenuActivity;", "boundedControlsMenuActivity", "Loh2/a;", "boundedControlsMenuDTO", "", "numberOfIcons", "<init>", "(Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/boundedcontrolsupport/presenter/BoundedControlsMenuActivity;Loh2/a;I)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends fe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BoundedControlsMenuActivity f137717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oh2.a f137718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f137719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f137720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f137721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oh2.c f137722f;

    public d(BoundedControlsMenuActivity boundedControlsMenuActivity, oh2.a aVar, int i14) {
        boundedControlsMenuActivity.getClass();
        aVar.getClass();
        this.f137717a = boundedControlsMenuActivity;
        this.f137718b = aVar;
        this.f137719c = i14;
        this.f137720d = LayoutInflater.from(boundedControlsMenuActivity);
        this.f137721e = 255;
    }

    public final void a(int i14, int i15, boolean z14) {
        ArrayList<oh2.c> arrayList = this.f137718b.f132166c;
        oh2.c cVar = !z14 ? arrayList.get(i14) : null;
        oh2.a aVar = this.f137718b;
        oh2.c cVarB = aVar.b(i15, aVar.f132165b);
        if (cVarB != null && (i14 < arrayList.size() || z14)) {
            oh2.a aVar2 = this.f137718b;
            ArrayList<oh2.c> arrayList2 = aVar2.f132165b;
            y0.a(arrayList2).remove(aVar2.b(i15, arrayList2));
            cVarB.f132173b = 255;
            oh2.a aVar3 = this.f137718b;
            if (z14) {
                aVar3.f132166c.add(cVarB);
            } else {
                aVar3.f132166c.add(i14 + 1, cVarB);
            }
        }
        if (cVar != null && i14 < arrayList.size()) {
            this.f137718b.f132166c.remove(i14);
            cVar.f132173b = i15;
            this.f137718b.f132165b.add(cVar);
        }
        BoundedControlsMenuActivity boundedControlsMenuActivity = this.f137717a;
        oh2.a aVar4 = boundedControlsMenuActivity.f50600p;
        if (aVar4 == null) {
            s.m("boundedControlsMenuDTO");
            throw null;
        }
        oh2.c cVarB2 = aVar4.b(i15, aVar4.f132165b);
        qh2.a aVar5 = boundedControlsMenuActivity.f50597m;
        if (aVar5 == null) {
            s.m("controlsMenuPreviewView");
            throw null;
        }
        int i16 = cVarB2 != null ? cVarB2.f132175d : 2131231194;
        ImageView imageView = aVar5.watchFaceIconImageViews[i15];
        if (imageView != null) {
            imageView.setImageResource(i16);
        }
        ImageView imageView2 = aVar5.watchFaceIconImageViews[i15];
        if (imageView2 != null) {
            imageView2.setSelected(false);
        }
        boundedControlsMenuActivity.X9(i15);
        d dVar = boundedControlsMenuActivity.f50601q;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        } else {
            s.m("controlsMenuAdapter");
            throw null;
        }
    }

    @Override // fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        viewGroup.getClass();
        obj.getClass();
        viewGroup.removeView((LinearLayout) obj);
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF149591t() {
        return this.f137718b.f132166c.size();
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        obj.getClass();
        return -2;
    }

    @Override // fe.a
    public final float getPageWidth(int i14) {
        return 1.0f / this.f137719c;
    }

    @Override // fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = this.f137720d.inflate(R.layout.dsl_bounded_controls_menu_carousel_item, viewGroup, false);
        oh2.c cVar = this.f137718b.f132166c.get(i14);
        cVar.getClass();
        oh2.c cVar2 = cVar;
        ((ImageView) viewInflate.findViewById(R.id.iv_control_menu_carousel_item)).setImageResource(cVar2.f132175d);
        ((StyledTextView) viewInflate.findViewById(R.id.tv_control_menu_item_text)).setText(cVar2.f132176e);
        viewInflate.setOnClickListener(new b0(this, i14, 15));
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // fe.a
    public final boolean isViewFromObject(View view2, Object obj) {
        view2.getClass();
        obj.getClass();
        return view2 == ((LinearLayout) obj);
    }
}
