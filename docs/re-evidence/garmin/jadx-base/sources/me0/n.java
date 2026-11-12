package me0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getDogActivities$2", f = "DogsRepository.kt", l = {145}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super a0<List<? extends ActivityListItemDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f118035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, long j8, String str, int i14, int i15, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f118033b = wVar;
        this.f118034c = j8;
        this.f118035d = str;
        this.f118036e = i14;
        this.f118037f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f118033b, this.f118034c, this.f118035d, this.f118036e, this.f118037f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends ActivityListItemDTO>>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118032a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.b bVar = (ke0.b) this.f118033b.f118068c.getValue();
        this.f118032a = 1;
        Object objB = bVar.b(this.f118034c, true, this.f118035d, this.f118036e, this.f118037f, this);
        return objB == aVar ? aVar : objB;
    }
}
