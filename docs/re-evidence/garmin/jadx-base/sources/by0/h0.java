package by0;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/userprofile/model/l;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource$getUserSocialProfile$2", f = "MultiDayActivityDataSource.kt", l = {521}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a aVar, String str, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f21864b = aVar;
        this.f21865c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f21864b, this.f21865c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.userprofile.model.l> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21863a;
        if (i14 == 0) {
            o13.r.b(obj);
            a22.i iVar = (a22.i) this.f21864b.f21689c.getValue();
            List<String> listC = p13.w.c(this.f21865c);
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND);
            this.f21863a = 1;
            obj = iVar.a(listC, listK, this);
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
        Map.Entry entry = (Map.Entry) p13.h0.c0(((Map) obj).entrySet());
        if (entry != null) {
            return (com.garmin.android.apps.connectmobile.userprofile.model.l) entry.getValue();
        }
        return null;
    }
}
