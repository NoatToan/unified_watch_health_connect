package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class sfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public act f33600a;

    public /* synthetic */ sfs(ofs ofsVar) {
    }

    public final r2s a() {
        act actVar = this.f33600a;
        if (actVar != null) {
            return new lfs(actVar, null);
        }
        throw new IllegalStateException(String.valueOf(act.class.getCanonicalName()).concat(" must be set"));
    }

    public final sfs b(act actVar) {
        this.f33600a = actVar;
        return this;
    }
}
