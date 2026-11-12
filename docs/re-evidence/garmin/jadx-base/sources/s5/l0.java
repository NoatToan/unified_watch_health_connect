package s5;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a6.f f157238a = new a6.f();

    public static final String a(String str, z5.b bVar) {
        f157238a.getClass();
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb3.append((Object) (Character.isLowerCase(cCharAt) ? d53.a.c(cCharAt, bVar.f202440a) : String.valueOf(cCharAt)));
        sb3.append(str.substring(1));
        return sb3.toString();
    }

    public static final String b(String str, z5.b bVar) {
        f157238a.getClass();
        String upperCase = str.toUpperCase(bVar.f202440a);
        upperCase.getClass();
        return upperCase;
    }
}
