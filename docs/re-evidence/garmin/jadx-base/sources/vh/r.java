package vh;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvh/r;", "Lvh/w;", "", "typeCondition", "", "possibleTypes", "Lvh/p;", "condition", "selections", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class r extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f178383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<p> f178384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<w> f178385d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvh/r$a;", "", "", "typeCondition", "", "possibleTypes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f178387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<p> f178388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<? extends w> f178389d;

        public a(String str, List<String> list) {
            str.getClass();
            list.getClass();
            this.f178386a = str;
            this.f178387b = list;
            p13.j0 j0Var = p13.j0.f134944a;
            this.f178388c = j0Var;
            this.f178389d = j0Var;
        }

        public final r a() {
            return new r(this.f178386a, this.f178387b, this.f178388c, this.f178389d);
        }

        public final void b(List list) {
            this.f178388c = list;
        }

        public final void c(List list) {
            this.f178389d = list;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(String str, List<String> list, List<p> list2, List<? extends w> list3) {
        super(null);
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f178382a = str;
        this.f178383b = list;
        this.f178384c = list2;
        this.f178385d = list3;
    }
}
