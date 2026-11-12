package org.acra.collector;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.Key;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.market.sdk.Constants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class DisplayManagerCollector extends BaseReportFieldCollector {
    public DisplayManagerCollector() {
        super(ReportField.DISPLAY, new ReportField[0]);
    }

    @NonNull
    private String activeFlags(SparseArray<String> sparseArray, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2) & i;
            if (iKeyAt > 0) {
                if (sb.length() > 0) {
                    sb.append('+');
                }
                sb.append(sparseArray.get(iKeyAt));
            }
        }
        return sb.toString();
    }

    private void collectCurrentSizeRange(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 16) {
            Point point = new Point();
            Point point2 = new Point();
            display.getCurrentSizeRange(point, point2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("smallest", new JSONArray((Collection) Arrays.asList(Integer.valueOf(point.x), Integer.valueOf(point.y))));
            jSONObject2.put("largest", new JSONArray((Collection) Arrays.asList(Integer.valueOf(point2.x), Integer.valueOf(point2.y))));
            jSONObject.put("currentSizeRange", jSONObject2);
        }
    }

    @NonNull
    private JSONObject collectDisplayData(@NonNull Display display) throws JSONException {
        display.getMetrics(new DisplayMetrics());
        JSONObject jSONObject = new JSONObject();
        collectCurrentSizeRange(display, jSONObject);
        collectFlags(display, jSONObject);
        collectMetrics(display, jSONObject);
        collectRealMetrics(display, jSONObject);
        collectName(display, jSONObject);
        collectRealSize(display, jSONObject);
        collectRectSize(display, jSONObject);
        collectSize(display, jSONObject);
        collectRotation(display, jSONObject);
        collectIsValid(display, jSONObject);
        jSONObject.put("orientation", display.getRotation()).put("refreshRate", display.getRefreshRate());
        jSONObject.put("height", display.getHeight()).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, display.getWidth()).put("pixelFormat", display.getPixelFormat());
        return jSONObject;
    }

    private void collectFlags(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 17) {
            SparseArray<String> sparseArray = new SparseArray<>();
            int flags = display.getFlags();
            for (Field field : display.getClass().getFields()) {
                if (field.getName().startsWith("FLAG_")) {
                    try {
                        sparseArray.put(field.getInt(null), field.getName());
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
            jSONObject.put(DataCacher.j, activeFlags(sparseArray, flags));
        }
    }

    private void collectIsValid(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 17) {
            jSONObject.put("isValid", display.isValid());
        }
    }

    private void collectMetrics(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        JSONObject jSONObject2 = new JSONObject();
        collectMetrics(displayMetrics, jSONObject2);
        jSONObject.put("metrics", jSONObject2);
    }

    private void collectName(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 17) {
            jSONObject.put("name", display.getName());
        }
    }

    private void collectRealMetrics(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            JSONObject jSONObject2 = new JSONObject();
            collectMetrics(displayMetrics, jSONObject2);
            jSONObject.put("realMetrics", jSONObject2);
        }
    }

    private void collectRealSize(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            display.getRealSize(point);
            jSONObject.put("realSize", new JSONArray((Collection) Arrays.asList(Integer.valueOf(point.x), Integer.valueOf(point.y))));
        }
    }

    private void collectRectSize(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        Rect rect = new Rect();
        display.getRectSize(rect);
        jSONObject.put("rectSize", new JSONArray((Collection) Arrays.asList(Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.width()), Integer.valueOf(rect.height()))));
    }

    private void collectRotation(@NonNull Display display, JSONObject jSONObject) throws JSONException {
        jSONObject.put(Key.ROTATION, rotationToString(display.getRotation()));
    }

    private void collectSize(@NonNull Display display, @NonNull JSONObject jSONObject) throws JSONException {
        Point point = new Point();
        display.getSize(point);
        jSONObject.put("size", new JSONArray((Collection) Arrays.asList(Integer.valueOf(point.x), Integer.valueOf(point.y))));
    }

    @NonNull
    private Display[] getDisplays(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 17 ? ((DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplays() : new Display[]{((WindowManager) context.getSystemService("window")).getDefaultDisplay()};
    }

    @NonNull
    private String rotationToString(int i) {
        if (i == 0) {
            return "ROTATION_0";
        }
        if (i == 1) {
            return "ROTATION_90";
        }
        if (i != 2) {
            return i != 3 ? String.valueOf(i) : "ROTATION_270";
        }
        return "ROTATION_180";
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) {
        JSONObject jSONObject = new JSONObject();
        for (Display display : getDisplays(context)) {
            try {
                jSONObject.put(String.valueOf(display.getDisplayId()), collectDisplayData(display));
            } catch (JSONException e) {
                ACRA.log.w(ACRA.LOG_TAG, "Failed to collect data for display " + display.getDisplayId(), e);
            }
        }
        crashReportData.put(ReportField.DISPLAY, jSONObject);
    }

    private void collectMetrics(@NonNull DisplayMetrics displayMetrics, @NonNull JSONObject jSONObject) throws JSONException {
        jSONObject.put(Constants.JSON_DENSITY, displayMetrics.density).put("densityDpi", displayMetrics.densityDpi).put("scaledDensity", "x" + displayMetrics.scaledDensity).put("widthPixels", displayMetrics.widthPixels).put("heightPixels", displayMetrics.heightPixels).put("xdpi", displayMetrics.xdpi).put("ydpi", displayMetrics.ydpi);
    }
}
