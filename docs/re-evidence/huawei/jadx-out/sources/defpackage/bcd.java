package defpackage;

import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class bcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<UnstructData> f966b = new ArrayList<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<UnstructData> f967c = new ArrayList<>(10);
    private String d;
    private int e;

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f965a;
    }

    public ArrayList<UnstructData> c() {
        return this.f967c;
    }

    public ArrayList<UnstructData> d() {
        return this.f966b;
    }

    public int e() {
        return this.e;
    }

    public String toString() {
        return "UpdateResult [id=" + this.d + ", guid=" + this.f965a + ", recycleStatus=" + this.e + ", downFileList=" + this.f966b.toString() + ", deleteFileList=" + this.f967c.toString() + "]";
    }
}
