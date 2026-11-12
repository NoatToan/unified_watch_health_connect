package tb1;

import android.text.TextUtils;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltb1/a;", "", "<init>", "()V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3081a f163743a = new C3081a(null);

    /* JADX INFO: renamed from: tb1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb1/a$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3081a {
        public /* synthetic */ C3081a(j jVar) {
            this();
        }

        public static boolean a(Object obj, Object obj2) {
            boolean z14 = obj != null;
            boolean z15 = obj2 != null;
            if (!z14 && !z15) {
                return true;
            }
            if ((!z14 || z15) && ((z14 || !z15) && z14 && z15)) {
                return String.valueOf(obj).equals(String.valueOf(obj2));
            }
            return false;
        }

        public static boolean b(String str, String str2) {
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                if ((TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2))) {
                    return true;
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    return !u.q(str, str2, false);
                }
            }
            return false;
        }

        private C3081a() {
        }
    }
}
