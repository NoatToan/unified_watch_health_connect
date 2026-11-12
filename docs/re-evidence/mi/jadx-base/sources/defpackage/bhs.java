package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class bhs extends ths.c {
    public String j;

    public bhs(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.j = str3;
    }

    public static bhs i(String str) {
        return new bhs(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
