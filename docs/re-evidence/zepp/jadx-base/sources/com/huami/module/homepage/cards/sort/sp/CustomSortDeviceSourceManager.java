package com.huami.module.homepage.cards.sort.sp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.module.homepage.koin.ScopesAndQualifersKt;
import com.huami.module.homepage.sync.manager.IDeviceSyncManager;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/module/homepage/cards/sort/sp/CustomSortDeviceSourceManager;", "", "", "a", "", "deviceSource", "", "addDeviceSource", "getAllHasCustomSortDeviceSource", "getHasNoCustomSortDeviceSourceValue", "getPresentBoundAndActivateDeviceSource", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "<init>", "()V", "Companion", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CustomSortDeviceSourceManager {

    @NotNull
    private static final String b = "deviceSource";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv = KvKit.getKvPersistence$default("HomeCardDeviceSource" + ScopesAndQualifersKt.userId(ScopesAndQualifersKt.getKoin()), false, 2, null);

    private final String a() {
        return (String) this.kv.getValue("deviceSource", new JSONArray().toString());
    }

    public final void addDeviceSource(@NotNull List<String> deviceSource) {
        String strA = a();
        KvPersistence kvPersistence = this.kv;
        JSONArray jSONArray = new JSONArray(strA);
        for (String str : deviceSource) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) strA, (CharSequence) str, false, 2, (Object) null)) {
                jSONArray.put(str);
            }
        }
        Unit unit = Unit.INSTANCE;
        kvPersistence.setValue("deviceSource", jSONArray.toString());
    }

    @NotNull
    public final List<String> getAllHasCustomSortDeviceSource() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll((Collection) new Gson().fromJson(a(), new TypeToken<List<? extends String>>() { // from class: com.huami.module.homepage.cards.sort.sp.CustomSortDeviceSourceManager$getAllHasCustomSortDeviceSource$$inlined$parseJson$1
        }.getType()));
        linkedHashSet.addAll(getPresentBoundAndActivateDeviceSource());
        return CollectionsKt___CollectionsKt.toList(linkedHashSet);
    }

    @NotNull
    public final List<String> getHasNoCustomSortDeviceSourceValue() {
        List<String> presentBoundAndActivateDeviceSource = getPresentBoundAndActivateDeviceSource();
        ArrayList arrayList = null;
        if (!(!presentBoundAndActivateDeviceSource.isEmpty())) {
            presentBoundAndActivateDeviceSource = null;
        }
        if (presentBoundAndActivateDeviceSource != null) {
            List list = (List) new Gson().fromJson(a(), new TypeToken<List<? extends String>>() { // from class: com.huami.module.homepage.cards.sort.sp.CustomSortDeviceSourceManager$getHasNoCustomSortDeviceSourceValue$lambda-4$$inlined$parseJson$1
            }.getType());
            arrayList = new ArrayList();
            for (String str : presentBoundAndActivateDeviceSource) {
                if (!list.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    @NotNull
    public final List<String> getPresentBoundAndActivateDeviceSource() {
        return ((IDeviceSyncManager) ScopesAndQualifersKt.homePageScope(ScopesAndQualifersKt.getKoin()).get(Reflection.getOrCreateKotlinClass(IDeviceSyncManager.class), null, null)).getBoundAndActivateDeviceSource();
    }
}
