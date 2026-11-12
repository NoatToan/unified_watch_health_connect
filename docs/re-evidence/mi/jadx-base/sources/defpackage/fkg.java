package defpackage;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.network.FileExtension;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class fkg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vjg f17874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qte f17875b;

    public fkg(vjg vjgVar, qte qteVar) {
        this.f17874a = vjgVar;
        this.f17875b = qteVar;
    }

    public final lse a(Context context, String str, String str2) {
        vjg vjgVar;
        Pair<FileExtension, InputStream> pairA;
        if (str2 == null || (vjgVar = this.f17874a) == null || (pairA = vjgVar.a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        tte<lse> tteVarY = fileExtension == FileExtension.ZIP ? use.y(context, new ZipInputStream(inputStream), str2) : use.o(inputStream, str2);
        if (tteVarY.b() != null) {
            return tteVarY.b();
        }
        return null;
    }

    public final tte<lse> b(Context context, String str, String str2) {
        rpe.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                kte kteVarA = this.f17875b.a(str);
                if (!kteVarA.isSuccessful()) {
                    tte<lse> tteVar = new tte<>(new IllegalArgumentException(kteVarA.F()));
                    try {
                        kteVarA.close();
                    } catch (IOException e) {
                        rpe.d("LottieFetchResult close failed ", e);
                    }
                    return tteVar;
                }
                tte<lse> tteVarD = d(context, str, kteVarA.Y(), kteVarA.X(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(tteVarD.b() != null);
                rpe.a(sb.toString());
                try {
                    kteVarA.close();
                } catch (IOException e2) {
                    rpe.d("LottieFetchResult close failed ", e2);
                }
                return tteVarD;
            } catch (Exception e3) {
                tte<lse> tteVar2 = new tte<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        rpe.d("LottieFetchResult close failed ", e4);
                    }
                }
                return tteVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    rpe.d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    public tte<lse> c(Context context, String str, String str2) {
        lse lseVarA = a(context, str, str2);
        if (lseVarA != null) {
            return new tte<>(lseVarA);
        }
        rpe.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }

    public final tte<lse> d(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        tte<lse> tteVarF;
        FileExtension fileExtension;
        vjg vjgVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            rpe.a("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            tteVarF = f(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else {
            rpe.a("Received json response.");
            fileExtension = FileExtension.JSON;
            tteVarF = e(str, inputStream, str3);
        }
        if (str3 != null && tteVarF.b() != null && (vjgVar = this.f17874a) != null) {
            vjgVar.f(str, fileExtension);
        }
        return tteVarF;
    }

    public final tte<lse> e(String str, InputStream inputStream, String str2) throws IOException {
        vjg vjgVar;
        return (str2 == null || (vjgVar = this.f17874a) == null) ? use.o(inputStream, null) : use.o(new FileInputStream(vjgVar.g(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    public final tte<lse> f(Context context, String str, InputStream inputStream, String str2) throws IOException {
        vjg vjgVar;
        return (str2 == null || (vjgVar = this.f17874a) == null) ? use.y(context, new ZipInputStream(inputStream), null) : use.y(context, new ZipInputStream(new FileInputStream(vjgVar.g(str, inputStream, FileExtension.ZIP))), str);
    }
}
