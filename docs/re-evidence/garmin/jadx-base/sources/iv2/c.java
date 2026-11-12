package iv2;

import android.content.Context;
import cx2.h;
import iw2.i1;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Liv2/c;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f95221a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f95222b = new h("IntegerInputDataHandler", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liv2/c$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, int i14, int i15, int i16, v13.c cVar) {
            b bVar;
            String str;
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i17 = bVar.f95220d;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    bVar.f95220d = i17 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, cVar);
                }
            } else {
                bVar = new b(this, cVar);
            }
            Object objT = bVar.f95218b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i18 = bVar.f95220d;
            if (i18 == 0) {
                r.b(objT);
                c.f95222b.getClass();
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    bVar.f95217a = context;
                    bVar.f95220d = 1;
                    objT = i1VarD.t(i14, i15, i16, bVar);
                    if (objT == aVar) {
                        return aVar;
                    }
                } else {
                    str = null;
                }
                jw2.d.f101374a.getClass();
                return jw2.d.a.a(context, str);
            }
            if (i18 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = bVar.f95217a;
            r.b(objT);
            str = (String) objT;
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str);
        }

        private a() {
        }
    }
}
