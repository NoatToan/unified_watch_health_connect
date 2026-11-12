package defpackage;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.network.LottieFetchResult;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes21.dex */
public class hf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hg f36697c;
    private final LottieNetworkFetcher e;

    public hf(hg hgVar, LottieNetworkFetcher lottieNetworkFetcher) {
        this.f36697c = hgVar;
        this.e = lottieNetworkFetcher;
    }

    public ee<cx> a(Context context, String str, String str2) {
        cx cxVarD = d(context, str, str2);
        if (cxVarD != null) {
            return new ee<>(cxVarD);
        }
        iy.b("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }

    private cx d(Context context, String str, String str2) {
        hg hgVar;
        Pair<FileExtension, InputStream> pairC;
        ee<cx> eeVarA;
        if (str2 == null || (hgVar = this.f36697c) == null || (pairC = hgVar.c(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) pairC.first;
        InputStream inputStream = (InputStream) pairC.second;
        int i = AnonymousClass3.e[fileExtension.ordinal()];
        if (i == 1) {
            eeVarA = da.a(context, new ZipInputStream(inputStream), str2);
        } else if (i == 2) {
            try {
                eeVarA = da.e(new GZIPInputStream(inputStream), str2);
            } catch (IOException e) {
                eeVarA = new ee<>(e);
            }
        } else {
            eeVarA = da.e(inputStream, str2);
        }
        if (eeVarA.c() != null) {
            return eeVarA.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: hf$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[FileExtension.values().length];
            e = iArr;
            try {
                iArr[FileExtension.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[FileExtension.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ee<cx> b(Context context, String str, String str2) {
        iy.b("Fetching " + str);
        LottieFetchResult lottieFetchResult = null;
        try {
            try {
                LottieFetchResult lottieFetchResultFetchSync = this.e.fetchSync(str);
                if (!lottieFetchResultFetchSync.isSuccessful()) {
                    ee<cx> eeVar = new ee<>(new IllegalArgumentException(lottieFetchResultFetchSync.error()));
                    if (lottieFetchResultFetchSync != null) {
                        try {
                            lottieFetchResultFetchSync.close();
                            return eeVar;
                        } catch (IOException e) {
                            iy.b("LottieFetchResult close failed ", e);
                        }
                    }
                    return eeVar;
                }
                ee<cx> eeVarE = e(context, str, lottieFetchResultFetchSync.bodyByteStream(), lottieFetchResultFetchSync.contentType(), str2);
                StringBuilder sb = new StringBuilder("Completed fetch from network. Success: ");
                sb.append(eeVarE.c() != null);
                iy.b(sb.toString());
                if (lottieFetchResultFetchSync != null) {
                    try {
                        lottieFetchResultFetchSync.close();
                        return eeVarE;
                    } catch (IOException e2) {
                        iy.b("LottieFetchResult close failed ", e2);
                    }
                }
                return eeVarE;
            } catch (Exception e3) {
                ee<cx> eeVar2 = new ee<>(e3);
                if (0 != 0) {
                    try {
                        lottieFetchResult.close();
                    } catch (IOException e4) {
                        iy.b("LottieFetchResult close failed ", e4);
                    }
                }
                return eeVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    lottieFetchResult.close();
                } catch (IOException e5) {
                    iy.b("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    private ee<cx> e(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        ee<cx> eeVarC;
        FileExtension fileExtension;
        hg hgVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            iy.b("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            eeVarC = c(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            iy.b("Handling gzip response.");
            fileExtension = FileExtension.GZIP;
            eeVarC = e(str, inputStream, str3);
        } else {
            iy.b("Received json response.");
            fileExtension = FileExtension.JSON;
            eeVarC = a(str, inputStream, str3);
        }
        if (str3 != null && eeVarC.c() != null && (hgVar = this.f36697c) != null) {
            hgVar.a(str, fileExtension);
        }
        return eeVarC;
    }

    private ee<cx> c(Context context, String str, InputStream inputStream, String str2) throws IOException {
        hg hgVar;
        if (str2 == null || (hgVar = this.f36697c) == null) {
            return da.a(context, new ZipInputStream(inputStream), (String) null);
        }
        return da.a(context, new ZipInputStream(new FileInputStream(hgVar.c(str, inputStream, FileExtension.ZIP))), str);
    }

    private ee<cx> e(String str, InputStream inputStream, String str2) throws IOException {
        hg hgVar;
        if (str2 == null || (hgVar = this.f36697c) == null) {
            return da.e(new GZIPInputStream(inputStream), (String) null);
        }
        return da.e(new GZIPInputStream(new FileInputStream(hgVar.c(str, inputStream, FileExtension.GZIP))), str);
    }

    private ee<cx> a(String str, InputStream inputStream, String str2) throws IOException {
        hg hgVar;
        if (str2 == null || (hgVar = this.f36697c) == null) {
            return da.e(inputStream, (String) null);
        }
        return da.e(new FileInputStream(hgVar.c(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }
}
