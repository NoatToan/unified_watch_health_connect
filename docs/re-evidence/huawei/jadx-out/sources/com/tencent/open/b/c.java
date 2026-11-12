package com.tencent.open.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f31031a;

    public c(Bundle bundle) {
        this.f31031a = new HashMap<>();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f31031a.put(str, bundle.getString(str));
            }
        }
    }

    public c(HashMap<String, String> map) {
        this.f31031a = new HashMap<>(map);
    }

    public String toString() {
        return "BaseData{time=" + this.f31031a.get("time") + ", name=" + this.f31031a.get("interface_name") + '}';
    }
}
