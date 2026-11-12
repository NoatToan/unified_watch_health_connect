package kq0;

import java.util.Iterator;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;
import p13.j0;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkq0/h;", "", "Lkq0/g;", "initialState", "Lkq0/e;", "reducer", "", "Lkq0/b;", "middlewares", "<init>", "(Lkq0/g;Lkq0/e;Ljava/util/List;)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f106169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f106170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f106171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f106172d;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(g gVar, e eVar, List<? extends b> list) {
        gVar.getClass();
        eVar.getClass();
        list.getClass();
        this.f106169a = eVar;
        this.f106170b = list;
        p2 p2VarA = q2.a(gVar);
        this.f106171c = p2VarA;
        this.f106172d = p2VarA;
    }

    public final void a(com.garmin.android.apps.connectmobile.incidentdetection.service.a aVar) {
        aVar.getClass();
        kq0.a.a("State", "Dispatch {" + aVar.f36880b + StringSubstitutor.DEFAULT_VAR_END);
        Iterator<T> it = this.f106170b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            p2 p2Var = this.f106171c;
            if (!zHasNext) {
                p2Var.k(null, this.f106169a.a((g) p2Var.getValue(), aVar));
                return;
            }
            ((b) it.next()).a(aVar, (g) p2Var.getValue(), this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkq0/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h(g gVar, e eVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, eVar, (i14 & 4) != 0 ? j0.f134944a : list);
    }
}
