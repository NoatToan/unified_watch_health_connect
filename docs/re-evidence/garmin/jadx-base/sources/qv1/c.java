package qv1;

import am.x0;
import com.google.android.gms.identity.intents.AddressConstants;
import e23.p;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import o13.r;
import o13.u;
import o53.b0;
import o53.c0;
import org.joda.time.LocalDate;
import ou1.a0;
import ou1.d0;
import ou1.e0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lvv1/a;", "<anonymous>", "(Lo53/b0;)Lvv1/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2", f = "FBTProgressReportViewModel.kt", l = {489, 496, 503, 508, 513, 518, 533, 538, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, 564}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super vv1.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f148069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv1.b f148070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f148071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LocalDate f148072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LocalDate f148073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f148074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f148075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f148076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f148077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f148078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<uv1.a> f148079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ qv1.b f148080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f148081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f148082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LocalDate f148083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LocalDate f148084p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$1", f = "FBTProgressReportViewModel.kt", l = {487}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r0<vv1.a> f148089e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qv1.b bVar, LocalDate localDate, LocalDate localDate2, r0<vv1.a> r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148086b = bVar;
            this.f148087c = localDate;
            this.f148088d = localDate2;
            this.f148089e = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f148086b, this.f148087c, this.f148088d, this.f148089e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v6, types: [T, vv1.a] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objE;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148085a;
            if (i14 == 0) {
                r.b(obj);
                ou1.i iVar = this.f148086b.f147935b;
                this.f148085a = 1;
                iVar.getClass();
                objE = c0.e(new ou1.o(iVar, this.f148087c, this.f148088d, null), this);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objE = obj;
            }
            r0<vv1.a> r0Var = this.f148089e;
            r0Var.f105810a = vv1.a.a(r0Var.f105810a, (o13.p) objE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/u;", "", "", "<anonymous>", "(Lo53/b0;)Lo13/u;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$longestRun$1", f = "FBTProgressReportViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super u<? extends Double, ? extends Integer, ? extends Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f148091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f148092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qv1.b bVar, o oVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f148090a = bVar;
            this.f148091b = oVar;
            this.f148092c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f148090a, this.f148091b, this.f148092c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super u<? extends Double, ? extends Integer, ? extends Integer>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            yw1.e value;
            yw1.f fVar;
            Double d14;
            List<yw1.g> list;
            yw1.g gVar;
            Map<String, yw1.e> map;
            yw1.e eVar;
            yw1.f fVar2;
            Double d15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ou1.i iVar = this.f148090a.f147935b;
            iVar.getClass();
            o oVar = this.f148091b;
            oVar.getClass();
            int i14 = ou1.i.b.f134065a[oVar.ordinal()];
            boolean z14 = this.f148092c;
            if (i14 == 1) {
                Map.Entry<String, yw1.e> entry = iVar.f134060c;
                if (entry == null || (value = entry.getValue()) == null || (fVar = value.f199906d) == null || (d14 = fVar.f199916c) == null) {
                    return null;
                }
                return fy1.b.b(d14.doubleValue(), z14, false);
            }
            if (i14 != 2 || (list = iVar.f134059b) == null || (gVar = (yw1.g) h0.d0(list)) == null || (map = gVar.f199923c) == null || (eVar = map.get(x0.f4308n.f4358a)) == null || (fVar2 = eVar.f199906d) == null || (d15 = fVar2.f199916c) == null) {
                return null;
            }
            return fy1.b.b(d15.doubleValue(), z14, false);
        }
    }

    /* JADX INFO: renamed from: qv1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$result$1", f = "FBTProgressReportViewModel.kt", l = {508}, m = "invokeSuspend", v = 2)
    public static final class C2788c extends v13.i implements p<b0, t13.d<? super o13.p<? extends Double, ? extends Double>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148096d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2788c(qv1.b bVar, LocalDate localDate, LocalDate localDate2, t13.d<? super C2788c> dVar) {
            super(2, dVar);
            this.f148094b = bVar;
            this.f148095c = localDate;
            this.f148096d = localDate2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2788c(this.f148094b, this.f148095c, this.f148096d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends Double, ? extends Double>> dVar) {
            return ((C2788c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148093a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ou1.i iVar = this.f148094b.f147935b;
            o oVar = o.f180175f;
            this.f148093a = 1;
            Serializable serializableL = iVar.l(this.f148095c, this.f148096d, oVar, this);
            return serializableL == aVar ? aVar : serializableL;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/u;", "", "<anonymous>", "(Lo53/b0;)Lo13/u;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$result$2", f = "FBTProgressReportViewModel.kt", l = {513}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super u<? extends Integer, ? extends Integer, ? extends Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f148101e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(qv1.b bVar, LocalDate localDate, LocalDate localDate2, o oVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f148098b = bVar;
            this.f148099c = localDate;
            this.f148100d = localDate2;
            this.f148101e = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f148098b, this.f148099c, this.f148100d, this.f148101e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super u<? extends Integer, ? extends Integer, ? extends Integer>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148097a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ou1.i iVar = this.f148098b.f147935b;
            this.f148097a = 1;
            Serializable serializableK = iVar.k(this.f148099c, this.f148100d, this.f148101e, this);
            return serializableK == aVar ? aVar : serializableK;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$result$3", f = "FBTProgressReportViewModel.kt", l = {518}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super o13.p<? extends Integer, ? extends Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f148106e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qv1.b bVar, LocalDate localDate, LocalDate localDate2, o oVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f148103b = bVar;
            this.f148104c = localDate;
            this.f148105d = localDate2;
            this.f148106e = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f148103b, this.f148104c, this.f148105d, this.f148106e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends Integer, ? extends Integer>> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148102a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ou1.i iVar = this.f148103b.f147935b;
            this.f148102a = 1;
            iVar.getClass();
            Object objE = c0.e(new d0(this.f148106e, iVar, this.f148104c, this.f148105d, null), this);
            return objE == aVar ? aVar : objE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/u;", "", "<anonymous>", "(Lo53/b0;)Lo13/u;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$result$4", f = "FBTProgressReportViewModel.kt", l = {538}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<b0, t13.d<? super u<? extends Integer, ? extends Integer, ? extends Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148110d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(qv1.b bVar, LocalDate localDate, LocalDate localDate2, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f148108b = bVar;
            this.f148109c = localDate;
            this.f148110d = localDate2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f148108b, this.f148109c, this.f148110d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super u<? extends Integer, ? extends Integer, ? extends Integer>> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148107a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ou1.i iVar = this.f148108b.f147935b;
            o oVar = o.f180176g;
            this.f148107a = 1;
            Serializable serializableJ = iVar.j(this.f148109c, this.f148110d, oVar, this);
            return serializableJ == aVar ? aVar : serializableJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/u;", "", "<anonymous>", "(Lo53/b0;)Lo13/u;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$result$5", f = "FBTProgressReportViewModel.kt", l = {AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements p<b0, t13.d<? super u<? extends Integer, ? extends Integer, ? extends Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f148115e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(qv1.b bVar, LocalDate localDate, LocalDate localDate2, boolean z14, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f148112b = bVar;
            this.f148113c = localDate;
            this.f148114d = localDate2;
            this.f148115e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f148112b, this.f148113c, this.f148114d, this.f148115e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super u<? extends Integer, ? extends Integer, ? extends Integer>> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148111a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ou1.i iVar = this.f148112b.f147935b;
            this.f148111a = 1;
            Serializable serializableC = iVar.c(this.f148113c, this.f148114d, this.f148115e, this);
            return serializableC == aVar ? aVar : serializableC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$resultDTO$1", f = "FBTProgressReportViewModel.kt", l = {495}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements p<b0, t13.d<? super o13.p<? extends Integer, ? extends Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(qv1.b bVar, LocalDate localDate, LocalDate localDate2, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f148117b = bVar;
            this.f148118c = localDate;
            this.f148119d = localDate2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f148117b, this.f148118c, this.f148119d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends Integer, ? extends Integer>> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148116a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ou1.i iVar = this.f148117b.f147935b;
            this.f148116a = 1;
            iVar.getClass();
            Object objE = c0.e(new e0(iVar, this.f148118c, this.f148119d, null), this);
            return objE == aVar ? aVar : objE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Ljava/util/SortedMap;", "", "kotlin.jvm.PlatformType", "Lyw1/i;", "<anonymous>", "(Lo53/b0;)Ljava/util/SortedMap;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel$getAchievements$2$1$resultMap$1", f = "FBTProgressReportViewModel.kt", l = {502}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements p<b0, t13.d<? super SortedMap<Long, yw1.i>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qv1.b f148121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f148122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148123d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LocalDate f148124e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(qv1.b bVar, o oVar, LocalDate localDate, LocalDate localDate2, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f148121b = bVar;
            this.f148122c = oVar;
            this.f148123d = localDate;
            this.f148124e = localDate2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f148121b, this.f148122c, this.f148123d, this.f148124e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super SortedMap<Long, yw1.i>> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148120a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            ou1.i iVar = this.f148121b.f147935b;
            this.f148120a = 1;
            iVar.getClass();
            Object objE = c0.e(new a0(this.f148122c, iVar, this.f148123d, this.f148124e, null), this);
            return objE == aVar ? aVar : objE;
        }
    }

    public static final /* synthetic */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148125a;

        static {
            int[] iArr = new int[uv1.a.values().length];
            try {
                iArr[uv1.a.FITNESS_AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uv1.a.HIGHEST_VIGOROUS_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uv1.a.PERSONAL_RECORDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uv1.a.LACTATE_THRESHOLD_PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uv1.a.LACTATE_THRESHOLD_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[uv1.a.VO2_MAX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[uv1.a.FASTEST_AVERAGE_PACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[uv1.a.LONGEST_RUN_IN_PLAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[uv1.a.FUNCTIONAL_THRESHOLD_POWER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[uv1.a.HIGHEST_AVERAGE_POWER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[uv1.a.LONGEST_RIDE_IN_PLAN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[uv1.a.LONGEST_SWIM_IN_PLAN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[uv1.a.CRITICAL_SWIM_SPEED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[uv1.a.FURTHEST_WALKED_IN_A_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[uv1.a.LONGEST_STEP_GOAL_STREAK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[uv1.a.MOST_STEPS_IN_A_DAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f148125a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends uv1.a> list, qv1.b bVar, boolean z14, o oVar, LocalDate localDate, LocalDate localDate2, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f148079k = list;
        this.f148080l = bVar;
        this.f148081m = z14;
        this.f148082n = oVar;
        this.f148083o = localDate;
        this.f148084p = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f148079k, this.f148080l, this.f148081m, this.f148082n, this.f148083o, this.f148084p, dVar);
        cVar.f148078j = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super vv1.a> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0164  */
    /* JADX WARN: Code duplicated, block: B:264:0x097c  */
    /* JADX WARN: Code duplicated, block: B:267:0x09b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v62, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r4v36, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r4v44, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r4v56, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r4v81, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r5v15, types: [o53.d0, t13.g] */
    /* JADX WARN: Type inference failed for: r6v100, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v11, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v111, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v124, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v125 */
    /* JADX WARN: Type inference failed for: r6v137, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v19, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v22, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v25, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v28, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v31, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v55, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r6v80, types: [T, vv1.a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, vv1.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x063c -> B:269:0x09bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x0736 -> B:269:0x09bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x027f -> B:65:0x0288). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 2564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qv1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
