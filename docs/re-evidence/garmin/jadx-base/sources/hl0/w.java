package hl0;

import android.content.Context;
import android.location.Location;
import android.util.SparseIntArray;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "", "Lo13/p;", "Lfl0/a;", "Lil0/c;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.SearchGolfCoursesWithDownloadStatusUseCase$invoke$2", f = "SearchGolfCoursesWithDownloadStatusUseCase.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<b0, t13.d<? super List<? extends o13.p<? extends fl0.a, ? extends il0.c>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f84346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Location f84347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f84348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f84350f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Location location, String str, int i14, int i15, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f84346b = xVar;
        this.f84347c = location;
        this.f84348d = str;
        this.f84349e = i14;
        this.f84350f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f84346b, this.f84347c, this.f84348d, this.f84349e, this.f84350f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends o13.p<? extends fl0.a, ? extends il0.c>>> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List<fl0.a> listA;
        o13.p pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84345a;
        x xVar = this.f84346b;
        if (i14 == 0) {
            o13.r.b(obj);
            el0.c cVar = xVar.f84351a;
            Context context = xVar.f84352b.f84314a;
            String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
            String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
            if (language == null) {
                str = "en";
            } else {
                int iHashCode = language.hashCode();
                if (iHashCode == 3383) {
                    str = "ja";
                    if (!language.equals("ja")) {
                        str = "en";
                    }
                } else if (iHashCode == 3428) {
                    str = "ko";
                    if (!language.equals("ko")) {
                        str = "en";
                    }
                } else if (iHashCode == 3700) {
                    str = "th";
                    if (!language.equals("th")) {
                        str = "en";
                    }
                } else if (iHashCode == 3886 && language.equals("zh")) {
                    str = p005kotlin.jvm.internal.s.g(country, "TW") ? "zh_CHT" : "zh_CHS";
                } else {
                    str = "en";
                }
            }
            String str2 = str;
            this.f84345a = 1;
            obj = cVar.f(this.f84347c, this.f84348d, this.f84349e, this.f84350f, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return j0.f134944a;
            }
            u0.r();
            return null;
        }
        SparseIntArray sparseIntArrayG = xVar.f84351a.g();
        fl0.c cVar2 = (fl0.c) ((v2.b) v2Var).f47386a;
        if (cVar2 == null || (listA = cVar2.a()) == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (fl0.a aVar2 : listA) {
            String strK = aVar2.getName();
            Integer numG = aVar2.getGlobalLayoutId();
            if (strK == null || numG == null) {
                pVar = null;
            } else {
                int i15 = sparseIntArrayG.get(numG.intValue(), 1);
                il0.c.a aVar3 = il0.c.f93960a;
                Integer num = new Integer(i15);
                aVar3.getClass();
                il0.c cVarB = il0.c.a.b(num);
                if (cVarB == null) {
                    cVarB = il0.c.NOT_DOWNLOADED;
                }
                pVar = new o13.p(aVar2, cVarB);
            }
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }
}
