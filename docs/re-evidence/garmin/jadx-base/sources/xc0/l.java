package xc0;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import c22.e1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lxc0/l;", "Lbx2/e;", "Lhj1/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "Lgj1/c;", "primaryDeviceReplaceDeviceInfo", "<init>", "(Landroid/content/Context;Lxw2/b;Lgj1/c;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends bx2.e implements hj1.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f189932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ew2.f f189933n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xw2.b f189934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gj1.c f189935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f189936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hj1.d f189937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f189938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f189939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f189940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ej1.a f189941l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSRemoveDeviceTransform$removeDevice$1", f = "RTSRemoveDeviceTransform.kt", l = {110, 120}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189942a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        
            if (r12.c(r1, r11) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f189942a;
            if (i14 == 0) {
                o13.r.b(obj);
                l80.a aVar2 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                this.f189942a = 1;
                obj = aVar2.v(true, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            l lVar = l.this;
            if (((List) obj).contains(new Long(lVar.f189936g))) {
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "DeviceDetails"), new o13.p("Type", "RemoveDeviceWithActiveSubscriptionAlert"), new o13.p("Action", "Remove"));
                aVar3.getClass();
                ht.a.a(bundleA, "UserAction");
                l80.a aVar4 = (l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null);
                long j8 = lVar.f189936g;
                this.f189942a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f189932m = gt2.b.f79005a.h("RTS-RemoveDeviceTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, xw2.b bVar, gj1.c cVar) {
        String strB;
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189934e = bVar;
        this.f189935f = cVar;
        long j8 = bVar.f192449a;
        this.f189936g = j8;
        this.f189937h = new hj1.d(context, j8, this, null, null, 24, null);
        this.f189938i = true;
        String string = context.getResources().getString(R.string.lbl_gear_remove_item_title, bVar.f192451c);
        string.getClass();
        this.f189939j = string;
        if (cVar == null || (strB = cVar.f77656e) == null) {
            hj1.b.f83993a.getClass();
            strB = hj1.b.a.b(context, false);
        }
        this.f189940k = strB;
        f12.l.f68084a.getClass();
        this.f189941l = new ej1.a(f12.l.a.a());
    }

    @Override // hj1.c
    public final void c(gj1.c cVar, boolean z14) {
        if (!z14) {
            o(cVar);
        } else {
            Context context = this.f207282a;
            Toast.makeText(context, context.getString(R.string.device_action_msg_remove_device_failure, null), 0).show();
        }
    }

    @Override // hj1.c
    public final void hideProgressOverlay() {
        ew2.e.f66901a.getClass();
        AlertDialog alertDialog = ew2.e.f66903c;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    @Override // bx2.e
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getF189940k() {
        return this.f189940k;
    }

    @Override // bx2.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getF21683b() {
        return this.f189939j;
    }

    @Override // bx2.e
    public final void n(ew2.f fVar) {
        f189933n = fVar;
        Logger logger = f189932m;
        logger.debug("performPreCheckAndRemove.");
        if (e1.a()) {
            gj1.c cVar = this.f189935f;
            if ((cVar != null ? cVar.f77653b : null) != null && cVar.f77652a != ej1.b.NONE) {
                this.f189937h.a(cVar);
                return;
            } else {
                logger.debug("No primary device priority, removing the device.");
                o(null);
                return;
            }
        }
        logger.error("Bluetooth is not enable, aborting remove device.");
        String string = this.f207282a.getString(R.string.txt_bluetooth_must_be_turned_on_for_action);
        string.getClass();
        ew2.f fVar2 = f189933n;
        if (fVar2 != null) {
            fVar2.a(string);
        } else {
            p005kotlin.jvm.internal.s.m("deviceRemovalOperationDelegate");
            throw null;
        }
    }

    public final void o(gj1.c cVar) {
        f189932m.debug("removeDevice");
        ew2.e.f66901a.getClass();
        Context context = this.f207282a;
        ew2.e.a.c(context);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(null), 3);
        xw2.b bVar = this.f189934e;
        String string = context.getString(R.string.device_action_msg_remove_device_success, bVar.f192451c);
        string.getClass();
        String string2 = context.getString(R.string.device_action_msg_remove_device_failure, bVar.f192451c);
        string2.getClass();
        ((lc0.k) KoinJavaComponent.get$default(lc0.k.class, null, null, 6, null)).a(this.f189936g, this.f189938i, new wv0.h(string2, this, string, cVar, 4), new u91.c(string2, 24));
    }

    @Override // hj1.c
    public final void showProgressOverlay() {
        ew2.e.f66901a.getClass();
        ew2.e.a.c(this.f207282a);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxc0/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "deviceRemovalOperationDelegate", "Ljava/lang/Object;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ l(Context context, xw2.b bVar, gj1.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, bVar, (i14 & 4) != 0 ? null : cVar);
    }
}
