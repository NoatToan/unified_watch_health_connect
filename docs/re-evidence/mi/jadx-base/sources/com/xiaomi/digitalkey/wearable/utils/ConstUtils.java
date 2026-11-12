package com.xiaomi.digitalkey.wearable.utils;

import android.os.ParcelUuid;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.UUID;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes7.dex */
public class ConstUtils {
    public static final int EP_VIEW_CA = 5;
    public static final int EP_VIEW_SETUPINO = 1;
    public static final int EP_VIEW_STATE = 2;
    public static final int EP_VIEW_UA_WIRED = 4;
    public static final int EP_VIEW_UA_WL = 3;
    public static final String UUID_BASE = "0000%4s-0000-1000-8000-00805f9b34fb";
    public static byte[] SW_OK = {-112, 0};
    public static byte[] SW_DEV_NOT_READY = {-108, -124};
    public static byte[] SW_CMD_OOS = {105, -123};
    public static byte[] SW_VERIFY_FAIL = {106, -120};
    public static byte[] SW_NO_MEM = {106, -124};
    public static byte[] SW_WRONG_CMD = {106, -128};
    public static byte[] SW_SECURITY_REJECT = {105, -126};
    public static byte[] SW_EP_FAIL = {100, 0};
    public static byte[] SW_SHARE_IO_ERROR = {-1, -1};
    public static byte[] SW_QUERY_MAILBOX_OCCUPIED = {AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 1};
    public static byte[] SW_QUERY_MAILBOX_DELETED = {AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT, 2};
    public static byte[] SW_UPDATE_MAILBOX_WRONG_DATA = {HMProSyncDataBaseProfile.DATA_TYPE_PAI, 0};
    public static byte[] SW_UPDATE_MAILBOX_OCCUPIED = {HMProSyncDataBaseProfile.DATA_TYPE_PAI, 1};
    public static byte[] SW_UPDATE_MAILBOX_DELETED = {HMProSyncDataBaseProfile.DATA_TYPE_PAI, 2};
    public static byte[] TLV_NOT_PAIR_MODE = {-44, 1, 0};
    public static byte[] TLV_IN_PAIR_MODE = {-44, 1, 2};
    public static byte[] TLV_KTS_DEV_ENC_PK = {95, 73, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION};
    public static byte[] TL_EVD_M2 = {88, 16};
    public static byte[] TL_EC_X = {SettingsModule.VALUE_TYPE_FLAG, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION};
    public static byte[] TAG_XM_PRIVATE_IN = {-65, 16};
    public static byte[] TAG_XM_PRIVATE_OUT = {-65, 17};
    public static byte[] TAG_KEY_DATA = {-97, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE};
    public static byte[] TAG_EPHEMERAL_PK_HASH = {-97, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY};
    public static byte[] TAG_EPHEMERAL_PK = {-97, 20};
    public static byte[] TAG_ENCRYPT_VERSION = {-97, 21};
    public static byte[] TAG_KEY_TYPE = {-97, 23};
    public static byte[] TAG_VEHICLE_OEM_ENCRYPT_CA_P = {-97, 24};
    public static byte[] TAG_VEHICLE_OEM_SIG_CA = {-97, 25};
    public static byte[] TAG_ERROR = {-97, 32};
    public static byte[] TAG_VEHICLE_OEM_ID = {-97, 27};
    public static byte[] TAG_VEHICLE_OEM_PACKAGE_NAME = {-97, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR};
    public static byte[] TAG_VEHICLE_BRAND_ID = {-97, 63};
    public static byte[] TAG_VEHICLE_OEM_URL = {-97, 31};
    public static byte[] TAG_VEHICLE_OEM_PPRO_DATAOFFSET = {-97, 49};
    public static byte[] TAG_VEHICLE_OEM_PPRO_DATAlEN = {-97, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR};
    public static byte[] TAG_DEVICE_MODEL_ID = {-97, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG};
    public static byte[] TAG_VEHICLE_ID = {-97, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT};
    public static byte[] TAG_XPS_DISP_INFO = {-97, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA};
    public static byte[] TAG_XPS_MB_CONFIG = {-97, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT};
    public static byte[] TAG_XPS_DEV_CLAIM = {-97, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE};
    public static byte[] TAG_XPS_MB_PAYLOAD = {-97, 59};
    public static byte[] TAG_XPS_MB_URL = {-97, Base64.padSymbol};
    public static byte[] TAG_SUPPORT_VEHICLE_OEM_CONFIG = {-97, 64};
    public static byte[] TAG_KTS_SIG = {-97, SettingsModule.VALUE_TYPE_STRING_ENUM};
    public static byte[] TAG_VEHICLE_MOBILIZATION_DATA = {-97, 34};
    public static byte[] TAG_SHARE_SESSION_ID = {-97, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG};
    public static byte[] TAG_SHARE_INVITE_LINK = {-97, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC};
    public static byte[] TAG_XPS_PUSH_MAILBOX_ID = {-97, 60};
    public static byte[] TAG_XPS_PUSH_NOTIFICATION_TOKEN = {-97, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT};
    public static byte[] TAG_SHARED_KEY_VALID_FROM = {-97, 64};
    public static byte[] TAG_SHARED_KEY_VALID_TO = {-97, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION};
    public static byte[] TAG_SHARED_KEY_PERMISION = {-97, 66};
    public static byte[] TAG_SHARED_KEY_HTMLLINK = {-97, 67};
    public static byte[] TAG_SHARED_KEY_ID_LIST = {-97, 69};
    public static byte[] TAG_ENCRYPTE_REMOTE_TERMIATE_REQUEST = {-97, 70};
    public static byte[] TAG_KTS_REPORT_ERRCODE = {-97, 71};
    public static byte[] TAG_KTS_REPORT_ERRMSG = {-97, 72};
    public static byte[] TAG_APP_PAIRING_LINK = {-97, 73};
    public static byte[] TAG_VEHICLE_APP_CARDART = {-97, 74};
    public static byte[] TAG_KTS_DUP_TERMINATE_KEY_ID = {-97, 75};
    public static byte[] TAG_KTS_DUP_TERMINATE_ATTESTATION = {-97, 76};
    public static byte[] TAG_DECRYPT_ENCYPTED_DATA = {-97, 77};
    public static byte[] TAG_DECRYPT_PLAINT_DATA = {-97, 78};
    public static byte[] TAG_KTS_PAIRING_TYPE = {-97, SettingsModule.VALUE_TYPE_FLAG};
    public static byte[] TAG_SHARING_PASSWORD = {-97, 81};
    public static byte[] TAG_KEY_ID = {95, SettingsModule.VALUE_TYPE_STRING_ENUM};
    public static byte[] TAG_DEV_CA = {127, 32};
    public static byte[] TAG_INSTANCE_CA = {127, 34};
    public static byte[] TAG_TARGET_KEY_LIST = {127, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL};
    public static byte[] TAG_EP_CA = {127, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_SIMPLE};
    public static byte[] TAG_REC_EP_KEY_ATTESTATION = {127, HMProSyncDataBaseProfile.DATA_SPO2_POINT};
    public static byte[] TAG_EP_ENC_ATTESTATION = {127, HMProSyncDataBaseProfile.DATA_SPO2_OSA};
    public static byte[] TAG_EP_CONFIG = {127, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT};
    public static byte[] TAG_VEHICLE_OEM_CA_J = {127, HMProSyncDataBaseProfile.DATA_SPO2_ODI};
    public static byte[] TAG_ARBI_DATA_ATTESTATION = {127, 45};
    public static byte[] TAG_KEY_CONFIG = {127, 48};
    public static byte[] TAG_KYE_CREATE_REQ = {127, 49};
    public static byte[] TAG_MB_IMPORT_REQ = {127, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR};
    public static byte[] TAG_KEY_ERROR_MSG = {127, 108};
    public static byte[] TAG_KEY_ATT_PACKAGE = {127, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC};
    public static byte[] TAG_KEY_SIGN_REQ = {127, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG};
    public static byte[] TAG_REMOTE_TERMINATE_REQUEST = {127, 64};
    public static byte[] TAG_FRD_NAME = {-45};
    public static byte[] TAG_EP_CREATE_DATA = {127, 74};
    public static byte[] TAG_V_PK_CA = {127, 75};
    public static byte[] TAG_INTER_MEDIATE_CA = {127, 76};
    public static byte[] TAG_MB_MAPPING = {127, 77};
    public static byte[] TAG_DEV_CONF = {127, 78};
    public static byte[] TAG_COMPLETE = {95, 95};
    public static byte[] TAG_EP_ATTESTATION = {95, 90};
    public static byte[] TAG_WL_CAPBLITY = {127, 73};
    public static byte[] TAG_KTS_DEV_ENC_PK = {95, 73};
    public static byte[] TAG_NFC_CAPBLITY = {95, SettingsModule.VALUE_TYPE_FLAG};
    public static byte[] TAG_UWB_CAPBLITY = {95, 81};
    public static byte[] TAG_BLE_CAPBLITY = {127, 82};
    public static byte[] TAG_SHARE_CONFIGURATION = {127, 96};
    public static byte[] TAG_RKE_REQ_ACTION = {127, 112};
    public static byte[] TAG_RKE_EXECUTE_STATUS = {127, 113};
    public static byte[] TAG_RKE_FUNCTION_STATUS = {127, 114};
    public static byte[] TAG_RKE_SUBSCRIBE = {127, 115};
    public static byte[] TAG_RKE_GET_STATUS = {127, 116};
    public static byte[] TAG_RKE_ENDURING_CONFIRM_REQ = {127, 117};
    public static byte[] TAG_RKE_ENDURING_CONFIRM_ACTION = {127, 118};
    public static byte[] TAG_RKE_ENDURING_STOP = {127, 119};
    public static byte[] TAG_DKEVENT_VEHICLE_SUBSCRIPTION_CHANGED = {95, 120};
    public static byte[] TAG_SHARE_CONF = {127, 96};
    public static byte[] TAG_SE_NTF = {127, 96};
    public static byte[] TAG_KTS_REQUEST = {127, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT};
    public static byte[] TAG_KTS_REQUEST_FRIEND = {127, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA};
    public static byte[] TAG_ATTESTATION_RANDOM = {-110};
    public static byte[] TAG_ATTESTATION_FRND_PK = {90};
    public static byte[] TAG_ATTESTATION_SIG = {-98};
    public static byte[] TAG_ATTESTATION_ARBITRARY_DATA = {88};
    public static byte[] TAG_ENC_PK = {-105};
    public static byte[] TAG_USAGE = {-109};
    public static byte[] TAG_EPC_KEY_SLOT_ID = {78};
    public static byte[] TAG_EPC_VEHICLE_ID = {77};
    public static byte[] TAG_EPC_ENDPOINT_ID = {95, 32};
    public static byte[] TAG_EPC_INSTANCE_CA_ID = {66};
    public static byte[] TAG_EPC_OPTION_GROUP1 = {70};
    public static byte[] TAG_EPC_OPTION_GROUP2 = {71};
    public static byte[] TAG_EPC_PROTOCOL_VER = {92};
    public static byte[] TAG_EPC_VEHICLE_PK = {91};
    public static byte[] TAG_EPC_NOT_BEFORE = {81};
    public static byte[] TAG_EPC_NOT_AFTER = {82};
    public static byte[] TAG_EPC_AUTHORIZED_PK = {73};
    public static byte[] TAG_EPC_CONFIDENTIAL_MB_SIZE = {74};
    public static byte[] TAG_EPC_PRIVATE_MB_SIZE = {75};
    public static byte[] TAG_EPC_COUNTER_LIMIT = {87};
    public static byte[] SW_XPS_AUTH_FAIL = {10, 0};
    public static byte[] SW_XPS_WRONG_MB_ID = {10, 1};
    public static byte[] SW_XPS_WRONG_PARA = {11, 0};
    public static byte[] SW_XPS_CREATE_AUTH_FAIL = {11, 1};
    public static byte[] SW_CREATE_URSK_FAIL = {109, 0};
    public static byte[] CCC_APPLET = {DKFRequestService.o, 0, 0, 8, 9, 67, 67, 67, 68, 75, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 118, 49};
    public static byte[] CRS_AID = {DKFRequestService.o, 0, 0, 1, 81, 67, 82, 83, 0};
    public static int DK_TYPE_OWNER = 0;
    public static int DK_TYPE_FRND = 1;
    public static int SLOT_IDENTIFIER_BITMAP_BIT = 0;
    public static int SLOT_IDENTIFIERS_BIT = 1;
    public static int VEHICLE_OEM_PROPRIETARY_DATA_BIT = 2;
    public static int ATTESTATION_PACKAGE_BIT = 3;
    public static int SIGNALING_BITMAP_OFFSET = 0;
    public static int SLOT_IDENTIFIER_BITMAP_OFFSET = 1;
    public static final UUID CCC_DK_UUID = UUID16("FFF5");
    public static final UUID SPSM_CHARACTERISTIC_UUID = UUID.fromString("D3B5A130-9E23-4B3A-8BE4-6B1EE5F980A3");
    public static final ParcelUuid CCC_SERVICE_DATA_INTENT_UUID = ParcelUuid.fromString("5810bbc0-b499-11e9-a2a3-2a2ae2dbcce4");
    static VehicleValue[] sVehicle_value_map = {new VehicleValue("BMW1", "BMW1", "0002"), new VehicleValue("BMW1", "MINI", "0004"), new VehicleValue("BMW1", "RollsRoyce", "0005"), new VehicleValue("MBAG", "MBCS", "0003"), new VehicleValue("MBG1", "MBPC", "0031"), new VehicleValue("MAMG", "MAMG", "0231"), new VehicleValue("DATR", "DATR", "0032"), new VehicleValue("FUSO", "FUSO", "0232"), new VehicleValue("DABU", "DABU", "0033"), new VehicleValue("DABS", "DABS", "0233"), new VehicleValue("DNSO", "DNSO", "444E"), new VehicleValue("VWAG", "AUDI", "000A"), new VehicleValue("VWAG", "BNTL", "000B"), new VehicleValue("VWAG", "BUGA", "000C"), new VehicleValue("VWAG", "DUCA", "000D"), new VehicleValue("VWAG", "LAMB", "000E"), new VehicleValue("VWAG", "MAN1", "000F"), new VehicleValue("VWAG", "POAG", "0010"), new VehicleValue("VWAG", "SCAN", "0011"), new VehicleValue("VWAG", "SEAT", "0012"), new VehicleValue("VWAG", "SKOD", "0013"), new VehicleValue("VWAG", "VWCV", "0014"), new VehicleValue("VWAG", "VWPC", "0015"), new VehicleValue("FORD", "FORD", "0069"), new VehicleValue("FORD", "LINC", "0070"), new VehicleValue("STLA", "ABTH", "0016"), new VehicleValue("STLA", "ALFA", "0017"), new VehicleValue("STLA", "CHLR", "0018"), new VehicleValue("STLA", "CTRN", "0026"), new VehicleValue("STLA", "DODG", "0019"), new VehicleValue("STLA", "DS01", "0027"), new VehicleValue("STLA", "FIAT", "0020"), new VehicleValue("STLA", "FTPR", "0021"), new VehicleValue("STLA", "JEEP", "0022"), new VehicleValue("STLA", "LNCA", "0023"), new VehicleValue("STLA", "MOPR", "0024"), new VehicleValue("STLA", "OPEL", "0028"), new VehicleValue("STLA", "PEGT", "0029"), new VehicleValue("STLA", "RAM1", "0025"), new VehicleValue("STLA", "VXHL", "0030"), new VehicleValue("MASE", "MASE", "0034"), new VehicleValue("RNTG", "RNTL", "0040"), new VehicleValue("RNTG", "DCIA", "0041"), new VehicleValue("RNTG", "ALPN", "0042"), new VehicleValue("RNTG", "LADA", "0043"), new VehicleValue("RNTG", "MBLZ", "0044"), new VehicleValue("RBCV", "RBCV", "1886"), new VehicleValue("GM01", "BUIK", "0045"), new VehicleValue("GM01", "CADL", "0046"), new VehicleValue("GM01", "CHVY", "0047"), new VehicleValue("GM01", "GMC1", "0048"), new VehicleValue("GENE", "GENE", "00AA"), new VehicleValue("HYUN", "HYUN", "00AB"), new VehicleValue("KIA1", "KIA1", "00AC"), new VehicleValue("BYD1", "BYD1", "0049"), new VehicleValue("CONT", "CONT", "0050"), new VehicleValue("HOND", "HOND", "0051"), new VehicleValue("ACUR", "ACUR", "0052"), new VehicleValue("GWM1", "HAFU", "0053"), new VehicleValue("GWM1", "PIKA", "0054"), new VehicleValue("GWM1", "TANK", "0055"), new VehicleValue("GWM1", "WEY1", "0056"), new VehicleValue("GWM1", "ORA1", "0057"), new VehicleValue("GWM1", "SL01", "0058"), new VehicleValue("GWM2", "SAL1", "0059"), new VehicleValue("INVE", "INVE", "0060"), new VehicleValue("GELY", "GELY", "0061"), new VehicleValue("GELY", "LYCO", "0062"), new VehicleValue("LTUS", "LOT1", "0063"), new VehicleValue("GELY", "ZEKR", "0064"), new VehicleValue("GELY", "GLVC", "0065"), new VehicleValue("GELY", "GLPC", "0066"), new VehicleValue("GELY", "SMRT", "0067"), new VehicleValue("GELY", "LEVC", "0068"), new VehicleValue("VOCG", "VLVC", "0069"), new VehicleValue("VOCG", "PLST", "0070"), new VehicleValue("CQCA", "CQCA", "0071"), new VehicleValue("CQCA", "CAOS", "0072"), new VehicleValue("CQCA", "CAKC", "0073"), new VehicleValue("CAEV", "CAEV", "0074"), new VehicleValue("AVTR", "AVTR", "0075"), new VehicleValue("TEST", "TST1", "0076"), new VehicleValue("TEST", "TST2", "0077"), new VehicleValue("TEST", "TST3", "0078"), new VehicleValue("TEST", "TST3", "0078"), new VehicleValue("GELY", "GVLV", "0079"), new VehicleValue("GELY", "GPSV", "0080"), new VehicleValue("TS01", "TS01", "0081"), new VehicleValue("XIAO", "XIAO", "0082"), new VehicleValue("RIVN", "RIV1", "0083"), new VehicleValue("RIVN", "RIV2", "0084"), new VehicleValue("RIVN", "RIV3", "0085"), new VehicleValue("BYD1", "YW01", "0086"), new VehicleValue("JLR1", "JAGU", "0087"), new VehicleValue("JLR1", "LNDR", "0088"), new VehicleValue("JLR1", "DFND", "0089"), new VehicleValue("JLR1", "DSCO", "0090"), new VehicleValue("JLR1", "RNGR", "0091"), new VehicleValue("VOCG", "VLVC", "0092"), new VehicleValue("VOCG", "PLST", "0093"), new VehicleValue("GAC1", "AION", "0094"), new VehicleValue("GAC2", "TRUM", "0095"), new VehicleValue("VCDA", "VCDA", "0096"), new VehicleValue("NML1", "NML1", "0097"), new VehicleValue("NML1", "INF1", "0098"), new VehicleValue("GENE", "GENE", "00AA"), new VehicleValue("HYUN", "HYUN", "00AB"), new VehicleValue("KIA1", "KIA1", "00AC"), new VehicleValue("NIO1", "NIO1", "010A"), new VehicleValue("NIO1", "NIO2", "010B"), new VehicleValue("NIO1", "NIO3", "010C"), new VehicleValue("XIA1", "XIA1", "0112"), new VehicleValue("MAMG", "MAMG", "0231"), new VehicleValue("FUSO", "FUSO", "0232"), new VehicleValue("DASE", "DASE", "0233"), new VehicleValue("RBCV", "RBCV", "1886"), new VehicleValue("DNSO", "DNSO", "444E"), new VehicleValue("CAEV", "CAEV", "8821"), new VehicleValue("MOCK", "BRND", "8888"), new VehicleValue("SNB1", "SNB1", "8811"), new VehicleValue("MS11", "MS11", "6688"), new VehicleValue("CHRY", "JETO", "9001")};

    public static UUID UUID16(String str) {
        return UUID.fromString(String.format(UUID_BASE, str));
    }

    public static VehicleValue getValue(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Map size is : ");
        sb.append(sVehicle_value_map.length);
        int i = 0;
        while (true) {
            VehicleValue[] vehicleValueArr = sVehicle_value_map;
            if (i >= vehicleValueArr.length) {
                return null;
            }
            VehicleValue vehicleValue = vehicleValueArr[i];
            if (vehicleValue.vehicleBrandName.equalsIgnoreCase(str)) {
                return vehicleValue;
            }
            i++;
        }
    }

    public static VehicleValue getValue(byte[] bArr) {
        String hexString = ByteUtils.toHexString(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("Map size is : ");
        sb.append(sVehicle_value_map.length);
        int i = 0;
        while (true) {
            VehicleValue[] vehicleValueArr = sVehicle_value_map;
            if (i >= vehicleValueArr.length) {
                return null;
            }
            VehicleValue vehicleValue = vehicleValueArr[i];
            if (vehicleValue.VehicleBrandId.equalsIgnoreCase(hexString)) {
                return vehicleValue;
            }
            i++;
        }
    }
}
