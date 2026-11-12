package rs2;

import com.garmin.proto.generated.GDICore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrs2/a;", "Lrs2/u;", "delegate", "<init>", "(Lrs2/u;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f154356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f154357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f154358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f154359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashSet f154360e;

    public a(u uVar) {
        uVar.getClass();
        this.f154356a = uVar;
    }

    @Override // rs2.u
    public final Set<Integer> a(c cVar) {
        cVar.getClass();
        LinkedHashSet linkedHashSet = this.f154360e;
        if (linkedHashSet != null) {
            return linkedHashSet;
        }
        this.f154357b = cVar;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(this.f154356a.a(cVar));
        Iterator it = ((ArrayList) f(cVar)).iterator();
        while (it.hasNext()) {
            linkedHashSet2.addAll(((h) it.next()).getConfiguration());
        }
        Iterator it3 = ((ArrayList) j(cVar)).iterator();
        while (it3.hasNext()) {
            linkedHashSet2.addAll(((dt2.a) it3.next()).getConfiguration());
        }
        this.f154360e = linkedHashSet2;
        return linkedHashSet2;
    }

    @Override // rs2.u
    public final void b(c cVar, GDICore.FeatureCapabilitiesResponse.GuidStatus guidStatus, t tVar) {
        cVar.getClass();
        this.f154356a.b(cVar, guidStatus, tVar);
    }

    @Override // rs2.u
    public final byte[] c() {
        return this.f154356a.c();
    }

    @Override // rs2.u
    public final String e() {
        return this.f154356a.e();
    }

    @Override // rs2.u
    public final List<h> f(c cVar) {
        cVar.getClass();
        ArrayList arrayList = this.f154358c;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayListD0 = h0.D0(this.f154356a.f(cVar), new vs2.a());
        this.f154358c = arrayListD0;
        return arrayListD0;
    }

    @Override // rs2.u
    public final f g(String str) {
        str.getClass();
        return null;
    }

    @Override // rs2.u
    public final int getAppVersion() {
        return this.f154356a.getAppVersion();
    }

    @Override // rs2.u
    public final String getFriendlyName() {
        return this.f154356a.getFriendlyName();
    }

    @Override // rs2.u
    public final ss2.b h(String str) {
        str.getClass();
        return this.f154356a.h(str);
    }

    @Override // rs2.u
    public final List<dt2.a> j(c cVar) {
        cVar.getClass();
        ArrayList arrayList = this.f154359d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(this.f154356a.j(cVar));
        arrayList2.add(new ts2.b());
        this.f154359d = arrayList2;
        return arrayList2;
    }
}
