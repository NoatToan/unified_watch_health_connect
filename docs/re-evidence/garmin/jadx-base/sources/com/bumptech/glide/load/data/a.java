package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends l<AssetFileDescriptor> {
    public a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.l
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.l
    public final Object e(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        boolean z14 = this.f28558a;
        ContentResolver contentResolver2 = this.f28560c;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z14 || !vi.b.a(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR) : MediaStore.openAssetFileDescriptor(contentResolver2, uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, null);
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException(am.j.j(uri, "FileDescriptor is null for: "));
    }

    public a(ContentResolver contentResolver, Uri uri, boolean z14) {
        super(contentResolver, uri, z14);
    }
}
