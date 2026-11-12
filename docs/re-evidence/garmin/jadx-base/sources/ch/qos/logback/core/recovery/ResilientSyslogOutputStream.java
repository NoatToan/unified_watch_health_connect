package ch.qos.logback.core.recovery;

import am.j;
import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {
    int port;
    String syslogHost;

    public ResilientSyslogOutputStream(String str, int i14) {
        this.syslogHost = str;
        this.port = i14;
        this.f27284os = new SyslogOutputStream(str, i14);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public String getDescription() {
        StringBuilder sb3 = new StringBuilder("syslog [");
        sb3.append(this.syslogHost);
        sb3.append(":");
        return j.q(sb3, this.port, "]");
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public OutputStream openNewOutputStream() {
        return new SyslogOutputStream(this.syslogHost, this.port);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this);
    }
}
