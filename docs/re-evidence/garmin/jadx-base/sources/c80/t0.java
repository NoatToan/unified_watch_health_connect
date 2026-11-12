package c80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\t\nB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lc80/t0;", "", "Lc80/t0$b;", "image", "", "icon", "iconPrerendered", "<init>", "(Lc80/t0$b;Ljava/lang/String;Ljava/lang/String;)V", "b", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25589d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25592c;

    public t0(b bVar, String str, String str2) {
        this.f25590a = bVar;
        this.f25591b = str;
        this.f25592c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return p005kotlin.jvm.internal.s.g(this.f25590a, t0Var.f25590a) && p005kotlin.jvm.internal.s.g(this.f25591b, t0Var.f25591b) && p005kotlin.jvm.internal.s.g(this.f25592c, t0Var.f25592c);
    }

    public final int hashCode() {
        b bVar = this.f25590a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f25591b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25592c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PromoResources(image=");
        sb3.append(this.f25590a);
        sb3.append(", icon=");
        sb3.append(this.f25591b);
        sb3.append(", iconPrerendered=");
        return am.j.o(this.f25592c, ")", sb3);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lc80/t0$b;", "", "", "path", "Lc80/i0;", "backgroundStyle", "<init>", "(Ljava/lang/String;Lc80/i0;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f25593c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f25595b;

        public b(String str, i0 i0Var) {
            str.getClass();
            i0Var.getClass();
            this.f25594a = str;
            this.f25595b = i0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f25594a.equals(bVar.f25594a) && this.f25595b == bVar.f25595b;
        }

        public final int hashCode() {
            return this.f25595b.hashCode() + (this.f25594a.hashCode() * 31);
        }

        public final String toString() {
            return "Image(path=" + this.f25594a + ", backgroundStyle=" + this.f25595b + ")";
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc80/t0$b$a;", "", "<init>", "()V", "", "BACKGROUND_STYLE_PARAM", "Ljava/lang/String;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/t0$a;", "", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
