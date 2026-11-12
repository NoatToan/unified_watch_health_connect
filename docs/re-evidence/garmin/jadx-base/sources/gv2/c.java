package gv2;

import android.content.Context;
import iw2.i1;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgv2/c;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f79452a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f79453b = new cx2.h("FloatPickerDataHandler", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgv2/c$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, int i14, int i15, float f14, v13.c cVar) {
            b bVar;
            String str;
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i16 = bVar.f79451d;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    bVar.f79451d = i16 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, cVar);
                }
            } else {
                bVar = new b(this, cVar);
            }
            Object objR = bVar.f79449b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = bVar.f79451d;
            if (i17 == 0) {
                r.b(objR);
                c.f79453b.getClass();
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    bVar.f79448a = context;
                    bVar.f79451d = 1;
                    objR = i1VarD.r(i14, i15, f14, bVar);
                    if (objR == aVar) {
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
            context = bVar.f79448a;
            r.b(objR);
            str = (String) objR;
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str);
        }

        private a() {
        }
    }
}
