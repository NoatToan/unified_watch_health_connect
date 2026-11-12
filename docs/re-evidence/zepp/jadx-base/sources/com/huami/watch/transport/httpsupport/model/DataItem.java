package com.huami.watch.transport.httpsupport.model;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import clc.utils.debug.slog.SolidLogger;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.StageFright.Command;
import com.huami.watch.transport.httpsupport.Utils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class DataItem {
    public static final int ERROR_UNKNOWN = -1;
    public static final int FLAG_AUTO_FILL_HEADER = 16;
    public static final int FLAG_BIG_DATA = 32768;
    public static final int FLAG_CACHE = 1;
    public static final int FLAG_CACHE_PROCESS_IN_MEMORY = 2048;
    public static final int FLAG_COMBO_REQ = 512;
    public static final int FLAG_COMPRESS = 2;
    public static final int FLAG_DATA_SYNC_FLOW = 8192;
    public static final int FLAG_DATA_SYNC_REALTIME = 65536;
    public static final int FLAG_DATA_TRANSFORMABLE = 4096;
    public static final int FLAG_DECODE_BE_SEND = 8;
    public static final int FLAG_DEL_FROM_DB = 4;

    @Deprecated
    public static final int FLAG_EXTRA_DATA_TO_FILE = 256;
    public static final int FLAG_HAS_EXTRA_FILE = 1024;
    public static final int FLAG_MASK = 207;
    public static final int FLAG_ONE_SHOT = 128;
    public static final int FLAG_RECALL_EXTRA_DATA = 64;
    public static final int FLAG_SERIAL_MODE = 16384;
    public static final int HTTP_CODE_ERROR = 999;
    public static final String HTTP_METHOD_GET = "get";
    public static final String HTTP_METHOD_POST = "post";
    public static final String HTTP_METHOD_PUT = "put";
    public static final String PREFIX_COMPRESS = "<!@@%C%&&!>";
    public static final int STATE_LOOK_SIDE_BLT = 7;
    public static final int STATE_LOOK_SIDE_NET = 6;
    public static final int STATE_NEW = 5;
    public static final int STATE_PROCESSED_BY_CLOUD = 0;
    public static final int STATE_WAITING_FOR_WIFI_TRANS = 9;
    public static final int STATE_WAITING_IN_APP_FOR_SERVICE_CONNED = 8;
    public static final int STATE_WAITING_IN_COMPANION_2_HTTP_SERVER = 4;
    public static final int STATE_WAITING_IN_COMPANION_2_WATCH = 3;
    public static final int STATE_WAITING_IN_WEARSERVICE_2_APPCLIENT = 2;
    public static final int STATE_WAITING_IN_WEARSERVICE_2_ASSIST = 1;
    private String a;
    private int b;
    private String c;
    private JSONObject d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private long j;
    private String k;

    public DataItem() {
    }

    public DataItem(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, (String) null);
    }

    public DataItem(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, str5 != null);
    }

    public DataItem(String str, String str2, String str3, String str4, String str5, boolean z) {
        this(str, str2, str3, str4, str5, z, false);
    }

    public DataItem(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this(str, str2, str3, str4, str5, z, z2, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataItem(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, long j) {
        int i = z2 ? (z ? 1 : 0) | 2 : z;
        setIdentifier(DataUtils.generateId());
        setUrl(str);
        setAction(str2);
        setOwner(str3);
        setMethod(str4);
        setData(str5);
        setFlags(i);
        setTimeout(j);
        setState(5);
        this.d = new JSONObject();
    }

    public DataItem(String str, String str2, String str3, String str4, byte[] bArr) {
        this(str, str2, str3, str4, new String(bArr));
    }

    private String a(String str) {
        if (str.startsWith(PREFIX_COMPRESS)) {
            return str;
        }
        return PREFIX_COMPRESS + Base64.encodeToString(Utils.BytesZipUtil.gZip(str.getBytes()), 0);
    }

    public static DataItem from(String str) {
        DataItem dataItem = new DataItem();
        try {
            JSONObject jSONObject = new JSONObject(str);
            dataItem.setIdentifier(jSONObject.optString(LogUtil.I));
            dataItem.setUrl(jSONObject.optString("U"));
            dataItem.setAction(jSONObject.optString(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS));
            dataItem.setOwner(jSONObject.optString("O"));
            dataItem.setMethod(jSONObject.optString("M"));
            dataItem.setData(jSONObject.optString(LogUtil.D));
            dataItem.setFlags(jSONObject.optInt("F"));
            dataItem.setTimeout(jSONObject.optLong(ExifInterface.GPS_DIRECTION_TRUE));
            dataItem.setState(jSONObject.optInt(ExifInterface.LATITUDE_SOUTH));
            dataItem.setCode(jSONObject.optInt("C"));
            String string = jSONObject.getString("E");
            if (string != null) {
                dataItem.setExtraData(string);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return dataItem;
    }

    public void addExtraPair(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("KEY Must Not Be NULL!");
        }
        if (this.d == null) {
            this.d = new JSONObject();
        }
        try {
            this.d.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void addFlags(int i) {
        this.e = i | this.e;
    }

    public boolean addHeader(String str, String str2) {
        JSONObject jSONObject = null;
        if (!hasHeader() && this.d == null) {
            JSONObject jSONObject2 = new JSONObject();
            this.d = jSONObject2;
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject2.put(DataUtils.DataItemKey.KEY_EXTRA_HEADER, jSONObject3);
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject3;
                    e.printStackTrace();
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        try {
            if (!this.d.has(DataUtils.DataItemKey.KEY_EXTRA_HEADER)) {
                JSONObject jSONObject4 = this.d;
                JSONObject jSONObject5 = new JSONObject();
                jSONObject4.put(DataUtils.DataItemKey.KEY_EXTRA_HEADER, jSONObject5);
                jSONObject = jSONObject5;
            }
            if (jSONObject == null) {
                jSONObject = this.d.getJSONObject(DataUtils.DataItemKey.KEY_EXTRA_HEADER);
            }
            if (jSONObject == null) {
                return false;
            }
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public void clearFlags(int i) {
        this.e = i & this.e;
    }

    public byte[] decompress(String str) {
        if (str.startsWith(PREFIX_COMPRESS)) {
            str = str.substring(11, str.length() - 1);
        }
        return Utils.BytesZipUtil.unGZip(Base64.decode(str, 0));
    }

    public String getAction() {
        return this.a;
    }

    public int getCode() {
        return this.b;
    }

    public String getData() {
        return this.c;
    }

    public JSONObject getExtraData() {
        if (this.d == null) {
            this.d = new JSONObject();
        }
        return this.d;
    }

    public String getExtraValByKey(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.d) == null) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public int getFlags() {
        return this.e;
    }

    public String getHeaderValByKey(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = this.d;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(DataUtils.DataItemKey.KEY_EXTRA_HEADER)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str);
    }

    public String getIdentifier() {
        return this.f;
    }

    public String getMethod() {
        return this.g;
    }

    public String getOwner() {
        return this.h;
    }

    public int getState() {
        return this.i;
    }

    public long getTimeout() {
        return this.j;
    }

    public String getUrl() {
        return this.k;
    }

    public boolean hasFlag(int i) {
        return (this.e & i) == i;
    }

    public boolean hasHeader() {
        JSONObject jSONObject = this.d;
        return jSONObject != null && jSONObject.has(DataUtils.DataItemKey.KEY_EXTRA_HEADER);
    }

    public boolean isCacheEnabled() {
        return (this.e & 1) == 1;
    }

    public boolean isCompressEnabled() {
        return (this.e & 2) == 2;
    }

    public boolean removeExtraPairByKey(String str) {
        JSONObject jSONObject = this.d;
        return jSONObject == null || jSONObject.remove(str) != null;
    }

    public boolean removeHeader(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || !hasHeader() || (jSONObject = this.d) == null) {
            return true;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(DataUtils.DataItemKey.KEY_EXTRA_HEADER);
            return (jSONObject2 == null || jSONObject2.remove(str) == null) ? false : true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String removePrefix(String str) {
        try {
            return str.startsWith(PREFIX_COMPRESS) ? str.substring(11, str.length() - 1) : str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public Iterator<String> retrieveAllExtraKeys() {
        JSONObject jSONObject = this.d;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.keys();
    }

    public Iterator<String> retrieveAllHeaderKeys() {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = this.d;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(DataUtils.DataItemKey.KEY_EXTRA_HEADER)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.keys();
    }

    public void setAction(String str) {
        this.a = str;
    }

    public void setCode(int i) {
        this.b = i;
    }

    public void setData(String str) {
        if (str == null) {
            str = "";
        }
        this.c = a(str);
    }

    public void setExtraData(String str) {
        if (TextUtils.isEmpty(str)) {
            this.d = null;
            return;
        }
        try {
            this.d = new JSONObject(str);
        } catch (JSONException e) {
            this.d = null;
            SolidLogger.getInstance().with(GlobalDefine.TAG_SRV, "setExtraData ERROR. Failed To Set Extra Data For : [" + str + "] . NEED JSON.");
            Log.i(GlobalDefine.TAG_SRV, "setExtraData ERROR. Failed To Set Extra Data For : [" + str + "] . NEED JSON. Stack is :", e);
        }
    }

    public void setFlags(int i) {
        this.e = i;
    }

    public void setIdentifier(String str) {
        this.f = str;
    }

    public void setMethod(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "get";
        }
        this.g = str;
    }

    public void setOwner(String str) {
        this.h = str;
    }

    public void setState(int i) {
        this.i = i;
    }

    public void setTimeout(long j) {
        this.j = j;
    }

    public void setUrl(String str) {
        this.k = str;
    }

    public String toShortString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LogUtil.I, this.f);
            jSONObject.put("U", this.k);
            jSONObject.put(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, this.a);
            jSONObject.put("O", this.h);
            jSONObject.put("M", this.g);
            jSONObject.put("F", this.e);
            jSONObject.put(ExifInterface.GPS_DIRECTION_TRUE, this.j);
            jSONObject.put(ExifInterface.LATITUDE_SOUTH, this.i);
            JSONObject jSONObject2 = this.d;
            jSONObject.put("E", jSONObject2 == null ? "" : jSONObject2.toString());
            jSONObject.put(LogUtil.D, TextUtils.isEmpty(this.c) ? "[EMPTY]" : "▂ #有<数据>料# ▂");
            jSONObject.put("C", this.b);
            if (hasFlag(16384)) {
                jSONObject.put("isSerial", "YES");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LogUtil.I, this.f);
            jSONObject.put("U", this.k);
            jSONObject.put(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, this.a);
            jSONObject.put("O", this.h);
            jSONObject.put("M", this.g);
            String string = "";
            if (this.c == null) {
                this.c = "";
            }
            String strA = a(this.c);
            this.c = strA;
            jSONObject.put(LogUtil.D, strA);
            jSONObject.put("F", this.e);
            jSONObject.put(ExifInterface.GPS_DIRECTION_TRUE, this.j);
            jSONObject.put(ExifInterface.LATITUDE_SOUTH, this.i);
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null) {
                string = jSONObject2.toString();
            }
            jSONObject.put("E", string);
            jSONObject.put("C", this.b);
            if (hasFlag(16384)) {
                jSONObject.put("isSerial", "YES");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public HashSet<String> trackTargetActionSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(trackTargetPackageAndAction()[1].split("\\|")));
        return hashSet;
    }

    public String[] trackTargetPackageAndAction() {
        if (!Command.isInternal(this.a)) {
            throw new IllegalArgumentException("Error For Extract Target Package! " + toString());
        }
        String extraValByKey = getExtraValByKey("target");
        if (TextUtils.isEmpty(extraValByKey)) {
            extraValByKey = getOwner();
        }
        if (TextUtils.isEmpty(extraValByKey)) {
            extraValByKey = "*";
        }
        String[] strArrSplit = extraValByKey.split(UpdateUtils.CMD_FILTER);
        return (strArrSplit == null || strArrSplit.length < 2) ? new String[]{extraValByKey, "*"} : strArrSplit;
    }

    public String trackWho() {
        String extraValByKey = getExtraValByKey("target");
        if (TextUtils.isEmpty(extraValByKey)) {
            extraValByKey = this.h;
        }
        return extraValByKey.split(UpdateUtils.CMD_FILTER)[0];
    }
}
