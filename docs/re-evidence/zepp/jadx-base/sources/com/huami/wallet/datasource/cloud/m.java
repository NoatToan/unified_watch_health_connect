package com.huami.wallet.datasource.cloud;

import com.huami.nfc.bus.CityInfoEntity;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class m {
    private static final String d = "Wallet-WebApiCache";
    private final List<CityInfoEntity> a = new LinkedList();
    private final List<CityInfoEntity> b = new LinkedList();
    private final List<NoticesEntity> c = new LinkedList();

    public void a(String str) {
        CityInfoEntity next;
        boolean z;
        synchronized (this.a) {
            Iterator<CityInfoEntity> it2 = this.a.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!str.equals(next.getAppCode()));
        }
        if (next == null) {
            HMLog.e(d, "期望添加一个新的已开通卡信息到缓存，但没有找到对应的卡片城市信息", new Object[0]);
            return;
        }
        synchronized (this.b) {
            Iterator<CityInfoEntity> it3 = this.b.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                } else if (str.equals(it3.next().getAppCode())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                HMLog.i(d, "期望添加一个新的已开通卡信息到缓存，但发现已经缓存过了", new Object[0]);
            } else {
                HMLog.i(d, "已添加一个新的已开通卡信息到缓存", new Object[0]);
                this.b.add(next);
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            this.a.clear();
        }
        synchronized (this.b) {
            this.b.clear();
        }
        HMLog.i(d, "清除了缓存", new Object[0]);
    }

    public List<CityInfoEntity> c() {
        return this.b;
    }

    public List<NoticesEntity> d() {
        return this.c;
    }

    public boolean e() {
        return !this.b.isEmpty();
    }

    public synchronized boolean f() {
        return !this.c.isEmpty();
    }

    public void g(String str) {
        boolean z;
        synchronized (this.b) {
            int i = 0;
            while (true) {
                if (i >= this.b.size()) {
                    z = false;
                    break;
                } else {
                    if (str.equals(this.b.get(i).getAppCode())) {
                        this.b.remove(i);
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                HMLog.i(d, "一个已开通卡信息已从缓存移除", new Object[0]);
            } else {
                HMLog.i(d, "期望从缓存移除一个已开通卡信息，但未在缓存中发现此项", new Object[0]);
            }
        }
    }

    public void h(List<CityInfoEntity> list) {
        synchronized (this.b) {
            this.b.clear();
            this.b.addAll(list);
        }
    }

    public void i(List<NoticesEntity> list) {
        synchronized (this.c) {
            this.c.clear();
            this.c.addAll(list);
        }
    }
}
