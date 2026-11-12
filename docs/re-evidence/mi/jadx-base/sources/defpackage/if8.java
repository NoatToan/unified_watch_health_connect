package defpackage;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public class if8 {
    public static String a(ReadableMap readableMap) {
        if (readableMap != null && readableMap.getType("extraData") != ReadableType.Null) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, readableMap.getDynamic("extraData"));
                jsonWriter.close();
                stringWriter.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
