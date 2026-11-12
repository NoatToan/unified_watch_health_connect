package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import dj.y;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class e implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f28563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi.b f28564b;

    public e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, xi.b bVar) {
        this.f28563a = parcelFileDescriptorRewinder;
        this.f28564b = bVar;
    }

    @Override // com.bumptech.glide.load.a.d
    public final int a(ImageHeaderParser imageHeaderParser) throws Throwable {
        xi.b bVar = this.f28564b;
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f28563a;
        y yVar = null;
        try {
            y yVar2 = new y(new FileInputStream(parcelFileDescriptorRewinder.b().getFileDescriptor()), bVar);
            try {
                int iA = imageHeaderParser.a(yVar2, bVar);
                yVar2.release();
                parcelFileDescriptorRewinder.b();
                return iA;
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
