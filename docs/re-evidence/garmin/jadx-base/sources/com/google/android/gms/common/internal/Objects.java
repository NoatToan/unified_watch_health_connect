package com.google.android.gms.common.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class Objects {

    @KeepForSdk
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        public /* synthetic */ ToStringHelper(Object obj, byte[] bArr) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new ArrayList();
        }

        @KeepForSdk
        public ToStringHelper add(String str, Object obj) {
            Preconditions.checkNotNull(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            this.zza.add(e0.h(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
            return this;
        }

        @KeepForSdk
        public String toString() {
            StringBuilder sb3 = new StringBuilder(100);
            sb3.append(this.zzb.getClass().getSimpleName());
            sb3.append(CoreConstants.CURLY_LEFT);
            List list = this.zza;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                sb3.append((String) list.get(i14));
                if (i14 < size - 1) {
                    sb3.append(", ");
                }
            }
            sb3.append(CoreConstants.CURLY_RIGHT);
            return sb3.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj, null);
    }
}
