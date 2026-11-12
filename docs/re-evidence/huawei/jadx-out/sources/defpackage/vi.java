package defpackage;

import com.careforeyou.library.enums.Protocal_Type;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class vi implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Protocal_Type f51139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51140c = -1;
    private String d;
    private int e;
    private int j;

    public Protocal_Type b() {
        return this.f51139b;
    }

    public void c(Protocal_Type protocal_Type) {
        this.f51139b = protocal_Type;
    }

    public int j() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public String a() {
        return this.f51138a;
    }

    public void a(String str) {
        this.f51138a = str;
    }

    public String d() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public int c() {
        return this.f51140c;
    }

    public void d(int i) {
        this.f51140c = i;
    }

    public int e() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }
}
