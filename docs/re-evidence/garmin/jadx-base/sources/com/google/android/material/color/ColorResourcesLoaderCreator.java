package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import com.google.android.exoplayer2.source.mediaparser.b;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    public static ResourcesLoader create(Context context, Map<Integer, Integer> map) {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrCreate = ColorResourcesTableCreator.create(context, map);
            int length = bArrCreate.length;
            if (bArrCreate.length != 0) {
                try {
                    fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                    if (fileDescriptorMemfd_create != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                            try {
                                fileOutputStream.write(bArrCreate);
                                ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                                try {
                                    b.r();
                                    ResourcesLoader resourcesLoaderI = b.i();
                                    resourcesLoaderI.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                                    if (parcelFileDescriptorDup != null) {
                                        parcelFileDescriptorDup.close();
                                    }
                                    fileOutputStream.close();
                                    Os.close(fileDescriptorMemfd_create);
                                    return resourcesLoaderI;
                                } catch (Throwable th3) {
                                    if (parcelFileDescriptorDup != null) {
                                        try {
                                            parcelFileDescriptorDup.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            if (fileDescriptorMemfd_create != null) {
                                Os.close(fileDescriptorMemfd_create);
                            }
                            throw th;
                        }
                    }
                    if (fileDescriptorMemfd_create != null) {
                        Os.close(fileDescriptorMemfd_create);
                        return null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    fileDescriptorMemfd_create = null;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
