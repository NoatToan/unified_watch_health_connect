package com.google.firebase.platforminfo;

import com.alipay.sdk.m.u.i;
import java.util.Objects;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
final class a extends b {
    private final String a;
    private final String b;

    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.b = str2;
    }

    @Override // com.google.firebase.platforminfo.b
    @Nonnull
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.platforminfo.b
    @Nonnull
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + i.d;
    }
}
