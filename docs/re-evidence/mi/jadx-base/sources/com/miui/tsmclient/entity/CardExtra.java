package com.miui.tsmclient.entity;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import com.miui.tsmclient.util.PrefUtils;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.TerminalType;
import defpackage.dfs;
import defpackage.gfs;
import defpackage.zgt;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class CardExtra {
    private static Set<String> INTERNAL_TERMINAL;

    static {
        HashSet hashSet = new HashSet();
        INTERNAL_TERMINAL = hashSet;
        hashSet.add("com.miui.tsmclient");
    }

    public IScTerminal getTerminal(CardInfo cardInfo) {
        TerminalType terminalType;
        LogUtils.i("cardInfo.mCardDevice:" + cardInfo.mCardDevice);
        if (cardInfo instanceof DCEPCardInfo) {
            terminalType = TerminalType.DECP;
        } else if (TextUtils.isEmpty(cardInfo.mCardDevice) || INTERNAL_TERMINAL.contains(cardInfo.mCardDevice)) {
            terminalType = cardInfo.isSecure() ? TerminalType.SPI : TerminalType.I2C;
        } else {
            terminalType = TerminalType.PERIPHERAL;
        }
        return gfs.a().b(cardInfo.mCardDevice, terminalType);
    }

    public void updateExtraInfo(Context context, CardInfo cardInfo, Bundle bundle) {
        IssueCardListResponse.IssuedCardExtraData issuedCardExtraData;
        IssueCardListResponse.IssuedCardExtraData issuedCardExtraData2;
        if (cardInfo == null || context == null || !cardInfo.mHasIssue || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (bundle == null || !bundle.getBoolean(Constants.EXTRA_IS_SKIP_QUERY_CARD_FACE, false)) {
            cardInfo.updateBackground(applicationContext);
        }
        CardConfigManager.CardConfig cardConfigByType = CardConfigManager.getInstance().getCardConfigByType(cardInfo.mCardType);
        if (cardConfigByType == null || !cardConfigByType.isNeedExtraInfo()) {
            return;
        }
        String str = String.format(PrefUtils.PREF_KEY_CARD_EXTRA, cardInfo.mCardType);
        String string = PrefUtils.getString(applicationContext, str, null);
        if (TextUtils.isEmpty(string)) {
            try {
                dfs dfsVar = new dfs(cardInfo, getTerminal(cardInfo).getCPLC());
                CardExtraInfo cardExtraInfo = (CardExtraInfo) HttpClient.getInstance(applicationContext).execute(dfsVar).getResult();
                if (dfsVar.isSuccess()) {
                    string = cardExtraInfo.toString();
                    PrefUtils.putString(applicationContext, str, string);
                }
            } catch (IOException e) {
                LogUtils.e("updateExtraInfo failed", e);
            } catch (InterruptedException e2) {
                LogUtils.e("updateExtraInfo failed", e2);
                Thread.currentThread().interrupt();
            }
        }
        String str2 = String.format(PrefUtils.PREF_KEY_ISSUED_CARD_EXTRA_DATA, cardInfo.mCardType);
        String string2 = PrefUtils.getString(applicationContext, str2, null);
        boolean z = bundle != null && bundle.getBoolean(Constants.EXTRA_UPDATE_ISSUED_CARD_EXTRA_DATA, false);
        if (TextUtils.isEmpty(string2) || z) {
            try {
                zgt zgtVar = new zgt(cardInfo);
                IssueCardListResponse issueCardListResponse = (IssueCardListResponse) HttpClient.getInstance(applicationContext).execute(zgtVar).getResult();
                if (zgtVar.isSuccess()) {
                    List<IssueCardListResponse.IssuedCardExtraData> data = issueCardListResponse.getData();
                    if (issueCardListResponse.isSuccess() && !ObjectUtils.isCollectionEmpty(data) && (issuedCardExtraData = data.get(0)) != null) {
                        string2 = new Gson().toJson(issuedCardExtraData);
                        PrefUtils.putString(applicationContext, str2, string2);
                    }
                }
            } catch (IOException e3) {
                LogUtils.e("query issues card list failed", e3);
            }
        }
        CardExtraInfo cardExtraInfo2 = TextUtils.isEmpty(string) ? null : (CardExtraInfo) new Gson().fromJson(string, CardExtraInfo.class);
        if (cardExtraInfo2 == null) {
            return;
        }
        if (!TextUtils.isEmpty(cardExtraInfo2.getCardNumber())) {
            cardInfo.mCardNo = cardExtraInfo2.getCardNumber();
        }
        if (!TextUtils.isEmpty(cardExtraInfo2.getRealCardNumber())) {
            cardInfo.mRealCardNo = cardExtraInfo2.getRealCardNumber();
        }
        if (TextUtils.isEmpty(string2) || (issuedCardExtraData2 = (IssueCardListResponse.IssuedCardExtraData) new Gson().fromJson(string2, IssueCardListResponse.IssuedCardExtraData.class)) == null) {
            return;
        }
        PayableCardInfo payableCardInfo = (PayableCardInfo) cardInfo;
        payableCardInfo.setPanCode(issuedCardExtraData2.getPanCode());
        payableCardInfo.setUwbProperties(issuedCardExtraData2.getUwbProperties());
    }
}
