package com.baidu.idl.license;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.idl.authority.AuthorityState;
import com.baidu.idl.authority.IDLAuthorityException;
import com.baidu.idl.util.HttpClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class License {
    public static final String TAG = "IDL-License";
    private static final String e = "http://sdkss.shitu.baidu.com/cgi-bin/queryLicense.py";
    private static final String f = "license";
    private static final String g = "idl_license";
    private static final String h = "license/idl_license_%s";
    private static final String i = "idl_license_%s";
    private static final int j = -1;
    private static License k;
    private ArrayList<String> b;
    private int a = 256;
    private int c = -1;
    private String d = "";

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            License.this.e(this.a, this.b);
        }
    }

    private License() {
    }

    private ArrayList<String> b(InputStream inputStream) throws IOException {
        Log.e(TAG, "analyseLicense");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    private InputStream c(AssetManager assetManager) {
        Log.e(TAG, "getAssetsLicenseFileInputStream");
        try {
            return TextUtils.isEmpty(this.d) ? assetManager.open(g) : assetManager.open(String.format(h, this.d));
        } catch (IOException unused) {
            Log.e(TAG, "getLicenseFileInputStream error");
            return null;
        }
    }

    private File d(Context context) {
        Log.e(TAG, "getDataLicenseFile");
        if (TextUtils.isEmpty(this.d)) {
            return context.getDir(f, 0);
        }
        File dir = context.getDir(f, 0);
        if (!dir.exists() || !dir.isDirectory()) {
            dir.mkdirs();
        }
        return new File(dir.getAbsolutePath() + File.separator + String.format(i, this.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, String str) throws Throwable {
        Log.e(TAG, "getLatestLicense");
        ArrayList<String> arrayListF = f(context, str);
        if (arrayListF == null || arrayListF.size() <= 0 || initLicense(context, str, (String[]) arrayListF.toArray(new String[arrayListF.size()])) >= 48) {
            return;
        }
        WriteLicense(context, arrayListF);
        Log.e(TAG, "LatestLicense " + arrayListF);
    }

    private ArrayList<String> f(Context context, String str) {
        JSONObject jSONObject;
        ArrayList<String> arrayList;
        Log.e(TAG, "getLicenseByNetwork");
        String postData = getPostData(context, str);
        Log.e(TAG, "Network Request " + postData);
        String strPost = HttpClient.post(e, postData);
        if (strPost != null && strPost.length() > 0) {
            Log.e(TAG, "Network Response " + strPost);
        }
        if (strPost == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(strPost);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        int i2 = -1;
        int iOptInt = jSONObject.optInt("errno", -1);
        jSONObject.optString("msg");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(f);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            arrayList = null;
        } else {
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                String strOptString = jSONArrayOptJSONArray.optString(i3);
                if (strOptString != null) {
                    arrayList2.add(strOptString);
                }
            }
            i2 = iOptInt;
            arrayList = arrayList2;
        }
        if (i2 != 0 || jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        Log.e(TAG, "resonpse is right.");
        return arrayList;
    }

    private ArrayList<String> g(Context context) {
        Log.e(TAG, "getLocalLicense");
        ArrayList<String> arrayListReadLicenseFromData = ReadLicenseFromData(context);
        return (arrayListReadLicenseFromData == null || arrayListReadLicenseFromData.size() < 1) ? ReadLicenseFromAsset(context) : arrayListReadLicenseFromData;
    }

    public static native String getAlgorithmVersion();

    public static native String getAuthorityVersion();

    public static synchronized License getInstance() {
        if (k == null) {
            k = new License();
        }
        return k;
    }

    private int h(Context context, String str) {
        int i2 = this.a;
        if (272 == i2) {
            return i2;
        }
        Log.e(TAG, "initWithAlgorithmId");
        this.a = 272;
        this.a = i(context, str);
        Log.e(TAG, "Local License Authority State Is :" + AuthorityState.getStateName(this.a));
        if (this.a > 48) {
            this.a = j(context, str);
            Log.e(TAG, "Net License Authority State Is :" + AuthorityState.getStateName(this.a));
        }
        int i3 = this.a;
        if (i3 <= 48) {
            return i3;
        }
        throw new IDLAuthorityException(AuthorityState.getStateName(this.a));
    }

    private int i(Context context, String str) {
        Log.e(TAG, "verifyByLocalData");
        ArrayList<String> arrayListG = g(context);
        this.b = arrayListG;
        if (arrayListG == null || arrayListG.size() <= 0) {
            Log.e(TAG, "my license is null");
            return 49;
        }
        ArrayList<String> arrayList = this.b;
        int iInitLicense = initLicense(context, str, (String[]) arrayList.toArray(new String[arrayList.size()]));
        if (iInitLicense == 0) {
            Log.e(TAG, "license success.");
            return iInitLicense;
        }
        if (iInitLicense == 16) {
            new Thread(new a(context, str)).start();
            return iInitLicense;
        }
        deleteErrorLicense(context);
        return iInitLicense;
    }

    private int j(Context context, String str) throws Throwable {
        Log.e(TAG, "verifyByNetworkData");
        this.b = f(context, str);
        Log.e(TAG, "Net License:" + this.b);
        ArrayList<String> arrayList = this.b;
        if (arrayList == null || arrayList.size() <= 0) {
            deleteErrorLicense(context);
            return 49;
        }
        ArrayList<String> arrayList2 = this.b;
        int iInitLicense = initLicense(context, str, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        if (iInitLicense >= 48) {
            return iInitLicense;
        }
        WriteLicense(context, this.b);
        return iInitLicense;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public ArrayList<String> ReadLicenseFromAsset(Context context) throws Throwable {
        InputStream inputStreamC;
        Log.e(TAG, "ReadLicenseFromAsset");
        ArrayList<String> arrayListB = null;
        arrayListB = null;
        arrayListB = null;
        arrayListB = null;
        InputStream inputStream = null;
        try {
            try {
                inputStreamC = c(context.getAssets());
                if (inputStreamC != null) {
                    try {
                        try {
                            arrayListB = b(inputStreamC);
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                            if (inputStreamC != null) {
                                inputStreamC.close();
                            }
                            if (arrayListB != null) {
                                WriteLicense(context, arrayListB);
                            }
                            return arrayListB;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamC;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (inputStreamC != null) {
                    inputStreamC.close();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (IOException e5) {
            e = e5;
            inputStreamC = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        if (arrayListB != null && arrayListB.size() > 0) {
            WriteLicense(context, arrayListB);
        }
        return arrayListB;
    }

    public ArrayList<String> ReadLicenseFromData(Context context) {
        if (context == null) {
            return null;
        }
        Log.e(TAG, "ReadLicenseFromData");
        File fileD = d(context);
        if (fileD != null) {
            Log.e(TAG, "ReadLicenseFromData file type " + fileD.isDirectory() + fileD.getAbsolutePath());
        }
        try {
            return b(new FileInputStream(fileD));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x008e -> B:59:0x0091). Please report as a decompilation issue!!! */
    public boolean WriteLicense(Context context, ArrayList<String> arrayList) throws Throwable {
        boolean z = false;
        if (arrayList == null || arrayList.size() == 0 || context == null) {
            return false;
        }
        Log.e(TAG, "WriteLicense");
        File fileD = d(context);
        if (fileD != null) {
            fileD.delete();
        }
        if (fileD != null || !fileD.exists()) {
            try {
                fileD.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    Log.e(TAG, "WriteLicense path " + fileD.getAbsolutePath());
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileD);
                    try {
                        Iterator<String> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            fileOutputStream2.write(it2.next().getBytes());
                            fileOutputStream2.write(10);
                        }
                        fileOutputStream2.close();
                        z = true;
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e6) {
                e = e6;
            } catch (IOException e7) {
                e = e7;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return z;
    }

    public void deleteErrorLicense(Context context) {
        if (context == null) {
            return;
        }
        Log.e(TAG, "deleteErrorLicense");
        File dir = context.getDir(f, 0);
        if (dir.exists()) {
            dir.delete();
        }
    }

    public native long getLicenseRemnant(int i2);

    public native int getLicenseState(int i2);

    public int getLicenseStateWithAlgorithmId(int i2) {
        return getLicenseState(i2);
    }

    public native String getPostData(Context context, String str);

    @Deprecated
    public int init(Context context, String str) {
        this.c = -1;
        this.d = "";
        int i2 = this.a;
        if (272 == i2) {
            return i2;
        }
        this.a = 272;
        this.a = i(context, str);
        Log.e(TAG, "Local License Authority State Is :" + AuthorityState.getStateName(this.a));
        if (this.a > 48) {
            this.a = j(context, str);
            Log.e(TAG, "Net License Authority State Is :" + AuthorityState.getStateName(this.a));
        }
        if (this.a > 48) {
            Log.e(TAG, "IDLAuthorityException :" + AuthorityState.getStateName(this.a));
        }
        return this.a;
    }

    public native int initLicense(Context context, String str, String[] strArr);

    public native int initLicenseWithToken(String str);

    public int init(String str) {
        int i2 = this.a;
        if (272 == i2) {
            return i2;
        }
        this.a = 272;
        if (str != null && str.length() > 0) {
            int iInitLicenseWithToken = initLicenseWithToken(str);
            this.a = iInitLicenseWithToken;
            if (iInitLicenseWithToken != 0) {
                this.a = 51;
            }
        } else {
            this.a = 51;
        }
        return this.a;
    }

    public int init(Context context, String str, int i2, String str2) {
        this.c = i2;
        this.d = str2;
        return h(context, str);
    }
}
