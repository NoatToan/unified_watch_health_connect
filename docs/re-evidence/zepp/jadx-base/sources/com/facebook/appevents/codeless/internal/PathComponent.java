package com.facebook.appevents.codeless.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0011\b\u0000\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f¨\u0006&"}, d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent;", "", "", "a", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "className", "", "b", LogUtil.I, "getIndex", "()I", "index", "c", "getId", "id", GoogleApiAvailabilityLight.a, "getText", "text", "e", "getTag", "tag", "f", "getDescription", "description", "g", "getHint", "hint", "h", "getMatchBitmask", "matchBitmask", "Lorg/json/JSONObject;", "component", "<init>", "(Lorg/json/JSONObject;)V", "Companion", "MatchBitmaskType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class PathComponent {
    private static final String i = "class_name";
    private static final String j = "index";
    private static final String k = "id";
    private static final String l = "text";
    private static final String m = "tag";
    private static final String n = "description";
    private static final String o = "hint";
    private static final String p = "match_bitmask";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String className;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String hint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int matchBitmask;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "ID", "TEXT", "TAG", ShareConstants.DESCRIPTION, "HINT", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(@NotNull JSONObject jSONObject) {
        this.className = jSONObject.getString(i);
        this.index = jSONObject.optInt("index", -1);
        this.id = jSONObject.optInt("id");
        this.text = jSONObject.optString("text");
        this.tag = jSONObject.optString("tag");
        this.description = jSONObject.optString("description");
        this.hint = jSONObject.optString("hint");
        this.matchBitmask = jSONObject.optInt(p);
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    public final int getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }
}
