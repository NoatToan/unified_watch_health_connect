package defpackage;

import com.huawei.devicesdk.entity.CharacterOperationType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cmd {
    private String d;
    private String e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<cmb> f1761b = new ArrayList(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharacterOperationType f1760a = CharacterOperationType.WRITE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1762c = 0;
    private int i = 0;

    public CharacterOperationType c() {
        return this.f1760a;
    }

    public void a(CharacterOperationType characterOperationType) {
        this.f1760a = characterOperationType;
    }

    public List<cmb> a() {
        return this.f1761b;
    }

    public void e(List<cmb> list) {
        this.f1761b = list;
    }

    public String d() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public String e() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public int b() {
        return this.f1762c;
    }

    public void e(int i) {
        this.f1762c = i;
    }

    public int h() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }
}
