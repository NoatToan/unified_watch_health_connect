package r22;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/e0;", "Lr22/x;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f149637b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f149638a;

    @Override // r22.x
    public final void u6(p3.m mVar, int i14) {
        String string;
        p3.o0 o0VarE = mVar.E(927149340);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Bundle arguments = getArguments();
            String string2 = arguments != null ? arguments.getString("ARG_ACTIVITY_TITLE", "") : null;
            String str = string2 != null ? string2 : "";
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("ARG_ACTIVITY_DESCRIPTION", null)) == null) {
                string = getString(R.string.msg_permanently_delete_activity_confirmation);
                string.getClass();
            }
            z02.b.a(false, null, null, null, false, z3.f.c(-1657049006, new pp.g(str, 16, string, this), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(this, i14, i15);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lr22/e0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_ACTIVITY_TITLE", "ARG_ACTIVITY_DESCRIPTION", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static e0 a(a aVar, String str, String str2, e23.a aVar2, int i14) {
            if ((i14 & 1) != 0) {
                str = "";
            }
            aVar.getClass();
            str.getClass();
            e0 e0Var = new e0();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_ACTIVITY_TITLE", str);
            bundle.putString("ARG_ACTIVITY_DESCRIPTION", str2);
            e0Var.setArguments(bundle);
            e0Var.f149638a = aVar2;
            return e0Var;
        }

        private a() {
        }
    }
}
