package c30;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.GetWaypointsLocationNamesUseCase$invoke$1", f = "GetWaypointsLocationNamesUseCase.kt", l = {14, 18}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<r53.j<? super List<? extends String>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f23904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f23905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f23906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f23907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f23911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.library.mapsdkadapter.f> f23912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f23913j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(List<com.garmin.android.library.mapsdkadapter.f> list, j0 j0Var, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f23912i = list;
        this.f23913j = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i0 i0Var = new i0(this.f23912i, this.f23913j, dVar);
        i0Var.f23911h = obj;
        return i0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends String>> jVar, t13.d<? super Unit> dVar) {
        return ((i0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0076  */
    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:17:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f23911h
            r53.j r0 = (r53.j) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r13.f23910g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L16
            o13.r.b(r14)
            goto La9
        L16:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r14)
            r14 = 0
            return r14
        L1d:
            int r2 = r13.f23909f
            int r6 = r13.f23908e
            java.util.Collection r7 = r13.f23907d
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r8 = r13.f23906c
            java.util.Collection r9 = r13.f23905b
            java.util.Collection r9 = (java.util.Collection) r9
            c30.j0 r10 = r13.f23904a
            o13.r.b(r14)
            r12 = r8
            r8 = r7
            r7 = r9
            r9 = r12
            goto L78
        L35:
            o13.r.b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r2 = 10
            java.util.List<com.garmin.android.library.mapsdkadapter.f> r6 = r13.f23912i
            int r2 = p13.y.r(r6, r2)
            r14.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
            r6 = 0
            c30.j0 r7 = r13.f23913j
            r8 = r2
            r2 = r6
            r10 = r7
            r7 = r14
        L50:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L94
            java.lang.Object r14 = r8.next()
            com.garmin.android.library.mapsdkadapter.f r14 = (com.garmin.android.library.mapsdkadapter.f) r14
            r13.f23911h = r0
            r13.f23904a = r10
            r9 = r7
            java.util.Collection r9 = (java.util.Collection) r9
            r13.f23905b = r9
            r13.f23906c = r8
            r13.f23907d = r9
            r13.f23908e = r6
            r13.f23909f = r2
            r13.f23910g = r4
            java.lang.Object r14 = c30.j0.a(r10, r14, r13)
            if (r14 != r1) goto L76
            goto La8
        L76:
            r9 = r8
            r8 = r7
        L78:
            android.location.Address r14 = (android.location.Address) r14
            if (r14 == 0) goto L82
            java.lang.String r11 = r14.getThoroughfare()
            if (r11 != 0) goto L8f
        L82:
            if (r14 == 0) goto L8a
            java.lang.String r14 = r14.getLocality()
            r11 = r14
            goto L8b
        L8a:
            r11 = r5
        L8b:
            if (r11 != 0) goto L8f
            java.lang.String r11 = ""
        L8f:
            r8.add(r11)
            r8 = r9
            goto L50
        L94:
            java.util.List r7 = (java.util.List) r7
            r13.f23911h = r5
            r13.f23904a = r5
            r13.f23905b = r5
            r13.f23906c = r5
            r13.f23907d = r5
            r13.f23910g = r3
            java.lang.Object r14 = r0.emit(r7, r13)
            if (r14 != r1) goto La9
        La8:
            return r1
        La9:
            kotlin.Unit r14 = p005kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
