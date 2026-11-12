package com.miui.tsmclient.sesdk;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.account.IMiOAuth;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.internal.okhttp.InternalIOException;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.UncompletedBusiness;
import com.miui.tsmclient.model.BaseModel;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.BaseTransitCardModel;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.request.BulletinListSyncRequest;
import com.miui.tsmclient.util.CardEnvironmentConfig;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.IDeviceInfo;
import com.miui.tsmclient.util.ILogger;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ReflectUtil;
import com.miui.tsmclient.util.TSMLocationService;
import com.tsmclient.smartcard.terminal.external.IApduExecutor;
import com.tsmclient.smartcard.terminal.external.IChannel;
import defpackage.c4s;
import defpackage.jus;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import r.a;

/* JADX INFO: loaded from: classes6.dex */
public class MiPayService implements ICardList {
    private static final String GLOBAL_SDK_SERVICE = "com.miui.tsmclient.sesdk.globalsdkcard.GlobalService";
    private static final String MIPAY_CONFIG = "com.miui.tsmclient.sesdk.globalsdkcard.common.GlobalMiPayConfig";
    private static final String PARAM_COUNTRY = "sCountry";
    private static final String PARAM_PUSH_TARGET_ID = "sPushTargetID";
    private static final String TSM_SDK_SERVICE = "com.miui.tsmclient.sesdk.tsmsdkcard.TSMSDKService";
    private static final String UP_SDK_SERVICE = "com.miui.tsmclient.sesdk.upsdkcard.UPSDKService";

