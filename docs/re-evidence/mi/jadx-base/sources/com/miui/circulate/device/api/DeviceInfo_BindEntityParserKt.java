package com.miui.circulate.device.api;

import android.content.ContentValues;
import android.database.Cursor;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001¨\u0006\u0006"}, d2 = {"parseDeviceInfo", "Lcom/miui/circulate/device/api/DeviceInfo;", PluginDeviceInfo.FICONON, "Landroid/database/Cursor;", "convertToContentValues", "Landroid/content/ContentValues;", "api_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DeviceInfo_BindEntityParserKt {
    @NotNull
    public static final ContentValues convertToContentValues(@NotNull DeviceInfo deviceInfo) {
        String strFlat;
        String strFlat2;
        String strFlat3;
        Intrinsics.checkNotNullParameter(deviceInfo, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", deviceInfo.getId());
        contentValues.put("category", deviceInfo.getCategory());
        contentValues.put("deviceType", deviceInfo.getDeviceType());
        String title = deviceInfo.getTitle();
        String str = "";
        if (title == null) {
            title = "";
        }
        contentValues.put("title", title);
        String subtitle = deviceInfo.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        contentValues.put(Column.SUBTITLE, subtitle);
        Icon icon = deviceInfo.getIcon();
        if (icon == null || (strFlat = icon.flat()) == null) {
            strFlat = "";
        }
        contentValues.put("icon", strFlat);
        contentValues.put("state", Integer.valueOf(deviceInfo.getState()));
        String accountId = deviceInfo.getAccountId();
        if (accountId == null) {
            accountId = "";
        }
        contentValues.put(Column.ACCOUNT_ID, accountId);
        String mac = deviceInfo.getMac();
        if (mac == null) {
            mac = "";
        }
        contentValues.put("mac", mac);
        BatteryInfo battery = deviceInfo.getBattery();
        if (battery == null || (strFlat2 = battery.flat()) == null) {
            strFlat2 = "";
        }
        contentValues.put(Column.BATTERY, strFlat2);
        String ssid = deviceInfo.getSsid();
        if (ssid == null) {
            ssid = "";
        }
        contentValues.put("ssid", ssid);
        String privateData = deviceInfo.getPrivateData();
        if (privateData == null) {
            privateData = "";
        }
        contentValues.put(Column.PRIVATE_DATA, privateData);
        contentValues.put("updateTime", Long.valueOf(deviceInfo.getUpdateTime()));
        contentValues.put("priority", Integer.valueOf(deviceInfo.getPriority()));
        contentValues.put(Column.PIN_TIME, Long.valueOf(deviceInfo.getPinTime()));
        Icon pinIcon = deviceInfo.getPinIcon();
        if (pinIcon != null && (strFlat3 = pinIcon.flat()) != null) {
            str = strFlat3;
        }
        contentValues.put(Column.PIN_ICON, str);
        return contentValues;
    }

    @Nullable
    public static final DeviceInfo parseDeviceInfo(@NotNull Cursor c) {
        String string;
        String str;
        Intrinsics.checkNotNullParameter(c, "c");
        try {
            int columnIndex = c.getColumnIndex("id");
            String id = columnIndex >= 0 ? c.getString(columnIndex) : "";
            int columnIndex2 = c.getColumnIndex("category");
            String category = columnIndex2 >= 0 ? c.getString(columnIndex2) : "";
            int columnIndex3 = c.getColumnIndex("deviceType");
            String deviceType = columnIndex3 >= 0 ? c.getString(columnIndex3) : "";
            int columnIndex4 = c.getColumnIndex("title");
            String string2 = columnIndex4 >= 0 ? c.getString(columnIndex4) : "";
            int columnIndex5 = c.getColumnIndex(Column.SUBTITLE);
            String string3 = columnIndex5 >= 0 ? c.getString(columnIndex5) : "";
            int columnIndex6 = c.getColumnIndex("icon");
            String string4 = columnIndex6 >= 0 ? c.getString(columnIndex6) : "";
            Icon.Companion companion = Icon.INSTANCE;
            Icon icon = companion.parse(string4);
            int columnIndex7 = c.getColumnIndex("state");
            int i = columnIndex7 >= 0 ? c.getInt(columnIndex7) : 0;
            int columnIndex8 = c.getColumnIndex(Column.ACCOUNT_ID);
            String string5 = columnIndex8 >= 0 ? c.getString(columnIndex8) : "";
            int columnIndex9 = c.getColumnIndex("mac");
            String string6 = columnIndex9 >= 0 ? c.getString(columnIndex9) : "";
            int columnIndex10 = c.getColumnIndex(Column.BATTERY);
            if (columnIndex10 >= 0) {
                string = c.getString(columnIndex10);
                str = "";
            } else {
                string = "";
                str = string;
            }
            BatteryInfo batteryInfo = BatteryInfo.INSTANCE.parse(string);
            int columnIndex11 = c.getColumnIndex("ssid");
            String string7 = columnIndex11 >= 0 ? c.getString(columnIndex11) : str;
            int columnIndex12 = c.getColumnIndex(Column.PRIVATE_DATA);
            String string8 = columnIndex12 >= 0 ? c.getString(columnIndex12) : str;
            int columnIndex13 = c.getColumnIndex("updateTime");
            long j = columnIndex13 >= 0 ? c.getLong(columnIndex13) : 0L;
            int columnIndex14 = c.getColumnIndex("priority");
            int i2 = columnIndex14 >= 0 ? c.getInt(columnIndex14) : 0;
            int columnIndex15 = c.getColumnIndex(Column.PIN_TIME);
            long j2 = columnIndex15 >= 0 ? c.getLong(columnIndex15) : 0L;
            int columnIndex16 = c.getColumnIndex(Column.PIN_ICON);
            Icon icon2 = companion.parse(columnIndex16 >= 0 ? c.getString(columnIndex16) : str);
            Intrinsics.checkNotNullExpressionValue(id, "id");
            Intrinsics.checkNotNullExpressionValue(category, "category");
            Intrinsics.checkNotNullExpressionValue(deviceType, "deviceType");
            return new DeviceInfo(id, category, deviceType, string2, string3, icon, i, string5, string6, batteryInfo, string7, string8, j, i2, j2, icon2);
        } catch (Exception unused) {
            return null;
        }
    }
}
