package d81;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g81.c0 f58342b;

    public /* synthetic */ m(g81.c0 c0Var, int i14) {
        this.f58341a = i14;
        this.f58342b = c0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int size;
        switch (this.f58341a) {
            case 0:
                size = this.f58342b.f76290d.size();
                break;
            default:
                size = this.f58342b.f76290d.size();
                break;
        }
        return Integer.valueOf(size);
    }
}
