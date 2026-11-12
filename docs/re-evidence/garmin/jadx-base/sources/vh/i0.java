package vh;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lvh/i0;", "Lvh/u;", "", "name", "", "keyFields", "implements", "embeddedFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i0 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f178326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i0> f178327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f178328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String str, List<String> list, List<i0> list2, List<String> list3) {
        super(str, null);
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f178326b = list;
        this.f178327c = list2;
        this.f178328d = list3;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lvh/i0$a;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lvh/i0;", "interfaceType", "(Lvh/i0;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f178330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<i0> f178331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f178332d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var) {
            this(i0Var.f178393a);
            i0Var.getClass();
            this.f178330b = i0Var.f178326b;
            this.f178331c = i0Var.f178327c;
            this.f178332d = i0Var.f178328d;
        }

        public a(String str) {
            str.getClass();
            this.f178329a = str;
            p13.j0 j0Var = p13.j0.f134944a;
            this.f178330b = j0Var;
            this.f178331c = j0Var;
            this.f178332d = j0Var;
        }
    }

    public i0(String str, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? p13.j0.f134944a : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public i0(String str, List<String> list, List<i0> list2) {
        this(str, list, list2, p13.j0.f134944a);
        str.getClass();
        list.getClass();
        list2.getClass();
    }
}
