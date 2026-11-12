package com.mibi.sdk.deduct;

import android.content.Context;
import com.mibi.sdk.component.recharge.Recharge;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10138b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, Recharge> f10139a = new HashMap<>();

    public enum a {
        ALIPAY(b.class),
        MIPAY(f.class),
        WXPAY(k.class),
        UNIONPAY(h.class);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Recharge f10141a;

        a(Class cls) {
            this.f10141a = null;
            try {
                this.f10141a = (Recharge) cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new IllegalStateException(e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException(e2);
            }
        }

        public String a() {
            return this.f10141a.getChannel();
        }

        public Recharge b() {
            return this.f10141a;
        }
    }

    public c() {
        for (a aVar : a.values()) {
            this.f10139a.put(aVar.a(), aVar.b());
        }
    }

    public static c b() {
        return f10138b;
    }

    public static String c(Context context, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (a aVar : a.values()) {
            if ((aVar != a.MIPAY || (!z && !z2)) && aVar.b().available(context)) {
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(aVar.a());
            }
        }
        return sb.toString();
    }

    public Recharge a(String str) {
        return this.f10139a.get(str);
    }
}
