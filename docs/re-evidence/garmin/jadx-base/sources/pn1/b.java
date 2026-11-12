package pn1;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.n9;
import c.q;
import c.w;
import ck0.j;
import com.garmin.android.apps.connectmobile.R;
import d62.o;
import e23.l;
import e23.p;
import et1.g1;
import gl1.y;
import i3.mc;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import km1.a0;
import km1.k;
import km1.v;
import l72.h1;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.naps.NapEditModalKt$NapEditModal$2$1$1", f = "NapEditModal.kt", l = {148}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f138659b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138659b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138659b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f138658a;
            if (i14 == 0) {
                r.b(obj);
                this.f138658a = 1;
                if (this.f138659b.d(this) == aVar) {
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

    /* JADX INFO: renamed from: pn1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.naps.NapEditModalKt$NapEditModal$3$1$1", f = "NapEditModal.kt", l = {162}, m = "invokeSuspend", v = 2)
    public static final class C2622b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f138661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2622b(mc mcVar, t13.d<? super C2622b> dVar) {
            super(2, dVar);
            this.f138661b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2622b(this.f138661b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2622b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f138660a;
            if (i14 == 0) {
                r.b(obj);
                this.f138660a = 1;
                if (this.f138661b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.naps.NapEditModalKt$NapEditModal$3$1$2", f = "NapEditModal.kt", l = {168}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f138663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f138663b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f138663b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f138662a;
            if (i14 == 0) {
                r.b(obj);
                this.f138662a = 1;
                if (this.f138663b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.naps.NapEditModalKt$NapEditModal$5$1$1$1", f = "NapEditModal.kt", l = {253}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f138665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mc mcVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f138665b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f138665b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f138664a;
            if (i14 == 0) {
                r.b(obj);
                this.f138664a = 1;
                if (this.f138665b.d(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:219:0x0518  */
    /* JADX WARN: Code duplicated, block: B:220:0x051d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, v vVar, km1.b bVar, b0 b0Var, mc mcVar, l<? super km1.b, Unit> lVar, m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        b0 b0Var2;
        mc mcVar2;
        o0 o0Var;
        km1.b bVar2;
        km1.b bVar3;
        Context context;
        int i17;
        boolean z16;
        final int i18;
        km1.b bVar4;
        l<? super km1.b, Unit> lVar2;
        boolean z17;
        Object jVar;
        b0 b0Var3;
        p1 p1Var;
        km1.b bVar5 = bVar;
        b0Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1597521449);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            z15 = z14;
        } else if ((i14 & 6) == 0) {
            z15 = z14;
            i16 = (o0VarE.h(z15) ? 4 : 2) | i14;
        } else {
            z15 = z14;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(vVar) : o0VarE.r(vVar) ? 32 : 16;
        }
        int i24 = i15 & 4;
        if (i24 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(bVar5) : o0VarE.r(bVar5) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(b0Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        int i25 = i16;
        if (o0VarE.n(i25 & 1, (74899 & i25) != 74898)) {
            boolean z18 = i19 != 0 ? false : z15;
            if (i24 != 0) {
                bVar5 = null;
            }
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            f fVar = new f(new l22.a(context2));
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context2);
            DateTime dateTimeWithTime = DateTime.parse(vVar.getCalendarDate() + "T00:00:00.00").withTime(LocalTime.now().getHourOfDay(), LocalTime.now().getMinuteOfHour(), 0, 0);
            if (bVar5 == null) {
                long userProfilePK = vVar.getUserProfilePK();
                a0 sleepNeed = vVar.getSleepNeed();
                bVar3 = new km1.b(userProfilePK, sleepNeed != null ? sleepNeed.getDeviceId() : -1L, vVar.getCalendarDate(), null, null, null, null, null, null, null, 1016, null);
            } else {
                bVar3 = bVar5;
            }
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(km1.b.f(bVar3));
                o0VarE.K(objQ);
            }
            final p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(km1.b.d(bVar3));
                o0VarE.K(objQ2);
            }
            final p1 p1Var3 = (p1) objQ2;
            DateTimeZone dateTimeZoneB = ql1.c.b(vVar);
            DateTime dateTime = (DateTime) p1Var2.getF182175a();
            final int offset = (dateTimeZoneB.getOffset(dateTime != null ? dateTime.getMillis() : -1L) / 1000) / 60;
            DateTime dateTime2 = (DateTime) p1Var3.getF182175a();
            int offset2 = (dateTimeZoneB.getOffset(dateTime2 != null ? dateTime2.getMillis() : -1L) / 1000) / 60;
            sn1.a.f160413a.getClass();
            o13.p pVar = new o13.p(sn1.a.c(vVar), sn1.a.b(vVar));
            List<km1.b> listT = vVar.t();
            ArrayList arrayList = listT != null ? new ArrayList(listT) : new ArrayList();
            if (z18 && bVar5 != null) {
                arrayList.remove(bVar5);
            }
            km1.b bVar6 = bVar5;
            boolean zB = o0VarE.B((DateTime) p1Var3.getF182175a()) | o0VarE.B((DateTime) p1Var2.getF182175a());
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                h hVar = h.f138689a;
                o13.p pVar2 = new o13.p((DateTime) p1Var2.getF182175a(), (DateTime) p1Var3.getF182175a());
                hVar.getClass();
                context2.getClass();
                A a14 = pVar2.f128594a;
                DateTime dateTime3 = (DateTime) a14;
                B b14 = pVar2.f128595b;
                DateTime dateTime4 = (DateTime) b14;
                km1.i iVar = new km1.i(0, false, false, null, false, false, 63, null);
                if (dateTime3 == null || dateTime4 == null) {
                    context = context2;
                    offset2 = offset2;
                    i17 = i25;
                    z16 = z18;
                } else {
                    i17 = i25;
                    z16 = z18;
                    b10.c cVar = new b10.c(new l22.a(context2));
                    context = context2;
                    int millis = (int) ((dateTime4.getMillis() - dateTime3.getMillis()) / ((long) 1000));
                    l22.b bVar7 = cVar.f14211a;
                    if (millis < 300) {
                        iVar = km1.i.a(iVar, 0, bVar7.a(R.string.workout_higher_than_valid_value_confirmation, bVar7.getString(R.string.five_minutes)), 39);
                    }
                    if (millis > 10800) {
                        iVar = km1.i.a(iVar, 0, bVar7.a(R.string.workout_lower_than_valid_value_confirmation, bVar7.a(R.string.lbl_plural_more_than_one_hour, "3").concat(".")), 23);
                    }
                }
                if (h.a(dateTime3, pVar) && h.a(dateTime4, pVar)) {
                    iVar = km1.i.a(iVar, R.string.msg_error_start_and_end_nap_times_overlap_with_sleep_window, null, 56);
                } else if (h.a(dateTime3, pVar)) {
                    iVar = km1.i.a(iVar, R.string.msg_error_start_nap_time_overlaps_with_sleep_window, null, 60);
                } else if (h.a(dateTime4, pVar)) {
                    iVar = km1.i.a(iVar, R.string.msg_error_end_nap_time_overlaps_with_sleep_window, null, 58);
                } else if (h.b(dateTime3, arrayList) && h.b(dateTime4, arrayList)) {
                    iVar = km1.i.a(iVar, R.string.msg_error_start_and_end_nap_times_overlap_with_another_nap, null, 56);
                } else {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                km1.b bVar8 = (km1.b) it.next();
                                if (h.a(km1.b.f(bVar8), new o13.p(a14, b14)) && h.a(km1.b.d(bVar8), new o13.p(a14, b14))) {
                                    iVar = km1.i.a(iVar, R.string.msg_error_start_and_end_nap_times_overlap_with_another_nap, null, 56);
                                }
                            }
                        }
                    }
                    if (h.b(dateTime3, arrayList)) {
                        iVar = km1.i.a(iVar, R.string.msg_error_start_nap_time_overlaps_with_another_nap, null, 60);
                    } else {
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (h.a(km1.b.d((km1.b) it3.next()), new o13.p(a14, b14))) {
                                        iVar = km1.i.a(iVar, R.string.msg_error_start_nap_time_overlaps_with_another_nap, null, 60);
                                    }
                                }
                            }
                        }
                        if (h.b(dateTime4, arrayList)) {
                            iVar = km1.i.a(iVar, R.string.msg_error_end_nap_time_overlaps_with_another_nap, null, 58);
                            break;
                        } else if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                if (h.a(km1.b.f((km1.b) it4.next()), new o13.p(a14, b14))) {
                                    iVar = km1.i.a(iVar, R.string.msg_error_end_nap_time_overlaps_with_another_nap, null, 58);
                                    break;
                                }
                            }
                        }
                    }
                }
                objQ3 = p0.n(iVar);
                o0VarE.K(objQ3);
            } else {
                context = context2;
                offset2 = offset2;
                i17 = i25;
                z16 = z18;
            }
            p1 p1Var4 = (p1) objQ3;
            DateTime dateTime5 = (DateTime) p1Var2.getF182175a();
            DateTime dateTime6 = (DateTime) p1Var3.getF182175a();
            int millis2 = (dateTime5 == null || dateTime6 == null) ? 0 : (int) ((dateTime6.getMillis() - dateTime5.getMillis()) / ((long) 1000));
            String strC = millis2 > 0 ? fVar.f138687b.f14213c.c(millis2) : fVar.f138686a.getString(R.string.no_value);
            boolean zB2 = o0VarE.B((DateTime) p1Var2.getF182175a()) | o0VarE.B((DateTime) p1Var3.getF182175a());
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == m.a.f135155b) {
                objQ4 = p0.n(strC);
                o0VarE.K(objQ4);
            }
            p1 p1Var5 = (p1) objQ4;
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
            final int i26 = offset2;
            boolean zR = o0VarE.r(bVar3) | o0VarE.k(millis2) | o0VarE.r(simpleDateFormat) | o0VarE.k(offset) | o0VarE.k(i26);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == m.a.f135155b) {
                i18 = millis2;
                final km1.b bVar9 = bVar3;
                objQ5 = new e23.a() { // from class: pn1.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        Date date;
                        Date date2;
                        DateTime dateTimeMinusMinutes;
                        DateTime dateTimeMinusMinutes2;
                        Integer numValueOf = Integer.valueOf(i18);
                        DateTime dateTime7 = (DateTime) p1Var2.getF182175a();
                        int i27 = offset;
                        if (dateTime7 == null || (dateTimeMinusMinutes2 = dateTime7.minusMinutes(i27)) == null || (date = dateTimeMinusMinutes2.toDate()) == null) {
                            date = new Date();
                        }
                        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
                        String str = simpleDateFormat2.format(date);
                        DateTime dateTime8 = (DateTime) p1Var3.getF182175a();
                        int i28 = i26;
                        if (dateTime8 == null || (dateTimeMinusMinutes = dateTime8.minusMinutes(i28)) == null || (date2 = dateTimeMinusMinutes.toDate()) == null) {
                            date2 = new Date();
                        }
                        return km1.b.b(bVar9, numValueOf, str, simpleDateFormat2.format(date2), Integer.valueOf(k.MANUAL_GC.f105534a), Integer.valueOf(i27), Integer.valueOf(i28));
                    }
                };
                bVar4 = bVar9;
                p1Var2 = p1Var2;
                p1Var3 = p1Var3;
                o0VarE.K(objQ5);
            } else {
                bVar4 = bVar3;
                i18 = millis2;
            }
            e23.a aVar = (e23.a) objQ5;
            g.h hVar2 = new g.h();
            int i27 = i17 & 458752;
            boolean zB3 = o0VarE.B(aVar) | (i27 == 131072);
            Object objQ6 = o0VarE.q();
            if (zB3 || objQ6 == m.a.f135155b) {
                lVar2 = lVar;
                objQ6 = new g1(3, aVar, lVar2);
                o0VarE.K(objQ6);
            } else {
                lVar2 = lVar;
            }
            q qVarC = w.c(hVar2, (l) objQ6, o0VarE, 0);
            Object objQ7 = o0VarE.q();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ7 == c2565a2) {
                objQ7 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ7);
            }
            p1 p1Var6 = (p1) objQ7;
            String strQ = y.Q(o0VarE, z16 ? R.string.lbl_edit_nap : R.string.lbl_add_nap);
            String upperCase = y.Q(o0VarE, R.string.lbl_save).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (z16) {
                h hVar3 = h.f138689a;
                km1.i iVar2 = (km1.i) p1Var4.getF182175a();
                hVar3.getClass();
                iVar2.getClass();
                if (!((iVar2.f105529e || iVar2.f105530f || iVar2.f105526b || iVar2.f105527c) ? false : true) || i18 <= 0 || (s.g(km1.b.f(bVar4), (DateTime) p1Var2.getF182175a()) && s.g(km1.b.d(bVar4), (DateTime) p1Var3.getF182175a()))) {
                    z17 = false;
                } else {
                    z17 = true;
                }
            } else {
                h hVar4 = h.f138689a;
                km1.i iVar3 = (km1.i) p1Var4.getF182175a();
                hVar4.getClass();
                iVar3.getClass();
                if (!((iVar3.f105529e || iVar3.f105530f || iVar3.f105526b || iVar3.f105527c) ? false : true) || i18 <= 0) {
                    z17 = false;
                } else {
                    z17 = true;
                }
            }
            int i28 = i17 & 57344;
            Context context3 = context;
            boolean zR2 = (i28 == 16384) | o0VarE.r(b0Var) | o0VarE.r(context3) | (i27 == 131072) | o0VarE.B(aVar) | o0VarE.r(qVarC);
            Object objQ8 = o0VarE.q();
            if (zR2 || objQ8 == c2565a2) {
                b0Var3 = b0Var;
                jVar = new j(b0Var3, context3, lVar2, aVar, qVarC, mcVar);
                o0VarE.K(jVar);
            } else {
                jVar = objQ8;
                b0Var3 = b0Var;
            }
            e23.a aVar2 = (e23.a) jVar;
            boolean zR3 = ((i17 & 14) == 4) | o0VarE.r(bVar4) | o0VarE.r(b0Var3) | (i28 == 16384);
            Object objQ9 = o0VarE.q();
            if (zR3 || objQ9 == c2565a2) {
                b0 b0Var4 = b0Var3;
                p1Var = p1Var6;
                p006l2.i iVar4 = new p006l2.i(z16, bVar4, b0Var4, p1Var2, p1Var3, p1Var, mcVar);
                b0Var2 = b0Var4;
                o0VarE.K(iVar4);
                objQ9 = iVar4;
            } else {
                b0Var2 = b0Var3;
                p1Var = p1Var6;
            }
            o0Var = o0VarE;
            p1 p1Var7 = p1Var;
            h1.a(strQ, upperCase, mcVar, z17, aVar2, (e23.a) objQ9, z3.f.c(2136384365, new n9(dateTimeWithTime, fVar, zIs24HourFormat, p1Var5, i18, p1Var2, p1Var4, p1Var3), o0VarE), o0Var, ((i17 >> 6) & 896) | 1572864, 0);
            mcVar2 = mcVar;
            c0.e(((Boolean) p1Var7.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(926121729, new ng2.i(b0Var2, 9, mcVar2, p1Var7), o0Var), o0Var, 196608, 30);
            x1 x1Var2 = n.f135158a;
            bVar2 = bVar6;
            z15 = z16;
        } else {
            b0Var2 = b0Var;
            mcVar2 = mcVar;
            o0Var = o0VarE;
            o0Var.e();
            bVar2 = bVar5;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(z15, vVar, bVar2, b0Var2, mcVar2, lVar, i14, i15, 17);
        }
    }
}
