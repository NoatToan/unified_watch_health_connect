package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class kej extends pej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23777a = null;

    public String a() {
        return this.f23777a;
    }

    @Override // defpackage.pej, defpackage.oej
    public boolean isVirtual() {
        return true;
    }

    @iej(name = "text")
    public void setText(String str) {
        this.f23777a = str;
        markUpdated();
    }

    @Override // defpackage.pej
    public String toString() {
        return getViewClass() + " [text: " + this.f23777a + "]";
    }
}
