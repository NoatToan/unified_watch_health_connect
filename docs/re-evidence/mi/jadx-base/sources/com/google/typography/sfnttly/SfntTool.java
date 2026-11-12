package com.google.typography.sfnttly;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.a;
import com.google.typography.font.sfntly.table.core.j;
import com.xiaomi.onetrack.OneTrack;
import defpackage.aa7;
import defpackage.d8c;
import defpackage.emr;
import defpackage.r0b;
import defpackage.tzo;
import defpackage.vkk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/google/typography/sfnttly/SfntTool;", "", "()V", "eot", "", "mtx", "nIter", "", "strip", "woff", "subsetFontFile", "fontFile", "Ljava/io/File;", "subsetString", "", "outputFile", "nIters", "Builder", "sfnttly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SfntTool {
    private boolean eot;
    private boolean mtx;
    private int nIter = 1;
    private boolean strip;
    private boolean woff;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0000J\u0006\u0010\b\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/google/typography/sfnttly/SfntTool$Builder;", "", "()V", "eot", "", "mtx", "nIter", "", "strip", "woff", OneTrack.Param.BUILD, "Lcom/google/typography/sfnttly/SfntTool;", "convert2EOT", "convert2WOFF", "setBenchMark", "setEOTCompress", "sfnttly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private boolean eot;
        private boolean mtx;
        private int nIter = 1;
        private boolean strip;
        private boolean woff;

        @NotNull
        public final SfntTool build() {
            SfntTool sfntTool = new SfntTool();
            sfntTool.nIter = this.nIter;
            sfntTool.woff = this.woff;
            sfntTool.eot = this.eot;
            sfntTool.mtx = this.mtx;
            sfntTool.strip = this.strip;
            return sfntTool;
        }

        @NotNull
        public final Builder convert2EOT() {
            this.eot = true;
            return this;
        }

        @NotNull
        public final Builder convert2WOFF() {
            this.woff = true;
            return this;
        }

        @NotNull
        public final Builder setBenchMark(int nIter) {
            this.nIter = nIter;
            return this;
        }

        @NotNull
        public final Builder setEOTCompress() {
            this.mtx = true;
            return this;
        }

        @NotNull
        public final Builder strip() {
            this.strip = true;
            return this;
        }
    }

    public static /* synthetic */ boolean subsetFontFile$default(SfntTool sfntTool, File file, String str, File file2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return sfntTool.subsetFontFile(file, str, file2, i);
    }

    public final boolean subsetFontFile(@NotNull File fontFile, @NotNull String subsetString, @NotNull File outputFile, int nIters) {
        Font fontA;
        int i = 4;
        Intrinsics.checkNotNullParameter(fontFile, "fontFile");
        Intrinsics.checkNotNullParameter(subsetString, "subsetString");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        a aVarB = a.b();
        try {
            FileInputStream fileInputStream = new FileInputStream(fontFile);
            try {
                byte[] bArr = new byte[(int) fontFile.length()];
                fileInputStream.read(bArr);
                Font[] fontArrF = aVarB.f(bArr);
                if (fontArrF.length == 0) {
                    CloseableKt.closeFinally(fileInputStream, null);
                    return false;
                }
                Font font = fontArrF[0];
                ArrayList arrayList = new ArrayList();
                arrayList.add(j.d.c);
                int i2 = 0;
                while (i2 < nIters) {
                    if (subsetString != null) {
                        vkk vkkVar = new vkk(font, aVarB);
                        vkkVar.c(arrayList, 1);
                        vkkVar.d(r0b.c(font, subsetString));
                        HashSet hashSet = new HashSet();
                        hashSet.add(Integer.valueOf(tzo.u));
                        hashSet.add(Integer.valueOf(tzo.v));
                        hashSet.add(Integer.valueOf(tzo.w));
                        hashSet.add(Integer.valueOf(tzo.B));
                        hashSet.add(Integer.valueOf(tzo.A));
                        hashSet.add(Integer.valueOf(tzo.G));
                        hashSet.add(Integer.valueOf(tzo.E));
                        hashSet.add(Integer.valueOf(tzo.C));
                        hashSet.add(Integer.valueOf(tzo.y));
                        hashSet.add(Integer.valueOf(tzo.F));
                        byte[] bArr2 = new byte[i];
                        // fill-array-data instruction
                        bArr2[0] = 109;
                        bArr2[1] = 111;
                        bArr2[2] = 114;
                        bArr2[3] = 116;
                        hashSet.add(Integer.valueOf(tzo.c(bArr2)));
                        byte[] bArr3 = new byte[i];
                        // fill-array-data instruction
                        bArr3[0] = 109;
                        bArr3[1] = 111;
                        bArr3[2] = 114;
                        bArr3[3] = 120;
                        hashSet.add(Integer.valueOf(tzo.c(bArr3)));
                        vkkVar.e(hashSet);
                        fontA = vkkVar.g().a();
                    } else {
                        fontA = font;
                    }
                    if (this.strip) {
                        d8c d8cVar = new d8c(fontA, aVarB);
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(Integer.valueOf(tzo.f35227k));
                        hashSet2.add(Integer.valueOf(tzo.n));
                        hashSet2.add(Integer.valueOf(tzo.j));
                        hashSet2.add(Integer.valueOf(tzo.A));
                        hashSet2.add(Integer.valueOf(tzo.E));
                        hashSet2.add(Integer.valueOf(tzo.C));
                        hashSet2.add(Integer.valueOf(tzo.y));
                        hashSet2.add(Integer.valueOf(tzo.F));
                        d8cVar.e(hashSet2);
                        fontA = d8cVar.g().a();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
                    if (this.woff) {
                        new emr().f(fontA).k(fileOutputStream);
                    } else if (this.eot) {
                        new aa7(this.mtx).b(fontA).k(fileOutputStream);
                    } else {
                        aVarB.j(fontA, fileOutputStream);
                    }
                    i2++;
                    i = 4;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileInputStream, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        e.printStackTrace();
        return false;
    }
}
