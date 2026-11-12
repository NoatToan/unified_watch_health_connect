package s80;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import o53.c0;
import o53.s0;
import o53.z;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import rd2.j;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ls80/g;", "Ly92/a;", "Landroid/content/Context;", "applicationContext", "Ls80/c;", "deviceIncorrectPasscodeStatus", "Lda2/i;", "connectedDeviceRegistry", "Lo53/z;", "ioDispatcher", "<init>", "(Landroid/content/Context;Ls80/c;Lda2/i;Lo53/z;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements y92.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f157924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da2.i f157925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f157926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f157927e;

    static {
        new a(null);
    }

    public g(Context context, c cVar, da2.i iVar, z zVar) {
        context.getClass();
        cVar.getClass();
        iVar.getClass();
        zVar.getClass();
        this.f157923a = context;
        this.f157924b = cVar;
        this.f157925c = iVar;
        this.f157926d = zVar;
        this.f157927e = c0.a(t13.g.a.C3052a.d(zVar, g8.i.c()));
    }

    @Override // y92.a
    public final void a(long j8) {
        this.f157924b.a(j8);
    }

    @Override // y92.a
    public final void b(long j8) {
        this.f157924b.d(j8);
    }

    @Override // y92.a
    public final void c(long j8, y92.e eVar) {
        eVar.getClass();
        this.f157924b.d(j8);
        if (eVar == y92.e.GARMIN_PAY) {
            ge1.b.T(this.f157927e, null, null, new h(j8, eVar, this, null), 3);
        }
    }

    @Override // y92.a
    public final void d(long j8) {
        this.f157924b.b(j8);
    }

    @Override // y92.a
    public final void e(long j8) {
        PendingIntent pendingIntentC = ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).C(j8);
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = j.i(j8, null);
        String productDisplayName = fVarI != null ? fVarI.getProductDisplayName() : null;
        Context context = this.f157923a;
        String string = (productDisplayName == null || productDisplayName.length() == 0) ? context.getString(R.string.msg_passcode_reset) : context.getString(R.string.lbl_reset_passcode_notification_description, productDisplayName);
        string.getClass();
        this.f157924b.d(j8);
        sz0.e eVar = sz0.e.f161377p;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(context.getString(R.string.lbl_passcode_reset));
        qVar.f202684f = q.e(string);
        o oVar = new o();
        oVar.f202664e = q.e(string);
        qVar.l(oVar);
        qVar.f202686h = pendingIntentC;
        qVar.i(16, true);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context, notificationC, 40, eVar);
    }

    @Override // y92.a
    public final void f(int i14, long j8) {
        this.f157924b.g(i14, j8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls80/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context, c cVar, da2.i iVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(context, cVar, iVar, zVar);
    }
}
