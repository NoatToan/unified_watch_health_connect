package ug2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import i3.yd;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$settingsLauncher$1$1$1", f = "MainView.kt", l = {319, 320}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f170912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f170913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(fe feVar, Context context, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f170912b = feVar;
        this.f170913c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f170912b, this.f170913c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (i3.fe.b(r9.f170912b, r4, null, r6, r9, 6) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170911a;
        if (i14 == 0) {
            o13.r.b(obj);
            e53.c.a aVar2 = e53.c.f63094b;
            long jF = e53.e.f(200L, e53.f.MILLISECONDS);
            this.f170911a = 1;
            if (o53.m0.c(jF, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        String string = this.f170913c.getString(R.string.lbl_gps_ready);
        string.getClass();
        yd ydVar = yd.Short;
        this.f170911a = 2;
    }
}
