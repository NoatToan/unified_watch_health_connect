package rv2;

import android.content.Context;
import iw2.i1;
import o13.r;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrv2/d;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f154770a = new d();

    private d() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, int i14, int i15, int i16, v13.c cVar) {
        c cVar2;
        String str;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i17 = cVar2.f154769d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                cVar2.f154769d = i17 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objD = cVar2.f154767b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = cVar2.f154769d;
        if (i18 == 0) {
            r.b(objD);
            i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
            if (i1VarD != null) {
                cVar2.f154766a = context;
                cVar2.f154769d = 1;
                objD = i1VarD.D(i14, i15, i16, cVar2);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                str = null;
            }
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str);
        }
        if (i18 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context = cVar2.f154766a;
        r.b(objD);
        str = (String) objD;
        jw2.d.f101374a.getClass();
        return jw2.d.a.a(context, str);
    }
}
