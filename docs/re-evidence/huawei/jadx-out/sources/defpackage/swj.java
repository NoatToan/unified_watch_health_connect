package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class swj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static swj f48761b;

    private swj() {
    }

    public static swj d() {
        swj swjVar;
        synchronized (swj.class) {
            if (f48761b == null) {
                f48761b = new swj();
            }
            swjVar = f48761b;
        }
        return swjVar;
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48766c;
        public int d;
        public String e;

        public d(String str, int i, int i2, String str2) {
            this.f48765b = str;
            this.f48766c = i;
            this.d = i2;
            this.e = str2;
        }
    }

    public List<String> e(List<a> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.a("QuickEntryPreConditionManager", "getPresetEntries entryConditions is empty");
            return new ArrayList();
        }
        ArrayList<d> arrayList = new ArrayList();
        for (a aVar : list) {
            if (aVar != null && aVar.e) {
                arrayList.add(new d(aVar.f48762a, aVar.f48764c, aVar.f48763b, aVar.d));
                LogUtil.a("QuickEntryPreConditionManager", "getPresetEntries met condition: " + aVar.f48762a + ", days=" + aVar.f48763b + ", priority=" + aVar.f48764c);
            }
        }
        arrayList.sort(new Comparator() { // from class: swh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return swj.e((swj.d) obj, (swj.d) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (d dVar : arrayList) {
            if (i >= 2) {
                break;
            }
            arrayList2.add(dVar.f48765b);
            i++;
        }
        LogUtil.a("QuickEntryPreConditionManager", "getPresetEntries result size: " + arrayList2.size() + ", entries: " + arrayList2);
        return arrayList2;
    }

    static /* synthetic */ int e(d dVar, d dVar2) {
        if (dVar.f48766c != dVar2.f48766c) {
            return Integer.compare(dVar.f48766c, dVar2.f48766c);
        }
        if (dVar.d != dVar2.d) {
            return Integer.compare(dVar2.d, dVar.d);
        }
        return Math.random() > 0.5d ? 1 : 0;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48764c;
        public String d;
        public boolean e;

        public a(String str, boolean z, int i, int i2, String str2) {
            this.f48762a = str;
            this.e = z;
            this.f48763b = i;
            this.f48764c = i2;
            this.d = str2;
        }
    }
}
