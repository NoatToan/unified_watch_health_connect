package kd0;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/n0;", "Lf20/v;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 implements f20.v {
    @Override // f20.v
    public final void a() {
        eq0.a aVarA = eq0.a.f65038b.a();
        aVarA.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new fq0.f(aVarA), null);
    }

    @Override // f20.v
    public final void b() {
        yr1.e.c("ContactsDelegate", SupportedCapability.CONTACTS_SUPPORT);
    }

    @Override // f20.v
    public final void c(List<l20.a> list) {
        list.getClass();
        b31.f fVar = (b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null);
        if (!list.isEmpty()) {
            fVar.b(e31.a.HAS_CONTACTS);
        }
        if (ge1.b.P(list)) {
            fVar.b(e31.a.HAS_EMERGENCY_CONTACTS);
        }
        f12.l.f68084a.getClass();
        f12.l.a.a().o3(cw.j.b(list));
    }

    @Override // f20.v
    public final String d() {
        String displayName;
        ArrayList arrayList = new ArrayList();
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        ArrayList<sd2.f> arrayList2 = arrayListD != null ? new ArrayList(arrayListD) : null;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (sd2.f fVar : arrayList2) {
                if (!hk0.p.k(fVar.getUnitID())) {
                    if (km2.a.e(new int[]{SupportedCapability.CONTACTS_SUPPORT.ordinal()}, fVar.getUnitID()) && (displayName = fVar.getDisplayName()) != null) {
                        arrayList.add(displayName);
                    }
                }
            }
        }
        return p13.h0.k0(arrayList, null, null, null, null, 63);
    }
}
