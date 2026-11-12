package defpackage;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes10.dex */
public class kul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39521c;
    private int d;
    private long e;
    private long j;

    public int b() {
        return this.f39519a;
    }

    public void d(int i) {
        this.f39519a = i;
    }

    public long a() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public long h() {
        return this.j;
    }

    public void e(long j) {
        this.j = j;
    }

    public int d() {
        return this.f39520b;
    }

    public void e(int i) {
        this.f39520b = i;
    }

    public int e() {
        return this.f39521c;
    }

    public void a(int i) {
        this.f39521c = i;
    }

    public int c() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public String toString() {
        return "SyncAnchorTable{syncType=" + this.f39519a + ", cloudCode=" + this.e + ", user=" + this.f39521c + ", syncDataCategory=" + this.d + ", syncTypeVersion=" + this.j + ", syncTime=" + this.f39520b + '}';
    }

    public static ContentValues a(kul kulVar) {
        if (kulVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("main_user_id", Integer.valueOf(kulVar.e()));
        contentValues.put("cloud_code", Long.valueOf(kulVar.a()));
        contentValues.put("sync_data_type", Integer.valueOf(kulVar.b()));
        contentValues.put("sync_type_version", Long.valueOf(kulVar.h()));
        contentValues.put("sync_type_time", Integer.valueOf(kulVar.d()));
        contentValues.put("modify_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("sync_data_category", Integer.valueOf(kulVar.c()));
        return contentValues;
    }
}
