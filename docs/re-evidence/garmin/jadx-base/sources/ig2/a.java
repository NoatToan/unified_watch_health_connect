package ig2;

import android.content.Intent;
import android.os.Bundle;
import c62.f2;
import e23.l;
import id0.q4;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lig2/a;", "Lig2/b;", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f93432c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f93433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93434b;

    static {
        new C1786a(null);
    }

    public a(Intent intent) {
        intent.getClass();
        this.f93433a = intent;
        this.f93434b = new ArrayList();
    }

    @Override // ig2.b
    public final void a(Long l14) {
        this.f93434b.add(new f2(1, l14));
    }

    @Override // ig2.b
    public final boolean b() {
        Bundle extras = this.f93433a.getExtras();
        if (extras != null) {
            return extras.getBoolean("extra_manual_start");
        }
        return false;
    }

    @Override // ig2.b
    public final void c() {
        this.f93434b.add(new q4(24));
    }

    @Override // ig2.b
    public final <T> T d(l<? super Intent, ? extends T> lVar) {
        return lVar.invoke(this.f93433a);
    }

    @Override // ig2.b
    public final void e() {
        Iterator it = this.f93434b.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(this.f93433a);
        }
    }

    @Override // ig2.b
    public final void f(l<? super Intent, Unit> lVar) {
        this.f93434b.add(lVar);
    }

    @Override // ig2.b
    public final Long getDeviceUnitId() {
        Bundle extras = this.f93433a.getExtras();
        if (extras != null) {
            return Long.valueOf(extras.getLong("extra_device_unit_id"));
        }
        return null;
    }

    /* JADX INFO: renamed from: ig2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lig2/a$a;", "", "<init>", "()V", "", "EXTRA_MANUAL_START", "Ljava/lang/String;", "EXTRA_DEVICE_UNIT_ID", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1786a {
        public /* synthetic */ C1786a(j jVar) {
            this();
        }

        private C1786a() {
        }
    }
}
