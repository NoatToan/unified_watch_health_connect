package iw2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liw2/w;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f95547a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f95548b = new cx2.h("RTSPhoneStorageCoordinator", null, 2, null);

    private w() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(w wVar, Context context, v13.c cVar) throws Throwable {
        i iVar;
        wVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f95442c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f95442c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(wVar, cVar);
            }
        } else {
            iVar = new i(wVar, cVar);
        }
        Object objE0 = iVar.f95440a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f95442c;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            j jVar = new j(context, null);
            iVar.f95442c = 1;
            objE0 = ge1.b.e0(bVar, jVar, iVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        objE0.getClass();
        return objE0;
    }

    public static final Object b(w wVar, Context context, long j8, v13.i iVar) {
        wVar.getClass();
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new l(context, j8, null), iVar);
    }

    public static final Object c(w wVar, Context context, long j8, v13.i iVar) {
        wVar.getClass();
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new m(context, j8, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(w wVar, File file, v13.c cVar) throws Throwable {
        r rVar;
        wVar.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f95510c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f95510c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(wVar, cVar);
            }
        } else {
            rVar = new r(wVar, cVar);
        }
        Object objE0 = rVar.f95508a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f95510c;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            s sVar = new s(file, null);
            rVar.f95510c = 1;
            objE0 = ge1.b.e0(bVar, sVar, rVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        objE0.getClass();
        return objE0;
    }

    public static Object e(Context context, long j8, v13.c cVar) {
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new d(context, j8, null), cVar);
    }

    public static String f(Context context, long j8) {
        context.getClass();
        f95548b.getClass();
        String string = context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).getString(context.getString(R.string.key_device_communication_type, String.valueOf(j8)), "REQUEST_RESPONSE");
        return string == null ? "REQUEST_RESPONSE" : string;
    }

    public static String g(Context context) {
        context.getClass();
        f95548b.getClass();
        String string = context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).getString(context.getString(R.string.key_app_default_theme_mode), null);
        if (string != null) {
            return string;
        }
        f95547a.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? "DARK" : "LIGHT";
    }
}
