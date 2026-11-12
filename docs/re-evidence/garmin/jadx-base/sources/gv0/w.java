package gv0;

import com.garmin.android.apps.connectmobile.g3;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "", "Lpu0/b;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$resolveInitialDestination$recipientsResource$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<g3<? extends List<? extends pu0.b>>, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f79412a;

    public w(t13.d<? super w> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w wVar = new w(dVar);
        wVar.f79412a = obj;
        return wVar;
    }

    @Override // e23.p
    public final Object invoke(g3<? extends List<? extends pu0.b>> g3Var, t13.d<? super Boolean> dVar) {
        return ((w) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g3 g3Var = (g3) this.f79412a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return Boolean.valueOf(g3Var.f35300a != fw.p.LOADING);
    }
}
