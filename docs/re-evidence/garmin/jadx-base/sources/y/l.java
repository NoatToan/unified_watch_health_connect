package y;

import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtraSupportedOutputSizeQuirk f192949a = (ExtraSupportedOutputSizeQuirk) x.c.f188202a.b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f192950b;

    public l(String str) {
        this.f192950b = new d(str);
    }

    public final Size[] a(Size[] sizeArr, int i14) {
        List arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = new ArrayList(Arrays.asList(sizeArr));
        if (this.f192949a != null) {
            Size[] sizeArr2 = (i14 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(DateTimeConstants.MINUTES_PER_DAY, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList5.addAll(Arrays.asList(sizeArr2));
            }
        }
        d dVar = this.f192950b;
        dVar.getClass();
        if (((ExcludedSupportedSizesQuirk) x.c.f188202a.b(ExcludedSupportedSizesQuirk.class)) == null) {
            arrayList = new ArrayList();
        } else {
            String str = dVar.f192941a;
            String str2 = Build.BRAND;
            if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                arrayList4 = new ArrayList();
                if (str.equals("0") && i14 == 256) {
                    arrayList4.add(new Size(4160, 3120));
                    arrayList4.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
                }
            } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                arrayList4 = new ArrayList();
                if (str.equals("0") && i14 == 256) {
                    arrayList4.add(new Size(4160, 3120));
                    arrayList4.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
                }
            } else {
                if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0") && (i14 == 34 || i14 == 35)) {
                        arrayList3.add(new Size(720, 720));
                        arrayList3.add(new Size(400, 400));
                    }
                } else if ("SAMSUNG".equalsIgnoreCase(str2) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0")) {
                        if (i14 == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i14 == 35) {
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && (i14 == 34 || i14 == 35)) {
                        arrayList3.add(new Size(3264, 2448));
                        arrayList3.add(new Size(3264, 1836));
                        arrayList3.add(new Size(2448, 2448));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if ("SAMSUNG".equalsIgnoreCase(str2) && "J7XELTE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0")) {
                        if (i14 == 34) {
                            arrayList3.add(new Size(4128, 3096));
                            arrayList3.add(new Size(4128, 2322));
                            arrayList3.add(new Size(3088, 3088));
                            arrayList3.add(new Size(3264, 2448));
                            arrayList3.add(new Size(3264, 1836));
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        } else if (i14 == 35) {
                            arrayList3.add(new Size(2048, 1536));
                            arrayList3.add(new Size(2048, 1152));
                            arrayList3.add(new Size(1920, 1080));
                        }
                    } else if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && (i14 == 34 || i14 == 35)) {
                        arrayList3.add(new Size(2576, 1932));
                        arrayList3.add(new Size(2560, DateTimeConstants.MINUTES_PER_DAY));
                        arrayList3.add(new Size(1920, 1920));
                        arrayList3.add(new Size(2048, 1536));
                        arrayList3.add(new Size(2048, 1152));
                        arrayList3.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0") && i14 == 256) {
                        arrayList3.add(new Size(9280, 6944));
                    }
                } else {
                    if (ExcludedSupportedSizesQuirk.g()) {
                        arrayList2 = new ArrayList();
                        if (i14 == 35) {
                            arrayList2.add(new Size(3840, 2160));
                            arrayList2.add(new Size(3264, 2448));
                            arrayList2.add(new Size(3200, 2400));
                            arrayList2.add(new Size(2688, 1512));
                            arrayList2.add(new Size(2592, 1944));
                            arrayList2.add(new Size(2592, 1940));
                            arrayList2.add(new Size(1920, DateTimeConstants.MINUTES_PER_DAY));
                        }
                    } else if (ExcludedSupportedSizesQuirk.f()) {
                        arrayList2 = new ArrayList();
                        if (i14 == 35) {
                            arrayList2.add(new Size(4032, 3024));
                            arrayList2.add(new Size(4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
                            arrayList2.add(new Size(3264, 2448));
                            arrayList2.add(new Size(3200, 2400));
                            arrayList2.add(new Size(3024, 3024));
                            arrayList2.add(new Size(2976, 2976));
                            arrayList2.add(new Size(2448, 2448));
                        }
                    } else {
                        arrayList = Collections.EMPTY_LIST;
                    }
                    arrayList = arrayList2;
                }
                arrayList = arrayList3;
            }
            arrayList = arrayList4;
        }
        if (!arrayList.isEmpty()) {
            arrayList5.removeAll(arrayList);
        }
        arrayList5.isEmpty();
        return (Size[]) arrayList5.toArray(new Size[0]);
    }
}
