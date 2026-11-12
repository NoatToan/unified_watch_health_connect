package defpackage;

import android.os.Parcel;
import android.util.Base64;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class lm1 {
    public static List<AudioAttributes> a(String str) {
        if (str.contains("{") && str.contains("}")) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(StandardCharsets.UTF_8), 8);
            FitnessLogUtils.i("DB_Trans", "stringToAudioAttrList: bytes length = " + bArrDecode.length);
            if (bArrDecode.length >= 1048576) {
                return Collections.emptyList();
            }
            parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
            parcelObtain.setDataPosition(0);
            LinkedList linkedList = new LinkedList();
            parcelObtain.readTypedList(linkedList, AudioAttributes.CREATOR);
            return linkedList;
        } catch (Exception e) {
            FitnessLogUtils.e("DB_Trans", "stringToAudioAttrList error", e);
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }
}
