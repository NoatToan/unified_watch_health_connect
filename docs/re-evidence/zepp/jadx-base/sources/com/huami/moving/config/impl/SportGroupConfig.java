package com.huami.moving.config.impl;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huami.moving.config.SportTypeGroupItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/moving/config/impl/SportGroupConfig;", "", "", "Lcom/huami/moving/config/SportTypeGroupItem;", "a", "", "sportType", "", "getGroupId", "getAllConfigs", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "configJsonProvider", "b", "Ljava/util/List;", "configs", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportGroupConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<String> configJsonProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private List<SportTypeGroupItem> configs;

    public SportGroupConfig(@NotNull Function0<String> function0) {
        this.configJsonProvider = function0;
    }

    private final List<SportTypeGroupItem> a() {
        String strInvoke = this.configJsonProvider.invoke();
        if (strInvoke == null) {
            return null;
        }
        try {
            return ArraysKt___ArraysKt.toMutableList((Object[]) new Gson().fromJson(strInvoke, SportTypeGroupItem[].class));
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public final List<SportTypeGroupItem> getAllConfigs() {
        List<SportTypeGroupItem> list = this.configs;
        if (list != null) {
            return list;
        }
        List<SportTypeGroupItem> listA = a();
        this.configs = listA;
        return listA == null ? CollectionsKt__CollectionsKt.emptyList() : listA;
    }

    @Nullable
    public final String getGroupId(int sportType) {
        Object next;
        Iterator<T> it2 = getAllConfigs().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((SportTypeGroupItem) next).getType() == sportType));
        SportTypeGroupItem sportTypeGroupItem = (SportTypeGroupItem) next;
        if (sportTypeGroupItem == null) {
            return null;
        }
        return sportTypeGroupItem.getSportGroup();
    }
}
