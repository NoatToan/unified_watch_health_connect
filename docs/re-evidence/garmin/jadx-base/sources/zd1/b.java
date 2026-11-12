package zd1;

import android.content.Intent;
import android.os.Bundle;
import b63.o;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzd1/b;", "", "Lb63/o;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f204223a = new b();

    private b() {
    }

    public static o a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            long j8 = extras.getLong("EXTRA_INITIAL_DATE", -1L);
            Long lValueOf = Long.valueOf(j8);
            if (j8 <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                o.INSTANCE.getClass();
                return o.Companion.a(jLongValue);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return 657957653;
    }

    public final String toString() {
        return "InitialDate";
    }
}
