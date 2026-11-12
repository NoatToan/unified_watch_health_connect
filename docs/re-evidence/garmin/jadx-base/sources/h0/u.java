package h0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.ImageCaptureException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private u() {
    }

    public static Uri a(File file, File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    public static Uri b(File file, b0.l0.h hVar) throws Throwable {
        Uri uriInsert;
        int i14;
        ContentValues contentValues;
        ContentResolver contentResolver = hVar.f14029b;
        Objects.requireNonNull(contentResolver);
        ContentValues contentValues2 = hVar.f14031d;
        ContentValues contentValues3 = contentValues2 != null ? new ContentValues(contentValues2) : new ContentValues();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            contentValues3.put("is_pending", (Integer) 1);
        }
        try {
            try {
                uriInsert = contentResolver.insert(hVar.f14030c, contentValues3);
                try {
                    if (uriInsert == null) {
                        throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
                    }
                    d(file, uriInsert, contentResolver);
                    if (i15 >= 29) {
                        ContentValues contentValues4 = new ContentValues();
                        if (i15 >= 29) {
                            contentValues4.put("is_pending", (Integer) 0);
                        }
                        contentResolver.update(uriInsert, contentValues4, null, null);
                    }
                    return uriInsert;
                } catch (IOException e4) {
                    e = e4;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uriInsert, e);
                } catch (SecurityException e14) {
                    e = e14;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uriInsert, e);
                }
            } catch (Throwable th3) {
                th = th3;
                if (hVar != 0 && (i14 = Build.VERSION.SDK_INT) >= 29) {
                    contentValues = new ContentValues();
                    if (i14 >= 29) {
                        contentValues.put("is_pending", (Integer) 0);
                    }
                    contentResolver.update(hVar, contentValues, null, null);
                }
                throw th;
            }
        } catch (IOException e15) {
            e = e15;
            uriInsert = null;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uriInsert, e);
        } catch (SecurityException e16) {
            e = e16;
            uriInsert = null;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uriInsert, e);
        } catch (Throwable th4) {
            th = th4;
            hVar = 0;
            if (hVar != 0) {
                contentValues = new ContentValues();
                if (i14 >= 29) {
                    contentValues.put("is_pending", (Integer) 0);
                }
                contentResolver.update(hVar, contentValues, null, null);
            }
            throw th;
        }
    }

    public static void c(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i14 = fileInputStream.read(bArr);
                if (i14 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i14);
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void d(File file, Uri uri, ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                c(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th3) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static File e(b0.l0.h hVar) throws ImageCaptureException {
        try {
            File file = hVar.f14028a;
            if (file == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            String parent = file.getParent();
            StringBuilder sb3 = new StringBuilder("CameraX");
            sb3.append(UUID.randomUUID().toString());
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            sb3.append(iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "");
            return new File(parent, sb3.toString());
        } catch (IOException e4) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e4);
        }
    }

    public static Uri f(File file, b0.l0.h hVar) {
        Uri uriA = null;
        try {
            try {
                if (hVar.f14030c == null || hVar.f14029b == null || hVar.f14031d == null) {
                    OutputStream outputStream = hVar.f14032e;
                    if (outputStream != null) {
                        Objects.requireNonNull(outputStream);
                        c(file, outputStream);
                    } else {
                        File file2 = hVar.f14028a;
                        if (file2 != null) {
                            Objects.requireNonNull(file2);
                            uriA = a(file, file2);
                        }
                    }
                } else {
                    uriA = b(file, hVar);
                }
                file.delete();
                return uriA;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th3) {
            file.delete();
            throw th3;
        }
    }
}
