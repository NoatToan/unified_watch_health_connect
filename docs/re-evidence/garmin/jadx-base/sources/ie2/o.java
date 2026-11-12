package ie2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lie2/o;", "", "<init>", "()V", "a", "b", "Lie2/o$a;", "Lie2/o$b;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class o {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lie2/o$a;", "Lie2/o;", "", "length", "<init>", "(F)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f93151a;

        public a(float f14) {
            super(null);
            this.f93151a = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f93151a, ((a) obj).f93151a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f93151a);
        }

        public final String toString() {
            return "Dash(length=" + this.f93151a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lie2/o$b;", "Lie2/o;", "", "length", "<init>", "(F)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f93152a;

        public b(float f14) {
            super(null);
            this.f93152a = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f93152a, ((b) obj).f93152a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f93152a);
        }

        public final String toString() {
            return "Gap(length=" + this.f93152a + ")";
        }
    }

    public /* synthetic */ o(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private o() {
    }
}
