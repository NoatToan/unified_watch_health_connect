package com.xiaomi.hm.health.device.beep;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.profile.beep.BeepItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\b\u001a\u00020\u00072\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002J&\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003J.\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003JF\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002J \u0010\u0010\u001a\u00020\f2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002J\u001a\u0010\u0011\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0002J\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002J*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u001a\u0010\u0014\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0013J \u0010\u0018\u001a\u00020\f2\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/beep/BeepPropertyRepo;", "", "", "Lkotlin/Pair;", "Lcom/xiaomi/hm/health/device/beep/BeepType;", "", "pairs", "", "b", "beepProperty", "a", "pair", "", "updateSingleBeepType", "updateBeepTypes", "defaultList", "updateBeepType", "getLocaleProperty", "getDefaultBeeps", "", "beepPairs", "Lcom/xiaomi/hm/health/bt/profile/beep/BeepItem;", "toBeepItem", "mutableList", "saveProperty", "Ljava/lang/String;", "BEEP_PROPERTY", "PROPERTY_TYPE", "c", "PROPERTY_VALUE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BeepPropertyRepo {

    @NotNull
    public static final BeepPropertyRepo INSTANCE = new BeepPropertyRepo();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String BEEP_PROPERTY = "huami.mifit.user.settings.beepsetting";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_TYPE = "beepType";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_VALUE = "state";

    private BeepPropertyRepo() {
    }

    private final List<Pair<BeepType, Boolean>> a(String beepProperty) {
        Object obj;
        if (TextUtils.isEmpty(beepProperty)) {
            return null;
        }
        try {
            JsonElement jsonElement = new JsonParser().parse(beepProperty);
            if (!jsonElement.isJsonArray()) {
                obj = null;
            }
            if (obj == null) {
                obj = jsonElement;
                return null;
            }
            obj = jsonElement;
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement2 : (Iterable) obj) {
                if (jsonElement2.isJsonObject()) {
                    JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                    arrayList.add(new Pair(BeepType.INSTANCE.parseBeepType(asJsonObject.get(PROPERTY_TYPE).getAsInt()), Boolean.valueOf(asJsonObject.get("state").getAsBoolean())));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private final String b(List<Pair<BeepType, Boolean>> pairs) {
        JsonArray jsonArray = new JsonArray();
        Iterator<T> it2 = pairs.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(PROPERTY_TYPE, Integer.valueOf(((BeepType) pair.getFirst()).ordinal()));
            jsonObject.addProperty("state", (Boolean) pair.getSecond());
            jsonArray.add(jsonObject);
        }
        return jsonArray.toString();
    }

    @NotNull
    public final List<Pair<BeepType, Boolean>> getDefaultBeeps() {
        BeepType[] beepTypeArrValues = BeepType.values();
        ArrayList arrayList = new ArrayList();
        int length = beepTypeArrValues.length;
        for (int i = 0; i < length; i++) {
            BeepType beepType = beepTypeArrValues[i];
            if (!(beepType == BeepType.EMAIL_ALERT)) {
                arrayList.add(beepType);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Pair((BeepType) it2.next(), Boolean.TRUE));
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
    }

    @Nullable
    public final List<Pair<BeepType, Boolean>> getLocaleProperty() {
        return a(DeviceXFunctionsKt.getPropertyStoreApi().getProperty(BEEP_PROPERTY, ""));
    }

    public final void saveProperty(@NotNull List<Pair<BeepType, Boolean>> mutableList) {
        DeviceXFunctionsKt.getPropertyStoreApi().setProperty(BEEP_PROPERTY, b(mutableList));
        DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
    }

    @Nullable
    public final List<BeepItem> toBeepItem(@Nullable List<? extends Pair<? extends BeepType, Boolean>> beepPairs) {
        if (beepPairs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(beepPairs, 10));
        Iterator<T> it2 = beepPairs.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            arrayList.add(new BeepItem(((BeepType) pair.getFirst()).ordinal(), ByteUtilsKt.toByte(((Boolean) pair.getSecond()).booleanValue())));
        }
        return arrayList;
    }

    public final void updateBeepType(@NotNull List<Pair<BeepType, Boolean>> pairs) {
        Object next;
        Pair<BeepType, Boolean> pair = null;
        try {
            List<Pair<BeepType, Boolean>> localeProperty = getLocaleProperty();
            if (localeProperty != null) {
                Iterator<T> it2 = localeProperty.iterator();
                do {
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    next = it2.next();
                } while (!(((Pair) next).getFirst() == BeepType.EMAIL_ALERT));
                pair = (Pair) next;
            }
        } catch (Exception unused) {
        }
        if (pair != null) {
            pairs.add(pair.getFirst().ordinal(), pair);
        }
        saveProperty(pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final List<Pair<BeepType, Boolean>> updateBeepTypes(@NotNull Pair<? extends BeepType, Boolean> pair) {
        List<Pair<BeepType, Boolean>> localeProperty = getLocaleProperty();
        if (localeProperty == null) {
            return null;
        }
        Iterator<Pair<BeepType, Boolean>> it2 = localeProperty.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().getFirst() == pair.getFirst()) {
                localeProperty.set(i, pair);
                return localeProperty;
            }
            i++;
        }
        i = -1;
        localeProperty.set(i, pair);
        return localeProperty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSingleBeepType(@NotNull Pair<? extends BeepType, Boolean> pair) {
        List<Pair<BeepType, Boolean>> localeProperty = getLocaleProperty();
        if (localeProperty == null) {
            return;
        }
        Iterator<Pair<BeepType, Boolean>> it2 = localeProperty.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().getFirst() == pair.getFirst()) {
                localeProperty.set(i, pair);
                INSTANCE.saveProperty(localeProperty);
            }
            i++;
        }
        i = -1;
        localeProperty.set(i, pair);
        INSTANCE.saveProperty(localeProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<Pair<BeepType, Boolean>> updateBeepTypes(@NotNull Pair<? extends BeepType, Boolean> pair, @NotNull List<Pair<BeepType, Boolean>> defaultList) {
        List<Pair<BeepType, Boolean>> localeProperty = getLocaleProperty();
        if (localeProperty != null) {
            defaultList = localeProperty;
        }
        Iterator<Pair<BeepType, Boolean>> it2 = defaultList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().getFirst() == pair.getFirst()) {
                defaultList.set(i, pair);
                return defaultList;
            }
            i++;
        }
        i = -1;
        defaultList.set(i, pair);
        return defaultList;
    }
}
