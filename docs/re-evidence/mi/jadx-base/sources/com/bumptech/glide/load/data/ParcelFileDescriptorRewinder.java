package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.a<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InternalRewinder f6964a;

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f6965a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6965a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f6965a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f6965a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @RequiresApi(21)
    public static final class a implements com.bumptech.glide.load.data.a.InterfaceC0136a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.bumptech.glide.load.data.a<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6964a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.a
    @RequiresApi(21)
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() throws IOException {
        return this.f6964a.rewind();
    }
}
