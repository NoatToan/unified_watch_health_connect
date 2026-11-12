package com.nimbusds.jose;

import defpackage.upd;
import java.io.Serializable;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class CompressionAlgorithm implements Serializable {
    public static final CompressionAlgorithm DEF = new CompressionAlgorithm("DEF");
    private static final long serialVersionUID = 1;
    private final String name;

    public CompressionAlgorithm(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.name = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompressionAlgorithm) && toString().equals(obj.toString());
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toJSONString() {
        return upd.a(this.name);
    }

    public String toString() {
        return this.name;
    }
}
