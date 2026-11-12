package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class c7s implements t7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t7s f5031a;

    public static void b(t7s t7sVar, t7s t7sVar2) {
        c7s c7sVar = (c7s) t7sVar;
        if (c7sVar.f5031a != null) {
            throw new IllegalStateException();
        }
        c7sVar.f5031a = t7sVar2;
    }

    @Override // defpackage.f8s
    public final Object a() {
        t7s t7sVar = this.f5031a;
        if (t7sVar != null) {
            return t7sVar.a();
        }
        throw new IllegalStateException();
    }
}
