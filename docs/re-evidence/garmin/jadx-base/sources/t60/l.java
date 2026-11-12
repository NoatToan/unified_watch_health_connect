package t60;

import c22.j0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lv60/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.cross_selling.CrossSellingPreferencesImpl$updateCrossSellingBannerState$result$1", f = "CrossSellingPreferencesImpl.kt", l = {61}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super v2<? extends v60.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f162725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f162726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f162727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DateTime dateTime, m mVar, a aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f162725b = dateTime;
        this.f162726c = mVar;
        this.f162727d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f162725b, this.f162726c, this.f162727d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends v60.b>> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162724a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        String strB = j0.b(new DateTime(this.f162725b), "yyyy-MM-dd", null);
        w60.d dVar = this.f162726c.f162728a;
        a aVar2 = this.f162727d;
        v60.b bVar = new v60.b(aVar2.f162702a, strB);
        this.f162724a = 1;
        dVar.getClass();
        Object objJ = f0.J(dVar, new w60.c(dVar, aVar2, bVar, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
