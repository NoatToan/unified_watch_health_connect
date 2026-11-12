package defpackage;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes10.dex */
public class kui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39512c;
    private int d;
    private long e;
    private kum h;
    private int i;
    private int j;

    public int c() {
        return this.f39510a;
    }

    public void a(int i) {
        this.f39510a = i;
    }

    public int i() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public int e() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public kum a() {
        return this.h;
    }

    public void b(kum kumVar) {
        this.h = kumVar;
    }

    public int d() {
        return this.f39511b;
    }

    public void d(int i) {
        this.f39511b = i;
    }

    public void c(long j) {
        this.f39512c = j;
    }

    public long b() {
        return this.e;
    }

    public void b(long j) {
        this.e = j;
    }

    public String toString() {
        return "AuthorizationTable{id=" + this.d + '}';
    }

    public static ContentValues a(kui kuiVar) {
        if (kuiVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", Integer.valueOf(kuiVar.c()));
        contentValues.put("user_id", Integer.valueOf(kuiVar.i()));
        contentValues.put("permission_id", Integer.valueOf(kuiVar.e()));
        contentValues.put("granted", Integer.valueOf(kuiVar.d()));
        contentValues.put("modified_time", Long.valueOf(kuiVar.b()));
        return contentValues;
    }
}
