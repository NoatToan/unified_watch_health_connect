package n71;

import c53.l;
import e23.p;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc53/l;", "Lorg/joda/time/LocalDate;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.util.LocalDateUtilKt$datesIn$1", f = "LocalDateUtil.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class b extends v13.h implements p<l<? super LocalDate>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f124826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f124827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j23.g<LocalDate> f124829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p<LocalDate, Integer, LocalDate> f124830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(j23.g<LocalDate> gVar, p<? super LocalDate, ? super Integer, LocalDate> pVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f124829d = gVar;
        this.f124830e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f124829d, this.f124830e, dVar);
        bVar.f124828c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(l<? super LocalDate> lVar, t13.d<? super Unit> dVar) {
        return ((b) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0038 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f124828c
            c53.l r0 = (c53.l) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r6.f124827b
            j23.g<org.joda.time.LocalDate> r3 = r6.f124829d
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L15
            org.joda.time.LocalDate r2 = r6.f124826a
            o13.r.b(r7)
            goto L39
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L1c:
            o13.r.b(r7)
            java.lang.Comparable r7 = r3.getStart()
            org.joda.time.LocalDate r7 = (org.joda.time.LocalDate) r7
            r2 = r7
        L26:
            boolean r7 = r3.contains(r2)
            if (r7 == 0) goto L48
            r6.f124828c = r0
            r6.f124826a = r2
            r6.f124827b = r4
            u13.a r7 = r0.a(r2, r6)
            if (r7 != r1) goto L39
            return r1
        L39:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r4)
            e23.p<org.joda.time.LocalDate, java.lang.Integer, org.joda.time.LocalDate> r5 = r6.f124830e
            java.lang.Object r7 = r5.invoke(r2, r7)
            r2 = r7
            org.joda.time.LocalDate r2 = (org.joda.time.LocalDate) r2
            goto L26
        L48:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n71.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
