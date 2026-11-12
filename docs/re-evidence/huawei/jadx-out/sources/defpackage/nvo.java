package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import health.compact.a.IoUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes11.dex */
public class nvo {

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43822b = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43821a = -1;
        public List<e> e = null;
        public boolean d = false;

        public static class b {
            public String d = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List<String> f43823c = null;
        }

        public static class c {
            public String d = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List<String> f43824b = null;
        }

        public static class e {
            public String d = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f43826b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List<c> f43827c = null;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public List<b> f43825a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x003f A[PHI: r6 r7
      0x003f: PHI (r6v4 int) = (r6v3 int), (r6v3 int), (r6v9 int) binds: [B:23:0x0063, B:24:0x0065, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r7v5 java.io.ByteArrayOutputStream) = (r7v4 java.io.ByteArrayOutputStream), (r7v4 java.io.ByteArrayOutputStream), (r7v8 java.io.ByteArrayOutputStream) binds: [B:23:0x0063, B:24:0x0065, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public static a b(Context context, String str, String str2, String str3, String str4) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        a aVarE;
        LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer serverUri = ", str, ", languageName = ", str2, ", newLanguageName = ", str3);
        InputStream inputStreamD = null;
        int iD = -1;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    iD = d(context, str, byteArrayOutputStream);
                    LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer statusCode = ", Integer.valueOf(iD));
                    if (iD == 200) {
                        e(byteArrayOutputStream, str4);
                        inputStreamD = d(byteArrayOutputStream);
                        aVarE = e(inputStreamD, str2, str3);
                    } else {
                        aVarE = null;
                    }
                } catch (IOException e) {
                    e = e;
                    LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
                    if (byteArrayOutputStream != null || iD != 200) {
                        aVarE = null;
                    }
                    IoUtils.c(byteArrayOutputStream);
                    IoUtils.c(inputStreamD);
                    return aVarE;
                } catch (URISyntaxException e2) {
                    e = e2;
                    LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
                    if (byteArrayOutputStream != null) {
                    }
                    aVarE = null;
                    IoUtils.c(byteArrayOutputStream);
                    IoUtils.c(inputStreamD);
                    return aVarE;
                }
            } catch (Throwable th) {
                th = th;
                if (byteArrayOutputStream != null && iD == 200) {
                    e(byteArrayOutputStream, str4);
                    inputStreamD = d(byteArrayOutputStream);
                    e(inputStreamD, str2, str3);
                }
                IoUtils.c(byteArrayOutputStream);
                IoUtils.c(inputStreamD);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
            LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
            if (byteArrayOutputStream != null) {
            }
            aVarE = null;
            IoUtils.c(byteArrayOutputStream);
            IoUtils.c(inputStreamD);
            return aVarE;
        } catch (URISyntaxException e4) {
            e = e4;
            byteArrayOutputStream = null;
            LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
            if (byteArrayOutputStream != null) {
            }
            aVarE = null;
            IoUtils.c(byteArrayOutputStream);
            IoUtils.c(inputStreamD);
            return aVarE;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                e(byteArrayOutputStream, str4);
                inputStreamD = d(byteArrayOutputStream);
                e(inputStreamD, str2, str3);
            }
            IoUtils.c(byteArrayOutputStream);
            IoUtils.c(inputStreamD);
            throw th;
        }
        IoUtils.c(byteArrayOutputStream);
        IoUtils.c(inputStreamD);
        return aVarE;
    }

    private static void e(ByteArrayOutputStream byteArrayOutputStream, String str) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStreamOpenOutputStream;
        BufferedReader bufferedReader;
        OutputStreamWriter outputStreamWriter;
        InputStreamReader inputStreamReader;
        BufferedWriter bufferedWriter;
        LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer changeLogFilePath=", str);
        InputStream inputStreamD = d(byteArrayOutputStream);
        BufferedWriter bufferedWriter2 = null;
        bufferedReader = null;
        inputStreamReader = null;
        BufferedReader bufferedReader2 = null;
        inputStreamReader = null;
        bufferedWriter2 = null;
        InputStreamReader inputStreamReader2 = null;
        try {
            File file = new File(str);
            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
            try {
                if (file.createNewFile()) {
                    LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer createNewFile");
                }
                outputStreamWriter = new OutputStreamWriter(fileOutputStreamOpenOutputStream, "UTF-8");
                try {
                    bufferedWriter = new BufferedWriter(outputStreamWriter);
                    try {
                        inputStreamReader = new InputStreamReader(inputStreamD, "UTF-8");
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    LogUtil.a("AppPullChangeLogGetXml", "readerLine" + line);
                                    bufferedWriter.write(line + "\n");
                                    bufferedWriter.flush();
                                } catch (IOException unused) {
                                    inputStreamReader2 = inputStreamReader;
                                    try {
                                        LogUtil.a("AppPullChangeLogGetXml", "saveChangeLog IOException");
                                        IoUtils.c(bufferedWriter);
                                        IoUtils.c(outputStreamWriter);
                                        IoUtils.c(bufferedReader);
                                        IoUtils.c(inputStreamReader2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStreamReader = inputStreamReader2;
                                        bufferedWriter2 = bufferedWriter;
                                        IoUtils.c(bufferedWriter2);
                                        IoUtils.c(outputStreamWriter);
                                        IoUtils.c(bufferedReader);
                                        IoUtils.c(inputStreamReader);
                                        IoUtils.c(fileOutputStreamOpenOutputStream);
                                        IoUtils.c(inputStreamD);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bufferedReader2 = bufferedReader;
                                    bufferedReader = bufferedReader2;
                                    bufferedWriter2 = bufferedWriter;
                                    IoUtils.c(bufferedWriter2);
                                    IoUtils.c(outputStreamWriter);
                                    IoUtils.c(bufferedReader);
                                    IoUtils.c(inputStreamReader);
                                    IoUtils.c(fileOutputStreamOpenOutputStream);
                                    IoUtils.c(inputStreamD);
                                    throw th;
                                }
                            }
                            IoUtils.c(bufferedWriter);
                            IoUtils.c(outputStreamWriter);
                            IoUtils.c(bufferedReader);
                            IoUtils.c(inputStreamReader);
                        } catch (IOException unused2) {
                            bufferedReader = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th5) {
                        th = th5;
                        inputStreamReader = null;
                    }
                } catch (IOException unused4) {
                    bufferedReader = null;
                    bufferedWriter = null;
                } catch (Throwable th6) {
                    th = th6;
                    bufferedReader = null;
                    inputStreamReader = null;
                    IoUtils.c(bufferedWriter2);
                    IoUtils.c(outputStreamWriter);
                    IoUtils.c(bufferedReader);
                    IoUtils.c(inputStreamReader);
                    IoUtils.c(fileOutputStreamOpenOutputStream);
                    IoUtils.c(inputStreamD);
                    throw th;
                }
            } catch (IOException unused5) {
                bufferedReader = null;
                outputStreamWriter = null;
                bufferedWriter = null;
                LogUtil.a("AppPullChangeLogGetXml", "saveChangeLog IOException");
                IoUtils.c(bufferedWriter);
                IoUtils.c(outputStreamWriter);
                IoUtils.c(bufferedReader);
                IoUtils.c(inputStreamReader2);
                IoUtils.c(fileOutputStreamOpenOutputStream);
                IoUtils.c(inputStreamD);
            } catch (Throwable th7) {
                th = th7;
                bufferedReader = null;
                outputStreamWriter = null;
                inputStreamReader = null;
                IoUtils.c(bufferedWriter2);
                IoUtils.c(outputStreamWriter);
                IoUtils.c(bufferedReader);
                IoUtils.c(inputStreamReader);
                IoUtils.c(fileOutputStreamOpenOutputStream);
                IoUtils.c(inputStreamD);
                throw th;
            }
        } catch (IOException unused6) {
            fileOutputStreamOpenOutputStream = null;
        } catch (Throwable th8) {
            th = th8;
            fileOutputStreamOpenOutputStream = null;
        }
        IoUtils.c(fileOutputStreamOpenOutputStream);
        IoUtils.c(inputStreamD);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[ADDED_TO_REGION] */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0040: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x0040 */
    public static a d(Context context, String str, String str2, String str3) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        LogUtil.d("AppPullChangeLogGetXml", "getChangeLogFromServer serverUri = ", str, ", languageName = ", str2, ", newLanguageName = ", str3);
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        aVarE = null;
        a aVarE = null;
        int iD = -1;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    iD = d(context, str, byteArrayOutputStream);
                    LogUtil.d("AppPullChangeLogGetXml", "getChangeLogFromServer statusCode = ", Integer.valueOf(iD));
                    a aVarE2 = iD == 200 ? e(d(byteArrayOutputStream), str2, str3) : null;
                    IoUtils.c(byteArrayOutputStream);
                    return aVarE2;
                } catch (IOException e) {
                    e = e;
                    LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
                    if (byteArrayOutputStream != null && iD == 200) {
                        aVarE = e(d(byteArrayOutputStream), str2, str3);
                    }
                    IoUtils.c(byteArrayOutputStream);
                    return aVarE;
                } catch (URISyntaxException e2) {
                    e = e2;
                    LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
                    if (byteArrayOutputStream != null) {
                        aVarE = e(d(byteArrayOutputStream), str2, str3);
                    }
                    IoUtils.c(byteArrayOutputStream);
                    return aVarE;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream3 = byteArrayOutputStream2;
                if (byteArrayOutputStream3 != null && -1 == 200) {
                    e(d(byteArrayOutputStream3), str2, str3);
                }
                IoUtils.c(byteArrayOutputStream3);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
            LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
            if (byteArrayOutputStream != null) {
                aVarE = e(d(byteArrayOutputStream), str2, str3);
            }
            IoUtils.c(byteArrayOutputStream);
            return aVarE;
        } catch (URISyntaxException e4) {
            e = e4;
            byteArrayOutputStream = null;
            LogUtil.a("AppPullChangeLogGetXml", "getChangeLogFromServer Exception", ExceptionUtils.c(e));
            if (byteArrayOutputStream != null) {
                aVarE = e(d(byteArrayOutputStream), str2, str3);
            }
            IoUtils.c(byteArrayOutputStream);
            return aVarE;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream3 != null) {
                e(d(byteArrayOutputStream3), str2, str3);
            }
            IoUtils.c(byteArrayOutputStream3);
            throw th;
        }
    }

    private static InputStream d(ByteArrayOutputStream byteArrayOutputStream) {
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = 0;
        while (i < byteArray.length && byteArray[i] != 60) {
            i++;
        }
        byte[] bArr = new byte[byteArray.length - i];
        System.arraycopy(byteArray, i, bArr, 0, byteArray.length - i);
        return new ByteArrayInputStream(bArr);
    }

    private static int d(Context context, String str, OutputStream outputStream) throws URISyntaxException, IOException {
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        try {
            HttpGet httpGet = new HttpGet(str);
            nuw.aq_(httpGet, defaultHttpClient, context);
            HttpParams params = httpGet.getParams();
            params.setIntParameter("http.socket.timeout", 20000);
            params.setIntParameter("http.connection.timeout", 20000);
            HttpProtocolParams.setUserAgent(params, nuw.k());
            int iAr_ = ar_(defaultHttpClient, httpGet, outputStream);
            httpGet.abort();
            LogUtil.d("AppPullChangeLogGetXml", "getXMLStreamFromServer statusCode = ", Integer.valueOf(iAr_), ", request abort");
            return iAr_;
        } catch (IllegalArgumentException e) {
            ReleaseLogUtil.a("AppPullChangeLogGetXml", "IllegalArgumentException exception :", health.compact.a.LogUtil.c(e));
            return -1;
        }
    }

    private static int ar_(HttpClient httpClient, HttpGet httpGet, OutputStream outputStream) {
        int statusCode = -1;
        try {
            HttpResponse httpResponseExecute = httpClient.execute(httpGet);
            statusCode = httpResponseExecute.getStatusLine().getStatusCode();
            LogUtil.d("AppPullChangeLogGetXml", "getXMLStreamFromServerExecute statusCode = ", Integer.valueOf(statusCode));
            if (outputStream != null) {
                httpResponseExecute.getEntity().writeTo(outputStream);
            }
            return statusCode;
        } catch (IOException unused) {
            LogUtil.e("AppPullChangeLogGetXml", "getXmlStreamFromServerExecute IOException");
            return statusCode;
        }
    }

    public static a e(InputStream inputStream, String str, String str2) {
        a aVar;
        if (inputStream == null) {
            LogUtil.j("AppPullChangeLogGetXml", "buildChangeLogXml inputStream is null");
            return null;
        }
        LogUtil.d("AppPullChangeLogGetXml", "buildChangeLogXml begin");
        boolean z = false;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            if (xmlPullParserNewPullParser == null) {
                LogUtil.j("AppPullChangeLogGetXml", "buildChangeLogXml parser exception,pullParser is null");
                return null;
            }
            xmlPullParserNewPullParser.setInput(inputStream, "UTF-8");
            c cVarA = new d(xmlPullParserNewPullParser, str, str2).a();
            aVar = cVarA.f43828b;
            try {
                z = cVarA.f43829c;
            } catch (XmlPullParserException unused) {
                LogUtil.e("AppPullChangeLogGetXml", "buildChangeLogXml, XmlPullParserException");
            } catch (Exception unused2) {
                LogUtil.e("AppPullChangeLogGetXml", "buildChangeLogXml, Exception");
            }
            if (z) {
                return aVar;
            }
            LogUtil.e("AppPullChangeLogGetXml", "buildChangeLogXml, fail");
            return null;
        } catch (XmlPullParserException unused3) {
            aVar = null;
        } catch (Exception unused4) {
            aVar = null;
        }
    }

    static class d {
        private XmlPullParser k;
        private String l;
        private String m;
        private String n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f43832c = null;
        private String d = null;
        private String e = null;
        private boolean f = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43831b = -1;
        private a.e i = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<a.e> f43830a = null;
        private a.c g = null;
        private List<String> h = null;
        private String j = "";
        private a.b t = null;
        private List<String> s = null;
        private String p = "";
        private c o = new c();

        d(XmlPullParser xmlPullParser, String str, String str2) {
            this.k = xmlPullParser;
            this.l = str;
            this.m = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c a() throws XmlPullParserException {
            int eventType = this.k.getEventType();
            this.o.f43828b = null;
            this.o.f43829c = false;
            while (eventType != 1) {
                try {
                    String name = this.k.getName();
                    this.n = name;
                    LogUtil.d("AppPullChangeLogGetXml", "parse eventType = ", Integer.valueOf(eventType), ", nodeName = ", name);
                    if (eventType == 2) {
                        n();
                    } else if (eventType == 3) {
                        g();
                    }
                    eventType = this.k.next();
                } catch (IOException unused) {
                    LogUtil.e("AppPullChangeLogGetXml", "ChangeLogParser.parse, IOException");
                } catch (XmlPullParserException unused2) {
                    LogUtil.e("AppPullChangeLogGetXml", "ChangeLogParser.parse, XmlPullParserException");
                }
            }
            this.o.f43828b = this.f43832c;
            return this.o;
        }

        private void n() throws XmlPullParserException, IOException {
            if ("cleardata-flag".equalsIgnoreCase(this.n)) {
                this.k.next();
                boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(this.k.getText());
                this.f = zEqualsIgnoreCase;
                LogUtil.d("AppPullChangeLogGetXml", "parseStartTag cleardata-flag start,cleardata-flag=", Boolean.valueOf(zEqualsIgnoreCase));
                return;
            }
            if ("default-language".equalsIgnoreCase(this.n)) {
                f();
                try {
                    this.f43831b = Integer.parseInt(this.k.nextText());
                } catch (NumberFormatException unused) {
                    LogUtil.e("AppPullChangeLogGetXml", "parseStartTag NumberFormatException");
                }
                LogUtil.d("AppPullChangeLogGetXml", "parseStartTag default-language,defaultLanguageCode=", Integer.valueOf(this.f43831b));
                return;
            }
            if ("language".equalsIgnoreCase(this.n)) {
                LogUtil.d("AppPullChangeLogGetXml", "parseStartTag language");
                k();
                return;
            }
            if ("features".equalsIgnoreCase(this.n)) {
                this.h = new ArrayList();
                this.j = "";
                i();
            } else {
                if (TrackConstants$Events.FEATURE.equalsIgnoreCase(this.n)) {
                    e();
                    return;
                }
                if ("updatelogs".equals(this.n)) {
                    this.s = new ArrayList();
                    this.p = "";
                    l();
                } else if ("updateLog".equals(this.n)) {
                    c();
                } else {
                    o();
                }
            }
        }

        private void l() {
            a.b bVar;
            if (this.f43832c != null) {
                this.t = new a.b();
            }
            if (this.k.getAttributeCount() > 0 && "module".equals(this.k.getAttributeName(0))) {
                if (this.i == null || (bVar = this.t) == null) {
                    return;
                }
                bVar.d = this.k.getAttributeValue(0);
                return;
            }
            a.b bVar2 = this.t;
            if (bVar2 != null) {
                bVar2.d = "";
            }
        }

        private void c() {
            try {
                if (this.i == null || this.k == null) {
                    return;
                }
                this.p += this.k.nextText() + System.lineSeparator();
            } catch (Exception unused) {
                LogUtil.e("AppPullChangeLogGetXml", "appendUpdateLogString Exception");
            }
        }

        private void i() {
            a.c cVar;
            if (this.f43832c != null) {
                this.g = new a.c();
            }
            if (this.k.getAttributeCount() > 0 && "module".equals(this.k.getAttributeName(0))) {
                if (this.i == null || (cVar = this.g) == null) {
                    return;
                }
                cVar.d = this.k.getAttributeValue(0);
                return;
            }
            a.c cVar2 = this.g;
            if (cVar2 != null) {
                cVar2.d = "";
            }
        }

        private void k() {
            if (this.f43832c != null) {
                a.e eVar = new a.e();
                this.i = eVar;
                eVar.f43827c = new ArrayList();
                this.i.f43825a = new ArrayList();
            }
            for (int i = 0; i < this.k.getAttributeCount(); i++) {
                String attributeName = this.k.getAttributeName(i);
                if ("name".equals(attributeName)) {
                    a.e eVar2 = this.i;
                    if (eVar2 != null) {
                        eVar2.d = this.k.getAttributeValue(i);
                    }
                } else if ("code".equals(attributeName)) {
                    a.e eVar3 = this.i;
                    if (eVar3 != null) {
                        try {
                            eVar3.f43826b = Integer.parseInt(this.k.getAttributeValue(i));
                        } catch (NumberFormatException unused) {
                            LogUtil.e("AppPullChangeLogGetXml", "parseStartLanguageTag NumberFormatException");
                        }
                    }
                } else {
                    LogUtil.a("AppPullChangeLogGetXml", "parseStartLanguageTag attributeName = ", attributeName);
                }
            }
        }

        private void g() {
            if ("root".equalsIgnoreCase(this.n)) {
                h();
                this.o.f43829c = true;
            } else if ("language".equalsIgnoreCase(this.n)) {
                j();
            } else {
                b();
            }
        }

        private void b() {
            if ("features".equalsIgnoreCase(this.n)) {
                d();
                return;
            }
            if ("updatelogs".equalsIgnoreCase(this.n)) {
                m();
                return;
            }
            if ("cleardata-flag".equalsIgnoreCase(this.n)) {
                a aVar = this.f43832c;
                if (aVar != null) {
                    aVar.d = this.f;
                    LogUtil.d("AppPullChangeLogGetXml", "parseChangeLogTag cleardata-flag end,changeLog.isClearData=", Boolean.valueOf(this.f43832c.d));
                    return;
                }
                return;
            }
            LogUtil.d("AppPullChangeLogGetXml", "parseChangeLogTag unknown node");
        }

        private void m() {
            a.e eVar = this.i;
            if (eVar != null) {
                if (eVar.f43825a != null) {
                    this.i.f43825a.add(this.t);
                }
                List<String> list = this.s;
                if (list != null) {
                    list.add(this.p);
                }
                a.b bVar = this.t;
                if (bVar != null) {
                    bVar.f43823c = this.s;
                }
            }
        }

        private void d() {
            a.e eVar = this.i;
            if (eVar != null) {
                if (eVar.f43827c != null) {
                    this.i.f43827c.add(this.g);
                }
                List<String> list = this.h;
                if (list != null) {
                    list.add(this.j);
                }
                a.c cVar = this.g;
                if (cVar != null) {
                    cVar.f43824b = this.h;
                }
            }
        }

        private void o() {
            if ("root".equalsIgnoreCase(this.n)) {
                LogUtil.d("AppPullChangeLogGetXml", "parseStartRootTag");
                this.f43832c = new a();
            }
        }

        private void h() {
            a aVar = this.f43832c;
            if (aVar != null) {
                aVar.e = this.f43830a;
            }
        }

        private void f() {
            this.d = "";
            this.e = "";
            for (int i = 0; i < this.k.getAttributeCount(); i++) {
                if ("name".equals(this.k.getAttributeName(i))) {
                    this.d = this.k.getAttributeValue(i);
                }
                if ("status".equals(this.k.getAttributeName(i))) {
                    this.e = this.k.getAttributeValue(i);
                }
            }
            LogUtil.d("AppPullChangeLogGetXml", "parseDefaultLanguageTag mDefaultLanguageName ", this.d, " ,mChangeLogStatus ", this.e);
        }

        private void e() {
            try {
                if (this.i == null || this.k == null) {
                    return;
                }
                this.j += this.k.nextText() + System.lineSeparator();
            } catch (Exception unused) {
                LogUtil.e("AppPullChangeLogGetXml", "appendFeatureString, Exception");
            }
        }

        private void j() {
            if (this.f43830a == null) {
                this.f43830a = new ArrayList();
            }
            a.e eVar = this.i;
            if (eVar == null) {
                return;
            }
            this.f43830a.add(eVar);
            if (this.i.d == null || this.f43832c == null) {
                return;
            }
            if (this.i.d.equalsIgnoreCase(this.d) && this.i.f43826b == this.f43831b) {
                this.f43832c.f43821a = this.f43830a.size() - 1;
            }
            if (!TextUtils.isEmpty(this.e) && "new".equals(this.e)) {
                if (this.i.d.equalsIgnoreCase(this.m)) {
                    this.f43832c.f43822b = this.f43830a.size() - 1;
                    return;
                }
                return;
            }
            if (this.i.d.equalsIgnoreCase(this.l)) {
                this.f43832c.f43822b = this.f43830a.size() - 1;
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f43828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f43829c;

        private c() {
        }
    }
}
