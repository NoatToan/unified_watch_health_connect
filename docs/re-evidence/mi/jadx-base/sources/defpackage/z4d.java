package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class z4d extends mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y4d f40870b;

    public z4d(String str, y4d y4dVar) {
        this.f40870b = y4dVar;
        l(str);
    }

    @Override // defpackage.mb2, defpackage.hbi
    public void i(String str, String str2, boolean z) {
        y4d y4dVar = this.f40870b;
        if (y4dVar != null) {
            y4dVar.a(this.f40869a, a5d.a(str2), z);
        }
    }

    public void l(String str) {
        this.f40869a = str;
    }
}
