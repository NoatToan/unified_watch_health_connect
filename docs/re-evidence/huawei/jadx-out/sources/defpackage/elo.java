package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes7.dex */
public class elo {
    private static ArrayList<String> d = new ArrayList<>(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, int[]> f33142b = new HashMap<>(10);
    private static HashMap<String, Integer> e = new HashMap<>(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, Double> f33141a = new HashMap<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, double[]> f33143c = new HashMap<>(10);
    private static HashMap<String, String> j = new HashMap<>(10);
    private static HashMap<String, String[]> f = new HashMap<>(10);

    static {
        e.put("IDS_device_Loop_bind_1", 3);
        f33141a.put("IDS_DEVICE_EASY_TO_READ_2052_334", Double.valueOf(3.5d));
        e.put("IDS_DEVICE_CON_43_41", 30);
        e.put("IDS_DEVICE_1212_314_41", 3);
        e.put("IDS_DEVICE_MAKE_SURE_TH_2960_41", 2);
        e.put("IDS_DEVICE_DATA_STORAGE_1950_169", 500);
        e.put("IDS_DEVICE_ELECTRONIC_I_766_226", 7);
        e.put("IDS_DEVICE_HOLD_TRANSFE_275_784", 2);
        e.put("IDS_device_omron9200_silent_guid_text_2", 2);
        e.put("IDS_device_auto_read_omron_introductions_2", 2);
        e.put("IDS_device_auto_read_omron_introductions_3", 3);
        e.put("IDS_device_auto_read_yolanda_introduction_1", 1);
        e.put("IDS_device_auto_read_johnson_introductions_2", 2);
        e.put("IDS_device_auto_read_honor_scale_introduction_2", 2);
        e.put("IDS_device_hygride_bind_fail_prompt_2", 1);
        e.put("IDS_device_hygride_pair_fail_prompt_2", 2);
        e.put("IDS_device_hygride_bind_fail_prompt_1", 1);
        e.put("IDS_device_bluetooth_scale_bind_fail_prompt_2", 2);
        e.put("IDS_device_hygride_wlan_fail_prompt_1", 1);
        e.put("IDS_device_hygride_wlan_fail_prompt_2", 2);
        int[] iArr = {1, 2};
        int[] iArr2 = {2, 3};
        int[] iArr3 = {50, 3};
        int[] iArr4 = {3, 2, 3};
        e.put("IDS_DEVICE_1UL_MICRO_BL_990_317", 1);
        f33142b.put("IDS_DEVICE_EN3_43_169", iArr3);
        f33142b.put("IDS_DEVICE_THE_PHONE_WI_5660_41", new int[]{8, 3});
        f33142b.put("IDS_device_guid_omron9200_text_1", iArr2);
        f33142b.put("IDS_DEVICE_CUFF_IS_2_3C_324_829", iArr2);
        f33142b.put("IDS_device_omron9200_silent_guid_text_1", iArr);
        f33142b.put("IDS_device_auto_read_omron_introductions_1", new int[]{1, 3});
        f33142b.put("IDS_device_auto_read_omron_introductions_4", iArr4);
        f33142b.put("IDS_device_auto_read_omron_introductions_5", new int[]{4, 2, 3});
        f33142b.put("IDS_device_auto_read_yuwell_introductions_1", iArr);
        f33142b.put("IDS_device_auto_read_yolanda_introduction_2", new int[]{2, 30});
        f33142b.put("IDS_device_auto_read_yolanda_introduction_3", new int[]{3, 10, 80});
        f33142b.put("IDS_device_auto_read_johnson_introductions_1", iArr);
        f33142b.put("IDS_device_auto_read_johnson_introductions_3", iArr4);
        f33142b.put("IDS_device_introductionactivity_yolanda_introduction_2", iArr3);
        if (Utils.o()) {
            f33142b.put("IDS_device_hygride_scale_description_1", new int[]{10, 12});
            e.put("IDS_device_huawei_body_fat_scale_description_2", 10);
            e.put("IDS_device_honor_scale_description_1", 11);
        } else {
            f33142b.put("IDS_device_hygride_scale_description_1", new int[]{14, 15});
            e.put("IDS_device_huawei_body_fat_scale_description_2", 12);
            e.put("IDS_device_honor_scale_description_1", 14);
        }
        f33142b.put("IDS_device_hygride_measure_fail_prompt_3", new int[]{3, 20, 20});
        f33142b.put("IDS_device_herm_measure_fail_prompt_3", new int[]{3, 10, 10});
        f33142b.put("IDS_device_hag2021_measure_fail_prompt_3", new int[]{3, 10, 10});
        f33142b.put("IDS_device_hagrid_b29_meausre_new", new int[]{1, 2, 3, 4});
        f33142b.put("IDS_device_hagrid_b19_meausre_new", new int[]{1, 2, 3, 4});
        f33142b.put("IDS_DEVICE_2_USERS_99_668_849", new int[]{2, 99});
        int[] iArr5 = {1, 2, 3};
        f33142b.put("IDS_device_measure_pressure_guide_prompt", iArr5);
        f33142b.put("IDS_DEVICE_PRESS_THE_ST_931_543", iArr5);
        f33141a.put("IDS_device_8806_fest_2", Double.valueOf(0.5d));
        f33141a.put("IDS_device_8806_desc_1", Double.valueOf(0.5d));
        f33142b.put("IDS_device_8806_desc_4", new int[]{12, 1, 15});
        f33142b.put("IDS_device_BP_RBP56_DRBP_HRBP_measure_1", iArr2);
        int[] iArr6 = {600, 15};
        f33142b.put("IDS_device_A9_SH_T9119A_01_fest_2", iArr6);
        f33142b.put("IDS_device_A9_SH_T9119A_01_desc_2", iArr6);
        f33142b.put("IDS_device_A9_SH_T9119A_01_desc_3", new int[]{1, 16});
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0059: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:18:0x0059 */
    public static Bitmap c(String str) throws Throwable {
        InputStream inputStreamOpenRawResource;
        InputStream inputStream;
        Bitmap bitmapDecodeStream;
        InputStream inputStream2 = null;
        try {
            try {
                if (new File(str).exists()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inInputShareable = true;
                    bitmapDecodeStream = BitmapFactory.decodeFile(str, options);
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    options2.inPurgeable = true;
                    options2.inInputShareable = true;
                    inputStreamOpenRawResource = dxw.d().getResources().openRawResource(a("hw_device_default"));
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options2);
                        inputStream2 = inputStreamOpenRawResource;
                    } catch (Exception unused) {
                        LogUtil.e("ResourceLoader", "loadImage Exception");
                        IoUtils.c(inputStreamOpenRawResource);
                        return null;
                    }
                }
                IoUtils.c(inputStream2);
                return bitmapDecodeStream;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                IoUtils.c(inputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            inputStreamOpenRawResource = null;
        } catch (Throwable th2) {
            th = th2;
            IoUtils.c(inputStream2);
            throw th;
        }
    }

    public static String a(String str, String str2) {
        return b(str, str2, "");
    }

    public static String b(String str, String str2, String str3) {
        String string = "";
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (Utils.o() && !((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiWspScaleProduct(str)) {
            try {
                string = dxw.d().getResources().getString(d(str2));
                if (!TextUtils.isEmpty(string.trim())) {
                    return string;
                }
            } catch (Resources.NotFoundException e2) {
                LogUtil.e("ResourceLoader", "nameKey:", str2, " is not found for String.xml ", e2.getMessage());
            }
        }
        return a(str, str2, string, str3);
    }

    private static String a(String str, String str2, String str3, String str4) throws Throwable {
        InputStream fileInputStream;
        int length;
        NamedNodeMap attributes;
        Node namedItem;
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            emm.d(documentBuilderFactoryNewInstance);
        } catch (ParserConfigurationException e2) {
            LogUtil.e("ResourceLoader", "ResourceLoader getStringFormat e:", e2.getMessage());
        }
        InputStream inputStream = null;
        inputStream = null;
        inputStream = null;
        InputStream inputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(CommonUtil.c(elg.e().a(str, str4)));
                try {
                    NodeList childNodes = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(fileInputStream).getDocumentElement().getChildNodes();
                    if (childNodes == null) {
                        IoUtils.c(fileInputStream);
                        return null;
                    }
                    int i = 0;
                    while (true) {
                        length = childNodes.getLength();
                        if (i >= length) {
                            break;
                        }
                        Node nodeItem = childNodes.item(i);
                        if (nodeItem.getNodeType() == 1 && (attributes = nodeItem.getAttributes()) != null && (namedItem = attributes.getNamedItem("name")) != null && str2 != null && str2.equals(namedItem.getNodeValue())) {
                            str3 = nodeItem.getTextContent().replace("\\n", System.lineSeparator());
                        }
                        i++;
                    }
                    IoUtils.c(fileInputStream);
                    inputStream = length;
                } catch (IOException e3) {
                    e = e3;
                    inputStream2 = fileInputStream;
                    LogUtil.e("ResourceLoader", "getStringFormat", e.getMessage());
                    IoUtils.c(inputStream2);
                    inputStream = inputStream2;
                } catch (ParserConfigurationException e4) {
                    e = e4;
                    inputStream2 = fileInputStream;
                    LogUtil.e("ResourceLoader", "getStringFormat", e.getMessage());
                    IoUtils.c(inputStream2);
                    inputStream = inputStream2;
                } catch (SAXException e5) {
                    e = e5;
                    inputStream2 = fileInputStream;
                    LogUtil.e("ResourceLoader", "getStringFormat", e.getMessage());
                    IoUtils.c(inputStream2);
                    inputStream = inputStream2;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = inputStream;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (ParserConfigurationException e7) {
            e = e7;
        } catch (SAXException e8) {
            e = e8;
        }
        String strA = a(str, str2, str3);
        return TextUtils.isEmpty(strA) ? str3 : strA;
    }

    public static int d(String str) {
        return dxw.d().getResources().getIdentifier(str, "string", dxw.d().getPackageName());
    }

    public static int a(String str) {
        return dxw.d().getResources().getIdentifier(str, "drawable", dxw.d().getPackageName());
    }

    private static String a(String str, String str2, String str3) {
        if (e.containsKey(str2)) {
            return e(e.get(str2).intValue(), 1, 0, str3);
        }
        if (f33141a.containsKey(str2)) {
            return e(f33141a.get(str2).doubleValue(), 1, 1, str3);
        }
        if (j.containsKey(str2)) {
            if (j.get(str2).equals("default")) {
                String strF = qrs.f(dxw.d());
                if (!strF.isEmpty()) {
                    return String.format(Locale.ENGLISH, str3, strF);
                }
                return "";
            }
            return String.format(Locale.ROOT, str3, j.get(str2));
        }
        if (f33142b.containsKey(str2)) {
            d.clear();
            if (str2.equals("IDS_device_hygride_measure_fail_prompt_3") && str.equals("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
                str2 = "IDS_device_hag2021_measure_fail_prompt_3";
            }
            for (int i : f33142b.get(str2)) {
                d.add(UnitUtil.e(i, 1, 0));
            }
            String strE = e(str3);
            return strE != null ? strE : "";
        }
        if (f.containsKey(str2)) {
            d.clear();
            for (String str4 : f.get(str2)) {
                if (str4.equals("default")) {
                    d.add(qrs.f(dxw.d()));
                } else {
                    d.add(str4);
                }
            }
            String strE2 = e(str3);
            return strE2 != null ? strE2 : "";
        }
        LogUtil.j("ResourceLoader", "ResourceLoader stringFormat nameKey :", str2);
        return "";
    }

    private static String e(String str) {
        int size = d.size();
        if (size == 2) {
            return String.format(Locale.ROOT, str, d.get(0), d.get(1));
        }
        if (size == 3) {
            return String.format(Locale.ROOT, str, d.get(0), d.get(1), d.get(2));
        }
        if (size == 4) {
            return String.format(Locale.ROOT, str, d.get(0), d.get(1), d.get(2), d.get(3));
        }
        LogUtil.j("ResourceLoader", "getFormatString default");
        return "";
    }

    private static String e(double d2, int i, int i2, String str) {
        String strE = UnitUtil.e(d2, i, i2);
        if (!strE.isEmpty()) {
            return String.format(Locale.ROOT, str, strE);
        }
        return "";
    }

    public static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.put(str, Integer.valueOf(i));
    }

    public static void a(String str, double d2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f33141a.put(str, Double.valueOf(d2));
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j.put(str, str2);
    }

    public static void e(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr == null || iArr.length == 0) {
            return;
        }
        f33142b.put(str, iArr);
    }

    public static void c(String str, double[] dArr) {
        if (TextUtils.isEmpty(str) || dArr == null || dArr.length == 0) {
            return;
        }
        f33143c.put(str, dArr);
    }

    public static void a(String str, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            return;
        }
        f.put(str, strArr);
    }
}
