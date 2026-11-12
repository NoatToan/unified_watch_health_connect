package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes43.dex */
public class uhb {
    public static List<ugx> a(String str) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        LogUtil.a("ParserHelper", "parseXml start");
        ArrayList arrayList = new ArrayList(10);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ParserHelper", "parseXml filePath is empty");
            return arrayList;
        }
        FileInputStream fileInputStream2 = null;
        bufferedReader = null;
        bufferedReader = null;
        InputStreamReader inputStreamReader2 = null;
        BufferedReader bufferedReader2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        b(arrayList, bufferedReader);
                        IoUtils.c(fileInputStream);
                    } catch (IOException | XmlPullParserException unused) {
                        bufferedReader2 = bufferedReader;
                        try {
                            LogUtil.e("ParserHelper", "parseXml XmlPullParserException | IOException");
                            IoUtils.c(fileInputStream);
                            bufferedReader = bufferedReader2;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            fileInputStream2 = fileInputStream;
                            IoUtils.c(fileInputStream2);
                            IoUtils.c(inputStreamReader);
                            IoUtils.c(bufferedReader);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader2 = inputStreamReader;
                        inputStreamReader = inputStreamReader2;
                        fileInputStream2 = fileInputStream;
                        IoUtils.c(fileInputStream2);
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(bufferedReader);
                        throw th;
                    }
                } catch (IOException | XmlPullParserException unused2) {
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                }
            } catch (IOException | XmlPullParserException unused3) {
                inputStreamReader = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
            }
        } catch (IOException | XmlPullParserException unused4) {
            inputStreamReader = null;
            fileInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
            bufferedReader = null;
            IoUtils.c(fileInputStream2);
            IoUtils.c(inputStreamReader);
            IoUtils.c(bufferedReader);
            throw th;
        }
        IoUtils.c(inputStreamReader);
        IoUtils.c(bufferedReader);
        LogUtil.a("ParserHelper", "parseXml end");
        return arrayList;
    }

    private static void b(List<ugx> list, BufferedReader bufferedReader) throws XmlPullParserException, IOException {
        StringBuilder sb = new StringBuilder(16);
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                break;
            } else {
                sb.append((char) i);
            }
        }
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(sb.toString()));
        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
            if (eventType == 2) {
                if ("data".equals(xmlPullParserNewPullParser.getName())) {
                    ugx ugxVar = new ugx();
                    ugxVar.b(xmlPullParserNewPullParser.getAttributeValue("", "content"));
                    ugxVar.c(xmlPullParserNewPullParser.getAttributeValue("", "id"));
                    ugxVar.e(xmlPullParserNewPullParser.getAttributeValue("", "url"));
                    try {
                        ugxVar.e(Integer.parseInt(xmlPullParserNewPullParser.getAttributeValue("", "size")));
                    } catch (NumberFormatException unused) {
                        LogUtil.e("ParserHelper", "parseXmlData NumberFormatException");
                    }
                    ugxVar.a(xmlPullParserNewPullParser.getAttributeValue("", "name"));
                    list.add(ugxVar);
                } else {
                    LogUtil.a("ParserHelper", "XmlPullParser.START_TAG and parser.getName() not equals data");
                }
            }
        }
    }
}
