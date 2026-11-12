package com.miui.tsmclient.sesdk;

import android.os.Looper;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.Response;
import com.miui.tsmclient.entity.DoorCardArtsListInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import defpackage.bxs;
import defpackage.kxs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class KeyCardArt {
    private SeCard mSeCard;

    public static class Art {
        private DoorCardArtsListInfo.ArtInfo mArtInfo;

        private Art(DoorCardArtsListInfo.ArtInfo artInfo) {
            this.mArtInfo = artInfo;
        }

        public String getUrl() {
            return this.mArtInfo.getImageUrl();
        }

        public boolean isValid() {
            return this.mArtInfo.isValid();
        }
    }

    public static class ArtList {
        private List<Art> mArtInfoList;

        private ArtList(List<Art> list) {
            this.mArtInfoList = list;
        }

        public List<Art> getArtInfoList() {
            return this.mArtInfoList;
        }

        public boolean isEmpty() {
            List<Art> list = this.mArtInfoList;
            if (list == null) {
                return false;
            }
            return list.isEmpty();
        }
    }

    public KeyCardArt(SeCard seCard) {
        this.mSeCard = seCard;
    }

    private void ensureNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to anr");
        }
    }

    public BaseResponse getArtList() {
        ensureNotOnMainThread();
        BaseResponse baseResponse = new BaseResponse();
        try {
            kxs kxsVar = new kxs(((MifareCardInfo) this.mSeCard.mCardInfo).getProductId(), null);
            Response responseExecute = HttpClient.getInstance(EnvironmentConfig.getContext()).execute(kxsVar);
            if (responseExecute.getResult() == null) {
                baseResponse.mResultCode = -1;
                baseResponse.mMsg = "failed to getArtList";
                return baseResponse;
            }
            if (kxsVar.isSuccess()) {
                DoorCardArtsListInfo doorCardArtsListInfo = (DoorCardArtsListInfo) responseExecute.getResult();
                ArrayList arrayList = new ArrayList();
                Iterator<DoorCardArtsListInfo.ArtInfo> it = doorCardArtsListInfo.getArtInfoList().iterator();
                while (it.hasNext()) {
                    arrayList.add(new Art(it.next()));
                }
                ArtList artList = new ArtList(arrayList);
                LogUtils.d("getCardFaceList success");
                baseResponse.mDatas = new Object[]{artList};
                baseResponse.mResultCode = 0;
            }
            return baseResponse;
        } catch (IOException e) {
            LogUtils.e("getCardFaceList AuthApiException: " + e.getMessage());
            baseResponse.mResultCode = -1;
            baseResponse.mMsg = "failed to getArtList";
        }
    }

    public BaseResponse setArt(Art art) {
        String str;
        ensureNotOnMainThread();
        int i = -1;
        try {
            Response responseExecute = HttpClient.getInstance(EnvironmentConfig.getContext()).execute(new bxs((MifareCardInfo) this.mSeCard.mCardInfo, art.mArtInfo));
            if (responseExecute.getResult() == null) {
                str = "";
            } else {
                String errorDesc = ((CommonResponseInfo) responseExecute.getResult()).getErrorDesc();
                if (responseExecute.isSuccess()) {
                    LogUtils.d("updateArt success");
                    this.mSeCard.setCardFace(art.mArtInfo.getImageUrl());
                    i = 0;
                } else {
                    int errorCode = ((CommonResponseInfo) responseExecute.getResult()).getErrorCode();
                    LogUtils.d("updateArt fail");
                    i = errorCode;
                }
                str = errorDesc;
            }
        } catch (IOException e) {
            LogUtils.e("failed to updateArt", e);
            str = "failed to updateArt";
        }
        return new BaseResponse(i, str, new Object[0]);
    }
}
