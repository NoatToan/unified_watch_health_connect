package com.ingenic.iwds.uniconnect.link;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class LinkManager {
    public static final String ACTION_UNICONNECT_LINK_CONNECTED = "action.uniconnect.LinkConnected";
    public static final String ACTION_UNICONNECT_LINK_DISCONNECTED = "action.uniconnect.LinkDisconnected";
    private Context a;
    private AdapterManager b;
    private SharedPreferences c;
    private SharedPreferences.Editor d;
    private ArrayList<String> e;
    private ArrayList<Adapter> f = new ArrayList<>();

    public LinkManager(Context context, AdapterManager adapterManager) {
        this.a = context;
        this.b = adapterManager;
        nativeSetLinkStateChangedHandler(this);
        this.e = new ArrayList<>();
        for (String str : nativeGetLinkTypes().split(",")) {
            this.e.add(str);
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("bond_store", 0);
        this.c = sharedPreferences;
        this.d = sharedPreferences.edit();
    }

    private static final native boolean nativeBondAddress(String str, String str2);

    private static final native String nativeGetLinkTypes();

    private static final native String nativeGetRemoteAddress(String str);

    private static final native void nativeSetLinkStateChangedHandler(LinkManager linkManager);

    private static final native boolean nativeStartServer(String str);

    private static final native void nativeStopServer(String str);

    private static final native void nativeUnbond(String str);

    public String a(String str) {
        return this.c.getString(str, "");
    }

    public ArrayList<String> b() {
        return this.e;
    }

    public boolean c(String str, String str2) {
        if (!nativeBondAddress(str, str2)) {
            return false;
        }
        this.d.putString(str2, str);
        this.d.commit();
        return true;
    }

    public Context d() {
        return this.a;
    }

    public void e(String str) {
        nativeUnbond(str);
        this.d.remove(str);
        this.d.commit();
    }

    public ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it2 = this.c.getAll().keySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public boolean g(String str) {
        return nativeStartServer(str);
    }

    public AdapterManager h() {
        return this.b;
    }

    public void i(String str) {
        nativeStopServer(str);
    }

    public String j(String str) {
        return nativeGetRemoteAddress(str);
    }

    public void onLinkStateChanged(boolean z, String str, String str2, int i) {
        for (Adapter adapter : this.b.b()) {
            if (adapter.getLinkTag().equals(str2)) {
                adapter.b(i, z, str);
                return;
            }
        }
    }
}
