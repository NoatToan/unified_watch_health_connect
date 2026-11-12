package c80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc80/r0;", "Lc80/w0;", "", "urlString", "<init>", "(Ljava/lang/String;)V", "a", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r0 implements w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25556c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25557b;

    public r0(String str) {
        str.getClass();
        this.f25557b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.f25557b.equals(((r0) obj).f25557b);
    }

    public final int hashCode() {
        return this.f25557b.hashCode();
    }

    public final String toString() {
        return am.j.m("PromoLinkTarget(urlString=", this.f25557b, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc80/r0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
