package aj;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3374b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f3375a = new HashMap();

        /* JADX INFO: renamed from: aj.q$a$a, reason: collision with other inner class name */
        public static class C0060a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<o<Model, ?>> f3376a;

            public C0060a(List<o<Model, ?>> list) {
                this.f3376a = list;
            }
        }
    }

    private q(s sVar) {
        this.f3374b = new a();
        this.f3373a = sVar;
    }

    public q(k7.e<List<Throwable>> eVar) {
        this(new s(eVar));
    }
}
