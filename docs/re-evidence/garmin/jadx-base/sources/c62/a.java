package c62;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lc62/a;", "", "<init>", "()V", "b", "a", "Lc62/a$a;", "Lc62/a$b;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: c62.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc62/a$a;", "Lc62/a;", "", "showLeadingIcon", "Lkotlin/Function0;", "", "onClick", "<init>", "(ZLe23/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0355a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f24653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0355a(boolean z14, e23.a<Unit> aVar) {
            super(null);
            aVar.getClass();
            this.f24652a = z14;
            this.f24653b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0355a)) {
                return false;
            }
            C0355a c0355a = (C0355a) obj;
            return this.f24652a == c0355a.f24652a && p005kotlin.jvm.internal.s.g(this.f24653b, c0355a.f24653b);
        }

        public final int hashCode() {
            return this.f24653b.hashCode() + (Boolean.hashCode(this.f24652a) * 31);
        }

        public final String toString() {
            return "DoWorkout(showLeadingIcon=" + this.f24652a + ", onClick=" + this.f24653b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc62/a$b;", "Lc62/a;", "", "isPrimary", "Lkotlin/Function0;", "", "onClick", "<init>", "(ZLe23/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f24655b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, e23.a<Unit> aVar) {
            super(null);
            aVar.getClass();
            this.f24654a = z14;
            this.f24655b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f24654a == bVar.f24654a && p005kotlin.jvm.internal.s.g(this.f24655b, bVar.f24655b);
        }

        public final int hashCode() {
            return this.f24655b.hashCode() + (Boolean.hashCode(this.f24654a) * 31);
        }

        public final String toString() {
            return "SaveMSN(isPrimary=" + this.f24654a + ", onClick=" + this.f24655b + ")";
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private a() {
    }
}
