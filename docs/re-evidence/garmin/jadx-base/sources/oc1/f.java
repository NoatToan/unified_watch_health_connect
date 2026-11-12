package oc1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.queueddownload.QueuedDownloadViewModel$sendToDevice$1", f = "QueuedDownloadViewModel.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f131171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f131172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str, t13.d<? super f> dVar2) {
        super(1, dVar2);
        this.f131171b = dVar;
        this.f131172c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f131171b, this.f131172c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131170a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b bVar = this.f131171b.f131165a;
        this.f131170a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new c(bVar, this.f131172c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
