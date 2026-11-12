package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.UriUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class RangedUri {
    private final String a;
    private int b;
    public final long length;
    public final long start;

    public RangedUri(@Nullable String referenceUri, long start, long length) {
        this.a = referenceUri == null ? "" : referenceUri;
        this.start = start;
        this.length = length;
    }

    @Nullable
    public RangedUri attemptMerge(@Nullable RangedUri other, String baseUri) {
        String strResolveUriString = resolveUriString(baseUri);
        if (other != null && strResolveUriString.equals(other.resolveUriString(baseUri))) {
            long j = this.length;
            if (j != -1) {
                long j2 = this.start;
                if (j2 + j == other.start) {
                    long j3 = other.length;
                    return new RangedUri(strResolveUriString, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = other.length;
            if (j4 != -1) {
                long j5 = other.start;
                if (j5 + j4 == this.start) {
                    return new RangedUri(strResolveUriString, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RangedUri.class != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        return this.start == rangedUri.start && this.length == rangedUri.length && this.a.equals(rangedUri.a);
    }

    public int hashCode() {
        if (this.b == 0) {
            this.b = ((((527 + ((int) this.start)) * 31) + ((int) this.length)) * 31) + this.a.hashCode();
        }
        return this.b;
    }

    public Uri resolveUri(String baseUri) {
        return UriUtil.resolveToUri(baseUri, this.a);
    }

    public String resolveUriString(String baseUri) {
        return UriUtil.resolve(baseUri, this.a);
    }

    public String toString() {
        String str = this.a;
        long j = this.start;
        long j2 = this.length;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
