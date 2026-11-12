package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class d9i implements b9i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b9i[] f15264a;

    public d9i(b9i... b9iVarArr) {
        this.f15264a = b9iVarArr;
    }

    @Override // defpackage.b9i
    public void println(int i, String str, String str2) {
        for (b9i b9iVar : this.f15264a) {
            b9iVar.println(i, str, str2);
        }
    }
}
