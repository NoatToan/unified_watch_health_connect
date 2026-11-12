package kl0;

import com.garmin.proto.generated.GDIInternationalGolf;
import e23.p;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsViewModel$downloadGolfCourse$1", f = "GolfCourseDetailsViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDIInternationalGolf.MapType[] f105244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f105245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f105248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ il0.a f105249f;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f105250a = w13.b.g(GDIInternationalGolf.MapType.values());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, il0.a aVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f105248e = dVar;
        this.f105249f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f105248e, this.f105249f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0058 A[RETURN] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0054
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r11.f105247d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            int r1 = r11.f105246c
            int r3 = r11.f105245b
            com.garmin.proto.generated.GDIInternationalGolf$MapType[] r4 = r11.f105244a
            o13.r.b(r12)
            goto L59
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r12)
            r12 = 0
            return r12
        L1a:
            o13.r.b(r12)
            w13.c r12 = kl0.e.a.f105250a
            r1 = 0
            com.garmin.proto.generated.GDIInternationalGolf$MapType[] r3 = new com.garmin.proto.generated.GDIInternationalGolf.MapType[r1]
            r12.getClass()
            java.lang.Object[] r12 = p005kotlin.jvm.internal.i.d(r12, r3)
            com.garmin.proto.generated.GDIInternationalGolf$MapType[] r12 = (com.garmin.proto.generated.GDIInternationalGolf.MapType[]) r12
            int r3 = r12.length
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r12
        L30:
            if (r3 >= r1) goto L5b
            r8 = r4[r3]
            kl0.d r12 = r11.f105248e
            hl0.u r7 = r12.f105236b
            r11.f105244a = r4
            r11.f105245b = r3
            r11.f105246c = r1
            r11.f105247d = r2
            o53.z r12 = r7.f84340d
            hl0.v r5 = new hl0.v
            r10 = 0
            il0.a r6 = r11.f105249f
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = ge1.b.e0(r12, r5, r11)
            u13.a r5 = u13.a.COROUTINE_SUSPENDED
            if (r12 != r5) goto L54
            goto L56
        L54:
            kotlin.Unit r12 = p005kotlin.Unit.INSTANCE
        L56:
            if (r12 != r0) goto L59
            return r0
        L59:
            int r3 = r3 + r2
            goto L30
        L5b:
            kotlin.Unit r12 = p005kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kl0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
