package defpackage;

import android.os.ParcelFileDescriptor;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f41699c;
    private String d;
    private String e;
    private ParcelFileDescriptor f = null;
    private long g;
    private String h;
    private String i;
    private int j;
    private TransferFileReqType k;
    private boolean l;
    private long m;
    private String n;
    private int o;
    private String q;
    private int[] r;
    private String t;

    public TransferFileReqType k() {
        return this.k;
    }

    public void e(TransferFileReqType transferFileReqType) {
        this.k = transferFileReqType;
    }

    public List<Integer> a() {
        return this.f41699c;
    }

    public void b(List<Integer> list) {
        this.f41699c = list;
    }

    public String f() {
        return this.i;
    }

    public void a(String str) {
        this.i = str;
    }

    public int n() {
        return this.o;
    }

    public void c(int i) {
        this.o = i;
    }

    public String i() {
        return this.h;
    }

    public void h(String str) {
        this.h = str;
    }

    public long m() {
        return this.m;
    }

    public void b(long j) {
        this.m = j;
    }

    public String o() {
        return this.n;
    }

    public void j(String str) {
        this.n = str;
    }

    public boolean t() {
        return this.l;
    }

    public void e(boolean z) {
        this.l = z;
    }

    public int[] p() {
        int[] iArr = this.r;
        if (iArr != null) {
            return (int[]) iArr.clone();
        }
        return null;
    }

    public void c(int[] iArr) {
        if (iArr != null) {
            this.r = (int[]) iArr.clone();
        }
    }

    public String c() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public int h() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public ParcelFileDescriptor j() {
        return this.f;
    }

    public void c(ParcelFileDescriptor parcelFileDescriptor) {
        this.f = parcelFileDescriptor;
    }

    public long g() {
        return this.g;
    }

    public void c(long j) {
        this.g = j;
    }

    public String r() {
        return this.q;
    }

    public void f(String str) {
        this.q = str;
    }

    public String b() {
        return this.f41698b;
    }

    public void c(String str) {
        this.f41698b = str;
    }

    public String l() {
        return this.t;
    }

    public void i(String str) {
        this.t = str;
    }

    public String d() {
        return this.f41697a;
    }

    public void e(String str) {
        this.f41697a = str;
    }

    public String e() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }
}
