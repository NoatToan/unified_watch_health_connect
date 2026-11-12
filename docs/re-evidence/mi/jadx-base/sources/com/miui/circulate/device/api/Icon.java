package com.miui.circulate.device.api;

import android.net.Uri;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/miui/circulate/device/api/Icon;", "Lcom/miui/circulate/device/api/Flat;", "type", "", "data", "", "(ILjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "flat", "", "getColorInt", "getDrawableRes", "Lcom/miui/circulate/device/api/Icon$Res;", "getUri", "Landroid/net/Uri;", "hashCode", "toString", "Companion", "Res", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Icon implements Flat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_COLOR_VALUE = 2;
    public static final int TYPE_RES = 1;
    public static final int TYPE_URI = 3;

    @NotNull
    private final Object data;
    private final int type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/miui/circulate/device/api/Icon$Companion;", "", "()V", "TYPE_COLOR_VALUE", "", "TYPE_RES", "TYPE_URI", "fromColor", "Lcom/miui/circulate/device/api/Icon;", "color", "fromPublicDrawable", OneTrack.Param.PKG, "", "res", "fromUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "parse", "json", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Icon fromColor(int color) {
            return new Icon(2, Integer.valueOf(color));
        }

        @JvmStatic
        @NotNull
        public final Icon fromPublicDrawable(@NotNull String pkg, int res) {
            Intrinsics.checkNotNullParameter(pkg, "pkg");
            return new Icon(1, new Res(pkg, res));
        }

        @JvmStatic
        @NotNull
        public final Icon fromUri(@NotNull String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Icon(3, uri);
        }

        @Nullable
        public final Icon parse(@Nullable String json) {
            Icon icon;
            if (json == null || json.length() == 0) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(json);
                int i = jSONObject.getInt(DeviceTagInterface.CUSTOM_TAG_TYPE);
                if (i == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(PluginDeviceInfo.FICONOFF);
                    String string = jSONObject2.getString(OneTrack.Param.PKG);
                    Intrinsics.checkNotNullExpressionValue(string, "resJson.getString(\"pkg\")");
                    return new Icon(i, new Res(string, jSONObject2.getInt("id")));
                }
                if (i == 2) {
                    String string2 = jSONObject.getString(PluginDeviceInfo.FICONOFF);
                    Intrinsics.checkNotNullExpressionValue(string2, "jo.getString(\"d\")");
                    icon = new Icon(i, Integer.valueOf(Integer.parseInt(string2)));
                } else {
                    if (i != 3) {
                        return null;
                    }
                    String string3 = jSONObject.getString(PluginDeviceInfo.FICONOFF);
                    Intrinsics.checkNotNullExpressionValue(string3, "jo.getString(\"d\")");
                    icon = new Icon(i, string3);
                }
                return icon;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/miui/circulate/device/api/Icon$Res;", "", OneTrack.Param.PKG, "", "id", "", "(Ljava/lang/String;I)V", "getId", "()I", "getPkg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class Res {
        private final int id;

        @NotNull
        private final String pkg;

        public Res(@NotNull String pkg, int i) {
            Intrinsics.checkNotNullParameter(pkg, "pkg");
            this.pkg = pkg;
            this.id = i;
        }

        public static /* synthetic */ Res copy$default(Res res, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = res.pkg;
            }
            if ((i2 & 2) != 0) {
                i = res.id;
            }
            return res.copy(str, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPkg() {
            return this.pkg;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        public final Res copy(@NotNull String pkg, int id) {
            Intrinsics.checkNotNullParameter(pkg, "pkg");
            return new Res(pkg, id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Res)) {
                return false;
            }
            Res res = (Res) other;
            return Intrinsics.areEqual(this.pkg, res.pkg) && this.id == res.id;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getPkg() {
            return this.pkg;
        }

        public int hashCode() {
            return (this.pkg.hashCode() * 31) + Integer.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return "Res(pkg=" + this.pkg + ", id=" + this.id + ')';
        }
    }

    public Icon(int i, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = i;
        this.data = data;
    }

    public static /* synthetic */ Icon copy$default(Icon icon, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = icon.type;
        }
        if ((i2 & 2) != 0) {
            obj = icon.data;
        }
        return icon.copy(i, obj);
    }

    @JvmStatic
    @NotNull
    public static final Icon fromColor(int i) {
        return INSTANCE.fromColor(i);
    }

    @JvmStatic
    @NotNull
    public static final Icon fromPublicDrawable(@NotNull String str, int i) {
        return INSTANCE.fromPublicDrawable(str, i);
    }

    @JvmStatic
    @NotNull
    public static final Icon fromUri(@NotNull String str) {
        return INSTANCE.fromUri(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final Icon copy(int type, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new Icon(type, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) other;
        return this.type == icon.type && Intrinsics.areEqual(this.data, icon.data);
    }

    @Override // com.miui.circulate.device.api.Flat
    @NotNull
    public String flat() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DeviceTagInterface.CUSTOM_TAG_TYPE, this.type);
        if (this.type == 1) {
            JSONObject jSONObject2 = new JSONObject();
            Object obj = this.data;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.miui.circulate.device.api.Icon.Res");
            Res res = (Res) obj;
            jSONObject2.put(OneTrack.Param.PKG, res.getPkg());
            jSONObject2.put("id", res.getId());
            jSONObject.put(PluginDeviceInfo.FICONOFF, jSONObject2);
        } else {
            jSONObject.put(PluginDeviceInfo.FICONOFF, this.data.toString());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        return string;
    }

    public final int getColorInt() {
        if (this.type == 2) {
            Object obj = this.data;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        throw new IllegalArgumentException("illegal color value icon, " + this);
    }

    @NotNull
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final Res getDrawableRes() {
        if (this.type == 1) {
            Object obj = this.data;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.miui.circulate.device.api.Icon.Res");
            return (Res) obj;
        }
        throw new IllegalArgumentException("illegal drawable res icon, " + this);
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final Uri getUri() {
        if (this.type != 3) {
            throw new IllegalArgumentException("illegal uri icon, " + this);
        }
        Object obj = this.data;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Uri uri = Uri.parse((String) obj);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(data as String)");
        return uri;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "Icon(type=" + this.type + ", data=" + this.data + ')';
    }
}
