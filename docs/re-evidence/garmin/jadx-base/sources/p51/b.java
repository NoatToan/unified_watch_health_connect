package p51;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import com.garmin.android.apps.connectmobile.pacepro.domain.algorithm.PaceProAlgorithm;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.p;
import f12.l;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o51.f;
import o51.g;
import o51.h;
import o53.s0;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import qw0.s;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.z1;
import v13.i;
import v41.a0;
import v41.b0;
import v41.c0;
import v41.d0;
import v41.e0;
import v41.f0;
import v41.g0;
import v41.i0;
import v41.k;
import v41.m;
import v41.o;
import v41.q;
import v41.t;
import v41.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp51/b;", "Landroidx/lifecycle/u1;", "Landroid/content/Context;", "applicationContext", "Lu41/a;", "paceProDetailsInitialParams", "Lr41/a;", "paceProApiRepository", "Ld60/b;", "coursesRepo", "Ls41/a;", "paceProDelegate", "Lf12/l;", "gcmUserSettings", "Lf12/b;", "gcmUserAccount", "Lqw0/s;", "mapSettingsPreferences", "<init>", "(Landroid/content/Context;Lu41/a;Lr41/a;Ld60/b;Ls41/a;Lf12/l;Lf12/b;Lqw0/s;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f136124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u41.a f136125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s41.a f136126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f136127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f136128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q53.b f136129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f136130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f136131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f136132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f136133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v41.d f136134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v41.e f136135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f136136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f136137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r53.e f136138o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.viewmodel.PaceProDetailsViewModel$1", f = "PaceProDetailsViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136139a;

        /* JADX INFO: renamed from: p51.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2573a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f136141a;

            public C2573a(b bVar) {
                this.f136141a = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                g gVar = (g) obj;
                p2 p2Var = this.f136141a.f136128e;
                while (true) {
                    Object value = p2Var.getValue();
                    p2 p2Var2 = p2Var;
                    if (p2Var2.b(value, u41.b.a((u41.b) value, null, null, null, 0, 0, null, null, gVar, null, null, null, false, false, false, 16255))) {
                        return Unit.INSTANCE;
                    }
                    p2Var = p2Var2;
                }
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to p51.b$a for r4v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f136139a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
            Le:
                r5 = 0
                return r5
            L10:
                o13.r.b(r5)
                goto L2d
            L14:
                o13.r.b(r5)
                p51.b r5 = p51.b.this
                v41.b0 r1 = r5.f136132i
                r53.b2 r1 = r1.f175576f
                p51.b$a$a r3 = new p51.b$a$a
                r3.<init>(r5)
                r4.f136139a = r2
                r53.o2<T> r5 = r1.f150540a
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L2d
                return r0
            L2d:
                o2.c.f()
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: p51.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p51.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2574b implements r53.i<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f136142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f136143b;

        /* JADX INFO: renamed from: p51.b$b$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f136144a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f136145b;

            /* JADX INFO: renamed from: p51.b$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.viewmodel.PaceProDetailsViewModel$special$$inlined$map$1$2", f = "PaceProDetailsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2575a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f136146a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f136147b;

                public C2575a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f136146a = obj;
                    this.f136147b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, b bVar) {
                this.f136144a = jVar;
                this.f136145b = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2575a c2575a;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar;
                double d14;
                double d15;
                String strO;
                List listC0;
                h hVar;
                if (dVar instanceof C2575a) {
                    c2575a = (C2575a) dVar;
                    int i14 = c2575a.f136147b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2575a.f136147b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2575a = new C2575a(dVar);
                    }
                } else {
                    c2575a = new C2575a(dVar);
                }
                Object obj2 = c2575a.f136146a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2575a.f136147b;
                if (i15 == 0) {
                    r.b(obj2);
                    u41.b bVar2 = (u41.b) obj;
                    k51.a aVar2 = k51.a.f102935a;
                    Context context = this.f136145b.f136124a;
                    aVar2.getClass();
                    bVar2.getClass();
                    context.getClass();
                    oi0.h hVar2 = new oi0.h(context);
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar3 = bVar2.f168609a;
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar3 = aVar3.f39760b;
                    List<PaceBandSplitDTO> list = aVar3.f39759a;
                    Long l14 = bVar3.f39766c;
                    long j8 = bVar3.f39773j;
                    double d16 = bVar3.f39770g;
                    boolean z14 = l14 != null;
                    double d17 = j8;
                    double d18 = d16 / d17;
                    double d19 = d16 / (bVar3.d() ? 1000.0d : 1609.344d);
                    double d24 = d16 / (com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g() ? 1000.0d : 1609.344d);
                    int i16 = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g() ? 149 : PsExtractor.VIDEO_STREAM_MASK;
                    int i17 = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g() ? 2237 : DateTimeConstants.SECONDS_PER_HOUR;
                    int iB = d24 == 0.0d ? 0 : MathKt.b(d17 / d24);
                    t41.f.a aVar4 = t41.f.f162282c;
                    aVar4.getClass();
                    if (t41.f.a.b(d16) != t41.f.OTHER) {
                        aVar4.getClass();
                        strO = context.getString(t41.f.a.b(d16).f162290a);
                        d14 = d16;
                        bVar = bVar3;
                        d15 = d18;
                    } else {
                        l3.a aVar5 = l3.f23124b;
                        bVar = bVar3;
                        double d25 = bVar.f39770g;
                        m3 m3Var = bVar.d() ? m3.KILOMETER : m3.MILE;
                        DecimalFormat decimalFormat = l3.f23125c;
                        aVar5.getClass();
                        d14 = d16;
                        d15 = d18;
                        strO = l3.a.O(context, d25, m3Var, decimalFormat, true);
                    }
                    strO.getClass();
                    l3.a aVar6 = l3.f23124b;
                    aVar6.getClass();
                    String strB1 = l3.a.b1(j8 * 1000);
                    String strD = hVar2.d(j8, true);
                    String strZ0 = aVar6.z0(new l22.a(context), l3.a.p(d15, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g()), com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g(), true, null);
                    j51.a aVar7 = j51.a.f97057a;
                    boolean zG = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g();
                    aVar7.getClass();
                    String strC = j51.a.c(context, iB, zG);
                    String string = bVar.f() ? context.getString(R.string.lbl_minute_per_km_without_period) : context.getString(R.string.lbl_minute_per_mile_without_period);
                    string.getClass();
                    double d26 = bVar.f() ? 1000.0d : 1609.344d;
                    ArrayList arrayList = new ArrayList(y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (true) {
                        float fFloatValue = 0.0f;
                        if (!it.hasNext()) {
                            break;
                        }
                        PaceBandSplitDTO paceBandSplitDTO = (PaceBandSplitDTO) it.next();
                        Float splitTime = paceBandSplitDTO.getSplitTime();
                        if (splitTime != null) {
                            fFloatValue = splitTime.floatValue();
                        }
                        double d27 = d26;
                        arrayList.add(Integer.valueOf(MathKt.b(((double) fFloatValue) / (((double) ((float) paceBandSplitDTO.getSplitDistance())) / d27))));
                        context = context;
                        d26 = d27;
                    }
                    Context context2 = context;
                    Integer num = (Integer) h0.t0(arrayList);
                    float fIntValue = num != null ? num.intValue() : 60.0f;
                    Integer num2 = (Integer) h0.o0(arrayList);
                    float fIntValue2 = num2 != null ? num2.intValue() : 3600.0f;
                    l3.a aVar8 = l3.f23124b;
                    String str = string;
                    int i18 = iB;
                    int i19 = 10;
                    String strY0 = l3.a.y0(aVar8, context2, fIntValue, bVar.f(), false);
                    String strY1 = l3.a.y0(aVar8, context2, fIntValue2, bVar.f(), false);
                    Context context3 = context2;
                    t41.i iVar = bVar.f39768e;
                    if (iVar == null) {
                        iVar = t41.i.EVERY_KM;
                    }
                    t41.i iVar2 = iVar;
                    o51.i iVarA = k51.a.a(context3, hVar2, iVar2.b(), list, bVar.f());
                    int i24 = t41.i.c.f162323a[iVar2.ordinal()];
                    if (i24 == 1 || i24 == 2) {
                        listC0 = h0.C0(x.k(t41.h.f162301d, t41.h.f162302e, t41.h.f162303f, t41.h.f162306i), z14 ? w.c(t41.h.f162309l) : j0.f134944a);
                    } else {
                        if (i24 != 3) {
                            u0.r();
                            return null;
                        }
                        listC0 = x.k(t41.h.f162301d, t41.h.f162302e, t41.h.f162304g, t41.h.f162305h, t41.h.f162308k, t41.h.f162309l);
                    }
                    o51.i iVarA2 = k51.a.a(context3, hVar2, listC0, list, bVar.f());
                    List<t41.h> listB = iVar2.b();
                    boolean zF = bVar.f();
                    i53.c cVarE = i53.a.e(listB);
                    ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                    Iterator<T> it3 = list.iterator();
                    int i25 = 0;
                    while (it3.hasNext()) {
                        T next = it3.next();
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            x.q();
                            throw null;
                        }
                        PaceBandSplitDTO paceBandSplitDTO2 = (PaceBandSplitDTO) next;
                        oi0.h hVar3 = hVar2;
                        Context context4 = context3;
                        ArrayList arrayList3 = new ArrayList(y.r(listB, i19));
                        for (t41.h hVar4 : listB) {
                            k51.a.f102935a.getClass();
                            i53.c cVar = cVarE;
                            oi0.h hVar5 = hVar3;
                            List<t41.h> list2 = listB;
                            ArrayList arrayList4 = arrayList2;
                            Context context5 = context4;
                            Iterator<T> it4 = it3;
                            h hVarB = k51.a.b(context5, hVar5, zF, hVar4, paceBandSplitDTO2, i25);
                            PaceBandSplitDTO paceBandSplitDTO3 = paceBandSplitDTO2;
                            if (hVar4 == t41.h.f162303f) {
                                double splitDistance = paceBandSplitDTO3.getSplitDistance() / (zF ? 1000.0d : 1609.344d);
                                Float splitTime2 = paceBandSplitDTO3.getSplitTime();
                                double d28 = MathKt.d((splitTime2 != null ? MathKt.d(splitTime2.floatValue()) : 0L) / splitDistance);
                                String str2 = hVarB.f129266a;
                                String str3 = hVarB.f129267b;
                                str2.getClass();
                                str3.getClass();
                                hVarB = new h(str2, str3, d28);
                            }
                            arrayList3.add(hVarB);
                            arrayList2 = arrayList4;
                            listB = list2;
                            it3 = it4;
                            paceBandSplitDTO2 = paceBandSplitDTO3;
                            i25 = i25;
                            i16 = i16;
                            context4 = context5;
                            hVar3 = hVar5;
                            cVarE = cVar;
                        }
                        context3 = context4;
                        arrayList2.add(i53.a.e(arrayList3));
                        hVar2 = hVar3;
                        i25 = i26;
                        listB = listB;
                        cVarE = cVarE;
                        i19 = 10;
                    }
                    List<t41.h> list3 = listB;
                    int i27 = i16;
                    i53.c cVar2 = cVarE;
                    oi0.h hVar6 = hVar2;
                    i53.c cVarE2 = i53.a.e(arrayList2);
                    ArrayList arrayList5 = new ArrayList();
                    for (Iterator<T> it5 = list3.iterator(); it5.hasNext(); it5 = it5) {
                        t41.h hVar7 = (t41.h) it5.next();
                        k51.a.f102935a.getClass();
                        switch (k51.a.C1975a.f102936a[hVar7.ordinal()]) {
                            case 1:
                                String string2 = context3.getString(R.string.lbl_totals);
                                string2.getClass();
                                hVar = new h(string2, null, 0.0d, 6, null);
                                break;
                            case 2:
                            case 3:
                                j51.a.f97057a.getClass();
                                String strA = j51.a.a(d14, context3, zF);
                                hVar = new h(strA, oi0.c.A(context3, new jy0.b(20), strA), d14);
                                break;
                            case 4:
                            case 5:
                                long j14 = (long) (d17 / (d14 / (zF ? 1000.0d : 1609.344d)));
                                j51.a.f97057a.getClass();
                                hVar = new h(j51.a.b(context3, j14, zF), j51.a.c(context3, j14, zF), j14);
                                break;
                            case 6:
                                l3.f23124b.getClass();
                                hVar = new h(l3.a.b1(j8 * 1000), hVar6.d(j8, true), j8);
                                break;
                            default:
                                hVar = null;
                                break;
                        }
                        if (hVar != null) {
                            arrayList5.add(hVar);
                        }
                        bVar = bVar;
                    }
                    o51.i iVar3 = new o51.i(cVar2, cVarE2, i53.a.e(arrayList5));
                    Long l15 = bVar.f39764a;
                    Long l16 = bVar.f39766c;
                    String str4 = bVar.f39765b;
                    Double d29 = bVar.f39772i;
                    float fDoubleValue = d29 != null ? (float) d29.doubleValue() : 0.0f;
                    Double d34 = bVar.f39771h;
                    float fDoubleValue2 = d34 != null ? (float) d34.doubleValue() : 0.0f;
                    Float f14 = bVar.f39780q;
                    float fFloatValue2 = 3000.0f - (f14 != null ? f14.floatValue() : 1700.0f);
                    t41.f.f162282c.getClass();
                    t41.f fVarB = t41.f.a.b(d14);
                    n02.g gVar = bVar.d() ? n02.g.KILOMETERS : n02.g.MILES;
                    boolean zG2 = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.g();
                    boolean zF2 = bVar.f();
                    int i28 = (int) (((double) i27) * d24);
                    int i29 = (int) (((double) i17) * d24);
                    int i30 = (int) j8;
                    String string3 = context3.getString(R.string.string_space_string_bracket_pattern, context3.getString(R.string.pacepro_title), str);
                    string3.getClass();
                    List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list4 = bVar2.f168617i;
                    ArrayList arrayList6 = new ArrayList(y.r(list4, 10));
                    Iterator<T> it6 = list4.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(k51.b.a((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) it6.next(), context3));
                    }
                    f fVar = new f(l15, l16, str4, fDoubleValue, fDoubleValue2, fFloatValue2, fVarB, d19, gVar, strO, zG2, zF2, i28, i29, i30, strB1, strD, i27, i17, i18, strZ0, strC, iVar2, string3, strY0, strY1, iVarA, iVarA2, iVar3, i53.a.e(arrayList6), bVar.f39778o, bVar2.f168614f, bVar2.f168615g, bVar2.f168616h, bVar2.f168620l, bVar2.f168621m);
                    C2575a c2575a2 = c2575a;
                    c2575a2.f136147b = 1;
                    if (this.f136144a.emit(fVar, c2575a2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public C2574b(r53.i iVar, b bVar) {
            this.f136142a = iVar;
            this.f136143b = bVar;
        }

        @Override // r53.i
        public final Object collect(j<? super f> jVar, t13.d dVar) {
            Object objCollect = this.f136142a.collect(new a(jVar, this.f136143b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.presentation.viewmodel.PaceProDetailsViewModel$triggerEffect$1", f = "PaceProDetailsViewModel.kt", l = {227}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w41.b f136150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f136151c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w41.b bVar, b bVar2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f136150b = bVar;
            this.f136151c = bVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f136150b, this.f136151c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u41.b value;
            u41.b bVar;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136149a;
            if (i14 == 0) {
                r.b(obj);
                w41.b bVar2 = this.f136150b;
                boolean z14 = bVar2 instanceof w41.b.f;
                b bVar3 = this.f136151c;
                if (z14) {
                    com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVarX4 = bVar3.x4(((w41.b.f) bVar2).f181981a);
                    if (bVarX4 == null) {
                        bVarX4 = ((u41.b) bVar3.f136128e.getValue()).f168609a.f39760b;
                    }
                    b0 b0Var = bVar3.f136132i;
                    b0Var.getClass();
                    bVarX4.getClass();
                    p2 p2Var = b0Var.f175574d;
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, bVarX4));
                } else if ((bVar2 instanceof w41.b.d) && ((w41.b.d) bVar2).f181979a.equals(n51.b.c.INSTANCE)) {
                    z1<u41.b> z1Var = bVar3.f136131h.f175605c;
                    do {
                        value = z1Var.getValue();
                        bVar = value;
                    } while (!z1Var.b(value, u41.b.a(bVar, null, null, null, 0, 0, null, null, null, null, bVar.f168609a.f39759a, null, false, false, false, 15871)));
                }
                q53.b bVar4 = bVar3.f136129f;
                this.f136149a = 1;
                if (bVar4.h(bVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public b(Context context, u41.a aVar, r41.a aVar2, d60.b bVar, s41.a aVar3, l lVar, f12.b bVar2, s sVar) {
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        aVar3.getClass();
        lVar.getClass();
        bVar2.getClass();
        sVar.getClass();
        this.f136124a = context;
        this.f136125b = aVar;
        this.f136126c = aVar3;
        PaceProAlgorithm paceProAlgorithm = new PaceProAlgorithm();
        p2 p2VarA = q2.a(null);
        this.f136127d = p2VarA;
        p2 p2VarA2 = q2.a(new u41.b(null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16383, null));
        this.f136128e = p2VarA2;
        q53.b bVarA = q53.l.a(Integer.MAX_VALUE, 6, null);
        this.f136129f = bVarA;
        t tVar = new t(paceProAlgorithm, p2VarA2, p2VarA);
        v41.b bVar3 = new v41.b(paceProAlgorithm, p2VarA2, p2VarA);
        q qVar = new q(context, p2VarA2, p2VarA, sVar, lVar);
        this.f136130g = qVar;
        this.f136131h = new g0(context, lVar.y(), v1.a(this), p2VarA2);
        v41.s sVar2 = new v41.s(p2VarA2, v1.a(this), bVar3, tVar, qVar, new o(context, p2VarA2, p2VarA, lVar));
        this.f136132i = new b0(v1.a(this), aVar2, aVar3);
        this.f136133j = new z(v1.a(this), bVar2, aVar2, new z20.j(bVar), p2VarA2, p2VarA);
        this.f136134k = new v41.d(v1.a(this), aVar2, p2VarA2);
        this.f136135l = new v41.e(context, p2VarA2);
        this.f136136m = new m(context, lVar.y(), v1.a(this), paceProAlgorithm, p2VarA2, p2VarA, bVar2.getUserProfilePk(), aVar2, bVar, aVar3, sVar2);
        this.f136137n = r53.s.K(new C2574b(p2VarA2, this), v1.a(this), k2.a.a(k2.f150703a, 2), new f(null, null, null, 0.0f, 0.0f, 0.0f, null, 0.0d, null, null, false, false, 0, 0, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, false, -1, 15, null));
        this.f136138o = r53.s.F(bVarA);
        ge1.b.T(v1.a(this), x53.b.f189152a, null, new a(null), 2);
        z4();
    }

    public final void A4(w41.b bVar) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new c(bVar, this, null), 2);
    }

    public final com.garmin.android.apps.connectmobile.pacepro.data.dto.b x4(long j8) {
        Object next;
        Iterator<T> it = ((u41.b) this.f136128e.getValue()).f168617i.iterator();
        while (it.hasNext()) {
            next = it.next();
            Long l14 = ((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) next).f39764a;
            if (l14 != null && l14.longValue() == j8) {
                return (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) next;
            }
        }
        next = null;
        return (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) next;
    }

    public final void y4(w41.a aVar) {
        u41.b value;
        u41.b bVar;
        Object value2;
        u41.b value3;
        u41.b bVar2;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar3;
        String string;
        u41.b value4;
        u41.b bVar4;
        o51.e eVar;
        u41.b value5;
        u41.b bVar5;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar3;
        aVar.getClass();
        if (aVar instanceof w41.a.j) {
            z4();
            return;
        }
        boolean z14 = aVar instanceof w41.a.C3387a;
        p2 p2Var = this.f136128e;
        g0 g0Var = this.f136131h;
        if (z14) {
            if ((((u41.b) p2Var.getValue()).f168622n || ((u41.b) p2Var.getValue()).f168609a.f39760b.f39764a == null) && !((u41.b) p2Var.getValue()).f168621m) {
                A4(w41.b.g.f181982a);
                return;
            } else {
                A4(new w41.b.a(g0Var.b()));
                return;
            }
        }
        if (aVar instanceof w41.a.m) {
            A4(((w41.a.m) aVar).f181959a);
            return;
        }
        final int i14 = 0;
        final int i15 = 1;
        if (aVar instanceof w41.a.u) {
            String str = ((w41.a.u) aVar).f181969a;
            g0Var.getClass();
            z1<u41.b> z1Var = g0Var.f175605c;
            do {
                value5 = z1Var.getValue();
                bVar5 = value5;
                aVar3 = bVar5.f168609a;
            } while (!z1Var.b(value5, u41.b.a(bVar5, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar3, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar3.f39760b, d53.w.J(str) ? g0Var.f175606d : str, null, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 262141), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, bVar5.f168622n || !p005kotlin.jvm.internal.s.g(bVar5.f168609a.f39760b.f39765b, str), 8190)));
            return;
        }
        final int i16 = 2;
        if (aVar instanceof w41.a.o) {
            w41.a.o oVar = (w41.a.o) aVar;
            t41.f fVar = oVar.f181961a;
            double d14 = oVar.f181962b;
            n02.g gVar = oVar.f181963c;
            g0Var.getClass();
            o53.b0 b0Var = g0Var.f175604b;
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, x53.b.f189152a, null, new d0(fVar, g0Var, gVar, d14, null), 2);
            return;
        }
        if (aVar instanceof w41.a.r) {
            g0Var.a(((w41.a.r) aVar).f181966a);
            return;
        }
        if (aVar instanceof w41.a.q) {
            long j8 = ((w41.a.q) aVar).f181965a;
            o53.b0 b0Var2 = g0Var.f175604b;
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(b0Var2, x53.b.f189152a, null, new f0(g0Var, j8, null), 2);
            return;
        }
        if (aVar instanceof w41.a.x) {
            t41.i iVar = ((w41.a.x) aVar).f181974a;
            g0Var.getClass();
            o53.b0 b0Var3 = g0Var.f175604b;
            x53.c cVar3 = s0.f129406a;
            ge1.b.T(b0Var3, x53.b.f189152a, null, new i0(g0Var, iVar, null), 2);
            return;
        }
        if (aVar instanceof w41.a.v) {
            float f14 = ((w41.a.v) aVar).f181970a;
            o53.b0 b0Var4 = g0Var.f175604b;
            x53.c cVar4 = s0.f129406a;
            ge1.b.T(b0Var4, x53.b.f189152a, null, new v41.h0(f14, g0Var, null), 2);
            return;
        }
        if (aVar instanceof w41.a.y) {
            float f15 = ((w41.a.y) aVar).f181975a;
            o53.b0 b0Var5 = g0Var.f175604b;
            x53.c cVar5 = s0.f129406a;
            ge1.b.T(b0Var5, x53.b.f189152a, null, new v41.j0(f15, g0Var, null), 2);
            return;
        }
        if (aVar instanceof w41.a.p) {
            float f16 = ((w41.a.p) aVar).f181964a;
            o53.b0 b0Var6 = g0Var.f175604b;
            x53.c cVar6 = s0.f129406a;
            ge1.b.T(b0Var6, x53.b.f189152a, null, new e0(f16, g0Var, null), 2);
            return;
        }
        boolean z15 = aVar instanceof w41.a.t;
        q qVar = this.f136130g;
        if (z15) {
            int i17 = ((w41.a.t) aVar).f181968a;
            z1<u41.b> z1Var2 = qVar.f175651b;
            do {
                value4 = z1Var2.getValue();
                bVar4 = value4;
                eVar = bVar4.f168614f;
            } while (!z1Var2.b(value4, u41.b.a(bVar4, null, null, null, 0, 0, eVar != null ? o51.e.a(eVar, null, i17, false, 253) : null, null, null, null, null, null, false, false, false, 16351)));
            qVar.f175654e.f1(i17);
            return;
        }
        if (aVar instanceof w41.a.s) {
            qVar.d(((w41.a.s) aVar).f181967a);
            return;
        }
        if (aVar instanceof w41.a.n) {
            qVar.c(((w41.a.n) aVar).f181960a);
            return;
        }
        if (aVar instanceof w41.a.c) {
            o53.b0 b0Var7 = g0Var.f175604b;
            x53.c cVar7 = s0.f129406a;
            ge1.b.T(b0Var7, x53.b.f189152a, null, new c0(g0Var, null), 2);
            return;
        }
        boolean z16 = aVar instanceof w41.a.k;
        z zVar = this.f136133j;
        if (z16) {
            if (((w41.a.k) aVar).f181957a && ((u41.b) p2Var.getValue()).f168619k != null) {
                A4(w41.b.h.f181983a);
                return;
            }
            e23.a aVar4 = new e23.a(this) { // from class: p51.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f136123b;

                {
                    this.f136123b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            this.f136123b.A4(new w41.b.a(true));
                            break;
                        case 1:
                            b bVar6 = this.f136123b;
                            String string2 = bVar6.f136124a.getString(R.string.txt_error_occurred);
                            string2.getClass();
                            bVar6.A4(new w41.b.j(string2));
                            break;
                        case 2:
                            ht.a aVar5 = ht.a.f85464a;
                            b bVar7 = this.f136123b;
                            String str2 = ((f) bVar7.f136137n.f150540a.getValue()).f129237b != null ? "PaceProCreateFromCourse" : "PaceProCreateByDistance";
                            aVar5.getClass();
                            ht.a.a(null, str2);
                            bVar7.A4(new w41.b.a(true));
                            break;
                        case 3:
                            b bVar8 = this.f136123b;
                            String string3 = bVar8.f136124a.getString(R.string.txt_error_occurred);
                            string3.getClass();
                            bVar8.A4(new w41.b.j(string3));
                            break;
                        case 4:
                            this.f136123b.A4(w41.b.i.f181984a);
                            break;
                        default:
                            b bVar9 = this.f136123b;
                            String string4 = bVar9.f136124a.getString(R.string.txt_error_occurred);
                            string4.getClass();
                            bVar9.A4(new w41.b.j(string4));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            final int i18 = 3;
            e23.a aVar5 = new e23.a(this) { // from class: p51.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f136123b;

                {
                    this.f136123b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i18) {
                        case 0:
                            this.f136123b.A4(new w41.b.a(true));
                            break;
                        case 1:
                            b bVar6 = this.f136123b;
                            String string2 = bVar6.f136124a.getString(R.string.txt_error_occurred);
                            string2.getClass();
                            bVar6.A4(new w41.b.j(string2));
                            break;
                        case 2:
                            ht.a aVar6 = ht.a.f85464a;
                            b bVar7 = this.f136123b;
                            String str2 = ((f) bVar7.f136137n.f150540a.getValue()).f129237b != null ? "PaceProCreateFromCourse" : "PaceProCreateByDistance";
                            aVar6.getClass();
                            ht.a.a(null, str2);
                            bVar7.A4(new w41.b.a(true));
                            break;
                        case 3:
                            b bVar8 = this.f136123b;
                            String string3 = bVar8.f136124a.getString(R.string.txt_error_occurred);
                            string3.getClass();
                            bVar8.A4(new w41.b.j(string3));
                            break;
                        case 4:
                            this.f136123b.A4(w41.b.i.f181984a);
                            break;
                        default:
                            b bVar9 = this.f136123b;
                            String string4 = bVar9.f136124a.getString(R.string.txt_error_occurred);
                            string4.getClass();
                            bVar9.A4(new w41.b.j(string4));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            o53.b0 b0Var8 = zVar.f175688a;
            x53.c cVar8 = s0.f129406a;
            ge1.b.T(b0Var8, x53.b.f189152a, null, new v41.y(zVar, aVar5, aVar4, null), 2);
            return;
        }
        if (aVar instanceof w41.a.b) {
            e23.a aVar6 = new e23.a(this) { // from class: p51.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f136123b;

                {
                    this.f136123b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            this.f136123b.A4(new w41.b.a(true));
                            break;
                        case 1:
                            b bVar6 = this.f136123b;
                            String string2 = bVar6.f136124a.getString(R.string.txt_error_occurred);
                            string2.getClass();
                            bVar6.A4(new w41.b.j(string2));
                            break;
                        case 2:
                            ht.a aVar7 = ht.a.f85464a;
                            b bVar7 = this.f136123b;
                            String str2 = ((f) bVar7.f136137n.f150540a.getValue()).f129237b != null ? "PaceProCreateFromCourse" : "PaceProCreateByDistance";
                            aVar7.getClass();
                            ht.a.a(null, str2);
                            bVar7.A4(new w41.b.a(true));
                            break;
                        case 3:
                            b bVar8 = this.f136123b;
                            String string3 = bVar8.f136124a.getString(R.string.txt_error_occurred);
                            string3.getClass();
                            bVar8.A4(new w41.b.j(string3));
                            break;
                        case 4:
                            this.f136123b.A4(w41.b.i.f181984a);
                            break;
                        default:
                            b bVar9 = this.f136123b;
                            String string4 = bVar9.f136124a.getString(R.string.txt_error_occurred);
                            string4.getClass();
                            bVar9.A4(new w41.b.j(string4));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            e23.a aVar7 = new e23.a(this) { // from class: p51.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f136123b;

                {
                    this.f136123b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            this.f136123b.A4(new w41.b.a(true));
                            break;
                        case 1:
                            b bVar6 = this.f136123b;
                            String string2 = bVar6.f136124a.getString(R.string.txt_error_occurred);
                            string2.getClass();
                            bVar6.A4(new w41.b.j(string2));
                            break;
                        case 2:
                            ht.a aVar8 = ht.a.f85464a;
                            b bVar7 = this.f136123b;
                            String str2 = ((f) bVar7.f136137n.f150540a.getValue()).f129237b != null ? "PaceProCreateFromCourse" : "PaceProCreateByDistance";
                            aVar8.getClass();
                            ht.a.a(null, str2);
                            bVar7.A4(new w41.b.a(true));
                            break;
                        case 3:
                            b bVar8 = this.f136123b;
                            String string3 = bVar8.f136124a.getString(R.string.txt_error_occurred);
                            string3.getClass();
                            bVar8.A4(new w41.b.j(string3));
                            break;
                        case 4:
                            this.f136123b.A4(w41.b.i.f181984a);
                            break;
                        default:
                            b bVar9 = this.f136123b;
                            String string4 = bVar9.f136124a.getString(R.string.txt_error_occurred);
                            string4.getClass();
                            bVar9.A4(new w41.b.j(string4));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            v41.d dVar = this.f136134k;
            dVar.getClass();
            o53.b0 b0Var9 = dVar.f175584a;
            x53.c cVar9 = s0.f129406a;
            ge1.b.T(b0Var9, x53.b.f189152a, null, new v41.c(dVar, aVar6, aVar7, null), 2);
            return;
        }
        if (aVar instanceof w41.a.e) {
            v41.e eVar2 = this.f136135l;
            z1<u41.b> z1Var3 = eVar2.f175592b;
            do {
                value3 = z1Var3.getValue();
                bVar2 = value3;
                aVar2 = bVar2.f168609a;
                bVar3 = aVar2.f39760b;
                string = eVar2.f175591a.getString(R.string.workout_duplicate_default_format, bVar3.f39765b);
                string.getClass();
            } while (!z1Var3.b(value3, u41.b.a(bVar2, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar2, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar3, string, null, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 262140), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382)));
            return;
        }
        boolean z17 = aVar instanceof w41.a.l;
        Context context = this.f136124a;
        b0 b0Var10 = this.f136132i;
        if (z17) {
            b0Var10.getClass();
            context.getClass();
            o53.b0 b0Var11 = b0Var10.f175571a;
            x53.c cVar10 = s0.f129406a;
            ge1.b.T(b0Var11, x53.b.f189152a, null, new a0(b0Var10, context, null), 2);
            return;
        }
        if (aVar instanceof w41.a.d) {
            p2 p2Var2 = b0Var10.f175575e;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, new g(false, false, false, null, 15, null)));
            return;
        }
        if (aVar instanceof w41.a.w) {
            w41.a.w wVar = (w41.a.w) aVar;
            int i19 = wVar.f181972b;
            double d15 = wVar.f181973c;
            z1<u41.b> z1Var4 = g0Var.f175605c;
            double d16 = z1Var4.getValue().f168609a.f39760b.f() ? 1000.0d : 1609.344d;
            ArrayList arrayListD1 = h0.d1(z1Var4.getValue().f168609a.f39759a);
            double splitDistance = ((PaceBandSplitDTO) arrayListD1.get(i19)).getSplitDistance() / d16;
            double splitDistance2 = ((PaceBandSplitDTO) arrayListD1.get(i19)).getSplitDistance();
            Float splitTime = ((PaceBandSplitDTO) arrayListD1.get(i19)).getSplitTime();
            double dFloatValue = splitTime != null ? splitTime.floatValue() : 1.0d;
            PaceBandSplitDTO paceBandSplitDTO = (PaceBandSplitDTO) arrayListD1.get(i19);
            arrayListD1.set(i19, paceBandSplitDTO.copy((2003 & 1) != 0 ? paceBandSplitDTO.paceBandSplitPk : null, (2003 & 2) != 0 ? paceBandSplitDTO.paceBandPk : null, (2003 & 4) != 0 ? paceBandSplitDTO.cumulativeDistanceFromStart : 0.0d, (2003 & 8) != 0 ? paceBandSplitDTO.cumulativeTimeFromStart : 0.0d, (2003 & 16) != 0 ? paceBandSplitDTO.splitDistance : 0.0d, (2003 & 32) != 0 ? paceBandSplitDTO.splitAvgSpeed : splitDistance2 / dFloatValue, (2003 & 64) != 0 ? paceBandSplitDTO.bearing : null, (2003 & 128) != 0 ? paceBandSplitDTO.startPoint : null, (2003 & 256) != 0 ? paceBandSplitDTO.endPoint : null, (2003 & 512) != 0 ? paceBandSplitDTO.splitTime : Float.valueOf(oe2.f.V((float) (d15 * splitDistance))), (2003 & 1024) != 0 ? paceBandSplitDTO.elevationChange : null));
            double dFloatValue2 = 0.0d;
            for (Object obj : arrayListD1) {
                int i24 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                PaceBandSplitDTO paceBandSplitDTO2 = (PaceBandSplitDTO) obj;
                Float splitTime2 = paceBandSplitDTO2.getSplitTime();
                dFloatValue2 += (double) (splitTime2 != null ? splitTime2.floatValue() : 0.0f);
                arrayListD1.set(i14, paceBandSplitDTO2.copy((2003 & 1) != 0 ? paceBandSplitDTO2.paceBandSplitPk : null, (2003 & 2) != 0 ? paceBandSplitDTO2.paceBandPk : null, (2003 & 4) != 0 ? paceBandSplitDTO2.cumulativeDistanceFromStart : 0.0d, (2003 & 8) != 0 ? paceBandSplitDTO2.cumulativeTimeFromStart : oe2.f.U(dFloatValue2), (2003 & 16) != 0 ? paceBandSplitDTO2.splitDistance : 0.0d, (2003 & 32) != 0 ? paceBandSplitDTO2.splitAvgSpeed : 0.0d, (2003 & 64) != 0 ? paceBandSplitDTO2.bearing : null, (2003 & 128) != 0 ? paceBandSplitDTO2.startPoint : null, (2003 & 256) != 0 ? paceBandSplitDTO2.endPoint : null, (2003 & 512) != 0 ? paceBandSplitDTO2.splitTime : null, (2003 & 1024) != 0 ? paceBandSplitDTO2.elevationChange : null));
                i14 = i24;
            }
            do {
                value = z1Var4.getValue();
                bVar = value;
            } while (!z1Var4.b(value, u41.b.a(bVar, new com.garmin.android.apps.connectmobile.pacepro.data.dto.a(arrayListD1, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar.f168609a.f39760b, null, null, null, null, 0.0d, null, null, MathKt.d(((PaceBandSplitDTO) h0.m0(arrayListD1)).getCumulativeTimeFromStart()), ((double) ((float) ((PaceBandSplitDTO) h0.m0(arrayListD1)).getCumulativeDistanceFromStart())) / ((PaceBandSplitDTO) h0.m0(arrayListD1)).getCumulativeTimeFromStart(), true, null, null, null, 244223)), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382)));
            return;
        }
        if (aVar instanceof w41.a.g) {
            if (g0Var.b()) {
                Long l14 = g0Var.f175605c.getValue().f168609a.f39760b.f39764a;
                if ((l14 != null ? l14.longValue() : -1L) > 0) {
                    final int i25 = 4;
                    e23.a aVar8 = new e23.a(this) { // from class: p51.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f136123b;

                        {
                            this.f136123b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    this.f136123b.A4(new w41.b.a(true));
                                    break;
                                case 1:
                                    b bVar6 = this.f136123b;
                                    String string2 = bVar6.f136124a.getString(R.string.txt_error_occurred);
                                    string2.getClass();
                                    bVar6.A4(new w41.b.j(string2));
                                    break;
                                case 2:
                                    ht.a aVar9 = ht.a.f85464a;
                                    b bVar7 = this.f136123b;
                                    String str2 = ((f) bVar7.f136137n.f150540a.getValue()).f129237b != null ? "PaceProCreateFromCourse" : "PaceProCreateByDistance";
                                    aVar9.getClass();
                                    ht.a.a(null, str2);
                                    bVar7.A4(new w41.b.a(true));
                                    break;
                                case 3:
                                    b bVar8 = this.f136123b;
                                    String string3 = bVar8.f136124a.getString(R.string.txt_error_occurred);
                                    string3.getClass();
                                    bVar8.A4(new w41.b.j(string3));
                                    break;
                                case 4:
                                    this.f136123b.A4(w41.b.i.f181984a);
                                    break;
                                default:
                                    b bVar9 = this.f136123b;
                                    String string4 = bVar9.f136124a.getString(R.string.txt_error_occurred);
                                    string4.getClass();
                                    bVar9.A4(new w41.b.j(string4));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i26 = 5;
                    e23.a aVar9 = new e23.a(this) { // from class: p51.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f136123b;

                        {
                            this.f136123b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    this.f136123b.A4(new w41.b.a(true));
                                    break;
                                case 1:
                                    b bVar6 = this.f136123b;
                                    String string2 = bVar6.f136124a.getString(R.string.txt_error_occurred);
                                    string2.getClass();
                                    bVar6.A4(new w41.b.j(string2));
                                    break;
                                case 2:
                                    ht.a aVar10 = ht.a.f85464a;
                                    b bVar7 = this.f136123b;
                                    String str2 = ((f) bVar7.f136137n.f150540a.getValue()).f129237b != null ? "PaceProCreateFromCourse" : "PaceProCreateByDistance";
                                    aVar10.getClass();
                                    ht.a.a(null, str2);
                                    bVar7.A4(new w41.b.a(true));
                                    break;
                                case 3:
                                    b bVar8 = this.f136123b;
                                    String string3 = bVar8.f136124a.getString(R.string.txt_error_occurred);
                                    string3.getClass();
                                    bVar8.A4(new w41.b.j(string3));
                                    break;
                                case 4:
                                    this.f136123b.A4(w41.b.i.f181984a);
                                    break;
                                default:
                                    b bVar9 = this.f136123b;
                                    String string4 = bVar9.f136124a.getString(R.string.txt_error_occurred);
                                    string4.getClass();
                                    bVar9.A4(new w41.b.j(string4));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o53.b0 b0Var12 = zVar.f175688a;
                    x53.c cVar11 = s0.f129406a;
                    ge1.b.T(b0Var12, x53.b.f189152a, null, new v41.y(zVar, aVar9, aVar8, null), 2);
                    return;
                }
            }
            if (g0Var.b()) {
                A4(w41.b.i.f181984a);
                return;
            }
            return;
        }
        if (aVar instanceof w41.a.f) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar3 = (com.garmin.android.apps.connectmobile.courses.model.e) this.f136127d.getValue();
            if (eVar3 == null) {
                return;
            }
            Intent intentC = this.f136126c.c(context, eVar3, ((u41.b) p2Var.getValue()).f168617i);
            if (intentC != null) {
                A4(new w41.b.C3388b(intentC));
                return;
            }
            return;
        }
        boolean z18 = aVar instanceof w41.a.i;
        m mVar = this.f136136m;
        if (z18) {
            o53.b0 b0Var13 = mVar.f175633b;
            x53.c cVar12 = s0.f129406a;
            ge1.b.T(b0Var13, x53.b.f189152a, null, new v41.l(mVar, null), 2);
        } else {
            if (!(aVar instanceof w41.a.h)) {
                u0.r();
                return;
            }
            o53.b0 b0Var14 = mVar.f175633b;
            x53.c cVar13 = s0.f129406a;
            ge1.b.T(b0Var14, x53.b.f189152a, null, new k(mVar, null), 2);
        }
    }

    public final void z4() {
        m mVar = this.f136136m;
        mVar.getClass();
        u41.a aVar = this.f136125b;
        aVar.getClass();
        o53.b0 b0Var = mVar.f175633b;
        x53.c cVar = s0.f129406a;
        ge1.b.T(b0Var, x53.b.f189152a, null, new v41.h(mVar, aVar, null), 2);
    }
}
