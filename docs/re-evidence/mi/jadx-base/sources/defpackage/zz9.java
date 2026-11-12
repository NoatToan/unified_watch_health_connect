package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes4.dex */
public class zz9 {
    public static WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        Rect rect = new Rect();
        textPaint2.getTextBounds("T", 0, 1, rect);
        double dHeight = (rect.height() / 100.0f) / displayMetrics.density;
        Rect rect2 = new Rect();
        textPaint2.getTextBounds("x", 0, 1, rect2);
        double dHeight2 = (rect2.height() / 100.0f) / displayMetrics.density;
        for (int i = 0; i < layout.getLineCount(); i++) {
            Rect rect3 = new Rect();
            layout.getLineBounds(i, rect3);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", layout.getLineLeft(i) / displayMetrics.density);
            writableMapCreateMap.putDouble("y", rect3.top / displayMetrics.density);
            writableMapCreateMap.putDouble("width", layout.getLineWidth(i) / displayMetrics.density);
            writableMapCreateMap.putDouble("height", rect3.height() / displayMetrics.density);
            writableMapCreateMap.putDouble("descender", layout.getLineDescent(i) / displayMetrics.density);
            writableMapCreateMap.putDouble("ascender", (-layout.getLineAscent(i)) / displayMetrics.density);
            writableMapCreateMap.putDouble("baseline", layout.getLineBaseline(i) / displayMetrics.density);
            writableMapCreateMap.putDouble("capHeight", dHeight);
            writableMapCreateMap.putDouble("xHeight", dHeight2);
            writableMapCreateMap.putString("text", charSequence.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        return writableArrayCreateArray;
    }
}
