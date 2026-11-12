package og2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Log2/h;", "", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f132038a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Log2/h$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(i53.c cVar, qg2.b bVar) {
            Float f14;
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : cVar) {
                if (((Number) obj).floatValue() >= 0.0f) {
                    arrayList.add(obj);
                }
            }
            Float fV0 = p13.h0.v0(arrayList);
            float fFloatValue = fV0 != null ? fV0.floatValue() : 0.0f;
            Float fQ0 = p13.h0.q0(arrayList);
            float fFloatValue2 = fQ0 != null ? fQ0.floatValue() : 1.0f;
            if (fFloatValue == fFloatValue2) {
                fFloatValue2 = 1 + fFloatValue;
            }
            Float f15 = bVar.f144673a;
            Float f16 = bVar.f144674b;
            if ((f15 == null || f16 == null) && (f14 = bVar.f144675c) != null) {
                float fFloatValue3 = f14.floatValue() * 5.0f;
                if (fFloatValue2 - fFloatValue < fFloatValue3) {
                    if (f15 == null && f16 == null) {
                        float fMax = Float.max(fFloatValue - (0.5f * fFloatValue3), 0.0f);
                        bVar = qg2.b.a(bVar, Float.valueOf(fMax), Float.valueOf(fMax + fFloatValue3), 4);
                    } else if (f15 == null) {
                        bVar = qg2.b.a(bVar, f16 != null ? Float.valueOf(f16.floatValue() - fFloatValue3) : null, null, 6);
                    } else {
                        bVar = qg2.b.a(bVar, null, Float.valueOf(f15.floatValue() + fFloatValue3), 5);
                    }
                }
            }
            Float f17 = bVar.f144673a;
            float fMin = Math.min(f17 != null ? f17.floatValue() : fFloatValue, fFloatValue);
            Float f18 = bVar.f144674b;
            o13.p pVar = new o13.p(Float.valueOf(fMin), Float.valueOf(Float.max(f18 != null ? f18.floatValue() : fFloatValue2, fFloatValue2)));
            return new b(((Number) pVar.f128594a).floatValue(), ((Number) pVar.f128595b).floatValue());
        }

        private a() {
        }
    }
}
