package tn;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.kb;
import l72.i3;
import lc.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u0011²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ltn/m;", "", "", "currentSessionName", "hint", "Lkotlin/Function1;", "", "finishHandler", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/l;)V", "a", "text", "Li53/c;", "Ll72/i3;", "moreMenu", "", "showConfirmationDialog", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f165476e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f165478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<String, Unit> f165479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f165480d;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(String str, String str2, e23.l<? super String, Unit> lVar) {
        lVar.getClass();
        this.f165477a = str;
        this.f165478b = str2;
        this.f165479c = lVar;
        this.f165480d = str;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public final void a(m0 m0Var, p3.m mVar, int i14) {
        o0 o0Var;
        m mVar2 = this;
        Object obj = m0Var;
        obj.getClass();
        o0 o0VarE = mVar.E(1358623836);
        int i15 = (o0VarE.r(obj) ? 4 : 2) | i14 | (o0VarE.r(mVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(mVar2.f165480d);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(mVar2.b(context));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var3 = (p1) objQ3;
            g8.i.d(1, o0VarE, 6);
            z3.e eVarC = z3.f.c(594956312, new sg2.g(mVar2, obj, p1Var, p1Var3, p1Var2, 13), o0VarE);
            mVar2 = this;
            obj = m0Var;
            o0Var = o0VarE;
            kb.a(null, eVarC, null, null, null, 0, 0L, 0L, null, z3.f.c(-339612499, new ak0.h((Object) mVar2, context, (Object) m0Var, p1Var, (Object) p1Var2, p1Var3, 26), o0VarE), o0Var, 805306416, 509);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(mVar2, obj, i14, 13);
        }
    }

    public final i53.f b(Context context) {
        String str = this.f165480d;
        String str2 = this.f165477a;
        if (p005kotlin.jvm.internal.s.g(str, str2)) {
            return null;
        }
        if (str2 == null && p005kotlin.jvm.internal.s.g(this.f165480d, "")) {
            return null;
        }
        String string = context.getString(R.string.lbl_save);
        string.getClass();
        return i53.a.a(new i3("SAVE", string, false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ltn/m$a;", "", "<init>", "()V", "", "ROUTE", "Ljava/lang/String;", "MENU_ITEM_SAVE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
