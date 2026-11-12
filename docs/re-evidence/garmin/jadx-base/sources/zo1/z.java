package zo1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lzo1/z;", "Lh82/c;", "<init>", "()V", "a", "", "showRemoveMeDialog", "removedMyselfFromSocialGroupRide", "isLoading", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends h82.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f206495h = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f206496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f206497g;

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-307015982);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f206497g = bundle.getString("KEY_GROUP_RIDE_UUID");
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            this.f206496f = (b0) v9.b.a(p005kotlin.jvm.internal.s0.f105811a.b(b0.class), viewModelStoreOwnerA, null, null, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, bundle, i14, 26);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_groupride_privacy), null, new z3.e(-1329246561, true, new xn.t(this, 21)), 4, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        p3.o0 o0VarE = mVar.E(2036267962);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        final int i17 = 0;
        final int i18 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (this.f206496f == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new e23.p(this, i14, i17) { // from class: zo1.y

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f206491a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ z f206492b;

                        {
                            this.f206491a = i17;
                            this.f206492b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i19 = this.f206491a;
                            z zVar = this.f206492b;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            z.a aVar = z.f206495h;
                            switch (i19) {
                                case 0:
                                    zVar.g(mVar2, p3.p0.t(1));
                                    break;
                                default:
                                    zVar.g(mVar2, p3.p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                b0 b0Var = this.f206496f;
                b0Var.getClass();
                p1 p1VarC = p3.p0.c(b0Var.f206236c, o0VarE, 0);
                b0 b0Var2 = this.f206496f;
                b0Var2.getClass();
                p1 p1VarC2 = p3.p0.c(b0Var2.f206238e, o0VarE, 0);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                if (((Boolean) p1VarC.getF182175a()).booleanValue()) {
                    o0VarE.C(341191382);
                    Unit unit = Unit.INSTANCE;
                    boolean zR = o0VarE.r(this) | o0VarE.r(context);
                    Object objQ2 = o0VarE.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new a0(this, context, null);
                        o0VarE.K(objQ2);
                    }
                    p3.l0.e((e23.p) objQ2, unit, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(341454696);
                    o0VarE.g0(false);
                }
                g02.s0.a(null, ((Boolean) p1VarC2.getF182175a()).booleanValue(), z3.f.c(1533739524, new zi1.a(i15, this, p1Var), o0VarE), o0VarE, 384, 1);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new e23.p(this, i14, i18) { // from class: zo1.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f206491a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f206492b;

                {
                    this.f206491a = i18;
                    this.f206492b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = this.f206491a;
                    z zVar = this.f206492b;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    z.a aVar = z.f206495h;
                    switch (i19) {
                        case 0:
                            zVar.g(mVar2, p3.p0.t(1));
                            break;
                        default:
                            zVar.g(mVar2, p3.p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo1/z$a;", "", "<init>", "()V", "", "KEY_GROUP_RIDE_UUID", "Ljava/lang/String;", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
