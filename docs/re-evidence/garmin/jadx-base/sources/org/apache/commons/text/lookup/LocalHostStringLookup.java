package org.apache.commons.text.lookup;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
final class LocalHostStringLookup extends AbstractStringLookup {
    static final LocalHostStringLookup INSTANCE = new LocalHostStringLookup();

    private LocalHostStringLookup() {
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -1147692044) {
                if (iHashCode != 3373707) {
                    if (iHashCode == 1339224004 && str.equals("canonical-name")) {
                        return InetAddress.getLocalHost().getCanonicalHostName();
                    }
                } else if (str.equals("name")) {
                    return InetAddress.getLocalHost().getHostName();
                }
            } else if (str.equals("address")) {
                return InetAddress.getLocalHost().getHostAddress();
            }
            throw new IllegalArgumentException(str);
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
