package qr;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.imagemultipicker.ImageTooLargeException;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsListDTO;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.flexbox.FlexItem;
import com.google.android.gms.wallet.WalletConstants;
import f72.ob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import v62.d8;
import v62.e9;
import v62.q7;
import v62.s6;
import v62.w8;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001.B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lqr/t;", "Landroidx/lifecycle/u1;", "Lnr/h;", "activityDetailsStartInfo", "Lkr/e;", "activityConfigRepo", "Lam/m;", "activityRepo", "Lfo1/f;", "conversationRepo", "Lpc0/j;", "devicesRepo", "Ld60/b;", "coursesRepo", "Lru1/d;", "exerciseTranslationsRepo", "La22/i;", "userProfileRepo", "Lou1/d;", "getExerciseListWithTranslationUseCase", "Laq/h3;", "thirdPartyUploaderRepo", "Lzf0/d;", "eventRepo", "Lam/x1;", "diveRepo", "Lvo1/c;", "socialGroupRideRepo", "Lsr/b;", "dataFormatter", "Lam/d;", "activityDelegate", "Lf12/l;", "gcmUserSettings", "Lqr/a;", "appManager", "Lor/b;", "getChosenComponentPackageNameUseCase", "Lmr/q;", "getActivityEpicsUseCase", "Lcom/garmin/android/apps/connectmobile/b1;", "itemAvailability", "Lne0/j;", "getActivityDetailsDogsUseCase", "<init>", "(Lnr/h;Lkr/e;Lam/m;Lfo1/f;Lpc0/j;Ld60/b;Lru1/d;La22/i;Lou1/d;Laq/h3;Lzf0/d;Lam/x1;Lvo1/c;Lsr/b;Lam/d;Lf12/l;Lqr/a;Lor/b;Lmr/q;Lcom/garmin/android/apps/connectmobile/b1;Lne0/j;)V", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends androidx.lifecycle.u1 {
    public static final /* synthetic */ int A2 = 0;
    public am.x0 A;
    public final o13.t A1;
    public final boolean B;
    public final o13.t B1;
    public boolean C;
    public final o13.t C1;
    public final boolean D;
    public int D1;
    public final o91.a E;
    public int E1;
    public final r53.p2 F;
    public lq.h F1;
    public ln.b G1;
    public final r53.p2 H0;
    public boolean H1;
    public final r53.p2 I;
    public final r53.p2 I0;
    public boolean I1;
    public final r53.p2 J0;
    public final r53.p2 J1;
    public final o13.t K0;
    public final r53.b2 K1;
    public final o13.t L0;
    public final r53.p2 L1;
    public final o13.t M0;
    public final r53.p2 M1;
    public final r53.p2 N0;
    public final r53.p2 N1;
    public final r53.b2 O0;
    public final r53.p2 O1;
    public final r53.p2 P;
    public final o13.t P0;
    public final r53.p2 P1;
    public final o13.t Q0;
    public final r53.p2 Q1;
    public final o13.t R0;
    public final r53.p2 R1;
    public final o13.t S0;
    public final r53.p2 S1;
    public final r53.p2 T;
    public final o13.t T0;
    public String T1;
    public final o13.t U0;
    public final r53.p2 U1;
    public final o13.t V0;
    public final o13.t V1;
    public final r53.b2 W0;
    public final r53.p2 W1;
    public final r53.p2 X;
    public final r53.b2 X0;
    public final am.e X1;
    public final r53.p2 Y;
    public final o13.t Y0;
    public final o13.t Y1;
    public os.a Z;
    public final o13.t Z0;
    public final r53.p2 Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr.h f146501a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final o13.t f146502a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public final r53.b2 f146503a2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kr.e f146504b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final o13.t f146505b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public final r53.p2 f146506b2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final am.m f146507c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final r53.p2 f146508c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public final r53.b2 f146509c2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fo1.f f146510d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final o13.t f146511d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public final r53.p2 f146512d2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pc0.j f146513e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final o13.t f146514e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public final r53.b2 f146515e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d60.b f146516f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final o13.t f146517f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public final r53.p2 f146518f2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ru1.d f146519g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final o13.t f146520g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public final r53.b2 f146521g2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a22.i f146522h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public mo1.d f146523h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public final kr.j f146524h2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ou1.d f146525i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public List<mo1.f> f146526i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final r53.p2 f146527i2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aq.h3 f146528j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final o13.t f146529j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public final r53.b2 f146530j2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zf0.d f146531k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final r53.p2 f146532k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final o13.t f146533k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public final r53.p2 f146534k2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final am.x1 f146535l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final o13.t f146536l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public final r53.b2 f146537l2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vo1.c f146538m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final o13.t f146539m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public final w0 f146540m2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sr.b f146541n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final o13.t f146542n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public final x0 f146543n2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final am.d f146544o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final o13.t f146545o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public final h f146546o2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f12.l f146547p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final o13.t f146548p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final f f146549p2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qr.a f146550q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final o13.t f146551q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public final a1 f146552q2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final or.b f146553r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final o13.t f146554r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public final e f146555r2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final o13.t f146556s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public final r53.p2 f146557s2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mr.q f146558t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final o13.t f146559t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public final r53.p2 f146560t2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final o13.t f146561u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public final c80.b f146562u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f146563v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final o13.t f146564v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public boolean f146565v2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ne0.j f146566w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final o13.t f146567w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public final r53.p2 f146568w2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActivityListItemDTO f146569x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final o13.t f146570x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final r53.b2 f146571x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<Integer> f146572y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final o13.t f146573y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public final r53.p2 f146574y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f146575z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final o13.t f146576z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public final r53.b2 f146577z2;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$1", f = "ActivityDetailsViewModel.kt", l = {993}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f146578a;

        /* JADX INFO: renamed from: qr.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lnr/t$f;", "detailsState", "", "loadingCalls", "gearLoadingCalls", "", "Lnr/w0;", "events", "Lnr/i;", "<anonymous>", "(Lnr/t$f;IILjava/util/List;)Lnr/i;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C2754a extends v13.i implements e23.s<nr.t.f, Integer, Integer, List<? extends nr.w0>, t13.d<? super nr.i>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ nr.t.f f146580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f146581b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ int f146582c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ List f146583d;

            public C2754a(t13.d<? super C2754a> dVar) {
                super(5, dVar);
            }

            @Override // e23.s
            public final Object invoke(nr.t.f fVar, Integer num, Integer num2, List<? extends nr.w0> list, t13.d<? super nr.i> dVar) {
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                C2754a c2754a = new C2754a(dVar);
                c2754a.f146580a = fVar;
                c2754a.f146581b = iIntValue;
                c2754a.f146582c = iIntValue2;
                c2754a.f146583d = list;
                return c2754a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                nr.t.f fVar = this.f146580a;
                int i14 = this.f146581b;
                int i15 = this.f146582c;
                List list = this.f146583d;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return new nr.i(fVar, i14 + i15 != 0, fVar.f127338c == null, list);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/i;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super nr.i>, Throwable, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ r53.j f146584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Throwable f146585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t f146586c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, t13.d<? super b> dVar) {
                super(3, dVar);
                this.f146586c = tVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super nr.i> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                b bVar = new b(this.f146586c, dVar);
                bVar.f146584a = jVar;
                bVar.f146585b = th3;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Throwable th3 = this.f146585b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                this.f146586c.L1.k(null, new nr.i(null, false, true, null, 11, null));
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String message = th3.getMessage();
                String string = Arrays.toString(th3.getStackTrace());
                string.getClass();
                String strJ = androidx.room.a0.j("ActivityDetailsUiState catch: ", message, " \n ", string);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strJ);
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t f146587a;

            public c(t tVar) {
                this.f146587a = tVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f146587a.L1.setValue((nr.i) obj);
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146578a;
            if (i14 == 0) {
                o13.r.b(obj);
                t tVar = t.this;
                r53.w wVar = new r53.w(r53.s.m(tVar.J0, tVar.f146532k0, tVar.H0, (r53.z1) tVar.K0.getValue(), new C2754a(null)), new b(tVar, null));
                c cVar = new c(tVar);
                this.f146578a = 1;
                if (wVar.collect(cVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ljr/c;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityShareConfiguration$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a0 extends v13.i implements e23.q<r53.j<? super jr.c>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146589b;

        public a0(t13.d<? super a0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super jr.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            a0 a0Var = new a0(dVar);
            a0Var.f146588a = jVar;
            a0Var.f146589b = th3;
            return a0Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146589b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error getting activity share configuration ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qr/t$a1", "Lhs/f;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a1 implements hs.f {
        public a1() {
        }

        @Override // hs.f
        public final void a(ro0.l lVar) {
            int i14 = t.A2;
            t.this.G5(lVar);
        }

        @Override // hs.f
        public final void b(nr.w0 w0Var) {
            int i14 = t.A2;
            t.this.E4(w0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ljr/c;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityShareConfiguration$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b0 extends v13.i implements e23.q<r53.j<? super jr.c>, Throwable, t13.d<? super Unit>, Object> {
        public b0(t13.d<? super b0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super jr.c> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new b0(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateActivity$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b1 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, t13.d<? super Unit>, Object> {
        public b1(t13.d<? super b1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new b1(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
            return ((b1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f146593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f146594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f146595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f146596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f146597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f146598f;

        static {
            int[] iArr = new int[ln.b.values().length];
            try {
                iArr[ln.b.f113634h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ln.b.f113637k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ln.b.f113636j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ln.b.f113635i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ln.b.f113633g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f146593a = iArr;
            int[] iArr2 = new int[jr.j.values().length];
            try {
                iArr2[jr.j.EVALUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[jr.j.DEVICES_AND_APPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[jr.j.NAVIGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f146594b = iArr2;
            int[] iArr3 = new int[jr.k.values().length];
            try {
                iArr3[jr.k.ACTIVITY_LEGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[jr.k.BADGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[jr.k.DOGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[jr.k.DIVE_BUDDY.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[jr.k.DIVE_EQUIPMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[jr.k.MEDIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[jr.k.METADATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[jr.k.BANNER.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[jr.k.LINK_TRAIL_BANNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[jr.k.PRIMARY_STATS.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[jr.k.SECONDARY_STATS.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[jr.k.SOCIAL_GROUP_RIDE.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[jr.k.SOCIAL_ENGAGEMENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[jr.k.TAGS.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[jr.k.TITLE_AND_NOTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[jr.k.MUSCLE_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[jr.k.TRAILS.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[jr.k.EXERCISES_TABLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[jr.k.MOVES_TABLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[jr.k.MOBILITY_MOVES_TABLE.ordinal()] = 20;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[jr.k.POSES_TABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[jr.k.ROUNDS_TABLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[jr.k.LOCATION.ordinal()] = 23;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[jr.k.DIVING_DEPTH.ordinal()] = 24;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[jr.k.DIVE_APP_PROMO.ordinal()] = 25;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[jr.k.CONNECT_IQ_APP_PROMO.ordinal()] = 26;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[jr.k.GROUP.ordinal()] = 27;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[jr.k.SHOTVIEW_APP_PROMO.ordinal()] = 28;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[jr.k.PHYSIO_METRICS_INFO.ordinal()] = 29;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[jr.k.EPIC.ordinal()] = 30;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[jr.k.WORKOUT_BENEFIT.ordinal()] = 31;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[jr.k.PRIMARY_BENEFIT.ordinal()] = 32;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[jr.k.LINKED_EVENT.ordinal()] = 33;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[jr.k.SELF_EVALUATION.ordinal()] = 34;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[jr.k.RATING.ordinal()] = 35;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[jr.k.EXECUTION_SCORE.ordinal()] = 36;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[jr.k.DEVICE.ordinal()] = 37;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[jr.k.IRON.ordinal()] = 38;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr3[jr.k.SENSORS.ordinal()] = 39;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[jr.k.CONNECTED_APP.ordinal()] = 40;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[jr.k.CONNECT_IQ.ordinal()] = 41;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr3[jr.k.SEGMENTS.ordinal()] = 42;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr3[jr.k.TIMING_GATES.ordinal()] = 43;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr3[jr.k.CLIMBS.ordinal()] = 44;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr3[jr.k.PERSONAL_RECORDS.ordinal()] = 45;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr3[jr.k.VIEW_ALL.ordinal()] = 46;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr3[jr.k.REPORTS.ordinal()] = 47;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr3[jr.k.E_BIKE.ordinal()] = 48;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr3[jr.k.SOLAR_RIDE_TIME_GAINED.ordinal()] = 49;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr3[jr.k.ELECTRONIC_SHIFTING_DATA.ordinal()] = 50;
            } catch (NoSuchFieldError unused58) {
            }
            f146595c = iArr3;
            int[] iArr4 = new int[jr.y.values().length];
            try {
                iArr4[jr.y.CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr4[jr.y.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr4[jr.y.MUSCLE_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr4[jr.y.STYLISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr4[jr.y.ROUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr4[jr.y.CREATE_CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused64) {
            }
            f146596d = iArr4;
            int[] iArr5 = new int[ro0.l.values().length];
            try {
                iArr5[ro0.l.PLATFORM_CENTER_OFFSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr5[ro0.l.CYCLING_DYNAMICS_POWER_PHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr5[ro0.l.CYCLING_DYNAMICS_TIME_IN_POSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr5[ro0.l.RUNNING_DYNAMICS.ordinal()] = 4;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr5[ro0.l.TRAINING_EFFECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr5[ro0.l.PACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr5[ro0.l.ACTIVITY_HEART_RATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr5[ro0.l.NUTRITION_HYDRATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr5[ro0.l.INDOOR_ROWING_HEART_RATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr5[ro0.l.INDOOR_ROWING_PACE.ordinal()] = 10;
            } catch (NoSuchFieldError unused74) {
            }
            f146597e = iArr5;
            int[] iArr6 = new int[nr.v0.values().length];
            try {
                iArr6[nr.v0.FAVORITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr6[nr.v0.NAME_AND_NOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr6[nr.v0.PRIVACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr6[nr.v0.PRIVACY_FOR_SHARE_ACTIVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr6[nr.v0.RATING.ordinal()] = 5;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr6[nr.v0.SELF_EVALUATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr6[nr.v0.LINK_TRAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr6[nr.v0.UNLINK_TRAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr6[nr.v0.EXCLUDE_FROM_PHYSIO_METRICS.ordinal()] = 9;
            } catch (NoSuchFieldError unused83) {
            }
            f146598f = iArr6;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/r;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivitySummary$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c0 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>>, t13.d<? super Unit>, Object> {
        public c0(t13.d<? super c0> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new c0(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>> jVar, t13.d<? super Unit> dVar) {
            return ((c0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() + 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateActivity$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c1 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146600a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ nr.v0 f146602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ps.r f146603d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(nr.v0 v0Var, ps.r rVar, t13.d<? super c1> dVar) {
            super(2, dVar);
            this.f146602c = v0Var;
            this.f146603d = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c1 c1Var = t.this.new c1(this.f146602c, this.f146603d, dVar);
            c1Var.f146600a = obj;
            return c1Var;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
            return ((c1) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ps.r value;
            ps.r rVar;
            ps.a1 metadataDTO;
            ps.r value2;
            ps.r rVar2;
            ps.r value3;
            ps.r rVar3;
            ps.r value4;
            ps.r rVar4;
            ps.q1 q1VarB;
            ps.r value5;
            ps.r rVar5;
            ps.q1 summaryDTO;
            ps.q1 q1VarB2;
            ps.r value6;
            ps.r rVar6;
            ps.q1 summaryDTO2;
            ps.a1 a1VarB;
            ps.r value7;
            ps.r rVar7;
            ps.a1 metadataDTO2;
            ps.a1 a1VarB2;
            ps.r value8;
            ps.r rVar8;
            ps.a1 metadataDTO3;
            ps.a1 a1VarB3;
            ps.r value9;
            ps.r rVar9;
            nr.p value10;
            ps.a1 metadataDTO4;
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146600a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
            nr.v0 v0Var = this.f146602c;
            t tVar = t.this;
            if (z14) {
                long j8 = tVar.f146575z;
                tVar.H1 = true;
                tVar.D5();
                int i14 = c.f146598f[v0Var.ordinal()];
                ps.r rVar10 = this.f146603d;
                switch (i14) {
                    case 1:
                        ps.r value11 = tVar.W4().getValue();
                        ps.a1 a1VarB4 = (value11 == null || (metadataDTO = value11.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, null, null, null, oe2.f.G(rVar10), null, null, null, null, -536870913, 524287);
                        r53.z1<ps.r> z1VarW4 = tVar.W4();
                        do {
                            value = z1VarW4.getValue();
                            rVar = value;
                        } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB4, null, 261631) : null));
                        sr.b bVar = tVar.f146541n;
                        boolean zG = oe2.f.G(rVar10);
                        bVar.getClass();
                        tVar.E4(new nr.w0.b2(bVar.o(Integer.valueOf(zG ? R.string.activity_favorite_general_success_message : R.string.activity_unfavorite_general_success_message)), nr.a0.SUCCESS));
                        Unit unit = Unit.INSTANCE;
                        break;
                    case 2:
                        r53.z1<ps.r> z1VarW5 = tVar.W4();
                        do {
                            value2 = z1VarW5.getValue();
                            rVar2 = value2;
                        } while (!z1VarW5.b(value2, rVar2 != null ? ps.r.b(rVar2, null, rVar10.getActivityName(), rVar10.getDescription(), null, null, 262123) : null));
                        ActivityListItemDTO activityListItemDTO = tVar.f146569x;
                        if (activityListItemDTO != null) {
                            activityListItemDTO.f29253c = rVar10.getActivityName();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        break;
                    case 3:
                        r53.z1<ps.r> z1VarW6 = tVar.W4();
                        do {
                            value3 = z1VarW6.getValue();
                            rVar3 = value3;
                        } while (!z1VarW6.b(value3, rVar3 != null ? ps.r.b(rVar3, rVar10.getAccessControlRuleDTO(), null, null, null, null, 262142) : null));
                        tVar.E4(nr.w0.n1.f127499a);
                        Unit unit3 = Unit.INSTANCE;
                        break;
                    case 4:
                        r53.z1<ps.r> z1VarW7 = tVar.W4();
                        do {
                            value4 = z1VarW7.getValue();
                            rVar4 = value4;
                        } while (!z1VarW7.b(value4, rVar4 != null ? ps.r.b(rVar4, rVar10.getAccessControlRuleDTO(), null, null, null, null, 262142) : null));
                        ps.r value12 = tVar.W4().getValue();
                        if (value12 != null) {
                            String strValueOf = String.valueOf(j8);
                            String activityName = value12.getActivityName();
                            if (activityName == null) {
                                activityName = "";
                            }
                            tVar.E4(new nr.w0.z0(strValueOf, activityName, value12.h()));
                            Unit unit4 = Unit.INSTANCE;
                        }
                        break;
                    case 5:
                        ps.r value13 = tVar.W4().getValue();
                        if (value13 == null || (summaryDTO = value13.getSummaryDTO()) == null) {
                            q1VarB = null;
                        } else {
                            ps.q1 summaryDTO3 = rVar10.getSummaryDTO();
                            q1VarB = ps.q1.b(summaryDTO, null, null, null, null, null, null, null, null, summaryDTO3 != null ? summaryDTO3.getPerceivedWorkoutEffort() : null, null, null, -1, -1, -1, -1, -513, FlexItem.MAX_SIZE);
                        }
                        r53.z1<ps.r> z1VarW8 = tVar.W4();
                        do {
                            value5 = z1VarW8.getValue();
                            rVar5 = value5;
                        } while (!z1VarW8.b(value5, rVar5 != null ? ps.r.b(rVar5, null, null, null, null, q1VarB, 258047) : null));
                        tVar.E4(new nr.w0.o1(nr.a0.SUCCESS));
                        Unit unit5 = Unit.INSTANCE;
                        break;
                    case 6:
                        ps.r value14 = tVar.W4().getValue();
                        if (value14 == null || (summaryDTO2 = value14.getSummaryDTO()) == null) {
                            q1VarB2 = null;
                        } else {
                            ps.q1 summaryDTO4 = rVar10.getSummaryDTO();
                            Integer workoutFeel = summaryDTO4 != null ? summaryDTO4.getWorkoutFeel() : null;
                            ps.q1 summaryDTO5 = rVar10.getSummaryDTO();
                            q1VarB2 = ps.q1.b(summaryDTO2, null, null, null, null, null, null, null, null, null, workoutFeel, summaryDTO5 != null ? summaryDTO5.getWorkoutRPE() : null, -1, -1, -1, -1, -1, 4194303);
                        }
                        r53.z1<ps.r> z1VarW9 = tVar.W4();
                        do {
                            value6 = z1VarW9.getValue();
                            rVar6 = value6;
                        } while (!z1VarW9.b(value6, rVar6 != null ? ps.r.b(rVar6, null, null, null, null, q1VarB2, 258047) : null));
                        Unit unit6 = Unit.INSTANCE;
                        break;
                    case 7:
                        ps.r value15 = tVar.W4().getValue();
                        if (value15 == null || (metadataDTO2 = value15.getMetadataDTO()) == null) {
                            a1VarB = null;
                        } else {
                            ps.a1 metadataDTO5 = rVar10.getMetadataDTO();
                            a1VarB = ps.a1.b(metadataDTO2, null, null, null, false, null, metadataDTO5 != null ? metadataDTO5.getMatchedCuratedCourseId() : null, null, null, -1, 524271);
                        }
                        r53.z1<ps.r> z1VarW10 = tVar.W4();
                        do {
                            value7 = z1VarW10.getValue();
                            rVar7 = value7;
                        } while (!z1VarW10.b(value7, rVar7 != null ? ps.r.b(rVar7, null, null, null, a1VarB, null, 261631) : null));
                        ge1.b.T(androidx.lifecycle.v1.a(tVar), null, null, new e5(tVar.W4().getValue(), tVar, j8, null), 3);
                        tVar.E4(new nr.w0.i(nr.a0.SUCCESS));
                        tVar.a5().setValue(nr.p.a(tVar.a5().getValue(), null, false, false, 23));
                        Unit unit7 = Unit.INSTANCE;
                        break;
                    case 8:
                        ps.r value16 = tVar.W4().getValue();
                        if (value16 == null || (metadataDTO3 = value16.getMetadataDTO()) == null) {
                            a1VarB2 = null;
                        } else {
                            ps.a1 metadataDTO6 = rVar10.getMetadataDTO();
                            a1VarB2 = ps.a1.b(metadataDTO3, null, null, null, false, null, metadataDTO6 != null ? metadataDTO6.getMatchedCuratedCourseId() : null, null, null, -1, 524271);
                        }
                        r53.z1<ps.r> z1VarW11 = tVar.W4();
                        do {
                            value8 = z1VarW11.getValue();
                            rVar8 = value8;
                        } while (!z1VarW11.b(value8, rVar8 != null ? ps.r.b(rVar8, null, null, null, a1VarB2, null, 261631) : null));
                        tVar.a5().setValue(nr.p.a(tVar.a5().getValue(), null, false, false, 23));
                        Unit unit8 = Unit.INSTANCE;
                        break;
                    case 9:
                        ps.r value17 = tVar.W4().getValue();
                        if (value17 == null || (metadataDTO4 = value17.getMetadataDTO()) == null) {
                            a1VarB3 = null;
                        } else {
                            ps.a1 metadataDTO7 = rVar10.getMetadataDTO();
                            a1VarB3 = ps.a1.b(metadataDTO4, null, null, null, false, null, null, null, metadataDTO7 != null ? metadataDTO7.getSessionResultType() : null, -1, 458751);
                        }
                        r53.z1<ps.r> z1VarW12 = tVar.W4();
                        do {
                            value9 = z1VarW12.getValue();
                            rVar9 = value9;
                        } while (!z1VarW12.b(value9, rVar9 != null ? ps.r.b(rVar9, null, null, null, a1VarB3, null, 261631) : null));
                        r53.z1<nr.p> z1VarA5 = tVar.a5();
                        do {
                            value10 = z1VarA5.getValue();
                        } while (!z1VarA5.b(value10, nr.p.a(value10, null, false, true, 15)));
                    default:
                        Unit unit9 = Unit.INSTANCE;
                        break;
                }
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                int i15 = t.A2;
                tVar.getClass();
                int i16 = c.f146598f[v0Var.ordinal()];
                if (i16 == 1) {
                    tVar.E4(new nr.w0.b2(null, nr.a0.FAIL, 1, null));
                } else if (i16 == 5) {
                    tVar.E4(new nr.w0.o1(nr.a0.FAIL));
                } else if (i16 == 7) {
                    tVar.E4(new nr.w0.i(nr.a0.FAIL));
                } else if (i16 == 8) {
                    tVar.E4(new nr.w0.c2(nr.a0.FAIL));
                }
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("Error updating activity, response: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements r53.i<c80.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f146604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f146605b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f146606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f146607b;

            /* JADX INFO: renamed from: qr.t$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$activityInfo_delegate$lambda$0$$inlined$map$1$2", f = "ActivityDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2755a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f146608a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f146609b;

                public C2755a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f146608a = obj;
                    this.f146609b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, t tVar) {
                this.f146606a = jVar;
                this.f146607b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2755a c2755a;
                ps.a1 metadataDTO;
                ps.a2 userInfoDto;
                ps.q1 summaryDTO;
                ps.a1 metadataDTO2;
                if (dVar instanceof C2755a) {
                    c2755a = (C2755a) dVar;
                    int i14 = c2755a.f146609b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2755a.f146609b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2755a = new C2755a(dVar);
                    }
                } else {
                    c2755a = new C2755a(dVar);
                }
                Object obj2 = c2755a.f146608a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2755a.f146609b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    ps.r rVar = (ps.r) obj;
                    long j8 = this.f146607b.f146501a.f127182a;
                    boolean zJ = oe2.f.J(rVar);
                    boolean z14 = (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null || !metadataDTO2.C0()) ? false : true;
                    String displayName = null;
                    String startTimeGMT = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) ? null : summaryDTO.getStartTimeGMT();
                    if (rVar != null && (metadataDTO = rVar.getMetadataDTO()) != null && (userInfoDto = metadataDTO.getUserInfoDto()) != null) {
                        displayName = userInfoDto.getDisplayName();
                    }
                    c80.c cVar = new c80.c(j8, zJ, z14, startTimeGMT, displayName);
                    c2755a.f146609b = 1;
                    if (this.f146606a.emit(cVar, c2755a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public d(r53.i iVar, t tVar) {
            this.f146604a = iVar;
            this.f146605b = tVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super c80.c> jVar, t13.d dVar) {
            Object objCollect = this.f146604a.collect(new a(jVar, this.f146605b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/r;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivitySummary$2", f = "ActivityDetailsViewModel.kt", l = {4034}, m = "invokeSuspend", v = 2)
    public static final class d0 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ps.r>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ps.r f146611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f146612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map f146613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f146614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f146615e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f146617g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(long j8, t13.d<? super d0> dVar) {
            super(2, dVar);
            this.f146617g = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d0 d0Var = t.this.new d0(this.f146617g, dVar);
            d0Var.f146615e = obj;
            return d0Var;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ps.r> v2Var, t13.d<? super Unit> dVar) {
            return ((d0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:201:0x05de  */
        /* JADX WARN: Code duplicated, block: B:203:0x05e4  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> value;
            Object objA;
            Integer num;
            ps.r rVar;
            Long userProfileId;
            String groupRideUUID;
            DateTime dateTimeW4;
            ps.a1 metadataDTO;
            ps.a2 userInfoDto;
            String displayName;
            List<Long> listS;
            ps.a2 userInfoDto2;
            String displayName2;
            String manufacturer;
            ps.x calendarEventInfo;
            Integer deviceApplicationInstallationId;
            Integer agentApplicationInstallationId;
            nr.p value2;
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146615e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146614d;
            long j8 = this.f146617g;
            t tVar = t.this;
            if (i14 == 0) {
                o13.r.b(obj);
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    nr.w0.g gVar = nr.w0.g.f127444a;
                    int i15 = t.A2;
                    tVar.E4(gVar);
                    am.m mVar = tVar.f146507c;
                    long j14 = tVar.f146575z;
                    ps.r rVar2 = (ps.r) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                    tVar.W4().setValue(rVar2);
                    tVar.l5();
                    am.x0 x0VarH = rVar2.h();
                    qr.a aVar2 = tVar.f146550q;
                    hb2.g.a aVar3 = hb2.g.a.GARMIN_DIVE;
                    aVar2.getClass();
                    aVar3.getClass();
                    boolean zB = hb2.g.b(aVar2.f146086a, aVar3);
                    am.x0 x0Var = tVar.f146501a.f127183b;
                    if (x0Var == null) {
                        ActivityListItemDTO activityListItemDTO = tVar.f146569x;
                        x0Var = activityListItemDTO != null ? activityListItemDTO.f29265g : null;
                    }
                    if (tVar.D && ((x0Var == null || am.z0.a(x0Var.f4358a, zB)) && am.z0.a(x0VarH.f4358a, zB))) {
                        tVar.E4(new nr.w0.p1(j14, true));
                        return Unit.INSTANCE;
                    }
                    tVar.F4(rVar2.h());
                    long j15 = tVar.f146575z;
                    am.x0 x0VarH2 = rVar2.h();
                    ps.q1 summaryDTO = rVar2.getSummaryDTO();
                    boolean zA = new ms.b0().a(summaryDTO != null ? summaryDTO.getNumberOfActiveLengths() : null);
                    boolean z14 = !uw0.a.a(x0VarH2);
                    mVar.getClass();
                    r53.c2 c2Var = new r53.c2(new am.q(mVar, j15, zA, 1400, null, z14, null));
                    x53.c cVar = o53.s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new qr.f0(tVar, null), r53.s.A(c2Var, bVar)), new qr.g0(tVar, null)), new qr.h0(null)), new qr.i0(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    if (oe2.f.A(rVar2)) {
                        ps.a1 metadataDTO2 = rVar2.getMetadataDTO();
                        String strValueOf = String.valueOf((metadataDTO2 == null || (agentApplicationInstallationId = metadataDTO2.getAgentApplicationInstallationId()) == null) ? 0 : agentApplicationInstallationId.intValue());
                        String strValueOf2 = String.valueOf((metadataDTO2 == null || (deviceApplicationInstallationId = metadataDTO2.getDeviceApplicationInstallationId()) == null) ? 0 : deviceApplicationInstallationId.intValue());
                        pc0.j jVar = tVar.f146513e;
                        jVar.getClass();
                        strValueOf.getClass();
                        strValueOf2.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new y1(tVar, null), new r53.c2(new pc0.o(jVar, strValueOf, strValueOf2, null))), new z1(tVar, null)), new a2(null)), new b2(tVar, null)), androidx.lifecycle.v1.a(tVar));
                        if (metadataDTO2 != null && (calendarEventInfo = metadataDTO2.getCalendarEventInfo()) != null) {
                            ge1.b.T(androidx.lifecycle.v1.a(tVar), null, null, new a3(calendarEventInfo.getCalendarEventId(), tVar, calendarEventInfo.getCalendarEventUuid(), null), 3);
                        }
                    }
                    ps.a1 metadataDTO3 = rVar2.getMetadataDTO();
                    String manufacturer2 = metadataDTO3 != null ? metadataDTO3.getManufacturer() : null;
                    if (manufacturer2 != null && manufacturer2.length() != 0 && !manufacturer2.equals("TACX") && !manufacturer2.equals("GARMIN")) {
                        ps.a1 metadataDTO4 = rVar2.getMetadataDTO();
                        if (metadataDTO4 == null || (manufacturer = metadataDTO4.getManufacturer()) == null) {
                            manufacturer = "";
                        }
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f4(tVar, null), new r53.c2(new e4(tVar, null))), new g4(manufacturer, tVar, null)), new h4(null)), new i4(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ps.q1 summaryDTO2 = rVar2.getSummaryDTO();
                    if (!p005kotlin.jvm.internal.s.c(summaryDTO2 != null ? summaryDTO2.getAverageHR() : null, 0.0d)) {
                        mVar.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new j4(tVar, null), r53.s.A(new r53.c2(new am.l0(mVar, j14, null)), bVar)), new k4(tVar, null)), new l4(null)), new m4(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ps.a1 metadataDTO5 = rVar2.getMetadataDTO();
                    if (metadataDTO5 != null ? p005kotlin.jvm.internal.s.g(metadataDTO5.getHasPowerTimeInZones(), Boolean.TRUE) : false) {
                        mVar.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new n4(tVar, null), r53.s.A(new r53.c2(new am.m0(mVar, j14, null)), bVar)), new o4(tVar, null)), new p4(null)), new q4(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ps.a1 metadataDTO6 = rVar2.getMetadataDTO();
                    if (metadataDTO6 != null ? p005kotlin.jvm.internal.s.g(metadataDTO6.getHasStaminaSpeedTimeInZones(), Boolean.TRUE) : false) {
                        mVar.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new v4(tVar, null), r53.s.A(new r53.c2(new am.o0(mVar, j14, null)), bVar)), new w4(tVar, null)), new x4(null)), new y4(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ps.a1 metadataDTO7 = rVar2.getMetadataDTO();
                    if (metadataDTO7 != null ? p005kotlin.jvm.internal.s.g(metadataDTO7.getHasStaminaPowerTimeInZones(), Boolean.TRUE) : false) {
                        mVar.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new r4(tVar, null), r53.s.A(new r53.c2(new am.n0(mVar, j14, null)), bVar)), new s4(tVar, null)), new t4(null)), new u4(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ps.a1 metadataDTO8 = rVar2.getMetadataDTO();
                    if (metadataDTO8 != null && (userInfoDto2 = metadataDTO8.getUserInfoDto()) != null && (displayName2 = userInfoDto2.getDisplayName()) != null) {
                        if (displayName2.length() > 0) {
                            long j16 = tVar.f146575z;
                            mVar.getClass();
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new w2(tVar, null), r53.s.A(new r53.c2(new am.f0(mVar, displayName2, j16, null)), bVar)), new x2(tVar, null)), new y2(null)), new z2(tVar, null)), androidx.lifecycle.v1.a(tVar));
                        }
                    }
                    if (tVar.f146563v.H0() && !c22.s3.b()) {
                        ps.a1 metadataDTO9 = rVar2.getMetadataDTO();
                        if ((metadataDTO9 == null || (listS = metadataDTO9.s()) == null || !(listS.isEmpty() ^ true)) ? false : true) {
                            r53.s.C(new r53.w(new r53.m1(new r53.c2(new qr.j0(tVar, rVar2, null)), new qr.k0(tVar, null)), new qr.l0(null)), androidx.lifecycle.v1.a(tVar));
                        }
                    }
                    ps.a1 metadataDTO10 = rVar2.getMetadataDTO();
                    if (metadataDTO10 != null ? p005kotlin.jvm.internal.s.g(metadataDTO10.getHasMultiDayActivities(), Boolean.TRUE) : false) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        if (com.garmin.android.apps.connectmobile.k1.f37122a.y() && (metadataDTO = rVar2.getMetadataDTO()) != null && (userInfoDto = metadataDTO.getUserInfoDto()) != null && (displayName = userInfoDto.getDisplayName()) != null) {
                            if (displayName.length() > 0) {
                                ge1.b.T(androidx.lifecycle.v1.a(tVar), null, null, new qr.m0(tVar, displayName, null), 3);
                            }
                        }
                    }
                    ps.a1 metadataDTO11 = rVar2.getMetadataDTO();
                    List<ps.m1> listN0 = metadataDTO11 != null ? metadataDTO11.n0() : null;
                    if (!(listN0 == null || listN0.isEmpty())) {
                        ps.a1 metadataDTO12 = rVar2.getMetadataDTO();
                        List<ps.m1> listN1 = metadataDTO12 != null ? metadataDTO12.n0() : null;
                        if (listN1 != null && !listN1.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listN1) {
                                if (((ps.m1) obj2).getFitProductNumber() != null) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                Long lF = ((ps.m1) it.next()).getFitProductNumber();
                                lF.getClass();
                                arrayList2.add(lF);
                            }
                            com.garmin.android.apps.connectmobile.devices.model.p pVar = new com.garmin.android.apps.connectmobile.devices.model.p(arrayList2, null, 2, null);
                            mVar.getClass();
                            r53.c2 c2Var2 = new r53.c2(new am.j0(mVar, (ac0.c) ez0.b.a(ez0.b.f67468a, ez0.c.GC, ac0.c.class, new c83.h.a[0], null, null, null, 120), pVar, null));
                            x53.c cVar2 = o53.s0.f129406a;
                            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new r3(tVar, null), r53.s.A(c2Var2, x53.b.f189152a)), new s3(arrayList, tVar, null)), new t3(null)), new u3(tVar, null)), androidx.lifecycle.v1.a(tVar));
                        }
                    }
                    tVar.J4();
                    if (!oe2.f.D(rVar2) || am.z0.o(tVar.A.f4358a)) {
                        am.x0 x0Var2 = tVar.A;
                        List<ps.o1> listT = rVar2.t();
                        List<ps.w> listI = rVar2.i();
                        if (tq.k.l(x0Var2, listT, !(listI == null || listI.isEmpty())) && !oe2.f.I(rVar2) && !am.z0.x(tVar.A.f4358a)) {
                            t.z4(tVar, true);
                        } else if (tq.k.j(tVar.A) && oe2.f.E(rVar2)) {
                            List<ps.o1> listT2 = rVar2.t();
                            if (!(listT2 == null || listT2.isEmpty()) && !oe2.f.I(rVar2)) {
                                t.A4(tVar);
                            } else if (!oe2.f.I(rVar2)) {
                                t.z4(tVar, oe2.f.E(rVar2));
                            }
                        } else if (!oe2.f.I(rVar2)) {
                            t.z4(tVar, oe2.f.E(rVar2));
                        }
                    } else {
                        mVar.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new qr.w0(tVar, null), r53.s.A(new r53.c2(new am.u(mVar, j14, null)), x53.b.f189152a)), new qr.x0(tVar, null)), new qr.y0(null)), new qr.z0(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ps.q1 summaryDTO3 = rVar2.getSummaryDTO();
                    if (summaryDTO3 != null && (dateTimeW4 = summaryDTO3.W4()) != null) {
                        mVar.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f5(tVar, null), r53.s.A(new r53.c2(new am.p0(mVar, dateTimeW4, null)), x53.b.f189152a)), new g5(tVar, null)), new h5(null)), new i5(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ((am.b) KoinJavaComponent.get$default(am.b.class, null, null, 6, null)).getClass();
                    androidx.lifecycle.w0 w0VarK = new dm.u0(j14).k();
                    w0VarK.getClass();
                    r53.s.C(new r53.w(new r53.m1(androidx.lifecycle.v.a(w0VarK), new p3(tVar, null)), new q3(null)), androidx.lifecycle.v1.a(tVar));
                    ps.a1 metadataDTO13 = rVar2.getMetadataDTO();
                    ge1.b.T(androidx.lifecycle.v1.a(tVar), null, null, new l2(metadataDTO13 != null ? metadataDTO13.m() : null, tVar, null), 3);
                    if (rVar2.getParentId() != null) {
                        sr.b bVar2 = tVar.f146541n;
                        am.x0 x0VarH3 = rVar2.h();
                        bVar2.getClass();
                        x0VarH3.getClass();
                        l22.a aVar4 = bVar2.f160541b;
                        tVar.E4(new nr.w0.d2(aVar4.a(R.string.string_line_string_pattern, aVar4.b(am.x0.C.f4360c), aVar4.b(x0VarH3.f4360c))));
                    }
                    tVar.E4(new nr.w0.x1(String.valueOf(j14), oe2.f.L(tVar.W4().getValue())));
                    tVar.f146544o.s();
                    ps.a1 metadataDTO14 = rVar2.getMetadataDTO();
                    if (metadataDTO14 != null && (groupRideUUID = metadataDTO14.getGroupRideUUID()) != null) {
                        tVar.t5(j14, groupRideUUID);
                        Long l14 = new Long(j14);
                        vo1.c cVar3 = tVar.f146538m;
                        cVar3.getClass();
                        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new v3(tVar, null), new r53.c2(new vo1.j(cVar3, groupRideUUID, l14, null))), new w3(tVar, null)), new x3(null)), new y3(tVar, null)), androidx.lifecycle.v1.a(tVar));
                    }
                    ge1.b.T(androidx.lifecycle.v1.a(tVar), null, null, new e5(rVar2, tVar, j8, null), 3);
                    ps.r value3 = tVar.W4().getValue();
                    Integer num2 = (value3 == null || (userProfileId = value3.getUserProfileId()) == null) ? null : new Integer((int) userProfileId.longValue());
                    value = tVar.v5().getValue();
                    a22.i iVar = tVar.f146522h;
                    List<String> listC = p13.w.c(String.valueOf(num2));
                    List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND);
                    this.f146615e = null;
                    this.f146611a = rVar2;
                    this.f146612b = num2;
                    this.f146613c = value;
                    this.f146614d = 1;
                    objA = iVar.a(listC, listK, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                    num = num2;
                    rVar = rVar2;
                } else {
                    if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                        lc.u0.r();
                        return null;
                    }
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                    com.garmin.android.apps.connectmobile.v2.a aVar5 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
                    String strN = fb1.c.n("Error fetching activity summary: ", aVar5.f47385c);
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
                    int i16 = t.A2;
                    if (tVar.W4().getValue() != null) {
                        r53.p2 p2Var = tVar.L1;
                        nr.i iVar2 = (nr.i) p2Var.getValue();
                        nr.t tVar2 = iVar2.f127191a;
                        boolean z15 = iVar2.f127192b;
                        List<nr.w0> list = iVar2.f127194d;
                        list.getClass();
                        p2Var.k(null, new nr.i(tVar2, z15, true, list));
                    } else {
                        Integer num3 = aVar5.f47384b;
                        if (num3 != null && num3.intValue() == 404) {
                            tVar.E4(new nr.w0.d2(tVar.f146541n.o(new Integer(R.string.activities_missing_activity_title))));
                            tVar.E4(new nr.w0.v1(true));
                        } else {
                            tVar.E4(new nr.w0.v1(false));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            value = this.f146613c;
            num = this.f146612b;
            rVar = this.f146611a;
            o13.r.b(obj);
            objA = obj;
            value.putAll((Map) objA);
            ((r53.z1) tVar.P0.getValue()).setValue(tVar.v5().getValue().get(num));
            t.O4(tVar, tVar.A, 2);
            r53.z1<nr.p> z1VarA5 = tVar.a5();
            do {
                value2 = z1VarA5.getValue();
            } while (!z1VarA5.b(value2, nr.p.a(value2, null, false, true, 15)));
            if (oe2.f.J(rVar)) {
                am.m mVar2 = tVar.f146507c;
                mVar2.getClass();
                r53.c2 c2Var3 = new r53.c2(new am.y(mVar2, j8, null));
                x53.c cVar4 = o53.s0.f129406a;
                r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new qr.i1(tVar, null), r53.s.A(c2Var3, x53.b.f189152a)), new qr.j1(tVar, null)), new qr.k1(null)), new qr.l1(tVar, null)), androidx.lifecycle.v1.a(tVar));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "exception", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateActivity$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d1 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146619b;

        public d1(t13.d<? super d1> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            d1 d1Var = new d1(dVar);
            d1Var.f146618a = jVar;
            d1Var.f146619b = th3;
            return d1Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146619b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error while updating activity, exception: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qr/t$e", "Lrr/g;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements rr.g {
        public e() {
        }

        @Override // rr.g
        public final void a(nr.w0 w0Var) {
            int i14 = t.A2;
            t.this.E4(w0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/r;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivitySummary$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146622b;

        public e0(t13.d<? super e0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            e0 e0Var = new e0(dVar);
            e0Var.f146621a = jVar;
            e0Var.f146622b = th3;
            return e0Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146622b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching activity summary: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "it", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateActivity$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e1 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, Throwable, t13.d<? super Unit>, Object> {
        public e1(t13.d<? super e1> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new e1(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qr/t$f", "Lxg0/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements xg0.a {
        public f() {
        }

        @Override // xg0.a
        public final void G1(wg0.a aVar) {
            wg0.m mVar = aVar.f185060t;
            t tVar = t.this;
            if (mVar != null) {
                int i14 = t.A2;
                tVar.s5().setValue(mVar);
            }
            int i15 = t.A2;
            String str = tVar.s5().getValue().f185111d;
            Long l14 = tVar.s5().getValue().f185110c;
            if (str == null || l14 == null) {
                tVar.V5();
            } else {
                r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new k6(tVar, null), new r53.c2(new j6(tVar, str, l14.longValue(), null))), new l6(tVar, null)), new m6(tVar, null)), new n6(tVar, null)), androidx.lifecycle.v1.a(tVar));
            }
        }

        @Override // xg0.a
        public final void J0(wg0.a aVar) {
            aVar.getClass();
            Long l14 = aVar.f185042a;
            if (l14 != null) {
                nr.w0.k0 k0Var = new nr.w0.k0(l14.longValue());
                int i14 = t.A2;
                t.this.E4(k0Var);
            }
        }

        @Override // xg0.a
        public final void Y1(wg0.a aVar) {
            aVar.getClass();
            int i14 = t.A2;
            t tVar = t.this;
            ps.r value = tVar.W4().getValue();
            if (value != null) {
                tVar.E4(new nr.w0.o(t.y4(value, tVar), false));
            }
        }

        @Override // xg0.a
        public final void i2(wg0.a aVar) {
            aVar.getClass();
        }

        @Override // xg0.a
        public final void p2(wg0.a aVar) {
            aVar.getClass();
            int i14 = t.A2;
            t tVar = t.this;
            ps.r value = tVar.W4().getValue();
            if (value != null) {
                tVar.E4(new nr.w0.o(t.y4(value, tVar), true));
            }
        }

        @Override // xg0.a
        public final void r1(wg0.a aVar, String str) {
            wg0.m mVar = aVar.f185060t;
            t tVar = t.this;
            if (mVar != null) {
                int i14 = t.A2;
                tVar.s5().setValue(mVar);
            }
            Long l14 = aVar.f185042a;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                int i15 = t.A2;
                tVar.getClass();
                r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new z5(tVar, null), new r53.c2(new d6(tVar, jLongValue, null))), new a6(tVar, null)), new b6(tVar, null)), new c6(tVar, null)), androidx.lifecycle.v1.a(tVar));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/r;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivitySummary$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>>, Throwable, t13.d<? super Unit>, Object> {
        public f0(t13.d<? super f0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.r>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new f0(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() - 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateAndForget$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f1 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, t13.d<? super Unit>, Object> {
        public f1(t13.d<? super f1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new f1(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
            return ((f1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements r53.i<bm2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f146627a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f146628a;

            /* JADX INFO: renamed from: qr.t$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$deviceDto_delegate$lambda$0$$inlined$map$1$2", f = "ActivityDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2756a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f146629a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f146630b;

                public C2756a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f146629a = obj;
                    this.f146630b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f146628a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2756a c2756a;
                r80.b bVarB;
                String applicationKey;
                if (dVar instanceof C2756a) {
                    c2756a = (C2756a) dVar;
                    int i14 = c2756a.f146630b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2756a.f146630b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2756a = new C2756a(dVar);
                    }
                } else {
                    c2756a = new C2756a(dVar);
                }
                Object obj2 = c2756a.f146629a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2756a.f146630b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    nr.v vVar = (nr.v) obj;
                    bm2.c cVarB = null;
                    if (vVar != null && (bVarB = vVar.b()) != null && (applicationKey = bVarB.getApplicationKey()) != null) {
                        hv.h.f85764f.getClass();
                        hv.h hVarA = hv.h.a.a();
                        if (hVarA != null) {
                            cVarB = hVarA.b(applicationKey);
                        }
                    }
                    c2756a.f146630b = 1;
                    if (this.f146628a.emit(cVarB, c2756a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public g(r53.i iVar) {
            this.f146627a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super bm2.c> jVar, t13.d dVar) {
            Object objCollect = this.f146627a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversation$1", f = "ActivityDetailsViewModel.kt", l = {4550, 4550}, m = "invokeSuspend", v = 2)
    public static final class g0 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r53.j f146632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f146633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f146634c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f146636e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(long j8, t13.d<? super g0> dVar) {
            super(2, dVar);
            this.f146636e = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g0 g0Var = t.this.new g0(this.f146636e, dVar);
            g0Var.f146634c = obj;
            return g0Var;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>> jVar, t13.d<? super Unit> dVar) {
            return ((g0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f146634c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146633b;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f146632a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            fo1.f fVar = t.this.f146510d;
            String strValueOf = String.valueOf(this.f146636e);
            this.f146634c = null;
            this.f146632a = jVar;
            this.f146633b = 1;
            obj = fVar.a("ACTIVITY", strValueOf, this);
            if (obj != aVar) {
            }
            return aVar;
            this.f146634c = null;
            this.f146632a = null;
            this.f146633b = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateAndForget$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g1 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146637a;

        public g1(t13.d<? super g1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            g1 g1Var = t.this.new g1(dVar);
            g1Var.f146637a = obj;
            return g1Var;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
            return ((g1) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146637a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.k(a2Var, "ActivityDetailsViewModel", "Activity update success");
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("Error updating activity, response: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "ActivityDetailsViewModel", strN);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qr/t$h", "Lxr/i;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h implements xr.i {
        public h() {
        }

        @Override // xr.i
        public final void a() {
            String strA;
            String string;
            t tVar = t.this;
            sr.i iVarD = tVar.f146541n.d();
            ps.r value = tVar.W4().getValue();
            am.x0 x0VarH = value != null ? value.h() : null;
            l22.b bVar = iVarD.f160572a;
            int i14 = x0VarH == null ? -1 : hq.j.a.f85048a[x0VarH.ordinal()];
            if (i14 == 1) {
                strA = bVar.a(R.string.lbl_activity_type_moves, bVar.b(am.x0.f4326r2.f4360c));
            } else if (i14 != 2) {
                strA = i14 != 3 ? bVar.getString(R.string.strength_training_select_exercise) : bVar.getString(R.string.lbl_yoga_poses);
            } else {
                strA = bVar.getString(R.string.lbl_mobility_moves);
            }
            l22.b bVar2 = iVarD.f160572a;
            int i15 = x0VarH != null ? hq.j.a.f85048a[x0VarH.ordinal()] : -1;
            if (i15 == 1 || i15 == 2) {
                string = bVar2.getString(R.string.lbl_search_moves);
            } else {
                string = i15 != 3 ? bVar2.getString(R.string.strength_training_search_exercises) : bVar2.getString(R.string.lbl_poses_search);
            }
            tVar.E4(new nr.w0.l(strA, string, (com.garmin.android.apps.connectmobile.repcounting.model.c) tVar.X0.f150540a.getValue(), x0VarH));
        }

        @Override // xr.i
        public final void c() {
            int i14 = t.A2;
            t.this.K5(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversation$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h0 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>>, t13.d<? super Unit>, Object> {
        public h0(t13.d<? super h0> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new h0(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>> jVar, t13.d<? super Unit> dVar) {
            return ((h0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "exception", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateAndForget$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h1 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146642b;

        public h1(t13.d<? super h1> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            h1 h1Var = new h1(dVar);
            h1Var.f146641a = jVar;
            h1Var.f146642b = th3;
            return h1Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146642b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error while updating activity, exception: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ljr/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityConfiguration$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<r53.j<? super jr.d>, t13.d<? super Unit>, Object> {
        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new i(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super jr.d> jVar, t13.d<? super Unit> dVar) {
            return ((i) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() + 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversation$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i0 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends mo1.d>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146644a;

        public i0(t13.d<? super i0> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            i0 i0Var = t.this.new i0(dVar);
            i0Var.f146644a = obj;
            return i0Var;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends mo1.d> v2Var, t13.d<? super Unit> dVar) {
            return ((i0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146644a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                mo1.d dVar = (mo1.d) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                t tVar = t.this;
                tVar.f146523h1 = dVar;
                tVar.s5().setValue(tVar.T4(tVar.f146523h1, tVar.f146526i1));
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("Error fetching conversation: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "it", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$updateAndForget$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i1 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, Throwable, t13.d<? super Unit>, Object> {
        public i1(t13.d<? super i1> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new i1(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljr/d;", "activityTypeConfiguration", "", "<anonymous>", "(Ljr/d;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityConfiguration$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<jr.d, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146647a;

        public j(t13.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            j jVar = t.this.new j(dVar);
            jVar.f146647a = obj;
            return jVar;
        }

        @Override // e23.p
        public final Object invoke(jr.d dVar, t13.d<? super Unit> dVar2) {
            return ((j) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean supportsDistance;
            ?? arrayList;
            List<jr.u> listA;
            Object next;
            List<jr.i> listB;
            List<jr.u> listA2;
            Object next2;
            jr.d dVar = (jr.d) this.f146647a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            tVar.F.k(null, dVar == null ? new jr.d(null, 1, null) : dVar);
            r53.p2 p2Var = tVar.R1;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
                if (dVar == null || (listA2 = dVar.a()) == null) {
                    supportsDistance = true;
                } else {
                    Iterator it = listA2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (((jr.u) next2).d() != jr.v.CHARTS);
                    jr.u uVar = (jr.u) next2;
                    if (uVar != null) {
                        supportsDistance = uVar.getSupportsDistance();
                    } else {
                        supportsDistance = true;
                    }
                }
            } while (!p2Var.b(value, Boolean.valueOf(supportsDistance)));
            if (dVar == null || (listA = dVar.a()) == null) {
                arrayList = p13.j0.f134944a;
            } else {
                Iterator it3 = listA.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((jr.u) next).d() != jr.v.CHARTS);
                jr.u uVar2 = (jr.u) next;
                if (uVar2 == null || (listB = uVar2.b()) == null) {
                    arrayList = p13.j0.f134944a;
                } else {
                    arrayList = new ArrayList();
                    Iterator it4 = listB.iterator();
                    while (it4.hasNext()) {
                        jr.j jVarC = ((jr.i) it4.next()).c();
                        Integer numA = jVarC != null ? is.i.a(jVarC) : null;
                        if (numA != null) {
                            arrayList.add(numA);
                        }
                    }
                }
            }
            tVar.f146572y = arrayList;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversation$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146650b;

        public j0(t13.d<? super j0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            j0 j0Var = new j0(dVar);
            j0Var.f146649a = jVar;
            j0Var.f146650b = th3;
            return j0Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146650b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching conversation: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$uploadPhotos$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j1 extends v13.i implements e23.p<r53.j<? super List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>>, t13.d<? super Unit>, Object> {
        public j1(t13.d<? super j1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new j1(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>> jVar, t13.d<? super Unit> dVar) {
            return ((j1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() + 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ljr/d;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityConfiguration$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.q<r53.j<? super jr.d>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146653b;

        public k(t13.d<? super k> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super jr.d> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            k kVar = new k(dVar);
            kVar.f146652a = jVar;
            kVar.f146653b = th3;
            return kVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146653b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error getting activity configuration ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/d;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversation$5", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>>, Throwable, t13.d<? super Unit>, Object> {
        public k0(t13.d<? super k0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends mo1.d>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new k0(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "result", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$uploadPhotos$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k1 extends v13.i implements e23.p<List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146655a;

        public k1(t13.d<? super k1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            k1 k1Var = t.this.new k1(dVar);
            k1Var.f146655a = obj;
            return k1Var;
        }

        @Override // e23.p
        public final Object invoke(List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e> list, t13.d<? super Unit> dVar) {
            return ((k1) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0096  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ps.a1 metadataDTO;
            List<ps.j> listD;
            List list = (List) this.f146655a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean zIsEmpty = list.isEmpty();
            t tVar = t.this;
            if (zIsEmpty) {
                nr.w0.h hVar = new nr.w0.h(nr.h0.GENERIC);
                int i14 = t.A2;
                tVar.E4(hVar);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.e.a) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (g22.n.d(((com.garmin.android.apps.connectmobile.activities.newmodel.e.a) obj3).f29418a.getUrl())) {
                        arrayList2.add(obj3);
                    }
                }
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            com.garmin.android.apps.connectmobile.activities.newmodel.e eVar = (com.garmin.android.apps.connectmobile.activities.newmodel.e) it.next();
                            if ((eVar instanceof com.garmin.android.apps.connectmobile.activities.newmodel.e.b) && (((com.garmin.android.apps.connectmobile.activities.newmodel.e.b) eVar).f29419a instanceof ImageTooLargeException)) {
                                nr.w0.h hVar2 = new nr.w0.h(nr.h0.IMAGE_TOO_LARGE);
                                int i15 = t.A2;
                                tVar.E4(hVar2);
                            }
                        } else if (arrayList2.isEmpty()) {
                            nr.w0.h hVar3 = new nr.w0.h(nr.h0.GENERIC);
                            int i16 = t.A2;
                            tVar.E4(hVar3);
                        }
                    }
                } else if (arrayList2.isEmpty()) {
                    nr.w0.h hVar4 = new nr.w0.h(nr.h0.GENERIC);
                    int i17 = t.A2;
                    tVar.E4(hVar4);
                }
                if (!arrayList2.isEmpty()) {
                    int i18 = t.A2;
                    ps.r value = tVar.W4().getValue();
                    ArrayList arrayList3 = (value == null || (metadataDTO = value.getMetadataDTO()) == null || (listD = metadataDTO.d()) == null) ? new ArrayList() : new ArrayList(listD);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((com.garmin.android.apps.connectmobile.activities.newmodel.e.a) it3.next()).f29418a);
                    }
                    tVar.Y5(arrayList3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Ljr/d;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityConfiguration$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.q<r53.j<? super jr.d>, Throwable, t13.d<? super Unit>, Object> {
        public l(t13.d<? super l> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super jr.d> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new l(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() - 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lmo1/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversationLikes$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l0 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>>, t13.d<? super Unit>, Object> {
        public l0(t13.d<? super l0> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new l0(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>> jVar, t13.d<? super Unit> dVar) {
            return ((l0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/e;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$uploadPhotos$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class l1 extends v13.i implements e23.q<r53.j<? super List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>>, Throwable, t13.d<? super Unit>, Object> {
        public l1(t13.d<? super l1> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.e>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new l1(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() - 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/s0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityExerciseSets$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.s0>>, t13.d<? super Unit>, Object> {
        public m(t13.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new m(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.s0>> jVar, t13.d<? super Unit> dVar) {
            return ((m) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lmo1/f;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversationLikes$2", f = "ActivityDetailsViewModel.kt", l = {4581}, m = "invokeSuspend", v = 2)
    public static final class m0 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map f146661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f146662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f146663c;

        public m0(t13.d<? super m0> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            m0 m0Var = t.this.new m0(dVar);
            m0Var.f146663c = obj;
            return m0Var;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>> v2Var, t13.d<? super Unit> dVar) {
            return ((m0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map;
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146663c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146662b;
            t tVar = t.this;
            if (i14 == 0) {
                o13.r.b(obj);
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    List<mo1.f> list = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                    tVar.f146526i1 = list;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        String userProfilePk = ((mo1.f) it.next()).getUserProfilePk();
                        if (userProfilePk != null) {
                            arrayList.add(userProfilePk);
                        }
                    }
                    Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> value = tVar.v5().getValue();
                    a22.i iVar = tVar.f146522h;
                    List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL, com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND);
                    this.f146663c = null;
                    this.f146661a = value;
                    this.f146662b = 1;
                    Object objA = iVar.a(arrayList, listK, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                    map = value;
                    obj = objA;
                } else {
                    if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                        lc.u0.r();
                        return null;
                    }
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                    String strN = fb1.c.n("Error fetching conversation likes: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = this.f146661a;
            o13.r.b(obj);
            map.putAll((Map) obj);
            int i15 = t.A2;
            tVar.s5().setValue(tVar.T4(tVar.f146523h1, tVar.f146526i1));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/s0;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityExerciseSets$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ps.s0>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146665a;

        public n(t13.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            n nVar = t.this.new n(dVar);
            nVar.f146665a = obj;
            return nVar;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ps.s0> v2Var, t13.d<? super Unit> dVar) {
            return ((n) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146665a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                ((r53.z1) t.this.T0.getValue()).setValue(((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a);
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("Error fetching exercise sets: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lmo1/f;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversationLikes$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class n0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146668b;

        public n0(t13.d<? super n0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            n0 n0Var = new n0(dVar);
            n0Var.f146667a = jVar;
            n0Var.f146668b = th3;
            return n0Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146668b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching conversation likes: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/s0;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityExerciseSets$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class o extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.s0>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146670b;

        public o(t13.d<? super o> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.s0>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            o oVar = new o(dVar);
            oVar.f146669a = jVar;
            oVar.f146670b = th3;
            return oVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146670b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching exercises sets: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lmo1/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getConversationLikes$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class o0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>>, Throwable, t13.d<? super Unit>, Object> {
        public o0(t13.d<? super o0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends mo1.f>>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new o0(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/s0;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityExerciseSets$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class p extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.s0>>, Throwable, t13.d<? super Unit>, Object> {
        public p(t13.d<? super p> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.s0>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new p(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyo1/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getSocialGroupRideResults$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class p0 extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends yo1.j>>, t13.d<? super Unit>, Object> {
        public p0(t13.d<? super p0> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new p0(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends yo1.j>> jVar, t13.d<? super Unit> dVar) {
            return ((p0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityMapDetails$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class q extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.k>>, t13.d<? super Unit>, Object> {
        public q(t13.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new q(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.k>> jVar, t13.d<? super Unit> dVar) {
            return ((q) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() + 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lyo1/j;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getSocialGroupRideResults$2", f = "ActivityDetailsViewModel.kt", l = {5937}, m = "invokeSuspend", v = 2)
    public static final class q0 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends yo1.j>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f146675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f146676b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f146678d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(String str, t13.d<? super q0> dVar) {
            super(2, dVar);
            this.f146678d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            q0 q0Var = t.this.new q0(this.f146678d, dVar);
            q0Var.f146676b = obj;
            return q0Var;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends yo1.j> v2Var, t13.d<? super Unit> dVar) {
            return ((q0) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146676b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146675a;
            t tVar = t.this;
            if (i14 == 0) {
                o13.r.b(obj);
                if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                    List<yo1.i> listG = ((yo1.j) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).g();
                    ArrayList arrayList = new ArrayList(p13.y.r(listG, 10));
                    Iterator<T> it = listG.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((yo1.i) it.next()).getUserPk()));
                    }
                    a22.i iVar = tVar.f146522h;
                    List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listK = p13.x.k(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_FRIEND, com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                    this.f146676b = v2Var;
                    this.f146675a = 1;
                    obj = iVar.a(arrayList, listK, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                        lc.u0.r();
                        return null;
                    }
                    int i15 = t.A2;
                    ((r53.z1) tVar.A1.getValue()).setValue(null);
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                    String strN = fb1.c.n("Error  fetching group ride results: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Map map = (Map) obj;
            com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
            for (yo1.i iVar2 : ((yo1.j) bVar.f47386a).g()) {
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) iVar2.getUserPk(), map);
                iVar2.f198502n = lVar != null ? lVar.getProfileImageUrls() : null;
            }
            int i16 = t.A2;
            ((r53.z1) tVar.A1.getValue()).setValue(bVar.f47386a);
            if (tVar.f146547p.l0()) {
                tVar.U1.k(null, new nr.t.d(oe2.f.J(tVar.W4().getValue()), this.f146678d));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lps/k;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityMapDetails$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class r extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends ps.k>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146679a;

        public r(t13.d<? super r> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            r rVar = t.this.new r(dVar);
            rVar.f146679a = obj;
            return rVar;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends ps.k> v2Var, t13.d<? super Unit> dVar) {
            return ((r) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146679a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                t tVar = t.this;
                r53.z1 z1Var = (r53.z1) tVar.f146556s1.getValue();
                ps.k kVar = (ps.k) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                z1Var.setValue(kVar.getPolylineDTO());
                ((r53.z1) tVar.f146559t1.getValue()).setValue(kVar.getHeatmapDTO());
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("Error fetching polyline: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyo1/j;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getSocialGroupRideResults$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class r0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends yo1.j>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146682b;

        public r0(t13.d<? super r0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends yo1.j>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            r0 r0Var = new r0(dVar);
            r0Var.f146681a = jVar;
            r0Var.f146682b = th3;
            return r0Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146682b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Exception fetching group ride results: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/k;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityMapDetails$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class s extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.k>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146684b;

        public s(t13.d<? super s> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.k>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            s sVar = new s(dVar);
            sVar.f146683a = jVar;
            sVar.f146684b = th3;
            return sVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146684b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching polyline: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyo1/j;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getSocialGroupRideResults$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class s0 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends yo1.j>>, Throwable, t13.d<? super Unit>, Object> {
        public s0(t13.d<? super s0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends yo1.j>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new s0(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qr.t$t, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/k;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityMapDetails$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2757t extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.k>>, Throwable, t13.d<? super Unit>, Object> {
        public C2757t(t13.d<? super C2757t> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.k>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new C2757t(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t tVar = t.this;
            r53.p2 p2Var = tVar.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            r53.p2 p2Var2 = tVar.I0;
            do {
                value2 = p2Var2.getValue();
            } while (!q6.f.z(((Number) value2).intValue() - 1, p2Var2, value2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class t0 implements r53.i<nr.k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i[] f146687a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements e23.a<Object[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f146688a;

            public a(r53.i[] iVarArr) {
                this.f146688a = iVarArr;
            }

            @Override // e23.a
            public final Object[] invoke() {
                return new Object[this.f146688a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initOverviewDetailsCollector$$inlined$combine$1$3", f = "ActivityDetailsViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.q<r53.j<? super nr.k0>, Object[], t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f146689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f146690b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object[] f146691c;

            public b(t13.d dVar) {
                super(3, dVar);
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super nr.k0> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
                b bVar = new b(dVar);
                bVar.f146690b = jVar;
                bVar.f146691c = objArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f146689a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j jVar = this.f146690b;
                    Object[] objArr = this.f146691c;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    Object obj8 = objArr[6];
                    Object obj9 = objArr[7];
                    nr.k0 k0Var = new nr.k0(((Number) obj2).intValue() != 0, (wg0.m) obj3, (List) obj4, (nr.p) obj5, (SegmentDetailsListDTO) obj6, (yo1.j) obj7, (yo1.f) obj8, (List) obj9, (List) objArr[8]);
                    this.f146690b = null;
                    this.f146691c = null;
                    this.f146689a = 1;
                    if (jVar.emit(k0Var, this) == aVar) {
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

        public t0(r53.i[] iVarArr) {
            this.f146687a = iVarArr;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super nr.k0> jVar, t13.d dVar) {
            r53.i[] iVarArr = this.f146687a;
            Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null), jVar, dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityRounds$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class u extends v13.i implements e23.p<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f>>, t13.d<? super Unit>, Object> {
        public u(t13.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new u(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f>> jVar, t13.d<? super Unit> dVar) {
            return ((u) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initOverviewDetailsCollector$1", f = "ActivityDetailsViewModel.kt", l = {2271}, m = "invokeSuspend", v = 2)
    public static final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f146693a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i<nr.k0> f146695c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/t$g;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initOverviewDetailsCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.q<r53.j<? super nr.t.g>, Throwable, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ r53.j f146696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Throwable f146697b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t f146698c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, t13.d<? super a> dVar) {
                super(3, dVar);
                this.f146698c = tVar;
            }

            @Override // e23.q
            public final Object invoke(r53.j<? super nr.t.g> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                a aVar = new a(this.f146698c, dVar);
                aVar.f146696a = jVar;
                aVar.f146697b = th3;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Throwable th3 = this.f146697b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("OverviewState ", th3.getMessage());
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
                this.f146698c.L1.k(null, new nr.i(null, false, true, null, 11, null));
                return Unit.INSTANCE;
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t f146699a;

            public b(t tVar) {
                this.f146699a = tVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f146699a.M1.setValue((nr.t.g) obj);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c implements r53.i<nr.t.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i[] f146700a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f146701b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements e23.a<Object[]> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.i[] f146702a;

                public a(r53.i[] iVarArr) {
                    this.f146702a = iVarArr;
                }

                @Override // e23.a
                public final Object[] invoke() {
                    return new Object[this.f146702a.length];
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lr53/j;", "", "it", "", "<anonymous>", "(Lr53/j;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initOverviewDetailsCollector$1$invokeSuspend$$inlined$combine$1$3", f = "ActivityDetailsViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
            public static final class b extends v13.i implements e23.q<r53.j<? super nr.t.g>, Object[], t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f146703a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ r53.j f146704b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object[] f146705c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ t f146706d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(t13.d dVar, t tVar) {
                    super(3, dVar);
                    this.f146706d = tVar;
                }

                @Override // e23.q
                public final Object invoke(r53.j<? super nr.t.g> jVar, Object[] objArr, t13.d<? super Unit> dVar) {
                    b bVar = new b(dVar, this.f146706d);
                    bVar.f146704b = jVar;
                    bVar.f146705c = objArr;
                    return bVar.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:100:0x018d  */
                /* JADX WARN: Code duplicated, block: B:101:0x0190  */
                /* JADX WARN: Code duplicated, block: B:104:0x0195  */
                /* JADX WARN: Code duplicated, block: B:105:0x0198  */
                /* JADX WARN: Code duplicated, block: B:108:0x019d  */
                /* JADX WARN: Code duplicated, block: B:109:0x01a0  */
                /* JADX WARN: Code duplicated, block: B:112:0x01a5  */
                /* JADX WARN: Code duplicated, block: B:114:0x01aa  */
                /* JADX WARN: Code duplicated, block: B:117:0x01b6  */
                /* JADX WARN: Code duplicated, block: B:120:0x01bd  */
                /* JADX WARN: Code duplicated, block: B:123:0x01c2  */
                /* JADX WARN: Code duplicated, block: B:128:0x01d5  */
                /* JADX WARN: Code duplicated, block: B:131:0x01e9  */
                /* JADX WARN: Code duplicated, block: B:132:0x01f4  */
                /* JADX WARN: Code duplicated, block: B:134:0x01fa  */
                /* JADX WARN: Code duplicated, block: B:136:0x0200  */
                /* JADX WARN: Code duplicated, block: B:137:0x0205  */
                /* JADX WARN: Code duplicated, block: B:141:0x020d  */
                /* JADX WARN: Code duplicated, block: B:144:0x021e  */
                /* JADX WARN: Code duplicated, block: B:146:0x0223  */
                /* JADX WARN: Code duplicated, block: B:149:0x023d  */
                /* JADX WARN: Code duplicated, block: B:150:0x024c  */
                /* JADX WARN: Code duplicated, block: B:153:0x0253  */
                /* JADX WARN: Code duplicated, block: B:156:0x0266  */
                /* JADX WARN: Code duplicated, block: B:159:0x0283  */
                /* JADX WARN: Code duplicated, block: B:161:0x0289  */
                /* JADX WARN: Code duplicated, block: B:165:0x02b6  */
                /* JADX WARN: Code duplicated, block: B:166:0x02b9  */
                /* JADX WARN: Code duplicated, block: B:169:0x02bf  */
                /* JADX WARN: Code duplicated, block: B:170:0x02d0  */
                /* JADX WARN: Code duplicated, block: B:175:0x0301  */
                /* JADX WARN: Code duplicated, block: B:177:0x0305  */
                /* JADX WARN: Code duplicated, block: B:178:0x0348  */
                /* JADX WARN: Code duplicated, block: B:180:0x0358  */
                /* JADX WARN: Code duplicated, block: B:181:0x0366  */
                /* JADX WARN: Code duplicated, block: B:183:0x0379  */
                /* JADX WARN: Code duplicated, block: B:184:0x037c  */
                /* JADX WARN: Code duplicated, block: B:186:0x038b  */
                /* JADX WARN: Code duplicated, block: B:188:0x0391  */
                /* JADX WARN: Code duplicated, block: B:189:0x0396  */
                /* JADX WARN: Code duplicated, block: B:192:0x039d  */
                /* JADX WARN: Code duplicated, block: B:194:0x03a8  */
                /* JADX WARN: Code duplicated, block: B:196:0x03ab  */
                /* JADX WARN: Code duplicated, block: B:198:0x03ae  */
                /* JADX WARN: Code duplicated, block: B:199:0x03b3  */
                /* JADX WARN: Code duplicated, block: B:200:0x03cc  */
                /* JADX WARN: Code duplicated, block: B:201:0x03e1  */
                /* JADX WARN: Code duplicated, block: B:204:0x0403  */
                /* JADX WARN: Code duplicated, block: B:205:0x0408  */
                /* JADX WARN: Code duplicated, block: B:208:0x040f  */
                /* JADX WARN: Code duplicated, block: B:218:0x0442  */
                /* JADX WARN: Code duplicated, block: B:223:0x0459  */
                /* JADX WARN: Code duplicated, block: B:225:0x0466 A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:233:0x049a  */
                /* JADX WARN: Code duplicated, block: B:235:0x04af  */
                /* JADX WARN: Code duplicated, block: B:237:0x04bd  */
                /* JADX WARN: Code duplicated, block: B:239:0x04d0  */
                /* JADX WARN: Code duplicated, block: B:240:0x04d3  */
                /* JADX WARN: Code duplicated, block: B:242:0x04e2  */
                /* JADX WARN: Code duplicated, block: B:244:0x04f1  */
                /* JADX WARN: Code duplicated, block: B:245:0x04f6  */
                /* JADX WARN: Code duplicated, block: B:248:0x04fb  */
                /* JADX WARN: Code duplicated, block: B:249:0x0508  */
                /* JADX WARN: Code duplicated, block: B:252:0x0514  */
                /* JADX WARN: Code duplicated, block: B:253:0x0517  */
                /* JADX WARN: Code duplicated, block: B:256:0x052d  */
                /* JADX WARN: Code duplicated, block: B:257:0x0530  */
                /* JADX WARN: Code duplicated, block: B:260:0x0541  */
                /* JADX WARN: Code duplicated, block: B:261:0x0544  */
                /* JADX WARN: Code duplicated, block: B:264:0x0554  */
                /* JADX WARN: Code duplicated, block: B:267:0x0577  */
                /* JADX WARN: Code duplicated, block: B:270:0x0582  */
                /* JADX WARN: Code duplicated, block: B:273:0x059c  */
                /* JADX WARN: Code duplicated, block: B:276:0x05af  */
                /* JADX WARN: Code duplicated, block: B:278:0x05c3  */
                /* JADX WARN: Code duplicated, block: B:280:0x05ca  */
                /* JADX WARN: Code duplicated, block: B:281:0x05cf  */
                /* JADX WARN: Code duplicated, block: B:283:0x05d2  */
                /* JADX WARN: Code duplicated, block: B:284:0x05d7  */
                /* JADX WARN: Code duplicated, block: B:286:0x05da A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:289:0x05ee  */
                /* JADX WARN: Code duplicated, block: B:292:0x05f7  */
                /* JADX WARN: Code duplicated, block: B:295:0x05fc  */
                /* JADX WARN: Code duplicated, block: B:299:0x0611  */
                /* JADX WARN: Code duplicated, block: B:301:0x061d  */
                /* JADX WARN: Code duplicated, block: B:303:0x0626  */
                /* JADX WARN: Code duplicated, block: B:311:0x064e  */
                /* JADX WARN: Code duplicated, block: B:314:0x0655  */
                /* JADX WARN: Code duplicated, block: B:358:0x0779  */
                /* JADX WARN: Code duplicated, block: B:372:0x07fd  */
                /* JADX WARN: Code duplicated, block: B:374:0x080a  */
                /* JADX WARN: Code duplicated, block: B:386:0x0868  */
                /* JADX WARN: Code duplicated, block: B:389:0x0874  */
                /* JADX WARN: Code duplicated, block: B:391:0x0881  */
                /* JADX WARN: Code duplicated, block: B:407:0x08f6  */
                /* JADX WARN: Code duplicated, block: B:409:0x08fe  */
                /* JADX WARN: Code duplicated, block: B:411:0x090b  */
                /* JADX WARN: Code duplicated, block: B:427:0x0980  */
                /* JADX WARN: Code duplicated, block: B:429:0x0988  */
                /* JADX WARN: Code duplicated, block: B:431:0x0995  */
                /* JADX WARN: Code duplicated, block: B:458:0x0a3f  */
                /* JADX WARN: Code duplicated, block: B:460:0x0a47  */
                /* JADX WARN: Code duplicated, block: B:462:0x0a50  */
                /* JADX WARN: Code duplicated, block: B:464:0x0a5c  */
                /* JADX WARN: Code duplicated, block: B:468:0x0a6f  */
                /* JADX WARN: Code duplicated, block: B:470:0x0a7d  */
                /* JADX WARN: Code duplicated, block: B:471:0x0a82  */
                /* JADX WARN: Code duplicated, block: B:473:0x0a8d  */
                /* JADX WARN: Code duplicated, block: B:474:0x0a92  */
                /* JADX WARN: Code duplicated, block: B:476:0x0aa9  */
                /* JADX WARN: Code duplicated, block: B:478:0x0ab4 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:479:0x0ab6  */
                /* JADX WARN: Code duplicated, block: B:480:0x0abb  */
                /* JADX WARN: Code duplicated, block: B:482:0x0abe  */
                /* JADX WARN: Code duplicated, block: B:483:0x0ac1  */
                /* JADX WARN: Code duplicated, block: B:485:0x0ac5 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:486:0x0ac7  */
                /* JADX WARN: Code duplicated, block: B:487:0x0acc  */
                /* JADX WARN: Code duplicated, block: B:489:0x0acf  */
                /* JADX WARN: Code duplicated, block: B:490:0x0ad2  */
                /* JADX WARN: Code duplicated, block: B:492:0x0ad6  */
                /* JADX WARN: Code duplicated, block: B:493:0x0add  */
                /* JADX WARN: Code duplicated, block: B:495:0x0ae1  */
                /* JADX WARN: Code duplicated, block: B:496:0x0ae6  */
                /* JADX WARN: Code duplicated, block: B:498:0x0ae9  */
                /* JADX WARN: Code duplicated, block: B:499:0x0aee  */
                /* JADX WARN: Code duplicated, block: B:501:0x0af1  */
                /* JADX WARN: Code duplicated, block: B:502:0x0af6  */
                /* JADX WARN: Code duplicated, block: B:504:0x0af9  */
                /* JADX WARN: Code duplicated, block: B:505:0x0afb  */
                /* JADX WARN: Code duplicated, block: B:508:0x0b02  */
                /* JADX WARN: Code duplicated, block: B:511:0x0b0f  */
                /* JADX WARN: Code duplicated, block: B:513:0x0b27  */
                /* JADX WARN: Code duplicated, block: B:516:0x0b48  */
                /* JADX WARN: Code duplicated, block: B:522:0x0b6b  */
                /* JADX WARN: Code duplicated, block: B:528:0x0b88  */
                /* JADX WARN: Code duplicated, block: B:537:0x0bb8  */
                /* JADX WARN: Code duplicated, block: B:540:0x0bc3  */
                /* JADX WARN: Code duplicated, block: B:542:0x0bc6  */
                /* JADX WARN: Code duplicated, block: B:545:0x0bcf  */
                /* JADX WARN: Code duplicated, block: B:548:0x0bd8  */
                /* JADX WARN: Code duplicated, block: B:550:0x0c00  */
                /* JADX WARN: Code duplicated, block: B:552:0x0c2c  */
                /* JADX WARN: Code duplicated, block: B:555:0x0c3d  */
                /* JADX WARN: Code duplicated, block: B:557:0x0c40  */
                /* JADX WARN: Code duplicated, block: B:562:0x0c6a  */
                /* JADX WARN: Code duplicated, block: B:565:0x0c86  */
                /* JADX WARN: Code duplicated, block: B:568:0x0c90  */
                /* JADX WARN: Code duplicated, block: B:570:0x0cb1  */
                /* JADX WARN: Code duplicated, block: B:573:0x0cbe  */
                /* JADX WARN: Code duplicated, block: B:576:0x0cce A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:579:0x0ce8  */
                /* JADX WARN: Code duplicated, block: B:581:0x0cf3  */
                /* JADX WARN: Code duplicated, block: B:583:0x0d02  */
                /* JADX WARN: Code duplicated, block: B:586:0x0d0f  */
                /* JADX WARN: Code duplicated, block: B:588:0x0d13  */
                /* JADX WARN: Code duplicated, block: B:589:0x0d1a  */
                /* JADX WARN: Code duplicated, block: B:591:0x0d1e  */
                /* JADX WARN: Code duplicated, block: B:595:0x0d2d  */
                /* JADX WARN: Code duplicated, block: B:597:0x0d38  */
                /* JADX WARN: Code duplicated, block: B:599:0x0d51  */
                /* JADX WARN: Code duplicated, block: B:601:0x0d68  */
                /* JADX WARN: Code duplicated, block: B:602:0x0d78  */
                /* JADX WARN: Code duplicated, block: B:604:0x0d87  */
                /* JADX WARN: Code duplicated, block: B:606:0x0d8b  */
                /* JADX WARN: Code duplicated, block: B:607:0x0d90  */
                /* JADX WARN: Code duplicated, block: B:609:0x0d93  */
                /* JADX WARN: Code duplicated, block: B:610:0x0d98  */
                /* JADX WARN: Code duplicated, block: B:612:0x0da6  */
                /* JADX WARN: Code duplicated, block: B:614:0x0dac  */
                /* JADX WARN: Code duplicated, block: B:615:0x0db5  */
                /* JADX WARN: Code duplicated, block: B:617:0x0dd0  */
                /* JADX WARN: Code duplicated, block: B:618:0x0dd7  */
                /* JADX WARN: Code duplicated, block: B:620:0x0ddb  */
                /* JADX WARN: Code duplicated, block: B:623:0x0de4  */
                /* JADX WARN: Code duplicated, block: B:626:0x0def  */
                /* JADX WARN: Code duplicated, block: B:627:0x0df3  */
                /* JADX WARN: Code duplicated, block: B:630:0x0e00  */
                /* JADX WARN: Code duplicated, block: B:631:0x0e04  */
                /* JADX WARN: Code duplicated, block: B:634:0x0e23  */
                /* JADX WARN: Code duplicated, block: B:635:0x0e28  */
                /* JADX WARN: Code duplicated, block: B:638:0x0e2f A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:639:0x0e31  */
                /* JADX WARN: Code duplicated, block: B:640:0x0e36  */
                /* JADX WARN: Code duplicated, block: B:642:0x0e39  */
                /* JADX WARN: Code duplicated, block: B:643:0x0e3c  */
                /* JADX WARN: Code duplicated, block: B:645:0x0e40 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:646:0x0e42  */
                /* JADX WARN: Code duplicated, block: B:647:0x0e47  */
                /* JADX WARN: Code duplicated, block: B:649:0x0e4a  */
                /* JADX WARN: Code duplicated, block: B:650:0x0e4d  */
                /* JADX WARN: Code duplicated, block: B:652:0x0e51 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:653:0x0e53  */
                /* JADX WARN: Code duplicated, block: B:654:0x0e58  */
                /* JADX WARN: Code duplicated, block: B:656:0x0e5b  */
                /* JADX WARN: Code duplicated, block: B:657:0x0e5e  */
                /* JADX WARN: Code duplicated, block: B:660:0x0e64  */
                /* JADX WARN: Code duplicated, block: B:666:0x0e72 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:667:0x0e74  */
                /* JADX WARN: Code duplicated, block: B:670:0x0e7f  */
                /* JADX WARN: Code duplicated, block: B:674:0x0e96  */
                /* JADX WARN: Code duplicated, block: B:679:0x0ea9  */
                /* JADX WARN: Code duplicated, block: B:681:0x0ead  */
                /* JADX WARN: Code duplicated, block: B:684:0x0eba  */
                /* JADX WARN: Code duplicated, block: B:686:0x0ed1  */
                /* JADX WARN: Code duplicated, block: B:688:0x0ee3  */
                /* JADX WARN: Code duplicated, block: B:690:0x0eeb  */
                /* JADX WARN: Code duplicated, block: B:691:0x0ef0  */
                /* JADX WARN: Code duplicated, block: B:693:0x0ef8  */
                /* JADX WARN: Code duplicated, block: B:695:0x0f07  */
                /* JADX WARN: Code duplicated, block: B:697:0x0f15  */
                /* JADX WARN: Code duplicated, block: B:703:0x0f3c  */
                /* JADX WARN: Code duplicated, block: B:705:0x0f4a  */
                /* JADX WARN: Code duplicated, block: B:712:0x0f74  */
                /* JADX WARN: Code duplicated, block: B:713:0x0f8a  */
                /* JADX WARN: Code duplicated, block: B:715:0x0f99  */
                /* JADX WARN: Code duplicated, block: B:717:0x0fa0  */
                /* JADX WARN: Code duplicated, block: B:719:0x0fa7  */
                /* JADX WARN: Code duplicated, block: B:722:0x0fc2  */
                /* JADX WARN: Code duplicated, block: B:726:0x0ff8 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:731:0x0fc5 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:778:0x0b53 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:780:0x0b42 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:783:0x0b7a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:785:0x0b65 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:787:0x0b94 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:791:0x0b82 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:79:0x0140  */
                /* JADX WARN: Code duplicated, block: B:81:0x014e  */
                /* JADX WARN: Code duplicated, block: B:82:0x0151  */
                /* JADX WARN: Code duplicated, block: B:84:0x0154  */
                /* JADX WARN: Code duplicated, block: B:85:0x0159  */
                /* JADX WARN: Code duplicated, block: B:88:0x0175  */
                /* JADX WARN: Code duplicated, block: B:91:0x017c  */
                /* JADX WARN: Code duplicated, block: B:94:0x0181  */
                /* JADX WARN: Code duplicated, block: B:97:0x0188  */
                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    am.x0 x0VarH;
                    u13.a aVar;
                    r53.j jVar;
                    nr.i iVar;
                    nr.k0 k0Var;
                    nr.n0 n0Var;
                    ps.i0 i0Var;
                    nr.a aVar2;
                    nr.j0 j0Var;
                    Iterable iterableA;
                    ArrayList arrayList;
                    Iterator it;
                    nr.t.g gVar;
                    u13.a aVar3;
                    jr.f fVar;
                    nr.t tVar;
                    nr.t.f fVar2;
                    boolean z14;
                    boolean z15;
                    nr.p pVar;
                    nr.j jVarX4;
                    sr.b bVar;
                    ls.a aVar4;
                    SegmentDetailsListDTO segmentDetailsListDTO;
                    List<ps.r> list;
                    List<jr.m> list2;
                    ps.r rVar;
                    ps.s0 s0Var;
                    ps.s0 s0Var2;
                    com.garmin.android.apps.connectmobile.activities.newmodel.f fVar3;
                    com.garmin.android.apps.connectmobile.activities.newmodel.f fVar4;
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar;
                    ArrayList arrayList2;
                    boolean z16;
                    yo1.j jVar2;
                    yo1.f fVar5;
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
                    com.garmin.android.apps.connectmobile.userprofile.model.l lVar2;
                    ArrayList arrayListK;
                    List<pe0.a> list3;
                    List<mr.p> list4;
                    qr.a aVar5;
                    List<ps.r> list5;
                    h hVar;
                    ps.q1 summaryDTO;
                    PrivacyType privacyTypeB;
                    PrivacyType privacyType;
                    boolean zJ;
                    List<jr.m> list6;
                    jr.k kVarC;
                    int i14;
                    List<SimpleBadgeDTO> list7;
                    char c14;
                    t tVar2;
                    Object objO5;
                    ps.a1 metadataDTO;
                    ps.k0 diveInfoDTO;
                    String buddy;
                    ps.k0 diveInfoDTO2;
                    String equipment;
                    wg0.l lVarA;
                    ps.a1 metadataDTO2;
                    boolean zC0;
                    am.x0 x0VarH2;
                    c22.c3 c3Var;
                    int i15;
                    int i16;
                    DateTime dateTimeW4;
                    boolean z17;
                    boolean z18;
                    boolean z19;
                    ps.a2 userInfoDto;
                    String strZ;
                    ps.a1 metadataDTO3;
                    String fullName;
                    boolean zC1;
                    ps.a1 metadataDTO4;
                    ps.a1 metadataDTO5;
                    ps.a2 userInfoDto2;
                    com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
                    Long parentId;
                    Long parentId2;
                    Long parentId3;
                    am.x0 x0VarH3;
                    Object objN5;
                    Long activityId;
                    am.x0 x0VarH4;
                    String groupRideUUID;
                    String activityName;
                    ps.a2 userInfoDto3;
                    Object objU5;
                    ps.a1 metadataDTO6;
                    ps.a1 metadataDTO7;
                    boolean zB;
                    boolean zC2;
                    ds.f fVar6;
                    ps.a1 metadataDTO8;
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    HashSet hashSet;
                    ArrayList<nr.m0> arrayList5;
                    String typeKey;
                    boolean z24;
                    boolean zG;
                    ps.a1 metadataDTO9;
                    ps.p0 eventTypeDTO;
                    String str;
                    boolean z25;
                    boolean z26;
                    String description;
                    String activityName2;
                    am.x0 x0VarH5;
                    Long parentId4;
                    boolean z27;
                    boolean zC3;
                    ps.a1 metadataDTO10;
                    Long parentId5;
                    Long parentId6;
                    ExerciseSetsDTO exerciseSetsDTOQ;
                    t tVar3;
                    ps.a1 metadataDTO11;
                    String profileImageUrlMedium;
                    ps.a2 userInfoDto4;
                    ArrayList arrayList6;
                    Object aVar6;
                    List<ps.r0> listD;
                    boolean zH;
                    ArrayList arrayList7;
                    List<ps.r0> listD2;
                    ArrayList arrayList8;
                    List<ps.r0> listD3;
                    ArrayList arrayList9;
                    List<ps.r0> listD4;
                    t tVar4;
                    ArrayList<ps.r0> arrayList10;
                    List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF;
                    ArrayList arrayList11;
                    ArrayList arrayList12;
                    List<ps.r0> listD5;
                    t tVar5;
                    char c15;
                    char c16;
                    Double startLatitude;
                    Double startLongitude;
                    Object rVar2;
                    u4.d dVar;
                    boolean zG2;
                    ps.a1 metadataDTO12;
                    am.x0 x0VarH6;
                    String startTimeLocal;
                    boolean zG3;
                    Object objJ;
                    Double d14;
                    Object objJ2;
                    Double d15;
                    Object objJ3;
                    Double d16;
                    l22.a aVar7;
                    String strB;
                    double dDoubleValue;
                    Integer numValueOf;
                    Double bottomTime;
                    Double bottomTime2;
                    hb2.g.a aVar8;
                    boolean zF;
                    int i17;
                    jr.i itemDetails;
                    jr.j jVarC;
                    int i18;
                    int i19;
                    ArrayList arrayListJ5;
                    jr.i itemDetails2;
                    jr.j jVarC2;
                    jr.i itemDetails3;
                    String string;
                    jr.j jVarC3;
                    hb2.g.a aVar9;
                    boolean zF2;
                    int i24;
                    ArrayList arrayList13;
                    o13.t tVar6;
                    l22.a aVar10;
                    DateTime dateTimeQ;
                    String strG;
                    String strB2;
                    String str2;
                    Double d17;
                    String strB3;
                    DateTime dateTimeQ2;
                    ps.a accessControlRuleDTO;
                    ps.p pVar2;
                    List<ps.x1> listI;
                    nr.o oVar;
                    nr.o oVar2;
                    nr.o oVar3;
                    com.garmin.android.apps.connectmobile.activities.newmodel.f fVar7;
                    jr.d dVar2;
                    nr.o oVar4;
                    u13.a aVar11 = u13.a.COROUTINE_SUSPENDED;
                    int i25 = this.f146703a;
                    if (i25 == 0) {
                        o13.r.b(obj);
                        r53.j jVar3 = this.f146704b;
                        Object[] objArr = this.f146705c;
                        Object obj2 = objArr[0];
                        nr.c cVar2 = obj2 instanceof nr.c ? (nr.c) obj2 : null;
                        Object obj3 = objArr[1];
                        nr.v vVar = obj3 instanceof nr.v ? (nr.v) obj3 : null;
                        Object obj4 = objArr[2];
                        nr.j0 j0Var2 = obj4 instanceof nr.j0 ? (nr.j0) obj4 : null;
                        Object obj5 = objArr[3];
                        obj5.getClass();
                        nr.u0 u0Var = (nr.u0) obj5;
                        Object obj6 = objArr[4];
                        obj6.getClass();
                        nr.k0 k0Var2 = (nr.k0) obj6;
                        Object obj7 = objArr[5];
                        nr.n0 n0Var2 = obj7 instanceof nr.n0 ? (nr.n0) obj7 : null;
                        Object obj8 = objArr[6];
                        ps.i0 i0Var2 = obj8 instanceof ps.i0 ? (ps.i0) obj8 : null;
                        Object obj9 = objArr[7];
                        obj9.getClass();
                        nr.i iVar2 = (nr.i) obj9;
                        bm2.c cVar3 = (bm2.c) objArr[8];
                        nr.a aVar12 = cVar2 != null ? cVar2.f126996a : null;
                        ps.r rVar3 = (aVar12 == null || (oVar4 = aVar12.f126975b) == null) ? null : oVar4.f127269a;
                        wg0.m mVar = k0Var2.f127241b;
                        List<SimpleBadgeDTO> list8 = k0Var2.f127242c;
                        if (rVar3 == null || (x0VarH = rVar3.h()) == null) {
                            x0VarH = am.x0.f4346x;
                        }
                        mr.s0 s0Var3 = (aVar12 == null || (dVar2 = aVar12.f126974a) == null) ? null : new mr.s0(x0VarH, dVar2);
                        if (n0Var2 != null && (fVar7 = n0Var2.f127265a) != null) {
                            jg.b.M(fVar7, n0Var2.f127267c);
                        }
                        t tVar7 = this.f146706d;
                        if (s0Var3 != null) {
                            boolean z28 = tVar7.B;
                            boolean z29 = tVar7.a5().getValue().f127278b || tVar7.Q5(rVar3);
                            ps.s0 s0Var4 = n0Var2 != null ? n0Var2.f127266b : null;
                            mr.c cVar4 = s0Var3.f120305b.f120241c;
                            if (cVar4 != null) {
                                jr.d dVar3 = s0Var3.f120304a;
                                aVar = aVar11;
                                jVar = jVar3;
                                iVar = iVar2;
                                nr.a aVar13 = aVar12;
                                i0Var = i0Var2;
                                k0Var = k0Var2;
                                n0Var = n0Var2;
                                ps.r rVar4 = rVar3;
                                iterableA = cVar4.a(dVar3, rVar4, vVar, z28, z29, s0Var4, aVar13, j0Var2);
                                rVar3 = rVar4;
                                aVar2 = aVar13;
                                j0Var = j0Var2;
                                if (iterableA == null) {
                                }
                                if (iterableA == null) {
                                }
                                arrayList = new ArrayList();
                                it = iterableA.iterator();
                                while (it.hasNext()) {
                                    fVar = (jr.f) it.next();
                                    tVar = iVar.f127191a;
                                    nr.i iVar3 = iVar;
                                    if (tVar instanceof nr.t.f) {
                                        fVar2 = (nr.t.f) tVar;
                                    } else {
                                        fVar2 = null;
                                    }
                                    if (fVar2 != null) {
                                        z14 = fVar2.f127340e;
                                    } else {
                                        z14 = false;
                                    }
                                    z15 = k0Var.f127240a;
                                    pVar = k0Var.f127243d;
                                    jVarX4 = t.x4(tVar7, rVar3, n0Var, cVar2, i0Var);
                                    ps.i0 i0Var3 = i0Var;
                                    bVar = tVar7.f146541n;
                                    nr.c cVar5 = cVar2;
                                    aVar4 = jVarX4.f127205a;
                                    segmentDetailsListDTO = k0Var.f127244e;
                                    if (aVar2 != null || (oVar3 = aVar2.f126975b) == null) {
                                        list = null;
                                    } else {
                                        list = oVar3.f127271c;
                                    }
                                    Iterator it3 = it;
                                    if (aVar2 != null || (oVar2 = aVar2.f126975b) == null) {
                                        list2 = null;
                                    } else {
                                        list2 = oVar2.f127272d;
                                    }
                                    rVar = rVar3;
                                    if (n0Var != null) {
                                        s0Var = n0Var.f127266b;
                                    } else {
                                        s0Var = null;
                                    }
                                    s0Var2 = s0Var;
                                    if (n0Var != null) {
                                        fVar3 = n0Var.f127265a;
                                    } else {
                                        fVar3 = null;
                                    }
                                    fVar4 = fVar3;
                                    if (n0Var != null) {
                                        cVar = n0Var.f127267c;
                                    } else {
                                        cVar = null;
                                    }
                                    arrayList2 = arrayList;
                                    if (n0Var != null) {
                                        z16 = n0Var.f127268d;
                                    } else {
                                        z16 = false;
                                    }
                                    nr.n0 n0Var3 = n0Var;
                                    jVar2 = k0Var.f127245f;
                                    fVar5 = k0Var.f127246g;
                                    if (aVar2 != null || (oVar = aVar2.f126975b) == null) {
                                        lVar = null;
                                    } else {
                                        lVar = oVar.f127270b;
                                    }
                                    lVar2 = lVar;
                                    if (aVar2 != null || (pVar2 = aVar2.f126977d) == null || (listI = pVar2.i()) == null) {
                                        arrayListK = null;
                                    } else {
                                        arrayListK = w02.b0.k(listI);
                                    }
                                    list3 = k0Var.f127247h;
                                    nr.a aVar14 = aVar2;
                                    list4 = k0Var.f127248i;
                                    nr.k0 k0Var3 = k0Var;
                                    aVar5 = tVar7.f146550q;
                                    list5 = list;
                                    hVar = tVar7.f146546o2;
                                    if (rVar != null) {
                                        summaryDTO = rVar.getSummaryDTO();
                                    } else {
                                        summaryDTO = null;
                                    }
                                    if (rVar == null) {
                                        privacyTypeB = PrivacyType.EVERYONE;
                                    } else {
                                        accessControlRuleDTO = rVar.getAccessControlRuleDTO();
                                        if (accessControlRuleDTO != null) {
                                            privacyTypeB = accessControlRuleDTO.b();
                                        } else {
                                            privacyTypeB = PrivacyType.EVERYONE;
                                        }
                                        if (privacyTypeB == null) {
                                            privacyTypeB = PrivacyType.EVERYONE;
                                        }
                                    }
                                    privacyType = privacyTypeB;
                                    zJ = oe2.f.J(rVar);
                                    list6 = list2;
                                    kVarC = fVar.c();
                                    if (kVarC == null) {
                                        i14 = -1;
                                    } else {
                                        i14 = c.f146595c[kVarC.ordinal()];
                                    }
                                    list7 = list8;
                                    int i26 = 10;
                                    switch (i14) {
                                        case 1:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            list7 = list7;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            objO5 = tVar2.o5(list5, list6);
                                            break;
                                        case 2:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            if (rVar != null) {
                                                metadataDTO = rVar.getMetadataDTO();
                                            } else {
                                                metadataDTO = null;
                                            }
                                            list7 = list7;
                                            objO5 = tVar2.Z4(list7, metadataDTO);
                                            break;
                                        case 3:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            objO5 = tVar2.i5(list3, zJ);
                                            list7 = list7;
                                            break;
                                        case 4:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            if (rVar != null && (diveInfoDTO = rVar.getDiveInfoDTO()) != null && (buddy = diveInfoDTO.getBuddy()) != null) {
                                                jr.k kVar = jr.k.DIVE_BUDDY;
                                                c14 = 6;
                                                objO5 = new nr.g.r(kVar, sr.b.h(bVar, kVar, null, 6), null, buddy, 4, null);
                                                list7 = list7;
                                            }
                                            c14 = 6;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                        case 5:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            if (rVar != null && (diveInfoDTO2 = rVar.getDiveInfoDTO()) != null && (equipment = diveInfoDTO2.getEquipment()) != null) {
                                                jr.k kVar2 = jr.k.DIVE_EQUIPMENT;
                                                objO5 = new nr.g.r(kVar2, sr.b.h(bVar, kVar2, null, 6), null, equipment, 4, null);
                                                list7 = list7;
                                                c14 = 6;
                                            }
                                            c14 = 6;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                        case 6:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            long j8 = tVar2.f146575z;
                                            if (rVar != null) {
                                                os.a aVar15 = tVar2.Z;
                                                metadataDTO2 = rVar.getMetadataDTO();
                                                if (metadataDTO2 != null) {
                                                    zC0 = metadataDTO2.C0();
                                                } else {
                                                    zC0 = false;
                                                }
                                                lVarA = pr.a.a(rVar, j0Var, aVar15, zC0);
                                            } else {
                                                lVarA = null;
                                            }
                                            objO5 = new nr.g.l(j8, lVarA, tVar2.f146540m2, z15);
                                            list7 = list7;
                                            c14 = 6;
                                            break;
                                        case 7:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            sr.m mVar2 = (sr.m) bVar.f160550k.getValue();
                                            if (rVar != null) {
                                                x0VarH2 = rVar.h();
                                            } else {
                                                x0VarH2 = null;
                                            }
                                            if (rVar != null || (x0VarH3 = rVar.h()) == null) {
                                                c3Var = null;
                                            } else {
                                                c3Var = x0VarH3.f4360c;
                                            }
                                            String strC = mVar2.c(c3Var);
                                            if (oe2.f.G(rVar)) {
                                                i15 = R.drawable.star_filled;
                                            } else {
                                                i15 = R.drawable.star_outlined;
                                            }
                                            Integer numValueOf2 = Integer.valueOf(i15);
                                            if (oe2.f.G(rVar)) {
                                                i16 = R.color.gcm_favorite_activity;
                                            } else {
                                                i16 = R.color.gcm_icon_secondary;
                                            }
                                            Integer numValueOf3 = Integer.valueOf(i16);
                                            g3 g3Var = new g3(tVar2);
                                            qr.o oVar5 = new qr.o(tVar2, rVar, 0);
                                            ph1.d dVar4 = new ph1.d(16, tVar2, privacyType);
                                            String strB4 = mVar2.b(privacyType);
                                            if (summaryDTO != null) {
                                                dateTimeW4 = summaryDTO.W4();
                                            } else {
                                                dateTimeW4 = null;
                                            }
                                            String strA = mVar2.a(dateTimeW4);
                                            if (zJ) {
                                                if (rVar != null) {
                                                    parentId3 = rVar.getParentId();
                                                } else {
                                                    parentId3 = null;
                                                }
                                                if (parentId3 == null) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                            } else {
                                                z17 = false;
                                            }
                                            if (zJ) {
                                                if (rVar != null) {
                                                    parentId2 = rVar.getParentId();
                                                } else {
                                                    parentId2 = null;
                                                }
                                                if (parentId2 == null) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                            } else {
                                                z18 = false;
                                            }
                                            if (zJ) {
                                                if (rVar != null) {
                                                    parentId = rVar.getParentId();
                                                } else {
                                                    parentId = null;
                                                }
                                                if (parentId == null) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                            } else {
                                                z19 = false;
                                            }
                                            if (lVar2 != 0 || (profileImageUrls = lVar2.getProfileImageUrls()) == null || (strZ = profileImageUrls.f46877f) == null) {
                                                if (rVar != null || (metadataDTO3 = rVar.getMetadataDTO()) == null) {
                                                    userInfoDto = null;
                                                } else {
                                                    userInfoDto = metadataDTO3.getUserInfoDto();
                                                }
                                                strZ = oe2.f.z(userInfoDto);
                                            }
                                            b12.b bVar2 = new b12.b(strZ, null, null, null, null, 30, null);
                                            if (rVar != null || (metadataDTO5 = rVar.getMetadataDTO()) == null || (userInfoDto2 = metadataDTO5.getUserInfoDto()) == null) {
                                                fullName = null;
                                            } else {
                                                fullName = userInfoDto2.getFullName();
                                            }
                                            if (rVar != null || (metadataDTO4 = rVar.getMetadataDTO()) == null) {
                                                zC1 = false;
                                            } else {
                                                zC1 = metadataDTO4.C0();
                                            }
                                            objO5 = new nr.g.m(zJ, x0VarH2, strC, numValueOf2, numValueOf3, g3Var, oVar5, dVar4, strB4, privacyType, strA, zJ, z17, z18, z19, bVar2, fullName, zC1);
                                            list7 = list7;
                                            c14 = 6;
                                            break;
                                        case 8:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            if (!pVar.f127278b) {
                                                if (tVar2.Q5(rVar)) {
                                                    objN5 = tVar2.n5(rVar, bVar.b());
                                                }
                                                c14 = 6;
                                                list7 = list7;
                                                objO5 = null;
                                            } else {
                                                List<nr.m0> list9 = pVar.f127277a;
                                                if (rVar != null) {
                                                    activityId = rVar.getActivityId();
                                                } else {
                                                    activityId = null;
                                                }
                                                if (rVar != null) {
                                                    x0VarH4 = rVar.h();
                                                } else {
                                                    x0VarH4 = null;
                                                }
                                                objN5 = tVar2.r5(list9, activityId, x0VarH4, (sr.n) bVar.f160548i.getValue());
                                            }
                                            objO5 = objN5;
                                            c14 = 6;
                                            break;
                                        case 9:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            objN5 = tVar2.w5(u0Var);
                                            objO5 = objN5;
                                            c14 = 6;
                                            break;
                                        case 10:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            objN5 = tVar2.q5(fVar, jVarX4, true);
                                            objO5 = objN5;
                                            c14 = 6;
                                            break;
                                        case 11:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            objO5 = tVar2.q5(fVar, jVarX4, false);
                                            list7 = list7;
                                            c14 = 6;
                                            break;
                                        case 12:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            t tVar8 = tVar7;
                                            rVar = rVar;
                                            if (rVar != null || (metadataDTO7 = rVar.getMetadataDTO()) == null) {
                                                groupRideUUID = null;
                                            } else {
                                                groupRideUUID = metadataDTO7.getGroupRideUUID();
                                            }
                                            if (rVar != null) {
                                                activityName = rVar.getActivityName();
                                            } else {
                                                activityName = null;
                                            }
                                            if (rVar != null || (metadataDTO6 = rVar.getMetadataDTO()) == null) {
                                                userInfoDto3 = null;
                                            } else {
                                                userInfoDto3 = metadataDTO6.getUserInfoDto();
                                            }
                                            objU5 = tVar8.u5(jVar2, groupRideUUID, activityName, fVar5, zJ, userInfoDto3);
                                            tVar2 = tVar8;
                                            objO5 = objU5;
                                            c14 = 6;
                                            break;
                                        case 13:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            String strT = tVar2.A.t();
                                            am.z0 z0Var = am.z0.f4390a;
                                            zB = am.z0.b(am.x0.D, strT);
                                            long j14 = tVar2.f146575z;
                                            f fVar8 = tVar2.f146549p2;
                                            if (rVar != null || (metadataDTO8 = rVar.getMetadataDTO()) == null) {
                                                zC2 = false;
                                            } else {
                                                zC2 = metadataDTO8.C0();
                                            }
                                            qr.o oVar6 = new qr.o(rVar, tVar2);
                                            ds.f fVar9 = new ds.f(tVar2, 16);
                                            if (zB && zJ) {
                                                fVar6 = new ds.f(tVar2, 17);
                                            } else {
                                                fVar6 = null;
                                            }
                                            wg0.m mVar3 = mVar;
                                            mVar = mVar3;
                                            objO5 = new nr.g.s(zJ, z14, j14, mVar3, fVar8, zC2, oVar6, fVar9, fVar6);
                                            c14 = 6;
                                            break;
                                        case 14:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            int i27 = 3;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            arrayList3 = new ArrayList();
                                            List<nr.m0> list10 = pVar.f127277a;
                                            arrayList4 = new ArrayList();
                                            for (Object obj10 : list10) {
                                                if (!((nr.m0) obj10).f127260c) {
                                                    arrayList4.add(obj10);
                                                }
                                            }
                                            hashSet = new HashSet();
                                            arrayList5 = new ArrayList();
                                            for (Object obj11 : arrayList4) {
                                                if (hashSet.add(((nr.m0) obj11).f127262e)) {
                                                    arrayList5.add(obj11);
                                                }
                                            }
                                            for (nr.m0 m0Var : arrayList5) {
                                                str = m0Var.f127261d;
                                                String str3 = m0Var.f127261d;
                                                if (str == null && m0Var.f127262e != null) {
                                                    arrayList3.add(new nr.s0(str3, ((sr.n) bVar.f160548i.getValue()).a(str3), zJ ? new qn0.f(i27, tVar2, m0Var) : null));
                                                }
                                            }
                                            if (rVar != null || (eventTypeDTO = rVar.getEventTypeDTO()) == null) {
                                                typeKey = null;
                                            } else {
                                                typeKey = eventTypeDTO.getTypeKey();
                                            }
                                            if (typeKey == null && qs.h.a(typeKey)) {
                                                z24 = true;
                                            } else {
                                                z24 = false;
                                            }
                                            if (z24) {
                                                bVar.getClass();
                                                typeKey.getClass();
                                                l22.a aVar16 = bVar.f160541b;
                                                arrayList3.add(new nr.s0(typeKey, aVar16.a(R.string.string_space_string_pattern, aVar16.getString(R.string.lbl_event), typeKey), null, 4, null));
                                            }
                                            if (jVar2 != null) {
                                                String str4 = qs.g.GROUP_RIDE.f147086c;
                                                bVar.getClass();
                                                str4.getClass();
                                                l22.a aVar17 = bVar.f160541b;
                                                arrayList3.add(new nr.s0(str4, aVar17.a(R.string.string_space_string_pattern, aVar17.getString(R.string.lbl_event), str4), null, 4, null));
                                            }
                                            if (rVar != null || (metadataDTO9 = rVar.getMetadataDTO()) == null) {
                                                zG = false;
                                            } else {
                                                zG = p005kotlin.jvm.internal.s.g(metadataDTO9.getHasDog(), Boolean.TRUE);
                                            }
                                            if (zG && tVar2.f146563v.H0()) {
                                                Context context = bVar.f160540a;
                                                c22.x0.f23314a.getClass();
                                                String str5 = c22.x0.f23391e8;
                                                arrayList3.add(new nr.s0(dh.b.D(context, str5), dh.b.D(bVar.f160540a, str5), null));
                                            }
                                            if (!list4.isEmpty()) {
                                                arrayList3.add(new nr.s0(bVar.c(), null, null, 6, null));
                                            }
                                            if (!arrayList3.isEmpty()) {
                                                objU5 = new nr.g.v(arrayList3);
                                                objO5 = objU5;
                                                c14 = 6;
                                            }
                                            c14 = 6;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                        case 15:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            if (zJ) {
                                                if (rVar != null) {
                                                    parentId6 = rVar.getParentId();
                                                } else {
                                                    parentId6 = null;
                                                }
                                                if (parentId6 == null) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                            } else {
                                                z25 = false;
                                            }
                                            if (zJ) {
                                                if (rVar != null) {
                                                    parentId5 = rVar.getParentId();
                                                } else {
                                                    parentId5 = null;
                                                }
                                                if (parentId5 == null) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                            } else {
                                                z26 = false;
                                            }
                                            if (rVar != null) {
                                                description = rVar.getDescription();
                                            } else {
                                                description = null;
                                            }
                                            if (rVar != null) {
                                                activityName2 = rVar.getActivityName();
                                            } else {
                                                activityName2 = null;
                                            }
                                            if (rVar != null) {
                                                x0VarH5 = rVar.h();
                                            } else {
                                                x0VarH5 = null;
                                            }
                                            if (rVar != null) {
                                                parentId4 = rVar.getParentId();
                                            } else {
                                                parentId4 = null;
                                            }
                                            if (parentId4 != null) {
                                                z27 = true;
                                            } else {
                                                z27 = false;
                                            }
                                            String strE = bVar.e(activityName2, x0VarH5, z27);
                                            if (rVar != null || (metadataDTO10 = rVar.getMetadataDTO()) == null) {
                                                zC3 = false;
                                            } else {
                                                zC3 = metadataDTO10.C0();
                                            }
                                            objO5 = new nr.g.e(zJ, description, z25, z26, zC3, strE, new q72.f(4, tVar2, rVar));
                                            c14 = 6;
                                            break;
                                        case 16:
                                            cVar3 = cVar3;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            if (s0Var2 != null) {
                                                exerciseSetsDTOQ = dh.b.Q(s0Var2);
                                            } else {
                                                exerciseSetsDTOQ = null;
                                            }
                                            objO5 = new nr.g.n(dh.b.E(exerciseSetsDTOQ, tVar2.Y4().getValue()), z16, tVar2.f146543n2);
                                            c14 = 6;
                                            break;
                                        case 17:
                                            tVar3 = tVar7;
                                            cVar3 = cVar3;
                                            rVar = rVar;
                                            if (summaryDTO != null) {
                                                long j15 = tVar3.f146575z;
                                                long jC5 = summaryDTO.c5();
                                                metadataDTO11 = rVar.getMetadataDTO();
                                                if (metadataDTO11 != null || (userInfoDto4 = metadataDTO11.getUserInfoDto()) == null) {
                                                    profileImageUrlMedium = null;
                                                } else {
                                                    profileImageUrlMedium = userInfoDto4.getProfileImageUrlMedium();
                                                }
                                                objO5 = tVar3.x5(u0Var, j15, jC5, profileImageUrlMedium, zJ);
                                                tVar2 = tVar3;
                                                c14 = 6;
                                            } else {
                                                tVar2 = tVar3;
                                                c14 = 6;
                                                list7 = list7;
                                                objO5 = null;
                                            }
                                            break;
                                        case 18:
                                            sr.i iVarD = bVar.d();
                                            if (s0Var2 != null || (listD = s0Var2.d()) == null) {
                                                arrayList6 = null;
                                            } else {
                                                ArrayList arrayList14 = new ArrayList();
                                                for (Object obj12 : listD) {
                                                    if (((ps.r0) obj12).j() == qs.i.ACTIVE) {
                                                        arrayList14.add(obj12);
                                                    }
                                                }
                                                arrayList6 = new ArrayList(p13.y.r(arrayList14, 10));
                                                Iterator it4 = arrayList14.iterator();
                                                while (it4.hasNext()) {
                                                    ps.r0 r0Var = (ps.r0) it4.next();
                                                    if (cVar != null) {
                                                        ps.q0 q0VarH = r0Var.h();
                                                        zH = cVar.H(q0VarH != null ? q0VarH.getCategory() : null, r0Var.f());
                                                    } else {
                                                        zH = false;
                                                    }
                                                    long weight = zH ? -1L : r0Var.getWeight();
                                                    String strD = iVarD.d(ls.e.EXERCISE_NAME, r0Var.f140205l);
                                                    String strD2 = iVarD.d(ls.e.TOTAL_TIME, r0Var.getDuration());
                                                    ls.e eVar = ls.e.TOTAL_REPS;
                                                    Long repCount = r0Var.getRepCount();
                                                    Iterator it5 = it4;
                                                    arrayList6.add(new nr.b0(0, strD, strD2, iVarD.d(eVar, repCount != null ? Integer.valueOf((int) repCount.longValue()) : null), iVarD.b(weight), false, 33, null));
                                                    it4 = it5;
                                                }
                                            }
                                            aVar6 = new nr.g.u.a(arrayList6, zJ, zJ, hVar);
                                            objO5 = aVar6;
                                            tVar2 = tVar7;
                                            c14 = 6;
                                            break;
                                        case 19:
                                            sr.i iVarD2 = bVar.d();
                                            if (s0Var2 != null || (listD2 = s0Var2.d()) == null) {
                                                arrayList7 = null;
                                            } else {
                                                ArrayList<ps.r0> arrayList15 = new ArrayList();
                                                for (Object obj13 : listD2) {
                                                    if (((ps.r0) obj13).j() == qs.i.ACTIVE) {
                                                        arrayList15.add(obj13);
                                                    }
                                                }
                                                arrayList7 = new ArrayList(p13.y.r(arrayList15, 10));
                                                for (ps.r0 r0Var2 : arrayList15) {
                                                    String strD3 = iVarD2.d(ls.e.EXERCISE_NAME, r0Var2.f140205l);
                                                    String strD4 = iVarD2.d(ls.e.TOTAL_TIME, r0Var2.getDuration());
                                                    ls.e eVar2 = ls.e.TOTAL_REPS;
                                                    Long repCount2 = r0Var2.getRepCount();
                                                    arrayList7.add(new nr.c0(strD3, strD4, iVarD2.d(eVar2, repCount2 != null ? Integer.valueOf((int) repCount2.longValue()) : null)));
                                                }
                                            }
                                            aVar6 = new nr.g.u.c(arrayList7, zJ, hVar);
                                            objO5 = aVar6;
                                            tVar2 = tVar7;
                                            c14 = 6;
                                            break;
                                        case 20:
                                            sr.i iVarD3 = bVar.d();
                                            if (s0Var2 != null || (listD3 = s0Var2.d()) == null) {
                                                arrayList8 = null;
                                            } else {
                                                ArrayList<ps.r0> arrayList16 = new ArrayList();
                                                for (Object obj14 : listD3) {
                                                    if (((ps.r0) obj14).j() == qs.i.ACTIVE) {
                                                        arrayList16.add(obj14);
                                                    }
                                                }
                                                arrayList8 = new ArrayList(p13.y.r(arrayList16, 10));
                                                for (ps.r0 r0Var3 : arrayList16) {
                                                    String strD5 = iVarD3.d(ls.e.EXERCISE_NAME, r0Var3.f140205l);
                                                    String strD6 = iVarD3.d(ls.e.TOTAL_TIME, r0Var3.getDuration());
                                                    ls.e eVar3 = ls.e.TOTAL_REPS;
                                                    Long repCount3 = r0Var3.getRepCount();
                                                    arrayList8.add(new nr.c0(strD5, strD6, iVarD3.d(eVar3, repCount3 != null ? Integer.valueOf((int) repCount3.longValue()) : null)));
                                                }
                                            }
                                            aVar6 = new nr.g.u.b(arrayList8, zJ, hVar);
                                            objO5 = aVar6;
                                            tVar2 = tVar7;
                                            c14 = 6;
                                            break;
                                        case 21:
                                            sr.i iVarD4 = bVar.d();
                                            if (s0Var2 != null || (listD4 = s0Var2.d()) == null) {
                                                arrayList9 = null;
                                            } else {
                                                ArrayList<ps.r0> arrayList17 = new ArrayList();
                                                for (Object obj15 : listD4) {
                                                    if (((ps.r0) obj15).j() == qs.i.ACTIVE) {
                                                        arrayList17.add(obj15);
                                                    }
                                                }
                                                arrayList9 = new ArrayList(p13.y.r(arrayList17, 10));
                                                for (ps.r0 r0Var4 : arrayList17) {
                                                    arrayList9.add(new nr.d0(iVarD4.d(ls.e.EXERCISE_NAME, r0Var4.f140205l), iVarD4.d(ls.e.TOTAL_TIME, r0Var4.getDuration())));
                                                }
                                            }
                                            aVar6 = new nr.g.u.d(arrayList9, zJ, hVar);
                                            objO5 = aVar6;
                                            tVar2 = tVar7;
                                            c14 = 6;
                                            break;
                                        case 22:
                                            tVar4 = tVar7;
                                            rVar = rVar;
                                            if (s0Var2 != null || (listD5 = s0Var2.d()) == null) {
                                                arrayList10 = null;
                                            } else {
                                                arrayList10 = new ArrayList();
                                                for (Object obj16 : listD5) {
                                                    if (((ps.r0) obj16).j() == qs.i.ACTIVE) {
                                                        arrayList10.add(obj16);
                                                    }
                                                }
                                            }
                                            sr.i iVarD5 = bVar.d();
                                            if (fVar4 == null && (listF = fVar4.f()) != null && (!listF.isEmpty())) {
                                                List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF2 = fVar4.f();
                                                if (listF2 != null) {
                                                    ArrayList arrayList18 = new ArrayList(p13.y.r(listF2, 10));
                                                    Iterator it6 = listF2.iterator();
                                                    while (it6.hasNext()) {
                                                        com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.c0) it6.next();
                                                        ls.e eVar4 = ls.e.TOTAL_TIME;
                                                        com.garmin.android.apps.connectmobile.activities.newmodel.f0 split = c0Var.getSplit();
                                                        String strD7 = iVarD5.d(eVar4, split != null ? split.getMovingDuration() : null);
                                                        String strD8 = iVarD5.d(ls.e.TOTAL_REPS, Integer.valueOf(lg.d.u(c0Var)));
                                                        List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF3 = c0Var.f();
                                                        if (listF3 != null) {
                                                            arrayList12 = new ArrayList(p13.y.r(listF3, i26));
                                                            for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar5 : listF3) {
                                                                int iS = lg.d.s(c0Var, eVar5.G());
                                                                String strC2 = iVarD5.c(eVar5.f41117g);
                                                                Iterator it7 = it6;
                                                                String strD9 = iVarD5.d(ls.e.TOTAL_TIME, eVar5.D());
                                                                ls.e eVar6 = ls.e.TOTAL_REPS;
                                                                Long lH = eVar5.H();
                                                                bm2.c cVar6 = cVar3;
                                                                com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var2 = c0Var;
                                                                String strD10 = iVarD5.d(eVar6, lH != null ? Integer.valueOf((int) lH.longValue()) : null);
                                                                Long lZ = eVar5.Z();
                                                                arrayList12.add(new nr.b0(iS, strC2, strD9, strD10, iVarD5.a(lZ != null ? Double.valueOf(lZ.longValue()) : null, cVar != null && cVar.H(eVar5.f41115e, eVar5.f41116f)), eVar5.e0()));
                                                                it6 = it7;
                                                                c0Var = c0Var2;
                                                                cVar3 = cVar6;
                                                            }
                                                        } else {
                                                            arrayList12 = null;
                                                        }
                                                        Iterator it8 = it6;
                                                        bm2.c cVar7 = cVar3;
                                                        arrayList18.add(new nr.e0(strD7, strD8, arrayList12));
                                                        it6 = it8;
                                                        cVar3 = cVar7;
                                                        i26 = 10;
                                                    }
                                                    arrayList11 = arrayList18;
                                                } else {
                                                    arrayList11 = null;
                                                }
                                                cVar3 = cVar3;
                                                tVar2 = tVar4;
                                                objO5 = new nr.g.u.e(arrayList11, cVar, iVarD5.e(), zJ, tVar4.f146546o2);
                                                c14 = 6;
                                            } else {
                                                cVar3 = cVar3;
                                                if (arrayList10 == null && (!arrayList10.isEmpty())) {
                                                    ArrayList arrayList19 = new ArrayList(p13.y.r(arrayList10, 10));
                                                    for (ps.r0 r0Var5 : arrayList10) {
                                                        String strD11 = iVarD5.d(ls.e.EXERCISE_NAME, r0Var5.f140205l);
                                                        String strD12 = iVarD5.d(ls.e.TOTAL_TIME, r0Var5.getDuration());
                                                        ls.e eVar7 = ls.e.TOTAL_REPS;
                                                        Long repCount4 = r0Var5.getRepCount();
                                                        arrayList19.add(new nr.b0(0, strD11, strD12, iVarD5.d(eVar7, repCount4 != null ? Integer.valueOf((int) repCount4.longValue()) : null), iVarD5.b(r0Var5.getWeight()), false, 33, null));
                                                    }
                                                    objO5 = new nr.g.u.a(arrayList19, zJ, false, hVar);
                                                    tVar2 = tVar4;
                                                    u0Var = u0Var;
                                                    list7 = list7;
                                                    c14 = 6;
                                                } else {
                                                    tVar2 = tVar4;
                                                    c14 = 6;
                                                    list7 = list7;
                                                    objO5 = null;
                                                }
                                            }
                                            break;
                                        case 23:
                                            tVar5 = tVar7;
                                            rVar = rVar;
                                            c15 = 3;
                                            c16 = 2;
                                            if (summaryDTO != null) {
                                                startLatitude = summaryDTO.getStartLatitude();
                                            } else {
                                                startLatitude = null;
                                            }
                                            if (summaryDTO != null) {
                                                startLongitude = summaryDTO.getStartLongitude();
                                            } else {
                                                startLongitude = null;
                                            }
                                            if (startLatitude != null && startLongitude != null) {
                                                double dDoubleValue2 = startLongitude.doubleValue();
                                                double dDoubleValue3 = startLatitude.doubleValue();
                                                String strH = sr.b.h(bVar, kVarC, null, 6);
                                                if (rVar != null || (x0VarH6 = rVar.h()) == null) {
                                                    dVar = null;
                                                } else {
                                                    dVar = x0VarH6.f4362e;
                                                }
                                                sr.b bVar3 = tVar5.f146541n;
                                                if (rVar != null || (metadataDTO12 = rVar.getMetadataDTO()) == null) {
                                                    zG2 = false;
                                                } else {
                                                    zG2 = p005kotlin.jvm.internal.s.g(metadataDTO12.getHasPolyline(), Boolean.TRUE);
                                                }
                                                rVar2 = new nr.g.r(kVarC, strH, dVar, bVar3.a(dDoubleValue3, dDoubleValue2, zG2));
                                                objO5 = rVar2;
                                                tVar2 = tVar5;
                                                c14 = 6;
                                            }
                                            cVar3 = cVar3;
                                            tVar2 = tVar5;
                                            u0Var = u0Var;
                                            c14 = 6;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                        case 24:
                                            t tVar9 = tVar7;
                                            rVar = rVar;
                                            sr.g gVar2 = (sr.g) bVar.f160558s.getValue();
                                            if (summaryDTO != null) {
                                                startTimeLocal = summaryDTO.getStartTimeLocal();
                                            } else {
                                                startTimeLocal = null;
                                            }
                                            if (summaryDTO != null) {
                                                zG3 = p005kotlin.jvm.internal.s.g(summaryDTO.getIsDecoDive(), Boolean.TRUE);
                                            } else {
                                                zG3 = false;
                                            }
                                            objJ = ss.k.j(ls.e.AVERAGE_DEPTH, aVar4);
                                            if (objJ instanceof Double) {
                                                d14 = (Double) objJ;
                                            } else {
                                                d14 = null;
                                            }
                                            gVar2.getClass();
                                            Context context2 = gVar2.f160569a;
                                            String strB5 = gVar2.b(d14, ns.u.a.Avg);
                                            objJ2 = ss.k.j(ls.e.MAX_DEPTH, aVar4);
                                            if (objJ2 instanceof Double) {
                                                d15 = (Double) objJ2;
                                            } else {
                                                d15 = null;
                                            }
                                            String strB6 = gVar2.b(d15, ns.u.a.Max);
                                            objJ3 = ss.k.j(ls.e.TOTAL_SURFACE_INTERVAL_TIME, aVar4);
                                            if (objJ3 instanceof Double) {
                                                d16 = (Double) objJ3;
                                            } else {
                                                d16 = null;
                                            }
                                            gVar2.getClass();
                                            ls.e eVar8 = ls.e.TOTAL_SURFACE_INTERVAL_TIME;
                                            aVar7 = gVar2.f160570b;
                                            strB = ss.k.b(eVar8, aVar7, d16, 9);
                                            if (strB == null) {
                                                strB = aVar7.getString(R.string.no_duration_value);
                                            }
                                            String str6 = strB;
                                            DateTime dateTime = new DateTime(startTimeLocal);
                                            pi0.a aVar18 = new pi0.a(context2);
                                            qi0.f fVar10 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                                            String strC3 = aVar18.c(dateTime, fVar10);
                                            DateTime dateTime2 = new DateTime(startTimeLocal);
                                            double d18 = 1000L;
                                            if (summaryDTO != null || (bottomTime2 = summaryDTO.getBottomTime()) == null) {
                                                dDoubleValue = 0.0d;
                                            } else {
                                                dDoubleValue = bottomTime2.doubleValue();
                                            }
                                            DateTime dateTimePlusMillis = dateTime2.plusMillis(MathKt.b(d18 * dDoubleValue));
                                            dateTimePlusMillis.getClass();
                                            String strC4 = new pi0.a(context2).c(dateTimePlusMillis, fVar10);
                                            if (summaryDTO != null || (bottomTime = summaryDTO.getBottomTime()) == null) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = Integer.valueOf(MathKt.b(bottomTime.doubleValue()));
                                            }
                                            cVar3 = cVar3;
                                            tVar2 = tVar9;
                                            objO5 = new nr.g.C2446g(zG3, strB5, strB6, str6, strC3, strC4, gVar2.a(numValueOf));
                                            c14 = 6;
                                            break;
                                        case 25:
                                            tVar5 = tVar7;
                                            rVar = rVar;
                                            c15 = 3;
                                            c16 = 2;
                                            aVar8 = hb2.g.a.GARMIN_DIVE;
                                            aVar5.getClass();
                                            aVar8.getClass();
                                            if (hb2.g.b(aVar5.f146086a, aVar8)) {
                                                rVar2 = new nr.g.f.a(new ds.f(tVar5, 18));
                                                objO5 = rVar2;
                                            } else {
                                                zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
                                                bVar.getClass();
                                                if (zF) {
                                                    i17 = 2131231125;
                                                } else {
                                                    i17 = 2131231126;
                                                }
                                                objO5 = new nr.g.f.b(i17, new ds.f(tVar5, 19));
                                            }
                                            tVar2 = tVar5;
                                            c14 = 6;
                                            break;
                                        case 26:
                                            tVar5 = tVar7;
                                            rVar = rVar;
                                            c15 = 3;
                                            c16 = 2;
                                            if (tVar5.X1.g() && cVar3 != null && cVar3.W0) {
                                                objO5 = new nr.g.d(bVar.n(tVar5.A.f4360c), new ds.f(tVar5, 20), new ds.f(tVar5, 12));
                                                tVar2 = tVar5;
                                                c14 = 6;
                                            }
                                            cVar3 = cVar3;
                                            tVar2 = tVar5;
                                            u0Var = u0Var;
                                            c14 = 6;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                        case 27:
                                            itemDetails = fVar.getItemDetails();
                                            if (itemDetails != null) {
                                                jVarC = itemDetails.c();
                                            } else {
                                                jVarC = null;
                                            }
                                            i18 = jVarC != null ? c.f146594b[jVarC.ordinal()] : -1;
                                            if (i18 == 1) {
                                                t tVar10 = tVar7;
                                                i19 = 3;
                                                arrayListJ5 = tVar10.j5(fVar.getItemDetails().d(), summaryDTO, zJ, privacyType, rVar);
                                                tVar5 = tVar10;
                                                rVar = rVar;
                                            } else if (i18 != 2) {
                                                i19 = 3;
                                                if (i18 != 3) {
                                                    tVar5 = tVar7;
                                                    rVar = rVar;
                                                    arrayListJ5 = null;
                                                } else {
                                                    t tVar11 = tVar7;
                                                    arrayListJ5 = tVar11.p5(fVar.getItemDetails().d(), rVar, segmentDetailsListDTO, jVarX4, fVar5, zJ, arrayListK);
                                                    tVar5 = tVar11;
                                                    rVar = rVar;
                                                }
                                            } else {
                                                t tVar12 = tVar7;
                                                i19 = 3;
                                                arrayListJ5 = tVar12.f5(fVar.getItemDetails().d(), vVar, rVar, zJ);
                                                tVar5 = tVar12;
                                                rVar = rVar;
                                            }
                                            itemDetails2 = fVar.getItemDetails();
                                            if (itemDetails2 != null) {
                                                jVarC2 = itemDetails2.c();
                                            } else {
                                                jVarC2 = null;
                                            }
                                            itemDetails3 = fVar.getItemDetails();
                                            if (itemDetails3 != null || (jVarC3 = itemDetails3.c()) == null) {
                                                c16 = 2;
                                                string = null;
                                            } else {
                                                l22.a aVar19 = bVar.f160541b;
                                                int i28 = sr.b.a.f160563b[jVarC3.ordinal()];
                                                c16 = 2;
                                                if (i28 == 1) {
                                                    string = aVar19.getString(R.string.lbl_evaluation);
                                                } else if (i28 != 2) {
                                                    string = i28 != i19 ? "" : aVar19.getString(R.string.lbl_devices_and_apps);
                                                } else {
                                                    string = aVar19.getString(R.string.device_text_navigation);
                                                }
                                            }
                                            objO5 = new nr.g.k(jVarC2, string, arrayListJ5);
                                            tVar2 = tVar5;
                                            c14 = 6;
                                            break;
                                        case 28:
                                            aVar9 = hb2.g.a.GARMIN_SHOTVIEW;
                                            aVar5.getClass();
                                            aVar9.getClass();
                                            if (hb2.g.b(aVar5.f146086a, aVar9)) {
                                                objO5 = new nr.g.q.a(new ds.f(tVar7, 13));
                                            } else {
                                                zF2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
                                                bVar.getClass();
                                                if (zF2) {
                                                    i24 = 2131231125;
                                                } else {
                                                    i24 = 2131231126;
                                                }
                                                objO5 = new nr.g.q.b(i24, new ds.f(tVar7, 14));
                                            }
                                            list7 = list7;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            break;
                                        case 29:
                                            if (pVar.f127281e) {
                                                l22.b bVar4 = ((sr.o) bVar.f160560u.getValue()).f160579a;
                                                c22.x0.f23314a.getClass();
                                                String strB7 = bVar4.b(c22.g2.b(c22.x0.f23579pd));
                                                s62.a.f157643a.getClass();
                                                objO5 = new nr.g.p(strB7, null, v62.a.a(t62.b.f162798a), null, new ds.f(tVar7, 15), null, 10, null);
                                                list7 = list7;
                                                c14 = 6;
                                                tVar2 = tVar7;
                                                rVar = rVar;
                                            }
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                        case 30:
                                            if (!list4.isEmpty()) {
                                                arrayList13 = new ArrayList(p13.y.r(list4, 10));
                                                for (mr.p pVar3 : list4) {
                                                    String str7 = pVar3.f120282b;
                                                    String str8 = pVar3.f120283c;
                                                    String str9 = pVar3.f120284d;
                                                    tVar6 = bVar.f160561v;
                                                    aVar10 = bVar.f160541b;
                                                    dateTimeQ = g22.k.q(str8, "yyyy-MM-dd", null);
                                                    if (dateTimeQ == null && (dateTimeQ2 = g22.k.q(str9, "yyyy-MM-dd", null)) != null) {
                                                        pi0.e eVar9 = (pi0.e) tVar6.getValue();
                                                        qi0.a aVar20 = qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY;
                                                        strG = i3.e5.g(eVar9.a(dateTimeQ, aVar20), " - ", ((pi0.e) tVar6.getValue()).a(dateTimeQ2, aVar20));
                                                    } else {
                                                        strG = "";
                                                    }
                                                    strB2 = ss.k.b(ls.e.TOTAL_DISTANCE, aVar10, pVar3.f120285e, 9);
                                                    if (strB2 == null) {
                                                        str2 = "";
                                                    } else {
                                                        str2 = strB2;
                                                    }
                                                    d17 = pVar3.f120286f;
                                                    if (d17 != null) {
                                                        strB3 = new u00.a(aVar10).b((int) d17.doubleValue());
                                                    } else {
                                                        strB3 = "";
                                                    }
                                                    arrayList13.add(new nr.g.i(str7, strG, str2, strB3, new qn0.f(2, tVar7, pVar3)));
                                                }
                                                objO5 = new nr.g.j(i53.a.j(arrayList13));
                                                list7 = list7;
                                                c14 = 6;
                                                tVar2 = tVar7;
                                                rVar = rVar;
                                            }
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                        default:
                                            cVar3 = cVar3;
                                            u0Var = u0Var;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                            list7 = list7;
                                            objO5 = null;
                                            break;
                                    }
                                    if (objO5 != null) {
                                        arrayList2.add(objO5);
                                    }
                                    arrayList = arrayList2;
                                    u0Var = u0Var;
                                    rVar3 = rVar;
                                    tVar7 = tVar2;
                                    iVar = iVar3;
                                    cVar2 = cVar5;
                                    it = it3;
                                    n0Var = n0Var3;
                                    aVar2 = aVar14;
                                    k0Var = k0Var3;
                                    cVar3 = cVar3;
                                    list8 = list7;
                                    i0Var = i0Var3;
                                }
                                gVar = new nr.t.g(arrayList);
                                this.f146704b = null;
                                this.f146705c = null;
                                this.f146703a = 1;
                                aVar3 = aVar;
                                if (jVar.emit(gVar, this) == aVar3) {
                                    return aVar3;
                                }
                            } else {
                                aVar = aVar11;
                                jVar = jVar3;
                                iVar = iVar2;
                                k0Var = k0Var2;
                                n0Var = n0Var2;
                                i0Var = i0Var2;
                                rVar3 = rVar3;
                                aVar2 = aVar12;
                                j0Var = j0Var2;
                            }
                            iterableA = p13.j0.f134944a;
                            if (iterableA == null) {
                            }
                            arrayList = new ArrayList();
                            it = iterableA.iterator();
                            while (it.hasNext()) {
                                fVar = (jr.f) it.next();
                                tVar = iVar.f127191a;
                                nr.i iVar4 = iVar;
                                if (tVar instanceof nr.t.f) {
                                    fVar2 = (nr.t.f) tVar;
                                } else {
                                    fVar2 = null;
                                }
                                if (fVar2 != null) {
                                    z14 = fVar2.f127340e;
                                } else {
                                    z14 = false;
                                }
                                z15 = k0Var.f127240a;
                                pVar = k0Var.f127243d;
                                jVarX4 = t.x4(tVar7, rVar3, n0Var, cVar2, i0Var);
                                ps.i0 i0Var4 = i0Var;
                                bVar = tVar7.f146541n;
                                nr.c cVar8 = cVar2;
                                aVar4 = jVarX4.f127205a;
                                segmentDetailsListDTO = k0Var.f127244e;
                                if (aVar2 != null) {
                                    list = null;
                                } else {
                                    list = null;
                                }
                                Iterator it9 = it;
                                if (aVar2 != null) {
                                    list2 = null;
                                } else {
                                    list2 = null;
                                }
                                rVar = rVar3;
                                if (n0Var != null) {
                                    s0Var = n0Var.f127266b;
                                } else {
                                    s0Var = null;
                                }
                                s0Var2 = s0Var;
                                if (n0Var != null) {
                                    fVar3 = n0Var.f127265a;
                                } else {
                                    fVar3 = null;
                                }
                                fVar4 = fVar3;
                                if (n0Var != null) {
                                    cVar = n0Var.f127267c;
                                } else {
                                    cVar = null;
                                }
                                arrayList2 = arrayList;
                                if (n0Var != null) {
                                    z16 = n0Var.f127268d;
                                } else {
                                    z16 = false;
                                }
                                nr.n0 n0Var4 = n0Var;
                                jVar2 = k0Var.f127245f;
                                fVar5 = k0Var.f127246g;
                                if (aVar2 != null) {
                                    lVar = null;
                                } else {
                                    lVar = null;
                                }
                                lVar2 = lVar;
                                if (aVar2 != null) {
                                    arrayListK = null;
                                } else {
                                    arrayListK = null;
                                }
                                list3 = k0Var.f127247h;
                                nr.a aVar110 = aVar2;
                                list4 = k0Var.f127248i;
                                nr.k0 k0Var4 = k0Var;
                                aVar5 = tVar7.f146550q;
                                list5 = list;
                                hVar = tVar7.f146546o2;
                                if (rVar != null) {
                                    summaryDTO = rVar.getSummaryDTO();
                                } else {
                                    summaryDTO = null;
                                }
                                if (rVar == null) {
                                    privacyTypeB = PrivacyType.EVERYONE;
                                } else {
                                    accessControlRuleDTO = rVar.getAccessControlRuleDTO();
                                    if (accessControlRuleDTO != null) {
                                        privacyTypeB = accessControlRuleDTO.b();
                                    } else {
                                        privacyTypeB = PrivacyType.EVERYONE;
                                    }
                                    if (privacyTypeB == null) {
                                        privacyTypeB = PrivacyType.EVERYONE;
                                    }
                                }
                                privacyType = privacyTypeB;
                                zJ = oe2.f.J(rVar);
                                list6 = list2;
                                kVarC = fVar.c();
                                if (kVarC == null) {
                                    i14 = -1;
                                } else {
                                    i14 = c.f146595c[kVarC.ordinal()];
                                }
                                list7 = list8;
                                int i29 = 10;
                                switch (i14) {
                                    case 1:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        list7 = list7;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        objO5 = tVar2.o5(list5, list6);
                                        break;
                                    case 2:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        if (rVar != null) {
                                            metadataDTO = rVar.getMetadataDTO();
                                        } else {
                                            metadataDTO = null;
                                        }
                                        list7 = list7;
                                        objO5 = tVar2.Z4(list7, metadataDTO);
                                        break;
                                    case 3:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        objO5 = tVar2.i5(list3, zJ);
                                        list7 = list7;
                                        break;
                                    case 4:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        if (rVar != null) {
                                            jr.k kVar3 = jr.k.DIVE_BUDDY;
                                            c14 = 6;
                                            objO5 = new nr.g.r(kVar3, sr.b.h(bVar, kVar3, null, 6), null, buddy, 4, null);
                                            list7 = list7;
                                        }
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    case 5:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        if (rVar != null) {
                                            jr.k kVar4 = jr.k.DIVE_EQUIPMENT;
                                            objO5 = new nr.g.r(kVar4, sr.b.h(bVar, kVar4, null, 6), null, equipment, 4, null);
                                            list7 = list7;
                                            c14 = 6;
                                        }
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    case 6:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        long j16 = tVar2.f146575z;
                                        if (rVar != null) {
                                            os.a aVar111 = tVar2.Z;
                                            metadataDTO2 = rVar.getMetadataDTO();
                                            if (metadataDTO2 != null) {
                                                zC0 = metadataDTO2.C0();
                                            } else {
                                                zC0 = false;
                                            }
                                            lVarA = pr.a.a(rVar, j0Var, aVar111, zC0);
                                        } else {
                                            lVarA = null;
                                        }
                                        objO5 = new nr.g.l(j16, lVarA, tVar2.f146540m2, z15);
                                        list7 = list7;
                                        c14 = 6;
                                        break;
                                    case 7:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        sr.m mVar4 = (sr.m) bVar.f160550k.getValue();
                                        if (rVar != null) {
                                            x0VarH2 = rVar.h();
                                        } else {
                                            x0VarH2 = null;
                                        }
                                        if (rVar != null) {
                                            c3Var = null;
                                        } else {
                                            c3Var = null;
                                        }
                                        String strC5 = mVar4.c(c3Var);
                                        if (oe2.f.G(rVar)) {
                                            i15 = R.drawable.star_filled;
                                        } else {
                                            i15 = R.drawable.star_outlined;
                                        }
                                        Integer numValueOf4 = Integer.valueOf(i15);
                                        if (oe2.f.G(rVar)) {
                                            i16 = R.color.gcm_favorite_activity;
                                        } else {
                                            i16 = R.color.gcm_icon_secondary;
                                        }
                                        Integer numValueOf5 = Integer.valueOf(i16);
                                        g3 g3Var2 = new g3(tVar2);
                                        qr.o oVar7 = new qr.o(tVar2, rVar, 0);
                                        ph1.d dVar5 = new ph1.d(16, tVar2, privacyType);
                                        String strB8 = mVar4.b(privacyType);
                                        if (summaryDTO != null) {
                                            dateTimeW4 = summaryDTO.W4();
                                        } else {
                                            dateTimeW4 = null;
                                        }
                                        String strA2 = mVar4.a(dateTimeW4);
                                        if (zJ) {
                                            z17 = false;
                                        } else {
                                            if (rVar != null) {
                                                parentId3 = rVar.getParentId();
                                            } else {
                                                parentId3 = null;
                                            }
                                            if (parentId3 == null) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        }
                                        if (zJ) {
                                            z18 = false;
                                        } else {
                                            if (rVar != null) {
                                                parentId2 = rVar.getParentId();
                                            } else {
                                                parentId2 = null;
                                            }
                                            if (parentId2 == null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        }
                                        if (zJ) {
                                            z19 = false;
                                        } else {
                                            if (rVar != null) {
                                                parentId = rVar.getParentId();
                                            } else {
                                                parentId = null;
                                            }
                                            if (parentId == null) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                        }
                                        if (lVar2 != 0) {
                                            if (rVar != null) {
                                                userInfoDto = null;
                                            } else {
                                                userInfoDto = null;
                                            }
                                            strZ = oe2.f.z(userInfoDto);
                                        } else {
                                            if (rVar != null) {
                                                userInfoDto = null;
                                            } else {
                                                userInfoDto = null;
                                            }
                                            strZ = oe2.f.z(userInfoDto);
                                        }
                                        b12.b bVar5 = new b12.b(strZ, null, null, null, null, 30, null);
                                        if (rVar != null) {
                                            fullName = null;
                                        } else {
                                            fullName = null;
                                        }
                                        if (rVar != null) {
                                            zC1 = false;
                                        } else {
                                            zC1 = false;
                                        }
                                        objO5 = new nr.g.m(zJ, x0VarH2, strC5, numValueOf4, numValueOf5, g3Var2, oVar7, dVar5, strB8, privacyType, strA2, zJ, z17, z18, z19, bVar5, fullName, zC1);
                                        list7 = list7;
                                        c14 = 6;
                                        break;
                                    case 8:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        if (!pVar.f127278b) {
                                            if (tVar2.Q5(rVar)) {
                                                objN5 = tVar2.n5(rVar, bVar.b());
                                            }
                                            c14 = 6;
                                            list7 = list7;
                                            objO5 = null;
                                        } else {
                                            List<nr.m0> list11 = pVar.f127277a;
                                            if (rVar != null) {
                                                activityId = rVar.getActivityId();
                                            } else {
                                                activityId = null;
                                            }
                                            if (rVar != null) {
                                                x0VarH4 = rVar.h();
                                            } else {
                                                x0VarH4 = null;
                                            }
                                            objN5 = tVar2.r5(list11, activityId, x0VarH4, (sr.n) bVar.f160548i.getValue());
                                        }
                                        objO5 = objN5;
                                        c14 = 6;
                                        break;
                                    case 9:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        objN5 = tVar2.w5(u0Var);
                                        objO5 = objN5;
                                        c14 = 6;
                                        break;
                                    case 10:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        objN5 = tVar2.q5(fVar, jVarX4, true);
                                        objO5 = objN5;
                                        c14 = 6;
                                        break;
                                    case 11:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        objO5 = tVar2.q5(fVar, jVarX4, false);
                                        list7 = list7;
                                        c14 = 6;
                                        break;
                                    case 12:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        t tVar13 = tVar7;
                                        rVar = rVar;
                                        if (rVar != null) {
                                            groupRideUUID = null;
                                        } else {
                                            groupRideUUID = null;
                                        }
                                        if (rVar != null) {
                                            activityName = rVar.getActivityName();
                                        } else {
                                            activityName = null;
                                        }
                                        if (rVar != null) {
                                            userInfoDto3 = null;
                                        } else {
                                            userInfoDto3 = null;
                                        }
                                        objU5 = tVar13.u5(jVar2, groupRideUUID, activityName, fVar5, zJ, userInfoDto3);
                                        tVar2 = tVar13;
                                        objO5 = objU5;
                                        c14 = 6;
                                        break;
                                    case 13:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        String strT2 = tVar2.A.t();
                                        am.z0 z0Var2 = am.z0.f4390a;
                                        zB = am.z0.b(am.x0.D, strT2);
                                        long j17 = tVar2.f146575z;
                                        f fVar11 = tVar2.f146549p2;
                                        if (rVar != null) {
                                            zC2 = false;
                                        } else {
                                            zC2 = false;
                                        }
                                        qr.o oVar8 = new qr.o(rVar, tVar2);
                                        ds.f fVar12 = new ds.f(tVar2, 16);
                                        if (zB) {
                                            fVar6 = null;
                                        } else {
                                            fVar6 = null;
                                        }
                                        wg0.m mVar5 = mVar;
                                        mVar = mVar5;
                                        objO5 = new nr.g.s(zJ, z14, j17, mVar5, fVar11, zC2, oVar8, fVar12, fVar6);
                                        c14 = 6;
                                        break;
                                    case 14:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        int i210 = 3;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        arrayList3 = new ArrayList();
                                        List<nr.m0> list12 = pVar.f127277a;
                                        arrayList4 = new ArrayList();
                                        while (r2.hasNext()) {
                                            if (!((nr.m0) obj10).f127260c) {
                                                arrayList4.add(obj10);
                                            }
                                        }
                                        hashSet = new HashSet();
                                        arrayList5 = new ArrayList();
                                        while (r8.hasNext()) {
                                            if (hashSet.add(((nr.m0) obj11).f127262e)) {
                                                arrayList5.add(obj11);
                                            }
                                        }
                                        while (r2.hasNext()) {
                                            str = m0Var.f127261d;
                                            String str10 = m0Var.f127261d;
                                            if (str == null) {
                                            }
                                        }
                                        if (rVar != null) {
                                            typeKey = null;
                                        } else {
                                            typeKey = null;
                                        }
                                        if (typeKey == null) {
                                            z24 = false;
                                        } else {
                                            z24 = false;
                                        }
                                        if (z24) {
                                            bVar.getClass();
                                            typeKey.getClass();
                                            l22.a aVar112 = bVar.f160541b;
                                            arrayList3.add(new nr.s0(typeKey, aVar112.a(R.string.string_space_string_pattern, aVar112.getString(R.string.lbl_event), typeKey), null, 4, null));
                                        }
                                        if (jVar2 != null) {
                                            String str11 = qs.g.GROUP_RIDE.f147086c;
                                            bVar.getClass();
                                            str11.getClass();
                                            l22.a aVar113 = bVar.f160541b;
                                            arrayList3.add(new nr.s0(str11, aVar113.a(R.string.string_space_string_pattern, aVar113.getString(R.string.lbl_event), str11), null, 4, null));
                                        }
                                        if (rVar != null) {
                                            zG = false;
                                        } else {
                                            zG = false;
                                        }
                                        if (zG) {
                                            Context context3 = bVar.f160540a;
                                            c22.x0.f23314a.getClass();
                                            String str12 = c22.x0.f23391e8;
                                            arrayList3.add(new nr.s0(dh.b.D(context3, str12), dh.b.D(bVar.f160540a, str12), null));
                                        }
                                        if (!list4.isEmpty()) {
                                            arrayList3.add(new nr.s0(bVar.c(), null, null, 6, null));
                                        }
                                        if (!arrayList3.isEmpty()) {
                                            objU5 = new nr.g.v(arrayList3);
                                            objO5 = objU5;
                                            c14 = 6;
                                        }
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    case 15:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        if (zJ) {
                                            z25 = false;
                                        } else {
                                            if (rVar != null) {
                                                parentId6 = rVar.getParentId();
                                            } else {
                                                parentId6 = null;
                                            }
                                            if (parentId6 == null) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                        }
                                        if (zJ) {
                                            z26 = false;
                                        } else {
                                            if (rVar != null) {
                                                parentId5 = rVar.getParentId();
                                            } else {
                                                parentId5 = null;
                                            }
                                            if (parentId5 == null) {
                                                z26 = true;
                                            } else {
                                                z26 = false;
                                            }
                                        }
                                        if (rVar != null) {
                                            description = rVar.getDescription();
                                        } else {
                                            description = null;
                                        }
                                        if (rVar != null) {
                                            activityName2 = rVar.getActivityName();
                                        } else {
                                            activityName2 = null;
                                        }
                                        if (rVar != null) {
                                            x0VarH5 = rVar.h();
                                        } else {
                                            x0VarH5 = null;
                                        }
                                        if (rVar != null) {
                                            parentId4 = rVar.getParentId();
                                        } else {
                                            parentId4 = null;
                                        }
                                        if (parentId4 != null) {
                                            z27 = true;
                                        } else {
                                            z27 = false;
                                        }
                                        String strE2 = bVar.e(activityName2, x0VarH5, z27);
                                        if (rVar != null) {
                                            zC3 = false;
                                        } else {
                                            zC3 = false;
                                        }
                                        objO5 = new nr.g.e(zJ, description, z25, z26, zC3, strE2, new q72.f(4, tVar2, rVar));
                                        c14 = 6;
                                        break;
                                    case 16:
                                        cVar3 = cVar3;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        if (s0Var2 != null) {
                                            exerciseSetsDTOQ = dh.b.Q(s0Var2);
                                        } else {
                                            exerciseSetsDTOQ = null;
                                        }
                                        objO5 = new nr.g.n(dh.b.E(exerciseSetsDTOQ, tVar2.Y4().getValue()), z16, tVar2.f146543n2);
                                        c14 = 6;
                                        break;
                                    case 17:
                                        tVar3 = tVar7;
                                        cVar3 = cVar3;
                                        rVar = rVar;
                                        if (summaryDTO != null) {
                                            long j18 = tVar3.f146575z;
                                            long jC6 = summaryDTO.c5();
                                            metadataDTO11 = rVar.getMetadataDTO();
                                            if (metadataDTO11 != null) {
                                                profileImageUrlMedium = null;
                                            } else {
                                                profileImageUrlMedium = null;
                                            }
                                            objO5 = tVar3.x5(u0Var, j18, jC6, profileImageUrlMedium, zJ);
                                            tVar2 = tVar3;
                                            c14 = 6;
                                        } else {
                                            tVar2 = tVar3;
                                            c14 = 6;
                                            list7 = list7;
                                            objO5 = null;
                                        }
                                        break;
                                    case 18:
                                        sr.i iVarD6 = bVar.d();
                                        if (s0Var2 != null) {
                                            arrayList6 = null;
                                        } else {
                                            arrayList6 = null;
                                        }
                                        aVar6 = new nr.g.u.a(arrayList6, zJ, zJ, hVar);
                                        objO5 = aVar6;
                                        tVar2 = tVar7;
                                        c14 = 6;
                                        break;
                                    case 19:
                                        sr.i iVarD7 = bVar.d();
                                        if (s0Var2 != null) {
                                            arrayList7 = null;
                                        } else {
                                            arrayList7 = null;
                                        }
                                        aVar6 = new nr.g.u.c(arrayList7, zJ, hVar);
                                        objO5 = aVar6;
                                        tVar2 = tVar7;
                                        c14 = 6;
                                        break;
                                    case 20:
                                        sr.i iVarD8 = bVar.d();
                                        if (s0Var2 != null) {
                                            arrayList8 = null;
                                        } else {
                                            arrayList8 = null;
                                        }
                                        aVar6 = new nr.g.u.b(arrayList8, zJ, hVar);
                                        objO5 = aVar6;
                                        tVar2 = tVar7;
                                        c14 = 6;
                                        break;
                                    case 21:
                                        sr.i iVarD9 = bVar.d();
                                        if (s0Var2 != null) {
                                            arrayList9 = null;
                                        } else {
                                            arrayList9 = null;
                                        }
                                        aVar6 = new nr.g.u.d(arrayList9, zJ, hVar);
                                        objO5 = aVar6;
                                        tVar2 = tVar7;
                                        c14 = 6;
                                        break;
                                    case 22:
                                        tVar4 = tVar7;
                                        rVar = rVar;
                                        if (s0Var2 != null) {
                                            arrayList10 = null;
                                        } else {
                                            arrayList10 = null;
                                        }
                                        sr.i iVarD10 = bVar.d();
                                        if (fVar4 == null) {
                                        }
                                        cVar3 = cVar3;
                                        if (arrayList10 == null) {
                                        }
                                        tVar2 = tVar4;
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    case 23:
                                        tVar5 = tVar7;
                                        rVar = rVar;
                                        c15 = 3;
                                        c16 = 2;
                                        if (summaryDTO != null) {
                                            startLatitude = summaryDTO.getStartLatitude();
                                        } else {
                                            startLatitude = null;
                                        }
                                        if (summaryDTO != null) {
                                            startLongitude = summaryDTO.getStartLongitude();
                                        } else {
                                            startLongitude = null;
                                        }
                                        if (startLatitude != null) {
                                            double dDoubleValue4 = startLongitude.doubleValue();
                                            double dDoubleValue5 = startLatitude.doubleValue();
                                            String strH2 = sr.b.h(bVar, kVarC, null, 6);
                                            if (rVar != null) {
                                                dVar = null;
                                            } else {
                                                dVar = null;
                                            }
                                            sr.b bVar6 = tVar5.f146541n;
                                            if (rVar != null) {
                                                zG2 = false;
                                            } else {
                                                zG2 = false;
                                            }
                                            rVar2 = new nr.g.r(kVarC, strH2, dVar, bVar6.a(dDoubleValue5, dDoubleValue4, zG2));
                                            objO5 = rVar2;
                                            tVar2 = tVar5;
                                            c14 = 6;
                                        }
                                        cVar3 = cVar3;
                                        tVar2 = tVar5;
                                        u0Var = u0Var;
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    case 24:
                                        t tVar14 = tVar7;
                                        rVar = rVar;
                                        sr.g gVar3 = (sr.g) bVar.f160558s.getValue();
                                        if (summaryDTO != null) {
                                            startTimeLocal = summaryDTO.getStartTimeLocal();
                                        } else {
                                            startTimeLocal = null;
                                        }
                                        if (summaryDTO != null) {
                                            zG3 = p005kotlin.jvm.internal.s.g(summaryDTO.getIsDecoDive(), Boolean.TRUE);
                                        } else {
                                            zG3 = false;
                                        }
                                        objJ = ss.k.j(ls.e.AVERAGE_DEPTH, aVar4);
                                        if (objJ instanceof Double) {
                                            d14 = (Double) objJ;
                                        } else {
                                            d14 = null;
                                        }
                                        gVar3.getClass();
                                        Context context4 = gVar3.f160569a;
                                        String strB9 = gVar3.b(d14, ns.u.a.Avg);
                                        objJ2 = ss.k.j(ls.e.MAX_DEPTH, aVar4);
                                        if (objJ2 instanceof Double) {
                                            d15 = (Double) objJ2;
                                        } else {
                                            d15 = null;
                                        }
                                        String strB10 = gVar3.b(d15, ns.u.a.Max);
                                        objJ3 = ss.k.j(ls.e.TOTAL_SURFACE_INTERVAL_TIME, aVar4);
                                        if (objJ3 instanceof Double) {
                                            d16 = (Double) objJ3;
                                        } else {
                                            d16 = null;
                                        }
                                        gVar3.getClass();
                                        ls.e eVar10 = ls.e.TOTAL_SURFACE_INTERVAL_TIME;
                                        aVar7 = gVar3.f160570b;
                                        strB = ss.k.b(eVar10, aVar7, d16, 9);
                                        if (strB == null) {
                                            strB = aVar7.getString(R.string.no_duration_value);
                                        }
                                        String str13 = strB;
                                        DateTime dateTime3 = new DateTime(startTimeLocal);
                                        pi0.a aVar114 = new pi0.a(context4);
                                        qi0.f fVar13 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                                        String strC6 = aVar114.c(dateTime3, fVar13);
                                        DateTime dateTime4 = new DateTime(startTimeLocal);
                                        double d19 = 1000L;
                                        if (summaryDTO != null) {
                                            dDoubleValue = 0.0d;
                                        } else {
                                            dDoubleValue = 0.0d;
                                        }
                                        DateTime dateTimePlusMillis2 = dateTime4.plusMillis(MathKt.b(d19 * dDoubleValue));
                                        dateTimePlusMillis2.getClass();
                                        String strC7 = new pi0.a(context4).c(dateTimePlusMillis2, fVar13);
                                        if (summaryDTO != null) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                        cVar3 = cVar3;
                                        tVar2 = tVar14;
                                        objO5 = new nr.g.C2446g(zG3, strB9, strB10, str13, strC6, strC7, gVar3.a(numValueOf));
                                        c14 = 6;
                                        break;
                                    case 25:
                                        tVar5 = tVar7;
                                        rVar = rVar;
                                        c15 = 3;
                                        c16 = 2;
                                        aVar8 = hb2.g.a.GARMIN_DIVE;
                                        aVar5.getClass();
                                        aVar8.getClass();
                                        if (hb2.g.b(aVar5.f146086a, aVar8)) {
                                            rVar2 = new nr.g.f.a(new ds.f(tVar5, 18));
                                            objO5 = rVar2;
                                        } else {
                                            zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
                                            bVar.getClass();
                                            if (zF) {
                                                i17 = 2131231125;
                                            } else {
                                                i17 = 2131231126;
                                            }
                                            objO5 = new nr.g.f.b(i17, new ds.f(tVar5, 19));
                                        }
                                        tVar2 = tVar5;
                                        c14 = 6;
                                        break;
                                    case 26:
                                        tVar5 = tVar7;
                                        rVar = rVar;
                                        c15 = 3;
                                        c16 = 2;
                                        if (tVar5.X1.g()) {
                                            objO5 = new nr.g.d(bVar.n(tVar5.A.f4360c), new ds.f(tVar5, 20), new ds.f(tVar5, 12));
                                            tVar2 = tVar5;
                                            c14 = 6;
                                        }
                                        cVar3 = cVar3;
                                        tVar2 = tVar5;
                                        u0Var = u0Var;
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    case 27:
                                        itemDetails = fVar.getItemDetails();
                                        if (itemDetails != null) {
                                            jVarC = itemDetails.c();
                                        } else {
                                            jVarC = null;
                                        }
                                        i18 = jVarC != null ? c.f146594b[jVarC.ordinal()] : -1;
                                        if (i18 == 1) {
                                            t tVar15 = tVar7;
                                            i19 = 3;
                                            arrayListJ5 = tVar15.j5(fVar.getItemDetails().d(), summaryDTO, zJ, privacyType, rVar);
                                            tVar5 = tVar15;
                                            rVar = rVar;
                                        } else if (i18 != 2) {
                                            i19 = 3;
                                            if (i18 != 3) {
                                                tVar5 = tVar7;
                                                rVar = rVar;
                                                arrayListJ5 = null;
                                            } else {
                                                t tVar16 = tVar7;
                                                arrayListJ5 = tVar16.p5(fVar.getItemDetails().d(), rVar, segmentDetailsListDTO, jVarX4, fVar5, zJ, arrayListK);
                                                tVar5 = tVar16;
                                                rVar = rVar;
                                            }
                                        } else {
                                            t tVar17 = tVar7;
                                            i19 = 3;
                                            arrayListJ5 = tVar17.f5(fVar.getItemDetails().d(), vVar, rVar, zJ);
                                            tVar5 = tVar17;
                                            rVar = rVar;
                                        }
                                        itemDetails2 = fVar.getItemDetails();
                                        if (itemDetails2 != null) {
                                            jVarC2 = itemDetails2.c();
                                        } else {
                                            jVarC2 = null;
                                        }
                                        itemDetails3 = fVar.getItemDetails();
                                        if (itemDetails3 != null) {
                                            c16 = 2;
                                            string = null;
                                        } else {
                                            c16 = 2;
                                            string = null;
                                        }
                                        objO5 = new nr.g.k(jVarC2, string, arrayListJ5);
                                        tVar2 = tVar5;
                                        c14 = 6;
                                        break;
                                    case 28:
                                        aVar9 = hb2.g.a.GARMIN_SHOTVIEW;
                                        aVar5.getClass();
                                        aVar9.getClass();
                                        if (hb2.g.b(aVar5.f146086a, aVar9)) {
                                            objO5 = new nr.g.q.a(new ds.f(tVar7, 13));
                                        } else {
                                            zF2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
                                            bVar.getClass();
                                            if (zF2) {
                                                i24 = 2131231125;
                                            } else {
                                                i24 = 2131231126;
                                            }
                                            objO5 = new nr.g.q.b(i24, new ds.f(tVar7, 14));
                                        }
                                        list7 = list7;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        break;
                                    case 29:
                                        if (pVar.f127281e) {
                                            l22.b bVar7 = ((sr.o) bVar.f160560u.getValue()).f160579a;
                                            c22.x0.f23314a.getClass();
                                            String strB11 = bVar7.b(c22.g2.b(c22.x0.f23579pd));
                                            s62.a.f157643a.getClass();
                                            objO5 = new nr.g.p(strB11, null, v62.a.a(t62.b.f162798a), null, new ds.f(tVar7, 15), null, 10, null);
                                            list7 = list7;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                        }
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    case 30:
                                        if (!list4.isEmpty()) {
                                            arrayList13 = new ArrayList(p13.y.r(list4, 10));
                                            while (r2.hasNext()) {
                                                String str14 = pVar3.f120282b;
                                                String str15 = pVar3.f120283c;
                                                String str16 = pVar3.f120284d;
                                                tVar6 = bVar.f160561v;
                                                aVar10 = bVar.f160541b;
                                                dateTimeQ = g22.k.q(str15, "yyyy-MM-dd", null);
                                                if (dateTimeQ == null) {
                                                    strG = "";
                                                } else {
                                                    pi0.e eVar11 = (pi0.e) tVar6.getValue();
                                                    qi0.a aVar21 = qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY;
                                                    strG = i3.e5.g(eVar11.a(dateTimeQ, aVar21), " - ", ((pi0.e) tVar6.getValue()).a(dateTimeQ2, aVar21));
                                                }
                                                strB2 = ss.k.b(ls.e.TOTAL_DISTANCE, aVar10, pVar3.f120285e, 9);
                                                if (strB2 == null) {
                                                    str2 = "";
                                                } else {
                                                    str2 = strB2;
                                                }
                                                d17 = pVar3.f120286f;
                                                if (d17 != null) {
                                                    strB3 = new u00.a(aVar10).b((int) d17.doubleValue());
                                                } else {
                                                    strB3 = "";
                                                }
                                                arrayList13.add(new nr.g.i(str14, strG, str2, strB3, new qn0.f(2, tVar7, pVar3)));
                                            }
                                            objO5 = new nr.g.j(i53.a.j(arrayList13));
                                            list7 = list7;
                                            c14 = 6;
                                            tVar2 = tVar7;
                                            rVar = rVar;
                                        }
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                    default:
                                        cVar3 = cVar3;
                                        u0Var = u0Var;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                        list7 = list7;
                                        objO5 = null;
                                        break;
                                }
                                if (objO5 != null) {
                                    arrayList2.add(objO5);
                                }
                                arrayList = arrayList2;
                                u0Var = u0Var;
                                rVar3 = rVar;
                                tVar7 = tVar2;
                                iVar = iVar4;
                                cVar2 = cVar8;
                                it = it9;
                                n0Var = n0Var4;
                                aVar2 = aVar110;
                                k0Var = k0Var4;
                                cVar3 = cVar3;
                                list8 = list7;
                                i0Var = i0Var4;
                            }
                            gVar = new nr.t.g(arrayList);
                            this.f146704b = null;
                            this.f146705c = null;
                            this.f146703a = 1;
                            aVar3 = aVar;
                            if (jVar.emit(gVar, this) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            aVar = aVar11;
                            jVar = jVar3;
                            iVar = iVar2;
                            k0Var = k0Var2;
                            n0Var = n0Var2;
                            i0Var = i0Var2;
                            aVar2 = aVar12;
                            j0Var = j0Var2;
                        }
                        iterableA = p13.j0.f134944a;
                        arrayList = new ArrayList();
                        it = iterableA.iterator();
                        while (it.hasNext()) {
                            fVar = (jr.f) it.next();
                            tVar = iVar.f127191a;
                            nr.i iVar5 = iVar;
                            if (tVar instanceof nr.t.f) {
                                fVar2 = (nr.t.f) tVar;
                            } else {
                                fVar2 = null;
                            }
                            if (fVar2 != null) {
                                z14 = fVar2.f127340e;
                            } else {
                                z14 = false;
                            }
                            z15 = k0Var.f127240a;
                            pVar = k0Var.f127243d;
                            jVarX4 = t.x4(tVar7, rVar3, n0Var, cVar2, i0Var);
                            ps.i0 i0Var5 = i0Var;
                            bVar = tVar7.f146541n;
                            nr.c cVar9 = cVar2;
                            aVar4 = jVarX4.f127205a;
                            segmentDetailsListDTO = k0Var.f127244e;
                            if (aVar2 != null) {
                                list = null;
                            } else {
                                list = null;
                            }
                            Iterator it10 = it;
                            if (aVar2 != null) {
                                list2 = null;
                            } else {
                                list2 = null;
                            }
                            rVar = rVar3;
                            if (n0Var != null) {
                                s0Var = n0Var.f127266b;
                            } else {
                                s0Var = null;
                            }
                            s0Var2 = s0Var;
                            if (n0Var != null) {
                                fVar3 = n0Var.f127265a;
                            } else {
                                fVar3 = null;
                            }
                            fVar4 = fVar3;
                            if (n0Var != null) {
                                cVar = n0Var.f127267c;
                            } else {
                                cVar = null;
                            }
                            arrayList2 = arrayList;
                            if (n0Var != null) {
                                z16 = n0Var.f127268d;
                            } else {
                                z16 = false;
                            }
                            nr.n0 n0Var5 = n0Var;
                            jVar2 = k0Var.f127245f;
                            fVar5 = k0Var.f127246g;
                            if (aVar2 != null) {
                                lVar = null;
                            } else {
                                lVar = null;
                            }
                            lVar2 = lVar;
                            if (aVar2 != null) {
                                arrayListK = null;
                            } else {
                                arrayListK = null;
                            }
                            list3 = k0Var.f127247h;
                            nr.a aVar115 = aVar2;
                            list4 = k0Var.f127248i;
                            nr.k0 k0Var5 = k0Var;
                            aVar5 = tVar7.f146550q;
                            list5 = list;
                            hVar = tVar7.f146546o2;
                            if (rVar != null) {
                                summaryDTO = rVar.getSummaryDTO();
                            } else {
                                summaryDTO = null;
                            }
                            if (rVar == null) {
                                privacyTypeB = PrivacyType.EVERYONE;
                            } else {
                                accessControlRuleDTO = rVar.getAccessControlRuleDTO();
                                if (accessControlRuleDTO != null) {
                                    privacyTypeB = accessControlRuleDTO.b();
                                } else {
                                    privacyTypeB = PrivacyType.EVERYONE;
                                }
                                if (privacyTypeB == null) {
                                    privacyTypeB = PrivacyType.EVERYONE;
                                }
                            }
                            privacyType = privacyTypeB;
                            zJ = oe2.f.J(rVar);
                            list6 = list2;
                            kVarC = fVar.c();
                            if (kVarC == null) {
                                i14 = -1;
                            } else {
                                i14 = c.f146595c[kVarC.ordinal()];
                            }
                            list7 = list8;
                            int i211 = 10;
                            switch (i14) {
                                case 1:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    list7 = list7;
                                    c14 = 6;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    objO5 = tVar2.o5(list5, list6);
                                    break;
                                case 2:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    c14 = 6;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    if (rVar != null) {
                                        metadataDTO = rVar.getMetadataDTO();
                                    } else {
                                        metadataDTO = null;
                                    }
                                    list7 = list7;
                                    objO5 = tVar2.Z4(list7, metadataDTO);
                                    break;
                                case 3:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    c14 = 6;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    objO5 = tVar2.i5(list3, zJ);
                                    list7 = list7;
                                    break;
                                case 4:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    if (rVar != null) {
                                        jr.k kVar5 = jr.k.DIVE_BUDDY;
                                        c14 = 6;
                                        objO5 = new nr.g.r(kVar5, sr.b.h(bVar, kVar5, null, 6), null, buddy, 4, null);
                                        list7 = list7;
                                    }
                                    c14 = 6;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                case 5:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    if (rVar != null) {
                                        jr.k kVar6 = jr.k.DIVE_EQUIPMENT;
                                        objO5 = new nr.g.r(kVar6, sr.b.h(bVar, kVar6, null, 6), null, equipment, 4, null);
                                        list7 = list7;
                                        c14 = 6;
                                    }
                                    c14 = 6;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                case 6:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    long j19 = tVar2.f146575z;
                                    if (rVar != null) {
                                        os.a aVar116 = tVar2.Z;
                                        metadataDTO2 = rVar.getMetadataDTO();
                                        if (metadataDTO2 != null) {
                                            zC0 = metadataDTO2.C0();
                                        } else {
                                            zC0 = false;
                                        }
                                        lVarA = pr.a.a(rVar, j0Var, aVar116, zC0);
                                    } else {
                                        lVarA = null;
                                    }
                                    objO5 = new nr.g.l(j19, lVarA, tVar2.f146540m2, z15);
                                    list7 = list7;
                                    c14 = 6;
                                    break;
                                case 7:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    sr.m mVar6 = (sr.m) bVar.f160550k.getValue();
                                    if (rVar != null) {
                                        x0VarH2 = rVar.h();
                                    } else {
                                        x0VarH2 = null;
                                    }
                                    if (rVar != null) {
                                        c3Var = null;
                                    } else {
                                        c3Var = null;
                                    }
                                    String strC8 = mVar6.c(c3Var);
                                    if (oe2.f.G(rVar)) {
                                        i15 = R.drawable.star_filled;
                                    } else {
                                        i15 = R.drawable.star_outlined;
                                    }
                                    Integer numValueOf6 = Integer.valueOf(i15);
                                    if (oe2.f.G(rVar)) {
                                        i16 = R.color.gcm_favorite_activity;
                                    } else {
                                        i16 = R.color.gcm_icon_secondary;
                                    }
                                    Integer numValueOf7 = Integer.valueOf(i16);
                                    g3 g3Var3 = new g3(tVar2);
                                    qr.o oVar9 = new qr.o(tVar2, rVar, 0);
                                    ph1.d dVar6 = new ph1.d(16, tVar2, privacyType);
                                    String strB12 = mVar6.b(privacyType);
                                    if (summaryDTO != null) {
                                        dateTimeW4 = summaryDTO.W4();
                                    } else {
                                        dateTimeW4 = null;
                                    }
                                    String strA3 = mVar6.a(dateTimeW4);
                                    if (zJ) {
                                        z17 = false;
                                    } else {
                                        if (rVar != null) {
                                            parentId3 = rVar.getParentId();
                                        } else {
                                            parentId3 = null;
                                        }
                                        if (parentId3 == null) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    }
                                    if (zJ) {
                                        z18 = false;
                                    } else {
                                        if (rVar != null) {
                                            parentId2 = rVar.getParentId();
                                        } else {
                                            parentId2 = null;
                                        }
                                        if (parentId2 == null) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    }
                                    if (zJ) {
                                        z19 = false;
                                    } else {
                                        if (rVar != null) {
                                            parentId = rVar.getParentId();
                                        } else {
                                            parentId = null;
                                        }
                                        if (parentId == null) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                    }
                                    if (lVar2 != 0) {
                                        if (rVar != null) {
                                            userInfoDto = null;
                                        } else {
                                            userInfoDto = null;
                                        }
                                        strZ = oe2.f.z(userInfoDto);
                                    } else {
                                        if (rVar != null) {
                                            userInfoDto = null;
                                        } else {
                                            userInfoDto = null;
                                        }
                                        strZ = oe2.f.z(userInfoDto);
                                    }
                                    b12.b bVar8 = new b12.b(strZ, null, null, null, null, 30, null);
                                    if (rVar != null) {
                                        fullName = null;
                                    } else {
                                        fullName = null;
                                    }
                                    if (rVar != null) {
                                        zC1 = false;
                                    } else {
                                        zC1 = false;
                                    }
                                    objO5 = new nr.g.m(zJ, x0VarH2, strC8, numValueOf6, numValueOf7, g3Var3, oVar9, dVar6, strB12, privacyType, strA3, zJ, z17, z18, z19, bVar8, fullName, zC1);
                                    list7 = list7;
                                    c14 = 6;
                                    break;
                                case 8:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    if (!pVar.f127278b) {
                                        if (tVar2.Q5(rVar)) {
                                            objN5 = tVar2.n5(rVar, bVar.b());
                                        }
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                    } else {
                                        List<nr.m0> list13 = pVar.f127277a;
                                        if (rVar != null) {
                                            activityId = rVar.getActivityId();
                                        } else {
                                            activityId = null;
                                        }
                                        if (rVar != null) {
                                            x0VarH4 = rVar.h();
                                        } else {
                                            x0VarH4 = null;
                                        }
                                        objN5 = tVar2.r5(list13, activityId, x0VarH4, (sr.n) bVar.f160548i.getValue());
                                    }
                                    objO5 = objN5;
                                    c14 = 6;
                                    break;
                                case 9:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    objN5 = tVar2.w5(u0Var);
                                    objO5 = objN5;
                                    c14 = 6;
                                    break;
                                case 10:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    objN5 = tVar2.q5(fVar, jVarX4, true);
                                    objO5 = objN5;
                                    c14 = 6;
                                    break;
                                case 11:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    objO5 = tVar2.q5(fVar, jVarX4, false);
                                    list7 = list7;
                                    c14 = 6;
                                    break;
                                case 12:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    t tVar18 = tVar7;
                                    rVar = rVar;
                                    if (rVar != null) {
                                        groupRideUUID = null;
                                    } else {
                                        groupRideUUID = null;
                                    }
                                    if (rVar != null) {
                                        activityName = rVar.getActivityName();
                                    } else {
                                        activityName = null;
                                    }
                                    if (rVar != null) {
                                        userInfoDto3 = null;
                                    } else {
                                        userInfoDto3 = null;
                                    }
                                    objU5 = tVar18.u5(jVar2, groupRideUUID, activityName, fVar5, zJ, userInfoDto3);
                                    tVar2 = tVar18;
                                    objO5 = objU5;
                                    c14 = 6;
                                    break;
                                case 13:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    String strT3 = tVar2.A.t();
                                    am.z0 z0Var3 = am.z0.f4390a;
                                    zB = am.z0.b(am.x0.D, strT3);
                                    long j110 = tVar2.f146575z;
                                    f fVar14 = tVar2.f146549p2;
                                    if (rVar != null) {
                                        zC2 = false;
                                    } else {
                                        zC2 = false;
                                    }
                                    qr.o oVar10 = new qr.o(rVar, tVar2);
                                    ds.f fVar15 = new ds.f(tVar2, 16);
                                    if (zB) {
                                        fVar6 = null;
                                    } else {
                                        fVar6 = null;
                                    }
                                    wg0.m mVar7 = mVar;
                                    mVar = mVar7;
                                    objO5 = new nr.g.s(zJ, z14, j110, mVar7, fVar14, zC2, oVar10, fVar15, fVar6);
                                    c14 = 6;
                                    break;
                                case 14:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    int i212 = 3;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    arrayList3 = new ArrayList();
                                    List<nr.m0> list14 = pVar.f127277a;
                                    arrayList4 = new ArrayList();
                                    while (r2.hasNext()) {
                                        if (!((nr.m0) obj10).f127260c) {
                                            arrayList4.add(obj10);
                                        }
                                    }
                                    hashSet = new HashSet();
                                    arrayList5 = new ArrayList();
                                    while (r8.hasNext()) {
                                        if (hashSet.add(((nr.m0) obj11).f127262e)) {
                                            arrayList5.add(obj11);
                                        }
                                    }
                                    while (r2.hasNext()) {
                                        str = m0Var.f127261d;
                                        String str17 = m0Var.f127261d;
                                        if (str == null) {
                                        }
                                    }
                                    if (rVar != null) {
                                        typeKey = null;
                                    } else {
                                        typeKey = null;
                                    }
                                    if (typeKey == null) {
                                        z24 = false;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        bVar.getClass();
                                        typeKey.getClass();
                                        l22.a aVar117 = bVar.f160541b;
                                        arrayList3.add(new nr.s0(typeKey, aVar117.a(R.string.string_space_string_pattern, aVar117.getString(R.string.lbl_event), typeKey), null, 4, null));
                                    }
                                    if (jVar2 != null) {
                                        String str18 = qs.g.GROUP_RIDE.f147086c;
                                        bVar.getClass();
                                        str18.getClass();
                                        l22.a aVar118 = bVar.f160541b;
                                        arrayList3.add(new nr.s0(str18, aVar118.a(R.string.string_space_string_pattern, aVar118.getString(R.string.lbl_event), str18), null, 4, null));
                                    }
                                    if (rVar != null) {
                                        zG = false;
                                    } else {
                                        zG = false;
                                    }
                                    if (zG) {
                                        Context context5 = bVar.f160540a;
                                        c22.x0.f23314a.getClass();
                                        String str19 = c22.x0.f23391e8;
                                        arrayList3.add(new nr.s0(dh.b.D(context5, str19), dh.b.D(bVar.f160540a, str19), null));
                                    }
                                    if (!list4.isEmpty()) {
                                        arrayList3.add(new nr.s0(bVar.c(), null, null, 6, null));
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        objU5 = new nr.g.v(arrayList3);
                                        objO5 = objU5;
                                        c14 = 6;
                                    }
                                    c14 = 6;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                case 15:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    if (zJ) {
                                        z25 = false;
                                    } else {
                                        if (rVar != null) {
                                            parentId6 = rVar.getParentId();
                                        } else {
                                            parentId6 = null;
                                        }
                                        if (parentId6 == null) {
                                            z25 = true;
                                        } else {
                                            z25 = false;
                                        }
                                    }
                                    if (zJ) {
                                        z26 = false;
                                    } else {
                                        if (rVar != null) {
                                            parentId5 = rVar.getParentId();
                                        } else {
                                            parentId5 = null;
                                        }
                                        if (parentId5 == null) {
                                            z26 = true;
                                        } else {
                                            z26 = false;
                                        }
                                    }
                                    if (rVar != null) {
                                        description = rVar.getDescription();
                                    } else {
                                        description = null;
                                    }
                                    if (rVar != null) {
                                        activityName2 = rVar.getActivityName();
                                    } else {
                                        activityName2 = null;
                                    }
                                    if (rVar != null) {
                                        x0VarH5 = rVar.h();
                                    } else {
                                        x0VarH5 = null;
                                    }
                                    if (rVar != null) {
                                        parentId4 = rVar.getParentId();
                                    } else {
                                        parentId4 = null;
                                    }
                                    if (parentId4 != null) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    String strE3 = bVar.e(activityName2, x0VarH5, z27);
                                    if (rVar != null) {
                                        zC3 = false;
                                    } else {
                                        zC3 = false;
                                    }
                                    objO5 = new nr.g.e(zJ, description, z25, z26, zC3, strE3, new q72.f(4, tVar2, rVar));
                                    c14 = 6;
                                    break;
                                case 16:
                                    cVar3 = cVar3;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    if (s0Var2 != null) {
                                        exerciseSetsDTOQ = dh.b.Q(s0Var2);
                                    } else {
                                        exerciseSetsDTOQ = null;
                                    }
                                    objO5 = new nr.g.n(dh.b.E(exerciseSetsDTOQ, tVar2.Y4().getValue()), z16, tVar2.f146543n2);
                                    c14 = 6;
                                    break;
                                case 17:
                                    tVar3 = tVar7;
                                    cVar3 = cVar3;
                                    rVar = rVar;
                                    if (summaryDTO != null) {
                                        long j111 = tVar3.f146575z;
                                        long jC7 = summaryDTO.c5();
                                        metadataDTO11 = rVar.getMetadataDTO();
                                        if (metadataDTO11 != null) {
                                            profileImageUrlMedium = null;
                                        } else {
                                            profileImageUrlMedium = null;
                                        }
                                        objO5 = tVar3.x5(u0Var, j111, jC7, profileImageUrlMedium, zJ);
                                        tVar2 = tVar3;
                                        c14 = 6;
                                    } else {
                                        tVar2 = tVar3;
                                        c14 = 6;
                                        list7 = list7;
                                        objO5 = null;
                                    }
                                    break;
                                case 18:
                                    sr.i iVarD11 = bVar.d();
                                    if (s0Var2 != null) {
                                        arrayList6 = null;
                                    } else {
                                        arrayList6 = null;
                                    }
                                    aVar6 = new nr.g.u.a(arrayList6, zJ, zJ, hVar);
                                    objO5 = aVar6;
                                    tVar2 = tVar7;
                                    c14 = 6;
                                    break;
                                case 19:
                                    sr.i iVarD12 = bVar.d();
                                    if (s0Var2 != null) {
                                        arrayList7 = null;
                                    } else {
                                        arrayList7 = null;
                                    }
                                    aVar6 = new nr.g.u.c(arrayList7, zJ, hVar);
                                    objO5 = aVar6;
                                    tVar2 = tVar7;
                                    c14 = 6;
                                    break;
                                case 20:
                                    sr.i iVarD13 = bVar.d();
                                    if (s0Var2 != null) {
                                        arrayList8 = null;
                                    } else {
                                        arrayList8 = null;
                                    }
                                    aVar6 = new nr.g.u.b(arrayList8, zJ, hVar);
                                    objO5 = aVar6;
                                    tVar2 = tVar7;
                                    c14 = 6;
                                    break;
                                case 21:
                                    sr.i iVarD14 = bVar.d();
                                    if (s0Var2 != null) {
                                        arrayList9 = null;
                                    } else {
                                        arrayList9 = null;
                                    }
                                    aVar6 = new nr.g.u.d(arrayList9, zJ, hVar);
                                    objO5 = aVar6;
                                    tVar2 = tVar7;
                                    c14 = 6;
                                    break;
                                case 22:
                                    tVar4 = tVar7;
                                    rVar = rVar;
                                    if (s0Var2 != null) {
                                        arrayList10 = null;
                                    } else {
                                        arrayList10 = null;
                                    }
                                    sr.i iVarD15 = bVar.d();
                                    if (fVar4 == null) {
                                    }
                                    cVar3 = cVar3;
                                    if (arrayList10 == null) {
                                    }
                                    tVar2 = tVar4;
                                    c14 = 6;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                case 23:
                                    tVar5 = tVar7;
                                    rVar = rVar;
                                    c15 = 3;
                                    c16 = 2;
                                    if (summaryDTO != null) {
                                        startLatitude = summaryDTO.getStartLatitude();
                                    } else {
                                        startLatitude = null;
                                    }
                                    if (summaryDTO != null) {
                                        startLongitude = summaryDTO.getStartLongitude();
                                    } else {
                                        startLongitude = null;
                                    }
                                    if (startLatitude != null) {
                                        double dDoubleValue6 = startLongitude.doubleValue();
                                        double dDoubleValue7 = startLatitude.doubleValue();
                                        String strH3 = sr.b.h(bVar, kVarC, null, 6);
                                        if (rVar != null) {
                                            dVar = null;
                                        } else {
                                            dVar = null;
                                        }
                                        sr.b bVar9 = tVar5.f146541n;
                                        if (rVar != null) {
                                            zG2 = false;
                                        } else {
                                            zG2 = false;
                                        }
                                        rVar2 = new nr.g.r(kVarC, strH3, dVar, bVar9.a(dDoubleValue7, dDoubleValue6, zG2));
                                        objO5 = rVar2;
                                        tVar2 = tVar5;
                                        c14 = 6;
                                    }
                                    cVar3 = cVar3;
                                    tVar2 = tVar5;
                                    u0Var = u0Var;
                                    c14 = 6;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                case 24:
                                    t tVar19 = tVar7;
                                    rVar = rVar;
                                    sr.g gVar4 = (sr.g) bVar.f160558s.getValue();
                                    if (summaryDTO != null) {
                                        startTimeLocal = summaryDTO.getStartTimeLocal();
                                    } else {
                                        startTimeLocal = null;
                                    }
                                    if (summaryDTO != null) {
                                        zG3 = p005kotlin.jvm.internal.s.g(summaryDTO.getIsDecoDive(), Boolean.TRUE);
                                    } else {
                                        zG3 = false;
                                    }
                                    objJ = ss.k.j(ls.e.AVERAGE_DEPTH, aVar4);
                                    if (objJ instanceof Double) {
                                        d14 = (Double) objJ;
                                    } else {
                                        d14 = null;
                                    }
                                    gVar4.getClass();
                                    Context context6 = gVar4.f160569a;
                                    String strB13 = gVar4.b(d14, ns.u.a.Avg);
                                    objJ2 = ss.k.j(ls.e.MAX_DEPTH, aVar4);
                                    if (objJ2 instanceof Double) {
                                        d15 = (Double) objJ2;
                                    } else {
                                        d15 = null;
                                    }
                                    String strB14 = gVar4.b(d15, ns.u.a.Max);
                                    objJ3 = ss.k.j(ls.e.TOTAL_SURFACE_INTERVAL_TIME, aVar4);
                                    if (objJ3 instanceof Double) {
                                        d16 = (Double) objJ3;
                                    } else {
                                        d16 = null;
                                    }
                                    gVar4.getClass();
                                    ls.e eVar12 = ls.e.TOTAL_SURFACE_INTERVAL_TIME;
                                    aVar7 = gVar4.f160570b;
                                    strB = ss.k.b(eVar12, aVar7, d16, 9);
                                    if (strB == null) {
                                        strB = aVar7.getString(R.string.no_duration_value);
                                    }
                                    String str110 = strB;
                                    DateTime dateTime5 = new DateTime(startTimeLocal);
                                    pi0.a aVar119 = new pi0.a(context6);
                                    qi0.f fVar16 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                                    String strC9 = aVar119.c(dateTime5, fVar16);
                                    DateTime dateTime6 = new DateTime(startTimeLocal);
                                    double d110 = 1000L;
                                    if (summaryDTO != null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    DateTime dateTimePlusMillis3 = dateTime6.plusMillis(MathKt.b(d110 * dDoubleValue));
                                    dateTimePlusMillis3.getClass();
                                    String strC10 = new pi0.a(context6).c(dateTimePlusMillis3, fVar16);
                                    if (summaryDTO != null) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                    cVar3 = cVar3;
                                    tVar2 = tVar19;
                                    objO5 = new nr.g.C2446g(zG3, strB13, strB14, str110, strC9, strC10, gVar4.a(numValueOf));
                                    c14 = 6;
                                    break;
                                case 25:
                                    tVar5 = tVar7;
                                    rVar = rVar;
                                    c15 = 3;
                                    c16 = 2;
                                    aVar8 = hb2.g.a.GARMIN_DIVE;
                                    aVar5.getClass();
                                    aVar8.getClass();
                                    if (hb2.g.b(aVar5.f146086a, aVar8)) {
                                        rVar2 = new nr.g.f.a(new ds.f(tVar5, 18));
                                        objO5 = rVar2;
                                    } else {
                                        zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
                                        bVar.getClass();
                                        if (zF) {
                                            i17 = 2131231125;
                                        } else {
                                            i17 = 2131231126;
                                        }
                                        objO5 = new nr.g.f.b(i17, new ds.f(tVar5, 19));
                                    }
                                    tVar2 = tVar5;
                                    c14 = 6;
                                    break;
                                case 26:
                                    tVar5 = tVar7;
                                    rVar = rVar;
                                    c15 = 3;
                                    c16 = 2;
                                    if (tVar5.X1.g()) {
                                        objO5 = new nr.g.d(bVar.n(tVar5.A.f4360c), new ds.f(tVar5, 20), new ds.f(tVar5, 12));
                                        tVar2 = tVar5;
                                        c14 = 6;
                                    }
                                    cVar3 = cVar3;
                                    tVar2 = tVar5;
                                    u0Var = u0Var;
                                    c14 = 6;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                case 27:
                                    itemDetails = fVar.getItemDetails();
                                    if (itemDetails != null) {
                                        jVarC = itemDetails.c();
                                    } else {
                                        jVarC = null;
                                    }
                                    i18 = jVarC != null ? c.f146594b[jVarC.ordinal()] : -1;
                                    if (i18 == 1) {
                                        t tVar110 = tVar7;
                                        i19 = 3;
                                        arrayListJ5 = tVar110.j5(fVar.getItemDetails().d(), summaryDTO, zJ, privacyType, rVar);
                                        tVar5 = tVar110;
                                        rVar = rVar;
                                    } else if (i18 != 2) {
                                        i19 = 3;
                                        if (i18 != 3) {
                                            tVar5 = tVar7;
                                            rVar = rVar;
                                            arrayListJ5 = null;
                                        } else {
                                            t tVar111 = tVar7;
                                            arrayListJ5 = tVar111.p5(fVar.getItemDetails().d(), rVar, segmentDetailsListDTO, jVarX4, fVar5, zJ, arrayListK);
                                            tVar5 = tVar111;
                                            rVar = rVar;
                                        }
                                    } else {
                                        t tVar112 = tVar7;
                                        i19 = 3;
                                        arrayListJ5 = tVar112.f5(fVar.getItemDetails().d(), vVar, rVar, zJ);
                                        tVar5 = tVar112;
                                        rVar = rVar;
                                    }
                                    itemDetails2 = fVar.getItemDetails();
                                    if (itemDetails2 != null) {
                                        jVarC2 = itemDetails2.c();
                                    } else {
                                        jVarC2 = null;
                                    }
                                    itemDetails3 = fVar.getItemDetails();
                                    if (itemDetails3 != null) {
                                        c16 = 2;
                                        string = null;
                                    } else {
                                        c16 = 2;
                                        string = null;
                                    }
                                    objO5 = new nr.g.k(jVarC2, string, arrayListJ5);
                                    tVar2 = tVar5;
                                    c14 = 6;
                                    break;
                                case 28:
                                    aVar9 = hb2.g.a.GARMIN_SHOTVIEW;
                                    aVar5.getClass();
                                    aVar9.getClass();
                                    if (hb2.g.b(aVar5.f146086a, aVar9)) {
                                        objO5 = new nr.g.q.a(new ds.f(tVar7, 13));
                                    } else {
                                        zF2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
                                        bVar.getClass();
                                        if (zF2) {
                                            i24 = 2131231125;
                                        } else {
                                            i24 = 2131231126;
                                        }
                                        objO5 = new nr.g.q.b(i24, new ds.f(tVar7, 14));
                                    }
                                    list7 = list7;
                                    c14 = 6;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    break;
                                case 29:
                                    if (pVar.f127281e) {
                                        l22.b bVar10 = ((sr.o) bVar.f160560u.getValue()).f160579a;
                                        c22.x0.f23314a.getClass();
                                        String strB15 = bVar10.b(c22.g2.b(c22.x0.f23579pd));
                                        s62.a.f157643a.getClass();
                                        objO5 = new nr.g.p(strB15, null, v62.a.a(t62.b.f162798a), null, new ds.f(tVar7, 15), null, 10, null);
                                        list7 = list7;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                    }
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    c14 = 6;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                case 30:
                                    if (!list4.isEmpty()) {
                                        arrayList13 = new ArrayList(p13.y.r(list4, 10));
                                        while (r2.hasNext()) {
                                            String str111 = pVar3.f120282b;
                                            String str112 = pVar3.f120283c;
                                            String str113 = pVar3.f120284d;
                                            tVar6 = bVar.f160561v;
                                            aVar10 = bVar.f160541b;
                                            dateTimeQ = g22.k.q(str112, "yyyy-MM-dd", null);
                                            if (dateTimeQ == null) {
                                                strG = "";
                                            } else {
                                                pi0.e eVar13 = (pi0.e) tVar6.getValue();
                                                qi0.a aVar22 = qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY;
                                                strG = i3.e5.g(eVar13.a(dateTimeQ, aVar22), " - ", ((pi0.e) tVar6.getValue()).a(dateTimeQ2, aVar22));
                                            }
                                            strB2 = ss.k.b(ls.e.TOTAL_DISTANCE, aVar10, pVar3.f120285e, 9);
                                            if (strB2 == null) {
                                                str2 = "";
                                            } else {
                                                str2 = strB2;
                                            }
                                            d17 = pVar3.f120286f;
                                            if (d17 != null) {
                                                strB3 = new u00.a(aVar10).b((int) d17.doubleValue());
                                            } else {
                                                strB3 = "";
                                            }
                                            arrayList13.add(new nr.g.i(str111, strG, str2, strB3, new qn0.f(2, tVar7, pVar3)));
                                        }
                                        objO5 = new nr.g.j(i53.a.j(arrayList13));
                                        list7 = list7;
                                        c14 = 6;
                                        tVar2 = tVar7;
                                        rVar = rVar;
                                    }
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    c14 = 6;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                                default:
                                    cVar3 = cVar3;
                                    u0Var = u0Var;
                                    c14 = 6;
                                    tVar2 = tVar7;
                                    rVar = rVar;
                                    list7 = list7;
                                    objO5 = null;
                                    break;
                            }
                            if (objO5 != null) {
                                arrayList2.add(objO5);
                            }
                            arrayList = arrayList2;
                            u0Var = u0Var;
                            rVar3 = rVar;
                            tVar7 = tVar2;
                            iVar = iVar5;
                            cVar2 = cVar9;
                            it = it10;
                            n0Var = n0Var5;
                            aVar2 = aVar115;
                            k0Var = k0Var5;
                            cVar3 = cVar3;
                            list8 = list7;
                            i0Var = i0Var5;
                        }
                        gVar = new nr.t.g(arrayList);
                        this.f146704b = null;
                        this.f146705c = null;
                        this.f146703a = 1;
                        aVar3 = aVar;
                        if (jVar.emit(gVar, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i25 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            public c(r53.i[] iVarArr, t tVar) {
                this.f146700a = iVarArr;
                this.f146701b = tVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super nr.t.g> jVar, t13.d dVar) {
                r53.i[] iVarArr = this.f146700a;
                Object objA = s53.m.a(iVarArr, new a(iVarArr), new b(null, this.f146701b), jVar, dVar);
                return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(r53.i<nr.k0> iVar, t13.d<? super u0> dVar) {
            super(2, dVar);
            this.f146695c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new u0(this.f146695c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f146693a;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = t.A2;
                t tVar = t.this;
                r53.w wVar = new r53.w(new c(new r53.i[]{tVar.b5(), tVar.h5(), (r53.z1) tVar.f146514e1.getValue(), tVar.z5(), this.f146695c, (r53.z1) tVar.Z0.getValue(), tVar.y5(), tVar.L1, (r53.i) tVar.f146573y1.getValue()}, tVar), new a(tVar, null));
                b bVar = new b(tVar);
                this.f146693a = 1;
                if (wVar.collect(bVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityRounds$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class v extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146707a;

        public v(t13.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            v vVar = t.this.new v(dVar);
            vVar.f146707a = obj;
            return vVar;
        }

        @Override // e23.p
        public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f> v2Var, t13.d<? super Unit> dVar) {
            return ((v) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146707a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                int i14 = t.A2;
                ((r53.z1) t.this.Y0.getValue()).setValue(((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a);
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
                String strN = fb1.c.n("Error fetching activity rounds: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/k0;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initOverviewDetailsCollector$overviewData$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class v0 extends v13.i implements e23.q<r53.j<? super nr.k0>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146710b;

        public v0(t13.d<? super v0> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.k0> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            v0 v0Var = new v0(dVar);
            v0Var.f146709a = jVar;
            v0Var.f146710b = th3;
            return v0Var.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146710b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strP = am.j.p("overviewData ", th3);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strP);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityRounds$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class w extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f>>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146712b;

        public w(t13.d<? super w> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            w wVar = new w(dVar);
            wVar.f146711a = jVar;
            wVar.f146712b = th3;
            return wVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146712b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching activity rounds: ", th3.getMessage());
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qr/t$w0", "Lxg0/n;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class w0 implements xg0.n {
        public w0() {
        }

        @Override // xg0.n
        public final void R3(wg0.k kVar) {
            nr.w0.l1 l1Var = new nr.w0.l1(kVar);
            int i14 = t.A2;
            t.this.E4(l1Var);
        }

        @Override // xg0.n
        public final void S2(com.garmin.android.library.mapsdkadapter.i.d dVar, int i14) {
            dVar.getClass();
        }

        @Override // xg0.n
        public final void o4(wg0.a aVar, ie2.c cVar) {
            aVar.getClass();
            Long l14 = aVar.f185042a;
            int i14 = t.A2;
            t tVar = t.this;
            ps.r value = tVar.W4().getValue();
            String activityName = value != null ? value.getActivityName() : null;
            ActivityDetailChartDTO value2 = tVar.N4().getValue();
            Integer numValueOf = value2 != null ? Integer.valueOf(value2.I()) : null;
            ActivityDetailChartDTO value3 = tVar.N4().getValue();
            Integer numValueOf2 = value3 != null ? Integer.valueOf(value3.M()) : null;
            ps.r value4 = tVar.W4().getValue();
            tVar.E4(new nr.w0.b0(l14, activityName, !(numValueOf == null || numValueOf2 == null || numValueOf.intValue() >= numValueOf2.intValue()) || (value4 != null && oe2.f.C(value4)), tVar.Z.a4(), cVar));
        }

        @Override // xg0.n
        public final void r6(wg0.a aVar, wg0.c cVar) {
            List listB1;
            List<wg0.c> list;
            aVar.getClass();
            wg0.l lVar = aVar.f185059r;
            if (lVar == null || (list = lVar.f185103b) == null) {
                listB1 = null;
            } else {
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((wg0.c) it.next()).f185077b);
                }
                listB1 = p13.h0.b1(arrayList);
            }
            int i14 = t.A2;
            t tVar = t.this;
            nr.v value = tVar.h5().getValue();
            r80.b bVarB = value != null ? value.b() : null;
            ps.r value2 = tVar.W4().getValue();
            if (value2 == null || listB1 == null) {
                return;
            }
            ps.r rVar = value2;
            if (listB1.size() == 1) {
                r80.b bVar = bVarB;
                tVar.E4(new nr.w0.k1(tVar.V4(rVar), listB1, 1, oe2.f.J(rVar), bVar != null ? bVar.getProductDisplayName() : null, bVar != null ? bVar.getImageUrl() : null));
            } else {
                r80.b bVar2 = bVarB;
                tVar.E4(new nr.w0.p0(tVar.V4(rVar), listB1, oe2.f.J(rVar), bVar2 != null ? bVar2.getProductDisplayName() : null, bVar2 != null ? bVar2.getImageUrl() : null));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityRounds$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class x extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f>>, Throwable, t13.d<? super Unit>, Object> {
        public x(t13.d<? super x> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.f>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return t.this.new x(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"qr/t$x0", "Lxr/j;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class x0 implements xr.j {
        public x0() {
        }

        @Override // xr.j
        public final void a() {
            t tVar = t.this;
            tVar.X1.c();
            ((r53.z1) tVar.Y1.getValue()).setValue(Boolean.valueOf(tVar.X1.k()));
        }

        @Override // xr.j
        public final void b() {
            int i14 = t.A2;
            t tVar = t.this;
            ps.s0 value = tVar.k5().getValue();
            if (value != null) {
                ExerciseSetsDTO exerciseSetsDTOQ = dh.b.Q(value);
                tVar.E4(new nr.w0.l0(exerciseSetsDTOQ, dh.b.E(exerciseSetsDTOQ, tVar.Y4().getValue())));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ljr/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityShareConfiguration$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class y extends v13.i implements e23.p<r53.j<? super jr.c>, t13.d<? super Unit>, Object> {
        public y(t13.d<? super y> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new y(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super jr.c> jVar, t13.d<? super Unit> dVar) {
            return ((y) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            r53.p2 p2Var = t.this.f146532k0;
            do {
                value = p2Var.getValue();
            } while (!q6.f.z(((Number) value).intValue() + 1, p2Var, value));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class y0 implements r53.i<com.garmin.android.apps.connectmobile.repcounting.model.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f146717a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f146718a;

            /* JADX INFO: renamed from: qr.t$y0$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$special$$inlined$map$1$2", f = "ActivityDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2758a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f146719a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f146720b;

                public C2758a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f146719a = obj;
                    this.f146720b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f146718a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2758a c2758a;
                if (dVar instanceof C2758a) {
                    c2758a = (C2758a) dVar;
                    int i14 = c2758a.f146720b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2758a.f146720b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2758a = new C2758a(dVar);
                    }
                } else {
                    c2758a = new C2758a(dVar);
                }
                Object obj2 = c2758a.f146719a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2758a.f146720b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    com.garmin.android.apps.connectmobile.repcounting.model.c cVar = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                    Iterator<T> it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        cVar.C(((com.garmin.android.apps.connectmobile.repcounting.model.c) it.next()).F());
                    }
                    c2758a.f146720b = 1;
                    if (this.f146718a.emit(cVar, c2758a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public y0(r53.i iVar) {
            this.f146717a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c> jVar, t13.d dVar) {
            Object objCollect = this.f146717a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljr/c;", "shareConfiguration", "", "<anonymous>", "(Ljr/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getActivityShareConfiguration$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class z extends v13.i implements e23.p<jr.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f146722a;

        public z(t13.d<? super z> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            z zVar = t.this.new z(dVar);
            zVar.f146722a = obj;
            return zVar;
        }

        @Override // e23.p
        public final Object invoke(jr.c cVar, t13.d<? super Unit> dVar) {
            return ((z) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            jr.c cVar = (jr.c) this.f146722a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            t.this.T.setValue(cVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class z0 implements r53.i<com.garmin.android.apps.connectmobile.repcounting.model.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f146724a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f146725a;

            /* JADX INFO: renamed from: qr.t$z0$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$special$$inlined$map$2$2", f = "ActivityDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2759a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f146726a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f146727b;

                public C2759a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f146726a = obj;
                    this.f146727b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f146725a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2759a c2759a;
                if (dVar instanceof C2759a) {
                    c2759a = (C2759a) dVar;
                    int i14 = c2759a.f146727b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2759a.f146727b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2759a = new C2759a(dVar);
                    }
                } else {
                    c2759a = new C2759a(dVar);
                }
                Object obj2 = c2759a.f146726a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2759a.f146727b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Object objD0 = p13.h0.d0((List) obj);
                    c2759a.f146727b = 1;
                    if (this.f146725a.emit(objD0, c2759a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public z0(r53.i iVar) {
            this.f146724a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super com.garmin.android.apps.connectmobile.repcounting.model.c> jVar, t13.d dVar) {
            Object objCollect = this.f146724a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(nr.h hVar, kr.e eVar, am.m mVar, fo1.f fVar, pc0.j jVar, d60.b bVar, ru1.d dVar, a22.i iVar, ou1.d dVar2, aq.h3 h3Var, zf0.d dVar3, am.x1 x1Var, vo1.c cVar, sr.b bVar2, am.d dVar4, f12.l lVar, qr.a aVar, or.b bVar3, mr.q qVar, com.garmin.android.apps.connectmobile.b1 b1Var, ne0.j jVar2) {
        boolean z14 = false;
        hVar.getClass();
        eVar.getClass();
        mVar.getClass();
        fVar.getClass();
        jVar.getClass();
        bVar.getClass();
        dVar.getClass();
        iVar.getClass();
        dVar2.getClass();
        h3Var.getClass();
        dVar3.getClass();
        x1Var.getClass();
        cVar.getClass();
        bVar2.getClass();
        dVar4.getClass();
        lVar.getClass();
        aVar.getClass();
        bVar3.getClass();
        qVar.getClass();
        b1Var.getClass();
        jVar2.getClass();
        this.f146501a = hVar;
        this.f146504b = eVar;
        this.f146507c = mVar;
        this.f146510d = fVar;
        this.f146513e = jVar;
        this.f146516f = bVar;
        this.f146519g = dVar;
        this.f146522h = iVar;
        this.f146525i = dVar2;
        this.f146528j = h3Var;
        this.f146531k = dVar3;
        this.f146535l = x1Var;
        this.f146538m = cVar;
        this.f146541n = bVar2;
        this.f146544o = dVar4;
        this.f146547p = lVar;
        this.f146550q = aVar;
        this.f146553r = bVar3;
        this.f146558t = qVar;
        this.f146563v = b1Var;
        this.f146566w = jVar2;
        ActivityListItemDTO activityListItemDTO = hVar.f127184c;
        this.f146569x = activityListItemDTO;
        p13.j0 j0Var = p13.j0.f134944a;
        this.f146572y = j0Var;
        this.f146575z = hVar.f127182a;
        am.x0 x0Var = hVar.f127183b;
        String str = null;
        if (x0Var == null) {
            x0Var = activityListItemDTO != null ? activityListItemDTO.f29265g : null;
            if (x0Var == null) {
                x0Var = am.x0.f4346x;
            }
        }
        this.A = x0Var;
        this.B = hVar.f127185d;
        this.C = hVar.f127186e;
        this.D = hVar.f127187f;
        this.E = (o91.a) KoinJavaComponent.get$default(o91.a.class, null, null, 6, null);
        this.F = r53.q2.a(new jr.d(null, 1, null));
        this.I = r53.q2.a(j0Var);
        this.P = r53.q2.a(new jr.a(null, null, null, 7, null));
        this.T = r53.q2.a(new jr.c(null, null, 3, null));
        this.X = r53.q2.a(j0Var);
        this.Y = r53.q2.a(j0Var);
        this.Z = new os.e();
        this.f146532k0 = r53.q2.a(0);
        r53.p2 p2VarA = r53.q2.a(0);
        this.H0 = p2VarA;
        this.I0 = r53.q2.a(0);
        this.J0 = r53.q2.a(new nr.t.f(0L, null, null, false, false, false, false, null, null, null, false, false, false, null, false, false, false, 131071, null));
        this.K0 = o13.m.b(new qn0.m(10));
        o13.t tVarB = o13.m.b(new qn0.m(12));
        this.L0 = o13.m.b(new qn0.m(23));
        o13.t tVarB2 = o13.m.b(new ds.f(this, 8));
        this.M0 = o13.m.b(new ds.f(this, 10));
        r53.p2 p2VarA2 = r53.q2.a(null);
        this.N0 = p2VarA2;
        this.O0 = r53.s.d(p2VarA2);
        this.P0 = o13.m.b(new qr.n(5));
        this.Q0 = o13.m.b(new qr.n(6));
        this.R0 = o13.m.b(new qr.n(7));
        this.S0 = o13.m.b(new qr.n(9));
        this.T0 = o13.m.b(new qr.n(10));
        this.U0 = o13.m.b(new qn0.m(20));
        o13.t tVarB3 = o13.m.b(new qr.n(0));
        this.V0 = tVarB3;
        y0 y0Var = new y0((r53.z1) tVarB3.getValue());
        w9.a aVarA = androidx.lifecycle.v1.a(this);
        r53.k2.f150703a.getClass();
        r53.l2 l2Var = r53.k2.a.f150705b;
        this.W0 = r53.s.K(y0Var, aVarA, l2Var, null);
        this.X0 = r53.s.K(new z0((r53.z1) tVarB3.getValue()), androidx.lifecycle.v1.a(this), l2Var, null);
        this.Y0 = o13.m.b(new qr.n(8));
        this.Z0 = o13.m.b(new qr.n(11));
        this.f146502a1 = o13.m.b(new qr.n(12));
        this.f146505b1 = o13.m.b(new qr.n(13));
        this.f146508c1 = r53.q2.a(null);
        this.f146511d1 = o13.m.b(new qr.n(14));
        this.f146514e1 = o13.m.b(new qr.n(15));
        this.f146517f1 = o13.m.b(new qr.n(16));
        this.f146520g1 = o13.m.b(new qn0.m(11));
        this.f146526i1 = j0Var;
        this.f146529j1 = o13.m.b(new ds.f(this, 6));
        this.f146533k1 = o13.m.b(new qn0.m(13));
        this.f146536l1 = o13.m.b(new qn0.m(14));
        this.f146539m1 = o13.m.b(new qn0.m(15));
        this.f146542n1 = o13.m.b(new qn0.m(16));
        this.f146545o1 = o13.m.b(new qn0.m(17));
        this.f146548p1 = o13.m.b(new qn0.m(18));
        this.f146551q1 = o13.m.b(new qn0.m(19));
        this.f146554r1 = o13.m.b(new qn0.m(21));
        this.f146556s1 = o13.m.b(new qn0.m(22));
        this.f146559t1 = o13.m.b(new qn0.m(24));
        this.f146561u1 = o13.m.b(new qn0.m(25));
        this.f146564v1 = o13.m.b(new qn0.m(26));
        this.f146567w1 = o13.m.b(new qn0.m(27));
        this.f146570x1 = o13.m.b(new qn0.m(28));
        this.f146573y1 = o13.m.b(new ds.f(this, 7));
        this.f146576z1 = o13.m.b(new qn0.m(29));
        this.A1 = o13.m.b(new qr.n(1));
        this.B1 = o13.m.b(new qr.n(2));
        this.C1 = o13.m.b(new qr.n(3));
        this.F1 = lq.h.ALL;
        this.G1 = ln.b.f113638l;
        r53.p2 p2VarA3 = r53.q2.a(null);
        this.J1 = p2VarA3;
        this.K1 = r53.s.d(p2VarA3);
        this.L1 = r53.q2.a(new nr.i(null, false, false, null, 15, null));
        this.M1 = r53.q2.a(new nr.t.g(j0Var));
        this.N1 = r53.q2.a(new nr.t.h(j0Var));
        this.O1 = r53.q2.a(new nr.t.c(j0Var));
        this.P1 = r53.q2.a(new nr.t.a(null, null, null, null, 15, null));
        this.Q1 = r53.q2.a(rr.k.TIME);
        this.R1 = r53.q2.a(Boolean.TRUE);
        this.S1 = r53.q2.a(new nr.t.e(null, null, null, null, null, 31, null));
        this.U1 = r53.q2.a(new nr.t.d(z14, str, 3, null == true ? 1 : 0));
        this.V1 = o13.m.b(new qr.n(4));
        this.W1 = r53.q2.a(new nr.t.b(false, false, null == true ? 1 : 0, 7, null));
        am.f fVarY = dVar4.Y();
        f12.l lVar2 = fVarY.f3932a;
        this.X1 = fVarY;
        this.Y1 = o13.m.b(new ds.f(this, 9));
        ds.n.f61011h.getClass();
        r53.p2 p2VarA4 = r53.q2.a(ds.n.f61012i);
        this.Z1 = p2VarA4;
        this.f146503a2 = r53.s.d(p2VarA4);
        r53.p2 p2VarA5 = r53.q2.a(null);
        this.f146506b2 = p2VarA5;
        this.f146509c2 = r53.s.d(p2VarA5);
        r53.p2 p2VarA6 = r53.q2.a(com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f));
        this.f146512d2 = p2VarA6;
        this.f146515e2 = r53.s.d(p2VarA6);
        r53.p2 p2VarA7 = r53.q2.a(j0Var);
        this.f146518f2 = p2VarA7;
        this.f146521g2 = r53.s.d(p2VarA7);
        this.f146524h2 = (kr.j) KoinJavaComponent.get$default(kr.j.class, null, null, 6, null);
        r53.p2 p2VarA8 = r53.q2.a(0);
        this.f146527i2 = p2VarA8;
        this.f146530j2 = r53.s.d(p2VarA8);
        Boolean bool = Boolean.FALSE;
        r53.p2 p2VarA9 = r53.q2.a(bool);
        this.f146534k2 = p2VarA9;
        this.f146537l2 = r53.s.d(p2VarA9);
        this.f146540m2 = new w0();
        this.f146543n2 = new x0();
        this.f146546o2 = new h();
        this.f146549p2 = new f();
        this.f146552q2 = new a1();
        this.f146555r2 = new e();
        this.f146557s2 = r53.q2.a(bool);
        r53.p2 p2VarA10 = r53.q2.a(bool);
        this.f146560t2 = p2VarA10;
        this.f146562u2 = new c80.b((r53.o2) tVarB2.getValue(), r53.q2.a(j53.l.b()), (r53.z1) tVarB.getValue(), p2VarA, p2VarA10);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new a(null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new v5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new w5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new y5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new k5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new l5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new n5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new t5(this, this.A, null), 3);
        C5();
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new u5(this, this.A, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new x5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new s5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new o5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new r5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new q5(this, null), 3);
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new p5(this, null), 3);
        B5();
        r53.p2 p2VarA11 = r53.q2.a(Boolean.valueOf(lVar2.W2("key_activity_change_color_tip", true)));
        this.f146568w2 = p2VarA11;
        this.f146571x2 = r53.s.d(p2VarA11);
        r53.p2 p2VarA12 = r53.q2.a(Boolean.valueOf(lVar2.W2("key_activity_upload_a_photo_tip", true)));
        this.f146574y2 = p2VarA12;
        this.f146577z2 = r53.s.d(p2VarA12);
    }

    public static final void A4(t tVar) {
        am.m mVar = tVar.f146507c;
        long j8 = tVar.f146575z;
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.b0(mVar, j8, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new m1(tVar, null), r53.s.A(c2Var, x53.b.f189152a)), new n1(tVar, null)), new o1(null)), new p1(tVar, null)), androidx.lifecycle.v1.a(tVar));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public static boolean A5(List list, qs.x xVar) {
        if (list == null || xVar == null) {
            return false;
        }
        for (Object obj : list) {
            if (((ps.x1) obj).a2() == xVar) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static final r53.z1 B4(t tVar) {
        return (r53.z1) tVar.R0.getValue();
    }

    public static final void C4(t tVar, c80.t tVar2) {
        List<c80.t> value;
        ArrayList arrayList;
        r53.z1<List<c80.t>> z1Var = tVar.f146562u2.f25297c;
        do {
            value = z1Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : value) {
                if (!p005kotlin.jvm.internal.s.g((c80.t) obj, tVar2)) {
                    arrayList.add(obj);
                }
            }
        } while (!z1Var.b(value, arrayList));
    }

    public static boolean E5(ps.r rVar, nr.v0 v0Var) {
        Long matchedCuratedCourseId;
        ps.a1 metadataDTO;
        Long matchedCuratedCourseId2;
        int i14 = c.f146598f[v0Var.ordinal()];
        if (i14 == 1) {
            ps.a1 metadataDTO2 = rVar.getMetadataDTO();
            if ((metadataDTO2 != null ? Boolean.valueOf(metadataDTO2.getIsFavorite()) : null) == null) {
                return false;
            }
        } else if (i14 != 2) {
            if (i14 == 7) {
                ps.a1 metadataDTO3 = rVar.getMetadataDTO();
                if ((metadataDTO3 != null ? metadataDTO3.getMatchedCuratedCourseId() : null) == null) {
                    return false;
                }
                ps.a1 metadataDTO4 = rVar.getMetadataDTO();
                if (metadataDTO4 != null && (matchedCuratedCourseId = metadataDTO4.getMatchedCuratedCourseId()) != null && matchedCuratedCourseId.longValue() == -1) {
                    return false;
                }
            } else if (i14 == 8 && ((metadataDTO = rVar.getMetadataDTO()) == null || (matchedCuratedCourseId2 = metadataDTO.getMatchedCuratedCourseId()) == null || matchedCuratedCourseId2.longValue() != -1)) {
                return false;
            }
        } else if (rVar.getDescription() == null) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void I5(t tVar, String str, nr.p0.a aVar, int i14) {
        if ((i14 & 2) != 0) {
            aVar = null;
        }
        tVar.H5(str, aVar, null);
    }

    public static ArrayList K4(List list, ls.a aVar) {
        Object next;
        jr.o oVar;
        jr.p pVarB;
        ls.e eVarA;
        Object next2;
        Object next3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                jr.o oVar2 = (jr.o) obj;
                if (oVar2.getZOrder() == null) {
                    linkedHashMap.put(Integer.valueOf(i14), p13.w.c(oVar2));
                } else {
                    Iterator it = linkedHashMap.values().iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        Iterator it3 = ((List) next2).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                            Integer zOrder = ((jr.o) next3).getZOrder();
                            int iIntValue = oVar2.getZOrder().intValue();
                            if (zOrder != null && zOrder.intValue() == iIntValue) {
                                break;
                            }
                        }
                    } while (next3 == null);
                    Collection collection = (Collection) next2;
                    if (collection == null || collection.isEmpty()) {
                        Integer numValueOf = Integer.valueOf(i14);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            Integer zOrder2 = ((jr.o) obj2).getZOrder();
                            int iIntValue2 = oVar2.getZOrder().intValue();
                            if (zOrder2 != null && zOrder2.intValue() == iIntValue2) {
                                arrayList.add(obj2);
                            }
                        }
                        linkedHashMap.put(numValueOf, arrayList);
                    }
                }
                i14 = i15;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() == 1) {
                oVar = (jr.o) ((List) entry.getValue()).get(0);
            } else {
                Iterator it4 = ((Iterable) entry.getValue()).iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    pVarB = ((jr.o) next).b();
                } while (!((pVarB == null || (eVarA = is.m.a(pVarB)) == null) ? false : ss.k.p(eVarA, ss.k.j(eVarA, aVar))));
                jr.o oVar3 = (jr.o) next;
                oVar = oVar3 == null ? (jr.o) p13.h0.b0((List) entry.getValue()) : oVar3;
            }
            if (oVar != null) {
                arrayList2.add(oVar);
            }
        }
        return arrayList2;
    }

    public static void O4(t tVar, am.x0 x0Var, int i14) {
        r53.i iVarB;
        ps.a1 metadataDTO;
        if ((i14 & 1) != 0) {
            x0Var = tVar.A;
        }
        ps.r value = tVar.W4().getValue();
        boolean zG = (value == null || (metadataDTO = value.getMetadataDTO()) == null) ? false : p005kotlin.jvm.internal.s.g(metadataDTO.getIsWheelchair(), Boolean.TRUE);
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        am.x0 x0Var2 = am.x0.f4309n1;
        ou1.d dVar = tVar.f146525i;
        if (x0Var == x0Var2) {
            r53.l lVar = new r53.l(new r53.i[]{dVar.b(x0Var, zG), dVar.b(am.x0.f4322q2, zG)});
            int i15 = r53.p0.f150790a;
            iVarB = new r53.m0(lVar);
        } else {
            iVarB = dVar.b(x0Var, zG);
        }
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new qr.n0(tVar, null), r53.s.A(iVarB, x53.b.f189152a)), new qr.o0(arrayList, null)), new qr.p0(null)), new qr.q0(tVar, arrayList, null)), androidx.lifecycle.v1.a(tVar));
    }

    public static final nr.j x4(t tVar, ps.r rVar, nr.n0 n0Var, nr.c cVar, ps.i0 i0Var) {
        ps.a1 metadataDTO;
        ps.a1 metadataDTO2;
        am.x0 x0VarH;
        tVar.getClass();
        return new nr.j(new ls.a((rVar == null || (x0VarH = rVar.h()) == null) ? null : x0VarH.f4358a, rVar != null ? rVar.getSummaryDTO() : null, null, null, false, null, null, rVar != null ? rVar.t() : null, null, null, (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null) ? null : metadataDTO2.x0(), null, null, null, null, (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null) ? null : metadataDTO.getLapCount(), null, null, n0Var != null ? n0Var.f127266b : null, n0Var != null ? n0Var.f127265a : null, rVar != null ? rVar.getDiveInfoDTO() : null, null, null, i0Var, rVar != null ? rVar.getDeviceDisplayUnitsDTO() : null, 6519676, null), cVar, null, 4, null);
    }

    public static final wg0.a y4(ps.r rVar, t tVar) {
        List<aq.c> listA;
        String displayName;
        boolean z14;
        am.l lVar;
        boolean zG;
        String str;
        ps.a2 userInfoDto;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        ps.a2 userInfoDto2;
        String fullName;
        ps.a2 userInfoDto3;
        ps.a2 userInfoDto4;
        Long userProfilePk;
        ps.q qVarV4 = tVar.V4(rVar);
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> value = tVar.v5().getValue();
        Long userProfileId = rVar.getUserProfileId();
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar2 = value.get(userProfileId != null ? Integer.valueOf((int) userProfileId.longValue()) : null);
        am.m mVar = tVar.f146507c;
        mVar.getClass();
        kr.f fVar = mVar.f4072d;
        if (fVar == null || (listA = ((vg0.a) KoinJavaComponent.get$default(vg0.a.class, null, null, 6, null)).a(fVar.f106214a, qVarV4)) == null) {
            listA = p13.j0.f134944a;
        }
        List<aq.c> list = listA;
        nr.j0 j0Var = (nr.j0) ((r53.z1) tVar.f146514e1.getValue()).getValue();
        nr.j0 j0Var2 = j0Var != null ? new nr.j0(j0Var.f127208a, j0Var.f127209b, null, j0Var.f127211d, j0Var.f127212e, j0Var.f127213f, j0Var.f127214g, j0Var.f127215h) : null;
        os.a aVar = tVar.Z;
        ps.a1 metadataDTO = rVar.getMetadataDTO();
        wg0.l lVarA = pr.a.a(rVar, j0Var2, aVar, metadataDTO != null ? metadataDTO.C0() : false);
        wg0.m mVarT4 = tVar.T4(tVar.f146523h1, tVar.f146526i1);
        list.getClass();
        Long activityId = rVar.getActivityId();
        String activityName = rVar.getActivityName();
        String str2 = "";
        if (activityName == null) {
            activityName = "";
        }
        am.x0 x0VarH = rVar.h();
        ps.a1 metadataDTO2 = rVar.getMetadataDTO();
        Integer numValueOf = (metadataDTO2 == null || (userInfoDto4 = metadataDTO2.getUserInfoDto()) == null || (userProfilePk = userInfoDto4.getUserProfilePk()) == null) ? null : Integer.valueOf((int) userProfilePk.longValue());
        ps.a1 metadataDTO3 = rVar.getMetadataDTO();
        if (metadataDTO3 == null || (userInfoDto3 = metadataDTO3.getUserInfoDto()) == null || (displayName = userInfoDto3.getDisplayName()) == null) {
            displayName = "";
        }
        ps.a1 metadataDTO4 = rVar.getMetadataDTO();
        if (metadataDTO4 != null && (userInfoDto2 = metadataDTO4.getUserInfoDto()) != null && (fullName = userInfoDto2.getFullName()) != null) {
            str2 = fullName;
        }
        ps.q1 summaryDTO = rVar.getSummaryDTO();
        DateTime dateTimeN = c22.j0.N(summaryDTO != null ? summaryDTO.getStartTimeGMT() : null, true);
        ps.q1 summaryDTO2 = rVar.getSummaryDTO();
        DateTime dateTimeN2 = c22.j0.N(summaryDTO2 != null ? summaryDTO2.getStartTimeLocal() : null, false);
        am.l.a aVar2 = am.l.f4047c;
        ps.a accessControlRuleDTO = rVar.getAccessControlRuleDTO();
        String categoryAccessRule = accessControlRuleDTO != null ? accessControlRuleDTO.b().getCategoryAccessRule() : null;
        aVar2.getClass();
        am.l lVarA2 = am.l.a.a(categoryAccessRule, am.l.f4051g);
        String typeKey = null;
        String str3 = displayName;
        String description = rVar.getDescription();
        boolean zK = oe2.f.K(rVar);
        boolean zG2 = oe2.f.G(rVar);
        ps.p0 eventTypeDTO = rVar.getEventTypeDTO();
        if (eventTypeDTO != null) {
            typeKey = eventTypeDTO.getTypeKey();
        }
        boolean zG3 = p005kotlin.jvm.internal.s.g(typeKey, qs.g.RACE.f147086c);
        ps.q1 summaryDTO3 = rVar.getSummaryDTO();
        if (summaryDTO3 != null) {
            zG = p005kotlin.jvm.internal.s.g(summaryDTO3.getIsDecoDive(), Boolean.TRUE);
            lVar = lVarA2;
            z14 = zG3;
        } else {
            z14 = zG3;
            lVar = lVarA2;
            zG = false;
        }
        GroupDTO.c cVar = GroupDTO.c.NOT_DEFINED;
        if (r16 == 0 || (profileImageUrls = lVar2.getProfileImageUrls()) == null || (profileImageUrlMedium = profileImageUrls.f46876e) == null) {
            ps.a1 metadataDTO5 = rVar.getMetadataDTO();
            if (metadataDTO5 == null || (userInfoDto = metadataDTO5.getUserInfoDto()) == null) {
                str = null;
            } else {
                String profileImageUrlMedium = userInfoDto.getProfileImageUrlMedium();
                str = profileImageUrlMedium;
            }
        } else {
            str = profileImageUrlMedium;
        }
        return new wg0.a(activityId, activityName, x0VarH, numValueOf, str3, str2, dateTimeN, dateTimeN2, lVar, description, zK, zG2, z14, zG, list, qVarV4, false, lVarA, mVarT4, null, cVar, false, null, null, false, null, new b12.b(str, null, null, null, null, 30, null), null, qVarV4.getSpeedDeviceDisplayMeasure(), 197722112, null);
    }

    public static final void z4(t tVar, boolean z14) {
        am.m mVar = tVar.f146507c;
        long j8 = tVar.f146575z;
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.w(mVar, j8, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new qr.e1(tVar, null), r53.s.A(c2Var, x53.b.f189152a)), new qr.f1(tVar, z14, null)), new qr.g1(null)), new qr.h1(tVar, null)), androidx.lifecycle.v1.a(tVar));
    }

    public final void B5() {
        M4(this.A);
        S4(this.A);
        long j8 = this.f146575z;
        X4(j8);
        am.m mVar = this.f146507c;
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.g0(mVar, j8, null));
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new m2(this, null), r53.s.A(c2Var, bVar)), new n2(this, null)), new o2(null)), new p2(this, null)), androidx.lifecycle.v1.a(this));
        kr.e eVar = this.f146504b;
        eVar.getClass();
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new h2(this, null), new r53.c2(new kr.d(eVar, null))), new i2(this, null)), new j2(null)), new k2(this, null)), androidx.lifecycle.v1.a(this));
        P4(j8);
        R4(j8);
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new qr.a1(this, null), r53.s.A(new r53.c2(new am.v(mVar, j8, null)), bVar)), new qr.b1(this, null)), new qr.c1(null)), new qr.d1(this, null)), androidx.lifecycle.v1.a(this));
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new u1(this, null), new r53.c2(new am.e0(mVar, j8, null))), new v1(this, null)), new w1(null)), new x1(this, null)), androidx.lifecycle.v1.a(this));
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new j5(this, null), 3);
        c5(j8);
        d5(j8);
        mr.b bVarX = ge1.b.x(this.A);
        mr.e eVar2 = bVarX.f120239a;
        os.a aVar = bVarX.f120242d;
        this.Z = aVar;
        if (aVar.V2()) {
            Q4(j8);
            ge1.b.T(androidx.lifecycle.v1.a(this), bVar, null, new qr.v0(this, null), 2);
        }
        this.Z.getClass();
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new q1(this, null), r53.s.A(new r53.c2(new am.d0(mVar, j8, null)), bVar)), new r1(this, null)), new s1(null)), new t1(this, null)), androidx.lifecycle.v1.a(this));
        if (eVar2 != null && eVar2.getF120279a()) {
            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new a4(this, null), new r53.c2(new z3(this, j8, null))), new b4(this, null)), new c4(null)), new d4(this, null)), androidx.lifecycle.v1.a(this));
        }
        if (eVar2 == null || !eVar2.getF120280b()) {
            return;
        }
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new s2(this, null), new r53.c2(new r2(this, j8, null))), new t2(this, null)), new u2(null)), new v2(this, null)), androidx.lifecycle.v1.a(this));
    }

    public final void C5() {
        ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new u0(new r53.w(new t0(new r53.i[]{this.I0, s5(), (r53.z1) this.f146536l1.getValue(), a5(), (r53.z1) this.f146564v1.getValue(), (r53.z1) this.A1.getValue(), (r53.z1) this.B1.getValue(), (r53.z1) this.f146567w1.getValue(), (r53.z1) this.f146539m1.getValue()}), new v0(null)), null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        r0 = r0.getStartTimeLocal();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D4() {
        String startTimeLocal;
        b63.o oVarD;
        am.x0 x0VarH;
        ps.r value = W4().getValue();
        if (value == null || (r0 = value.getSummaryDTO()) == null || startTimeLocal == null) {
            return;
        }
        try {
            oVarD = b63.u.Companion.a(b63.u.INSTANCE, startTimeLocal).b();
        } catch (Exception e4) {
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.p(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivityDetailsViewModel", "Failed to parse activity date " + startTimeLocal + ". " + e4);
            oVarD = g22.l.d(b63.o.INSTANCE);
        }
        ps.r value2 = W4().getValue();
        if (value2 == null || (x0VarH = value2.h()) == null) {
            x0VarH = am.x0.f4346x;
        }
        E4(new nr.w0.e2(this.f146575z, oVarD, x0VarH));
    }

    public final void D5() {
        this.f146547p.T3(true);
        ((qd2.a) KoinJavaComponent.get$default(qd2.a.class, null, null, 6, null)).h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, this.f146575z);
        ((ou1.g) KoinJavaComponent.get$default(ou1.g.class, null, null, 6, null)).a(true);
    }

    public final void E4(nr.w0 w0Var) {
        Object value;
        ArrayList arrayListD1;
        o13.t tVar = this.K0;
        r53.z1 z1Var = (r53.z1) tVar.getValue();
        do {
            value = z1Var.getValue();
            arrayListD1 = p13.h0.d1((Collection) ((r53.z1) tVar.getValue()).getValue());
            arrayListD1.add(w0Var);
        } while (!z1Var.b(value, arrayListD1));
    }

    public final void F4(am.x0 x0Var) {
        if (this.A != x0Var) {
            this.A = x0Var;
            this.H1 = true;
            E4(new nr.w0.d2(this.f146541n.n(x0Var.f4360c)));
            M4(this.A);
            S4(this.A);
            this.Z = ge1.b.x(this.A).f120242d;
        }
    }

    public final void F5(String str, String str2, boolean z14, boolean z15) {
        String str3;
        String strL = this.f146544o.l();
        ps.r value = W4().getValue();
        am.x0 x0VarH = value != null ? value.h() : null;
        is.a.f94856a.getClass();
        ht.a aVar = (ht.a) KoinJavaComponent.get$default(ht.a.class, null, null, 6, null);
        Bundle bundleD = b71.i.d("Country", strL);
        if (x0VarH == null || (str3 = x0VarH.f4358a) == null) {
            str3 = am.x0.f4346x.f4358a;
        }
        bundleD.putString("ActivityType", str3);
        if (z14) {
            bundleD.putString("Type", "weblink");
        }
        if (z15) {
            bundleD.putString("ActivityParentType", am.z0.d(x0VarH, x0VarH == null ? am.x0.f4346x : x0VarH).f4358a);
        }
        if (str2 != null) {
            bundleD.putString("Target", str2);
        }
        Unit unit = Unit.INSTANCE;
        aVar.getClass();
        ht.a.a(bundleD, str);
    }

    public final void G4() {
        this.X1.i();
        r53.p2 p2Var = this.J0;
        nr.t.f fVar = (nr.t.f) p2Var.getValue();
        long j8 = fVar.f127336a;
        am.x0 x0Var = fVar.f127337b;
        List<nr.k> list = fVar.f127338c;
        boolean z14 = fVar.f127339d;
        boolean z15 = fVar.f127341f;
        boolean z16 = fVar.f127342g;
        String str = fVar.f127343h;
        String str2 = fVar.f127344i;
        String str3 = fVar.f127345j;
        boolean z17 = fVar.f127346k;
        boolean z18 = fVar.f127347l;
        boolean z19 = fVar.f127348m;
        Boolean bool = fVar.f127349n;
        boolean z24 = fVar.f127350o;
        boolean z25 = fVar.f127351p;
        boolean z26 = fVar.f127352q;
        x0Var.getClass();
        p2Var.k(null, new nr.t.f(j8, x0Var, list, z14, false, z15, z16, str, str2, str3, z17, z18, z19, bool, z24, z25, z26));
    }

    /* JADX WARN: Code duplicated, block: B:141:0x022e  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
    public final void G5(ro0.l lVar) {
        com.garmin.android.apps.connectmobile.activities.newmodel.o oVarD;
        im.n nVar;
        List<im.b> list;
        im.b bVar;
        boolean z14;
        Double anaerobicTrainingEffect;
        Double aerobicTrainingEffect;
        am.x0 x0VarH;
        am.x0 x0VarH2;
        am.x0 x0VarH3;
        int[] iArr = c.f146597e;
        Object obj = null;
        str = null;
        String str = null;
        str = null;
        String str2 = null;
        str = null;
        String str3 = null;
        switch (iArr[lVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                int i14 = iArr[lVar.ordinal()];
                if (i14 == 1) {
                    ps.r value = W4().getValue();
                    oVarD = ss.l.d(value != null ? value.getSummaryDTO() : null);
                } else if (i14 == 2) {
                    ps.r value2 = W4().getValue();
                    oVarD = ss.l.e(value2 != null ? value2.getSummaryDTO() : null);
                } else if (i14 == 3) {
                    ps.r value3 = W4().getValue();
                    oVarD = ss.l.f(value3 != null ? value3.getSummaryDTO() : null);
                }
                nr.c value4 = b5().getValue();
                if (value4 == null || (list = value4.f126998c) == null) {
                    nVar = im.n.SEATED_STANDING;
                } else {
                    for (Object obj2 : list) {
                        im.b bVar2 = (im.b) obj2;
                        if (bVar2.getB1() == 28 || bVar2.getB1() == 95) {
                            obj = obj2;
                            bVar = (im.b) obj;
                            if (bVar != null || (nVar = bVar.X) == null) {
                                nVar = im.n.SEATED_STANDING;
                            }
                        }
                    }
                    bVar = (im.b) obj;
                    if (bVar != null) {
                        nVar = im.n.SEATED_STANDING;
                    } else {
                        nVar = im.n.SEATED_STANDING;
                    }
                }
                E4(new nr.w0.q(oVarD, nVar));
                break;
            case 4:
                ps.r value5 = W4().getValue();
                ps.q1 summaryDTO = value5 != null ? value5.getSummaryDTO() : null;
                Double averageRunCadence = summaryDTO != null ? summaryDTO.getAverageRunCadence() : null;
                Double verticalOscillation = summaryDTO != null ? summaryDTO.getVerticalOscillation() : null;
                Double averageVerticalRatio = summaryDTO != null ? summaryDTO.getAverageVerticalRatio() : null;
                Double groundContactTime = summaryDTO != null ? summaryDTO.getGroundContactTime() : null;
                Double groundContactBalanceLeft = summaryDTO != null ? summaryDTO.getGroundContactBalanceLeft() : null;
                Double avgStepSpeedLoss = summaryDTO != null ? summaryDTO.getAvgStepSpeedLoss() : null;
                Double avgStepSpeedLossPercent = summaryDTO != null ? summaryDTO.getAvgStepSpeedLossPercent() : null;
                if (summaryDTO != null) {
                    ps.r value6 = W4().getValue();
                    E4(new nr.w0.s0(0, null, xy2.b.A(value6 != null ? value6.getMetadataDTO() : null), ss.k.p(ls.e.AVERAGE_RUN_CADENCE, averageRunCadence), ss.k.p(ls.e.AVERAGE_VERTICAL_OSCILLATION, verticalOscillation), ss.k.p(ls.e.AVERAGE_VERTICAL_RATIO, averageVerticalRatio), ss.k.p(ls.e.AVERAGE_GROUND_CONTACT_TIME, groundContactTime), ss.k.p(ls.e.AVERAGE_GROUND_CONTACT_TIME_BALANCE, groundContactBalanceLeft), ss.k.p(ls.e.AVERAGE_STEP_SPEED_LOSS, avgStepSpeedLoss), ss.k.p(ls.e.AVERAGE_STEP_SPEED_LOSS_PERCENT, avgStepSpeedLossPercent), 3, null));
                }
                break;
            case 5:
                ps.r value7 = W4().getValue();
                ps.q1 summaryDTO2 = value7 != null ? value7.getSummaryDTO() : null;
                double dDoubleValue = Double.NaN;
                double dDoubleValue2 = (summaryDTO2 == null || (aerobicTrainingEffect = summaryDTO2.getAerobicTrainingEffect()) == null) ? Double.NaN : aerobicTrainingEffect.doubleValue();
                if (summaryDTO2 != null && (anaerobicTrainingEffect = summaryDTO2.getAnaerobicTrainingEffect()) != null) {
                    dDoubleValue = anaerobicTrainingEffect.doubleValue();
                }
                aq.o3.b bVar3 = (Double.isNaN(dDoubleValue2) || Double.isNaN(dDoubleValue)) ? aq.o3.b.TRAINING_EFFECT_HELP_AEROBIC : aq.o3.b.TRAINING_EFFECT_HELP_BOTH;
                qs.u.a aVar = qs.u.f147173f;
                String trainingEffectLabel = summaryDTO2 != null ? summaryDTO2.getTrainingEffectLabel() : null;
                aVar.getClass();
                if (qs.u.a.a(trainingEffectLabel) != null) {
                    String trainingEffectLabel2 = summaryDTO2 != null ? summaryDTO2.getTrainingEffectLabel() : null;
                    z14 = trainingEffectLabel2 != null && (d53.w.J(trainingEffectLabel2) ^ true);
                }
                E4(new nr.w0.i1(bVar3, z14));
                break;
            case 6:
                ps.r value8 = W4().getValue();
                if (value8 != null && (x0VarH = value8.h()) != null) {
                    str3 = x0VarH.f4358a;
                }
                am.z0 z0Var = am.z0.f4390a;
                E4(new nr.w0.h0(am.z0.b(am.x0.f4297k1, str3) ? ro0.l.INDOOR_ROWING_PACE : lVar, m5(lVar)));
                break;
            case 7:
                ps.r value9 = W4().getValue();
                if (value9 != null && (x0VarH2 = value9.h()) != null) {
                    str2 = x0VarH2.f4358a;
                }
                am.z0 z0Var2 = am.z0.f4390a;
                E4(new nr.w0.h0(am.z0.b(am.x0.f4297k1, str2) ? ro0.l.INDOOR_ROWING_HEART_RATE : lVar, m5(lVar)));
                break;
            case 8:
                ps.r value10 = W4().getValue();
                if (value10 != null && (x0VarH3 = value10.h()) != null) {
                    str = x0VarH3.f4358a;
                }
                E4(new nr.w0.m0(lVar, str));
                break;
            default:
                E4(new nr.w0.h0(lVar, m5(lVar)));
                break;
        }
    }

    public final void H4() {
        this.f146574y2.k(null, Boolean.FALSE);
        this.X1.l();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    public final void H5(String str, nr.p0.a aVar, Integer num) {
        String str2;
        String strH;
        jr.h hVar;
        List<fs.e> listA;
        str.getClass();
        if (!this.f146547p.D4()) {
            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new qr.z(this, null), new r53.c2(new qr.y(this, this.f146575z, null))), new qr.a0(this, null)), new qr.b0(null)), new qr.c0(this, null)), androidx.lifecycle.v1.a(this));
        }
        if (aVar != null) {
            is.a aVar2 = is.a.f94856a;
            ps.r value = W4().getValue();
            am.x0 x0VarH = value != null ? value.h() : null;
            int iIntValue = num != null ? num.intValue() : 0;
            aVar2.getClass();
            ht.a aVar3 = (ht.a) KoinJavaComponent.get$default(ht.a.class, null, null, 6, null);
            if (aVar instanceof nr.p0.a.C2447a) {
                strH = "ActivityShareClassic";
            } else if (aVar instanceof nr.p0.a.d) {
                strH = "ActivityShareMap";
            } else if (aVar instanceof nr.p0.a.e) {
                strH = "ActivityShareMuscleMap";
            } else if (aVar instanceof nr.p0.a.g) {
                strH = "ActivityShareStylish";
            } else if (aVar instanceof nr.p0.a.f) {
                strH = "ActivityShareRoute";
            } else if (aVar instanceof nr.p0.a.h) {
                strH = "ActivityShareTransparent";
            } else if (aVar instanceof nr.p0.a.i) {
                strH = "ActivityShareTransparentPolyline";
            } else {
                strH = aVar instanceof nr.p0.a.c ? am.j.h(iIntValue, "option") : "";
            }
            boolean z14 = aVar instanceof nr.p0.a.c;
            String str3 = z14 ? "imageWithStats" : "predefinedTemplate";
            String str4 = "black";
            String str5 = "white";
            if (z14) {
                if (((nr.p0.a.c) aVar).f127293e.getF100059a()) {
                    str4 = "white";
                }
                str5 = str4;
            } else if (aVar instanceof nr.p0.a.h) {
                if (((nr.p0.a.h) aVar).f127301a) {
                    str4 = "white";
                }
                str5 = str4;
            } else if (aVar instanceof nr.p0.a.i) {
                if (((nr.p0.a.i) aVar).f127303b) {
                    str4 = "white";
                }
                str5 = str4;
            }
            nr.p0.a.c cVar = z14 ? (nr.p0.a.c) aVar : null;
            int size = (cVar == null || (hVar = cVar.f127293e) == null || (listA = hVar.a()) == null) ? 0 : listA.size();
            Bundle bundle = new Bundle();
            String strC = c22.b0.c();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = strC.toUpperCase(locale);
            upperCase.getClass();
            bundle.putString("Country", upperCase);
            bundle.putString("Target", str);
            bundle.putString("templateOption", strH);
            bundle.putString("dataOptionColor", str5);
            bundle.putLong("stickerCount", size);
            bundle.putString("Type", str3);
            bundle.putString("ActivityType", x0VarH != null ? x0VarH.f4358a : null);
            bundle.putString("ActivityParentType", am.z0.d(x0VarH, x0VarH == null ? am.x0.f4346x : x0VarH).f4358a);
            aVar3.getClass();
            ht.a.a(bundle, "Share_Activity");
        } else {
            F5("Share_Activity", str, true, true);
        }
        if (aVar instanceof nr.p0.a.c) {
            is.a.f94856a.getClass();
            ht.a aVar4 = (ht.a) KoinJavaComponent.get$default(ht.a.class, null, null, 6, null);
            for (fs.e eVar : ((nr.p0.a.c) aVar).f127293e.a()) {
                List<fs.g> list = eVar.f73382c;
                fs.b bVar = eVar.f73380a;
                fs.g gVar = (fs.g) p13.h0.e0(eVar.f73381b, list);
                if (gVar != null) {
                    String strN = gVar.f73393a;
                    int i14 = bVar == null ? -1 : is.a.C1813a.f94857a[bVar.ordinal()];
                    if (i14 == 1) {
                        strN = fb1.c.n("badge_", strN);
                    } else if (i14 == 2) {
                        strN = fb1.c.n("device_", strN);
                    }
                    int i15 = bVar != null ? is.a.C1813a.f94857a[bVar.ordinal()] : -1;
                    if (i15 == 1) {
                        str2 = "badge";
                    } else if (i15 == 2) {
                        str2 = "device";
                    } else if (i15 != 3) {
                        str2 = i15 != 4 ? "general" : "event";
                    } else {
                        str2 = "slogan";
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("stickerType", str2);
                    bundle2.putString("stickerKey", strN);
                    aVar4.getClass();
                    ht.a.a(bundle2, "SharedSticker");
                }
            }
        }
        if (this.f146565v2) {
            F5("ActivityShareSnackbarShare", str, false, false);
        }
    }

    public final void I4() {
        ps.r value = W4().getValue();
        ActivityListItemDTO activityListItemDTOC = value != null ? am.s1.c(fr.a.g(value, k5().getValue())) : null;
        ActivityListItemDTO activityListItemDTO = this.f146569x;
        if (activityListItemDTO != null && activityListItemDTOC != null) {
            activityListItemDTO.f29250b = activityListItemDTOC.f29250b;
            activityListItemDTO.f29253c = activityListItemDTOC.f29253c;
            activityListItemDTO.f29256d = activityListItemDTOC.f29256d;
            activityListItemDTO.f29259e = activityListItemDTOC.f29259e;
            activityListItemDTO.f29262f = activityListItemDTOC.f29262f;
            activityListItemDTO.f29265g = activityListItemDTOC.f29265g;
            activityListItemDTO.f29268h = activityListItemDTOC.f29268h;
            activityListItemDTO.f29271i = activityListItemDTOC.f29271i != null ? new ArrayList(activityListItemDTOC.f29271i) : null;
            activityListItemDTO.f29273j = activityListItemDTOC.f29273j;
            activityListItemDTO.f29275k = activityListItemDTOC.f29275k;
            activityListItemDTO.f29278l = activityListItemDTOC.f29278l;
            activityListItemDTO.f29280m = activityListItemDTOC.f29280m;
            activityListItemDTO.f29282n = activityListItemDTOC.f29282n;
            activityListItemDTO.f29284o = activityListItemDTOC.f29284o;
            activityListItemDTO.f29286p = activityListItemDTOC.f29286p;
            activityListItemDTO.f29288q = activityListItemDTOC.f29288q;
            activityListItemDTO.f29290r = activityListItemDTOC.f29290r;
            activityListItemDTO.f29293t = activityListItemDTOC.f29293t;
            activityListItemDTO.f29296v = activityListItemDTOC.f29296v;
            activityListItemDTO.f29298w = activityListItemDTOC.f29298w;
            activityListItemDTO.f29300x = activityListItemDTOC.f29300x;
            activityListItemDTO.f29302y = activityListItemDTOC.f29302y;
            activityListItemDTO.f29304z = activityListItemDTOC.f29304z;
            activityListItemDTO.A = activityListItemDTOC.A;
            activityListItemDTO.B = activityListItemDTOC.B;
            activityListItemDTO.C = activityListItemDTOC.C;
            activityListItemDTO.D = activityListItemDTOC.D;
            activityListItemDTO.E = activityListItemDTOC.E;
            activityListItemDTO.F = activityListItemDTOC.F;
            activityListItemDTO.I = activityListItemDTOC.I;
            activityListItemDTO.P = activityListItemDTOC.P;
            activityListItemDTO.T = activityListItemDTOC.T;
            activityListItemDTO.X = activityListItemDTOC.X;
            activityListItemDTO.Y = activityListItemDTOC.Y;
            activityListItemDTO.Z = activityListItemDTOC.Z;
            activityListItemDTO.f29276k0 = activityListItemDTOC.f29276k0;
            activityListItemDTO.H0 = activityListItemDTOC.H0;
            activityListItemDTO.I0 = activityListItemDTOC.I0;
            activityListItemDTO.J0 = activityListItemDTOC.J0;
            activityListItemDTO.K0 = activityListItemDTOC.K0;
            activityListItemDTO.L0 = activityListItemDTOC.L0;
            activityListItemDTO.M0 = activityListItemDTOC.M0;
            activityListItemDTO.N0 = activityListItemDTOC.N0;
            activityListItemDTO.O0 = activityListItemDTOC.O0;
            activityListItemDTO.P0 = activityListItemDTOC.P0;
            activityListItemDTO.Q0 = activityListItemDTOC.Q0 != null ? new ArrayList(activityListItemDTOC.Q0) : null;
            activityListItemDTO.R0 = activityListItemDTOC.R0;
            activityListItemDTO.S0 = activityListItemDTOC.S0;
            activityListItemDTO.T0 = activityListItemDTOC.T0;
            activityListItemDTO.U0 = activityListItemDTOC.U0;
            activityListItemDTO.V0 = activityListItemDTOC.V0;
            activityListItemDTO.W0 = activityListItemDTOC.W0 != null ? new ArrayList(activityListItemDTOC.W0) : null;
            activityListItemDTO.X0 = activityListItemDTOC.X0 != null ? new ArrayList(activityListItemDTOC.X0) : null;
            activityListItemDTO.Y0 = activityListItemDTOC.Y0 != null ? new ArrayList(activityListItemDTOC.Y0) : null;
            activityListItemDTO.Z0 = activityListItemDTOC.Z0 != null ? new ArrayList(activityListItemDTOC.Z0) : null;
            activityListItemDTO.f29248a1 = activityListItemDTOC.f29248a1;
            activityListItemDTO.f29251b1 = activityListItemDTOC.f29251b1;
            activityListItemDTO.f29254c1 = activityListItemDTOC.f29254c1;
            activityListItemDTO.f29257d1 = activityListItemDTOC.f29257d1;
            activityListItemDTO.f29260e1 = activityListItemDTOC.f29260e1;
            activityListItemDTO.f29263f1 = activityListItemDTOC.f29263f1;
            activityListItemDTO.f29266g1 = activityListItemDTOC.f29266g1;
            activityListItemDTO.f29269h1 = activityListItemDTOC.f29269h1;
            activityListItemDTO.f29272i1 = activityListItemDTOC.f29272i1;
            activityListItemDTO.f29274j1 = activityListItemDTOC.f29274j1;
            activityListItemDTO.f29277k1 = activityListItemDTOC.f29277k1;
            activityListItemDTO.f29279l1 = activityListItemDTOC.f29279l1;
            activityListItemDTO.f29281m1 = activityListItemDTOC.f29281m1;
            activityListItemDTO.f29283n1 = activityListItemDTOC.f29283n1;
            activityListItemDTO.f29285o1 = activityListItemDTOC.f29285o1;
            activityListItemDTO.f29287p1 = activityListItemDTOC.f29287p1;
            activityListItemDTO.f29289q1 = activityListItemDTOC.f29289q1;
            activityListItemDTO.f29291r1 = activityListItemDTOC.f29291r1;
            activityListItemDTO.f29292s1 = activityListItemDTOC.f29292s1;
            activityListItemDTO.f29294t1 = activityListItemDTOC.f29294t1;
            activityListItemDTO.f29295u1 = activityListItemDTOC.f29295u1;
            activityListItemDTO.f29297v1 = activityListItemDTOC.f29297v1;
            activityListItemDTO.f29299w1 = activityListItemDTOC.f29299w1;
            activityListItemDTO.f29301x1 = activityListItemDTOC.f29301x1;
            activityListItemDTO.f29303y1 = activityListItemDTOC.f29303y1;
            activityListItemDTO.f29305z1 = activityListItemDTOC.f29305z1;
            activityListItemDTO.A1 = activityListItemDTOC.A1;
            activityListItemDTO.C1 = activityListItemDTOC.C1;
            activityListItemDTO.D1 = activityListItemDTOC.D1;
            activityListItemDTO.E1 = activityListItemDTOC.E1 != null ? new ArrayList(activityListItemDTOC.E1) : null;
            activityListItemDTO.F1 = activityListItemDTOC.F1;
            activityListItemDTO.G1 = activityListItemDTOC.G1;
            activityListItemDTO.H1 = activityListItemDTOC.H1;
            activityListItemDTO.I1 = activityListItemDTOC.I1;
            activityListItemDTO.J1 = activityListItemDTOC.J1;
            activityListItemDTO.W1 = activityListItemDTOC.W1;
            activityListItemDTO.X1 = activityListItemDTOC.X1;
            activityListItemDTO.K1 = activityListItemDTOC.K1;
            activityListItemDTO.L1 = activityListItemDTOC.L1;
            activityListItemDTO.M1 = activityListItemDTOC.M1 != null ? new ArrayList(activityListItemDTOC.M1) : null;
            activityListItemDTO.O1 = activityListItemDTOC.O1;
            activityListItemDTO.P1 = activityListItemDTOC.P1;
            activityListItemDTO.Q1 = activityListItemDTOC.Q1;
            activityListItemDTO.R1 = activityListItemDTOC.R1;
            activityListItemDTO.S1 = activityListItemDTOC.S1;
            activityListItemDTO.T1 = activityListItemDTOC.T1;
            activityListItemDTO.Z1 = activityListItemDTOC.Z1;
            activityListItemDTO.f29249a2 = activityListItemDTOC.f29249a2;
            activityListItemDTO.f29247a = activityListItemDTOC.f29247a;
            activityListItemDTO.f29261e2 = activityListItemDTOC.f29261e2;
            activityListItemDTO.f29264f2 = activityListItemDTOC.f29264f2;
            activityListItemDTO.f29267g2 = activityListItemDTOC.f29267g2;
            activityListItemDTO.f29270h2 = activityListItemDTOC.f29270h2;
        }
        E4(new nr.w0.f(this.H1, this.I1, this.f146575z));
    }

    public final void J4() {
        ps.r value = W4().getValue();
        if (value == null || !q91.e.c(value.h())) {
            return;
        }
        if (oe2.f.J(value) || oe2.f.K(value)) {
            am.x0 x0VarH = value.h();
            boolean zJ = oe2.f.J(value);
            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new l3(this, null), new r53.c2(new qr.d0(this, zJ, null))), new m3(this, x0VarH, zJ, null)), new n3(null)), new o3(this, null)), androidx.lifecycle.v1.a(this));
        }
    }

    public final void J5() {
        js.b bVar = (js.b) this.M0.getValue();
        ds.c cVar = new ds.c(this, 3);
        bVar.getClass();
        bVar.a();
        bVar.f100590c = ge1.b.T(bVar.f100588a, null, null, new js.a(bVar, cVar, null), 3);
    }

    public final void K5(com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        ps.r value = W4().getValue();
        if (value == null) {
            return;
        }
        E4(new nr.w0.w(value, (com.garmin.android.apps.connectmobile.activities.newmodel.f) ((r53.z1) this.Y0.getValue()).getValue(), k5().getValue(), (com.garmin.android.apps.connectmobile.repcounting.model.c) this.X0.f150540a.getValue(), dVar));
    }

    public final r53.z1<nr.a> L4() {
        return (r53.z1) this.f146520g1.getValue();
    }

    public final void L5(boolean z14) {
        r53.p2 p2Var;
        Object value;
        do {
            p2Var = this.f146534k2;
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.valueOf(z14)));
    }

    public final void M4(am.x0 x0Var) {
        kr.e eVar = this.f146504b;
        eVar.getClass();
        x0Var.getClass();
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new i(null), new r53.c2(new kr.b(eVar, x0Var, null))), new j(null)), new k(null)), new l(null)), androidx.lifecycle.v1.a(this));
    }

    public final void M5(nr.w0 w0Var) {
        Object value;
        ArrayList arrayList;
        w0Var.getClass();
        o13.t tVar = this.K0;
        r53.z1 z1Var = (r53.z1) tVar.getValue();
        do {
            value = z1Var.getValue();
            Iterable iterable = (Iterable) ((r53.z1) tVar.getValue()).getValue();
            arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!p005kotlin.jvm.internal.s.g((nr.w0) obj, w0Var)) {
                    arrayList.add(obj);
                }
            }
        } while (!z1Var.b(value, arrayList));
    }

    public final r53.z1<ActivityDetailChartDTO> N4() {
        return (r53.z1) this.f146533k1.getValue();
    }

    public final void N5(long j8, String str) {
        this.X1.p(j8, str);
        a5().setValue(nr.p.a(a5().getValue(), null, false, false, 27));
    }

    public final void O5(ds.n nVar) {
        r53.p2 p2Var;
        Object value;
        nVar.getClass();
        do {
            p2Var = this.Z1;
            value = p2Var.getValue();
        } while (!p2Var.b(value, nVar));
    }

    public final void P4(long j8) {
        am.m mVar = this.f146507c;
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.r(mVar, j8, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new m(null), r53.s.A(c2Var, x53.b.f189152a)), new n(null)), new o(null)), new p(null)), androidx.lifecycle.v1.a(this));
    }

    public final void P5(nr.y yVar) {
        r53.p2 p2Var;
        Object value;
        do {
            p2Var = this.J1;
            value = p2Var.getValue();
        } while (!p2Var.b(value, yVar));
    }

    public final void Q4(long j8) {
        am.m.a aVar = am.m.f4066e;
        am.m mVar = this.f146507c;
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.h0(mVar, j8, 1400, 1000, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new q(null), r53.s.A(c2Var, x53.b.f189152a)), new r(null)), new s(null)), new C2757t(null)), androidx.lifecycle.v1.a(this));
    }

    public final boolean Q5(ps.r rVar) {
        Long calendarEventId;
        String strValueOf;
        ps.a1 metadataDTO;
        String calendarEventUuid = null;
        ps.x calendarEventInfo = (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null) ? null : metadataDTO.getCalendarEventInfo();
        Long activityId = rVar != null ? rVar.getActivityId() : null;
        if (calendarEventInfo != null && (calendarEventId = calendarEventInfo.getCalendarEventId()) != null && (strValueOf = String.valueOf(calendarEventId.longValue())) != null) {
            calendarEventUuid = strValueOf;
        } else if (calendarEventInfo != null) {
            calendarEventUuid = calendarEventInfo.getCalendarEventUuid();
        }
        return (activityId == null || calendarEventUuid == null || this.X1.m(activityId.longValue(), calendarEventUuid)) ? false : true;
    }

    public final void R4(long j8) {
        am.m mVar = this.f146507c;
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.z(mVar, j8, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new u(null), r53.s.A(c2Var, x53.b.f189152a)), new v(null)), new w(null)), new x(null)), androidx.lifecycle.v1.a(this));
    }

    public final void R5() {
        if (z10.d1.f()) {
            E4(nr.w0.a.f127397a);
            return;
        }
        ps.r value = W4().getValue();
        if (value != null) {
            am.x0 x0VarH = value.h();
            boolean zL = oe2.f.L(value);
            ps.a1 metadataDTO = value.getMetadataDTO();
            E4(new nr.w0.w1(this.f146575z, x0VarH, zL, metadataDTO != null ? metadataDTO.E0() : false));
        }
    }

    public final void S4(am.x0 x0Var) {
        kr.e eVar = this.f146504b;
        eVar.getClass();
        x0Var.getClass();
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new y(null), new r53.c2(new kr.c(eVar, x0Var, null))), new z(null)), new a0(null)), new b0(null)), androidx.lifecycle.v1.a(this));
    }

    public final void S5() {
        G4();
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            E4(nr.w0.z1.f127582a);
        } else {
            this.f146565v2 = false;
            E4(nr.w0.x0.f127570a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wg0.m T4(mo1.d dVar, List<mo1.f> list) {
        String profileImageUrl;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            mo1.f fVar = (mo1.f) it.next();
            String userProfilePk = fVar.getUserProfilePk();
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = v5().getValue().get(userProfilePk != null ? Integer.valueOf(Integer.parseInt(userProfilePk)) : null);
            if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrl = profileImageUrls.f46877f) == null) {
                profileImageUrl = fVar.getProfileImageUrl();
            }
            arrayList.add(new wg0.n(fVar.getDisplayName(), fVar.getFullName(), profileImageUrl));
        }
        int numberOfComments = dVar != null ? dVar.getNumberOfComments() : 0;
        int numberOfLikes = dVar != null ? dVar.getNumberOfLikes() : 0;
        boolean likedByUser = dVar != null ? dVar.getLikedByUser() : false;
        return new wg0.m(numberOfComments, numberOfLikes, dVar != null ? Long.valueOf(dVar.getConversationPK()) : null, dVar != null ? dVar.getUuid() : null, null, likedByUser, false, arrayList, 80, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    public final nr.l0 T5(jr.o oVar, nr.j jVar) {
        ls.e eVarA;
        qn0.f fVar;
        String strH;
        c22.c3 c3Var;
        jr.n nVarA;
        jr.p pVarB = oVar.b();
        if (pVarB == null || (eVarA = is.m.a(pVarB)) == null) {
            return null;
        }
        sr.b bVar = this.f146541n;
        String strJ = bVar.j(eVarA);
        l22.a aVar = bVar.f160541b;
        Object objJ = ss.k.j(eVarA, jVar.f127205a);
        if (!ss.k.p(eVarA, objJ) || (nVarA = oVar.a()) == null) {
            fVar = null;
        } else {
            is.r.f94896a.getClass();
            nr.w0 w0VarA = is.r.a(jVar, nVarA);
            if (w0VarA != null) {
                fVar = new qn0.f(1, this, w0VarA);
            } else {
                fVar = null;
            }
        }
        c22.c3 c3Var2 = eVarA.f114678a;
        if (ss.k.a.f160607a[eVarA.ordinal()] != 1 && (c3Var = eVarA.f114679b) != null) {
            c3Var2 = c3Var;
        }
        String strN = bVar.n(c3Var2);
        String strB = ss.k.b(eVarA, aVar, objJ, 24);
        String str = strB == null ? "" : strB;
        String str2 = (ss.k.g(eVarA) == 16 || (strH = ss.k.h(eVarA, aVar, objJ)) == null) ? "" : strH;
        u4.d dVar = fVar != null ? eVarA.f114687j : null;
        int i14 = fVar != null ? eVarA.f114688k : -1;
        String strB2 = ss.k.b(eVarA, aVar, objJ, 4);
        return new nr.l0(new r22.p(str, str2, strN, dVar, i14, null, strB2 != null ? aVar.a(R.string.string_comma_string_pattern, strJ, strB2) : null, 32, null), fVar);
    }

    public final r53.z1<ps.p> U4() {
        return (r53.z1) this.f146511d1.getValue();
    }

    public final void U5() {
        Long parentId;
        ps.a1 metadataDTO;
        List<Long> listM;
        if (z10.d1.f()) {
            E4(nr.w0.a.f127397a);
            return;
        }
        boolean z14 = !oe2.f.G(W4().getValue());
        ps.r rVar = new ps.r(null, null, null, null, null, null, null, null, null, new ps.a1(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z14, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870913, 524287, null), null, null, null, null, null, null, null, null, 261631, null);
        nr.v0 v0Var = nr.v0.FAVORITE;
        long j8 = this.f146575z;
        X5(j8, rVar, v0Var);
        ArrayList arrayList = new ArrayList();
        ps.r value = W4().getValue();
        if (value != null && (metadataDTO = value.getMetadataDTO()) != null && (listM = metadataDTO.m()) != null) {
            arrayList.addAll(p13.h0.y0(listM, Long.valueOf(j8)));
        }
        ps.r value2 = W4().getValue();
        if (value2 != null && (parentId = value2.getParentId()) != null) {
            arrayList.add(Long.valueOf(parentId.longValue()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            boolean z15 = z14;
            z14 = z15;
            Z5(((Number) it.next()).longValue(), new ps.r(null, null, null, null, null, null, null, null, null, new ps.a1(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870913, 524287, null), null, null, null, null, null, null, null, null, 261631, null), nr.v0.FAVORITE);
        }
    }

    public final ps.q V4(ps.r rVar) {
        ps.j0 j0Var;
        List<ps.j0> listF;
        Object next;
        ps.k0 diveInfoDTO = rVar.getDiveInfoDTO();
        ns.v vVar = null;
        if (diveInfoDTO == null || (listF = diveInfoDTO.f()) == null) {
            j0Var = null;
        } else {
            Iterator<T> it = listF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer numB = ((ps.j0) next).getGasIndex();
                if (numB != null && numB.intValue() == 0) {
                    break;
                }
            }
            j0Var = (ps.j0) next;
        }
        if (j0Var != null) {
            Double dH = j0Var.getOxygenContent();
            Integer numValueOf = dH != null ? Integer.valueOf((int) dH.doubleValue()) : null;
            Double dF = j0Var.getHeliumContent();
            vVar = new ns.v(numValueOf, dF != null ? Integer.valueOf((int) dF.doubleValue()) : null);
        }
        return fr.a.f(rVar, vVar, k5().getValue());
    }

    public final void V5() {
        wg0.m mVarB = wg0.m.b(s5().getValue(), null, null, 191);
        mVarB.d();
        s5().setValue(mVarB);
    }

    public final r53.z1<ps.r> W4() {
        return (r53.z1) this.L0.getValue();
    }

    public final void W5() {
        X5(this.f146575z, new ps.r(null, null, null, null, null, null, null, null, null, new ps.a1(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, -1L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524271, null), null, null, null, null, null, null, null, null, 261631, null), nr.v0.UNLINK_TRAIL);
    }

    public final void X4(long j8) {
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new c0(null), this.f146507c.c(j8)), new d0(j8, null)), new e0(null)), new f0(null)), androidx.lifecycle.v1.a(this));
    }

    public final void X5(long j8, ps.r rVar, nr.v0 v0Var) {
        if (E5(rVar, v0Var)) {
            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new b1(null), this.f146507c.d(j8, ps.r.b(rVar, null, null, null, null, ss.l.b(rVar.getSummaryDTO()), 258047))), new c1(v0Var, rVar, null)), new d1(null)), new e1(null)), androidx.lifecycle.v1.a(this));
        }
    }

    public final r53.z1<List<com.garmin.android.apps.connectmobile.activities.newmodel.j>> Y4() {
        return (r53.z1) this.f146505b1.getValue();
    }

    public final void Y5(List<ps.j> list) {
        ps.r value;
        ps.r rVar;
        ps.a1 metadataDTO;
        list.getClass();
        this.H1 = true;
        ps.r value2 = W4().getValue();
        ps.a1 a1VarB = (value2 == null || (metadataDTO = value2.getMetadataDTO()) == null) ? null : ps.a1.b(metadataDTO, list, null, null, false, null, null, null, null, -2, 524287);
        r53.z1<ps.r> z1VarW4 = W4();
        do {
            value = z1VarW4.getValue();
            rVar = value;
        } while (!z1VarW4.b(value, rVar != null ? ps.r.b(rVar, null, null, null, a1VarB, null, 261631) : null));
        D5();
    }

    public final nr.g.b Z4(List<? extends SimpleBadgeDTO> list, ps.a1 a1Var) {
        ps.a2 userInfoDto;
        boolean zC0 = a1Var != null ? a1Var.C0() : false;
        if (list == null || list.isEmpty() || zC0) {
            return null;
        }
        String displayName = (a1Var == null || (userInfoDto = a1Var.getUserInfoDto()) == null) ? null : userInfoDto.getDisplayName();
        boolean zIsEmpty = list.isEmpty();
        sr.b bVar = this.f146541n;
        String strH = zIsEmpty ? null : sr.b.h(bVar, jr.k.BADGES, null, 6);
        ArrayList arrayList = new ArrayList();
        for (SimpleBadgeDTO simpleBadgeDTO : list) {
            com.garmin.android.apps.connectmobile.badges.service.model.g gVar = simpleBadgeDTO.f30540k;
            String str = gVar != null ? gVar.f30568a : simpleBadgeDTO.f30533d;
            str.getClass();
            com.garmin.android.apps.connectmobile.badges.service.model.g gVar2 = simpleBadgeDTO.f30540k;
            arrayList.add(new nr.i0(str, gVar2 != null ? gVar2.f30571d : simpleBadgeDTO.f30534e, null, null, null, new nr.g0(simpleBadgeDTO.f30537h, 2131231129, null, 4, null), bVar.f160541b.getString(R.string.lbl_badge), null, null, new q42.v(this, 4, displayName, simpleBadgeDTO), WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, null));
        }
        return new nr.g.b(strH, arrayList);
    }

    public final void Z5(long j8, ps.r rVar, nr.v0 v0Var) {
        if (E5(rVar, v0Var)) {
            r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new f1(null), this.f146507c.d(j8, ps.r.b(rVar, null, null, null, null, ss.l.b(rVar.getSummaryDTO()), 258047))), new g1(null)), new h1(null)), new i1(null)), androidx.lifecycle.v1.a(this));
        }
    }

    public final r53.z1<nr.p> a5() {
        return (r53.z1) this.f146548p1.getValue();
    }

    public final void a6(Integer num, Integer num2) {
        X5(this.f146575z, new ps.r(null, null, null, null, null, null, null, null, null, null, null, null, new ps.q1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, num2, -1, -1, -1, -1, -1, 4194303, null), null, null, null, null, null, 258047, null), nr.v0.SELF_EVALUATION);
    }

    public final r53.z1<nr.c> b5() {
        return (r53.z1) this.f146517f1.getValue();
    }

    public final void b6(long j8) {
        X5(this.f146575z, new ps.r(null, null, null, null, null, null, null, null, null, new ps.a1(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, Long.valueOf(j8), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524271, null), null, null, null, null, null, null, null, null, 261631, null), nr.v0.LINK_TRAIL);
    }

    public final void c5(long j8) {
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new h0(null), new r53.c2(new g0(j8, null))), new i0(null)), new j0(null)), new k0(null)), androidx.lifecycle.v1.a(this));
    }

    public final void c6(ArrayList<bq0.k> arrayList) {
        am.m mVar = this.f146507c;
        mVar.getClass();
        r53.c2 c2Var = new r53.c2(new am.u0(arrayList, mVar, this.f146575z, null));
        x53.c cVar = o53.s0.f129406a;
        r53.s.C(new r53.u(new r53.m1(new r53.v(new j1(null), r53.s.A(c2Var, x53.b.f189152a)), new k1(null)), new l1(null)), androidx.lifecycle.v1.a(this));
    }

    public final void d5(long j8) {
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new l0(null), new r53.c2(new q2(this, j8, null))), new m0(null)), new n0(null)), new o0(null)), androidx.lifecycle.v1.a(this));
    }

    public final nr.p0 e5(nr.m mVar, jr.h hVar) {
        String productDisplayName;
        ArrayList arrayListA;
        ps.a1 metadataDTO;
        String strP;
        r80.b bVarB;
        r80.b bVarB2;
        mVar.getClass();
        wg0.d dVar = mVar.f127256e;
        ps.r value = W4().getValue();
        ArrayList arrayList = null;
        if (value == null) {
            return null;
        }
        am.x0 x0VarH = value.h();
        String activityName = value.getActivityName();
        boolean z14 = true;
        boolean zG = false;
        boolean z15 = value.getParentId() != null;
        sr.b bVar = this.f146541n;
        String strE = bVar.e(activityName, x0VarH, z15);
        String locationName = value.getLocationName();
        nr.v value2 = h5().getValue();
        String strPrint = "";
        if ((value2 == null || (bVarB2 = value2.b()) == null) ? false : bVarB2.getReleased()) {
            nr.v value3 = h5().getValue();
            productDisplayName = (value3 == null || (bVarB = value3.b()) == null) ? null : bVarB.getProductDisplayName();
        } else {
            productDisplayName = "";
        }
        sr.m mVar2 = (sr.m) bVar.f160550k.getValue();
        ps.q1 summaryDTO = value.getSummaryDTO();
        DateTime dateTimeW4 = summaryDTO != null ? summaryDTO.W4() : null;
        mVar2.getClass();
        if (dateTimeW4 != null) {
            if (p005kotlin.jvm.internal.s.g(Locale.getDefault().getLanguage(), "en")) {
                strP = "MMM d yyyy, HH:mm";
            } else {
                c22.j0 j0Var = c22.j0.f23099a;
                Locale locale = Locale.getDefault();
                j0Var.getClass();
                strP = c22.j0.P("MS", locale);
            }
            strPrint = DateTimeFormat.forPattern(strP).print(dateTimeW4);
            strPrint.getClass();
        }
        nr.j jVar = mVar.f127253b;
        jr.g customPhoto = mVar.f127252a.getCustomPhoto();
        ArrayList arrayListK4 = K4(customPhoto != null ? customPhoto.a() : null, jVar.f127205a);
        List<ps.x1> list = mVar.f127257f;
        if (dVar != null) {
            List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> list2 = dVar.f185085h;
            if (list2 != null && !list2.isEmpty()) {
                z14 = false;
            }
            if (!z14) {
                ps.r value4 = W4().getValue();
                if (value4 != null && (metadataDTO = value4.getMetadataDTO()) != null) {
                    zG = p005kotlin.jvm.internal.s.g(metadataDTO.getHasHeatmap(), Boolean.TRUE);
                }
                if (!zG && (arrayListA = ((bs.b) KoinJavaComponent.get$default(bs.b.class, null, null, 6, null)).a(x0VarH, list, null).a(dVar)) != null) {
                    arrayList = new ArrayList(p13.y.r(arrayListA, 10));
                    Iterator it = arrayListA.iterator();
                    while (it.hasNext()) {
                        List<com.garmin.android.library.mapsdkadapter.f> list3 = ((com.garmin.android.library.mapsdkadapter.q) it.next()).f50328a.f93153a;
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list3, 10));
                        Iterator<T> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((com.garmin.android.library.mapsdkadapter.f) it3.next()).f50283a);
                        }
                        arrayList.add(arrayList2);
                    }
                }
            }
        }
        nr.p0.a.c cVar = new nr.p0.a.c(locationName, x0VarH.f4360c, arrayList, productDisplayName, hVar);
        Integer numValueOf = Integer.valueOf(x0VarH.f4361d);
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayListK4.iterator();
        while (it4.hasNext()) {
            nr.l0 l0VarT5 = T5((jr.o) it4.next(), jVar);
            if (l0VarT5 != null) {
                arrayList3.add(l0VarT5);
            }
        }
        return new nr.p0(strE, strPrint, numValueOf, arrayList3, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0202  */
    public final ArrayList f5(List list, nr.v vVar, ps.r rVar, boolean z14) {
        r80.b bVarB;
        boolean z15;
        nr.d dVar;
        String str;
        String strA;
        ps.a1 metadataDTO;
        List<ps.m1> listN0;
        nr.d dVar2;
        Integer numValueOf;
        u4.d dVar3;
        u4.d dVarA;
        int i14;
        ps.a1 metadataDTO2;
        ps.a1 metadataDTO3;
        nr.d dVar4;
        u4.d dVarA2;
        nr.d dVar5;
        nr.d dVar6;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jr.k kVarC = ((jr.f) it.next()).c();
                int i15 = kVarC == null ? -1 : c.f146595c[kVarC.ordinal()];
                sr.b bVar = this.f146541n;
                switch (i15) {
                    case 37:
                        if (vVar != null && (bVarB = vVar.b()) != null && bVarB.f()) {
                            r80.b bVarB2 = vVar.b();
                            sr.f fVar = (sr.f) bVar.f160543d.getValue();
                            if (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null || (listN0 = metadataDTO.n0()) == null || listN0.isEmpty()) {
                                z15 = false;
                            } else {
                                Iterator<T> it3 = listN0.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z15 = false;
                                    } else if (((ps.m1) it3.next()).k()) {
                                        z15 = true;
                                    }
                                }
                            }
                            if (bVarB2 != null) {
                                String productDisplayName = bVarB2.getProductDisplayName();
                                fVar.getClass();
                                if (productDisplayName == null) {
                                    productDisplayName = "";
                                }
                                if (z14) {
                                    String strD = bVarB2.d();
                                    if (z15) {
                                        l22.b bVar2 = fVar.f160568a;
                                        strA = bVar2.a(R.string.string_space_bullet_string_pattern, strD, bVar2.getString(R.string.lbl_connected_gps));
                                    } else {
                                        strA = strD;
                                    }
                                    str = strA;
                                } else {
                                    str = null;
                                }
                                dVar = new nr.d(p13.x.m(new nr.u.c(productDisplayName, str, null, new nr.g0(bVarB2.getImageUrl(), 2131231969, null, 4, null), 4, null)));
                            } else {
                                dVar = null;
                            }
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                        break;
                    case 38:
                        List<ps.m1> listP0 = (rVar == null || (metadataDTO3 = rVar.getMetadataDTO()) == null) ? null : metadataDTO3.p0();
                        if (listP0 != null && !listP0.isEmpty()) {
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            if (com.garmin.android.apps.connectmobile.k1.f37122a.q()) {
                                List<ps.m1> listP1 = (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null) ? null : metadataDTO2.p0();
                                sr.s sVar = (sr.s) bVar.f160545f.getValue();
                                sVar.getClass();
                                if (listP1 == null || listP1.isEmpty()) {
                                    dVar2 = null;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (ps.m1 m1Var : listP1) {
                                        qs.o oVarG = m1Var.g();
                                        if (oVarG != null) {
                                            ss.h.f160604a.getClass();
                                            switch (ss.h.a.f160605a[oVarG.ordinal()]) {
                                                case 1:
                                                    i14 = R.string.lbl_indoor_row;
                                                    break;
                                                case 2:
                                                    i14 = R.string.lbl_elliptical;
                                                    break;
                                                case 3:
                                                    i14 = R.string.lbl_treadmill;
                                                    break;
                                                case 4:
                                                    i14 = R.string.lbl_indoor_bike;
                                                    break;
                                                case 5:
                                                    i14 = R.string.lbl_stair_climber;
                                                    break;
                                                case 6:
                                                    i14 = R.string.lbl_step_climber;
                                                    break;
                                                default:
                                                    lc.u0.r();
                                                    return null;
                                            }
                                            numValueOf = Integer.valueOf(i14);
                                        } else {
                                            numValueOf = null;
                                        }
                                        String string = numValueOf != null ? sVar.f160584a.getString(numValueOf.intValue()) : null;
                                        qs.o oVarG2 = m1Var.g();
                                        if (oVarG2 != null) {
                                            ss.h.f160604a.getClass();
                                            switch (ss.h.a.f160605a[oVarG2.ordinal()]) {
                                                case 1:
                                                    s62.a.f157643a.getClass();
                                                    dVarA = u62.z2.a(t62.a.f162797a);
                                                    break;
                                                case 2:
                                                    s62.a.f157643a.getClass();
                                                    dVarA = u62.z0.a(t62.a.f162797a);
                                                    break;
                                                case 3:
                                                    s62.a.f157643a.getClass();
                                                    dVarA = u62.p3.a(t62.a.f162797a);
                                                    break;
                                                case 4:
                                                    s62.a.f157643a.getClass();
                                                    dVarA = u62.s.a(t62.a.f162797a);
                                                    break;
                                                case 5:
                                                case 6:
                                                    s62.a.f157643a.getClass();
                                                    dVarA = u62.p4.a(t62.a.f162797a);
                                                    break;
                                                default:
                                                    lc.u0.r();
                                                    return null;
                                            }
                                            dVar3 = dVarA;
                                        } else {
                                            dVar3 = null;
                                        }
                                        String strH = m1Var.getProductName();
                                        nr.g0 g0Var = new nr.g0(null, 2131231969, dVar3, 1, null);
                                        s62.a.f157643a.getClass();
                                        arrayList2.add(new nr.u.a(string, strH, v62.e4.a(t62.b.f162798a), g0Var, new ds.f(this, 26)));
                                    }
                                    dVar2 = new nr.d(arrayList2);
                                }
                                if (dVar2 != null) {
                                    arrayList.add(dVar2);
                                }
                            } else {
                                continue;
                            }
                        }
                        break;
                    case 39:
                        List<com.garmin.android.apps.connectmobile.activities.newmodel.d0> list2 = vVar != null ? vVar.f127381d : null;
                        sr.s sVar2 = (sr.s) bVar.f160545f.getValue();
                        if (list2 == null || list2.isEmpty()) {
                            dVar4 = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (com.garmin.android.apps.connectmobile.activities.newmodel.d0 d0Var : list2) {
                                String strA2 = d0Var.f29415c;
                                String str2 = d0Var.f29416d;
                                Integer num = d0Var.f29417e;
                                String str3 = d0Var.f29413a;
                                sVar2.getClass();
                                l22.b bVar3 = sVar2.f160584a;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (!z14) {
                                    strA2 = null;
                                } else if (strA2 != null && num != null) {
                                    strA2 = bVar3.a(R.string.string_space_bullet_string_pattern, strA2, bVar3.a(R.string.sensor_battery_status, bVar3.a(R.string.lbl_value_percent, num)));
                                } else if (strA2 != null && str2 != null) {
                                    String strA3 = sVar2.a(str2);
                                    if (strA3 != null) {
                                        strA2 = bVar3.a(R.string.string_space_bullet_string_pattern, strA2, strA3);
                                    } else {
                                        strA2 = null;
                                    }
                                } else if (strA2 == null) {
                                    if (num != null) {
                                        strA2 = bVar3.a(R.string.sensor_battery_status, bVar3.a(R.string.lbl_value_percent, num));
                                    } else if (str2 != null) {
                                        strA2 = sVar2.a(str2);
                                    } else {
                                        strA2 = null;
                                    }
                                }
                                nr.g0 g0Var2 = new nr.g0(d0Var.f29414b, 2131231969, null, 4, null);
                                if (z14) {
                                    fg1.a.f71382d.getClass();
                                    fg1.a aVarA = fg1.a.C1455a.a(str2);
                                    int i16 = aVarA == null ? -1 : sr.s.b.f160585a[aVarA.ordinal()];
                                    if (i16 == 1) {
                                        s62.a.f157643a.getClass();
                                        dVarA2 = v62.w.a(t62.b.f162798a);
                                    } else if (i16 != 2) {
                                        dVarA2 = null;
                                    } else {
                                        s62.a.f157643a.getClass();
                                        dVarA2 = v62.y.a(t62.b.f162798a);
                                    }
                                } else {
                                    dVarA2 = null;
                                }
                                arrayList3.add(new nr.u.c(str3, strA2, dVarA2, g0Var2));
                            }
                            dVar4 = new nr.d(arrayList3);
                        }
                        if (dVar4 != null) {
                            arrayList.add(dVar4);
                        }
                        break;
                    case 40:
                        to.k kVar = vVar != null ? vVar.f127380c : null;
                        sr.e eVar = (sr.e) bVar.f160546g.getValue();
                        if (kVar != null) {
                            String str4 = kVar.f165812b;
                            String strF = bVar.f(jr.k.CONNECTED_APP);
                            String str5 = kVar.f165813c;
                            eVar.getClass();
                            str5.getClass();
                            dVar5 = new nr.d(p13.x.m(new nr.u.c(str4, strF, null, new nr.g0(((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).z().concat(str5), 2131231969, null, 4, null), 4, null)));
                        } else {
                            dVar5 = null;
                        }
                        if (dVar5 != null) {
                            arrayList.add(dVar5);
                        }
                        break;
                    case 41:
                        List<ps.c0> list3 = vVar != null ? vVar.f127379b : null;
                        if (list3 == null || list3.isEmpty()) {
                            dVar6 = null;
                        } else {
                            sr.d dVar7 = (sr.d) bVar.f160547h.getValue();
                            ArrayList arrayList4 = new ArrayList();
                            for (ps.c0 c0Var : list3) {
                                String name = c0Var.getName();
                                dVar7.getClass();
                                String str6 = name == null ? "" : name;
                                String strF2 = bVar.f(jr.k.CONNECT_IQ);
                                nr.g0 g0Var3 = new nr.g0(c0Var.getIconUrl(), 2131231969, null, 4, null);
                                s62.a.f157643a.getClass();
                                u4.d dVarA3 = v62.d3.a(t62.b.f162798a);
                                String appID = c0Var.getAppID();
                                arrayList4.add(new nr.u.b(str6, strF2, dVarA3, g0Var3, appID != null ? new qr.r(this, appID, 0) : null));
                            }
                            dVar6 = new nr.d(arrayList4);
                        }
                        if (dVar6 != null) {
                            arrayList.add(dVar6);
                        }
                        break;
                }
            }
        }
        return arrayList;
    }

    public final r53.z1<nr.v> h5() {
        return (r53.z1) this.S0.getValue();
    }

    public final nr.g.h i5(List<pe0.a> list, boolean z14) {
        Integer num;
        if (list == null || list.isEmpty() || c22.s3.b()) {
            return null;
        }
        jr.k kVar = jr.k.DOGS;
        sr.b bVar = this.f146541n;
        String strH = sr.b.h(bVar, kVar, null, 6);
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (pe0.a aVar : list) {
            arrayList.add(new nr.w(aVar.f137398a, aVar.f137399b, aVar.f137400c, (!z14 || (num = aVar.f137401d) == null) ? null : bVar.f160540a.getString(R.string.num_activities, num), z14 ? new qn0.f(6, this, aVar) : null));
        }
        return new nr.g.h(strH, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0215  */
    /* JADX WARN: Code duplicated, block: B:144:0x028b  */
    /* JADX WARN: Code duplicated, block: B:258:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, java.util.Map] */
    public final ArrayList j5(List list, ps.q1 q1Var, boolean z14, PrivacyType privacyType, ps.r rVar) {
        boolean z15;
        nr.e aVar;
        float fDoubleValue;
        u4.d dVarA;
        nr.e.c cVar;
        Object obj;
        qs.e0 e0Var;
        Object obj2;
        ps.a1 metadataDTO;
        List<r80.b> list2;
        r80.b bVar;
        nr.e.d dVar;
        String string;
        ArrayList arrayList;
        String string2;
        ps.a1 metadataDTO2;
        nr.e bVar2;
        String string3;
        u4.d dVarA2;
        u4.d dVarA3;
        ps.a1 metadataDTO3;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jr.k kVarC = ((jr.f) it.next()).c();
                int i14 = kVarC == null ? -1 : c.f146595c[kVarC.ordinal()];
                int i15 = 10;
                boolean z16 = false;
                int i16 = 1;
                sr.b bVar3 = this.f146541n;
                switch (i14) {
                    case 31:
                        ss.n.a aVar2 = ss.n.f160608a;
                        nr.v value = h5().getValue();
                        Boolean boolValueOf = (value == null || (list2 = value.f127378a) == null || (bVar = (r80.b) p13.h0.d0(list2)) == null) ? null : Boolean.valueOf(bVar.g());
                        qs.d.a aVar3 = qs.d.f147044b;
                        String manufacturer = (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null) ? null : metadataDTO.getManufacturer();
                        aVar3.getClass();
                        qs.d dVarA4 = qs.d.a.a(manufacturer);
                        aVar2.getClass();
                        if (!ss.n.a.b(boolValueOf, dVarA4)) {
                            continue;
                        } else if (q1Var != null) {
                            String trainingEffectLabel = q1Var.getTrainingEffectLabel();
                            cs.a.f55432e.getClass();
                            cs.a aVar4 = (cs.a) cs.a.f55433f.get(trainingEffectLabel);
                            if (aVar4 == null) {
                                aVar4 = cs.a.UNKNOWN;
                            }
                            if (aVar4 != cs.a.UNKNOWN) {
                                aVar4.getClass();
                                if (aVar4 == cs.a.ANAEROBIC || aVar4 == cs.a.SPRINT) {
                                    qs.d0.a aVar5 = qs.d0.f147049d;
                                    String anaerobicTrainingEffectMessage = q1Var.getAnaerobicTrainingEffectMessage();
                                    aVar5.getClass();
                                    Iterator<T> it3 = qs.d0.f147051f.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Object next = it3.next();
                                            if (d53.u.q(anaerobicTrainingEffectMessage, ((qs.d0) next).f147052a, true)) {
                                                obj = next;
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    e0Var = (qs.d0) obj;
                                } else {
                                    qs.c0.a aVar6 = qs.c0.f147038d;
                                    String aerobicTrainingEffectMessage = q1Var.getAerobicTrainingEffectMessage();
                                    aVar6.getClass();
                                    Iterator<T> it4 = qs.c0.f147040f.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            Object next2 = it4.next();
                                            if (d53.u.q(aerobicTrainingEffectMessage, ((qs.c0) next2).f147041a, true)) {
                                                obj2 = next2;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    e0Var = (qs.c0) obj2;
                                }
                                if (e0Var != null) {
                                    String strO = bVar3.o(e0Var.getF147053b());
                                    String strF = bVar3.f(jr.k.WORKOUT_BENEFIT);
                                    s62.a.f157643a.getClass();
                                    arrayList2.add(new nr.e.h(new nr.z(strO, strF, null, v62.e4.a(t62.b.f162798a), null, null, 52, null), new qn0.f(7, this, e0Var)));
                                }
                            }
                        }
                        break;
                    case 32:
                        if ((q1Var != null ? q1Var.getTrainingEffectLabel() : null) != null) {
                            String trainingEffectLabel2 = q1Var.getTrainingEffectLabel();
                            cs.a.f55432e.getClass();
                            cs.a aVar7 = (cs.a) cs.a.f55433f.get(trainingEffectLabel2);
                            if (aVar7 == null) {
                                aVar7 = cs.a.UNKNOWN;
                            }
                            if (aVar7 != cs.a.UNKNOWN) {
                                String strH = com.nimbusds.jose.shaded.gson.internal.a.h(bVar3.o(Integer.valueOf(aVar7.f55443a)), " (", bVar3.o(Integer.valueOf(aVar7.f55446d)), ")");
                                String strF2 = bVar3.f(jr.k.PRIMARY_BENEFIT);
                                s62.a.f157643a.getClass();
                                arrayList2.add(new nr.e.C2445e(new nr.z(strH, strF2, null, v62.e4.a(t62.b.f162798a), null, null, 52, null), new qn0.f(8, this, aVar7)));
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 33:
                        sr.l lVar = (sr.l) bVar3.f160551l.getValue();
                        ps.x calendarEventInfo = (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null) ? null : metadataDTO2.getCalendarEventInfo();
                        if (calendarEventInfo != null) {
                            ps.q1 summaryDTO = rVar.getSummaryDTO();
                            Double distance = summaryDTO != null ? summaryDTO.getDistance() : null;
                            ps.q1 summaryDTO2 = rVar.getSummaryDTO();
                            Double duration = summaryDTO2 != null ? summaryDTO2.getDuration() : null;
                            Double customGoalValue = calendarEventInfo.getCustomGoalValue();
                            String str = Marker.ANY_NON_NULL_MARKER;
                            if (distance != null && p005kotlin.jvm.internal.s.g(gg0.h.DISTANCE.f77161a, calendarEventInfo.getCustomGoalUnitType())) {
                                if (customGoalValue == null || (string2 = lVar.a(customGoalValue.doubleValue())) == null) {
                                    string2 = lVar.f160575a.getString(R.string.time_placeholder);
                                }
                                String str2 = string2;
                                String strA = lVar.a(distance.doubleValue());
                                l22.b bVar4 = lVar.f160575a;
                                if (strA == null) {
                                    strA = "";
                                }
                                if (g22.n.d(str2) && g22.n.d(strA)) {
                                    arrayList = new ArrayList();
                                    arrayList.add(new r22.p(str2, null, bVar4.getString(R.string.goal_distance), null, 0, null, null, 122, null));
                                    arrayList.add(new r22.p(strA, null, bVar4.getString(R.string.actual_disrance), null, 0, null, null, 122, null));
                                    if (customGoalValue != null) {
                                        double dDoubleValue = distance.doubleValue() - customGoalValue.doubleValue();
                                        if (dDoubleValue != 0.0d) {
                                            double dDoubleValue2 = distance.doubleValue();
                                            double dDoubleValue3 = customGoalValue.doubleValue();
                                            c22.b2 b2Var = c22.b2.f23009a;
                                            if (Math.signum(dDoubleValue2 - dDoubleValue3) == -1.0d) {
                                                str = "-";
                                            }
                                            String strA2 = lVar.a(Math.abs(dDoubleValue));
                                            String string4 = bVar4.getString(R.string.lbl_difference);
                                            if (strA2 == null) {
                                                strA2 = "";
                                            }
                                            arrayList.add(new r22.p(bVar4.a(R.string.string_space_string_pattern, str, strA2), null, string4, null, 0, null, null, 122, null));
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                            } else if (duration == null) {
                                arrayList = null;
                            } else {
                                if (customGoalValue == null || (string = lVar.b(customGoalValue.doubleValue())) == null) {
                                    string = lVar.f160575a.getString(R.string.time_placeholder);
                                }
                                String str3 = string;
                                String strB = lVar.b(duration.doubleValue());
                                l22.b bVar5 = lVar.f160575a;
                                if (strB == null) {
                                    strB = "";
                                }
                                if (g22.n.d(str3) && g22.n.d(strB)) {
                                    arrayList = new ArrayList();
                                    arrayList.add(new r22.p(str3, null, bVar5.getString(R.string.lbl_goal_time), null, 0, null, null, 122, null));
                                    arrayList.add(new r22.p(strB, null, bVar5.getString(R.string.actual_time), null, 0, null, null, 122, null));
                                    if (customGoalValue != null) {
                                        double dDoubleValue4 = duration.doubleValue() - customGoalValue.doubleValue();
                                        if (dDoubleValue4 != 0.0d) {
                                            double dDoubleValue5 = duration.doubleValue();
                                            double dDoubleValue6 = customGoalValue.doubleValue();
                                            c22.b2 b2Var2 = c22.b2.f23009a;
                                            if (Math.signum(dDoubleValue5 - dDoubleValue6) == -1.0d) {
                                                str = "-";
                                            }
                                            String strB2 = lVar.b(Math.abs(dDoubleValue4));
                                            String string5 = bVar5.getString(R.string.lbl_difference);
                                            if (strB2 == null) {
                                                strB2 = "";
                                            }
                                            arrayList.add(new r22.p(bVar5.a(R.string.string_space_string_pattern, str, strB2), null, string5, null, 0, null, null, 122, null));
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                            }
                            dVar = new nr.e.d(this.T1, arrayList != null ? (r22.p) arrayList.get(0) : null, arrayList != null ? (r22.p) arrayList.get(1) : null, (arrayList == null || arrayList.size() != 3) ? null : (r22.p) arrayList.get(2), new qn0.f(11, this, calendarEventInfo));
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            arrayList2.add(dVar);
                        } else {
                            continue;
                        }
                        break;
                    case 34:
                        sr.r rVar2 = (sr.r) bVar3.f160542c.getValue();
                        if ((rVar == null || (metadataDTO3 = rVar.getMetadataDTO()) == null) ? false : metadataDTO3.C0()) {
                            bVar2 = null;
                        } else {
                            Integer workoutFeel = q1Var != null ? q1Var.getWorkoutFeel() : null;
                            Integer workoutRPE = q1Var != null ? q1Var.getWorkoutRPE() : null;
                            Double perceivedWorkoutEffort = q1Var != null ? q1Var.getPerceivedWorkoutEffort() : null;
                            if (!((workoutFeel == null || workoutFeel.intValue() == -1) ? false : true)) {
                                if (!((workoutRPE == null || workoutRPE.intValue() == -1) ? false : true)) {
                                    i16 = 0;
                                }
                            }
                            if (lg.d.H(perceivedWorkoutEffort) && i16 != 0) {
                                if (workoutFeel != null) {
                                    rVar2.getClass();
                                    if (workoutFeel.intValue() == -1) {
                                        string3 = rVar2.f160583b;
                                    } else {
                                        l22.b bVar6 = rVar2.f160582a;
                                        int iIntValue = workoutFeel.intValue();
                                        boolean zD = j23.t.o(0, 25).d(iIntValue);
                                        int i17 = R.string.workout_feel_very_weak;
                                        if (!zD) {
                                            if (j23.t.o(25, 50).d(iIntValue)) {
                                                i17 = R.string.workout_feel_weak;
                                            } else if (j23.t.o(50, 75).d(iIntValue)) {
                                                i17 = R.string.workout_feel_normal;
                                            } else if (j23.t.o(75, 100).d(iIntValue)) {
                                                i17 = R.string.workout_feel_strong;
                                            } else if (iIntValue >= 100) {
                                                i17 = R.string.workout_feel_very_strong;
                                            }
                                        }
                                        string3 = bVar6.getString(i17);
                                    }
                                } else {
                                    string3 = rVar2.f160583b;
                                }
                                String str4 = string3;
                                l22.b bVar7 = rVar2.f160582a;
                                l22.b bVar8 = rVar2.f160582a;
                                String string6 = (workoutFeel == null || workoutFeel.intValue() == -1) ? bVar8.getString(R.string.lbl_workout_feel) : bVar7.getString(R.string.lbl_feel);
                                if (workoutFeel == null) {
                                    dVarA2 = null;
                                } else if (j23.t.o(0, 25).d(workoutFeel.intValue())) {
                                    s62.a.f157643a.getClass();
                                    dVarA2 = v62.j3.a(t62.b.f162798a);
                                } else if (j23.t.o(25, 50).d(workoutFeel.intValue())) {
                                    s62.a.f157643a.getClass();
                                    dVarA2 = v62.h3.a(t62.b.f162798a);
                                } else if (j23.t.o(50, 75).d(workoutFeel.intValue())) {
                                    s62.a.f157643a.getClass();
                                    dVarA2 = v62.g3.a(t62.b.f162798a);
                                } else if (j23.t.o(75, 100).d(workoutFeel.intValue())) {
                                    s62.a.f157643a.getClass();
                                    dVarA2 = v62.e3.a(t62.b.f162798a);
                                } else if (workoutFeel.intValue() >= 100) {
                                    s62.a.f157643a.getClass();
                                    dVarA2 = v62.i3.a(t62.b.f162798a);
                                } else {
                                    dVarA2 = null;
                                }
                                if (dVarA2 == null) {
                                    s62.a.f157643a.getClass();
                                    dVarA2 = s6.a(t62.b.f162798a);
                                }
                                nr.z zVar = new nr.z(str4, string6, null, dVarA2, null, bVar8.getString(R.string.lbl_workout_feel), 20, null);
                                String string7 = (workoutRPE == null || workoutRPE.intValue() <= 0) ? rVar2.f160583b : bVar7.getString(sr.r.c(workoutRPE.intValue()));
                                String string8 = bVar7.getString(R.string.lbl_perceived_effort);
                                String strA3 = (workoutRPE == null || workoutRPE.intValue() <= 0) ? null : bVar7.a(R.string.string_slash_string_no_space_pattern, String.valueOf(workoutRPE.intValue() / 10), "10");
                                if (workoutRPE == null) {
                                    s62.a.f157643a.getClass();
                                    dVarA3 = s6.a(t62.b.f162798a);
                                } else {
                                    dVarA3 = null;
                                }
                                bVar2 = new nr.e.g(zVar, new nr.z(string7, string8, strA3, dVarA3, workoutRPE != null ? Integer.valueOf(sr.r.b(workoutRPE.intValue())) : null, null, 32, null), privacyType, workoutFeel, workoutRPE, new ds.y(this, 2));
                            } else if (z14 && lg.d.H(perceivedWorkoutEffort)) {
                                String string9 = rVar2.f160582a.getString(R.string.lbl_add_self_evaluation);
                                s62.a.f157643a.getClass();
                                bVar2 = new nr.e.b(new nr.z(string9, null, null, s6.a(t62.b.f162798a), null, null, 54, null), privacyType, new ds.y(this, 3));
                            } else {
                                bVar2 = null;
                            }
                        }
                        if (bVar2 != null) {
                            arrayList2.add(bVar2);
                        } else {
                            continue;
                        }
                        break;
                    case 35:
                        sr.p pVar = (sr.p) bVar3.f160549j.getValue();
                        Double perceivedWorkoutEffort2 = q1Var != null ? q1Var.getPerceivedWorkoutEffort() : null;
                        Integer workoutFeel2 = q1Var != null ? q1Var.getWorkoutFeel() : null;
                        Integer workoutRPE2 = q1Var != null ? q1Var.getWorkoutRPE() : null;
                        if (rVar != null) {
                            ps.a1 metadataDTO4 = rVar.getMetadataDTO();
                            if (!(metadataDTO4 != null ? p005kotlin.jvm.internal.s.g(metadataDTO4.getIsAtpActivity(), Boolean.TRUE) : false)) {
                                aVar = null;
                            } else if (perceivedWorkoutEffort2 != null) {
                                nr.z zVar2 = new nr.z(pVar.f160580a.getString(R.string.lbl_add_rating), null, null, null, null, null, 62, null);
                                fDoubleValue = (float) perceivedWorkoutEffort2.doubleValue();
                                if (fDoubleValue == 0.0f) {
                                    s62.a.f157643a.getClass();
                                    dVarA = v62.i3.a(t62.b.f162798a);
                                } else if (fDoubleValue == 25.0f) {
                                    s62.a.f157643a.getClass();
                                    dVarA = v62.e3.a(t62.b.f162798a);
                                } else if (fDoubleValue == 50.0f) {
                                    s62.a.f157643a.getClass();
                                    dVarA = v62.g3.a(t62.b.f162798a);
                                } else if (fDoubleValue == 75.0f) {
                                    s62.a.f157643a.getClass();
                                    dVarA = v62.h3.a(t62.b.f162798a);
                                } else if (fDoubleValue == 100.0f) {
                                    s62.a.f157643a.getClass();
                                    dVarA = v62.j3.a(t62.b.f162798a);
                                } else {
                                    dVarA = null;
                                }
                                aVar = new nr.e.f(zVar2, dVarA);
                            } else if (z14) {
                                if (workoutFeel2 != null) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    aVar = null;
                                } else {
                                    if (workoutRPE2 != null) {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        aVar = null;
                                    } else {
                                        aVar = new nr.e.a(new nr.z(pVar.f160580a.getString(R.string.lbl_add_rating), null, null, null, null, null, 62, null), new qr.s(this, i16));
                                    }
                                }
                            } else {
                                aVar = null;
                            }
                        } else if (perceivedWorkoutEffort2 != null) {
                            nr.z zVar3 = new nr.z(pVar.f160580a.getString(R.string.lbl_add_rating), null, null, null, null, null, 62, null);
                            fDoubleValue = (float) perceivedWorkoutEffort2.doubleValue();
                            if (fDoubleValue == 0.0f) {
                                s62.a.f157643a.getClass();
                                dVarA = v62.i3.a(t62.b.f162798a);
                            } else if (fDoubleValue == 25.0f) {
                                s62.a.f157643a.getClass();
                                dVarA = v62.e3.a(t62.b.f162798a);
                            } else if (fDoubleValue == 50.0f) {
                                s62.a.f157643a.getClass();
                                dVarA = v62.g3.a(t62.b.f162798a);
                            } else if (fDoubleValue == 75.0f) {
                                s62.a.f157643a.getClass();
                                dVarA = v62.h3.a(t62.b.f162798a);
                            } else if (fDoubleValue == 100.0f) {
                                s62.a.f157643a.getClass();
                                dVarA = v62.j3.a(t62.b.f162798a);
                            } else {
                                dVarA = null;
                            }
                            aVar = new nr.e.f(zVar3, dVarA);
                        } else if (z14) {
                            aVar = null;
                        } else {
                            if (workoutFeel2 != null || workoutFeel2.intValue() == -1) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15) {
                                aVar = null;
                            } else {
                                if (workoutRPE2 != null && workoutRPE2.intValue() != -1) {
                                    z16 = true;
                                }
                                if (z16) {
                                    aVar = new nr.e.a(new nr.z(pVar.f160580a.getString(R.string.lbl_add_rating), null, null, null, null, null, 62, null), new qr.s(this, i16));
                                } else {
                                    aVar = null;
                                }
                            }
                        }
                        if (aVar != null) {
                            arrayList2.add(aVar);
                        }
                        break;
                    case 36:
                        sr.h hVar = (sr.h) bVar3.f160544e.getValue();
                        Integer workoutComplianceScore = q1Var != null ? q1Var.getWorkoutComplianceScore() : null;
                        if (!lg.d.H(q1Var != null ? q1Var.getPerceivedWorkoutEffort() : null) || workoutComplianceScore == null) {
                            cVar = null;
                        } else {
                            String strB3 = hVar.b(workoutComplianceScore.intValue());
                            l22.b bVar9 = hVar.f160571a;
                            cVar = new nr.e.c(new nr.z(strB3, bVar9.getString(R.string.lbl_execution_score), bVar9.a(R.string.lbl_value_percent, String.valueOf(workoutComplianceScore.intValue())), null, null, null, 56, null), sr.h.a(workoutComplianceScore.intValue()), new qn0.f(i15, this, workoutComplianceScore));
                        }
                        if (cVar != null) {
                            arrayList2.add(cVar);
                        }
                        break;
                }
            }
        }
        return arrayList2;
    }

    public final r53.z1<ps.s0> k5() {
        return (r53.z1) this.U0.getValue();
    }

    public final void l5() {
        List<c80.t> value;
        r53.z1<List<c80.t>> z1Var = this.f146562u2.f25297c;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, p13.h0.D0(value, new c80.t.a(this.f146575z))));
    }

    public final String m5(ro0.l lVar) {
        ps.q1 summaryDTO;
        ps.q1 summaryDTO2;
        int i14 = c.f146597e[lVar.ordinal()];
        if (i14 != 6) {
            if (i14 == 7 || i14 == 9) {
                ps.r value = W4().getValue();
                if (new ms.a0().a((value == null || (summaryDTO2 = value.getSummaryDTO()) == null) ? null : summaryDTO2.getRecoveryHeartRate())) {
                    return "INCLUDING_RECOVERY_HR";
                }
                return null;
            }
            if (i14 != 10) {
                return null;
            }
        }
        ps.r value2 = W4().getValue();
        if (new ms.x().a((value2 == null || (summaryDTO = value2.getSummaryDTO()) == null) ? null : summaryDTO.getAverageGradeAdjustedSpeed())) {
            return "INCLUDING_AVG_GRADE_ADJUSTED_PACE";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    public final nr.g.c n5(ps.r rVar, sr.c cVar) {
        ps.a1 metadataDTO;
        ps.x calendarEventInfo;
        Double customGoalValue;
        String calendarEventUuid;
        double d14;
        double dDoubleValue;
        final String str;
        if (rVar != null && (metadataDTO = rVar.getMetadataDTO()) != null && (calendarEventInfo = metadataDTO.getCalendarEventInfo()) != null && (customGoalValue = calendarEventInfo.getCustomGoalValue()) != null) {
            double dDoubleValue2 = customGoalValue.doubleValue();
            Long activityId = rVar.getActivityId();
            if (activityId != null) {
                final long jLongValue = activityId.longValue();
                Long calendarEventId = calendarEventInfo.getCalendarEventId();
                if ((calendarEventId != null && (calendarEventUuid = String.valueOf(calendarEventId.longValue())) != null) || (calendarEventUuid = calendarEventInfo.getCalendarEventUuid()) != null) {
                    ps.q1 summaryDTO = rVar.getSummaryDTO();
                    Double distance = summaryDTO != null ? summaryDTO.getDistance() : null;
                    ps.q1 summaryDTO2 = rVar.getSummaryDTO();
                    Double duration = summaryDTO2 != null ? summaryDTO2.getDuration() : null;
                    boolean zG = p005kotlin.jvm.internal.s.g(gg0.h.DISTANCE.f77161a, calendarEventInfo.getCustomGoalUnitType());
                    if (distance == null || !zG) {
                        if (duration != null) {
                            dDoubleValue = duration.doubleValue();
                        } else {
                            d14 = Double.NaN;
                        }
                        if (d14 < 0.0d && zG) {
                            String strA = cVar.a();
                            l22.b bVar = cVar.f160564a;
                            String string = bVar.getString(R.string.achieved_goal_distance);
                            s62.a.f157643a.getClass();
                            final int i14 = 0;
                            final String str2 = calendarEventUuid;
                            return new nr.g.c(strA, string, f72.t0.a(t62.c.f162799a), bVar.getString(R.string.share_with_friends), new e23.a(this) { // from class: qr.q

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ t f146436b;

                                {
                                    this.f146436b = this;
                                }

                                @Override // e23.a
                                public final Object invoke() {
                                    int i15 = i14;
                                    String str3 = str2;
                                    long j8 = jLongValue;
                                    t tVar = this.f146436b;
                                    switch (i15) {
                                        case 0:
                                            int i16 = t.A2;
                                            tVar.N5(j8, str3);
                                            break;
                                        default:
                                            int i17 = t.A2;
                                            tVar.N5(j8, str3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, new ds.f(this, 21));
                        }
                        str = calendarEventUuid;
                        if (d14 <= 0.0d && !zG) {
                            String strA2 = cVar.a();
                            l22.b bVar2 = cVar.f160564a;
                            String string2 = bVar2.getString(R.string.achieved_goal_time);
                            s62.a.f157643a.getClass();
                            final int i15 = 1;
                            return new nr.g.c(strA2, string2, f72.t0.a(t62.c.f162799a), bVar2.getString(R.string.share_with_friends), new e23.a(this) { // from class: qr.q

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ t f146436b;

                                {
                                    this.f146436b = this;
                                }

                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    String str3 = str;
                                    long j8 = jLongValue;
                                    t tVar = this.f146436b;
                                    switch (i16) {
                                        case 0:
                                            int i17 = t.A2;
                                            tVar.N5(j8, str3);
                                            break;
                                        default:
                                            int i18 = t.A2;
                                            tVar.N5(j8, str3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, new ds.f(this, 22));
                        }
                    } else {
                        dDoubleValue = distance.doubleValue();
                    }
                    d14 = dDoubleValue - dDoubleValue2;
                    if (d14 < 0.0d) {
                    }
                    str = calendarEventUuid;
                    if (d14 <= 0.0d) {
                        String strA3 = cVar.a();
                        l22.b bVar3 = cVar.f160564a;
                        String string3 = bVar3.getString(R.string.achieved_goal_time);
                        s62.a.f157643a.getClass();
                        final int i16 = 1;
                        return new nr.g.c(strA3, string3, f72.t0.a(t62.c.f162799a), bVar3.getString(R.string.share_with_friends), new e23.a(this) { // from class: qr.q

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ t f146436b;

                            {
                                this.f146436b = this;
                            }

                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                String str3 = str;
                                long j8 = jLongValue;
                                t tVar = this.f146436b;
                                switch (i17) {
                                    case 0:
                                        int i18 = t.A2;
                                        tVar.N5(j8, str3);
                                        break;
                                    default:
                                        int i19 = t.A2;
                                        tVar.N5(j8, str3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new ds.f(this, 22));
                    }
                }
            }
        }
        return null;
    }

    public final nr.g.a o5(List<ps.r> list, List<jr.m> list2) {
        jr.m mVar;
        ArrayList arrayList;
        List<jr.r> list3;
        Object next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        jr.k kVar = jr.k.ACTIVITY_LEGS;
        sr.b bVar = this.f146541n;
        String strH = sr.b.h(bVar, kVar, null, 6);
        ArrayList arrayList2 = new ArrayList();
        for (ps.r rVar : list) {
            am.x0 x0VarH = rVar.h();
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((jr.m) next).f100196a != x0VarH);
                mVar = (jr.m) next;
            } else {
                mVar = null;
            }
            if (mVar == null || (list3 = mVar.f100197b) == null) {
                arrayList = null;
            } else {
                ArrayList<jr.p> arrayListA = is.o.a(list3, fr.a.f(rVar, null, null));
                arrayList = new ArrayList();
                for (jr.p pVar : arrayListA) {
                    ps.q qVarF = fr.a.f(rVar, null, null);
                    ls.e eVarA = is.m.a(pVar);
                    Object objK = ss.k.k(eVarA, qVarF);
                    bVar.getClass();
                    String strB = ss.k.b(eVarA, bVar.f160541b, objK, 73);
                    if (strB != null) {
                        arrayList.add(strB);
                    }
                }
            }
            String strN = bVar.n(x0VarH.f4360c);
            u4.d dVar = x0VarH.f4362e;
            String str = arrayList != null ? (String) arrayList.get(0) : null;
            List listL0 = arrayList != null ? p13.h0.L0(arrayList, j23.t.o(1, arrayList.size())) : null;
            arrayList2.add(new nr.i0(strN, str, listL0 != null ? p13.h0.k0(listL0, bVar.f160541b.getString(R.string.bullet_point), null, null, null, 62) : null, null, dVar, null, null, null, null, new qr.p(this, rVar, x0VarH), 488, null));
        }
        return new nr.g.a(strH, arrayList2);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        ((js.b) this.M0.getValue()).a();
    }

    public final ArrayList p5(List list, ps.r rVar, SegmentDetailsListDTO segmentDetailsListDTO, nr.j jVar, yo1.f fVar, boolean z14, ArrayList arrayList) {
        Iterator it;
        ps.a1 metadataDTO;
        nr.a aVar;
        ps.a1 metadataDTO2;
        ps.p pVar;
        am.x0 x0VarH;
        am.x0 x0VarH2;
        am.g gVar;
        am.x0 x0VarH3;
        am.x0 x0VarH4;
        am.x0 x0VarH5;
        nr.a aVar2;
        ps.q1 summaryDTO;
        Double gainSolarActiveTime;
        String strG;
        ps.a1 metadataDTO3;
        nr.c cVar = jVar.f127206b;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                jr.k kVarC = ((jr.f) it3.next()).c();
                int i14 = kVarC == null ? -1 : c.f146595c[kVarC.ordinal()];
                int i15 = 4;
                int i16 = 3;
                sr.b bVar = this.f146541n;
                nr.f fVar2 = null;
                fVar = null;
                nr.f fVar3 = null;
                nr.f fVar4 = null;
                fVar = null;
                fVar = null;
                nr.f fVar5 = null;
                fVar = null;
                nr.f fVar6 = null;
                dVar = null;
                u4.d dVar = null;
                nr.f fVar7 = null;
                fVar = null;
                nr.f fVar8 = null;
                fVar = null;
                nr.f fVar9 = null;
                fVar2 = null;
                fVar2 = null;
                fVar2 = null;
                switch (i14) {
                    case 42:
                        it = it3;
                        if (rVar != null) {
                            ArrayList<SegmentDetailsDTO> arrayList3 = segmentDetailsListDTO != null ? segmentDetailsListDTO.f41284a : null;
                            if (arrayList3 != null && !arrayList3.isEmpty() && ((metadataDTO = rVar.getMetadataDTO()) == null || !metadataDTO.C0())) {
                                String strH = sr.b.h(bVar, jr.k.SEGMENTS, null, 6);
                                s62.a.f157643a.getClass();
                                fVar2 = new nr.f(strH, null, q7.a(t62.b.f162798a), new qr.o(this, rVar, 2), 2, null);
                            }
                        }
                        if (fVar2 != null) {
                            arrayList2.add(fVar2);
                            continue;
                        }
                        it3 = it;
                        break;
                    case 43:
                        it = it3;
                        ps.p pVar2 = (cVar == null || (aVar = cVar.f126996a) == null) ? null : aVar.f126977d;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            String strH2 = sr.b.h(bVar, jr.k.TIMING_GATES, null, 6);
                            s62.a.f157643a.getClass();
                            fVar9 = new nr.f(strH2, null, w8.a(t62.b.f162798a), new qn0.f(5, this, pVar2), 2, null);
                        }
                        if (fVar9 != null) {
                            arrayList2.add(fVar9);
                        } else {
                            continue;
                        }
                        it3 = it;
                        break;
                    case 44:
                        it = it3;
                        nr.a aVar3 = cVar != null ? cVar.f126996a : null;
                        cq.y.a aVar4 = cq.y.f55115a;
                        List<ps.x1> listI = (aVar3 == null || (pVar = aVar3.f126977d) == null) ? null : pVar.i();
                        aVar4.getClass();
                        List listA = cq.y.a.a(listI);
                        String groupRideUUID = (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null) ? null : metadataDTO2.getGroupRideUUID();
                        if (listA != null && !listA.isEmpty()) {
                            String strH3 = sr.b.h(bVar, jr.k.CLIMBS, null, 6);
                            s62.a.f157643a.getClass();
                            fVar8 = new nr.f(strH3, null, u62.l.a(t62.a.f162797a), new lm0.d(this, listA, aVar3, fVar, groupRideUUID, z14), 2, null);
                        }
                        if (fVar8 != null) {
                            arrayList2.add(fVar8);
                        } else {
                            continue;
                        }
                        it3 = it;
                        break;
                    case 45:
                        it = it3;
                        if (z14) {
                            jr.k kVar = jr.k.PERSONAL_RECORDS;
                            c22.c3 c3Var = (rVar == null || (x0VarH2 = rVar.h()) == null) ? null : x0VarH2.f4360c;
                            am.x0 x0VarH6 = rVar != null ? rVar.h() : null;
                            if (rVar == null || (x0VarH = rVar.h()) == null) {
                                x0VarH = am.x0.f4346x;
                            }
                            String strG2 = bVar.g(kVar, c3Var, am.z0.d(x0VarH6, x0VarH).f4360c);
                            s62.a.f157643a.getClass();
                            arrayList2.add(new nr.f(strG2, null, v62.g5.a(t62.b.f162798a), new qr.o(this, rVar, i16), 2, null));
                        } else {
                            continue;
                        }
                        it3 = it;
                        break;
                    case 46:
                        it = it3;
                        if (z14) {
                            String str = (rVar == null || (x0VarH4 = rVar.h()) == null) ? null : x0VarH4.f4358a;
                            am.z0 z0Var = am.z0.f4390a;
                            if (am.z0.b(am.x0.f4312o, str)) {
                                gVar = am.g.f3946j;
                            } else if (am.z0.b(am.x0.f4308n, str) || am.z0.b(am.x0.D2, str)) {
                                gVar = am.g.f3950n;
                            } else if (am.z0.b(am.x0.f4324r, str)) {
                                gVar = am.g.f3947k;
                            } else if (am.z0.b(am.x0.f4331t, str)) {
                                gVar = am.g.f3945i;
                            } else if (am.z0.b(am.x0.f4320q, str)) {
                                gVar = am.g.f3949m;
                            } else if (am.z0.b(am.x0.C, str)) {
                                gVar = am.g.f3951o;
                            } else if (am.z0.b(am.x0.f4322q2, str)) {
                                gVar = am.g.f3954r;
                            } else if (am.z0.b(am.x0.E, str)) {
                                gVar = am.g.f3955t;
                            } else if (am.z0.b(am.x0.f4316p, str)) {
                                gVar = am.g.f3953q;
                            } else if (am.z0.b(am.x0.f4350y, str)) {
                                gVar = am.g.f3958x;
                            } else if (am.z0.b(am.x0.U1, str)) {
                                gVar = am.g.f3959y;
                            } else if (am.z0.b(am.x0.f4277d3, str)) {
                                gVar = am.g.f3956v;
                            } else if (am.z0.b(am.x0.f4323q3, str)) {
                                gVar = am.g.f3957w;
                            } else if (am.z0.b(am.x0.f4268a3, str)) {
                                gVar = am.g.f3948l;
                            } else if (am.z0.b(am.x0.f4346x, str)) {
                                gVar = am.g.f3960z;
                            } else {
                                gVar = am.z0.b(am.x0.D3, str) ? am.g.A : null;
                            }
                            if (gVar != null) {
                                String strA = bVar.f160541b.a(R.string.lbl_all_activities_of_type, bVar.n(gVar.f3961a));
                                if (rVar != null && (x0VarH3 = rVar.h()) != null) {
                                    dVar = x0VarH3.f4362e;
                                }
                                fVar7 = new nr.f(strA, null, dVar, new qn0.f(i15, this, gVar), 2, null);
                            }
                            if (fVar7 != null) {
                                arrayList2.add(fVar7);
                            }
                        } else {
                            continue;
                        }
                        it3 = it;
                        break;
                    case 47:
                        it = it3;
                        if (z14) {
                            if (rVar != null && (x0VarH5 = rVar.h()) != null) {
                                String strH4 = sr.b.h(bVar, jr.k.REPORTS, x0VarH5.f4360c, 4);
                                s62.a.f157643a.getClass();
                                fVar6 = new nr.f(strH4, null, v62.d1.a(t62.b.f162798a), new qr.p(this, x0VarH5, rVar), 2, null);
                            }
                            if (fVar6 != null) {
                                arrayList2.add(fVar6);
                            }
                        } else {
                            continue;
                        }
                        it3 = it;
                        break;
                    case 48:
                        it = it3;
                        ActivityDetailChartDTO activityDetailChartDTO = (cVar == null || (aVar2 = cVar.f126996a) == null) ? null : aVar2.f126976c;
                        if (oe2.f.B(rVar)) {
                            ps.a1 metadataDTO4 = rVar != null ? rVar.getMetadataDTO() : null;
                            Integer numValueOf = metadataDTO4 != null ? Integer.valueOf(metadataDTO4.getEBikeBatteryUsage()) : null;
                            Integer numValueOf2 = metadataDTO4 != null ? Integer.valueOf(metadataDTO4.getEBikeBatteryRemaining()) : null;
                            if (numValueOf != null && numValueOf2 != null) {
                                String strH5 = sr.b.h(bVar, jr.k.E_BIKE, null, 6);
                                s62.a.f157643a.getClass();
                                fVar5 = new nr.f(strH5, null, u62.w0.a(t62.a.f162797a), new q42.v(this, i16, rVar, activityDetailChartDTO), 2, null);
                            }
                        }
                        if (fVar5 != null) {
                            arrayList2.add(fVar5);
                        } else {
                            continue;
                        }
                        it3 = it;
                        break;
                    case 49:
                        if (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (gainSolarActiveTime = summaryDTO.getGainSolarActiveTime()) == null) {
                            it = it3;
                        } else {
                            double dDoubleValue = gainSolarActiveTime.doubleValue();
                            o62.g0 g0Var = z14 ? new o62.g0(rVar, this, dDoubleValue) : null;
                            sr.t tVar = (sr.t) bVar.f160559t.getValue();
                            String strH6 = sr.b.h(bVar, jr.k.SOLAR_RIDE_TIME_GAINED, null, 6);
                            long jD = MathKt.d(dDoubleValue);
                            String str2 = tVar.f160587b;
                            String str3 = tVar.f160588c;
                            if (jD <= 0) {
                                strG = "0";
                                it = it3;
                            } else if (jD >= 60) {
                                long j8 = DateTimeConstants.SECONDS_PER_HOUR;
                                long j14 = jD / j8;
                                it = it3;
                                long j15 = (jD % j8) / ((long) 60);
                                if (j14 > 0 && j15 > 0) {
                                    strG = j14 + StringUtils.SPACE + str2 + StringUtils.SPACE + j15 + StringUtils.SPACE + str3;
                                } else if (j14 > 0) {
                                    strG = j14 + StringUtils.SPACE + str2;
                                } else {
                                    strG = j15 + StringUtils.SPACE + str3;
                                }
                            } else {
                                it = it3;
                                strG = i3.e5.g(tVar.f160586a.a(R.string.less_than_string_pattern, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), StringUtils.SPACE, str3);
                            }
                            String strI = hb.a.i(strG);
                            s62.a.f157643a.getClass();
                            fVar4 = new nr.f(strH6, strI, ob.a(t62.c.f162799a), g0Var);
                        }
                        if (fVar4 != null) {
                            arrayList2.add(fVar4);
                        } else {
                            continue;
                        }
                        it3 = it;
                        break;
                    case 50:
                        if (((rVar == null || (metadataDTO3 = rVar.getMetadataDTO()) == null) ? null : metadataDTO3.getHasTimeInGearData()) != null) {
                            ps.a1 metadataDTO5 = rVar.getMetadataDTO();
                            if (metadataDTO5 != null ? p005kotlin.jvm.internal.s.g(metadataDTO5.getHasTimeInGearData(), Boolean.TRUE) : false) {
                                String strH7 = sr.b.h(bVar, jr.k.ELECTRONIC_SHIFTING_DATA, null, 6);
                                s62.a.f157643a.getClass();
                                fVar3 = new nr.f(strH7, null, d8.a(t62.b.f162798a), new ds.f(this, 23), 2, null);
                            }
                        }
                        if (fVar3 != null) {
                            arrayList2.add(fVar3);
                        }
                        break;
                }
                it = it3;
                it3 = it;
            }
        }
        return arrayList2;
    }

    public final nr.g.o q5(jr.f fVar, nr.j jVar, boolean z14) {
        jr.i itemDetails = fVar.getItemDetails();
        ArrayList arrayListK4 = K4(itemDetails != null ? itemDetails.e() : null, jVar.f127205a);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListK4.iterator();
        while (it.hasNext()) {
            nr.l0 l0VarT5 = T5((jr.o) it.next(), jVar);
            if (l0VarT5 != null) {
                arrayList.add(l0VarT5);
            }
        }
        return new nr.g.o(z14 ? jr.k.PRIMARY_STATS : jr.k.SECONDARY_STATS, p13.h0.b1(arrayList), z14);
    }

    public final nr.g.c r5(List<nr.m0> list, Long l14, am.x0 x0Var, sr.n nVar) {
        int i14;
        l22.b bVar = nVar.f160578a;
        String string = bVar.getString(R.string.lbl_new_personal_record);
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((nr.m0) it.next()).f127260c) {
                    i14 = R.string.msg_new_personal_best_accept_or_decline;
                }
            }
            i14 = R.string.msg_new_personal_best;
        } else {
            i14 = R.string.msg_new_personal_best;
        }
        String string2 = bVar.getString(i14);
        String string3 = bVar.getString(R.string.lbl_view_new_record);
        s62.a.f157643a.getClass();
        return new nr.g.c(string, string2, e9.a(t62.b.f162798a), string3, new qr.s(this, 0), new q42.v(this, 5, x0Var, l14));
    }

    public final r53.z1<wg0.m> s5() {
        return (r53.z1) this.f146529j1.getValue();
    }

    public final void t5(long j8, String str) {
        String strB = hb2.h.b();
        Long lValueOf = Long.valueOf(j8);
        vo1.c cVar = this.f146538m;
        cVar.getClass();
        str.getClass();
        r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new p0(null), new r53.c2(new vo1.l(cVar, str, strB, lValueOf, null))), new q0(str, null)), new r0(null)), new s0(null)), androidx.lifecycle.v1.a(this));
    }

    public final nr.g.t u5(yo1.j jVar, String str, String str2, yo1.f fVar, boolean z14, ps.a2 a2Var) {
        ps.p pVar;
        if (jVar == null) {
            return null;
        }
        qr.r rVar = new qr.r(this, str, 1);
        nr.a value = L4().getValue();
        List<ps.x1> listI = (value == null || (pVar = value.f126977d) == null) ? null : pVar.i();
        nr.a value2 = L4().getValue();
        return new nr.g.t(jVar, listI, value2 != null ? value2.f126976c : null, fVar, str2, Long.valueOf(this.f146575z), str, z14, a2Var, rVar, new ds.f(this, 24), new qr.r(str, this), new qc.c(this));
    }

    public final r53.z1<Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l>> v5() {
        return (r53.z1) this.Q0.getValue();
    }

    public final nr.g.c w5(nr.u0 u0Var) {
        List<ms1.d> list;
        int size;
        Long l14;
        String str;
        int i14;
        if (a5().getValue().f127280d || (size = (list = u0Var.f127376a).size()) == 0) {
            return null;
        }
        sr.b bVar = this.f146541n;
        if (size != 1) {
            sr.q qVar = (sr.q) bVar.f160555p.getValue();
            String string = qVar.f160581a.getString(R.string.add_a_trail_to_this_activity);
            l22.b bVar2 = qVar.f160581a;
            String string2 = bVar2.getString(R.string.add_trail_to_activity_details);
            s62.a.f157643a.getClass();
            return new nr.g.c(string, string2, v62.d5.a(t62.b.f162798a), bVar2.getString(R.string.select_trail), new ds.f(this, 27), new ds.f(this, 28));
        }
        sr.k kVar = (sr.k) bVar.f160554o.getValue();
        ms1.d dVar = (ms1.d) p13.h0.d0(list);
        if (dVar == null || (l14 = dVar.f120483a) == null) {
            return null;
        }
        long jLongValue = l14.longValue();
        ms1.d dVar2 = (ms1.d) p13.h0.d0(list);
        if (dVar2 == null || (str = dVar2.f120484b) == null) {
            return null;
        }
        am.x0 x0Var = this.A;
        kVar.getClass();
        l22.b bVar3 = kVar.f160574a;
        x0Var.getClass();
        String str2 = x0Var.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (am.z0.b(am.x0.f4331t, str2)) {
            i14 = R.string.link_trail_to_walk_activity_title;
        } else {
            i14 = am.z0.b(am.x0.f4308n, str2) ? R.string.link_trail_to_run_activity_title : R.string.link_trail_to_hike_activity_title;
        }
        String strA = bVar3.a(i14, str);
        String string3 = bVar3.getString(R.string.link_trail_to_activity_body);
        s62.a.f157643a.getClass();
        return new nr.g.c(strA, string3, v62.d5.a(t62.b.f162798a), bVar3.getString(R.string.link_trail_to_activity_accept_button), new ds.f(this, 25), new a6.g(this, jLongValue, 7));
    }

    public final nr.g.w x5(nr.u0 u0Var, long j8, long j14, String str, boolean z14) {
        ms1.d dVar = u0Var.f127377b;
        sr.u uVar = (sr.u) this.f146541n.f160553n.getValue();
        Long l14 = dVar != null ? dVar.f120483a : null;
        if (l14 == null) {
            return null;
        }
        boolean z15 = z14 || !(dVar.f120487e == null || p005kotlin.jvm.internal.s.g(dVar.f120491i, Boolean.TRUE));
        nr.w0.g1 g1Var = new nr.w0.g1(l14.longValue(), z14 ? Long.valueOf(j8) : null, z14 ? Long.valueOf(j14) : null, null, null, z14 && p005kotlin.jvm.internal.s.g(dVar.f120492j, Boolean.TRUE), 24, null);
        long jLongValue = l14.longValue();
        String str2 = dVar.f120484b;
        uVar.getClass();
        String str3 = str2 == null ? "" : str2;
        String str4 = dVar.f120485c;
        String str5 = str4 == null ? "" : str4;
        String str6 = dVar.f120486d;
        Integer num = dVar.f120488f;
        Long l15 = dVar.f120489g;
        String strA = l15 != null ? uVar.f160590b.a(new DateTime(l15.longValue()), qi0.a.YEAR_ABBREV_MONTH_DAY) : null;
        String str7 = dVar.f120490h;
        return new nr.g.w(jLongValue, str3, str5, str6, z14, new qn0.f(9, this, g1Var), new ds.f(this, 29), z15, num, strA, str7 == null ? str : str7, dVar.f120491i, dVar.f120492j, new p90.h(dVar, 14, this, g1Var));
    }

    public final r53.z1<ps.i0> y5() {
        return (r53.z1) this.V1.getValue();
    }

    public final r53.z1<nr.u0> z5() {
        return (r53.z1) this.C1.getValue();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqr/t$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_ACTIVITY_IMAGES_LIMIT", "I", "", "INVALID_TRAIL_ID", "J", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
