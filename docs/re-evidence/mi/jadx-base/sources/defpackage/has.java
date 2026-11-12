package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.DCEPCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.g;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.handler.SmartCardReader;
import com.tsmclient.smartcard.terminal.APDUConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class has extends g<t3s, DCEPCardInfo> {
    public final BaseResponse n(Context context, DCEPCardInfo dCEPCardInfo) {
        Bundle card = SmartCardReader.readCard(dCEPCardInfo.getTerminal(), dCEPCardInfo.mCardType, context, null);
        if (card == null || !card.getBoolean("success")) {
            return new BaseResponse(-2, dCEPCardInfo);
        }
        dCEPCardInfo.mCardBalance = card.getInt(CardConstants.E_BALANCE);
        return new BaseResponse(0, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BaseResponse c(Context context, DCEPCardInfo dCEPCardInfo, Bundle bundle) {
        BaseResponse baseResponseA = ((t3s) this.f10380a).a(context, dCEPCardInfo);
        if (baseResponseA.isSuccess() && baseResponseA.mDatas != null) {
            ArrayList arrayList = new ArrayList();
            Object obj = baseResponseA.mDatas[0];
            if (obj != null) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        DCEPCardInfo dCEPCardInfo2 = new DCEPCardInfo();
                        dCEPCardInfo2.parse(jSONObject);
                        arrayList.add(dCEPCardInfo2);
                    } catch (JSONException unused) {
                    }
                }
            }
            baseResponseA.mDatas[0] = arrayList;
        }
        return baseResponseA;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, DCEPCardInfo dCEPCardInfo) {
        Object[] objArr;
        BaseResponse baseResponseC = c(context, dCEPCardInfo, null);
        List arrayList = new ArrayList();
        if (baseResponseC.isSuccess() && (objArr = baseResponseC.mDatas) != null && objArr.length > 0) {
            List list = (List) objArr[0];
            for (int i = 0; i < list.size(); i++) {
                DCEPCardInfo dCEPCardInfo2 = (DCEPCardInfo) list.get(i);
                if (dCEPCardInfo2.isSameContextId(dCEPCardInfo.getContextId())) {
                    dCEPCardInfo.updateInfo(dCEPCardInfo2);
                    if (!dCEPCardInfo.isBalanceValid() && !TextUtils.equals(dCEPCardInfo.mAid, APDUConstants.AID_DCEP_ACCOUNT_MODE_STR)) {
                        baseResponseC = n(context, dCEPCardInfo);
                    }
                    return new BaseResponse(baseResponseC.mResultCode, new Object[0]);
                }
                if (TextUtils.isEmpty(dCEPCardInfo.getContextId()) && !TextUtils.equals(dCEPCardInfo2.mAid, APDUConstants.AID_DCEP_ACCOUNT_MODE_STR)) {
                    baseResponseC = n(context, dCEPCardInfo2);
                    if (!baseResponseC.isSuccess()) {
                        break;
                    }
                }
            }
            arrayList = list;
        }
        return new BaseResponse(baseResponseC.mResultCode, arrayList);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public BaseResponse k(Context context, DCEPCardInfo dCEPCardInfo, Bundle bundle) {
        return TextUtils.equals(dCEPCardInfo.mAid, APDUConstants.AID_DCEP_ACCOUNT_MODE_STR) ? new BaseResponse(0, new Object[0]) : n(context, dCEPCardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public t3s b() {
        return new t3s();
    }
}
