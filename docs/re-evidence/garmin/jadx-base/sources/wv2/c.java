package wv2;

import android.content.Context;
import iw2.i1;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwv2/c;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187470a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwv2/c$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, int i14, int i15, xv2.c cVar, v13.c cVar2) {
            b bVar;
            String str;
            if (cVar2 instanceof b) {
                bVar = (b) cVar2;
                int i16 = bVar.f187469d;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    bVar.f187469d = i16 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, cVar2);
                }
            } else {
                bVar = new b(this, cVar2);
            }
            Object objY = bVar.f187467b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = bVar.f187469d;
            if (i17 == 0) {
                r.b(objY);
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    bVar.f187466a = context;
                    bVar.f187469d = 1;
                    objY = i1VarD.y(i14, i15, cVar, bVar);
                    if (objY == aVar) {
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
            context = bVar.f187466a;
            r.b(objY);
            str = (String) objY;
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str);
        }

        private a() {
        }
    }
}
