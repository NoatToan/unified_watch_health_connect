package com.huawei.watchface;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.internal.Primitives;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import com.huawei.watchface.utils.HwLog;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes45.dex */
public class y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f30678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.e f30679b;

    public y4(Gson gson, a5.e eVar) {
        this.f30678a = gson;
        this.f30679b = eVar;
    }

    public static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                HwLog.e("WatchFaceConfigParser", "assertFullConsumption MalformedJsonException: " + HwLog.printException((Exception) e));
            } catch (IOException e2) {
                HwLog.e("WatchFaceConfigParser", "assertFullConsumption JsonIOException: " + HwLog.printException((Exception) e2));
            }
        }
    }

    public String toString() {
        return this.f30678a.toString();
    }

    public Object a(Class cls, Reader reader) {
        a5 a5Var = new a5(reader, this.f30679b);
        Object objA = a((Type) cls, a5Var);
        a(objA, a5Var);
        return Primitives.wrap(cls).cast(objA);
    }

    public final Object a(Type type, a5 a5Var) {
        return this.f30678a.fromJson(a5Var, type);
    }

    public void a(Writer writer, Object obj) {
        try {
            this.f30678a.toJson(obj, obj.getClass(), new b5(obj.getClass().getSimpleName(), writer));
        } catch (JsonIOException e) {
            HwLog.e("WatchFaceConfigParser", "toXml JsonIOException: " + HwLog.printException((Exception) e));
        } catch (IOException e2) {
            HwLog.e("WatchFaceConfigParser", "toXml IOException: " + HwLog.printException((Exception) e2));
        }
    }
}
