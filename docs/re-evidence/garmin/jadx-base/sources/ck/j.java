package ck;

import com.google.android.exoplayer2.DefaultLoadControl;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27779b = k.LOW_PRIORITY_SEARCH_TIMEOUT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27780a;

    public j(byte[] bArr) {
        this.f27780a = (int) ak.k.e(1, 1, bArr);
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[2];
        ak.k.g(0, 0, bArr);
        ak.k.f(1, 1, this.f27780a, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27779b;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        ak.j jVar;
        StringBuilder sb3 = new StringBuilder(h());
        sb3.append("\n  Search Timeout=");
        int i14 = this.f27780a * DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        if (i14 > 0) {
            ak.j jVar2 = ak.j.f3553g;
            int i15 = 0;
            while (true) {
                ak.j[] jVarArr = ak.j.f3554h;
                if (i15 >= jVarArr.length) {
                    jVar = jVar2;
                    break;
                }
                ak.j jVar3 = jVarArr[i15];
                if (i14 <= jVar3.f3556a * DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS) {
                    jVar = jVar3;
                    break;
                }
                i15++;
            }
        } else {
            jVar = ak.j.DISABLED;
        }
        sb3.append(jVar);
        return sb3.toString();
    }

    public j(ak.j jVar) {
        this.f27780a = jVar.f3556a;
    }
}
