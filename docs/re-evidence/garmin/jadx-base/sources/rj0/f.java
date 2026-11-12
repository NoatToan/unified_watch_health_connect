package rj0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lrj0/f;", "", "", "title", "Lrj0/b;", FirebaseAnalytics.Param.DESTINATION, "", "Lrj0/e;", "conditions", "<init>", "(Ljava/lang/String;Lrj0/b;Ljava/util/List;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f152988d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f152990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e> f152991c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, b bVar, List<? extends e> list) {
        str.getClass();
        bVar.getClass();
        list.getClass();
        this.f152989a = str;
        this.f152990b = bVar;
        this.f152991c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f152989a.equals(fVar.f152989a) && this.f152990b == fVar.f152990b && this.f152991c.equals(fVar.f152991c);
    }

    public final int hashCode() {
        return this.f152991c.hashCode() + ((this.f152990b.hashCode() + (this.f152989a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GCPlusLinkContent(title=");
        sb3.append(this.f152989a);
        sb3.append(", destination=");
        sb3.append(this.f152990b);
        sb3.append(", conditions=");
        return z.c(sb3, this.f152991c, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrj0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
