package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lgy0/u1;", "", "<init>", "()V", "c", "a", "b", "Lgy0/u1$a;", "Lgy0/u1$b;", "Lgy0/u1$c;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class u1 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/u1$a;", "Lgy0/u1;", "Lcy0/e;", "conflict", "<init>", "(Lcy0/e;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cy0.e f80241a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cy0.e eVar) {
            super(null);
            eVar.getClass();
            this.f80241a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f80241a == ((a) obj).f80241a;
        }

        public final int hashCode() {
            return this.f80241a.hashCode();
        }

        public final String toString() {
            return "Conflict(conflict=" + this.f80241a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgy0/u1$b;", "Lgy0/u1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "responseCode", "<init>", "(Ljava/lang/Exception;Ljava/lang/Integer;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f80242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f80243b;

        public b(Exception exc, Integer num) {
            super(null);
            this.f80242a = exc;
            this.f80243b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f80242a, bVar.f80242a) && p005kotlin.jvm.internal.s.g(this.f80243b, bVar.f80243b);
        }

        public final int hashCode() {
            Exception exc = this.f80242a;
            int iHashCode = (exc == null ? 0 : exc.hashCode()) * 31;
            Integer num = this.f80243b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "Error(exception=" + this.f80242a + ", responseCode=" + this.f80243b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgy0/u1$c;", "Lgy0/u1;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f80244a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ u1(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private u1() {
    }
}
