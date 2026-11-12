package com.xiaomi.hm.health.jobcenter.manager;

/* JADX INFO: loaded from: classes21.dex */
enum a {
    workAnalisysThreadPool(4, 1, 10, 5000, 10000, false);

    private boolean allowCoreThreadTimeOut;
    private int corePoolSize;
    private long keepAliveTime;
    private int maximumPoolSize;
    private int poolQueueSize;
    private int type;

    a(int type, int corePoolSize, int maximumPoolSize, long keepAliveTime, int poolQueueSize, boolean allowCoreThreadTimeOut) {
        this.corePoolSize = 10;
        this.maximumPoolSize = 20;
        this.keepAliveTime = 12000L;
        this.type = 0;
        this.poolQueueSize = 10000;
        this.allowCoreThreadTimeOut = true;
        this.type = type;
        this.corePoolSize = corePoolSize;
        this.maximumPoolSize = maximumPoolSize;
        this.keepAliveTime = keepAliveTime;
        this.poolQueueSize = poolQueueSize;
        this.allowCoreThreadTimeOut = allowCoreThreadTimeOut;
    }

    public static a b(int type) {
        for (a aVar : values()) {
            if (type == aVar.g()) {
                return aVar;
            }
        }
        return workAnalisysThreadPool;
    }

    public int a() {
        return this.corePoolSize;
    }

    public long c() {
        return this.keepAliveTime;
    }

    public int e() {
        return this.maximumPoolSize;
    }

    public int f() {
        return this.poolQueueSize;
    }

    public int g() {
        return this.type;
    }

    public boolean h() {
        return this.allowCoreThreadTimeOut;
    }

    public void i(boolean allowCoreThreadTimeOut) {
        this.allowCoreThreadTimeOut = allowCoreThreadTimeOut;
    }

    public void j(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public void k(long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    public void m(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public void n(int poolQueueSize) {
        this.poolQueueSize = poolQueueSize;
    }

    public void o(int type) {
        this.type = type;
    }
}
