package defpackage;

import android.text.TextUtils;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;

/* JADX INFO: loaded from: classes5.dex */
public class bch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f4057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4058b;
    public int c;
    public int d;
    public int e;
    public Boolean f;
    public int g;
    public Boolean h;
    public String i;

    public bch(ReadableMap readableMap) {
        this.f4058b = 1;
        this.h = Boolean.FALSE;
        this.i = readableMap.getString(MediaStoreUtil.MediaInfo.KEY_MIME_TYPE);
        this.f4057a = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals(OvulationTestRecord.Result.HIGH)) {
            this.f4058b = 0;
        }
        if (readableMap.getString("cameraType").equals("front")) {
            this.h = Boolean.TRUE;
        }
        this.c = (int) (readableMap.getDouble("quality") * 100.0d);
        this.e = readableMap.getInt("maxHeight");
        this.d = readableMap.getInt("maxWidth");
        this.f = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.g = readableMap.getInt("durationLimit");
    }
}
