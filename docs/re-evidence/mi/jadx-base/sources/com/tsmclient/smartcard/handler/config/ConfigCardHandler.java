package com.tsmclient.smartcard.handler.config;

import android.text.TextUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.CardStatusException;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.handler.BaseTransCardHandler;
import com.tsmclient.smartcard.model.ConfigRules;
import com.tsmclient.smartcard.model.TradeLog;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigCardHandler extends BaseTransCardHandler {
    private static final int CONFIG_CARD_ENGINE_VERSION = 3;
    private static final String TAG = "ConfigCardHandler";
    private String mCardType;
    private Map<String, ScResponse> mCommandResult = new HashMap();
    private ConfigRules mConfigRules;

    public ConfigCardHandler(String str, ConfigRules configRules) {
        this.mCardType = str;
        this.mConfigRules = configRules;
    }

    private void assertPattern(String str, String str2, int i) throws UnProcessableCardException, CardStatusException {
        if (TextUtils.isEmpty(str) || Pattern.compile(str).matcher(str2).matches()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("assertPattern expect: ");
        sb.append(str);
        sb.append(", but: ");
        sb.append(str2);
        sb.append(", throw: ");
        sb.append(i);
        if (i == 1) {
            throw new CardStatusException(this.mCardType + " status is abnormal. Caused by " + str2 + " not matching " + str);
        }
        throw new UnProcessableCardException(this.mCardType + ": unsupported card type. Caused by " + str2 + " not matching " + str);
    }

    private ScResponse executeCommand(ConfigRules.Command command) throws UnProcessableCardException, IOException {
        if (command == null || TextUtils.isEmpty(command.mApdu) || 3 < command.mMinVersion) {
            return null;
        }
        int i = command.mMaxVersion;
        if (i != -1 && 3 > i) {
            return null;
        }
        if (!TextUtils.isEmpty(command.mPreConditionKey)) {
            ScResponse scResponse = this.mCommandResult.get(command.mPreConditionKey);
            try {
                String string = "";
                assertPattern(command.mPreConditionExpectStatus, scResponse == null ? "" : scResponse.getStatus().toString());
                String str = command.mPreConditionExpectData;
                if (scResponse != null) {
                    string = scResponse.getData().toString();
                }
                assertPattern(str, string);
            } catch (UnProcessableCardException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("precondition failed: ");
                sb.append(e.getMessage());
                return null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("executeCommand send: ");
        sb2.append(command.mApdu);
        ResponseImpl responseImpl = new ResponseImpl(transceive(Coder.hexStringToBytes(command.mApdu)));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("executeCommand receive: ");
        sb3.append(responseImpl.toString());
        this.mCommandResult.put(command.mApdu, responseImpl);
        assertPattern(command.mExpectStatus, responseImpl.getStatus().toString());
        assertPattern(command.mExpectData, responseImpl.getData().toString());
        return responseImpl;
    }

    private void executeCommands(List<ConfigRules.Command> list) throws UnProcessableCardException, IOException {
        if (list == null) {
            return;
        }
        for (ConfigRules.Command command : list) {
            if (command.isExecute(this.mInternalRead)) {
                executeCommand(command);
            }
        }
    }

    private void executeCommandsWithElements(List<ConfigRules.ParseDataCommand> list, Map<String, String> map) throws UnProcessableCardException, CardStatusException, IOException {
        ScResponse scResponseExecuteCommand;
        if (list == null) {
            return;
        }
        for (ConfigRules.ParseDataCommand parseDataCommand : list) {
            if (parseDataCommand.isExecute(this.mInternalRead) && (scResponseExecuteCommand = executeCommand(parseDataCommand)) != null) {
                if (!TextUtils.isEmpty(parseDataCommand.mResponseKey)) {
                    mapValue(parseDataCommand.mResponseKey, scResponseExecuteCommand.getStatus().toString(), parseDataCommand.mResponseMap, map);
                    if (!TextUtils.isEmpty(parseDataCommand.mExpectResponse)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("responseKey: ");
                        sb.append(parseDataCommand.mResponseKey);
                        sb.append(", expect: ");
                        sb.append(parseDataCommand.mExpectResponse);
                        assertPattern(parseDataCommand.mExpectResponse, map.get(parseDataCommand.mResponseKey), parseDataCommand.mResponseExceptionType);
                    }
                }
                if (parseDataCommand.mElementList == null) {
                    continue;
                } else {
                    ByteArray data = scResponseExecuteCommand.getData();
                    int length = data.length();
                    for (ConfigRules.Element element : parseDataCommand.mElementList) {
                        int i = element.mOffset;
                        int i2 = element.mLength;
                        if (i + i2 > length) {
                            throw new UnProcessableCardException(this.mCardType + ": unsupported card type. Caused by Offset of " + element.mKey);
                        }
                        String strBytesToHexString = Coder.bytesToHexString(data.duplicate(i, i2).toBytes());
                        if (element.mHexOffset >= 0) {
                            if (strBytesToHexString != null) {
                                int length2 = strBytesToHexString.length();
                                int i3 = element.mHexOffset;
                                int i4 = element.mHexLength;
                                if (length2 >= i3 + i4) {
                                    strBytesToHexString = strBytesToHexString.substring(i3, i4 + i3);
                                }
                            }
                            throw new UnProcessableCardException(this.mCardType + ": unsupported card type. Caused by HexOffset of " + element.mKey);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (!TextUtils.isEmpty(element.mPrefixHex)) {
                            sb2.append(element.mPrefixHex);
                        }
                        if (strBytesToHexString == null) {
                            strBytesToHexString = "";
                        }
                        sb2.append(strBytesToHexString);
                        if (!TextUtils.isEmpty(element.mSuffixHex)) {
                            sb2.append(element.mSuffixHex);
                        }
                        mapValue(element.mKey, sb2.toString(), element.mValueMap, map);
                        if (!TextUtils.isEmpty(element.mExpectValue)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("element: ");
                            sb3.append(element.mKey);
                            sb3.append(", expect: ");
                            sb3.append(element.mExpectValue);
                            assertPattern(element.mExpectValue, map.get(element.mKey), element.mValueExceptionType);
                        }
                    }
                }
            }
        }
    }

    private void mapValue(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (Pattern.compile(entry.getKey()).matcher(str2).matches()) {
                    str2 = entry.getValue();
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            map2.remove(str);
        } else {
            map2.put(str, str2);
        }
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public int getBalance() throws UnProcessableCardException, IOException {
        int iHexStringToInt;
        List<ConfigRules.ParseDataCommand> list = this.mConfigRules.mReadBalanceCommandList;
        if (list == null || list.isEmpty()) {
            return super.getBalance();
        }
        HashMap map = new HashMap();
        try {
            executeCommandsWithElements(list, map);
        } catch (CardStatusException unused) {
        }
        String str = map.get(CardConstants.E_BALANCE);
        int iHexStringToInt2 = 0;
        if (TextUtils.isEmpty(str)) {
            iHexStringToInt = 0;
        } else {
            try {
                iHexStringToInt = Coder.hexStringToInt(str);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("getBalance failed: ");
                sb.append(e.getMessage());
                iHexStringToInt = 0;
            }
        }
        String str2 = map.get(CardConstants.OVER_DRAWN);
        if (!TextUtils.isEmpty(str2)) {
            try {
                iHexStringToInt2 = Coder.hexStringToInt(str2);
                updateCardInfo(CardConstants.OVER_DRAWN, String.valueOf(iHexStringToInt2));
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getOverdraw failed: ");
                sb2.append(e2.getMessage());
            }
        }
        return iHexStringToInt2 < 0 ? iHexStringToInt : iHexStringToInt - iHexStringToInt2;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public Map<String, String> getCardNumAndValidDate() throws UnProcessableCardException, IOException {
        HashMap map = new HashMap();
        try {
            executeCommandsWithElements(this.mConfigRules.mCardNumValidDateCommandList, map);
        } catch (CardStatusException unused) {
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Date date = new Date();
        simpleDateFormat.setLenient(false);
        String str = map.get(CardConstants.VALID_START);
        if (!TextUtils.isEmpty(str)) {
            try {
                map.put(CardConstants.STATUS_VALID_START_DATE, String.valueOf(!date.before(simpleDateFormat.parse(str))));
            } catch (ParseException unused2) {
                map.put(CardConstants.STATUS_VALID_START_DATE, Boolean.FALSE.toString());
            }
        }
        String str2 = map.get(CardConstants.VALID_END);
        if (!TextUtils.isEmpty(str2)) {
            try {
                Date date2 = simpleDateFormat.parse(str2);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date2);
                calendar.add(5, 1);
                map.put(CardConstants.STATUS_VALID_END_DATE, String.valueOf(!date.after(calendar.getTime())));
            } catch (ParseException unused3) {
                map.put(CardConstants.STATUS_VALID_END_DATE, Boolean.FALSE.toString());
            }
        }
        return map;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public String getCardType() {
        return this.mCardType;
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void otherVerify() throws UnProcessableCardException, IOException {
        executeCommands(this.mConfigRules.mOtherVerifyCommandList);
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readCardStatus(Map<String, String> map) throws UnProcessableCardException, CardStatusException, IOException {
        super.readCardStatus(map);
        executeCommandsWithElements(this.mConfigRules.mReadCardStatusCommandList, map);
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void readRecord(ArrayList<TradeLog> arrayList, boolean z) throws IOException {
        List<ConfigRules.ReadRecordCommand> readRecordCommandList = this.mConfigRules.getReadRecordCommandList();
        if (readRecordCommandList.isEmpty()) {
            super.readRecord(arrayList, z);
            return;
        }
        try {
            for (ConfigRules.ReadRecordCommand readRecordCommand : readRecordCommandList) {
                if (readRecordCommand.isExecute(this.mInternalRead)) {
                    executeCommands(readRecordCommand.mPreReadCommandList);
                    if (readRecordCommand.isReadRecordInstructionListEmpty()) {
                        super.readRecord(arrayList, z);
                    } else {
                        for (ConfigRules.ReadRecordInstruction readRecordInstruction : readRecordCommand.getReadRecordInstructionList()) {
                            readRecord(arrayList, readRecordInstruction.mSkipOnceRead, readRecordInstruction.getP2(), readRecordInstruction.getSfi(), readRecordInstruction.isSkipParsingYear());
                        }
                    }
                }
            }
        } catch (UnProcessableCardException unused) {
            throw new IOException("failed to get record");
        }
    }

    @Override // com.tsmclient.smartcard.handler.BaseTransCardHandler
    public void selectVerify() throws UnProcessableCardException, IOException {
        if (this.mConfigRules == null) {
            throw new IOException("config rules of " + this.mCardType + " can't be null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("selectVerify card:");
        sb.append(this.mCardType);
        sb.append(", version:");
        sb.append(this.mConfigRules.mVersion);
        sb.append(", engine:");
        sb.append(3);
        executeCommands(this.mConfigRules.mSelectVerifyCommandList);
    }

    private void assertPattern(String str, String str2) throws UnProcessableCardException {
        try {
            assertPattern(str, str2, 0);
        } catch (CardStatusException unused) {
        }
    }
}
