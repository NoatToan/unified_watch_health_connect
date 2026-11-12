package y7;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ly7/g;", "", "<init>", "()V", "a", "b", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class g {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly7/g$a;", "T", "", "", "name", "<init>", "(Ljava/lang/String;)V", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f194635a;

        public a(String str) {
            str.getClass();
            this.f194635a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f194635a.equals(((a) obj).f194635a);
        }

        public final int hashCode() {
            return this.f194635a.hashCode();
        }

        /* JADX INFO: renamed from: toString, reason: from getter */
        public final String getF194635a() {
            return this.f194635a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly7/g$b;", "T", "", "Ly7/g$a;", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ly7/g$a;Ljava/lang/Object;)V", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<T> f194636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f194637b;

        public b(a<T> aVar, T t7) {
            aVar.getClass();
            this.f194636a = aVar;
            this.f194637b = t7;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(a<T> aVar);

    public abstract <T> T c(a<T> aVar);
}
