package com.tsmclient.smartcard.terminal;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes6.dex */
public class APDUConstants {
    public static final byte[] AID_DCEP_ACCOUNT_MODE;
    public static final String AID_DCEP_ACCOUNT_MODE_STR;
    public static final CommandApdu COMM_PREFIX_ACTIVATE_CARD;
    public static final CommandApdu COMM_PREFIX_DEACTIVATE_CARD;
    public static final CommandApdu COMM_PREFIX_GET_STATUS;
    public static final CommandApdu COMM_PREFIX_INIT_UPDATE;
    public static final CommandApdu COMM_PREFIX_READ_RECORD;
    public static final CommandApdu COMM_TAG_GET_STATUS;
    public static final byte[] GET_SEID;
    public static final byte[] ISD;
    public static final int LENGTH_HOSTCHALLENGE = 16;
    public static final byte[] MC_OPEN;
    public static byte[] MIFARE_CARD_AID_PREFFIX = null;
    public static byte[] PBOC_CARD_AID_PREFFIX = null;
    public static final byte[] SELECT_CRS;
    public static final byte[] SELECT_DCEP;
    public static final byte[] SELECT_ISD;
    public static final byte[] SELECT_PPSE;
    public static final ByteArray NOT_EXISTS = ByteArray.wrap(new byte[]{106, -126});
    public static final ByteArray TAG_FCI_DATA_TEMPLATE = ByteArray.wrap(new byte[]{-91});
    public static final byte TAG_MORE_DATA = 97;
    public static final ByteArray TAG_AEF_ENTRANCE = ByteArray.wrap(new byte[]{TAG_MORE_DATA});
    public static final ByteArray TAG_BANK_CUSTOM_DATA = ByteArray.wrap(new byte[]{-65, AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT});
    public static final ByteArray TAG_PDOL = ByteArray.wrap(new byte[]{-97, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA});
    public static final ByteArray TAG_AID = ByteArray.wrap(new byte[]{79});
    public static final ByteArray TAG_LIFESTYLE_STATE = ByteArray.wrap(new byte[]{-97, 112});
    public static final ByteArray TAG_APP = ByteArray.wrap(new byte[]{SettingsModule.VALUE_TYPE_FLAG});
    public static final ByteArray TAG_CARD_NUM = ByteArray.wrap(new byte[]{87});
    public static final ByteArray TAG_FCI_TEMPLATE = ByteArray.wrap(new byte[]{111});
    public static final ByteArray TAG_FCI_2PAY = ByteArray.wrap(new byte[]{-124});
    public static final ByteArray AID_SPTC = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 3, -122, -104, 7, 1});
    public static final ByteArray AID_SPTC_NEW = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 3, -122, -104, 7, 1});
    public static final ByteArray AID_LNT = ByteArray.wrap(new byte[]{89, 67, 84, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 85, 83, 69, 82});
    public static final ByteArray AID_SZT = ByteArray.wrap(new byte[]{83, 90, 84, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 87, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 76, 76, 69, 84, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 69, 78, 86});
    public static final ByteArray AID_BMAC = ByteArray.wrap(new byte[]{-111, 86, 0, 0, 20, 1, 0, 1});
    public static final ByteArray AID_SUZHOUTONG = ByteArray.wrap(new byte[]{83, 85, 88, 73, 78, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 77, 70});
    public static final ByteArray AID_WHT = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 83, 66, 87, 72, 84, 75});
    public static final ByteArray AID_HZT = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 3, -122, -104, 7, 1, 49, 0});
    public static final ByteArray AID_CST = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 3, -122, -104, 7, 1, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0});
    public static final ByteArray AID_ST_ONE_DAY_PASS = ByteArray.wrap(new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, SettingsModule.VALUE_TYPE_FLAG, SettingsModule.VALUE_TYPE_FLAG, 77, 69, 67, 48, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION});
    public static final ByteArray AID_ST_THREE_DAY_PASS = ByteArray.wrap(new byte[]{HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, SettingsModule.VALUE_TYPE_FLAG, SettingsModule.VALUE_TYPE_FLAG, 77, 69, 67, 48, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 66});
    public static final ByteArray AID_FAKE_SPDB = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 3, 51, 1, 1, 1, -1, 32, 0, -1, -1, -1, -1, 0});

    static {
        byte[] bArr = {DKFRequestService.o, 0, 0, 8, 114, 73, 0, 0, 0};
        AID_DCEP_ACCOUNT_MODE = bArr;
        AID_DCEP_ACCOUNT_MODE_STR = Coder.bytesToHexString(bArr);
        SELECT_ISD = new byte[]{0, -92, 4, 0, 8, DKFRequestService.o, 0, 0, 1, 81, 0, 0, 0};
        SELECT_CRS = new byte[]{0, -92, 4, 0, 9, DKFRequestService.o, 0, 0, 1, 81, 67, 82, 83, 0};
        SELECT_PPSE = new byte[]{0, -92, 4, 0, HMProSyncDataBaseProfile.DATA_TYPE_COACHING, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 89, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 83, 89, 83, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_ALL_DAY, 68, 68, 70, 48, 49};
        SELECT_DCEP = new byte[]{1, -92, 4, 0, 9, DKFRequestService.o, 0, 0, 8, 114, 73, 0, 0, 0};
        GET_SEID = new byte[]{-128, -54, -97, 127, 0};
        PBOC_CARD_AID_PREFFIX = new byte[]{DKFRequestService.o, 0, 0, 3, 51, 1, 1};
        MIFARE_CARD_AID_PREFFIX = new byte[]{DKFRequestService.o, 0, 0, 3, -106, 77, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, 77, 16};
        MC_OPEN = new byte[]{0, 112, 0, 0, 1};
        COMM_PREFIX_INIT_UPDATE = new CommandApdu(128, 80, 33, 0);
        COMM_PREFIX_ACTIVATE_CARD = new CommandApdu(128, 240, 1, 1);
        COMM_PREFIX_DEACTIVATE_CARD = new CommandApdu(128, 240, 1, 0);
        COMM_PREFIX_GET_STATUS = new CommandApdu(128, 242, 64, 0);
        COMM_TAG_GET_STATUS = new CommandApdu(92, 3, 79, 159, 112);
        COMM_PREFIX_READ_RECORD = new CommandApdu(0, 178, 1, 12);
        ISD = new byte[]{DKFRequestService.o, 0, 0, 1, 81, 0, 0, 0};
    }
}
