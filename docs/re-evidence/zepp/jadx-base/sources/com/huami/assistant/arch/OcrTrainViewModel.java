package com.huami.assistant.arch;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.OcrRequestParams;
import com.baidu.ocr.sdk.model.OcrResponseResult;
import com.google.gson.Gson;
import com.huami.assistant.ocr.model.train.OcrData;
import com.huami.assistant.ocr.model.train.TrainKeys;
import com.huami.assistant.ocr.model.train.TrainResult;
import com.huami.assistant.ocr.model.train.WordItem;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class OcrTrainViewModel extends AndroidViewModel {
    private static final String a = "Assistant-OCR-TRAIN";
    private static final String b = "[\\u4e00-\\u9fa5]";
    public final MutableLiveData<Calendar> dateData;
    public final MutableLiveData<String> destStationData;
    public final MutableLiveData<Result<Boolean>> ocrStatus;
    public final MutableLiveData<String> pathData;
    public final MutableLiveData<Integer> reminderData;
    public final MutableLiveData<String> startStationData;
    public final MutableLiveData<String> trainNumData;

    public class a implements OnResultListener<OcrResponseResult> {
        public a() {
        }

        @Override // com.baidu.ocr.sdk.OnResultListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(OcrResponseResult ocrResponseResult) {
            OcrData ocrData;
            Log.d(OcrTrainViewModel.a, "火车票识别结果" + ocrResponseResult.getJsonRes(), new Object[0]);
            TrainResult trainResult = (TrainResult) new Gson().fromJson(ocrResponseResult.getJsonRes(), TrainResult.class);
            if (trainResult == null || trainResult.error_code != 0 || (ocrData = trainResult.data) == null || !ocrData.isStructured || ArraysUtil.isEmpty(ocrData.ret)) {
                OcrTrainViewModel.this.ocrStatus.postValue(Result.error());
                return;
            }
            Iterator<WordItem> it2 = trainResult.data.ret.iterator();
            while (it2.hasNext()) {
                OcrTrainViewModel.this.c(it2.next());
            }
            OcrTrainViewModel.this.ocrStatus.postValue(Result.success(Boolean.TRUE));
        }

        @Override // com.baidu.ocr.sdk.OnResultListener
        public void onError(OCRError ocrError) {
            Log.w(OcrTrainViewModel.a, "识别火车票失败", ocrError, new Object[0]);
            OcrTrainViewModel.this.ocrStatus.postValue(Result.error());
        }
    }

    public OcrTrainViewModel(@NonNull Application application) {
        super(application);
        this.pathData = new MutableLiveData<>();
        this.ocrStatus = new MutableLiveData<>();
        this.trainNumData = new MutableLiveData<>();
        this.startStationData = new MutableLiveData<>();
        this.destStationData = new MutableLiveData<>();
        this.dateData = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.reminderData = mutableLiveData;
        mutableLiveData.postValue(0);
    }

    private void b(@NonNull String path) {
        OcrRequestParams ocrRequestParams = new OcrRequestParams();
        ocrRequestParams.setImageFile(new File(path));
        ocrRequestParams.putParam("templateSign", "");
        ocrRequestParams.putParam("classifierId", 1L);
        this.ocrStatus.postValue(Result.loading());
        OCR.getInstance(getApplication()).recognizeCustom(ocrRequestParams, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(WordItem item) {
        if (TrainKeys.STARTING_STATION.equals(item.wordName)) {
            this.startStationData.postValue(item.word);
            return;
        }
        if (TrainKeys.DESTINATION_STATION.equals(item.wordName)) {
            this.destStationData.postValue(item.word);
        } else if (TrainKeys.TRAIN_NUM.equals(item.wordName)) {
            this.trainNumData.postValue(item.word);
        } else if ("date".equals(item.wordName)) {
            e(item.word);
        }
    }

    private void e(String date) {
        String strReplaceAll = date.replaceAll("\\s", "").replaceAll(b, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTimeInMillis(new SimpleDateFormat("yyyy-MM-dd-HH:mm", Locale.getDefault()).parse(strReplaceAll).getTime());
        } catch (Exception e) {
            Log.e(a, "解析发车时间失败", e, new Object[0]);
        }
        this.dateData.postValue(calendar);
    }

    public void setPath(String path) {
        if (TextUtils.isEmpty(path)) {
            return;
        }
        this.pathData.postValue(path);
        b(path);
    }
}
