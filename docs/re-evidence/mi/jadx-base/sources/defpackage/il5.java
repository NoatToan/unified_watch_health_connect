package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.request.ImageRequest;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class il5 extends ake {
    public il5(n3i n3iVar) {
        super(fb3.a(), n3iVar);
    }

    public static byte[] g(String str) {
        b6i.b(str.substring(0, 5).equals("data:"));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        return h(str.substring(0, iIndexOf)) ? Base64.decode(strSubstring, 0) : Uri.decode(strSubstring).getBytes();
    }

    public static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] strArrSplit = str.split(";");
        return strArrSplit[strArrSplit.length - 1].equals(ViewShot.Results.BASE_64);
    }

    @Override // defpackage.ake
    public o98 d(ImageRequest imageRequest) throws IOException {
        byte[] bArrG = g(imageRequest.q().toString());
        return c(new ByteArrayInputStream(bArrG), bArrG.length);
    }

    @Override // defpackage.ake
    public String f() {
        return "DataFetchProducer";
    }
}
