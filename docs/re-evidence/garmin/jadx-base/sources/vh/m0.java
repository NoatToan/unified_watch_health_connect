package vh;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\t\u0010\nB1\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lvh/m0;", "Lvh/u;", "", "name", "", "keyFields", "Lvh/i0;", "implements", "embeddedFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class m0 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f178349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i0> f178350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f178351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, List<String> list, List<i0> list2, List<String> list3) {
        super(str, null);
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f178349b = list;
        this.f178350c = list2;
        this.f178351d = list3;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lvh/m0$a;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lvh/m0;", "objectType", "(Lvh/m0;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f178353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<i0> f178354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f178355d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var) {
            this(m0Var.f178393a);
            m0Var.getClass();
            this.f178353b = m0Var.f178349b;
            this.f178354c = m0Var.f178350c;
            this.f178355d = m0Var.f178351d;
        }

        public final m0 a() {
            return new m0(this.f178352a, this.f178353b, this.f178354c, this.f178355d);
        }

        public a(String str) {
            str.getClass();
            this.f178352a = str;
            p13.j0 j0Var = p13.j0.f134944a;
            this.f178353b = j0Var;
            this.f178354c = j0Var;
            this.f178355d = j0Var;
        }
    }

    public m0(String str, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? p13.j0.f134944a : list, (i14 & 4) != 0 ? p13.j0.f134944a : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public m0(String str, List<String> list, List<i0> list2) {
        this(str, list, list2, p13.j0.f134944a);
        str.getClass();
        list.getClass();
        list2.getClass();
    }
}
