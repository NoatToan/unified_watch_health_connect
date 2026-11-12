package com.huami.assistant.arch;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.GeneralParams;
import com.baidu.ocr.sdk.model.GeneralResult;
import com.baidu.ocr.sdk.model.WordSimple;
import com.huami.assistant.sms.parse.SmsParseUtil;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class OcrViewModel extends AndroidViewModel {
    private static final String a = "Assistant-OCR";
    private static final String b = "((\\d{4}[-|/|年])?\\d{2}[-|/|月]\\d{2})";
    private static final String c = "(\\d{2}:\\d{2})";
    private static final int d = 8;
    public final MutableLiveData<String> descData;
    public final MutableLiveData<Result<GeneralResult>> ocrResultData;
    public final MutableLiveData<Integer> reminderData;
    public final MutableLiveData<Calendar> timeData;
    public final MutableLiveData<String> titleData;

    public class a implements OnResultListener<GeneralResult> {
        public a() {
        }

        @Override // com.baidu.ocr.sdk.OnResultListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(GeneralResult result) {
            Log.d(OcrViewModel.a, "Ocr success,Result <" + result.getJsonRes() + " >", new Object[0]);
            OcrViewModel.this.ocrResultData.postValue(Result.success(result));
            OcrViewModel.this.g(result);
        }

        @Override // com.baidu.ocr.sdk.OnResultListener
        public void onError(OCRError error) {
            Log.e(OcrViewModel.a, error.getMessage(), error, new Object[0]);
            OcrViewModel.this.ocrResultData.postValue(Result.error(null, error.getErrorCode(), error.getMessage()));
        }
    }

    public OcrViewModel(@NonNull Application application) {
        super(application);
        MutableLiveData<Result<GeneralResult>> mutableLiveData = new MutableLiveData<>();
        this.ocrResultData = mutableLiveData;
        this.timeData = new MutableLiveData<>();
        this.titleData = new MutableLiveData<>();
        this.descData = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.reminderData = mutableLiveData2;
        mutableLiveData.setValue(Result.loading());
        mutableLiveData2.setValue(0);
    }

    private void b(String dateText, String timeText) {
        Calendar calendar = Calendar.getInstance();
        try {
            if (TextUtils.isEmpty(dateText)) {
                dateText = TimeUtil.formatDate(System.currentTimeMillis());
            }
            if (dateText.length() < 8) {
                dateText = TimeUtil.formatDateTime(System.currentTimeMillis(), "yyyy") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + dateText;
            }
            if (TextUtils.isEmpty(timeText)) {
                timeText = TimeUtil.formatDateTime(System.currentTimeMillis(), "HH:mm");
            }
            calendar.setTimeInMillis(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).parse(dateText + " " + timeText).getTime());
        } catch (Exception e) {
            Log.e(a, "Genereate time by date<" + dateText + "> time<" + timeText + "> error", e, new Object[0]);
        }
        this.timeData.postValue(calendar);
    }

    private String c(String text) {
        String strMatch = SmsParseUtil.match(text, b);
        return TextUtils.isEmpty(strMatch) ? "" : strMatch.replaceAll("\\D+", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    private String e(String text) {
        String strMatch = SmsParseUtil.match(text, c);
        return TextUtils.isEmpty(strMatch) ? "" : strMatch;
    }

    private boolean f(String text) {
        if (!TextUtils.isEmpty(this.titleData.getValue())) {
            return false;
        }
        this.titleData.setValue(text);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(@NonNull GeneralResult result) {
        ArrayList arrayList = new ArrayList();
        String strC = "";
        String strE = "";
        for (WordSimple wordSimple : result.getWordList()) {
            if (!TextUtils.isEmpty(wordSimple.getWords())) {
                boolean zF = f(wordSimple.getWords());
                if (TextUtils.isEmpty(strC)) {
                    strC = c(wordSimple.getWords());
                    zF = zF || !TextUtils.isEmpty(strC);
                }
                if (TextUtils.isEmpty(strE)) {
                    strE = e(wordSimple.getWords());
                    zF = zF || !TextUtils.isEmpty(strE);
                }
                if (!zF) {
                    arrayList.add(wordSimple.getWords());
                }
            }
        }
        b(strC, strE);
        this.descData.postValue(TextUtils.join("\n", arrayList));
    }

    public void setFilePath(String path) {
        if (TextUtils.isEmpty(path)) {
            return;
        }
        this.ocrResultData.setValue(Result.loading());
        GeneralParams generalParams = new GeneralParams();
        generalParams.setDetectDirection(true);
        generalParams.setVertexesLocation(true);
        generalParams.setRecognizeGranularity(GeneralParams.GRANULARITY_SMALL);
        generalParams.setImageFile(new File(path));
        OCR.getInstance(getApplication()).recognizeAccurateBasic(generalParams, new a());
    }
}
