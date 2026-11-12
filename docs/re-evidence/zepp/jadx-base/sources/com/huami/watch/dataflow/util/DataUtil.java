package com.huami.watch.dataflow.util;

import android.text.TextUtils;
import android.util.Base64;
import com.huami.watch.dataflow.model.Dated;
import com.huami.watch.dataflow.model.health.bean.HealthHRDataItem;
import com.huami.watch.util.Log;
import com.huami.watch.util.ZipUtil;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DataUtil {
    private static final String a = "DataFlow-DataUtil";
    private static final String b = "<!@@%C%&&!>";

    public class a implements Comparator<Dated> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Dated dated, Dated dated2) {
            return dated.getDate().compareTo(dated2.getDate());
        }
    }

    public class b implements Comparator<HealthHRDataItem> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(HealthHRDataItem healthHRDataItem, HealthHRDataItem healthHRDataItem2) {
            return (int) (healthHRDataItem2.getTimestamp() - healthHRDataItem.getTimestamp());
        }
    }

    public static String decodeAndUnzipRawData(String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str) && !"<!@@%C%&&!>".equals(str)) {
            try {
                str2 = str.startsWith("<!@@%C%&&!>") ? new String(ZipUtil.unGZip(Base64.decode(str.substring(11, str.length() - 1), 0))) : new String(Base64.decode(str, 0));
            } catch (Exception e) {
                Log.w(a, "DecodeB64&UnGzipRawDataErr", e, new Object[0]);
            }
            Log.d(a, "RawData Decoded: " + str2, new Object[0]);
        }
        return str2;
    }

    public static void sort(List<? extends Dated> list) {
        Collections.sort(list, new a());
    }

    public static void sortHRItems(List<HealthHRDataItem> list) {
        Collections.sort(list, new b());
    }

    public static String unzipRawData(byte[] bArr) {
        String str;
        try {
            str = new String(ZipUtil.unGZip(bArr), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.w(a, "UnzipRawDataErr", e, new Object[0]);
            str = null;
        }
        Log.v(a, "RawData Unzipped: " + str, new Object[0]);
        return str;
    }
}
