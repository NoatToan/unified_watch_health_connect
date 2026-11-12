package ty0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import lc.q0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lty0/h;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f166975a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lty0/h$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: ty0.h$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3140a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f166976a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.ESSENTIALS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.EDIT_IN_FOCUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.EDIT_AT_A_GLANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[g.IN_FOCUS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[g.SLEEP_COACH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[g.AT_A_GLANCE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[g.EVENTS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[g.GARMIN_COACH_PLANS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[g.CHALLENGES.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[g.YESTERDAY_SUMMARY.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[g.LAST_7_DAYS_SUMMARY.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[g.GARMIN_CONNECT_PLUS_SETTINGS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                f166976a = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"ty0/h$a$b", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends q0<DashboardRoute> {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ n63.b f166977s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n63.b bVar) {
                super(true);
                this.f166977s = bVar;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute, java.lang.Object] */
            @Override // lc.q0
            public final DashboardRoute a(Bundle bundle, String str) {
                String strI = q2.i(str, str, bundle);
                if (strI == null) {
                    return null;
                }
                n63.b bVar = this.f166977s;
                bVar.getClass();
                return bVar.c(DashboardRoute.INSTANCE.serializer(), strI);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute, java.lang.Object] */
            @Override // lc.q0
            /* JADX INFO: renamed from: d */
            public final DashboardRoute h(String str) {
                str.getClass();
                n63.b bVar = this.f166977s;
                bVar.getClass();
                return bVar.c(DashboardRoute.INSTANCE.serializer(), str);
            }

            @Override // lc.q0
            public final void e(Bundle bundle, String str, DashboardRoute dashboardRoute) {
                str.getClass();
                n63.b bVar = this.f166977s;
                bVar.getClass();
                bundle.putString(str, bVar.b(j63.a.d(DashboardRoute.INSTANCE.serializer()), dashboardRoute));
            }

            @Override // lc.q0
            public final String f(DashboardRoute dashboardRoute) {
                n63.b bVar = this.f166977s;
                bVar.getClass();
                return q2.j(bVar, j63.a.d(DashboardRoute.INSTANCE.serializer()), dashboardRoute);
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, DashboardRoute dashboardRoute) {
            context.getClass();
            dashboardRoute.getClass();
            Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
            Bundle bundle = new Bundle();
            new b(n63.b.f123892d).e(bundle, "StartDestination", dashboardRoute);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
