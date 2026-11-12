package n63;

import java.lang.annotation.Annotation;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ln63/d;", "Li63/c;", "Ln63/c;", "<init>", "()V", "a", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements i63.c<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f123897a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f123898b = a.f123899b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln63/d$a;", "Lk63/e;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements k63.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f123899b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f123900c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m63.d f123901a = j63.a.b(k.f123936a).f116936b;

        private a() {
        }

        @Override // k63.e
        public final boolean b() {
            this.f123901a.getClass();
            return false;
        }

        @Override // k63.e
        /* JADX INFO: renamed from: c */
        public final int getF116985c() {
            return this.f123901a.f117017b;
        }

        @Override // k63.e
        public final String d(int i14) {
            this.f123901a.getClass();
            return String.valueOf(i14);
        }

        @Override // k63.e
        public final List<Annotation> e(int i14) {
            return this.f123901a.e(i14);
        }

        @Override // k63.e
        /* JADX INFO: renamed from: f */
        public final String getF103257a() {
            return f123900c;
        }

        @Override // k63.e
        public final int g(String str) {
            str.getClass();
            return this.f123901a.g(str);
        }

        @Override // k63.e
        public final List<Annotation> getAnnotations() {
            this.f123901a.getClass();
            return j0.f134944a;
        }

        @Override // k63.e
        /* JADX INFO: renamed from: getKind */
        public final k63.l getF103234b() {
            this.f123901a.getClass();
            return k63.m.b.f103254a;
        }

        @Override // k63.e
        public final k63.e h(int i14) {
            return this.f123901a.h(i14);
        }

        @Override // k63.e
        public final boolean i(int i14) {
            this.f123901a.i(i14);
            return false;
        }

        @Override // k63.e
        /* JADX INFO: renamed from: isInline */
        public final boolean getF116965m() {
            this.f123901a.getClass();
            return false;
        }
    }

    private d() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        g8.i.n(eVar);
        return new c((List) j63.a.b(k.f123936a).deserialize(eVar));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f123898b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        c cVar = (c) obj;
        cVar.getClass();
        g8.i.l(fVar);
        j63.a.b(k.f123936a).serialize(fVar, cVar);
    }
}
