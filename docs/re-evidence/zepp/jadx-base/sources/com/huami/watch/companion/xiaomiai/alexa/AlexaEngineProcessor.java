package com.huami.watch.companion.xiaomiai.alexa;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.amazon.alexa.avs.AlexaSupportUtils;
import com.amazon.alexa.avs.AudioStateOutputStream;
import com.amazon.alexa.avs.DialogRequestIdAuthority;
import com.amazon.alexa.avs.NewAvsController;
import com.amazon.alexa.avs.http.AVSClientFactory;
import com.amazon.alexa.avs.log.LogHelper;
import com.amazon.alexa.avs.message.request.RequestBody;
import com.amazon.alexa.avs.message.response.Directive;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.protobuf.ByteString;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.util.AlexaUtils;
import com.huami.watch.companion.xiaomiai.AudioBufferManager;
import com.huami.watch.companion.xiaomiai.AudioSaveUtils;
import com.huami.watch.companion.xiaomiai.MemoryUtils;
import com.huami.watch.companion.xiaomiai.PcmDecoder;
import com.huami.watch.companion.xiaomiai.alexa.resample.ReSample;
import com.huami.watch.opus.OpusCodecEncoder;
import com.huami.watch.util.Log;
import com.huami.watch.voice.model.ProContentData;
import com.huami.watch.voice.model.ProVoiceData;
import com.tekartik.sqflite.Constant;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javazoom.jl.decoder.JavaLayerException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AlexaEngineProcessor implements NewAvsController.AlexaListener {
    private static final String OPUS_TAG = "opus-tag";
    public static final String TAG = "AlexaEngineProcessor";
    private NewAvsController avsController;
    private AlexaVoiceDataProcessor dataProcessor;
    private PipedInputStream mAudioInputSteam;
    private Context mContext;
    private AudioStateOutputStream mCurrentAudioStream;
    private String mFileName;
    private ReceiveHandler mReceiveHandler;
    private HandlerThread mReceiverThread;
    private ArrayList<byte[]> result;
    private int mSampleRate = 24000;
    private int mChannels = 1;

    public static class ReceiveHandler extends Handler {
        private AlexaEngineProcessor engineProcessor;
        private PipedInputStream pipedInputStream;

        private ReceiveHandler(AlexaEngineProcessor alexaEngineProcessor, Looper looper) {
            super(looper);
            this.engineProcessor = alexaEngineProcessor;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            LogHelper.d(AlexaEngineProcessor.TAG, "ReceiveHandler handle message : " + message.what);
            if (message.what == 0) {
                LogHelper.d(AlexaEngineProcessor.TAG, "requestBody:" + message.obj + "   " + message.obj);
                synchronized (this) {
                    if (this.pipedInputStream == null || this.engineProcessor.avsController == null) {
                        Log.d(AlexaEngineProcessor.TAG, "pipe input stream is null", new Object[0]);
                    } else {
                        this.engineProcessor.avsController.sendAudioDataRequest((String) message.obj, this.pipedInputStream);
                    }
                }
            }
        }

        public void setCurrentInputStream(PipedInputStream pipedInputStream) {
            synchronized (this) {
                this.pipedInputStream = pipedInputStream;
            }
        }
    }

    public AlexaEngineProcessor(Context context, AlexaVoiceDataProcessor alexaVoiceDataProcessor) {
        this.mContext = context;
        this.dataProcessor = alexaVoiceDataProcessor;
        try {
            NewAvsController newAvsController = new NewAvsController(this.mContext, new AVSClientFactory(AlexaUtils.getLoginCountry(context)), DialogRequestIdAuthority.getInstance());
            this.avsController = newAvsController;
            newAvsController.setAlexaListener(this);
        } catch (Exception e) {
            LogHelper.d(TAG, "", e);
        }
    }

    private byte[] byteCombineAll(ArrayList<byte[]> arrayList) {
        int length = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            length += arrayList.get(i).length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr2 = arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void initReceiverHandler() {
        HandlerThread handlerThread = new HandlerThread("alexa-voice-receive-data");
        this.mReceiverThread = handlerThread;
        handlerThread.start();
        this.mReceiveHandler = new ReceiveHandler(this.mReceiverThread.getLooper());
    }

    private byte[] protobufferVoice(String str, String str2, byte[] bArr) {
        ProVoiceData.VoiceData.Builder builderNewBuilder = ProVoiceData.VoiceData.newBuilder();
        builderNewBuilder.setContentId(str2);
        builderNewBuilder.setVoiceData(ByteString.copyFrom(bArr));
        ProContentData.ContentData.Builder builderNewBuilder2 = ProContentData.ContentData.newBuilder();
        builderNewBuilder2.setParser(str);
        builderNewBuilder2.setVersion(1);
        builderNewBuilder2.setContent(builderNewBuilder.build().toByteString());
        return builderNewBuilder2.build().toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void putToEncodeSize(OpusCodecEncoder opusCodecEncoder, int i, int i2, byte[] bArr, boolean z, String str) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        if (z) {
            LogHelper.d(TAG, " over send pcm data---------------------------");
            byte[] bArrByteCombineAll = byteCombineAll(this.result);
            AudioBufferManager audioBufferManager = new AudioBufferManager();
            this.dataProcessor.opusCode(opusCodecEncoder, bArrByteCombineAll, audioBufferManager, i2);
            this.dataProcessor.sendData(protobufferVoice("voice", str, audioBufferManager.getAudioBuffer()));
            this.result.clear();
            return;
        }
        this.result.add(bArr);
        if (this.result.size() == 10) {
            byte[] bArrByteCombineAll2 = byteCombineAll(this.result);
            AudioBufferManager audioBufferManager2 = new AudioBufferManager();
            this.dataProcessor.opusCode(opusCodecEncoder, bArrByteCombineAll2, audioBufferManager2, i2);
            LogHelper.d(TAG, "not over send pcm data---------------------------");
            this.dataProcessor.sendData(protobufferVoice("voice", str, audioBufferManager2.getAudioBuffer()));
            this.result.clear();
        }
    }

    public <T> T byteArray2Object(byte[] bArr, Class<T> cls) {
        return (T) new GsonBuilder().registerTypeAdapter(cls, new com.amazon.alexa.avs.message.Message.MessageJsonDeserializer()).create().fromJson(new String(bArr), (Type) cls);
    }

    public void changeEndPoint() {
        NewAvsController newAvsController = this.avsController;
        if (newAvsController != null) {
            newAvsController.sendEndPoint(AlexaUtils.getLoginCountry(this.mContext));
        }
    }

    public void changeLanguageLocal() {
        NewAvsController newAvsController = this.avsController;
        if (newAvsController != null) {
            newAvsController.sendEndPoint(AlexaUtils.getLoginCountry(this.mContext));
            this.avsController.setLocale(AlexaSupportUtils.getSupportLocalLanguage(this.mContext));
        }
    }

    public void doListeningSpeech(String str) {
        if (this.mReceiveHandler == null) {
            initReceiverHandler();
        }
        try {
            closeQuietly(this.mAudioInputSteam);
            closeQuietly(this.mCurrentAudioStream);
            this.mAudioInputSteam = new PipedInputStream();
            this.mCurrentAudioStream = new AudioStateOutputStream(this.mAudioInputSteam, null, null);
            this.mReceiveHandler.setCurrentInputStream(this.mAudioInputSteam);
            ReceiveHandler receiveHandler = this.mReceiveHandler;
            receiveHandler.sendMessage(receiveHandler.obtainMessage(0, str));
        } catch (IOException e) {
            Log.d(TAG, "", e);
        }
    }

    public void doStopSpeech() {
        try {
            AudioStateOutputStream audioStateOutputStream = this.mCurrentAudioStream;
            if (audioStateOutputStream != null) {
                audioStateOutputStream.flush();
                this.mCurrentAudioStream.close();
                this.mCurrentAudioStream = null;
            }
        } catch (IOException e) {
            LogHelper.d(TAG, "", e);
        }
    }

    public void logout() {
        NewAvsController newAvsController = this.avsController;
        if (newAvsController != null) {
            newAvsController.removeAccessToken();
        }
    }

    public byte[] object2JsonByteArray(Object obj) {
        String strObject2JsonString = object2JsonString(obj);
        if (strObject2JsonString != null) {
            return strObject2JsonString.getBytes();
        }
        return null;
    }

    public String object2JsonString(Object obj) {
        return new Gson().toJson(obj);
    }

    @Override // com.amazon.alexa.avs.NewAvsController.AlexaListener
    public void onDirectiveData(Directive directive) {
        ProContentData.ContentData.Builder builderNewBuilder = ProContentData.ContentData.newBuilder();
        builderNewBuilder.setVersion(1);
        builderNewBuilder.setContent(ByteString.copyFrom(directive.getRawMessage().getBytes()));
        builderNewBuilder.setParser("directive");
        this.dataProcessor.sendData(builderNewBuilder.build().toByteArray());
    }

    @Override // com.amazon.alexa.avs.NewAvsController.AlexaListener
    public void onErrorException(NewAvsController.ErrorMsg errorMsg) {
        String jsonMessage = errorMsg.getJsonMessage();
        LogHelper.d(TAG, "error content :" + jsonMessage);
        if (TextUtils.isEmpty(jsonMessage)) {
            return;
        }
        this.dataProcessor.sendProtolBuffer("error", jsonMessage);
    }

    @Override // com.amazon.alexa.avs.NewAvsController.AlexaListener
    public void onTtsPcmData(final String str, InputStream inputStream) {
        try {
            new PcmDecoder(inputStream).decode(new PcmDecoder.DecodeCallback() { // from class: com.huami.watch.companion.xiaomiai.alexa.AlexaEngineProcessor.1
                private int birate;
                private int channel;
                private OpusCodecEncoder encoder;
                private String mContentId;
                private ReSample reSample;
                private int sampling = 0;

                @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                public void onDecodeEnd() {
                    AlexaEngineProcessor.this.putToEncodeSize(this.encoder, this.channel, this.birate, null, true, this.mContentId);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constant.h, "tts-end");
                        jSONObject.put("content-id", this.mContentId);
                        AlexaEngineProcessor.this.dataProcessor.sendProtolBuffer(Constant.h, jSONObject.toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    this.mContentId = null;
                    AlexaEngineProcessor.this.dataProcessor.destoryOpusEncoder(this.encoder);
                    this.encoder = null;
                    this.reSample = null;
                }

                @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                public void onDecodeFailed() {
                    AlexaEngineProcessor.this.dataProcessor.destoryOpusEncoder(this.encoder);
                }

                @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                public void onDecodeStart(int i, int i2, int i3) {
                    this.sampling = i2;
                    this.channel = i;
                    this.reSample = new ReSample();
                    this.birate = i3;
                    Log.d(AlexaEngineProcessor.TAG, "channel : " + i + " sampleRate: " + i2, new Object[0]);
                    this.encoder = AlexaEngineProcessor.this.dataProcessor.getOpusEncoder(16000, 1);
                    AudioSaveUtils.deleteFile("alexa_tts_voice.pcm");
                    AlexaEngineProcessor.this.mFileName = AudioSaveUtils.getFilename("alexa_tts_voice.pcm");
                    this.mContentId = str;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constant.h, "tts-start");
                        jSONObject.put("sampling", 16000);
                        jSONObject.put("content-id", this.mContentId);
                        AlexaEngineProcessor.this.dataProcessor.sendProtolBuffer(Constant.h, jSONObject.toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                public boolean onDecoderFrame(short[] sArr) throws Throwable {
                    if (sArr.length == 0) {
                        return true;
                    }
                    byte[] byteArray = MemoryUtils.toByteArray(sArr, sArr.length);
                    int i = this.sampling;
                    if (i != 16000 && byteArray != null) {
                        byte[] bArrReSample = this.reSample.reSample(byteArray, byteArray.length, this.channel, i);
                        if (bArrReSample != null && bArrReSample.length > 0) {
                            if (Config.isDebug()) {
                                AudioSaveUtils.writeWaveDataToFile(AlexaEngineProcessor.this.mFileName, bArrReSample, 0, bArrReSample.length);
                            }
                            AlexaEngineProcessor.this.putToEncodeSize(this.encoder, this.channel, this.birate, bArrReSample, false, this.mContentId);
                        }
                    } else if (byteArray != null && byteArray.length > 0) {
                        if (Config.isDebug()) {
                            AudioSaveUtils.writeWaveDataToFile(AlexaEngineProcessor.this.mFileName, byteArray, 0, byteArray.length);
                        }
                        AlexaEngineProcessor.this.putToEncodeSize(this.encoder, this.channel, this.birate, byteArray, false, this.mContentId);
                    }
                    return true;
                }
            });
        } catch (JavaLayerException unused) {
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendEvent(String str) {
        this.avsController.sendRequest(str);
    }

    public <T> T string2Object(String str, Class<T> cls) {
        return (T) new GsonBuilder().registerTypeAdapter(cls, new com.amazon.alexa.avs.message.Message.MessageJsonDeserializer()).create().fromJson(str, (Type) cls);
    }

    public void writeData(byte[] bArr) {
        if (bArr == null) {
            LogHelper.d(TAG, "data is null");
            return;
        }
        AudioStateOutputStream audioStateOutputStream = this.mCurrentAudioStream;
        if (audioStateOutputStream == null) {
            Log.d(TAG, "write voice data,but output stream is null", new Object[0]);
            return;
        }
        try {
            audioStateOutputStream.write(bArr);
        } catch (IOException e) {
            Log.e(TAG, "write voice data" + e.toString(), new Object[0]);
        }
    }

    public void sendEvent(RequestBody requestBody) {
        this.avsController.sendRequest(requestBody);
    }
}
