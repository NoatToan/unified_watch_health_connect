package pk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpk0/r$a;", "Lpk0/r;", "", "sectionLabel", "<init>", "(Ljava/lang/String;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138267b;

        public a(String str) {
            str.getClass();
            this.f138266a = str;
            this.f138267b = fb1.c.n("header_", str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f138266a.equals(((a) obj).f138266a);
        }

        @Override // pk0.r
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF138270c() {
            return this.f138267b;
        }

        public final int hashCode() {
            return this.f138266a.hashCode();
        }

        public final String toString() {
            return am.j.m("HeaderItem(sectionLabel=", this.f138266a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpk0/r$b;", "Lpk0/r;", "", "text", "", "isSelected", "<init>", "(Ljava/lang/String;Z)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f138269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f138270c;

        public b(String str, boolean z14) {
            str.getClass();
            this.f138268a = str;
            this.f138269b = z14;
            this.f138270c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f138268a.equals(bVar.f138268a) && this.f138269b == bVar.f138269b;
        }

        @Override // pk0.r
        /* JADX INFO: renamed from: getKey, reason: from getter */
        public final String getF138270c() {
            return this.f138270c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f138269b) + (this.f138268a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("SelectableRowItem(text=", this.f138268a, ", isSelected=", this.f138269b, ")");
        }
    }

    /* JADX INFO: renamed from: getKey */
    String getF138270c();
}
