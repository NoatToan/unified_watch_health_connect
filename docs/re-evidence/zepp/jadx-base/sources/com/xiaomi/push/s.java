package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
class s extends ag {
    public ag o;
    public final /* synthetic */ ag p;
    public final /* synthetic */ ak q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ak akVar, String str, ag agVar) {
        super(str);
        this.q = akVar;
        this.p = agVar;
        this.o = agVar;
        this.b = this.b;
        if (agVar != null) {
            this.f = agVar.f;
        }
    }

    @Override // com.xiaomi.push.ag
    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        ag agVar = this.o;
        if (agVar != null) {
            arrayList.addAll(agVar.a(true));
        }
        Map<String, ag> map = ak.b;
        synchronized (map) {
            ag agVar2 = map.get(this.b);
            if (agVar2 != null) {
                for (String str : agVar2.a(true)) {
                    if (arrayList.indexOf(str) == -1) {
                        arrayList.add(str);
                    }
                }
                arrayList.remove(this.b);
                arrayList.add(this.b);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.push.ag
    public synchronized void a(String str, af afVar) {
        ag agVar = this.o;
        if (agVar != null) {
            agVar.a(str, afVar);
        }
    }

    @Override // com.xiaomi.push.ag
    public boolean b() {
        return false;
    }
}
