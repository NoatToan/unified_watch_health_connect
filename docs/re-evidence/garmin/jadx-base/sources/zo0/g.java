package zo0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzo0/g;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f206137d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f206138e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ec0.f f206140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ec0.h f206141c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.BLEUpgradeDialogHandler", f = "BLEUpgradeDialogHandler.kt", l = {45}, m = "requestDialogData", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f206142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f206143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f206144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f206145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f206146e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f206148g;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f206146e = obj;
            this.f206148g |= Integer.MIN_VALUE;
            return g.this.c(this);
        }
    }

    public g(q qVar) {
        qVar.getClass();
        this.f206139a = qVar;
        ec0.f fVar = (ec0.f) KoinJavaComponent.get$default(ec0.f.class, null, null, 6, null);
        this.f206140b = fVar;
        this.f206141c = fVar.a();
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BLEUpgradeDialogHandler", "createDialog");
        if (!(nVar instanceof n.c)) {
            return null;
        }
        m0.a aVar2 = m0.f149759e;
        q qVar = this.f206139a;
        return m0.a.d(aVar2, R.drawable.ic_enabled_bluetooth, qVar.u5().getString(R.string.upgrade_bluetooth_connection_title), qVar.u5().getString(R.string.upgrade_bluetooth_connection_message), R.string.wallet_get_started, new wv2.h(23, this, nVar), R.string.common_button_not_now, new f(this, 0), null, 1920);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x013e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x016f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x020b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x020c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0217  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x020c -> B:59:0x020e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // zo0.p
    public final java.lang.Object c(t13.d<? super zo0.n> r24) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zo0.g.c(t13.d):java.lang.Object");
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        f206138e.set(true);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
