package vc0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import org.greenrobot.eventbus.ThreadMode;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvc0/a;", "Lei2/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ei2.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f176966f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f176967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f176968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public di2.a f176969e;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"vc0/a$b", "Lku/b;", "Lku/a;", "textSpokenEvent", "", "textSpoken", "(Lku/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ku.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f176970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f176971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f176972c;

        public b() {
        }

        @Override // ku.b
        @l73.k(threadMode = ThreadMode.MAIN)
        public void textSpoken(ku.a textSpokenEvent) {
            textSpokenEvent.getClass();
            a.f176966f.debug("Audio Prompt Event received.");
            String str = textSpokenEvent.f106535a;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 147440860) {
                    if (iHashCode != 1245291027) {
                        if (iHashCode == 1331988336 && str.equals("TestAlertVolumeOperation.lap")) {
                            this.f176970a = true;
                        }
                    } else if (str.equals("TestAlertVolumeOperation.heart.rate")) {
                        this.f176972c = true;
                    }
                } else if (str.equals("TestAlertVolumeOperation.speed")) {
                    this.f176971b = true;
                }
            }
            if (this.f176970a && this.f176971b && this.f176972c) {
                this.f176970a = false;
                this.f176971b = false;
                this.f176972c = false;
                di2.a aVar = a.this.f176969e;
                if (aVar != null) {
                    aVar.e(mh2.j.CUSTOM_ALERT_VOLUME);
                }
            }
        }
    }

    static {
        new C3311a(null);
        int i14 = gt2.c.f79010a;
        f176966f = gt2.b.f79005a.h("DSL-AlertVolumeTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f176967c = fVar;
        this.f176968d = new b();
    }

    @Override // ei2.h
    public final void o(zh2.b bVar) {
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.f176968d);
    }

    @Override // ei2.h
    public final void p() {
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.f176968d);
    }

    @Override // ei2.j
    public final mh2.j r(di2.a aVar) {
        return mh2.j.CUSTOM_ALERT_VOLUME;
    }

    @Override // ei2.j
    public final void s(Fragment fragment, di2.a aVar) {
        f176966f.debug("Alert Volume Clicked.");
        this.f176969e = aVar;
        aVar.e(mh2.j.IN_PROGRESS);
        hu.a aVarA = hu.a.f85684b.a();
        long unitID = this.f176967c.getUnitID();
        aVarA.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new hu.c(unitID, aVarA), null);
    }

    /* JADX INFO: renamed from: vc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvc0/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3311a {
        public /* synthetic */ C3311a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3311a() {
        }
    }
}
