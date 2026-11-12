package cz2;

import java.util.PriorityQueue;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcz2/h;", "", "<init>", "()V", "a", "b", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityQueue<b> f56902a = new PriorityQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56903b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f56904c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcz2/h$b;", "", "", "priority", "Lo53/l1;", "parent", "Lkotlin/Function0;", "", "callback", "<init>", "(ILo53/l1;Le23/a;)V", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l1 f56906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f56907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f56908d;

        public b(int i14, l1 l1Var, e23.a<Unit> aVar) {
            l1Var.getClass();
            aVar.getClass();
            this.f56905a = i14;
            this.f56906b = l1Var;
            this.f56907c = aVar;
            this.f56908d = System.currentTimeMillis();
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            bVar2.getClass();
            int i14 = bVar2.f56905a;
            int i15 = this.f56905a;
            if (i15 == i14) {
                return this.f56908d < bVar2.f56908d ? -1 : 1;
            }
            return i15 > i14 ? -1 : 1;
        }
    }

    static {
        new a(null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcz2/h$a;", "", "<init>", "()V", "", "DEFAULT_PRIORITY", "I", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
