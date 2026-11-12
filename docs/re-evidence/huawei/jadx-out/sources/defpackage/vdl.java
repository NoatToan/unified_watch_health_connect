package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes19.dex */
public class vdl {
    public static String b(int i, Context context) {
        Context applicationContext = context.getApplicationContext();
        Double dValueOf = Double.valueOf(10.0d);
        Double dValueOf2 = Double.valueOf(4.4d);
        switch (i) {
            case 2008:
                return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_limosis_range, dValueOf2, Double.valueOf(7.0d));
            case 2009:
                return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_breakfast_range, dValueOf2, dValueOf);
            case 2010:
                return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_lunch_range, dValueOf2, dValueOf);
            case 2011:
                return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_lunch_range, dValueOf2, dValueOf);
            default:
                return d(i, applicationContext);
        }
    }

    private static String d(int i, Context context) {
        Double dValueOf = Double.valueOf(10.0d);
        Double dValueOf2 = Double.valueOf(4.4d);
        switch (i) {
            case 2012:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_dinner_range, dValueOf2, dValueOf);
            case 2013:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_dinner_range, dValueOf2, dValueOf);
            case 2014:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_sleep_range, dValueOf2, dValueOf);
            case 2015:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_night_range, dValueOf2, dValueOf);
            default:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_random_range, dValueOf2, dValueOf);
        }
    }

    public static String c(int i, Context context) {
        Context applicationContext = context.getApplicationContext();
        if (i != 2106) {
            switch (i) {
                case 2008:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_breakfast);
                case 2009:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_breakfast);
                case 2010:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_lunch);
                case 2011:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_lunch);
                case 2012:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_dinner);
                case 2013:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_dinner);
                case 2014:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_sleep);
                case 2015:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_early_morning);
                default:
                    return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_breakfast);
            }
        }
        return applicationContext.getString(R.string.IDS_hw_show_healthdata_bloodsugar_random_time);
    }

    public static String e(String str, String str2, String str3, String str4) throws Throwable {
        File[] fileArrListFiles;
        File file = new File(str2);
        String strD = null;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return null;
        }
        try {
            for (File file2 : fileArrListFiles) {
                String strReplace = file2.getName().replace("strings", "").replace(WatchFaceConstant.XML_SUFFIX, "");
                if (strReplace.contains(str4)) {
                    if (strReplace.contains(str3)) {
                        return d(file2.getCanonicalPath(), str);
                    }
                    if (strD == null) {
                        strD = d(file2.getCanonicalPath(), str);
                    }
                }
            }
            return strD == null ? d(fileArrListFiles[fileArrListFiles.length - 1].getCanonicalPath(), str) : strD;
        } catch (IOException unused) {
            LogUtil.e("StringUtil", "IOException");
            return null;
        }
    }

    public static String d(String str, String str2) throws Throwable {
        String str3;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        strD = null;
        strD = null;
        strD = null;
        String strD = null;
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                xmlPullParserFactoryNewInstance.setNamespaceAware(true);
                XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                fileInputStream = new FileInputStream(new File(str));
                try {
                    xmlPullParserNewPullParser.setInput(fileInputStream, "UTF-8");
                    for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                        if (eventType == 2 && "string".equals(xmlPullParserNewPullParser.getName())) {
                            strD = d(str2, xmlPullParserNewPullParser, xmlPullParserNewPullParser.getAttributeCount());
                            if (!TextUtils.isEmpty(strD)) {
                                break;
                            }
                        }
                    }
                    try {
                        fileInputStream.close();
                        return strD;
                    } catch (IOException unused) {
                        LogUtil.e("StringUtil", "close file stream error");
                        return strD;
                    }
                } catch (FileNotFoundException unused2) {
                    str3 = strD;
                    fileInputStream3 = fileInputStream;
                    LogUtil.e("StringUtil", "not find xml file");
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException unused3) {
                            LogUtil.e("StringUtil", "close file stream error");
                        }
                    }
                    return str3;
                } catch (IOException unused4) {
                    str3 = strD;
                    fileInputStream4 = fileInputStream;
                    LogUtil.e("StringUtil", "not read text");
                    if (fileInputStream4 != null) {
                        try {
                            fileInputStream4.close();
                        } catch (IOException unused5) {
                            LogUtil.e("StringUtil", "close file stream error");
                        }
                    }
                    return str3;
                } catch (XmlPullParserException unused6) {
                    str3 = strD;
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("StringUtil", "xml pull error");
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused7) {
                            LogUtil.e("StringUtil", "close file stream error");
                        }
                    }
                    return str3;
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused8) {
                            LogUtil.e("StringUtil", "close file stream error");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (FileNotFoundException unused9) {
            str3 = null;
        } catch (IOException unused10) {
            str3 = null;
        } catch (XmlPullParserException unused11) {
            str3 = null;
        }
    }

    private static String d(String str, XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        if (i == 1 && str.equals(xmlPullParser.getAttributeValue(0))) {
            return xmlPullParser.nextText();
        }
        return null;
    }
}
