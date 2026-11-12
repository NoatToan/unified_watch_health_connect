package com.tsmclient.smartcard.handler;

import android.nfc.tech.TagTechnology;
import android.os.Bundle;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface ISmartCardHandler<T extends TagTechnology> {
    public static final int ERROR_IO = 1;
    public static final int ERROR_NOT_SUPPORTED = 2;
    public static final int ERROR_UNKNOWN = 3;
    public static final String KEY_ERROR = "error";
    public static final String KEY_READ_CARD_OPTION_RULES = "KEY_READ_CARD_OPTION_RULES";
    public static final String KEY_READ_CARD_OPTION_SKIP_RECORD = "KEY_READ_CARD_OPTION_SKIP_RECORD";
    public static final String KEY_SUCCESS = "success";
    public static final int TYPE_ISODEP = 1;
    public static final int TYPE_MIFARE_CLASSIC = 3;
    public static final int TYPE_NFCF = 2;
    public static final ByteArray AID_PPSE = ByteArray.wrap(new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 89, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 83, 89, 83, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 68, 68, 70, 48, 49});
    public static final ByteArray AID_PSE = ByteArray.wrap(new byte[]{49, SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 89, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 83, 89, 83, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 68, 68, 70, 48, 49});
    public static final ByteArray EMPTY_RECORD = ByteArray.wrap(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final ByteArray EMPTY_RECORD_TWO = ByteArray.wrap(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1});
    public static final ByteArray GET_BALANCE_CMD = ByteArray.wrap(new byte[]{-128, 92, 0, 2, 4});
    public static final ByteArray STATUS_OK = ByteArray.wrap(new byte[]{-112, 0});
    public static final ByteArray STATUS_RECORD_END = ByteArray.wrap(new byte[]{106, -125});
    public static final ByteArray STATUS_ERROR_PARAM = ByteArray.wrap(new byte[]{106, -122});
    public static final ByteArray STATUS_APP_NOT_FOUND = ByteArray.wrap(new byte[]{106, -126});

    int getTechType();

    Bundle onHandleCard(T t) throws UnProcessableCardException, IOException;

    Bundle onHandleCard(IScTerminal iScTerminal, Bundle bundle) throws UnProcessableCardException, IOException;
}
