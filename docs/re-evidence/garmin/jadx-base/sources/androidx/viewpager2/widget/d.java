package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes7.dex */
public class d extends ViewPager2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2.i f11390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewPager2.i iVar) {
        super(null);
        this.f11390a = iVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.f, androidx.recyclerview.widget.RecyclerView.j
    public final void onChanged() {
        this.f11390a.a();
    }
}
