package com.facebook.share.internal;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/share/internal/OpenGraphJSONUtility;", "", "Lcom/facebook/share/model/ShareOpenGraphAction;", "action", "Lcom/facebook/share/internal/OpenGraphJSONUtility$PhotoJSONProcessor;", "photoJSONProcessor", "Lorg/json/JSONObject;", "toJSONObject", "Lcom/facebook/share/model/ShareOpenGraphObject;", "graphObject", "b", "", "list", "Lorg/json/JSONArray;", "a", "value", "toJSONValue", "<init>", "()V", "PhotoJSONProcessor", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class OpenGraphJSONUtility {

    @NotNull
    public static final OpenGraphJSONUtility INSTANCE = new OpenGraphJSONUtility();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/internal/OpenGraphJSONUtility$PhotoJSONProcessor;", "", "Lcom/facebook/share/model/SharePhoto;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lorg/json/JSONObject;", "toJSONObject", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface PhotoJSONProcessor {
        @Nullable
        JSONObject toJSONObject(@NotNull SharePhoto photo);
    }

    private OpenGraphJSONUtility() {
    }

    private final JSONArray a(List<?> list, PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(toJSONValue(it2.next(), photoJSONProcessor));
        }
        return jSONArray;
    }

    private final JSONObject b(ShareOpenGraphObject graphObject, PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : graphObject.keySet()) {
            jSONObject.put(str, toJSONValue(graphObject.get(str), photoJSONProcessor));
        }
        return jSONObject;
    }

    @JvmStatic
    @Nullable
    public static final JSONObject toJSONObject(@Nullable ShareOpenGraphAction action, @Nullable PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        if (action == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : action.keySet()) {
            jSONObject.put(str, toJSONValue(action.get(str), photoJSONProcessor));
        }
        return jSONObject;
    }

    @JvmStatic
    @Nullable
    public static final Object toJSONValue(@Nullable Object value, @Nullable PhotoJSONProcessor photoJSONProcessor) throws JSONException {
        if (value == null) {
            return JSONObject.NULL;
        }
        if ((value instanceof String) || (value instanceof Boolean) || (value instanceof Double) || (value instanceof Float) || (value instanceof Integer) || (value instanceof Long)) {
            return value;
        }
        try {
            if (value instanceof SharePhoto) {
                if (photoJSONProcessor != null) {
                    return photoJSONProcessor.toJSONObject((SharePhoto) value);
                }
                return null;
            }
            if (value instanceof ShareOpenGraphObject) {
                return INSTANCE.b((ShareOpenGraphObject) value, photoJSONProcessor);
            }
            if (value instanceof List) {
                return INSTANCE.a((List) value, photoJSONProcessor);
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
