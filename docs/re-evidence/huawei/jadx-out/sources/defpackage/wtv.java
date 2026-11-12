package defpackage;

import android.view.View;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class wtv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f52482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View.OnClickListener f52483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f52484c;
    private Object d;
    private List<String> e;
    private String j;

    public Object c() {
        return this.d;
    }

    public void e(Object obj) {
        this.d = obj;
    }

    public String g() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    public List<String> e() {
        return this.e;
    }

    public void e(List<String> list) {
        this.e = list;
    }

    public View.OnClickListener b() {
        return this.f52483b;
    }

    public void a(View.OnClickListener onClickListener) {
        this.f52483b = onClickListener;
    }

    public long a() {
        return this.f52482a;
    }

    public void a(long j) {
        this.f52482a = j;
    }

    public View.OnClickListener d() {
        return this.f52484c;
    }

    public void d(View.OnClickListener onClickListener) {
        this.f52484c = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtv)) {
            return false;
        }
        wtv wtvVar = (wtv) obj;
        return this.f52482a == wtvVar.f52482a && Objects.equals(this.d, wtvVar.d) && Objects.equals(this.j, wtvVar.j) && Objects.equals(this.e, wtvVar.e);
    }

    public int hashCode() {
        return Objects.hash(this.d, this.j, this.e, Long.valueOf(this.f52482a));
    }
}
