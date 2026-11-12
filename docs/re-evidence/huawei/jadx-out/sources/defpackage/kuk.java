package defpackage;

import android.content.ContentValues;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kuk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39518c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private double l;

    public int a() {
        return this.f39517b;
    }

    public void c(int i) {
        this.f39517b = i;
    }

    public int e() {
        return this.f39516a;
    }

    public void b(int i) {
        this.f39516a = i;
    }

    public void c(long j) {
        this.f39516a = HiDateUtil.d(j);
    }

    public int b() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public int g() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public double l() {
        return this.l;
    }

    public void c(double d) {
        this.l = d;
    }

    public int f() {
        return this.f;
    }

    public void h(int i) {
        this.f = i;
    }

    public int c() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public String i() {
        return this.g;
    }

    public void c(String str) {
        this.g = str;
    }

    public int j() {
        return this.j;
    }

    public void f(int i) {
        this.j = i;
    }

    public int h() {
        return this.i;
    }

    public void i(int i) {
        this.i = i;
    }

    public long d() {
        return this.f39518c;
    }

    public void a(long j) {
        this.f39518c = j;
    }

    public String toString() {
        return "DayStatTable{id=" + this.f39517b + ",dt=" + this.f39516a + ",hiHlhTp=" + this.d + ",statTp=" + this.h + ",val=" + HiCommonUtil.c(Double.valueOf(this.l)) + ",who=" + this.f + ",ClntId=" + this.e + ",TZ='" + this.g + "',sync=" + this.i + ",mTm=" + this.f39518c + '}';
    }

    public static ContentValues e(kuk kukVar) {
        if (kukVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(10);
        contentValues.put("date", Integer.valueOf(kukVar.e()));
        contentValues.put("hihealth_type", Integer.valueOf(kukVar.b()));
        contentValues.put("stat_type", Integer.valueOf(kukVar.g()));
        contentValues.put("value", Double.valueOf(kukVar.l()));
        contentValues.put("client_id", Integer.valueOf(kukVar.c()));
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(kukVar.j()));
        contentValues.put("user_id", Integer.valueOf(kukVar.f()));
        contentValues.put("timeZone", HiDateUtil.c(kukVar.i()));
        contentValues.put("sync_status", Integer.valueOf(kukVar.h()));
        contentValues.put("modified_time", Long.valueOf(kukVar.d() <= 0 ? System.currentTimeMillis() : kukVar.d()));
        return contentValues;
    }

    public static ContentValues a(kuk kukVar) {
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("value", Double.valueOf(kukVar.l()));
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(kukVar.j()));
        contentValues.put("user_id", Integer.valueOf(kukVar.f()));
        contentValues.put("sync_status", Integer.valueOf(kukVar.h()));
        contentValues.put("modified_time", Long.valueOf(kukVar.d()));
        return contentValues;
    }

    public void e(kuk kukVar, int i, int i2, boolean z) {
        kukVar.a(i2);
        kukVar.h(i);
        if (z) {
            return;
        }
        kukVar.i(0);
    }

    public List<kuk> b(List<kuk> list, String str, int i, int i2) {
        for (kuk kukVar : list) {
            kukVar.a(i);
            kukVar.c(str);
            kukVar.b(i2);
            kukVar.i(1);
            kukVar.e(20001);
        }
        return list;
    }

    public kuk a(int i, double d, int i2) {
        kuk kukVar = new kuk();
        kukVar.d(i);
        kukVar.c(d);
        kukVar.f(i2);
        return kukVar;
    }
}
