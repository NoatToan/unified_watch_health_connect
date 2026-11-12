package u50;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.HashSet;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchViewModel$onToggleFavorite$1", f = "CourseSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f168691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f168693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, String str, boolean z14, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f168691b = hVar;
        this.f168692c = str;
        this.f168693d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f168691b, this.f168692c, this.f168693d, dVar);
        lVar.f168690a = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((l) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var = (v2) this.f168690a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (v2Var instanceof v2.a) {
            boolean z14 = this.f168693d;
            int i14 = h.f168664q;
            h hVar = this.f168691b;
            String str = this.f168692c;
            hVar.C4(str, !z14);
            HashSet<String> hashSet = hVar.f168676l;
            if (z14) {
                hashSet.remove(str);
            } else {
                hashSet.add(str);
            }
        }
        return Unit.INSTANCE;
    }
}
