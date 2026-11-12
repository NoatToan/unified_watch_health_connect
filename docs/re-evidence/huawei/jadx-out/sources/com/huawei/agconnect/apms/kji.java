package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;

/* JADX INFO: loaded from: classes3.dex */
public final class kji implements AgentLog {
    public final Object abc = new Object();
    public jkl bcd = new jkl();

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public final void debug(String str) {
        synchronized (this.abc) {
            this.bcd.debug(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public final void error(String str) {
        synchronized (this.abc) {
            this.bcd.error(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public final int getLevel() {
        int i;
        synchronized (this.abc) {
            i = this.bcd.abc;
        }
        return i;
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public final void info(String str) {
        synchronized (this.abc) {
            this.bcd.info(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public final void setLevel(int i) {
        synchronized (this.abc) {
            this.bcd.setLevel(i);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public final void warn(String str) {
        synchronized (this.abc) {
            this.bcd.warn(str);
        }
    }

    @Override // com.huawei.agconnect.apms.log.AgentLog
    public final void error(String str, Throwable th) {
        synchronized (this.abc) {
            this.bcd.error(str, th);
        }
    }
}
