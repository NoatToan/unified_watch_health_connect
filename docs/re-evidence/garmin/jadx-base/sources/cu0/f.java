package cu0;

import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventSharingUtil$deviceRemoved$1", f = "LiveEventSharingUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f55578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j8, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f55578a = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f55578a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<iu0.a> listA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        boolean z14 = false;
        if (arrayListE != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListE) {
                if (this.f55578a != ((sd2.f) obj2).getUnitID()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q6.f.s(((sd2.f) it.next()).getUnitID(), arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    iu0.g gVarQ = GCMSettingManager.q(((Number) it3.next()).longValue());
                    if (gVarQ != null && (listA = gVarQ.a()) != null && dh.b.F(listA)) {
                        z14 = true;
                        break;
                    }
                }
            }
        }
        ((ru0.a) KoinJavaComponent.get$default(ru0.a.class, null, null, 6, null)).a(z14);
        return Unit.INSTANCE;
    }
}
