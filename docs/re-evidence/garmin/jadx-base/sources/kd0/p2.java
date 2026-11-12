package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.leaderboard.LeaderboardActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.settings.notifications.NotificationSettingsActivity;
import com.garmin.android.apps.connectmobile.trails.presentation.GarminTrailsActivity;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.net.URI;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkd0/p2;", "Lak0/a;", "Lzd0/d0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p2 implements ak0.a, zd0.d0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GCPlusDelegateImpl$navigateToPerformanceDashboardFromPromo$1", f = "GCPlusDelegateImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104281a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f104283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f104283c = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p2.this.new b(this.f104283c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104281a;
            if (i14 == 0) {
                o13.r.b(obj);
                oj0.z zVar = oj0.z.PROMO;
                this.f104281a = 1;
                if (p2.this.i(this.f104283c, zVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public static void v(Context context, boolean z14, b21.l4 l4Var) {
        context.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context, null, null, l4Var, false, z14, 22));
    }

    @Override // ak0.a
    public final void a(Context context) {
        context.getClass();
        LeaderboardActivity.f37145i.getClass();
        context.startActivity(LeaderboardActivity.a.a(context));
    }

    @Override // ak0.a
    public final void b(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) GarminTrailsActivity.class));
    }

    @Override // ak0.a
    public final void c(Context context) {
        context.getClass();
        v(context, false, b21.l4.g0.INSTANCE);
    }

    @Override // zd0.d0
    public final void d(Context context) {
        context.getClass();
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new b(context, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ak0.a
    public final void e(Activity activity) {
        activity.getClass();
        v(activity, true, new b21.l4.h0(new b21.l4.e0((l01.k) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0))));
    }

    @Override // ak0.a
    public final void f(Activity activity) {
        activity.getClass();
        v(activity, true, new b21.l4.h0(b21.l4.f0.INSTANCE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ak0.a
    public final Object g(v13.c cVar) {
        q2 q2Var;
        if (cVar instanceof q2) {
            q2Var = (q2) cVar;
            int i14 = q2Var.f104315c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q2Var.f104315c = i14 - Integer.MIN_VALUE;
            } else {
                q2Var = new q2(this, cVar);
            }
        } else {
            q2Var = new q2(this, cVar);
        }
        Object objA = q2Var.f104313a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q2Var.f104315c;
        if (i15 == 0) {
            o13.r.b(objA);
            x01.i iVar = (x01.i) KoinJavaComponent.get$default(x01.i.class, null, null, 6, null);
            q2Var.f104315c = 1;
            x01.i iVar2 = x01.i.f188278a;
            objA = iVar.a(true, q2Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return Boolean.valueOf(((x01.e) objA).f188255d == x01.f.ACTIVE);
    }

    @Override // ak0.a
    public final void h(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) WorkoutListActivity.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ak0.a
    public final Object i(Context context, oj0.z zVar, v13.c cVar) {
        r2 r2Var;
        Exception e4;
        Context context2;
        Uri uri;
        Uri uri2;
        if (cVar instanceof r2) {
            r2Var = (r2) cVar;
            int i14 = r2Var.f104335e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r2Var.f104335e = i14 - Integer.MIN_VALUE;
            } else {
                r2Var = new r2(this, cVar);
            }
        } else {
            r2Var = new r2(this, cVar);
        }
        Object objM = r2Var.f104333c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r2Var.f104335e;
        if (i15 == 0) {
            o13.r.b(objM);
            oj0.a0.f132272a.getClass();
            zVar.getClass();
            gg1.v0.T.getClass();
            Uri uri3 = Uri.parse(gg1.v0.a.b().b() + "/modern/performance-dashboard?fromMobile=true&source=" + zVar.f132367a);
            try {
                f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                ve2.h hVar = ve2.h.USE_IF_ENABLED;
                uri3.getClass();
                URI uri4 = new URI(uri3.toString());
                r2Var.f104331a = context;
                r2Var.f104332b = uri3;
                r2Var.f104335e = 1;
                objM = bVar.m(context, hVar, uri4, r2Var);
                if (objM == aVar) {
                    return aVar;
                }
            } catch (Exception e14) {
                e4 = e14;
                context2 = context;
                uri = uri3;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                String strH = com.garmin.android.apps.connectmobile.f3.h(e4, "generateITAutoLoginURI or toJavaURI threw exception ", ".");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.p(a2Var, "GCPlusDelegateImpl", strH);
                Context context3 = context2;
                uri2 = uri;
                context = context3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = r2Var.f104332b;
            context2 = r2Var.f104331a;
            try {
                o13.r.b(objM);
                context = context2;
            } catch (Exception e15) {
                e4 = e15;
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS;
                String strH2 = com.garmin.android.apps.connectmobile.f3.h(e4, "generateITAutoLoginURI or toJavaURI threw exception ", ".");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.p(a2Var2, "GCPlusDelegateImpl", strH2);
                Context context4 = context2;
                uri2 = uri;
                context = context4;
            }
        }
        uri2 = Uri.parse(String.valueOf(objM).concat("&generateExtraServiceTicket=true&generateTwoExtraServiceTickets=true"));
        g22.a.d(context, uri2);
        return Unit.INSTANCE;
    }

    @Override // ak0.a
    public final void j(Context context) {
        context.getClass();
        LiveTrackActivity.f38637g.c(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ak0.a
    public final void k(Activity activity) {
        activity.getClass();
        v(activity, true, new b21.l4.h0(new b21.l4.o0(false, (l01.k) null, 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0))));
    }

    @Override // ak0.a
    public final void l(Activity activity) {
        activity.getClass();
        v(activity, true, new b21.l4.h0(b21.l4.v.INSTANCE));
    }

    @Override // ak0.a
    public final boolean m() {
        return !wd2.m.a().isEmpty();
    }

    @Override // ak0.a
    public final void n(Context context, boolean z14) {
        context.getClass();
        Intent intentA = NutritionActivity.a.a(NutritionActivity.f39581f, context, null, null, z14 ? b21.l4.i0.INSTANCE : null, z14, false, 38);
        if (!z14) {
            context.startActivity(intentA);
            return;
        }
        intentA.addFlags(67108864);
        z6.h0 h0VarE = z6.h0.e(context);
        ArrayList<Intent> arrayList = h0VarE.f202637a;
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        arrayList.add(new Intent(context, (Class<?>) DashboardActivity.class));
        arrayList.add(intentA);
        h0VarE.g();
    }

    @Override // ak0.a
    public final void o(Activity activity) {
        activity.getClass();
        v(activity, true, new b21.l4.h0(b21.l4.t.INSTANCE));
    }

    @Override // ak0.a
    public final void p(Context context) {
        context.getClass();
        NotificationSettingsActivity.a aVar = NotificationSettingsActivity.f43568b;
        cj1.a aVar2 = cj1.a.SUBSCRIPTIONS;
        aVar.getClass();
        Intent intent = new Intent(context, (Class<?>) NotificationSettingsActivity.class);
        intent.putExtra("VIEW_PUSH_NOTIFICATION_SETTINGS", true);
        intent.putExtra("EXTRA_SCROLL_TO_ITEM", aVar2);
        context.startActivity(intent);
    }

    @Override // ak0.a
    public final void q(Context context) {
        context.getClass();
        v(context, false, b21.l4.i0.INSTANCE);
    }

    @Override // ak0.a
    public final void r(Activity activity) {
        activity.getClass();
        v(activity, true, new b21.l4.h0(b21.l4.w.INSTANCE));
    }

    @Override // ak0.a
    public final void s(Context context) {
        context.getClass();
        LiveTrackActivity.f38637g.c(context, bv0.a.s.INSTANCE);
    }

    @Override // ak0.a
    public final void t(Context context) {
        context.getClass();
        EditProfileImageActivity.f46576j.getClass();
        Intent intent = new Intent(context, (Class<?>) EditProfileImageActivity.class);
        intent.putExtra("START_WITH_FRAME", true);
        context.startActivity(intent);
    }

    @Override // ak0.a
    public final void u(Activity activity) {
        activity.getClass();
        v(activity, true, new b21.l4.h0(b21.l4.x.INSTANCE));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/p2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
