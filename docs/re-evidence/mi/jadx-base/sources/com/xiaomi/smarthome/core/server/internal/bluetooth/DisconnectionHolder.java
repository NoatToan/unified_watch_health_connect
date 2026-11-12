package com.xiaomi.smarthome.core.server.internal.bluetooth;

import java.sql.Timestamp;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class DisconnectionHolder implements Comparable<DisconnectionHolder> {
    public long deadline;
    public String mac;

    public DisconnectionHolder() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisconnectionHolder)) {
            return false;
        }
        String str = this.mac;
        String str2 = ((DisconnectionHolder) obj).mac;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        String str = this.mac;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "DisconnectionHolder{deadline=" + new Timestamp(this.deadline) + ", mac='" + this.mac + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public DisconnectionHolder(String str) {
        this.mac = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(DisconnectionHolder disconnectionHolder) {
        return (int) (this.deadline - disconnectionHolder.deadline);
    }
}
