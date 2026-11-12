package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 21)
public class vgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray<String> f36880a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SparseArray<String> f36881b = new SparseArray<>();
    public static SparseArray<String> c = new SparseArray<>();
    public static SparseArray<String> d = new SparseArray<>();

    public interface a {
        void a(MediaCodecInfo[] mediaCodecInfoArr);
    }

    public static final class b extends AsyncTask<String, Void, MediaCodecInfo[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f36882a;

        public b(a aVar) {
            this.f36882a = aVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaCodecInfo[] doInBackground(String... strArr) {
            return vgl.d(strArr[0]);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(MediaCodecInfo[] mediaCodecInfoArr) {
            this.f36882a.a(mediaCodecInfoArr);
        }
    }

    public static String a(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (f36881b.size() == 0 || c.size() == 0) {
            f();
        }
        int iIndexOfKey = f36881b.indexOfKey(codecProfileLevel.profile);
        String strValueAt = iIndexOfKey >= 0 ? f36881b.valueAt(iIndexOfKey) : null;
        int iIndexOfKey2 = c.indexOfKey(codecProfileLevel.level);
        String strValueAt2 = iIndexOfKey2 >= 0 ? c.valueAt(iIndexOfKey2) : null;
        if (strValueAt == null) {
            strValueAt = String.valueOf(codecProfileLevel.profile);
        }
        if (strValueAt2 == null) {
            strValueAt2 = String.valueOf(codecProfileLevel.level);
        }
        return strValueAt + '-' + strValueAt2;
    }

    @RequiresApi(api = 21)
    public static mqq b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Logger.d("Mapbox Util screen width:" + DisplayUtil.getScreenWidth() + " screen height:" + DisplayUtil.getScreenHeight(), new Object[0]);
        return new mqq(HMSedentaryConfig.INGORE_START_INDEX, 1600, 10000000, 60, 1, str, "video/avc", h("Default"));
    }

    public static File c(Context context, mqq mqqVar) {
        if (mqqVar == null) {
            return null;
        }
        File fileM = r72.m("TraceRecord");
        if (!fileM.exists() && !fileM.mkdirs()) {
            return null;
        }
        File file = new File(fileM, "Trace-" + new SimpleDateFormat("yyyyMMdd-HHmm", Locale.US).format(new Date()) + "-" + mqqVar.f27109a + "x" + mqqVar.f27110b + ".mp4");
        StringBuilder sb = new StringBuilder();
        sb.append("Create recorder with :");
        sb.append(mqqVar);
        sb.append(" \n ");
        sb.append(file);
        Logger.d(sb.toString(), new Object[0]);
        return file;
    }

    public static MediaCodecInfo[] d(String str) {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                try {
                    if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                        arrayList.add(mediaCodecInfo);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return (MediaCodecInfo[]) arrayList.toArray(new MediaCodecInfo[arrayList.size()]);
    }

    public static void e(String str, a aVar) {
        new b(aVar).execute(str);
    }

    public static void f() {
        SparseArray<String> sparseArray;
        for (Field field : MediaCodecInfo.CodecProfileLevel.class.getFields()) {
            if ((field.getModifiers() & 24) != 0) {
                String name = field.getName();
                if (name.startsWith("AVCProfile")) {
                    sparseArray = f36881b;
                } else if (name.startsWith("AVCLevel")) {
                    sparseArray = c;
                } else if (name.startsWith("AACObject")) {
                    sparseArray = f36880a;
                }
                try {
                    sparseArray.put(field.getInt(null), name);
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static <T> int g(SparseArray<T> sparseArray, T t) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            T tValueAt = sparseArray.valueAt(i);
            if (tValueAt == t || tValueAt.equals(t)) {
                return sparseArray.keyAt(i);
            }
        }
        return -1;
    }

    public static MediaCodecInfo.CodecProfileLevel h(String str) {
        String strSubstring;
        if (f36881b.size() == 0 || c.size() == 0 || f36880a.size() == 0) {
            f();
        }
        int iIndexOf = str.indexOf(45);
        if (iIndexOf > 0) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = str.substring(iIndexOf + 1);
            str = strSubstring2;
        } else {
            strSubstring = null;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        if (str.startsWith("AVC")) {
            codecProfileLevel.profile = g(f36881b, str);
        } else if (str.startsWith("AAC")) {
            codecProfileLevel.profile = g(f36880a, str);
        } else {
            try {
                codecProfileLevel.profile = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (strSubstring != null) {
            if (strSubstring.startsWith("AVC")) {
                codecProfileLevel.level = g(c, strSubstring);
            } else {
                try {
                    codecProfileLevel.level = Integer.parseInt(strSubstring);
                } catch (NumberFormatException unused2) {
                    return null;
                }
            }
        }
        if (codecProfileLevel.profile <= 0 || codecProfileLevel.level < 0) {
            return null;
        }
        return codecProfileLevel;
    }
}
