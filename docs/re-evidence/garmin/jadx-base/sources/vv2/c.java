package vv2;

import android.content.Context;
import iw2.i1;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvv2/c;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f180550a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvv2/c$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
                int i17 = bVar.f180549d;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    bVar.f180549d = i17 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, cVar);
                }
            } else {
                bVar = new b(this, cVar);
            }
            Object objW = bVar.f180547b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i18 = bVar.f180549d;
            if (i18 == 0) {
                r.b(objW);
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    bVar.f180546a = context;
                    bVar.f180549d = 1;
                    objW = i1VarD.w(i14, i15, i16, bVar);
                    if (objW == aVar) {
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
            context = bVar.f180546a;
            r.b(objW);
            str = (String) objW;
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str);
        }

        private a() {
        }
    }
}
