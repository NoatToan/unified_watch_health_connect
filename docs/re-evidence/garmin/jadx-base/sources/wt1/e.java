package wt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.g3;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zf0.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel$checkAndUpdateEventIfNecessary$1", f = "RaceEventViewModel.kt", l = {426, 431, 442, 453, 466}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xw1.c f187056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xw1.c f187057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f187058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f187059e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187060a;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.USER_CALENDAR_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f187060a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xw1.c cVar, xw1.c cVar2, d dVar, Context context, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f187056b = cVar;
        this.f187057c = cVar2;
        this.f187058d = dVar;
        this.f187059e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f187056b, this.f187057c, this.f187058d, this.f187059e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (wt1.d.A4(r7, r12, r11) == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r12 == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        if (r12 == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
    
        if (wt1.d.z4(r7, r9, r1, r11) == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0118, code lost:
    
        if (wt1.d.z4(r7, r12, r3, r11) == r0) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long l14;
        fg0.k kVar;
        Long l15;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187055a;
        d dVar = this.f187058d;
        xw1.c cVar = this.f187057c;
        fg0.k kVar2 = null;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                } else if (i14 == 3) {
                    o13.r.b(obj);
                } else if (i14 != 4 && i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g3 g3Var = (g3) obj;
                if (g3Var != null) {
                    kVar2 = (fg0.k) g3Var.f35301b;
                }
                if (kVar2 != null && (l15 = dVar.f187046m) != null) {
                    long jLongValue = l15.longValue();
                    this.f187055a = 4;
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        xw1.c cVar2 = this.f187056b;
        if (p005kotlin.jvm.internal.s.g(cVar2.getTiEventDTO(), cVar.getTiEventDTO())) {
            if (p005kotlin.jvm.internal.s.g(cVar2.getSelectedGoal(), cVar.getSelectedGoal()) && cVar2.getSelectedPaceGoalTime() == cVar.getSelectedPaceGoalTime()) {
                int i15 = d.f187033q;
                dVar.F4().j(new rt1.b.C2927b(null));
            } else {
                xw1.n tiEventDTO = cVar.getTiEventDTO();
                if (tiEventDTO != null && (r12 = tiEventDTO.f192426b) != null && (l14 = dVar.f187046m) != null) {
                    long jLongValue2 = l14.longValue();
                    this.f187055a = 5;
                }
            }
            return Unit.INSTANCE;
        }
        xw1.n tiEventDTO2 = cVar.getTiEventDTO();
        if ((tiEventDTO2 != null ? tiEventDTO2.f192425a : null) == y0.EDIT_DATE) {
            xw1.n tiEventDTO3 = cVar.getTiEventDTO();
            if (tiEventDTO3 != null && (r12 = tiEventDTO3.f192426b) != null) {
                this.f187055a = 1;
            }
            return Unit.INSTANCE;
        }
        xw1.n tiEventDTO4 = cVar2.getTiEventDTO();
        if (tiEventDTO4 != null && (kVar = tiEventDTO4.f192426b) != null) {
            boolean z14 = dVar.f187047n;
            this.f187055a = 2;
            obj = d.y4(dVar, z14, kVar, this);
        }
        return aVar;
        xw1.n tiEventDTO5 = cVar.getTiEventDTO();
        y0 y0Var = tiEventDTO5 != null ? tiEventDTO5.f192425a : null;
        if ((y0Var == null ? -1 : a.f187060a[y0Var.ordinal()]) == 1) {
            xw1.n tiEventDTO6 = cVar.getTiEventDTO();
            if (tiEventDTO6 != null) {
                kVar2 = tiEventDTO6.f192426b;
            }
            if (kVar2 != null) {
                long jLongValue3 = l15.longValue();
                this.f187055a = 4;
            }
            return Unit.INSTANCE;
        }
        xw1.n tiEventDTO7 = cVar.getTiEventDTO();
        fg0.p pVar = tiEventDTO7 != null ? tiEventDTO7.f192427c : null;
        xw1.n tiEventDTO8 = cVar.getTiEventDTO();
        fg0.k kVar3 = tiEventDTO8 != null ? tiEventDTO8.f192426b : null;
        this.f187055a = 3;
        obj = d.x4(dVar, this.f187059e, pVar, kVar3, this);
        return aVar;
    }
}
