package vh;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fBM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lvh/q;", "Lvh/w;", "", "name", "Lvh/x;", NotificationConstants.KEY_DATA_MIME_TYPE, "alias", "", "Lvh/p;", "condition", "Lvh/o;", "arguments", "selections", "<init>", "(Ljava/lang/String;Lvh/x;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class q extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f178371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f178372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<p> f178373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<o> f178374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<w> f178375f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, x xVar, String str2, List<p> list, List<o> list2, List<? extends w> list3) {
        super(null);
        str.getClass();
        xVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f178370a = str;
        this.f178371b = xVar;
        this.f178372c = str2;
        this.f178373d = list;
        this.f178374e = list2;
        this.f178375f = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(e0.b bVar) {
        List<o> list = this.f178374e;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((o) it.next()).f178361d) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!((o) obj).f178361d) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                    break;
                }
            }
        }
        boolean zIsEmpty = list.isEmpty();
        String str = this.f178370a;
        if (zIsEmpty) {
            return str;
        }
        int iA = p13.t0.a(p13.y.r(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : list) {
            linkedHashMap.put(((o) obj2).f178358a, obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p13.t0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((o) entry.getValue()).f178359b);
        }
        Object objC = s.c(linkedHashMap2, bVar);
        try {
            w63.e eVar = new w63.e();
            zh.c cVar = new zh.c(eVar, null, 2, 0 == true ? 1 : 0);
            zh.b.a(cVar, objC);
            cVar.close();
            return str + CoreConstants.LEFT_PARENTHESIS_CHAR + eVar.x() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        } catch (Exception e4) {
            o2.c.p(e4);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lvh/q$a;", "", "", "name", "Lvh/x;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Lvh/x;)V", "Lvh/q;", "compiledField", "(Lvh/q;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f178376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f178377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f178378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<p> f178379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<o> f178380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<? extends w> f178381f;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            this(qVar.f178370a, qVar.f178371b);
            qVar.getClass();
            this.f178378c = qVar.f178372c;
            this.f178379d = qVar.f178373d;
            this.f178380e = qVar.f178374e;
            this.f178381f = qVar.f178375f;
        }

        public final void a() {
            this.f178378c = "extendedWeight";
        }

        public final void b(List list) {
            list.getClass();
            this.f178380e = list;
        }

        public final q c() {
            return new q(this.f178376a, this.f178377b, this.f178378c, this.f178379d, this.f178380e, this.f178381f);
        }

        public final void d(List list) {
            this.f178379d = list;
        }

        public final void e(List list) {
            list.getClass();
            this.f178381f = list;
        }

        public a(String str, x xVar) {
            str.getClass();
            xVar.getClass();
            this.f178376a = str;
            this.f178377b = xVar;
            p13.j0 j0Var = p13.j0.f134944a;
            this.f178379d = j0Var;
            this.f178380e = j0Var;
            this.f178381f = j0Var;
        }
    }
}
