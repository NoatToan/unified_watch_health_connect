package com.miui.circulate.device.api;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J&\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0007J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fH\u0007J \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J \u0010 \u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0004H\u0007J \u0010#\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0018H\u0007J \u0010$\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\nH\u0007J \u0010%\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001bH\u0007J \u0010&\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0007J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0007J \u0010(\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0007J*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0004H\u0007J4\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010-H\u0007J2\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\b\b\u0001\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0004H\u0007¨\u0006/"}, d2 = {"Lcom/miui/circulate/device/api/GlobalDeviceControl;", "", "()V", "addOrUpdateDevice", "", "resolver", "Landroid/content/ContentResolver;", "device", "Lcom/miui/circulate/device/api/DeviceInfo;", "atomicInsertDeviceByCategory", "", "category", "", "deviceList", "", "deleteDevice", "id", "getBoolean", "key", "getDeviceById", "getDeviceListByUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "getDouble", "", "getInt", "getLong", "", "getString", Constant.PIN_PATH, "icon", "Lcom/miui/circulate/device/api/Icon;", "setBoolean", "", "value", "setDouble", "setInt", "setLong", "setString", "unpin", "updateIconById", "updateStateById", "stateMask", "inState", "extra", "Landroid/content/ContentValues;", "deviceType", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlobalDeviceControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalDeviceControl.kt\ncom/miui/circulate/device/api/GlobalDeviceControl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1864#2,3:349\n*S KotlinDebug\n*F\n+ 1 GlobalDeviceControl.kt\ncom/miui/circulate/device/api/GlobalDeviceControl\n*L\n58#1:349,3\n*E\n"})
public final class GlobalDeviceControl {

    @NotNull
    public static final GlobalDeviceControl INSTANCE = new GlobalDeviceControl();

    private GlobalDeviceControl() {
    }

    @JvmStatic
    public static final boolean addOrUpdateDevice(@NotNull ContentResolver resolver, @NotNull DeviceInfo device) {
        Uri uriInsert;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(device, "device");
        StringBuilder sb = new StringBuilder();
        sb.append("addOrUpdate: ");
        sb.append(StringsKt___StringsKt.take(device.getId(), 3));
        sb.append(", ");
        sb.append(device.getTitle());
        sb.append(", ");
        sb.append(device.getState());
        try {
            uriInsert = resolver.insert(Constant.INSTANCE.getDEVICE_META_LIST_URI(), DeviceInfo_BindEntityParserKt.convertToContentValues(device));
        } catch (Exception unused) {
            uriInsert = null;
        }
        return uriInsert != null;
    }

