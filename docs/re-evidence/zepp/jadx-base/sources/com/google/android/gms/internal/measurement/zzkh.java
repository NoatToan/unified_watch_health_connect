package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzkh extends IOException {
    public zzkh(String str) {
        super(str);
    }

    public static zzkg a() {
        return new zzkg("Protocol message tag had invalid wire type.");
    }

    public static zzkh b() {
        return new zzkh("Protocol message contained an invalid tag (zero).");
    }

    public static zzkh c() {
        return new zzkh("Protocol message had invalid UTF-8.");
    }

    public static zzkh e() {
        return new zzkh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzkh f() {
        return new zzkh("Failed to parse the message.");
    }

    public static zzkh g() {
        return new zzkh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
