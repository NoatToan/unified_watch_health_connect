package p006l2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import x5.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ll2/s3;", "", "", "maxStoredCharacters", "<init>", "(I)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f108785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f108786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f108788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f108789f;

    public /* synthetic */ s3(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 100000 : i14);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    public final void a(l0 l0Var) {
        a aVar;
        l0 l0Var2;
        this.f108789f = false;
        a aVar2 = this.f108785b;
        if (s.g(l0Var, aVar2 != null ? aVar2.f108791b : null)) {
            return;
        }
        String str = l0Var.f188878a.f157138b;
        a aVar3 = this.f108785b;
        boolean zG = s.g(str, (aVar3 == null || (l0Var2 = aVar3.f108791b) == null) ? null : l0Var2.f188878a.f157138b);
        a aVar4 = this.f108785b;
        if (zG) {
            if (aVar4 != null) {
                aVar4.f108791b = l0Var;
                return;
            }
            return;
        }
        this.f108785b = new a(aVar4, l0Var);
        this.f108786c = null;
        int length = l0Var.f188878a.f157138b.length() + this.f108787d;
        this.f108787d = length;
        if (length > this.f108784a) {
            a aVar5 = this.f108785b;
            if ((aVar5 != null ? aVar5.f108790a : null) == null) {
                return;
            }
            while (true) {
                if (aVar5 == null) {
                    aVar = null;
                } else {
                    a aVar6 = aVar5.f108790a;
                    if (aVar6 != null) {
                        aVar = aVar6.f108790a;
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    break;
                } else {
                    aVar5 = aVar5.f108790a;
                }
            }
            if (aVar5 != null) {
                aVar5.f108790a = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll2/s3$a;", "", "next", "Lx5/l0;", "value", "<init>", "(Ll2/s3$a;Lx5/l0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f108790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l0 f108791b;

        public /* synthetic */ a(a aVar, l0 l0Var, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : aVar, l0Var);
        }

        public a(a aVar, l0 l0Var) {
            this.f108790a = aVar;
            this.f108791b = l0Var;
        }
    }

    public s3(int i14) {
        this.f108784a = i14;
    }

    public s3() {
        this(0, 1, null);
    }
}
