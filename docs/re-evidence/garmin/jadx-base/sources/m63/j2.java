package m63;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/j2;", "Li63/c;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j2 implements i63.c<Unit> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f116966b = new j2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1<Unit> f116967a = new f1<>("kotlin.Unit", Unit.INSTANCE);

    private j2() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        this.f116967a.deserialize(eVar);
        return Unit.INSTANCE;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return this.f116967a.getF116202c();
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        this.f116967a.serialize(fVar, unit);
    }
}
