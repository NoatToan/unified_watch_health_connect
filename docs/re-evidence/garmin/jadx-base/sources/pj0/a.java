package pj0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qj0.k;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lpj0/a;", "", "", "linkText", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2615a f137875c = new C2615a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137877b;

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f137876a = str;
        this.f137877b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f137876a.equals(aVar.f137876a) && this.f137877b.equals(aVar.f137877b);
    }

    public final int hashCode() {
        return this.f137877b.hashCode() + (this.f137876a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("GCPlusLegalContent(linkText=", this.f137876a, ", link=", this.f137877b, ")");
    }

    /* JADX INFO: renamed from: pj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpj0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2615a {
        public /* synthetic */ C2615a(j jVar) {
            this();
        }

        public static a a(k kVar) {
            kVar.getClass();
            String text = kVar.getText();
            if (text == null) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GCPlusLegalContent", "Missing text");
                return null;
            }
            String link = kVar.getLink();
            if (link != null) {
                return new a(text, link);
            }
            a2 a2Var2 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "GCPlusLegalContent", "Missing text");
            return null;
        }

        private C2615a() {
        }
    }
}
