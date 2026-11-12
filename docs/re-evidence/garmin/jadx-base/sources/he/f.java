package he;

/* JADX INFO: loaded from: classes7.dex */
public class f extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.d f83474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a.d dVar) {
        super(null);
        this.f83474a = dVar;
    }

    @Override // he.a.b, androidx.recyclerview.widget.RecyclerView.j
    public final void onChanged() {
        this.f83474a.b(true);
    }
}
