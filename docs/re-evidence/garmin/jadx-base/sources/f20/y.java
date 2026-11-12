package f20;

import com.garmin.android.apps.connectmobile.contacts.ContactsMigrationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactsMigrationPresenter$startReplaceOperation$1$1", f = "ContactsMigrationPresenter.kt", l = {202, 214}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f68463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<l20.a> f68464c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactsMigrationPresenter$startReplaceOperation$1$1$1", f = "ContactsMigrationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f68465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fw.m<l20.r> f68466b;

        /* JADX INFO: renamed from: f20.y$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1417a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f68467a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f68467a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, fw.m<l20.r> mVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f68465a = xVar;
            this.f68466b = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f68465a, this.f68466b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x xVar = this.f68465a;
            ContactsMigrationActivity contactsMigrationActivity = xVar.f68446a;
            if (contactsMigrationActivity != null) {
                contactsMigrationActivity.hideProgressOverlay();
            }
            fw.m<l20.r> mVar = this.f68466b;
            int i14 = C1417a.f68467a[mVar.f73769b.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    ContactsMigrationActivity contactsMigrationActivity2 = xVar.f68446a;
                    if (contactsMigrationActivity2 != null) {
                        g22.a.a(contactsMigrationActivity2, mVar.f73771d);
                    }
                } else if (i14 != 3) {
                    u0.r();
                    return null;
                }
            } else if (mVar.f73770c != null) {
                xVar.a().d();
                xVar.a().a();
                xVar.a().b();
                ContactsMigrationActivity contactsMigrationActivity3 = xVar.f68446a;
                if (contactsMigrationActivity3 != null) {
                    contactsMigrationActivity3.ca(true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, List<l20.a> list, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f68463b = xVar;
        this.f68464c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f68463b, this.f68464c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        if (ge1.b.e0(r5, r7, r33) == r1) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objC;
        ArrayList arrayList;
        ArrayList arrayList2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68462a;
        x xVar = this.f68463b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        int i15 = x.f68445m;
        z zVarA = xVar.a();
        List<l20.a> list = this.f68464c;
        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
        for (l20.a aVar2 : list) {
            List<l20.c> listZ = aVar2.z();
            if (listZ != null) {
                ArrayList arrayList4 = new ArrayList(p13.y.r(listZ, 10));
                Iterator<T> it = listZ.iterator();
                while (it.hasNext()) {
                    arrayList4.add(l20.c.b((l20.c) it.next(), null, null, null, null, null, null, null, null, null, null, 0, 1048574));
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            List<l20.c> listR = aVar2.r();
            if (listR != null) {
                ArrayList arrayList5 = new ArrayList(p13.y.r(listR, 10));
                Iterator<T> it3 = listR.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(l20.c.b((l20.c) it3.next(), null, null, null, null, null, null, null, null, null, null, 0, 1048574));
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            arrayList3.add(l20.a.g(aVar2, null, null, null, null, null, null, arrayList2, arrayList, null, 6462));
        }
        this.f68462a = 1;
        objC = zVarA.c(arrayList3, this);
        if (objC != aVar) {
        }
        return aVar;
        x53.c cVar = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        a aVar3 = new a(xVar, (fw.m) objC, null);
        this.f68462a = 2;
    }
}
