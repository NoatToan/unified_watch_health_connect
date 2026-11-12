package no2;

import ch.qos.logback.core.net.SyslogConstants;
import d53.w;
import e23.p;
import j23.l;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lul2/c;", "transfer", "Lfo2/h;", "<anonymous>", "(Lul2/c;)Lfo2/h;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.executor.BeijingTUnionCardOperationExecutor$getExpirationDate$2", f = "BeijingTUnionCardOperationExecutor.kt", l = {175, SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<ul2.c, t13.d<? super fo2.h>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f126768c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f126768c, dVar);
        fVar.f126767b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(ul2.c cVar, t13.d<? super fo2.h> dVar) {
        return ((f) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ul2.c cVar = (ul2.c) this.f126767b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126766a;
        a aVar2 = this.f126768c;
        if (i14 == 0) {
            r.b(obj);
            byte[] bArr = a.f126726c;
            bArr.getClass();
            this.f126767b = cVar;
            this.f126766a = 1;
            if (a.g(aVar2, cVar, bArr, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        String strB = hb2.d.b((byte[]) obj);
        strB.getClass();
        String strB0 = w.b0(strB, new l(0, 7));
        String strB1 = w.b0(strB, new l(8, 15));
        a.C2438a c2438a = a.f126725b;
        LocalDate localDate = a.C2438a.a(c2438a).parseLocalDate(strB0);
        localDate.getClass();
        LocalDate localDate2 = a.C2438a.a(c2438a).parseLocalDate(strB1);
        localDate2.getClass();
        return new fo2.h(localDate, localDate2);
        a.f126725b.getClass();
        byte[] bArr2 = a.f126732i;
        bArr2.getClass();
        this.f126767b = null;
        this.f126766a = 2;
        obj = a.f(aVar2, cVar, bArr2, this);
    }
}
