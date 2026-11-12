package h82;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import d53.u;
import java.util.Iterator;
import java.util.List;
import lc.m0;
import nc.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lh82/c;", "", "<init>", "()V", "b", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f82428d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82429e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h82.a f82430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<b> f82431b = j0.f134944a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f82432c = "DEFAULT_ACTION";

    /* JADX INFO: renamed from: h82.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h82/c$c", "Lh82/a;", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1631c implements h82.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f82437a;

        public C1631c(m0 m0Var) {
            this.f82437a = m0Var;
        }

        @Override // h82.a
        public final void a(String str) {
            str.getClass();
            this.f82437a.i(new h02.a(21), str);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h82/c$d", "Lh82/a;", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements h82.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<String> f82438a;

        public d(p1<String> p1Var) {
            this.f82438a = p1Var;
        }

        @Override // h82.a
        public final void a(String str) {
            str.getClass();
            this.f82438a.setValue(str);
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82439a;

        static {
            int[] iArr = new int[i82.a.values().length];
            try {
                iArr[i82.a.SINGLE_PANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i82.a.DUAL_PANE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82439a = iArr;
        }
    }

    public static void f(c cVar, Context context, String str) {
        cVar.getClass();
        context.getClass();
        if (str == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(str);
            uri.getClass();
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
        }
    }

    public void a(Bundle bundle, p3.m mVar, int i14) {
        bundle.getClass();
        mVar.C(785280404);
        x1 x1Var = p3.n.f135158a;
        String string = bundle.getString("EXTRA_ACTION");
        if (string == null) {
            string = "DEFAULT_ACTION";
        }
        this.f82432c = string;
        mVar.f();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    public final void b(m0 m0Var, i82.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        i82.a aVar2;
        m0Var.getClass();
        o0 o0VarE = mVar.E(-1750763414);
        int i17 = 4;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(m0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            i82.a aVar3 = i18 != 0 ? i82.a.SINGLE_PANE : aVar;
            x1 x1Var = p3.n.f135158a;
            this.f82431b = c((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            int i19 = i16;
            String str = this.f82432c;
            boolean zR = o0VarE.r(this) | ((i19 & 112) == 32) | o0VarE.r(m0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new gw1.d(aVar3, i17, this, m0Var);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gw1.d(aVar3, i17, this, m0Var);
                    o0VarE.K(objQ);
                }
            }
            y.b(m0Var, str, null, null, null, null, null, null, (e23.l) objQ, o0VarE, i19 & 14, 1020);
            h4.r.a aVar4 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), o0VarE);
            aVar2 = aVar3;
        } else {
            o0VarE.e();
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(this, m0Var, aVar2, i14, i15, 6);
        }
    }

    public List<b> c(Context context) {
        context.getClass();
        return j0.f134944a;
    }

    public final String d(String str) {
        Object next;
        Object next2;
        String str2;
        if (s.g(str, "DEFAULT_ACTION")) {
            Iterator<T> it = this.f82431b.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!s.g(((b) next2).f82433a, "DEFAULT_ACTION"));
            b bVar = (b) next2;
            if (bVar != null && (str2 = bVar.f82434b) != null) {
                return str2;
            }
        } else {
            String strV = str != null ? u.v(str, "DEFAULT_ACTION/", "", false) : null;
            Iterator<T> it3 = this.f82431b.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((b) next).f82433a, strV));
            b bVar2 = (b) next;
            if (bVar2 != null) {
                return bVar2.f82434b;
            }
        }
        return null;
    }

    public final void e(String str) {
        str.getClass();
        h82.a aVar = this.f82430a;
        if (aVar != null) {
            aVar.a(str);
        }
        this.f82432c = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lh82/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_ACTION", "DEFAULT_ACTION", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh82/c$b;", "", "", "action", "title", "titleContentDescription", "Lkotlin/Function1;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/q;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f82435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.q<String, p3.m, Integer, Unit> f82436d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, String str2, String str3, e23.q<? super String, ? super p3.m, ? super Integer, Unit> qVar) {
            str.getClass();
            qVar.getClass();
            this.f82433a = str;
            this.f82434b = str2;
            this.f82435c = str3;
            this.f82436d = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f82433a, bVar.f82433a) && s.g(this.f82434b, bVar.f82434b) && s.g(this.f82435c, bVar.f82435c) && s.g(this.f82436d, bVar.f82436d);
        }

        public final int hashCode() {
            int iHashCode = this.f82433a.hashCode() * 31;
            String str = this.f82434b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f82435c;
            return this.f82436d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("Screen(action=", this.f82433a, ", title=", this.f82434b, ", titleContentDescription=");
            sbI.append(this.f82435c);
            sbI.append(", content=");
            sbI.append(this.f82436d);
            sbI.append(")");
            return sbI.toString();
        }

        public /* synthetic */ b(String str, String str2, String str3, e23.q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, (i14 & 4) != 0 ? null : str3, qVar);
        }
    }
}
