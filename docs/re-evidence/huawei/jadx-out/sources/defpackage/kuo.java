package defpackage;

import android.content.ContentValues;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;

/* JADX INFO: loaded from: classes10.dex */
public class kuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f39525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39527c;
    private int d;
    private int e;
    private long f;
    private int g;

    public int c() {
        return this.g;
    }

    public void e(int i) {
        this.g = i;
    }

    public int d() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public String e() {
        return this.f39526b;
    }

    public void c(String str) {
        this.f39526b = str;
    }

    public long a() {
        return this.f39525a;
    }

    public void b(long j) {
        this.f39525a = j;
    }

    public int b() {
        return this.f39527c;
    }

    public String toString() {
        return "SyncCacheTable{id=" + this.d + ", dataType=" + this.e + ", data='" + this.f39526b + "', dataTime='" + this.f39525a + ", isDone=" + this.f39527c + ", modifiedTime=" + this.f + '}';
    }

    public static ContentValues c(kuo kuoVar) {
        if (kuoVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(JsbMapKeyNames.H5_USER_ID, Integer.valueOf(kuoVar.c()));
        contentValues.put("dataType", Integer.valueOf(kuoVar.d()));
        contentValues.put("data", kuoVar.e());
        contentValues.put("dataTime", Long.valueOf(kuoVar.a()));
        contentValues.put("isDone", Integer.valueOf(kuoVar.b()));
        contentValues.put("modifiedTime", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }
}
