package gv0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.livetrackui.data.exception.AddContactException;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd0.c6;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.l2;
import r53.p2;
import r53.q2;
import r53.z1;
import wd2.g2;
import wd2.m1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgv0/d;", "Landroidx/lifecycle/u1;", "Lsu0/b0;", "Luu0/a;", "appDelegate", "Lyu0/d;", "dataFormatter", "Luu0/h;", "getLiveTrackPlusDataUseCase", "Laz0/c;", "networkStateObserver", "Ll22/b;", "resourceResolver", "Lhl/a;", "screenAccessRole", "settingsDelegate", "<init>", "(Luu0/a;Lyu0/d;Luu0/h;Laz0/c;Ll22/b;Lhl/a;Lsu0/b0;)V", "b", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 implements su0.b0 {
    public static final /* synthetic */ int O0 = 0;
    public final p2 A;
    public final b2 B;
    public pu0.b C;
    public pu0.b D;
    public boolean E;
    public final p2 F;
    public final p2 H0;
    public final b2 I;
    public final b2 I0;
    public final boolean J0;
    public final b2 K0;
    public final p2 L0;
    public final b2 M0;
    public final b2 N0;
    public m1 P;
    public final p2 T;
    public final b2 X;
    public Boolean Y;
    public final p2 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ su0.b0 f79183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uu0.a f79184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yu0.d f79185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uu0.h f79186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l22.b f79187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hl.a f79188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f79189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f79190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f79191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f79192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f79193k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b2 f79194k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f79195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f79196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f79197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f79198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f79199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f79200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f79201r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f79202t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f79203v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f79204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p2 f79205x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f79206y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p2 f79207z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$1", f = "LiveTrackSettingsViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79208a;

        /* JADX INFO: renamed from: gv0.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "", "Lpu0/b;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$1$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1595a extends v13.i implements e23.p<g3<? extends List<? extends pu0.b>>, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f79210a;

            public C1595a(t13.d<? super C1595a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1595a c1595a = new C1595a(dVar);
                c1595a.f79210a = obj;
                return c1595a;
            }

            @Override // e23.p
            public final Object invoke(g3<? extends List<? extends pu0.b>> g3Var, t13.d<? super Boolean> dVar) {
                return ((C1595a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                g3 g3Var = (g3) this.f79210a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Boolean.valueOf(g3Var.f35300a == fw.p.SUCCESS && g3Var.f35301b != 0);
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79208a;
            d dVar = d.this;
            if (i14 == 0) {
                o13.r.b(obj);
                b2 b2Var = dVar.I0;
                C1595a c1595a = new C1595a(null);
                this.f79208a = 1;
                if (r53.s.w(b2Var, c1595a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            dVar.getClass();
            su0.t.f161004a.getClass();
            dVar.N4(su0.t.i());
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79211a;

        static {
            int[] iArr = new int[pu0.h.a.values().length];
            try {
                iArr[pu0.h.a.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pu0.h.a.NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pu0.h.a.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79211a = iArr;
        }
    }

    /* JADX INFO: renamed from: gv0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$addRecipient$1", f = "LiveTrackSettingsViewModel.kt", l = {531, 532}, m = "invokeSuspend", v = 2)
    public static final class C1596d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z1 f79212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f79213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public pu0.b f79214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f79215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f79216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f79217f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ pu0.b f79219h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1596d(pu0.b bVar, t13.d<? super C1596d> dVar) {
            super(2, dVar);
            this.f79219h = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C1596d(this.f79219h, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1596d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005f  */
        /* JADX WARN: Code duplicated, block: B:20:0x0072  */
        /* JADX WARN: Code duplicated, block: B:21:0x0075  */
        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:29:0x0098  */
        /* JADX WARN: Code duplicated, block: B:31:0x009b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008d -> B:26:0x0090). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r10.f79217f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1b
                int r1 = r10.f79216e
                java.lang.Object r4 = r10.f79215d
                pu0.b r5 = r10.f79214c
                gv0.d r6 = r10.f79213b
                r53.z1 r7 = r10.f79212a
                o13.r.b(r11)
                goto L90
            L1b:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r11)
            L20:
                r11 = 0
                return r11
            L22:
                int r1 = r10.f79216e
                java.lang.Object r4 = r10.f79215d
                pu0.b r5 = r10.f79214c
                gv0.d r6 = r10.f79213b
                r53.z1 r7 = r10.f79212a
                o13.r.b(r11)
                goto L72
            L30:
                o13.r.b(r11)
                gv0.d r11 = gv0.d.this
                r53.p2 r1 = r11.f79196m
            L37:
                java.lang.Object r4 = r1.getValue()
                r5 = r4
                com.garmin.android.apps.connectmobile.g3 r5 = (com.garmin.android.apps.connectmobile.g3) r5
                com.garmin.android.apps.connectmobile.g3$a r5 = com.garmin.android.apps.connectmobile.g3.f35298f
                com.garmin.android.apps.connectmobile.g3 r5 = com.garmin.android.apps.connectmobile.g3.a.c(r5)
                boolean r4 = r1.b(r4, r5)
                if (r4 == 0) goto L37
                r53.p2 r1 = r11.f79196m
                r4 = 0
                pu0.b r5 = r10.f79219h
                r6 = r11
                r7 = r1
                r1 = r4
            L52:
                java.lang.Object r4 = r7.getValue()
                r11 = r4
                com.garmin.android.apps.connectmobile.g3 r11 = (com.garmin.android.apps.connectmobile.g3) r11
                hl.a r11 = r6.f79188f
                boolean r8 = r11 instanceof hl.a.c
                if (r8 == 0) goto L75
                r10.f79212a = r7
                r10.f79213b = r6
                r10.f79214c = r5
                r10.f79215d = r4
                r10.f79216e = r1
                r10.f79217f = r3
                java.lang.Object r11 = gv0.d.y4(r6, r5, r10)
                if (r11 != r0) goto L72
                goto L8f
            L72:
                com.garmin.android.apps.connectmobile.g3 r11 = (com.garmin.android.apps.connectmobile.g3) r11
                goto L92
            L75:
                boolean r8 = r11 instanceof hl.a.b
                if (r8 == 0) goto L9b
                hl.a$b r11 = (hl.a.b) r11
                long r8 = r11.f84252b
                r10.f79212a = r7
                r10.f79213b = r6
                r10.f79214c = r5
                r10.f79215d = r4
                r10.f79216e = r1
                r10.f79217f = r2
                java.lang.Object r11 = gv0.d.x4(r6, r8, r5, r10)
                if (r11 != r0) goto L90
            L8f:
                return r0
            L90:
                com.garmin.android.apps.connectmobile.g3 r11 = (com.garmin.android.apps.connectmobile.g3) r11
            L92:
                boolean r11 = r7.b(r4, r11)
                if (r11 == 0) goto L52
                kotlin.Unit r11 = p005kotlin.Unit.INSTANCE
                return r11
            L9b:
                lc.u0.r()
                goto L20
            */
            throw new UnsupportedOperationException("Method not decompiled: gv0.d.C1596d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lpu0/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$connections$1", f = "LiveTrackSettingsViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<r53.j<? super g3<? extends List<? extends pu0.a>>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79220a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g3<? extends List<? extends pu0.a>>> jVar, t13.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            g3 g3VarA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79220a;
            if (i14 == 0) {
                o13.r.b(obj);
                su0.h hVar = su0.h.f160962a;
                this.f79220a = 1;
                obj = hVar.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            List list = (List) obj;
            p2 p2Var = d.this.Z;
            do {
                value = p2Var.getValue();
                if (list != null) {
                    g3.f35298f.getClass();
                    g3VarA = g3.a.d(list);
                } else {
                    g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                }
            } while (!p2Var.b(value, g3VarA));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$fetchLiveTrackPlusData$1", f = "LiveTrackSettingsViewModel.kt", l = {280, 280}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79222a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou0/d;", "data", "", "<anonymous>", "(Lou0/d;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$fetchLiveTrackPlusData$1$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<ou0.d, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f79224a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f79225b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f79225b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f79225b, dVar);
                aVar.f79224a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(ou0.d dVar, t13.d<? super Unit> dVar2) {
                return ((a) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                ou0.d dVar = (ou0.d) this.f79224a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                p2 p2Var = this.f79225b.T;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, dVar));
                return Unit.INSTANCE;
            }
        }

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r53.s.k((r53.i) r6, r1, r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79222a;
            d dVar = d.this;
            if (i14 == 0) {
                o13.r.b(obj);
                uu0.h hVar = dVar.f79186d;
                this.f79222a = 1;
                obj = hVar.b(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            a aVar2 = new a(dVar, null);
            this.f79222a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$inviteToMessenger$1", f = "LiveTrackSettingsViewModel.kt", l = {501}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f79227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j8, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f79227b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f79227b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79226a;
            if (i14 == 0) {
                o13.r.b(obj);
                su0.t tVar = su0.t.f161004a;
                this.f79226a = 1;
                tVar.getClass();
                if (su0.t.f161005b.a(this.f79227b, "LIVETRACK", this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lou0/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$liveTrackPlusData$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<r53.j<? super ou0.d>, t13.d<? super Unit>, Object> {
        public h(t13.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new h(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super ou0.d> jVar, t13.d<? super Unit> dVar) {
            return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            d.this.F4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lou0/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$liveTrackSharingOptionsState$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<r53.j<? super g3<? extends ou0.f>>, t13.d<? super Unit>, Object> {
        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new i(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g3<? extends ou0.f>> jVar, t13.d<? super Unit> dVar) {
            return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = d.O0;
            d dVar = d.this;
            dVar.getClass();
            ge1.b.T(v1.a(dVar), null, null, new gv0.l(dVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lou0/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$ltCapableDevices$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<r53.j<? super List<? extends ou0.c>>, t13.d<? super Unit>, Object> {
        public j(t13.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new j(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super List<? extends ou0.c>> jVar, t13.d<? super Unit> dVar) {
            return ((j) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = d.O0;
            d dVar = d.this;
            dVar.getClass();
            ge1.b.T(v1.a(dVar), null, null, new gv0.g(dVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "Lpu0/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$recipients$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<r53.j<? super g3<? extends List<? extends pu0.b>>>, t13.d<? super Unit>, Object> {
        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new k(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g3<? extends List<? extends pu0.b>>> jVar, t13.d<? super Unit> dVar) {
            return ((k) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            d.this.G4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "", "Lpu0/b;", "recipients", "Lou0/d;", "liveTrackPlusData", "", "selfHasMessenger", "isMessengerSmsStatusForSelfSupported", "Lqu0/e;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;Lou0/d;ZZ)Lcom/garmin/android/apps/connectmobile/g3;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$recipientsGrouped$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.s<g3<? extends List<? extends pu0.b>>, ou0.d, Boolean, Boolean, t13.d<? super g3<? extends List<? extends qu0.e>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ g3 f79232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ou0.d f79233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f79234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ boolean f79235d;

        public l(t13.d<? super l> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(g3<? extends List<? extends pu0.b>> g3Var, ou0.d dVar, Boolean bool, Boolean bool2, t13.d<? super g3<? extends List<? extends qu0.e>>> dVar2) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            l lVar = d.this.new l(dVar2);
            lVar.f79232a = g3Var;
            lVar.f79233b = dVar;
            lVar.f79234c = zBooleanValue;
            lVar.f79235d = zBooleanValue2;
            return lVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fw.p pVar;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i14;
            boolean z14;
            g3 g3Var = this.f79232a;
            ou0.d dVar = this.f79233b;
            boolean z15 = this.f79234c;
            boolean z16 = this.f79235d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Boolean bool = dVar != null ? dVar.f133974a : null;
            boolean z17 = z15 || z16;
            boolean z18 = dVar != null && dVar.a();
            int i15 = d.O0;
            d dVar2 = d.this;
            dVar2.getClass();
            fw.p pVar2 = g3Var.f35300a;
            Iterable<pu0.b> iterable = (List) g3Var.f35301b;
            if (iterable == null) {
                iterable = p13.j0.f134944a;
            }
            ArrayList<pu0.b> arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            for (pu0.b bVar : iterable) {
                bVar.getClass();
                if (g22.n.d(og.a.B(bVar))) {
                    qu0.c cVarE = og.a.E(bVar);
                    if ((cVarE != null ? cVarE.f147881b : null) == qu0.b.f147875g) {
                        arrayList5.add(bVar);
                    } else {
                        arrayList4.add(bVar);
                    }
                    z14 = z18;
                } else if (!g22.n.d(og.a.K(bVar))) {
                    z14 = z18;
                    if (g22.n.d(og.a.I(bVar))) {
                        if (z17) {
                            pu0.h hVar = (pu0.h) p13.h0.d0(bVar.f141192j);
                            pu0.h.a aVar2 = hVar != null ? hVar.f141249m : null;
                            int i16 = aVar2 == null ? -1 : c.f79211a[aVar2.ordinal()];
                            if (i16 == 1) {
                                arrayList4.add(bVar);
                            } else if (i16 == 2) {
                                arrayList8.add(bVar);
                            } else if (i16 == 3) {
                                arrayList6.add(bVar);
                            }
                        } else {
                            arrayList8.add(bVar);
                        }
                    }
                } else if (!p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE) || z18) {
                    z14 = z18;
                    arrayList7.add(bVar);
                } else {
                    qu0.c cVarF = og.a.F(bVar);
                    qu0.b bVar2 = cVarF != null ? cVarF.f147881b : null;
                    pu0.j jVarG = og.a.G(bVar);
                    z14 = z18;
                    if (bVar2 == qu0.b.f147875g) {
                        arrayList5.add(bVar);
                    } else if (jVarG == pu0.j.f141278e) {
                        arrayList4.add(bVar);
                    } else if (jVarG == pu0.j.f141279f || jVarG == pu0.j.f141281h || jVarG == pu0.j.f141280g) {
                        arrayList5.add(bVar);
                    } else {
                        arrayList6.add(bVar);
                    }
                }
                z18 = z14;
            }
            boolean z19 = p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE) && !z18;
            b2 b2Var = dVar2.f79206y;
            l22.b bVar3 = dVar2.f79187e;
            yu0.d dVar3 = dVar2.f79185c;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList4.isEmpty()) {
                pVar = pVar2;
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            } else {
                String string = dVar3.f199699b.getString(R.string.confirmed);
                q13.b bVarB = p13.w.b();
                fw.p pVar3 = pVar2;
                ArrayList arrayList10 = new ArrayList(p13.y.r(arrayList4, 10));
                for (pu0.b bVar4 : arrayList4) {
                    arrayList10.add(dVar2.e5(bVar4, z19, dVar2.f79185c, g22.n.d(og.a.I(bVar4)), false, new av0.e(dVar2, bVar4, 3)));
                    pVar3 = pVar3;
                    arrayList5 = arrayList5;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                }
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
                pVar = pVar3;
                bVarB.addAll(arrayList10);
                Unit unit = Unit.INSTANCE;
                arrayList9.add(new qu0.e(string, p13.w.a(bVarB), null, null, null, 28, null));
            }
            if (!arrayList2.isEmpty()) {
                qu0.b bVar5 = qu0.b.f147873e;
                String string2 = dVar3.f199699b.getString(R.string.unconfirmed);
                q13.b bVarB2 = p13.w.b();
                ArrayList<pu0.b> arrayList11 = arrayList2;
                ArrayList arrayList12 = new ArrayList(p13.y.r(arrayList11, 10));
                for (pu0.b bVar6 : arrayList11) {
                    arrayList12.add(dVar2.e5(bVar6, z19, dVar2.f79185c, g22.n.d(og.a.I(bVar6)), false, new av0.e(bVar6, dVar2, 4)));
                }
                bVarB2.addAll(arrayList12);
                Unit unit2 = Unit.INSTANCE;
                q13.b bVarA = p13.w.a(bVarB2);
                Integer num = bVar5.f147879b;
                arrayList9.add(new qu0.e(string2, bVarA, num != null ? bVar3.getString(num.intValue()) : null, null, null, 24, null));
            }
            if (!arrayList.isEmpty()) {
                qu0.b bVar7 = qu0.b.f147875g;
                String string3 = dVar3.f199699b.getString(R.string.declined);
                q13.b bVarB3 = p13.w.b();
                ArrayList<pu0.b> arrayList13 = arrayList;
                ArrayList arrayList14 = new ArrayList(p13.y.r(arrayList13, 10));
                for (pu0.b bVar8 : arrayList13) {
                    arrayList14.add(dVar2.e5(bVar8, z19, dVar2.f79185c, g22.n.d(og.a.I(bVar8)), true, new av0.e(bVar8, dVar2, 5)));
                }
                bVarB3.addAll(arrayList14);
                Unit unit3 = Unit.INSTANCE;
                q13.b bVarA2 = p13.w.a(bVarB3);
                Integer num2 = bVar7.f147879b;
                arrayList9.add(new qu0.e(string3, bVarA2, num2 != null ? bVar3.getString(num2.intValue()) : null, null, null, 24, null));
            }
            if (arrayList3.isEmpty()) {
                i14 = 0;
            } else {
                String string4 = dVar3.f199699b.getString(R.string.livetrack_text_messaging_unavailable);
                ArrayList arrayList15 = arrayList3;
                ArrayList arrayList16 = new ArrayList(p13.y.r(arrayList15, 10));
                int i17 = 0;
                for (Object obj2 : arrayList15) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    pu0.b bVar9 = (pu0.b) obj2;
                    arrayList16.add(dVar2.e5(bVar9, z19, dVar2.f79185c, false, false, new av0.e(dVar2, bVar9, 6)));
                    i17 = i18;
                }
                i14 = 0;
                arrayList9.add(new qu0.e(string4, arrayList16, dVar3.b(false, false), dVar3.f199699b.getString(R.string.learn_more_garmin_connect_plus), qu0.f.SubscribeToGcPlus));
            }
            if (!arrayList8.isEmpty()) {
                String string5 = dVar3.f199699b.getString(R.string.lbl_garmin_messenger_unavailable);
                ArrayList arrayList17 = new ArrayList(p13.y.r(arrayList8, 10));
                int i19 = i14;
                for (Object obj3 : arrayList8) {
                    int i24 = i19 + 1;
                    if (i19 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    pu0.b bVar10 = (pu0.b) obj3;
                    arrayList17.add(dVar2.e5(bVar10, z19, dVar2.f79185c, true, true, new av0.e(dVar2, bVar10, 7)));
                    i19 = i24;
                }
                arrayList9.add(new qu0.e(string5, arrayList17, dVar3.b(true, ((Boolean) b2Var.f150540a.getValue()).booleanValue()), ((Boolean) b2Var.f150540a.getValue()).booleanValue() ? null : dVar3.f199699b.getString(R.string.lbl_garmin_messenger_app_name), qu0.f.LaunchInReachPromo));
            }
            return new g3(pVar, arrayList9, g3Var.f35302c, g3Var.f35303d, g3Var.f35304e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$refreshStravaBeaconStatus$2", f = "LiveTrackSettingsViewModel.kt", l = {670, 671}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f79237a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$refreshStravaBeaconStatus$2$1$1", f = "LiveTrackSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f79239a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g2 f79240b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, g2 g2Var, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f79239a = dVar;
                this.f79240b = g2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f79239a, this.f79240b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                int i14 = d.O0;
                d dVar = this.f79239a;
                dVar.S4();
                dVar.Y4(new g12.f(this.f79240b, 21));
                p2 p2Var = dVar.f79203v;
                ou0.f fVar = (ou0.f) ((g3) p2Var.getValue()).f35301b;
                ou0.f fVarA = ou0.f.a(fVar == null ? new ou0.f(null, null, null, null, null, null, 63, null) : fVar, null, null, this.f79240b, null, null, 59);
                do {
                    value = p2Var.getValue();
                    g3.f35298f.getClass();
                } while (!p2Var.b(value, g3.a.d(fVarA)));
                return Unit.INSTANCE;
            }
        }

        public m(t13.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new m(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (ge1.b.e0(r1, r5, r6) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f79237a;
            d dVar = d.this;
            if (i14 == 0) {
                o13.r.b(obj);
                c6 c6VarD = dVar.f79184b.d();
                this.f79237a = 1;
                obj = c6VarD.a(false, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            x53.c cVar = o53.s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(dVar, (g2) obj, null);
            this.f79237a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$updateGroupTrackConnections$2", f = "LiveTrackSettingsViewModel.kt", l = {717, 720, 722}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f79241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z1 f79242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f79243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g3.a f79244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f79245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f79246f;

        public n(t13.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new n(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005a  */
        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0093 -> B:26:0x0096). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r14.f79246f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L35
                if (r1 == r4) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1c
                int r1 = r14.f79245e
                boolean r4 = r14.f79241a
                java.lang.Object r5 = r14.f79243c
                r53.z1 r6 = r14.f79242b
                o13.r.b(r15)
                goto L96
            L1c:
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r15)
                r15 = 0
                return r15
            L23:
                int r1 = r14.f79245e
                boolean r4 = r14.f79241a
                com.garmin.android.apps.connectmobile.g3$a r5 = r14.f79244d
                java.lang.Object r6 = r14.f79243c
                r53.z1 r7 = r14.f79242b
                o13.r.b(r15)
                goto L76
            L31:
                o13.r.b(r15)
                goto L43
            L35:
                o13.r.b(r15)
                su0.h r15 = su0.h.f160962a
                r14.f79246f = r4
                java.lang.Object r15 = r15.e(r14)
                if (r15 != r0) goto L43
                goto L95
            L43:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                gv0.d r1 = gv0.d.this
                r53.p2 r1 = r1.Z
                r4 = 0
                r6 = r1
                r1 = r4
                r4 = r15
            L51:
                java.lang.Object r5 = r6.getValue()
                r15 = r5
                com.garmin.android.apps.connectmobile.g3 r15 = (com.garmin.android.apps.connectmobile.g3) r15
                if (r4 == 0) goto L80
                com.garmin.android.apps.connectmobile.g3$a r15 = com.garmin.android.apps.connectmobile.g3.f35298f
                su0.h r7 = su0.h.f160962a
                r14.f79242b = r6
                r14.f79243c = r5
                r14.f79244d = r15
                r14.f79241a = r4
                r14.f79245e = r1
                r14.f79246f = r3
                java.lang.Object r7 = r7.b(r14)
                if (r7 != r0) goto L71
                goto L95
            L71:
                r13 = r5
                r5 = r15
                r15 = r7
                r7 = r6
                r6 = r13
            L76:
                r5.getClass()
                com.garmin.android.apps.connectmobile.g3 r15 = com.garmin.android.apps.connectmobile.g3.a.d(r15)
                r5 = r6
                r6 = r7
                goto La4
            L80:
                su0.h r15 = su0.h.f160962a
                r14.f79242b = r6
                r14.f79243c = r5
                r7 = 0
                r14.f79244d = r7
                r14.f79241a = r4
                r14.f79245e = r1
                r14.f79246f = r2
                java.lang.Object r15 = r15.a(r14)
                if (r15 != r0) goto L96
            L95:
                return r0
            L96:
                r10 = r15
                java.util.List r10 = (java.util.List) r10
                com.garmin.android.apps.connectmobile.g3$a r7 = com.garmin.android.apps.connectmobile.g3.f35298f
                r11 = 0
                r12 = 11
                r8 = 0
                r9 = 0
                com.garmin.android.apps.connectmobile.g3 r15 = com.garmin.android.apps.connectmobile.g3.a.a(r7, r8, r9, r10, r11, r12)
            La4:
                boolean r15 = r6.b(r5, r15)
                if (r15 == 0) goto L51
                kotlin.Unit r15 = p005kotlin.Unit.INSTANCE
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: gv0.d.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new b(null);
    }

    public d(uu0.a aVar, yu0.d dVar, uu0.h hVar, az0.c cVar, l22.b bVar, hl.a aVar2, su0.b0 b0Var) {
        aVar.getClass();
        dVar.getClass();
        hVar.getClass();
        cVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        b0Var.getClass();
        this.f79183a = b0Var;
        this.f79184b = aVar;
        this.f79185c = dVar;
        this.f79186d = hVar;
        this.f79187e = bVar;
        this.f79188f = aVar2;
        p2 p2VarA = q2.a(null);
        this.f79189g = p2VarA;
        this.f79190h = p2VarA;
        p2 p2VarA2 = q2.a(g3.a.c(g3.f35298f));
        this.f79191i = p2VarA2;
        this.f79192j = p2VarA2;
        p2 p2VarA3 = q2.a(g3.a.b(null));
        this.f79193k = p2VarA3;
        this.f79195l = p2VarA3;
        p2 p2VarA4 = q2.a(g3.a.d(null));
        this.f79196m = p2VarA4;
        this.f79197n = p2VarA4;
        p2 p2VarA5 = q2.a(g3.a.b(null));
        this.f79198o = p2VarA5;
        this.f79199p = p2VarA5;
        Boolean bool = Boolean.FALSE;
        p2 p2VarA6 = q2.a(g3.a.d(bool));
        this.f79200q = p2VarA6;
        this.f79201r = r53.s.d(p2VarA6);
        this.f79202t = q2.a(null);
        p2 p2VarA7 = q2.a(g3.a.b(null));
        this.f79203v = p2VarA7;
        r53.v vVar = new r53.v(new i(null), p2VarA7);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        l2 l2Var = k2.a.f150705b;
        this.f79204w = r53.s.K(vVar, aVarA, l2Var, g3.a.b(null));
        p2 p2VarA8 = q2.a(bool);
        this.f79205x = p2VarA8;
        b2 b2VarD = r53.s.d(p2VarA8);
        this.f79206y = b2VarD;
        p2 p2VarA9 = q2.a(bool);
        this.f79207z = p2VarA9;
        b2 b2VarD2 = r53.s.d(p2VarA9);
        p2 p2VarA10 = q2.a(null);
        this.A = p2VarA10;
        this.B = r53.s.d(p2VarA10);
        p2 p2VarA11 = q2.a(bool);
        this.F = p2VarA11;
        this.I = r53.s.d(p2VarA11);
        p2 p2VarA12 = q2.a(null);
        this.T = p2VarA12;
        b2 b2VarK = r53.s.K(new r53.v(new h(null), p2VarA12), v1.a(this), l2Var, null);
        this.X = b2VarK;
        p2 p2VarA13 = q2.a(g3.a.b(null));
        this.Z = p2VarA13;
        this.f79194k0 = r53.s.K(new r53.v(new e(null), p2VarA13), v1.a(this), l2Var, g3.a.b(null));
        p2 p2VarA14 = q2.a(g3.a.b(null));
        this.H0 = p2VarA14;
        b2 b2VarK2 = r53.s.K(new r53.v(new k(null), p2VarA14), v1.a(this), l2Var, g3.a.b(null));
        this.I0 = b2VarK2;
        this.J0 = s3.b();
        this.K0 = r53.s.K(r53.s.m(b2VarK2, b2VarK, b2VarD, b2VarD2, new l(null)), v1.a(this), l2Var, g3.a.d(null));
        p2 p2VarA15 = q2.a(aVar.j().h());
        this.L0 = p2VarA15;
        this.M0 = r53.s.K(new r53.v(new j(null), p2VarA15), v1.a(this), l2Var, aVar.j().h());
        this.N0 = r53.s.K(cVar.a(), v1.a(this), l2Var, az0.c.a.Available);
        ge1.b.T(v1.a(this), null, null, new r(this, null), 3);
        if (aVar2.equals(hl.a.c.f84256b)) {
            ge1.b.T(v1.a(this), null, null, new a(null), 3);
        }
    }

    public static pu0.b H4(List list, pu0.b bVar) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            pu0.b bVar2 = (pu0.b) next;
            if ((og.a.B(bVar).length() > 0 && og.a.B(bVar2).equals(og.a.B(bVar))) || ((og.a.K(bVar).length() > 0 && og.a.K(bVar2).equals(og.a.K(bVar))) || (og.a.I(bVar).length() > 0 && og.a.I(bVar2).equals(og.a.I(bVar))))) {
                return (pu0.b) next;
            }
        }
        next = null;
        return (pu0.b) next;
    }

    public static void T4(d dVar, pu0.b bVar, pu0.b bVar2, pu0.b bVar3, int i14) {
        pu0.b bVar4 = (i14 & 2) != 0 ? null : bVar2;
        boolean z14 = (i14 & 4) == 0;
        pu0.b bVar5 = (i14 & 8) != 0 ? bVar : bVar3;
        dVar.getClass();
        bVar.getClass();
        bVar5.getClass();
        ge1.b.T(v1.a(dVar), null, null, new s(bVar, dVar, bVar5, bVar4, z14, null), 3);
    }

    public static void V4(d dVar, pu0.b bVar) {
        Object value;
        dVar.getClass();
        bVar.getClass();
        p2 p2Var = dVar.H0;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, g3.a.c(g3.f35298f)));
        ge1.b.T(v1.a(dVar), null, null, new t(false, dVar, bVar, null), 3);
    }

    public static boolean W4(pu0.b bVar) {
        bVar.getClass();
        boolean zIsEmpty = bVar.f141191i.isEmpty();
        qu0.c cVarF = og.a.F(bVar);
        return (zIsEmpty || ((cVarF != null ? cVarF.f147881b : null) == qu0.b.f147874f) || (og.a.G(bVar) == pu0.j.f141278e)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(d dVar, long j8, pu0.b bVar, v13.c cVar) {
        gv0.e eVar;
        dVar.getClass();
        if (cVar instanceof gv0.e) {
            eVar = (gv0.e) cVar;
            int i14 = eVar.f79256d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f79256d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new gv0.e(dVar, cVar);
            }
        } else {
            eVar = new gv0.e(dVar, cVar);
        }
        Object objF = eVar.f79254b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f79256d;
        if (i15 == 0) {
            o13.r.b(objF);
            kd0.m0 m0VarI = dVar.f79184b.i();
            eVar.f79253a = bVar;
            eVar.f79256d = 1;
            objF = m0VarI.f(j8, bVar, eVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = eVar.f79253a;
            o13.r.b(objF);
        }
        if (!((Boolean) objF).booleanValue()) {
            return g3.a.a(g3.f35298f, null, null, null, null, 15);
        }
        g3.f35298f.getClass();
        return g3.a.d(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r8 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y4(d dVar, pu0.b bVar, v13.c cVar) {
        gv0.f fVar;
        Object value;
        pu0.b bVarH4;
        dVar.getClass();
        if (cVar instanceof gv0.f) {
            fVar = (gv0.f) cVar;
            int i14 = fVar.f79264d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f79264d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new gv0.f(dVar, cVar);
            }
        } else {
            fVar = new gv0.f(dVar, cVar);
        }
        Object objA = fVar.f79262b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f79264d;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                su0.t tVar = su0.t.f161004a;
                fVar.f79261a = bVar;
                fVar.f79264d = 1;
                objA = tVar.a(bVar, fVar);
                if (objA == aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                bVar = fVar.f79261a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = fVar.f79261a;
                o13.r.b(objA);
            }
            List list = (List) objA;
            p2 p2Var = dVar.H0;
            do {
                value = p2Var.getValue();
                g3.f35298f.getClass();
            } while (!p2Var.b(value, g3.a.d(list)));
            if (list != null && (bVarH4 = H4(list, bVar)) != null) {
                bVar = bVarH4;
            }
            return g3.a.d(bVar);
            if (!((Boolean) objA).booleanValue()) {
                return g3.a.a(g3.f35298f, null, null, null, null, 15);
            }
            dVar.f79184b.h().getClass();
            yr1.e.c("LivetrackContacts", SupportedCapability.CONTACTS_SUPPORT);
            su0.t tVar2 = su0.t.f161004a;
            fVar.f79261a = bVar;
            fVar.f79264d = 2;
            objA = tVar2.f(true, fVar);
        } catch (AddContactException e4) {
            return g3.a.a(g3.f35298f, null, e4, null, null, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object z4(d dVar, v13.c cVar) throws Throwable {
        o oVar;
        Object value;
        p2 p2Var = dVar.f79203v;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f79348c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f79348c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar, cVar);
            }
        } else {
            oVar = new o(dVar, cVar);
        }
        Object objE0 = oVar.f79346a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f79348c;
        if (i15 == 0) {
            o13.r.b(objE0);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, g3.a.c(g3.f35298f)));
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            p pVar = new p(dVar, null);
            oVar.f79348c = 1;
            objE0 = ge1.b.e0(bVar, pVar, oVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        g2 g2Var = (g2) objE0;
        while (true) {
            Object value2 = p2Var.getValue();
            ou0.f fVar = (ou0.f) ((g3) value2).f35301b;
            ou0.f fVarA = fVar != null ? ou0.f.a(fVar, null, null, g2Var, null, null, 59) : new ou0.f(null, null, g2Var, null, null, null, 59, null);
            g2 g2Var2 = g2Var;
            g3.f35298f.getClass();
            if (p2Var.b(value2, g3.a.d(fVarA))) {
                return Unit.INSTANCE;
            }
            g2Var = g2Var2;
        }
    }

    public final void A4(pu0.b bVar) {
        bVar.getClass();
        ge1.b.T(v1.a(this), null, null, new C1596d(bVar, null), 3);
    }

    public final void B4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f79196m;
            value = p2Var.getValue();
            g3.f35298f.getClass();
        } while (!p2Var.b(value, g3.a.d(null)));
    }

    public final void C4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.A;
            value = p2Var.getValue();
        } while (!p2Var.b(value, null));
    }

    public final int D4() {
        List list = (List) ((g3) this.H0.getValue()).f35301b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r8.c(r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r8.c(r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E4(String str, boolean z14, v13.c cVar) {
        gv0.i iVar;
        if (cVar instanceof gv0.i) {
            iVar = (gv0.i) cVar;
            int i14 = iVar.f79285d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f79285d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new gv0.i(this, cVar);
            }
        } else {
            iVar = new gv0.i(this, cVar);
        }
        Object obj = iVar.f79283b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f79285d;
        if (i15 != 0) {
            if (i15 == 1) {
                str = iVar.f79282a;
                o13.r.b(obj);
                su0.t.f161004a.getClass();
                return su0.t.e(str);
            }
            if (i15 == 2) {
                str = iVar.f79282a;
                o13.r.b(obj);
                su0.t.f161004a.getClass();
                return su0.t.e(str);
            }
            if (i15 == 3) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        hl.a.c cVar2 = hl.a.c.f84256b;
        hl.a aVar2 = this.f79188f;
        if (p005kotlin.jvm.internal.s.g(aVar2, cVar2)) {
            if (z14) {
                su0.t tVar = su0.t.f161004a;
                iVar.f79282a = str;
                iVar.f79285d = 1;
            } else {
                su0.t tVar2 = su0.t.f161004a;
                tVar2.getClass();
                pu0.b bVarE = su0.t.e(str);
                if (bVarE != null) {
                    return bVarE;
                }
                iVar.f79282a = str;
                iVar.f79285d = 2;
            }
        } else {
            if (!(aVar2 instanceof hl.a.b)) {
                lc.u0.r();
                return null;
            }
            kd0.m0 m0VarI = this.f79184b.i();
            long j8 = ((hl.a.b) aVar2).f84252b;
            iVar.f79282a = null;
            iVar.f79285d = 3;
            Comparable comparableH = m0VarI.h(j8, str, iVar);
            if (comparableH != aVar) {
                return comparableH;
            }
        }
        return aVar;
    }

    public final void F4() {
        ge1.b.T(v1.a(this), null, null, new f(null), 3);
    }

    public final void G4() {
        ge1.b.T(v1.a(this), null, null, new gv0.j(this, true, null), 3);
    }

    public final String I4() {
        wd2.k kVar;
        ou0.d dVar = (ou0.d) this.X.f150540a.getValue();
        if (dVar == null || (kVar = dVar.f133977d) == null || kVar.f184515a == null) {
            return null;
        }
        String str = kVar.f184516b;
        this.f79185c.getClass();
        if (str == null) {
            str = "";
        }
        return str.concat("/settings/delete-profile");
    }

    public final boolean J4(pu0.b bVar, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17;
        List<pu0.i> list;
        bVar.getClass();
        String str = bVar.f141183a;
        if (str != null) {
            hl.a.c cVar = hl.a.c.f84256b;
            hl.a aVar = this.f79188f;
            if (p005kotlin.jvm.internal.s.g(aVar, cVar)) {
                su0.t.f161004a.getClass();
                pu0.b bVarE = su0.t.e(str);
                if (bVarE != null) {
                    List<pu0.f> list2 = bVarE.f141186d;
                    if (list2 != null && list2.isEmpty()) {
                        z15 = false;
                        break;
                    }
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z15 = false;
                            break;
                        }
                        if (!p005kotlin.jvm.internal.s.g(((pu0.f) it.next()).f141222c, pu0.g.a.f141234a)) {
                            z15 = true;
                            break;
                        }
                    }
                    if (!z14 || ((list = bVarE.f141191i) != null && list.isEmpty())) {
                        z16 = false;
                        break;
                    }
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z16 = false;
                            break;
                        }
                        if (!p005kotlin.jvm.internal.s.g(((pu0.i) it3.next()).f141262c, pu0.g.a.f141234a)) {
                            z16 = true;
                            break;
                        }
                    }
                    List<pu0.h> list3 = bVarE.f141192j;
                    if (list3 != null && list3.isEmpty()) {
                        z17 = false;
                        break;
                    }
                    Iterator<T> it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (!p005kotlin.jvm.internal.s.g(((pu0.h) it4.next()).f141239c, pu0.g.a.f141234a)) {
                                if (lv0.c.b(bVarE, ((Boolean) this.f79205x.getValue()).booleanValue()) != y.Receiver) {
                                    z17 = true;
                                    break;
                                }
                            }
                        }
                        z17 = false;
                        break;
                    }
                    if (z15 || z16 || z17) {
                        return true;
                    }
                }
            } else {
                if (!(aVar instanceof hl.a.b)) {
                    lc.u0.r();
                    return false;
                }
                List<pu0.f> list4 = bVar.f141197o;
                if (list4 == null || !list4.isEmpty()) {
                    for (pu0.f fVar : list4) {
                        if (!p005kotlin.jvm.internal.s.g(fVar.f141222c, pu0.g.a.f141234a) && !fVar.equals(p13.h0.d0(bVar.f141186d))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean K4() {
        b2 b2Var = this.X;
        ou0.d dVar = (ou0.d) b2Var.f150540a.getValue();
        if ((dVar != null ? dVar.f133974a : null) != null) {
            ou0.d dVar2 = (ou0.d) b2Var.f150540a.getValue();
            if (dVar2 != null ? p005kotlin.jvm.internal.s.g(dVar2.f133974a, Boolean.TRUE) : false) {
                return true;
            }
        }
        return false;
    }

    public final void L4(long j8) {
        ge1.b.T(v1.a(this), null, null, new g(j8, null), 3);
    }

    public final boolean M4() {
        ou0.d dVar = (ou0.d) this.X.f150540a.getValue();
        return (dVar != null ? dVar.f133975b : null) instanceof c80.p.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N4(boolean z14) {
        p2 p2Var;
        Object value;
        g3 g3Var;
        ou0.f fVar;
        do {
            p2Var = this.f79203v;
            value = p2Var.getValue();
            g3Var = (g3) value;
            fVar = (ou0.f) g3Var.f35301b;
        } while (!p2Var.b(value, g3.a(g3Var, fVar != null ? ou0.f.a(fVar, Boolean.valueOf(z14), null, null, null, null, 62) : null)));
        S4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O4(boolean z14) {
        p2 p2Var;
        Object value;
        g3 g3Var;
        ou0.f fVar;
        do {
            p2Var = this.f79203v;
            value = p2Var.getValue();
            g3Var = (g3) value;
            fVar = (ou0.f) g3Var.f35301b;
        } while (!p2Var.b(value, g3.a(g3Var, fVar != null ? ou0.f.a(fVar, null, null, null, Boolean.valueOf(z14), null, 55) : null)));
        S4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P4(ou0.b bVar) {
        ou0.b bVar2;
        ou0.f fVarA;
        bVar.getClass();
        while (true) {
            p2 p2Var = this.f79203v;
            Object value = p2Var.getValue();
            g3 g3Var = (g3) value;
            ou0.f fVar = (ou0.f) g3Var.f35301b;
            if (fVar != null) {
                bVar2 = bVar;
                fVarA = ou0.f.a(fVar, null, bVar2, null, null, null, 61);
            } else {
                bVar2 = bVar;
                fVarA = null;
            }
            if (p2Var.b(value, g3.a(g3Var, fVarA))) {
                S4();
                return;
            }
            bVar = bVar2;
        }
    }

    public final void Q4(o13.p<? extends ge2.c, ? extends ge2.b>... pVarArr) {
        Y4(new gv0.c(pVarArr, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R4() {
        ou0.f fVar = (ou0.f) ((g3) this.f79203v.getValue()).f35301b;
        if (fVar != null ? p005kotlin.jvm.internal.s.g(fVar.f133983a, Boolean.TRUE) : false) {
            su0.t.f161004a.getClass();
            if (su0.t.i()) {
                return;
            }
            N4(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void S4() {
        Object value;
        T t7;
        boolean z14;
        Object value2;
        Boolean bool = this.Y;
        Boolean bool2 = Boolean.TRUE;
        boolean zG = p005kotlin.jvm.internal.s.g(bool, bool2);
        p2 p2Var = this.f79203v;
        if (!zG) {
            do {
                value = p2Var.getValue();
                g3.a aVar = g3.f35298f;
                t7 = ((g3) p2Var.getValue()).f35301b;
                aVar.getClass();
            } while (!p2Var.b(value, g3.a.d(t7)));
            return;
        }
        LinkedHashMap linkedHashMap = null;
        g2 g2Var = (g2) ge1.b.W(t13.h.f161748a, new x(this, null));
        ou0.f fVar = (ou0.f) ((g3) p2Var.getValue()).f35301b;
        if (fVar != null) {
            if ((g2Var instanceof g2.b) || p005kotlin.jvm.internal.s.g(fVar.f133983a, bool2)) {
                z14 = true;
            } else {
                ou0.b bVar = fVar.f133984b;
                if ((bVar instanceof ou0.b.a) || (bVar instanceof ou0.b.C2540b)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            Map<Long, ge2.a> map = fVar.f133987e;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(p13.t0.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ge2.a.a((ge2.a) entry.getValue(), !z14 ? Boolean.FALSE : ((ge2.a) entry.getValue()).f77007a, null, null, null, 14));
                }
            }
            ou0.f fVarA = ou0.f.a(fVar, null, null, null, null, linkedHashMap, 47);
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, g3.a((g3) value2, fVarA)));
        }
        Z4();
    }

    public final void U4() {
        p2 p2Var;
        Object value;
        T t7;
        do {
            p2Var = this.f79203v;
            value = p2Var.getValue();
            g3.a aVar = g3.f35298f;
            t7 = ((g3) value).f35301b;
            aVar.getClass();
        } while (!p2Var.b(value, g3.a.b(t7)));
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new m(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X4(bv0.a aVar, v13.c cVar) {
        v vVar;
        ge2.e eVar;
        ou0.f fVarA;
        int i14;
        Object objW;
        ou0.f fVar;
        bv0.a aVar2;
        int i15;
        Collection collection;
        boolean z14;
        boolean z15;
        Boolean boolValueOf;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i16 = vVar.f79406f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                vVar.f79406f = i16 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objP = vVar.f79404d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = vVar.f79406f;
        hl.a aVar4 = this.f79188f;
        boolean z16 = false;
        if (i17 == 0) {
            o13.r.b(objP);
            if (p005kotlin.jvm.internal.s.g(aVar4, hl.a.c.f84256b)) {
                uu0.a aVar5 = this.f79184b;
                ArrayList arrayListH = aVar5.j().h();
                if (arrayListH == null || arrayListH.isEmpty()) {
                    wd2.m.g(aVar5.f().f(), null);
                    wd2.m.f(aVar5.f().f(), null);
                    return bv0.a.h.INSTANCE;
                }
            }
            vVar.f79401a = aVar;
            vVar.f79406f = 1;
            o53.k kVar = new o53.k(u13.f.b(vVar), 1);
            kVar.q();
            Y4(new gv0.k(kVar));
            objP = kVar.p();
            if (objP != aVar3) {
            }
            return aVar3;
        }
        if (i17 == 1) {
            aVar = vVar.f79401a;
            o13.r.b(objP);
        } else {
            if (i17 == 2) {
                aVar = vVar.f79401a;
                o13.r.b(objP);
                eVar = (ge2.e) objP;
                if (eVar == null) {
                    return bv0.a.g.INSTANCE;
                }
                fVarA = ou0.a.a(eVar);
                if (fVarA.f133983a != null || fVarA.f133984b == null) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                w wVar = new w(null);
                vVar.f79401a = aVar;
                vVar.f79402b = fVarA;
                vVar.f79403c = i14;
                vVar.f79406f = 3;
                objW = r53.s.w(this.H0, wVar, vVar);
                if (objW != aVar3) {
                    fVar = fVarA;
                    objP = objW;
                    aVar2 = aVar;
                    i15 = i14;
                }
                return aVar3;
            }
            if (i17 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = vVar.f79403c;
            fVar = vVar.f79402b;
            aVar2 = vVar.f79401a;
            o13.r.b(objP);
        }
        collection = (Collection) ((g3) objP).f35301b;
        if (collection != null || collection.isEmpty()) {
            z14 = true;
        } else {
            z14 = false;
        }
        z15 = this.J0;
        if ((!z15 && !z14) || (!z15 && i15 != 0 && fVar.f133986d != null)) {
        }
        boolValueOf = Boolean.valueOf(z16);
        this.Y = boolValueOf;
        if (aVar2 == null) {
            return aVar2;
        }
        if (!boolValueOf.equals(Boolean.TRUE) || (aVar4 instanceof hl.a.b)) {
            return bv0.a.p.INSTANCE;
        }
        return s3.b() ? bv0.a.b.INSTANCE : bv0.a.k.INSTANCE;
        vVar.f79401a = aVar;
        vVar.f79406f = 2;
        objP = r53.s.x((r53.i) objP, vVar);
        if (objP != aVar3) {
            eVar = (ge2.e) objP;
            if (eVar == null) {
                return bv0.a.g.INSTANCE;
            }
            fVarA = ou0.a.a(eVar);
            if (fVarA.f133983a != null) {
                i14 = 0;
            } else {
                i14 = 0;
            }
            w wVar2 = new w(null);
            vVar.f79401a = aVar;
            vVar.f79402b = fVarA;
            vVar.f79403c = i14;
            vVar.f79406f = 3;
            objW = r53.s.w(this.H0, wVar2, vVar);
            if (objW != aVar3) {
                fVar = fVarA;
                objP = objW;
                aVar2 = aVar;
                i15 = i14;
                collection = (Collection) ((g3) objP).f35301b;
                if (collection != null) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z15 = this.J0;
                z16 = !z15 ? true : true;
                boolValueOf = Boolean.valueOf(z16);
                this.Y = boolValueOf;
                if (aVar2 == null) {
                    return aVar2;
                }
                if (boolValueOf.equals(Boolean.TRUE)) {
                }
                return bv0.a.p.INSTANCE;
            }
        }
        return aVar3;
    }

    public final void Y4(e23.l<? super m1, Unit> lVar) {
        m1 m1Var = this.P;
        if (m1Var != null) {
            lVar.invoke(m1Var);
        } else {
            wd2.m.c(this.f79184b, new g2.m1(10, this, lVar));
        }
    }

    public final b2 Z4() {
        p2 p2Var;
        Object value;
        T t7;
        do {
            p2Var = this.f79203v;
            value = p2Var.getValue();
            g3.a aVar = g3.f35298f;
            t7 = ((g3) p2Var.getValue()).f35301b;
            aVar.getClass();
        } while (!p2Var.b(value, g3.a.b(t7)));
        Y4(new bv0.n(this, 5));
        return r53.s.d(p2Var);
    }

    public final boolean a5() {
        List list = (List) this.M0.f150540a.getValue();
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (((ou0.c) obj2).f133970g) {
                    obj = obj2;
                    break;
                }
            }
            obj = (ou0.c) obj;
        }
        return obj != null;
    }

    @Override // su0.b0
    public final Object b(t13.d<? super wd2.f0<ge2.e>> dVar) {
        return this.f79183a.b(dVar);
    }

    public final boolean b5() {
        List list = (List) this.M0.f150540a.getValue();
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (((ou0.c) obj2).f133971h) {
                    obj = obj2;
                    break;
                }
            }
            obj = (ou0.c) obj;
        }
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c5() {
        ou0.f fVar = (ou0.f) ((g3) this.f79203v.getValue()).f35301b;
        g2 g2Var = fVar != null ? fVar.f133985c : null;
        return (g2Var == null || g2Var.equals(g2.c.f184482a) || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() || s3.b()) ? false : true;
    }

    public final boolean d5() {
        ou0.d dVar = (ou0.d) this.X.f150540a.getValue();
        return (dVar != null ? dVar.f133974a : null) != null;
    }

    public final qu0.a e5(pu0.b bVar, boolean z14, yu0.d dVar, boolean z15, boolean z16, e23.a<Unit> aVar) {
        return new qu0.a(bVar, dVar.c(bVar, Boolean.valueOf(z14), z15), z15, z16, new bv0.r(this, aVar, 2));
    }

    public final void f5() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.Z;
            value = p2Var.getValue();
        } while (!p2Var.b(value, g3.a.c(g3.f35298f)));
        ge1.b.T(v1.a(this), null, null, new n(null), 3);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        m1 m1Var = this.P;
        if (m1Var != null) {
            m1Var.d(this.f79184b.f().f());
        }
        this.P = null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgv0/d$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ d(uu0.a aVar, yu0.d dVar, uu0.h hVar, az0.c cVar, l22.b bVar, hl.a aVar2, su0.b0 b0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, dVar, hVar, cVar, bVar, (i14 & 32) != 0 ? hl.a.c.f84256b : aVar2, b0Var);
    }
}
