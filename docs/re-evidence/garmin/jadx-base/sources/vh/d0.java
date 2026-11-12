package vh;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\rB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lvh/d0;", "", "", "message", "", "Lvh/d0$a;", "locations", "path", "", "extensions", "nonStandardFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f178282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Object> f178283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f178284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, Object> f178285e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/d0$a;", "", "", "line", "column", "<init>", "(II)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f178286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f178287b;

        public a(int i14, int i15) {
            this.f178286a = i14;
            this.f178287b = i15;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Location(line = ");
            sb3.append(this.f178286a);
            sb3.append(", column = ");
            return ds.e0.j(sb3, this.f178287b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public d0(String str, List<a> list, List<? extends Object> list2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        str.getClass();
        this.f178281a = str;
        this.f178282b = list;
        this.f178283c = list2;
        this.f178284d = map;
        this.f178285e = map2;
    }

    public final String toString() {
        return "Error(message = " + this.f178281a + ", locations = " + this.f178282b + ", path=" + this.f178283c + ", extensions = " + this.f178284d + ", nonStandardFields = " + this.f178285e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
