package com.huami.watch.companion.xiaomiai.alexa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.avs.log.LogHelper;
import com.amazon.alexa.avs.message.Message;
import com.amazon.alexa.avs.message.response.Directive;
import com.google.gson.GsonBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huami.identity.auth.alexa.AlexaAuthKtxKt;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.huami.watch.companion.common.Actions;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.companion.xiaomiai.AudioBufferManager;
import com.huami.watch.companion.xiaomiai.AudioSaveUtils;
import com.huami.watch.companion.xiaomiai.FileTransfer;
import com.huami.watch.companion.xiaomiai.VoiceProtocol;
import com.huami.watch.opus.OpusCodecEncoder;
import com.huami.watch.util.Log;
import com.huami.watch.voice.model.ProContentData;
import com.huami.watch.voice.model.ProVoiceData;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.tekartik.sqflite.Constant;
import java.io.File;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import kotlin.Lazy;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes16.dex */
public class AlexaVoiceDataProcessor implements VoiceDataCallback<byte[]>, MediaCompleteListener {
    private static final boolean DEBUG = true;
    public static final int FRAME_SIZE = 160;
    private static final String OPUS_TAG = "opus-tag";
    public static final String TAG = "AlexaVoiceDataProcessor";
    private AlexaEngineProcessor mAlexaEngineProcessor;
    private AlexaReceiver mAlexaReceiver;
    private Context mContext;
    private SimpleDateFormat mFormat;
    private final LargeDataSender mLargeDataSender;
    private LocalBroadcastManager mLocalManager;
    private AccountLogoutReceiver mReceiver;
    private FileTransfer mTransfer;
    private TransThreadManager transThreadManager;
    private String mSaveFileName = "voice-recorder.pcm";
    private boolean mHasStart = false;
    private Lazy<AuthApi> authApiLazy = KoinJavaComponent.inject(AuthApi.class);

