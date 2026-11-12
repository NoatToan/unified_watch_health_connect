package fz1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.m2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.t;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p92.y;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfz1/k;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {
    public static final /* synthetic */ int I = 0;
    public final t A;
    public final y0 B;
    public final t C;
    public final y0 D;
    public final p2 E;
    public final b2 F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m52.c f74003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fg0.k f74004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CalendarItemDTO f74005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fg0.j f74006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f74008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f74009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f74010i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f74012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f74013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f74014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f74015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f74016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f74017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public fy1.d f74018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f74019r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f74020t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public fg0.j f74021v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0.d f74002a = zf0.d.a.a(zf0.d.f204343b);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ng0.a f74011j = ng0.a.LEG_SCREEN_VIEW;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f74022w = o13.m.b(new fy1.h(8));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0 f74023x = z4();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f74024y = o13.m.b(new fy1.h(9));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0 f74025z = y4();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalsViewModel$onNextClicked$1", f = "EventGoalsViewModel.kt", l = {190, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f74026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f74028c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f74030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f74030e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = k.this.new b(this.f74030e, dVar);
            bVar.f74028c = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        
            if (r1 == r2) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
        
            if (r1 == r2) goto L49;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objH;
            Object objI;
            Boolean isShareable;
            b0 b0Var = (b0) this.f74028c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f74027b;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                fg0.k kVarX4 = kVar.x4();
                zf0.d dVar = kVar.f74002a;
                fg0.c eventPrivacy = kVarX4.getEventPrivacy();
                boolean zBooleanValue = (eventPrivacy == null || (isShareable = eventPrivacy.getIsShareable()) == null) ? false : isShareable.booleanValue();
                boolean z14 = this.f74030e;
                if (zBooleanValue) {
                    fg0.j jVarB = kVar.f74006e;
                    if (z14) {
                        if (jVarB == null) {
                            s.m("eventCustomizationDTO");
                            throw null;
                        }
                    } else {
                        if (jVarB == null) {
                            s.m("eventCustomizationDTO");
                            throw null;
                        }
                        jVarB = fg0.j.b(jVarB, null, null, null, null, null, null, 8189);
                    }
                    String strValueOf = String.valueOf(kVar.x4().getShareableEventUuid());
                    this.f74028c = b0Var;
                    this.f74026a = null;
                    this.f74027b = 1;
                    objI = dVar.i(strValueOf, jVarB, this);
                } else {
                    if (!z14) {
                        fg0.k kVarX5 = kVar.x4();
                        fg0.j eventCustomization = kVar.x4().getEventCustomization();
                        kVarX5.E0(eventCustomization != null ? fg0.j.b(eventCustomization, null, null, null, null, null, null, 8189) : null);
                    }
                    Long l14 = kVar.x4().getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (l14 != null) {
                        long jLongValue = l14.longValue();
                        fg0.k kVarX6 = kVar.x4();
                        this.f74028c = b0Var;
                        this.f74026a = kVar;
                        this.f74027b = 2;
                        objH = dVar.h(jLongValue, kVarX6, this);
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objI = obj;
                v2 v2Var = (v2) objI;
                if (v2Var instanceof v2.b) {
                    int i15 = k.I;
                    y0<g3<Boolean>> y0VarY4 = kVar.y4();
                    g3.a aVar2 = g3.f35298f;
                    Boolean bool = Boolean.TRUE;
                    aVar2.getClass();
                    y0VarY4.j(g3.a.d(bool));
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar3 = (v2.a) v2Var;
                    String strValueOf2 = String.valueOf(aVar3.f47383a);
                    y.f136664a.getClass();
                    y.a.c(strValueOf2, "Event Goal save failed");
                    int i16 = k.I;
                    kVar.y4().j(g3.a.a(g3.f35298f, aVar3.f47385c, null, null, null, 14));
                }
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kVar = this.f74026a;
                o13.r.b(obj);
                objH = obj;
                v2 v2Var2 = (v2) objH;
                if (v2Var2 instanceof v2.b) {
                    int i17 = k.I;
                    y0<g3<Boolean>> y0VarY5 = kVar.y4();
                    g3.a aVar4 = g3.f35298f;
                    Boolean bool2 = Boolean.TRUE;
                    aVar4.getClass();
                    y0VarY5.j(g3.a.d(bool2));
                } else {
                    if (!(v2Var2 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar5 = (v2.a) v2Var2;
                    String strValueOf3 = String.valueOf(aVar5.f47383a);
                    y.f136664a.getClass();
                    y.a.c(strValueOf3, "Event Goal save failed");
                    int i18 = k.I;
                    kVar.y4().j(g3.a.a(g3.f35298f, aVar5.f47385c, null, null, null, 14));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalsViewModel$setEventAsNoPriorityEvent$1", f = "EventGoalsViewModel.kt", l = {231}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fg0.k f74031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f74033c;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = k.this.new c(dVar);
            cVar.f74033c = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fg0.k kVar;
            b0 b0Var = (b0) this.f74033c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f74032b;
            k kVar2 = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                cg0.a aVar2 = new cg0.a(kVar2.f74002a);
                fg0.k kVarA = cg0.a.a(kVar2.x4(), dg0.a.NO_PRIORITY, false);
                this.f74033c = b0Var;
                this.f74031a = kVarA;
                this.f74032b = 1;
                obj = aVar2.b(kVarA, this);
                if (obj == aVar) {
                    return aVar;
                }
                kVar = kVarA;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kVar = this.f74031a;
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                kVar2.getClass();
                kVar.getClass();
                kVar2.f74004c = kVar;
                y0 y0Var = (y0) kVar2.A.getValue();
                g3.a aVar3 = g3.f35298f;
                Boolean bool = Boolean.TRUE;
                aVar3.getClass();
                y0Var.m(g3.a.d(bool));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Event Goal save failed ");
                y.f136664a.getClass();
                y.a.c("setSelfAsNoPriority event", strD);
                int i15 = k.I;
                ((y0) kVar2.A.getValue()).m(g3.a.a(g3.f35298f, null, null, Boolean.FALSE, null, 11));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.EventGoalsViewModel$updateEventDetails$1", f = "EventGoalsViewModel.kt", l = {278, 280}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f74036b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = k.this.new d(dVar);
            dVar2.f74036b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        
            if (r14 == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
        
            if (r14 == r1) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f74036b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f74035a;
            v2 v2Var = null;
            k kVar = k.this;
            if (i14 == 0) {
                o13.r.b(obj);
                fg0.k kVarX4 = kVar.x4();
                zf0.d dVar = kVar.f74002a;
                if (s.g(kVarX4.getEventOrganizer(), Boolean.TRUE) && kVar.x4().getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                    Long l14 = kVar.x4().getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    l14.getClass();
                    long jLongValue = l14.longValue();
                    fg0.k kVarX5 = kVar.x4();
                    this.f74036b = b0Var;
                    this.f74035a = 1;
                    dVar.getClass();
                    obj = f0.J(dVar, new zf0.b0(dVar, jLongValue, kVarX5, null), this);
                } else if (kVar.x4().getShareableEventUuid() != null && kVar.x4().getEventCustomization() != null) {
                    String shareableEventUuid = kVar.x4().getShareableEventUuid();
                    shareableEventUuid.getClass();
                    fg0.j eventCustomization = kVar.x4().getEventCustomization();
                    eventCustomization.getClass();
                    this.f74036b = b0Var;
                    this.f74035a = 2;
                    obj = dVar.i(shareableEventUuid, eventCustomization, this);
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                v2Var = (v2) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                v2Var = (v2) obj;
            }
            if (v2Var instanceof v2.b) {
                int i15 = k.I;
                y0<g3<Boolean>> y0VarA4 = kVar.A4();
                g3.a aVar2 = g3.f35298f;
                Boolean bool = Boolean.FALSE;
                aVar2.getClass();
                y0VarA4.j(g3.a.d(bool));
            } else {
                y.f136664a.getClass();
                y.a.c("EventGoalsViewModel", "Failed to update event customization");
                int i16 = k.I;
                kVar.A4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public k() {
        t tVarB = o13.m.b(new fy1.h(10));
        this.A = tVarB;
        this.B = (y0) tVarB.getValue();
        this.C = o13.m.b(new fy1.h(11));
        this.D = A4();
        p2 p2VarA = q2.a(null);
        this.E = p2VarA;
        this.F = r53.s.d(p2VarA);
    }

    public static String I4(Context context, double d14, double d15) {
        context.getClass();
        if (d14 <= 0.0d) {
            return null;
        }
        double d16 = d15 / d14;
        q3 q3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
        l3.f23124b.getClass();
        return l3.a.N0(context, d16, q3Var, l3.f23130h, true, context.getString(R.string.enter_goal_speed));
    }

    public final y0<g3<Boolean>> A4() {
        return (y0) this.C.getValue();
    }

    public final void B4() {
        if (this.f74009h) {
            if (this.f74008g == 0 || !this.f74020t) {
                J4();
                return;
            }
            y0<g3<Boolean>> y0VarA4 = A4();
            g3.a aVar = g3.f35298f;
            Boolean bool = Boolean.TRUE;
            aVar.getClass();
            y0VarA4.m(g3.a.d(bool));
            return;
        }
        fg0.j eventCustomization = x4().getEventCustomization();
        if ((eventCustomization != null ? eventCustomization.getCustomGoal() : null) != null) {
            this.f74007f = !D4();
            fg0.k kVarX4 = x4();
            fg0.j eventCustomization2 = x4().getEventCustomization();
            kVarX4.E0(eventCustomization2 != null ? fg0.j.b(eventCustomization2, null, null, null, null, null, null, 8188) : null);
            fg0.j eventCustomization3 = x4().getEventCustomization();
            if (eventCustomization3 != null) {
                eventCustomization3.F(null);
            }
        } else {
            this.f74007f = false;
        }
        M4();
    }

    public final boolean C4() {
        gg0.f eventType = x4().getEventType();
        return eventType != null && eventType.e();
    }

    public final boolean D4() {
        return this.f74012k || this.f74013l;
    }

    public final boolean E4() {
        return x4().getEventType() == gg0.f.f77136l;
    }

    public final void F4(m52.c cVar, ng0.a aVar) {
        cVar.getClass();
        aVar.getClass();
        this.f74003b = cVar;
        this.f74011j = aVar;
        z4().m("EventLegGoalFragment");
    }

    public final void G4(androidx.fragment.app.m mVar, gz1.a aVar) {
        Boolean isShareable;
        double dDoubleValue;
        Double dValueOf;
        aVar.getClass();
        Double d14 = aVar.f80417j;
        fg0.j eventCustomization = x4().getEventCustomization();
        fg0.j jVar = eventCustomization == null ? new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : eventCustomization;
        fg0.d dVar = new fg0.d(null, null, null, 7, null);
        fg0.d completionTarget = x4().getCompletionTarget();
        gg0.h unitType = completionTarget != null ? completionTarget.getUnitType() : null;
        gg0.h hVar = gg0.h.TIME;
        if (unitType == hVar) {
            if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                lz1.f.a aVar2 = lz1.f.f115404a;
                l3.a aVar3 = l3.f23124b;
                dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                aVar3.getClass();
                aVar2.getClass();
                dValueOf = Double.valueOf(lz1.f.a.o(dDoubleValue / 1000.0d, 2));
            } else {
                lz1.f.a aVar4 = lz1.f.f115404a;
                l3.a aVar5 = l3.f23124b;
                dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                aVar5.getClass();
                aVar4.getClass();
                dValueOf = Double.valueOf(lz1.f.a.o(dDoubleValue / 1609.344d, 2));
            }
            dVar.t(dValueOf);
            dVar.r(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? gg0.i.KILOMETER : gg0.i.MILE);
            dVar.s(gg0.h.DISTANCE);
        } else {
            Double dValueOf2 = aVar.f80415h;
            if (dValueOf2 == null) {
                dValueOf2 = Double.valueOf(0.0d);
            }
            dVar.t(dValueOf2);
            dVar.r(gg0.i.SECOND);
            dVar.s(hVar);
        }
        jVar.F(dVar);
        if (this.f74012k) {
            fy1.c.f73884a.getClass();
            fy1.c.b("GarminCoachTriathlonOverallGoalSelected");
            x4().E0(fg0.j.b(jVar, null, null, null, null, null, null, 8189));
            K4(mVar);
            return;
        }
        fg0.c eventPrivacy = x4().getEventPrivacy();
        if (eventPrivacy != null && (isShareable = eventPrivacy.getIsShareable()) != null) {
            if (isShareable.booleanValue()) {
                this.f74006e = jVar;
            } else {
                x4().E0(jVar);
            }
        }
        H4(false);
    }

    public final void H4(boolean z14) {
        y4().j(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new b(z14, null), 3);
    }

    public final void J4() {
        ((y0) this.A.getValue()).m(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
    }

    public final void K4(Activity activity) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("GCM_extra_sharable_event_dto", x4());
        m2.a(intent, bundle);
        if (activity != null) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    public final void L4(com.garmin.android.apps.connectmobile.workouts.data.model.k kVar, long j8) {
        int transitionOutDurationSeconds;
        Integer num;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH;
        if (kVar == null) {
            y.f136664a.getClass();
            y.a.c("EventGoalsViewModel", "legTarget is null.");
            return;
        }
        fg0.j eventCustomization = x4().getEventCustomization();
        ArrayList arrayList = (eventCustomization == null || (listH = eventCustomization.h()) == null) ? new ArrayList() : new ArrayList(listH);
        fg0.j eventCustomization2 = x4().getEventCustomization();
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVarG = eventCustomization2 != null ? eventCustomization2.g(Integer.valueOf(kVar.getLegIndex())) : null;
        if ((cVarG != null ? cVarG.getTransitionOutDurationSeconds() : null) == null) {
            if (kVar.getEventLegActivityType() == m52.c.RUNNING) {
                num = null;
            } else {
                transitionOutDurationSeconds = 120;
            }
            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar = new com.garmin.android.apps.connectmobile.workouts.data.model.c(kVar.getLegIndex(), gg0.i.SECOND, gg0.h.TIME, Double.valueOf(j8), num);
            p005kotlin.jvm.internal.y0.a(arrayList).remove(cVarG);
            arrayList.add(cVar);
            if (x4().getEventCustomization() == null) {
                x4().E0(new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
            }
            fg0.k kVarX4 = x4();
            fg0.j eventCustomization3 = x4().getEventCustomization();
            kVarX4.E0(eventCustomization3 != null ? fg0.j.b(eventCustomization3, null, arrayList, null, null, null, null, 8189) : null);
            fg0.k kVarX5 = x4();
            mg0.b.e(kVarX5);
            this.f74004c = kVarX5;
        }
        transitionOutDurationSeconds = cVarG.getTransitionOutDurationSeconds();
        num = transitionOutDurationSeconds;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar2 = new com.garmin.android.apps.connectmobile.workouts.data.model.c(kVar.getLegIndex(), gg0.i.SECOND, gg0.h.TIME, Double.valueOf(j8), num);
        p005kotlin.jvm.internal.y0.a(arrayList).remove(cVarG);
        arrayList.add(cVar2);
        if (x4().getEventCustomization() == null) {
            x4().E0(new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        }
        fg0.k kVarX6 = x4();
        fg0.j eventCustomization4 = x4().getEventCustomization();
        kVarX6.E0(eventCustomization4 != null ? fg0.j.b(eventCustomization4, null, arrayList, null, null, null, null, 8189) : null);
        fg0.k kVarX7 = x4();
        mg0.b.e(kVarX7);
        this.f74004c = kVarX7;
    }

    public final void M4() {
        if (this.f74007f) {
            ge1.b.T(v1.a(this), null, null, new d(null), 3);
            return;
        }
        y0<g3<Boolean>> y0VarA4 = A4();
        g3.a aVar = g3.f35298f;
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        y0VarA4.j(g3.a.d(bool));
    }

    public final fg0.k x4() {
        fg0.k kVar = this.f74004c;
        if (kVar != null) {
            return kVar;
        }
        s.m("eventDTO");
        throw null;
    }

    public final y0<g3<Boolean>> y4() {
        return (y0) this.f74024y.getValue();
    }

    public final y0<String> z4() {
        return (y0) this.f74022w.getValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lfz1/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_TRANSITION_TIME", "I", "MAX_GOAL_TIME_ALLOWED", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
