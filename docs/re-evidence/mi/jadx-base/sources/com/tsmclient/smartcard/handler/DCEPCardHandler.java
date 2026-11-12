package com.tsmclient.smartcard.handler;

import android.nfc.tech.IsoDep;
import android.os.Bundle;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.apdu.SelectCommand;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.tsmclient.smartcard.tlv.TLVParser;
import com.tsmclient.smartcard.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class DCEPCardHandler implements ISmartCardHandler<IsoDep> {
    private static final ByteArray AID_DCEP = ByteArray.wrap(new byte[]{DKFRequestService.o, 0, 0, 0, 68, 67, 69, SettingsModule.VALUE_TYPE_FLAG});
    private static final ByteArray READ_APDU = ByteArray.wrap(new byte[]{-128, 34, 0, 3, 0});
    private static final ByteArray TAG_BALANCE = ByteArray.wrap(new byte[]{95, 48});

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public int getTechType() {
        return 1;
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IsoDep isoDep) throws UnProcessableCardException, IOException {
        return null;
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IScTerminal iScTerminal, Bundle bundle) throws UnProcessableCardException, IOException {
        Bundle bundle2 = new Bundle();
        SelectCommand selectCommand = new SelectCommand();
        selectCommand.setP1((byte) 4);
        selectCommand.setData(AID_DCEP);
        try {
            ScResponse scResponseTransmit = iScTerminal.transmit(selectCommand.toRawAPDU().toBytes());
            if (!ByteArray.equals(ScResponse.STATUS_APP_NOTE_EXISTS, scResponseTransmit.getStatus())) {
                if (ByteArray.equals(scResponseTransmit.getStatus(), ScResponse.STATUS_OK)) {
                    ByteArray data = iScTerminal.transmit(READ_APDU.toBytes()).getData();
                    if (data != null && data.length() > 22) {
                        bundle2.putBoolean("success", true);
                        bundle2.putInt(CardConstants.E_BALANCE, Coder.bytesToInt(TLVParser.parseTLVValue(data).findTLV(TAG_BALANCE).getValue().toBytes().toBytes()));
                    }
                    return bundle2;
                }
                throw new IOException("failed to select dc applet");
            }
            throw new UnProcessableCardException("DCEPCardHandler: unsupported card type");
        } catch (InvalidTLVException e) {
            e = e;
            LogUtils.e("onHandleCard", "occurs exception: ", e);
        } catch (TagNotFoundException e2) {
            e = e2;
            LogUtils.e("onHandleCard", "occurs exception: ", e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("onHandleCard is interrupted");
        }
    }
}
