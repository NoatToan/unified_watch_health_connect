package jd1;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import fw.p;
import i3.f2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ljd1/a;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljd1/f$b;", "Ltd1/b$b;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends com.garmin.android.apps.connectmobile.c implements f.b, td1.b.InterfaceC3083b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f98392c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f98393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f98394b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98395a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f98395a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f98396a;

        public c(b.g gVar) {
            this.f98396a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f98396a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f98397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f98398b;

        public d(e23.a aVar, b.g gVar) {
            this.f98397a = aVar;
            this.f98398b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f98397a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f98398b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new C1885a(null);
    }

    public a() {
        int i14 = gt2.c.f79010a;
        this.f98393a = gt2.b.f79005a.h("RemindersActivity");
        this.f98394b = new w1(s0.f105811a.b(h.class), new c(this), new f2(this, 20), new d(null, this));
    }

    @Override // td1.b.InterfaceC3083b
    public final void G6(pd1.b bVar) {
        ((h) this.f98394b.getValue()).y4(bVar);
        getSupportFragmentManager().Z();
    }

    @Override // jd1.f.b
    public final void b0() {
        this.f98393a.debug("addNewReminderPressed: starting NewPregnancyReminderFragment");
        td1.b bVarHa = ha(null);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, bVarHa, null);
        aVar.d("NewPregnancyReminderFragment");
        aVar.e();
    }

    public void ca(pd1.b bVar) {
    }

    public pd1.c da() {
        return null;
    }

    public abstract String ea();

    public abstract pd1.a fa();

    public abstract f ga();

    public abstract td1.b ha(pd1.b bVar);

    public vd1.d ia(pd1.b bVar) {
        bVar.getClass();
        return null;
    }

    @Override // jd1.f.b
    public final void k2(pd1.b bVar) {
        this.f98393a.debug("editReminderPressed: starting NewPregnancyReminderFragment with existing reminder " + bVar.getUserReminderId());
        td1.b bVarHa = ha(bVar);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, bVarHa, null);
        aVar.d("NewPregnancyReminderFragment");
        aVar.e();
    }

    @Override // td1.b.InterfaceC3083b
    public final void k5(pd1.b bVar) {
        bVar.getClass();
        this.f98393a.debug("editTimesPressed: ");
        vd1.d dVarIa = ia(bVar);
        if (dVarIa != null) {
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.l(R.id.content_frame, dVarIa, null);
            aVar.d("PregnancyReminderTimesFragment");
            aVar.e();
        }
    }

    @Override // td1.b.InterfaceC3083b
    public final void m3(pd1.b bVar) {
        ca(bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        initActionBar(ea(), 2);
        ((h) this.f98394b.getValue()).f98450h.f(this, new iz1.g(this, 5));
        f fVarGa = ga();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, fVarGa, null);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        Logger logger = this.f98393a;
        if (itemId != 16908332) {
            logger.debug("onOptionsItemSelected: not handling this event");
            return super.onOptionsItemSelected(menuItem);
        }
        logger.debug("onOptionsItemSelected: home button pressed");
        if (getSupportFragmentManager().M() > 0) {
            logger.debug("onOptionsItemSelected: popping");
            getSupportFragmentManager().Z();
            return true;
        }
        logger.debug("onOptionsItemSelected: finishing");
        finish();
        return true;
    }

    /* JADX INFO: renamed from: jd1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljd1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1885a {
        public /* synthetic */ C1885a(j jVar) {
            this();
        }

        private C1885a() {
        }
    }
}
