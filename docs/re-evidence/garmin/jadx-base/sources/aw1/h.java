package aw1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.protobuf.DescriptorProtos;
import i3.e5;
import java.security.InvalidParameterException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Law1/h;", "Lzf0/j0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends zf0.j0 {
    public static final /* synthetic */ int S1 = 0;
    public final o13.t A1;
    public final y0 B1;
    public final o13.t C1;
    public final y0<g3<jv1.l>> D1;
    public final y0 E1;
    public int F1;
    public jv1.e G1;
    public final o13.t H0;
    public final o13.t H1;
    public boolean I0;
    public final y0 I1;
    public boolean J0;
    public final o13.t J1;
    public final o13.t K0;
    public final o13.t K1;
    public final o13.t L0;
    public final p2 L1;
    public final y0 M0;
    public final b2 M1;
    public final w0 N0;
    public boolean N1;
    public final o13.t O0;
    public jv1.s O1;
    public final o13.t P0;
    public String P1;
    public final o13.t Q0;
    public final p2 Q1;
    public final o13.t R0;
    public final b2 R1;
    public final o13.t S0;
    public final uw1.b T;
    public final o13.t T0;
    public final w0 U0;
    public final o13.t V0;
    public final o13.t W0;
    public final o13.t X;
    public final o13.t X0;
    public final o13.t Y;
    public final o13.t Y0;
    public final o13.t Z;
    public final o13.t Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final o13.t f13367a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final o13.t f13368b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final o13.t f13369c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final o13.t f13370d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final y0 f13371e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final o13.t f13372f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final y0 f13373g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final o13.t f13374h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final y0 f13375i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final o13.t f13376j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final y0 f13377k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final y0 f13378k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final o13.t f13379l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final y0 f13380m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final o13.t f13381n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final y0 f13382o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final boolean f13383p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final boolean f13384q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f13385r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f13386s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public LinkedHashSet f13387t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public List<tw1.m> f13388u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public List<com.garmin.android.apps.connectmobile.workouts.data.model.f> f13389v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final o13.t f13390w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public vt1.o f13391x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final p2 f13392y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final b2 f13393z1;
    public final kv1.b I = kv1.b.a.a(kv1.b.f106719e);
    public final gu1.b P = gu1.b.a.a(gu1.b.f79047b);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f13395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13396c;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.o.f180178i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vt1.o.f180179j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vt1.o.f180180k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13394a = iArr;
            int[] iArr2 = new int[vt1.e.values().length];
            try {
                iArr2[vt1.e.TRAIN_FOR_A_RACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[vt1.e.ACHIEVE_A_MILESTONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[vt1.e.IMPROVE_FITNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f13395b = iArr2;
            int[] iArr3 = new int[vt1.d.values().length];
            try {
                iArr3[vt1.d.f180090c.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[vt1.d.f180091d.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[vt1.d.f180093f.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[vt1.d.f180092e.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f13396c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((vt1.h) t7).f180120a), Integer.valueOf(((vt1.h) t14).f180120a));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getUpcomingEvents$1", f = "FBTPlanWizardViewModel.kt", l = {1147, 1148, 1149}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.j0 f13397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.i0 f13398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public v2 f13399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v2 f13400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f13402f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f13404h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ DateTime f13405i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ DateTime f13406j;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13407a;

            static {
                int[] iArr = new int[vt1.n.values().length];
                try {
                    iArr[vt1.n.MARATHON.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vt1.n.OTHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f13407a = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/n;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getUpcomingEvents$1$eventProvidersAsync$1", f = "FBTPlanWizardViewModel.kt", l = {1145}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends fg0.n>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13408a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13409b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f13409b = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f13409b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends fg0.n>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f13408a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                ig0.b bVarH4 = this.f13409b.H4();
                this.f13408a = 1;
                bVarH4.getClass();
                Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVarH4, new ig0.f(bVarH4, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lfg0/z;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getUpcomingEvents$1$primaryEventAsync$1", f = "FBTPlanWizardViewModel.kt", l = {1134}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends fg0.z>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13411b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f13411b = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f13411b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends fg0.z>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f13410a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                zf0.d dVar = this.f13411b.f204384a;
                this.f13410a = 1;
                dVar.getClass();
                Object objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.q(dVar, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        /* JADX INFO: renamed from: aw1.h$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getUpcomingEvents$1$upcomingEventsAsync$1", f = "FBTPlanWizardViewModel.kt", l = {1139}, m = "invokeSuspend", v = 2)
        public static final class C0188d extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends fg0.k>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13412a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13413b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f13414c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ DateTime f13415d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0188d(h hVar, DateTime dateTime, DateTime dateTime2, t13.d<? super C0188d> dVar) {
                super(2, dVar);
                this.f13413b = hVar;
                this.f13414c = dateTime;
                this.f13415d = dateTime2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0188d(this.f13413b, this.f13414c, this.f13415d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends fg0.k>>> dVar) {
                return ((C0188d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                gg0.f fVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f13412a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                h hVar = this.f13413b;
                zf0.d dVar = hVar.f204384a;
                String string = this.f13414c.toString("yyyy-MM-dd");
                string.getClass();
                String string2 = this.f13415d.toString("yyyy-MM-dd");
                string2.getClass();
                vt1.o oVarS5 = hVar.S5();
                String str = (oVarS5 == null || (fVar = oVarS5.f180187d) == null) ? null : fVar.f77147a;
                this.f13412a = 1;
                Object objG = dVar.g(string, string2, str, this);
                return objG == aVar ? aVar : objG;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, DateTime dateTime, DateTime dateTime2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f13404h = str;
            this.f13405i = dateTime;
            this.f13406j = dateTime2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = h.this.new d(this.f13404h, this.f13405i, this.f13406j, dVar);
            dVar2.f13402f = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:133:0x0323  */
        /* JADX WARN: Code duplicated, block: B:138:0x033f  */
        /* JADX WARN: Code duplicated, block: B:140:0x034c  */
        /* JADX WARN: Code duplicated, block: B:145:0x035b  */
        /* JADX WARN: Code duplicated, block: B:149:0x0364  */
        /* JADX WARN: Code duplicated, block: B:151:0x036a  */
        /* JADX WARN: Code duplicated, block: B:154:0x0373  */
        /* JADX WARN: Code duplicated, block: B:156:0x0376  */
        /* JADX WARN: Code duplicated, block: B:158:0x037c  */
        /* JADX WARN: Code duplicated, block: B:160:0x0382  */
        /* JADX WARN: Code duplicated, block: B:163:0x038b  */
        /* JADX WARN: Code duplicated, block: B:165:0x038e  */
        /* JADX WARN: Code duplicated, block: B:169:0x039a  */
        /* JADX WARN: Code duplicated, block: B:171:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:173:0x03a6  */
        /* JADX WARN: Code duplicated, block: B:174:0x03a9  */
        /* JADX WARN: Code duplicated, block: B:177:0x03ae  */
        /* JADX WARN: Code duplicated, block: B:179:0x03b4  */
        /* JADX WARN: Code duplicated, block: B:181:0x03be  */
        /* JADX WARN: Code duplicated, block: B:182:0x03c3  */
        /* JADX WARN: Code duplicated, block: B:184:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:186:0x03d3  */
        /* JADX WARN: Code duplicated, block: B:187:0x03dc  */
        /* JADX WARN: Code duplicated, block: B:190:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:191:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:193:0x03f8  */
        /* JADX WARN: Code duplicated, block: B:214:0x0476  */
        /* JADX WARN: Code duplicated, block: B:217:0x048c  */
        /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:224:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:226:0x04ac  */
        /* JADX WARN: Code duplicated, block: B:229:0x04b6  */
        /* JADX WARN: Code duplicated, block: B:231:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:232:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:238:0x04d5  */
        /* JADX WARN: Code duplicated, block: B:240:0x04d8  */
        /* JADX WARN: Code duplicated, block: B:241:0x04da  */
        /* JADX WARN: Code duplicated, block: B:247:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:252:0x04f5  */
        /* JADX WARN: Code duplicated, block: B:254:0x04f8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:255:0x04fa  */
        /* JADX WARN: Code duplicated, block: B:257:0x050c  */
        /* JADX WARN: Code duplicated, block: B:258:0x050e  */
        /* JADX WARN: Code duplicated, block: B:259:0x0510  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:263:0x0519  */
        /* JADX WARN: Code duplicated, block: B:265:0x051c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:268:0x0528  */
        /* JADX WARN: Code duplicated, block: B:270:0x0530  */
        /* JADX WARN: Code duplicated, block: B:272:0x0539  */
        /* JADX WARN: Code duplicated, block: B:275:0x0551  */
        /* JADX WARN: Code duplicated, block: B:278:0x055d  */
        /* JADX WARN: Code duplicated, block: B:27:0x00be  */
        /* JADX WARN: Code duplicated, block: B:280:0x0563  */
        /* JADX WARN: Code duplicated, block: B:282:0x0569  */
        /* JADX WARN: Code duplicated, block: B:284:0x05ac  */
        /* JADX WARN: Code duplicated, block: B:286:0x05b2  */
        /* JADX WARN: Code duplicated, block: B:288:0x0124 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:293:0x0326 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:302:0x0479 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:303:0x04d0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:32:0x00df  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:37:0x0100  */
        /* JADX WARN: Code duplicated, block: B:40:0x010a  */
        /* JADX WARN: Code duplicated, block: B:42:0x0117  */
        /* JADX WARN: Code duplicated, block: B:43:0x011c  */
        /* JADX WARN: Code duplicated, block: B:49:0x0129  */
        /* JADX WARN: Code duplicated, block: B:51:0x012c  */
        /* JADX WARN: Code duplicated, block: B:54:0x013b  */
        /* JADX WARN: Code duplicated, block: B:61:0x0163  */
        /* JADX WARN: Code duplicated, block: B:62:0x0168  */
        /* JADX WARN: Code duplicated, block: B:64:0x016e  */
        /* JADX WARN: Code duplicated, block: B:70:0x018b  */
        /* JADX WARN: Code duplicated, block: B:78:0x01a1 A[PHI: r3 r6
          0x01a1: PHI (r3v34 java.util.Iterator) = 
          (r3v27 java.util.Iterator)
          (r3v27 java.util.Iterator)
          (r3v27 java.util.Iterator)
          (r3v37 java.util.Iterator)
          (r3v27 java.util.Iterator)
         binds: [B:69:0x0189, B:71:0x018f, B:73:0x0195, B:295:0x01a1, B:77:0x019f] A[DONT_GENERATE, DONT_INLINE]
          0x01a1: PHI (r6v22 aw1.h) = (r6v2 aw1.h), (r6v2 aw1.h), (r6v2 aw1.h), (r6v23 aw1.h), (r6v2 aw1.h) binds: [B:69:0x0189, B:71:0x018f, B:73:0x0195, B:295:0x01a1, B:77:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
        /* JADX WARN: Code restructure failed: missing block: B:166:0x0392, code lost:
        
            if (r3.W5() != false) goto L167;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:282:0x0569, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v27 */
        /* JADX WARN: Type inference failed for: r8v38 */
        /* JADX WARN: Type inference failed for: r8v39 */
        /* JADX WARN: Type inference failed for: r8v5, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o53.j0 j0VarJ;
            o53.i0 i0VarJ;
            Object objC;
            v2 v2Var;
            Object objAwait;
            v2 v2Var2;
            Object objAwait2;
            v2 v2Var3;
            v2 v2Var4;
            fg0.z zVar;
            List list;
            List list2;
            fg0.k kVar;
            h hVar;
            ArrayList arrayList;
            boolean z14;
            fg0.k kVar2;
            boolean z15;
            String str;
            String strB;
            boolean z16;
            boolean z17;
            Iterator it;
            Object next;
            Long id3;
            Long id4;
            ArrayList arrayList2;
            Iterator it3;
            h hVar2;
            ArrayList arrayList3;
            fg0.k kVar3;
            jv1.s sVarI6;
            jv1.h hVar3;
            fg0.d completionTarget;
            fg0.z zVar2;
            h hVar4;
            Double value;
            Double d14;
            fg0.d completionTarget2;
            Double dValueOf;
            double dDoubleValue;
            boolean zB;
            gg0.f eventType;
            boolean z18;
            gg0.f eventType2;
            boolean z19;
            gg0.f eventType3;
            boolean z24;
            Object next2;
            fg0.k kVar4;
            gg0.f eventType4;
            gg0.f eventType5;
            gg0.f eventType6;
            h hVar5;
            List<tw1.m> list3;
            ww1.d0 trainingPlanSubType;
            ww1.d0 trainingPlanSubType2;
            boolean zContains;
            Double dB;
            boolean z25;
            Iterator it4;
            Object next3;
            Long id5;
            Long lF;
            o53.b0 b0Var = (o53.b0) this.f13402f;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13401e;
            int i15 = 3;
            int i16 = 2;
            h hVar6 = h.this;
            boolean z26 = true;
            ?? r14 = 0;
            if (i14 == 0) {
                o13.r.b(obj);
                int i17 = h.S1;
                hVar6.u6().j(g3.a.c(g3.f35298f));
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new c(hVar6, null), 3);
                j0VarJ = ge1.b.j(b0Var, null, null, new C0188d(hVar6, this.f13405i, this.f13406j, null), 3);
                i0VarJ = ge1.b.j(b0Var, null, null, new b(hVar6, null), 3);
                this.f13402f = b0Var;
                this.f13397a = j0VarJ;
                this.f13398b = i0VarJ;
                this.f13401e = 1;
                objC = j0VarJ2.C(this);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o53.i0 i0Var = this.f13398b;
                j0VarJ = this.f13397a;
                o13.r.b(obj);
                i0VarJ = i0Var;
                objC = obj;
            } else {
                if (i14 == 2) {
                    v2Var = this.f13399c;
                    o53.i0 i0Var2 = this.f13398b;
                    o13.r.b(obj);
                    i0VarJ = i0Var2;
                    objAwait = obj;
                    v2Var2 = (v2) objAwait;
                    this.f13402f = b0Var;
                    this.f13397a = null;
                    this.f13398b = null;
                    this.f13399c = v2Var;
                    this.f13400d = v2Var2;
                    this.f13401e = 3;
                    objAwait2 = i0VarJ.await(this);
                    if (objAwait2 != aVar) {
                        v2Var3 = v2Var;
                    }
                    return aVar;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2 v2Var5 = this.f13400d;
                v2Var3 = this.f13399c;
                o13.r.b(obj);
                v2Var2 = v2Var5;
                objAwait2 = obj;
            }
            v2Var4 = (v2) objAwait2;
            if (v2Var3 instanceof v2.b) {
                zVar = (fg0.z) ((v2.b) v2Var3).f47386a;
            } else {
                if (v2Var3 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
                zVar = null;
            }
            if (v2Var2 instanceof v2.b) {
                if (v2Var2 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar3 = (v2.a) v2Var2;
                String str2 = "Error fetching upcoming events details ErrorCode " + aVar3.f47384b + " :: " + aVar3.f47383a + StringUtils.SPACE;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var2, "FBTPlanWizardViewModel", str2);
                int i18 = h.S1;
                hVar6.u6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                return Unit.INSTANCE;
            }
            list = (List) ((v2.b) v2Var2).f47386a;
            if (v2Var4 instanceof v2.b) {
                list2 = (List) ((v2.b) v2Var4).f47386a;
            } else {
                if (v2Var4 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                i2.a aVar5 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var3, "FBTPlanWizardViewModel", strD2);
                list2 = null;
            }
            if (list != null) {
                it4 = list.iterator();
                do {
                    if (it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                    id5 = ((fg0.k) next3).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (zVar != null) {
                        lF = zVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    } else {
                        lF = null;
                    }
                } while (!p005kotlin.jvm.internal.s.g(id5, lF));
                kVar = (fg0.k) next3;
            } else {
                kVar = null;
            }
            if (list != null) {
                arrayList2 = new ArrayList();
                it3 = list.iterator();
                while (it3.hasNext()) {
                    next2 = it3.next();
                    kVar4 = (fg0.k) next2;
                    eventType4 = kVar4.getEventType();
                    if (eventType4 == null && eventType4.f() == z26) {
                        fy1.i.f73924a.getClass();
                        if (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, r14, r14, 6, r14)).o()) {
                            it3 = it3;
                            hVar5 = hVar6;
                        } else {
                            eventType5 = kVar4.getEventType();
                            if (eventType5 != null) {
                                fy1.i.f73924a.getClass();
                                if (!((rt1.m) KoinJavaComponent.get$default(rt1.m.class, r14, r14, 6, r14)).d()) {
                                    it3 = it3;
                                    hVar5 = hVar6;
                                }
                            }
                            eventType6 = kVar4.getEventType();
                            if (eventType6 == null) {
                                it3 = it3;
                                hVar5 = hVar6;
                            } else {
                                it3 = it3;
                                hVar5 = hVar6;
                            }
                        }
                    } else {
                        eventType5 = kVar4.getEventType();
                        if (eventType5 != null && eventType5.e() == z26) {
                            fy1.i.f73924a.getClass();
                            if (!((rt1.m) KoinJavaComponent.get$default(rt1.m.class, r14, r14, 6, r14)).d()) {
                                it3 = it3;
                                hVar5 = hVar6;
                            }
                        }
                        eventType6 = kVar4.getEventType();
                        if (eventType6 == null && eventType6.g() == z26 && hVar6.R6() && ((list3 = hVar6.f13388u1) == null || !list3.isEmpty())) {
                            Iterator it5 = list3.iterator();
                            ?? r15 = r14;
                            while (true) {
                                if (it5.hasNext()) {
                                    tw1.m mVar = (tw1.m) it5.next();
                                    tw1.n trainingPlanType = mVar.getTrainingPlanType();
                                    if ((trainingPlanType != null ? trainingPlanType.b() : r15) != vt1.o.f180178i || (((trainingPlanSubType = mVar.getTrainingPlanSubType()) == null || trainingPlanSubType.b(ww1.l.TRIATHLON_EVENT_BASED) != z26) && ((trainingPlanSubType2 = mVar.getTrainingPlanSubType()) == null || trainingPlanSubType2.b(ww1.l.TRIATHLON_OPEN_LOOP) != z26))) {
                                        hVar6 = hVar6;
                                        it3 = it3;
                                        i15 = 3;
                                        i16 = 2;
                                        z26 = true;
                                        r15 = 0;
                                    } else {
                                        fy1.e eVar = fy1.e.f73896a;
                                        fg0.d completionTarget3 = kVar4.getCompletionTarget();
                                        eVar.getClass();
                                        if (completionTarget3 == null) {
                                            zContains = false;
                                        } else {
                                            Double value2 = completionTarget3.getValue();
                                            gg0.i unit = completionTarget3.getUnit();
                                            if (value2 == null || unit == null) {
                                                zContains = false;
                                            } else {
                                                int i19 = fy1.e.d.f73915c[unit.ordinal()];
                                                if (i19 == z26) {
                                                    fy1.e.c.f73908a.getClass();
                                                    j23.d dVar = fy1.e.c.f73909b;
                                                    double d15 = dVar.f96787a;
                                                    fy1.e.a.f73898a.getClass();
                                                    j23.d dVar2 = fy1.e.a.f73899b;
                                                    double d16 = dVar2.f96787a + d15;
                                                    fy1.e.b.f73903a.getClass();
                                                    j23.d dVar3 = fy1.e.b.f73904b;
                                                    zContains = new j23.d(dVar3.f96787a + d16, dVar3.f96788b + dVar2.f96788b + dVar.f96788b).contains(value2);
                                                } else if (i19 == i16) {
                                                    fy1.e.c.f73908a.getClass();
                                                    j23.d dVar4 = fy1.e.c.f73910c;
                                                    double d17 = dVar4.f96787a;
                                                    fy1.e.a.f73898a.getClass();
                                                    j23.d dVar5 = fy1.e.a.f73900c;
                                                    double d18 = dVar5.f96787a + d17;
                                                    fy1.e.b.f73903a.getClass();
                                                    j23.d dVar6 = fy1.e.b.f73905c;
                                                    zContains = new j23.d(dVar6.f96787a + d18, dVar6.f96788b + dVar5.f96788b + dVar4.f96788b).contains(value2);
                                                } else if (i19 == i15) {
                                                    fg0.z zVar3 = zVar;
                                                    fy1.e.c.f73908a.getClass();
                                                    j23.d dVar7 = fy1.e.c.f73911d;
                                                    double d19 = dVar7.f96787a;
                                                    fy1.e.a.f73898a.getClass();
                                                    j23.d dVar8 = fy1.e.a.f73901d;
                                                    double d24 = dVar8.f96787a + d19;
                                                    fy1.e.b.f73903a.getClass();
                                                    j23.d dVar9 = fy1.e.b.f73906d;
                                                    double d25 = dVar9.f96787a + d24;
                                                    double d26 = dVar7.f96788b;
                                                    zVar = zVar3;
                                                    zContains = new j23.d(d25, dVar9.f96788b + dVar8.f96788b + d26).contains(value2);
                                                } else if (i19 != 4) {
                                                    zContains = false;
                                                } else {
                                                    fy1.e.c.f73908a.getClass();
                                                    j23.d dVar10 = fy1.e.c.f73912e;
                                                    double d27 = dVar10.f96787a;
                                                    fy1.e.a.f73898a.getClass();
                                                    j23.d dVar11 = fy1.e.a.f73902e;
                                                    double d28 = dVar11.f96787a + d27;
                                                    fy1.e.b.f73903a.getClass();
                                                    j23.d dVar12 = fy1.e.b.f73907e;
                                                    zContains = new j23.d(dVar12.f96787a + d28, dVar12.f96788b + dVar11.f96788b + dVar10.f96788b).contains(value2);
                                                    zVar = zVar;
                                                }
                                            }
                                        }
                                        if (zContains) {
                                            fg0.d completionTarget4 = kVar4.getCompletionTarget();
                                            hVar5 = hVar6;
                                            z25 = (((completionTarget4 == null || (dB = completionTarget4.b()) == null) ? 0.0d : dB.doubleValue()) > tu1.a.i(hVar5.f13389v1) ? 1 : (((completionTarget4 == null || (dB = completionTarget4.b()) == null) ? 0.0d : dB.doubleValue()) == tu1.a.i(hVar5.f13389v1) ? 0 : -1)) <= 0;
                                        } else {
                                            hVar5 = hVar6;
                                        }
                                    }
                                } else {
                                    it3 = it3;
                                    hVar5 = hVar6;
                                }
                            }
                        } else {
                            it3 = it3;
                            hVar5 = hVar6;
                        }
                    }
                    if (z25) {
                        arrayList2.add(next2);
                    }
                    hVar6 = hVar5;
                    it3 = it3;
                    i15 = 3;
                    i16 = 2;
                    z26 = true;
                    r14 = 0;
                }
                hVar2 = hVar6;
                arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    kVar3 = (fg0.k) obj2;
                    if (hVar2.R6()) {
                        eventType = kVar3.getEventType();
                        if (eventType == null && eventType.f()) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18 || !hVar2.V5()) {
                            eventType2 = kVar3.getEventType();
                            if (eventType2 == null && eventType2.e()) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19 || !hVar2.U5()) {
                                eventType3 = kVar3.getEventType();
                                if (eventType3 == null && eventType3.g()) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                if (z24) {
                                }
                                zVar2 = zVar;
                                hVar4 = hVar2;
                                zB = false;
                            }
                        }
                        zVar2 = zVar;
                        hVar4 = hVar2;
                        zB = true;
                    } else {
                        sVarI6 = hVar2.i6();
                        if (sVarI6 != null) {
                            hVar3 = sVarI6.f101127f;
                        } else {
                            hVar3 = null;
                        }
                        if (hVar3 instanceof jv1.g) {
                            if (hVar2.b7()) {
                                d14 = ((jv1.g) hVar3).f101056e;
                                if (d14 != null) {
                                    double dDoubleValue2 = d14.doubleValue();
                                    completionTarget2 = kVar3.getCompletionTarget();
                                    if (completionTarget2 != null) {
                                        dValueOf = Double.valueOf(completionTarget2.d());
                                    } else {
                                        dValueOf = null;
                                    }
                                    og0.a.f131967a.getClass();
                                    fg0.v vVarL = og0.a.l(dDoubleValue2);
                                    if (dValueOf != null) {
                                        dDoubleValue = dValueOf.doubleValue();
                                    } else {
                                        dDoubleValue = 0.0d;
                                    }
                                    zB = vVarL.b(dDoubleValue);
                                    zVar2 = zVar;
                                    hVar4 = hVar2;
                                }
                            } else if (((jv1.g) hVar3).f101054c == kVar3.v1()) {
                                zVar2 = zVar;
                                hVar4 = hVar2;
                                zB = true;
                            }
                            zVar2 = zVar;
                            hVar4 = hVar2;
                            zB = false;
                        } else {
                            if ((hVar3 instanceof jv1.i) || !hVar2.O6() || (completionTarget = kVar3.getCompletionTarget()) == null || !completionTarget.o()) {
                                zVar2 = zVar;
                                hVar4 = hVar2;
                            } else {
                                double d29 = ((jv1.i) hVar3).f101059c;
                                fg0.d completionTarget5 = kVar3.getCompletionTarget();
                                Long lValueOf = (completionTarget5 == null || (value = completionTarget5.getValue()) == null) ? null : Long.valueOf((long) value.doubleValue());
                                if (lValueOf != null) {
                                    og0.a aVar6 = og0.a.f131967a;
                                    long j8 = (long) d29;
                                    long jLongValue = lValueOf.longValue();
                                    aVar6.getClass();
                                    long j14 = 60;
                                    long j15 = jLongValue / j14;
                                    zVar2 = zVar;
                                    hVar4 = hVar2;
                                    long j16 = (((long) 5) * j15) / ((long) 100);
                                    o13.p pVar = new o13.p(Long.valueOf((j15 - j16) * j14), Long.valueOf((j15 + j16) * j14));
                                    long jLongValue2 = ((Number) pVar.f128594a).longValue();
                                    if (j8 <= ((Number) pVar.f128595b).longValue() && jLongValue2 <= j8) {
                                        zB = true;
                                    }
                                } else {
                                    zVar2 = zVar;
                                    hVar4 = hVar2;
                                }
                            }
                            zB = false;
                        }
                    }
                    if (zB) {
                        arrayList3.add(obj2);
                    }
                    zVar = zVar2;
                    hVar2 = hVar4;
                }
                hVar = hVar2;
                arrayList = new ArrayList(arrayList3);
                zVar = zVar;
            } else {
                hVar = hVar6;
                arrayList = null;
            }
            if (hVar.R6() && hVar.b7() && arrayList != null) {
                z14 = false;
                p13.d0.A(arrayList, new androidx.room.w0(13), false);
            } else {
                z14 = false;
            }
            if (arrayList != null) {
                it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    id3 = ((fg0.k) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    if (kVar != null) {
                        id4 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    } else {
                        id4 = null;
                    }
                } while (!p005kotlin.jvm.internal.s.g(id3, id4));
                kVar2 = (fg0.k) next;
            } else {
                kVar2 = null;
            }
            if (kVar2 != null) {
                z15 = true;
            } else {
                z15 = z14;
            }
            if (z15 && arrayList != null) {
                p005kotlin.jvm.internal.y0.a(arrayList).remove(kVar);
            }
            str = this.f13404h;
            if (kVar != null) {
                if (arrayList != null || arrayList.isEmpty()) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (z17) {
                    if (str != null) {
                        hVar.s6().j(str);
                    }
                    u62.z.h(g3.f35298f, null, hVar.u6());
                } else if (kVar == null) {
                    Boolean boolValueOf = Boolean.valueOf(z15);
                    if (zVar != null) {
                        strB = zVar.getEventName();
                    } else {
                        strB = null;
                    }
                    fw1.a aVar7 = new fw1.a(arrayList, kVar, list2, boolValueOf, strB);
                    y0<g3<fw1.a>> y0VarU6 = hVar.u6();
                    g3.f35298f.getClass();
                    y0VarU6.j(g3.a.d(aVar7));
                    if (str != null) {
                        hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                    }
                } else {
                    if (arrayList != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (z16) {
                        Boolean boolValueOf2 = Boolean.valueOf(z15);
                        if (zVar != null) {
                            strB = zVar.getEventName();
                        } else {
                            strB = null;
                        }
                        fw1.a aVar8 = new fw1.a(arrayList, kVar, list2, boolValueOf2, strB);
                        y0<g3<fw1.a>> y0VarU7 = hVar.u6();
                        g3.f35298f.getClass();
                        y0VarU7.j(g3.a.d(aVar8));
                        if (str != null) {
                            hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                        }
                    } else {
                        Boolean boolValueOf3 = Boolean.valueOf(z15);
                        if (zVar != null) {
                            strB = zVar.getEventName();
                        } else {
                            strB = null;
                        }
                        fw1.a aVar9 = new fw1.a(arrayList, kVar, list2, boolValueOf3, strB);
                        y0<g3<fw1.a>> y0VarU8 = hVar.u6();
                        g3.f35298f.getClass();
                        y0VarU8.j(g3.a.d(aVar9));
                        if (str != null) {
                            hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                        }
                    }
                }
            } else if (kVar == null) {
                Boolean boolValueOf4 = Boolean.valueOf(z15);
                if (zVar != null) {
                    strB = zVar.getEventName();
                } else {
                    strB = null;
                }
                fw1.a aVar10 = new fw1.a(arrayList, kVar, list2, boolValueOf4, strB);
                y0<g3<fw1.a>> y0VarU9 = hVar.u6();
                g3.f35298f.getClass();
                y0VarU9.j(g3.a.d(aVar10));
                if (str != null) {
                    hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                }
            } else {
                if (arrayList != null || arrayList.isEmpty()) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (z16 || z15) {
                    Boolean boolValueOf5 = Boolean.valueOf(z15);
                    if (zVar != null) {
                        strB = zVar.getEventName();
                    } else {
                        strB = null;
                    }
                    fw1.a aVar11 = new fw1.a(arrayList, kVar, list2, boolValueOf5, strB);
                    y0<g3<fw1.a>> y0VarU10 = hVar.u6();
                    g3.f35298f.getClass();
                    y0VarU10.j(g3.a.d(aVar11));
                    if (str != null) {
                        hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                    }
                } else if (str != null) {
                    hVar.s6().j(str);
                }
            }
            return Unit.INSTANCE;
            v2Var = (v2) objC;
            this.f13402f = b0Var;
            this.f13397a = null;
            this.f13398b = i0VarJ;
            this.f13399c = v2Var;
            this.f13401e = 2;
            objAwait = j0VarJ.await(this);
            if (objAwait != aVar) {
                v2Var2 = (v2) objAwait;
                this.f13402f = b0Var;
                this.f13397a = null;
                this.f13398b = null;
                this.f13399c = v2Var;
                this.f13400d = v2Var2;
                this.f13401e = 3;
                objAwait2 = i0VarJ.await(this);
                if (objAwait2 != aVar) {
                    v2Var3 = v2Var;
                    v2Var4 = (v2) objAwait2;
                    if (v2Var3 instanceof v2.b) {
                        zVar = (fg0.z) ((v2.b) v2Var3).f47386a;
                    } else {
                        if (v2Var3 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error fetching Primary Events details ");
                        i2.a aVar12 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar12.getClass();
                        i2.a.f(a2Var4, "FBTPlanWizardViewModel", strD3);
                        zVar = null;
                    }
                    if (v2Var2 instanceof v2.b) {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        v2.a aVar13 = (v2.a) v2Var2;
                        String str3 = "Error fetching upcoming events details ErrorCode " + aVar13.f47384b + " :: " + aVar13.f47383a + StringUtils.SPACE;
                        i2.a aVar14 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar14.getClass();
                        i2.a.f(a2Var5, "FBTPlanWizardViewModel", str3);
                        int i110 = h.S1;
                        hVar6.u6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        return Unit.INSTANCE;
                    }
                    list = (List) ((v2.b) v2Var2).f47386a;
                    if (v2Var4 instanceof v2.b) {
                        list2 = (List) ((v2.b) v2Var4).f47386a;
                    } else {
                        if (v2Var4 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var4).f47383a, "Error fetching Primary Events details ");
                        i2.a aVar15 = i2.f36769a;
                        a2 a2Var6 = a2.GENERAL;
                        aVar15.getClass();
                        i2.a.f(a2Var6, "FBTPlanWizardViewModel", strD4);
                        list2 = null;
                    }
                    if (list != null) {
                        it4 = list.iterator();
                        do {
                            if (it4.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it4.next();
                            id5 = ((fg0.k) next3).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            if (zVar != null) {
                                lF = zVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            } else {
                                lF = null;
                            }
                        } while (!p005kotlin.jvm.internal.s.g(id5, lF));
                        kVar = (fg0.k) next3;
                    } else {
                        kVar = null;
                    }
                    if (list != null) {
                        arrayList2 = new ArrayList();
                        it3 = list.iterator();
                        while (it3.hasNext()) {
                            next2 = it3.next();
                            kVar4 = (fg0.k) next2;
                            eventType4 = kVar4.getEventType();
                            if (eventType4 == null) {
                                eventType5 = kVar4.getEventType();
                                if (eventType5 != null) {
                                    fy1.i.f73924a.getClass();
                                    if (!((rt1.m) KoinJavaComponent.get$default(rt1.m.class, r14, r14, 6, r14)).d()) {
                                        it3 = it3;
                                        hVar5 = hVar6;
                                    }
                                }
                                eventType6 = kVar4.getEventType();
                                if (eventType6 == null) {
                                    it3 = it3;
                                    hVar5 = hVar6;
                                } else {
                                    it3 = it3;
                                    hVar5 = hVar6;
                                }
                            } else {
                                eventType5 = kVar4.getEventType();
                                if (eventType5 != null) {
                                    fy1.i.f73924a.getClass();
                                    if (!((rt1.m) KoinJavaComponent.get$default(rt1.m.class, r14, r14, 6, r14)).d()) {
                                        it3 = it3;
                                        hVar5 = hVar6;
                                    }
                                }
                                eventType6 = kVar4.getEventType();
                                if (eventType6 == null) {
                                    it3 = it3;
                                    hVar5 = hVar6;
                                } else {
                                    it3 = it3;
                                    hVar5 = hVar6;
                                }
                            }
                            if (z25) {
                                arrayList2.add(next2);
                            }
                            hVar6 = hVar5;
                            it3 = it3;
                            i15 = 3;
                            i16 = 2;
                            z26 = true;
                            r14 = 0;
                        }
                        hVar2 = hVar6;
                        arrayList3 = new ArrayList();
                        while (r4.hasNext()) {
                            kVar3 = (fg0.k) obj2;
                            if (hVar2.R6()) {
                                eventType = kVar3.getEventType();
                                if (eventType == null) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                if (z18) {
                                    eventType2 = kVar3.getEventType();
                                    if (eventType2 == null) {
                                        z19 = false;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        eventType3 = kVar3.getEventType();
                                        if (eventType3 == null) {
                                            z24 = false;
                                        } else {
                                            z24 = false;
                                        }
                                        if (z24) {
                                        }
                                        zVar2 = zVar;
                                        hVar4 = hVar2;
                                        zB = false;
                                    } else {
                                        eventType3 = kVar3.getEventType();
                                        if (eventType3 == null) {
                                            z24 = false;
                                        } else {
                                            z24 = false;
                                        }
                                        if (z24) {
                                        }
                                        zVar2 = zVar;
                                        hVar4 = hVar2;
                                        zB = false;
                                    }
                                } else {
                                    eventType2 = kVar3.getEventType();
                                    if (eventType2 == null) {
                                        z19 = false;
                                    } else {
                                        z19 = false;
                                    }
                                    if (z19) {
                                        eventType3 = kVar3.getEventType();
                                        if (eventType3 == null) {
                                            z24 = false;
                                        } else {
                                            z24 = false;
                                        }
                                        if (z24) {
                                        }
                                        zVar2 = zVar;
                                        hVar4 = hVar2;
                                        zB = false;
                                    } else {
                                        eventType3 = kVar3.getEventType();
                                        if (eventType3 == null) {
                                            z24 = false;
                                        } else {
                                            z24 = false;
                                        }
                                        if (z24) {
                                        }
                                        zVar2 = zVar;
                                        hVar4 = hVar2;
                                        zB = false;
                                    }
                                }
                            } else {
                                sVarI6 = hVar2.i6();
                                if (sVarI6 != null) {
                                    hVar3 = sVarI6.f101127f;
                                } else {
                                    hVar3 = null;
                                }
                                if (hVar3 instanceof jv1.g) {
                                    if (hVar2.b7()) {
                                        d14 = ((jv1.g) hVar3).f101056e;
                                        if (d14 != null) {
                                            double dDoubleValue3 = d14.doubleValue();
                                            completionTarget2 = kVar3.getCompletionTarget();
                                            if (completionTarget2 != null) {
                                                dValueOf = Double.valueOf(completionTarget2.d());
                                            } else {
                                                dValueOf = null;
                                            }
                                            og0.a.f131967a.getClass();
                                            fg0.v vVarL2 = og0.a.l(dDoubleValue3);
                                            if (dValueOf != null) {
                                                dDoubleValue = dValueOf.doubleValue();
                                            } else {
                                                dDoubleValue = 0.0d;
                                            }
                                            zB = vVarL2.b(dDoubleValue);
                                            zVar2 = zVar;
                                            hVar4 = hVar2;
                                        }
                                    } else if (((jv1.g) hVar3).f101054c == kVar3.v1()) {
                                        zVar2 = zVar;
                                        hVar4 = hVar2;
                                        zB = true;
                                    }
                                    zVar2 = zVar;
                                    hVar4 = hVar2;
                                    zB = false;
                                } else {
                                    if (hVar3 instanceof jv1.i) {
                                        zVar2 = zVar;
                                        hVar4 = hVar2;
                                    } else {
                                        zVar2 = zVar;
                                        hVar4 = hVar2;
                                    }
                                    zB = false;
                                }
                            }
                            if (zB) {
                                arrayList3.add(obj2);
                            }
                            zVar = zVar2;
                            hVar2 = hVar4;
                        }
                        hVar = hVar2;
                        arrayList = new ArrayList(arrayList3);
                        zVar = zVar;
                    } else {
                        hVar = hVar6;
                        arrayList = null;
                    }
                    if (hVar.R6()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            id3 = ((fg0.k) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            if (kVar != null) {
                                id4 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                            } else {
                                id4 = null;
                            }
                        } while (!p005kotlin.jvm.internal.s.g(id3, id4));
                        kVar2 = (fg0.k) next;
                    } else {
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (z15) {
                        p005kotlin.jvm.internal.y0.a(arrayList).remove(kVar);
                    }
                    str = this.f13404h;
                    if (kVar != null) {
                        if (arrayList != null) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (z17) {
                            if (str != null) {
                                hVar.s6().j(str);
                            }
                            u62.z.h(g3.f35298f, null, hVar.u6());
                        } else if (kVar == null) {
                            Boolean boolValueOf6 = Boolean.valueOf(z15);
                            if (zVar != null) {
                                strB = zVar.getEventName();
                            } else {
                                strB = null;
                            }
                            fw1.a aVar16 = new fw1.a(arrayList, kVar, list2, boolValueOf6, strB);
                            y0<g3<fw1.a>> y0VarU11 = hVar.u6();
                            g3.f35298f.getClass();
                            y0VarU11.j(g3.a.d(aVar16));
                            if (str != null) {
                                hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                            }
                        } else {
                            if (arrayList != null) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            if (z16) {
                                Boolean boolValueOf7 = Boolean.valueOf(z15);
                                if (zVar != null) {
                                    strB = zVar.getEventName();
                                } else {
                                    strB = null;
                                }
                                fw1.a aVar17 = new fw1.a(arrayList, kVar, list2, boolValueOf7, strB);
                                y0<g3<fw1.a>> y0VarU12 = hVar.u6();
                                g3.f35298f.getClass();
                                y0VarU12.j(g3.a.d(aVar17));
                                if (str != null) {
                                    hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                                }
                            } else {
                                Boolean boolValueOf8 = Boolean.valueOf(z15);
                                if (zVar != null) {
                                    strB = zVar.getEventName();
                                } else {
                                    strB = null;
                                }
                                fw1.a aVar18 = new fw1.a(arrayList, kVar, list2, boolValueOf8, strB);
                                y0<g3<fw1.a>> y0VarU13 = hVar.u6();
                                g3.f35298f.getClass();
                                y0VarU13.j(g3.a.d(aVar18));
                                if (str != null) {
                                    hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                                }
                            }
                        }
                    } else if (kVar == null) {
                        Boolean boolValueOf9 = Boolean.valueOf(z15);
                        if (zVar != null) {
                            strB = zVar.getEventName();
                        } else {
                            strB = null;
                        }
                        fw1.a aVar19 = new fw1.a(arrayList, kVar, list2, boolValueOf9, strB);
                        y0<g3<fw1.a>> y0VarU14 = hVar.u6();
                        g3.f35298f.getClass();
                        y0VarU14.j(g3.a.d(aVar19));
                        if (str != null) {
                            hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                        }
                    } else {
                        if (arrayList != null) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            Boolean boolValueOf10 = Boolean.valueOf(z15);
                            if (zVar != null) {
                                strB = zVar.getEventName();
                            } else {
                                strB = null;
                            }
                            fw1.a aVar110 = new fw1.a(arrayList, kVar, list2, boolValueOf10, strB);
                            y0<g3<fw1.a>> y0VarU15 = hVar.u6();
                            g3.f35298f.getClass();
                            y0VarU15.j(g3.a.d(aVar110));
                            if (str != null) {
                                hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                            }
                        } else {
                            Boolean boolValueOf11 = Boolean.valueOf(z15);
                            if (zVar != null) {
                                strB = zVar.getEventName();
                            } else {
                                strB = null;
                            }
                            fw1.a aVar111 = new fw1.a(arrayList, kVar, list2, boolValueOf11, strB);
                            y0<g3<fw1.a>> y0VarU16 = hVar.u6();
                            g3.f35298f.getClass();
                            y0VarU16.j(g3.a.d(aVar111));
                            if (str != null) {
                                hVar.s6().j("FBTUserUpcomingEventsFragCompose");
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$processCoachData$1", f = "FBTPlanWizardViewModel.kt", l = {1910}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13417b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ vt1.f f13419d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(vt1.f fVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f13419d = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = h.this.new e(this.f13419d, dVar);
            eVar.f13417b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<xw1.h> list;
            List<xw1.h> list2;
            o53.b0 b0Var = (o53.b0) this.f13417b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13416a;
            Integer num = null;
            vt1.f fVar = this.f13419d;
            h hVar = h.this;
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = h.S1;
                ((y0) hVar.f13374h1.getValue()).j(Boolean.TRUE);
                String f180089b = fVar.getF180089b();
                this.f13417b = b0Var;
                this.f13416a = 1;
                obj = hVar.O5(f180089b, this);
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
            jv1.f fVar2 = (jv1.f) obj;
            hVar.f13386s1 = (fVar2 == null || (list2 = fVar2.f101049c) == null || !list2.isEmpty()) ? false : true;
            hVar.s6().j("FBTNoCompatiblePlansFragment");
            ((y0) hVar.f13374h1.getValue()).j(null);
            if (fVar2 != null && (list = fVar2.f101049c) != null) {
                num = new Integer(list.size());
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.n(a2Var, "FBTPlanWizardViewModel", "attempted to check " + fVar + " to have any coachPlans " + num);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public h() {
        uw1.b.f172999a.getClass();
        this.T = new uw1.b();
        this.X = o13.m.b(new ak0.t(27));
        this.Y = o13.m.b(new ak0.t(28));
        this.Z = o13.m.b(new aw1.d(8));
        this.f13377k0 = s6();
        this.H0 = o13.m.b(new aw1.d(12));
        this.K0 = o13.m.b(new aw1.d(13));
        this.L0 = o13.m.b(new aw1.d(14));
        this.M0 = u6();
        this.N0 = t1.a(J5(), new androidx.room.w0(this));
        this.O0 = o13.m.b(new aw1.d(16));
        final int i14 = 4;
        this.P0 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                h hVar = this.f13334b;
                switch (i15) {
                    case 0:
                        int i16 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i17 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i18 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i19 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i24 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i25 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i26 = h.S1;
                        return hVar.r6();
                    default:
                        int i27 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        this.Q0 = o13.m.b(new aw1.d(17));
        final int i15 = 2;
        this.R0 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                h hVar = this.f13334b;
                switch (i16) {
                    case 0:
                        int i17 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i18 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i19 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i110 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i24 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i25 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i26 = h.S1;
                        return hVar.r6();
                    default:
                        int i27 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        this.S0 = o13.m.b(new aw1.d(15));
        final int i16 = 5;
        this.T0 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                h hVar = this.f13334b;
                switch (i17) {
                    case 0:
                        int i18 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i19 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i110 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i111 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i24 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i25 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i26 = h.S1;
                        return hVar.r6();
                    default:
                        int i27 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        this.U0 = t1.a(J5(), new aw1.e(this, 10));
        this.V0 = o13.m.b(new aw1.d(18));
        final int i17 = 6;
        this.W0 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                h hVar = this.f13334b;
                switch (i18) {
                    case 0:
                        int i19 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i110 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i111 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i112 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i24 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i25 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i26 = h.S1;
                        return hVar.r6();
                    default:
                        int i27 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        this.X0 = o13.m.b(new aw1.d(19));
        final int i18 = 7;
        this.Y0 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                h hVar = this.f13334b;
                switch (i19) {
                    case 0:
                        int i110 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i111 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i112 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i113 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i24 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i25 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i26 = h.S1;
                        return hVar.r6();
                    default:
                        int i27 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        this.Z0 = o13.m.b(new aw1.d(20));
        final int i19 = 0;
        this.f13367a1 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i19;
                h hVar = this.f13334b;
                switch (i110) {
                    case 0:
                        int i111 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i112 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i113 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i114 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i24 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i25 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i26 = h.S1;
                        return hVar.r6();
                    default:
                        int i27 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        this.f13368b1 = o13.m.b(new ak0.t(29));
        final int i24 = 1;
        this.f13369c1 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i24;
                h hVar = this.f13334b;
                switch (i110) {
                    case 0:
                        int i111 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i112 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i113 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i114 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i25 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i26 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i27 = h.S1;
                        return hVar.r6();
                    default:
                        int i28 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        o13.t tVarB = o13.m.b(new aw1.d(0));
        this.f13370d1 = tVarB;
        this.f13371e1 = (y0) tVarB.getValue();
        this.f13372f1 = o13.m.b(new aw1.d(1));
        this.f13373g1 = t6();
        o13.t tVarB2 = o13.m.b(new aw1.d(2));
        this.f13374h1 = tVarB2;
        this.f13375i1 = (y0) tVarB2.getValue();
        o13.t tVarB3 = o13.m.b(new aw1.d(3));
        this.f13376j1 = tVarB3;
        this.f13378k1 = (y0) tVarB3.getValue();
        o13.t tVarB4 = o13.m.b(new aw1.d(4));
        this.f13379l1 = tVarB4;
        this.f13380m1 = (y0) tVarB4.getValue();
        o13.t tVarB5 = o13.m.b(new aw1.d(5));
        this.f13381n1 = tVarB5;
        this.f13382o1 = (y0) tVarB5.getValue();
        fy1.i.f73924a.getClass();
        this.f13383p1 = fy1.i.a.q();
        this.f13384q1 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        this.f13387t1 = new LinkedHashSet();
        p13.j0 j0Var = p13.j0.f134944a;
        this.f13388u1 = j0Var;
        this.f13389v1 = j0Var;
        this.f13390w1 = o13.m.b(new aw1.d(6));
        this.f13391x1 = vt1.o.f180175f;
        p2 p2VarA = q2.a(Boolean.FALSE);
        this.f13392y1 = p2VarA;
        this.f13393z1 = r53.s.d(p2VarA);
        o13.t tVarB6 = o13.m.b(new aw1.d(7));
        this.A1 = tVarB6;
        this.B1 = (y0) tVarB6.getValue();
        this.C1 = o13.m.b(new aw1.d(9));
        J5().m(new jv1.s(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511, null));
        y0<g3<jv1.l>> y0Var = new y0<>();
        this.D1 = y0Var;
        this.E1 = y0Var;
        this.H1 = o13.m.b(new aw1.d(10));
        this.I1 = o6();
        this.J1 = o13.m.b(new aw1.d(11));
        final int i25 = 3;
        this.K1 = o13.m.b(new e23.a(this) { // from class: aw1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13334b;

            {
                this.f13334b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i25;
                h hVar = this.f13334b;
                switch (i110) {
                    case 0:
                        int i111 = h.S1;
                        return hVar.m6();
                    case 1:
                        int i112 = h.S1;
                        return hVar.p6();
                    case 2:
                        int i113 = h.S1;
                        return hVar.q6();
                    case 3:
                        int i114 = h.S1;
                        return (y0) hVar.J1.getValue();
                    case 4:
                        int i26 = h.S1;
                        return hVar.n6();
                    case 5:
                        int i27 = h.S1;
                        return hVar.k6();
                    case 6:
                        int i28 = h.S1;
                        return hVar.r6();
                    default:
                        int i29 = h.S1;
                        return (y0) hVar.X0.getValue();
                }
            }
        });
        p2 p2VarA2 = q2.a(null);
        this.L1 = p2VarA2;
        this.M1 = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(null);
        this.Q1 = p2VarA3;
        this.R1 = r53.s.d(p2VarA3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object X4(h hVar, v13.c cVar) {
        i iVar;
        Object next;
        tw1.m mVar;
        hVar.getClass();
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f13434d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f13434d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(hVar, cVar);
            }
        } else {
            iVar = new i(hVar, cVar);
        }
        Object objB = iVar.f13432b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f13434d;
        if (i15 == 0) {
            o13.r.b(objB);
            uw1.b bVar = hVar.T;
            iVar.f13434d = 1;
            objB = bVar.b(iVar);
            if (objB != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objB);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mVar = iVar.f13431a;
            o13.r.b(objB);
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "FBTPlanWizardViewModel", "attemptToRecoverAfterFBTPlanCreationFailed: Found active FBT plan, returning success");
        y0<g3<tw1.m>> y0VarR6 = hVar.r6();
        g3.f35298f.getClass();
        y0VarR6.j(g3.a.d(mVar));
        return Unit.INSTANCE;
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            List<tw1.m> listA = ((tw1.o) ((v2.b) v2Var).f47386a).a();
            if (listA != null) {
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((tw1.m) next).a0());
                tw1.m mVar2 = (tw1.m) next;
                if (mVar2 != null) {
                    iVar.f13431a = mVar2;
                    iVar.f13434d = 2;
                    if (hVar.h8(mVar2, iVar) != obj) {
                        mVar = mVar2;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var2, "FBTPlanWizardViewModel", "attemptToRecoverAfterFBTPlanCreationFailed: Found active FBT plan, returning success");
                        y0<g3<tw1.m>> y0VarR7 = hVar.r6();
                        g3.f35298f.getClass();
                        y0VarR7.j(g3.a.d(mVar));
                    }
                    return obj;
                }
            }
            hVar.r6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "FBTPlanWizardViewModel", "attemptToRecoverAfterFBTPlanCreationFailed: Could not find an active FBT plan.");
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar4 = (v2.a) v2Var;
            hVar.r6().j(g3.a.a(g3.f35298f, aVar4.f47385c, aVar4.f47383a, null, null, 12));
            String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar4.f47383a, "attemptToRecoverAfterFBTPlanCreationFailed: Get Training plan API call failed ");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var4, "FBTPlanWizardViewModel", strD);
        }
        return Unit.INSTANCE;
    }

    public static final jv1.z Y4(h hVar, jv1.e0 e0Var, tw1.m mVar) {
        tw1.k kVar;
        tw1.k kVarB;
        tw1.l trainingLevel;
        List<tw1.h> listS;
        tw1.h hVar2;
        hVar.getClass();
        List<String> listB = e0Var.b();
        if (listB == null) {
            listB = p13.j0.f134944a;
        }
        List<String> listD = e0Var.d();
        if (listD == null) {
            listD = p13.j0.f134944a;
        }
        List<String> listH = mVar != null ? mVar.h() : null;
        vt1.h.a aVar = vt1.h.f180113e;
        String str = (mVar == null || (listS = mVar.s()) == null || (hVar2 = (tw1.h) p13.h0.d0(listS)) == null) ? null : hVar2.f166715a;
        aVar.getClass();
        vt1.h hVarA = vt1.h.a.a(str);
        if (hVar.c8()) {
            if (mVar == null || (trainingLevel = mVar.getTrainingLevel()) == null || (kVarB = trainingLevel.b()) == null) {
                kVarB = tw1.k.INTERMEDIATE;
            }
            kVar = kVarB;
        } else {
            kVar = null;
        }
        vt1.o oVarA6 = hVar.a6();
        if (oVarA6 == null) {
            oVarA6 = vt1.o.f180175f;
        }
        return new jv1.z(oVarA6, hVar.f13383p1, q7(listB), q7(listD), listH != null ? q7(listH) : null, mVar != null ? mVar.getSwimAbility() : null, hVarA, hVar.c8(), kVar);
    }

    public static final Integer Z4(h hVar, int i14) {
        Integer numE;
        LocalDate localDateG5 = hVar.G5();
        jv1.h hVarE5 = hVar.E5();
        jv1.g gVar = hVarE5 instanceof jv1.g ? (jv1.g) hVarE5 : null;
        if (gVar != null) {
            og0.a aVar = og0.a.f131967a;
            Double d14 = gVar.f101057a;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            gg0.i iVar = gVar.f101058b;
            if (iVar == null) {
                iVar = gg0.i.METER;
            }
            aVar.getClass();
            double dG = og0.a.g(dDoubleValue, iVar);
            tu1.i.f166483a.getClass();
            numE = tu1.i.a.e(dG, i14);
        } else {
            numE = null;
        }
        if (localDateG5 != null && numE != null) {
            int iIntValue = numE.intValue();
            int weeks = Weeks.weeksBetween(LocalDate.now(), localDateG5).getWeeks();
            if (iIntValue > weeks) {
                return Integer.valueOf(weeks);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r7 == r1) goto L41;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0078, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a5(h hVar, v13.c cVar) {
        s sVar;
        v2 v2Var;
        hVar.getClass();
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f13563c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f13563c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(hVar, cVar);
            }
        } else {
            sVar = new s(hVar, cVar);
        }
        Object objE = sVar.f13561a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f13563c;
        if (i15 == 0) {
            o13.r.b(objE);
            jv1.s sVarI6 = hVar.i6();
            v2Var = null;
            if ((sVarI6 != null ? sVarI6.f101124c : null) != null) {
                sVar.f13563c = 2;
                objE = o53.c0.e(new j0(hVar, null), sVar);
            } else {
                if ((sVarI6 != null ? sVarI6.f101145x : null) != null) {
                    sVar.f13563c = 2;
                    objE = o53.c0.e(new j0(hVar, null), sVar);
                } else {
                    if ((sVarI6 != null ? sVarI6.f101146y : null) == null) {
                        jv1.s sVarI7 = hVar.i6();
                        if (sVarI7 != null) {
                            fg0.k kVarL = sVarI7.l();
                            sVar.f13563c = 1;
                            objE = o53.c0.e(new i0(hVar, kVarL, null), sVar);
                        }
                        if (v2Var instanceof v2.a) {
                            v2.a aVar2 = (v2.a) v2Var;
                            String str = "Error occurred while creating background event after plan creation " + aVar2.f47384b + " :: " + aVar2.f47383a;
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var, "FBTPlanWizardViewModel", str);
                            return Boolean.FALSE;
                        }
                    } else {
                        sVar.f13563c = 2;
                        objE = o53.c0.e(new j0(hVar, null), sVar);
                    }
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objE);
            v2Var = (v2) objE;
            if (v2Var instanceof v2.a) {
                v2.a aVar4 = (v2.a) v2Var;
                String str2 = "Error occurred while creating background event after plan creation " + aVar4.f47384b + " :: " + aVar4.f47383a;
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var2, "FBTPlanWizardViewModel", str2);
                return Boolean.FALSE;
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
            v2 v2Var2 = (v2) objE;
            if (v2Var2 instanceof v2.a) {
                hVar.r6().j(g3.a.a(g3.f35298f, "Error adding the event to the calendar or making it the primary event.", ((v2.a) v2Var2).f47383a, null, null, 12));
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static final Object b5(h hVar, vt1.o oVar, v13.i iVar) {
        jv1.y yVar;
        jv1.s sVarI6 = hVar.i6();
        return (sVarI6 == null || (yVar = sVarI6.D) == null) ? v5(hVar, oVar, iVar) : yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList c5(h hVar, List list) {
        int i14;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        jv1.s sVar = (jv1.s) hVar.j6().d();
        Object obj = null;
        vt1.d dVar = sVar != null ? sVar.f101126e : null;
        jv1.s sVar2 = (jv1.s) hVar.j6().d();
        jv1.h hVar2 = sVar2 != null ? sVar2.f101127f : null;
        ArrayList arrayList = new ArrayList();
        if (hVar2 instanceof jv1.g) {
            og0.a aVar = og0.a.f131967a;
            jv1.g gVar = (jv1.g) hVar2;
            Double d14 = gVar.f101056e;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            gg0.i iVar = gVar.f101055d;
            if (iVar == null) {
                iVar = gg0.i.KILOMETER;
            }
            aVar.getClass();
            double dG = og0.a.g(dDoubleValue, iVar);
            l3.f23124b.getClass();
            double dRint = Math.rint(dG / 1609.344d);
            i14 = dVar != null ? b.f13396c[dVar.ordinal()] : -1;
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                if (pu1.d.RACE_DISTANCE_RANGE.a(dRint)) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it.next();
                    } while (((tw1.c) next4).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != vt1.k.RACE.f180146a);
                    tw1.c cVar = (tw1.c) next4;
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                if (pu1.d.TIME_TRIAL_RANGE.a(dRint) && dVar != vt1.d.f180090c) {
                    Iterator it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (((tw1.c) next3).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != vt1.k.TIME_TRIAL.f180146a);
                    tw1.c cVar2 = (tw1.c) next3;
                    if (cVar2 != null) {
                        arrayList.add(cVar2);
                    }
                }
                if (pu1.d.METRIC_CYCLING_DISTANCE_RANGE.a(dRint)) {
                    Iterator it4 = list.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                    } while (((tw1.c) next2).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != vt1.k.METRIC_CENTURY.f180146a);
                    tw1.c cVar3 = (tw1.c) next2;
                    if (cVar3 != null) {
                        arrayList.add(cVar3);
                    }
                }
                if (pu1.d.GRAN_FONDO_DISTANCE_RANGE.a(dRint)) {
                    Iterator it5 = list.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                    } while (((tw1.c) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != vt1.k.GRAND_FONDO.f180146a);
                    tw1.c cVar4 = (tw1.c) next;
                    if (cVar4 != null) {
                        arrayList.add(cVar4);
                    }
                }
                if (pu1.d.CENTURY_DISTANCE_RANGE.a(dRint)) {
                    for (Object obj2 : list) {
                        if (((tw1.c) obj2).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == vt1.k.CENTURY.f180146a) {
                            obj = obj2;
                            break;
                        }
                    }
                    tw1.c cVar5 = (tw1.c) obj;
                    if (cVar5 != null) {
                        arrayList.add(cVar5);
                        return arrayList;
                    }
                }
            } else if (i14 == 4) {
                for (Object obj3 : list) {
                    if (((tw1.c) obj3).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == vt1.k.MOUNTAIN_BIKING.f180146a) {
                        obj = obj3;
                        break;
                    }
                }
                tw1.c cVar6 = (tw1.c) obj;
                if (cVar6 != null) {
                    arrayList.add(cVar6);
                    return arrayList;
                }
            }
        } else if (hVar2 instanceof jv1.i) {
            l3.a aVar2 = l3.f23124b;
            double d15 = ((jv1.i) hVar2).f101059c;
            aVar2.getClass();
            double d16 = d15 / 60.0d;
            i14 = dVar != null ? b.f13396c[dVar.ordinal()] : -1;
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                if (pu1.d.CYCLING_TIME_RANGE_1.a(d16)) {
                    for (Object obj4 : list) {
                        if (((tw1.c) obj4).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == vt1.k.RACE.f180146a) {
                            obj = obj4;
                            break;
                        }
                    }
                    tw1.c cVar7 = (tw1.c) obj;
                    if (cVar7 != null) {
                        arrayList.add(cVar7);
                    }
                }
            } else if (i14 == 4) {
                for (Object obj5 : list) {
                    if (((tw1.c) obj5).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == vt1.k.MOUNTAIN_BIKING.f180146a) {
                        obj = obj5;
                        break;
                    }
                }
                tw1.c cVar8 = (tw1.c) obj;
                if (cVar8 != null) {
                    arrayList.add(cVar8);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d5(h hVar, v13.c cVar) {
        w wVar;
        hVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f13578c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f13578c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(hVar, cVar);
            }
        } else {
            wVar = new w(hVar, cVar);
        }
        Object objJ = wVar.f13576a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f13578c;
        if (i15 == 0) {
            o13.r.b(objJ);
            kv1.y yVarH6 = hVar.h6();
            wVar.f13578c = 1;
            yVarH6.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(yVarH6, new kv1.z(yVarH6, null), wVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting adaptive workout types: ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
        return null;
    }

    public static vt1.n i5(jv1.g gVar) {
        vt1.n nVar = gVar.f101054c;
        if (nVar != vt1.n.OTHER) {
            return nVar;
        }
        og0.a aVar = og0.a.f131967a;
        Double d14 = gVar.f101056e;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        gg0.i iVar = gVar.f101055d;
        if (iVar == null) {
            iVar = gg0.i.METER;
        }
        aVar.getClass();
        return og0.a.h(og0.a.g(dDoubleValue, iVar));
    }

    public static void n7(h hVar, androidx.fragment.app.m mVar) {
        hVar.getClass();
        zf0.c cVar = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
        jv1.s sVarI6 = hVar.i6();
        cVar.e(mVar, sVarI6 != null ? sVarI6.G : null, hVar.C5("TI_TRIATHLON_EVENT_TYPE_SCREEN"), hVar.Y5());
    }

    public static List q7(List list) {
        tu1.i.f166483a.getClass();
        ArrayList arrayListL = tu1.i.a.l(list);
        if (arrayListL == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListL, 10));
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object v5(h hVar, vt1.o oVar, v13.c cVar) {
        u uVar;
        h hVar2 = hVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f13573c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f13573c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(cVar);
            }
        } else {
            uVar = new u(cVar);
        }
        Object objJ = uVar.f13572b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f13573c;
        if (i15 == 0) {
            o13.r.b(objJ);
            kv1.b bVar = hVar2.I;
            String str = oVar.f180185b;
            fy1.i.f73924a.getClass();
            String str2 = fy1.i.a.C1501a.f73937a[oVar.ordinal()] == 1 ? "duration" : "distance";
            uVar.f13571a = hVar2;
            uVar.f13573c = 1;
            bVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv1.k(bVar, str, str2, null), uVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hVar2 = uVar.f13571a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            jv1.s sVarI6 = hVar2.i6();
            hVar2.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (jv1.y) ((v2.b) v2Var).f47386a, null, null, null, null, null, null, null, null, null, null, null, -536870913, 511) : null);
            return (jv1.y) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        String str3 = "fetchRecentTrainingStats: " + aVar2.f47383a + " :: " + aVar2.f47384b;
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "FBTPlanWizardViewModel", str3);
        return null;
    }

    public final androidx.lifecycle.s0<g3<jv1.f>> A5() {
        return (androidx.lifecycle.s0) this.P0.getValue();
    }

    public final void A6(jv1.o oVar, Double d14) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, oVar, d14, null, null, null, -1, 271) : null);
        if (this.N1) {
            return;
        }
        if (X7()) {
            s6().j("FBTHillTypeFragment");
        } else {
            C6(hv1.e.FLAT);
        }
    }

    public final fg0.k B5() {
        fw1.a aVar;
        g3<fw1.a> g3VarD = u6().d();
        if (g3VarD == null || (aVar = g3VarD.f35301b) == null) {
            return null;
        }
        return aVar.f73780b;
    }

    public final void B6(vt1.f fVar, String str, boolean z14) {
        fVar.getClass();
        str.getClass();
        D7(fVar);
        if (z14) {
            if (w6()) {
                s6().j("FBTAddGoalDataFragment");
                return;
            }
            E7(null);
            if (this.f13385r1) {
                return;
            }
            z5(str);
        }
    }

    public final void B7(jv1.x xVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, xVar, null, null, null, null, null, null, null, null, null, null, -1073741825, 511) : null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:174:0x024d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x0256 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:197:0x0286 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:201:0x028f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:296:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:299:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:302:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:305:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:308:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:311:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:314:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:317:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:320:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:327:0x0427 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:399:0x04e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:437:0x0530 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:451:0x054d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:457:0x055a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:461:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final int C5(String str) {
        boolean z14;
        Object[] objArr;
        str.getClass();
        if (!R6()) {
            zv1.b bVar = zv1.b.f207177a;
            boolean zO6 = O6();
            boolean zB7 = b7();
            bVar.getClass();
            if (!str.equals("FBTSelectSportFragmentCompose")) {
                if (!zO6) {
                    if (zB7) {
                        switch (str.hashCode()) {
                            case -1581111839:
                                if (str.equals("FBTHowToEndPlanFragment")) {
                                    return 10;
                                }
                                break;
                            case -956599071:
                                if (str.equals("FBTNameYourPlanFragCompose")) {
                                    return 13;
                                }
                                break;
                            case -681760690:
                                if (str.equals("FBTRunningWeeklyAvgDistancePaceFragCompose")) {
                                    return 2;
                                }
                                break;
                            case -428986585:
                                if (str.equals("TI_LOCATION_SCREEN_TAG")) {
                                    return 14;
                                }
                                break;
                            case -303210716:
                                if (str.equals("FBTReviewInformationFragCompose")) {
                                    return 16;
                                }
                                break;
                            case -156813218:
                                if (str.equals("FBTAvailableTrainingDaysFragCompose")) {
                                    return 8;
                                }
                                break;
                            case 5428568:
                                if (str.equals("FBTCoachSelectionComposeFragment")) {
                                    return 6;
                                }
                                break;
                            case 34354408:
                                if (str.equals("FBTUserUpcomingEventsFragCompose")) {
                                    return 11;
                                }
                                break;
                            case 163527705:
                                if (str.equals("FBTWorkoutsPerWeekSelectionFragment")) {
                                    return 7;
                                }
                                break;
                            case 617385903:
                                if (str.equals("FBTGoalDateSelectionFragmentCompose")) {
                                    return 15;
                                }
                                break;
                            case 988364009:
                                if (str.equals("FBTSelectDistanceOrTimeFragmentCompose")) {
                                    return 3;
                                }
                                break;
                            case 1025935190:
                                if (str.equals("FBTAddGoalDataFragment")) {
                                    return 5;
                                }
                                break;
                            case 1625927119:
                                if (str.equals("TI_EVENT_SEARCH_SCREEN_TAG")) {
                                    return 12;
                                }
                                break;
                            case 1691565655:
                                if (str.equals("FBTGoalTypeSelectionFragment")) {
                                    return 4;
                                }
                                break;
                            case 1935580895:
                                if (str.equals("FBTLongDaysSelectionFragCompose")) {
                                    return 9;
                                }
                                break;
                        }
                    }
                    return 0;
                }
                switch (str) {
                    case "FBTHowToEndPlanFragment":
                        return 10;
                    case "FBTItpHoursPerWeekSelectionFragmentCompose":
                        return 8;
                    case "FBTNameYourPlanFragCompose":
                        return 14;
                    case "TI_LOCATION_SCREEN_TAG":
                        return 15;
                    case "FBTReviewInformationFragCompose":
                        return 17;
                    case "FBTAvailableTrainingDaysFragCompose":
                        return 9;
                    case "FBTCoachSelectionComposeFragment":
                        return 6;
                    case "FBTUserUpcomingEventsFragCompose":
                        return 12;
                    case "FBTItpPlanTypeSelectionFragmentCompose":
                        return 7;
                    case "FBTGoalDateSelectionFragmentCompose":
                        return 16;
                    case "FBTSelectDistanceOrTimeFragmentCompose":
                        return 3;
                    case "FBTAddGoalDataFragment":
                        return 5;
                    case "FBTRideWeeklyAvgHoursFragCompose":
                        return 2;
                    case "TI_EVENT_SEARCH_SCREEN_TAG":
                        return 13;
                    case "FBTGoalTypeSelectionFragment":
                        return 4;
                    case "FBTLongDaysSelectionFragCompose":
                        return 10;
                    default:
                        return 0;
                }
            }
            return 1;
        }
        if (d7()) {
            zv1.b bVar2 = zv1.b.f207177a;
            boolean zO7 = O6();
            boolean zB8 = b7();
            boolean zE7 = e7();
            bVar2.getClass();
            return zv1.b.a(str, zO7, zB8, zE7);
        }
        if (!N6()) {
            if (!Z6()) {
                zv1.b bVar3 = zv1.b.f207177a;
                boolean zO8 = O6();
                boolean zB9 = b7();
                boolean zE8 = e7();
                bVar3.getClass();
                return zv1.b.a(str, zO8, zB9, zE8);
            }
            zv1.b bVar4 = zv1.b.f207177a;
            boolean zO9 = O6();
            boolean zB10 = b7();
            boolean zE9 = e7();
            boolean zX6 = X6();
            boolean zW6 = W6();
            jv1.s sVarI6 = i6();
            if (sVarI6 != null) {
                z14 = zO9;
                if (sVarI6.f101125d == vt1.o.f180181l) {
                    objArr = true;
                }
                bVar4.getClass();
                if (!z14 || zB10) {
                    switch (str) {
                        case "FBTSelectTrainingLevelFragment":
                            return 4;
                        case "FBTReviewScheduleFragment":
                            return 3;
                        case "FBTSelectPlanTypeFragment":
                            return 1;
                        case "FBTReviewInformationFragCompose":
                            return 9;
                        case "FBTAvailableTrainingDaysFragCompose":
                            return 6;
                        case "FBTCoachSelectionComposeFragment":
                            return 2;
                        case "FBTSelectStrengthWorkoutTypeFragment":
                            return 5;
                        case "FBTGoalDateSelectionFragmentCompose":
                            return 8;
                        case "FBTLongDaysSelectionFragCompose":
                            return 7;
                        default:
                            return 0;
                    }
                }
                if (zE9) {
                    switch (str) {
                        case "FBTReviewScheduleFragment":
                            return 3;
                        case "FBTSelectSwimAbilityFragment":
                            return 7;
                        case "FBTSelectPlanTypeFragment":
                            return 1;
                        case "FBTSwimDaysSelectionFragCompose":
                            return 6;
                        case "FBTReviewInformationFragCompose":
                            return 10;
                        case "FBTAvailableTrainingDaysFragCompose":
                            return 4;
                        case "FBTCoachSelectionComposeFragment":
                            return 2;
                        case "FBTSelectStrengthWorkoutTypeFragment":
                            return 8;
                        case "FBTGoalDateSelectionFragmentCompose":
                            return 9;
                        case "FBTLongDaysSelectionFragCompose":
                            return 5;
                        default:
                            return 0;
                    }
                }
                if (zX6) {
                    switch (str) {
                        case "FBTReviewInformationFragCompose":
                            return 5;
                        case "FBTAvailableTrainingDaysFragCompose":
                            return 2;
                        case "FBTCoachSelectionComposeFragment":
                            return 1;
                        case "FBTSelectStrengthWorkoutTypeFragment":
                            return 3;
                        case "FBTGoalDateSelectionFragmentCompose":
                            return 4;
                        default:
                            return 0;
                    }
                }
                if (zW6) {
                    switch (str.hashCode()) {
                        case -303210716:
                            if (str.equals("FBTReviewInformationFragCompose")) {
                                return 4;
                            }
                            break;
                        case 5428568:
                            if (str.equals("FBTCoachSelectionComposeFragment")) {
                                return 1;
                            }
                            break;
                        case 617385903:
                            if (str.equals("FBTGoalDateSelectionFragmentCompose")) {
                                return 3;
                            }
                            break;
                        case 1935580895:
                            if (str.equals("FBTLongDaysSelectionFragCompose")) {
                                return 2;
                            }
                            break;
                    }
                } else if (objArr != false) {
                    return str.equals("FBTCoachSelectionComposeFragment") ? 1 : 0;
                }
                return 0;
            }
            z14 = zO9;
            objArr = false;
            bVar4.getClass();
            if (z14) {
            }
            switch (str) {
                case -1981189786:
                    if (str.equals("FBTSelectTrainingLevelFragment")) {
                        return 0;
                    }
                    return 4;
                case -1402751305:
                    if (str.equals("FBTReviewScheduleFragment")) {
                        return 0;
                    }
                    return 3;
                case -671727673:
                    if (str.equals("FBTSelectPlanTypeFragment")) {
                        return 0;
                    }
                    return 1;
                case -303210716:
                    if (str.equals("FBTReviewInformationFragCompose")) {
                        return 0;
                    }
                    return 9;
                case -156813218:
                    if (str.equals("FBTAvailableTrainingDaysFragCompose")) {
                        return 0;
                    }
                    return 6;
                case 5428568:
                    if (str.equals("FBTCoachSelectionComposeFragment")) {
                        return 0;
                    }
                    return 2;
                case 389455378:
                    if (str.equals("FBTSelectStrengthWorkoutTypeFragment")) {
                        return 0;
                    }
                    return 5;
                case 617385903:
                    if (str.equals("FBTGoalDateSelectionFragmentCompose")) {
                        return 0;
                    }
                    return 8;
                case 1935580895:
                    if (str.equals("FBTLongDaysSelectionFragCompose")) {
                        return 0;
                    }
                    return 7;
                default:
                    return 0;
            }
        }
        zv1.b bVar5 = zv1.b.f207177a;
        boolean zO10 = O6();
        boolean zB11 = b7();
        boolean zE10 = e7();
        bVar5.getClass();
        if (!str.equals("FBTSelectPlanTypeFragment")) {
            if (zO10) {
                switch (str) {
                    case "FBTElevationProfileFragment":
                        return 20;
                    case "FBTSelectTrainingLevelFragment":
                        return 9;
                    case "FBTReviewScheduleFragment":
                        return 8;
                    case "FBTItpHoursPerWeekSelectionFragmentCompose":
                        return 11;
                    case "FBTAddCourseFragment":
                        return 18;
                    case "FBTNameYourPlanFragCompose":
                        return 15;
                    case "TI_LOCATION_SCREEN_TAG":
                        return 16;
                    case "FBTReviewInformationFragCompose":
                        return 22;
                    case "FBTAvailableTrainingDaysFragCompose":
                        return 13;
                    case "FBTCoachSelectionComposeFragment":
                        return 7;
                    case "FBTSelectStrengthWorkoutTypeFragment":
                        return 12;
                    case "FBTItpPlanTypeSelectionFragmentCompose":
                        return 10;
                    case "FBTGoalDateSelectionFragmentCompose":
                        return 17;
                    case "FBTSelectDistanceOrTimeFragmentCompose":
                        return 4;
                    case "FBTAddGoalDataFragment":
                        return 6;
                    case "FBTSelectCourseFragment":
                        return 19;
                    case "FBTRideWeeklyAvgHoursFragCompose":
                        return 3;
                    case "FBTGoalTypeSelectionFragment":
                        return 5;
                    case "FBTLongDaysSelectionFragCompose":
                        return 14;
                    case "FBTSelectSportFragmentCompose":
                        return 2;
                    case "FBTHillTypeFragment":
                        return 21;
                    default:
                        return 0;
                }
            }
            if (zB11) {
                switch (str) {
                    case "FBTSelectTrainingLevelFragment":
                        return 8;
                    case "FBTReviewScheduleFragment":
                        return 7;
                    case "FBTNameYourPlanFragCompose":
                        return 13;
                    case "FBTRunningWeeklyAvgDistancePaceFragCompose":
                        return 2;
                    case "TI_LOCATION_SCREEN_TAG":
                        return 14;
                    case "FBTReviewInformationFragCompose":
                        return 16;
                    case "FBTAvailableTrainingDaysFragCompose":
                        return 11;
                    case "FBTCoachSelectionComposeFragment":
                        return 6;
                    case "FBTWorkoutsPerWeekSelectionFragment":
                        return 9;
                    case "FBTSelectStrengthWorkoutTypeFragment":
                        return 10;
                    case "FBTGoalDateSelectionFragmentCompose":
                        return 15;
                    case "FBTSelectDistanceOrTimeFragmentCompose":
                        return 3;
                    case "FBTAddGoalDataFragment":
                        return 5;
                    case "FBTGoalTypeSelectionFragment":
                        return 4;
                    case "FBTLongDaysSelectionFragCompose":
                        return 12;
                    default:
                        return 0;
                }
            }
            if (zE10) {
                switch (str.hashCode()) {
                    case -2137552755:
                        if (str.equals("TI_TRIATHLON_GOAL_TYPE_SCREEN")) {
                            return 5;
                        }
                        break;
                    case -1468580253:
                        if (str.equals("TI_TRIATHLON_CYCLING_LEG_GOAL_SCREEN")) {
                            return 8;
                        }
                        break;
                    case -1402751305:
                        if (str.equals("FBTReviewScheduleFragment")) {
                            return 12;
                        }
                        break;
                    case -1176794338:
                        if (str.equals("FBTSelectSwimAbilityFragment")) {
                            return 16;
                        }
                        break;
                    case -956599071:
                        if (str.equals("FBTNameYourPlanFragCompose")) {
                            return 18;
                        }
                        break;
                    case -478050581:
                        if (str.equals("FBTSwimDaysSelectionFragCompose")) {
                            return 15;
                        }
                        break;
                    case -428986585:
                        if (str.equals("TI_LOCATION_SCREEN_TAG")) {
                            return 19;
                        }
                        break;
                    case -303210716:
                        if (str.equals("FBTReviewInformationFragCompose")) {
                            return 21;
                        }
                        break;
                    case -156813218:
                        if (str.equals("FBTAvailableTrainingDaysFragCompose")) {
                            return 13;
                        }
                        break;
                    case 5428568:
                        if (str.equals("FBTCoachSelectionComposeFragment")) {
                            return 11;
                        }
                        break;
                    case 389455378:
                        if (str.equals("FBTSelectStrengthWorkoutTypeFragment")) {
                            return 17;
                        }
                        break;
                    case 617385903:
                        if (str.equals("FBTGoalDateSelectionFragmentCompose")) {
                            return 20;
                        }
                        break;
                    case 624879919:
                        if (str.equals("FBTTriathlonTrainingHistoryFragCompose")) {
                            return 2;
                        }
                        break;
                    case 824080269:
                        if (str.equals("TI_TRIATHLON_SWIMMING_LEG_GOAL_SCREEN")) {
                            return 7;
                        }
                        break;
                    case 1092519935:
                        if (str.equals("TI_TRIATHLON_RUNNING_LEG_GOAL_SCREEN")) {
                            return 9;
                        }
                        break;
                    case 1361156443:
                        if (str.equals("TI_TRIATHLON_LEG_GOALS_REVIEW_SCREEN")) {
                            return 10;
                        }
                        break;
                    case 1650701918:
                        if (str.equals("TI_TRIATHLON_OVERALL_GOAL_SCREEN")) {
                            return 6;
                        }
                        break;
                    case 1906800932:
                        if (str.equals("TI_TRIATHLON_EVENT_TYPE_SCREEN")) {
                            return 3;
                        }
                        break;
                    case 1935580895:
                        if (str.equals("FBTLongDaysSelectionFragCompose")) {
                            return 14;
                        }
                        break;
                }
            }
            return 0;
        }
        return 1;
    }

    public final void C6(hv1.e eVar) {
        eVar.getClass();
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, null, null, -1, 447) : null);
        if (this.f13385r1 && this.N1) {
            u5();
        }
        k7();
    }

    public final void C7(vt1.e eVar) {
        eVar.getClass();
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, eVar, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 511) : null);
    }

    public final LocalDate D5() {
        LocalDate localDatePlusWeeks;
        hv1.f fVar;
        jv1.g gVar;
        hv1.j jVar;
        if (M6()) {
            LocalDate localDate = N5().f128594a.withDayOfWeek(6).toLocalDate();
            localDate.getClass();
            return localDate;
        }
        if (X6() || W6()) {
            LocalDate localDatePlusWeeks2 = LocalDate.now().plusWeeks(8);
            localDatePlusWeeks2.getClass();
            return localDatePlusWeeks2;
        }
        if (Y6()) {
            LocalDate localDatePlusWeeks3 = LocalDate.now().plusWeeks(16);
            localDatePlusWeeks3.getClass();
            return localDatePlusWeeks3;
        }
        double dDoubleValue = 0.0d;
        if (V6() && b7()) {
            jv1.s sVarI6 = i6();
            int iB = (sVarI6 == null || (jVar = sVarI6.f101143v) == null) ? 0 : jVar.b();
            jv1.h hVarE5 = E5();
            gVar = hVarE5 instanceof jv1.g ? (jv1.g) hVarE5 : null;
            if (gVar != null) {
                og0.a aVar = og0.a.f131967a;
                Double d14 = gVar.f101057a;
                dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                gg0.i iVar = gVar.f101058b;
                if (iVar == null) {
                    iVar = gg0.i.METER;
                }
                aVar.getClass();
                dDoubleValue = og0.a.g(dDoubleValue, iVar);
            }
            tu1.i.f166483a.getClass();
            Integer numE = tu1.i.a.e(dDoubleValue, iB);
            localDatePlusWeeks = LocalDate.now().plusWeeks(numE != null ? numE.intValue() : 16);
        } else if (V6() && O6()) {
            jv1.s sVarI7 = i6();
            if (sVarI7 == null || (fVar = sVarI7.C) == null) {
                fVar = hv1.f.ZERO_FOUR;
            }
            jv1.h hVarE6 = E5();
            gVar = hVarE6 instanceof jv1.g ? (jv1.g) hVarE6 : null;
            if (gVar != null) {
                og0.a aVar2 = og0.a.f131967a;
                Double d15 = gVar.f101057a;
                dDoubleValue = d15 != null ? d15.doubleValue() : 0.0d;
                gg0.i iVar2 = gVar.f101058b;
                if (iVar2 == null) {
                    iVar2 = gg0.i.METER;
                }
                aVar2.getClass();
                dDoubleValue = og0.a.g(dDoubleValue, iVar2);
            }
            tu1.i.f166483a.getClass();
            Integer numF = tu1.i.a.f(dDoubleValue, fVar);
            localDatePlusWeeks = LocalDate.now().plusWeeks(numF != null ? numF.intValue() : 16);
        } else {
            localDatePlusWeeks = LocalDate.now().plusWeeks(16);
        }
        localDatePlusWeeks.getClass();
        return localDatePlusWeeks;
    }

    public final void D6(tw1.d dVar) {
        dVar.getClass();
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, dVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 511) : null);
        jv1.s sVarI7 = i6();
        l8(sVarI7 != null ? sVarI7.c() : 0);
        if (p005kotlin.jvm.internal.s.g(dVar.getLevelKey(), vw1.a.ADVANCED.f180563a)) {
            jv1.s sVarI8 = i6();
            if ((sVarI8 != null ? sVarI8.C : null) == hv1.f.ZERO_FOUR) {
                s7();
                jv1.e eVar = new jv1.e(true, null, null, null, null, null, true, false, null, null, 958, null);
                jv1.s sVarI9 = i6();
                k8(sVarI9 != null ? jv1.s.a(sVarI9, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
                y0<g3<jv1.e>> y0VarM6 = m6();
                g3.f35298f.getClass();
                y0VarM6.j(g3.a.d(eVar));
                g7();
                return;
            }
        }
        if (!this.f13385r1) {
            f7();
            return;
        }
        s7();
        jv1.s sVarI10 = i6();
        k8(sVarI10 != null ? jv1.s.a(sVarI10, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new jv1.e(false, null, null, null, null, null, false, false, null, null, 1023, null), null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
    }

    public final void D7(vt1.f fVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, fVar, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, 511) : null);
    }

    public final jv1.h E5() {
        jv1.s sVarI6 = i6();
        if (sVarI6 != null) {
            return sVarI6.f101127f;
        }
        return null;
    }

    public final void E6(String str) {
        jv1.e eVarY5;
        jv1.e eVarY6 = y5();
        jv1.e eVarA = eVarY6 != null ? jv1.e.a(eVarY6, false) : null;
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVarA, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
        if (e7()) {
            jv1.s sVarI7 = i6();
            k8(sVarI7 != null ? jv1.s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null), null, null, null, null, null, null, null, -1, 509) : null);
            h7();
            return;
        }
        jv1.e eVarY7 = y5();
        if (eVarY7 != null && eVarY7.f101032a && (eVarY5 = y5()) != null && eVarY5.f101038g) {
            if (this.f13385r1) {
                return;
            }
            f7();
        } else if (J6()) {
            B6(vt1.g.FINISH, str, true);
        } else if (L6()) {
            i7();
        } else {
            z5(str);
        }
    }

    public final void E7(jv1.m mVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, mVar, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, 511) : null);
    }

    public final y0<jv1.s> F5() {
        return (y0) this.K0.getValue();
    }

    public final void F6() {
        if (e7()) {
            ge1.b.T(v1.a(this), null, null, new g0(this, null), 3);
            return;
        }
        if (M6()) {
            if (((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).s()) {
                p7();
                return;
            } else {
                ((y0) this.J1.getValue()).m(Boolean.TRUE);
                return;
            }
        }
        if (Y6()) {
            s6().j("FBTItpPlanTypeSelectionFragmentCompose");
            return;
        }
        if (X6()) {
            y6();
            return;
        }
        if (V6()) {
            ge1.b.T(v1.a(this), null, null, new e0(this, null), 3);
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "FBTPlanWizardViewModel", "handleSetUpPlanSelection : Coach plan info - wizard flow invalid");
    }

    public final void F7(LocalDate localDate) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, localDate, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 511) : null);
    }

    public final LocalDate G5() {
        fg0.p pVar;
        fg0.k kVar;
        fg0.k kVar2;
        LocalDate date;
        jv1.s sVarI6 = i6();
        if (sVarI6 != null && (kVar2 = sVarI6.f101124c) != null && (date = kVar2.getDate()) != null) {
            return date;
        }
        jv1.s sVarI7 = i6();
        LocalDate date2 = (sVarI7 == null || (kVar = sVarI7.f101146y) == null) ? null : kVar.getDate();
        if (date2 != null) {
            return date2;
        }
        jv1.s sVarI8 = i6();
        if (sVarI8 == null || (pVar = sVarI8.f101145x) == null) {
            return null;
        }
        return pVar.j().getDate();
    }

    public final void G6(vt1.h hVar) {
        String str;
        hVar.getClass();
        if (hVar == vt1.h.NONE) {
            T7(null);
        } else {
            fy1.c.f73884a.getClass();
            int i14 = fy1.c.a.f73889c[hVar.ordinal()];
            if (i14 == 1) {
                str = "GarminCoachFullGymPreferenceEnabled";
            } else if (i14 == 2) {
                str = "GarminCoachBodyweightPreferenceEnabled";
            } else if (i14 == 3) {
                str = "GarminCoachDumbbellsPreferenceEnabled";
            } else {
                if (i14 != 4) {
                    u0.r();
                    return;
                }
                str = "GarminCoachStrengthPreferenceDisabled";
            }
            if (str.length() > 0) {
                fy1.c.b(str);
            }
            T7(hVar);
        }
        if (this.f13385r1) {
            return;
        }
        if (V6() && (b7() || O6())) {
            f7();
        } else {
            q5();
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v56, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r27v0, types: [aw1.h] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v45, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.util.ArrayList] */
    public final void G7(String str, e23.a aVar) {
        boolean z14;
        boolean z15;
        vt1.h hVar;
        boolean z16;
        boolean z17;
        final ?? arrayList;
        List listB1;
        ?? arrayList2;
        ?? arrayList3;
        final ArrayList arrayList4;
        List listB2;
        fg0.k kVarF;
        Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
        l22.a aVar2 = new l22.a(contextB);
        String string = O6() ? contextB.getString(R.string.lbl_ride) : b7() ? contextB.getString(R.string.lbl_run) : contextB.getString(R.string.lbl_workout);
        string.getClass();
        if (!this.N1) {
            this.N1 = true;
            this.O1 = (jv1.s) j6().d();
            this.P1 = str;
        }
        aVar.invoke();
        jv1.s sVar = (jv1.s) j6().d();
        final List<String> list = sVar != null ? sVar.f101134m : null;
        List<String> list2 = sVar != null ? sVar.f101135n : null;
        List<String> list3 = sVar != null ? sVar.f101136o : null;
        if (list2 == null) {
            z14 = false;
        } else {
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (list != null && list.contains(str2)) {
                            z14 = false;
                        }
                    }
                }
            }
            z14 = true;
        }
        if (e7()) {
            if (list3 == null) {
                if (list3 == null && !list3.isEmpty()) {
                    z15 = false;
                }
            } else if (!list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        if (list != null && list.contains(str3)) {
                            if (list3 == null) {
                            }
                        }
                    }
                }
            }
            z15 = true;
        } else {
            z15 = false;
        }
        if (sVar == null || (hVar = sVar.F) == null) {
            hVar = vt1.h.NONE;
        }
        int size = list != null ? list.size() : 0;
        jv1.s sVar2 = this.O1;
        if ((sVar2 != null ? sVar2.O : null) != tw1.k.BEGINNER) {
            z16 = false;
        } else if ((sVar != null ? sVar.O : null) == tw1.k.INTERMEDIATE) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            fy1.i.f73924a.getClass();
            boolean zD = bo1.a.a().c().D();
            boolean z18 = O6() && (d7() || N6());
            boolean zI6 = I6();
            jv1.s sVarI6 = i6();
            boolean z19 = ((sVarI6 == null || (kVarF = sVarI6.f()) == null) ? null : kVarF.getCourseId()) != null;
            Double dZ5 = Z5();
            boolean z24 = zf.b.D(dZ5) && dZ5.doubleValue() > 0.0d;
            if (zD && z18 && !z19 && z24 && !zI6) {
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            z17 = false;
        }
        List<String> list4 = list2;
        o13.p pVarZ = og.a.Z(tu1.a.j(sVar != null ? sVar.f101127f : null, sVar != null ? sVar.f101125d : null, hVar != null, Z6()), size, z16);
        boolean zBooleanValue = ((Boolean) pVarZ.f128594a).booleanValue();
        int iIntValue = ((Number) pVarZ.f128595b).intValue();
        int iHashCode = str.hashCode();
        p2 p2Var = this.Q1;
        switch (iHashCode) {
            case -2104826316:
                if (str.equals("FBTElevationProfileFragment")) {
                    if (X7()) {
                        s6().j("FBTHillTypeFragment");
                    } else {
                        C6(hv1.e.FLAT);
                    }
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                break;
            case -1981189786:
                if (str.equals("FBTSelectTrainingLevelFragment")) {
                    boolean z25 = hVar == vt1.h.DUMBBELLS;
                    if (z16 && z25) {
                        String string2 = aVar2.getString(R.string.preference_updates_required);
                        String lowerCase = aVar2.getString(R.string.coach_difficulty_achiever).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        p2Var.k(null, new mv1.e(false, string2, aVar2.a(R.string.training_level_preferenes_update_type, lowerCase), 0, 0, new aw1.e(this, 0), 25, null));
                    } else if (z16 && zBooleanValue) {
                        String string3 = aVar2.getString(R.string.preference_updates_required);
                        String lowerCase2 = aVar2.getString(R.string.coach_difficulty_achiever).toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        p2Var.k(null, new mv1.e(false, string3, aVar2.a(R.string.training_level_preferenes_update_type, lowerCase2), 0, R.string.common_cancel, new aw1.e(this, 1), 9, null));
                    } else if (z16 && z17) {
                        p2Var.k(null, z6(aVar2));
                    } else if (!z16 && O6() && I6()) {
                        p2Var.k(null, new mv1.e(false, aVar2.getString(R.string.remove_course_profile), aVar2.a(R.string.change_training_level_remove_course_profile, aVar2.getString(R.string.coach_difficulty_challenger)), 0, 0, new aw1.e(this, 2), 25, null));
                    } else {
                        u5();
                        k7();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    return;
                }
                break;
            case -478050581:
                if (str.equals("FBTSwimDaysSelectionFragCompose")) {
                    if (list3 != null) {
                        arrayList = new ArrayList();
                        for (Object obj : list3) {
                            String str4 = (String) obj;
                            if (list == null || !list.contains(str4)) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    if (((Collection) arrayList).isEmpty()) {
                        u5();
                        k7();
                    } else if (p005kotlin.jvm.internal.s.g(this.P1, "FBTSwimDaysSelectionFragCompose")) {
                        final int i14 = 1;
                        p2Var.k(null, new mv1.e(false, aVar2.getString(R.string.swim_day_updated), aVar2.getString(R.string.rest_day_updated_to_swim_day), 0, 0, new e23.l() { // from class: aw1.f
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                ArrayList arrayList5;
                                List<String> listB3;
                                List<String> listB4;
                                int i15 = i14;
                                h hVar2 = this;
                                List list5 = arrayList;
                                List list6 = list;
                                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                switch (i15) {
                                    case 0:
                                        int i16 = h.S1;
                                        if (zBooleanValue2) {
                                            arrayList5 = list6 != null ? new ArrayList(list6) : null;
                                            if (arrayList5 != null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                for (Object obj3 : list5) {
                                                    if (!arrayList5.contains((String) obj3)) {
                                                        arrayList6.add(obj3);
                                                    }
                                                }
                                                arrayList5.addAll(arrayList6);
                                            }
                                            if (arrayList5 == null || (listB3 = p13.h0.b1(arrayList5)) == null) {
                                                listB3 = p13.j0.f134944a;
                                            }
                                            hVar2.e8(listB3, false);
                                            hVar2.u5();
                                            hVar2.k7();
                                        }
                                        break;
                                    default:
                                        int i17 = h.S1;
                                        if (zBooleanValue2) {
                                            arrayList5 = list6 != null ? new ArrayList(list6) : null;
                                            if (arrayList5 != null) {
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj4 : list5) {
                                                    if (!arrayList5.contains((String) obj4)) {
                                                        arrayList7.add(obj4);
                                                    }
                                                }
                                                arrayList5.addAll(arrayList7);
                                            }
                                            if (arrayList5 == null || (listB4 = p13.h0.b1(arrayList5)) == null) {
                                                listB4 = p13.j0.f134944a;
                                            }
                                            hVar2.e8(listB4, false);
                                            hVar2.u5();
                                            hVar2.k7();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, 25, null));
                    } else {
                        ArrayList arrayList5 = list != null ? new ArrayList(list) : null;
                        if (arrayList5 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj2 : (Iterable) arrayList) {
                                if (!arrayList5.contains((String) obj2)) {
                                    arrayList6.add(obj2);
                                }
                            }
                            arrayList5.addAll(arrayList6);
                        }
                        if (arrayList5 == null || (listB1 = p13.h0.b1(arrayList5)) == null) {
                            listB1 = p13.j0.f134944a;
                        }
                        e8(listB1, false);
                        u5();
                        k7();
                    }
                    Unit unit3 = Unit.INSTANCE;
                    return;
                }
                break;
            case -156813218:
                if (str.equals("FBTAvailableTrainingDaysFragCompose")) {
                    if (z14 && z15) {
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj3 : list4) {
                            String str5 = (String) obj3;
                            if (list != null && list.contains(str5)) {
                                arrayList7.add(obj3);
                            }
                        }
                        if (list3 != null) {
                            arrayList3 = new ArrayList();
                            for (Object obj4 : list3) {
                                String str6 = (String) obj4;
                                if (list != null && list.contains(str6)) {
                                    arrayList3.add(obj4);
                                }
                            }
                        } else {
                            arrayList3 = p13.j0.f134944a;
                        }
                        N7(arrayList7);
                        Q7(arrayList3);
                        if (p005kotlin.jvm.internal.s.g(this.P1, "FBTAvailableTrainingDaysFragCompose")) {
                            p2Var.k(null, new mv1.e(false, aVar2.getString(R.string.select_new_long_workout_and_swim_days), aVar2.getString(R.string.removed_long_day_and_swim_select_new_ones), 0, 0, new aw1.e(this, 3), 25, null));
                        } else {
                            j7();
                        }
                    } else if (z14) {
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj5 : list4) {
                            String str7 = (String) obj5;
                            if (list != null && list.contains(str7)) {
                                arrayList8.add(obj5);
                            }
                        }
                        N7(arrayList8);
                        if (p005kotlin.jvm.internal.s.g(this.P1, "FBTAvailableTrainingDaysFragCompose")) {
                            String string4 = aVar2.getString(R.string.select_new_long_day);
                            String lowerCase3 = string.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                            p2Var.k(null, new mv1.e(false, string4, aVar2.a(R.string.removed_long_day_select_a_new_one, lowerCase3), 0, 0, new aw1.e(this, 4), 25, null));
                        } else {
                            j7();
                        }
                    } else if (z15) {
                        if (list3 != null) {
                            arrayList2 = new ArrayList();
                            for (Object obj6 : list3) {
                                String str8 = (String) obj6;
                                if (list != null && list.contains(str8)) {
                                    arrayList2.add(obj6);
                                }
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = p13.j0.f134944a;
                        }
                        Q7(arrayList2);
                        if (p005kotlin.jvm.internal.s.g(this.P1, "FBTAvailableTrainingDaysFragCompose")) {
                            p2Var.k(null, new mv1.e(false, aVar2.getString(R.string.select_new_swim_day), aVar2.getString(R.string.removed_swim_day_select_a_new_one), 0, 0, new aw1.e(this, 5), 25, null));
                        } else {
                            s6().j("FBTSwimDaysSelectionFragCompose");
                        }
                    } else if (z16 && z17) {
                        p2Var.k(null, z6(aVar2));
                    } else {
                        if (list4 != null && !list4.isEmpty()) {
                            for (String str9 : list4) {
                                if (list == null || !list.contains(str9)) {
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj7 : list4) {
                                        String str10 = (String) obj7;
                                        if (list != null && list.contains(str10)) {
                                            arrayList9.add(obj7);
                                        }
                                    }
                                    N7(arrayList9);
                                }
                            }
                        }
                        if (e7() && list3 != null && !list3.isEmpty()) {
                            for (String str11 : list3) {
                                if (list == null || !list.contains(str11)) {
                                    ArrayList arrayList10 = new ArrayList();
                                    for (Object obj8 : list3) {
                                        String str12 = (String) obj8;
                                        if (list != null && list.contains(str12)) {
                                            arrayList10.add(obj8);
                                        }
                                    }
                                    Q7(arrayList10);
                                }
                            }
                        }
                        u5();
                        k7();
                    }
                    Unit unit4 = Unit.INSTANCE;
                    return;
                }
                break;
            case 389455378:
                if (str.equals("FBTSelectStrengthWorkoutTypeFragment")) {
                    if (zBooleanValue) {
                        if (p005kotlin.jvm.internal.s.g(this.P1, str)) {
                            p2Var.k(null, new mv1.e(false, aVar2.getString(R.string.update_available_days), aVar2.a(R.string.add_strength_workouts_days_update, String.valueOf(iIntValue)), 0, 0, new aw1.e(this, 6), 25, null));
                        } else {
                            f7();
                        }
                    } else if (z16 && z17) {
                        p2Var.k(null, z6(aVar2));
                    } else {
                        u5();
                        k7();
                    }
                    Unit unit5 = Unit.INSTANCE;
                    return;
                }
                break;
            case 1935580895:
                if (str.equals("FBTLongDaysSelectionFragCompose")) {
                    if (e7() && z15) {
                        s6().j("FBTSwimDaysSelectionFragCompose");
                    } else if (z16 && z17) {
                        p2Var.k(null, z6(aVar2));
                    } else {
                        if (list4 != null) {
                            arrayList4 = new ArrayList();
                            for (Object obj9 : list4) {
                                String str13 = (String) obj9;
                                if (list == null || !list.contains(str13)) {
                                    arrayList4.add(obj9);
                                }
                            }
                        } else {
                            arrayList4 = null;
                        }
                        if (arrayList4 == null || !(!arrayList4.isEmpty())) {
                            u5();
                            k7();
                        } else if (p005kotlin.jvm.internal.s.g(this.P1, "FBTLongDaysSelectionFragCompose")) {
                            String strA = aVar2.a(R.string.long_training_day_updated, string);
                            String lowerCase4 = string.toLowerCase(Locale.ROOT);
                            lowerCase4.getClass();
                            final int i15 = 0;
                            p2Var.k(null, new mv1.e(false, strA, aVar2.a(R.string.training_day_updated_to_long_day, lowerCase4), R.string.common_button_ok, 0, new e23.l() { // from class: aw1.f
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    ArrayList arrayList11;
                                    List<String> listB3;
                                    List<String> listB4;
                                    int i16 = i15;
                                    h hVar2 = this;
                                    List list5 = arrayList4;
                                    List list6 = list;
                                    boolean zBooleanValue2 = ((Boolean) obj10).booleanValue();
                                    switch (i16) {
                                        case 0:
                                            int i17 = h.S1;
                                            if (zBooleanValue2) {
                                                arrayList11 = list6 != null ? new ArrayList(list6) : null;
                                                if (arrayList11 != null) {
                                                    ArrayList arrayList12 = new ArrayList();
                                                    for (Object obj11 : list5) {
                                                        if (!arrayList11.contains((String) obj11)) {
                                                            arrayList12.add(obj11);
                                                        }
                                                    }
                                                    arrayList11.addAll(arrayList12);
                                                }
                                                if (arrayList11 == null || (listB3 = p13.h0.b1(arrayList11)) == null) {
                                                    listB3 = p13.j0.f134944a;
                                                }
                                                hVar2.e8(listB3, false);
                                                hVar2.u5();
                                                hVar2.k7();
                                            }
                                            break;
                                        default:
                                            int i18 = h.S1;
                                            if (zBooleanValue2) {
                                                arrayList11 = list6 != null ? new ArrayList(list6) : null;
                                                if (arrayList11 != null) {
                                                    ArrayList arrayList13 = new ArrayList();
                                                    for (Object obj12 : list5) {
                                                        if (!arrayList11.contains((String) obj12)) {
                                                            arrayList13.add(obj12);
                                                        }
                                                    }
                                                    arrayList11.addAll(arrayList13);
                                                }
                                                if (arrayList11 == null || (listB4 = p13.h0.b1(arrayList11)) == null) {
                                                    listB4 = p13.j0.f134944a;
                                                }
                                                hVar2.e8(listB4, false);
                                                hVar2.u5();
                                                hVar2.k7();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, 16, null));
                        } else {
                            ArrayList arrayList11 = list != null ? new ArrayList(list) : null;
                            if (arrayList11 != null) {
                                ArrayList arrayList12 = new ArrayList();
                                for (Object obj10 : arrayList4) {
                                    if (!arrayList11.contains((String) obj10)) {
                                        arrayList12.add(obj10);
                                    }
                                }
                                arrayList11.addAll(arrayList12);
                            }
                            if (arrayList11 == null || (listB2 = p13.h0.b1(arrayList11)) == null) {
                                listB2 = p13.j0.f134944a;
                            }
                            e8(listB2, false);
                            u5();
                            k7();
                        }
                    }
                    Unit unit6 = Unit.INSTANCE;
                    return;
                }
                break;
        }
        u5();
        k7();
        Unit unit7 = Unit.INSTANCE;
    }

    public final dw1.a H5() {
        return (dw1.a) this.Y.getValue();
    }

    public final void H6() {
        if (e7()) {
            s6().j("FBTTriathlonTrainingHistoryFragCompose");
            return;
        }
        boolean z14 = d7() && Q6();
        if (!R6() && !H5().f61437c) {
            k7();
            return;
        }
        if (!z14) {
            i7();
        } else if (O6()) {
            s6().j("FBTRideWeeklyAvgHoursFragCompose");
        } else {
            s6().j("FBTRunningWeeklyAvgDistancePaceFragCompose");
        }
    }

    public final void H7(Integer num) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, 511) : null);
    }

    public final gg0.f I5() {
        jv1.s sVarI6 = i6();
        vt1.o oVar = sVarI6 != null ? sVarI6.f101125d : null;
        int i14 = oVar == null ? -1 : b.f13394a[oVar.ordinal()];
        if (i14 != 2) {
            return i14 != 3 ? gg0.f.f77130f : gg0.f.f77136l;
        }
        vt1.d dVar = sVarI6.f101126e;
        int i15 = dVar != null ? b.f13396c[dVar.ordinal()] : -1;
        if (i15 != 3) {
            return i15 != 4 ? gg0.f.f77132h : gg0.f.f77134j;
        }
        return gg0.f.f77133i;
    }

    public final boolean I6() {
        jv1.s sVarI6 = i6();
        if ((sVarI6 != null ? sVarI6.K : null) != null) {
            return true;
        }
        jv1.s sVarI7 = i6();
        if ((sVarI7 != null ? sVarI7.L : null) != null) {
            return true;
        }
        if (!N6()) {
            return false;
        }
        jv1.s sVarI8 = i6();
        return (sVarI8 != null ? sVarI8.N : null) != null;
    }

    public final void I7(hv1.j jVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, jVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 511) : null);
    }

    public final y0<jv1.s> J5() {
        return (y0) this.H0.getValue();
    }

    public final boolean J6() {
        jv1.e eVarY5 = y5();
        if (eVarY5 == null || !eVarY5.f101032a) {
            return false;
        }
        jv1.e eVarY6 = y5();
        if ((eVarY6 != null ? eVarY6.f101034c : null) == null) {
            jv1.e eVarY7 = y5();
            if ((eVarY7 != null ? eVarY7.f101036e : null) == null) {
                return false;
            }
        }
        return true;
    }

    public final void J7(String str) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 511) : null);
    }

    public final String K5(vt1.n nVar) {
        jv1.s sVarI6 = i6();
        vt1.f fVar = sVarI6 != null ? sVarI6.f101128g : null;
        if (fVar instanceof vt1.c) {
            return ((vt1.c) fVar).f180089b;
        }
        if (!(fVar instanceof vt1.g)) {
            return null;
        }
        if (nVar == vt1.n.FIVE_K) {
            return fVar == vt1.g.FINISH_GOAL_TIME ? vt1.c.RUN_WITH_GOAL_TIME.f180089b : vt1.c.RUN.f180089b;
        }
        return ((vt1.g) fVar).f180112b;
    }

    public final boolean K6() {
        jv1.s sVarI6 = i6();
        vt1.f fVar = sVarI6 != null ? sVarI6.f101128g : null;
        if ((fVar instanceof vt1.c) && fVar == vt1.c.RUN_WITH_GOAL_TIME) {
            return true;
        }
        return (fVar instanceof vt1.g) && fVar == vt1.g.FINISH_GOAL_TIME;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008d  */
    public final void K7(fg0.k kVar) {
        jv1.m mVarA;
        kVar.getClass();
        vt1.o oVarW = tu1.a.w(kVar);
        jv1.s sVarI6 = i6();
        jv1.s sVarA = null;
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, oVarW, tu1.a.t(kVar), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25, 511) : null);
        if (R6()) {
            fg0.j eventCustomization = kVar.getEventCustomization();
            fg0.d customGoal = eventCustomization != null ? eventCustomization.getCustomGoal() : null;
            if (customGoal != null) {
                jv1.m.f101075d.getClass();
                mVarA = jv1.m.a.a(customGoal);
            } else {
                jv1.s sVarI7 = i6();
                if (sVarI7 != null) {
                    mVarA = sVarI7.f101129h;
                } else {
                    mVarA = null;
                }
            }
        } else {
            jv1.s sVarI8 = i6();
            if (sVarI8 != null) {
                mVarA = sVarI8.f101129h;
            } else {
                mVarA = null;
            }
        }
        jv1.h hVarU = tu1.a.u(kVar);
        vt1.f fVarV6 = v6(mVarA, hVarU, oVarW);
        jv1.s sVarI9 = i6();
        if (sVarI9 != null) {
            sVarA = jv1.s.a(sVarI9, null, null, kVar, null, null, hVarU, fVarV6, mVarA, null, null, false, null, null, null, null, null, null, null, kVar.getDate(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262373, 508);
        }
        k8(sVarA);
    }

    public final vt1.f L5() {
        vt1.f fVar;
        vt1.f fVar2;
        jv1.s sVarI6 = i6();
        jv1.m mVar = (sVarI6 == null || !((fVar2 = sVarI6.f101128g) == vt1.c.RUN_WITH_GOAL_TIME || fVar2 == vt1.g.FINISH_GOAL_TIME || fVar2 == vt1.i.GOAL_DISTANCE_SPEED || fVar2 == vt1.i.GOAL_PACE_DISTANCE)) ? null : sVarI6.f101129h;
        if (H5().f61443i) {
            H5().f61443i = false;
            jv1.s sVarI7 = i6();
            return (sVarI7 == null || (fVar = sVarI7.f101128g) == null) ? vt1.g.FINISH : fVar;
        }
        dw1.a aVarH5 = H5();
        jv1.s sVarI8 = i6();
        aVarH5.f61440f = sVarI8 != null ? sVarI8.f101128g : null;
        jv1.s sVarI9 = i6();
        boolean z14 = (sVarI9 != null ? sVarI9.f101128g : null) instanceof vt1.c;
        if (mVar != null) {
            return z14 ? vt1.c.RUN_WALK : vt1.g.FINISH;
        }
        if (!z14) {
            return vt1.g.FINISH_GOAL_TIME;
        }
        jv1.s sVarI10 = i6();
        vt1.f fVar3 = sVarI10 != null ? sVarI10.f101128g : null;
        vt1.c cVar = vt1.c.RUN;
        return fVar3 == cVar ? vt1.c.RUN_WALK : cVar;
    }

    public final boolean L6() {
        jv1.e eVarY5 = y5();
        if (eVarY5 == null || !eVarY5.f101032a) {
            return false;
        }
        jv1.e eVarY6 = y5();
        return (eVarY6 != null ? eVarY6.f101040i : null) != null;
    }

    public final void L7(hv1.f fVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, fVar, null, null, null, null, null, null, null, null, null, null, null, null, -268435457, 511) : null);
    }

    public final List<String> M5() {
        List<wt1.q> listJ;
        jv1.s sVarI6 = i6();
        if (sVarI6 == null || (listJ = sVarI6.j()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listJ, 10));
        Iterator<T> it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((wt1.q) it.next()).f187130a);
        }
        return p13.h0.b1(arrayList);
    }

    public final boolean M6() {
        jv1.s sVarI6 = i6();
        return (sVarI6 != null ? sVarI6.f101123b : null) == vt1.m.STATIC;
    }

    public final void M7(ww1.v vVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, vVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 511) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o13.p<DateTime, DateTime> N5() {
        o13.p pVar;
        jv1.s sVar = (jv1.s) j6().d();
        xw1.h hVar = sVar != null ? sVar.f101130i : null;
        jv1.s sVar2 = (jv1.s) j6().d();
        tw1.c cVar = sVar2 != null ? sVar2.f101131j : null;
        if (hVar != null) {
            return new o13.p<>(LocalDate.now().plusWeeks(hVar.getMinWeeksPerPlan()).toDateTimeAtCurrentTime(), LocalDate.now().plusWeeks(hVar.getMaxWeeksPerPlan()).toDateTimeAtCurrentTime());
        }
        if (cVar != null) {
            jv1.s sVar3 = (jv1.s) j6().d();
            if ((sVar3 != null ? sVar3.f101123b : null) == vt1.m.ITP) {
                String strF = cVar.getDurationInWeeks();
                List listW = strF != null ? d53.w.W(strF, new String[]{"-"}) : p13.j0.f134944a;
                if (listW.size() == 2) {
                    try {
                        pVar = new o13.p(Integer.valueOf(Integer.parseInt((String) listW.get(0))), Integer.valueOf(Integer.parseInt((String) listW.get(1))));
                    } catch (Throwable unused) {
                        String strN = fb1.c.n("parseDurationInWeeks: Error parsing durationInWeeks ", cVar.getDurationInWeeks());
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.f(a2Var, "FBTPlanWizardViewModel", strN);
                        pu1.b bVar = pu1.b.ITP_PLAN;
                        pVar = new o13.p(Integer.valueOf(bVar.f141301a), Integer.valueOf(bVar.f141302b));
                    }
                } else {
                    pu1.b bVar2 = pu1.b.ITP_PLAN;
                    pVar = new o13.p(Integer.valueOf(bVar2.f141301a), Integer.valueOf(bVar2.f141302b));
                }
                return new o13.p<>(LocalDate.now().plusWeeks(((Number) pVar.f128594a).intValue()).toDateTimeAtCurrentTime(), LocalDate.now().plusWeeks(((Number) pVar.f128595b).intValue()).toDateTimeAtCurrentTime().minusDays(1));
            }
        }
        jv1.s sVarI6 = i6();
        if (sVarI6 != null) {
            vt1.o.a aVar2 = vt1.o.f180174e;
            vt1.o oVar = sVarI6.f101125d;
            aVar2.getClass();
            if (oVar != null && p13.x.k(vt1.o.f180179j, vt1.o.f180180k).contains(oVar)) {
                return new o13.p<>(LocalDate.now().plusWeeks(4).toDateTimeAtCurrentTime(), LocalDate.now().plusWeeks(12).toDateTimeAtCurrentTime());
            }
        }
        pu1.b.f141294c.getClass();
        LocalDate localDateNow = LocalDate.now();
        pu1.b bVar3 = pu1.b.FBT_PLAN;
        LocalDate localDatePlusWeeks = localDateNow.plusWeeks(bVar3.f141301a);
        localDatePlusWeeks.getClass();
        DateTime dateTimeAtCurrentTime = localDatePlusWeeks.toDateTimeAtCurrentTime();
        LocalDate localDatePlusWeeks2 = LocalDate.now().plusWeeks(bVar3.f141302b);
        localDatePlusWeeks2.getClass();
        return new o13.p<>(dateTimeAtCurrentTime, localDatePlusWeeks2.toDateTimeAtCurrentTime());
    }

    public final boolean N6() {
        jv1.s sVarI6 = i6();
        if (sVarI6 != null) {
            return sVarI6.h();
        }
        return false;
    }

    public final void N7(ArrayList arrayList) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 511) : null);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object O5(String str, v13.c cVar) {
        d0 d0Var;
        int i14;
        vt1.n nVar;
        Integer numA;
        String str2;
        Integer num;
        boolean z14;
        boolean z15;
        String str3;
        jv1.s sVarI6;
        jv1.m mVar;
        vt1.n nVar2;
        boolean z16;
        v2 v2Var;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i15 = d0Var.f13344g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                d0Var.f13344g = i15 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        d0 d0Var2 = d0Var;
        Object objE = d0Var2.f13342e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = d0Var2.f13344g;
        Integer num2 = null;
        if (i16 != 0) {
            if (i16 == 1) {
                i14 = d0Var2.f13341d;
                numA = d0Var2.f13340c;
                str3 = d0Var2.f13339b;
                nVar = d0Var2.f13338a;
                o13.r.b(objE);
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nVar2 = d0Var2.f13338a;
                o13.r.b(objE);
            }
            v2Var = (v2) objE;
            if (v2Var instanceof v2.b) {
                return new jv1.f(vt1.o.f180175f, nVar2 != null ? new Integer(nVar2.f180171a) : null, (List) ((v2.b) v2Var).f47386a, null, false, false, null, 120, null);
            }
            if (v2Var instanceof v2.a) {
                return null;
            }
            u0.r();
            return null;
        }
        o13.r.b(objE);
        jv1.s sVarI7 = i6();
        jv1.h hVar = sVarI7 != null ? sVarI7.f101127f : null;
        if (hVar instanceof jv1.g) {
            vt1.n nVarI5 = i5((jv1.g) hVar);
            if (nVarI5 != null) {
                i14 = nVarI5.f180172b;
                nVar = nVarI5;
            } else {
                nVar = nVarI5;
                i14 = -1;
            }
        } else {
            i14 = -1;
            nVar = null;
        }
        String strK5 = str == null ? K5(nVar) : str;
        numA = (!K6() || (sVarI6 = i6()) == null || (mVar = sVarI6.f101129h) == null) ? null : mVar.a();
        if (i14 <= -1 || nVar == null || numA == null) {
            str2 = strK5;
            num = numA;
            z14 = true;
            z15 = false;
            if (i14 != -1 || !z14) {
                vt1.o oVar = vt1.o.f180175f;
                if (i14 != -1 && nVar != null) {
                    num2 = new Integer(nVar.f180171a);
                }
                return new jv1.f(oVar, num2, null, null, z15, false, null, 108, null);
            }
            d0Var2.f13338a = nVar;
            d0Var2.f13339b = null;
            d0Var2.f13340c = null;
            d0Var2.f13341d = i14;
            d0Var2.f13344g = 2;
            objE = o53.c0.e(new x(this, i14, str2, num, null), d0Var2);
            if (objE != obj) {
                nVar2 = nVar;
                v2Var = (v2) objE;
                if (v2Var instanceof v2.b) {
                    return new jv1.f(vt1.o.f180175f, nVar2 != null ? new Integer(nVar2.f180171a) : null, (List) ((v2.b) v2Var).f47386a, null, false, false, null, 120, null);
                }
                if (v2Var instanceof v2.a) {
                    return null;
                }
                u0.r();
                return null;
            }
        } else {
            d0Var2.f13338a = nVar;
            d0Var2.f13339b = strK5;
            d0Var2.f13340c = numA;
            d0Var2.f13341d = i14;
            d0Var2.f13344g = 1;
            Object objW5 = w5(i14, d0Var2);
            if (objW5 != obj) {
                str3 = strK5;
                objE = objW5;
            }
        }
        return obj;
        List list = (List) objE;
        Integer num3 = list != null ? (Integer) p13.h0.n0(list) : null;
        boolean z17 = num3 != null && numA.intValue() > num3.intValue();
        og0.a aVar = og0.a.f131967a;
        double dIntValue = numA.intValue();
        double d14 = nVar.f180173c;
        aVar.getClass();
        double d15 = og0.a.d(dIntValue, d14);
        if (this.f13384q1) {
            pu1.a aVar2 = pu1.a.ATP_RANGE_KM;
            int iB = MathKt.b(d15);
            int i17 = aVar2.f141292a;
            if (iB > aVar2.f141293b || i17 > iB) {
                z16 = false;
            } else {
                z16 = true;
            }
        } else {
            pu1.a aVar3 = pu1.a.ATP_RANGE_MI;
            int iB2 = MathKt.b(d15);
            int i18 = aVar3.f141292a;
            if (iB2 > aVar3.f141293b || i18 > iB2) {
                z16 = false;
            } else {
                z16 = true;
            }
        }
        z15 = z17;
        z14 = z16;
        num = numA;
        str2 = str3;
        if (i14 != -1) {
        }
        vt1.o oVar2 = vt1.o.f180175f;
        if (i14 != -1) {
            num2 = new Integer(nVar.f180171a);
        }
        return new jv1.f(oVar2, num2, null, null, z15, false, null, 108, null);
    }

    public final boolean O6() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.f101125d == vt1.o.f180176g;
    }

    public final void O7(String str) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 511) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Double P5() {
        jv1.s sVar = (jv1.s) j6().d();
        jv1.h hVar = sVar != null ? sVar.f101127f : null;
        if (!(hVar instanceof jv1.g)) {
            return null;
        }
        og0.a aVar = og0.a.f131967a;
        jv1.g gVar = (jv1.g) hVar;
        Double d14 = gVar.f101056e;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        gg0.i iVar = gVar.f101055d;
        if (iVar == null) {
            iVar = gg0.i.KILOMETER;
        }
        aVar.getClass();
        return Double.valueOf(og0.a.g(dDoubleValue, iVar));
    }

    public final boolean P6() {
        return this.f13385r1 || this.I0 || this.J0;
    }

    public final void P7(hv1.i iVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, iVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 511) : null);
    }

    public final int Q5() {
        jv1.s sVarI6 = i6();
        Integer num = sVarI6 != null ? sVarI6.f101141t : null;
        if (num != null && num.intValue() > 1) {
            return num.intValue();
        }
        jv1.s sVarI7 = i6();
        if (sVarI7 != null) {
            return sVarI7.c();
        }
        return 0;
    }

    public final boolean Q6() {
        jv1.s sVarI6 = i6();
        if ((sVarI6 != null ? sVarI6.f101124c : null) != null) {
            return true;
        }
        jv1.s sVarI7 = i6();
        if ((sVarI7 != null ? sVarI7.f101146y : null) != null) {
            return true;
        }
        jv1.s sVarI8 = i6();
        return (sVarI8 != null ? sVarI8.f101145x : null) != null;
    }

    public final void Q7(List<String> list) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, 511) : null);
    }

    public final boolean R5() {
        return (P6() || H5().f61437c) ? false : true;
    }

    public final boolean R6() {
        boolean z14;
        vt1.o oVarS5 = S5();
        if (oVarS5 != null) {
            vt1.o oVar = vt1.o.f180181l;
            List<tw1.m> list = this.f13388u1;
            if (oVarS5 == oVar) {
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            tw1.m mVar = (tw1.m) it.next();
                            tw1.n trainingPlanType = mVar.getTrainingPlanType();
                            if ((trainingPlanType != null ? trainingPlanType.b() : null) != vt1.o.f180179j) {
                                tw1.n trainingPlanType2 = mVar.getTrainingPlanType();
                                if ((trainingPlanType2 != null ? trainingPlanType2.b() : null) != vt1.o.f180180k) {
                                    continue;
                                }
                            }
                            if (p005kotlin.jvm.internal.s.g(mVar.getTrainingPlanCategory(), "FBT_ADAPTIVE")) {
                                z14 = true;
                            }
                        }
                    }
                }
                z14 = false;
            } else {
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            tw1.m mVar2 = (tw1.m) it3.next();
                            tw1.n trainingPlanType3 = mVar2.getTrainingPlanType();
                            if ((trainingPlanType3 != null ? trainingPlanType3.b() : null) == oVarS5 && p005kotlin.jvm.internal.s.g(mVar2.getTrainingPlanCategory(), "FBT_ADAPTIVE")) {
                                z14 = true;
                            }
                        }
                    }
                }
                z14 = false;
            }
        } else {
            List<tw1.m> list2 = this.f13388u1;
            if (list2 == null || !list2.isEmpty()) {
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (p005kotlin.jvm.internal.s.g(((tw1.m) it4.next()).getTrainingPlanCategory(), "FBT_ADAPTIVE")) {
                            z14 = true;
                        }
                    }
                }
            }
            z14 = false;
        }
        return ((rt1.m) this.f13390w1.getValue()).A() && z14;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    public final void R7(fg0.k kVar) {
        fg0.j jVarD6;
        fg0.j jVar;
        kVar.getClass();
        fg0.j eventCustomization = kVar.getEventCustomization();
        if ((eventCustomization != null ? eventCustomization.getCustomGoal() : null) != null) {
            fg0.j eventCustomization2 = kVar.getEventCustomization();
            if (eventCustomization2 != null) {
                jVarD6 = fg0.j.b(eventCustomization2, null, null, null, null, null, null, 8191);
            } else {
                jVar = null;
            }
            jv1.s sVarI6 = i6();
            k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, kVar, tu1.a.w(kVar), null, null, null, null, null, null, false, null, null, null, null, null, null, null, kVar.getDate(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar, null, null, null, null, null, null, null, -537133309, 508) : null);
        }
        jVarD6 = d6();
        jVar = jVarD6;
        jv1.s sVarI7 = i6();
        k8(sVarI7 != null ? jv1.s.a(sVarI7, null, null, kVar, tu1.a.w(kVar), null, null, null, null, null, null, false, null, null, null, null, null, null, null, kVar.getDate(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar, null, null, null, null, null, null, null, -537133309, 508) : null);
    }

    public final vt1.o S5() {
        jv1.s sVarI6 = i6();
        if (sVarI6 != null) {
            return sVarI6.f101125d;
        }
        return null;
    }

    public final boolean S6() {
        ww1.d0 trainingPlanSubType;
        ww1.d0 trainingPlanSubType2;
        kg1.a.f104701a.getClass();
        if (!kg1.a.C2003a.a().J()) {
            if (!R6()) {
                return false;
            }
            List<tw1.m> list = this.f13388u1;
            if (list != null && list.isEmpty()) {
                return false;
            }
            for (tw1.m mVar : list) {
                tw1.n trainingPlanType = mVar.getTrainingPlanType();
                if ((trainingPlanType != null ? trainingPlanType.b() : null) == vt1.o.f180176g) {
                    tw1.l trainingLevel = mVar.getTrainingLevel();
                    if ((trainingLevel != null ? trainingLevel.b() : null) != tw1.k.BEGINNER || (((trainingPlanSubType = mVar.getTrainingPlanSubType()) == null || !trainingPlanSubType.b(ww1.l.CYCLING_EVENT_BASED)) && ((trainingPlanSubType2 = mVar.getTrainingPlanSubType()) == null || !trainingPlanSubType2.b(ww1.l.CYCLING_OPEN_LOOP)))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void S7(vt1.o oVar, vt1.d dVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, oVar, dVar, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536870937, 511) : null);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x019c  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v35, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v44, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v46, types: [p13.j0] */
    public final List<vt1.h> T5() {
        ?? S;
        ww1.d0 trainingPlanSubType;
        tw1.m mVar;
        tw1.n trainingPlanType;
        vt1.o oVarB;
        ww1.d0 trainingPlanSubType2;
        ww1.d0 trainingPlanSubType3;
        ww1.d0 trainingPlanSubType4;
        ww1.d0 trainingPlanSubType5;
        if (!R6() || !((rt1.m) this.f13390w1.getValue()).m()) {
            return p13.j0.f134944a;
        }
        vt1.o oVarS5 = S5();
        jv1.s sVarI6 = i6();
        Object obj = null;
        tw1.k kVar = sVarI6 != null ? sVarI6.O : null;
        if (kVar == null) {
            kVar = oVarS5 == vt1.o.f180179j ? tw1.k.BEGINNER : tw1.k.INTERMEDIATE;
        }
        int i14 = oVarS5 == null ? -1 : b.f13394a[oVarS5.ordinal()];
        if (i14 == 1) {
            ww1.l lVar = Z6() ? ww1.l.RUNNING_OPEN_LOOP : ww1.l.RUNNING_EVENT_BASED;
            for (Object obj2 : this.f13388u1) {
                tw1.m mVar2 = (tw1.m) obj2;
                tw1.n trainingPlanType2 = mVar2.getTrainingPlanType();
                if ((trainingPlanType2 != null ? trainingPlanType2.b() : null) == vt1.o.f180175f && (trainingPlanSubType = mVar2.getTrainingPlanSubType()) != null && trainingPlanSubType.b(lVar)) {
                    tw1.l trainingLevel = mVar2.getTrainingLevel();
                    if ((trainingLevel != null ? trainingLevel.b() : null) == kVar) {
                        obj = obj2;
                        break;
                    }
                }
            }
            tw1.m mVar3 = (tw1.m) obj;
            if (mVar3 == null || (S = mVar3.s()) == 0) {
                S = p13.j0.f134944a;
            }
        } else if (i14 == 2) {
            if (!S6()) {
                kVar = tw1.k.INTERMEDIATE;
            }
            ww1.l lVar2 = Z6() ? ww1.l.CYCLING_OPEN_LOOP : ww1.l.CYCLING_EVENT_BASED;
            if (S6() && kVar == tw1.k.BEGINNER) {
                kg1.a.f104701a.getClass();
                if (kg1.a.C2003a.a().J()) {
                    vt1.h.a aVar = vt1.h.f180113e;
                    boolean zA7 = a7();
                    aVar.getClass();
                    List listB = vt1.h.a.b(zA7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listB) {
                        if (((vt1.h) obj3) != vt1.h.NONE) {
                            arrayList.add(obj3);
                        }
                    }
                    S = new ArrayList(p13.y.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        S.add(tw1.h.valueOf(((vt1.h) it.next()).f180123d));
                    }
                } else {
                    while (r5.hasNext()) {
                        tw1.m mVar4 = (tw1.m) obj;
                        trainingPlanType = mVar4.getTrainingPlanType();
                        if (trainingPlanType != null) {
                            oVarB = trainingPlanType.b();
                        } else {
                            oVarB = null;
                        }
                        if (oVarB != vt1.o.f180176g) {
                        }
                    }
                    mVar = (tw1.m) obj;
                    if (mVar != null) {
                        S = p13.j0.f134944a;
                    } else {
                        S = p13.j0.f134944a;
                    }
                }
            } else {
                for (Object obj4 : this.f13388u1) {
                    tw1.m mVar5 = (tw1.m) obj4;
                    trainingPlanType = mVar5.getTrainingPlanType();
                    if (trainingPlanType != null) {
                        oVarB = trainingPlanType.b();
                    } else {
                        oVarB = null;
                    }
                    if (oVarB != vt1.o.f180176g && (trainingPlanSubType2 = mVar5.getTrainingPlanSubType()) != null && trainingPlanSubType2.b(lVar2)) {
                        tw1.l trainingLevel2 = mVar5.getTrainingLevel();
                        if ((trainingLevel2 != null ? trainingLevel2.b() : null) == kVar) {
                            obj = obj4;
                            break;
                        }
                    }
                }
                mVar = (tw1.m) obj;
                if (mVar != null || (S = mVar.s()) == 0) {
                    S = p13.j0.f134944a;
                }
            }
        } else if (i14 == 3) {
            ww1.l lVar3 = Z6() ? ww1.l.TRIATHLON_OPEN_LOOP : ww1.l.TRIATHLON_EVENT_BASED;
            for (Object obj5 : this.f13388u1) {
                tw1.m mVar6 = (tw1.m) obj5;
                tw1.n trainingPlanType3 = mVar6.getTrainingPlanType();
                if ((trainingPlanType3 != null ? trainingPlanType3.b() : null) == vt1.o.f180178i && (trainingPlanSubType3 = mVar6.getTrainingPlanSubType()) != null && trainingPlanSubType3.b(lVar3)) {
                    obj = obj5;
                    break;
                }
            }
            tw1.m mVar7 = (tw1.m) obj;
            if (mVar7 == null || (S = mVar7.s()) == 0) {
                S = p13.j0.f134944a;
            }
        } else if (i14 == 4) {
            for (Object obj6 : this.f13388u1) {
                tw1.m mVar8 = (tw1.m) obj6;
                tw1.n trainingPlanType4 = mVar8.getTrainingPlanType();
                if ((trainingPlanType4 != null ? trainingPlanType4.b() : null) == vt1.o.f180179j && (trainingPlanSubType4 = mVar8.getTrainingPlanSubType()) != null && trainingPlanSubType4.b(ww1.l.FITNESS_OPEN_LOOP)) {
                    obj = obj6;
                    break;
                }
            }
            tw1.m mVar9 = (tw1.m) obj;
            if (mVar9 == null || (S = mVar9.s()) == 0) {
                S = p13.j0.f134944a;
            }
        } else if (i14 != 5) {
            S = p13.j0.f134944a;
        } else {
            for (Object obj7 : this.f13388u1) {
                tw1.m mVar10 = (tw1.m) obj7;
                tw1.n trainingPlanType5 = mVar10.getTrainingPlanType();
                if ((trainingPlanType5 != null ? trainingPlanType5.b() : null) == vt1.o.f180180k && (trainingPlanSubType5 = mVar10.getTrainingPlanSubType()) != null && trainingPlanSubType5.b(ww1.l.FROG_OPEN_LOOP)) {
                    obj = obj7;
                    break;
                }
            }
            tw1.m mVar11 = (tw1.m) obj;
            if (mVar11 == null || (S = mVar11.s()) == 0) {
                S = p13.j0.f134944a;
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(S, 10));
        for (tw1.h hVar : S) {
            vt1.h.a aVar2 = vt1.h.f180113e;
            String str = hVar.f166715a;
            aVar2.getClass();
            arrayList2.add(vt1.h.a.a(str));
        }
        List<vt1.h> listN0 = p13.h0.N0(arrayList2, new c());
        return !listN0.isEmpty() ? p13.h0.D0(listN0, vt1.h.NONE) : listN0;
    }

    public final boolean T6() {
        if (b8() && a7()) {
            return true;
        }
        return a8() && a7();
    }

    public final void T7(vt1.h hVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, hVar, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, 511) : null);
    }

    public final boolean U5() {
        List<tw1.m> list = this.f13388u1;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            tw1.n trainingPlanType = ((tw1.m) it.next()).getTrainingPlanType();
            if ((trainingPlanType != null ? trainingPlanType.b() : null) == vt1.o.f180176g) {
                return true;
            }
        }
        return false;
    }

    public final boolean U6() {
        ww1.d0 trainingPlanSubType;
        ww1.d0 trainingPlanSubType2;
        if (!R6() || !((rt1.m) this.f13390w1.getValue()).n()) {
            return false;
        }
        List<tw1.m> list = this.f13388u1;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (tw1.m mVar : list) {
            tw1.n trainingPlanType = mVar.getTrainingPlanType();
            if ((trainingPlanType != null ? trainingPlanType.b() : null) == vt1.o.f180175f) {
                tw1.l trainingLevel = mVar.getTrainingLevel();
                if ((trainingLevel != null ? trainingLevel.b() : null) == tw1.k.BEGINNER && (((trainingPlanSubType = mVar.getTrainingPlanSubType()) != null && trainingPlanSubType.b(ww1.l.RUNNING_EVENT_BASED)) || ((trainingPlanSubType2 = mVar.getTrainingPlanSubType()) != null && trainingPlanSubType2.b(ww1.l.RUNNING_OPEN_LOOP)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void U7(tw1.k kVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kVar, -1, 255) : null);
    }

    public final boolean V5() {
        List<tw1.m> list = this.f13388u1;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            tw1.n trainingPlanType = ((tw1.m) it.next()).getTrainingPlanType();
            if ((trainingPlanType != null ? trainingPlanType.b() : null) == vt1.o.f180175f) {
                return true;
            }
        }
        return false;
    }

    public final boolean V6() {
        jv1.s sVarI6 = i6();
        return (sVarI6 != null ? sVarI6.f101123b : null) == vt1.m.FBT_ADAPTIVE;
    }

    public final void V7(fg0.j jVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, jVar, null, null, null, null, null, null, null, -1, 509) : null);
        if (this.f13385r1) {
            return;
        }
        h7();
    }

    public final boolean W5() {
        List<tw1.m> list = this.f13388u1;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            tw1.n trainingPlanType = ((tw1.m) it.next()).getTrainingPlanType();
            if ((trainingPlanType != null ? trainingPlanType.b() : null) == vt1.o.f180178i) {
                return true;
            }
        }
        return false;
    }

    public final boolean W6() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.f101125d == vt1.o.f180180k;
    }

    public final void W7(jv1.d0 d0Var) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, d0Var, null, null, null, null, null, null, -1, 507) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hv1.i X5() {
        hv1.i iVar;
        jv1.s sVar = (jv1.s) j6().d();
        jv1.d0 d0Var = sVar != null ? sVar.I : null;
        jv1.s sVar2 = (jv1.s) j6().d();
        if (sVar2 != null && (iVar = sVar2.f101137p) != null) {
            return iVar;
        }
        if (d0Var != null) {
            return d0Var.f101029a;
        }
        return null;
    }

    public final boolean X6() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.f101125d == vt1.o.f180179j;
    }

    public final boolean X7() {
        jv1.s sVarI6 = i6();
        jv1.o oVar = sVarI6 != null ? sVarI6.K : null;
        if (oVar == null || (oVar instanceof jv1.o.b)) {
            return false;
        }
        if (!(oVar instanceof jv1.o.a)) {
            return true;
        }
        jv1.s sVarI7 = i6();
        Double d14 = sVarI7 != null ? sVarI7.L : null;
        Double dZ5 = Z5();
        return zf.b.D(d14) && zf.b.D(dZ5) && dZ5.doubleValue() > 0.0d && d14.doubleValue() / dZ5.doubleValue() > 7.0E-4d;
    }

    public final int Y5() {
        if (!R6()) {
            zv1.b bVar = zv1.b.f207177a;
            boolean zO6 = O6();
            b7();
            bVar.getClass();
            if (zO6) {
                return 17;
            }
        } else {
            if (d7()) {
                zv1.b bVar2 = zv1.b.f207177a;
                boolean zO7 = O6();
                boolean zB7 = b7();
                boolean zE7 = e7();
                bVar2.getClass();
                if (!zB7) {
                    if (zO7) {
                        return 22;
                    }
                    if (zE7) {
                        return 21;
                    }
                }
                return 16;
            }
            if (!N6()) {
                if (!Z6()) {
                    zv1.b bVar3 = zv1.b.f207177a;
                    boolean zO8 = O6();
                    boolean zB8 = b7();
                    boolean zE8 = e7();
                    bVar3.getClass();
                    if (!zB8) {
                        if (zO8) {
                            return 22;
                        }
                        if (zE8) {
                            return 21;
                        }
                    }
                    return 16;
                }
                zv1.b bVar4 = zv1.b.f207177a;
                boolean zO9 = O6();
                boolean zB9 = b7();
                boolean zE9 = e7();
                boolean zX6 = X6();
                boolean zW6 = W6();
                jv1.s sVarI6 = i6();
                boolean z14 = false;
                if (sVarI6 != null && sVarI6.f101125d == vt1.o.f180181l) {
                    z14 = true;
                }
                bVar4.getClass();
                if (zB9 || zO9) {
                    return 9;
                }
                if (zE9) {
                    return 10;
                }
                if (zX6) {
                    return 5;
                }
                if (zW6) {
                    return 4;
                }
                return z14 ? 5 : 9;
            }
            zv1.b bVar5 = zv1.b.f207177a;
            boolean zO10 = O6();
            boolean zB10 = b7();
            boolean zE10 = e7();
            bVar5.getClass();
            if (!zB10) {
                if (zO10) {
                    return 22;
                }
                if (zE10) {
                    return 21;
                }
            }
        }
        return 16;
    }

    public final boolean Y6() {
        jv1.s sVarI6 = i6();
        return (sVarI6 != null ? sVarI6.f101123b : null) == vt1.m.ITP;
    }

    public final boolean Y7() {
        fg0.k kVarF;
        jv1.s sVarI6 = i6();
        return !(sVarI6 == null || (kVarF = sVarI6.f()) == null || !kVarF.n0()) || N6();
    }

    public final Double Z5() {
        jv1.s sVarI6 = i6();
        jv1.h hVar = sVarI6 != null ? sVarI6.f101127f : null;
        if (!(hVar instanceof jv1.g)) {
            return null;
        }
        og0.a aVar = og0.a.f131967a;
        jv1.g gVar = (jv1.g) hVar;
        Double d14 = gVar.f101056e;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        gg0.i iVar = gVar.f101055d;
        if (iVar == null) {
            iVar = gg0.i.KILOMETER;
        }
        aVar.getClass();
        return Double.valueOf(og0.a.g(dDoubleValue, iVar));
    }

    public final boolean Z6() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.f101122a == vt1.e.IMPROVE_FITNESS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z7(fg0.p pVar, String str, v13.c cVar) {
        p0 p0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f13539d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f13539d = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objJ = p0Var.f13537b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f13539d;
        if (i15 == 0) {
            o13.r.b(objJ);
            ig0.b bVarH4 = H4();
            p0Var.f13536a = pVar;
            p0Var.f13539d = 1;
            bVarH4.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVarH4, new ig0.c(bVarH4, str, pVar, null), p0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar = p0Var.f13536a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.a) {
            String str2 = "Failed to subscribe to the event Name " + pVar.getEventName() + StringUtils.SPACE + ((v2.a) v2Var).f47383a;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", str2);
        }
        return v2Var;
    }

    public final vt1.o a6() {
        jv1.s sVarI6 = i6();
        if (sVarI6 != null) {
            return sVarI6.f101125d;
        }
        return null;
    }

    public final boolean a7() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.O == tw1.k.BEGINNER;
    }

    public final boolean a8() {
        jv1.h hVarE5;
        if (S6() && O6()) {
            return !(!V6() || (hVarE5 = E5()) == null || tu1.a.l(hVarE5)) || Z6();
        }
        return false;
    }

    public final fg0.k b6() {
        jv1.s sVarI6 = i6();
        fg0.k kVarF = sVarI6 != null ? sVarI6.f() : null;
        return kVarF != null ? eg0.c.a(kVarF, d6()) : n5();
    }

    public final boolean b7() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.f101125d == vt1.o.f180175f;
    }

    public final boolean b8() {
        jv1.h hVarE5;
        if (U6() && b7()) {
            return !(!V6() || (hVarE5 = E5()) == null || tu1.a.m(hVarE5)) || Z6();
        }
        return false;
    }

    public final fy1.d c6() {
        return new fy1.d(C5("TI_TRIATHLON_GOAL_TYPE_SCREEN"), C5("TI_TRIATHLON_OVERALL_GOAL_SCREEN"), C5("TI_TRIATHLON_SWIMMING_LEG_GOAL_SCREEN"), C5("TI_TRIATHLON_CYCLING_LEG_GOAL_SCREEN"), C5("TI_TRIATHLON_RUNNING_LEG_GOAL_SCREEN"), C5("TI_TRIATHLON_LEG_GOALS_REVIEW_SCREEN"));
    }

    public final boolean c7() {
        fg0.k kVar;
        fg0.d completionTarget;
        jv1.s sVarI6 = i6();
        if (((sVarI6 == null || (kVar = sVarI6.f101124c) == null || (completionTarget = kVar.getCompletionTarget()) == null) ? null : completionTarget.getUnitType()) != gg0.h.TIME) {
            return (sVarI6 != null ? sVarI6.f101127f : null) instanceof jv1.i;
        }
        return true;
    }

    public final boolean c8() {
        vt1.o oVarA6 = a6();
        int i14 = oVarA6 == null ? -1 : b.f13394a[oVarA6.ordinal()];
        if (i14 == 1) {
            return b8();
        }
        if (i14 == 2) {
            return a8();
        }
        if (Z6()) {
            return U6() || S6();
        }
        return false;
    }

    public final fg0.j d6() {
        jv1.s sVarI6 = i6();
        if (sVarI6 != null) {
            return sVarI6.H;
        }
        return null;
    }

    public final boolean d7() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.f101122a == vt1.e.TRAIN_FOR_A_RACE;
    }

    public final void d8() {
        jv1.s sVarA = null;
        if (R6()) {
            jv1.s sVarI6 = i6();
            if (sVarI6 != null) {
                sVarA = jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262373, 508);
            }
        } else {
            jv1.s sVarI7 = i6();
            if (sVarI7 != null) {
                sVarA = jv1.s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262149, 511);
            }
        }
        k8(sVarA);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e5(String str, Object obj, androidx.fragment.app.m mVar) {
        str.getClass();
        Context contextB = ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).b();
        switch (str.hashCode()) {
            case -1559894858:
                if (str.equals("startEditWorkoutDaysFlow")) {
                    this.f13385r1 = false;
                    this.I0 = false;
                    this.J0 = true;
                    y0<jv1.s> y0VarF5 = F5();
                    jv1.s sVarD = J5().d();
                    y0VarF5.m(sVarD != null ? jv1.s.a(sVarD, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511) : new jv1.s(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511, null));
                    s6().j("FBTWorkoutsPerWeekSelectionFragment");
                    break;
                }
                break;
            case -1278608488:
                if (str.equals("navigateToTriathlonOverallGoalTime") && mVar != null) {
                    ((zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null)).g(mVar, b6(), false, c6(), Integer.valueOf(Y5()), this.f13385r1);
                }
                break;
            case -723133776:
                if (str.equals("navigateToTriathlonTransitionRow") && obj != null) {
                    o13.p pVar = (o13.p) obj;
                    String str2 = (String) pVar.f128594a;
                    com.garmin.android.apps.connectmobile.workouts.data.model.c cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) pVar.f128595b;
                    if (mVar != null) {
                        og0.a aVar = og0.a.f131967a;
                        androidx.fragment.app.v supportFragmentManager = mVar.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        a42.i iVar = new a42.i(18, cVar, this);
                        aVar.getClass();
                        og0.a.E(supportFragmentManager, contextB, str2, cVar, iVar);
                    }
                }
                break;
            case -505882076:
                if (str.equals("navigateToTriathlonGoalSelection") && mVar != null) {
                    m7(mVar);
                }
                break;
            case -210167856:
                if (str.equals("startCoachEditFlow")) {
                    this.f13385r1 = false;
                    this.I0 = true;
                    this.J0 = false;
                    y0<jv1.s> y0VarF6 = F5();
                    jv1.s sVarD2 = J5().d();
                    y0VarF6.m(sVarD2 != null ? jv1.s.a(sVarD2, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511) : new jv1.s(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511, null));
                    h7();
                    break;
                }
                break;
            case 560686640:
                if (str.equals("course_profile_action")) {
                    if (!Y7()) {
                        s6().j("FBTElevationProfileFragment");
                    } else {
                        s6().j("FBTAddCourseFragment");
                    }
                    break;
                }
                break;
            case 1556614842:
                if (str.equals("navigateToTriathlonEditGoalSelection")) {
                    obj.getClass();
                    m52.c cVar2 = (m52.c) obj;
                    if (mVar != null) {
                        ((zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null)).h(mVar, b6(), cVar2);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String e6(Context context) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listB;
        ww1.w wVar;
        fg0.k kVar;
        context.getClass();
        jv1.s sVar = (jv1.s) j6().d();
        if ((sVar != null ? sVar.f101124c : null) != null) {
            jv1.s sVar2 = (jv1.s) j6().d();
            if (sVar2 == null || (kVar = sVar2.f101124c) == null || (listB = kVar.h()) == null) {
                listB = p13.j0.f134944a;
            }
        } else {
            jv1.s sVar3 = (jv1.s) j6().d();
            if (sVar3 == null || (wVar = sVar3.G) == null || (listB = wVar.b()) == null) {
                listB = p13.j0.f134944a;
            }
        }
        og0.a.f131967a.getClass();
        double D = og0.a.D(listB);
        m52.i iVarK = tu1.a.k(this.f13389v1, D);
        if (iVarK == m52.i.CUSTOM) {
            fy1.i.f73924a.getClass();
            return fy1.i.a.d(D, context, this.f13384q1);
        }
        tu1.i.f166483a.getClass();
        return tu1.i.a.k(context, iVarK, false);
    }

    public final boolean e7() {
        jv1.s sVarI6 = i6();
        return sVarI6 != null && sVarI6.f101125d == vt1.o.f180178i;
    }

    public final void e8(List<String> list, boolean z14) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, 511) : null);
        if (list == null) {
            k6().m(null);
        }
        if (z14) {
            if (!X6()) {
                j7();
            } else if (this.f13383p1) {
                l7();
            } else {
                s6().j("FBTGoalDateSelectionFragmentCompose");
            }
        }
    }

    public final Object f5(fg0.k kVar, tw1.m mVar, fg0.d dVar, List list, v13.c cVar) {
        fg0.j eventCustomization = kVar.getEventCustomization();
        fg0.j jVar = eventCustomization == null ? new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : eventCustomization;
        long trainingPlanId = mVar.getTrainingPlanId();
        gg0.e.a aVar = gg0.e.f77121b;
        String trainingPlanCategory = mVar.getTrainingPlanCategory();
        aVar.getClass();
        for (gg0.e eVar : gg0.e.values()) {
            if (p005kotlin.jvm.internal.s.g(eVar.f77127a, trainingPlanCategory)) {
                return V4(fg0.k.d(kVar, null, null, null, null, null, null, fg0.j.b(jVar, dVar, list, null, null, new Long(trainingPlanId), eVar, 7996), -16777217), cVar);
            }
        }
        eVar = null;
        return V4(fg0.k.d(kVar, null, null, null, null, null, null, fg0.j.b(jVar, dVar, list, null, null, new Long(trainingPlanId), eVar, 7996), -16777217), cVar);
    }

    public final Double f6() {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        fg0.k kVar;
        jv1.s sVarI6 = i6();
        ww1.w wVar = sVarI6 != null ? sVarI6.G : null;
        if (wVar == null || (listH = wVar.b()) == null) {
            jv1.s sVarI7 = i6();
            listH = (sVarI7 == null || (kVar = sVarI7.f101124c) == null) ? null : kVar.h();
            if (listH == null) {
                return null;
            }
        }
        og0.a.f131967a.getClass();
        return Double.valueOf(og0.a.D(listH));
    }

    public final void f7() {
        s6().j("FBTAvailableTrainingDaysFragCompose");
    }

    public final void f8(xw1.h hVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, hVar, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, 511) : null);
    }

    public final void g6(String str) {
        o13.p<DateTime, DateTime> pVarN5 = N5();
        ge1.b.T(v1.a(this), null, null, new d(str, pVarN5.f128594a, pVarN5.f128595b, null), 3);
    }

    public final void g7() {
        s6().j("FBTCoachRecommendationFragCompose");
    }

    public final void g8(tw1.c cVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, cVar, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, 511) : null);
    }

    public final String h5(androidx.fragment.app.m mVar, fg0.k kVar) {
        String strK;
        Double dB;
        if (!N6()) {
            return null;
        }
        fg0.d completionTarget = kVar.getCompletionTarget();
        double dDoubleValue = (completionTarget == null || (dB = completionTarget.b()) == null) ? 0.0d : dB.doubleValue();
        m52.i iVarK = tu1.a.k(this.f13389v1, dDoubleValue);
        if (iVarK == m52.i.CUSTOM) {
            fy1.i.f73924a.getClass();
            strK = fy1.i.a.d(dDoubleValue, mVar, this.f13384q1);
        } else {
            tu1.i.f166483a.getClass();
            strK = tu1.i.a.k(mVar, iVarK, true);
        }
        return mVar.getString(R.string.what_is_goal_for_this_distance, strK);
    }

    public final kv1.y h6() {
        return (kv1.y) this.X.getValue();
    }

    public final void h7() {
        s6().j("FBTCoachSelectionComposeFragment");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x017a  */
    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0188  */
    /* JADX WARN: Code duplicated, block: B:112:0x018e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0194  */
    /* JADX WARN: Code duplicated, block: B:117:0x019d  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c1 A[PHI: r0 r3
      0x01c1: PHI (r0v55 java.lang.Object) = (r0v42 java.lang.Object), (r0v1 java.lang.Object) binds: [B:126:0x01bd, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r3v6 fg0.k) = (r3v4 fg0.k), (r3v8 fg0.k) binds: [B:126:0x01bd, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x0200  */
    /* JADX WARN: Code duplicated, block: B:142:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x020d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0211  */
    /* JADX WARN: Code duplicated, block: B:150:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0218  */
    /* JADX WARN: Code duplicated, block: B:153:0x0222  */
    /* JADX WARN: Code duplicated, block: B:166:0x024b  */
    /* JADX WARN: Code duplicated, block: B:168:0x024e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0250 A[PHI: r0
      0x0250: PHI (r0v62 java.lang.String) = (r0v61 java.lang.String), (r0v66 java.lang.String) binds: [B:149:0x0214, B:168:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x0255  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b  */
    /* JADX WARN: Code duplicated, block: B:89:0x013e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:94:0x014c  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0164  */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0263, code lost:
    
        if (y7(r3, r4, r5, r6, r7) == r1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d6, code lost:
    
        if (r0 == r1) goto L174;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h8(tw1.m mVar, v13.c cVar) {
        q0 q0Var;
        h hVar;
        fg0.k kVar;
        jv1.m mVar2;
        fg0.d dVarC;
        fg0.d dVar;
        z20.e eVar;
        z20.e eVar2;
        jv1.s sVarI6;
        List<String> list;
        jv1.s sVarI7;
        List list2;
        List list3;
        jv1.s sVarI8;
        List list4;
        List list5;
        jv1.s sVarI9;
        jv1.e0 e0Var;
        long userProfilePk;
        int size;
        jv1.e0 e0Var2;
        jv1.a aVar;
        Long lI;
        v2 v2Var;
        jv1.s sVarI10;
        jv1.o oVar;
        jv1.s sVarI11;
        hv1.e eVar3;
        jv1.s sVarI12;
        Double d14;
        String str;
        String str2;
        jv1.s sVarI13;
        jv1.o oVar2;
        List<jv1.o> list6;
        Object next;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f13548d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f13548d = i14 - Integer.MIN_VALUE;
                hVar = this;
            } else {
                hVar = this;
                q0Var = new q0(hVar, cVar);
            }
        } else {
            hVar = this;
            q0Var = new q0(hVar, cVar);
        }
        q0 q0Var2 = q0Var;
        Object objF5 = q0Var2.f13546b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var2.f13548d;
        if (i15 != 0) {
            if (i15 == 1) {
                kVar = q0Var2.f13545a;
                o13.r.b(objF5);
            } else {
                if (i15 == 2) {
                    kVar = q0Var2.f13545a;
                    o13.r.b(objF5);
                    v2Var = (v2) objF5;
                    if (v2Var != null && (v2Var instanceof v2.a)) {
                        v2.a aVar3 = (v2.a) v2Var;
                        String str3 = "Error occurred while updating FBT training days User settings " + aVar3.f47384b + " :: " + aVar3.f47383a;
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.f(a2Var, "FBTPlanWizardViewModel", str3);
                    }
                    sVarI10 = i6();
                    if (sVarI10 != null) {
                        oVar = sVarI10.K;
                    } else {
                        oVar = null;
                    }
                    sVarI11 = i6();
                    if (sVarI11 != null) {
                        eVar3 = sVarI11.M;
                    } else {
                        eVar3 = null;
                    }
                    if (kVar != null && oVar != null && eVar3 != null) {
                        sVarI12 = i6();
                        if (sVarI12 != null) {
                            d14 = sVarI12.L;
                        } else {
                            d14 = null;
                        }
                        str = oVar.f101105a;
                        if (str != null) {
                            str2 = str;
                        } else {
                            if (d14 != null) {
                                double dDoubleValue = d14.doubleValue();
                                sVarI13 = i6();
                                if (sVarI13 != null || (list6 = sVarI13.J) == null) {
                                    oVar2 = null;
                                } else {
                                    Iterator<T> it = list6.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        jv1.o oVar3 = (jv1.o) next;
                                        double d15 = oVar3.f101107c;
                                        if (dDoubleValue <= oVar3.f101108d && d15 <= dDoubleValue) {
                                            break;
                                        }
                                    }
                                    oVar2 = (jv1.o) next;
                                }
                                if (oVar2 != null) {
                                    str = oVar2.f101105a;
                                    str2 = str;
                                }
                            }
                            str2 = null;
                        }
                        if (str2 != null) {
                            String str4 = eVar3.f85848a;
                            q0Var2.f13545a = null;
                            q0Var2.f13548d = 3;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objF5);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objF5);
        jv1.s sVarI14 = hVar.i6();
        kVar = sVarI14 != null ? sVarI14.f101124c : null;
        if (hVar.e7()) {
            fg0.j jVarD6 = hVar.d6();
            if (jVarD6 != null) {
                dVarC = jVarD6.getCustomGoal();
                dVar = dVarC;
            } else {
                dVar = null;
            }
        } else {
            jv1.s sVarI15 = hVar.i6();
            if (sVarI15 == null || (mVar2 = sVarI15.f101129h) == null) {
                dVar = null;
            } else {
                dVarC = mVar2.c();
                dVar = dVarC;
            }
        }
        fg0.j jVarD7 = hVar.d6();
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH = jVarD7 != null ? jVarD7.h() : null;
        jv1.s sVarI16 = hVar.i6();
        if (sVarI16 != null && sVarI16.N != null) {
            if ((kVar != null ? kVar.getCourseId() : null) == null && kVar != null) {
                jv1.s sVarI17 = hVar.i6();
                kVar.z0((sVarI17 == null || (eVar2 = sVarI17.N) == null) ? null : d53.t.j(eVar2.f201897a));
                jv1.s sVarI18 = hVar.i6();
                kVar.A0((sVarI18 == null || (eVar = sVarI18.N) == null) ? null : eVar.f201898b);
            }
        }
        if (kVar != null) {
            q0Var2.f13545a = kVar;
            q0Var2.f13548d = 1;
            objF5 = hVar.f5(kVar, mVar, dVar, listH, q0Var2);
        } else {
            q0Var2.f13545a = kVar;
            q0Var2.f13548d = 2;
            sVarI6 = i6();
            if (sVarI6 != null) {
                list = sVarI6.f101134m;
            } else {
                list = null;
            }
            sVarI7 = i6();
            if (sVarI7 != null || (list2 = sVarI7.f101135n) == null) {
                list2 = p13.j0.f134944a;
            }
            list3 = list2;
            sVarI8 = i6();
            if (sVarI8 != null || (list4 = sVarI8.f101136o) == null) {
                list4 = p13.j0.f134944a;
            }
            list5 = list4;
            sVarI9 = i6();
            if (sVarI9 != null) {
                e0Var = sVarI9.f101133l;
            } else {
                e0Var = null;
            }
            if (e0Var != null || (lI = e0Var.getUserProfilePk()) == null) {
                userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
            } else {
                userProfilePk = lI.longValue();
            }
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (e0Var != null) {
                Long l14 = new Long(userProfilePk);
                if (e7()) {
                    aVar = jv1.a.TRIATHLON;
                } else if (X6()) {
                    aVar = jv1.a.FITNESS;
                } else if (!T6() && size == 3) {
                    aVar = jv1.a.NOVICE_3_DAYS;
                } else if (T6() || size != 4) {
                    aVar = jv1.a.GENERIC;
                } else {
                    aVar = jv1.a.NOVICE_4_DAYS;
                }
                e0Var2 = new jv1.e0(l14, list, list3, list5, aVar);
            } else {
                e0Var2 = null;
            }
            if (!p005kotlin.jvm.internal.s.g(e0Var, e0Var2) || e0Var2 == null) {
                objF5 = null;
            } else {
                kv1.y yVarH6 = h6();
                yVarH6.getClass();
                objF5 = com.garmin.android.apps.connectmobile.f0.J(yVarH6, new kv1.b0(yVarH6, e0Var2, null), q0Var2);
                if (objF5 != aVar2) {
                    objF5 = (v2) objF5;
                }
            }
            if (objF5 != aVar2) {
                v2Var = (v2) objF5;
                if (v2Var != null) {
                    v2.a aVar5 = (v2.a) v2Var;
                    String str5 = "Error occurred while updating FBT training days User settings " + aVar5.f47384b + " :: " + aVar5.f47383a;
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var2, "FBTPlanWizardViewModel", str5);
                }
                sVarI10 = i6();
                if (sVarI10 != null) {
                    oVar = sVarI10.K;
                } else {
                    oVar = null;
                }
                sVarI11 = i6();
                if (sVarI11 != null) {
                    eVar3 = sVarI11.M;
                } else {
                    eVar3 = null;
                }
                if (kVar != null) {
                    sVarI12 = i6();
                    if (sVarI12 != null) {
                        d14 = sVarI12.L;
                    } else {
                        d14 = null;
                    }
                    str = oVar.f101105a;
                    if (str != null) {
                        str2 = str;
                    } else {
                        if (d14 != null) {
                            double dDoubleValue2 = d14.doubleValue();
                            sVarI13 = i6();
                            if (sVarI13 != null) {
                                oVar2 = null;
                            } else {
                                oVar2 = null;
                            }
                            if (oVar2 != null) {
                                str = oVar2.f101105a;
                                str2 = str;
                            }
                        }
                        str2 = null;
                    }
                    if (str2 != null) {
                        String str6 = eVar3.f85848a;
                        q0Var2.f13545a = null;
                        q0Var2.f13548d = 3;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        return aVar2;
        v2 v2Var2 = (v2) objF5;
        if (v2Var2 instanceof v2.a) {
            v2.a aVar7 = (v2.a) v2Var2;
            String str7 = "Error occurred while updating FBT details to event " + aVar7.f47384b + " :: " + aVar7.f47383a;
            i2.a aVar8 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar8.getClass();
            i2.a.f(a2Var3, "FBTPlanWizardViewModel", str7);
        }
        q0Var2.f13545a = kVar;
        q0Var2.f13548d = 2;
        sVarI6 = i6();
        if (sVarI6 != null) {
            list = sVarI6.f101134m;
        } else {
            list = null;
        }
        sVarI7 = i6();
        if (sVarI7 != null) {
            list2 = p13.j0.f134944a;
        } else {
            list2 = p13.j0.f134944a;
        }
        list3 = list2;
        sVarI8 = i6();
        if (sVarI8 != null) {
            list4 = p13.j0.f134944a;
        } else {
            list4 = p13.j0.f134944a;
        }
        list5 = list4;
        sVarI9 = i6();
        if (sVarI9 != null) {
            e0Var = sVarI9.f101133l;
        } else {
            e0Var = null;
        }
        if (e0Var != null) {
            userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        } else {
            userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
        }
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (e0Var != null) {
            Long l15 = new Long(userProfilePk);
            if (e7()) {
                aVar = jv1.a.TRIATHLON;
            } else if (X6()) {
                aVar = jv1.a.FITNESS;
            } else if (!T6()) {
                if (T6()) {
                    aVar = jv1.a.GENERIC;
                } else {
                    aVar = jv1.a.GENERIC;
                }
            } else if (T6()) {
                aVar = jv1.a.GENERIC;
            } else {
                aVar = jv1.a.GENERIC;
            }
            e0Var2 = new jv1.e0(l15, list, list3, list5, aVar);
        } else {
            e0Var2 = null;
        }
        if (p005kotlin.jvm.internal.s.g(e0Var, e0Var2)) {
            objF5 = null;
        } else {
            objF5 = null;
        }
        if (objF5 != aVar2) {
            v2Var = (v2) objF5;
            if (v2Var != null) {
                v2.a aVar9 = (v2.a) v2Var;
                String str8 = "Error occurred while updating FBT training days User settings " + aVar9.f47384b + " :: " + aVar9.f47383a;
                i2.a aVar10 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar10.getClass();
                i2.a.f(a2Var4, "FBTPlanWizardViewModel", str8);
            }
            sVarI10 = i6();
            if (sVarI10 != null) {
                oVar = sVarI10.K;
            } else {
                oVar = null;
            }
            sVarI11 = i6();
            if (sVarI11 != null) {
                eVar3 = sVarI11.M;
            } else {
                eVar3 = null;
            }
            if (kVar != null) {
                sVarI12 = i6();
                if (sVarI12 != null) {
                    d14 = sVarI12.L;
                } else {
                    d14 = null;
                }
                str = oVar.f101105a;
                if (str != null) {
                    str2 = str;
                } else {
                    if (d14 != null) {
                        double dDoubleValue3 = d14.doubleValue();
                        sVarI13 = i6();
                        if (sVarI13 != null) {
                            oVar2 = null;
                        } else {
                            oVar2 = null;
                        }
                        if (oVar2 != null) {
                            str = oVar2.f101105a;
                            str2 = str;
                        }
                    }
                    str2 = null;
                }
                if (str2 != null) {
                    String str9 = eVar3.f85848a;
                    q0Var2.f13545a = null;
                    q0Var2.f13548d = 3;
                }
            }
            return Unit.INSTANCE;
        }
        return aVar2;
    }

    public final jv1.s i6() {
        return (this.I0 || this.J0) ? F5().d() : J5().d();
    }

    public final void i7() {
        s6().j("FBTGoalTypeSelectionFragment");
    }

    public final void i8(vt1.m mVar) {
        mVar.getClass();
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, mVar, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 511) : null);
    }

    public final void j5(vt1.n nVar, boolean z14, boolean z15) {
        if (nVar == vt1.n.MARATHON) {
            ge1.b.T(v1.a(this), null, null, new m(this, z15, nVar, null), 3);
        } else {
            ge1.b.T(v1.a(this), null, null, new l(this, nVar, z14, z15, null), 3);
        }
    }

    public final y0 j6() {
        return (this.I0 || this.J0) ? F5() : J5();
    }

    public final void j7() {
        s6().j("FBTLongDaysSelectionFragCompose");
    }

    public final void j8(fg0.k kVar, fg0.k kVar2) {
        fg0.j jVar;
        fg0.j eventCustomization;
        kVar.getClass();
        fg0.k kVarD = kVar2 != null ? fg0.k.d(kVar2, null, null, null, null, null, null, (kVar2 == null || (eventCustomization = kVar2.getEventCustomization()) == null) ? null : fg0.j.b(eventCustomization, null, null, Boolean.FALSE, null, null, null, 8187), -16777217) : null;
        fg0.j eventCustomization2 = kVar.getEventCustomization();
        if (eventCustomization2 != null) {
            Boolean bool = Boolean.TRUE;
            jVar = fg0.j.b(eventCustomization2, null, null, bool, bool, null, null, 8155);
        } else {
            Boolean bool2 = Boolean.TRUE;
            jVar = new fg0.j(null, null, bool2, null, null, bool2, null, null, null, null, null, null, null, 8155, null);
        }
        fg0.k kVarD2 = fg0.k.d(kVar, null, null, null, null, null, null, jVar, -16777217);
        if (kVarD != null) {
            W4(kVarD, kVarD2);
        } else {
            U4(kVarD2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public final boolean k5() {
        ww1.w wVar;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listB;
        jv1.e eVar;
        fg0.k kVar;
        t7();
        jv1.s sVarI6 = i6();
        jv1.d0 d0Var = sVarI6 != null ? sVarI6.I : null;
        jv1.s sVarI7 = i6();
        if ((sVarI7 != null ? sVarI7.f101124c : null) != null) {
            jv1.s sVarI8 = i6();
            if (sVarI8 == null || (kVar = sVarI8.f101124c) == null) {
                listB = null;
            } else {
                listB = kVar.h();
            }
        } else {
            jv1.s sVarI9 = i6();
            if (sVarI9 == null || (wVar = sVarI9.G) == null) {
                listB = null;
            } else {
                listB = wVar.b();
            }
        }
        if (d0Var == null || listB == null) {
            eVar = new jv1.e(false, null, null, null, null, null, false, false, null, null, 1022, null);
        } else {
            og0.a.f131967a.getClass();
            eVar = (tu1.a.n(this.f13389v1, og0.a.D(listB)) && (d0Var.f101030b == hv1.f.ZERO_FOUR || d0Var.f101029a == hv1.i.NOVICE || d0Var.f101031c.f101026a.b() <= 5)) ? new jv1.e(true, null, null, m52.i.HALF_IRON, m52.i.STANDARD, null, false, false, null, null, DescriptorProtos.Edition.EDITION_PROTO2_VALUE, null) : new jv1.e(false, null, null, null, null, null, false, false, null, null, 1022, null);
        }
        jv1.s sVarI10 = i6();
        k8(sVarI10 != null ? jv1.s.a(sVarI10, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
        return eVar.f101032a;
    }

    public final y0<g3<List<mv1.f>>> k6() {
        return (y0) this.S0.getValue();
    }

    public final void k7() {
        boolean z14 = this.I0;
        if (z14) {
            if (z14) {
                y0<jv1.s> y0VarJ5 = J5();
                jv1.s sVarD = F5().d();
                y0VarJ5.m(sVarD != null ? jv1.s.a(sVarD, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511) : null);
            }
            this.I0 = false;
            F5().m(null);
        } else {
            boolean z15 = this.J0;
            if (z15) {
                if (z15) {
                    y0<jv1.s> y0VarJ6 = J5();
                    jv1.s sVarD2 = F5().d();
                    y0VarJ6.m(sVarD2 != null ? jv1.s.a(sVarD2, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511) : null);
                }
                this.J0 = false;
                F5().m(null);
            }
        }
        s6().j("FBTReviewInformationFragCompose");
    }

    public final void k8(jv1.s sVar) {
        if (this.I0 || this.J0) {
            F5().m(sVar);
        } else {
            J5().m(sVar);
        }
    }

    public final void l5() {
        n6().m(null);
    }

    public final void l7() {
        s6().j("FBTSelectStrengthWorkoutTypeFragment");
    }

    public final void l8(int i14) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, Integer.valueOf(i14), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 511) : null);
        if (M6()) {
            f7();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r3 == r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r3 == r7) goto L40;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00de, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5(Context context, fg0.k kVar, v13.c cVar) {
        p pVar;
        v2 aVar;
        Long id3;
        Context context2 = context;
        fg0.k kVar2 = kVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f13535e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f13535e = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        p pVar2 = pVar;
        Object objJ = pVar2.f13533c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar2.f13535e;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (kVar2.getDate() == null) {
                aVar = new v2.a(new InvalidParameterException("Invalid EventDTO"), null, null, 6, null);
                if (!(aVar instanceof v2.b)) {
                    fg0.k kVar3 = (fg0.k) ((v2.b) aVar).f47386a;
                    id3 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    Uri selectedImageUrlPath = kVar2.getSelectedImageUrlPath();
                    if (id3 != null) {
                    }
                    return aVar;
                }
                if (!(aVar instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String str = "Error in creating the event Name : " + kVar2.getEventName() + StringUtils.SPACE + ((v2.a) aVar).f47383a;
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "FBTPlanWizardViewModel", str);
                return aVar;
            }
            boolean zN6 = N6();
            zf0.d dVar = this.f204384a;
            if (zN6) {
                gg0.c cVar2 = gg0.c.GARMIN_COACH;
                pVar2.f13531a = context2;
                pVar2.f13532b = kVar2;
                pVar2.f13535e = 1;
                dVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.f(dVar, kVar2, cVar2, null), pVar2);
            } else {
                pVar2.f13531a = context2;
                pVar2.f13532b = kVar2;
                pVar2.f13535e = 2;
                dVar.getClass();
                objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.e(dVar, kVar2, null), pVar2);
            }
        } else {
            if (i15 == 1) {
                fg0.k kVar4 = pVar2.f13532b;
                Context context3 = pVar2.f13531a;
                o13.r.b(objJ);
                kVar2 = kVar4;
                context2 = context3;
                aVar = (v2) objJ;
                if (!(aVar instanceof v2.b)) {
                    fg0.k kVar5 = (fg0.k) ((v2.b) aVar).f47386a;
                    id3 = kVar5.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                    Uri selectedImageUrlPath2 = kVar2.getSelectedImageUrlPath();
                    if (id3 != null) {
                    }
                    return aVar;
                }
                if (!(aVar instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String str2 = "Error in creating the event Name : " + kVar2.getEventName() + StringUtils.SPACE + ((v2.a) aVar).f47383a;
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "FBTPlanWizardViewModel", str2);
                return aVar;
            }
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(objJ);
                    return objJ;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg0.k kVar6 = pVar2.f13532b;
            Context context4 = pVar2.f13531a;
            o13.r.b(objJ);
            kVar2 = kVar6;
            context2 = context4;
            aVar = (v2) objJ;
            if (!(aVar instanceof v2.b)) {
                if (!(aVar instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                String str3 = "Error in creating the event Name : " + kVar2.getEventName() + StringUtils.SPACE + ((v2.a) aVar).f47383a;
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var3, "FBTPlanWizardViewModel", str3);
                return aVar;
            }
            fg0.k kVar7 = (fg0.k) ((v2.b) aVar).f47386a;
            id3 = kVar7.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            Uri selectedImageUrlPath3 = kVar2.getSelectedImageUrlPath();
            if (id3 != null || selectedImageUrlPath3 == null) {
                return aVar;
            }
            long jLongValue = id3.longValue();
            pVar2.f13531a = null;
            pVar2.f13532b = null;
            pVar2.f13535e = 3;
            Object objM8 = m8(context2, jLongValue, kVar7, selectedImageUrlPath3, pVar2);
            if (objM8 != obj) {
                return objM8;
            }
        }
        return obj;
    }

    public final y0<g3<jv1.e>> m6() {
        return (y0) this.Z0.getValue();
    }

    public final void m7(androidx.fragment.app.m mVar) {
        jv1.e eVarY5;
        mVar.getClass();
        fg0.k kVarB6 = b6();
        ((zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null)).i(mVar, kVarB6, false, c6(), Integer.valueOf(Y5()), this.f13385r1, (!J6() || (eVarY5 = y5()) == null || eVarY5.f101039h) ? false : true, h5(mVar, kVarB6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m8(Context context, long j8, fg0.k kVar, Uri uri, v13.c cVar) {
        t0 t0Var;
        fg0.k kVar2;
        long j14 = j8;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i14 = t0Var.f13570e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t0Var.f13570e = i14 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object obj = t0Var.f13568c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t0Var.f13570e;
        if (i15 == 0) {
            o13.r.b(obj);
            og0.b.f131972a.getClass();
            ArrayList arrayListA = og0.b.a.a(context, uri);
            t0Var.f13566a = kVar;
            t0Var.f13567b = j14;
            t0Var.f13570e = 1;
            Object objAwait = this.f204384a.f204344a.s(j14, arrayListA).await(t0Var);
            if (objAwait == aVar) {
                return aVar;
            }
            kVar2 = kVar;
            obj = objAwait;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = t0Var.f13567b;
            fg0.k kVar3 = t0Var.f13566a;
            o13.r.b(obj);
            kVar2 = kVar3;
        }
        c83.a0 a0Var = (c83.a0) obj;
        if (a0Var.f25745a.isSuccessful()) {
            ht.a aVar2 = ht.a.f85464a;
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("EventImageUploadSuccessful", true);
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            ht.a.a(bundle, "EventImageUploadSuccessful");
            return new v2.b(kVar2, 200, null, null, 12, null);
        }
        String str = "Image upload failed eventID " + j14 + "-- " + a0Var.f25745a.code();
        i2.a aVar3 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var, "FBTPlanWizardViewModel", str);
        return new v2.b(kVar2, 200, null, null, 12, null);
    }

    public final fg0.k n5() {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listB;
        jv1.s sVarI6 = i6();
        ww1.w wVar = sVarI6 != null ? sVarI6.G : null;
        if (wVar == null || (listB = wVar.b()) == null) {
            listB = p13.j0.f134944a;
        }
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> list = listB;
        og0.a.f131967a.getClass();
        com.garmin.android.apps.connectmobile.workouts.data.model.z zVarF = og0.a.f(list);
        fg0.d dVar = new fg0.d(null, null, null, 7, null);
        dVar.s(gg0.h.DISTANCE);
        dVar.t(zVarF.getValue());
        dVar.r(zVarF.getUnit());
        gg0.f fVar = gg0.f.f77136l;
        fg0.j jVarD6 = d6();
        return new fg0.k(null, null, null, null, null, null, null, null, null, null, null, dVar, list, null, null, null, null, null, null, null, fVar, null, null, null, jVarD6 != null ? fg0.j.b(jVarD6, null, null, null, null, null, null, 8191) : new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null), Boolean.TRUE, null, null, null, null, null, null, null, -51386369, 1, null);
    }

    public final y0<g3<jv1.f>> n6() {
        return (y0) this.O0.getValue();
    }

    public final void o5() {
        if (M6()) {
            ge1.b.T(v1.a(this), null, null, new o(this, null), 3);
        } else if (Y6()) {
            ge1.b.T(v1.a(this), null, null, new r(this, null), 3);
        } else {
            ge1.b.T(v1.a(this), null, null, new q(this, null), 3);
        }
    }

    public final y0<g3<fg0.k>> o6() {
        return (y0) this.H1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o7(boolean z14) {
        f8(null);
        g8(null);
        i8(vt1.m.FBT_ADAPTIVE);
        if (z14) {
            S7(vt1.o.f180175f, null);
        } else {
            vt1.o oVar = vt1.o.f180176g;
            jv1.s sVar = (jv1.s) j6().d();
            S7(oVar, sVar != null ? sVar.f101126e : null);
        }
        if (!c8() && ((U6() && z14) || (S6() && !z14))) {
            U7(tw1.k.INTERMEDIATE);
        }
        F6();
    }

    public final void p5() {
        fg0.k kVarF;
        fy1.i.f73924a.getClass();
        boolean zD = bo1.a.a().c().D();
        boolean z14 = false;
        boolean z15 = O6() && d7();
        jv1.s sVarI6 = i6();
        boolean z16 = ((sVarI6 == null || (kVarF = sVarI6.f()) == null) ? null : kVarF.getCourseId()) != null;
        Double dZ5 = Z5();
        if (zf.b.D(dZ5) && dZ5.doubleValue() > 0.0d) {
            z14 = true;
        }
        if (!zD || !z15 || z16 || !z14 || a7()) {
            k7();
        } else if (Y7()) {
            s6().j("FBTAddCourseFragment");
        } else {
            s6().j("FBTElevationProfileFragment");
        }
    }

    public final y0<g3<Unit>> p6() {
        return (y0) this.f13368b1.getValue();
    }

    public final void p7() {
        jv1.s sVarI6 = i6();
        if (sVarI6 != null && sVarI6.k()) {
            s6().j("FBTWorkoutsPerWeekSelectionFragment");
            return;
        }
        jv1.s sVarI7 = i6();
        l8(sVarI7 != null ? sVarI7.c() : 0);
        f7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q5() {
        if (N6()) {
            s6().j("FBTNameYourPlanFragCompose");
            return;
        }
        if (Z6()) {
            s6().j("FBTGoalDateSelectionFragmentCompose");
            return;
        }
        jv1.s sVar = (jv1.s) j6().d();
        if ((sVar != null ? sVar.f101124c : null) == null) {
            s6().j("FBTFindRaceFragmentCompose");
        } else {
            p5();
        }
    }

    public final y0<g3<jv1.f>> q6() {
        return (y0) this.Q0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final String r5(Context context) {
        String strB;
        fg0.p pVar;
        fg0.k kVar;
        String string;
        vt1.n nVar;
        jv1.s sVar = (jv1.s) j6().d();
        xw1.h hVar = sVar != null ? sVar.f101130i : null;
        tw1.c cVar = sVar != null ? sVar.f101131j : null;
        if (hVar != null) {
            jv1.h hVar2 = sVar.f101127f;
            jv1.g gVar = hVar2 instanceof jv1.g ? (jv1.g) hVar2 : null;
            String strA = (gVar == null || (nVar = gVar.f101054c) == null) ? null : nVar.a(context);
            if (strA != null) {
                String string2 = context.getString(R.string.coach_name, hVar.getCoachFirstName());
                string2.getClass();
                return context.getString(R.string.plan_with_coach_title, strA, string2);
            }
        } else if (cVar != null) {
            String strJ = cVar.getName();
            if (strJ != null) {
                return context.getString(R.string.named_plan, strJ);
            }
        } else if (N6() && sVar != null) {
            vt1.o oVar = sVar.f101125d;
            String strE = oVar != null ? oVar.e(context) : null;
            if (e7()) {
                ww1.w wVar = sVar.G;
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listB = wVar != null ? wVar.b() : null;
                if (listB != null) {
                    og0.a.f131967a.getClass();
                    double D = og0.a.D(listB);
                    m52.i iVarK = tu1.a.k(this.f13389v1, D);
                    if (iVarK == m52.i.CUSTOM) {
                        fy1.i.f73924a.getClass();
                        string = fy1.i.a.d(D, context, this.f13384q1);
                    } else {
                        iVarK.getClass();
                        string = context.getString(iVarK.f116743b);
                        string.getClass();
                    }
                    return context.getString(R.string.plan_with_coach_title, string, strE);
                }
            } else {
                jv1.h hVar3 = sVar.f101127f;
                if (hVar3 instanceof jv1.g) {
                    jv1.g gVar2 = (jv1.g) hVar3;
                    vt1.n nVar2 = gVar2.f101054c;
                    String strA2 = nVar2 != null ? nVar2.a(context) : null;
                    Double d14 = gVar2.f101056e;
                    gg0.i iVar = gVar2.f101055d;
                    if (strA2 != null && nVar2 != vt1.n.OTHER) {
                        return context.getString(R.string.plan_with_coach_title, strA2, strE);
                    }
                    if (iVar != null && d14 != null) {
                        String str = NumberFormat.getInstance().format(d14.doubleValue());
                        x0 x0Var = x0.f105818a;
                        return context.getString(R.string.plan_with_coach_title, String.format("%s%s", Arrays.copyOf(new Object[]{str, iVar.c(context)}, 2)), strE);
                    }
                } else if (hVar3 instanceof jv1.i) {
                    return context.getString(R.string.plan_with_coach_title, new u00.a(new l22.a(context)).a((int) ((jv1.i) hVar3).f101059c).f128594a, strE);
                }
            }
        } else if (Z6() && sVar != null) {
            LocalDate localDate = sVar.f101140s;
            Integer numValueOf = localDate != null ? Integer.valueOf(localDate.getYear()) : null;
            if (numValueOf != null) {
                return context.getString(R.string.fitness_plan_year, String.valueOf(numValueOf.intValue()));
            }
        } else if (d7()) {
            if (sVar != null && (kVar = sVar.f101124c) != null) {
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                strB = kVar.r(false);
                if (strB == null) {
                    if (sVar != null) {
                        strB = null;
                    } else {
                        strB = null;
                    }
                }
            } else if (sVar != null || (pVar = sVar.f101145x) == null) {
                strB = null;
            } else {
                strB = fg0.p.b(pVar);
            }
            if (strB != null) {
                return context.getString(R.string.named_plan, strB);
            }
        }
        return null;
    }

    public final y0<g3<tw1.m>> r6() {
        return (y0) this.V0.getValue();
    }

    public final void r7(jv1.f fVar) {
        boolean z14;
        boolean z15;
        fVar.getClass();
        List<xw1.h> list = fVar.f101049c;
        boolean z16 = fVar.f101051e;
        List<tw1.c> list2 = fVar.f101050d;
        boolean zR6 = R6();
        vt1.o oVar = fVar.f101047a;
        int i14 = b.f13394a[oVar.ordinal()];
        boolean z17 = false;
        if (i14 == 1) {
            boolean z18 = (list != null ? list.size() : 0) == 1;
            z14 = list == null || list.isEmpty();
            boolean z19 = (z18 && !zR6) || (z14 && zR6);
            if (z16 || !z19) {
                z15 = false;
            } else {
                z15 = false;
                z17 = true;
            }
        } else if (i14 != 2) {
            z14 = false;
            z15 = false;
        } else {
            boolean z24 = (list2 != null ? list2.size() : 0) == 1;
            z15 = list2 == null || list2.isEmpty();
            boolean z25 = (z24 && !zR6) || (z15 && zR6);
            if (z16 || !z25) {
                z14 = false;
            } else {
                z14 = false;
                z17 = true;
            }
        }
        if (H5().f61437c) {
            if (!R6() && (z14 || z15)) {
                jv1.s sVarI6 = i6();
                k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                if (oVar == vt1.o.f180175f) {
                    ge1.b.T(v1.a(this), null, null, new e(L5(), null), 3);
                } else {
                    this.f13386s1 = true;
                    s6().j("FBTNoCompatiblePlansFragment");
                }
                n6().m(null);
                return;
            }
            if (R6() && this.f13388u1.isEmpty() && (!z14 || !z15)) {
                jv1.s sVarI7 = i6();
                k8(sVarI7 != null ? jv1.s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
                this.f13386s1 = true;
                n6().m(null);
                s6().j("FBTNoCompatiblePlansFragment");
                return;
            }
        }
        if (z17) {
            jv1.s sVarI8 = i6();
            k8(sVarI8 != null ? jv1.s.a(sVarI8, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, 511) : null);
        }
        h7();
    }

    public final boolean s5(vt1.o oVar) {
        oVar.getClass();
        List<tw1.m> list = this.f13388u1;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (tw1.m mVar : list) {
            tw1.n trainingPlanType = mVar.getTrainingPlanType();
            if ((trainingPlanType != null ? trainingPlanType.b() : null) == oVar && mVar.q0()) {
                return true;
            }
        }
        return false;
    }

    public final y0<String> s6() {
        return (y0) this.Z.getValue();
    }

    public final void s7() {
        m6().j(null);
    }

    public final String t5(Context context, boolean z14) {
        double d14;
        context.getClass();
        jv1.s sVarI6 = i6();
        jv1.h hVar = sVarI6 != null ? sVarI6.f101127f : null;
        if (!(hVar instanceof jv1.g)) {
            if (!(hVar instanceof jv1.i)) {
                return "";
            }
            l3.a aVar = l3.f23124b;
            long j8 = (long) ((jv1.i) hVar).f101059c;
            aVar.getClass();
            String strE1 = l3.a.e1(j8);
            return strE1 == null ? "" : strE1;
        }
        jv1.g gVar = (jv1.g) hVar;
        gg0.i iVar = gVar.f101055d;
        vt1.n nVar = gVar.f101054c;
        if (nVar != null && nVar != vt1.n.OTHER) {
            return nVar.a(context);
        }
        Double d15 = gVar.f101056e;
        if (!z14) {
            if (d15 == null) {
                return "";
            }
            double dDoubleValue = d15.doubleValue();
            fy1.i.f73924a.getClass();
            String str = NumberFormat.getNumberInstance(Locale.getDefault()).format(dDoubleValue);
            str.getClass();
            return e5.g(str, StringUtils.SPACE, iVar != null ? iVar.c(context) : null);
        }
        if (d15 == null) {
            return "";
        }
        double dDoubleValue2 = d15.doubleValue();
        og0.a.f131967a.getClass();
        double dG = og0.a.g(dDoubleValue2, iVar);
        bg0.a.f17827a.getClass();
        if (bg0.a.C0255a.e()) {
            l3.f23124b.getClass();
            d14 = 1000.0d;
        } else {
            l3.f23124b.getClass();
            d14 = 1609.344d;
        }
        return e5.g(l3.f23129g.format(dG / d14), StringUtils.SPACE, (bg0.a.C0255a.e() ? gg0.i.KILOMETER : gg0.i.MILE).c(context));
    }

    public final y0<g3<jv1.z>> t6() {
        return (y0) this.f13372f1.getValue();
    }

    public final void t7() {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
    }

    public final void u5() {
        this.N1 = false;
        this.O1 = null;
        this.P1 = null;
    }

    public final y0<g3<fw1.a>> u6() {
        return (y0) this.L0.getValue();
    }

    public final void u7() {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 271) : null);
    }

    public final vt1.f v6(jv1.m mVar, jv1.h hVar, vt1.o oVar) {
        if (mVar == null) {
            jv1.s sVarI6 = i6();
            if (sVarI6 != null) {
                return sVarI6.f101128g;
            }
        } else {
            gg0.h hVar2 = mVar.f101078c;
            if (hVar2 == gg0.h.TIME) {
                jv1.g gVar = hVar instanceof jv1.g ? (jv1.g) hVar : null;
                return (gVar != null ? gVar.f101054c : null) == vt1.n.FIVE_K ? vt1.c.RUN_WITH_GOAL_TIME : vt1.g.FINISH_GOAL_TIME;
            }
            if (hVar2 == gg0.h.DISTANCE) {
                int i14 = oVar == null ? -1 : b.f13394a[oVar.ordinal()];
                if (i14 == 1) {
                    return vt1.i.GOAL_PACE_DISTANCE;
                }
                if (i14 == 2) {
                    return vt1.i.GOAL_DISTANCE_SPEED;
                }
                String str = "Unsupported sport type for goal: " + oVar;
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "FBTPlanWizardViewModel", str);
                return null;
            }
        }
        return null;
    }

    public final void v7(String str) {
        if (p005kotlin.jvm.internal.s.g(this.P1, str)) {
            J5().m(this.O1);
            this.N1 = false;
            this.O1 = null;
            this.P1 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object w5(int i14, v13.c cVar) {
        y yVar;
        hv1.j jVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i15 = yVar.f13603c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                yVar.f13603c = i15 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objJ = yVar.f13601a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = yVar.f13603c;
        if (i16 == 0) {
            o13.r.b(objJ);
            jv1.s sVarI6 = i6();
            int i17 = (sVarI6 == null || (jVar = sVarI6.f101143v) == null) ? hv1.j.ZERO.f85891c : jVar.f85891c;
            jv1.s sVarI7 = i6();
            Integer num = sVarI7 != null ? sVarI7.f101144w : null;
            int iIntValue = num != null ? num.intValue() : 0;
            yVar.f13603c = 1;
            gu1.b bVar = this.P;
            bVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new gu1.i(bVar, i14, i17, iIntValue, null), yVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return ((fu1.r) ((v2.b) v2Var).f47386a).b();
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "getATPPaceTimes: error retrieving pace times. Exception=");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
        return null;
    }

    public final boolean w6() {
        if (K6()) {
            return true;
        }
        jv1.s sVarI6 = i6();
        vt1.f fVar = sVarI6 != null ? sVarI6.f101128g : null;
        if (fVar instanceof vt1.i) {
            return fVar == vt1.i.GOAL_DISTANCE_SPEED || fVar == vt1.i.GOAL_PACE_DISTANCE;
        }
        return false;
    }

    public final void w7() {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, 511) : null);
    }

    public final List<String> x5() {
        List<wt1.q> listM;
        jv1.s sVarI6 = i6();
        if (sVarI6 == null || (listM = sVarI6.m()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((wt1.q) it.next()).f187130a);
        }
        return p13.h0.b1(arrayList);
    }

    public final void x6() {
        jv1.e eVarY5 = y5();
        jv1.e eVarA = eVarY5 != null ? jv1.e.a(eVarY5, true) : null;
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eVarA, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 511) : null);
    }

    public final void x7() {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 510) : null);
    }

    public final jv1.e y5() {
        jv1.s sVarI6 = i6();
        if (sVarI6 != null) {
            return sVarI6.B;
        }
        return null;
    }

    public final void y6() {
        if (W6()) {
            j7();
            return;
        }
        if (b8() || a8()) {
            s6().j("FBTSelectTrainingLevelFragment");
            return;
        }
        if (this.f13383p1 && !T5().isEmpty() && V6() && (b7() || O6())) {
            l7();
        } else {
            f7();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9 r13
      0x0067: PHI (r9v1 fg0.k) = (r9v0 fg0.k), (r9v5 fg0.k) binds: [B:17:0x004c, B:22:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r13v3 j61.f) = (r13v2 j61.f), (r13v5 j61.f) binds: [B:17:0x004c, B:22:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r13 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y7(fg0.k kVar, String str, Double d14, String str2, v13.c cVar) {
        n0 n0Var;
        j61.f fVar;
        Object objJ;
        Long id3;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f13517e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f13517e = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objJ2 = n0Var.f13515c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f13517e;
        zf0.d dVar = this.f204384a;
        if (i15 != 0) {
            if (i15 == 1) {
                j61.f fVar2 = n0Var.f13514b;
                fg0.k kVar2 = n0Var.f13513a;
                o13.r.b(objJ2);
                fVar = fVar2;
                kVar = kVar2;
                objJ = objJ2;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objJ2);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objJ2);
        fVar = new j61.f(d14, str, str2);
        String shareableEventUuid = kVar.getShareableEventUuid();
        if (shareableEventUuid == null) {
            id3 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            if (id3 != null) {
                String strValueOf = String.valueOf(id3.longValue());
                n0Var.f13513a = null;
                n0Var.f13514b = null;
                n0Var.f13517e = 2;
                dVar.getClass();
                objJ2 = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.c0(dVar, strValueOf, fVar, null), n0Var);
            }
            return Unit.INSTANCE;
        }
        n0Var.f13513a = kVar;
        n0Var.f13514b = fVar;
        n0Var.f13517e = 1;
        dVar.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.e0(dVar, shareableEventUuid, fVar, null), n0Var);
        return aVar;
        if (((v2) objJ) == null) {
            id3 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            if (id3 != null) {
                String strValueOf2 = String.valueOf(id3.longValue());
                n0Var.f13513a = null;
                n0Var.f13514b = null;
                n0Var.f13517e = 2;
                dVar.getClass();
                objJ2 = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.c0(dVar, strValueOf2, fVar, null), n0Var);
            }
        }
        return Unit.INSTANCE;
    }

    public final void z5(String str) {
        str.getClass();
        jv1.s sVarI6 = i6();
        vt1.o oVar = sVarI6 != null ? sVarI6.f101125d : null;
        int i14 = oVar == null ? -1 : b.f13394a[oVar.ordinal()];
        if (i14 == 1) {
            ge1.b.T(v1.a(this), null, null, new c0(this, null), 3);
            return;
        }
        if (i14 == 2) {
            ge1.b.T(v1.a(this), null, null, new a0(this, str, null), 3);
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "FBTPlanWizardViewModel", "Error in activity type");
    }

    public final mv1.e z6(l22.a aVar) {
        boolean z14 = true;
        if (!N6()) {
            jv1.s sVarI6 = i6();
            fg0.k kVarF = sVarI6 != null ? sVarI6.f() : null;
            if (kVarF == null || !kVarF.n0()) {
                z14 = false;
            }
        }
        mv1.e.a aVar2 = mv1.e.f121184g;
        aw1.e eVar = new aw1.e(this, 7);
        aVar2.getClass();
        return mv1.e.a.a(aVar, z14, eVar);
    }

    public final void z7(jv1.h hVar) {
        jv1.s sVarI6 = i6();
        k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, hVar, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, 511) : null);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Law1/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ADD_TO_CALENDAR_OR_MAKE_PRIMARY_ERROR", "", "UNSUPPORTED_ATP_PLAN_ID", "I", "", "HILLY_LOWER_INCLINE", "D", "START_COACH_EDIT_FLOW_ACTION_TAG", "START_EDIT_WORKOUT_DAYS_ACTION_TAG", "COURSE_PROFILE_ACTION_TAG", "NAVIGATE_TO_TRIATHLON_GOAL_SELECTION_ACTION_TAG", "NAVIGATE_TO_TRIATHLON_OVERALL_GOAL_TIME_ACTION_TAG", "NAVIGATE_TO_TRIATHLON_EDIT_GOAL_SELECTION_ACTION_TAG", "NAVIGATE_TO_TRIATHLON_TRANSITION_ROW_ACTION_TAG", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
