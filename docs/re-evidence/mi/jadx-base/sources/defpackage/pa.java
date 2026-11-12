package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;

/* JADX INFO: loaded from: classes4.dex */
public class pa extends d9 {
    public ReadableMap m;
    public int n = 0;

    @Override // defpackage.d9, defpackage.jb
    public void a(Canvas canvas, Paint paint, float f) {
        ReadableArray array;
        ReadableMap readableMap = this.m;
        if (readableMap == null) {
            return;
        }
        float f2 = f * this.f22602a;
        if (f2 > 0.01f && readableMap.hasKey("lines") && (array = this.m.getArray("lines")) != null && array.size() != 0) {
            c(canvas);
            int size = array.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = array.getString(i);
            }
            String strJoin = TextUtils.join("\n", strArr);
            if (h(paint, f2)) {
                i(paint);
                Path path = this.f;
                if (path == null) {
                    canvas.drawText(strJoin, 0.0f, -paint.ascent(), paint);
                } else {
                    canvas.drawTextOnPath(strJoin, path, 0.0f, 0.0f, paint);
                }
            }
            if (g(paint, f2)) {
                i(paint);
                Path path2 = this.f;
                if (path2 == null) {
                    canvas.drawText(strJoin, 0.0f, -paint.ascent(), paint);
                } else {
                    canvas.drawTextOnPath(strJoin, path2, 0.0f, 0.0f, paint);
                }
            }
            b(canvas);
            markUpdateSeen();
        }
    }

    public final void i(Paint paint) {
        ReadableMap map;
        int i = this.n;
        int i2 = 2;
        if (i == 0) {
            paint.setTextAlign(Paint.Align.LEFT);
        } else if (i == 1) {
            paint.setTextAlign(Paint.Align.RIGHT);
        } else if (i == 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        }
        ReadableMap readableMap = this.m;
        if (readableMap == null || !readableMap.hasKey(SlotType.FONT) || (map = this.m.getMap(SlotType.FONT)) == null) {
            return;
        }
        paint.setTextSize((map.hasKey("fontSize") ? (float) map.getDouble("fontSize") : 12.0f) * this.c);
        boolean z = map.hasKey("fontWeight") && "bold".equals(map.getString("fontWeight"));
        boolean z2 = map.hasKey("fontStyle") && "italic".equals(map.getString("fontStyle"));
        if (z && z2) {
            i2 = 3;
        } else if (z) {
            i2 = 1;
        } else if (!z2) {
            i2 = 0;
        }
        paint.setTypeface(Typeface.create(map.getString("fontFamily"), i2));
    }

    @iej(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.n = i;
    }

    @iej(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.m = readableMap;
    }
}
