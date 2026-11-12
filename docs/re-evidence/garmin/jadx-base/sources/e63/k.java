package e63;

import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le63/k;", "Target", "Le63/l;", "Le63/n;", "Ld63/a;", "field", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Le63/n;IILjava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<Target, d63.a> f63251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f63254d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Target, d63.a> {
        public a(Object obj) {
            super(1, obj, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // e23.l
        public final d63.a invoke(Object obj) {
            return (d63.a) ((b) this.receiver).b(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(n<? super Target, d63.a> nVar, int i14, int i15, List<Integer> list) {
        nVar.getClass();
        list.getClass();
        this.f63251a = nVar;
        this.f63252b = i14;
        this.f63253c = i15;
        this.f63254d = list;
    }

    @Override // e63.l
    public final f63.e<Target> a() {
        return new f63.d(new a(this.f63251a.a()), this.f63252b, this.f63253c, this.f63254d);
    }

    @Override // e63.l
    public final g63.o<Target> b() {
        n<Target, d63.a> nVar = this.f63251a;
        return new g63.o<>(p13.w.c(new g63.g(p13.w.c(new g63.d(this.f63252b, this.f63253c, nVar.a(), nVar.getF63256b())))), j0.f134944a);
    }

    @Override // e63.l
    public final n<Target, d63.a> c() {
        return this.f63251a;
    }
}
