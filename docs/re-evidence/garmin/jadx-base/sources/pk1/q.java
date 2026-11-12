package pk1;

import android.content.Context;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpk1/q;", "Lh82/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f138309f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        String strE = a0.e(R.string.title_user_settings_help, context);
        final int i14 = 0;
        h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", strE, null, new z3.e(494957877, true, new e23.q(this) { // from class: pk1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f138305b;

            {
                this.f138305b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                q qVar = this.f138305b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = q.f138309f;
                switch (i15) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            qVar.i(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 3:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var4 = p3.n.f135158a;
                            qVar.j(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 4:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var5 = p3.n.f135158a;
                            qVar.k(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var6 = p3.n.f135158a;
                            qVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i15 = 1;
        h82.c.b bVar2 = new h82.c.b("PERSONAL_INFORMATION", strE, null, new z3.e(-1545717228, true, new e23.q(this) { // from class: pk1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f138305b;

            {
                this.f138305b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i15;
                q qVar = this.f138305b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = q.f138309f;
                switch (i16) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            qVar.i(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 3:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var4 = p3.n.f135158a;
                            qVar.j(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 4:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var5 = p3.n.f135158a;
                            qVar.k(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var6 = p3.n.f135158a;
                            qVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i16 = 2;
        h82.c.b bVar3 = new h82.c.b("SLEEP", strE, null, new z3.e(708574963, true, new e23.q(this) { // from class: pk1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f138305b;

            {
                this.f138305b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i17 = i16;
                q qVar = this.f138305b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i18 = q.f138309f;
                switch (i17) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            qVar.i(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 3:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var4 = p3.n.f135158a;
                            qVar.j(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 4:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var5 = p3.n.f135158a;
                            qVar.k(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var6 = p3.n.f135158a;
                            qVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i17 = 3;
        h82.c.b bVar4 = new h82.c.b("UNITS", strE, null, new z3.e(-1332100142, true, new e23.q(this) { // from class: pk1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f138305b;

            {
                this.f138305b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i18 = i17;
                q qVar = this.f138305b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i19 = q.f138309f;
                switch (i18) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            qVar.i(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 3:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var4 = p3.n.f135158a;
                            qVar.j(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 4:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var5 = p3.n.f135158a;
                            qVar.k(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var6 = p3.n.f135158a;
                            qVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null);
        final int i18 = 4;
        final int i19 = 5;
        return p13.x.k(bVar, bVar2, bVar3, bVar4, new h82.c.b("WALKING", strE, null, new z3.e(922192049, true, new e23.q(this) { // from class: pk1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f138305b;

            {
                this.f138305b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i110 = i18;
                q qVar = this.f138305b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i111 = q.f138309f;
                switch (i110) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            qVar.i(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 3:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var4 = p3.n.f135158a;
                            qVar.j(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 4:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var5 = p3.n.f135158a;
                            qVar.k(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var6 = p3.n.f135158a;
                            qVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null), new h82.c.b("DISPLAY_PREFERENCES", strE, null, new z3.e(-1118483056, true, new e23.q(this) { // from class: pk1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f138305b;

            {
                this.f138305b = this;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i110 = i19;
                q qVar = this.f138305b;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i111 = q.f138309f;
                switch (i110) {
                    case 0:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 1:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = p3.n.f135158a;
                            qVar.h(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 2:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var3 = p3.n.f135158a;
                            qVar.i(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 3:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var4 = p3.n.f135158a;
                            qVar.j(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    case 4:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var5 = p3.n.f135158a;
                            qVar.k(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                    default:
                        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var6 = p3.n.f135158a;
                            qVar.g(mVar, h82.c.f82429e);
                        } else {
                            mVar.e();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-839605803);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f138275a.getClass();
            h82.e.a(c.f138280f, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, 1);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1214473937);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f138275a.getClass();
            h82.e.a(c.f138276b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, 3);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1489346630);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f138275a.getClass();
            h82.e.a(c.f138277c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, 4);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1804877742);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f138275a.getClass();
            h82.e.a(c.f138278d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, 2);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(247321564);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            c.f138275a.getClass();
            h82.e.a(c.f138279e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lpk1/q$a;", "", "<init>", "()V", "", "PERSONAL_INFORMATION", "Ljava/lang/String;", "SLEEP", "UNITS", "WALKING", "DISPLAY_PREFERENCES", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
