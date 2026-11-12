package r02;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import gl1.y;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.q1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState$animateScaleTo$2", f = "ZoomableState.kt", l = {177}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f148917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f148918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f148919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f148920f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState$animateScaleTo$2$1$1", f = "ZoomableState.kt", l = {187, TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f148921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f148922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f148923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f148924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f148925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f148926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f148927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f148928h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f148929i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, float f14, long j8, float f15, float f16, long j14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148924d = mVar;
            this.f148925e = f14;
            this.f148926f = j8;
            this.f148927g = f15;
            this.f148928h = f16;
            this.f148929i = j14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f148924d, this.f148925e, this.f148926f, this.f148927g, this.f148928h, this.f148929i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        
            if (r10.g(r4, r9) == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float f14;
            long jC;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148923c;
            m mVar = this.f148924d;
            if (i14 != 0) {
                if (i14 == 1) {
                    jC = this.f148922b;
                    f14 = this.f148921a;
                    o13.r.b(obj);
                    s1.b<Float, s1.n> bVar = mVar.f148897e;
                    Float f15 = new Float(Float.intBitsToFloat((int) (4294967295L & jC)));
                    this.f148921a = f14;
                    this.f148922b = jC;
                    this.f148923c = 2;
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
            int i15 = m.f148892q;
            float f16 = this.f148925e;
            mVar.l(f16);
            n4.c.f123541b.getClass();
            long j8 = n4.c.f123543d;
            long j14 = this.f148926f;
            if (!n4.c.d(j14, j8)) {
                float f17 = this.f148927g;
                f14 = f17 == 0.0f ? 1.0f : (f16 - this.f148928h) / f17;
                jC = y.C(this.f148929i, j14, f14);
                s1.b<Float, s1.n> bVar2 = mVar.f148896d;
                Float f18 = new Float(Float.intBitsToFloat((int) (jC >> 32)));
                this.f148921a = f14;
                this.f148922b = jC;
                this.f148923c = 1;
                if (bVar2.g(f18, this) != aVar) {
                    s1.b<Float, s1.n> bVar3 = mVar.f148897e;
                    Float f19 = new Float(Float.intBitsToFloat((int) (4294967295L & jC)));
                    this.f148921a = f14;
                    this.f148922b = jC;
                    this.f148923c = 2;
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, float f14, s1.k<Float> kVar, long j8, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f148917c = mVar;
        this.f148918d = f14;
        this.f148919e = kVar;
        this.f148920f = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f148917c, this.f148918d, this.f148919e, this.f148920f, dVar);
        oVar.f148916b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        final b0 b0Var = (b0) this.f148916b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f148915a;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = this.f148917c;
            float fD = mVar.d();
            float fE = mVar.e();
            final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            final float floatValue = mVar.f148895c.getFloatValue();
            float f14 = this.f148918d;
            final float f15 = f14 - floatValue;
            final m mVar2 = this.f148917c;
            final long j8 = this.f148920f;
            e23.p pVar = new e23.p() { // from class: r02.n
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    ge1.b.T(b0Var, null, null, new o.a(mVar2, fFloatValue, j8, f15, floatValue, jFloatToRawIntBits, null), 3);
                    return Unit.INSTANCE;
                }
            };
            this.f148916b = null;
            this.f148915a = 1;
            if (q1.c(floatValue, f14, this.f148919e, pVar, this, 4) == aVar) {
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
