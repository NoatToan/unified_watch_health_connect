package me0;

import c83.a0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getAllDogActivities$2", f = "DogsRepository.kt", l = {159}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super a0<List<? extends ActivityListItemDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f118013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f118014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w wVar, int i14, int i15, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f118012b = wVar;
        this.f118013c = i14;
        this.f118014d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f118012b, this.f118013c, this.f118014d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends ActivityListItemDTO>>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118011a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.b bVar = (ke0.b) this.f118012b.f118068c.getValue();
        this.f118011a = 1;
        Object objC = bVar.c(true, this.f118013c, this.f118014d, this);
        return objC == aVar ? aVar : objC;
    }
}
