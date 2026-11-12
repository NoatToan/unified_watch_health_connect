package com.miui.circulate.device.api;

import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/miui/circulate/device/api/Column;", "", "()V", "ACCOUNT_ID", "", "ALL", "", "getALL", "()[Ljava/lang/String;", "[Ljava/lang/String;", "BATTERY", "CATEGORY", "DEVICE_TYPE", "ICON", ServerConstants.ID_COUNTRY_CODE, "MAC", "PIN_ICON", "PIN_TIME", "PRIORITY", "PRIVATE_DATA", "SSID", "STATE", "SUBTITLE", "TITLE", "UPDATE_TIME", "api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Column {

    @NotNull
    public static final String CATEGORY = "category";

    @NotNull
    public static final String DEVICE_TYPE = "deviceType";

    @NotNull
    public static final String ICON = "icon";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String MAC = "mac";

    @NotNull
    public static final String PRIORITY = "priority";

    @NotNull
    public static final String SSID = "ssid";

    @NotNull
    public static final String STATE = "state";

    @NotNull
    public static final String TITLE = "title";

    @NotNull
    public static final String UPDATE_TIME = "updateTime";

    @NotNull
    public static final Column INSTANCE = new Column();

    @NotNull
    public static final String SUBTITLE = "subtitle";

    @NotNull
    public static final String BATTERY = "battery";

    @NotNull
    public static final String ACCOUNT_ID = "accountId";

    @NotNull
    public static final String PRIVATE_DATA = "privateData";

    @NotNull
    public static final String PIN_TIME = "pinTime";

    @NotNull
    public static final String PIN_ICON = "pinIcon";

    @NotNull
    private static final String[] ALL = {"id", "category", "deviceType", "title", SUBTITLE, "icon", "state", "mac", "ssid", BATTERY, ACCOUNT_ID, PRIVATE_DATA, "updateTime", PIN_TIME, PIN_ICON, "priority"};

    private Column() {
    }

    @NotNull
    public final String[] getALL() {
        return ALL;
    }
}
