package com.huawei.hms.findnetwork.comm.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.huawei.hms.findnetwork.comm.log.HmsFindCommonLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JsonUtils {
    private static final String TAG = "JsonUtils";
    private static volatile Gson mInstance;

    public static <T> T json2Object(String str, Class<T> cls) {
        if (!TextUtils.isEmpty(str) && cls != null) {
            try {
                if (isJsonStr(str)) {
                    return (T) getInstance().fromJson(str, (Class) cls);
                }
                return null;
            } catch (Throwable th) {
                HmsFindCommonLog.e(TAG, "json2Object exception: " + th.getMessage());
            }
        }
        return null;
    }

    public static <T> T json2Object(String str, Type type) {
        if (!TextUtils.isEmpty(str) && type != null) {
            try {
                if (isJsonStr(str)) {
                    return (T) getInstance().fromJson(str, type);
                }
                return null;
            } catch (Throwable th) {
                HmsFindCommonLog.e(TAG, "json2Object,JsonParseException:" + th.getMessage());
            }
        }
        return null;
    }

    public static String strParser(String str) {
        try {
            return new JsonParser().parse(str).getAsJsonObject().toString();
        } catch (Exception unused) {
            HmsFindCommonLog.e(TAG, "strParser failed");
            return null;
        }
    }

    public static <T> String object2Json(T t) {
        if (t == null) {
            return null;
        }
        try {
            return getInstance().toJson(t);
        } catch (Exception e) {
            HmsFindCommonLog.e(TAG, "object2Json exception: " + e.getMessage());
            return null;
        }
    }

    public static String map2Json(Map map) {
        if (map == null) {
            return null;
        }
        try {
            return getInstance().toJson(map);
        } catch (Throwable th) {
            HmsFindCommonLog.e(TAG, "JsonParseException:" + th.getMessage());
            return null;
        }
    }

    public static <K, V> Map<K, V> json2Map(String str, Type type) {
        Map<K, V> map = Collections.EMPTY_MAP;
        try {
            if (isJsonStr(str)) {
                return (Map) getInstance().fromJson(str, type);
            }
        } catch (Throwable unused) {
            HmsFindCommonLog.e(TAG, "Get Map failed");
        }
        return map;
    }

    public static boolean isJsonStr(String str) {
        if (str == null) {
            return false;
        }
        return isJSONArrayStr(str) || isJSONObjectStr(str);
    }

    public static boolean isJSONObjectStr(String str) {
        if (str == null) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static boolean isJSONArrayStr(String str) {
        if (str == null) {
            return false;
        }
        try {
            new JSONArray(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static <T> List<T> getObjectList(String str, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        try {
            if (isJsonStr(str)) {
                Gson gson = new Gson();
                Iterator<JsonElement> it = JsonParser.parseString(str).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    arrayList.add(gson.fromJson(it.next(), (Class) cls));
                }
            }
        } catch (Throwable th) {
            HmsFindCommonLog.e(TAG, "Get Object List failed, " + th.getMessage());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x005c A[Catch: IOException -> 0x0060, TRY_LEAVE, TryCatch #6 {IOException -> 0x0060, blocks: (B:34:0x0057, B:36:0x005c), top: B:45:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String getJsonFromAssetFile(Context context, String str) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader2 = null;
        BufferedReader bufferedReader2 = null;
        inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(context.getAssets().open(str), StandardCharsets.UTF_8);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (IOException unused) {
                            inputStreamReader2 = inputStreamReader;
                            try {
                                HmsFindCommonLog.e(TAG, "Get json data from AssetFile failed");
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader2 != null) {
                                    inputStreamReader = inputStreamReader2;
                                }
                                return sb.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                inputStreamReader = inputStreamReader2;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                        if (inputStreamReader != null) {
                                            inputStreamReader.close();
                                        }
                                    } catch (IOException unused2) {
                                        HmsFindCommonLog.e(TAG, "close inputStream failed");
                                        throw th;
                                    }
                                } else if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                            } else if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                    } else if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    throw th;
                }
            } catch (IOException unused4) {
                HmsFindCommonLog.e(TAG, "close inputStream failed");
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            inputStreamReader = inputStreamReader2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
            } else if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            throw th;
        }
        inputStreamReader.close();
        return sb.toString();
    }

    public static Gson getInstance() {
        if (mInstance == null) {
            synchronized (JsonUtils.class) {
                if (mInstance == null) {
                    mInstance = getGsonBuilder().create();
                }
            }
        }
        return mInstance;
    }

    private static GsonBuilder getGsonBuilder() {
        return new GsonBuilder().enableComplexMapKeySerialization().serializeSpecialFloatingPointValues().disableHtmlEscaping().setLenient();
    }
}
