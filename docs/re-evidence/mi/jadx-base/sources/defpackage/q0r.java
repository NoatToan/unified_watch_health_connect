package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class q0r extends eih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ConstraintLayout> f30970a;

    public q0r(List<ConstraintLayout> list) {
        this.f30970a = list;
    }

    @Override // defpackage.eih
    public int getCount() {
        return this.f30970a.size();
    }

    @Override // defpackage.eih
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(gui.w0, viewGroup, false);
        ((RelativeLayout) viewInflate.findViewById(bri.x3)).addView(this.f30970a.get(i));
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // defpackage.eih
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
