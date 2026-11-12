package bw2;

import android.content.Context;
import iw2.i1;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbw2/f;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21591a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbw2/f$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, int i14, int i15, boolean z14, v13.c cVar) {
            e eVar;
            String str;
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i16 = eVar.f21590d;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    eVar.f21590d = i16 - Integer.MIN_VALUE;
                } else {
                    eVar = new e(this, cVar);
                }
            } else {
                eVar = new e(this, cVar);
            }
            Object objA = eVar.f21588b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = eVar.f21590d;
            if (i17 == 0) {
                r.b(objA);
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    eVar.f21587a = context;
                    eVar.f21590d = 1;
                    objA = i1VarD.A(i14, i15, z14, eVar);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    str = null;
                }
                jw2.d.f101374a.getClass();
                return jw2.d.a.a(context, str);
            }
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = eVar.f21587a;
            r.b(objA);
            str = (String) objA;
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str);
        }

        private a() {
        }
    }
}
