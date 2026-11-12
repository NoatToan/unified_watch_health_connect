package iw0;

import android.content.Context;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.data.LineDataSet;
import g22.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k00.h;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.t0;
import p13.y;
import pv0.r;
import pv0.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001:\u0001\u000fB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Liw0/g;", "Lk00/h;", "Lkw0/f;", "Lkw0/e$c;", "Lpi0/e;", "dateTimeFormatter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj23/g;", "Lb63/o;", "dateInterval", "", "daily", "<init>", "(Lpi0/e;Landroid/content/Context;Lj23/g;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends h<kw0.f<kw0.e.c>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pi0.e f95309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j23.g<o> f95310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f95312i;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pi0.e eVar, Context context, j23.g<o> gVar, boolean z14) {
        super(context, l.h((o) gVar.getStart()), l.h((o) gVar.b()), z14);
        eVar.getClass();
        context.getClass();
        gVar.getClass();
        this.f95309f = eVar;
        this.f95310g = gVar;
        zv0.d dVar = zv0.d.f207169a;
        r rVar = r.SLEEP_SCORE;
        l22.a aVar = new l22.a(context);
        dVar.getClass();
        this.f95311h = zv0.d.c(rVar, aVar);
        this.f95312i = true;
    }

    @Override // k00.h
    public final ArrayList A(List list, LocalDate localDate, LocalDate localDate2) {
        ArrayList arrayListA = super.A(list, localDate, localDate2);
        if (this.f95312i) {
            lw0.b.k(arrayListA, this.f101981a, this.f101984d);
        }
        return arrayListA;
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ float C(kw0.f<kw0.e.c> fVar) {
        return 100.0f;
    }

    @Override // k00.h
    public final /* bridge */ /* synthetic */ float D(kw0.f<kw0.e.c> fVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final Integer c(Object obj) {
        return Integer.valueOf(lw0.b.b(this.f95310g, this.f101984d));
    }

    @Override // k00.h, qz.c
    public final float q(Object obj) {
        return lw0.b.c(this.f95310g, this.f101984d, false);
    }

    @Override // k00.h
    public final LineDataSet x(String str, List list) {
        list.getClass();
        str.getClass();
        return gl1.d.r(list, str, false, Integer.valueOf(this.f101981a.getColor(lw0.b.d(this.f95312i, this.f101984d))));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    @Override // k00.h
    public final Map z(kw0.f<kw0.e.c> fVar) {
        ArrayList arrayList;
        List<kw0.e.c> list;
        DateTime dateTimeNow;
        s sVar;
        Object next;
        kw0.f<kw0.e.c> fVar2 = fVar;
        this.f95312i = fVar2 != null ? fVar2.f106946c : true;
        if (fVar2 == null || (list = fVar2.f106947d) == null) {
            arrayList = null;
        } else {
            ArrayList<kw0.e.c> arrayList2 = new ArrayList();
            for (Object obj : list) {
                kw0.e.c cVar = (kw0.e.c) obj;
                if (cVar.f106939f != null && cVar.f106940g != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            for (kw0.e.c cVar2 : arrayList2) {
                Integer num = cVar2.f106940g;
                o oVar = cVar2.f106939f;
                int iIntValue = num != null ? num.intValue() : 0;
                if (oVar == null || (dateTimeNow = l.h(oVar).toDateTimeAtStartOfDay()) == null) {
                    dateTimeNow = DateTime.now();
                }
                List<kw0.a> list2 = fVar2.f106949f;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((kw0.a) next).f106903a, oVar));
                    kw0.a aVar = (kw0.a) next;
                    if (aVar != null) {
                        sVar = aVar.f106904b;
                    } else {
                        sVar = null;
                    }
                } else {
                    sVar = null;
                }
                dateTimeNow.getClass();
                DateTime dateTime = dateTimeNow;
                arrayList.add(new k00.c(dateTime, iIntValue, lw0.b.g(dateTime, this.f95309f, this.f101981a, cVar2, this.f95311h, null, sVar, this.f95312i, this.f101984d, 32)));
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return t0.b(new p("SLEEP_SCORE", arrayList));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Liw0/g$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "SLEEP_SCORE_CHART_MIN_VALUE", "F", "SLEEP_SCORE_CHART_MAX_VALUE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
