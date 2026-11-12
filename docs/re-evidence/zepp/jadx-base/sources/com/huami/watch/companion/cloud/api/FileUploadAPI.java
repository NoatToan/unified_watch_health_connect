package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.watch.companion.R;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.cloud.FileRequestBody;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.ZipUtil;
import com.xiaomi.hm.health.lab.webapi.HMUploadDeviceLogAPI;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class FileUploadAPI {
    public static final String FILE_TYPE_LOG = "LOG";
    public static final String FILE_TYPE_PICTURE = "PICTURE";
    private static final String a = "Cloud-API-FileUpload";

    private FileUploadAPI() {
    }

    private static String a(Context context, String str, String str2) {
        UserInfo userInfo = UserInfoManager.get();
        String uid = Account.getUID(context);
        String nickname = userInfo.getNickname();
        return str2 + "  " + String.format(context.getResources().getString(R.string.feedback_contact_info), uid, str, nickname, AppUtil.getSystemVersion(), AppUtil.getPhoneModel(), AppUtil.getVersionNameAndCode(context), DeviceUtil.getRomVersion(context));
    }

    private static boolean b(Context context, String str, String str2, String str3, String str4, String str5) {
        boolean zIsSuccessful;
        HashMap map = new HashMap();
        map.put(ContactSettingItemActivity.KEY_CONTACT, str);
        map.put("content", str2);
        HashMap map2 = new HashMap();
        map2.put("diagnoseFileInfo", map);
        map2.put("fileName", str5);
        map2.put("fileType", str4);
        try {
            zIsSuccessful = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlUploadLoginFailLog(str3, str4), new Gson().toJson(map2), "application/json")).isSuccessful();
        } catch (IOException e) {
            e.printStackTrace();
            zIsSuccessful = false;
        }
        Log.d(a, "PostLoginFailMsg Success : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    private static String c(Context context, String str, String str2, @NonNull File file, FileRequestBody.ProgressListener progressListener) {
        String strOptString;
        String strOptString2;
        HashMap map = new HashMap();
        map.put("fileType", str2);
        map.put("fileName", file.getName());
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlUploadLoginFailLogAccess(str, str2), map));
            if (responseDoRequest.isSuccessful()) {
                JSONObject jSONObject = new JSONObject(CloudClient.responseBodyString(responseDoRequest));
                strOptString = jSONObject.optString("putURI");
                try {
                    strOptString2 = jSONObject.optString("fileName");
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    strOptString2 = null;
                }
            } else {
                strOptString = null;
                strOptString2 = null;
            }
        } catch (Exception e2) {
            e = e2;
            strOptString = null;
        }
        Log.d(a, "PutURI : " + strOptString + ", ResultFileName : " + strOptString2, new Object[0]);
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        boolean zPutFile = putFile(context, file, strOptString, progressListener);
        Log.d(a, "PutLoginFailLogFile : " + file + ", Success : " + zPutFile, new Object[0]);
        if (zPutFile) {
            return strOptString2;
        }
        return null;
    }

    public static boolean putFile(Context context, File file, String str, FileRequestBody.ProgressListener progressListener) {
        boolean zIsSuccessful;
        Log.d(a, "Put File : <" + file + "> to " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Response responseDoRequest = CloudClient.OkHttp.doRequest(CloudClient.OkHttp.newPut(str, FileRequestBody.create(null, file, progressListener)));
            CloudClient.responseBodyString(responseDoRequest);
            zIsSuccessful = responseDoRequest.isSuccessful();
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(a, "Put File Error!!", e, new Object[0]);
            zIsSuccessful = false;
        }
        Log.d(a, "Result : " + zIsSuccessful, new Object[0]);
        return zIsSuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[Catch: JSONException -> 0x0056, LOOP:0: B:10:0x0042->B:12:0x0048, LOOP_END, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0056, blocks: (B:4:0x0028, B:5:0x0031, B:7:0x0038, B:9:0x003e, B:10:0x0042, B:12:0x0048), top: B:53:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    public static String uploadFile(Context context, File file, String str, JSONObject jSONObject, FileRequestBody.ProgressListener progressListener) {
        String strOptString;
        String strOptString2;
        Iterator<String> itKeys;
        Log.d(a, "Upload File : <" + file + ">, " + str, new Object[0]);
        JSONObject jSONObject2 = new JSONObject();
        if (file != null) {
            try {
                jSONObject2.put("fileName", file.getName());
                jSONObject2.put("fileType", str);
                if (jSONObject != null && jSONObject.length() > 0) {
                    itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            jSONObject2.put("fileType", str);
            if (jSONObject != null) {
                itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next2 = itKeys.next();
                    jSONObject2.put(next2, jSONObject.get(next2));
                }
            }
        }
        String string = jSONObject2.toString();
        Log.d(a, "Upload File Body : " + string, new Object[0]);
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json");
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(Cloud.urlFileUpload(Account.getUID(context), Cloud.SysParams.APP_NAME), map, string, "application/json"));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (!responseDoRequest.isSuccessful() || TextUtils.isEmpty(strResponseBodyString)) {
                strOptString2 = null;
                strOptString = null;
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject(strResponseBodyString);
                    strOptString = jSONObject3.optString("putURI");
                    try {
                        try {
                            strOptString2 = jSONObject3.optString("getURI");
                        } catch (JSONException e2) {
                            e = e2;
                            e.printStackTrace();
                            strOptString2 = null;
                            Log.d(a, "PutURI : " + strOptString, new Object[0]);
                            Log.d(a, "GetURI : " + strOptString2, new Object[0]);
                            if (TextUtils.isEmpty(strOptString)) {
                                Log.w(a, "Upload File Fail!!", new Object[0]);
                                return null;
                            }
                            if (TextUtils.isEmpty(strOptString2)) {
                                strOptString2 = "null";
                            }
                            if (FilesUtil.exists(file)) {
                                return null;
                            }
                            return strOptString2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        Log.e(a, "Upload File Error!!", e, new Object[0]);
                        strOptString2 = null;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    strOptString = null;
                }
            }
        } catch (IOException e5) {
            e = e5;
            strOptString = null;
        }
        Log.d(a, "PutURI : " + strOptString, new Object[0]);
        Log.d(a, "GetURI : " + strOptString2, new Object[0]);
        if (TextUtils.isEmpty(strOptString)) {
            Log.w(a, "Upload File Fail!!", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            strOptString2 = "null";
        }
        if (FilesUtil.exists(file) && !putFile(context, file, strOptString, progressListener)) {
            return null;
        }
        return strOptString2;
    }

    public static boolean uploadLog(Context context, String str, String str2, File[] fileArr, FileRequestBody.ProgressListener progressListener) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SearchCriteria.EXISTS, false);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appVersion", "v" + AppUtil.getVersionNameAndCode(context));
            jSONObject2.put(ContactSettingItemActivity.KEY_CONTACT, str);
            jSONObject2.put("content", str2);
            String romVersion = DeviceUtil.getRomVersion(context);
            if (!TextUtils.isEmpty(romVersion)) {
                romVersion = "v" + romVersion;
            }
            jSONObject2.put("fitfwVersion", romVersion);
            jSONObject2.put("phoneModel", AppUtil.getPhoneModel());
            jSONObject2.put("phoneSystem", AppUtil.getSystemVersion());
            jSONObject2.put("shoesfwVersion", "");
            jSONObject.put(HMUploadDeviceLogAPI.a.b, jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        File fileZip = null;
        if (fileArr != null && fileArr.length > 0) {
            fileZip = ZipUtil.zip(fileArr);
        }
        return !TextUtils.isEmpty(uploadFile(context, fileZip, "LOG", jSONObject, progressListener));
    }

    public static boolean uploadLoginFailLog(Context context, String str, String str2, File[] fileArr, FileRequestBody.ProgressListener progressListener) {
        String str3 = Cloud.SysParams.APP_NAME;
        File fileZip = (fileArr == null || fileArr.length <= 0) ? null : ZipUtil.zip(fileArr);
        return b(context, str, str2, str3, HMAccountWebAPI.PARAM_URL_FILE_TYPE, (fileZip == null || !FilesUtil.exists(fileZip)) ? null : c(context, str3, HMAccountWebAPI.PARAM_URL_FILE_TYPE, fileZip, progressListener));
    }

    public static String uploadPicture(Context context, File file) {
        if (FilesUtil.exists(file)) {
            return uploadFile(context, file, FILE_TYPE_PICTURE, null, null);
        }
        return null;
    }
}
