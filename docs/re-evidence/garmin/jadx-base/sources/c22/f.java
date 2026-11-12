package c22;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/f;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23050a = new f();

    private f() {
    }

    public static androidx.appcompat.app.e a(Context context, int i14, int i15, o13.p pVar, o13.p pVar2) {
        context.getClass();
        return b(context, context.getString(i14), context.getString(i15), pVar, pVar2, null, false);
    }

    public static androidx.appcompat.app.e b(Context context, String str, String str2, o13.p pVar, o13.p pVar2, o13.p pVar3, boolean z14) {
        context.getClass();
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
        aVar.setTitle(str);
        aVar.setMessage(str2);
        aVar.setPositiveButton((CharSequence) pVar.f128594a, new br2.b((e23.p) pVar.f128595b, 5));
        if (pVar2 != null) {
            aVar.setNegativeButton((CharSequence) pVar2.f128594a, new br2.b((e23.p) pVar2.f128595b, 6));
        }
        if (pVar3 != null) {
            aVar.setNeutralButton((CharSequence) pVar3.f128594a, new br2.b((e23.p) pVar3.f128595b, 7));
        }
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        eVarCreate.setCanceledOnTouchOutside(z14);
        return eVarCreate;
    }

    public static /* synthetic */ androidx.appcompat.app.e c(f fVar, Context context, int i14, int i15, o13.p pVar, o13.p pVar2, int i16) {
        if ((i16 & 16) != 0) {
            pVar2 = null;
        }
        fVar.getClass();
        return a(context, i14, i15, pVar, pVar2);
    }

    public static /* synthetic */ androidx.appcompat.app.e d(f fVar, Context context, String str, String str2, o13.p pVar, o13.p pVar2, o13.p pVar3, boolean z14, int i14) {
        if ((i14 & 16) != 0) {
            pVar2 = null;
        }
        if ((i14 & 32) != 0) {
            pVar3 = null;
        }
        if ((i14 & 64) != 0) {
            z14 = false;
        }
        fVar.getClass();
        return b(context, str, str2, pVar, pVar2, pVar3, z14);
    }
}
