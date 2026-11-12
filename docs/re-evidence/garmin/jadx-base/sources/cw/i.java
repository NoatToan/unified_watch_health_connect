package cw;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import f20.x;
import f20.z;
import java.util.ArrayList;
import java.util.Set;
import lc.u0;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcw/i;", "Lf20/z;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f55930a = new i();

    private i() {
    }

    @Override // f20.z
    public final void a() {
        eq0.a aVarA = eq0.a.f65038b.a();
        aVarA.getClass();
        com.garmin.android.library.backgroundtaskmanagement.c.d(new fq0.f(aVarA), null);
    }

    @Override // f20.z
    public final void b() {
        yr1.e.c("ContactsBizManager", SupportedCapability.CONTACTS_SUPPORT);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r0 == r3) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f20.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ArrayList arrayList, v13.c cVar) {
        g gVar;
        m20.z zVar;
        ArrayList arrayList2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f55923e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f55923e = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objI = gVar.f55921c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f55923e;
        if (i15 == 0) {
            o13.r.b(objI);
            zVar = (m20.z) KoinJavaComponent.get$default(m20.z.class, null, null, 6, null);
            gVar.f55919a = arrayList;
            gVar.f55920b = zVar;
            gVar.f55923e = 1;
            zVar.getClass();
            Object objJ = f0.J(zVar, new m20.l(zVar, null), gVar);
            if (objJ != aVar) {
                arrayList2 = arrayList;
                objI = objJ;
            }
            return aVar;
        }
        if (i15 == 1) {
            zVar = gVar.f55920b;
            ArrayList arrayList3 = gVar.f55919a;
            o13.r.b(objI);
            arrayList2 = arrayList3;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        v2 v2Var = (v2) objI;
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return fw.m.f73767e.e(aVar2.f47383a, aVar2.f47384b);
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        l20.r rVar = (l20.r) ((v2.b) v2Var).f47386a;
        f12.l.f68084a.getClass();
        f12.l.a.a().o3(j.b(rVar.f()));
        return fw.m.a.g(fw.m.f73767e, rVar, 1);
        if (!(((v2) objI) instanceof v2.b)) {
            return fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5);
        }
        l20.r rVar2 = new l20.r(arrayList2, null, null, null, null, null, 62, null);
        gVar.f55919a = null;
        gVar.f55920b = null;
        gVar.f55923e = 2;
        objI = zVar.i(rVar2, gVar);
    }

    @Override // f20.z
    public final void d() {
        GCMSettingManager.D();
        eq0.a.f65038b.a().N();
    }

    @Override // f20.z
    public final void e(ContactDetailsActivity contactDetailsActivity, String str, String str2, String str3) {
        str.getClass();
        UserProfileActivity.f46494x.getClass();
        UserProfileActivity.a.c(contactDetailsActivity, str, str2, str3);
    }

    @Override // f20.z
    public final void f(b0 b0Var) {
        wd2.m.c((wd2.l) KoinJavaComponent.get$default(wd2.l.class, null, null, 6, null), new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(b0Var, 16));
    }

    @Override // f20.z
    public final boolean g() {
        nb2.a[] aVarArrB = nb2.a.b(GCMSettingManager.f41536b.getString(GCMSettingManager.f41535a.getString(R.string.key_live_tracking_invites), ""));
        if (aVarArrB == null) {
            aVarArrB = new nb2.a[0];
        }
        if (aVarArrB.length != 0) {
            return true;
        }
        eq0.a.f65038b.a().getClass();
        Set<String> stringSet = eq0.a.P().getStringSet(eq0.a.O(R.string.key_incident_detection_contact_lookup_keys), null);
        return ((stringSet == null || !stringSet.isEmpty()) ? stringSet : null) != null;
    }

    @Override // f20.z
    public final Object h(x.b bVar) {
        nb2.a[] aVarArrB = nb2.a.b(GCMSettingManager.f41536b.getString(GCMSettingManager.f41535a.getString(R.string.key_live_tracking_invites), ""));
        aVarArrB.getClass();
        eq0.a.f65038b.a().getClass();
        Set<String> stringSet = eq0.a.P().getStringSet(eq0.a.O(R.string.key_incident_detection_contact_lookup_keys), null);
        Set<String> set = (stringSet == null || !stringSet.isEmpty()) ? stringSet : null;
        if (set == null) {
            set = l0.f134950a;
        }
        return new gw.p(aVarArrB, set).a(bVar);
    }
}
