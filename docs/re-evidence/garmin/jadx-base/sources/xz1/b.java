package xz1;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o13.q;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxz1/b;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f192860a = new b();

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    public static boolean a(m mVar) {
        Object bVar;
        Object obj;
        boolean z14;
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        boolean zB = mVar.B(context);
        Object objQ = mVar.q();
        if (zB) {
            int i14 = q.f128596b;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                z14 = true;
            } else {
                z14 = false;
            }
            bVar = Boolean.valueOf(z14);
            obj = Boolean.FALSE;
            if (bVar instanceof q.b) {
                bVar = obj;
            }
            objQ = (Boolean) bVar;
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                try {
                    int i15 = q.f128596b;
                    if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    bVar = Boolean.valueOf(z14);
                } catch (Throwable th3) {
                    int i16 = q.f128596b;
                    bVar = new q.b(th3);
                }
                obj = Boolean.FALSE;
                if (bVar instanceof q.b) {
                    bVar = obj;
                }
                objQ = (Boolean) bVar;
                mVar.K(objQ);
            }
        }
        boolean zBooleanValue = ((Boolean) objQ).booleanValue();
        x1 x1Var2 = n.f135158a;
        return zBooleanValue;
    }
}
