package th;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class a extends fe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe.a f164545a;

    public a(fe.a aVar) {
        this.f164545a = aVar;
    }

    @Override // fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        fe.a aVar = this.f164545a;
        aVar.destroyItem(viewGroup, i14 % aVar.getCount(), obj);
    }

    @Override // fe.a
    public final void finishUpdate(ViewGroup viewGroup) {
        this.f164545a.finishUpdate(viewGroup);
    }

    @Override // fe.a
    public final int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override // fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        fe.a aVar = this.f164545a;
        return aVar.instantiateItem(viewGroup, i14 % aVar.getCount());
    }

    @Override // fe.a
    public final boolean isViewFromObject(View view2, Object obj) {
        return this.f164545a.isViewFromObject(view2, obj);
    }

    @Override // fe.a
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f164545a.restoreState(parcelable, classLoader);
    }

    @Override // fe.a
    public final Parcelable saveState() {
        return this.f164545a.saveState();
    }

    @Override // fe.a
    public final void startUpdate(ViewGroup viewGroup) {
        this.f164545a.startUpdate(viewGroup);
    }
}
