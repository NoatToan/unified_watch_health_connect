package com.mi.health.utils;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"widgetDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getWidgetDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "widgetDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "fitness-data-provider_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UiUtilsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UiUtilsKt.class, "widgetDataStore", "getWidgetDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    @NotNull
    private static final ReadOnlyProperty widgetDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("widget_data_store", null, null, null, 14, null);

    @NotNull
    public static final DataStore<Preferences> getWidgetDataStore(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DataStore) widgetDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
