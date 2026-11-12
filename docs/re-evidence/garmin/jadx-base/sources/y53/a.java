package y53;

import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class a extends q implements e23.q<b, h<?>, Object, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f194546a = new a();

    public a() {
        super(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // e23.q
    public final Unit invoke(b bVar, h<?> hVar, Object obj) {
        b bVar2 = bVar;
        h<?> hVar2 = hVar;
        long j8 = bVar2.f194547a;
        if (j8 <= 0) {
            hVar2.c(Unit.INSTANCE);
        } else {
            vg1.d dVar = new vg1.d(19, hVar2, bVar2);
            hVar2.getClass();
            f fVar = (f) hVar2;
            t13.g gVar = fVar.f194557a;
            fVar.f194559c = m0.d(gVar).j(j8, dVar, gVar);
        }
        return Unit.INSTANCE;
    }
}
