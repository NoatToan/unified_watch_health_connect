package com.xmlywind.sdk.common.e;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class l extends com.xmlywind.volley.m {
    private final Map<com.xmlywind.volley.l<?>, a> a;

    public class a {
        public final Handler a;
        public final Runnable b;

        public void a() {
            this.a.removeCallbacks(this.b);
        }
    }

    public l(com.xmlywind.volley.f fVar, int i) {
        super(fVar, i);
        this.a = new HashMap(10);
    }

    public void a() {
        a(new com.xmlywind.volley.m.a() { // from class: com.xmlywind.sdk.common.e.l.1
            @Override // com.xmlywind.volley.m.a
            public boolean a(com.xmlywind.volley.l<?> lVar) {
                return true;
            }
        });
    }

    @Override // com.xmlywind.volley.m
    public void a(com.xmlywind.volley.m.a aVar) {
        super.a(aVar);
        Iterator<Map.Entry<com.xmlywind.volley.l<?>, a>> it2 = this.a.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<com.xmlywind.volley.l<?>, a> next = it2.next();
            if (aVar.a(next.getKey())) {
                next.getKey().j();
                next.getValue().a();
                it2.remove();
            }
        }
    }
}
