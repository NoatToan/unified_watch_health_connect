package com.ingenic.iwds.uniconnect.link;

import android.content.Context;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class AdapterManager {
    private static AdapterManager d;
    private LinkManager a;
    private Context b;
    private ArrayList<Adapter> c;

    private AdapterManager(Context context) {
        IwdsAssert.dieIf(this, context == null, "Context is null.");
        this.b = context;
        this.a = new LinkManager(context, this);
        this.c = new ArrayList<>();
        Iterator<String> it2 = this.a.b().iterator();
        while (it2.hasNext()) {
            this.c.add(Adapter.a(this.b, this, it2.next()));
        }
    }

    public static AdapterManager getInstance(Context context) {
        IwdsAssert.dieIf("AdapterManager", context == null, "Application context is null.");
        if (d == null) {
            d = new AdapterManager(context);
        }
        return d;
    }

    public LinkManager a() {
        return this.a;
    }

    public ArrayList<Adapter> b() {
        return this.c;
    }

    public Adapter getAdapter(String str) {
        for (Adapter adapter : this.c) {
            if (adapter.getLinkTag().equals(str)) {
                return adapter;
            }
        }
        IwdsAssert.dieIf("Adapter", true, "Unsupport link type, tag: " + str);
        return null;
    }
}
