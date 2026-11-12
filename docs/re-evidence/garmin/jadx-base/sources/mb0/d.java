package mb0;

import b63.v;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import z80.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmb0/d;", "", "Lz80/j;", "editingWindow", "", "Lmb0/b;", "editDaysOfWeekItems", "Lb63/v;", "editSleepTime", "editWakeTime", "Lmb0/h;", "reassignDayConfirmation", "<init>", "(Lz80/j;Ljava/util/List;Lb63/v;Lb63/v;Lmb0/h;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f117723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f117724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f117725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f117726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f117727e;

    public d(j jVar, List list, v vVar, v vVar2, h hVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : jVar, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? null : vVar, (i14 & 8) != 0 ? null : vVar2, (i14 & 16) != 0 ? null : hVar);
    }

    public static d a(d dVar, ArrayList arrayList, v vVar, v vVar2, h hVar, int i14) {
        List<b> list = arrayList;
        j jVar = dVar.f117723a;
        if ((i14 & 2) != 0) {
            list = dVar.f117724b;
        }
        if ((i14 & 4) != 0) {
            vVar = dVar.f117725c;
        }
        if ((i14 & 8) != 0) {
            vVar2 = dVar.f117726d;
        }
        if ((i14 & 16) != 0) {
            hVar = dVar.f117727e;
        }
        h hVar2 = hVar;
        dVar.getClass();
        list.getClass();
        v vVar3 = vVar2;
        return new d(jVar, list, vVar, vVar3, hVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f117723a, dVar.f117723a) && s.g(this.f117724b, dVar.f117724b) && s.g(this.f117725c, dVar.f117725c) && s.g(this.f117726d, dVar.f117726d) && this.f117727e == dVar.f117727e;
    }

    public final int hashCode() {
        j jVar = this.f117723a;
        int iB = u0.b((jVar == null ? 0 : jVar.hashCode()) * 31, 31, this.f117724b);
        v vVar = this.f117725c;
        int iHashCode = (iB + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        v vVar2 = this.f117726d;
        int iHashCode2 = (iHashCode + (vVar2 == null ? 0 : vVar2.f16219a.hashCode())) * 31;
        h hVar = this.f117727e;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "EditableSleepData(editingWindow=" + this.f117723a + ", editDaysOfWeekItems=" + this.f117724b + ", editSleepTime=" + this.f117725c + ", editWakeTime=" + this.f117726d + ", reassignDayConfirmation=" + this.f117727e + ")";
    }

    public d(j jVar, List<b> list, v vVar, v vVar2, h hVar) {
        list.getClass();
        this.f117723a = jVar;
        this.f117724b = list;
        this.f117725c = vVar;
        this.f117726d = vVar2;
        this.f117727e = hVar;
    }

    public d() {
        this(null, null, null, null, null, 31, null);
    }
}
