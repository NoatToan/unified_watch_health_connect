package com.google.android.gms.common;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class p {

    @Nullable
    private String a = null;
    private long b = -1;
    private zzag<byte[]> c = zzag.zzl();
    private zzag<byte[]> d = zzag.zzl();

    public final p a(long j) {
        this.b = j;
        return this;
    }

    public final p b(List<byte[]> list) {
        Preconditions.checkNotNull(list);
        this.d = zzag.zzk(list);
        return this;
    }

    public final p c(List<byte[]> list) {
        Preconditions.checkNotNull(list);
        this.c = zzag.zzk(list);
        return this;
    }

    public final p d(String str) {
        this.a = str;
        return this;
    }

    public final q e() {
        if (this.a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.c.isEmpty() && this.d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new q(this.a, this.b, this.c, this.d, null);
    }
}
