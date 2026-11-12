package gy0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.UUID;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgy0/a2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ley0/g0;", "repository", "<init>", "(Landroid/content/Context;Ley0/g0;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ey0.g0 f80101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f80102c;

    public a2(Context context, ey0.g0 g0Var) {
        context.getClass();
        g0Var.getClass();
        this.f80100a = context;
        this.f80101b = g0Var;
        this.f80102c = o13.m.b(new go1.j(13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(a2 a2Var, String str, bq0.k kVar, v13.c cVar) throws Throwable {
        w1 w1Var;
        a2Var.getClass();
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i14 = w1Var.f80270d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w1Var.f80270d = i14 - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(a2Var, cVar);
            }
        } else {
            w1Var = new w1(a2Var, cVar);
        }
        Object objB = w1Var.f80268b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = w1Var.f80270d;
        if (i15 == 0) {
            o13.r.b(objB);
            w1Var.f80267a = str;
            w1Var.f80270d = 1;
            objB = a2Var.b(kVar, w1Var);
            if (objB != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objB);
                return objB;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = w1Var.f80267a;
        o13.r.b(objB);
        l1 l1Var = (l1) objB;
        if (!(l1Var instanceof l1.a)) {
            if (l1Var instanceof l1.b) {
                return new m1.a(((l1.b) l1Var).f80191a);
            }
            lc.u0.r();
            return null;
        }
        l1.a aVar = (l1.a) l1Var;
        String str2 = aVar.f80189a;
        byte[] bArr = aVar.f80190b;
        w1Var.f80267a = null;
        w1Var.f80270d = 2;
        Object objC = a2Var.c(str, str2, bArr, w1Var);
        return objC == obj ? obj : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(bq0.k kVar, v13.c cVar) throws Throwable {
        x1 x1Var;
        if (cVar instanceof x1) {
            x1Var = (x1) cVar;
            int i14 = x1Var.f80278c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x1Var.f80278c = i14 - Integer.MIN_VALUE;
            } else {
                x1Var = new x1(this, cVar);
            }
        } else {
            x1Var = new x1(this, cVar);
        }
        Object objE0 = x1Var.f80276a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x1Var.f80278c;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                y1 y1Var = new y1(this, kVar, null);
                x1Var.f80278c = 1;
                objE0 = ge1.b.e0(bVar, y1Var, x1Var);
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
            zp0.f fVar = (zp0.f) objE0;
            String string = UUID.randomUUID().toString();
            string.getClass();
            return new l1.a("image-" + string + "." + fVar.f206589b, fVar.f206588a);
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.MULTI_DAY_ACTIVITY;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Process Image - Invalid image information: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "UploadEpicImagesUseCase", strD);
            return new l1.b(e4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, String str2, byte[] bArr, v13.c cVar) {
        z1 z1Var;
        if (cVar instanceof z1) {
            z1Var = (z1) cVar;
            int i14 = z1Var.f80288c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                z1Var.f80288c = i14 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(this, cVar);
            }
        } else {
            z1Var = new z1(this, cVar);
        }
        z1 z1Var2 = z1Var;
        Object objO0 = z1Var2.f80286a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = z1Var2.f80288c;
        if (i15 == 0) {
            o13.r.b(objO0);
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", str2, RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, py0.b.f141873a, 0, 0, 6, (Object) null));
            z1Var2.f80288c = 1;
            ey0.g0 g0Var = this.f80101b;
            ey0.e0 e0Var = new ey0.e0(g0Var, str, partCreateFormData, null);
            int i16 = com.garmin.android.apps.connectmobile.f0.O;
            objO0 = g0Var.O0(3, 5000L, e0Var, z1Var2);
            if (objO0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objO0);
        }
        v2 v2Var = (v2) objO0;
        if (v2Var instanceof v2.b) {
            return new m1.b((cy0.o) ((v2.b) v2Var).f47386a);
        }
        if (v2Var instanceof v2.a) {
            return new m1.a(((v2.a) v2Var).f47383a);
        }
        lc.u0.r();
        return null;
    }
}
