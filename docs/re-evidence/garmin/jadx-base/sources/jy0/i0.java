package jy0;

import am.x0;
import android.content.Context;
import android.text.TextUtils;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.e5;
import i3.i7;
import i3.mh;
import i3.s4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l72.g2;
import l72.j0;
import l72.n0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.l0;
import v62.s6;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<x0, Unit> f101715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f101716b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super x0, Unit> lVar, x0 x0Var) {
            this.f101715a = lVar;
            this.f101716b = x0Var;
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            this.f101715a.invoke(this.f101716b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f101717a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f101718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f101719b;

        public c(e23.l lVar, List list) {
            this.f101718a = lVar;
            this.f101719b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f101718a.invoke(this.f101719b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f101720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f101721b;

        public d(e23.l lVar, List list) {
            this.f101720a = lVar;
            this.f101721b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f101720a.invoke(this.f101721b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f101722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l f101723b;

        public e(List list, e23.l lVar) {
            this.f101722a = list;
            this.f101723b = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                x0 x0Var = (x0) this.f101722a.get(iIntValue);
                mVar2.C(890828358);
                String strT = gl1.d.T(x0Var.f4360c, mVar2, 0);
                j0 j0Var = new j0(strT, strT, null, false, true, 12, null);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar, j92.b.f97899b.f97916a, 0.0f, 2);
                e23.l lVar = this.f101723b;
                boolean zB = mVar2.B(lVar) | mVar2.k(x0Var.ordinal());
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new a(lVar, x0Var);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(lVar, x0Var);
                        mVar2.K(objQ);
                    }
                }
                n0.d(rVarA, j0Var, (e23.l) objQ, mVar2, 0, 0);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<ActivityListItemDTO, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<ActivityListItemDTO, Unit> f101724a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(e23.l<? super ActivityListItemDTO, Unit> lVar) {
            this.f101724a = lVar;
        }

        @Override // e23.l
        public final Unit invoke(ActivityListItemDTO activityListItemDTO) {
            ActivityListItemDTO activityListItemDTO2 = activityListItemDTO;
            activityListItemDTO2.getClass();
            this.f101724a.invoke(activityListItemDTO2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesSelectionScreenKt$MultiDayActivitiesSelectionScreen$2$1", f = "MultiDayActivitiesSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f101725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f101726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f101727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f101728d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesSelectionScreenKt$MultiDayActivitiesSelectionScreen$2$1$1", f = "MultiDayActivitiesSelectionScreen.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f101729a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.l<Boolean, Unit> f101730b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f101731c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e23.l<? super Boolean, Unit> lVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f101730b = lVar;
                this.f101731c = lVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f101730b, this.f101731c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f101729a;
                e23.l<Boolean, Unit> lVar = this.f101730b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    lVar.invoke(Boolean.TRUE);
                    this.f101729a = 1;
                    if (this.f101731c.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                lVar.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(boolean z14, o53.b0 b0Var, e23.l<? super Boolean, Unit> lVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f101725a = z14;
            this.f101726b = b0Var;
            this.f101727c = lVar;
            this.f101728d = lVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f101725a, this.f101726b, this.f101727c, this.f101728d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (!this.f101725a) {
                ge1.b.T(this.f101726b, null, null, new a(this.f101727c, this.f101728d, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f101732a = new h();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f101733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f101734b;

        public i(e23.l lVar, List list) {
            this.f101733a = lVar;
            this.f101734b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f101733a.invoke(this.f101734b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f101735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f101736b;

        public j(e23.l lVar, List list) {
            this.f101735a = lVar;
            this.f101736b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f101735a.invoke(this.f101736b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f101737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i53.e f101738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l f101739c;

        public k(List list, i53.e eVar, e23.l lVar) {
            this.f101737a = list;
            this.f101738b = eVar;
            this.f101739c = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x008c  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            boolean z14 = true;
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) this.f101737a.get(iIntValue);
                mVar2.C(-1607125906);
                i53.e eVar = this.f101738b;
                if (eVar != null && eVar.isEmpty()) {
                    z14 = false;
                    break;
                }
                Iterator<E> it = eVar.iterator();
                do {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                } while (((ActivityListItemDTO) it.next()).f29250b != activityListItemDTO.f29250b);
                e23.l lVar = this.f101739c;
                boolean zB = mVar2.B(lVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new f(lVar);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f(lVar);
                        mVar2.K(objQ);
                    }
                }
                i0.a(activityListItemDTO, z14, false, (e23.l) objQ, mVar2, 0);
                mVar2.f();
                x1 x1Var2 = p3.n.f135158a;
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            LinkedHashMap linkedHashMap = ay0.a.f13653b;
            return r13.a.b((Integer) linkedHashMap.get((x0) t7), (Integer) linkedHashMap.get((x0) t14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ActivityListItemDTO activityListItemDTO, boolean z14, boolean z15, e23.l lVar, p3.m mVar, int i14) {
        boolean z16;
        int i15;
        String strQ;
        String string;
        Date date;
        o0 o0VarE = mVar.E(993650829);
        int i16 = 16;
        int i17 = i14 | (o0VarE.r(activityListItemDTO) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | 128 | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                z16 = am.j.z(f12.l.f68084a);
                i15 = i17 & (-897);
            } else {
                o0VarE.e();
                i15 = i17 & (-897);
                z16 = z15;
            }
            int i18 = i15;
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strJ = activityListItemDTO.f29253c;
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1415715921, R.string.txt_untitle, o0VarE, false);
            } else {
                o0VarE.C(1415715270);
                o0VarE.g0(false);
            }
            String str = strJ;
            br.a aVar = br.a.f19572a;
            String str2 = activityListItemDTO.f29259e;
            if (str2 != null) {
                context.getClass();
                if (TextUtils.isEmpty(str2)) {
                    strQ = null;
                } else {
                    try {
                        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(str2);
                        date.getClass();
                    } catch (ParseException unused) {
                        try {
                            date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(str2);
                            date.getClass();
                        } catch (ParseException e4) {
                            i2.a aVar2 = i2.f36769a;
                            a2 a2Var = a2.ACTIVITIES;
                            aVar2.getClass();
                            i2.a.d(a2Var, e4);
                            strQ = null;
                        }
                    }
                    strQ = c22.j0.q(context, new DateTime(date));
                }
            } else {
                strQ = null;
            }
            aVar.getClass();
            String strA = br.a.a(context, strQ);
            if (strA == null) {
                strA = "";
            }
            br.a aVar3 = br.a.f19572a;
            double d14 = activityListItemDTO.f29275k;
            if (Double.isNaN(d14) || d14 <= 0.0d) {
                string = context.getString(R.string.no_duration_value);
            } else {
                l3.a aVar4 = l3.f23124b;
                long jD = MathKt.d(d14);
                aVar4.getClass();
                string = l3.a.e1(jD);
            }
            aVar3.getClass();
            String strA2 = br.a.a(context, string);
            if (strA2 == null) {
                strA2 = "";
            }
            String strA3 = br.a.a(context, ar.b.f(context, activityListItemDTO, z16, null));
            String strG = e5.g(strA2, ", ", strA3 != null ? strA3 : "");
            g02.b0 b0Var = g02.b0.f74326a;
            z3.e eVarC = z3.f.c(396920556, new ik1.c(activityListItemDTO, i16), o0VarE);
            z3.e eVarC2 = z3.f.c(1887489261, new j30.d(z14, 5, (byte) 0), o0VarE);
            boolean z17 = (o0VarE.r(activityListItemDTO) ? 1 : 0) | ((i18 & 7168) == 2048 ? (byte) 1 : (byte) 0);
            Object objQ = o0VarE.q();
            if (z17 == 0) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new jd0.u(lVar, activityListItemDTO, 1);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new jd0.u(lVar, activityListItemDTO, 1);
                o0VarE.K(objQ);
            }
            b0Var.a(str, strA, strG, null, false, eVarC, eVarC2, (e23.a) objQ, o0VarE, 14155776, 312);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
            z16 = z15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ha0.e(activityListItemDTO, z14, z16, lVar, i14, 2);
        }
    }

    public static final void b(h4.r rVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        o0 o0VarE = mVar.E(-317571851);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            h4.r rVar3 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar2, 0.0f, eVar2.f97920e, 1);
            bVar2.getClass();
            h4.r rVarQ = x2.q(rVarA, j92.b.f97901d.f97907f);
            g6.f.a aVar3 = g6.f.f75994b;
            long jF = ds.e0.f(o0VarE);
            k2.h hVar = k2.i.f102406a;
            h4.r rVarE = u1.n.e(u1.q.b(0, jF, rVarQ, hVar), d92.b.a(o0VarE).e().g(), hVar);
            h4.g.a aVar4 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(rVarE, aVar4);
            h4.g gVar = h4.d.a.f81528f;
            z0 z0VarD = c2.q.d(gVar, false);
            h4.r rVar4 = rVar3;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            s62.a.f157643a.getClass();
            i7.b(u62.a.a(t62.a.f162797a), null, uVar.c(x2.q(aVar2, 32), gVar), am.j.d(o0VarE), o0VarE, 48, 0);
            o0VarE.g0(true);
            h4.r rVarB2 = b0Var.b(aVar2, aVar4);
            c22.x0.f23314a.getClass();
            String strW = gl1.d.W(c22.x0.Ha);
            d6.h.f57752b.getClass();
            int i18 = d6.h.f57755e;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strW, rVarB2, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130044);
            bVar2.getClass();
            c2.l.f(x2.q(aVar2, eVar2.f97918c), o0VarE);
            h4.r rVarB3 = b0Var.b(aVar2, aVar4);
            String strW2 = gl1.d.W(c22.x0.Ia);
            fVar2.getClass();
            mh.c(strW2, rVarB3, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            rVar2 = rVar4;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(rVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    public static final void c(final Set<? extends x0> set, final e23.l<? super x0, Unit> lVar, p3.m mVar, final int i14) {
        int i15;
        o0 o0VarE = mVar.E(2023645225);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(set) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        final int i16 = 0;
        final boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (set.isEmpty()) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: jy0.f0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = i16;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i17) {
                                case 0:
                                    i0.c(set, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                                default:
                                    i0.c(set, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
            int i17 = (o0VarE.r(set) ? 1 : 0) | ((i15 & 112) == 32 ? 1 : 0);
            Object objQ = o0VarE.q();
            if (i17 == 0) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new jt1.d(5, set, lVar);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new jt1.d(5, set, lVar);
                o0VarE.K(objQ);
            }
            e2.c.c(rVarC, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new e23.p() { // from class: jy0.f0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = z14;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i18) {
                        case 0:
                            i0.c(set, lVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            i0.c(set, lVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(h4.r rVar, Set<? extends ActivityListItemDTO> set, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1967697197);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(set) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            g(set, o0VarE, (i15 >> 3) & 14);
            h4.r rVarC2 = u2Var.c(h4.r.S, h4.d.a.f81534l);
            c22.x0.f23314a.getClass();
            String strV = gl1.d.V(c22.x0.I9, new Object[]{Integer.valueOf(set.size())});
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strV, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(rVar, set, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0357  */
    /* JADX WARN: Code duplicated, block: B:138:0x042f  */
    public static final void e(final Long l14, final Long l15, final long j8, final List<? extends ActivityListItemDTO> list, final Set<? extends x0> set, boolean z14, final e23.a<Unit> aVar, e23.p<? super Boolean, ? super Boolean, Unit> pVar, final e23.l<? super x0, Unit> lVar, p3.m mVar, final int i14) {
        int i15;
        o0 o0Var;
        h4.r.a aVar2;
        boolean z15;
        h5.g.a.b bVar;
        boolean z16;
        String strJ;
        final boolean z17 = z14;
        final e23.p<? super Boolean, ? super Boolean, Unit> pVar2 = pVar;
        o0 o0VarE = mVar.E(862821595);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(l14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(l15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(list) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(set) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z17) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(pVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 67108864 : 33554432;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (l15 == null) {
                o0VarE.C(-5544520);
                o0VarE.g0(false);
                aVar2 = aVar3;
                z15 = false;
                o0Var = o0VarE;
                bVar = bVar2;
            } else {
                o0VarE.C(-5544519);
                if (l15.longValue() > j8) {
                    o0VarE.C(-1852307130);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    c2.l.f(x2.q(aVar3, eVar2.f97920e), o0VarE);
                    h4.r rVarF = x2.f(aVar3, 1.0f);
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.Ea);
                    d6.h.f57752b.getClass();
                    int i17 = d6.h.f57755e;
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                    z15 = false;
                    bVar = bVar2;
                    aVar2 = aVar3;
                    mh.c(strW, rVarF, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 130044);
                    bVar3.getClass();
                    c2.l.f(x2.q(aVar2, eVar2.f97918c), o0VarE);
                    h4.r rVarF2 = x2.f(aVar2, 1.0f);
                    String strW2 = gl1.d.W(c22.x0.Fa);
                    fVar2.getClass();
                    mh.c(strW2, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 48, 0, 130044);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    aVar2 = aVar3;
                    z15 = false;
                    o0Var = o0VarE;
                    bVar = bVar2;
                    o0Var.C(-1851595990);
                    o0Var.g0(false);
                }
                Unit unit = Unit.INSTANCE;
                o0Var.g0(z15);
            }
            c(set, lVar, o0Var, ((i16 >> 12) & 14) | ((i16 >> 21) & 112));
            if (l14 == null) {
                o0Var.C(-4576235);
                o0Var.g0(z15);
                z17 = z14;
                pVar2 = pVar;
            } else {
                o0Var.C(-4576234);
                if (l14.longValue() <= j8) {
                    o0Var.C(1210971167);
                    h4.r rVarF3 = x2.f(aVar2, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar4 = d92.b.f58625c;
                    bVar4.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97918c;
                    float f15 = eVar3.f97917b;
                    bVar4.getClass();
                    h4.r.a aVar5 = aVar2;
                    float f16 = eVar3.f97918c;
                    bVar4.getClass();
                    float f17 = eVar3.f97920e;
                    bVar4.getClass();
                    h4.r rVarB = c2.l.B(rVarF3, f14, f17, f16, f15);
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var, 0);
                    int iHashCode2 = Long.hashCode(o0Var.U);
                    p3.i2 i2VarA1 = o0Var.a0();
                    h4.r rVarC2 = h4.k.c(rVarB, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar4);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, s2VarA, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    u2 u2Var = u2.f22900a;
                    String strQ = gl1.y.Q(o0Var, R.string.lbl_activities);
                    z5.b.f202439b.getClass();
                    String strB = l0.b(strQ, z5.b.a.a());
                    j92.f fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    s5.x0 x0Var = j92.f.f97934k;
                    o0 o0Var2 = o0Var;
                    mh.c(strB, aVar5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var), o0Var2, 48, 0, 131068);
                    bVar4.getClass();
                    c2.l.f(x2.q(aVar5, f15), o0Var2);
                    String strA = c22.j0.a(new DateTime(l14.longValue(), DateTimeZone.getDefault()), 'M');
                    String strA2 = c22.j0.a(new DateTime(l15, DateTimeZone.getDefault()), 'M');
                    boolean z18 = (i16 & 3670016) == 1048576;
                    Object objQ = o0Var2.q();
                    p3.m.a aVar6 = p3.m.f135153a;
                    if (z18) {
                        objQ = new j22.d(aVar, 16);
                        o0Var2.K(objQ);
                    } else {
                        aVar6.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j22.d(aVar, 16);
                            o0Var2.K(objQ);
                        }
                    }
                    h4.r rVarD = u1.w.d(aVar5, false, null, null, (e23.a) objQ, 15);
                    String strB2 = l0.b(e5.g(strA, " - ", strA2), z5.b.a.a());
                    fVar3.getClass();
                    mh.c(strB2, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(x0Var, hb.a.e(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 0, 0, 131068);
                    o0Var = o0Var2;
                    if (list.isEmpty()) {
                        z17 = z14;
                        pVar2 = pVar;
                        z16 = false;
                        o0Var.C(-2099495070);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-2100250416);
                        c2.l.f(u2Var.a(aVar5, 1.0f, true), o0Var);
                        if (z14) {
                            o0Var.C(-2100130384);
                            c22.x0.f23314a.getClass();
                            strJ = gl1.d.W(c22.x0.f23325aa);
                            o0Var.g0(false);
                        } else {
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var, -2100011933, R.string.lbl_select_all, o0Var, false);
                        }
                        boolean z19 = ((i16 & 458752) == 131072) | ((i16 & 29360128) == 8388608);
                        Object objQ2 = o0Var.q();
                        if (z19) {
                            z17 = z14;
                            pVar2 = pVar;
                            objQ2 = new b50.o(pVar2, z17, 5);
                            o0Var.K(objQ2);
                        } else {
                            aVar6.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                z17 = z14;
                                pVar2 = pVar;
                                objQ2 = new b50.o(pVar2, z17, 5);
                                o0Var.K(objQ2);
                            } else {
                                z17 = z14;
                                pVar2 = pVar;
                            }
                        }
                        h4.r rVarD2 = u1.w.d(aVar5, false, null, null, (e23.a) objQ2, 15);
                        String strB3 = l0.b(strJ, z5.b.a.a());
                        fVar3.getClass();
                        mh.c(strB3, rVarD2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(x0Var, hb.a.e(o0Var), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var, 0, 0, 131068);
                        o0Var = o0Var;
                        z16 = false;
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    o0Var.g0(z16);
                } else {
                    z17 = z14;
                    z16 = z15;
                    pVar2 = pVar;
                    o0Var.C(1213340993);
                    o0Var.g0(z16);
                }
                Unit unit2 = Unit.INSTANCE;
                o0Var.g0(z16);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: jy0.g0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    i0.e(l14, l15, j8, list, set, z17, aVar, pVar2, lVar, (p3.m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0214  */
    /* JADX WARN: Code duplicated, block: B:103:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x021f  */
    /* JADX WARN: Code duplicated, block: B:109:0x023a  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:140:0x033d  */
    /* JADX WARN: Code duplicated, block: B:144:0x034f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0362  */
    public static final void f(e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, sy0.b bVar, Long l14, Long l15, i53.e<? extends ActivityListItemDTO> eVar, e23.l<? super Boolean, Unit> lVar2, e23.l<? super ActivityListItemDTO, Unit> lVar3, e23.a<Unit> aVar, e23.p<? super Boolean, ? super Boolean, Unit> pVar, e23.l<? super x0, Unit> lVar4, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        e23.p<? super Boolean, ? super Boolean, Unit> pVar2;
        o0 o0Var;
        h5.g.a.e eVar2;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        h5.g.a.e eVar3;
        z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        i53.e<? extends ActivityListItemDTO> eVar4;
        p3.m.a.C2565a c2565a;
        boolean zH;
        Object objQ;
        boolean z14;
        lVar.getClass();
        bVar.getClass();
        eVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        pVar.getClass();
        lVar4.getClass();
        o0 o0VarE = mVar.E(1993651034);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(bVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(l14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(l15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        } else {
            aVar2 = aVar;
        }
        if ((100663296 & i14) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.r(pVar2) ? 67108864 : 33554432;
        } else {
            pVar2 = pVar;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(lVar4) ? 536870912 : 268435456;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ2 == c2565a2) {
                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            o53.b0 b0Var2 = (o53.b0) objQ2;
            boolean z15 = !p13.h0.h0(eVar, bVar.f161205e).isEmpty();
            long millis = DateTime.now().getMillis();
            i53.c<ActivityListItemDTO> cVar2 = bVar.f161201a;
            boolean z16 = bVar.f161204d;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar5 = h5.g.a.f81810g;
            b4.c(eVar5, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                eVar2 = eVar5;
            } else {
                eVar2 = eVar5;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = c2.b0.f22601a;
                int i17 = i16 >> 3;
                eVar3 = eVar2;
                e(l14, l15, millis, cVar2, bVar.f161203c, z15, aVar2, pVar2, lVar4, o0VarE, ((i16 >> 6) & 126) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024));
                o0Var = o0VarE;
                h4.r rVarA = b0Var.a(x2.d(aVar3, 1.0f), 1.0f, true);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarA, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar5);
                } else {
                    o0Var.c();
                }
                b4.c(eVar3, z0VarD, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0Var);
                c2.u uVar = c2.u.f22885a;
                if (l14 != null || l14.longValue() > millis) {
                    eVar4 = eVar;
                    c2565a = c2565a2;
                    o0Var.C(1713660452);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1712558185);
                    if (cVar2.isEmpty()) {
                        eVar4 = eVar;
                        c2565a = c2565a2;
                        z14 = false;
                        o0Var.C(1713518751);
                        b(x2.d(aVar3, 1.0f), o0Var, 6, 0);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1712600531);
                        h4.r rVarE = u1.n.e(x2.d(aVar3, 1.0f), am.j.c(d92.b.f58623a, o0Var), m1.f128891a);
                        eVar4 = eVar;
                        boolean zR = ((i16 & 112) == 32) | o0Var.r(eVar4) | ((i16 & 3670016) == 1048576);
                        Object objQ3 = o0Var.q();
                        if (zR) {
                            c2565a = c2565a2;
                        } else {
                            c2565a = c2565a2;
                            if (objQ3 == c2565a) {
                            }
                            e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ3, o0Var, 0, 510);
                            o0Var = o0Var;
                            z14 = false;
                            o0Var.g0(false);
                        }
                        objQ3 = new gw1.d(bVar, 28, eVar4, lVar3);
                        o0Var.K(objQ3);
                        e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ3, o0Var, 0, 510);
                        o0Var = o0Var;
                        z14 = false;
                        o0Var.g0(false);
                    }
                    o0Var.g0(z14);
                }
                o0Var.g0(true);
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar6 = j92.b.f97899b;
                float f14 = eVar6.f97920e;
                float f15 = eVar6.f97920e;
                bVar3.getClass();
                bVar3.getClass();
                g6.f.a aVar6 = g6.f.f75994b;
                d(b0Var.b(c2.l.B(aVar3, f14, f15, f15, 0), aVar4), eVar4, o0Var, (i16 >> 9) & 112);
                o0Var.g0(true);
                Boolean boolValueOf = Boolean.valueOf(z16);
                zH = o0Var.h(z16) | o0Var.r(b0Var2) | ((i16 & 458752) == 131072) | o0Var.r(lVar);
                objQ = o0Var.q();
                if (zH || objQ == c2565a) {
                    g gVar = new g(z16, b0Var2, lVar2, lVar, null);
                    o0Var.K(gVar);
                    objQ = gVar;
                }
                p3.l0.e((e23.p) objQ, boolValueOf, o0Var);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = c2.b0.f22601a;
            int i18 = i16 >> 3;
            eVar3 = eVar2;
            e(l14, l15, millis, cVar2, bVar.f161203c, z15, aVar2, pVar2, lVar4, o0VarE, ((i16 >> 6) & 126) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024));
            o0Var = o0VarE;
            h4.r rVarA2 = b0Var.a(x2.d(aVar3, 1.0f), 1.0f, true);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0Var.U);
            i2VarA0 = o0Var.a0();
            rVarC = h4.k.c(rVarA2, o0Var);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar5);
            } else {
                o0Var.c();
            }
            b4.c(eVar3, z0VarD, o0Var);
            b4.c(c1623g, i2VarA0, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode, o0Var, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0Var, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0Var);
            c2.u uVar2 = c2.u.f22885a;
            if (l14 != null) {
                eVar4 = eVar;
                c2565a = c2565a2;
                o0Var.C(1713660452);
                o0Var.g0(false);
            } else {
                eVar4 = eVar;
                c2565a = c2565a2;
                o0Var.C(1713660452);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar7 = j92.b.f97899b;
            float f16 = eVar7.f97920e;
            float f17 = eVar7.f97920e;
            bVar4.getClass();
            bVar4.getClass();
            g6.f.a aVar7 = g6.f.f75994b;
            d(b0Var.b(c2.l.B(aVar3, f16, f17, f17, 0), aVar4), eVar4, o0Var, (i16 >> 9) & 112);
            o0Var.g0(true);
            Boolean boolValueOf2 = Boolean.valueOf(z16);
            zH = o0Var.h(z16) | o0Var.r(b0Var2) | ((i16 & 458752) == 131072) | o0Var.r(lVar);
            objQ = o0Var.q();
            if (zH) {
                g gVar2 = new g(z16, b0Var2, lVar2, lVar, null);
                o0Var.K(gVar2);
                objQ = gVar2;
            } else {
                g gVar3 = new g(z16, b0Var2, lVar2, lVar, null);
                o0Var.K(gVar3);
                objQ = gVar3;
            }
            p3.l0.e((e23.p) objQ, boolValueOf2, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(lVar, bVar, l14, l15, eVar, lVar2, lVar3, aVar, pVar, lVar4, i14);
        }
    }

    public static final void g(final Set<? extends ActivityListItemDTO> set, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(1095947996);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(set) ? 4 : 2) | i14 : i14;
        final int i16 = 1;
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (set.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new e23.p() { // from class: jy0.e0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = i16;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i18) {
                                case 0:
                                    i0.g(set, mVar2, p0.t(i14 | 1));
                                    break;
                                default:
                                    i0.g(set, mVar2, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                Set<? extends ActivityListItemDTO> set2 = set;
                ArrayList arrayList = new ArrayList(p13.y.r(set2, 10));
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    x0 x0Var = ((ActivityListItemDTO) it.next()).f29265g;
                    x0Var.getClass();
                    arrayList.add(am.z0.d(x0Var, x0Var));
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (hashSet.add((x0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                List listN0 = p13.h0.N0(p13.h0.g1(arrayList2), new l());
                boolean z14 = listN0.size() > 5;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                o0VarE.C(-419130925);
                int i18 = 0;
                for (Object obj2 : p13.h0.S0(listN0, 5)) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    x0 x0Var2 = (x0) obj2;
                    h4.r.a aVar3 = h4.r.S;
                    g6.f.a aVar4 = g6.f.f75994b;
                    float f14 = i18;
                    g2.b(x0Var2.f4362e, null, n5.a.a(o0VarE, x0Var2.f4366i), null, h4.p.b(c2.l.C(aVar3, f14 * 20, 0.0f, 0.0f, 0.0f, 14), 10.0f - f14), null, o0VarE, 0, 42);
                    i18 = i19;
                }
                o0VarE.g0(false);
                if (z14) {
                    o0VarE.C(-107803943);
                    h4.r.a aVar5 = h4.r.S;
                    g6.f.a aVar6 = g6.f.f75994b;
                    h4.r rVarB = h4.p.b(c2.l.C(aVar5, 5 * 20, 0.0f, 0.0f, 0.0f, 14), 0.0f);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s6.a(t62.b.f162798a);
                    gl.c.f77766a.getClass();
                    g2.b(dVarA, null, gl.c.a(o0VarE).g(), null, rVarB, null, o0VarE, 24576, 42);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-107529748);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                x1 x1Var3 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new e23.p() { // from class: jy0.e0
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    int i110 = i17;
                    p3.m mVar2 = (p3.m) obj3;
                    ((Integer) obj4).intValue();
                    switch (i110) {
                        case 0:
                            i0.g(set, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            i0.g(set, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
