package com.huawei.openalliance.ad;

import android.os.FileObserver;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class dp extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f18637a;

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (i == 16) {
            if (hw.a()) {
                hw.a("FileListener", "CLOSE_NOWRITE, path= %s", str);
            }
            d(str);
        } else {
            if (i != 32) {
                return;
            }
            if (hw.a()) {
                hw.a("FileListener", "OPEN, path= %s", str);
            }
            c(str);
        }
    }

    public boolean a(String str) {
        if (hw.a()) {
            hw.a("FileListener", "accessMap = %s", Arrays.asList(this.f18637a));
        }
        return b(str);
    }

    private void d(String str) {
        if (hw.a()) {
            hw.a("FileListener", "setNotAccessed, accessMap = %s", Arrays.asList(this.f18637a));
        }
        if (this.f18637a.containsKey(str)) {
            if (this.f18637a.get(str).intValue() <= 1) {
                this.f18637a.remove(str);
            } else {
                Map<String, Integer> map = this.f18637a;
                map.put(str, Integer.valueOf(map.get(str).intValue() - 1));
            }
        }
    }

    private void c(String str) {
        Map<String, Integer> map;
        int iValueOf;
        if (hw.a()) {
            hw.a("FileListener", "setNotAccessed, accessMap = %s", Arrays.asList(this.f18637a));
        }
        hw.a("FileListener", "setAccessed, accessMap = %s", Arrays.asList(this.f18637a));
        if (this.f18637a.containsKey(str)) {
            map = this.f18637a;
            iValueOf = Integer.valueOf(map.get(str).intValue() + 1);
        } else {
            map = this.f18637a;
            iValueOf = 1;
        }
        map.put(str, iValueOf);
    }

    private boolean b(String str) {
        return this.f18637a.containsKey(str) && this.f18637a.get(str).intValue() > 0;
    }

    public dp(String str) {
        super(str);
        this.f18637a = new ConcurrentHashMap();
    }

    public dp(File file) {
        super(file);
        this.f18637a = new ConcurrentHashMap();
    }
}
