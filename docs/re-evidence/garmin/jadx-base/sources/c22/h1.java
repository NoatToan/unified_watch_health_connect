package c22;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lc22/h1;", "Lc22/d2;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitInstallManager f23067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23068b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements SplitInstallStateUpdatedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.p0 f23069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<Boolean, String, Unit> f23070b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p005kotlin.jvm.internal.p0 p0Var, e23.p<? super Boolean, ? super String, Unit> pVar) {
            this.f23069a = p0Var;
            this.f23070b = pVar;
        }

        @Override // com.google.android.play.core.listener.StateUpdatedListener
        public final void onStateUpdate(SplitInstallSessionState splitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState2 = splitInstallSessionState;
            splitInstallSessionState2.getClass();
            if (splitInstallSessionState2.sessionId() == this.f23069a.f105807a) {
                com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                String str = "OnDemandResources onUpdate state: " + splitInstallSessionState2.status();
                aVar.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(a2Var, str);
                int iStatus = splitInstallSessionState2.status();
                e23.p<Boolean, String, Unit> pVar = this.f23070b;
                switch (iStatus) {
                    case 0:
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "OnDemandResources install status is UNKNOWN.");
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "OnDemandResources install is PENDING.");
                        break;
                    case 2:
                        long j8 = splitInstallSessionState2.totalBytesToDownload();
                        long jBytesDownloaded = splitInstallSessionState2.bytesDownloaded();
                        StringBuilder sbK = ds.e0.k(j8 > 0 ? (((long) 100) * jBytesDownloaded) / j8 : 0L, "OnDemandResources downloading: ", "% (");
                        sbK.append(jBytesDownloaded);
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, com.nimbusds.jose.shaded.gson.internal.a.g(j8, "/", " bytes)", sbK));
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "OnDemandResources install is DOWNLOADED.");
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "OnDemandResources install is INSTALLING.");
                        break;
                    case 5:
                        pVar.invoke(Boolean.TRUE, "Listener received INSTALLED status.");
                        break;
                    case 6:
                        pVar.invoke(Boolean.FALSE, "Listener received FAILED status with error: " + splitInstallSessionState2.errorCode());
                        break;
                    case 7:
                        pVar.invoke(Boolean.FALSE, "Listener received CANCELED status.");
                        break;
                    case 8:
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "OnDemandResources install REQUIRES_USER_CONFIRMATION.");
                        break;
                    case 9:
                        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "OnDemandResources install is CANCELING.");
                        break;
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<Boolean, String, Unit> f23071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.p0 f23072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h1 f23073c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.p<? super Boolean, ? super String, Unit> pVar, p005kotlin.jvm.internal.p0 p0Var, h1 h1Var) {
            this.f23071a = pVar;
            this.f23072b = p0Var;
            this.f23073c = h1Var;
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            e23.p<Boolean, String, Unit> pVar = this.f23071a;
            if (num2 != null && num2.intValue() == 0) {
                pVar.invoke(Boolean.TRUE, "Module is already installed (sessionId is 0).");
            } else {
                num2.getClass();
                this.f23072b.f105807a = num2.intValue();
                com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                aVar.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.GENERAL, "OnDemandResources install started with session ID: " + num2);
                this.f23073c.f23067a.getSessionState(num2.intValue()).addOnSuccessListener(new g(new i1(pVar))).addOnFailureListener(new j1(pVar));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<Boolean, String, Unit> f23074a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(e23.p<? super Boolean, ? super String, Unit> pVar) {
            this.f23074a = pVar;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            exc.getClass();
            this.f23074a.invoke(Boolean.FALSE, "The startInstall command failed: " + exc.getMessage());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements OnCanceledListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<Boolean, String, Unit> f23075a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(e23.p<? super Boolean, ? super String, Unit> pVar) {
            this.f23075a = pVar;
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.f23075a.invoke(Boolean.FALSE, "The startInstall command was canceled.");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.p<Boolean, String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f23076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<SplitInstallStateUpdatedListener> f23077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.j<Boolean> f23078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h1 f23079d;

        /* JADX WARN: Multi-variable type inference failed */
        public f(AtomicBoolean atomicBoolean, p005kotlin.jvm.internal.r0<SplitInstallStateUpdatedListener> r0Var, o53.j<? super Boolean> jVar, h1 h1Var) {
            this.f23076a = atomicBoolean;
            this.f23077b = r0Var;
            this.f23078c = jVar;
            this.f23079d = h1Var;
        }

        @Override // e23.p
        public final Unit invoke(Boolean bool, String str) {
            Boolean bool2 = bool;
            boolean zBooleanValue = bool2.booleanValue();
            String str2 = str;
            str2.getClass();
            if (this.f23076a.compareAndSet(false, true)) {
                if (zBooleanValue) {
                    com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    String strConcat = "OnDemandResources install successful. Reason: ".concat(str2);
                    aVar.getClass();
                    a2Var.getClass();
                    gt2.c.b(a2Var.f28756a).info(strConcat);
                    f2.b();
                } else {
                    com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    String strConcat2 = "OnDemandResources install failed. Reason: ".concat(str2);
                    aVar2.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.e(a2Var2, strConcat2);
                }
                SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = this.f23077b.f105810a;
                if (splitInstallStateUpdatedListener != null) {
                    new Handler(Looper.getMainLooper()).post(new k1(this.f23079d, splitInstallStateUpdatedListener));
                }
                o53.j<Boolean> jVar = this.f23078c;
                if (jVar.isActive()) {
                    int i14 = o13.q.f128596b;
                    jVar.resumeWith(bool2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f23080a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f23080a = lVar;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f23080a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public h1(Context context) {
        context.getClass();
        SplitInstallManager splitInstallManagerCreate = SplitInstallManagerFactory.create(context);
        splitInstallManagerCreate.getClass();
        this.f23067a = splitInstallManagerCreate;
        this.f23068b = true;
    }

    @Override // c22.d2
    public final boolean a(u0 u0Var) {
        u0Var.getClass();
        return this.f23067a.getInstalledModules().contains("gcm_on_demand_resources");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, c22.h1$b, com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c22.d2
    public final Object b(u0 u0Var, t13.d<? super Boolean> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "OnDemandResources installOnDemandResources");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        f fVar = new f(atomicBoolean, r0Var, kVar, this);
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        ?? bVar = new b(p0Var, fVar);
        r0Var.f105810a = bVar;
        SplitInstallManager splitInstallManager = this.f23067a;
        splitInstallManager.registerListener(bVar);
        SplitInstallRequest splitInstallRequestBuild = SplitInstallRequest.newBuilder().addModule("gcm_on_demand_resources").build();
        splitInstallRequestBuild.getClass();
        splitInstallManager.startInstall(splitInstallRequestBuild).addOnSuccessListener(new g(new c(fVar, p0Var, this))).addOnFailureListener(new d(fVar)).addOnCanceledListener(new e(fVar));
        Object objP = kVar.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    @Override // c22.d2
    public final Object c(v13.i iVar) {
        return Unit.INSTANCE;
    }

    @Override // c22.d2
    /* JADX INFO: renamed from: isInitialized, reason: from getter */
    public final boolean getF23068b() {
        return this.f23068b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc22/h1$a;", "", "<init>", "()V", "", "ON_DEMAND_RESOURCES_MODULE", "Ljava/lang/String;", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
