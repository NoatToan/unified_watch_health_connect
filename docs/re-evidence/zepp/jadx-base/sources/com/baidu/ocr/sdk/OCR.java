package com.baidu.ocr.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.exception.SDKError;
import com.baidu.ocr.sdk.jni.JniInterface;
import com.baidu.ocr.sdk.model.AccessToken;
import com.baidu.ocr.sdk.model.BankCardParams;
import com.baidu.ocr.sdk.model.BankCardResult;
import com.baidu.ocr.sdk.model.GeneralBasicParams;
import com.baidu.ocr.sdk.model.GeneralParams;
import com.baidu.ocr.sdk.model.GeneralResult;
import com.baidu.ocr.sdk.model.IDCardParams;
import com.baidu.ocr.sdk.model.IDCardResult;
import com.baidu.ocr.sdk.model.OcrRequestParams;
import com.baidu.ocr.sdk.model.OcrResponseResult;
import com.baidu.ocr.sdk.utils.AccessTokenParser;
import com.baidu.ocr.sdk.utils.BankCardResultParser;
import com.baidu.ocr.sdk.utils.CrashReporterHandler;
import com.baidu.ocr.sdk.utils.DeviceUtil;
import com.baidu.ocr.sdk.utils.GeneralResultParser;
import com.baidu.ocr.sdk.utils.GeneralSimpleResultParser;
import com.baidu.ocr.sdk.utils.HttpUtil;
import com.baidu.ocr.sdk.utils.IDCardResultParser;
import com.baidu.ocr.sdk.utils.ImageUtil;
import com.baidu.ocr.sdk.utils.OcrResultParser;
import com.baidu.ocr.sdk.utils.Util;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class OCR {
    private static final int AUTHWITH_AKSK = 2;
    private static final int AUTHWITH_LICENSE = 1;
    private static final int AUTHWITH_NOTYET = 0;
    private static final int AUTHWITH_TOKEN = 3;
    private static final String BANK_CARD_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/bankcard?";
    private static final String ID_CARD_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard?";
    private static final int IMAGE_MAX_HEIGHT = 1280;
    private static final int IMAGE_MAX_WIDTH = 1280;
    public static final String OCR_SDK_VERSION = "1_4_4";
    private static final String PREFRENCE_AUTH_TYPE = "token_auth_type";
    private static final String PREFRENCE_EXPIRETIME_KEY = "token_expire_time";
    private static final String PREFRENCE_FILE_KEY = "com.baidu.ocr.sdk";
    private static final String PREFRENCE_TOKENJSON_KEY = "token_json";
    private static final String QUERY_TOKEN = "https://verify.baidubce.com/verify/1.0/token/sk?sdkVersion=1_4_4";
    private static final String QUERY_TOKEN_BIN = "https://verify.baidubce.com/verify/1.0/token/bin?sdkVersion=1_4_4";
    private static final String RECOGNIZE_ACCURATE_BASIC_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/accurate_basic?";
    private static final String RECOGNIZE_ACCURATE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/accurate?";
    private static final String RECOGNIZE_BUSINESS_CARD_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/business_card?";
    private static final String RECOGNIZE_BUSINESS_LICENSE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/business_license?";
    private static final String RECOGNIZE_CUSTOM = "https://aip.baidubce.com/rest/2.0/solution/v1/iocr/recognise?";
    private static final String RECOGNIZE_DRIVING_LICENSE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/driving_license?";
    private static final String RECOGNIZE_GENERAL_BASIC_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic?";
    private static final String RECOGNIZE_GENERAL_ENHANCE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/general_enhanced?";
    private static final String RECOGNIZE_GENERAL_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/general?";
    private static final String RECOGNIZE_GENERAL_WEBIMAGE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/webimage?";
    private static final String RECOGNIZE_HANDWRITING_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/handwriting?";
    private static final String RECOGNIZE_LICENSE_PLATE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/license_plate?";
    private static final String RECOGNIZE_LOTTERY_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/lottery?";
    private static final String RECOGNIZE_NUMBERS_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/numbers?";
    private static final String RECOGNIZE_PASSPORT_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/passport?";
    private static final String RECOGNIZE_QRCODE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/qrcode?";
    private static final String RECOGNIZE_RECEIPT_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/receipt?";
    private static final String RECOGNIZE_VAT_INVOICE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/vat_invoice?";
    private static final String RECOGNIZE_VEHICLE_LICENSE_URL = "https://aip.baidubce.com/rest/2.0/ocr/v1/vehicle_license?";
    private static volatile OCR instance;

    @SuppressLint({"StaticFieldLeak"})
    private Context context;
    private CrashReporterHandler crInst;
    private AccessToken accessToken = null;
    private int authStatus = 0;
    private String ak = null;
    private String sk = null;
    private boolean isAutoCacheToken = false;
    private String license = null;

    private OCR(Context context) {
        if (context != null) {
            this.context = context;
        }
    }

    private AccessToken getByCache() {
        if (!this.isAutoCacheToken) {
            return null;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("com.baidu.ocr.sdk", 0);
        String string = sharedPreferences.getString(PREFRENCE_TOKENJSON_KEY, "");
        int i = sharedPreferences.getInt(PREFRENCE_AUTH_TYPE, 0);
        if (i != this.authStatus) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.commit();
            return null;
        }
        try {
            AccessToken accessToken = new AccessTokenParser().parse(string);
            accessToken.setExpireTime(sharedPreferences.getLong(PREFRENCE_EXPIRETIME_KEY, 0L));
            this.authStatus = i;
            return accessToken;
        } catch (SDKError unused) {
            return null;
        }
    }

    public static OCR getInstance(Context context) {
        if (instance == null) {
            synchronized (OCR.class) {
                if (instance == null) {
                    instance = new OCR(context);
                }
            }
        }
        return instance;
    }

    private void getToken(final OnResultListener onResultListener) {
        if (!isTokenInvalid()) {
            onResultListener.onResult(this.accessToken);
            return;
        }
        if (this.authStatus == 2) {
            initAccessTokenWithAkSk(new OnResultListener<AccessToken>() { // from class: com.baidu.ocr.sdk.OCR.6
                @Override // com.baidu.ocr.sdk.OnResultListener
                public void onError(OCRError oCRError) {
                    onResultListener.onError(oCRError);
                }

                @Override // com.baidu.ocr.sdk.OnResultListener
                public void onResult(AccessToken accessToken) {
                    OCR.this.setAccessToken(accessToken);
                    onResultListener.onResult(accessToken);
                }
            }, this.context, this.ak, this.sk);
        }
        if (this.authStatus == 1) {
            initAccessToken(new OnResultListener<AccessToken>() { // from class: com.baidu.ocr.sdk.OCR.7
                @Override // com.baidu.ocr.sdk.OnResultListener
                public void onError(OCRError oCRError) {
                    onResultListener.onError(oCRError);
                }

                @Override // com.baidu.ocr.sdk.OnResultListener
                public void onResult(AccessToken accessToken) {
                    OCR.this.setAccessToken(accessToken);
                    onResultListener.onResult(accessToken);
                }
            }, this.context);
        }
    }

    private void initAccessTokenImpl(OnResultListener<AccessToken> onResultListener, String str, Context context) {
        this.authStatus = 1;
        init(context);
        Throwable loadLibraryError = JniInterface.getLoadLibraryError();
        if (loadLibraryError != null) {
            onResultListener.onError(new SDKError(SDKError.ErrorCode.LOAD_JNI_LIBRARY_ERROR, "Load jni so library error", loadLibraryError));
            return;
        }
        JniInterface jniInterface = new JniInterface();
        try {
            String strEncodeToString = Base64.encodeToString(str == null ? jniInterface.initWithBin(context, DeviceUtil.getDeviceInfo(context)) : jniInterface.initWithBinLic(context, DeviceUtil.getDeviceInfo(context), str), 2);
            AccessToken byCache = getByCache();
            if (byCache == null) {
                HttpUtil.getInstance().getAccessToken(onResultListener, QUERY_TOKEN_BIN, strEncodeToString);
            } else {
                this.accessToken = byCache;
                onResultListener.onResult(byCache);
            }
        } catch (OCRError e) {
            onResultListener.onError(e);
        }
    }

    private synchronized boolean isTokenInvalid() {
        AccessToken accessToken;
        accessToken = this.accessToken;
        return accessToken == null || accessToken.hasExpired();
    }

    private void recognizeLocation(final GeneralParams generalParams, final OnResultListener<GeneralResult> onResultListener, final String str) {
        File imageFile = generalParams.getImageFile();
        final File file = new File(this.context.getCacheDir(), String.valueOf(System.currentTimeMillis()));
        ImageUtil.resize(imageFile.getAbsolutePath(), file.getAbsolutePath(), 1280, 1280);
        generalParams.setImageFile(file);
        final GeneralResultParser generalResultParser = new GeneralResultParser();
        getToken(new OnResultListener() { // from class: com.baidu.ocr.sdk.OCR.1
            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onError(OCRError oCRError) {
                onResultListener.onError(oCRError);
            }

            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onResult(Object obj) {
                HttpUtil.getInstance().post(OCR.this.urlAppendCommonParams(str), generalParams, generalResultParser, new OnResultListener<GeneralResult>() { // from class: com.baidu.ocr.sdk.OCR.1.1
                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onError(OCRError oCRError) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onError(oCRError);
                        }
                    }

                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onResult(GeneralResult generalResult) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onResult(generalResult);
                        }
                    }
                });
            }
        });
    }

    private void recognizeNoLocation(final GeneralBasicParams generalBasicParams, final OnResultListener<GeneralResult> onResultListener, final String str) {
        File imageFile = generalBasicParams.getImageFile();
        final File file = new File(this.context.getCacheDir(), String.valueOf(System.currentTimeMillis()));
        ImageUtil.resize(imageFile.getAbsolutePath(), file.getAbsolutePath(), 1280, 1280);
        generalBasicParams.setImageFile(file);
        final GeneralSimpleResultParser generalSimpleResultParser = new GeneralSimpleResultParser();
        getToken(new OnResultListener() { // from class: com.baidu.ocr.sdk.OCR.2
            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onError(OCRError oCRError) {
                onResultListener.onError(oCRError);
            }

            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onResult(Object obj) {
                HttpUtil.getInstance().post(OCR.this.urlAppendCommonParams(str), generalBasicParams, generalSimpleResultParser, new OnResultListener<GeneralResult>() { // from class: com.baidu.ocr.sdk.OCR.2.1
                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onError(OCRError oCRError) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onError(oCRError);
                        }
                    }

                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onResult(GeneralResult generalResult) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onResult(generalResult);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String urlAppendCommonParams(String str) {
        return str + "access_token=" + getAccessToken().getAccessToken() + "&aipSdk=Android&aipSdkVersion=" + OCR_SDK_VERSION + "&aipDevid=" + DeviceUtil.getDeviceId(this.context);
    }

    public synchronized AccessToken getAccessToken() {
        return this.accessToken;
    }

    public String getLicense() {
        String str;
        JniInterface jniInterface = new JniInterface();
        int i = this.authStatus;
        if (i == 1) {
            return jniInterface.getToken(this.context);
        }
        if (i == 2 && (str = this.license) != null) {
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                return jniInterface.getTokenFromLicense(this.context, bArrDecode, bArrDecode.length);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void init(Context context) {
        this.context = context;
        this.crInst = CrashReporterHandler.init(context).addSourceClass(OCR.class);
        try {
            this.crInst.addSourceClass(Class.forName("com.baidu.ocr.ui.camera.CameraActivity"));
        } catch (Throwable unused) {
        }
        HttpUtil.getInstance().init();
    }

    public void initAccessToken(OnResultListener<AccessToken> onResultListener, Context context) {
        initAccessTokenImpl(onResultListener, null, context);
    }

    public void initAccessTokenWithAkSk(OnResultListener<AccessToken> onResultListener, Context context, String str, String str2) {
        this.authStatus = 2;
        this.ak = str;
        this.sk = str2;
        init(context);
        AccessToken byCache = getByCache();
        if (byCache != null) {
            this.accessToken = byCache;
            onResultListener.onResult(byCache);
            setLicense(byCache.getLic());
            return;
        }
        Throwable loadLibraryError = JniInterface.getLoadLibraryError();
        if (loadLibraryError != null) {
            onResultListener.onError(new SDKError(SDKError.ErrorCode.LOAD_JNI_LIBRARY_ERROR, "Load jni so library error", loadLibraryError));
            return;
        }
        JniInterface jniInterface = new JniInterface();
        HttpUtil.getInstance().getAccessToken(onResultListener, QUERY_TOKEN, str + ";" + Util.md5(str2) + Base64.encodeToString(jniInterface.init(context, DeviceUtil.getDeviceInfo(context)), 2));
    }

    @Deprecated
    public void initWithToken(Context context, AccessToken accessToken) {
        init(context);
        setAccessToken(accessToken);
    }

    public boolean isAutoCacheToken() {
        return this.isAutoCacheToken;
    }

    public void recognizeAccurate(GeneralParams generalParams, OnResultListener<GeneralResult> onResultListener) {
        recognizeLocation(generalParams, onResultListener, RECOGNIZE_ACCURATE_URL);
    }

    public void recognizeAccurateBasic(GeneralBasicParams generalBasicParams, OnResultListener<GeneralResult> onResultListener) {
        recognizeNoLocation(generalBasicParams, onResultListener, RECOGNIZE_ACCURATE_BASIC_URL);
    }

    public void recognizeBankCard(final BankCardParams bankCardParams, final OnResultListener<BankCardResult> onResultListener) {
        File imageFile = bankCardParams.getImageFile();
        final File file = new File(this.context.getCacheDir(), String.valueOf(System.currentTimeMillis()));
        ImageUtil.resize(imageFile.getAbsolutePath(), file.getAbsolutePath(), 1280, 1280);
        bankCardParams.setImageFile(file);
        final BankCardResultParser bankCardResultParser = new BankCardResultParser();
        getToken(new OnResultListener() { // from class: com.baidu.ocr.sdk.OCR.4
            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onError(OCRError oCRError) {
                onResultListener.onError(oCRError);
            }

            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onResult(Object obj) {
                HttpUtil.getInstance().post(OCR.this.urlAppendCommonParams(OCR.BANK_CARD_URL), bankCardParams, bankCardResultParser, new OnResultListener<BankCardResult>() { // from class: com.baidu.ocr.sdk.OCR.4.1
                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onError(OCRError oCRError) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onError(oCRError);
                        }
                    }

                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onResult(BankCardResult bankCardResult) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onResult(bankCardResult);
                        }
                    }
                });
            }
        });
    }

    public void recognizeBusinessCard(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_BUSINESS_CARD_URL);
    }

    public void recognizeBusinessLicense(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_BUSINESS_LICENSE_URL);
    }

    public void recognizeCommon(final OcrRequestParams ocrRequestParams, final OnResultListener<OcrResponseResult> onResultListener, final String str) {
        File imageFile = ocrRequestParams.getImageFile();
        final File file = new File(this.context.getCacheDir(), String.valueOf(System.currentTimeMillis()));
        ImageUtil.resize(imageFile.getAbsolutePath(), file.getAbsolutePath(), 1280, 1280);
        ocrRequestParams.setImageFile(file);
        final OcrResultParser ocrResultParser = new OcrResultParser();
        getToken(new OnResultListener() { // from class: com.baidu.ocr.sdk.OCR.5
            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onError(OCRError oCRError) {
                onResultListener.onError(oCRError);
            }

            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onResult(Object obj) {
                HttpUtil.getInstance().post(OCR.this.urlAppendCommonParams(str), ocrRequestParams, ocrResultParser, new OnResultListener<OcrResponseResult>() { // from class: com.baidu.ocr.sdk.OCR.5.1
                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onError(OCRError oCRError) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onError(oCRError);
                        }
                    }

                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onResult(OcrResponseResult ocrResponseResult) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onResult(ocrResponseResult);
                        }
                    }
                });
            }
        });
    }

    public void recognizeCustom(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_CUSTOM);
    }

    public void recognizeDrivingLicense(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_DRIVING_LICENSE_URL);
    }

    public void recognizeGeneral(GeneralParams generalParams, OnResultListener<GeneralResult> onResultListener) {
        recognizeLocation(generalParams, onResultListener, RECOGNIZE_GENERAL_URL);
    }

    public void recognizeGeneralBasic(GeneralBasicParams generalBasicParams, OnResultListener<GeneralResult> onResultListener) {
        recognizeNoLocation(generalBasicParams, onResultListener, RECOGNIZE_GENERAL_BASIC_URL);
    }

    public void recognizeGeneralEnhanced(GeneralBasicParams generalBasicParams, OnResultListener<GeneralResult> onResultListener) {
        recognizeNoLocation(generalBasicParams, onResultListener, RECOGNIZE_GENERAL_ENHANCE_URL);
    }

    public void recognizeHandwriting(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_HANDWRITING_URL);
    }

    public void recognizeIDCard(final IDCardParams iDCardParams, final OnResultListener<IDCardResult> onResultListener) {
        File imageFile = iDCardParams.getImageFile();
        final File file = new File(this.context.getCacheDir(), String.valueOf(System.currentTimeMillis()));
        ImageUtil.resize(imageFile.getAbsolutePath(), file.getAbsolutePath(), 1280, 1280, iDCardParams.getImageQuality());
        iDCardParams.setImageFile(file);
        final IDCardResultParser iDCardResultParser = new IDCardResultParser(iDCardParams.getIdCardSide());
        getToken(new OnResultListener() { // from class: com.baidu.ocr.sdk.OCR.3
            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onError(OCRError oCRError) {
                onResultListener.onError(oCRError);
            }

            @Override // com.baidu.ocr.sdk.OnResultListener
            public void onResult(Object obj) {
                HttpUtil.getInstance().post(OCR.this.urlAppendCommonParams(OCR.ID_CARD_URL), iDCardParams, iDCardResultParser, new OnResultListener<IDCardResult>() { // from class: com.baidu.ocr.sdk.OCR.3.1
                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onError(OCRError oCRError) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onError(oCRError);
                        }
                    }

                    @Override // com.baidu.ocr.sdk.OnResultListener
                    public void onResult(IDCardResult iDCardResult) {
                        file.delete();
                        OnResultListener onResultListener2 = onResultListener;
                        if (onResultListener2 != null) {
                            onResultListener2.onResult(iDCardResult);
                        }
                    }
                });
            }
        });
    }

    public void recognizeLicensePlate(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_LICENSE_PLATE_URL);
    }

    public void recognizeLottery(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_LOTTERY_URL);
    }

    public void recognizeNumbers(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_NUMBERS_URL);
    }

    public void recognizePassport(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_PASSPORT_URL);
    }

    public void recognizeQrcode(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_QRCODE_URL);
    }

    public void recognizeReceipt(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_RECEIPT_URL);
    }

    public void recognizeVatInvoice(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_VAT_INVOICE_URL);
    }

    public void recognizeVehicleLicense(OcrRequestParams ocrRequestParams, OnResultListener<OcrResponseResult> onResultListener) {
        recognizeCommon(ocrRequestParams, onResultListener, RECOGNIZE_VEHICLE_LICENSE_URL);
    }

    public void recognizeWebimage(GeneralBasicParams generalBasicParams, OnResultListener<GeneralResult> onResultListener) {
        recognizeNoLocation(generalBasicParams, onResultListener, RECOGNIZE_GENERAL_WEBIMAGE_URL);
    }

    public void release() {
        HttpUtil.getInstance().release();
        this.crInst.release();
        this.crInst = null;
        this.context = null;
        if (instance != null) {
            instance = null;
        }
    }

    public synchronized void setAccessToken(AccessToken accessToken) {
        if (accessToken.getTokenJson() != null) {
            SharedPreferences.Editor editorEdit = this.context.getSharedPreferences("com.baidu.ocr.sdk", 0).edit();
            editorEdit.putString(PREFRENCE_TOKENJSON_KEY, accessToken.getTokenJson());
            editorEdit.putLong(PREFRENCE_EXPIRETIME_KEY, accessToken.getExpiresTime());
            editorEdit.putInt(PREFRENCE_AUTH_TYPE, this.authStatus);
            editorEdit.apply();
        }
        this.accessToken = accessToken;
    }

    public void setAutoCacheToken(boolean z) {
        this.isAutoCacheToken = z;
    }

    public void setLicense(String str) {
        this.license = str;
    }

    public void initAccessToken(OnResultListener<AccessToken> onResultListener, String str, Context context) {
        initAccessTokenImpl(onResultListener, str, context);
    }
}
