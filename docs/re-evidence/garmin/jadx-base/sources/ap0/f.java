package ap0;

import android.content.res.Resources;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r22.v0;
import rd2.j;
import tn.k;
import zo0.n;
import zo0.p;
import zo0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lap0/f;", "Lzo0/p;", "Lzo0/q;", "navigator", "<init>", "(Lzo0/q;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f11668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n31.a f11669b;

    static {
        new a(null);
    }

    public f(q qVar) {
        qVar.getClass();
        this.f11668a = qVar;
        this.f11669b = (n31.a) KoinJavaComponent.get$default(n31.a.class, null, null, 6, null);
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.k)) {
            return null;
        }
        n.k kVar = (n.k) nVar;
        sd2.f fVar = kVar.f206182a;
        a2 a2Var = a2.DEVICES;
        String strE = org.apache.commons.lang3.e.e(fVar.getUnitID(), "Creating welcome dialog for ");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "OnboardingWelcomeDialogHandler", strE);
        Resources resourcesU5 = this.f11668a.u5();
        d.a aVar = d.f11660e;
        String string = resourcesU5.getString(R.string.onboarding_launch_pad_title, fVar.getDisplayName());
        string.getClass();
        String string2 = resourcesU5.getString(R.string.onboarding_launch_software_update_message);
        string2.getClass();
        List<g> list = kVar.f206183b;
        e eVar = new e(this, fVar, 0);
        e eVar2 = new e(this, fVar, 1);
        aVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((g) it.next()).name());
        }
        Bundle bundleD = k.d("EXTRA_TITLE", string, "EXTRA_SUBTITLE", string2);
        bundleD.putStringArrayList("EXTRA_FEATURE_NAMES", new ArrayList<>(arrayList));
        d dVar = new d();
        dVar.setArguments(bundleD);
        dVar.f11661a = eVar;
        dVar.f11662b = eVar2;
        return dVar;
    }

    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        Object next;
        long jB = this.f11669b.b();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = j.i(jB, null);
        if (fVarI == null) {
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "OnboardingWelcomeDialogHandler", "requestDialogData: No device id for welcome dialog");
            return null;
        }
        yl2.b bVar = (yl2.b) yl2.b.B6.get(fVarI.getProductNumber());
        ap0.a.f11648c.getClass();
        w13.c cVar = ap0.a.f11650e;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((ap0.a) next).f11651a != bVar);
        ap0.a aVar = (ap0.a) next;
        if (aVar != null) {
            a2 a2Var2 = a2.DEVICES;
            String strD = n23.j.d(fVarI.getUnitID(), "requestDialogData: Device ", fVarI.getDisplayName(), " with unit id: ");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "OnboardingWelcomeDialogHandler", strD);
            return new n.k(fVarI, aVar.f11652b);
        }
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICES, "OnboardingWelcomeDialogHandler", "requestDialogData: No matching welcome device for type: " + bVar);
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        this.f11669b.a(-1L);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lap0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
