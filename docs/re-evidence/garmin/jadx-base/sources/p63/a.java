package p63;

import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lp63/a;", "", "<init>", "()V", "a", "b", "Lp63/a$a;", "Lp63/a$b;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: p63.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp63/a$a;", "Lp63/a;", "Li63/c;", "serializer", "<init>", "(Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2578a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i63.c<?> f136246a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2578a(i63.c<?> cVar) {
            super(null);
            cVar.getClass();
            this.f136246a = cVar;
        }

        @Override // p63.a
        public final i63.c<?> a(List<? extends i63.c<?>> list) {
            list.getClass();
            return this.f136246a;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C2578a) && s.g(((C2578a) obj).f136246a, this.f136246a);
        }

        public final int hashCode() {
            return this.f136246a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0005\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp63/a$b;", "Lp63/a;", "Lkotlin/Function1;", "", "Li63/c;", "provider", "<init>", "(Le23/l;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<List<? extends i63.c<?>>, i63.c<?>> f136247a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super List<? extends i63.c<?>>, ? extends i63.c<?>> lVar) {
            super(null);
            lVar.getClass();
            this.f136247a = lVar;
        }

        @Override // p63.a
        public final i63.c<?> a(List<? extends i63.c<?>> list) {
            list.getClass();
            return this.f136247a.invoke(list);
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    public abstract i63.c<?> a(List<? extends i63.c<?>> list);

    private a() {
    }
}
