package jr;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Ljr/a;", "", "", "Ljr/f;", "chartComponents", "", "_chartSiblings", "_chartCompanions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("charts")
    private final List<f> chartComponents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("siblings")
    private final List<List<String>> _chartSiblings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("companions")
    private final List<List<String>> _chartCompanions;

    public a(List list, List list2, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? j0.f134944a : list2, (i14 & 4) != 0 ? j0.f134944a : list3);
    }

    public static ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<String> list2 = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (String str : list2) {
                j.f100081b.getClass();
                j jVarA = j.a.a(str);
                if (jVarA != null) {
                    arrayList2.add(jVarA);
                }
            }
            arrayList.add(h0.b1(arrayList2));
        }
        return arrayList;
    }

    public final ArrayList a() {
        return d(this._chartCompanions);
    }

    public final List<f> b() {
        return this.chartComponents;
    }

    public final ArrayList c() {
        return d(this._chartSiblings);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.chartComponents, aVar.chartComponents) && p005kotlin.jvm.internal.s.g(this._chartSiblings, aVar._chartSiblings) && p005kotlin.jvm.internal.s.g(this._chartCompanions, aVar._chartCompanions);
    }

    public final int hashCode() {
        return this._chartCompanions.hashCode() + u0.b(this.chartComponents.hashCode() * 31, 31, this._chartSiblings);
    }

    public final String toString() {
        List<f> list = this.chartComponents;
        List<List<String>> list2 = this._chartSiblings;
        return z.c(f3.k("ActivityChartsConfiguration(chartComponents=", ", _chartSiblings=", ", _chartCompanions=", list, list2), this._chartCompanions, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<f> list, List<? extends List<String>> list2, List<? extends List<String>> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.chartComponents = list;
        this._chartSiblings = list2;
        this._chartCompanions = list3;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
