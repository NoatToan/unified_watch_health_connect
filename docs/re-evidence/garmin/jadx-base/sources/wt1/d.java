package wt1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import fg0.v;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o53.b0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import wn1.d0;
import zf0.a0;
import zf0.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwt1/d;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f187033q = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f187038e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f187040g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f187042i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f187044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xw1.c f187045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Long f187046m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public fg0.k f187048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public xw1.n f187049p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f187034a = o13.m.b(new d0(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f187035b = o13.m.b(new d0(7));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f187036c = o13.m.b(new d0(8));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f187037d = o13.m.b(new d0(9));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f187039f = o13.m.b(new d0(10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f187041h = o13.m.b(new d0(11));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o13.t f187043j = o13.m.b(new d0(5));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f187047n = true;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187050a;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.EVENT_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f187050a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel$saveUpdateTrainingPlanDTO$1", f = "RaceEventViewModel.kt", l = {621}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f187051a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xw1.d f187053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r0<xw1.c> f187054d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xw1.d dVar, r0<xw1.c> r0Var, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f187053c = dVar;
            this.f187054d = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(this.f187053c, this.f187054d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f187051a;
            d dVar = d.this;
            if (i14 == 0) {
                o13.r.b(obj);
                gu1.b bVar = (gu1.b) dVar.f187036c.getValue();
                long athletePlanId = this.f187053c.getAthletePlanId();
                xw1.c cVar = this.f187054d.f105810a;
                this.f187051a = 1;
                bVar.getClass();
                obj = f0.J(bVar, new gu1.l(bVar, athletePlanId, cVar, null), this);
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
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                int i15 = d.f187033q;
                dVar.E4().j(rt1.a.d.f154513a);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                int i16 = d.f187033q;
                dVar.E4().j(new rt1.a.C2926a(((v2.a) v2Var).f47385c));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public d() {
        final int i14 = 2;
        this.f187038e = o13.m.b(new e23.a(this) { // from class: wt1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f187032b;

            {
                this.f187032b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                d dVar = this.f187032b;
                switch (i15) {
                    case 0:
                        int i16 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187041h.getValue();
                    case 1:
                        int i17 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187043j.getValue();
                    case 2:
                        int i18 = d.f187033q;
                        return dVar.F4();
                    default:
                        int i19 = d.f187033q;
                        return dVar.E4();
                }
            }
        });
        final int i15 = 3;
        this.f187040g = o13.m.b(new e23.a(this) { // from class: wt1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f187032b;

            {
                this.f187032b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                d dVar = this.f187032b;
                switch (i16) {
                    case 0:
                        int i17 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187041h.getValue();
                    case 1:
                        int i18 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187043j.getValue();
                    case 2:
                        int i19 = d.f187033q;
                        return dVar.F4();
                    default:
                        int i110 = d.f187033q;
                        return dVar.E4();
                }
            }
        });
        final int i16 = 0;
        this.f187042i = o13.m.b(new e23.a(this) { // from class: wt1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f187032b;

            {
                this.f187032b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                d dVar = this.f187032b;
                switch (i17) {
                    case 0:
                        int i18 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187041h.getValue();
                    case 1:
                        int i19 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187043j.getValue();
                    case 2:
                        int i110 = d.f187033q;
                        return dVar.F4();
                    default:
                        int i111 = d.f187033q;
                        return dVar.E4();
                }
            }
        });
        final int i17 = 1;
        this.f187044k = o13.m.b(new e23.a(this) { // from class: wt1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f187032b;

            {
                this.f187032b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                d dVar = this.f187032b;
                switch (i18) {
                    case 0:
                        int i19 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187041h.getValue();
                    case 1:
                        int i110 = d.f187033q;
                        return (androidx.lifecycle.y0) dVar.f187043j.getValue();
                    case 2:
                        int i111 = d.f187033q;
                        return dVar.F4();
                    default:
                        int i112 = d.f187033q;
                        return dVar.E4();
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object A4(d dVar, fg0.k kVar, v13.c cVar) {
        m mVar;
        fg0.k kVar2;
        dVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f187103d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f187103d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar, cVar);
            }
        } else {
            mVar = new m(dVar, cVar);
        }
        Object objJ = mVar.f187101b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f187103d;
        if (i15 == 0) {
            o13.r.b(objJ);
            zf0.d dVarC4 = dVar.C4();
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            l14.getClass();
            long jLongValue = l14.longValue();
            mVar.f187100a = kVar;
            mVar.f187103d = 1;
            dVarC4.getClass();
            objJ = f0.J(dVarC4, new zf0.b0(dVarC4, jLongValue, kVar, null), mVar);
            if (objJ == aVar) {
                return aVar;
            }
            kVar2 = kVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar2 = mVar.f187100a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            dVar.F4().j(new rt1.b.C2927b(kVar2));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            String strI = u0.i(aVar2.f47384b, "handleUpdateEvent: Error updating the eventDTO ", " :: ", aVar2.f47385c);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "RaceEventViewModel", strI);
            dVar.F4().j(new rt1.b.a(null, 1, null));
        }
        return Unit.INSTANCE;
    }

    public static final Object x4(d dVar, Context context, fg0.p pVar, fg0.k kVar, v13.i iVar) {
        dVar.getClass();
        if ((pVar != null ? pVar.getSig() : null) != null) {
            String sig = pVar.getSig();
            sig.getClass();
            Object objI4 = dVar.I4(pVar, sig, iVar);
            return objI4 == u13.a.COROUTINE_SUSPENDED ? objI4 : (g3) objI4;
        }
        if (kVar == null) {
            return null;
        }
        Object objB4 = dVar.B4(context, kVar, iVar);
        return objB4 == u13.a.COROUTINE_SUSPENDED ? objB4 : (g3) objB4;
    }

    public static final Object y4(d dVar, boolean z14, fg0.k kVar, v13.i iVar) {
        fg0.j jVar;
        dVar.getClass();
        if (!z14) {
            if (kVar.p0()) {
                zf0.d dVarC4 = dVar.C4();
                String shareableEventUuid = kVar.getShareableEventUuid();
                shareableEventUuid.getClass();
                dVarC4.getClass();
                return f0.J(dVarC4, new a0(dVarC4, shareableEventUuid, null), iVar);
            }
            zf0.d dVarC5 = dVar.C4();
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            l14.getClass();
            long jLongValue = l14.longValue();
            dVarC5.getClass();
            return f0.J(dVarC5, new zf0.i(dVarC5, jLongValue, null), iVar);
        }
        if (kVar != null) {
            fg0.j eventCustomization = kVar.getEventCustomization();
            if (eventCustomization != null) {
                jVar = fg0.j.b(eventCustomization, null, null, null, null, null, null, 7999);
            } else {
                jVar = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
            }
            kVar.E0(jVar);
        }
        return dVar.J4(kVar, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object z4(d dVar, fg0.k kVar, long j8, v13.c cVar) {
        l lVar;
        fg0.j jVar;
        fg0.d dVar2;
        fg0.k kVar2;
        dVar.getClass();
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f187099d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f187099d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar, cVar);
            }
        } else {
            lVar = new l(dVar, cVar);
        }
        Object obj = lVar.f187097b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f187099d;
        if (i15 == 0) {
            o13.r.b(obj);
            fg0.j eventCustomization = kVar.getEventCustomization();
            if (eventCustomization == null) {
                jVar = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
            } else {
                jVar = eventCustomization;
            }
            jVar.I(Long.valueOf(j8));
            jVar.M(gg0.e.COACH_ATP);
            xw1.c cVar2 = dVar.f187045l;
            if (cVar2 == null || !cVar2.F()) {
                dVar2 = null;
            } else {
                xw1.c cVar3 = dVar.f187045l;
                dVar2 = new fg0.d(cVar3 != null ? Double.valueOf(cVar3.getSelectedPaceGoalTime()) : null, gg0.i.SECOND, gg0.h.TIME);
            }
            jVar.F(dVar2);
            fg0.k kVarD = fg0.k.d(kVar, null, null, null, null, null, null, jVar, -16777217);
            lVar.f187096a = kVarD;
            lVar.f187099d = 1;
            Object objJ4 = dVar.J4(kVarD, lVar);
            if (objJ4 == obj2) {
                return obj2;
            }
            kVar2 = kVarD;
            obj = objJ4;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar2 = lVar.f187096a;
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            dVar.F4().j(new rt1.b.C2927b(kVar2));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar = (v2.a) v2Var;
            String strI = u0.i(aVar.f47384b, "handleEventCustomizationUpdate: Error updating the customization ", " :: ", aVar.f47385c);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "RaceEventViewModel", strI);
            dVar.F4().j(new rt1.b.a(null, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r1 == r2) goto L32;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00b8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B4(Context context, fg0.k kVar, v13.c cVar) {
        f fVar;
        d dVar;
        Context context2;
        v2 aVar;
        Long l14;
        fg0.k kVar2 = kVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f187065e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f187065e = i14 - Integer.MIN_VALUE;
                dVar = this;
            } else {
                dVar = this;
                fVar = new f(dVar, cVar);
            }
        } else {
            dVar = this;
            fVar = new f(dVar, cVar);
        }
        f fVar2 = fVar;
        Object objJ = fVar2.f187063c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar2.f187065e;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (kVar2.getDate() != null) {
                zf0.d dVarC4 = dVar.C4();
                context2 = context;
                fVar2.f187061a = context2;
                fVar2.f187062b = kVar2;
                fVar2.f187065e = 1;
                dVarC4.getClass();
                objJ = f0.J(dVarC4, new zf0.e(dVarC4, kVar2, null), fVar2);
            } else {
                context2 = context;
                aVar = new v2.a(new InvalidParameterException("Invalid EventDTO"), null, null, 6, null);
                if (!(aVar instanceof v2.b)) {
                    if (aVar instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String str = "Error in creating the event Name : " + kVar2.getEventName() + StringUtils.SPACE + ((v2.a) aVar).f47383a;
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "RaceEventViewModel", str);
                    return g3.a.a(g3.f35298f, null, null, null, null, 15);
                }
                T t7 = ((v2.b) aVar).f47386a;
                fg0.k kVar3 = (fg0.k) t7;
                l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                Uri selectedImageUrlPath = kVar2.getSelectedImageUrlPath();
                if (l14 != null || selectedImageUrlPath == null) {
                    g3.f35298f.getClass();
                    return g3.a.d(t7);
                }
                long jLongValue = l14.longValue();
                fVar2.f187061a = null;
                fVar2.f187062b = null;
                fVar2.f187065e = 2;
                Object objK4 = dVar.K4(context2, jLongValue, kVar3, selectedImageUrlPath, fVar2);
                if (objK4 != aVar2) {
                    return objK4;
                }
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return objJ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kVar2 = fVar2.f187062b;
        context2 = fVar2.f187061a;
        o13.r.b(objJ);
        aVar = (v2) objJ;
        if (!(aVar instanceof v2.b)) {
            T t14 = ((v2.b) aVar).f47386a;
            fg0.k kVar4 = (fg0.k) t14;
            l14 = kVar4.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            Uri selectedImageUrlPath2 = kVar2.getSelectedImageUrlPath();
            if (l14 != null) {
            }
            g3.f35298f.getClass();
            return g3.a.d(t14);
        }
        if (aVar instanceof v2.a) {
            u0.r();
            return null;
        }
        String str2 = "Error in creating the event Name : " + kVar2.getEventName() + StringUtils.SPACE + ((v2.a) aVar).f47383a;
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.f(a2Var2, "RaceEventViewModel", str2);
        return g3.a.a(g3.f35298f, null, null, null, null, 15);
    }

    public final zf0.d C4() {
        return (zf0.d) this.f187035b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0224  */
    /* JADX WARN: Code duplicated, block: B:150:0x0322  */
    /* JADX WARN: Code duplicated, block: B:152:0x0327  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:193:0x03da  */
    /* JADX WARN: Code duplicated, block: B:195:0x03de  */
    /* JADX WARN: Code duplicated, block: B:198:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object D4(xw1.d dVar, String str, v13.c cVar) throws Throwable {
        g gVar;
        long jLongValue;
        String str2;
        Context context;
        Long coachId;
        xw1.d dVar2;
        v2 v2Var;
        Context context2;
        long j8;
        String str3;
        v2 v2Var2;
        boolean z14;
        boolean z15;
        Object next;
        String onChangeRaceEndDate;
        String onChangeRaceStartDate;
        Long coachId2;
        Object next2;
        String strR;
        boolean z16;
        fg0.d completionTarget;
        DateTime dateTimeB;
        LocalDate localDate;
        String onChangeRaceEndDate2;
        String onChangeRaceStartDate2;
        Long coachId3;
        xw1.d dVar3 = dVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f187073h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f187073h = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f187071f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f187073h;
        if (i15 == 0) {
            o13.r.b(obj);
            xw1.n nVar = this.f187049p;
            if (nVar != null && nVar.f192428d) {
                return Unit.INSTANCE;
            }
            xw1.e coach = dVar3.getCoach();
            jLongValue = (coach == null || (coachId = coach.getCoachId()) == null) ? -1L : coachId.longValue();
            Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
            xw1.m athletePlanGoal = dVar3.getAthletePlanGoal();
            if ((athletePlanGoal != null ? athletePlanGoal.getGoal() : null) != null) {
                x53.c cVar2 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                h hVar = new h(dVar3, this, null);
                gVar.f187066a = dVar3;
                str2 = str;
                gVar.f187067b = str2;
                gVar.f187068c = contextB;
                gVar.f187070e = jLongValue;
                gVar.f187073h = 1;
                Object objE0 = ge1.b.e0(bVar, hVar, gVar);
                if (objE0 != aVar) {
                    context = contextB;
                    obj = objE0;
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
        if (i15 == 1) {
            jLongValue = gVar.f187070e;
            Context context3 = gVar.f187068c;
            String str4 = gVar.f187067b;
            xw1.d dVar4 = gVar.f187066a;
            o13.r.b(obj);
            str2 = str4;
            context = context3;
            dVar3 = dVar4;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = gVar.f187070e;
            v2Var = gVar.f187069d;
            context2 = gVar.f187068c;
            str3 = gVar.f187067b;
            dVar2 = gVar.f187066a;
            o13.r.b(obj);
        }
        v2Var2 = (v2) obj;
        xw1.l lVar = new xw1.l(null, null, 0, 0, null, null, null, false, 255, null);
        z14 = v2Var instanceof v2.b;
        o13.t tVar = this.f187041h;
        if (!z14 && (v2Var2 instanceof v2.b)) {
            this.f187048o = (fg0.k) ((v2.b) v2Var2).f47386a;
            Iterator it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                xw1.f coach2 = ((xw1.h) next2).getCoach();
                if (coach2 != null && (coachId3 = coach2.getCoachId()) != null && coachId3.longValue() == j8) {
                    break;
                }
            }
            xw1.h hVar2 = (xw1.h) next2;
            DateTime dateTime = (hVar2 == null || (onChangeRaceStartDate2 = hVar2.getOnChangeRaceStartDate()) == null) ? null : new DateTime(onChangeRaceStartDate2);
            DateTime dateTime2 = (hVar2 == null || (onChangeRaceEndDate2 = hVar2.getOnChangeRaceEndDate()) == null) ? null : new DateTime(onChangeRaceEndDate2);
            rt1.r.a aVar2 = rt1.r.f154555d;
            int workoutPlanTypeId = dVar2.getWorkoutPlanTypeId();
            aVar2.getClass();
            rt1.r rVarB = rt1.r.a.b(workoutPlanTypeId);
            Double d14 = rVarB != null ? new Double(rVarB.f154561b) : null;
            fg0.k kVar = this.f187048o;
            LocalDate date = kVar != null ? kVar.getDate() : null;
            DateTime dateTime3 = dateTime;
            xw1.l lVarB = xw1.l.b(lVar, null, null, dateTime3, dateTime2, d14, 143);
            fg0.k kVar2 = this.f187048o;
            if (kVar2 != null) {
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                strR = kVar2.r(false);
                if (strR == null) {
                    strR = "";
                }
            } else {
                strR = "";
            }
            if (date == null || dateTime3 == null || dateTime2 == null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "RaceEventViewModel", "Something went wrong while fetching linked event details");
            } else {
                fg0.k kVar3 = this.f187048o;
                boolean z17 = (kVar3 == null || kVar3.n0() || kVar3.p0()) ? false : true;
                boolean z18 = date.isBefore(dateTime3.toLocalDate()) || date.isAfter(dateTime2.toLocalDate());
                ww1.h athleteRace = dVar2.getAthleteRace();
                boolean z19 = (athleteRace == null || (dateTimeB = athleteRace.b()) == null || (localDate = dateTimeB.toLocalDate()) == null || !(localDate.equals(date) ^ true) || z18) ? false : true;
                fg0.k kVar4 = this.f187048o;
                Double dB = (kVar4 == null || (completionTarget = kVar4.getCompletionTarget()) == null) ? null : completionTarget.b();
                og0.a aVar4 = og0.a.f131967a;
                d14.getClass();
                double dDoubleValue = d14.doubleValue();
                aVar4.getClass();
                v vVarL = og0.a.l(dDoubleValue);
                dB.getClass();
                double dDoubleValue2 = dB.doubleValue();
                Double d15 = vVarL.f71361c;
                d15.getClass();
                if (dDoubleValue2 >= d15.doubleValue()) {
                    double dDoubleValue3 = dB.doubleValue();
                    Double d16 = vVarL.f71360b;
                    d16.getClass();
                    if (dDoubleValue3 > d16.doubleValue()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = true;
                }
                Boolean[] boolArr = {Boolean.valueOf(z18), Boolean.valueOf(z19), Boolean.valueOf(z16)};
                int i16 = 0;
                for (int i17 = 0; i17 < 3; i17++) {
                    if (boolArr[i17].booleanValue()) {
                        i16++;
                    }
                }
                if (i16 > 1) {
                    lVarB = xw1.l.b(lVarB, new Integer(R.string.event_no_longer_fits_plan), context2.getString(R.string.event_updates_no_longer_fits_plan, strR, str3), null, null, null, 252);
                } else if (z18) {
                    lVarB = xw1.l.b(lVarB, new Integer(R.string.event_date_changed), context2.getString(R.string.event_date_changed_out_of_plan_window, strR, str3), null, null, null, 252);
                } else if (z19) {
                    lVarB = xw1.l.b(lVarB, new Integer(R.string.event_date_changed), context2.getString(R.string.event_date_changed_with_plan, strR), null, null, null, PsExtractor.VIDEO_STREAM_MASK);
                } else if (z16) {
                    lVarB = xw1.l.b(lVarB, new Integer(R.string.event_distance_changed), context2.getString(R.string.event_distance_changed_no_longer_fits_plan, strR, str3), null, null, null, 252);
                } else if (z17) {
                    Integer num = new Integer(R.string.event_required);
                    ww1.h athleteRace2 = dVar2.getAthleteRace();
                    lVarB = xw1.l.b(lVarB, num, context2.getString(R.string.event_removed_with_plan, athleteRace2 != null ? athleteRace2.getRaceName() : null), null, null, null, 124);
                }
                xw1.l lVar2 = lVarB;
                if (i16 > 0 || z17) {
                    ((androidx.lifecycle.y0) tVar.getValue()).j(lVar2);
                }
            }
        } else if (z14 || !(v2Var2 instanceof v2.a)) {
            z15 = v2Var instanceof v2.a;
            if (z15 || (v2Var2 instanceof v2.a)) {
                if (z15) {
                    String strH = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var2, "RaceEventViewModel", strH);
                }
                if (v2Var2 instanceof v2.a) {
                    String strH2 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var3, "RaceEventViewModel", strH2);
                }
            }
        } else {
            Iterator it3 = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                xw1.f coach3 = ((xw1.h) next).getCoach();
                if (coach3 != null && (coachId2 = coach3.getCoachId()) != null && coachId2.longValue() == j8) {
                    break;
                }
            }
            xw1.h hVar3 = (xw1.h) next;
            Integer num2 = ((v2.a) v2Var2).f47384b;
            if (num2 != null && num2.intValue() == 404) {
                DateTime dateTime4 = (hVar3 == null || (onChangeRaceStartDate = hVar3.getOnChangeRaceStartDate()) == null) ? null : new DateTime(onChangeRaceStartDate);
                DateTime dateTime5 = (hVar3 == null || (onChangeRaceEndDate = hVar3.getOnChangeRaceEndDate()) == null) ? null : new DateTime(onChangeRaceEndDate);
                rt1.r.a aVar7 = rt1.r.f154555d;
                int workoutPlanTypeId2 = dVar2.getWorkoutPlanTypeId();
                aVar7.getClass();
                rt1.r rVarB2 = rt1.r.a.b(workoutPlanTypeId2);
                Double d17 = rVarB2 != null ? new Double(rVarB2.f154561b) : null;
                ww1.h athleteRace3 = dVar2.getAthleteRace();
                ((androidx.lifecycle.y0) tVar.getValue()).j(xw1.l.b(lVar, new Integer(R.string.lbl_event_deleted), context2.getString(R.string.event_deleted_with_plan, athleteRace3 != null ? athleteRace3.getRaceName() : null), dateTime4, dateTime5, d17, 12));
            }
        }
        return Unit.INSTANCE;
        v2 v2Var3 = (v2) obj;
        x53.c cVar3 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        i iVar = new i(dVar3, this, null);
        gVar.f187066a = dVar3;
        gVar.f187067b = str2;
        gVar.f187068c = context;
        gVar.f187069d = v2Var3;
        gVar.f187070e = jLongValue;
        gVar.f187073h = 2;
        Object objE1 = ge1.b.e0(bVar2, iVar, gVar);
        if (objE1 != aVar) {
            dVar2 = dVar3;
            v2Var = v2Var3;
            obj = objE1;
            context2 = context;
            j8 = jLongValue;
            str3 = str2;
            v2Var2 = (v2) obj;
            xw1.l lVar3 = new xw1.l(null, null, 0, 0, null, null, null, false, 255, null);
            z14 = v2Var instanceof v2.b;
            o13.t tVar2 = this.f187041h;
            if (!z14) {
                if (z14) {
                    z15 = v2Var instanceof v2.a;
                    if (z15) {
                        if (z15) {
                            String strH3 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var4 = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.f(a2Var4, "RaceEventViewModel", strH3);
                        }
                        if (v2Var2 instanceof v2.a) {
                            String strH4 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                            i2.a aVar9 = i2.f36769a;
                            a2 a2Var5 = a2.GENERAL;
                            aVar9.getClass();
                            i2.a.f(a2Var5, "RaceEventViewModel", strH4);
                        }
                    } else {
                        if (z15) {
                            String strH5 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                            i2.a aVar10 = i2.f36769a;
                            a2 a2Var6 = a2.GENERAL;
                            aVar10.getClass();
                            i2.a.f(a2Var6, "RaceEventViewModel", strH5);
                        }
                        if (v2Var2 instanceof v2.a) {
                            String strH6 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                            i2.a aVar11 = i2.f36769a;
                            a2 a2Var7 = a2.GENERAL;
                            aVar11.getClass();
                            i2.a.f(a2Var7, "RaceEventViewModel", strH6);
                        }
                    }
                } else {
                    z15 = v2Var instanceof v2.a;
                    if (z15) {
                        if (z15) {
                            String strH7 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                            i2.a aVar12 = i2.f36769a;
                            a2 a2Var8 = a2.GENERAL;
                            aVar12.getClass();
                            i2.a.f(a2Var8, "RaceEventViewModel", strH7);
                        }
                        if (v2Var2 instanceof v2.a) {
                            String strH8 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                            i2.a aVar13 = i2.f36769a;
                            a2 a2Var9 = a2.GENERAL;
                            aVar13.getClass();
                            i2.a.f(a2Var9, "RaceEventViewModel", strH8);
                        }
                    } else {
                        if (z15) {
                            String strH9 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                            i2.a aVar14 = i2.f36769a;
                            a2 a2Var10 = a2.GENERAL;
                            aVar14.getClass();
                            i2.a.f(a2Var10, "RaceEventViewModel", strH9);
                        }
                        if (v2Var2 instanceof v2.a) {
                            String strH10 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                            i2.a aVar15 = i2.f36769a;
                            a2 a2Var11 = a2.GENERAL;
                            aVar15.getClass();
                            i2.a.f(a2Var11, "RaceEventViewModel", strH10);
                        }
                    }
                }
            } else if (z14) {
                z15 = v2Var instanceof v2.a;
                if (z15) {
                    if (z15) {
                        String strH11 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                        i2.a aVar16 = i2.f36769a;
                        a2 a2Var12 = a2.GENERAL;
                        aVar16.getClass();
                        i2.a.f(a2Var12, "RaceEventViewModel", strH11);
                    }
                    if (v2Var2 instanceof v2.a) {
                        String strH12 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                        i2.a aVar17 = i2.f36769a;
                        a2 a2Var13 = a2.GENERAL;
                        aVar17.getClass();
                        i2.a.f(a2Var13, "RaceEventViewModel", strH12);
                    }
                } else {
                    if (z15) {
                        String strH13 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                        i2.a aVar18 = i2.f36769a;
                        a2 a2Var14 = a2.GENERAL;
                        aVar18.getClass();
                        i2.a.f(a2Var14, "RaceEventViewModel", strH13);
                    }
                    if (v2Var2 instanceof v2.a) {
                        String strH14 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                        i2.a aVar19 = i2.f36769a;
                        a2 a2Var15 = a2.GENERAL;
                        aVar19.getClass();
                        i2.a.f(a2Var15, "RaceEventViewModel", strH14);
                    }
                }
            } else {
                z15 = v2Var instanceof v2.a;
                if (z15) {
                    if (z15) {
                        String strH15 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                        i2.a aVar110 = i2.f36769a;
                        a2 a2Var16 = a2.GENERAL;
                        aVar110.getClass();
                        i2.a.f(a2Var16, "RaceEventViewModel", strH15);
                    }
                    if (v2Var2 instanceof v2.a) {
                        String strH16 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                        i2.a aVar111 = i2.f36769a;
                        a2 a2Var17 = a2.GENERAL;
                        aVar111.getClass();
                        i2.a.f(a2Var17, "RaceEventViewModel", strH16);
                    }
                } else {
                    if (z15) {
                        String strH17 = f3.h(((v2.a) v2Var).f47383a, "Something went wrong while fetching coach plan ", StringUtils.SPACE);
                        i2.a aVar112 = i2.f36769a;
                        a2 a2Var18 = a2.GENERAL;
                        aVar112.getClass();
                        i2.a.f(a2Var18, "RaceEventViewModel", strH17);
                    }
                    if (v2Var2 instanceof v2.a) {
                        String strH18 = f3.h(((v2.a) v2Var2).f47383a, "Something went wrong while fetching event details ", StringUtils.SPACE);
                        i2.a aVar113 = i2.f36769a;
                        a2 a2Var19 = a2.GENERAL;
                        aVar113.getClass();
                        i2.a.f(a2Var19, "RaceEventViewModel", strH18);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }

    public final androidx.lifecycle.y0<rt1.a> E4() {
        return (androidx.lifecycle.y0) this.f187039f.getValue();
    }

    public final androidx.lifecycle.y0<rt1.b> F4() {
        return (androidx.lifecycle.y0) this.f187037d.getValue();
    }

    public final xw1.n G4(Intent intent) {
        fg0.p pVar;
        fg0.k kVar;
        Bundle extras;
        Bundle extras2;
        Parcelable parcelable;
        Bundle extras3;
        Parcelable parcelable2;
        if (intent == null || (extras3 = intent.getExtras()) == null) {
            pVar = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) extras3.getParcelable("GCM_extra_sharable_event_search_dto", fg0.p.class);
            } else {
                Parcelable parcelable3 = extras3.getParcelable("GCM_extra_sharable_event_search_dto");
                if (!(parcelable3 instanceof fg0.p)) {
                    parcelable3 = null;
                }
                parcelable2 = (fg0.p) parcelable3;
            }
            pVar = (fg0.p) parcelable2;
        }
        l2.f37135b.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_sharable_event_dto", fg0.k.class);
            } else {
                Parcelable parcelable4 = bundleA.getParcelable("GCM_extra_sharable_event_dto");
                if (!(parcelable4 instanceof fg0.k)) {
                    parcelable4 = null;
                }
                parcelable = (fg0.k) parcelable4;
            }
            kVar = (fg0.k) parcelable;
        } else {
            kVar = null;
        }
        Integer numValueOf = (intent == null || (extras2 = intent.getExtras()) == null) ? null : Integer.valueOf(extras2.getInt("GCM_extra_selected_event_type"));
        y0 y0Var = y0.values()[numValueOf != null ? numValueOf.intValue() : 0];
        this.f187047n = (intent == null || (extras = intent.getExtras()) == null) ? true : extras.getBoolean("GCM_extra_should_keep_linked_event", true);
        if ((y0Var == null ? -1 : b.f187050a[y0Var.ordinal()]) == 1) {
            if (pVar != null) {
                return new xw1.n(y0Var, pVar.j(), pVar, false, 8, null);
            }
        } else if (kVar != null) {
            return new xw1.n(y0Var, kVar, null, false, 12, null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, xw1.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, xw1.c] */
    public final void H4(fg0.k kVar, xw1.d dVar) {
        r0 r0Var = new r0();
        r0Var.f105810a = new xw1.c(dVar);
        xw1.n nVar = new xw1.n(null, kVar, null, false, 13, null);
        r0Var.f105810a = xw1.c.b((xw1.c) r0Var.f105810a, nVar.d(), null, null, 0, 0, 0, 0, null, null, 0, 0, nVar, 16777151);
        ge1.b.T(v1.a(this), null, null, new c(dVar, r0Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I4(fg0.p pVar, String str, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f187107d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f187107d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objJ = nVar.f187105b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f187107d;
        if (i15 == 0) {
            o13.r.b(objJ);
            ig0.b bVar = (ig0.b) this.f187034a.getValue();
            nVar.f187104a = pVar;
            nVar.f187107d = 1;
            bVar.getClass();
            objJ = f0.J(bVar, new ig0.c(bVar, str, pVar, null), nVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar = nVar.f187104a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            g3.a aVar2 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            aVar2.getClass();
            return g3.a.d(t7);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String str2 = "Failed to subscribe to the event Name " + pVar.getEventName() + StringUtils.SPACE + ((v2.a) v2Var).f47383a;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "RaceEventViewModel", str2);
        return g3.a.a(g3.f35298f, null, null, null, null, 15);
    }

    public final Object J4(fg0.k kVar, v13.c cVar) {
        if ((kVar != null ? p005kotlin.jvm.internal.s.g(kVar.getEventOrganizer(), Boolean.TRUE) : false) && kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
            zf0.d dVarC4 = C4();
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            l14.getClass();
            return dVarC4.h(l14.longValue(), kVar, cVar);
        }
        if ((kVar != null ? kVar.getShareableEventUuid() : null) == null) {
            return new v2.a(new IllegalStateException(), null, null, 6, null);
        }
        fg0.j eventCustomization = kVar != null ? kVar.getEventCustomization() : null;
        zf0.d dVarC5 = C4();
        String shareableEventUuid = kVar != null ? kVar.getShareableEventUuid() : null;
        shareableEventUuid.getClass();
        eventCustomization.getClass();
        return dVarC5.i(shareableEventUuid, eventCustomization, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K4(Context context, long j8, fg0.k kVar, Uri uri, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f187112e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f187112e = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objAwait = oVar.f187110c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f187112e;
        if (i15 == 0) {
            o13.r.b(objAwait);
            zf0.d dVarC4 = C4();
            og0.b.f131972a.getClass();
            ArrayList arrayListA = og0.b.a.a(context, uri);
            oVar.f187108a = kVar;
            oVar.f187109b = j8;
            oVar.f187112e = 1;
            objAwait = dVarC4.f204344a.s(j8, arrayListA).await(oVar);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = oVar.f187109b;
            kVar = oVar.f187108a;
            o13.r.b(objAwait);
        }
        c83.a0 a0Var = (c83.a0) objAwait;
        if (a0Var.f25745a.isSuccessful()) {
            ht.a aVar2 = ht.a.f85464a;
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("EventImageUploadSuccessful", true);
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            ht.a.a(bundle, "EventImageUploadSuccessful");
            g3.f35298f.getClass();
            return g3.a.d(kVar);
        }
        String str = "Image upload failed eventID " + j8 + "-- " + a0Var.f25745a.code();
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "RaceEventViewModel", str);
        g3.f35298f.getClass();
        return g3.a.d(kVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwt1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
