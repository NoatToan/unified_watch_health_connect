package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.handler.SmartCardReader;
import com.tsmclient.smartcard.terminal.IScTerminal;

/* JADX INFO: loaded from: classes6.dex */
public class g<T extends f, C extends CardInfo> implements com.miui.tsmclient.model.j<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f10380a = (T) b();

    @Override // com.miui.tsmclient.model.j
    public BaseResponse a(Context context, C c) {
        return this.f10380a.backup(context, c);
    }

    public T b() {
        return (T) new f();
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse c(Context context, C c, Bundle bundle) {
        String str = c.mCardType;
        Bundle bundle2 = new Bundle();
        CardConfigManager.getInstance().parseCardRulesToBundle(str, bundle2);
        Bundle card = SmartCardReader.readCard(c.getTerminal(), str, context, bundle2);
        if (card == null) {
            return new BaseResponse(-2, c);
        }
        LogUtils.i("queryCardInfo:" + str + ", " + card);
        if (!card.getBoolean("success")) {
            return new BaseResponse(card.getInt("error") == 2 ? 2003 : -2, c);
        }
        c.mCardNo = card.getString(CardConstants.KEY_ACCOUNT_NUM);
        c.mRealCardNo = card.getString(CardConstants.KEY_ACCOUNT_REAL_NUM);
        c.mIsReadSECorrectly = true;
        c.mCardBalance = card.getInt(CardConstants.E_BALANCE);
        c.mTradeLogs = card.getParcelableArrayList(CardConstants.TRADE_LOG);
        c.mStartDate = card.getString(CardConstants.VALID_START);
        c.mEndDate = card.getString(CardConstants.VALID_END);
        c.mAreaCode = card.getString(CardConstants.AREA_CODE);
        c.mStatus = CardInfo.Status.ACTIVE;
        if (card.getInt(CardConstants.STATUS_NEGATIVE) != 0) {
            c.mStatus = CardInfo.Status.NEGATIVE;
        }
        if (card.getInt(CardConstants.STATUS_CARD_EXCEPTION) != 0) {
            c.mStatus = CardInfo.Status.INVALID;
        }
        if (card.getInt(CardConstants.STATUS_IN_BLACK_LIST) == 1) {
            c.mStatus = CardInfo.Status.IN_BLACKLIST;
        }
        int i = card.getInt(CardConstants.OVER_DRAWN);
        CardConfigManager.CardConfig cardConfigByType = CardConfigManager.getInstance().getCardConfigByType(str);
        if (i < 0 || (cardConfigByType != null && cardConfigByType.isJudgeOverdrawIllegal() && i > 0 && c.mCardBalance + i > 0)) {
            c.mStatus = CardInfo.Status.DATA_ILLEGAL;
        }
        boolean z = card.getBoolean(CardConstants.STATUS_VALID_START_DATE, true);
        boolean z2 = card.getBoolean(CardConstants.STATUS_VALID_END_DATE, true);
        if (!z) {
            c.mStatus = CardInfo.Status.START_DATE_INVALID;
        }
        if (!z2) {
            c.mStatus = CardInfo.Status.END_DATE_INVALID;
        }
        if (card.getInt(CardConstants.STATUS_LOCKED) == 1) {
            c.mStatus = CardInfo.Status.LOCKED;
        }
        c.updateExtraInfo(context, bundle);
        return new BaseResponse(0, c);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse d(Context context, C c, Bundle bundle) {
        return this.f10380a.preTransferOut(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse e(Context context, C c, Bundle bundle) {
        return this.f10380a.fixApdu(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse f(Context context, C c, Bundle bundle) {
        return this.f10380a.preReturnCard(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse g(Context context, C c, Bundle bundle) {
        return this.f10380a.returnCard(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse h(Context context, C c, Bundle bundle) {
        return this.f10380a.isServiceAvailable(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse i(Context context, C c, Bundle bundle) {
        return new BaseResponse();
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse j(Context context, C c, Bundle bundle) {
        return this.f10380a.executeCommands(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse k(Context context, C c, Bundle bundle) {
        return c(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse l(Context context, C c, Bundle bundle) {
        return this.f10380a.issue(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse m(Context context, C c, Bundle bundle) {
        BaseResponse baseResponseTransferOut = this.f10380a.transferOut(context, c, bundle);
        return baseResponseTransferOut.isSuccess() ? this.f10380a.uploadTransferOutResult(context, c, bundle) : baseResponseTransferOut;
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse a(Context context, IScTerminal iScTerminal, Bundle bundle) {
        return this.f10380a.rawMode(context, iScTerminal, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse b(Context context, C c, Bundle bundle) {
        return this.f10380a.delete(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse c(Context context, C c) {
        return c(context, c, null);
    }

    @Override // com.miui.tsmclient.a
    public void a() {
        this.f10380a.shutDown();
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse b(Context context, C c) {
        return k(context, c, null);
    }

    @Override // com.miui.tsmclient.model.j
    public BaseResponse a(Context context, C c, Bundle bundle) {
        return this.f10380a.transferIn(context, c, bundle);
    }
}
