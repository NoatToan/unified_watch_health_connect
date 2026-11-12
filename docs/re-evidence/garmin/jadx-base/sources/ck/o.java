package ck;

import com.google.android.exoplayer2.DefaultLoadControl;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f27813b = k.SEARCH_TIMEOUT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27814a;

    public o(byte[] bArr) {
        this.f27814a = (int) ak.k.e(1, 1, bArr);
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[2];
        ak.k.g(0, 0, bArr);
        ak.k.f(1, 1, this.f27814a, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27813b;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        ak.h hVar;
        StringBuilder sb3 = new StringBuilder(h());
        sb3.append("\n  Search Timeout=");
        int i14 = this.f27814a * DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        if (i14 > 0) {
            ak.h hVar2 = ak.h.f3535c;
            int i15 = 0;
            while (true) {
                ak.h[] hVarArr = ak.h.f3536d;
                if (i15 >= hVarArr.length) {
                    hVar = hVar2;
                    break;
                }
                ak.h hVar3 = hVarArr[i15];
                if (i14 <= hVar3.f3538a * DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS) {
                    hVar = hVar3;
                    break;
                }
                i15++;
            }
        } else {
            hVar = ak.h.DISABLED;
        }
        sb3.append(hVar);
        return sb3.toString();
    }

    public o(ak.h hVar) {
        this.f27814a = hVar.f3538a;
    }
}
