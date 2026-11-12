package f90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lf90/d;", "", "Lf90/b;", "checkConsentUseCase", "Lf90/j;", "getRequiredConsentsUseCase", "<init>", "(Lf90/b;Lf90/j;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f69971a;

    static {
        new a(null);
    }

    public d(b bVar, j jVar) {
        bVar.getClass();
        jVar.getClass();
        this.f69971a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0069  */
    /* JADX WARN: Code duplicated, block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0084 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(q90.c r9, v13.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f90.e
            if (r0 == 0) goto L13
            r0 = r10
            f90.e r0 = (f90.e) r0
            int r1 = r0.f69979h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69979h = r1
            goto L18
        L13:
            f90.e r0 = new f90.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f69977f
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f69979h
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            int r9 = r0.f69976e
            int r2 = r0.f69975d
            int r4 = r0.f69974c
            java.util.Iterator r5 = r0.f69973b
            java.util.Collection r6 = r0.f69972a
            java.util.Collection r6 = (java.util.Collection) r6
            o13.r.b(r10)
            goto L87
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L3a:
            o13.r.b(r10)
            boolean r9 = r9.f143502j
            java.util.ArrayList r9 = f90.j.a(r9)
            com.garmin.android.apps.connectmobile.a2 r10 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP
            java.lang.String r2 = "Checking required consents for device setup flow "
            java.lang.String r2 = androidx.room.a0.k(r2, r9)
            com.garmin.android.apps.connectmobile.i2$a r4 = com.garmin.android.apps.connectmobile.i2.f36769a
            r4.getClass()
            java.lang.String r4 = "FetchRequiredConsentsDataUseCase"
            com.garmin.android.apps.connectmobile.i2.a.b(r10, r4, r2)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r5 = r9
            r6 = r10
            r9 = r2
            r4 = r9
        L63:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L8f
            java.lang.Object r10 = r5.next()
            q92.x r10 = (q92.x) r10
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            r0.f69972a = r7
            r0.f69973b = r5
            r0.f69974c = r4
            r0.f69975d = r2
            r0.f69976e = r9
            r0.f69979h = r3
            f90.b r7 = r8.f69971a
            java.io.Serializable r10 = r7.a(r10, r3, r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            o13.p r10 = (o13.p) r10
            if (r10 == 0) goto L63
            r6.add(r10)
            goto L63
        L8f:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f90.d.a(q90.c, v13.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf90/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
