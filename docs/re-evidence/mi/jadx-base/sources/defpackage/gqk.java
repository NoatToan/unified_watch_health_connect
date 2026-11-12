package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gqk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gqk f19241b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile h00 f19242a = null;

    public static class a extends gqk {
        @Override // defpackage.gqk
        public h00 a(eqk eqkVar) throws h00.c {
            throw new h00.c(eqkVar);
        }
    }

    public abstract h00 a(eqk eqkVar) throws h00.c;

    public final h00 b(eqk eqkVar) throws h00.c {
        if (this.f19242a == null) {
            this.f19242a = a(eqkVar);
        }
        return this.f19242a;
    }
}
