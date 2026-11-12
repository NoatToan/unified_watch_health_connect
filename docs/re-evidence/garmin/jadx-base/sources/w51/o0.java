package w51;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import i3.bi;
import i3.e5;
import i3.fb;
import i3.fe;
import i3.gb;
import i3.hb;
import i3.i7;
import i3.mh;
import i3.qi;
import i3.ri;
import i3.si;
import i3.ua;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.t1;
import l72.d3;
import o4.g1;
import o4.j;
import o4.m;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import p3.x3;
import p3.y3;
import q4.k;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f182316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f182317b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsScreenKt$PendingActivityDetailsScreen$2$1", f = "PendingActivityDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f182318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f182319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<p0> f182320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var, e23.a<Unit> aVar, x3<p0> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f182318a = q0Var;
            this.f182319b = aVar;
            this.f182320c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f182318a, this.f182319b, this.f182320c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            float f14 = o0.f182316a;
            if (this.f182320c.getF182175a().f182366w) {
                p2 p2Var = this.f182318a.f182375f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, p0.a((p0) value, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, false, false, 12582911)));
                this.f182319b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z51.h f182321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<String, b63.o, Unit> f182322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f182323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q0 f182324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f182325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x3<p0> f182326f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(z51.h hVar, e23.p<? super String, ? super b63.o, Unit> pVar, e23.a<Unit> aVar, q0 q0Var, Context context, x3<p0> x3Var) {
            this.f182321a = hVar;
            this.f182322b = pVar;
            this.f182323c = aVar;
            this.f182324d = q0Var;
            this.f182325e = context;
            this.f182326f = x3Var;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0054  */
        /* JADX WARN: Code duplicated, block: B:17:0x007a  */
        @Override // e23.r
        public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                float f14 = o0.f182316a;
                boolean z14 = this.f182326f.getF182175a().f182355l;
                z51.h hVar = this.f182321a;
                boolean zR = mVar2.r(hVar);
                e23.p<String, b63.o, Unit> pVar = this.f182322b;
                boolean zB = zR | mVar2.B(pVar);
                e23.a<Unit> aVar = this.f182323c;
                boolean zB2 = zB | mVar2.B(aVar);
                Object objQ = mVar2.q();
                p3.m.a aVar2 = p3.m.f135153a;
                if (zB2) {
                    objQ = new ug2.b0(hVar, 18, pVar, aVar);
                    mVar2.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ug2.b0(hVar, 18, pVar, aVar);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                q0 q0Var = this.f182324d;
                boolean zR2 = mVar2.r(q0Var);
                Context context = this.f182325e;
                boolean zR3 = zR2 | mVar2.r(context);
                Object objQ2 = mVar2.q();
                if (zR3) {
                    objQ2 = new m0(q0Var, context, 1);
                    mVar2.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new m0(q0Var, context, 1);
                        mVar2.K(objQ2);
                    }
                }
                o0.i(z14, aVar3, (e23.a) objQ2, mVar2, 0);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<String, Unit> {
        public c(Object obj) {
            super(1, obj, q0.class, "onActivityTypeChanged", "onActivityTypeChanged(Ljava/lang/String;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            q0 q0Var = (q0) this.receiver;
            q0Var.getClass();
            p2 p2Var = q0Var.f182375f;
            while (true) {
                Object value = p2Var.getValue();
                p2 p2Var2 = p2Var;
                q0 q0Var2 = q0Var;
                if (p2Var2.b(value, p0.a((p0) value, null, str2, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, q0.D4(q0Var, str2), null, false, null, false, false, false, false, 16711677))) {
                    return Unit.INSTANCE;
                }
                p2Var = p2Var2;
                q0Var = q0Var2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsScreenKt$PendingActivityDetailsScreen$5$1$2$5$1", f = "PendingActivityDetailsScreen.kt", l = {322}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f182328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f182329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q0 f182330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<p0> f182331e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fe feVar, Context context, q0 q0Var, x3<p0> x3Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f182328b = feVar;
            this.f182329c = context;
            this.f182330d = q0Var;
            this.f182331e = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f182328b, this.f182329c, this.f182330d, this.f182331e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182327a;
            if (i14 == 0) {
                o13.r.b(obj);
                float f14 = o0.f182316a;
                if (this.f182331e.getF182175a().f182357n) {
                    String string = this.f182329c.getString(R.string.txt_something_went_wrong_try_again);
                    string.getClass();
                    this.f182327a = 1;
                    if (d3.c(this.f182328b, string, null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p2 p2Var = this.f182330d.f182375f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p0.a((p0) p2Var.getValue(), null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, false, false, 16769023)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsScreenKt$PendingActivityDetailsScreen$5$1$2$6$1", f = "PendingActivityDetailsScreen.kt", l = {329}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f182333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f182334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q0 f182335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<p0> f182336e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fe feVar, Context context, q0 q0Var, x3<p0> x3Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f182333b = feVar;
            this.f182334c = context;
            this.f182335d = q0Var;
            this.f182336e = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f182333b, this.f182334c, this.f182335d, this.f182336e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182332a;
            if (i14 == 0) {
                o13.r.b(obj);
                float f14 = o0.f182316a;
                if (this.f182336e.getF182175a().f182359p) {
                    String string = this.f182334c.getString(R.string.txt_something_went_wrong_try_again);
                    string.getClass();
                    this.f182332a = 1;
                    if (d3.c(this.f182333b, string, null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p2 p2Var = this.f182335d.f182375f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p0.a((p0) value, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, false, false, 16744447)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsScreenKt$PendingActivityMap$1$1", f = "PendingActivityDetailsScreen.kt", l = {718}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<ke2.b> f182338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f182339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ je2.b<?> f182340d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<ke2.b> list, com.garmin.android.library.mapsdkadapter.i.d dVar, je2.b<?> bVar, t13.d<? super f> dVar2) {
            super(2, dVar2);
            this.f182338b = list;
            this.f182339c = dVar;
            this.f182340d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f182338b, this.f182339c, this.f182340d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182337a;
            if (i14 == 0) {
                o13.r.b(obj);
                float f14 = o0.f182316a;
                com.garmin.android.library.mapsdkadapter.e.a aVar2 = new com.garmin.android.library.mapsdkadapter.e.a();
                Iterator<T> it = this.f182338b.iterator();
                while (it.hasNext()) {
                    aVar2.b(new com.garmin.android.library.mapsdkadapter.f(ke2.c.c((ke2.b) it.next()), this.f182339c));
                }
                com.garmin.android.library.mapsdkadapter.e eVarA = aVar2.a();
                if (eVarA != null) {
                    LatLng latLng = eVarA.f50274b.f50283a;
                    LatLng latLng2 = eVarA.f50273a.f50283a;
                    je2.b<?> bVar = this.f182340d;
                    if (bVar != null) {
                        List<ke2.b> listK = p13.x.k(new ke2.b(latLng2.latitude, latLng2.longitude, null, 4, null), new ke2.b(latLng.latitude, latLng.longitude, null, 4, null), new ke2.b(latLng2.latitude, latLng.longitude, null, 4, null), new ke2.b(latLng.latitude, latLng2.longitude, null, 4, null));
                        this.f182337a = 1;
                        if (bVar.f(listK, this) == aVar) {
                            return aVar;
                        }
                    }
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsScreenKt$PendingActivityTimePicker$1$1", f = "PendingActivityDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ri f182341a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ri riVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f182341a = riVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f182341a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            qi.f89469b.getClass();
            this.f182341a.d(qi.f89470c);
            return Unit.INSTANCE;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f182316a = 140;
        f182317b = PsExtractor.VIDEO_STREAM_MASK;
    }

    public static final void a(b63.u uVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1906466603);
        int i15 = (o0VarE.r(uVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (uVar == null) {
                o0VarE.C(-1100876659);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                o0VarE.C(-1100876658);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                String str = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(uVar.b().f16206a);
                str.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vy0.e(uVar, i14, 4);
        }
    }

    public static final void b(double d14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1263334199);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strB = gm.b.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), d14);
            l72.x0 x0Var = l72.x0.f111346a;
            h4.r rVarE = u1.n.e(h4.r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.y(rVarE, j92.b.f97899b.f97920e), z3.f.c(-1048395760, new j21.p(strB, 24), o0VarE), o0VarE, (l72.x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k82.b(i14, 2, d14);
        }
    }

    public static final void c(p0 p0Var, final q0 q0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(199483988);
        int i15 = (o0VarE.r(p0Var) ? 4 : 2) | i14 | (o0VarE.r(q0Var) ? 32 : 16);
        final int i16 = 1;
        final int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                z51.h hVar = p0Var.f182344a;
                objQ = hVar != null ? hVar.d() : p0Var.f182350g;
                o0VarE.K(objQ);
            }
            b63.u uVar = (b63.u) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                z51.h hVar2 = p0Var.f182344a;
                objQ2 = hVar2 != null ? hVar2.b() : p0Var.f182351h;
                o0VarE.K(objQ2);
            }
            b63.u uVar2 = (b63.u) objQ2;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_start_time);
            b63.u uVar3 = p0Var.f182350g;
            boolean z14 = p0Var.f182355l;
            boolean zR = o0VarE.r(q0Var);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new e23.l() { // from class: w51.i0
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                b63.u uVar4 = (b63.u) obj;
                                uVar4.getClass();
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                b2 b2Var = q0Var2.f182376g;
                                Double dZ4 = q0Var2.z4(uVar4, ((p0) b2Var.f150540a.getValue()).f182351h);
                                Double dA4 = q0Var2.A4(uVar4, ((p0) b2Var.f150540a.getValue()).f182351h);
                                p2 p2Var = q0Var2.f182375f;
                                while (true) {
                                    Object value = p2Var.getValue();
                                    p0 p0Var2 = (p0) value;
                                    b63.u uVar5 = p0Var2.f182351h;
                                    boolean z15 = uVar5.compareTo(uVar4) < 0;
                                    double dB = c1.b(Double.valueOf(p0Var2.f182352i), uVar5, uVar4);
                                    boolean zE4 = q0Var2.E4(uVar4, uVar5);
                                    p2 p2Var2 = p2Var;
                                    q0 q0Var3 = q0Var2;
                                    if (!p2Var2.b(value, p0.a(p0Var2, null, null, null, null, dZ4, dA4, uVar4, null, dB, false, false, z15, false, false, false, false, null, false, null, false, zE4, false, false, 14677647))) {
                                        p2Var = p2Var2;
                                        q0Var2 = q0Var3;
                                    }
                                    break;
                                }
                                break;
                            default:
                                b63.u uVar6 = (b63.u) obj;
                                uVar6.getClass();
                                q0 q0Var4 = q0Var;
                                q0Var4.getClass();
                                b2 b2Var2 = q0Var4.f182376g;
                                Double dZ5 = q0Var4.z4(((p0) b2Var2.f150540a.getValue()).f182350g, uVar6);
                                Double dA5 = q0Var4.A4(((p0) b2Var2.f150540a.getValue()).f182350g, uVar6);
                                p2 p2Var3 = q0Var4.f182375f;
                                while (true) {
                                    Object value2 = p2Var3.getValue();
                                    p2 p2Var4 = p2Var3;
                                    p0 p0Var3 = (p0) value2;
                                    b63.u uVar7 = p0Var3.f182350g;
                                    q0 q0Var5 = q0Var4;
                                    if (!p2Var4.b(value2, p0.a(p0Var3, null, null, null, null, dZ5, dA5, null, uVar6, c1.b(Double.valueOf(p0Var3.f182352i), uVar6, uVar7), false, false, uVar6.compareTo(uVar7) < 0, false, false, false, false, null, false, null, false, q0Var4.E4(uVar7, uVar6), false, false, 14677583))) {
                                        p2Var3 = p2Var4;
                                        q0Var4 = q0Var5;
                                    }
                                    break;
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            }
            n(strQ, uVar, uVar2, uVar3, z14, (e23.l) objQ3, o0VarE, 0);
            String strQ2 = gl1.y.Q(o0VarE, R.string.pregnancy_end_time);
            b63.u uVar4 = p0Var.f182351h;
            boolean z15 = p0Var.f182355l;
            boolean zR2 = o0VarE.r(q0Var);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new e23.l() { // from class: w51.i0
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                b63.u uVar5 = (b63.u) obj;
                                uVar5.getClass();
                                q0 q0Var2 = q0Var;
                                q0Var2.getClass();
                                b2 b2Var = q0Var2.f182376g;
                                Double dZ4 = q0Var2.z4(uVar5, ((p0) b2Var.f150540a.getValue()).f182351h);
                                Double dA4 = q0Var2.A4(uVar5, ((p0) b2Var.f150540a.getValue()).f182351h);
                                p2 p2Var = q0Var2.f182375f;
                                while (true) {
                                    Object value = p2Var.getValue();
                                    p0 p0Var2 = (p0) value;
                                    b63.u uVar6 = p0Var2.f182351h;
                                    boolean z16 = uVar6.compareTo(uVar5) < 0;
                                    double dB = c1.b(Double.valueOf(p0Var2.f182352i), uVar6, uVar5);
                                    boolean zE4 = q0Var2.E4(uVar5, uVar6);
                                    p2 p2Var2 = p2Var;
                                    q0 q0Var3 = q0Var2;
                                    if (!p2Var2.b(value, p0.a(p0Var2, null, null, null, null, dZ4, dA4, uVar5, null, dB, false, false, z16, false, false, false, false, null, false, null, false, zE4, false, false, 14677647))) {
                                        p2Var = p2Var2;
                                        q0Var2 = q0Var3;
                                    }
                                    break;
                                }
                                break;
                            default:
                                b63.u uVar7 = (b63.u) obj;
                                uVar7.getClass();
                                q0 q0Var4 = q0Var;
                                q0Var4.getClass();
                                b2 b2Var2 = q0Var4.f182376g;
                                Double dZ5 = q0Var4.z4(((p0) b2Var2.f150540a.getValue()).f182350g, uVar7);
                                Double dA5 = q0Var4.A4(((p0) b2Var2.f150540a.getValue()).f182350g, uVar7);
                                p2 p2Var3 = q0Var4.f182375f;
                                while (true) {
                                    Object value2 = p2Var3.getValue();
                                    p2 p2Var4 = p2Var3;
                                    p0 p0Var3 = (p0) value2;
                                    b63.u uVar8 = p0Var3.f182350g;
                                    q0 q0Var5 = q0Var4;
                                    if (!p2Var4.b(value2, p0.a(p0Var3, null, null, null, null, dZ5, dA5, null, uVar7, c1.b(Double.valueOf(p0Var3.f182352i), uVar7, uVar8), false, false, uVar7.compareTo(uVar8) < 0, false, false, false, false, null, false, null, false, q0Var4.E4(uVar8, uVar7), false, false, 14677583))) {
                                        p2Var3 = p2Var4;
                                        q0Var4 = q0Var5;
                                    }
                                    break;
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            }
            n(strQ2, uVar, uVar2, uVar4, z15, (e23.l) objQ4, o0VarE, 0);
            if (p0Var.f182355l) {
                o0VarE.C(-1406166433);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarA2 = c2.l.A(rVarA, 0.0f, eVar.f97918c, 1);
                String strQ3 = gl1.y.Q(o0VarE, R.string.msg_start_time_after_end_time);
                d92.b.f58624b.getClass();
                mh.c(strQ3, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1405869298);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(p0Var, q0Var, i14, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(List<? extends am.x0> list, String str, e23.q<? super am.x0, ? super Long, ? super List<? extends am.x0>, Unit> qVar, e23.l<? super String, Unit> lVar, Long l14, p3.m mVar, int i14) {
        p3.o0 o0Var;
        String str2;
        am.x0 x0Var;
        String strT;
        boolean z14;
        p3.o0 o0VarE = mVar.E(1540669859);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.B(l14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new w11.b(13);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ2;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (list.isEmpty()) {
                o0VarE.C(2075884875);
                o0VarE.g0(false);
                str2 = null;
            } else {
                o0VarE.C(2075741841);
                boolean zB = ((i15 & 112) == 32) | o0VarE.B(list);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    if (str == null) {
                        am.x0 x0Var2 = (am.x0) p13.h0.d0(list);
                        objQ3 = x0Var2 != null ? x0Var2.f4358a : null;
                    } else {
                        objQ3 = str;
                    }
                    o0VarE.K(objQ3);
                }
                str2 = (String) objQ3;
                o0VarE.g0(false);
            }
            if (list.isEmpty()) {
                o0VarE.C(2076110059);
                o0VarE.g0(false);
                x0Var = null;
            } else {
                o0VarE.C(2075965103);
                boolean zB2 = o0VarE.B(str2);
                Object objQ4 = o0VarE.q();
                if (zB2 || objQ4 == c2565a) {
                    objQ4 = am.z0.l(am.x0.f4336u2, str2);
                    o0VarE.K(objQ4);
                }
                x0Var = (am.x0) objQ4;
                o0VarE.g0(false);
            }
            c3 c3VarB = x0Var == am.x0.f4304m ? c22.i.b(R.string.activity_title_all_activities) : x0Var != null ? x0Var.f4360c : null;
            if (c3VarB == null) {
                o0VarE.C(2076331026);
                o0VarE.g0(false);
                strT = null;
            } else {
                o0VarE.C(2076331027);
                strT = gl1.d.T(c3VarB, o0VarE, 0);
                o0VarE.g0(false);
            }
            if (strT == null) {
                strT = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1179946024, R.string.activity_type_timed_activity, o0VarE, false);
            } else {
                o0VarE.C(-1179948194);
                o0VarE.g0(false);
            }
            if (str != null || list.isEmpty()) {
                o0VarE.C(2076623574);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2076528900);
                strT = gl1.y.P(R.string.lbl_maybe_with_category, new Object[]{strT}, o0VarE);
                o0VarE.g0(false);
            }
            boolean zB3 = o0VarE.B(list) | o0VarE.B(context);
            Object objQ5 = o0VarE.q();
            Object obj = objQ5;
            if (zB3 || objQ5 == c2565a) {
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (am.x0 x0Var3 : list) {
                    arrayList.add(new w51.a(x0Var3.f4358a, dh.b.A(context, x0Var3 == am.x0.f4304m ? c22.i.b(R.string.activity_title_all_activities) : x0Var3.f4360c)));
                }
                o0VarE.K(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarE, eVar.f97920e, f14);
            String str3 = strT;
            gb gbVarA = fb.a(0.0f, 6, 0L, true);
            p5.l.f136032b.getClass();
            p5.l lVarA = p5.l.a(p5.l.f136038h);
            boolean zB4 = o0VarE.B(p1Var);
            Object objQ6 = o0VarE.q();
            if (zB4 || objQ6 == p3.m.a.f135155b) {
                objQ6 = new j0(p1Var, 0);
                o0VarE.K(objQ6);
            }
            h4.r rVarB = u1.w.b(rVarZ, jVar, gbVarA, false, null, lVarA, (e23.a) objQ6, 12);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            String str4 = str2;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            d92.b.f58624b.getClass();
            mh.c(str3, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), o0VarE, 0, 0, 131068);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar = c2.u.f22885a;
            b3.b.f15502a.getClass();
            i7.b(d3.c.a(), null, ((Boolean) p1Var.getF182175a()).booleanValue() ? l4.k.g(aVar, 180.0f) : aVar, sn.a.y(o0VarE), o0VarE, 48, 0);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            long jW = ds.e0.w(o0VarE);
            boolean zB5 = o0VarE.B(p1Var);
            Object objQ7 = o0VarE.q();
            if (zB5 || objQ7 == p3.m.a.f135155b) {
                z14 = true;
                objQ7 = new j0(p1Var, 1);
                o0VarE.K(objQ7);
            } else {
                z14 = true;
            }
            boolean z15 = z14;
            i3.u.a(zBooleanValue, (e23.a) objQ7, null, 0L, null, null, null, jW, 0.0f, 0.0f, z3.f.c(-1581636302, new bv0.e(list2, qVar, str4, l14, list, p1Var, lVar, 8), o0VarE), o0VarE, 0, 48, 1916);
            p3.o0 o0Var2 = o0VarE;
            o0Var2.g0(z15);
            o0Var2.g0(z15);
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg2.g(list, str, qVar, lVar, l14, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void e(Double d14, Double d15, p3.m mVar, int i14) {
        double dDoubleValue;
        p3.o0 o0VarE = mVar.E(79460956);
        int i15 = (o0VarE.B(d14) ? 4 : 2) | i14 | (o0VarE.B(d15) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l22.a aVarS = w2.a0.s(o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.no_value);
            boolean zB = o0VarE.B(aVarS);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new w00.b(aVarS);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w00.b(aVarS);
                    o0VarE.K(objQ);
                }
            }
            w00.b bVar = (w00.b) objQ;
            int i16 = i15 & 14;
            boolean zB2 = o0VarE.B(bVar) | (i16 == 4);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = bVar.c(d14);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = bVar.c(d14);
                    o0VarE.K(objQ2);
                }
            }
            String str = (String) objQ2;
            boolean zB3 = (i16 == 4) | o0VarE.B(bVar);
            Object objQ3 = o0VarE.q();
            if (zB3) {
                if (d14 != null) {
                    dDoubleValue = d14.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                objQ3 = bVar.f(Double.valueOf(dDoubleValue), false);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    if (d14 != null) {
                        dDoubleValue = d14.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    objQ3 = bVar.f(Double.valueOf(dDoubleValue), false);
                    o0VarE.K(objQ3);
                }
            }
            String str2 = (String) objQ3;
            boolean zB4 = ((i15 & 112) == 32) | o0VarE.B(aVarS) | o0VarE.B(strQ);
            Object objQ4 = o0VarE.q();
            if (zB4) {
                if (d15 != null) {
                    strQ = l3.a.H(l3.f23124b, aVarS, d15.doubleValue(), false);
                }
                o0VarE.K(strQ);
                objQ4 = strQ;
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    if (d15 != null) {
                        strQ = l3.a.H(l3.f23124b, aVarS, d15.doubleValue(), false);
                    }
                    o0VarE.K(strQ);
                    objQ4 = strQ;
                }
            }
            l72.x0 x0Var = l72.x0.f111346a;
            h4.r rVarE = u1.n.e(h4.r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarE, eVar.f97920e, 0.0f, 2);
            bVar2.getClass();
            x0Var.e(c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), z3.f.c(48290101, new f21.v(str2, str, (String) objQ4, 3), o0VarE), o0VarE, (l72.x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lh0.e(i14, 2, d14, d15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(q0 q0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1320107045);
        int i15 = (o0VarE.r(q0Var) ? 4 : 2) | i14;
        int i16 = 5;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(q0Var.f182378i, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (((com.garmin.android.apps.connectmobile.devices.model.j) p1VarC.getF182175a()) != null) {
                o0VarE.C(-1706320460);
                com.garmin.android.apps.connectmobile.devices.model.j jVar = (com.garmin.android.apps.connectmobile.devices.model.j) p1VarC.getF182175a();
                String strJ = jVar != null ? jVar.f34187a : null;
                if (strJ == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1607526214, R.string.no_value, o0VarE, false);
                } else {
                    o0VarE.C(1607525377);
                    o0VarE.g0(false);
                }
                com.garmin.android.apps.connectmobile.devices.model.j jVar2 = (com.garmin.android.apps.connectmobile.devices.model.j) p1VarC.getF182175a();
                String str = jVar2 != null ? jVar2.f34189c : null;
                if (str == null) {
                    str = "";
                }
                l72.p2 p2Var = l72.p2.f111205a;
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                p2Var.h(strJ, str, null, c2.l.A(aVar, 0.0f, j92.b.f97899b.f97920e, 1), null, false, false, z3.f.c(342353678, new o72.e(context, p1VarC, i16), o0VarE), null, null, null, o0VarE, 12582912, 0, 1908);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1705420003);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vy0.e(q0Var, i14, 5);
        }
    }

    public static final void g(final z51.d dVar, final boolean z14, final boolean z15, p3.m mVar, final int i14) {
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        boolean z16;
        boolean z17;
        p3.o0 o0VarE = mVar.E(-26267456);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14 || dVar != null) {
                float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                h4.r.a aVar = h4.r.S;
                h4.r rVarF = x2.f(aVar, 1.0f);
                float f14 = 210 * f75992b;
                g6.f.a aVar2 = g6.f.f75994b;
                h4.r rVarH = x2.h(rVarF, f14);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarH, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                if (z14 && dVar == null) {
                    o0VarE.C(-1688180954);
                    h4.r rVarC2 = uVar.c(aVar, h4.d.a.f81528f);
                    Object objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new w40.d(5);
                        o0VarE.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, rVarC2, null, o0VarE, 6, 4);
                    o0VarE.g0(false);
                    z17 = true;
                } else {
                    o0VarE.C(-1687994613);
                    z51.b bVar2 = dVar != null ? dVar.f202487a : null;
                    if (bVar2 == null) {
                        o0VarE.C(-1687978525);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1687978524);
                        h4.r rVarD = x2.d(aVar, 1.0f);
                        z51.b.Companion companion = z51.b.INSTANCE;
                        k(rVarD, bVar2, o0VarE, 6);
                        o0VarE.g0(false);
                    }
                    if (z15) {
                        o0VarE.C(-1687727238);
                        h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.A(d92.b.f58623a, o0VarE), m1.f128891a);
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar = j92.b.f97899b;
                        float f15 = eVar.f97918c;
                        bVar3.getClass();
                        h4.r rVarC3 = uVar.c(c2.l.z(rVarE, eVar.f97920e, f15), h4.d.a.f81531i);
                        String strQ = gl1.y.Q(o0VarE, R.string.lbl_location_data_removed_for_indoor_activity);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                        d6.h.f57752b.getClass();
                        z16 = false;
                        mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        z16 = false;
                        o0VarE.C(-1687188644);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z16);
                    z17 = true;
                }
                o0VarE.g0(z17);
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p(dVar, z14, z15, i14, i16) { // from class: w51.l0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f182296a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ z51.d f182297b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ boolean f182298c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ boolean f182299d;

                    {
                        this.f182296a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = this.f182296a;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        switch (i17) {
                            case 0:
                                o0.g(this.f182297b, this.f182298c, this.f182299d, mVar2, p3.p0.t(1));
                                break;
                            default:
                                o0.g(this.f182297b, this.f182298c, this.f182299d, mVar2, p3.p0.t(1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p(dVar, z14, z15, i14, i17) { // from class: w51.l0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f182296a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z51.d f182297b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f182298c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f182299d;

                {
                    this.f182296a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f182296a;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i18) {
                        case 0:
                            o0.g(this.f182297b, this.f182298c, this.f182299d, mVar2, p3.p0.t(1));
                            break;
                        default:
                            o0.g(this.f182297b, this.f182298c, this.f182299d, mVar2, p3.p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:190:0x03a4 A[LOOP:7: B:188:0x03a1->B:190:0x03a4, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23, types: [b63.u] */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b63.o] */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [b63.u] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [b63.u] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r32v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v80 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [b63.u] */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [b63.u] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [b63.u] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v51, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.util.ArrayList] */
    public static final void h(final gs1.t tVar, final i53.c<z51.c> cVar, final b63.u uVar, final b63.u uVar2, final b63.u uVar3, final b63.u uVar4, final boolean z14, final boolean z15, p3.m mVar, final int i14) {
        p3.o0 o0Var;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        b63.o oVarB;
        Throwable th3;
        ?? r14;
        ?? J;
        ?? r15;
        b63.o oVarB2;
        float fB;
        float fA;
        ArrayList arrayList;
        int i15;
        b63.u uVarJ;
        ?? r16;
        ?? J2;
        ?? arrayList2;
        ?? r17;
        ?? J3;
        final float f14;
        final float f15;
        final long j8;
        b63.u uVarJ2;
        ?? r18;
        Object obj;
        ArrayList arrayList3;
        float f16;
        final float f17;
        i53.d dVar;
        float f18;
        float f19;
        p3.o0 o0Var2;
        final float f22;
        i53.e eVar;
        float f24;
        gs1.m heartRateZonesDTO;
        gs1.m.b payload;
        List<Integer> listB;
        b63.u uVarG;
        p3.o0 o0Var3;
        p3.o0 o0VarE = mVar.E(-838303922);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(tVar) : o0VarE.r(tVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(uVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(uVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(uVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(uVar4) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.h(z15) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(new yz.k(DateFormat.is24HourFormat(context)));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            if (z14 || z15) {
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(uVar3);
                    o0VarE.K(objQ2);
                }
                p1 p1Var2 = (p1) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(uVar4);
                    o0VarE.K(objQ3);
                }
                p1 p1Var3 = (p1) objQ3;
                if (uVar3 == null || uVar4 == null || uVar3.compareTo(uVar4) < 0) {
                    p1Var2.setValue(uVar3);
                    p1Var3.setValue(uVar4);
                }
                Throwable th4 = null;
                if (z14) {
                    o0VarE.C(1323563395);
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarQ = x2.q(x2.f(aVar, 1.0f), f182317b);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVarQ, o0VarE);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (cVar2 == null) {
                        p3.p0.l();
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
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    h4.r rVarC2 = c2.u.f22885a.c(aVar, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    ua.a(0.0f, 0.0f, 0, 0, 60, d92.b.a(o0VarE).f().a(), 0L, rVarC2, o0VarE);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                    o0Var3 = o0VarE;
                } else {
                    o0VarE.C(1324055117);
                    boolean zB = o0VarE.B((b63.u) p1Var2.getF182175a()) | o0VarE.B(uVar);
                    Object objQ4 = o0VarE.q();
                    if (zB || objQ4 == c2565a) {
                        b63.u uVar5 = (b63.u) p1Var2.getF182175a();
                        b63.u uVarG2 = uVar5 != null ? g22.l.g(uVar5) : null;
                        if (uVar != null && uVarG2 != null && uVar.compareTo(uVarG2) < 0) {
                            oVarB = uVar.b();
                        } else if (uVarG2 != null) {
                            oVarB = uVarG2.b();
                        } else {
                            oVarB = uVar != null ? uVar.b() : null;
                        }
                        objQ4 = p3.p0.n(oVarB);
                        o0VarE.K(objQ4);
                    }
                    p1 p1Var4 = (p1) objQ4;
                    boolean zB2 = ((i16 & 112) == 32 || ((i16 & 64) != 0 && o0VarE.B(cVar))) | o0VarE.B((b63.o) p1Var4.getF182175a());
                    Object objQ5 = o0VarE.q();
                    if (zB2 || objQ5 == c2565a) {
                        b63.o oVar = (b63.o) p1Var4.getF182175a();
                        cVar.getClass();
                        p13.y0 y0Var = new p13.y0(cVar);
                        int iA = p13.t0.a(p13.y.r(y0Var, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                        Iterator it = y0Var.iterator();
                        while (true) {
                            ListIterator listIterator = ((p13.y0.a) it).f134967a;
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            Object objPrevious = listIterator.previous();
                            linkedHashMap.put(x51.b.c(((z51.c) objPrevious).f202484a, oVar), objPrevious);
                            th4 = th4;
                        }
                        th3 = th4;
                        List listN0 = p13.h0.N0(linkedHashMap.entrySet(), new x51.a());
                        ArrayList arrayList4 = new ArrayList(p13.y.r(listN0, 10));
                        Iterator it3 = listN0.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add((z51.c) ((Map.Entry) it3.next()).getValue());
                        }
                        objQ5 = p3.p0.n(i53.a.j(arrayList4));
                        o0VarE.K(objQ5);
                    } else {
                        th3 = null;
                    }
                    p1 p1Var5 = (p1) objQ5;
                    boolean zB3 = o0VarE.B((i53.c) p1Var5.getF182175a());
                    Object objQ6 = o0VarE.q();
                    if (zB3 || objQ6 == p3.m.a.f135155b) {
                        objQ6 = n23.j.o(x51.e.d((i53.c) p1Var5.getF182175a()), o0VarE);
                    }
                    p3.m1 m1Var = (p3.m1) objQ6;
                    boolean zB4 = o0VarE.B((i53.c) p1Var5.getF182175a());
                    Object objQ7 = o0VarE.q();
                    if (zB4 || objQ7 == p3.m.a.f135155b) {
                        objQ7 = n23.j.o(x51.e.c((i53.c) p1Var5.getF182175a()), o0VarE);
                    }
                    p3.m1 m1Var2 = (p3.m1) objQ7;
                    boolean zB5 = o0VarE.B((b63.u) p1Var2.getF182175a()) | o0VarE.B((b63.u) p1Var3.getF182175a());
                    Object objQ8 = o0VarE.q();
                    if (zB5 || objQ8 == p3.m.a.f135155b) {
                        if (uVar != null) {
                            uVarJ = g22.l.j(uVar);
                        } else {
                            r14 = th3;
                        }
                        if (uVar2 != null) {
                            r14 = uVarJ;
                            J = g22.l.j(uVar2);
                        } else {
                            r14 = uVarJ;
                            J = th3;
                        }
                        b63.u uVar6 = (b63.u) p1Var2.getF182175a();
                        b63.u uVar7 = (b63.u) p1Var3.getF182175a();
                        yz.k kVar = (yz.k) p1Var.getF182175a();
                        kVar.getClass();
                        if (r14 != 0 && uVar6 != null && r14.compareTo(uVar6) < 0) {
                            oVarB2 = r14.b();
                        } else if (uVar6 != null) {
                            oVarB2 = uVar6.b();
                        } else {
                            if (r14 != 0) {
                                oVarB2 = r14.b();
                            } else {
                                r15 = th3;
                            }
                            fB = x51.b.b(r14, uVar6, r15);
                            fA = (x51.b.a(J, uVar7, r15) - fB) / 5;
                            arrayList = new ArrayList();
                            for (i15 = 0; i15 < 6; i15++) {
                                arrayList.add(kVar.a((i15 * fA) + fB));
                            }
                            o0VarE.K(arrayList);
                            objQ8 = arrayList;
                        }
                        r15 = oVarB2;
                        fB = x51.b.b(r14, uVar6, r15);
                        fA = (x51.b.a(J, uVar7, r15) - fB) / 5;
                        arrayList = new ArrayList();
                        while (i15 < 6) {
                            arrayList.add(kVar.a((i15 * fA) + fB));
                        }
                        o0VarE.K(arrayList);
                        objQ8 = arrayList;
                    }
                    List list = (List) objQ8;
                    b63.o oVar2 = (b63.o) p1Var4.getF182175a();
                    b63.u uVar8 = (b63.u) p1Var2.getF182175a();
                    ?? G = uVar8 != null ? g22.l.g(uVar8) : th3;
                    b63.u uVar9 = (b63.u) p1Var3.getF182175a();
                    if (uVar9 != null) {
                        uVarG = g22.l.g(uVar9);
                    } else {
                        r16 = th3;
                    }
                    if (tVar == null || (heartRateZonesDTO = tVar.getHeartRateZonesDTO()) == null || (payload = heartRateZonesDTO.getPayload()) == null || (listB = payload.b()) == null) {
                        r16 = uVarG;
                        r16 = uVarG;
                        r16 = uVarG;
                        r16 = uVarG;
                        J2 = th3;
                    } else {
                        r16 = uVarG;
                        J2 = i53.a.j(listB);
                    }
                    i53.c cVar3 = (i53.c) p1Var5.getF182175a();
                    z51.c.Companion companion = z51.c.INSTANCE;
                    float f25 = x51.e.f189031a;
                    cVar3.getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    float fB2 = x51.b.b(uVar, G, oVar2);
                    float fA2 = x51.b.a(uVar2, r16, oVar2);
                    Float fC = x51.b.c(G, oVar2);
                    float fFloatValue = fC != null ? fC.floatValue() : fB2;
                    Float fC2 = x51.b.c(r16, oVar2);
                    float fFloatValue2 = fC2 != null ? fC2.floatValue() : fA2;
                    float fD = x51.e.d(cVar3);
                    float fC3 = x51.e.c(cVar3);
                    float f26 = 1;
                    float f27 = fB2 - f26;
                    float f28 = f26 + fA2;
                    Float fValueOf = Float.valueOf(fD);
                    Float fValueOf2 = Float.valueOf(fC3);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    if (J2 != 0) {
                        ArrayList arrayListZ = p13.h0.Z(J2);
                        arrayList2 = new ArrayList(p13.y.r(arrayListZ, 10));
                        Iterator it4 = arrayListZ.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(Float.valueOf(((Number) it4.next()).intValue()));
                        }
                    } else {
                        arrayList2 = th3;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = p13.j0.f134944a;
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList7 = new ArrayList(size);
                    int i17 = 0;
                    while (i17 < size) {
                        arrayList7.add(Integer.valueOf(df0.b.a(i17)));
                        i17++;
                        size = size;
                    }
                    Iterator it5 = cVar3.iterator();
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    while (it5.hasNext()) {
                        Iterator it6 = it5;
                        z51.c cVar4 = (z51.c) it5.next();
                        float f29 = fFloatValue2;
                        Float fC4 = x51.b.c(cVar4.f202484a, oVar2);
                        Double d14 = cVar4.f202485b;
                        if (fC4 == null || d14 == null) {
                            f24 = fD;
                            if (!linkedHashMap3.isEmpty()) {
                                arrayList5.add(i53.a.g(linkedHashMap3));
                                arrayList6.add(x51.e.b(fValueOf, fValueOf2, arrayList7, arrayList2));
                                linkedHashMap3 = new LinkedHashMap();
                            }
                        } else if (fC4.floatValue() < f27 || fC4.floatValue() > f28) {
                            f24 = fD;
                            if (!linkedHashMap3.isEmpty()) {
                                arrayList5.add(i53.a.g(linkedHashMap3));
                                arrayList6.add(x51.e.b(fValueOf, fValueOf2, arrayList7, arrayList2));
                                linkedHashMap3 = new LinkedHashMap();
                            }
                        } else {
                            f24 = fD;
                            linkedHashMap3.put(fC4, Float.valueOf((float) d14.doubleValue()));
                        }
                        it5 = it6;
                        fD = f24;
                        fFloatValue2 = f29;
                    }
                    final float f34 = fD;
                    float f35 = fFloatValue2;
                    if (!linkedHashMap3.isEmpty()) {
                        arrayList5.add(i53.a.g(linkedHashMap3));
                        arrayList6.add(x51.e.b(fValueOf, fValueOf2, arrayList7, arrayList2));
                    }
                    o13.p pVar2 = new o13.p(arrayList5, arrayList6);
                    List list2 = (List) pVar2.f128594a;
                    List list3 = (List) pVar2.f128595b;
                    ArrayList arrayList8 = new ArrayList();
                    o0VarE.C(575126645);
                    Iterator it7 = list2.iterator();
                    int i18 = 0;
                    p3.o0 o0Var4 = o0VarE;
                    while (it7.hasNext()) {
                        Object next = it7.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            p13.x.q();
                            throw th3;
                        }
                        final i53.d dVar2 = (i53.d) next;
                        i53.d dVar3 = (i53.d) p13.h0.e0(i18, list3);
                        if (dVar3 != null) {
                            eVar = (i53.e) dVar3.entrySet();
                        } else {
                            r18 = th3;
                        }
                        if (r18 == 0) {
                            o0Var4.C(1290749008);
                            o0Var4.g0(false);
                            obj = th3;
                        } else {
                            r18 = eVar;
                            o0Var4.C(1290749009);
                            ArrayList arrayList9 = new ArrayList(p13.y.r(r18, 10));
                            for (Map.Entry entry : r18) {
                                arrayList9.add(new o13.p(entry.getKey(), o4.d0.a(n5.a.a(o0Var4, ((Number) entry.getValue()).intValue()))));
                            }
                            o0Var4.g0(false);
                            obj = arrayList9;
                        }
                        if (obj == null) {
                            r18 = eVar;
                            obj = p13.j0.f134944a;
                        }
                        r18 = eVar;
                        Iterable<o13.p> iterable = (Iterable) obj;
                        final ArrayList arrayList10 = new ArrayList(p13.y.r(iterable, 10));
                        p3.o0 o0Var5 = o0Var4;
                        for (o13.p pVar3 : iterable) {
                            arrayList10.add(new o13.p(Float.valueOf(((Number) pVar3.f128594a).floatValue()), o4.d0.a(o4.d0.c(0.4f, ((o4.d0) pVar3.f128595b).f128833a, 14))));
                            o0Var5 = o0Var5;
                            list3 = list3;
                            it7 = it7;
                        }
                        List list4 = list3;
                        Iterator it8 = it7;
                        p3.o0 o0Var6 = o0Var5;
                        if (fFloatValue > fB2) {
                            p3.o0 o0Var7 = o0Var6;
                            o0Var7.C(1291073703);
                            f17 = f34;
                            boolean zB6 = o0Var7.B(dVar2) | o0Var7.i(fB2) | o0Var7.i(fFloatValue) | o0Var7.r(arrayList10) | o0Var7.i(fA2) | o0Var7.i(f17) | o0Var7.i(fC3);
                            Object objQ9 = o0Var7.q();
                            if (zB6 || objQ9 == p3.m.a.f135155b) {
                                final int i24 = 0;
                                final float f36 = fC3;
                                final float f37 = fFloatValue;
                                final float f38 = fB2;
                                final float f39 = fA2;
                                objQ9 = new e23.l() { // from class: x51.c
                                    @Override // e23.l
                                    public final Object invoke(Object obj2) {
                                        switch (i24) {
                                            case 0:
                                                q4.f fVar = (q4.f) obj2;
                                                fVar.getClass();
                                                float f44 = f38;
                                                return e.a(fVar, dVar2, f44, f37, arrayList10, Float.valueOf(f44), Float.valueOf(f39), Float.valueOf(f17), Float.valueOf(f36));
                                            default:
                                                q4.f fVar2 = (q4.f) obj2;
                                                fVar2.getClass();
                                                Float fValueOf3 = Float.valueOf(f39);
                                                float f45 = f37;
                                                return e.a(fVar2, dVar2, f38, f45, arrayList10, fValueOf3, Float.valueOf(f45), Float.valueOf(f17), Float.valueOf(f36));
                                        }
                                    }
                                };
                                dVar = dVar2;
                                f19 = f38;
                                arrayList3 = arrayList10;
                                f16 = f39;
                                f18 = f36;
                                o0Var7.K(objQ9);
                            } else {
                                arrayList3 = arrayList10;
                                f16 = fA2;
                                dVar = dVar2;
                                f18 = fC3;
                                f19 = fB2;
                            }
                            arrayList8.add((e23.l) objQ9);
                            o0Var7.g0(false);
                            o0Var2 = o0Var7;
                        } else {
                            arrayList3 = arrayList10;
                            f16 = fA2;
                            p3.o0 o0Var8 = o0Var6;
                            f17 = f34;
                            dVar = dVar2;
                            f18 = fC3;
                            f19 = fB2;
                            o0Var8.C(1291657030);
                            o0Var8.g0(false);
                            o0Var2 = o0Var8;
                        }
                        final float f44 = f35;
                        boolean zB7 = o0Var2.B(dVar) | o0Var2.i(fFloatValue) | o0Var2.i(f44) | o0Var2.r(obj) | o0Var2.i(f19) | o0Var2.i(f16) | o0Var2.i(f17) | o0Var2.i(f18);
                        Object objQ10 = o0Var2.q();
                        if (zB7 || objQ10 == p3.m.a.f135155b) {
                            final float f45 = f19;
                            final float f46 = f16;
                            final float f47 = f17;
                            final float f48 = f18;
                            final float f49 = fFloatValue;
                            final ?? r34 = obj;
                            final i53.d dVar4 = dVar;
                            objQ10 = new e23.l() { // from class: x51.d
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    q4.f fVar = (q4.f) obj2;
                                    fVar.getClass();
                                    return e.a(fVar, dVar4, f49, f44, r34, Float.valueOf(f45), Float.valueOf(f46), Float.valueOf(f47), Float.valueOf(f48));
                                }
                            };
                            o0Var2.K(objQ10);
                        }
                        arrayList8.add((e23.l) objQ10);
                        if (f44 < f16) {
                            o0Var2.C(1292265033);
                            boolean zB8 = o0Var2.B(dVar) | o0Var2.i(f44) | o0Var2.i(f16) | o0Var2.r(arrayList3) | o0Var2.i(f19) | o0Var2.i(f17) | o0Var2.i(f18);
                            Object objQ11 = o0Var2.q();
                            if (zB8 || objQ11 == p3.m.a.f135155b) {
                                final int i25 = 1;
                                final float f50 = f19;
                                final float f54 = f16;
                                f34 = f17;
                                f22 = f18;
                                final i53.d dVar5 = dVar;
                                final ArrayList arrayList11 = arrayList3;
                                objQ11 = new e23.l() { // from class: x51.c
                                    @Override // e23.l
                                    public final Object invoke(Object obj2) {
                                        switch (i25) {
                                            case 0:
                                                q4.f fVar = (q4.f) obj2;
                                                fVar.getClass();
                                                float f410 = f44;
                                                return e.a(fVar, dVar5, f410, f54, arrayList11, Float.valueOf(f410), Float.valueOf(f50), Float.valueOf(f34), Float.valueOf(f22));
                                            default:
                                                q4.f fVar2 = (q4.f) obj2;
                                                fVar2.getClass();
                                                Float fValueOf3 = Float.valueOf(f50);
                                                float f411 = f54;
                                                return e.a(fVar2, dVar5, f44, f411, arrayList11, fValueOf3, Float.valueOf(f411), Float.valueOf(f34), Float.valueOf(f22));
                                        }
                                    }
                                };
                                o0Var2.K(objQ11);
                            } else {
                                f34 = f17;
                                f22 = f18;
                            }
                            arrayList8.add((e23.l) objQ11);
                            o0Var2.g0(false);
                        } else {
                            f34 = f17;
                            f22 = f18;
                            o0Var2.C(1292846438);
                            o0Var2.g0(false);
                        }
                        fB2 = f19;
                        i18 = i19;
                        f35 = f44;
                        fC3 = f22;
                        it7 = it8;
                        fA2 = f16;
                        list3 = list4;
                        o0Var4 = o0Var2;
                    }
                    o0Var4.g0(false);
                    x1 x1Var3 = p3.n.f135158a;
                    b63.o oVar3 = (b63.o) p1Var4.getF182175a();
                    if (uVar != null) {
                        uVarJ2 = g22.l.j(uVar);
                    } else {
                        r17 = th3;
                    }
                    if (uVar2 != null) {
                        r17 = uVarJ2;
                        J3 = g22.l.j(uVar2);
                    } else {
                        r17 = uVarJ2;
                        J3 = th3;
                    }
                    b63.u uVar10 = (b63.u) p1Var2.getF182175a();
                    b63.u uVar11 = (b63.u) p1Var3.getF182175a();
                    float f55 = x51.g.f189036a;
                    ArrayList arrayList12 = new ArrayList();
                    float fB3 = x51.b.b(r17, uVar10, oVar3);
                    float fA3 = x51.b.a(J3, uVar11, oVar3);
                    Float fC5 = x51.b.c(uVar10, oVar3);
                    float fFloatValue3 = fC5 != null ? fC5.floatValue() : fB3;
                    Float fC6 = x51.b.c(uVar11, oVar3);
                    float fFloatValue4 = fC6 != null ? fC6.floatValue() : fA3;
                    float fA4 = o92.c.a(x51.g.f189037b, o0Var4);
                    float fA5 = o92.c.a(x51.g.f189038c, o0Var4);
                    d92.b.f58623a.getClass();
                    long jE = d92.b.a(o0Var4).j().e();
                    float f56 = fA3 - fB3;
                    o0Var4.C(508983011);
                    Iterator it9 = p13.u.C(new Float[]{Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4)}).iterator();
                    while (it9.hasNext()) {
                        final float fFloatValue5 = (((Number) it9.next()).floatValue() - fB3) / f56;
                        boolean zI = o0Var4.i(fFloatValue5) | o0Var4.l(jE) | o0Var4.i(fA4) | o0Var4.i(fA5);
                        Object objQ12 = o0Var4.q();
                        if (zI || objQ12 == p3.m.a.f135155b) {
                            f14 = fA4;
                            f15 = fA5;
                            j8 = jE;
                            objQ12 = new e23.l() { // from class: x51.f
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    q4.f fVar = (q4.f) obj2;
                                    fVar.getClass();
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) * fFloatValue5;
                                    j jVarA = m.a();
                                    jVarA.a(fIntBitsToFloat, 0.0f);
                                    jVarA.c(fIntBitsToFloat, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                                    float fS0 = fVar.s0(g.f189036a);
                                    g1.f128855a.getClass();
                                    k kVar2 = new k(fS0, 0.0f, 0, 0, g1.a.a(0.0f, new float[]{5.0f, 5.0f}), 14, null);
                                    long j14 = j8;
                                    q4.f.L(fVar, jVarA, j14, 0.0f, kVar2, 52);
                                    j jVarA2 = m.a();
                                    float f57 = f14;
                                    float f58 = fIntBitsToFloat - f57;
                                    jVarA2.a(f58, 0.0f);
                                    float f59 = fIntBitsToFloat + f57;
                                    jVarA2.c(f59, 0.0f);
                                    float f64 = f15;
                                    jVarA2.c(fIntBitsToFloat, f64);
                                    jVarA2.close();
                                    q4.f.L(fVar, jVarA2, j14, 0.0f, null, 60);
                                    j jVarA3 = m.a();
                                    jVarA3.a(f58, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                                    jVarA3.c(f59, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                                    jVarA3.c(fIntBitsToFloat, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - f64);
                                    jVarA3.close();
                                    q4.f.L(fVar, jVarA3, j14, 0.0f, null, 60);
                                    return i53.a.c();
                                }
                            };
                            o0Var4.K(objQ12);
                        } else {
                            f14 = fA4;
                            f15 = fA5;
                            j8 = jE;
                        }
                        arrayList12.add((e23.l) objQ12);
                        fA4 = f14;
                        fA5 = f15;
                        jE = j8;
                    }
                    o0Var4.g0(false);
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0Var4, 0);
                    int iHashCode2 = Long.hashCode(o0Var4.U);
                    i2 i2VarA1 = o0Var4.a0();
                    h4.r rVarC3 = h4.k.c(aVar3, o0Var4);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (cVar2 == null) {
                        p3.p0.l();
                        throw th3;
                    }
                    o0Var4.z();
                    if (o0Var4.T) {
                        o0Var4.M(aVar4);
                    } else {
                        o0Var4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0Var4);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0Var4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0Var4.T || !p005kotlin.jvm.internal.s.g(o0Var4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var4, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, o0Var4);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar3, eVar2.f97920e, 0.0f, 2);
                    bVar3.getClass();
                    h4.r rVarC4 = c2.l.C(rVarA, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    String strQ = gl1.y.Q(o0Var4, R.string.lbl_heart_rate_cap);
                    j92.f fVar = d92.b.f58624b;
                    fVar.getClass();
                    p3.o0 o0Var9 = o0Var4;
                    mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97931h, o0Var4)), o0Var9, 0, 0, 131068);
                    a((b63.u) p1Var2.getF182175a(), o0Var9, 0);
                    h4.r rVarD = x2.d(aVar3, 1.0f);
                    bVar3.getClass();
                    h4.r rVarA2 = c2.l.A(rVarD, eVar2.f97920e, 0.0f, 2);
                    i53.c cVarE = i53.a.e(p13.h0.C0(arrayList8, arrayList12));
                    String strQ2 = gl1.y.Q(o0Var9, R.string.common_no_data);
                    y3 y3Var = t1.f91493k;
                    w5.q.b bVar4 = (w5.q.b) o0Var9.A(y3Var);
                    y3 y3Var2 = t1.f91490h;
                    g6.d dVar6 = new g6.d(((g6.c) o0Var9.A(y3Var2)).getF75991a(), 1.0f);
                    y3 y3Var3 = t1.f91496n;
                    s5.s0 s0Var = new s5.s0(bVar4, dVar6, (g6.o) o0Var9.A(y3Var3), 0, 8, null);
                    fVar.getClass();
                    s5.x0 x0Var = j92.f.f97935l;
                    n92.i iVar = new n92.i(list, false, false, s0Var, d92.c.f(x0Var, o0Var9), null, 0.0f, 0.0f, 226, null);
                    n92.j jVar = new n92.j(new d02.a(), Float.valueOf(m1Var.getFloatValue()), Float.valueOf(m1Var2.getFloatValue()), 4);
                    s5.s0 s0Var2 = new s5.s0((w5.q.b) o0Var9.A(y3Var), new g6.d(((g6.c) o0Var9.A(y3Var2)).getF75991a(), 1.0f), (g6.o) o0Var9.A(y3Var3), 0, 8, null);
                    fVar.getClass();
                    n92.a aVar5 = new n92.a(jVar, null, new n92.g(sn.a.c(o0Var9), s0Var2, d92.c.f(x0Var, o0Var9), null, 8, null), iVar, 2, null);
                    g6.f fVarA = g6.f.a(f182316a);
                    w51.b.f182219a.getClass();
                    m92.r.b(rVarA2, cVarE, fVarA, null, false, strQ2, 0.0f, 0.0f, aVar5, w51.b.f182223e, null, o0Var9, 805306752, 0, 1240);
                    p3.o0 o0Var10 = o0Var9;
                    o0Var10.g0(true);
                    o0Var10.g0(false);
                    o0Var3 = o0Var10;
                }
                x1 x1Var5 = p3.n.f135158a;
                o0Var = o0Var3;
            } else {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i26 = 0;
                pVar = new e23.p() { // from class: w51.k0
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i26) {
                            case 0:
                                ((Integer) obj3).intValue();
                                o0.h(tVar, cVar, uVar, uVar2, uVar3, uVar4, z14, z15, (p3.m) obj2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj3).intValue();
                                o0.h(tVar, cVar, uVar, uVar2, uVar3, uVar4, z14, z15, (p3.m) obj2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        o0Var = o0VarE;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i27 = 1;
            pVar = new e23.p() { // from class: w51.k0
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i27) {
                        case 0:
                            ((Integer) obj3).intValue();
                            o0.h(tVar, cVar, uVar, uVar2, uVar3, uVar4, z14, z15, (p3.m) obj2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj3).intValue();
                            o0.h(tVar, cVar, uVar, uVar2, uVar3, uVar4, z14, z15, (p3.m) obj2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void i(boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-262329759);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.b(null, null, z3.f.c(-755916180, new n0(aVar, 0), o0VarE), z3.f.c(529146349, new a42.e(z14, aVar2, 23), o0VarE), 0L, o0VarE, 3456, 19);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.a(z14, aVar, aVar2, i14, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(q0 q0Var, e23.a<Unit> aVar, e23.q<? super am.x0, ? super Long, ? super List<? extends am.x0>, Unit> qVar, e23.p<? super String, ? super b63.o, Unit> pVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        p3.o0 o0Var;
        q0Var.getClass();
        aVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(97006395);
        int i15 = i14 | (o0VarE.r(q0Var) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            p1 p1VarC = s9.c.c(q0Var.f182376g, o0VarE);
            context.getClass();
            com.garmin.android.apps.connectmobile.c3 c3Var = (com.garmin.android.apps.connectmobile.c3) context;
            boolean z14 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new j(aVar, 4);
                o0VarE.K(objQ2);
            }
            c.w.a(0, 1, (e23.a) objQ2, o0VarE, false);
            Boolean boolValueOf = Boolean.valueOf(((p0) p1VarC.getF182175a()).f182366w);
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(q0Var) | ((i15 & 458752) == 131072);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new a(q0Var, aVar3, p1VarC, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, boolValueOf, o0VarE);
            boolean z15 = ((p0) p1VarC.getF182175a()).f182353j;
            hb.f88319a.getClass();
            c2.c3 c3VarA = hb.a(o0VarE);
            p3.f22815b.getClass();
            o0Var = o0VarE;
            z02.d.a(z15, z3.f.c(208450496, new s70.a0(aVar, 29), o0VarE), z3.f.c(94840001, new k(feVar, c3Var, 1), o0VarE), null, n3.d(c3VarA, p3.f22822i | p3.f22826m), z3.f.c(-245991484, new vz1.j(p1VarC, pVar, aVar, q0Var, context, qVar, aVar2, feVar), o0VarE), o0Var, 197040, 8);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ta0.g0(q0Var, (e23.a) aVar, (e23.q) qVar, (e23.p) pVar, (e23.a) aVar2, (e23.a) aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091 A[LOOP:0: B:23:0x008b->B:25:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x024f  */
    public static final void k(h4.r rVar, z51.b bVar, p3.m mVar, int i14) {
        List<LatLng> listDecode;
        Object objB1;
        ArrayList arrayList;
        Drawable drawable;
        Drawable drawable2;
        t13.d dVar;
        p3.o0 o0VarE = mVar.E(792336621);
        int i15 = i14 | (o0VarE.B(bVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ie2.n.f93149a.getClass();
            com.garmin.android.library.mapsdkadapter.i.d dVarF = ((qw0.i) ie2.n.a()).f();
            ie2.l lVar = new ie2.l(1, false, null, 0.0f, null, null, null, null, null, null, null, null, 4094, null);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                listDecode = PolyUtil.decode(bVar.f202471d);
                if (listDecode != null) {
                    arrayList = new ArrayList();
                    for (LatLng latLng : listDecode) {
                        arrayList.add(new ke2.b(latLng.latitude, latLng.longitude, null, 4, null));
                    }
                    objB1 = p13.h0.b1(arrayList);
                    if (objB1 == null) {
                        objB1 = p13.j0.f134944a;
                    }
                } else {
                    objB1 = p13.j0.f134944a;
                }
                objQ = objB1;
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    listDecode = PolyUtil.decode(bVar.f202471d);
                    if (listDecode != null) {
                        arrayList = new ArrayList();
                        while (r2.hasNext()) {
                            arrayList.add(new ke2.b(latLng.latitude, latLng.longitude, null, 4, null));
                        }
                        objB1 = p13.h0.b1(arrayList);
                        if (objB1 == null) {
                            objB1 = p13.j0.f134944a;
                        }
                    } else {
                        objB1 = p13.j0.f134944a;
                    }
                    objQ = objB1;
                    o0VarE.K(objQ);
                }
            }
            List list = (List) objQ;
            boolean zB = o0VarE.B(context);
            Object objQ2 = o0VarE.q();
            if (zB) {
                drawable = a7.b.getDrawable(context, 2131232000);
                if (drawable != null) {
                    objQ2 = d7.b.b(drawable, 0, 0, 7);
                } else {
                    objQ2 = null;
                }
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    drawable = a7.b.getDrawable(context, 2131232000);
                    if (drawable != null) {
                        objQ2 = d7.b.b(drawable, 0, 0, 7);
                    } else {
                        objQ2 = null;
                    }
                    o0VarE.K(objQ2);
                }
            }
            Bitmap bitmap = (Bitmap) objQ2;
            boolean zB2 = o0VarE.B(context);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                drawable2 = a7.b.getDrawable(context, 2131232001);
                if (drawable2 != null) {
                    objQ3 = d7.b.b(drawable2, 0, 0, 7);
                } else {
                    objQ3 = null;
                }
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    drawable2 = a7.b.getDrawable(context, 2131232001);
                    if (drawable2 != null) {
                        objQ3 = d7.b.b(drawable2, 0, 0, 7);
                    } else {
                        objQ3 = null;
                    }
                    o0VarE.K(objQ3);
                }
            }
            Bitmap bitmap2 = (Bitmap) objQ3;
            ke2.b bVar2 = new ke2.b(bVar.f202477j, bVar.f202478k, null, 4, null);
            ke2.b bVar3 = new ke2.b(bVar.f202479l, bVar.f202480m, null, 4, null);
            boolean zB3 = o0VarE.B(list);
            Object objQ4 = o0VarE.q();
            if (zB3) {
                objQ4 = i53.a.a(new le2.c(bVar2, bitmap, p(bitmap, dVarF), 0.0f), new le2.c(bVar3, bitmap2, p(bitmap2, dVarF), 1.0f));
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = i53.a.a(new le2.c(bVar2, bitmap, p(bitmap, dVarF), 0.0f), new le2.c(bVar3, bitmap2, p(bitmap2, dVarF), 1.0f));
                    o0VarE.K(objQ4);
                }
            }
            i53.f fVar = (i53.f) objQ4;
            boolean zB4 = o0VarE.B(list) | o0VarE.B(fVar);
            Object objQ5 = o0VarE.q();
            if (zB4) {
                objQ5 = new le2.b(bVar2, i53.a.a(new le2.d(0L, i53.a.j(list), new vp1.a(27), -65536, null, 0, 1.0f, 49, null)), fVar, null, 8, null);
                o0VarE.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new le2.b(bVar2, i53.a.a(new le2.d(0L, i53.a.j(list), new vp1.a(27), -65536, null, 0, 1.0f, 49, null)), fVar, null, 8, null);
                    o0VarE.K(objQ5);
                }
            }
            le2.b bVar4 = (le2.b) objQ5;
            ie2.n.f93149a.getClass();
            com.garmin.android.library.mapsdkadapter.k kVarA = ie2.n.a();
            boolean zR = o0VarE.r(bVar2);
            Object objQ6 = o0VarE.q();
            if (zR) {
                objQ6 = new ki1.g(bVar2, 1);
                o0VarE.K(objQ6);
            } else {
                aVar.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new ki1.g(bVar2, 1);
                    o0VarE.K(objQ6);
                }
            }
            je2.b<?> bVarE = ((com.garmin.android.library.mapsdkadapter.r) kVarA).e(dVarF, bVar2, (e23.a) objQ6, o0VarE, ke2.b.f104550d << 3);
            if (bVarE == null) {
                o0VarE.C(-637875751);
                o0VarE.g0(false);
                dVar = null;
            } else {
                o0VarE.C(1226349352);
                dVar = null;
                bVarE.a(rVar, lVar, bVar4, true, false, false, null, null, null, o0VarE, (ie2.l.f93135m << 3) | 1073966086, 448);
                o0VarE.g0(false);
            }
            boolean zR2 = o0VarE.r(list) | o0VarE.k(r4.ordinal()) | o0VarE.r(bVarE);
            Object objQ7 = o0VarE.q();
            if (zR2) {
                objQ7 = new f(list, dVarF, bVarE, dVar);
                o0VarE.K(objQ7);
            } else {
                aVar.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new f(list, dVarF, bVarE, dVar);
                    o0VarE.K(objQ7);
                }
            }
            p3.l0.f(bVarE, list, (e23.p) objQ7, o0VarE);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(rVar, bVar, i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    public static final void l(String str, int i14, int i15, e23.a<Unit> aVar, e23.p<? super Integer, ? super Integer, Unit> pVar, p3.m mVar, int i16) {
        e23.a<Unit> aVar2;
        p3.o0 o0VarE = mVar.E(-475758966);
        int i17 = i16 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(pVar) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            c22.j0.f23099a.getClass();
            si siVarZ = bi.z(i14, i15, c22.j0.D(), o0VarE, (i17 >> 3) & 126, 0);
            boolean zR = o0VarE.r(siVarZ);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new g(siVarZ, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(siVarZ, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, siVarZ, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.common_button_done);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                aVar2 = aVar;
                objQ2 = new j(aVar2, 3);
                o0VarE.K(objQ2);
            } else {
                aVar2 = aVar;
            }
            e23.a aVar4 = (e23.a) objQ2;
            boolean z14 = (57344 & i17) == 16384;
            Object objQ3 = o0VarE.q();
            if (z14) {
                objQ3 = new uj1.y(pVar, 1);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == c2565a) {
                    objQ3 = new uj1.y(pVar, 1);
                    o0VarE.K(objQ3);
                }
            }
            g82.e.a(str, siVarZ, true, strQ2, aVar4, strQ, (e23.p) objQ3, o0VarE, (i17 & 14) | 384);
            o0VarE = o0VarE;
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.n(str, i14, i15, aVar2, pVar, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    public static final void m(boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        p3.o0 o0VarE = mVar.E(327696602);
        int i19 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i19 & 1, (i19 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                i15 = -51068756;
                i16 = R.string.lbl_saving_activity;
            } else {
                i15 = -51003315;
                i16 = R.string.lbl_activity_saved;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            if (z14) {
                i17 = -50910191;
                i18 = R.string.msg_activities_single_upload_in_progress_alert;
            } else {
                i17 = -50817687;
                i18 = R.string.activities_single_upload_finished_notification_message;
            }
            String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, false);
            g02.l0 cVar = z14 ? new g02.l0.c(false, 0, 3, null) : new g02.l0.a(1000);
            boolean z15 = ((i19 & 14) == 4) | ((i19 & 112) == 32);
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new as.i(z14, aVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new as.i(z14, aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            g02.k0.c(strJ, strJ2, cVar, (e23.a) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.e(i14, 22, aVar, z14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(String str, b63.u uVar, b63.u uVar2, b63.u uVar3, boolean z14, e23.l<? super b63.u, Unit> lVar, p3.m mVar, int i14) {
        Object obj;
        boolean z15;
        p3.o0 o0VarE = mVar.E(1255227512);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(uVar) ? 32 : 16) | (o0VarE.r(uVar2) ? 256 : 128) | (o0VarE.r(uVar3) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            uVar.getClass();
            uVar2.getClass();
            boolean z16 = !uVar.b().equals(uVar2.b()) || uVar2.f16216a.getHour() == 23 || uVar.f16216a.getHour() == 0;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = zf.b.q(context, uVar3);
            LocalDateTime localDateTime = uVar3.f16216a;
            if (z16) {
                strQ = e5.g(zf.b.p(uVar3.b()), ", ", strQ);
            }
            z3.e eVarC = z3.f.c(-623435925, new rw0.g(z14, 14), o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new j0(p1Var, 2);
                o0VarE.K(objQ2);
            }
            p2Var.h(str, strQ, null, null, null, false, false, null, eVarC, null, (e23.a) objQ2, o0VarE, (i15 & 14) | 100663296, 6, 764);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1796631425);
                if (z16) {
                    o0VarE.C(-1796628108);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_start_time);
                    Object objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new j0(p1Var, 3);
                        o0VarE.K(objQ3);
                    }
                    e23.a aVar = (e23.a) objQ3;
                    boolean z17 = (458752 & i15) == 131072;
                    Object objQ4 = o0VarE.q();
                    if (z17 || objQ4 == c2565a) {
                        objQ4 = new oy0.c(lVar, p1Var, 10);
                        o0VarE.K(objQ4);
                    }
                    o0VarE = o0VarE;
                    z15 = false;
                    b1.a(strQ2, uVar, uVar2, uVar3, aVar, (e23.l) objQ4, o0VarE, (i15 & 7168) | (i15 & 112) | 24576 | (i15 & 896));
                    obj = uVar3;
                    o0VarE.g0(false);
                } else {
                    obj = uVar3;
                    z15 = false;
                    o0VarE.C(-1796081919);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_start_time);
                    int hour = localDateTime.getHour();
                    int minute = localDateTime.getMinute();
                    Object objQ5 = o0VarE.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new j0(p1Var, 4);
                        o0VarE.K(objQ5);
                    }
                    e23.a aVar2 = (e23.a) objQ5;
                    boolean zR = o0VarE.r(obj) | ((i15 & 458752) == 131072);
                    Object objQ6 = o0VarE.q();
                    if (zR || objQ6 == c2565a) {
                        objQ6 = new vx1.b(obj, 12, lVar, p1Var);
                        o0VarE.K(objQ6);
                    }
                    o0VarE = o0VarE;
                    l(strQ3, hour, minute, aVar2, (e23.p) objQ6, o0VarE, 3072);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
            } else {
                obj = uVar3;
                o0VarE = o0VarE;
                o0VarE.C(-1795237014);
                o0VarE.g0(false);
            }
        } else {
            obj = uVar3;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(str, uVar, uVar2, obj, z14, lVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    public static final void o(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-496522606);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            long j8 = d92.b.a(o0VarE).f().f63508c;
            h4.r.a aVar = h4.r.S;
            d92.b.f58625c.getClass();
            h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97904c);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarQ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            h4.r rVarD = c2.u.f22885a.d(aVar);
            boolean zL = o0VarE.l(j8);
            Object objQ = o0VarE.q();
            if (zL) {
                objQ = new j82.d(j8, 24);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j82.d(j8, 24);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarD, (e23.l) objQ, o0VarE, 0);
            h4.r rVarD2 = x2.d(aVar, 1.0f);
            s62.a.f157643a.getClass();
            i7.b(f72.o0.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.image_content_description), rVarD2, d92.b.a(o0VarE).f().f(), o0VarE, 384, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vp1.a(i14, 28);
        }
    }

    public static final BitmapDescriptor p(Bitmap bitmap, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        if (dVar != com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
            return null;
        }
        if (bitmap != null) {
            try {
                BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
                if (bitmapDescriptorFromBitmap != null) {
                    return bitmapDescriptorFromBitmap;
                }
            } catch (Exception e4) {
                sn.a.s("Exception creating BitmapDescriptor: ", e4.getMessage(), com.garmin.android.apps.connectmobile.i2.f36769a, a2.GENERAL, "PendingActivityDetailsScreen");
                return null;
            }
        }
        BitmapDescriptor bitmapDescriptorDefaultMarker = BitmapDescriptorFactory.defaultMarker();
        bitmapDescriptorDefaultMarker.getClass();
        return bitmapDescriptorDefaultMarker;
    }
}
