package xc0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import org.greenrobot.eventbus.ThreadMode;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxc0/a;", "Lzw2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxw2/b;", "rtsDeviceRecord", "<init>", "(Landroid/content/Context;Lxw2/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends zw2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f189896e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2.b f189897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f189898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ax2.a f189899d;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"xc0/a$b", "Lku/b;", "Lku/a;", "textSpokenEvent", "", "textSpoken", "(Lku/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ku.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f189900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f189901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f189902c;

        public b() {
        }

        @Override // ku.b
        @l73.k(threadMode = ThreadMode.MAIN)
        public void textSpoken(ku.a textSpokenEvent) {
            textSpokenEvent.getClass();
            a.f189896e.debug("Audio Prompt Event received.");
            String str = textSpokenEvent.f106535a;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 147440860) {
                    if (iHashCode != 1245291027) {
                        if (iHashCode == 1331988336 && str.equals("TestAlertVolumeOperation.lap")) {
                            this.f189900a = true;
                        }
                    } else if (str.equals("TestAlertVolumeOperation.heart.rate")) {
                        this.f189902c = true;
                    }
                } else if (str.equals("TestAlertVolumeOperation.speed")) {
                    this.f189901b = true;
                }
            }
            if (this.f189900a && this.f189901b && this.f189902c) {
                this.f189900a = false;
                this.f189901b = false;
                this.f189902c = false;
                ax2.a aVar = a.this.f189899d;
                if (aVar != null) {
                    aVar.c(gw2.d.CUSTOM_ALERT_VOLUME);
                }
            }
        }
    }

    static {
        new C3534a(null);
        int i14 = gt2.c.f79010a;
        f189896e = gt2.b.f79005a.h("RTS-AlertVolumeTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, xw2.b bVar) {
        super(context);
        context.getClass();
        bVar.getClass();
        this.f189897b = bVar;
        this.f189898c = new b();
    }

    @Override // zw2.f
    public final void i(vw2.b bVar) {
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.f189898c);
    }

    @Override // zw2.f
    public final void j() {
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.f189898c);
    }

    @Override // zw2.h
    public final gw2.d k(ax2.a aVar) {
        return gw2.d.CUSTOM_ALERT_VOLUME;
    }

    @Override // zw2.h
    public final void l(Fragment fragment, ax2.a aVar) {
        fragment.getClass();
        f189896e.debug("Alert Volume Clicked.");
        this.f189899d = aVar;
        aVar.c(gw2.d.IN_PROGRESS);
    }

    @Override // zw2.a
    public final void m() {
        f189896e.debug("playAlertAudio:");
        hu.a aVarA = hu.a.f85684b.a();
        long j8 = this.f189897b.f192449a;
        aVarA.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new hu.c(j8, aVarA), null);
    }

    @Override // zw2.a
    public final void n(String str) {
        f189896e.debug("setAlertDialect: ".concat(str));
        com.garmin.android.apps.connectmobile.audioprompts.b.f30221d.getClass();
        com.garmin.android.apps.connectmobile.audioprompts.b bVarA = com.garmin.android.apps.connectmobile.audioprompts.b.a.a();
        long j8 = this.f189897b.f192449a;
        zb0.a.f203414e.getClass();
        zb0.a aVarA = zb0.a.C3799a.a(str);
        bVarA.getClass();
        bVarA.b(new bd0.d(bVarA, j8, aVarA, 4));
    }

    /* JADX INFO: renamed from: xc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxc0/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3534a {
        public /* synthetic */ C3534a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3534a() {
        }
    }
}
