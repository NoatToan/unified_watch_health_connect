package o43;

/* JADX INFO: loaded from: classes3.dex */
public class g extends e.i<Object> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f129116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f129117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, e eVar2, e23.a aVar, e23.l lVar, e23.l lVar2) {
        super(eVar2, aVar);
        this.f129116e = lVar;
        this.f129117f = lVar2;
    }

    @Override // o43.e.f
    public final e.m<Object> c(boolean z14) {
        e23.l lVar = this.f129116e;
        return lVar == null ? super.c(z14) : e.m.b(lVar.invoke(Boolean.valueOf(z14)));
    }

    @Override // o43.e.g
    public final void d(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "value", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5", "doPostCompute"));
        }
        this.f129117f.invoke(obj);
    }
}
