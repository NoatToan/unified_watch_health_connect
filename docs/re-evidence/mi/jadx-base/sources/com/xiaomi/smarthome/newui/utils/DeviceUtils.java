package com.xiaomi.smarthome.newui.utils;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.smarthome.device.Device;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0018\u00010\u0006H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J,\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0012j\b\u0012\u0004\u0012\u00020\u0004`\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0015H\u0007J\u001e\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/smarthome/newui/utils/DeviceUtils;", "", "()V", "getDeviceStatus", "", "statusRenderData", "", "Landroid/util/Pair;", "getEnableModuleId", "device", "Lcom/xiaomi/smarthome/device/Device;", "getIRDeviceDid", "getParentId", "getSpecDid", "getSubDids", "Lorg/json/JSONArray;", "getUrn", "getUrns", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "allDevices", "", "hasOnline", "", "isIRDevice", "did", "toString", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DeviceUtils {

    @NotNull
    public static final DeviceUtils INSTANCE = new DeviceUtils();

    private DeviceUtils() {
    }

    @JvmStatic
    @Nullable
    public static final String getDeviceStatus(@Nullable List<? extends Pair<?, ?>> statusRenderData) {
        String string;
        String string2;
        if (statusRenderData == null) {
            return null;
        }
        int size = statusRenderData.size();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Pair<?, ?> pair = statusRenderData.get(i);
            Object obj = pair.first;
            if (obj == null || (obj instanceof String)) {
                Object obj2 = pair.second;
                if (!(obj2 instanceof String)) {
                    continue;
                } else {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    if (TextUtils.isEmpty((String) obj2)) {
                        continue;
                    } else {
                        String str = (String) pair.first;
                        if (str == null) {
                            string = null;
                        } else {
                            int length = str.length() - 1;
                            int i3 = 0;
                            boolean z = false;
                            while (i3 <= length) {
                                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i3 : length), 32) <= 0;
                                if (z) {
                                    if (!z2) {
                                        break;
                                    }
                                    length--;
                                } else if (z2) {
                                    i3++;
                                } else {
                                    z = true;
                                }
                            }
                            string = str.subSequence(i3, length + 1).toString();
                        }
                        if (TextUtils.isEmpty(string)) {
                            String str2 = (String) pair.second;
                            if (str2 == null) {
                                string2 = null;
                            } else {
                                int length2 = str2.length() - 1;
                                int i4 = 0;
                                boolean z3 = false;
                                while (i4 <= length2) {
                                    boolean z4 = Intrinsics.compare((int) str2.charAt(!z3 ? i4 : length2), 32) <= 0;
                                    if (z3) {
                                        if (!z4) {
                                            break;
                                        }
                                        length2--;
                                    } else if (z4) {
                                        i4++;
                                    } else {
                                        z3 = true;
                                    }
                                }
                                string2 = str2.subSequence(i4, length2 + 1).toString();
                            }
                            sb.append(string2);
                        } else {
                            sb.append(string);
                            sb.append(" ");
                            Object obj3 = pair.second;
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str3 = (String) obj3;
                            int length3 = str3.length() - 1;
                            int i5 = 0;
                            boolean z5 = false;
                            while (i5 <= length3) {
                                boolean z6 = Intrinsics.compare((int) str3.charAt(!z5 ? i5 : length3), 32) <= 0;
                                if (z5) {
                                    if (!z6) {
                                        break;
                                    }
                                    length3--;
                                } else if (z6) {
                                    i5++;
                                } else {
                                    z5 = true;
                                }
                            }
                            sb.append(str3.subSequence(i5, length3 + 1).toString());
                        }
                        sb.append(" ");
                    }
                }
            }
            i = i2;
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "statusBuilder.toString()");
        int length4 = string3.length() - 1;
        int i6 = 0;
        boolean z7 = false;
        while (i6 <= length4) {
            boolean z8 = Intrinsics.compare((int) string3.charAt(!z7 ? i6 : length4), 32) <= 0;
            if (z7) {
                if (!z8) {
                    break;
                }
                length4--;
            } else if (z8) {
                i6++;
            } else {
                z7 = true;
            }
        }
        return string3.subSequence(i6, length4 + 1).toString();
    }

    @JvmStatic
    @Nullable
    public static final String getEnableModuleId(@Nullable Device device) {
        JSONObject extra;
        JSONObject jSONObjectOptJSONObject;
        if (device == null || (extra = device.getExtra()) == null || (jSONObjectOptJSONObject = extra.optJSONObject("split")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("moduleId");
    }

    @JvmStatic
    @NotNull
    public static final String getIRDeviceDid() {
        return Intrinsics.stringPlus(Build.MODEL, "_ir");
    }

    @JvmStatic
    @Nullable
    public static final String getParentId(@Nullable Device device) {
        JSONObject extra;
        JSONObject jSONObjectOptJSONObject;
        if (device == null || (extra = device.getExtra()) == null || (jSONObjectOptJSONObject = extra.optJSONObject("split")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("parentId");
    }

    @JvmStatic
    @Nullable
    public static final String getSpecDid(@Nullable Device device) {
        String parentId = getParentId(device);
        if (!TextUtils.isEmpty(parentId)) {
            return parentId;
        }
        if (device == null) {
            return null;
        }
        return device.getDid();
    }

    @JvmStatic
    @Nullable
    public static final JSONArray getSubDids(@Nullable Device device) {
        JSONObject extra;
        JSONObject jSONObjectOptJSONObject;
        if (device == null || (extra = device.getExtra()) == null || (jSONObjectOptJSONObject = extra.optJSONObject("split")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONArray("subDids");
    }

    @JvmStatic
    @Nullable
    public static final String getUrn(@Nullable Device device) {
        if (device == null) {
            return null;
        }
        return device.getSpecUrn();
    }

    @JvmStatic
    @NotNull
    public static final HashSet<String> getUrns(@NotNull Map<String, Device> allDevices) {
        Intrinsics.checkNotNullParameter(allDevices, "allDevices");
        HashSet<String> hashSet = new HashSet<>();
        Iterator<Map.Entry<String, Device>> it = allDevices.entrySet().iterator();
        while (it.hasNext()) {
            Device value = it.next().getValue();
            if ((value == null ? null : value.getSpecUrn()) != null) {
                hashSet.add(value.getSpecUrn());
            }
        }
        return hashSet;
    }

    @JvmStatic
    public static final boolean hasOnline(@Nullable Map<String, Device> allDevices) {
        Set<Map.Entry<String, Device>> setEntrySet = allDevices == null ? null : allDevices.entrySet();
        if (setEntrySet == null) {
            return false;
        }
        for (Map.Entry<String, Device> entry : setEntrySet) {
            if (entry.getValue().isOnline) {
                String str = entry.getValue().did;
                Intrinsics.checkNotNullExpressionValue(str, "entry.value.did");
                if (!isIRDevice(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean isIRDevice(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (TextUtils.isEmpty(did)) {
            return false;
        }
        return StringsKt__StringsJVMKt.endsWith$default(did, "_ir", false, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final String toString(@Nullable Device device) {
        if (device == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return device.did + ' ' + ((Object) device.model);
    }
}
