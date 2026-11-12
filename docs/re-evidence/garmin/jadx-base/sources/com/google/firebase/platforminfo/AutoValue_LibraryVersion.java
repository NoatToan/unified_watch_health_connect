package com.google.firebase.platforminfo;

import am.j;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {
    private final String libraryName;
    private final String version;

    public AutoValue_LibraryVersion(String str, String str2) {
        if (str == null) {
            x.l("Null libraryName");
            throw null;
        }
        this.libraryName = str;
        if (str2 != null) {
            this.version = str2;
        } else {
            x.l("Null version");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LibraryVersion) {
            LibraryVersion libraryVersion = (LibraryVersion) obj;
            if (this.libraryName.equals(libraryVersion.getLibraryName()) && this.version.equals(libraryVersion.getVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((this.libraryName.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LibraryVersion{libraryName=");
        sb3.append(this.libraryName);
        sb3.append(", version=");
        return j.o(this.version, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
