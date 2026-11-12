package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class wh3 {
    public static String a(ih3 ih3Var, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) ih3Var.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) ih3Var.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    public static List<String> b(fd3 fd3Var, xh3 xh3Var) throws InitializationException {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(fd3Var.c().d());
            if (xh3Var == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                strA = a(fd3Var.c(), xh3Var.d(), listAsList);
            } catch (IllegalStateException unused) {
                strA = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : listAsList) {
                if (!str.equals(strA)) {
                    arrayList2.add(fd3Var.e(str));
                }
            }
            Iterator<ch3> it2 = xh3Var.b(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((dh3) it2.next()).a());
            }
            return arrayList;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(bi3.a(e));
        } catch (CameraUnavailableException e2) {
            throw new InitializationException(e2);
        }
    }
}
