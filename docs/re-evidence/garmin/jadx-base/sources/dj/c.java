package dj;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class c implements ui.k<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ui.g<Integer> f59810b = ui.g.b(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ui.g<Bitmap.CompressFormat> f59811c = ui.g.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.b f59812a;

    @Deprecated
    public c() {
        this.f59812a = null;
    }

    @Override // ui.k
    public final ui.c a(ui.h hVar) {
        return ui.c.TRANSFORMED;
    }

    @Override // ui.d
    public final boolean b(Object obj, File file, ui.h hVar) throws Throwable {
        boolean z14;
        Bitmap bitmap = (Bitmap) ((wi.u) obj).get();
        ui.g<Bitmap.CompressFormat> gVar = f59811c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(gVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i14 = qj.h.f144972a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) hVar.c(f59810b)).intValue();
        OutputStream cVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                xi.b bVar = this.f59812a;
                if (bVar != null) {
                    try {
                        cVar = new com.bumptech.glide.load.data.c(fileOutputStream, bVar);
                    } catch (IOException unused) {
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z14 = false;
                    } catch (Throwable th3) {
                        th = th3;
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    cVar = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, cVar);
                cVar.close();
                try {
                    cVar.close();
                } catch (IOException unused4) {
                }
                z14 = true;
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (IOException unused5) {
        } catch (Throwable th5) {
            th = th5;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            qj.m.c(bitmap);
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(hVar.c(gVar));
            bitmap.hasAlpha();
        }
        return z14;
    }

    public c(xi.b bVar) {
        this.f59812a = bVar;
    }
}
