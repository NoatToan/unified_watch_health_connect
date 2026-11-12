package p005kotlin.jvm.internal;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import k23.p;
import k23.q;
import k23.s;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/jvm/internal/z0;", "Lkotlin/jvm/internal/u;", "", "Lkotlin/jvm/internal/TypeParameterContainer;", TtmlNode.RUBY_CONTAINER, "", "name", "Lk23/s;", "variance", "", "isReified", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lk23/s;Z)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0 extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f105819f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f105821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile List<? extends p> f105822e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Object obj, String str, s sVar, boolean z14) {
        super(obj);
        obj.getClass();
        str.getClass();
        sVar.getClass();
        this.f105820c = str;
        this.f105821d = sVar;
    }

    @Override // k23.q
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF122625c() {
        return this.f105820c;
    }

    @Override // k23.q
    public final List<p> getUpperBounds() {
        List list = this.f105822e;
        if (list != null) {
            return list;
        }
        List<p> listC = w.c(s0.b(Object.class));
        this.f105822e = listC;
        return listC;
    }

    @Override // k23.q
    /* JADX INFO: renamed from: m, reason: from getter */
    public final s getF122626d() {
        return this.f105821d;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/jvm/internal/z0$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.z0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2037a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f105823a;

            static {
                int[] iArr = new int[s.values().length];
                try {
                    iArr[s.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f105823a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static String a(q qVar) {
            StringBuilder sb3 = new StringBuilder();
            int i14 = C2037a.f105823a[qVar.getF122626d().ordinal()];
            if (i14 == 1) {
                Unit unit = Unit.INSTANCE;
            } else if (i14 == 2) {
                sb3.append("in ");
            } else {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                sb3.append("out ");
            }
            sb3.append(qVar.getF122625c());
            return sb3.toString();
        }

        private a() {
        }
    }
}
