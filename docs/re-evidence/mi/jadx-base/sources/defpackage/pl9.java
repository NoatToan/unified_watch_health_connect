package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class pl9 extends rne<ParcelFileDescriptor> {
    public pl9(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.jl5
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.rne
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // defpackage.rne
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
