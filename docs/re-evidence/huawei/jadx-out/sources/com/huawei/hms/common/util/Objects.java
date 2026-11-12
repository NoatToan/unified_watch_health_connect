package com.huawei.hms.common.util;

import com.huawei.hms.common.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Objects {

    /* JADX INFO: loaded from: classes33.dex */
    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f13102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f13103b;

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f13103b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f13102a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f13102a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            this.f13102a.add(str2 + "=" + strValueOf);
            return this;
        }

        private ToStringHelper(Object obj) {
            this.f13103b = Preconditions.checkNotNull(obj);
            this.f13102a = new ArrayList();
        }
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private Objects() {
        throw new AssertionError("illegal argument");
    }
}
