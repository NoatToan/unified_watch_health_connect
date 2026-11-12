package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import defpackage.cch;
import defpackage.cq2;
import defpackage.d5f;
import defpackage.fak;
import defpackage.kqk;
import defpackage.lf8;
import defpackage.nj1;
import defpackage.tqk;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class c implements tqk<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f6989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj1 f6990b;

    public static class a implements com.bumptech.glide.load.resource.bitmap.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fak f6991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lf8 f6992b;

        public a(fak fakVar, lf8 lf8Var) {
            this.f6991a = fakVar;
            this.f6992b = lf8Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void a() {
            this.f6991a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a.b
        public void b(cq2 cq2Var, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f6992b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                cq2Var.a(bitmap);
                throw iOExceptionA;
            }
        }
    }

    public c(com.bumptech.glide.load.resource.bitmap.a aVar, nj1 nj1Var) {
        this.f6989a = aVar;
        this.f6990b = nj1Var;
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Bitmap> b(InputStream inputStream, int i, int i2, cch cchVar) throws IOException {
        boolean z;
        fak fakVar;
        if (inputStream instanceof fak) {
            fakVar = (fak) inputStream;
            z = false;
        } else {
            z = true;
            fakVar = new fak(inputStream, this.f6990b);
        }
        lf8 lf8VarB = lf8.b(fakVar);
        try {
            return this.f6989a.f(new d5f(lf8VarB), i, i2, cchVar, new a(fakVar, lf8VarB));
        } finally {
            lf8VarB.c();
            if (z) {
                fakVar.c();
            }
        }
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, cch cchVar) {
        return this.f6989a.p(inputStream);
    }
}
