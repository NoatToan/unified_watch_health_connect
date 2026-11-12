package com.xiaomi.fitness.watch.face.debug.designer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.data.FaceCapabilityItem;
import com.xiaomi.fitness.watch.face.debug.designer.FaceCapabilityMatcher;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u001d\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u001e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/designer/FaceCapabilityMatcher;", "", "<init>", "()V", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "matchCapability", "", "faceCapabilityStr", "", "deviceCapabilityStr", "adapter", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerLogAdapter;", "parseDeviceCapability", "", "Lcom/xiaomi/fitness/watch/face/data/FaceCapabilityItem;", DevInfoKeys.CAPABILITY, "(Ljava/lang/String;)[Lcom/xiaomi/fitness/watch/face/data/FaceCapabilityItem;", "matchCapabilityItem", "faceItem", "deviceItem", "matchLow", "faceValue", "deviceValue", "matchString", "matchByte", "TAG", "MATCH_LOW", "", "MATCH_STRING", "MATCH_BYTE", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceCapabilityMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceCapabilityMatcher.kt\ncom/xiaomi/fitness/watch/face/debug/designer/FaceCapabilityMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1#2:175\n1863#3,2:176\n1863#3,2:178\n*S KotlinDebug\n*F\n+ 1 FaceCapabilityMatcher.kt\ncom/xiaomi/fitness/watch/face/debug/designer/FaceCapabilityMatcher\n*L\n142#1:176,2\n146#1:178,2\n*E\n"})
public final class FaceCapabilityMatcher {
    private static final int MATCH_BYTE = 3;
    private static final int MATCH_LOW = 1;
    private static final int MATCH_STRING = 2;

    @NotNull
    private static final String TAG = "FaceCapabilityMatcher";

