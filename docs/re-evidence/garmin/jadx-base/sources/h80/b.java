package h80;

import android.net.Uri;
import com.garmin.android.gfdi.configuration.Configuration;
import e23.p;
import e23.q;
import j23.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;
import p13.w;
import r53.j;
import r53.l;
import r53.u;
import r53.v;
import rd2.f;
import v13.e;
import v13.i;
import vb.h;
import w2.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.developer.deeplinking.TestProtobufDeepLinkingViewModel$triggerDeepLinkRequest$1", f = "TestProtobufDeepLinkingViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h80.c f82393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f82394d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.developer.deeplinking.TestProtobufDeepLinkingViewModel$triggerDeepLinkRequest$1$1", f = "TestProtobufDeepLinkingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<j<? super Integer>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h80.c f82395a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h80.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f82395a = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f82395a, dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super Integer> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f82395a.f82400b.k(null, Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: h80.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.developer.deeplinking.TestProtobufDeepLinkingViewModel$triggerDeepLinkRequest$1$2", f = "TestProtobufDeepLinkingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1630b extends i implements q<j<? super Integer>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h80.c f82396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f82397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1630b(h80.c cVar, String str, t13.d<? super C1630b> dVar) {
            super(3, dVar);
            this.f82396a = cVar;
            this.f82397b = str;
        }

        @Override // e23.q
        public final Object invoke(j<? super Integer> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            return new C1630b(this.f82396a, this.f82397b, dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            bm2.d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            f.a().f152045a.getClass();
            ArrayList arrayListD = rd2.j.d();
            sd2.f fVar = arrayListD != null ? (sd2.f) h0.d0(arrayListD) : null;
            h80.c cVar = this.f82396a;
            com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a aVar2 = cVar.f82399a;
            if (fVar != null) {
                long unitID = fVar.getUnitID();
                String productNumber = fVar.getProductNumber();
                productNumber.getClass();
                int i14 = Integer.parseInt(productNumber);
                String strD0 = fVar.d0();
                if (strD0 == null) {
                    strD0 = "";
                }
                String strI = a0.i(fVar);
                String softwareVersion = fVar.getSoftwareVersion();
                dVar = new bm2.d(unitID, i14, strD0, strI, softwareVersion != null ? Integer.parseInt(softwareVersion) : 1, 1, new Configuration((Set<Integer>) a1.b(new Integer(0))));
            } else {
                dVar = null;
            }
            aVar2.getClass();
            String str = this.f82397b;
            str.getClass();
            aVar2.c(Uri.parse(str), dVar);
            cVar.f82400b.k(null, Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h80.c f82398a;

        public c(h80.c cVar) {
            this.f82398a = cVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object objB;
            int iIntValue = ((Number) obj).intValue();
            this.f82398a.f82402d.k(null, new Integer(iIntValue));
            return (iIntValue == 0 || (objB = m0.b(1000L, dVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z14, h80.c cVar, String str, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f82392b = z14;
        this.f82393c = cVar;
        this.f82394d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f82392b, this.f82393c, this.f82394d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f82391a;
        if (i14 == 0) {
            r.b(obj);
            Integer[] numArr = (Integer[]) (this.f82392b ? h0.b1(t.l(5, 0)) : w.c(new Integer(0))).toArray(new Integer[0]);
            l lVar = new l(Arrays.copyOf(numArr, numArr.length));
            h80.c cVar = this.f82393c;
            u uVar = new u(new v(new a(cVar, null), lVar), new C1630b(cVar, this.f82394d, null));
            c cVar2 = new c(cVar);
            this.f82391a = 1;
            if (uVar.collect(cVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
