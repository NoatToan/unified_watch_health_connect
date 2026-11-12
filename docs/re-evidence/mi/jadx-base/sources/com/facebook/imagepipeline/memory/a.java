package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import defpackage.b6i;
import defpackage.j3i;
import defpackage.k3i;
import defpackage.spf;
import defpackage.v63;

/* JADX INFO: loaded from: classes4.dex */
public class a extends BasePool<byte[]> implements v63 {
    public final int[] j;

    public a(spf spfVar, j3i j3iVar, k3i k3iVar) {
        super(spfVar, j3iVar, k3iVar);
        SparseIntArray sparseIntArray = j3iVar.c;
        this.j = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.j[i] = sparseIntArray.keyAt(i);
        }
        n();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(byte[] bArr) {
        b6i.g(bArr);
        return bArr.length;
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
    public byte[] a(int i) {
        return new byte[i];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(byte[] bArr) {
        b6i.g(bArr);
    }
}
