package c03;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
public final /* synthetic */ class f extends q implements l<g, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f22433a = new f();

    public f() {
        super(1, g.class, "execute", "execute()V", 0);
    }

    @Override // e23.l
    public final Unit invoke(g gVar) {
        g gVar2 = gVar;
        gVar2.getClass();
        gVar2.execute();
        return Unit.INSTANCE;
    }
}
