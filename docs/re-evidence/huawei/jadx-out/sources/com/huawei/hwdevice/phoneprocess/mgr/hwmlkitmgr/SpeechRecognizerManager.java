package com.huawei.hwdevice.phoneprocess.mgr.hwmlkitmgr;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.mlsdk.asr.MLAsrRecognizer;
import com.huawei.hms.mlsdk.asr.MLAsrWriteAudioListener;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class SpeechRecognizerManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private onResultsReady f17498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f17499c;
    protected MLAsrRecognizer d;
    protected Intent e;
    private ArrayList<String> h = new ArrayList<>();

    public interface onResultsReady {
        void onError(int i);

        void onResults(ArrayList<String> arrayList);

        void onStartListening();
    }

    public SpeechRecognizerManager(onResultsReady onresultsready, String str) {
        this.f17497a = "zh-CN";
        LogUtil.a("MLASR_Manager", "init language: ", str);
        this.f17498b = onresultsready;
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("_")) {
                LogUtil.a("MLASR_Manager", "init language contains underline.");
                this.f17497a = str.replace("_", Constants.LINK);
            } else {
                this.f17497a = str;
            }
        }
        ThreadPoolManager.c().a("MLASR_Manager", new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwmlkitmgr.SpeechRecognizerManager.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("MLASR_Manager", "init languageMlKit: ", SpeechRecognizerManager.this.f17497a);
                SpeechRecognizerManager.this.d = MLAsrRecognizer.createAsrRecognizer(MLApplication.getInstance().getAppContext());
                SpeechRecognizerManager.this.d.setAsrWriteAudioListener(SpeechRecognizerManager.this.new a());
                SpeechRecognizerManager.this.e = new Intent(MLAsrConstants.ACTION_HMS_ASR_SPEECH);
                SpeechRecognizerManager.this.e.putExtra("vadStartMuteDuration", 6000);
                SpeechRecognizerManager.this.e.putExtra("vadEndMuteDuration", 10000);
                SpeechRecognizerManager.this.e.putExtra("LANGUAGE", SpeechRecognizerManager.this.f17497a).putExtra("FEATURE", 11).putExtra("PUNCTUATION_ENABLE", true);
                if (SpeechRecognizerManager.this.f17499c) {
                    return;
                }
                SpeechRecognizerManager.this.f17499c = true;
                LogUtil.a("MLASR_Manager", "startListening()");
                SpeechRecognizerManager.this.d.startWriteAudio(SpeechRecognizerManager.this.e);
            }
        });
    }

    public void c(byte[] bArr, boolean z) {
        MLAsrRecognizer mLAsrRecognizer = this.d;
        if (mLAsrRecognizer != null) {
            mLAsrRecognizer.receiveVoiceStream(bArr, z);
        }
    }

    public void a() {
        LogUtil.a("MLASR_Manager", "onDestroy");
        MLAsrRecognizer mLAsrRecognizer = this.d;
        if (mLAsrRecognizer != null) {
            mLAsrRecognizer.destroy();
            this.d = null;
        }
    }

    protected class a implements MLAsrWriteAudioListener {
        protected a() {
        }

        @Override // com.huawei.hms.mlsdk.asr.MLAsrWriteAudioListener
        public void onStartListening() {
            LogUtil.a("MLASR_Manager", "onStartListening");
            if (SpeechRecognizerManager.this.f17498b != null) {
                SpeechRecognizerManager.this.f17498b.onStartListening();
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.MLAsrWriteAudioListener
        public void onResults(Bundle bundle) {
            if (bundle == null || SpeechRecognizerManager.this.f17498b == null) {
                return;
            }
            SpeechRecognizerManager.this.h.clear();
            SpeechRecognizerManager.this.h.add(bundle.getString(MLAsrRecognizer.RESULTS_RECOGNIZED));
            SpeechRecognizerManager.this.f17498b.onResults(SpeechRecognizerManager.this.h);
            LogUtil.a("MLASR_Manager", " MLAsrWriteAudioListener onResults is ", bundle);
        }

        @Override // com.huawei.hms.mlsdk.asr.MLAsrWriteAudioListener
        public void onError(int i, String str) {
            SpeechRecognizerManager.this.f17499c = false;
            LogUtil.a("MLASR_Manager", "onError error: ", Integer.valueOf(i), " errorMessage: ", str);
            if (SpeechRecognizerManager.this.f17498b != null) {
                SpeechRecognizerManager.this.f17498b.onError(i);
            }
        }
    }
}
