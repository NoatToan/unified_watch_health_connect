package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ByteUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MIOTUtils {

    /* JADX INFO: renamed from: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String bitmapToBase64(Bitmap bitmap, int i) throws Throwable {
        String strEncodeToString;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream2);
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                    byteArrayOutputStream = byteArrayOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.flush();
                            byteArrayOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            strEncodeToString = null;
        }
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return strEncodeToString;
    }

    public static String byte2String(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return ByteUtils.toHexString(bArr);
    }

    public static int bytesToInt(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int char2Int(char c) {
        int i = c - 'W';
        return i < 0 ? c - '0' : i;
    }

    public static List<String> convertReadableArrayToList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        if (readableArray == null) {
            return arrayList;
        }
        ArrayList<Object> arrayList2 = readableArray.toArrayList();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList2.get(i);
            if (obj instanceof Double) {
                arrayList.add(new DecimalFormat(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX).format((Double) obj));
            } else {
                arrayList.add(obj.toString());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[SYNTHETIC] */
    public static String createTracesImageBase64(int i, int i2, String str) throws Exception {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        Paint paint;
        ByteArrayOutputStream byteArrayOutputStream2;
        int i3;
        String str2;
        int i4 = 2;
        String str3 = "fillColor";
        String str4 = "dash";
        String str5 = "type";
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i5 = 0;
        canvas.drawColor(0);
        Paint paint2 = new Paint();
        int i6 = 1;
        paint2.setAntiAlias(true);
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i7 = 0;
            while (i7 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                String string = jSONObject.has("color") ? jSONObject.getString("color") : "#FFFFFFFF";
                paint2.setStrokeWidth(jSONObject.has("width") ? (float) jSONObject.getDouble("width") : 2.0f);
                if (jSONObject.has(str5) && jSONObject.getInt(str5) == i6) {
                    float[] fArr = new float[i4];
                    // fill-array-data instruction
                    fArr[0] = 10.0f;
                    fArr[1] = 10.0f;
                    if (jSONObject.has(str4)) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(str4);
                        if (jSONArray2.length() == i4) {
                            fArr[i5] = (float) jSONArray2.getDouble(i5);
                            fArr[1] = (float) jSONArray2.getDouble(1);
                        }
                    }
                    paint = paint2;
                    paint.setPathEffect(new DashPathEffect(fArr, 0.0f));
                    byteArrayOutputStream2 = null;
                } else {
                    str3 = str3;
                    paint = paint2;
                    byteArrayOutputStream2 = null;
                    paint.setPathEffect(null);
                }
                JSONArray jSONArray3 = jSONObject.getJSONArray("points");
                if (jSONArray3.length() % 2 != 0) {
                    try {
                        if (jSONArray3.length() >= 4) {
                            throw new Exception("points in json must has valid length");
                        }
                    } catch (Exception e) {
                        e = e;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            throw e;
                        } catch (Throwable th3) {
                            th2 = th3;
                            th = th2;
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.flush();
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                }
                int length = jSONArray3.length() / 2;
                String str6 = str3;
                int color = jSONObject.has(str6) ? Color.parseColor(jSONObject.getString(str6)) : 0;
                if (color != 0) {
                    Path path = new Path();
                    float f = i2;
                    path.moveTo((float) jSONArray3.getDouble(0), f - ((float) jSONArray3.getDouble(1)));
                    i3 = length;
                    int i8 = 1;
                    while (i8 < i3) {
                        int i9 = i8 * 2;
                        float f2 = f;
                        path.lineTo((float) jSONArray3.getDouble(i9), f2 - ((float) jSONArray3.getDouble(i9 + 1)));
                        i8++;
                        f = f2;
                        str6 = str6;
                    }
                    str2 = str6;
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(color);
                    canvas.drawPath(path, paint);
                } else {
                    i3 = length;
                    str2 = str6;
                }
                paint.setColor(Color.parseColor(string));
                float[] fArr2 = new float[(i3 - 1) * 4];
                int i10 = 1;
                while (i10 < i3) {
                    int i11 = i10 * 4;
                    int i12 = (i10 - 1) * 2;
                    float[] fArr3 = fArr2;
                    fArr3[i11 - 4] = (float) jSONArray3.getDouble(i12);
                    float f3 = i2;
                    fArr3[i11 - 3] = f3 - ((float) jSONArray3.getDouble(i12 + 1));
                    int i13 = i10 * 2;
                    fArr3[i11 - 2] = (float) jSONArray3.getDouble(i13);
                    fArr3[i11 - 1] = f3 - ((float) jSONArray3.getDouble(i13 + 1));
                    i10++;
                    fArr2 = fArr3;
                }
                canvas.drawLines(fArr2, paint);
                i7++;
                i6 = 1;
                paint2 = paint;
                jSONArray = jSONArray;
                str4 = str4;
                str5 = str5;
                str3 = str2;
                i4 = 2;
                i5 = 0;
            }
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream3);
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream3.toByteArray(), 0);
                try {
                    byteArrayOutputStream3.flush();
                    byteArrayOutputStream3.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                if (!bitmapCreateBitmap.isRecycled()) {
                    bitmapCreateBitmap.recycle();
                }
                return strEncodeToString;
            } catch (Exception e4) {
                e = e4;
                byteArrayOutputStream = byteArrayOutputStream3;
                throw e;
            } catch (Throwable th5) {
                th2 = th5;
                byteArrayOutputStream = byteArrayOutputStream3;
                th = th2;
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            byteArrayOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    public static String createTracesImageBase64V2(int i, int i2, String str) throws Exception {
        String str2;
        String str3 = "fillColor";
        String str4 = "dash";
        String str5 = "type";
        String str6 = "width";
        String str7 = "color";
        String strEncodeToString = "";
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        Paint paint = new Paint();
        int i3 = 1;
        paint.setAntiAlias(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i4 = 0;
            while (i4 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                String string = "#FFFFFFFF";
                if (jSONObject.has(str7)) {
                    try {
                        string = jSONObject.getString(str7);
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        return strEncodeToString;
                    }
                }
                paint.setStrokeWidth(jSONObject.has(str6) ? (float) jSONObject.getDouble(str6) : 2.0f);
                if (jSONObject.has(str5) && jSONObject.getInt(str5) == i3) {
                    float[] fArr = {10.0f, 10.0f};
                    if (jSONObject.has(str4)) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray(str4);
                        if (jSONArray2.length() == 2) {
                            fArr[0] = (float) jSONArray2.getDouble(0);
                            fArr[1] = (float) jSONArray2.getDouble(1);
                        }
                    }
                    paint.setPathEffect(new DashPathEffect(fArr, 0.0f));
                } else {
                    str4 = str4;
                    str5 = str5;
                    paint.setPathEffect(null);
                }
                JSONArray jSONArray3 = jSONObject.getJSONArray("points");
                if (jSONArray3.length() % 2 != 0 && jSONArray3.length() >= 4) {
                    throw new Exception("points in json must has even length");
                }
                int length = jSONArray3.length() / 2;
                String str8 = str3;
                int color = jSONObject.has(str8) ? Color.parseColor(jSONObject.getString(str8)) : 0;
                Path path = new Path();
                String str9 = str6;
                String str10 = str7;
                float f = i2;
                str2 = strEncodeToString;
                Bitmap bitmap = bitmapCreateBitmap;
                try {
                    path.moveTo((float) jSONArray3.getDouble(0), f - ((float) jSONArray3.getDouble(1)));
                    int i5 = 1;
                    while (i5 < length) {
                        int i6 = i5 * 2;
                        path.lineTo((float) jSONArray3.getDouble(i6), f - ((float) jSONArray3.getDouble(i6 + 1)));
                        i5++;
                        length = length;
                        str8 = str8;
                    }
                    String str11 = str8;
                    paint.setStyle(color != 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    if (color == 0) {
                        color = Color.parseColor(string);
                    }
                    paint.setColor(color);
                    paint.setAntiAlias(true);
                    canvas.drawPath(path, paint);
                    i4++;
                    i3 = 1;
                    str4 = str4;
                    str3 = str11;
                    str6 = str9;
                    str5 = str5;
                    str7 = str10;
                    strEncodeToString = str2;
                    bitmapCreateBitmap = bitmap;
                } catch (Exception e2) {
                    e = e2;
                    strEncodeToString = str2;
                    e.printStackTrace();
                    return strEncodeToString;
                }
            }
            str2 = strEncodeToString;
            Bitmap bitmap2 = bitmapCreateBitmap;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            bitmap2.recycle();
        } catch (Exception e3) {
            e = e3;
        }
        return strEncodeToString;
    }

    public static ReadableArray getArray(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        try {
            if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
                return null;
            }
            return readableMap.getArray(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean getBoolean(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return false;
        }
        try {
            return readableMap.hasKey(str) && !readableMap.isNull(str) && readableMap.getBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static double getDouble(ReadableMap readableMap, String str) {
        return getDouble(readableMap, str, 0.0d);
    }

    public static int getInt(ReadableMap readableMap, String str) {
        return getInt(readableMap, str, 0);
    }

    public static ReadableMap getMap(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        try {
            if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
                return null;
            }
            return readableMap.getMap(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getProcessName(Context context) {
        if (context == null) {
            return "";
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static String getString(ReadableMap readableMap, String str) {
        return getString(readableMap, str, "");
    }

    public static String getValueString(ReadableMap readableMap, String str, String str2) {
        if (readableMap == null || TextUtils.isEmpty(str) || !readableMap.hasKey(str)) {
            return str2;
        }
        int i = AnonymousClass2.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(str).ordinal()];
        if (i == 2) {
            return String.valueOf(readableMap.getBoolean(str));
        }
        if (i == 3) {
            try {
                return String.valueOf(readableMap.getInt(str));
            } catch (Exception unused) {
                return String.valueOf(readableMap.getDouble(str));
            }
        }
        if (i == 4) {
            return getString(readableMap, str);
        }
        if (i != 5) {
            return i != 6 ? str2 : getArray(readableMap, str).toString();
        }
        return getMap(readableMap, str).toString();
    }

    public static final String join(List<String> list, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null) {
            for (String str2 : list) {
                stringBuffer.append(str);
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.length() == 0 ? "" : stringBuffer.substring(str.length());
    }

    public static WritableMap jsonObjToWritableMap(JSONObject jSONObject) {
        return jsonStrToWritableMap(jSONObject.toString());
    }

    private static Map<String, Object> jsonStrToMap(String str) {
        try {
            return (Map) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils.1
            }.getType());
        } catch (Exception e) {
            RnPluginLog.addFrameworkLog("MIOTUtils", "jsonStrToMap occur exception! jsonString = " + str + "\n exception:" + Log.getStackTraceString(e));
            return new HashMap();
        }
    }

    public static WritableMap jsonStrToWritableMap(String str) {
        return Arguments.makeNativeMap(jsonStrToMap(str));
    }

    public static String parseRequire(ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() != 0) {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                if (map == null || !map.hasKey(SportRecordBundleKey.BUNDLE_PARAM_URI) || map.isNull(SportRecordBundleKey.BUNDLE_PARAM_URI)) {
                    return null;
                }
                return map.getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
            }
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map2 = readableArray.getMap(i);
                if (map2 != null) {
                    if (!map2.hasKey(SportRecordBundleKey.BUNDLE_PARAM_URI) || map2.isNull(SportRecordBundleKey.BUNDLE_PARAM_URI)) {
                        return null;
                    }
                    return map2.getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
                }
            }
        }
        return null;
    }

    public static String readableArrToJsonStr(ReadableArray readableArray) {
        if (readableArray == null) {
            return new JSONArray().toString();
        }
        try {
            return new JSONArray(readableArray.toString()).toString();
        } catch (Exception e) {
            RnPluginLog.e(e.toString());
            return new JSONArray().toString();
        }
    }

    public static String readableMapToJsonStr(ReadableMap readableMap) {
        if (readableMap == null) {
            return new JSONObject().toString();
        }
        try {
            JSONObject jSONObject = new JSONObject(readableMap.toString());
            return jSONObject.has("NativeMap") ? jSONObject.getString("NativeMap") : jSONObject.toString();
        } catch (JSONException e) {
            RnPluginLog.e(e.toString());
            return new JSONObject().toString();
        }
    }

    public static Bitmap shotListView(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        int count = adapter.getCount();
        ArrayList arrayList = new ArrayList();
        int measuredHeight = 0;
        for (int i = 0; i < count; i++) {
            View view = adapter.getView(i, null, listView);
            view.measure(View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            arrayList.add(view.getDrawingCache());
            measuredHeight += view.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(listView.getMeasuredWidth(), measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        int height = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bitmap bitmap = (Bitmap) arrayList.get(i2);
            canvas.drawBitmap(bitmap, 0.0f, height, paint);
            height += bitmap.getHeight();
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap shotRecyclerView(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return null;
        }
        int itemCount = adapter.getItemCount();
        Paint paint = new Paint();
        LruCache lruCache = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        int measuredHeight = 0;
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.d0 d0VarCreateViewHolder = adapter.createViewHolder(recyclerView, adapter.getItemViewType(i));
            adapter.onBindViewHolder(d0VarCreateViewHolder, i);
            d0VarCreateViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            View view = d0VarCreateViewHolder.itemView;
            view.layout(0, 0, view.getMeasuredWidth(), d0VarCreateViewHolder.itemView.getMeasuredHeight());
            d0VarCreateViewHolder.itemView.setDrawingCacheEnabled(true);
            d0VarCreateViewHolder.itemView.buildDrawingCache();
            Bitmap drawingCache = d0VarCreateViewHolder.itemView.getDrawingCache();
            if (drawingCache != null) {
                lruCache.put(String.valueOf(i), drawingCache);
            }
            measuredHeight += d0VarCreateViewHolder.itemView.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(recyclerView.getMeasuredWidth(), measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = recyclerView.getBackground();
        if (background instanceof ColorDrawable) {
            canvas.drawColor(((ColorDrawable) background).getColor());
        }
        int height = 0;
        for (int i2 = 0; i2 < itemCount; i2++) {
            Bitmap bitmap = (Bitmap) lruCache.get(String.valueOf(i2));
            canvas.drawBitmap(bitmap, 0.0f, height, paint);
            height += bitmap.getHeight();
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap shotScrollView(FrameLayout frameLayout) {
        int height = 0;
        for (int i = 0; i < frameLayout.getChildCount(); i++) {
            height += frameLayout.getChildAt(i).getHeight();
            frameLayout.getChildAt(i).setBackgroundColor(-1);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), height, Bitmap.Config.RGB_565);
        frameLayout.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static byte[] string2Byte(String str) {
        if (str == null) {
            return new byte[0];
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) (char2Int(charArray[i2 + 1]) | (char2Int(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static void getArray(JSONArray jSONArray, WritableArray writableArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objOpt = jSONArray.opt(i);
                if (objOpt instanceof JSONObject) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    getMap((JSONObject) objOpt, writableMapCreateMap);
                    writableArray.pushMap(writableMapCreateMap);
                } else if (objOpt instanceof JSONArray) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    getArray((JSONArray) objOpt, writableArrayCreateArray);
                    writableArray.pushArray(writableArrayCreateArray);
                } else if (objOpt instanceof Boolean) {
                    writableArray.pushBoolean(((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Integer) {
                    writableArray.pushInt(((Integer) objOpt).intValue());
                } else if (objOpt instanceof String) {
                    writableArray.pushString((String) objOpt);
                } else if (objOpt instanceof Number) {
                    writableArray.pushDouble(((Number) objOpt).doubleValue());
                }
            }
        }
    }

    public static double getDouble(ReadableMap readableMap, String str, double d) {
        if (readableMap == null) {
            return d;
        }
        try {
            return (!readableMap.hasKey(str) || readableMap.isNull(str)) ? d : readableMap.getDouble(str);
        } catch (Exception unused) {
            return d;
        }
    }

    public static int getInt(ReadableMap readableMap, String str, int i) {
        if (readableMap == null) {
            return i;
        }
        try {
            return (!readableMap.hasKey(str) || readableMap.isNull(str)) ? i : readableMap.getInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static ReadableMap getMap(ReadableArray readableArray, int i) {
        if (readableArray == null) {
            return null;
        }
        try {
            if (readableArray.size() <= i || readableArray.isNull(i)) {
                return null;
            }
            return readableArray.getMap(i);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getString(ReadableMap readableMap, String str, String str2) {
        if (readableMap == null) {
            return str2;
        }
        try {
            return (!readableMap.hasKey(str) || readableMap.isNull(str)) ? str2 : readableMap.getString(str);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static void getMap(JSONObject jSONObject, WritableMap writableMap) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof JSONObject) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    getMap((JSONObject) objOpt, writableMapCreateMap);
                    writableMap.putMap(next, writableMapCreateMap);
                } else if (objOpt instanceof JSONArray) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    getArray((JSONArray) objOpt, writableArrayCreateArray);
                    writableMap.putArray(next, writableArrayCreateArray);
                } else if (objOpt instanceof Boolean) {
                    writableMap.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Integer) {
                    writableMap.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof String) {
                    writableMap.putString(next, (String) objOpt);
                } else if (objOpt instanceof Number) {
                    writableMap.putDouble(next, ((Number) objOpt).doubleValue());
                }
            }
        }
    }
}
