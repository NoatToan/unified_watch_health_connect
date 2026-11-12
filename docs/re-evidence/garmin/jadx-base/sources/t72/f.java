package t72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lt72/f;", "Lh82/c;", "<init>", "()V", "a", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f163126f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        final int i14 = 0;
        h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1913174532, true, new q(this) { // from class: t72.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f163114b;

            {
                this.f163114b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                f fVar = this.f163114b;
                String str = (String) obj;
                m mVar = (m) obj2;
                Integer num = (Integer) obj3;
                switch (i15) {
                    case 0:
                        int iIntValue = num.intValue();
                        int i16 = f.f163126f;
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar.B(str) ? 4 : 2;
                        }
                        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var = n.f135158a;
                            fVar.i(str, mVar, (iIntValue & 14) | (h82.c.f82429e << 3));
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        int iIntValue2 = num.intValue();
                        int i17 = f.f163126f;
                        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            x1 x1Var2 = n.f135158a;
                            fVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        int iIntValue3 = num.intValue();
                        int i18 = f.f163126f;
                        if (mVar.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            x1 x1Var3 = n.f135158a;
                            fVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i15 = 1;
        h82.c.b bVar2 = new h82.c.b("ACTION_1", "Section 1 Title", null, new z3.e(-2138255901, true, new q(this) { // from class: t72.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f163114b;

            {
                this.f163114b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i15;
                f fVar = this.f163114b;
                String str = (String) obj;
                m mVar = (m) obj2;
                Integer num = (Integer) obj3;
                switch (i16) {
                    case 0:
                        int iIntValue = num.intValue();
                        int i17 = f.f163126f;
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar.B(str) ? 4 : 2;
                        }
                        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var = n.f135158a;
                            fVar.i(str, mVar, (iIntValue & 14) | (h82.c.f82429e << 3));
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        int iIntValue2 = num.intValue();
                        int i18 = f.f163126f;
                        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            x1 x1Var2 = n.f135158a;
                            fVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        int iIntValue3 = num.intValue();
                        int i19 = f.f163126f;
                        if (mVar.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            x1 x1Var3 = n.f135158a;
                            fVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i16 = 2;
        return x.k(bVar, bVar2, new h82.c.b("ACTION_2", "Section 2 Title", null, new z3.e(-1894719038, true, new q(this) { // from class: t72.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f163114b;

            {
                this.f163114b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i17 = i16;
                f fVar = this.f163114b;
                String str = (String) obj;
                m mVar = (m) obj2;
                Integer num = (Integer) obj3;
                switch (i17) {
                    case 0:
                        int iIntValue = num.intValue();
                        int i18 = f.f163126f;
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= mVar.B(str) ? 4 : 2;
                        }
                        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                            x1 x1Var = n.f135158a;
                            fVar.i(str, mVar, (iIntValue & 14) | (h82.c.f82429e << 3));
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        int iIntValue2 = num.intValue();
                        int i19 = f.f163126f;
                        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            x1 x1Var2 = n.f135158a;
                            fVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        int iIntValue3 = num.intValue();
                        int i110 = f.f163126f;
                        if (mVar.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            x1 x1Var3 = n.f135158a;
                            fVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1666662452);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(1668962905, new ry0.g(18, this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 0);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-718172723);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            g.f163127a.getClass();
            h82.e.a(g.f163128b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(this, i14, 1);
        }
    }

    public final void i(String str, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1443785865);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(1427850595, new ry0.g(19, str, this), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(this, str, i14, 13);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lt72/f$a;", "", "<init>", "()V", "", "LOREM_IPSUM_URL", "Ljava/lang/String;", "ENGLISH_LANGUAGE_URL", "CUSTOM_EXTRA_VALUE", "ACTION_1", "ACTION_2", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
