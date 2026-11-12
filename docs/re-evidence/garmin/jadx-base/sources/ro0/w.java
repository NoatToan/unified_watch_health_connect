package ro0;

import android.content.Context;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.UnsupportedEncodingException;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class w {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(Context context, Uri uri, m12.m mVar, v13.c cVar) throws UnsupportedEncodingException {
        v vVar;
        String string;
        Object objA;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f153892e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f153892e = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(cVar);
            }
        } else {
            vVar = new v(cVar);
        }
        Object obj = vVar.f153891d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f153892e;
        if (i15 == 0) {
            o13.r.b(obj);
            string = uri.toString();
            string.getClass();
            vVar.f153888a = context;
            vVar.f153889b = uri;
            vVar.f153890c = string;
            vVar.f153892e = 1;
            objA = mVar.a(string, vVar);
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = vVar.f153890c;
            uri = vVar.f153889b;
            Context context2 = vVar.f153888a;
            o13.r.b(obj);
            string = str;
            context = context2;
            objA = obj;
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            String strA = ((pu.k) ((v2.b) v2Var).f47386a).a();
            strA.getClass();
            if (d53.w.J(strA)) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.p(a2Var, "FeatureNavigationUtils", "Unable to authenticate Garmin URL: empty login token");
                g22.a.d(context, uri);
            } else {
                g22.a.f(context, strA, string);
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Unable to authenticate Garmin URL: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.p(a2Var2, "FeatureNavigationUtils", strD);
            g22.a.d(context, uri);
        }
        return Unit.INSTANCE;
    }
}
