package nf;

import ch.qos.logback.core.CoreConstants;
import d53.w;
import hf.y;
import lf.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lnf/g;", "Lnf/j;", "Lhf/y;", "uri", "Lwf/m;", "options", "<init>", "(Lhf/y;Lwf/m;)V", "b", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f125749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125750b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/g$b;", "Lnf/j$a;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements j.a<y> {
        @Override // nf.j.a
        public final j a(y yVar, wf.m mVar, hf.j jVar) {
            y yVar2 = yVar;
            if (s.g(yVar2.f83620c, "data")) {
                return new g(yVar2, mVar);
            }
            return null;
        }
    }

    static {
        new a(null);
    }

    public g(y yVar, wf.m mVar) {
        this.f125749a = yVar;
        this.f125750b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) {
        y yVar = this.f125749a;
        String str = yVar.f83618a;
        String str2 = yVar.f83618a;
        int iH = w.H(str, ";base64,", 0, false, 6);
        if (iH == -1) {
            o2.c.s(yVar, "invalid data uri: ");
            return null;
        }
        int iG = w.G(CoreConstants.COLON_CHAR, 0, 6, str2);
        if (iG == -1) {
            o2.c.s(yVar, "invalid data uri: ");
            return null;
        }
        String strSubstring = str2.substring(iG + 1, iH);
        byte[] bArrA = b23.a.a(b23.a.f15486f, str2, iH + 8, 4);
        w63.e eVar = new w63.e();
        eVar.write(bArrA, 0, bArrA.length);
        return new o(new r(eVar, this.f125750b.f185001f, null), strSubstring, lf.e.MEMORY);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnf/g$a;", "", "<init>", "()V", "", "BASE64_TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
