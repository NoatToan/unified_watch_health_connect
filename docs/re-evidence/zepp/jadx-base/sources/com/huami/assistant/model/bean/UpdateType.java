package com.huami.assistant.model.bean;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EVENT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class UpdateType {
    private static final /* synthetic */ UpdateType[] $VALUES;
    public static final UpdateType ALARM;
    public static final UpdateType CINEMA_TICKET;
    public static final UpdateType DIDI;
    public static final UpdateType EVENT;
    public static final UpdateType FLIGHT;
    public static final UpdateType OCR;
    public static final UpdateType OCR_TRAIN;
    public static final UpdateType TRAIN;
    public int categoryResId;
    public int flag;
    public int iconResId;
    public String key;
    public int layoutResId;
    public int nameResId;
    public int typeId;

    public @interface Flag {
        public static final int FLAG_ALLOW_USER_ADD = 4;
        public static final int FLAG_DISABLE = 0;
        public static final int FLAG_VISIBLE = 2;
    }

    static {
        int i = R.string.update_event;
        UpdateType updateType = new UpdateType("EVENT", 0, 2, i, i, R.drawable.ic_event, R.layout.card_event, 6);
        EVENT = updateType;
        int i2 = R.string.update_alarm;
        UpdateType updateType2 = new UpdateType("ALARM", 1, 1, i2, i2, R.drawable.ic_alarm, R.layout.card_alarm, 4);
        ALARM = updateType2;
        UpdateType updateType3 = new UpdateType("CINEMA_TICKET", 2, 301, R.string.update_cinema_ticket, R.string.film, R.drawable.ic_cinema_ticket, R.layout.card_cinema_ticket, 2);
        CINEMA_TICKET = updateType3;
        UpdateType updateType4 = new UpdateType("DIDI", 3, 302, R.string.update_didi, R.string.didi, R.drawable.ic_didi, R.layout.card_didi, 2);
        DIDI = updateType4;
        int i3 = R.string.update_train;
        UpdateType updateType5 = new UpdateType("TRAIN", 4, 303, i3, i3, R.drawable.ic_train, R.layout.card_train, 2);
        TRAIN = updateType5;
        UpdateType updateType6 = new UpdateType("FLIGHT", 5, 304, R.string.flight_sms, R.string.flight, R.drawable.ic_flight, R.layout.card_flight, 2);
        FLIGHT = updateType6;
        int i4 = R.string.ocr;
        UpdateType updateType7 = new UpdateType("OCR", 6, 201, i4, i4, R.drawable.ic_ocr, 0, 4);
        OCR = updateType7;
        int i5 = R.string.ocr_train;
        UpdateType updateType8 = new UpdateType("OCR_TRAIN", 7, 202, i5, i5, R.drawable.ic_ocr_train, 0, 4);
        OCR_TRAIN = updateType8;
        $VALUES = new UpdateType[]{updateType, updateType2, updateType3, updateType4, updateType5, updateType6, updateType7, updateType8};
    }

    private UpdateType(String $enum$name, @StringRes int $enum$ordinal, @StringRes int typeId, @DrawableRes int categoryResId, @LayoutRes int nameResId, int iconResId, int layoutResId, int flag) {
        super($enum$name, $enum$ordinal);
        this.typeId = typeId;
        this.key = Update.ALL_TYPES.get(typeId);
        this.categoryResId = categoryResId;
        this.nameResId = nameResId;
        this.iconResId = iconResId;
        this.layoutResId = layoutResId;
        this.flag = flag;
    }

    public static UpdateType valueOf(String name) {
        return (UpdateType) Enum.valueOf(UpdateType.class, name);
    }

    public static UpdateType[] values() {
        return (UpdateType[]) $VALUES.clone();
    }

    public boolean isAllowUserAdd() {
        return (this.flag & 4) != 0;
    }

    public boolean isDeviceSupport(Context context) {
        int i = this.typeId;
        if (i == 1) {
            return AssistantModule.isSupportAlarm(context);
        }
        if (i != 2) {
            return i != 304 ? AssistantModule.isSupportUpdates(context) : AssistantModule.isSupportFlight(context);
        }
        return AssistantModule.isSupportEvent(context);
    }

    public boolean isDisable() {
        return this.flag == 0;
    }

    public boolean isVisible() {
        return (this.flag & 2) != 0;
    }

    public static UpdateType valueOf(int typeId) {
        if (typeId == 1) {
            return ALARM;
        }
        if (typeId == 201) {
            return OCR;
        }
        if (typeId == 202) {
            return OCR_TRAIN;
        }
        switch (typeId) {
            case 301:
                return CINEMA_TICKET;
            case 302:
                return DIDI;
            case 303:
                return TRAIN;
            case 304:
                return FLIGHT;
            default:
                return EVENT;
        }
    }
}
