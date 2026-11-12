package com.xiaomi.a;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.util.VersionUtil;

/* JADX INFO: loaded from: classes18.dex */
public final class j implements Versioned {
    public static final Version a = VersionUtil.parseVersion("2.9.5", "com.fasterxml.jackson.datatype", "jackson-datatype-jdk8");

    @Override // com.fasterxml.jackson.core.Versioned
    public Version version() {
        return a;
    }
}
