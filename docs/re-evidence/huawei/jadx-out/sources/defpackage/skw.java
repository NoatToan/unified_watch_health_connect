package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class skw implements Comparable<skw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48302c;
    private String d;
    private Context e;
    private int g;

    public skw(Context context, String str, int i, int i2, String str2, String str3) {
        this.f48302c = str;
        this.g = i;
        this.e = context;
        this.f48300a = i2;
        this.d = str2;
        this.f48301b = str3;
    }

    public skw(Context context, String str, int i, int i2, String str2) {
        this.f48302c = str;
        this.g = i;
        this.e = context;
        this.f48300a = i2;
        this.d = str2;
        this.f48301b = "";
    }

    public String d() {
        return this.f48301b;
    }

    public String c() {
        return this.f48302c;
    }

    public int i() {
        return this.g;
    }

    public int e() {
        return this.f48300a;
    }

    public void e(int i) {
        this.f48300a = i;
    }

    public String b() {
        return this.d;
    }

    public void c(int i) {
        this.g = i;
        if (this.e == null) {
            LogUtil.j("ManagementViewCardData", "mContext is null");
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(skw skwVar) {
        return i() > skwVar.i() ? 0 : -1;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof skw)) {
            return ((skw) obj).c().equals(c());
        }
        return false;
    }

    public int hashCode() {
        return i();
    }

    public String toString() {
        return " mNeedShow = " + e() + ", position = " + this.g + ", cardname = " + this.f48302c + ", cardId = " + this.d;
    }

    public skw a() {
        return new skw(this.e, c(), i(), e(), b(), d());
    }
}
