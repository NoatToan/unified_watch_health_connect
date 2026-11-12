package com.huami.watch.companion.xiaomiai;

import android.content.Context;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.xiaomiai.alexa.AlexaVoiceDataProcessor;
import com.huami.watch.companion.xiaomiai.alexa.resample.ReSample;
import com.ingenic.iwds.datatransactor.FileTransactionModel;

/* JADX INFO: loaded from: classes16.dex */
public class FileTransfer extends FileTransactionModel {
    private static final String TAG = "FileTransfer";
    public static final String transferFilePath = "/sdcard/iwds/";
    private Context context;
    private final boolean isOversea;
    public AlexaVoiceDataProcessor mAlexaProcessor;
    public XiaoAiVoiceDataProcessor mVoiceProcessor;
    private FileTransactionModel.FileTransactionModelCallback modelCallback;

    public FileTransfer(Context context, FileTransactionModel.FileTransactionModelCallback fileTransactionModelCallback, String str) {
        super(context, fileTransactionModelCallback, str);
        this.isOversea = Config.isBuildOversea();
        this.modelCallback = fileTransactionModelCallback;
    }

    public void changeEngineStyle() {
        XiaoAiVoiceDataProcessor xiaoAiVoiceDataProcessor = this.mVoiceProcessor;
        if (xiaoAiVoiceDataProcessor != null) {
            xiaoAiVoiceDataProcessor.changeEngineStyle();
        }
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel, com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onDataArrived(Object obj) throws Throwable {
        if (!this.isOversea) {
            if (this.mVoiceProcessor == null) {
                this.mVoiceProcessor = new XiaoAiVoiceDataProcessor(this.context, this);
            }
            this.mVoiceProcessor.onDataArrived(obj);
        } else {
            if (this.mAlexaProcessor == null) {
                ReSample.loadLibrary();
                this.mAlexaProcessor = new AlexaVoiceDataProcessor(this.context, this);
            }
            if (obj instanceof byte[]) {
                this.mAlexaProcessor.onDataArrived((byte[]) obj);
            }
        }
    }

    public void sendCmd(String str) {
        this.m_transactor.send(str);
    }

    public void sendCmd(byte[] bArr) {
        this.m_transactor.send(bArr);
    }

    public FileTransfer(Context context, FileTransactionModel.FileTransactionModelCallback fileTransactionModelCallback, FileTransactionModel.FileTransactionInterruptCallback fileTransactionInterruptCallback, String str) {
        super(context, fileTransactionModelCallback, fileTransactionInterruptCallback, str);
        this.isOversea = Config.isBuildOversea();
        this.modelCallback = fileTransactionModelCallback;
        this.context = context;
    }
}
