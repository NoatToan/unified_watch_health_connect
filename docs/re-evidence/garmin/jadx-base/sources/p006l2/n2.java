package p006l2;

import b2.e;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d6.p;
import g6.o;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import s5.c;
import s5.x0;
import s5.y;
import s5.y0;
import w5.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ll2/n2;", "", "Ls5/c;", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "maxLines", "minLines", "", "softWrap", "Ld6/p;", "overflow", "Lg6/c;", "density", "Lw5/q$b;", "fontFamilyResolver", "", "Ls5/c$d;", "Ls5/y;", "placeholders", "<init>", "(Ls5/c;Ls5/x0;IIZILg6/c;Lw5/q$b;Ljava/util/List;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f108674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f108675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f108678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f108679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g6.c f108680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q.b f108681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<c.d<y>> f108682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s5.q f108683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f108684k;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n2(c cVar, x0 x0Var, int i14, int i15, boolean z14, int i16, g6.c cVar2, q.b bVar, List list, int i17, j jVar) {
        int i18;
        int i19 = (i17 & 4) != 0 ? Integer.MAX_VALUE : i14;
        int i24 = (i17 & 8) != 0 ? 1 : i15;
        boolean z15 = (i17 & 16) != 0 ? true : z14;
        if ((i17 & 32) != 0) {
            p.f57793b.getClass();
            i18 = p.f57794c;
        } else {
            i18 = i16;
        }
        this(cVar, x0Var, i19, i24, z15, i18, cVar2, bVar, (i17 & 256) != 0 ? j0.f134944a : list, null);
    }

    public final void a(o oVar) {
        s5.q qVar = this.f108683j;
        if (qVar == null || oVar != this.f108684k || qVar.b()) {
            this.f108684k = oVar;
            qVar = new s5.q(this.f108674a, y0.a(this.f108675b, oVar), this.f108682i, this.f108680g, this.f108681h);
        }
        this.f108683j = qVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll2/n2$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private n2(c cVar, x0 x0Var, int i14, int i15, boolean z14, int i16, g6.c cVar2, q.b bVar, List<c.d<y>> list) {
        this.f108674a = cVar;
        this.f108675b = x0Var;
        this.f108676c = i14;
        this.f108677d = i15;
        this.f108678e = z14;
        this.f108679f = i16;
        this.f108680g = cVar2;
        this.f108681h = bVar;
        this.f108682i = list;
        if (!(i14 > 0)) {
            e.a("no maxLines");
        }
        if (!(i15 > 0)) {
            e.a("no minLines");
        }
        if (i15 <= i14) {
            return;
        }
        e.a("minLines greater than maxLines");
    }

    public /* synthetic */ n2(c cVar, x0 x0Var, int i14, int i15, boolean z14, int i16, g6.c cVar2, q.b bVar, List list, j jVar) {
        this(cVar, x0Var, i14, i15, z14, i16, cVar2, bVar, list);
    }
}
