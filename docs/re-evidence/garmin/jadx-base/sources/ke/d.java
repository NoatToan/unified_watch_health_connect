package ke;

import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f104529a = new HashSet();

    public static class a extends d {
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends d {
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    public d(String str, String str2) {
        f104529a.add(this);
    }
}
