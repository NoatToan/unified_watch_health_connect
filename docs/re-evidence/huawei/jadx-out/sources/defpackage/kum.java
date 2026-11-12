package defpackage;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes10.dex */
public class kum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39524c;
    private long d;
    private int e;
    private String f;
    private String j;

    public int a() {
        return this.f39522a;
    }

    public void c(int i) {
        this.f39522a = i;
    }

    public String e() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    public String b() {
        return this.f39523b;
    }

    public void e(String str) {
        this.f39523b = str;
    }

    public long c() {
        return this.d;
    }

    public String g() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public long d() {
        return this.f39524c;
    }

    public String toString() {
        return "PermissionTable{id=" + this.e + '}';
    }

    public static ContentValues d(kum kumVar) {
        if (kumVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("cloud_id", Integer.valueOf(kumVar.a()));
        contentValues.put("scope_name", kumVar.e());
        contentValues.put("permission", kumVar.b());
        contentValues.put("uri", kumVar.g());
        contentValues.put("create_time", Long.valueOf(kumVar.d() <= 0 ? System.currentTimeMillis() : kumVar.d()));
        contentValues.put("modified_time", Long.valueOf(kumVar.c() <= 0 ? System.currentTimeMillis() : kumVar.c()));
        return contentValues;
    }
}
