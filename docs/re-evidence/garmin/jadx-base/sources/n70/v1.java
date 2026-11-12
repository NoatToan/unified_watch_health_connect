package n70;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f124679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j70.i f124680c;

    public /* synthetic */ v1(String str, j70.i iVar, int i14) {
        this.f124678a = i14;
        this.f124679b = str;
        this.f124680c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    /* JADX WARN: Code duplicated, block: B:25:0x002d  */
    @Override // e23.a
    public final Object invoke() {
        boolean z14;
        boolean z15;
        switch (this.f124678a) {
            case 0:
                if (this.f124679b != null) {
                    z14 = true;
                } else {
                    j70.i iVar = this.f124680c;
                    if ((iVar != null ? iVar.f97533a : null) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                return Boolean.valueOf(z14);
            default:
                if (this.f124679b != null) {
                    z15 = true;
                } else {
                    j70.i iVar2 = this.f124680c;
                    if ((iVar2 != null ? iVar2.f97533a : null) != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                return Boolean.valueOf(z15);
        }
    }
}