    @JvmStatic
    public static final int atomicInsertDeviceByCategory(@NotNull ContentResolver resolver, @NotNull String category, @NotNull List<DeviceInfo> deviceList) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        int size = deviceList.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Object obj : deviceList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            contentValuesArr[i] = DeviceInfo_BindEntityParserKt.convertToContentValues((DeviceInfo) obj);
            i = i2;
        }
        try {
            Uri uriBuild = Constant.INSTANCE.getCATEGORY_DEVICE_LIST_URI().buildUpon().appendPath(category).build();
            StringBuilder sb = new StringBuilder();
            sb.append("atomicInsertDeviceByCategory, ");
            sb.append(category);
            sb.append(", ");
            sb.append(size);
            return resolver.bulkInsert(uriBuild, contentValuesArr);
        } catch (Exception unused) {
            return 0;
        }
    }

    @JvmStatic
    public static final boolean deleteDevice(@NotNull ContentResolver resolver, @NotNull String id) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        StringBuilder sb = new StringBuilder();
        sb.append("deleteDevice, ");
        sb.append(StringsKt___StringsKt.take(id, 3));
        try {
            return resolver.delete(UriBuilder.INSTANCE.withAppendedPath(Constant.INSTANCE.getDEVICE_META_LIST_URI(), id), null, null) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    public static final boolean getBoolean(@NotNull ContentResolver resolver, @NotNull String key) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        return Boolean.parseBoolean(getString(resolver, key));
    }

    @JvmStatic
    @Nullable
    public static final DeviceInfo getDeviceById(@NotNull ContentResolver resolver, @NotNull String id) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        try {
            cursorQuery = resolver.query(Uri.withAppendedPath(Constant.INSTANCE.getDEVICE_META_LIST_URI(), id), null, null, null, null);
        } catch (Exception unused) {
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            cursor2.moveToFirst();
            DeviceInfo deviceInfo = DeviceInfo_BindEntityParserKt.parseDeviceInfo(cursor2);
            CloseableKt.closeFinally(cursor, null);
            return deviceInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursor, th);
                throw th2;
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final List<DeviceInfo> getDeviceListByUri(@NotNull ContentResolver resolver, @NotNull Uri uri) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            cursorQuery = resolver.query(uri, null, null, null, null);
        } catch (Exception unused) {
            cursorQuery = null;
        }
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                while (cursor2.moveToNext()) {
                    DeviceInfo deviceInfo = DeviceInfo_BindEntityParserKt.parseDeviceInfo(cursor2);
                    if (deviceInfo != null) {
                        arrayList.add(deviceInfo);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursor, th);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    @JvmStatic
    public static final double getDouble(@NotNull ContentResolver resolver, @NotNull String key) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        return Double.parseDouble(getString(resolver, key));
    }

    @JvmStatic
    public static final int getInt(@NotNull ContentResolver resolver, @NotNull String key) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        return Integer.parseInt(getString(resolver, key));
    }

    @JvmStatic
    public static final long getLong(@NotNull ContentResolver resolver, @NotNull String key) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        return Long.parseLong(getString(resolver, key));
    }

    @JvmStatic
    @NotNull
    public static final String getString(@NotNull ContentResolver resolver, @NotNull String key) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            cursorQuery = resolver.query(Uri.withAppendedPath(Constant.INSTANCE.getKEY_VALUE_URI(), key), null, null, null, null);
        } catch (Exception unused) {
            cursorQuery = null;
        }
        String str = "";
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                cursor2.moveToFirst();
                int columnIndex = cursor2.getColumnIndex(Constant.KeyValue.KEY_COLUMN);
                int columnIndex2 = cursor2.getColumnIndex("v");
                if (columnIndex >= 0 && columnIndex2 >= 0) {
                    String string = cursor2.getString(columnIndex);
                    String v = cursor2.getString(columnIndex2);
                    if (Intrinsics.areEqual(string, key)) {
                        Intrinsics.checkNotNullExpressionValue(v, "v");
                        str = v;
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursor, th);
                    throw th2;
                }
            }
        }
        return str;
    }

    @JvmStatic
    public static final boolean pin(@NotNull ContentResolver resolver, @NotNull String id, @NotNull Icon icon) {
        Uri uriInsert;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put(Column.PIN_ICON, icon.flat());
        try {
            uriInsert = resolver.insert(Constant.INSTANCE.getPIN_URI(), contentValues);
        } catch (Exception unused) {
            uriInsert = null;
        }
        return uriInsert != null;
    }

    @JvmStatic
    public static final void setBoolean(@NotNull ContentResolver resolver, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        setString(resolver, key, String.valueOf(value));
    }

    @JvmStatic
    public static final void setDouble(@NotNull ContentResolver resolver, @NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        setString(resolver, key, String.valueOf(value));
    }

    @JvmStatic
    public static final void setInt(@NotNull ContentResolver resolver, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        setString(resolver, key, String.valueOf(value));
    }

    @JvmStatic
    public static final void setLong(@NotNull ContentResolver resolver, @NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        setString(resolver, key, String.valueOf(value));
    }

    @JvmStatic
    public static final void setString(@NotNull ContentResolver resolver, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() > 5000) {
            throw new IllegalArgumentException("length of this value is greater than 5000");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constant.KeyValue.KEY_COLUMN, key);
        contentValues.put("v", value);
        try {
            resolver.insert(Constant.INSTANCE.getKEY_VALUE_URI(), contentValues);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final boolean unpin(@NotNull ContentResolver resolver, @NotNull String id) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        try {
            return resolver.delete(Uri.withAppendedPath(Constant.INSTANCE.getPIN_URI(), id), null, null) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    public static final boolean updateIconById(@NotNull ContentResolver resolver, @NotNull String id, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        StringBuilder sb = new StringBuilder();
        sb.append("updateIconById: ");
        sb.append(StringsKt___StringsKt.take(id, 3));
        sb.append(", ");
        sb.append(icon);
        ContentValues contentValues = new ContentValues();
        contentValues.put("icon", icon);
        try {
            return resolver.update(Constant.INSTANCE.getDEVICE_META_LIST_URI().buildUpon().appendPath(id).appendQueryParameter(Constant.QueryParameter.UPDATE_TYPE, Constant.UpdateType.UPDATE_NORMAL).build(), contentValues, null, null) > 0;
        } catch (Exception unused) {
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "use updateStateById() with deviceType")
    @JvmStatic
    public static final boolean updateStateById(@NotNull ContentResolver resolver, @NotNull String id, int stateMask, boolean inState) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        StringBuilder sb = new StringBuilder();
        sb.append("updateStateById: ");
        sb.append(StringsKt___StringsKt.take(id, 3));
        sb.append(", ");
        sb.append(stateMask);
        sb.append(", ");
        sb.append(inState);
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constant.State.STATE_MASK_KEY, Integer.valueOf(stateMask));
        contentValues.put("state", Boolean.valueOf(inState));
        try {
            return resolver.update(Constant.INSTANCE.getDEVICE_META_LIST_URI().buildUpon().appendPath(id).appendQueryParameter(Constant.QueryParameter.UPDATE_TYPE, Constant.UpdateType.UPDATE_STATE).build(), contentValues, null, null) > 0;
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final boolean updateStateById(@NotNull ContentResolver resolver, @NotNull String id, @NotNull String deviceType, int stateMask, boolean inState) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        StringBuilder sb = new StringBuilder();
        sb.append("updateStateById: ");
        sb.append(StringsKt___StringsKt.take(id, 3));
        sb.append(", ");
        sb.append(deviceType);
        sb.append(", ");
        sb.append(stateMask);
        sb.append(", ");
        sb.append(inState);
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constant.State.STATE_MASK_KEY, Integer.valueOf(stateMask));
        contentValues.put("state", Boolean.valueOf(inState));
        contentValues.put("deviceType", deviceType);
        try {
            return resolver.update(Constant.INSTANCE.getDEVICE_META_LIST_URI().buildUpon().appendPath(id).appendQueryParameter(Constant.QueryParameter.UPDATE_TYPE, Constant.UpdateType.UPDATE_STATE).build(), contentValues, null, null) > 0;
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final boolean updateStateById(@NotNull ContentResolver resolver, @NotNull String id, int stateMask, boolean inState, @Nullable ContentValues extra) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(id, "id");
        StringBuilder sb = new StringBuilder();
        sb.append("updateStateById: ");
        sb.append(StringsKt___StringsKt.take(id, 3));
        sb.append(", ");
        sb.append(extra);
        sb.append(", ");
        sb.append(stateMask);
        sb.append(", ");
        sb.append(inState);
        ContentValues contentValues = new ContentValues();
        if (extra != null) {
            contentValues.putAll(extra);
        }
        contentValues.put(Constant.State.STATE_MASK_KEY, Integer.valueOf(stateMask));
        contentValues.put("state", Boolean.valueOf(inState));
        try {
            return resolver.update(Constant.INSTANCE.getDEVICE_META_LIST_URI().buildUpon().appendPath(id).appendQueryParameter(Constant.QueryParameter.UPDATE_TYPE, Constant.UpdateType.UPDATE_STATE).build(), contentValues, null, null) > 0;
        } catch (Exception unused) {
        }
    }
}