    @NotNull
    public static final FaceCapabilityMatcher INSTANCE = new FaceCapabilityMatcher();

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wn8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceCapabilityMatcher.mGson_delegate$lambda$0();
        }
    });

    private FaceCapabilityMatcher() {
    }

    private final Gson getMGson() {
        return (Gson) mGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    private final boolean matchByte(FaceCapabilityItem faceItem, String faceValue, String deviceValue, FaceDesignerLogAdapter adapter) {
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) faceValue, new String[]{","}, false, 0, 6, (Object) null).iterator();
        String str = "";
        String str2 = "";
        while (it.hasNext()) {
            str2 = ((Object) str2) + ((String) it.next());
        }
        Iterator it2 = StringsKt__StringsKt.split$default((CharSequence) deviceValue, new String[]{","}, false, 0, 6, (Object) null).iterator();
        while (it2.hasNext()) {
            str = ((Object) str) + ((String) it2.next());
        }
        if (str.length() < str2.length()) {
            int length = str2.length() - str.length();
            for (int i = 0; i < length; i++) {
                str = ((Object) str) + "0";
            }
        }
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = str2.charAt(i2);
            char cCharAt2 = str.charAt(i2);
            if (cCharAt == '1' && cCharAt2 == '0') {
                adapter.append("能力集MATCH_BYTE失败，" + faceItem.getName() + "序号为" + i2 + "的能力设备不支持");
                Logger.i(TAG, faceItem.getName() + " match fail cause match 3 fail, byte in " + i2 + " device not support");
                return false;
            }
        }
        return true;
    }

    private final boolean matchCapabilityItem(FaceCapabilityItem faceItem, FaceCapabilityItem deviceItem, FaceDesignerLogAdapter adapter) {
        int type = faceItem.getType();
        String str = faceItem.getValue().get(0);
        String str2 = deviceItem.getValue().get(0);
        if (type == 1) {
            return matchLow(faceItem, str, str2, adapter);
        }
        if (type == 2) {
            return matchString(faceItem, str, str2, adapter);
        }
        if (type == 3) {
            return matchByte(faceItem, str, str2, adapter);
        }
        adapter.append("能力集匹配失败，" + faceItem.getName() + "有不合法的type: " + type);
        return false;
    }

    private final boolean matchLow(FaceCapabilityItem faceItem, String faceValue, String deviceValue, FaceDesignerLogAdapter adapter) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) faceValue, new String[]{"."}, false, 0, 6, (Object) null);
        List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) deviceValue, new String[]{"."}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != listSplit$default2.size()) {
            adapter.append("能力集MATCH_LOW失败，" + faceItem.getName() + "的value长度不匹配");
            Logger.i(TAG, faceItem.getName() + " match fail cause match 1 size not match, faceValue: " + faceValue + " deviceValue: " + deviceValue);
            return false;
        }
        boolean z = false;
        int i = -1;
        for (int size = listSplit$default.size() - 1; -1 < size; size--) {
            if (Integer.parseInt((String) listSplit$default2.get(size)) >= Integer.parseInt((String) listSplit$default.get(size))) {
                z = true;
            } else {
                i = size + 1;
                z = false;
            }
        }
        if (z) {
            return true;
        }
        adapter.append("能力集MATCH_LOW失败，" + faceItem.getName() + "第" + i + "位过高");
        Logger.i(TAG, faceItem.getName() + " match fail cause match 1 fail, faceValue: " + faceValue + " deviceValue: " + deviceValue);
        return false;
    }

    private final boolean matchString(FaceCapabilityItem faceItem, String faceValue, String deviceValue, FaceDesignerLogAdapter adapter) {
        boolean zAreEqual = Intrinsics.areEqual(faceValue, deviceValue);
        if (!zAreEqual) {
            adapter.append("能力集MATCH_STRING失败，" + faceItem.getName() + "的value不匹配");
            Logger.i(TAG, faceItem.getName() + " match fail cause match 2 fail, faceValue: " + faceValue + " deviceValue: " + deviceValue);
        }
        return zAreEqual;
    }

    private final FaceCapabilityItem[] parseDeviceCapability(String capability) {
        try {
            return (FaceCapabilityItem[]) getMGson().fromJson(capability, new TypeToken<FaceCapabilityItem[]>() { // from class: com.xiaomi.fitness.watch.face.debug.designer.FaceCapabilityMatcher.parseDeviceCapability.1
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "parseDeviceCapability fail: " + e);
            return null;
        }
    }

    public final boolean matchCapability(@NotNull String faceCapabilityStr, @NotNull String deviceCapabilityStr, @NotNull FaceDesignerLogAdapter adapter) {
        FaceCapabilityItem faceCapabilityItem;
        Intrinsics.checkNotNullParameter(faceCapabilityStr, "faceCapabilityStr");
        Intrinsics.checkNotNullParameter(deviceCapabilityStr, "deviceCapabilityStr");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        FaceCapabilityItem[] deviceCapability = parseDeviceCapability(faceCapabilityStr);
        FaceCapabilityItem[] deviceCapability2 = parseDeviceCapability(deviceCapabilityStr);
        if (deviceCapability == null) {
            adapter.append("能力集匹配失败，解析表盘能力集异常");
            return false;
        }
        if (deviceCapability2 == null) {
            adapter.append("能力集匹配失败，解析设备能力集异常");
            return false;
        }
        if (deviceCapability.length > deviceCapability2.length) {
            adapter.append("能力集匹配失败，表盘能力集过长");
            return false;
        }
        Iterator it = ArrayIteratorKt.iterator(deviceCapability);
        while (it.hasNext()) {
            FaceCapabilityItem faceCapabilityItem2 = (FaceCapabilityItem) it.next();
            int length = deviceCapability2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    faceCapabilityItem = null;
                    break;
                }
                faceCapabilityItem = deviceCapability2[i];
                if (Intrinsics.areEqual(faceCapabilityItem.getName(), faceCapabilityItem2.getName())) {
                    break;
                }
                i++;
            }
            if (faceCapabilityItem == null) {
                adapter.append("能力集匹配失败，找不到" + faceCapabilityItem2.getName());
                return false;
            }
            if (!matchCapabilityItem(faceCapabilityItem2, faceCapabilityItem, adapter)) {
                adapter.append("能力集匹配失败，" + faceCapabilityItem2.getName() + "中有内容匹配失败");
                return false;
            }
        }
        return true;
    }
}
