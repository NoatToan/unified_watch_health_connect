package v2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0005B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lv2/o;", "", "initialChanges", "<init>", "(Lv2/o;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q3.c<a> f175101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3.c<a> f175102b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv2/o$a;", "", "", "preStart", "preEnd", "originalStart", "originalEnd", "<init>", "(IIII)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f175103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f175104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f175105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f175106d;

        public a(int i14, int i15, int i16, int i17) {
            this.f175103a = i14;
            this.f175104b = i15;
            this.f175105c = i16;
            this.f175106d = i17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f175103a == aVar.f175103a && this.f175104b == aVar.f175104b && this.f175105c == aVar.f175105c && this.f175106d == aVar.f175106d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f175106d) + q2.d(this.f175105c, q2.d(this.f175104b, Integer.hashCode(this.f175103a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Change(preStart=");
            sb3.append(this.f175103a);
            sb3.append(", preEnd=");
            sb3.append(this.f175104b);
            sb3.append(", originalStart=");
            sb3.append(this.f175105c);
            sb3.append(", originalEnd=");
            return ds.e0.j(sb3, this.f175106d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public o(o oVar) {
        q3.c<a> cVar;
        this.f175101a = new q3.c<>(new a[16], 0);
        this.f175102b = new q3.c<>(new a[16], 0);
        if (oVar == null || (cVar = oVar.f175101a) == null) {
            return;
        }
        a[] aVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            a aVar = aVarArr[i15];
            this.f175101a.b(new a(aVar.f175103a, aVar.f175104b, aVar.f175105c, aVar.f175106d));
        }
    }

    public final void a(a aVar, int i14, int i15, int i16) {
        int i17;
        q3.c<a> cVar = this.f175102b;
        int i18 = cVar.f142358c;
        if (i18 == 0) {
            i17 = 0;
        } else if (i18 == 0) {
            n23.j.s("MutableVector is empty.");
            return;
        } else {
            a aVar2 = cVar.f142356a[i18 - 1];
            i17 = aVar2.f175104b - aVar2.f175106d;
        }
        if (aVar == null) {
            int i19 = i14 - i17;
            aVar = new a(i14, i15 + i16, i19, (i15 - i14) + i19);
        } else {
            if (aVar.f175103a > i14) {
                aVar.f175103a = i14;
                aVar.f175105c = i14;
            }
            int i24 = aVar.f175104b;
            if (i15 > i24) {
                int i25 = i24 - aVar.f175106d;
                aVar.f175104b = i15;
                aVar.f175106d = i15 - i25;
            }
            aVar.f175104b += i16;
        }
        this.f175102b.b(aVar);
    }

    public final void b() {
        this.f175101a.g();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChangeList(changes=[");
        q3.c<a> cVar = this.f175101a;
        a[] aVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            a aVar = aVarArr[i15];
            sb3.append("(" + aVar.f175105c + CoreConstants.COMMA_CHAR + aVar.f175106d + ")->(" + aVar.f175103a + CoreConstants.COMMA_CHAR + aVar.f175104b + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            if (i15 < this.f175101a.f142358c - 1) {
                sb3.append(", ");
            }
        }
        sb3.append("])");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ o(o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar);
    }
}
