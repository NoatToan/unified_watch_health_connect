package com.xiaomi.fitness.nfc.model;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.NfcA;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclientsdk.UnSupportedException;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.exception.EncryptionCardException;
import defpackage.o0j;
import defpackage.vqg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MifareCardModel {
    private static final String MI_CARD = "5849414F4D492E504159";

    private boolean authenticate(MifareClassic mifareClassic, int i, byte[] bArr, boolean z) throws IOException {
        byte[] bArr2 = new byte[12];
        if (z) {
            bArr2[0] = 96;
        } else {
            bArr2[0] = APDUConstants.TAG_MORE_DATA;
        }
        bArr2[1] = (byte) mifareClassic.sectorToBlock(i);
        byte[] id = mifareClassic.getTag().getId();
        System.arraycopy(id, id.length - 4, bArr2, 2, 4);
        System.arraycopy(bArr, 0, bArr2, 6, 6);
        try {
            return mifareClassic.transceive(bArr2) != null;
        } catch (Exception unused) {
            throw new IOException("failed to auth sector key");
        }
    }

    private boolean authenticateWithRetry(MifareClassic mifareClassic, int i, byte[] bArr, boolean z) {
        int i2 = 3;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return false;
            }
            try {
                return authenticate(mifareClassic, i, bArr, z);
            } catch (IOException unused) {
                vqg.b("failed to auth sector key, is keyA = " + z);
                i2 = i3;
            }
        }
    }

    private boolean canCopy(IsoDep isoDep) throws IOException {
        try {
            isoDep.connect();
            byte[] bArrTransceive = isoDep.transceive(APDUConstants.SELECT_PPSE);
            if (bArrTransceive != null && bArrTransceive.length > 2) {
                ByteArray byteArrayWrap = ByteArray.wrap(bArrTransceive);
                if (ByteArray.equals(byteArrayWrap.duplicate(byteArrayWrap.length() - 2, 2), ScResponse.STATUS_OK)) {
                    return Coder.bytesToHexString(bArrTransceive).indexOf(MI_CARD) > 0;
                }
            }
            return true;
        } finally {
            isoDep.close();
        }
    }

    private boolean readData(MifareClassic mifareClassic, MifareTag mifareTag, StringBuilder sb, int i, boolean z) throws EncryptionCardException {
        int i2;
        int i3 = 5;
        while (true) {
            i2 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            try {
                if (authenticateWithRetry(mifareClassic, i, MifareClassic.KEY_DEFAULT, z)) {
                    String sector = readSector(mifareClassic, i);
                    if (!TextUtils.isEmpty(sector)) {
                        sb.append(sector);
                        break;
                    }
                } else {
                    vqg.b("failed to authenticate sector with default isKeyA:" + z);
                    if (!z) {
                        throw new EncryptionCardException(mifareTag);
                    }
                }
            } catch (IOException e) {
                vqg.c("error occurred when read mifare sector use isKeyA:" + z, e);
            }
            i3 = i2;
        }
        return i2 >= 0;
    }

    private void readMoreContentForTag(MifareClassic mifareClassic, MifareTag mifareTag) throws EncryptionCardException, IOException {
        if (mifareClassic != null) {
            mifareTag.setSize(mifareClassic.getSize());
            try {
                mifareClassic.connect();
                int sectorCount = mifareClassic.getSectorCount();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < sectorCount; i++) {
                    boolean data = readData(mifareClassic, mifareTag, sb, i, true);
                    if (!data) {
                        data = readData(mifareClassic, mifareTag, sb, i, false);
                    }
                    if (!data) {
                        throw new IOException("failed to read tag mifare content");
                    }
                    vqg.a("m1 content: " + sb.toString());
                    mifareTag.setBlockContent(sb.toString());
                }
            } finally {
                try {
                    mifareClassic.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    private String readSector(MifareClassic mifareClassic, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i2 = i * 4;
        for (int i3 = i2; i3 < i2 + 4; i3++) {
            byte[] block = mifareClassic.readBlock(i3);
            if (block == null || block.length <= 0) {
                return null;
            }
            sb.append(Coder.bytesToHexString(block));
        }
        return sb.toString();
    }

    public Map<CardGroupType, List<CardInfo>> parseList(List<CardInfo> list) {
        HashMap map = new HashMap();
        for (CardGroupType cardGroupType : CardGroupType.values()) {
            map.put(cardGroupType, new ArrayList());
        }
        if (list == null) {
            return map;
        }
        for (CardInfo cardInfo : list) {
            for (CardGroupType cardGroupType2 : CardGroupType.values()) {
                if (cardGroupType2.getId() == cardInfo.mCardGroupId) {
                    ((List) map.get(cardGroupType2)).add(cardInfo);
                    break;
                }
            }
        }
        return map;
    }

    public MifareTag parseTag(Tag tag) throws EncryptionCardException, IOException, UnSupportedException {
        if (tag == null) {
            return null;
        }
        NfcA nfcA = NfcA.get(tag);
        try {
            if (nfcA == null) {
                throw new UnSupportedException(AppUtil.getApp().getString(o0j.b7));
            }
            MifareTag mifareTag = new MifareTag();
            mifareTag.setUid(Coder.bytesToHexString(tag.getId()));
            mifareTag.setSak(Coder.bytesToHexString(Coder.shortToByte(nfcA.getSak())));
            mifareTag.setAtqa(Coder.bytesToHexString(nfcA.getAtqa()));
            MifareClassic mifareClassic = MifareClassic.get(tag);
            if (mifareClassic != null) {
                vqg.d("read a mifare card");
                readMoreContentForTag(mifareClassic, mifareTag);
            } else {
                IsoDep isoDep = IsoDep.get(tag);
                vqg.d("read a IsoDep card");
                if (isoDep != null) {
                    boolean zCanCopy = canCopy(isoDep);
                    vqg.d("IsoDep card isCanCopy:" + zCanCopy);
                    if (!zCanCopy) {
                        throw new UnSupportedException(AppUtil.getApp().getString(o0j.b7));
                    }
                }
            }
            nfcA.close();
            return mifareTag;
        } catch (Throwable th) {
            if (nfcA != null) {
                try {
                    nfcA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
