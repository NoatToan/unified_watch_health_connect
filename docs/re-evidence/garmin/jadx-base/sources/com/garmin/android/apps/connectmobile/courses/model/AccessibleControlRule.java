package com.garmin.android.apps.connectmobile.courses.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(Serializer.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule;", "", "", "typeId", "", "typeKey", "<init>", "(ILjava/lang/String;)V", "Serializer", "b", "a", "Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule$a;", "Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule$b;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AccessibleControlRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32773b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule$Serializer;", "Lcom/google/gson/JsonSerializer;", "Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Serializer implements JsonSerializer<AccessibleControlRule> {
        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(AccessibleControlRule accessibleControlRule, Type type, JsonSerializationContext jsonSerializationContext) {
            AccessibleControlRule accessibleControlRule2 = accessibleControlRule;
            accessibleControlRule2.getClass();
            type.getClass();
            jsonSerializationContext.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("typeId", Integer.valueOf(accessibleControlRule2.f32772a));
            jsonObject.addProperty("typeKey", accessibleControlRule2.f32773b);
            return jsonObject;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule$a;", "Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends AccessibleControlRule {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f32774c = new a();

        private a() {
            super(2, "private", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule$b;", "Lcom/garmin/android/apps/connectmobile/courses/model/AccessibleControlRule;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends AccessibleControlRule {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f32775c = new b();

        private b() {
            super(1, "public", null);
        }
    }

    private AccessibleControlRule(int i14, String str) {
        this.f32772a = i14;
        this.f32773b = str;
    }

    public /* synthetic */ AccessibleControlRule(int i14, String str, p005kotlin.jvm.internal.j jVar) {
        this(i14, str);
    }
}
