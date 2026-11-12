package com.xiaomi.idm.constant;

import androidx.work.WorkInfo;
import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.idm.exception.EventException;
import com.xiaomi.idm.exception.IDMException;
import com.xiaomi.idm.exception.OobException;
import com.xiaomi.idm.exception.RequestException;
import com.xiaomi.idm.exception.SubsEventException;

/* JADX INFO: loaded from: classes11.dex */
public interface ResponseCode {

    public enum AccountChangedCode implements ResponseCode {
        ACCOUNT_CHANGED_LOGIN(0, "Account login"),
        ACCOUNT_CHANGED_LOGOUT(1, "Account logout"),
        ACCOUNT_CHANGED_ACCOUNT_CHANGED(2, "Account changed"),
        ACCOUNT_CHANGED_UNKNOWN(-9999, "Unknown service changed code");

        public final int code;
        public final String msg;

        AccountChangedCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static AccountChangedCode fromCode(int i) {
            for (AccountChangedCode accountChangedCode : values()) {
                if (i == accountChangedCode.getCode()) {
                    return accountChangedCode;
                }
            }
            return ACCOUNT_CHANGED_UNKNOWN;
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum AccountType implements ResponseCode {
        ACCOUNT_TYPE_UNKNOWN(0, "Unknown"),
        ACCOUNT_TYPE_NONE(1, "Not Account"),
        ACCOUNT_TYPE_ACCOUNT(2, LogExtKt.ACCOUNT_TAG),
        ACCOUNT_TYPE_OFFLINE_ACCOUNT(3, "Offline Account");

        private final int code;
        private final String msg;

        AccountType(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static AccountType fromCode(int i) {
            for (AccountType accountType : values()) {
                if (accountType.code == i) {
                    return accountType;
                }
            }
            return ACCOUNT_TYPE_UNKNOWN;
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum AdvertisingCode implements ResponseCode {
        START_ADVERTISING_SUCCESS(3, "Start Advertising SUCCESS"),
        STOP_ADVERTISING_SUCCESS(4, "Stop Advertising SUCCESS"),
        ADV_ADVERTISING_CHECK_SUCCESS(1, "Security Manager check success"),
        UPDATE_ADVERTISING_SUCCESS(20, "Update Advertising Success"),
        ALREADY_ADVERTISING(-5, "Already In Advertising"),
        START_ADVERTISING_ERROR(-7, "Start Advertising Error"),
        STOP_ADVERTISING_ERROR(-8, "Stop Advertising Error"),
        NOT_IN_ADVERTISING(-12, "Not In Advertising"),
        REGISTER_SERVICE_FAILED(-69, "Register Service Failed"),
        UPDATE_SERVICE_PARAM_ILLEGAL(-157, "update service parameters are illegal"),
        UPDATE_SERVICE_UNNECESSARY(-158, "service is not necessary to be update"),
        UPDATE_SERVICE_OPERATION_DENIED(-159, "update service operation denied"),
        ADVERTISING_PERMISSION_DENIED(-9000, "register service permission denied"),
        ADV_ERR_REPEATED_REQUEST(-9001, "repeated advertising request call, please wait for the last call to return"),
        ADV_ERR_PERSISTENT_SERVICE_ALREADY_BOUND(-9002, "persistent service already bonded"),
        ADV_ERR_PERSISTENT_SERVICE_CLIENT_ID(-9003, "initial clientId of the persistent service does not match the clientId of the caller"),
        ADV_ERR_SERVICE_NOT_AVAILABLE(-9004, "mi connect service not available"),
        ADV_ERR_SERVICE_ID_REPEATED(-9005, "service Id already registered"),
        ADV_ERR_SERVICE_INSTANCE_REPEATED(-9006, "service instance already registered"),
        ADV_ERR_SERVICE_ID_EMPTY(-9007, "service Id is empty"),
        ADV_ERR_SERVICE_NOT_REGISTERED(-9008, "service instance not registered"),
        ADV_ERR_NOT_SUPPORT_OFFLINE_ACCOUNT(-9009, "Not support offline account"),
        ADV_ERR_NOT_SUPPORT_UPDATE_SERVICE(-9010, "Not support update services"),
        ERROR_CODE_START_DISC_NOT_SUPPORTED(-26, "disc type not supported/permission denied"),
        ERROR_CODE_COMMTYPE_NOT_SUPPORTED(-27, "comm type not supported/permission denied"),
        ADV_UNKNOWN(-9999, "Unknown advertising code");

        private final int code;
        private final String msg;

        AdvertisingCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static AdvertisingCode fromCode(int i) {
            for (AdvertisingCode advertisingCode : values()) {
                if (advertisingCode.code == i) {
                    return advertisingCode;
                }
            }
            return ADV_UNKNOWN;
        }

        public static String getResponseMsg(int i) {
            for (AdvertisingCode advertisingCode : values()) {
                if (advertisingCode.code == i) {
                    return advertisingCode.msg;
                }
            }
            return "AdvertisingCode response code: unKnown response code: [" + i + "]";
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum ConnectCode implements ResponseCode {
        CONN_STAT_CONNECTED(0, "Service connected"),
        CONN_STAT_TO_BE_CONFIRM(13, "Connect service to be confirmed"),
        CONN_STAT_LOCAL_REJECTED(7, "Local reject to connect"),
        CONN_STAT_DISCONNECT(8, "Service disconnected"),
        CONN_STAT_INVITED(14, "Service invited"),
        CONN_STAT_PHYSICAL_LINK_CONNECTED(15, "Physical link connected"),
        INVITE_CONNECTION_SUCCESS(16, "Invite Connection SUCCESS"),
        CONN_STAT_WLAN_SERVER_STARTED(18, "WLAN server started"),
        CONN_STAT_WLAN_SERVER_STOPPED(19, "WLAN server stopped"),
        CONN_STAT_CONNECTION_RESOURCES_RELEASED(23, "Connection Resource Released"),
        CONN_STAT_SERVICE_RPC_CHANNEL_UP(25, "rpc channel initiated"),
        CONN_STAT_ERR_SERVICE_RPC_CHANNEL_DOWN(26, "rpc channel closed"),
        CONN_STAT_GENERAL_ERROR(-1, "General error"),
        CONN_STAT_ERR_ILLEGAL_PARAMETER(-2, "Error: Illegal parameter"),
        CONN_STAT_ERR_SERVICE_NOT_FOUND(-14, "Error: Service not found"),
        SERVICE_INCOMPATIBLE(-16, "Error: Service incompatible"),
        SERVER_OCCUPIED(-17, "Error: Server occupied"),
        SERVER_NOT_EXIST(-19, "Error: Sever not exist"),
        CONN_STAT_REMOTE_REJECTED(-20, "Remote reject to connect"),
        COMMUNICATION_ERROR(-21, "Error: Communication Error"),
        REMOTE_CLIENT_NOT_EXIST(-22, "Error: Remote client not exist"),
        ERROR_CODE_COMMTYPE_NOT_SUPPORTED(-27, "comm type not supported"),
        PHYSICAL_LINK_ERROR(-129, "Error: Physical link error"),
        SA_NOT_VERIFIED(-126, "Error: Same account not verified"),
        SA_VERIFIED_UNKNOWN(-127, "Error: Same account unknown"),
        SA_VERIFIED_FAILED(WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, "Error: Not same account"),
        CONN_STAT_ENDPOINT_NOT_PAIRED(-131, "Error: Endpoint not paired"),
        CONN_STAT_WLAN_SERVER_CREATE_ERROR(-132, "Error: WLAN server create error"),
        CONN_STAT_ERR_WLAN_CLIENT_DISCONNECTED(-133, "WLAN client disconnected"),
        CONN_STAT_ERR_CONNECTION_BUSY(-141, "Busy to make new connection"),
        CONN_STAT_ERR_WLAN_CHANNEL_OCCUPIED(-143, "WLAN channel occupied"),
        CONN_STAT_CONNECT_TYPE_NOT_SUPPORTED_BY_SERVER(-144, "Connect type not supported by server"),
        CONN_STAT_ERR_REMOTE_DISCONNECT_PASSIVE(-145, "Passively disconnected and notified by remote"),
        CONN_STAT_ERR_WLAN_WFD_NOT_SUPPORT(-146, "WLAN WiFi Director not support"),
        CONN_STAT_ERR_SAME_ACCOUNT_NOT_LOGGED(-148, "Same account not logged in"),
        CONN_STAT_ERR_SAME_ACCOUNT_CONNECTION_FAILED(-149, "Same account connection failed"),
        CONN_STAT_ERR_WLAN_CLIENT_CREATE_ERROR(-150, "WLAN client create error"),
        CONN_STAT_ERR_NO_ADVANCED_WO_BASIC(-151, "Can not request advanced without basic"),
        CONN_STAT_ERR_DIFF_TYPE_ADVANCED_ALREADY_UP(-152, "Different type requested while advanced already up"),
        CONN_STAT_ERR_WLAN_CHANNEL_NOT_SUPPORT(-153, "WLAN channel not supported"),
        CONN_STAT_ERR_COMM_DATA_TYPE_NOT_SUPPORTED(-154, "comm data type not supported"),
        CONN_STAT_ERR_WLAN_SSID_PWD_ERROR(-156, "SSID password error"),
        CONN_STAT_TIMIE_OUT_ERROR(-163, "Error: connect time out"),
        CONN_STAT_ERR_PERMISSION_DENIED(-9000, "Error: Permission denied"),
        CONN_STAT_ERR_NOT_SUPPORT_OFFLINE_ACCOUNT(-9009, "Not support offline account"),
        CONN_STAT_ERR_LOCAL_ONLY_NOT_READY(-5000, "Error: LocalOnly hotspot not ready"),
        CONN_UNKNOWN(-9999, "Unknown response code");

        private final int code;
        private final String msg;

        ConnectCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static ConnectCode fromCode(int i) {
            for (ConnectCode connectCode : values()) {
                if (connectCode.code == i) {
                    return connectCode;
                }
            }
            return CONN_UNKNOWN;
        }

        public static String getResponseMsg(int i) {
            for (ConnectCode connectCode : values()) {
                if (connectCode.code == i) {
                    return connectCode.msg;
                }
            }
            return "ConnectCode response code: unKnown response code: [" + i + "]";
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum DiscoveryCode implements ResponseCode {
        DISC_CHECK_SUCCESS(3, "Security Manager check success"),
        STOP_DISCOVERY_SUCCESS(2, "Stop Discovery SUCCESS"),
        START_DISCOVERY_SUCCESS(1, "Start Discovery SUCCESS"),
        DISCOVERY_END(10, "Discovery END"),
        ALREADY_DISCOVERY(-6, "Already In Discovery"),
        START_DISCOVERY_ERROR(-9, "Start Discovery Error"),
        STOP_DISCOVERY_ERROR(-10, "Stop Discovery Error"),
        NOT_IN_DISCOVERY(-13, "Not In Discovery"),
        DISC_ERR_DISC_TYPE_NOT_SUPPORTED(-26, "disc type not supported/permission denied"),
        DISCOVERY_INTERRUPTED(-139, "Discovery is interrupted"),
        DISCOVERY_PERMISSION_DENIED(-9000, "Discovery is permission denied"),
        DISCOVERY_PERMISSION_BLOCKED(-9001, "Discovery is permission blocked"),
        DISC_ERR_NOT_SUPPORT_OFFLINE_ACCOUNT(-9009, "Not support offline account"),
        DISC_UNKNOWN(-9999, "Unknown discovery error");

        private final int code;
        private final String msg;

        DiscoveryCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static DiscoveryCode fromCode(int i) {
            for (DiscoveryCode discoveryCode : values()) {
                if (discoveryCode.code == i) {
                    return discoveryCode;
                }
            }
            return DISC_UNKNOWN;
        }

        public static String getResponseMsg(int i) {
            for (DiscoveryCode discoveryCode : values()) {
                if (discoveryCode.code == i) {
                    return discoveryCode.msg;
                }
            }
            return "DiscoveryCode response code: unKnown response code: [" + i + "]";
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum EventCode implements ResponseCode {
        EVENT_REQUEST_SENT(1, "Event request sent"),
        EVENT_SUCCESS(0, "Event response success"),
        EVENT_ERR_REQUEST_SENDING_FAILED(-1, "Event request sending failed"),
        EVENT_ERR_NOT_SUBSCRIBED(-2, "The client not subscribe the event, or client version does not support p2p event"),
        EVENT_ERR_PARSE_RESPONSE_ERR(-3, "Err occur when server parse response"),
        EVENT_ERR_PARSE_REQUEST_ERR(-4, "Err occur when client parse request"),
        EVENT_ERR_PROTO_PARSE_ERR(-5, "Proto parse failed"),
        EVENT_ERR_CANCELED(-6, "Event call canceled"),
        EVENT_ERR_LOCAL_MC_VERSION_TOO_LOW(-7, "MiConnectService version too low, do not support point to point event"),
        EVENT_ERR_PEER_MC_VERSION_TOO_LOW(-8, "Peer MiConnectService version too low, do not support point to point event"),
        EVENT_ERR_EVENT_CALLBACK_NOT_SET_YET(-9, "Event Callback not set yet"),
        EVENT_ERR_EVENT_NOT_ENABLED(-10, "Event not been enabled yet"),
        EVENT_ERR_SERVER_NOT_REGISTERED(-11, "Server not registered"),
        EVENT_ERR_NULL_CLIENT_ID(-12, "P2p event with no clientId specified"),
        EVENT_ERR_NOTIFYEVENT_TIMEOUT(-13, "notify timeout"),
        EVENT_ERR_CLASSTYPE_INVALID(-14, "Event class type invalid"),
        EVENT_ERR_BT_INTERCEPTED(-19, "Notify event intercepted by bt"),
        EVENT_UNKNOWN(-9999, "Unknown event code");

        private final int code;
        private final String msg;

        EventCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static EventCode fromCode(int i) {
            for (EventCode eventCode : values()) {
                if (eventCode.code == i) {
                    return eventCode;
                }
            }
            return EVENT_UNKNOWN;
        }

        public IDMException createException() {
            return new EventException(this);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum InvitationCode implements ResponseCode {
        INVITE_CONNECTION_SUCCESS(16, "Invite Connection SUCCESS"),
        ABORT_INVITATION_SUCCESS(17, "Abort InvitationCode SUCCESS"),
        ACCEPT_INVITATION_SUCCESS(20, "Accept Invitation SUCCESS"),
        DENY_INVITATION_SUCCESS(21, "Deny Invitation SUCCESS"),
        RECEIVE_INVITATION_SUCCESS(22, "Receive Invitation SUCCESS"),
        INV_CONNECTION_RESOURCES_RELEASED(23, "Connection resources released"),
        WLAN_SERVER_STARTED(18, "WLAN server started"),
        WLAN_SERVER_STOPPED(19, "WLAN server stopped"),
        INVITE_ERR_WLAN_SERVER_CREATE_ERROR(-132, "WLAN server create error"),
        INVITE_CONNECTION_ERROR(-134, "General inviting connection error"),
        INVITE_CONNECTION_TIMEOUT(-135, "Inviting connection is timeout and aborted"),
        ABORT_INVITATION_ERROR(-136, "Abort invitation error, not aborted"),
        INVITE_BUSY(-137, "Invite Busy"),
        NOT_IN_INVITING(-138, "Not In Inviting"),
        INV_ERR_WLAN_CHANNEL_OCCUPIED(-143, "WLAN channel occupied"),
        INV_ERR_WLAN_WFD_NOT_SUPPORT(-146, "WLAN WiFi Director not support"),
        INVITE_ERR_WLAN_CHANNEL_NOT_SUPPORT(-153, "WLAN channel not supported"),
        INV_UNKNOWN(-9999, "Unknown invitation error");

        private final int code;
        private final String msg;

        InvitationCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static InvitationCode fromCode(int i) {
            for (InvitationCode invitationCode : values()) {
                if (invitationCode.code == i) {
                    return invitationCode;
                }
            }
            return INV_UNKNOWN;
        }

        public static String getResponseMsg(int i) {
            for (InvitationCode invitationCode : values()) {
                if (invitationCode.code == i) {
                    return invitationCode.msg;
                }
            }
            return "InvitationCode response code: unKnown response code: [" + i + "]";
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum MiConnectCode implements ResponseCode {
        MI_CONNECT_DISCONNECTED(1, "MiConnect Disconnected"),
        MI_CONNECT_CONNECTED(0, "MiConnect Connected"),
        MI_CONNECT_ERR_ON_BINDING_DIED(-9001, "MiConnect onBindingDied"),
        MI_CONNECT_ERR_ON_NULL_BINDING(-9002, "MiConnect onNullBinding"),
        MI_CONNECT_ERR_VERSION_TOO_LOW(-9003, "MiConnect Version too low"),
        MI_CONNECT_ERR_NOT_FOUND(-9004, "MiConnect Could not be found on device or Permission denied"),
        MI_CONNECT_ERR_REMOTE_EXCEPTION(-9005, "MiConnect report an exception"),
        MI_CONNECT_UNKNOWN(-9999, "Unknown response code");

        private final int code;
        private final String msg;

        MiConnectCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum OobCode implements ResponseCode {
        OOB_STAT_CREATE_OOB_SUCCESS(0, "Create Oob Success"),
        OOB_ERR_NOT_SUPPORT(-153, "Create Oob Info not support"),
        OOB_ERR_SDK_TIMEOUT(-9000, "Create Oob Info timeout"),
        OOB_UNKNOWN(-9999, "Unknown response code");

        public final int code;
        public final String msg;

        OobCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static OobCode fromCode(int i) {
            for (OobCode oobCode : values()) {
                if (oobCode.code == i) {
                    return oobCode;
                }
            }
            return OOB_UNKNOWN;
        }

        public IDMException createException() {
            return new OobException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum PropertyStatusCode implements ResponseCode {
        PROPERTY_STATUS_SUCCESS(1, "Property get/set successfully"),
        PROPERTY_STATUS_NOT_SET(0, "Property status not set"),
        PROPERTY_STATUS_FAILED(-1, "Property get/get failed"),
        PROPERTY_STATUS_FAILED_NO_ACCESS(-2, "Property has no co-respond access"),
        PROPERTY_STATUS_SET_FAILED_PROPERTY_VALUE_PARSE_ERR(-3, "Property value bytes parse error"),
        PROPERTY_STATUS_UNKNOWN(-9999, "Unknown property status");

        public final int code;
        public final String msg;

        PropertyStatusCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static PropertyStatusCode fromCode(int i) {
            for (PropertyStatusCode propertyStatusCode : values()) {
                if (i == propertyStatusCode.getCode()) {
                    return propertyStatusCode;
                }
            }
            return PROPERTY_STATUS_UNKNOWN;
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum RequestCode implements ResponseCode {
        REQUEST_SUCCEED(0, "RequestCode succeed"),
        READY_FOR_LOCAL_REQUEST(1, "Ready for local request"),
        READY_FOR_RPC_REQUEST(2, "Ready for RPC request"),
        ERR_REQUEST_NULL(-1, "Error when request bytes is null"),
        ERR_REQUEST_PARSE(-2, "Error when parse request bytes to IDMRequest proto"),
        ERR_RESPONSE_NULL(-3, "Response bytes null when do request"),
        ERR_RESPONSE_PARSE(-4, "Response parse error when do request"),
        ERR_INVALID_SERVICE_ID(-5, "Service id is illegal"),
        ERR_SERVICE_NOT_FOUND(-6, "Service not found"),
        ERR_ACTION_NOT_FOUND(-7, "Action not found"),
        ERR_RESPONSE_PARSE_IN_ACTION(-8, "Response parse error in action"),
        ERR_RMI_TIME_OUT(-9, "RMI call time out"),
        ERR_RMI_THREAD_INTERRUPTED(-10, "Calling thread is interrupted"),
        ERR_RMI_CANCELED(-11, "Call is canceled"),
        ERR_SERVICE_LOST(-12, "Service is lost"),
        ERR_CLIENT_DESTROYED(-13, "Client is destroyed"),
        ERR_REMOTE_UNREACHABLE(-14, "RPC remote unreachable"),
        ERR_SERVICE_NOT_CONNECTED(-15, "Service not connected"),
        ERR_SERVICE_DISCONNECTING(-16, "Service disconnected when requesting"),
        ERR_REQUEST_RPC(-17, "Request failed when call RPC service"),
        ERR_CLASSTYPE_INVALID(-18, "Request Action class type invalid"),
        ERR_REQUEST_BT_INTERCEPTED(-19, "Request intercepted by bt"),
        REQ_UNKNOWN(-9999, "Unknown request error");

        private final int code;
        private final String msg;

        RequestCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static RequestCode fromCode(int i) {
            for (RequestCode requestCode : values()) {
                if (requestCode.code == i) {
                    return requestCode;
                }
            }
            return REQ_UNKNOWN;
        }

        public static String getResponseMsg(int i) {
            for (RequestCode requestCode : values()) {
                if (requestCode.code == i) {
                    return requestCode.msg;
                }
            }
            return "RequestCode response code: unKnown response code: [" + i + "]";
        }

        public IDMException createException() {
            return new RequestException(this.code);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum SendBlockCode implements ResponseCode {
        SEND_BLOCK_SUCCESS(0, "Block Sent"),
        SEND_BLOCK_ERR_GENERAL_ERROR(-1, "SendBlock General Error"),
        SEND_BLOCK_ERR_PARAM_ILLEGAL(-2, "Param error"),
        SEND_BLOCK_ERR_TIMEOUT(-3, "Timeout"),
        SEND_BLOCK_ERR_UNSUPPORTED(-4, "MiConnect not support"),
        SEND_BLOCK_ERR_MEM_EXCEED(-5, "Memory usage exceed"),
        SEND_BLOCK_ERR_UNREACHABLE(-14, "Unreachable"),
        SEND_BLOCK_ERR_NOT_CONNECTED(-15, "Not Connected"),
        SEND_BLOCK_ERR_REMOTE_UNSUPPORTED(-16, "Remote Not Support"),
        SEND_BLOCK_UNKNOWN(-9999, "Unknown sendBlock code");

        final int code;
        final String msg;

        SendBlockCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static SendBlockCode fromCode(int i) {
            for (SendBlockCode sendBlockCode : values()) {
                if (i == sendBlockCode.getCode()) {
                    return sendBlockCode;
                }
            }
            return SEND_BLOCK_UNKNOWN;
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum SubsEventCode implements ResponseCode {
        SUBS_EVENT_UNSUBSCRIBE_SUCCESS(1, "Unsubscribe event success"),
        SUBS_EVENT_SUBSCRIBE_SUCCESS(0, "Subscribe event success"),
        SUBS_EVENT_ERR_SERVICE_NOT_FOUND(-1, "Target service not found"),
        SUBS_EVENT_ERR_NETWORK_UNREACHABLE(-2, "Network unreachable"),
        SUBS_EVENT_ERR_SERVICE_NOT_CONNECTED(-3, "Target service not connected"),
        SUBS_EVENT_ERR_EVENT_NOT_FOUND(-4, "The event to subscribe is missing"),
        SUBS_EVENT_ERR_CLIENT_NOT_SUBSCRIBED(-5, "Event not subscribe"),
        SUBS_EVENT_ERR_LOCAL_SERVICE_NOT_AVAILABLE(-6, "Event local mi_connect_service not available"),
        SUBS_EVENT_ERR_CLIENT_NOT_REGISTERED(-15, "Client not registered"),
        SUBS_EVENT_ERR_CONCURRENT_ERROR(-16, "Event concurrent error"),
        SUBS_EVENT_ERR_OUT_OF_MEMORY(-17, "Malloc failed"),
        SUBS_EVENT_ERR_CLIENT_DESTROYED(-18, "Client destroyed"),
        SUBS_EVENT_ERR_REPEATED_REQUEST(-19, "Repeated subs event request"),
        SUBS_EVENT_ERR_CANCELED(-20, "Sub/unSub event request canceled/interrupted"),
        SUBS_EVENT_ERR_SERVICE_LOST(-23, "Service lost when subscribe event"),
        SUBS_EVENT_ERR_PROTO_PARSE_ERR(-24, "Proto parse failed"),
        SUBS_EVENT_ERR_FUTURE_EXCEPTION(-25, "Future throws an ExecutionException"),
        SUBS_EVENT_ERR_TIMEOUT(-26, "Sub/UnSub event timeout"),
        SUBS_EVENT_ERR_CLIENT_NOT_CONNECTED(-27, "Client not connected"),
        SUBS_EVENT_ERR_SERVICE_REJECTED(-28, "Service rejected"),
        SUBS_EVENT_ERR_WRONG_TARGET(-29, "Wrong target service"),
        SUBS_EVENT_ERR_EVENT_PROTO_MISSING(-30, "Missing event proto"),
        SUBS_EVENT_UNKNOWN(-9999, "Unknown set event error");

        private final int code;
        private final String msg;

        SubsEventCode(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static SubsEventCode fromCode(int i) {
            for (SubsEventCode subsEventCode : values()) {
                if (subsEventCode.code == i) {
                    return subsEventCode;
                }
            }
            return SUBS_EVENT_UNKNOWN;
        }

        public static String getResponseMsg(int i) {
            for (SubsEventCode subsEventCode : values()) {
                if (subsEventCode.code == i) {
                    return subsEventCode.msg;
                }
            }
            return "SetEventCode response code: unKnown response code: [" + i + "]";
        }

        public IDMException createException() {
            return new SubsEventException(this);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    public enum VerifyStatus implements ResponseCode {
        NOT_VERIFIED(-1, "Not Verified"),
        VERIFIED_UNKNOWN(0, "Unknown status"),
        VERIFIED_SUCCEED(1, "Same Account"),
        VERIFIED_FAILED(2, "Not Same Account"),
        VF_UNKNOWN(-9999, "Unknown verifyStatus code");

        private final int code;
        private final String msg;

        VerifyStatus(int i, String str) {
            this.code = i;
            this.msg = str;
        }

        public static VerifyStatus fromCode(int i) {
            for (VerifyStatus verifyStatus : values()) {
                if (verifyStatus.code == i) {
                    return verifyStatus;
                }
            }
            return VF_UNKNOWN;
        }

        public static String getResponseMsg(int i) {
            for (VerifyStatus verifyStatus : values()) {
                if (verifyStatus.code == i) {
                    return verifyStatus.msg;
                }
            }
            return "VerifyStatus response code: unKnown response code: [" + i + "]";
        }

        public IDMException createException() {
            return new IDMException(this.code, this.msg);
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public int getCode() {
            return this.code;
        }

        @Override // com.xiaomi.idm.constant.ResponseCode
        public String getMsg() {
            return this.msg;
        }
    }

    int getCode();

    String getMsg();
}
