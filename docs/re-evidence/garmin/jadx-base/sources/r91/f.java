package r91;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.domain.usecase.PRHistoryUseCase$acceptCurrentPRCandidate$1", f = "PRHistoryUseCase.kt", l = {132}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f151393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.f f151394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f151395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f151396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f151397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.repcounting.model.f f151398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l<n91.a, Unit> f151399g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((aa1.d) t14).f2252d), Long.valueOf(((aa1.d) t7).f2252d));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(k kVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, l<? super n91.a, Unit> lVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f151397e = kVar;
        this.f151398f = fVar;
        this.f151399g = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f151397e, this.f151398f, this.f151399g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        aa1.e value;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar;
        Object objD;
        k kVar;
        l lVar;
        z1<aa1.e> z1Var;
        aa1.e value2;
        aa1.e value3;
        aa1.e eVar;
        i53.c cVarE;
        Long l14;
        String str;
        String str2;
        String strB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151396d;
        k kVar2 = this.f151397e;
        if (i14 == 0) {
            r.b(obj);
            z1<aa1.e> z1Var2 = kVar2.f151431e;
            do {
                value = z1Var2.getValue();
            } while (!z1Var2.b(value, aa1.e.b(value, true, false, null, null, null, null, null, 2046)));
            n91.a aVar2 = kVar2.f151432f;
            if (aVar2 != null) {
                o91.a aVar3 = kVar2.f151428b;
                this.f151393a = kVar2;
                fVar = this.f151398f;
                this.f151394b = fVar;
                l<n91.a, Unit> lVar2 = this.f151399g;
                this.f151395c = lVar2;
                this.f151396d = 1;
                objD = aVar3.d(aVar2, this);
                if (objD == aVar) {
                    return aVar;
                }
                kVar = kVar2;
                lVar = lVar2;
            }
            z1Var = kVar2.f151431e;
            do {
                value2 = z1Var.getValue();
            } while (!z1Var.b(value2, aa1.e.b(value2, false, false, null, null, null, null, null, 2046)));
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = this.f151395c;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar2 = this.f151394b;
        kVar = this.f151393a;
        r.b(obj);
        fVar = fVar2;
        objD = obj;
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            z91.a aVar4 = z91.a.f203130a;
            T t7 = ((v2.b) v2Var).f47386a;
            n91.a aVar5 = (n91.a) t7;
            Context context = kVar.f151427a;
            aVar4.getClass();
            aa1.d dVarK = z91.a.k(aVar5, context, fVar);
            z1<aa1.e> z1Var3 = kVar.f151431e;
            do {
                value3 = z1Var3.getValue();
                eVar = value3;
                ArrayList arrayListD1 = h0.d1(h0.N0(eVar.f2269k, new a()));
                arrayListD1.add(0, dVarK);
                cVarE = i53.a.e(arrayListD1);
                l14 = aVar5.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                str = dVarK.f2253e;
                str2 = dVarK.f2254f;
                z91.a.f203130a.getClass();
                strB = z91.a.b(context, aVar5);
                if (strB == null) {
                    strB = "";
                }
            } while (!z1Var3.b(value3, aa1.e.b(eVar, false, false, l14, str, str2, strB, cVarE, 31)));
            kVar.f151430d.b(new p22.a(context.getString(R.string.lbl_personal_records_updated_message), null, null, 6, null));
            lVar.invoke(t7);
        } else {
            kVar.f151430d.a();
        }
        z1Var = kVar2.f151431e;
        do {
            value2 = z1Var.getValue();
        } while (!z1Var.b(value2, aa1.e.b(value2, false, false, null, null, null, null, null, 2046)));
        return Unit.INSTANCE;
    }
}
