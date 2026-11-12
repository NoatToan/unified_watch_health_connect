package dp1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import f32.m;
import f32.p;
import java.util.Comparator;
import java.util.List;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import vo1.o;
import yo1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldp1/j;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo1.c f60672a = vo1.c.a.a(vo1.c.f179028c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f60673b = new m(new f32.j(v1.a(this), new a(), null, 4, null));

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"dp1/j$a", "Lf32/p;", "", "Lyo1/k;", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends p<List<? extends k>> {

        /* JADX INFO: renamed from: dp1.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1287a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(Boolean.valueOf(!((k) t14).getCompleted()), Boolean.valueOf(!((k) t7).getCompleted()));
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<T> implements Comparator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f60675a;

            public b(Comparator comparator) {
                this.f60675a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                int iCompare = this.f60675a.compare(t7, t14);
                return iCompare != 0 ? iCompare : r13.a.b(((k) t14).getStartDateTime(), ((k) t7).getStartDateTime());
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.GroupRideSummaryViewModel$summaryDataAdapter$1", f = "GroupRideSummaryViewModel.kt", l = {29}, m = "requestSafeSummary", v = 2)
        public static final class c extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f60676a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f60678c;

            public c(t13.d<? super c> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f60676a = obj;
                this.f60678c |= Integer.MIN_VALUE;
                return a.this.b(null, null, this);
            }
        }

        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends List<? extends k>>> dVar) {
            c cVar;
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i14 = cVar.f60678c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    cVar.f60678c = i14 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(dVar);
                }
            } else {
                cVar = new c(dVar);
            }
            Object objJ = cVar.f60676a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = cVar.f60678c;
            if (i15 == 0) {
                r.b(objJ);
                vo1.c cVar2 = j.this.f60672a;
                LocalDate localDate = dateTime.toLocalDate();
                localDate.getClass();
                LocalDate localDate2 = dateTime2.toLocalDate();
                localDate2.getClass();
                cVar.f60678c = 1;
                cVar2.getClass();
                objJ = f0.J(cVar2, new o(cVar2, localDate, localDate2, null), cVar);
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                return new v2.b(h0.N0((Iterable) bVar.f47386a, new b(new C1287a())), bVar.f47387b, null, null, 12, null);
            }
            if (v2Var instanceof v2.a) {
                v2.a aVar2 = (v2.a) v2Var;
                return new v2.a(aVar2.f47383a, aVar2.f47384b, null, 4, null);
            }
            u0.r();
            return null;
        }
    }
}
