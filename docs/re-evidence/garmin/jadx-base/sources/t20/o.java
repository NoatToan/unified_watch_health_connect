package t20;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt20/o;", "Liu1/h;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "detail", "Liu1/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/e;Liu1/k;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends iu1.h<com.garmin.android.apps.connectmobile.courses.model.e> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.e f161799l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.android.apps.connectmobile.courses.model.e eVar, iu1.k<? super com.garmin.android.apps.connectmobile.courses.model.e> kVar) {
        super(new iu1.g(), null, false, com.garmin.android.apps.connectmobile.courses.model.e.class, kVar, null, null, null, 128, null);
        eVar.getClass();
        kVar.getClass();
        this.f161799l = eVar;
    }

    @Override // iu1.h
    public final c83.d<String> f() {
        Gson gsonA = iu1.n.a();
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f161799l;
        String json = gsonA.toJson(eVar);
        d60.a aVar = (d60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, d60.a.class, new c83.h.a[0], null, null, null, 120);
        String str = eVar.courseId;
        if (str == null) {
            str = "";
        }
        json.getClass();
        return aVar.j(str, json);
    }
}