    public static void initialize(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            EnvironmentConfig.initialize(context);
        } else {
            EnvironmentConfig.initialize(context, str);
        }
    }

    public static void setApduExecutor(IApduExecutor iApduExecutor) {
        c4s.b(iApduExecutor);
    }

    public static void setChannel(IChannel iChannel) {
        c4s.c(iChannel);
    }

    public static void setCustomApduChannel(IChannel iChannel) {
        c4s.f(iChannel);
    }

    public static void setDeviceInfo(IDeviceInfo iDeviceInfo) {
        CardEnvironmentConfig.setDeviceInfo(iDeviceInfo);
    }

    public static void setLogger(ILogger iLogger) {
        LogUtils.setLogger(iLogger);
        c4s.d(new com.tsmclient.smartcard.util.ILogger() { // from class: com.miui.tsmclient.sesdk.MiPayService.1
            @Override // com.tsmclient.smartcard.util.ILogger
            public void d(String str, String str2) {
                LogUtils.d(str + ":" + str2);
            }

            @Override // com.tsmclient.smartcard.util.ILogger
            public void e(String str, String str2, Throwable th) {
                LogUtils.e(str + ":" + str2, th);
            }
        });
    }

    public static void setMiOAuth(IMiOAuth iMiOAuth) {
        EnvironmentConfig.setMiOAuth(iMiOAuth);
    }

    public static void setStaging(boolean z) {
        EnvironmentConfig.setStaging(z);
    }

    public static void setStagingIndex(int i) {
        EnvironmentConfig.setStagingIndex(i);
    }

    public BaseResponse clearSE(CardCategory cardCategory) {
        String str;
        try {
            if (cardCategory != CardCategory.MASTER_CARD && cardCategory != CardCategory.VISA_CARD) {
                throw new NotSupportedException();
            }
            return (BaseResponse) ReflectUtil.callObjectMethod(ReflectUtil.newInstance(GLOBAL_SDK_SERVICE, (Class<?>[]) new Class[0], new Object[0]), "clearSE", new Class[0], new Object[0]);
        } catch (IllegalAccessException e) {
            e = e;
            str = "clearSE IllegalAccessException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "clearSE exception", new Object[0]);
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = "clearSE NoSuchMethodException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "clearSE exception", new Object[0]);
        } catch (InvocationTargetException e3) {
            e = e3;
            str = "clearSE InvocationTargetException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "clearSE exception", new Object[0]);
        }
    }

    public SeCard createCard(String str) {
        String str2;
        try {
            return (SeCard) ReflectUtil.callObjectMethod(ReflectUtil.newInstance(GLOBAL_SDK_SERVICE, (Class<?>[]) new Class[0], new Object[0]), "createCard", new Class[]{String.class}, str);
        } catch (IllegalAccessException e) {
            e = e;
            str2 = "createCard IllegalAccessException";
            LogUtils.e(str2, e);
            return null;
        } catch (NoSuchMethodException e2) {
            e = e2;
            str2 = "createCard NoSuchMethodException";
            LogUtils.e(str2, e);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3;
            str2 = "createCard InvocationTargetException";
            LogUtils.e(str2, e);
            return null;
        }
    }

    public BaseResponse getBulletinList(SeCard seCard, String str) {
        CardInfo cardInfo;
        BaseResponse baseResponse = new BaseResponse();
        if (seCard == null) {
            cardInfo = null;
        } else {
            try {
                cardInfo = seCard.mCardInfo;
            } catch (IOException e) {
                baseResponse.mResultCode = 2;
                baseResponse.mMsg = e.getMessage();
                LogUtils.e("io exception occurs when getting bulletin list", e);
            } catch (InterruptedException e2) {
                baseResponse.mResultCode = 11;
                baseResponse.mMsg = e2.getMessage();
                LogUtils.e("interrupted exception occurs when getting bulletin list", e2);
                Thread.currentThread().interrupt();
            }
        }
        BulletinResponseInfo bulletinResponseInfo = (BulletinResponseInfo) HttpClient.getInstance(EnvironmentConfig.getContext()).execute(new BulletinListSyncRequest(str, cardInfo, (cardInfo != null ? cardInfo.getTerminal() : new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal()).getCPLC(), null)).getResult();
        if (bulletinResponseInfo == null) {
            baseResponse.mResultCode = -1;
        } else {
            baseResponse.setResponseFrom(bulletinResponseInfo);
            baseResponse.mDatas = new Object[]{bulletinResponseInfo.getBulletinList()};
        }
        return baseResponse;
    }

    public String getCPLC() {
        String str;
        try {
            return new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC();
        } catch (IOException e) {
            e = e;
            str = "IOException occurs when getting cplc, ";
            LogUtils.e(str, e);
            return null;
        } catch (InterruptedException e2) {
            e = e2;
            Thread.currentThread().interrupt();
            str = "InterruptedException occurs when getting cplc, ";
            LogUtils.e(str, e);
            return null;
        }
    }

    @Override // com.miui.tsmclient.sesdk.ICardList
    public List<SeCard> getIssuedCardList(CardCategory cardCategory) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        ICardList iCardList = (ICardList) ReflectUtil.newInstance(TSM_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList != null) {
            arrayList.addAll(iCardList.getIssuedCardList(cardCategory));
        }
        ICardList iCardList2 = (ICardList) ReflectUtil.newInstance(UP_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList2 != null) {
            arrayList.addAll(iCardList2.getIssuedCardList(cardCategory));
        }
        ICardList iCardList3 = (ICardList) ReflectUtil.newInstance(GLOBAL_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList3 != null) {
            arrayList.addAll(iCardList3.getIssuedCardList(cardCategory));
        }
        return arrayList;
    }

    public String getSEID() {
        String str;
        try {
            return new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getSeid();
        } catch (IOException e) {
            e = e;
            str = "IOException occurs when getting seid, ";
            LogUtils.e(str, e);
            return null;
        } catch (InterruptedException e2) {
            e = e2;
            Thread.currentThread().interrupt();
            str = "InterruptedException occurs when getting seid, ";
            LogUtils.e(str, e);
            return null;
        }
    }

    @Override // com.miui.tsmclient.sesdk.ICardList
    public List<SeCard> getSupportedCardList(CardCategory cardCategory) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        ICardList iCardList = (ICardList) ReflectUtil.newInstance(TSM_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList != null) {
            arrayList.addAll(iCardList.getSupportedCardList(cardCategory));
        }
        ICardList iCardList2 = (ICardList) ReflectUtil.newInstance(UP_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList2 != null) {
            arrayList.addAll(iCardList2.getSupportedCardList(cardCategory));
        }
        ICardList iCardList3 = (ICardList) ReflectUtil.newInstance(GLOBAL_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList3 != null) {
            arrayList.addAll(iCardList3.getSupportedCardList(cardCategory));
        }
        return arrayList;
    }

    @Override // com.miui.tsmclient.sesdk.ICardList
    public List<SeCard> getSupportedCardListWithGroup(CardCategory cardCategory) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        ICardList iCardList = (ICardList) ReflectUtil.newInstance(TSM_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList != null) {
            arrayList.addAll(iCardList.getSupportedCardListWithGroup(cardCategory));
        }
        ICardList iCardList2 = (ICardList) ReflectUtil.newInstance(UP_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList2 != null) {
            arrayList.addAll(iCardList2.getSupportedCardListWithGroup(cardCategory));
        }
        ICardList iCardList3 = (ICardList) ReflectUtil.newInstance(GLOBAL_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList3 != null) {
            arrayList.addAll(iCardList3.getSupportedCardListWithGroup(cardCategory));
        }
        return arrayList;
    }

    public List<SeCard> getTransitCardList(String str, boolean z) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        ICardList iCardList = (ICardList) ReflectUtil.newInstance(TSM_SDK_SERVICE, (Class<?>[]) null, new Object[0]);
        if (iCardList != null) {
            for (SeCard seCard : z ? iCardList.getSupportedCardListWithGroup(CardCategory.TRANSIT) : iCardList.getSupportedCardList(CardCategory.TRANSIT)) {
                if (TextUtils.equals(seCard.getId(), str)) {
                    arrayList.add(seCard);
                }
            }
        }
        return arrayList;
    }

    public BaseResponse getUncompletedOrderList(List<SeCard> list) {
        BaseResponse baseResponse = new BaseResponse();
        try {
            List<UncompletedBusiness> listQueryUncompletedBusiness = ((BaseTransitCardModel) BaseModel.create(EnvironmentConfig.getContext(), BaseTransitCardModel.class)).queryUncompletedBusiness(null);
            ArrayList arrayList = new ArrayList();
            for (UncompletedBusiness uncompletedBusiness : listQueryUncompletedBusiness) {
                for (SeCard seCard : list) {
                    if (seCard.getAid().equals(uncompletedBusiness.getAid())) {
                        arrayList.add(new UncompletedOrderList.UncompletedOrder(uncompletedBusiness, seCard));
                    }
                }
            }
            baseResponse.mDatas = new Object[]{new UncompletedOrderList(arrayList)};
            baseResponse.mResultCode = 0;
            LogUtils.d("getPendingOrderList success");
        } catch (AuthApiException e) {
            LogUtils.e("getPendingOrderList failed", e);
            baseResponse.mResultCode = 7;
            baseResponse.mMsg = e.getMessage();
        }
        return baseResponse;
    }

    public int getVersion() {
        return 5;
    }

    public BaseResponse invoke(String str, String str2) {
        int i;
        String message = "";
        if (str2 == null) {
            str2 = "";
        }
        try {
            return new f().invoke(EnvironmentConfig.getContext(), str, str2);
        } catch (AuthApiException e) {
            LogUtils.e("AuthApiException occurs when invoking task.", e);
            message = e.getMessage();
            i = 7;
            return new BaseResponse(i, message, new Object[0]);
        } catch (InterruptedException e2) {
            LogUtils.e("InterruptedException happens when invoking task.", e2);
            Thread.currentThread().interrupt();
            i = 11;
            return new BaseResponse(i, message, new Object[0]);
        } catch (a e3) {
            LogUtils.e("SeiTSMApiException occurs when invoking task.", e3);
            int iA = e3.a();
            message = e3.getMessage();
            i = iA;
            return new BaseResponse(i, message, new Object[0]);
        }
    }

    public SiteInfo parseSite(String str, String str2) throws AuthApiException {
        Context context = EnvironmentConfig.getContext();
        try {
            jus.a aVar = (jus.a) HttpClient.getInstance(context).execute(new jus(context, str, str2, new CardInfo(CardInfo.CARD_TYPE_DUMMY), TSMLocationService.getInstance(context).getLastLocation(), null)).getResult();
            if (aVar.isSuccess()) {
                return new SiteInfo(aVar.a());
            }
            throw new AuthApiException(aVar.getErrorCode(), aVar.getErrorDesc());
        } catch (InternalIOException e) {
            Thread.currentThread().interrupt();
            throw new AuthApiException(e.getErrorCode(), e.getMessage());
        } catch (IOException unused) {
            Thread.currentThread().interrupt();
            throw new AuthApiException(2, ErrorCode.findText(context, 2));
        }
    }

    public BaseResponse prepare(CardCategory cardCategory) {
        String str;
        try {
            if (cardCategory != CardCategory.MASTER_CARD && cardCategory != CardCategory.VISA_CARD) {
                return new BaseResponse(0, new Object[0]);
            }
            return (BaseResponse) ReflectUtil.callObjectMethod(ReflectUtil.newInstance(GLOBAL_SDK_SERVICE, (Class<?>[]) new Class[0], new Object[0]), "prepare", new Class[0], new Object[0]);
        } catch (IllegalAccessException e) {
            e = e;
            str = "prepare IllegalAccessException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "prepare exception", new Object[0]);
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = "prepare NoSuchMethodException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "prepare exception", new Object[0]);
        } catch (InvocationTargetException e3) {
            e = e3;
            str = "prepare InvocationTargetException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "prepare exception", new Object[0]);
        }
    }

    public void reset() {
        f.initSync();
    }

    public BaseResponse syncSe(CardCategory cardCategory) {
        String str;
        try {
            if (cardCategory != CardCategory.MASTER_CARD && cardCategory != CardCategory.VISA_CARD) {
                return invoke("SYNC", "");
            }
            return (BaseResponse) ReflectUtil.callObjectMethod(ReflectUtil.newInstance(GLOBAL_SDK_SERVICE, (Class<?>[]) new Class[0], new Object[0]), "syncSe", new Class[0], new Object[0]);
        } catch (IllegalAccessException e) {
            e = e;
            str = "syncSe IllegalAccessException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "syncSe exception", new Object[0]);
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = "syncSe NoSuchMethodException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "syncSe exception", new Object[0]);
        } catch (InvocationTargetException e3) {
            e = e3;
            str = "syncSe InvocationTargetException";
            LogUtils.e(str, e);
            return new BaseResponse(-1, "syncSe exception", new Object[0]);
        }
    }

    public static void initialize(Context context, String str, String str2, String str3, String str4) {
        initialize(context, str);
        EnvironmentConfig.setServiceId(str2);
        try {
            Class<?> cls = Class.forName(MIPAY_CONFIG);
            Field field = cls.getField(PARAM_COUNTRY);
            field.set(field, str4);
            Field field2 = cls.getField(PARAM_PUSH_TARGET_ID);
            field2.set(field2, str3);
        } catch (Exception e) {
            LogUtils.e("initialize exception", e);
        }
    }
}
