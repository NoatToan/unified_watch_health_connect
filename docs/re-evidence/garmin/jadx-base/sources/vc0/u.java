package vc0;

import android.content.Context;
import android.widget.Toast;
import c22.e1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvc0/u;", "Lgi2/e;", "Lhj1/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "Lgj1/c;", "primaryDevice", "<init>", "(Landroid/content/Context;Lsd2/f;Lgj1/c;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends gi2.e implements hj1.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f177013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static kh2.j f177014m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd2.f f177015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gj1.c f177016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f177017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hj1.d f177018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f177019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f177020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f177021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ej1.a f177022k;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f177013l = gt2.b.f79005a.h("DSL-RemoveDeviceTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, sd2.f fVar, gj1.c cVar) {
        String strB;
        super(context);
        context.getClass();
        fVar.getClass();
        this.f177015d = fVar;
        this.f177016e = cVar;
        long unitID = fVar.getUnitID();
        this.f177017f = unitID;
        this.f177018g = new hj1.d(context, unitID, this, null, null, 24, null);
        this.f177019h = true;
        String string = context.getResources().getString(R.string.lbl_gear_remove_item_title, fVar.getDisplayName());
        string.getClass();
        this.f177020i = string;
        if (cVar == null || (strB = cVar.f77656e) == null) {
            hj1.b.f83993a.getClass();
            strB = hj1.b.a.b(context, false);
        }
        this.f177021j = strB;
        f12.l.f68084a.getClass();
        this.f177022k = new ej1.a(f12.l.a.a());
    }

    @Override // hj1.c
    public final void c(gj1.c cVar, boolean z14) {
        if (!z14) {
            v(cVar);
            return;
        }
        Object[] objArr = {this.f177015d.getDisplayName()};
        Context context = this.f64388a;
        Toast.makeText(context, context.getString(R.string.device_action_msg_remove_device_failure, objArr), 0).show();
    }

    @Override // hj1.c
    public final void hideProgressOverlay() {
        kh2.g.f104792a.getClass();
        kh2.g.a.b();
    }

    @Override // gi2.e
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getF177021j() {
        return this.f177021j;
    }

    @Override // hj1.c
    public final void showProgressOverlay() {
        kh2.g.f104792a.getClass();
        kh2.g.a.e(this.f64388a);
    }

    @Override // gi2.e
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getF77486c() {
        return this.f177020i;
    }

    @Override // gi2.e
    public final void u(kh2.j jVar) {
        f177014m = jVar;
        Logger logger = f177013l;
        logger.debug("performPreCheckAndRemove.");
        if (e1.a()) {
            gj1.c cVar = this.f177016e;
            if ((cVar != null ? cVar.f77653b : null) == null || cVar.f77652a == ej1.b.NONE) {
                v(null);
                return;
            } else {
                this.f177018g.a(cVar);
                return;
            }
        }
        logger.error("Bluetooth is not enable, aborting remove device.");
        String string = this.f64388a.getString(R.string.txt_bluetooth_must_be_turned_on_for_action);
        string.getClass();
        kh2.j jVar2 = f177014m;
        if (jVar2 != null) {
            jVar2.a(string);
        } else {
            p005kotlin.jvm.internal.s.m("deviceRemovalOperationDelegate");
            throw null;
        }
    }

    public final void v(gj1.c cVar) {
        f177013l.debug("removeDevice");
        sd2.f fVar = this.f177015d;
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = fVar.getProductDisplayName();
            displayName.getClass();
        }
        kh2.g.f104792a.getClass();
        Context context = this.f64388a;
        kh2.g.a.e(context);
        String string = context.getString(R.string.device_action_msg_remove_device_success, displayName);
        string.getClass();
        String string2 = context.getString(R.string.device_action_msg_remove_device_failure, fVar.getDisplayName());
        string2.getClass();
        ((lc0.k) KoinJavaComponent.get$default(lc0.k.class, null, null, 6, null)).a(this.f177017f, this.f177019h, new t42.l(string2, this, string, cVar, 9), new u91.c(string2, 11));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "deviceRemovalOperationDelegate", "Ljava/lang/Object;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ u(Context context, sd2.f fVar, gj1.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, fVar, (i14 & 4) != 0 ? null : cVar);
    }
}
