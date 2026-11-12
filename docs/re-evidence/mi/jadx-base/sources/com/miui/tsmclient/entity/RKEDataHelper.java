package com.miui.tsmclient.entity;

import android.content.Context;
import com.google.gson.Gson;
import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.PrefUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.exception.InvalidTLVException;
import com.tsmclient.smartcard.exception.TagNotFoundException;
import com.tsmclient.smartcard.tlv.ITLVObject;
import com.tsmclient.smartcard.tlv.ITLVValue;
import com.tsmclient.smartcard.tlv.TLVParser;
import defpackage.e4s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class RKEDataHelper {
    private boolean isProprietaryRKEList(List<String> list) {
        return list != null && list.size() > 0 && Integer.parseInt(list.get(0), 16) >= 1536;
    }

    private boolean isUpdate(RKEData rKEData) {
        return rKEData.isComplete() && (rKEData.isStandardChanged() || rKEData.isProprietaryChanged());
    }

    public RKEData get(Context context, String str) {
        return RKEData.get(context, str);
    }

    public void update(Context context, byte[] bArr, RKEData rKEData) throws InvalidTLVException, TagNotFoundException {
        ITLVValue tLVValue = TLVParser.parseTLVValue(ByteArray.wrap(bArr));
        List<ITLVObject> listFindTLVList = tLVValue.findTLV(ByteArray.wrap(DKFRequestService.m)).getValue().findTLV(ByteArray.wrap((byte) 48)).getValue().findTLVList(ByteArray.wrap(DKFRequestService.o));
        ArrayList arrayList = new ArrayList();
        Iterator<ITLVObject> it = listFindTLVList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().findTLV(ByteArray.wrap((byte) -128)).getValue().toBytes().toString());
        }
        try {
            boolean zEquals = ByteArray.equals(tLVValue.findTLV(ByteArray.wrap(DKFRequestService.q)).getValue().toBytes(), ByteArray.wrap((byte) 3));
            if (zEquals) {
                rKEData.setStandardRKEFunctions(arrayList);
            } else if (isProprietaryRKEList(arrayList)) {
                rKEData.setProprietaryRKEFunctions(arrayList);
            } else {
                rKEData.setStandardRKEFunctions(arrayList);
                rKEData.setProprietaryRKEFunctions(null);
            }
            rKEData.setComplete(!zEquals);
        } catch (TagNotFoundException unused) {
            if (isProprietaryRKEList(arrayList)) {
                rKEData.setProprietaryRKEFunctions(arrayList);
            } else {
                rKEData.setStandardRKEFunctions(arrayList);
            }
            rKEData.setComplete(true);
        }
        String json = new Gson().toJson(rKEData);
        if (isUpdate(rKEData)) {
            CardInfoManager cardInfoManager = CardInfoManager.getInstance(context);
            CardInfo cardInfo = cardInfoManager.getCardInfo(rKEData.getKeyID());
            if (cardInfo != null) {
                CarKeyCardInfo carKeyCardInfo = (CarKeyCardInfo) cardInfo;
                carKeyCardInfo.mergeRKEFunctions(rKEData.getAllRKEFunctions());
                cardInfoManager.put(carKeyCardInfo);
            }
            e4s.a(context, rKEData.getKeyID(), json);
        }
        PrefUtils.putString(context, PrefUtils.PREF_KEY_RKE_LIST_FROM_VEHICLE + rKEData.getKeyID(), json);
    }
}
