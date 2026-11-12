package jk1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import hk1.k;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.fa;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f99381a = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.connect.ThirdPartyAppNotSupportedKt$ThirdPartyAppNotSupported$2$1$1", f = "ThirdPartyAppNotSupported.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f99382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f99383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f99384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f99385d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, boolean z14, Context context, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f99382a = eVar;
            this.f99383b = z14;
            this.f99384c = context;
            this.f99385d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f99382a, this.f99383b, this.f99384c, this.f99385d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f99382a.f99388b) {
                if (this.f99383b) {
                    int i14 = d.f99381a;
                    this.f99385d.setValue(Boolean.TRUE);
                } else {
                    Toast.makeText(this.f99384c, R.string.txt_error_occurred, 0).show();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99386a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.REGISTRATION_LIMIT_EXCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.CHILD_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f99386a = iArr;
        }
    }

    static {
        new d20.d(null, "Strava", "Strava", null, null, null, null, null, null, null, null, false, false, 8185, null);
    }

    public static final void a(String str, hk1.r rVar, m mVar, int i14) {
        String strJ;
        o0 o0VarE = mVar.E(1826295202);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (g22.n.d(str)) {
                o0VarE.C(-1485159517);
                strJ = y.P(R.string.msg_unable_to_connect_to_app, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1485061371, R.string.msg_unable_to_connect_to_app_missing_name_and_logo, o0VarE, false);
            }
            b82.n.a(z3.f.c(2021556721, new c(rVar, str), o0VarE), y.Q(o0VarE, R.string.lbl_feature_not_supported), strJ, null, null, o0VarE, 6, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(str, rVar, i14);
        }
    }

    public static final void b(int i14, e23.a aVar, String str, m mVar) {
        String strP;
        o0 o0VarE = mVar.E(-280466391);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (g22.n.d(str)) {
                o0VarE.C(-1662683108);
                strP = y.P(R.string.max_user_connections_reached, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1662584559);
                strP = y.P(R.string.max_user_connections_reached, new Object[]{y.Q(o0VarE, R.string.help_app)}, o0VarE);
                o0VarE.g0(false);
            }
            String str2 = strP;
            s62.a.f157643a.getClass();
            u4.d dVarA = fa.a(t62.b.f162798a);
            String strQ = y.Q(o0VarE, R.string.lbl_unable_to_connect);
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            b82.n.d(dVarA, strQ, str2, l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), y.Q(o0VarE, R.string.common_button_back), aVar, null, null, o0VarE, (i15 << 12) & 458752, 192);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 16);
        }
    }

    public static final void c(e eVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1991646960);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            hk1.y yVar = eVar.f99391e;
            yVar.getClass();
            hk1.y.a aVar3 = (hk1.y.a) yVar;
            o0Var = o0VarE;
            z02.d.a(eVar.f99387a, z3.f.c(-1308378187, new i20.b(18, aVar3, aVar2), o0VarE), null, null, null, z3.f.c(285768889, new ck0.h(aVar3, aVar2, eVar, z14, context, aVar, 14), o0VarE), o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(eVar, z14, aVar, aVar2, i14, 21);
        }
    }
}
