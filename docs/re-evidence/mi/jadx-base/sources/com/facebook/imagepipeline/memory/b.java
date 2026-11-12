package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import defpackage.b6i;
import defpackage.j3i;
import defpackage.jpf;
import defpackage.k3i;
import defpackage.spf;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends BasePool<jpf> {
    public final int[] j;

    public b(spf spfVar, j3i j3iVar, k3i k3iVar) {
        super(spfVar, j3iVar, k3iVar);
        SparseIntArray sparseIntArray = j3iVar.c;
        this.j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                n();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(jpf jpfVar) {
        b6i.g(jpfVar);
        return jpfVar.getSize();
    }

    public int B() {
        return this.j[0];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean p(jpf jpfVar) {
        b6i.g(jpfVar);
        return !jpfVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int i(int i) {
        if (i <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int k(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract jpf a(int i);

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(jpf jpfVar) {
        b6i.g(jpfVar);
        jpfVar.close();
    }
}
