package ml0;

import android.content.Intent;
import android.net.Uri;
import i3.fe;
import i3.se;
import i3.yd;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesKt$SearchGolfCourses$showLocationPermissionSnackbar$1", f = "SearchGolfCourses.kt", l = {130}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f119238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f119239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.q<Intent, f.a> f119240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fe feVar, String str, c.q<Intent, f.a> qVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f119238b = feVar;
        this.f119239c = str;
        this.f119240d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f119238b, this.f119239c, this.f119240d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119237a;
        if (i14 == 0) {
            o13.r.b(obj);
            j22.b bVar = j22.b.f96736a;
            j22.a aVar2 = j22.a.f96719h;
            bVar.getClass();
            String strF = j22.b.f(aVar2);
            yd ydVar = yd.Long;
            this.f119237a = 1;
            jVar = this;
            obj = fe.b(this.f119238b, strF, this.f119239c, ydVar, jVar, 4);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            jVar = this;
        }
        if (((se) obj) == se.ActionPerformed) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.garmin.android.apps.connectmobile", null));
            jVar.f119240d.a(intent, null);
        }
        return Unit.INSTANCE;
    }
}
