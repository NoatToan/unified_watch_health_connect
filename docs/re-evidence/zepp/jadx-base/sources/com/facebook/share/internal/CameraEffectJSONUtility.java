package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import com.tekartik.sqflite.Constant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R:\u0010\u000e\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\bj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/share/internal/CameraEffectJSONUtility;", "", "Lcom/facebook/share/model/CameraEffectArguments;", Constant.PARAM_SQL_ARGUMENTS, "Lorg/json/JSONObject;", "convertToJSON", "jsonObject", "convertToCameraEffectArguments", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/facebook/share/internal/CameraEffectJSONUtility$a;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "SETTERS", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CameraEffectJSONUtility {

    @NotNull
    public static final CameraEffectJSONUtility INSTANCE = new CameraEffectJSONUtility();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final HashMap<Class<?>, a> SETTERS = r.hashMapOf(TuplesKt.to(String.class, new a() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$1
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.a
        public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String key, @Nullable Object value) throws JSONException {
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
            builder.putArgument(key, (String) value);
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.a
        public void setOnJSON(@NotNull JSONObject json, @NotNull String key, @Nullable Object value) throws JSONException {
            json.put(key, value);
        }
    }), TuplesKt.to(String[].class, new a() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$2
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.a
        public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String key, @Nullable Object value) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.a
        public void setOnJSON(@NotNull JSONObject json, @NotNull String key, @Nullable Object value) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            for (String str : (String[]) value) {
                jSONArray.put(str);
            }
            json.put(key, jSONArray);
        }
    }), TuplesKt.to(JSONArray.class, new a() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$3
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.a
        public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String key, @Nullable Object value) throws JSONException {
            Objects.requireNonNull(value, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray = (JSONArray) value;
            String[] strArr = new String[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj.getClass());
                }
                strArr[i] = (String) obj;
            }
            builder.putArgument(key, strArr);
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.a
        public void setOnJSON(@NotNull JSONObject json, @NotNull String key, @Nullable Object value) throws JSONException {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&J\"\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\f"}, d2 = {"com/facebook/share/internal/CameraEffectJSONUtility$a", "", "Lcom/facebook/share/model/CameraEffectArguments$Builder;", "builder", "", "key", "value", "", "setOnArgumentsBuilder", "Lorg/json/JSONObject;", "json", "setOnJSON", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String key, @Nullable Object value) throws JSONException;

        void setOnJSON(@NotNull JSONObject json, @NotNull String key, @Nullable Object value) throws JSONException;
    }

    private CameraEffectJSONUtility() {
    }

    @JvmStatic
    @Nullable
    public static final CameraEffectArguments convertToCameraEffectArguments(@Nullable JSONObject jsonObject) throws JSONException {
        if (jsonObject == null) {
            return null;
        }
        CameraEffectArguments.Builder builder = new CameraEffectArguments.Builder();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            if (obj != JSONObject.NULL) {
                a aVar = SETTERS.get(obj.getClass());
                if (aVar == null) {
                    throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                }
                aVar.setOnArgumentsBuilder(builder, next, obj);
            }
        }
        return builder.build();
    }

    @JvmStatic
    @Nullable
    public static final JSONObject convertToJSON(@Nullable CameraEffectArguments arguments) throws JSONException {
        if (arguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : arguments.keySet()) {
            Object obj = arguments.get(str);
            if (obj != null) {
                a aVar = SETTERS.get(obj.getClass());
                if (aVar == null) {
                    throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                }
                aVar.setOnJSON(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }
}
