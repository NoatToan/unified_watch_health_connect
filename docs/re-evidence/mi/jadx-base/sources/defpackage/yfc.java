package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class yfc implements d7g<e0b, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wbh<Integer> f40128b = wbh.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7g<e0b, e0b> f40129a;

    public static class a implements e7g<e0b, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a7g<e0b, e0b> f40130a = new a7g<>(500);

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<e0b, InputStream> d(iag iagVar) {
            return new yfc(this.f40130a);
        }
    }

    public yfc(a7g<e0b, e0b> a7gVar) {
        this.f40129a = a7gVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<InputStream> b(e0b e0bVar, int i, int i2, cch cchVar) {
        a7g<e0b, e0b> a7gVar = this.f40129a;
        if (a7gVar != null) {
            e0b e0bVarA = a7gVar.a(e0bVar, 0, 0);
            if (e0bVarA == null) {
                this.f40129a.b(e0bVar, 0, 0, e0bVar);
            } else {
                e0bVar = e0bVarA;
            }
        }
        return new d7g.a<>(e0bVar, new hhc(e0bVar, ((Integer) cchVar.c(f40128b)).intValue()));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(e0b e0bVar) {
        return true;
    }
}
