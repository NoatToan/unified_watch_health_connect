package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.ApduFixEntity;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import defpackage.fns;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c extends d {
    public static final int c = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10378b;

    public c(f fVar) {
        super(fVar);
    }

    public final BaseResponse a(Context context, CardInfo cardInfo, String str, j jVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(Constants.EXTRA_SKIP_SAVE_APDU_RESPONSE, true);
        bundle.putString("sessionId", str);
        return a(context, cardInfo, jVar, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.d, com.miui.tsmclient.model.mitsm.f
    public BaseResponse executeCommands(Context context, CardInfo cardInfo, Bundle bundle) {
        BaseResponse baseResponseExecuteCommands;
        if (bundle == null) {
            bundle = new Bundle();
        }
        j jVar = j.OUT_EXECUTE;
        bundle.putBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH, true);
        int i = this.f10378b;
        if (i == 0) {
            baseResponseExecuteCommands = super.executeCommands(context, cardInfo, bundle);
        } else {
            if (i == 10) {
                this.f10378b = 0;
            }
            baseResponseExecuteCommands = null;
        }
        if (baseResponseExecuteCommands == null || baseResponseExecuteCommands.isSuccess()) {
            return a(context, cardInfo, jVar, bundle);
        }
        k.a().b(cardInfo, jVar.b());
        return baseResponseExecuteCommands;
    }

    @Override // com.miui.tsmclient.model.mitsm.d, com.miui.tsmclient.model.mitsm.f
    public BaseResponse fixApdu(Context context, CardInfo cardInfo, Bundle bundle) {
        TsmRpcModels.TsmSessionInfo bundleSessionInfo;
        boolean zIsActionResult;
        TsmRpcModels.SeOperationType actionType;
        List<TsmRpcModels.SeAPDUResponseItem> seAPDUResponseItems;
        String scriptsId;
        int result;
        String errorDesc;
        String sessionId;
        ApduFixEntity fromCache = ApduFixEntity.getFromCache(context);
        ApduFixEntity fromBundle = ApduFixEntity.getFromBundle(context, bundle);
        if (fromBundle.isPull()) {
            if (fromCache != null && fromCache.equalsSessionId(fromBundle)) {
                fromCache.deleteFromCache();
            }
            return a(context, cardInfo, fromBundle.getSessionId(), fromBundle.getPullDataOperationType());
        }
        if (fromCache == null || !fromCache.equalsSessionId(fromBundle)) {
            bundleSessionInfo = fromBundle.getBundleSessionInfo();
            zIsActionResult = fromBundle.isActionResult();
            actionType = fromBundle.getActionType();
            seAPDUResponseItems = fromBundle.getSeAPDUResponseItems();
            scriptsId = fromBundle.getScriptsId();
        } else {
            bundleSessionInfo = fromCache.getCacheSessionInfo();
            zIsActionResult = fromCache.isActionResult();
            actionType = fromCache.getActionType();
            seAPDUResponseItems = fromCache.getSeAPDUResponseItems();
            scriptsId = fromCache.getScriptsId();
        }
        TsmRpcModels.SeOperationType seOperationType = actionType;
        try {
            TsmRpcModels.CommonResponse commonResponseProcessFinishNotify = this.mSeiTsmAuthManager.processFinishNotify(context, bundleSessionInfo, zIsActionResult, seOperationType, seAPDUResponseItems, scriptsId);
            if (fromCache != null) {
                fromCache.deleteFromCache();
            }
            if (commonResponseProcessFinishNotify == null) {
                result = -1;
                errorDesc = "";
            } else {
                if (commonResponseProcessFinishNotify.getResult() == 0) {
                    if (TextUtils.isEmpty(fromBundle.getSessionId())) {
                        TsmRpcModels.TsmSessionInfo cacheSessionInfo = fromCache.getCacheSessionInfo();
                        sessionId = cacheSessionInfo != null ? cacheSessionInfo.getSessionId() : null;
                    } else {
                        sessionId = fromBundle.getSessionId();
                    }
                    return a(context, cardInfo, sessionId, j.a(seOperationType.name()));
                }
                result = commonResponseProcessFinishNotify.getResult();
                errorDesc = commonResponseProcessFinishNotify.getErrorDesc();
            }
        } catch (r.a e) {
            int iA = e.a();
            String message = e.getMessage();
            LogUtils.e("fixApdu failed with an tsmapi exception.", e);
            result = iA;
            errorDesc = message;
        }
        return new BaseResponse(result, errorDesc, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.d, com.miui.tsmclient.model.mitsm.f
    public BaseResponse issue(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        BaseResponse baseResponseIssue;
        Bundle bundleA = a(bundle);
        j jVar = bundleA.getBoolean(Constants.EXTRA_OUT_OPERATION) ? j.OUT_ISSUE : j.ISSUE;
        int i = this.f10378b;
        if (i == 0) {
            baseResponseIssue = super.issue(context, cardInfo, bundleA);
        } else {
            if (i == 10) {
                this.f10378b = 0;
            }
            baseResponseIssue = null;
        }
        if (bundleA.getBoolean(Constants.EXTRA_PRE_LOAD) || !(baseResponseIssue == null || baseResponseIssue.mResultCode == 0)) {
            k.a().b(cardInfo, jVar.b());
            return baseResponseIssue;
        }
        BaseResponse baseResponseA = a(context, cardInfo, jVar, bundle);
        if (baseResponseA.isSuccess()) {
            a(context, cardInfo, bundleA);
        }
        return baseResponseA;
    }

    @Override // com.miui.tsmclient.model.mitsm.d, com.miui.tsmclient.model.mitsm.f
    public BaseResponse returnCard(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        BaseResponse baseResponseReturnCard;
        LogUtils.d("AsyncMiTSMClient returnCard called.");
        Bundle bundleA = a(bundle);
        j jVar = j.OUT_RETURN;
        int i = this.f10378b;
        if (i == 0) {
            baseResponseReturnCard = super.returnCard(context, cardInfo, bundleA);
        } else {
            if (i == 10) {
                this.f10378b = 0;
            }
            baseResponseReturnCard = null;
        }
        if (baseResponseReturnCard != null && !baseResponseReturnCard.isSuccess()) {
            k.a().b(cardInfo, jVar.b());
            return baseResponseReturnCard;
        }
        BaseResponse baseResponseA = a(context, cardInfo, jVar, bundle);
        if (baseResponseA.isSuccess()) {
            updateInternal(context, cardInfo);
        }
        return baseResponseA;
    }

    @Override // com.miui.tsmclient.model.mitsm.d, com.miui.tsmclient.model.mitsm.f
    public BaseResponse transferIn(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        BaseResponse baseResponseTransferIn;
        LogUtils.d("AsyncMiTSMClient transferIn called.");
        Bundle bundleA = a(bundle);
        int i = this.f10378b;
        if (i == 0) {
            baseResponseTransferIn = super.transferIn(context, cardInfo, bundleA);
        } else {
            if (i == 10) {
                this.f10378b = 0;
            }
            baseResponseTransferIn = null;
        }
        if (baseResponseTransferIn != null && !baseResponseTransferIn.isSuccess()) {
            k.a().b(cardInfo, k.a.TRANSFER_IN);
            return baseResponseTransferIn;
        }
        BaseResponse baseResponseA = a(context, cardInfo, j.TRANSFER_IN, bundle);
        if (baseResponseA.isSuccess()) {
            a(context, cardInfo, bundleA);
        }
        return baseResponseA;
    }

    @Override // com.miui.tsmclient.model.mitsm.d, com.miui.tsmclient.model.mitsm.f
    public BaseResponse transferOut(Context context, CardInfo cardInfo, Bundle bundle) throws Throwable {
        BaseResponse baseResponseTransferOut;
        LogUtils.d("AsyncMiTSMClient transferOut called.");
        Bundle bundleA = a(bundle);
        int i = this.f10378b;
        if (i == 0) {
            baseResponseTransferOut = super.transferOut(context, cardInfo, bundleA);
        } else {
            if (i == 10) {
                this.f10378b = 0;
            }
            baseResponseTransferOut = null;
        }
        if (baseResponseTransferOut != null && !baseResponseTransferOut.isSuccess()) {
            k.a().b(cardInfo, k.a.TRANSFER_OUT);
            return baseResponseTransferOut;
        }
        BaseResponse baseResponseA = a(context, cardInfo, j.TRANSFER_OUT, bundle);
        if (baseResponseA.isSuccess()) {
            updateInternal(context, cardInfo);
        }
        return baseResponseA;
    }

    public final Bundle a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH, true);
        return bundle;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public com.miui.tsmclient.model.BaseResponse a(android.content.Context r25, com.miui.tsmclient.entity.CardInfo r26, com.miui.tsmclient.model.mitsm.j r27, android.os.Bundle r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.tsmclient.model.mitsm.c.a(android.content.Context, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.model.mitsm.j, android.os.Bundle):com.miui.tsmclient.model.BaseResponse");
    }

    public final void a(Context context, CardInfo cardInfo, Bundle bundle) {
        long j = bundle.getLong(Constants.EXTRA_VERSION_CONTROL_ID, 0L);
        if (TextUtils.isEmpty(fns.d(j))) {
            return;
        }
        fns.c().g(context, cardInfo.mCardType, j);
    }
}
