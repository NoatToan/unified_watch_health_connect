package uy0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b$d;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetHomeSettingsItemsUseCase$invoke$2", f = "GetHomeSettingsItemsUseCase.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f173310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f173311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f173312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f173313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f173314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f173315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f173316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f173317h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173318a;

        static {
            int[] iArr = new int[ty0.g.values().length];
            try {
                iArr[ty0.g.GARMIN_CONNECT_PLUS_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.g.SLEEP_COACH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.g.GARMIN_COACH_PLANS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173318a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f173317h = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f173317h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b.d>> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:24:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:24:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005e -> B:24:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007c -> B:23:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0052
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r10.f173316g
            uy0.v r2 = r10.f173317h
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L1d
            int r1 = r10.f173315f
            int r4 = r10.f173314e
            java.lang.Object r5 = r10.f173313d
            java.util.Iterator r6 = r10.f173312c
            java.util.Collection r7 = r10.f173311b
            java.util.Collection r7 = (java.util.Collection) r7
            uy0.v r8 = r10.f173310a
            o13.r.b(r11)
            goto L7f
        L1d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r11)
            r11 = 0
            return r11
        L24:
            o13.r.b(r11)
            w13.c r11 = ty0.g.f166971q
            java.util.ArrayList r1 = n23.j.k(r11)
            p13.c$b r4 = new p13.c$b
            r4.<init>()
            r11 = 0
            r7 = r1
            r8 = r2
            r6 = r4
            r1 = r11
            r4 = r1
        L38:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L8b
            java.lang.Object r5 = r6.next()
            r11 = r5
            ty0.g r11 = (ty0.g) r11
            int[] r9 = uy0.u.a.f173318a
            int r11 = r11.ordinal()
            r11 = r9[r11]
            if (r11 == r3) goto L65
            r9 = 2
            if (r11 == r9) goto L5e
            r9 = 3
            if (r11 == r9) goto L57
            r11 = r3
            goto L85
        L57:
            n70.g r11 = r8.f173324a
            boolean r11 = r11.g()
            goto L85
        L5e:
            n70.g r11 = r8.f173324a
            boolean r11 = r11.E()
            goto L85
        L65:
            n70.g r11 = r8.f173324a
            r10.f173310a = r8
            r9 = r7
            java.util.Collection r9 = (java.util.Collection) r9
            r10.f173311b = r9
            r10.f173312c = r6
            r10.f173313d = r5
            r10.f173314e = r4
            r10.f173315f = r1
            r10.f173316g = r3
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r0) goto L7f
            return r0
        L7f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
        L85:
            if (r11 == 0) goto L38
            r7.add(r5)
            goto L38
        L8b:
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 10
            int r0 = p13.y.r(r7, r0)
            r11.<init>(r0)
            java.util.Iterator r0 = r7.iterator()
        L9c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r0.next()
            ty0.g r1 = (ty0.g) r1
            ty0.b r3 = r2.f173326c
            com.garmin.android.apps.connectmobile.navigation.more.b$d r4 = new com.garmin.android.apps.connectmobile.navigation.more.b$d
            r4.<init>(r3, r1)
            r11.add(r4)
            goto L9c
        Lb3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uy0.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
