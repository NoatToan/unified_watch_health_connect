package ci;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tB%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\r"}, d2 = {"Lci/b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "typename", "", "values", "(Ljava/lang/String;Ljava/util/List;)V", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "a", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27594b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d53.k f27595c = new d53.k("ApolloCacheReference\\{(.*)\\}");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f27596d = new b("QUERY_ROOT");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27597a;

    public b(String str, List<String> list) {
        str.getClass();
        list.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(":");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
        }
        this(sb3.toString());
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return s.g(this.f27597a, bVar != null ? bVar.f27597a : null);
    }

    public final int hashCode() {
        return this.f27597a.hashCode();
    }

    public final String toString() {
        return a0.m(new StringBuilder("CacheKey("), this.f27597a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lci/b$a;", "", "<init>", "()V", "Lci/b;", "ROOT_CACHE_KEY", "Lci/b;", "", "SERIALIZATION_TEMPLATE", "Ljava/lang/String;", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str) {
        str.getClass();
        this.f27597a = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String... strArr) {
        this(str, (List<String>) u.i0(strArr));
        str.getClass();
        strArr.getClass();
    }
}
