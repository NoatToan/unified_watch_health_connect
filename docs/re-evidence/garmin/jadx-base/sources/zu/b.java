package zu;

import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzu/b;", "", "Lxu/a;", "badgeTranslationsLoaderUseCase", "<init>", "(Lxu/a;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xu.a f207016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wu.a f207017b;

    public b(xu.a aVar) {
        aVar.getClass();
        this.f207016a = aVar;
        this.f207017b = new wu.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(e23.l lVar, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f207015d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f207015d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objA = aVar.f207013b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f207015d;
        if (i15 == 0) {
            r.b(objA);
            aVar.f207012a = lVar;
            aVar.f207015d = 1;
            objA = this.f207016a.a(aVar);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = aVar.f207012a;
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.badges.service.model.i iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) ((v2.b) v2Var).f47386a;
            wu.a aVar3 = this.f207017b;
            aVar3.f187234a = iVar;
            lVar.invoke(aVar3);
        }
        return Unit.INSTANCE;
    }
}