    public class AccountLogoutReceiver extends BroadcastReceiver {
        public AccountLogoutReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            Log.e(AlexaVoiceDataProcessor.TAG, "AccountLogoutReceiver : " + intent.getAction(), new Object[0]);
            if (Actions.ACTION_LOGOUT_SUCCESS.equals(intent.getAction())) {
                AlexaAuthKtxKt.signOutSync((AuthApi) AlexaVoiceDataProcessor.this.authApiLazy.getValue());
                if (AlexaVoiceDataProcessor.this.mAlexaEngineProcessor != null) {
                    AlexaVoiceDataProcessor.this.mAlexaEngineProcessor.logout();
                    return;
                }
                return;
            }
            if (ConstantsKt.LOGOUT_ACTION.equals(intent.getAction())) {
                if (AlexaVoiceDataProcessor.this.mAlexaEngineProcessor != null) {
                    AlexaVoiceDataProcessor.this.mAlexaEngineProcessor.logout();
                }
            } else {
                if (!Actions.ACTION_LOGIN_SUCCESS.equals(intent.getAction()) || AlexaVoiceDataProcessor.this.mAlexaEngineProcessor == null) {
                    return;
                }
                AlexaVoiceDataProcessor.this.mAlexaEngineProcessor.changeEndPoint();
            }
        }
    }

    public class AlexaReceiver extends BroadcastReceiver {
        public AlexaReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            Log.e(AlexaVoiceDataProcessor.TAG, "AlexaReceiver" + intent.getAction(), new Object[0]);
            if (!"android.intent.action.LOCALE_CHANGED".equals(intent.getAction()) || AlexaVoiceDataProcessor.this.mAlexaEngineProcessor == null) {
                return;
            }
            AlexaVoiceDataProcessor.this.mAlexaEngineProcessor.changeLanguageLocal();
        }
    }

    public AlexaVoiceDataProcessor(Context context, FileTransfer fileTransfer) {
        this.mContext = context;
        LargeDataSender largeDataSender = new LargeDataSender(this);
        this.mLargeDataSender = largeDataSender;
        largeDataSender.start();
        this.transThreadManager = new TransThreadManager(this);
        this.mAlexaReceiver = new AlexaReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        context.registerReceiver(this.mAlexaReceiver, intentFilter);
        this.mReceiver = new AccountLogoutReceiver();
        this.mLocalManager = LocalBroadcastManager.getInstance(this.mContext);
        IntentFilter intentFilter2 = new IntentFilter(Actions.ACTION_LOGOUT_SUCCESS);
        intentFilter2.addAction(ConstantsKt.LOGOUT_ACTION);
        intentFilter2.addAction(Actions.ACTION_LOGIN_SUCCESS);
        this.mLocalManager.registerReceiver(this.mReceiver, intentFilter2);
        this.mFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        this.mTransfer = fileTransfer;
    }

    private void doEndTag() {
        this.mAlexaEngineProcessor.doStopSpeech();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void handleAlexaVoiceData(byte[] bArr) throws Throwable {
        try {
            ProContentData.ContentData from = ProContentData.ContentData.parseFrom(bArr);
            String parser = from.getParser();
            LogHelper.d(TAG, "parser: " + parser);
            byte b = -1;
            switch (parser.hashCode()) {
                case -1895953862:
                    if (parser.equals("clear_download")) {
                        b = 5;
                    }
                    break;
                case 98618:
                    if (parser.equals(Constant.h)) {
                        b = 0;
                    }
                    break;
                case 96891546:
                    if (parser.equals("event")) {
                        b = 2;
                    }
                    break;
                case 112386354:
                    if (parser.equals("voice")) {
                        b = 1;
                    }
                    break;
                case 1393830065:
                    if (parser.equals("pause_download")) {
                        b = 4;
                    }
                    break;
                case 1427818632:
                    if (parser.equals(WatchFaceApi.SORT_DOWNLOAD)) {
                        b = 3;
                    }
                    break;
            }
            if (b == 0) {
                processAlexaJsonContent(new String(from.getContent().toByteArray()));
                return;
            }
            if (b == 1) {
                byte[] byteArray = ProVoiceData.VoiceData.parseFrom(from.getContent()).getVoiceData().toByteArray();
                if (Config.isDebug()) {
                    AudioSaveUtils.writeWaveDataToFile(AudioSaveUtils.getFilename(this.mSaveFileName), byteArray, 0, byteArray.length);
                }
                this.mAlexaEngineProcessor.writeData(byteArray);
                return;
            }
            if (b == 2) {
                String str = new String(from.getContent().toByteArray());
                LogHelper.e(TAG, "event : " + str);
                this.mAlexaEngineProcessor.sendEvent(str);
                return;
            }
            if (b != 3) {
                if (b == 4) {
                    LogHelper.d(TAG, "pause download");
                    this.transThreadManager.stopSend(new String(from.getContent().toByteArray()));
                    return;
                }
                if (b != 5) {
                    return;
                }
                String str2 = new String(from.getContent().toByteArray());
                Log.d(TAG, "clear download:" + str2, new Object[0]);
                if (TextUtils.equals("all", str2)) {
                    this.transThreadManager.clearAll();
                    return;
                } else {
                    this.transThreadManager.clearSend(str2);
                    return;
                }
            }
            String str3 = new String(from.getContent().toByteArray());
            LogHelper.d(TAG, "add new task");
            LargeDataSender.TaskInfo taskInfo = new LargeDataSender.TaskInfo();
            taskInfo.url = str3;
            this.mLargeDataSender.submitDownloadTask(taskInfo);
            Log.d(TAG, "receive download fileUrl :" + str3, new Object[0]);
            Log.d(TAG, "download current thread : " + Thread.currentThread().getName(), new Object[0]);
            if (str3.endsWith("resource.mp3")) {
                this.transThreadManager.sendData(this.mTransfer, str3, false);
            } else {
                this.transThreadManager.sendData(this.mTransfer, str3, true);
            }
        } catch (InvalidProtocolBufferException e) {
            LogHelper.e(TAG, "", e);
        }
    }

    private void processAlexaJsonContent(String str) {
        try {
            LogHelper.d(TAG, "jsonString: " + str);
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(VoiceProtocol.CMD);
            if (VoiceProtocol.START.equals(string)) {
                if (this.mHasStart) {
                    LogHelper.d(TAG, "has stated ,so wo need do something");
                    doEndTag();
                }
                String string2 = jSONObject.getString("recognize_request");
                this.mHasStart = true;
                AudioSaveUtils.deleteFile(this.mSaveFileName);
                LogHelper.d(TAG, "delete file result : " + new File(AudioSaveUtils.getFilename(this.mSaveFileName)).delete());
                this.mAlexaEngineProcessor.doListeningSpeech(string2);
                return;
            }
            if (VoiceProtocol.END.equals(string)) {
                this.mHasStart = false;
                doEndTag();
                return;
            }
            LogHelper.d(TAG, "not equals cmd " + string + "  start cmd : " + VoiceProtocol.START + "  end cmd : " + VoiceProtocol.END);
        } catch (JSONException e) {
            LogHelper.e(TAG, "", e);
        }
    }

    public void destoryOpusEncoder(OpusCodecEncoder opusCodecEncoder) {
        if (opusCodecEncoder != null) {
            opusCodecEncoder.destroyOpusEncoder();
        }
    }

    public OpusCodecEncoder getOpusEncoder(int i, int i2) {
        OpusCodecEncoder opusCodecEncoder = new OpusCodecEncoder();
        opusCodecEncoder.createOpusEncoder(i, i2, OpusCodecEncoder.OPUS_APPLICATION.OPUS_APPLICATION_AUDIO);
        return opusCodecEncoder;
    }

    @Override // com.huami.watch.companion.xiaomiai.alexa.MediaCompleteListener
    public void onMediaComplete(BaseDownloadTask baseDownloadTask, Directive directive, String str) {
    }

    @Override // com.huami.watch.companion.xiaomiai.alexa.MediaCompleteListener
    public void onMediaError(BaseDownloadTask baseDownloadTask, Directive directive, String str) {
    }

    @Override // com.huami.watch.companion.xiaomiai.alexa.MediaCompleteListener
    public void onMediaStart(BaseDownloadTask baseDownloadTask, Directive directive, String str, int i) {
    }

    public void opusCode(OpusCodecEncoder opusCodecEncoder, byte[] bArr, AudioBufferManager audioBufferManager, int i) {
        int inputByteBufferSize = opusCodecEncoder.getInputByteBufferSize(opusCodecEncoder.getSampling(), OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, opusCodecEncoder.getChannelCount());
        int i2 = 0;
        while (true) {
            int i3 = i2 + inputByteBufferSize;
            try {
                if (i3 > bArr.length) {
                    return;
                }
                byte[] bArr2 = new byte[inputByteBufferSize];
                System.arraycopy(bArr, i2, bArr2, 0, inputByteBufferSize);
                byte[] bArrOpusEncode = opusCodecEncoder.opusEncode(bArr2, OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, 1500);
                if (bArrOpusEncode == null) {
                    LogHelper.d(OPUS_TAG, "  encodeData is null");
                } else {
                    audioBufferManager.addBuffer(bArrOpusEncode, bArrOpusEncode.length);
                }
                i2 = i3;
            } catch (Exception e) {
                Log.e(TAG, e.getMessage(), new Object[0]);
                return;
            }
        }
    }

    public byte[] protobufferVoice(String str, String str2, byte[] bArr) {
        ProVoiceData.VoiceData.Builder builderNewBuilder = ProVoiceData.VoiceData.newBuilder();
        builderNewBuilder.setContentId(str2);
        builderNewBuilder.setVoiceData(ByteString.copyFrom(bArr, 0, bArr.length));
        ProContentData.ContentData.Builder builderNewBuilder2 = ProContentData.ContentData.newBuilder();
        builderNewBuilder2.setParser(str);
        builderNewBuilder2.setVersion(1);
        builderNewBuilder2.setContent(builderNewBuilder.build().toByteString());
        return builderNewBuilder2.build().toByteArray();
    }

    public void sendData(byte[] bArr) {
        this.mTransfer.sendCmd(bArr);
    }

    public void sendProtolBuffer(String str, String str2) {
        ProContentData.ContentData.Builder builderNewBuilder = ProContentData.ContentData.newBuilder();
        builderNewBuilder.setVersion(1);
        builderNewBuilder.setContent(ByteString.copyFrom(str2.getBytes()));
        builderNewBuilder.setParser(str);
        this.mTransfer.sendCmd(builderNewBuilder.build().toByteArray());
    }

    public <T> T string2Object(String str, Class<T> cls) {
        return (T) new GsonBuilder().registerTypeAdapter(cls, new Message.MessageJsonDeserializer()).create().fromJson(str, (Type) cls);
    }

    @Override // com.huami.watch.companion.xiaomiai.alexa.VoiceDataCallback
    public void onDataArrived(byte[] bArr) throws Throwable {
        if (!DeviceUtil.isSupportAlexa(this.mContext)) {
            Log.d(TAG, "rom not support alexa", new Object[0]);
            return;
        }
        if (this.mAlexaEngineProcessor == null) {
            this.mAlexaEngineProcessor = new AlexaEngineProcessor(this.mContext, this);
        }
        handleAlexaVoiceData(bArr);
    }

    public byte[] protobufferVoice(String str, String str2, byte[] bArr, int i, int i2) {
        ProVoiceData.VoiceData.Builder builderNewBuilder = ProVoiceData.VoiceData.newBuilder();
        builderNewBuilder.setContentId(str2);
        builderNewBuilder.setVoiceData(ByteString.copyFrom(bArr, i, i2));
        ProContentData.ContentData.Builder builderNewBuilder2 = ProContentData.ContentData.newBuilder();
        builderNewBuilder2.setParser(str);
        builderNewBuilder2.setVersion(1);
        builderNewBuilder2.setContent(builderNewBuilder.build().toByteString());
        return builderNewBuilder2.build().toByteArray();
    }
}
