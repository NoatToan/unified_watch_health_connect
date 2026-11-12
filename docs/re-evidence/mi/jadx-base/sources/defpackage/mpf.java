package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import miuix.appcompat.app.floatingactivity.multiapp.a;

/* JADX INFO: loaded from: classes3.dex */
public class mpf {
    public static Bitmap a(Bundle bundle) throws Throwable {
        HashMap map = (HashMap) bundle.getSerializable("parcelFile");
        int i = bundle.getInt("parcelFileLength");
        int i2 = bundle.getInt("key_width");
        int i3 = bundle.getInt("key_height");
        byte[] bArrB = b(map, i);
        Bitmap bitmapCreateBitmap = null;
        if (bArrB == null) {
            return null;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArrB));
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException | OutOfMemoryError unused) {
            return bitmapCreateBitmap;
        }
    }

    public static byte[] b(HashMap<String, ParcelFileDescriptor> map, int i) throws Throwable {
        FileInputStream fileInputStream;
        ParcelFileDescriptor parcelFileDescriptor = map.get("parcelFile");
        FileInputStream fileInputStream2 = null;
        if (parcelFileDescriptor != null) {
            byte[] bArr = new byte[i];
            try {
                fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    fileInputStream.read(bArr);
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused2) {
                    }
                    return bArr;
                } catch (Exception unused3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                        }
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused6) {
                        }
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused8) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    public static void c(a aVar, byte[] bArr, int i, int i2, int i3, String str, int i4) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorD = d(bArr, i);
        HashMap map = new HashMap(1);
        map.put("parcelFile", parcelFileDescriptorD);
        Bundle bundle = new Bundle();
        bundle.putSerializable("parcelFile", map);
        bundle.putInt("parcelFileLength", i);
        bundle.putInt("key_width", i2);
        bundle.putInt("key_height", i3);
        bundle.putInt("key_task_id", i4);
        bundle.putString("key_request_identity", str);
        if (aVar != null) {
            try {
                aVar.R4(7, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public static ParcelFileDescriptor d(byte[] bArr, int i) throws Throwable {
        MemoryFile memoryFile;
        MemoryFile memoryFile2 = null;
        parcelFileDescriptorDup = null;
        ParcelFileDescriptor parcelFileDescriptorDup = null;
        try {
            memoryFile = new MemoryFile("", i);
            try {
                memoryFile.writeBytes(bArr, 0, 0, i);
                Method declaredMethod = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
                declaredMethod.setAccessible(true);
                parcelFileDescriptorDup = ParcelFileDescriptor.dup((FileDescriptor) declaredMethod.invoke(memoryFile, new Object[0]));
            } catch (Exception unused) {
                if (memoryFile != null) {
                }
                return parcelFileDescriptorDup;
            } catch (Throwable th) {
                th = th;
                memoryFile2 = memoryFile;
                if (memoryFile2 != null) {
                    memoryFile2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            memoryFile = null;
        } catch (Throwable th2) {
            th = th2;
        }
        memoryFile.close();
        return parcelFileDescriptorDup;
    }
}
