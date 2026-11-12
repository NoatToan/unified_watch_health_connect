package com.garmin.feature.garminpay.providers.gpay.util;

import ch.qos.logback.classic.net.SyslogAppender;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import gt2.c;
import java.io.IOException;
import java.lang.Enum;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.t0;
import p13.u0;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\b\tB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/GarminPayEnumTypeAdapter;", "", "T", "Lcom/google/gson/TypeAdapter;", "Ljava/lang/Class;", "enumClass", "<init>", "(Ljava/lang/Class;)V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminPayEnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f51729e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f51730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f51731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<T, String> f51732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f51733d;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
    }

    static {
        new a(null);
        int i14 = c.f79010a;
        f51729e = gt2.b.f79005a.h("PAY#NEW_FITPAY#GarminPayEnumTypeAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GarminPayEnumTypeAdapter(Class<T> cls) {
        Field field;
        String strName;
        cls.getClass();
        this.f51730a = cls;
        b bVar = (b) cls.getAnnotation(b.class);
        Logger logger = f51729e;
        logger.trace("Build for " + cls + ":");
        boolean z14 = bVar != null;
        this.f51733d = z14;
        logger.trace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN + z14);
        T[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        ArrayList<p> arrayList = new ArrayList(enumConstants.length);
        for (T t7 : enumConstants) {
            Class<T> cls2 = this.f51730a;
            t7.getClass();
            Field[] fields = cls2.getFields();
            fields.getClass();
            int length = fields.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    field = null;
                    break;
                }
                field = fields[i14];
                if (Modifier.isStatic(field.getModifiers()) && field.get(null) == t7) {
                    break;
                } else {
                    i14++;
                }
            }
            SerializedName serializedName = field != null ? (SerializedName) field.getAnnotation(SerializedName.class) : null;
            if (serializedName != null) {
                logger.trace("\t\tSerializedName found for " + t7 + " with value = " + serializedName.value());
            } else {
                logger.trace("\t\tNo SerializedName found for " + t7 + ", just use the name");
            }
            if (serializedName == null || (strName = serializedName.value()) == null) {
                strName = t7.name();
            }
            arrayList.add(new p(t7, strName));
        }
        this.f51732c = u0.l(arrayList);
        int iA = t0.a(y.r(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (p pVar : arrayList) {
            p pVar2 = new p((String) pVar.f128595b, (Enum) pVar.f128594a);
            linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
        }
        this.f51731b = linkedHashMap;
        logger.trace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN + linkedHashMap);
        logger.trace(SyslogAppender.DEFAULT_STACKTRACE_PATTERN + this.f51732c);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Object read2(JsonReader jsonReader) throws IOException {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        Enum r14 = (Enum) this.f51731b.get(strNextString);
        if (r14 != null) {
            return r14;
        }
        boolean z14 = this.f51733d;
        Class<T> cls = this.f51730a;
        if (z14) {
            h.t("Unknown name: ", strNextString, " for ", cls);
            return null;
        }
        f51729e.warn("Unknown name: " + strNextString + " for " + cls + ", parse it as null");
        return r14;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        Enum r14 = (Enum) obj;
        jsonWriter.getClass();
        jsonWriter.value(r14 != null ? this.f51732c.get(r14) : null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/util/GarminPayEnumTypeAdapter$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
