package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import dj.y;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class c implements a.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f28529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi.b f28530b;

    public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, xi.b bVar) {
        this.f28529a = parcelFileDescriptorRewinder;
        this.f28530b = bVar;
    }

    @Override // com.bumptech.glide.load.a.e
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f28529a;
        y yVar = null;
        try {
            y yVar2 = new y(new FileInputStream(parcelFileDescriptorRewinder.b().getFileDescriptor()), this.f28530b);
            try {
                ImageHeaderParser.ImageType imageTypeD = imageHeaderParser.d(yVar2);
                yVar2.release();
                parcelFileDescriptorRewinder.b();
                return imageTypeD;
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
