package com.tsmclient.smartcard.handler;

import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.os.Bundle;
import android.text.TextUtils;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class MifareCardHandler implements ISmartCardHandler<MifareClassic> {
    private static final String TAG = "MifareCardHandler";

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public int getTechType() {
        return 3;
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(IScTerminal iScTerminal, Bundle bundle) throws UnProcessableCardException, IOException {
        return null;
    }

    @Override // com.tsmclient.smartcard.handler.ISmartCardHandler
    public Bundle onHandleCard(MifareClassic mifareClassic) throws UnProcessableCardException, IOException {
        Bundle bundle = new Bundle();
        Tag tag = mifareClassic.getTag();
        if (tag != null) {
            String strBytesToHexString = Coder.bytesToHexString(tag.getId());
            if (!TextUtils.isEmpty(strBytesToHexString)) {
                bundle.putString("uid", strBytesToHexString);
                bundle.putBoolean("success", true);
                bundle.putInt("card_type", 3);
            } else {
                throw new UnProcessableCardException("BankCardHandler: unsupported card type");
            }
        }
        return bundle;
    }
}
