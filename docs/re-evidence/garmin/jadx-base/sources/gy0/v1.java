package gy0;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageTooLargeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lgy0/m;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.UploadEpicImagesUseCase$invoke$2", f = "UploadEpicImagesUseCase.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class v1 extends v13.i implements e23.p<o53.b0, t13.d<? super List<m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f80246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f80248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<bq0.k> f80249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.d f80250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2 f80251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f80252g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lgy0/m1;", "<anonymous>", "(Lo53/b0;)Lgy0/m1;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.UploadEpicImagesUseCase$invoke$2$uploadResult$1$1", f = "UploadEpicImagesUseCase.kt", l = {SyslogConstants.LOG_LOCAL2, 45}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super m1>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.d f80253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a2 f80254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f80255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bq0.k f80256d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f80257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f80258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ z53.d f80259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a2 f80260h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f80261i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ bq0.k f80262j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z53.d dVar, a2 a2Var, String str, bq0.k kVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f80259g = dVar;
            this.f80260h = a2Var;
            this.f80261i = str;
            this.f80262j = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f80259g, this.f80260h, this.f80261i, this.f80262j, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super m1> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            z53.d dVar;
            a2 a2Var;
            String str;
            bq0.k kVar;
            int i14;
            z53.d dVar2;
            Throwable th3;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f80258f;
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    dVar = this.f80259g;
                    this.f80253a = dVar;
                    a2Var = this.f80260h;
                    this.f80254b = a2Var;
                    str = this.f80261i;
                    this.f80255c = str;
                    bq0.k kVar2 = this.f80262j;
                    this.f80256d = kVar2;
                    this.f80257e = 0;
                    this.f80258f = 1;
                    if (dVar.b(this) != aVar) {
                        kVar = kVar2;
                        i14 = 0;
                    }
                    return aVar;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar2 = this.f80253a;
                    try {
                        o13.r.b(obj);
                        m1 m1Var = (m1) obj;
                        dVar2.release();
                        return m1Var;
                    } catch (Throwable th4) {
                        th3 = th4;
                        dVar2.release();
                        throw th3;
                    }
                }
                i14 = this.f80257e;
                kVar = this.f80256d;
                str = this.f80255c;
                a2Var = this.f80254b;
                z53.d dVar3 = this.f80253a;
                o13.r.b(obj);
                dVar = dVar3;
                this.f80253a = dVar;
                this.f80254b = null;
                this.f80255c = null;
                this.f80256d = null;
                this.f80257e = i14;
                this.f80258f = 2;
                Object objA = a2.a(a2Var, str, kVar, this);
                if (objA != aVar) {
                    dVar2 = dVar;
                    obj = objA;
                    m1 m1Var2 = (m1) obj;
                    dVar2.release();
                    return m1Var2;
                }
                return aVar;
            } catch (Throwable th5) {
                dVar2 = dVar;
                th3 = th5;
                dVar2.release();
                throw th3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(List<bq0.k> list, z53.d dVar, a2 a2Var, String str, t13.d<? super v1> dVar2) {
        super(2, dVar2);
        this.f80249d = list;
        this.f80250e = dVar;
        this.f80251f = a2Var;
        this.f80252g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v1 v1Var = new v1(this.f80249d, this.f80250e, this.f80251f, this.f80252g, dVar);
        v1Var.f80248c = obj;
        return v1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<m>> dVar) {
        return ((v1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayListX;
        Object objO;
        o53.b0 b0Var = (o53.b0) this.f80248c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80247b;
        if (i14 == 0) {
            arrayListX = v.h.x(obj);
            List<bq0.k> list = this.f80249d;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f80250e, this.f80251f, this.f80252g, (bq0.k) it.next(), null), 3));
            }
            this.f80248c = null;
            this.f80246a = arrayListX;
            this.f80247b = 1;
            objO = g8.i.o(arrayList, this);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = this.f80246a;
            o13.r.b(obj);
            arrayListX = arrayList2;
            objO = obj;
        }
        List<m1> list2 = (List) objO;
        if (list2.isEmpty()) {
            arrayListX.add(m.a.f80192a);
            return arrayListX;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof m1.b) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (g22.n.d(((m1.b) obj3).f80200a.getUrl())) {
                arrayList4.add(obj3);
            }
        }
        if (!list2.isEmpty()) {
            for (m1 m1Var : list2) {
                if ((m1Var instanceof m1.a) && (((m1.a) m1Var).f80199a instanceof ImageTooLargeException)) {
                    arrayListX.add(m.c.f80194a);
                    break;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            arrayListX.add(m.b.f80193a);
            return arrayListX;
        }
        ArrayList arrayList5 = new ArrayList(p13.y.r(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((m1.b) it3.next()).f80200a);
        }
        arrayListX.add(new m.d(arrayList5));
        return arrayListX;
    }
}
