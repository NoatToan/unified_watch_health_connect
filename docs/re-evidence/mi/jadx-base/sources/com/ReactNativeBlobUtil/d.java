package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final HashMap<String, d> d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceEventManagerModule.RCTDeviceEventEmitter f5662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5663b = ViewShot.Results.BASE_64;
    public OutputStream c = null;

    public d(ReactApplicationContext reactApplicationContext) {
        this.f5662a = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    public static void a(String str, Callback callback) {
        try {
            HashMap<String, d> map = d;
            OutputStream outputStream = map.get(str).c;
            map.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void f(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = d.get(str).c;
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public static void g(String str, String str2, Callback callback) {
        d dVar = d.get(str);
        try {
            dVar.c.write(e.g(str2, dVar.f5663b));
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage());
        }
    }

    public final void b(String str, String str2, WritableArray writableArray) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putArray("detail", writableArray);
        this.f5662a.emit(str, writableMapCreateMap);
    }

    public final void c(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putString("detail", str3);
        this.f5662a.emit(str, writableMapCreateMap);
    }

    public final void d(String str, String str2, String str3, String str4) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putString("code", str3);
        writableMapCreateMap.putString("detail", str4);
        this.f5662a.emit(str, writableMapCreateMap);
    }

    public void e(String str, String str2, int i, int i2, String str3) {
        String strF = e.f(str);
        String str4 = strF != null ? strF : str;
        try {
            int i3 = str2.equalsIgnoreCase(ViewShot.Results.BASE_64) ? 4095 : 4096;
            if (i > 0) {
                i3 = i;
            }
            InputStream inputStreamOpenInputStream = (strF == null || !str4.startsWith("bundle-assets://")) ? strF == null ? ReactNativeBlobUtil.RCTContext.getContentResolver().openInputStream(Uri.parse(str4)) : new FileInputStream(new File(str4)) : ReactNativeBlobUtil.RCTContext.getAssets().open(str4.replace("bundle-assets://", ""));
            if (str2.equalsIgnoreCase("utf8")) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenInputStream, Charset.forName("UTF-8"));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader, i3);
                char[] cArr = new char[i3];
                for (int i4 = 0; bufferedReader.read(cArr, i4, i3) != -1; i4 = 0) {
                    c(str3, "data", new String(cArr));
                    if (i2 > 0) {
                        SystemClock.sleep(i2);
                    }
                    cArr = cArr;
                }
                bufferedReader.close();
                inputStreamReader.close();
            } else {
                if (!str2.equalsIgnoreCase("ascii")) {
                    if (str2.equalsIgnoreCase(ViewShot.Results.BASE_64)) {
                        byte[] bArr = new byte[i3];
                        while (true) {
                            int i5 = inputStreamOpenInputStream.read(bArr);
                            if (i5 == -1) {
                                break;
                            }
                            if (i5 < i3) {
                                byte[] bArr2 = new byte[i5];
                                System.arraycopy(bArr, 0, bArr2, 0, i5);
                                c(str3, "data", Base64.encodeToString(bArr2, 2));
                            } else {
                                c(str3, "data", Base64.encodeToString(bArr, 2));
                            }
                            if (i2 > 0) {
                                SystemClock.sleep(i2);
                            }
                        }
                    } else {
                        d(str3, "error", "EINVAL", "Unrecognized encoding `" + str2 + "`, should be one of `base64`, `utf8`, `ascii`");
                    }
                    inputStreamOpenInputStream.close();
                }
                byte[] bArr3 = new byte[i3];
                while (true) {
                    int i6 = inputStreamOpenInputStream.read(bArr3);
                    if (i6 == -1) {
                        break;
                    }
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (int i7 = 0; i7 < i6; i7++) {
                        writableArrayCreateArray.pushInt(bArr3[i7]);
                    }
                    b(str3, "data", writableArrayCreateArray);
                    if (i2 > 0) {
                        SystemClock.sleep(i2);
                    }
                }
            }
            c(str3, StatConstants.PARAM_END, "");
            inputStreamOpenInputStream.close();
        } catch (FileNotFoundException unused) {
            d(str3, "error", "ENOENT", "No such file '" + str4 + "'");
        } catch (Exception e) {
            d(str3, "error", "EUNSPECIFIED", "Failed to convert data to " + str2 + " encoded string. This might be because this encoding cannot be used for this data.");
            e.printStackTrace();
        }
    }

    public void h(String str, String str2, boolean z, Callback callback) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (file.exists()) {
                if (file.isDirectory()) {
                    callback.invoke("EISDIR", "Expecting a file but '" + str + "' is a directory");
                    return;
                }
            } else {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    callback.invoke("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str, z);
            this.f5663b = str2;
            String string = UUID.randomUUID().toString();
            d.put(string, this);
            this.c = fileOutputStream;
            callback.invoke(null, null, string);
        } catch (Exception e) {
            callback.invoke("EUNSPECIFIED", "Failed to create write stream at path `" + str + "`; " + e.getLocalizedMessage());
        }
    }
}
