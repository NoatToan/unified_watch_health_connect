package androidx.fragment.app;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p13.u0;
import r53.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements nd.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7276b;

    public /* synthetic */ j(Object obj, int i14) {
        this.f7275a = i14;
        this.f7276b = obj;
    }

    @Override // nd.c.b
    public final Bundle a() {
        o13.p[] pVarArr;
        int i14 = this.f7275a;
        Object obj = this.f7276b;
        switch (i14) {
            case 0:
                return ((m) obj).lambda$init$0();
            case 1:
                return ((v) obj).i0();
            case 2:
                return b.g._init_$lambda$3((b.g) obj);
            case 3:
                Map<String, List<Object>> mapB = ((d4.g) obj).b();
                Bundle bundle = new Bundle();
                for (Map.Entry<String, List<Object>> entry : mapB.entrySet()) {
                    String key = entry.getKey();
                    List<Object> value = entry.getValue();
                    bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                }
                return bundle;
            case 4:
                NavHostFragment.a aVar = NavHostFragment.f10124e;
                Bundle bundleS = ((lc.m0) obj).s();
                if (bundleS != null) {
                    return bundleS;
                }
                Bundle bundle2 = Bundle.EMPTY;
                bundle2.getClass();
                return bundle2;
            case 5:
                int i15 = ((NavHostFragment) obj).f10127c;
                if (i15 != 0) {
                    return h7.c.a(new o13.p("android-support-nav:fragment:graphId", Integer.valueOf(i15)));
                }
                Bundle bundle3 = Bundle.EMPTY;
                bundle3.getClass();
                return bundle3;
            default:
                t9.a aVar2 = (t9.a) obj;
                for (Map.Entry entry2 : u0.m(aVar2.f163196d).entrySet()) {
                    aVar2.b(((z1) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : u0.m(aVar2.f163194b).entrySet()) {
                    aVar2.b(((nd.c.b) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = aVar2.f163193a;
                if (linkedHashMap.isEmpty()) {
                    pVarArr = new o13.p[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new o13.p((String) entry4.getKey(), entry4.getValue()));
                    }
                    pVarArr = (o13.p[]) arrayList.toArray(new o13.p[0]);
                }
                return h7.c.a((o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length));
        }
    }
}
