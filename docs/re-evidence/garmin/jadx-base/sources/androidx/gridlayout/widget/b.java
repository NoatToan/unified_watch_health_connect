package androidx.gridlayout.widget;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridLayout.i[] f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GridLayout.i[][] f7525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f7526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GridLayout.k f7527e;

    public b(GridLayout.k kVar, GridLayout.i[] iVarArr) {
        this.f7527e = kVar;
        int length = iVarArr.length;
        this.f7523a = new GridLayout.i[length];
        this.f7524b = length - 1;
        int iF = kVar.f() + 1;
        GridLayout.i[][] iVarArr2 = new GridLayout.i[iF][];
        int[] iArr = new int[iF];
        for (GridLayout.i iVar : iVarArr) {
            int i14 = iVar.f7463a.f7495a;
            iArr[i14] = iArr[i14] + 1;
        }
        for (int i15 = 0; i15 < iF; i15++) {
            iVarArr2[i15] = new GridLayout.i[iArr[i15]];
        }
        Arrays.fill(iArr, 0);
        for (GridLayout.i iVar2 : iVarArr) {
            int i16 = iVar2.f7463a.f7495a;
            GridLayout.i[] iVarArr3 = iVarArr2[i16];
            int i17 = iArr[i16];
            iArr[i16] = i17 + 1;
            iVarArr3[i17] = iVar2;
        }
        this.f7525c = iVarArr2;
        this.f7526d = new int[this.f7527e.f() + 1];
    }

    public final void a(int i14) {
        int[] iArr = this.f7526d;
        if (iArr[i14] != 0) {
            return;
        }
        iArr[i14] = 1;
        for (GridLayout.i iVar : this.f7525c[i14]) {
            a(iVar.f7463a.f7496b);
            int i15 = this.f7524b;
            this.f7524b = i15 - 1;
            this.f7523a[i15] = iVar;
        }
        iArr[i14] = 2;
    }
}
