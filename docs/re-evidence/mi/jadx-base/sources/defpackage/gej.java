package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f18894b;

    public gej(ReadableMap readableMap) {
        this.f18893a = readableMap.getString("label");
        if (!readableMap.hasKey("color") || readableMap.isNull("color")) {
            this.f18894b = null;
        } else {
            this.f18894b = Integer.valueOf(readableMap.getInt("color"));
        }
    }

    public static List<gej> a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(new gej(readableArray.getMap(i)));
        }
        return arrayList;
    }
}
