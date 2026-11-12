package d10;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k extends j {
    public k(int i14) {
        super(i14 + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return u() + 1;
    }

    @Override // d10.j, d10.h, androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: r */
    public final void onBindViewHolder(h.a aVar, int i14) {
        super.onBindViewHolder(aVar, i14);
        if (i14 == 0) {
            aVar.f57035a.setDefaultText(R.string.common_all);
        } else {
            x(aVar, i14 - 1);
        }
    }

    @Override // d10.j
    public final void t(int i14) {
        z(i14 - 1);
    }

    public abstract int u();

    public abstract void x(h.a aVar, int i14);

    public abstract void z(int i14);
}
