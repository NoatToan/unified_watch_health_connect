package com.ximalaya.ting.android.opensdk.httputil;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.gson.reflect.TypeToken;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.SercretPubKey;
import com.ximalaya.ting.android.opensdk.model.track.BatchTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackBaseInfo;
import com.ximalaya.ting.android.opensdk.util.AESUtil;
import com.ximalaya.ting.android.opensdk.util.DHUtil;
import com.ximalaya.ting.android.opensdk.util.SharedPreferencesUtil;
import com.ximalaya.ting.android.opensdk.util.dh.DhKeyPair;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class XmSecretKeyUtil {
    public static final String CLIENT_TXT = "client.txt";
    private static final String FALL_BACK_PUBLIC_KEY = "E0kmVeFAbSqiuv2ZSi0AKw==";
    private static final String SECRET_EXPIRED_TIME = "secret_expired_time";
    private static final String SECRET_PUBLIC_KEY = "secret_public_key";
    private static final String SECRET_REQUEST_TIME = "secret_request_time";
    private static XmSecretKeyUtil singleton;
    private boolean isInited = false;
    private Context mContext;
    private String pubKey;

    private static byte[] decodeBase64(String str) {
        try {
            return Base64.decode(str, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static XmSecretKeyUtil getInstance() {
        if (singleton == null) {
            synchronized (XmSecretKeyUtil.class) {
                if (singleton == null) {
                    singleton = new XmSecretKeyUtil();
                }
            }
        }
        return singleton;
    }

    private static String shortenSecretKey(String str, int i) {
        if (str.length() < i) {
            StringBuilder sb = new StringBuilder(str);
            while (sb.length() < i) {
                sb.append("0");
            }
            str = sb.toString();
        }
        return str.substring(0, i);
    }

    private void update() {
        DhKeyPair dhKeyPairInitPartyAKey = DHUtil.initPartyAKey();
        if (dhKeyPairInitPartyAKey != null) {
            HashMap map = new HashMap();
            map.put(DTransferConstants.PUB_KEY, dhKeyPairInitPartyAKey.getPublicKey().toString());
            CommonRequest.updateSecret(map, new IDataCallBack<SercretPubKey>() { // from class: com.ximalaya.ting.android.opensdk.httputil.XmSecretKeyUtil.1
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                    XmSecretKeyUtil.this.reset();
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(@Nullable SercretPubKey sercretPubKey) {
                    XmSecretKeyUtil.this.updateShareData(sercretPubKey);
                }
            });
        }
    }

    public boolean checkAuthorized() {
        long j = SharedPreferencesUtil.getInstance(this.mContext).getLong(SECRET_REQUEST_TIME, 0L);
        int i = SharedPreferencesUtil.getInstance(this.mContext).getInt(SECRET_EXPIRED_TIME, 0);
        if (!TextUtils.isEmpty(this.pubKey) && (System.currentTimeMillis() - j) / 1000 <= i) {
            return true;
        }
        reset();
        return false;
    }

    @WorkerThread
    public void conversionModel(TrackBaseInfo trackBaseInfo, boolean z) {
        byte[] bArrDecode;
        int i;
        int i2;
        Track track;
        if (trackBaseInfo == null) {
            return;
        }
        if (z) {
            bArrDecode = Base64.decode(FALL_BACK_PUBLIC_KEY, 0);
        } else if (!checkAuthorized()) {
            return;
        } else {
            bArrDecode = shortenSecretKey(DHUtil.getSecret(this.pubKey, DHUtil.initPartyAKey()), 16).getBytes();
        }
        if (bArrDecode != null) {
            try {
                if (TextUtils.isEmpty(trackBaseInfo.getDownloadUrl())) {
                    i = 0;
                    i2 = 0;
                } else {
                    trackBaseInfo.setDownloadUrl(AESUtil.decryptAsString(decodeBase64(trackBaseInfo.getDownloadUrl()), bArrDecode));
                    if (trackBaseInfo.getDownloadUrl() == null || !trackBaseInfo.getDownloadUrl().startsWith("http")) {
                        i = 1;
                        i2 = 0;
                    } else {
                        i = 0;
                        i2 = 1;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (!TextUtils.isEmpty(trackBaseInfo.getPlayUrl24M4a())) {
                    trackBaseInfo.setPlayUrl24M4a(AESUtil.decryptAsString(decodeBase64(trackBaseInfo.getPlayUrl24M4a()), bArrDecode));
                    if (trackBaseInfo.getPlayUrl24M4a() == null || !trackBaseInfo.getPlayUrl24M4a().startsWith("http")) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                i++;
            }
            try {
                if (!TextUtils.isEmpty(trackBaseInfo.getPlayUrl64M4a())) {
                    trackBaseInfo.setPlayUrl64M4a(AESUtil.decryptAsString(decodeBase64(trackBaseInfo.getPlayUrl64M4a()), bArrDecode));
                    if (trackBaseInfo.getPlayUrl64M4a() == null || !trackBaseInfo.getPlayUrl64M4a().startsWith("http")) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
                i++;
            }
            try {
                if (!TextUtils.isEmpty(trackBaseInfo.getPlayUrlAmr())) {
                    trackBaseInfo.setPlayUrlAmr(AESUtil.decryptAsString(decodeBase64(trackBaseInfo.getPlayUrlAmr()), bArrDecode));
                    if (trackBaseInfo.getPlayUrlAmr() == null || !trackBaseInfo.getPlayUrlAmr().startsWith("http")) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
                i++;
            }
            try {
                if (!TextUtils.isEmpty(trackBaseInfo.getPlayUrl32())) {
                    trackBaseInfo.setPlayUrl32(AESUtil.decryptAsString(decodeBase64(trackBaseInfo.getPlayUrl32()), bArrDecode));
                    if (trackBaseInfo.getPlayUrl32() == null || !trackBaseInfo.getPlayUrl32().startsWith("http")) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable th5) {
                th5.printStackTrace();
                i++;
            }
            try {
                if (!TextUtils.isEmpty(trackBaseInfo.getPlayUrl64())) {
                    trackBaseInfo.setPlayUrl64(AESUtil.decryptAsString(decodeBase64(trackBaseInfo.getPlayUrl64()), bArrDecode));
                    if (trackBaseInfo.getPlayUrl64() == null || !trackBaseInfo.getPlayUrl64().startsWith("http")) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable th6) {
                th6.printStackTrace();
                i++;
            }
            if (i > 0 && i2 == 0) {
                HashMap map = new HashMap();
                map.put("ids", trackBaseInfo.getId() + "");
                map.put("xm_flag_is_old", "true");
                try {
                    BatchTrackList batchTrackList = (BatchTrackList) CommonRequest.baseGetReqeustSync(DTransferConstants.BATCH_TRACKLIST_URL, map, new BaseRequest.IRequestCallBack<BatchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.httputil.XmSecretKeyUtil.2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.IRequestCallBack
                        public BatchTrackList success(String str) throws Exception {
                            return (BatchTrackList) BaseResponse.getResponseBodyStringToObject(new TypeToken<BatchTrackList>() { // from class: com.ximalaya.ting.android.opensdk.httputil.XmSecretKeyUtil.2.1
                            }.getType(), str);
                        }
                    });
                    if (batchTrackList == null || batchTrackList.getTracks() == null || (track = batchTrackList.getTracks().get(0)) == null) {
                        return;
                    }
                    trackBaseInfo.setDownloadUrl(track.getDownloadUrl());
                    trackBaseInfo.setCanDownload(track.isCanDownload());
                    trackBaseInfo.setPlayUrl24M4a(track.getPlayUrl24M4a());
                    trackBaseInfo.setPlayUrl64M4a(track.getPlayUrl64M4a());
                    trackBaseInfo.setPlayUrl64(track.getPlayUrl64());
                    trackBaseInfo.setPlayUrl32(track.getPlayUrl32());
                    trackBaseInfo.setPlayUrlAmr(track.getPlayUrlAmr());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void init(Context context) {
        if (this.isInited) {
            return;
        }
        this.isInited = true;
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.pubKey = SharedPreferencesUtil.getInstance(applicationContext).getString(SECRET_PUBLIC_KEY);
    }

    public void reset() {
        DHUtil.resetClientKeyPair();
        this.pubKey = null;
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(SECRET_REQUEST_TIME);
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(SECRET_EXPIRED_TIME);
        SharedPreferencesUtil.getInstance(this.mContext).removeByKey(SECRET_PUBLIC_KEY);
        DHUtil.deleteSaveFile(this.mContext);
    }

    public void updateShareData(SercretPubKey sercretPubKey) {
        if (sercretPubKey == null) {
            reset();
            return;
        }
        this.pubKey = sercretPubKey.getPubKey();
        SharedPreferencesUtil.getInstance(this.mContext).saveString(SECRET_PUBLIC_KEY, this.pubKey);
        SharedPreferencesUtil.getInstance(this.mContext).saveLong(SECRET_REQUEST_TIME, System.currentTimeMillis());
        SharedPreferencesUtil.getInstance(this.mContext).saveInt(SECRET_EXPIRED_TIME, sercretPubKey.getExpiredTime());
    }

    @WorkerThread
    public SercretPubKey updateSync() {
        DhKeyPair dhKeyPairInitPartyAKey = DHUtil.initPartyAKey();
        if (dhKeyPairInitPartyAKey == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(DTransferConstants.PUB_KEY, dhKeyPairInitPartyAKey.getPublicKey().toString());
        SercretPubKey sercretPubKeyUpdateSecretSync = CommonRequest.updateSecretSync(map);
        updateShareData(sercretPubKeyUpdateSecretSync);
        return sercretPubKeyUpdateSecretSync;
    }
}
