package rs2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrs2/d;", "", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f154380a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f154381b = true;

    private d() {
    }

    public static String a(String str, long j8, Object obj, String str2) {
        StringBuilder sb3 = new StringBuilder("GFDI#");
        sb3.append(str);
        if (obj != null) {
            sb3.append("@");
            sb3.append(Long.toHexString(obj.hashCode()));
        }
        if ((str2 != null && str2.length() != 0) || j8 > -1) {
            String str3 = (str2 == null || str2.length() == 0 || j8 <= -1) ? "" : "/";
            sb3.append(" [");
            if (str2 != null && str2.length() != 0) {
                sb3.append(str2);
            }
            sb3.append(str3);
            if (j8 > -1) {
                sb3.append(j8);
            }
            sb3.append("]");
        }
        return sb3.toString();
    }
}
