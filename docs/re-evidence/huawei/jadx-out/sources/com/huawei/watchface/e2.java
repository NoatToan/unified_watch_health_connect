package com.huawei.watchface;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.xml.DocumentBuilderFactorySecurity;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.ScreenInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.ChoosePicUtil;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes20.dex */
public class e2 {
    public static final String f = "e2";
    public static e2 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HwWatchFaceManager f30124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0.a f30125c;
    public j0 d;
    public String e;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0 j0Var = e2.this.d;
            if (j0Var != null) {
                j0Var.dismiss();
            }
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f30127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f30129c;

        public b(Activity activity, String str, Uri uri) {
            this.f30127a = activity;
            this.f30128b = str;
            this.f30129c = uri;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            j0 j0Var = e2.this.d;
            if (j0Var != null) {
                j0Var.dismiss();
                e2.this.d = null;
            }
            if (HwWatchFaceManager.getInstance(e2.this.f30123a).isBtConnect()) {
                e2.this.b(this.f30127a, this.f30128b, this.f30129c);
            } else {
                HwLog.i(e2.f, "showTransferDialog() bluetooth is disconnect");
                e2.this.f30124b.notifyH5DeviceIsBreak();
            }
        }
    }

    public e2(Context context) {
        this.f30123a = context;
        this.f30124b = HwWatchFaceManager.getInstance(context);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30123a.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("watchface");
        sb.append(str);
        this.e = sb.toString();
    }

    public static e2 b(Context context) {
        if (g == null) {
            synchronized (e2.class) {
                if (g == null) {
                    g = new e2(context);
                }
            }
        }
        return g;
    }

    public final WebViewActivity a(Context context) {
        if (context instanceof WebViewActivity) {
            return (WebViewActivity) context;
        }
        return null;
    }

    public void c(Context context) {
        if (!this.f30124b.isBtConnect()) {
            k4.b(DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
            return;
        }
        WebViewActivity webViewActivityA = a(context);
        if (webViewActivityA == null) {
            HwLog.w(f, "openSystemFileManager activity is null");
            return;
        }
        if (this.f30124b.getWatchFaceInstallState() != 0) {
            webViewActivityA.notifyNotInstallation();
            return;
        }
        if (this.f30124b.getWatchFaceInstallState() != 0) {
            k4.b(DensityUtil.getStringById(R.string.watch_face_only_one_installed));
            return;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            if (CommonUtils.setIntentComponent(context, intent)) {
                webViewActivityA.startActivityForResult(intent, 10088);
            }
        } catch (ActivityNotFoundException unused) {
            HwLog.e(f, "openSystemFileManager() ActivityNotFoundException");
            k4.b(DensityUtil.getStringById(R.string.watch_face_open_filemanager_fail));
        }
    }

    public final boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            HwLog.w(f, "verifyWatchFaceVersion() resourceVersion is empty");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            HwLog.w(f, "verifyWatchFaceVersion() deviceVersion is empty");
            return false;
        }
        String str3 = f;
        HwLog.i(str3, "verifyWatchFaceVersion() resourceVersion: " + str + ", deviceVersion: " + str2);
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length < 2 || strArrSplit2.length < 2) {
            HwLog.w(str3, "verifyWatchFaceVersion() watch face versions or max versions length less than two");
            return false;
        }
        int iA = IntegerUtils.a(strArrSplit[0]);
        int iA2 = IntegerUtils.a(strArrSplit[1]);
        int iA3 = IntegerUtils.a(strArrSplit2[0]);
        int iA4 = IntegerUtils.a(strArrSplit2[1]);
        HwLog.i(str3, "verifyWatchFaceVersion() firstVersion: " + iA + ", firstMaxVersion: " + iA3 + ", secondVersion: " + iA2 + ", secondMaxVersion: " + iA4);
        return iA == iA3 && iA2 <= iA4;
    }

    public void a(Uri uri, Context context) {
        WebViewActivity webViewActivityA = a(context);
        if (webViewActivityA == null) {
            HwLog.w(f, "activity is null");
            return;
        }
        this.f30125c = new j0.a(webViewActivityA);
        String picPathByUri = new ChoosePicUtil(this.f30123a).getPicPathByUri(this.f30123a, uri);
        if (TextUtils.isEmpty(picPathByUri)) {
            HwLog.w(f, "transferWatchFaceFile() path is empty.");
            k4.b(DensityUtil.getStringById(R.string.watch_face_get_watchface_path_fail));
        } else {
            if (!picPathByUri.toLowerCase(Locale.ENGLISH).endsWith(WatchFaceConstant.HWT_SUFFIX)) {
                k4.b(DensityUtil.getStringById(R.string.watch_face_file_is_not_support));
                return;
            }
            a(webViewActivityA, picPathByUri, uri);
            j0 j0VarA = this.f30125c.a();
            this.d = j0VarA;
            j0VarA.setCancelable(false);
            this.d.show();
        }
    }

    public final void b(Activity activity, String str, Uri uri) throws Throwable {
        String randomVersion = this.f30124b.getRandomVersion();
        this.f30124b.setCurrentInstallWatchFaceHiTopId("000000001");
        this.f30124b.setCurrentInstallWatchFaceVersion(randomVersion);
        StringBuilder sb = new StringBuilder("000000001");
        sb.append("_");
        sb.append(randomVersion);
        StringBuffer stringBuffer = new StringBuffer(this.e);
        stringBuffer.append(sb.toString());
        String str2 = f;
        HwLog.i(str2, "unzipWatchFaceFile() start time start Zip: " + System.currentTimeMillis());
        if (FileHelper.a(this.f30123a, str, uri, stringBuffer.toString()) < 0) {
            HwLog.w(str2, "unzipWatchFaceFile() unzip failed.");
            k4.a(R.string.watch_face_get_watchface_path_fail);
            return;
        }
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.f30123a).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            HwLog.w(str2, "unzipWatchFaceFile() watchFaceInfo is null");
            return;
        }
        String watchFaceScreen = watchFaceSupportInfo.getWatchFaceScreen();
        boolean zB = b(watchFaceScreen);
        HwLog.i(str2, "unzipWatchFaceFile() isDeviceScreenExist: " + zB);
        String str3 = stringBuffer.toString() + File.separator + "description.xml";
        String strA = a(str3, "version");
        if (a(watchFaceSupportInfo, watchFaceScreen, zB, str3, strA)) {
            return;
        }
        HwLog.i(str2, "unzipWatchFaceFile() start time start Transfer: " + System.currentTimeMillis());
        a(activity, sb, stringBuffer, watchFaceScreen, strA);
    }

    public final void a(Activity activity, String str, Uri uri) {
        StringBuilder sb = new StringBuilder(32);
        String name = new File(CommonUtils.filterFilePath(str)).getName();
        if (name.length() > 20) {
            sb.append(SafeString.substring(name, 0, 20));
            sb.append("...");
        } else {
            sb.append(name);
        }
        this.f30125c.b(R.string.title_note).a(String.format(Locale.ENGLISH, DensityUtil.getStringById(R.string.watch_face_whether_to_install_the_watch), sb.toString())).b(R.string.watch_face_install_watchface, new b(activity, str, uri)).a(R.string.cancel, new a());
    }

    public final boolean c(String str, String str2) throws Throwable {
        String strA = a(str, "screen");
        if (TextUtils.isEmpty(strA)) {
            HwLog.w(f, "verifyWatchFaceScreen() watch face screen version is empty");
            return false;
        }
        String str3 = f;
        HwLog.i(str3, "verifyWatchFaceScreen() screen: " + strA);
        String strA2 = a(strA);
        HwLog.i(str3, "verifyWatchFaceScreen() watchFaceScreen: " + strA2 + ", deviceWatchFaceScreen: " + str2);
        if (strA2.equals(str2)) {
            return true;
        }
        k4.b(DensityUtil.getStringById(R.string.watch_face_screen_not_supported));
        return false;
    }

    public final String c() throws Throwable {
        Throwable th;
        Closeable closeable;
        InputStreamReader inputStreamReader;
        InputStream inputStreamOpen;
        AssetManager assets = this.f30123a.getResources().getAssets();
        StringBuilder sb = new StringBuilder(32);
        InputStream inputStream = null;
        closeable = null;
        Closeable closeable2 = null;
        Closeable closeable3 = null;
        try {
            inputStreamOpen = assets.open("watchFace/watch_face_version.json");
            try {
                inputStreamReader = new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (IOException unused) {
                            closeable3 = bufferedReader;
                            try {
                                HwLog.e(f, "readContentFromFile() IOException");
                                a(closeable3);
                                a(inputStreamReader);
                                a(inputStreamOpen);
                            } catch (Throwable th2) {
                                th = th2;
                                Closeable closeable4 = closeable3;
                                inputStream = inputStreamOpen;
                                closeable = closeable4;
                                InputStream inputStream2 = inputStream;
                                closeable2 = closeable;
                                inputStreamOpen = inputStream2;
                                a(closeable2);
                                a(inputStreamReader);
                                a(inputStreamOpen);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            closeable2 = bufferedReader;
                            a(closeable2);
                            a(inputStreamReader);
                            a(inputStreamOpen);
                            throw th;
                        }
                    }
                    a(bufferedReader);
                    a(inputStreamReader);
                    a(inputStreamOpen);
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException unused3) {
                inputStreamReader = null;
                HwLog.e(f, "readContentFromFile() IOException");
                a(closeable3);
                a(inputStreamReader);
                a(inputStreamOpen);
                return sb.toString();
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
                inputStream = inputStreamOpen;
                closeable = null;
                InputStream inputStream3 = inputStream;
                closeable2 = closeable;
                inputStreamOpen = inputStream3;
                a(closeable2);
                a(inputStreamReader);
                a(inputStreamOpen);
                throw th;
            }
        } catch (IOException unused4) {
            inputStreamOpen = null;
        } catch (Throwable th6) {
            th = th6;
            closeable = null;
            inputStreamReader = null;
        }
        return sb.toString();
    }

    public final boolean b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HwLog.i(f, "isMuse() deviceScreen : " + str + ", deviceVersion: " + str2);
            return str.equals("466*466") && str2.contains("2.0.");
        }
        HwLog.w(f, "isMuse() deviceScreen || deviceVersion isEmpty.");
        return false;
    }

    public final void a(Activity activity, final StringBuilder sb, final StringBuffer stringBuffer, String str, String str2) throws Throwable {
        stringBuffer.append(File.separator);
        stringBuffer.append(FlavorConfig.SERVICE_WATCH_FACE);
        String str3 = f;
        FlavorConfig.safeHwLog(str3, "unzip file path: " + stringBuffer.toString());
        byte[] bArrB = FileHelper.b(new File(stringBuffer.toString()));
        if (bArrB != null && bArrB.length > 0) {
            s0.a().a(sb.toString(), b2.a().a(this.f30123a, bArrB, b(str, str2), false));
            if (this.f30124b.isCanceled()) {
                HwLog.w(str3, "unzipWatchFaceFile() is canceled: " + this.f30124b.isCanceled());
                this.f30124b.setIsCanceled(false);
                return;
            }
            final String[] strArrSplit = sb.toString().split("_");
            if (strArrSplit.length < 2) {
                HwLog.w(str3, "unzipWatchFaceFile() params length is less ARRAY_LENGTH");
                return;
            } else {
                BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.e2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(strArrSplit, stringBuffer, sb);
                    }
                });
                this.f30124b.showInstallProgress(0, activity);
                return;
            }
        }
        HwLog.i(str3, "unzipWatchFaceFile in <= 0");
    }

    public final boolean b(String str) throws Throwable {
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            HwLog.w(f, "verifyDeviceScreen() watchFaceInfoJson is empty");
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(strC);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && str.equals(jSONObject.getString("screenResolution"))) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            HwLog.e(f, "verifyDeviceScreen() JSONException");
            return false;
        }
    }

    public static void b() {
        synchronized (e2.class) {
            if (g != null) {
                g = null;
            }
        }
    }

    public final /* synthetic */ void a(String[] strArr, final StringBuffer stringBuffer, final StringBuilder sb) {
        final String str = strArr[0];
        final String str2 = strArr[1];
        k2.a().a(str, str2, 0, false);
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.e2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, stringBuffer, sb);
            }
        });
    }

    public final /* synthetic */ void a(String str, String str2, StringBuffer stringBuffer, StringBuilder sb) {
        this.f30124b.applyWatchFace(str, str2, 2, "", true);
        this.f30124b.transferFile(stringBuffer.toString(), sb.toString(), 1);
    }

    public final boolean a(WatchFaceSupportInfo watchFaceSupportInfo, String str, boolean z, String str2, String str3) {
        if (z) {
            String watchFaceMaxVersion = watchFaceSupportInfo.getWatchFaceMaxVersion();
            boolean zA = a(watchFaceSupportInfo.getCompatibleList(), str3);
            boolean zD = d(str3, watchFaceMaxVersion);
            if (!zD && !zA) {
                k4.a(DensityUtil.getStringById(R.string.watch_face_version_not_supported));
            }
            if (c(str2, str) && (zD || zA)) {
                return false;
            }
            HwLog.w(f, "unzipWatchFaceFile() watch face version is not support");
            return true;
        }
        HwLog.w(f, "unzipWatchFaceFile() device screen is not find");
        return false;
    }

    public final boolean a(List list, String str) {
        if (ArrayUtils.isEmpty(list)) {
            HwLog.i(f, "hasCompatibleVersion() compatibleList empty.");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (String str2 : ((ScreenInfo) it.next()).getSupportVersion().split(",")) {
                if (d(str, str2)) {
                    HwLog.i(f, "hasCompatibleVersion() hasCompatibleVersion.");
                    return true;
                }
            }
        }
        return false;
    }

    public final String a(String str, String str2) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        DocumentBuilderFactory documentBuilderFactorySecurity = DocumentBuilderFactorySecurity.getInstance();
                        documentBuilderFactorySecurity.setExpandEntityReferences(false);
                        DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactorySecurity.newDocumentBuilder();
                        FileInputStream fileInputStreamH = FileHelper.h(FileHelper.a(str));
                        Element documentElement = documentBuilderNewDocumentBuilder.parse(fileInputStreamH).getDocumentElement();
                        if (documentElement == null) {
                            HwLog.w(f, "fetchWatchFaceVersionInfo() rootElement is null");
                            if (fileInputStreamH != null) {
                                try {
                                    fileInputStreamH.close();
                                    return "";
                                } catch (IOException unused) {
                                    HwLog.e(f, "fetchWatchFaceVersionInfo() close IOException");
                                }
                            }
                            return "";
                        }
                        NodeList elementsByTagName = documentElement.getElementsByTagName(str2);
                        if (elementsByTagName.getLength() == 0) {
                            HwLog.w(f, "fetchWatchFaceVersionInfo() tagElement is null");
                            if (fileInputStreamH != null) {
                                try {
                                    fileInputStreamH.close();
                                    return "";
                                } catch (IOException unused2) {
                                    HwLog.e(f, "fetchWatchFaceVersionInfo() close IOException");
                                }
                            }
                            return "";
                        }
                        Node nodeItem = elementsByTagName.item(0);
                        if (nodeItem == null) {
                            HwLog.w(f, "fetchWatchFaceVersionInfo() tagNode is null");
                            if (fileInputStreamH != null) {
                                try {
                                    fileInputStreamH.close();
                                    return "";
                                } catch (IOException unused3) {
                                    HwLog.e(f, "fetchWatchFaceVersionInfo() close IOException");
                                }
                            }
                            return "";
                        }
                        Node firstChild = nodeItem.getFirstChild();
                        if (firstChild == null) {
                            HwLog.w(f, "fetchWatchFaceVersionInfo() firstChild is null");
                            if (fileInputStreamH != null) {
                                try {
                                    fileInputStreamH.close();
                                    return "";
                                } catch (IOException unused4) {
                                    HwLog.e(f, "fetchWatchFaceVersionInfo() close IOException");
                                }
                            }
                            return "";
                        }
                        String nodeValue = firstChild.getNodeValue();
                        if (fileInputStreamH != null) {
                            try {
                                fileInputStreamH.close();
                                return nodeValue;
                            } catch (IOException unused5) {
                                HwLog.e(f, "fetchWatchFaceVersionInfo() close IOException");
                            }
                        }
                        return nodeValue;
                    } catch (IOException unused6) {
                        HwLog.e(f, "fetchWatchFaceVersionInfo() close IOException");
                        return "";
                    }
                } catch (SAXException unused7) {
                    HwLog.e(f, "fetchWatchFaceVersionInfo() SAXException");
                    if (0 != 0) {
                        inputStream.close();
                    }
                    return "";
                }
            } catch (IOException unused8) {
                HwLog.e(f, "fetchWatchFaceVersionInfo() IOException");
                if (0 != 0) {
                    inputStream.close();
                }
                return "";
            } catch (ParserConfigurationException unused9) {
                HwLog.e(f, "fetchWatchFaceVersionInfo() ParserConfigurationException");
                if (0 != 0) {
                    inputStream.close();
                }
                return "";
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused10) {
                    HwLog.e(f, "fetchWatchFaceVersionInfo() close IOException");
                }
            }
            throw th;
        }
    }

    public final String a(String str) throws Throwable {
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            HwLog.w(f, "fetchWatchFaceScreen() watchFaceVersionJson is empty");
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(strC);
            int length = jSONArray.length();
            String str2 = "";
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("themeVersion");
                    String string2 = jSONObject.getString("screenResolution");
                    if (str.equals(string)) {
                        str2 = string2;
                    }
                }
            }
            return str2;
        } catch (JSONException unused) {
            HwLog.e(f, "fetchWatchFaceScreen() JSONException");
            return "";
        }
    }

    public final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HwLog.e(f, "safeClose() IOException.");
            }
        }
    }

    public void a() {
        b();
    }
}
