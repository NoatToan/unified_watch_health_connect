package s00;

import android.content.Context;
import c22.f2;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.domain.reminders.NutritionRemindersUpdater;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Iterator;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import v01.o1;
import v01.s1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.SubscriptionCommonPushNotificationHandler$handleSubscriptionChangeNotification$1", f = "SubscriptionCommonPushNotificationHandler.kt", l = {143, 156, SyslogConstants.LOG_LOCAL4, SyslogConstants.LOG_LOCAL7, 194, 196, 202}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zd0.u f155361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c80.s f155362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f155364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f155365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f155366f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s00/n0$a", "Lht/t;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ht.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f155367a;

        public a(boolean z14) {
            String lowerCase = String.valueOf(z14).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.f155367a = lowerCase;
        }

        @Override // ht.t
        public final String a() {
            return "gcPlusSubscriber";
        }

        @Override // ht.t
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF28700a() {
            return this.f155367a;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"s00/n0$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<com.garmin.android.apps.connectmobile.userprofile.model.m> {
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            ((no1.b) KoinJavaComponent.get$default(no1.b.class, null, null, 6, null)).b();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, com.garmin.android.apps.connectmobile.userprofile.model.m mVar) {
            eVar.getClass();
            mVar.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f155366f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n0 n0Var = new n0(this.f155366f, dVar);
        n0Var.f155365e = obj;
        return n0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7 A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9 A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, PHI: r2 r5 r9
      0x00c9: PHI (r2v8 ??) = (r2v19 ??), (r2v20 ??), (r2v21 ??) binds: [B:48:0x00b5, B:50:0x00c5, B:23:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r5v6 c80.s) = (r5v4 c80.s), (r5v4 c80.s), (r5v8 c80.s) binds: [B:48:0x00b5, B:50:0x00c5, B:23:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r9v11 zd0.u) = (r9v9 zd0.u), (r9v9 zd0.u), (r9v12 zd0.u) binds: [B:48:0x00b5, B:50:0x00c5, B:23:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00df A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, PHI: r2 r3 r15
      0x015b: PHI (r2v12 ??) = (r2v15 ??), (r2v16 ??) binds: [B:66:0x0158, B:17:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r3v6 c80.s) = (r3v4 c80.s), (r3v7 c80.s) binds: [B:66:0x0158, B:17:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r15v26 java.lang.Object) = (r15v22 java.lang.Object), (r15v0 java.lang.Object) binds: [B:66:0x0158, B:17:0x0031] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163 A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0 A[Catch: Exception -> 0x0020, IllegalStateException -> 0x0023, TryCatch #2 {IllegalStateException -> 0x0023, Exception -> 0x0020, blocks: (B:7:0x001b, B:81:0x01bd, B:14:0x0028, B:74:0x0177, B:76:0x017f, B:17:0x0031, B:68:0x015b, B:70:0x0163, B:77:0x01a0, B:20:0x003c, B:62:0x012e, B:64:0x013c, B:65:0x0147, B:23:0x0047, B:52:0x00c9, B:53:0x00d9, B:55:0x00df, B:57:0x00f6, B:58:0x0101, B:26:0x0052, B:47:0x00b2, B:49:0x00b7, B:29:0x0058, B:35:0x0076, B:43:0x0087, B:38:0x007e, B:41:0x0083, B:82:0x01d9, B:83:0x01de, B:32:0x005f), top: B:88:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        zd0.u uVar;
        c80.s sVar;
        zd0.f fVar;
        zd0.u uVar2;
        ?? r14;
        c80.s sVar2;
        ?? r15;
        l80.b bVar;
        Iterator it;
        p92.o oVar;
        q92.x xVar;
        c80.s sVar3;
        zd0.u uVar3;
        b80.a aVar;
        ?? r16;
        ?? r17;
        o1 o1Var;
        Context context;
        c80.s sVar4;
        o53.b0 b0Var = (o53.b0) this.f155365e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        ?? r18 = 0;
        r18 = 0;
        try {
            switch (this.f155364d) {
                case 0:
                    o13.r.b(obj);
                    uVar = (zd0.u) KoinJavaComponent.get$default(zd0.u.class, null, null, 6, null);
                    this.f155365e = b0Var;
                    this.f155361a = uVar;
                    this.f155364d = 1;
                    obj = uVar.k(false, this);
                    if (obj != aVar2) {
                        sVar = (c80.s) obj;
                        if (sVar instanceof c80.s.a) {
                            r18 = 1;
                        } else if (!(sVar instanceof c80.s.b) && !(sVar instanceof c80.s.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ht.s sVar5 = ht.s.f85508a;
                        a aVar3 = new a(r18);
                        sVar5.getClass();
                        ht.s.c(aVar3);
                        fVar = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                        this.f155365e = b0Var;
                        this.f155361a = uVar;
                        this.f155362b = sVar;
                        this.f155363c = r18;
                        this.f155364d = 2;
                        if (fVar.d(this) == aVar2) {
                            uVar2 = uVar;
                            r14 = r18;
                            sVar2 = sVar;
                            r15 = r14;
                            if (sVar2 instanceof c80.s.c) {
                                r15 = r14;
                                bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                                it = bVar.w().iterator();
                                while (it.hasNext()) {
                                    String macAddress = ((DeviceProfile) it.next()).getMacAddress();
                                    macAddress.getClass();
                                    aVar = (b80.a) bVar.getCapability(macAddress, b80.a.class);
                                    if (aVar != null) {
                                        ge1.b.T(aVar.f16377b, null, null, new b80.b(aVar, null), 3);
                                    }
                                }
                                cw.q qVarN = cw.q.N();
                                b bVar2 = new b();
                                qVarN.getClass();
                                com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN), bVar2);
                                oVar = p92.o.f136619a;
                                xVar = q92.x.DI_CONNECT_AI;
                                this.f155365e = b0Var;
                                this.f155361a = uVar2;
                                this.f155362b = sVar2;
                                this.f155363c = r15;
                                this.f155364d = 4;
                                if (oVar.c(xVar, this) != aVar2) {
                                    sVar3 = sVar2;
                                    uVar3 = uVar2;
                                    r16 = r15;
                                    f12.l.f68084a.getClass();
                                    f12.l.a.a().T3(true);
                                    if (r16 == 0) {
                                        ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                                    }
                                    c80.q qVar = c80.q.NUTRITION;
                                    this.f155365e = b0Var;
                                    this.f155361a = null;
                                    this.f155362b = sVar3;
                                    this.f155363c = r16;
                                    this.f155364d = 5;
                                    obj = uVar3.l(qVar, this);
                                    r17 = r16;
                                    if (obj == aVar2) {
                                        if (((Boolean) obj).booleanValue()) {
                                            x01.i iVar = x01.i.f188278a;
                                            this.f155365e = b0Var;
                                            this.f155361a = null;
                                            this.f155362b = sVar3;
                                            this.f155363c = r17;
                                            this.f155364d = 6;
                                            obj = iVar.a(true, this);
                                            if (obj != aVar2) {
                                                sVar4 = sVar3;
                                                if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                                    a2 a2Var = a2.NUTRITION;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                                    new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                                }
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                                return Unit.INSTANCE;
                                            }
                                        } else {
                                            o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                                            context = this.f155366f;
                                            this.f155365e = b0Var;
                                            this.f155361a = null;
                                            this.f155362b = sVar3;
                                            this.f155363c = r17;
                                            this.f155364d = 7;
                                            if (o1Var.a(context, this) != aVar2) {
                                                sVar4 = sVar3;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f155365e = b0Var;
                                this.f155361a = uVar2;
                                this.f155362b = sVar2;
                                this.f155363c = r14;
                                this.f155364d = 3;
                                if (f2.a("SubscriptionCommonPushNotificationHandler", this) == aVar2) {
                                    r15 = r14;
                                } else {
                                    r15 = r14;
                                    bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                                    it = bVar.w().iterator();
                                    while (it.hasNext()) {
                                        String macAddress2 = ((DeviceProfile) it.next()).getMacAddress();
                                        macAddress2.getClass();
                                        aVar = (b80.a) bVar.getCapability(macAddress2, b80.a.class);
                                        if (aVar != null) {
                                            ge1.b.T(aVar.f16377b, null, null, new b80.b(aVar, null), 3);
                                        }
                                    }
                                    cw.q qVarN2 = cw.q.N();
                                    b bVar3 = new b();
                                    qVarN2.getClass();
                                    com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN2), bVar3);
                                    oVar = p92.o.f136619a;
                                    xVar = q92.x.DI_CONNECT_AI;
                                    this.f155365e = b0Var;
                                    this.f155361a = uVar2;
                                    this.f155362b = sVar2;
                                    this.f155363c = r15;
                                    this.f155364d = 4;
                                    if (oVar.c(xVar, this) != aVar2) {
                                        sVar3 = sVar2;
                                        uVar3 = uVar2;
                                        r16 = r15;
                                        f12.l.f68084a.getClass();
                                        f12.l.a.a().T3(true);
                                        if (r16 == 0) {
                                            ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                                        }
                                        c80.q qVar2 = c80.q.NUTRITION;
                                        this.f155365e = b0Var;
                                        this.f155361a = null;
                                        this.f155362b = sVar3;
                                        this.f155363c = r16;
                                        this.f155364d = 5;
                                        obj = uVar3.l(qVar2, this);
                                        r17 = r16;
                                        if (obj == aVar2) {
                                            if (((Boolean) obj).booleanValue()) {
                                                x01.i iVar2 = x01.i.f188278a;
                                                this.f155365e = b0Var;
                                                this.f155361a = null;
                                                this.f155362b = sVar3;
                                                this.f155363c = r17;
                                                this.f155364d = 6;
                                                obj = iVar2.a(true, this);
                                                if (obj != aVar2) {
                                                    sVar4 = sVar3;
                                                    if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                                        a2 a2Var2 = a2.NUTRITION;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var2, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                                        new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                                    }
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                                                context = this.f155366f;
                                                this.f155365e = b0Var;
                                                this.f155361a = null;
                                                this.f155362b = sVar3;
                                                this.f155363c = r17;
                                                this.f155364d = 7;
                                                if (o1Var.a(context, this) != aVar2) {
                                                    sVar4 = sVar3;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                case 1:
                    uVar = this.f155361a;
                    o13.r.b(obj);
                    sVar = (c80.s) obj;
                    if (sVar instanceof c80.s.a) {
                        r18 = 1;
                    } else if (!(sVar instanceof c80.s.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ht.s sVar6 = ht.s.f85508a;
                    a aVar4 = new a(r18);
                    sVar6.getClass();
                    ht.s.c(aVar4);
                    fVar = (zd0.f) KoinJavaComponent.get$default(zd0.f.class, null, null, 6, null);
                    this.f155365e = b0Var;
                    this.f155361a = uVar;
                    this.f155362b = sVar;
                    this.f155363c = r18;
                    this.f155364d = 2;
                    if (fVar.d(this) == aVar2) {
                        uVar2 = uVar;
                        r14 = r18;
                        sVar2 = sVar;
                        r15 = r14;
                        if (sVar2 instanceof c80.s.c) {
                            this.f155365e = b0Var;
                            this.f155361a = uVar2;
                            this.f155362b = sVar2;
                            this.f155363c = r14;
                            this.f155364d = 3;
                            if (f2.a("SubscriptionCommonPushNotificationHandler", this) == aVar2) {
                                r15 = r14;
                            } else {
                                r15 = r14;
                                bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                                it = bVar.w().iterator();
                                while (it.hasNext()) {
                                    String macAddress3 = ((DeviceProfile) it.next()).getMacAddress();
                                    macAddress3.getClass();
                                    aVar = (b80.a) bVar.getCapability(macAddress3, b80.a.class);
                                    if (aVar != null) {
                                        ge1.b.T(aVar.f16377b, null, null, new b80.b(aVar, null), 3);
                                    }
                                }
                                cw.q qVarN3 = cw.q.N();
                                b bVar4 = new b();
                                qVarN3.getClass();
                                com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN3), bVar4);
                                oVar = p92.o.f136619a;
                                xVar = q92.x.DI_CONNECT_AI;
                                this.f155365e = b0Var;
                                this.f155361a = uVar2;
                                this.f155362b = sVar2;
                                this.f155363c = r15;
                                this.f155364d = 4;
                                if (oVar.c(xVar, this) != aVar2) {
                                    sVar3 = sVar2;
                                    uVar3 = uVar2;
                                    r16 = r15;
                                    f12.l.f68084a.getClass();
                                    f12.l.a.a().T3(true);
                                    if (r16 == 0) {
                                        ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                                    }
                                    c80.q qVar3 = c80.q.NUTRITION;
                                    this.f155365e = b0Var;
                                    this.f155361a = null;
                                    this.f155362b = sVar3;
                                    this.f155363c = r16;
                                    this.f155364d = 5;
                                    obj = uVar3.l(qVar3, this);
                                    r17 = r16;
                                    if (obj == aVar2) {
                                        if (((Boolean) obj).booleanValue()) {
                                            x01.i iVar3 = x01.i.f188278a;
                                            this.f155365e = b0Var;
                                            this.f155361a = null;
                                            this.f155362b = sVar3;
                                            this.f155363c = r17;
                                            this.f155364d = 6;
                                            obj = iVar3.a(true, this);
                                            if (obj != aVar2) {
                                                sVar4 = sVar3;
                                                if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                                    a2 a2Var3 = a2.NUTRITION;
                                                    i2.f36769a.getClass();
                                                    i2.a.b(a2Var3, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                                    new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                                }
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                                return Unit.INSTANCE;
                                            }
                                        } else {
                                            o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                                            context = this.f155366f;
                                            this.f155365e = b0Var;
                                            this.f155361a = null;
                                            this.f155362b = sVar3;
                                            this.f155363c = r17;
                                            this.f155364d = 7;
                                            if (o1Var.a(context, this) != aVar2) {
                                                sVar4 = sVar3;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            r15 = r14;
                            bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                            it = bVar.w().iterator();
                            while (it.hasNext()) {
                                String macAddress4 = ((DeviceProfile) it.next()).getMacAddress();
                                macAddress4.getClass();
                                aVar = (b80.a) bVar.getCapability(macAddress4, b80.a.class);
                                if (aVar != null) {
                                    ge1.b.T(aVar.f16377b, null, null, new b80.b(aVar, null), 3);
                                }
                            }
                            cw.q qVarN4 = cw.q.N();
                            b bVar5 = new b();
                            qVarN4.getClass();
                            com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN4), bVar5);
                            oVar = p92.o.f136619a;
                            xVar = q92.x.DI_CONNECT_AI;
                            this.f155365e = b0Var;
                            this.f155361a = uVar2;
                            this.f155362b = sVar2;
                            this.f155363c = r15;
                            this.f155364d = 4;
                            if (oVar.c(xVar, this) != aVar2) {
                                sVar3 = sVar2;
                                uVar3 = uVar2;
                                r16 = r15;
                                f12.l.f68084a.getClass();
                                f12.l.a.a().T3(true);
                                if (r16 == 0) {
                                    ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                                }
                                c80.q qVar4 = c80.q.NUTRITION;
                                this.f155365e = b0Var;
                                this.f155361a = null;
                                this.f155362b = sVar3;
                                this.f155363c = r16;
                                this.f155364d = 5;
                                obj = uVar3.l(qVar4, this);
                                r17 = r16;
                                if (obj == aVar2) {
                                    if (((Boolean) obj).booleanValue()) {
                                        x01.i iVar4 = x01.i.f188278a;
                                        this.f155365e = b0Var;
                                        this.f155361a = null;
                                        this.f155362b = sVar3;
                                        this.f155363c = r17;
                                        this.f155364d = 6;
                                        obj = iVar4.a(true, this);
                                        if (obj != aVar2) {
                                            sVar4 = sVar3;
                                            if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                                a2 a2Var4 = a2.NUTRITION;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var4, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                                new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                            }
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                                        context = this.f155366f;
                                        this.f155365e = b0Var;
                                        this.f155361a = null;
                                        this.f155362b = sVar3;
                                        this.f155363c = r17;
                                        this.f155364d = 7;
                                        if (o1Var.a(context, this) != aVar2) {
                                            sVar4 = sVar3;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                case 2:
                    int i14 = this.f155363c;
                    sVar2 = this.f155362b;
                    uVar2 = this.f155361a;
                    o13.r.b(obj);
                    r14 = i14;
                    r15 = r14;
                    if (sVar2 instanceof c80.s.c) {
                        this.f155365e = b0Var;
                        this.f155361a = uVar2;
                        this.f155362b = sVar2;
                        this.f155363c = r14;
                        this.f155364d = 3;
                        if (f2.a("SubscriptionCommonPushNotificationHandler", this) == aVar2) {
                            r15 = r14;
                        } else {
                            r15 = r14;
                            bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                            it = bVar.w().iterator();
                            while (it.hasNext()) {
                                String macAddress5 = ((DeviceProfile) it.next()).getMacAddress();
                                macAddress5.getClass();
                                aVar = (b80.a) bVar.getCapability(macAddress5, b80.a.class);
                                if (aVar != null) {
                                    ge1.b.T(aVar.f16377b, null, null, new b80.b(aVar, null), 3);
                                }
                            }
                            cw.q qVarN5 = cw.q.N();
                            b bVar6 = new b();
                            qVarN5.getClass();
                            com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN5), bVar6);
                            oVar = p92.o.f136619a;
                            xVar = q92.x.DI_CONNECT_AI;
                            this.f155365e = b0Var;
                            this.f155361a = uVar2;
                            this.f155362b = sVar2;
                            this.f155363c = r15;
                            this.f155364d = 4;
                            if (oVar.c(xVar, this) != aVar2) {
                                sVar3 = sVar2;
                                uVar3 = uVar2;
                                r16 = r15;
                                f12.l.f68084a.getClass();
                                f12.l.a.a().T3(true);
                                if (r16 == 0) {
                                    ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                                }
                                c80.q qVar5 = c80.q.NUTRITION;
                                this.f155365e = b0Var;
                                this.f155361a = null;
                                this.f155362b = sVar3;
                                this.f155363c = r16;
                                this.f155364d = 5;
                                obj = uVar3.l(qVar5, this);
                                r17 = r16;
                                if (obj == aVar2) {
                                    if (((Boolean) obj).booleanValue()) {
                                        x01.i iVar5 = x01.i.f188278a;
                                        this.f155365e = b0Var;
                                        this.f155361a = null;
                                        this.f155362b = sVar3;
                                        this.f155363c = r17;
                                        this.f155364d = 6;
                                        obj = iVar5.a(true, this);
                                        if (obj != aVar2) {
                                            sVar4 = sVar3;
                                            if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                                a2 a2Var5 = a2.NUTRITION;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var5, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                                new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                            }
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                                        context = this.f155366f;
                                        this.f155365e = b0Var;
                                        this.f155361a = null;
                                        this.f155362b = sVar3;
                                        this.f155363c = r17;
                                        this.f155364d = 7;
                                        if (o1Var.a(context, this) != aVar2) {
                                            sVar4 = sVar3;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        r15 = r14;
                        bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                        it = bVar.w().iterator();
                        while (it.hasNext()) {
                            String macAddress6 = ((DeviceProfile) it.next()).getMacAddress();
                            macAddress6.getClass();
                            aVar = (b80.a) bVar.getCapability(macAddress6, b80.a.class);
                            if (aVar != null) {
                                ge1.b.T(aVar.f16377b, null, null, new b80.b(aVar, null), 3);
                            }
                        }
                        cw.q qVarN6 = cw.q.N();
                        b bVar7 = new b();
                        qVarN6.getClass();
                        com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN6), bVar7);
                        oVar = p92.o.f136619a;
                        xVar = q92.x.DI_CONNECT_AI;
                        this.f155365e = b0Var;
                        this.f155361a = uVar2;
                        this.f155362b = sVar2;
                        this.f155363c = r15;
                        this.f155364d = 4;
                        if (oVar.c(xVar, this) != aVar2) {
                            sVar3 = sVar2;
                            uVar3 = uVar2;
                            r16 = r15;
                            f12.l.f68084a.getClass();
                            f12.l.a.a().T3(true);
                            if (r16 == 0) {
                                ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                            }
                            c80.q qVar6 = c80.q.NUTRITION;
                            this.f155365e = b0Var;
                            this.f155361a = null;
                            this.f155362b = sVar3;
                            this.f155363c = r16;
                            this.f155364d = 5;
                            obj = uVar3.l(qVar6, this);
                            r17 = r16;
                            if (obj == aVar2) {
                                if (((Boolean) obj).booleanValue()) {
                                    x01.i iVar6 = x01.i.f188278a;
                                    this.f155365e = b0Var;
                                    this.f155361a = null;
                                    this.f155362b = sVar3;
                                    this.f155363c = r17;
                                    this.f155364d = 6;
                                    obj = iVar6.a(true, this);
                                    if (obj != aVar2) {
                                        sVar4 = sVar3;
                                        if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                            a2 a2Var6 = a2.NUTRITION;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var6, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                            new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                        }
                                        i2.f36769a.getClass();
                                        i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                                    context = this.f155366f;
                                    this.f155365e = b0Var;
                                    this.f155361a = null;
                                    this.f155362b = sVar3;
                                    this.f155363c = r17;
                                    this.f155364d = 7;
                                    if (o1Var.a(context, this) != aVar2) {
                                        sVar4 = sVar3;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                    return aVar2;
                case 3:
                    int i15 = this.f155363c;
                    sVar2 = this.f155362b;
                    uVar2 = this.f155361a;
                    o13.r.b(obj);
                    r15 = i15;
                    r15 = r14;
                    bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
                    it = bVar.w().iterator();
                    while (it.hasNext()) {
                        String macAddress7 = ((DeviceProfile) it.next()).getMacAddress();
                        macAddress7.getClass();
                        aVar = (b80.a) bVar.getCapability(macAddress7, b80.a.class);
                        if (aVar != null) {
                            ge1.b.T(aVar.f16377b, null, null, new b80.b(aVar, null), 3);
                        }
                    }
                    cw.q qVarN7 = cw.q.N();
                    b bVar8 = new b();
                    qVarN7.getClass();
                    com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN7), bVar8);
                    oVar = p92.o.f136619a;
                    xVar = q92.x.DI_CONNECT_AI;
                    this.f155365e = b0Var;
                    this.f155361a = uVar2;
                    this.f155362b = sVar2;
                    this.f155363c = r15;
                    this.f155364d = 4;
                    if (oVar.c(xVar, this) != aVar2) {
                        sVar3 = sVar2;
                        uVar3 = uVar2;
                        r16 = r15;
                        f12.l.f68084a.getClass();
                        f12.l.a.a().T3(true);
                        if (r16 == 0) {
                            ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                        }
                        c80.q qVar7 = c80.q.NUTRITION;
                        this.f155365e = b0Var;
                        this.f155361a = null;
                        this.f155362b = sVar3;
                        this.f155363c = r16;
                        this.f155364d = 5;
                        obj = uVar3.l(qVar7, this);
                        r17 = r16;
                        if (obj == aVar2) {
                            if (((Boolean) obj).booleanValue()) {
                                x01.i iVar7 = x01.i.f188278a;
                                this.f155365e = b0Var;
                                this.f155361a = null;
                                this.f155362b = sVar3;
                                this.f155363c = r17;
                                this.f155364d = 6;
                                obj = iVar7.a(true, this);
                                if (obj != aVar2) {
                                    sVar4 = sVar3;
                                    if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                        a2 a2Var7 = a2.NUTRITION;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var7, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                        new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                    }
                                    i2.f36769a.getClass();
                                    i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                    return Unit.INSTANCE;
                                }
                            } else {
                                o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                                context = this.f155366f;
                                this.f155365e = b0Var;
                                this.f155361a = null;
                                this.f155362b = sVar3;
                                this.f155363c = r17;
                                this.f155364d = 7;
                                if (o1Var.a(context, this) != aVar2) {
                                    sVar4 = sVar3;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return aVar2;
                case 4:
                    int i16 = this.f155363c;
                    sVar3 = this.f155362b;
                    uVar3 = this.f155361a;
                    o13.r.b(obj);
                    r16 = i16;
                    f12.l.f68084a.getClass();
                    f12.l.a.a().T3(true);
                    if (r16 == 0) {
                        ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).d();
                    }
                    c80.q qVar8 = c80.q.NUTRITION;
                    this.f155365e = b0Var;
                    this.f155361a = null;
                    this.f155362b = sVar3;
                    this.f155363c = r16;
                    this.f155364d = 5;
                    obj = uVar3.l(qVar8, this);
                    r17 = r16;
                    if (obj == aVar2) {
                        if (((Boolean) obj).booleanValue()) {
                            x01.i iVar8 = x01.i.f188278a;
                            this.f155365e = b0Var;
                            this.f155361a = null;
                            this.f155362b = sVar3;
                            this.f155363c = r17;
                            this.f155364d = 6;
                            obj = iVar8.a(true, this);
                            if (obj != aVar2) {
                                sVar4 = sVar3;
                                if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                    a2 a2Var8 = a2.NUTRITION;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var8, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                    new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                                }
                                i2.f36769a.getClass();
                                i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                return Unit.INSTANCE;
                            }
                        } else {
                            o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                            context = this.f155366f;
                            this.f155365e = b0Var;
                            this.f155361a = null;
                            this.f155362b = sVar3;
                            this.f155363c = r17;
                            this.f155364d = 7;
                            if (o1Var.a(context, this) != aVar2) {
                                sVar4 = sVar3;
                                i2.f36769a.getClass();
                                i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return aVar2;
                case 5:
                    int i17 = this.f155363c;
                    sVar3 = this.f155362b;
                    o13.r.b(obj);
                    r17 = i17;
                    if (((Boolean) obj).booleanValue()) {
                        x01.i iVar9 = x01.i.f188278a;
                        this.f155365e = b0Var;
                        this.f155361a = null;
                        this.f155362b = sVar3;
                        this.f155363c = r17;
                        this.f155364d = 6;
                        obj = iVar9.a(true, this);
                        if (obj != aVar2) {
                            sVar4 = sVar3;
                            if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                                a2 a2Var9 = a2.NUTRITION;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var9, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                                new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                            }
                            i2.f36769a.getClass();
                            i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                            return Unit.INSTANCE;
                        }
                    } else {
                        o1Var = (o1) KoinJavaComponent.get$default(o1.class, null, null, 6, null);
                        context = this.f155366f;
                        this.f155365e = b0Var;
                        this.f155361a = null;
                        this.f155362b = sVar3;
                        this.f155363c = r17;
                        this.f155364d = 7;
                        if (o1Var.a(context, this) != aVar2) {
                            sVar4 = sVar3;
                            i2.f36769a.getClass();
                            i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar2;
                case 6:
                    sVar4 = this.f155362b;
                    o13.r.b(obj);
                    if (((x01.e) obj).f188255d == x01.f.ACTIVE) {
                        a2 a2Var10 = a2.NUTRITION;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var10, "SubscriptionCommonPushNotificationHandler", "User resubscribed and user's nutrition data is active again. Update local reminders to match remote.");
                        new NutritionRemindersUpdater(((s1) KoinJavaComponent.get$default(s1.class, null, null, 6, null)).f174532a).c(nd1.c.NETWORK);
                    }
                    i2.f36769a.getClass();
                    i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                    return Unit.INSTANCE;
                case 7:
                    sVar4 = this.f155362b;
                    o13.r.b(obj);
                    i2.f36769a.getClass();
                    i2.a.b(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Refreshed subscriptions; subscription status = " + sVar4);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (IllegalStateException e4) {
            a2 a2Var11 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.g(a2Var11, "SubscriptionCommonPushNotificationHandler", e4);
        } catch (Exception e14) {
            a2 a2Var12 = a2.SUBSCRIPTIONS;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e14, "Unexpected error when fetching subscriptions: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var12, "SubscriptionCommonPushNotificationHandler", strD);
        }
    }
}
