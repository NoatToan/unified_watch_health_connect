package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwidauth.datatype.ReadAllowListInfo;
import com.huawei.hwidauth.datatype.SiteDefaultInfo;
import com.huawei.hwidauth.datatype.SiteListInfo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class noz {
    private static SiteListInfo e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.BufferedReader] */
    public static String d(Context context) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        IOException e2;
        BufferedReader bufferedReader;
        UnsupportedEncodingException e3;
        try {
            try {
                inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("global_cfg_for_android_mobile.xml"), "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                            } else {
                                String string = sb.toString();
                                e(inputStreamReader, bufferedReader, null);
                                return string;
                            }
                        }
                    } catch (UnsupportedEncodingException e4) {
                        e3 = e4;
                        nox.a("IpCountryUtil", "UnsupportedEncodingException" + e3.getClass().getSimpleName(), true);
                        e(inputStreamReader, bufferedReader, null);
                        e(inputStreamReader, bufferedReader, null);
                        return "";
                    } catch (IOException e5) {
                        e2 = e5;
                        nox.a("IpCountryUtil", "IOException " + e2.getClass().getSimpleName(), true);
                        e(inputStreamReader, bufferedReader, null);
                        e(inputStreamReader, bufferedReader, null);
                        return "";
                    }
                } catch (UnsupportedEncodingException e6) {
                    e3 = e6;
                    bufferedReader = null;
                } catch (IOException e7) {
                    e2 = e7;
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    context = 0;
                    e(inputStreamReader, context, null);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (UnsupportedEncodingException e8) {
            e3 = e8;
            bufferedReader = null;
            inputStreamReader = null;
        } catch (IOException e9) {
            e2 = e9;
            bufferedReader = null;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            context = 0;
            inputStreamReader = null;
        }
    }

    private static void e(InputStreamReader inputStreamReader, BufferedReader bufferedReader, InputStream inputStream) {
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException e2) {
                nox.a("IpCountryUtil", "IOException" + e2.getClass().getSimpleName(), true);
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                nox.a("IpCountryUtil", "IOException" + e3.getClass().getSimpleName(), true);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                nox.a("IpCountryUtil", "IOException" + e4.getClass().getSimpleName(), true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.InputStreamReader] */
    public static String c(Context context) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        IOException e2;
        UnsupportedEncodingException e3;
        ?? r8;
        ?? r2 = 0;
        bufferedReader = null;
        bufferedReader = null;
        r2 = 0;
        bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                fileInputStream = new FileInputStream((context.getFilesDir().getCanonicalPath() + "/") + "global_cfg_for_android_mobile.xml");
                try {
                    context = new InputStreamReader(fileInputStream, "UTF-8");
                    try {
                        bufferedReader = new BufferedReader(context);
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    sb.append(line);
                                } else {
                                    String string = sb.toString();
                                    e(context, bufferedReader, fileInputStream);
                                    return string;
                                }
                            }
                        } catch (UnsupportedEncodingException e4) {
                            e3 = e4;
                            bufferedReader2 = bufferedReader;
                            nox.a("IpCountryUtil", "getFromDataFile UnsupportedEncodingException " + e3.getClass().getSimpleName(), true);
                            e(context, bufferedReader2, fileInputStream);
                            r8 = context;
                            e(r8, bufferedReader2, fileInputStream);
                            return "";
                        } catch (IOException e5) {
                            e2 = e5;
                            bufferedReader2 = bufferedReader;
                            nox.a("IpCountryUtil", "getFromDataFile IOException " + e2.getClass().getSimpleName(), true);
                            e(context, bufferedReader2, fileInputStream);
                            r8 = context;
                            e(r8, bufferedReader2, fileInputStream);
                            return "";
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = context;
                            e(r2, bufferedReader, fileInputStream);
                            throw th;
                        }
                    } catch (UnsupportedEncodingException e6) {
                        e3 = e6;
                    } catch (IOException e7) {
                        e2 = e7;
                    }
                } catch (UnsupportedEncodingException e8) {
                    e = e8;
                    e3 = e;
                    context = 0;
                    nox.a("IpCountryUtil", "getFromDataFile UnsupportedEncodingException " + e3.getClass().getSimpleName(), true);
                    e(context, bufferedReader2, fileInputStream);
                    r8 = context;
                    e(r8, bufferedReader2, fileInputStream);
                    return "";
                } catch (IOException e9) {
                    e = e9;
                    e2 = e;
                    context = 0;
                    nox.a("IpCountryUtil", "getFromDataFile IOException " + e2.getClass().getSimpleName(), true);
                    e(context, bufferedReader2, fileInputStream);
                    r8 = context;
                    e(r8, bufferedReader2, fileInputStream);
                    return "";
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                    e(r2, bufferedReader, fileInputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (UnsupportedEncodingException e10) {
            e = e10;
            fileInputStream = null;
        } catch (IOException e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            bufferedReader = null;
        }
    }

    private static void e(Context context, XmlPullParser xmlPullParser, SiteDefaultInfo siteDefaultInfo, ArrayList<String> arrayList, ArrayList<SiteListInfo> arrayList2, String str) {
        if ("site-list".equals(str)) {
            SiteDefaultInfo.a(xmlPullParser, siteDefaultInfo);
            return;
        }
        if ("domain".equals(str)) {
            ReadAllowListInfo.a(xmlPullParser, arrayList, str);
        } else if ("site".equals(str)) {
            SiteListInfo siteListInfo = new SiteListInfo();
            e = siteListInfo;
            SiteListInfo.a(xmlPullParser, siteListInfo, str);
            arrayList2.add(e);
        }
    }

    public static XmlPullParser c(Context context, String str, String str2) throws XmlPullParserException, IOException {
        int iB = b(context, str);
        int iB2 = b(context, str2);
        nox.a("IpCountryUtil", "parseSiteCountryXML xmlDataFileCode " + iB, true);
        nox.a("IpCountryUtil", "parseSiteCountryXML xmlAssetsFileCode " + iB2, true);
        if (iB < iB2) {
            nox.a("IpCountryUtil", "parseSiteCountryXML xmlDataFileCode < xmlAssetsFileCode", true);
            return nnn.c(str2.getBytes("UTF-8"));
        }
        nox.a("IpCountryUtil", "parseSiteCountryXML else ", true);
        return nnn.c(str.getBytes("UTF-8"));
    }

    public static void e(Context context, SiteDefaultInfo siteDefaultInfo, ArrayList<String> arrayList, ArrayList<SiteListInfo> arrayList2) throws XmlPullParserException, IOException {
        if (context == null) {
            nox.e("IpCountryUtil", "parseSiteCountryXML mContext == null", true);
            return;
        }
        nox.b("IpCountryUtil", "getFromDataFile", true);
        XmlPullParser xmlPullParserC = c(context, c(context), d(context));
        for (int eventType = xmlPullParserC.getEventType(); 1 != eventType; eventType = xmlPullParserC.next()) {
            String name = xmlPullParserC.getName();
            if (eventType == 2) {
                e(context, xmlPullParserC, siteDefaultInfo, arrayList, arrayList2, name);
            }
        }
    }

    private static int b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            nox.b("IpCountryUtil", "getXmlVersionCode context is null or xmlStr is empty", true);
            return 0;
        }
        try {
            try {
                XmlPullParser xmlPullParserC = nnn.c(str.getBytes("UTF-8"));
                for (int eventType = xmlPullParserC.getEventType(); 1 != eventType; eventType = xmlPullParserC.next()) {
                    String name = xmlPullParserC.getName();
                    if (2 == eventType && "Infos".equals(name)) {
                        for (int i = 0; i < xmlPullParserC.getAttributeCount(); i++) {
                            if ("version-code".equals(xmlPullParserC.getAttributeName(i))) {
                                try {
                                    return nnh.b(xmlPullParserC.getAttributeValue(i));
                                } catch (Exception e2) {
                                    nox.b("IpCountryUtil", "e = " + e2.getClass().getSimpleName(), true);
                                    return 0;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                nox.e("IpCountryUtil", "Exception " + e3.getClass().getSimpleName(), true);
            }
        } catch (UnsupportedEncodingException e4) {
            nox.e("IpCountryUtil", "UnsupportedEncodingException " + e4.getClass().getSimpleName(), true);
        } catch (IOException e5) {
            nox.e("IpCountryUtil", "IOException " + e5.getClass().getSimpleName(), true);
        } catch (XmlPullParserException e6) {
            nox.e("IpCountryUtil", "XmlPullParserException " + e6.getClass().getSimpleName(), true);
        }
        return 0;
    }

    public static boolean a(Context context, String str, String str2) {
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            context.deleteFile(str);
            fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
            return true;
        } catch (IOException unused) {
            nox.a("IpCountryUtil", "writeSMSAvailableCountryXML IOException", true);
            return false;
        } catch (FileNotFoundException unused2) {
            nox.a("IpCountryUtil", "writeSMSAvailableCountryXML FileNotFoundException", true);
            return false;
        } finally {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused3) {
                    nox.a("IpCountryUtil", "IOException", true);
                }
            }
        }
    }
}
