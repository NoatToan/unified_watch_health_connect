package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgy0/h;", "", "<init>", "()V", "b", "a", "Lgy0/h$a;", "Lgy0/h$b;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/h$a;", "Lgy0/h;", "Lcy0/o;", "image", "<init>", "(Lcy0/o;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cy0.o f80166a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cy0.o oVar) {
            super(null);
            oVar.getClass();
            this.f80166a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f80166a, ((a) obj).f80166a);
        }

        public final int hashCode() {
            return this.f80166a.hashCode();
        }

        public final String toString() {
            return "DeleteFailure(image=" + this.f80166a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/h$b;", "Lgy0/h;", "Lcy0/o;", "image", "<init>", "(Lcy0/o;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cy0.o f80167a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cy0.o oVar) {
            super(null);
            oVar.getClass();
            this.f80167a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f80167a, ((b) obj).f80167a);
        }

        public final int hashCode() {
            return this.f80167a.hashCode();
        }

        public final String toString() {
            return "DeleteSuccess(image=" + this.f80167a + ")";
        }
    }

    public /* synthetic */ h(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private h() {
    }
}
