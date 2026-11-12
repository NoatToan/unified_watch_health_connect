package com.huami.watch.companion.hci;

import com.xiaomi.hm.health.bt.profile.nfc.HMNFCTradeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\n\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\u000b\u001a\u00020\b*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\u0007\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u0007¨\u0006\u000f"}, d2 = {"Ljava/util/ArrayList;", "Lcom/huami/watch/companion/hci/NfcTradeInfoRaw;", "Lkotlin/collections/ArrayList;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCTradeInfo;", "toHMNFCTradeInfos", "toHMNFCTradeInfo", "", "", "toNfcTradeBalance", "toNfcTradeConsumption", "toNfcTradeType", "toNfcTradeDate", "", "hexStringToByteArray", "companion_release"}, k = 2, mv = {1, 5, 1})
public final class NfcTradeInfoRawKt {
    @NotNull
    public static final byte[] hexStringToByteArray(@NotNull String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    @NotNull
    public static final HMNFCTradeInfo toHMNFCTradeInfo(@NotNull NfcTradeInfoRaw nfcTradeInfoRaw) {
        HMNFCTradeInfo hMNFCTradeInfo = new HMNFCTradeInfo();
        hMNFCTradeInfo.setAid(nfcTradeInfoRaw.getAid());
        hMNFCTradeInfo.setBalance(toNfcTradeBalance(nfcTradeInfoRaw.getCom.xiaomi.hm.health.device.event.StatEvent.SPORT_TP_VALUE_BALANCE java.lang.String()));
        hMNFCTradeInfo.setConsumption(toNfcTradeConsumption(nfcTradeInfoRaw.getConsumption()));
        hMNFCTradeInfo.setHci(nfcTradeInfoRaw.getHci());
        hMNFCTradeInfo.setType(toNfcTradeType(nfcTradeInfoRaw.getType()));
        hMNFCTradeInfo.setClientId(nfcTradeInfoRaw.getClientId());
        hMNFCTradeInfo.setDate(toNfcTradeDate(nfcTradeInfoRaw.getDate()));
        return hMNFCTradeInfo;
    }

    @NotNull
    public static final List<HMNFCTradeInfo> toHMNFCTradeInfos(@NotNull ArrayList<NfcTradeInfoRaw> arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toHMNFCTradeInfo((NfcTradeInfoRaw) it2.next()));
        }
        return arrayList2;
    }

    public static final int toNfcTradeBalance(@NotNull String str) {
        byte[] bArrHexStringToByteArray = hexStringToByteArray(str);
        boolean z = (bArrHexStringToByteArray[0] & 128) == 128;
        int i = ((bArrHexStringToByteArray[0] & 127) << 24) | (bArrHexStringToByteArray[3] & 255) | ((bArrHexStringToByteArray[2] & 255) << 8) | ((bArrHexStringToByteArray[1] & 255) << 16);
        return z ? i * (-1) : i;
    }

    public static final int toNfcTradeConsumption(@NotNull String str) {
        byte[] bArrHexStringToByteArray = hexStringToByteArray(str);
        return ((bArrHexStringToByteArray[0] & 255) << 24) | (bArrHexStringToByteArray[3] & 255) | ((bArrHexStringToByteArray[2] & 255) << 8) | ((bArrHexStringToByteArray[1] & 255) << 16);
    }

    @NotNull
    public static final String toNfcTradeDate(@NotNull String str) {
        byte[] bArrHexStringToByteArray = hexStringToByteArray(str);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%02x%02x-%02x-%02x %02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(bArrHexStringToByteArray[0] & 255), Integer.valueOf(bArrHexStringToByteArray[1] & 255), Integer.valueOf(bArrHexStringToByteArray[2] & 255), Integer.valueOf(bArrHexStringToByteArray[3] & 255), Integer.valueOf(bArrHexStringToByteArray[4] & 255), Integer.valueOf(bArrHexStringToByteArray[5] & 255), Integer.valueOf(bArrHexStringToByteArray[6] & 255)}, 7));
    }

    public static final int toNfcTradeType(@NotNull String str) {
        return Integer.parseInt(str, 16);
    }
}
