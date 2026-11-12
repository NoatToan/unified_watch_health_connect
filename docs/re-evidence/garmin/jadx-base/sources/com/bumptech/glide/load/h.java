package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import dj.y;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class h implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f28571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi.b f28572b;

    public h(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, xi.b bVar) {
        this.f28571a = parcelFileDescriptorRewinder;
        this.f28572b = bVar;
    }

    @Override // com.bumptech.glide.load.a.c
    public final boolean a(ImageHeaderParser imageHeaderParser) throws Throwable {
        xi.b bVar = this.f28572b;
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f28571a;
        y yVar = null;
        try {
            y yVar2 = new y(new FileInputStream(parcelFileDescriptorRewinder.b().getFileDescriptor()), bVar);
            try {
                boolean zB = imageHeaderParser.b(yVar2, bVar);
                yVar2.release();
                parcelFileDescriptorRewinder.b();
                return zB;
            } catch (Throwable th3) {
                th = th3;
                yVar = yVar2;
                if (yVar != null) {
                    yVar.release();
                }
                parcelFileDescriptorRewinder.b();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
