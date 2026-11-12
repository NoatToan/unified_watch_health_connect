package yu0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lyu0/b;", "", "<init>", "()V", "b", "a", "Lyu0/b$a;", "Lyu0/b$b;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyu0/b$a;", "Lyu0/b;", "<init>", "()V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199691a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1850350777;
        }

        public final String toString() {
            return "Gone";
        }
    }

    /* JADX INFO: renamed from: yu0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyu0/b$b;", "Lyu0/b;", "Lyu0/a;", "bannerType", "<init>", "(Lyu0/a;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3736b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yu0.a f199692a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3736b(yu0.a aVar) {
            super(null);
            aVar.getClass();
            this.f199692a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3736b) && this.f199692a == ((C3736b) obj).f199692a;
        }

        public final int hashCode() {
            return this.f199692a.hashCode();
        }

        public final String toString() {
            return "Visible(bannerType=" + this.f199692a + ")";
        }
    }

    public /* synthetic */ b(j jVar) {
        this();
    }

    private b() {
    }
}
