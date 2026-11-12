package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lgy0/c;", "", "<init>", "()V", "c", "a", "b", "Lgy0/c$a;", "Lgy0/c$b;", "Lgy0/c$c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/c$a;", "Lgy0/c;", "Lcy0/e;", "conflict", "<init>", "(Lcy0/e;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cy0.e f80116a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cy0.e eVar) {
            super(null);
            eVar.getClass();
            this.f80116a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f80116a == ((a) obj).f80116a;
        }

        public final int hashCode() {
            return this.f80116a.hashCode();
        }

        public final String toString() {
            return "Conflict(conflict=" + this.f80116a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgy0/c$b;", "Lgy0/c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "responseCode", "<init>", "(Ljava/lang/Exception;Ljava/lang/Integer;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f80117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f80118b;

        public b(Exception exc, Integer num) {
            super(null);
            this.f80117a = exc;
            this.f80118b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f80117a, bVar.f80117a) && p005kotlin.jvm.internal.s.g(this.f80118b, bVar.f80118b);
        }

        public final int hashCode() {
            Exception exc = this.f80117a;
            int iHashCode = (exc == null ? 0 : exc.hashCode()) * 31;
            Integer num = this.f80118b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "Error(exception=" + this.f80117a + ", responseCode=" + this.f80118b + ")";
        }
    }

    /* JADX INFO: renamed from: gy0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgy0/c$c;", "Lgy0/c;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1605c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1605c f80119a = new C1605c();

        private C1605c() {
            super(null);
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private c() {
    }
}
