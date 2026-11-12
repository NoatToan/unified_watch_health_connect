package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class pfy {

    @SerializedName("huid")
    private long d;

    @SerializedName("nickName")
    private String i;

    @SerializedName("userAccount")
    private String j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f45304c = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SparseArray<pgk> f45303b = new SparseArray<>(10);
    private SparseArray<pgk> g = new SparseArray<>(10);
    private SparseIntArray h = new SparseIntArray(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45302a = 0;
    private int e = 0;

    public void b(long j) {
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public void b(String str) {
        this.i = str;
    }

    public String f() {
        return this.i;
    }

    public String i() {
        return this.j;
    }

    public void e(String str) {
        this.j = str;
    }

    public void e(List<String> list) {
        this.f45304c = list;
    }

    public List<String> e() {
        return new ArrayList(this.f45304c);
    }

    public void e(SparseArray<pgk> sparseArray) {
        this.f45303b = sparseArray;
    }

    public SparseArray<pgk> b() {
        SparseArray<pgk> sparseArray = this.f45303b;
        if (sparseArray != null) {
            return sparseArray.clone();
        }
        return null;
    }

    public void a(SparseArray<pgk> sparseArray) {
        this.g = sparseArray;
    }

    public SparseArray<pgk> g() {
        SparseArray<pgk> sparseArray = this.g;
        if (sparseArray != null) {
            return sparseArray.clone();
        }
        return null;
    }

    public void b(SparseIntArray sparseIntArray) {
        this.h = sparseIntArray;
    }

    public SparseIntArray j() {
        SparseIntArray sparseIntArray = this.h;
        if (sparseIntArray != null) {
            return sparseIntArray.clone();
        }
        return null;
    }

    public void e(int i) {
        this.f45302a = i;
    }

    public int d() {
        return this.f45302a;
    }

    public void b(int i) {
        this.e = i;
    }

    public int c() {
        return this.e;
    }
}
