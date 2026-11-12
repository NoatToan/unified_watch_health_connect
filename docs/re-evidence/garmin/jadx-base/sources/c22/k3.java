package c22;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/k3;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k3 f23115a = new k3();

    private k3() {
    }

    public static final Uri a(Context context, String str) {
        context.getClass();
        File file = new File(context.getCacheDir(), "images");
        file.mkdir();
        Uri uriFromFile = Uri.fromFile(new File(file, str));
        uriFromFile.getClass();
        return uriFromFile;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable b(Context context, Uri uri, v13.c cVar) throws Throwable {
        h3 h3Var;
        if (cVar instanceof h3) {
            h3Var = (h3) cVar;
            int i14 = h3Var.f23084c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h3Var.f23084c = i14 - Integer.MIN_VALUE;
            } else {
                h3Var = new h3(this, cVar);
            }
        } else {
            h3Var = new h3(this, cVar);
        }
        Object objC = h3Var.f23082a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h3Var.f23084c;
        if (i15 == 0) {
            o13.r.b(objC);
            zp0.c.f206560v.getClass();
            zp0.c cVarA = zp0.c.a.a(context);
            uri.getClass();
            cVarA.f206568h = uri;
            Bitmap bitmapC = cVarA.c();
            if (bitmapC == null) {
                String strJ = am.j.j(uri, "Failed to load image. Given imageUri is ");
                com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "UCropImageUtil", strJ);
                return null;
            }
            h3Var.f23084c = 1;
            objC = c(context, bitmapC, h3Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return (Uri) objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, Bitmap bitmap, v13.c cVar) {
        i3 i3Var;
        p005kotlin.jvm.internal.r0 r0Var;
        if (cVar instanceof i3) {
            i3Var = (i3) cVar;
            int i14 = i3Var.f23097d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i3Var.f23097d = i14 - Integer.MIN_VALUE;
            } else {
                i3Var = new i3(this, cVar);
            }
        } else {
            i3Var = new i3(this, cVar);
        }
        Object obj = i3Var.f23095b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i3Var.f23097d;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                j3 j3Var = new j3(context, bitmap, r0Var2, null);
                i3Var.f23094a = r0Var2;
                i3Var.f23097d = 1;
                if (ge1.b.e0(bVar, j3Var, i3Var) == aVar) {
                    return aVar;
                }
                r0Var = r0Var2;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var = i3Var.f23094a;
                o13.r.b(obj);
            }
            return r0Var.f105810a;
        } catch (Exception e4) {
            String strN = fb1.c.n("store image with exception: ", e4.getMessage());
            com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "UCropImageUtil", strN);
            return null;
        }
    }
}
