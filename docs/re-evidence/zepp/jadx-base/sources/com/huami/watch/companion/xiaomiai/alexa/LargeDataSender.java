package com.huami.watch.companion.xiaomiai.alexa;

import com.activeandroid.util.IOUtils;
import com.amazon.alexa.avs.NewAvsController;
import com.amazon.alexa.avs.log.LogHelper;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.util.Md5FileUtils;
import com.huami.watch.companion.xiaomiai.AudioSaveUtils;
import com.huami.watch.companion.xiaomiai.MemoryUtils;
import com.huami.watch.companion.xiaomiai.PcmDecoder;
import com.huami.watch.companion.xiaomiai.alexa.resample.ReSample;
import com.huami.watch.transport.httpsupport.transporter.file.MD5FileUtils;
import com.huami.watch.util.Log;
import com.huami.watch.wififtp.FileManagerFragment;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javazoom.jl.decoder.JavaLayerException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class LargeDataSender extends Thread {
    public static final String TAG = LogHelper.makeLogTag(LargeDataSender.class);
    private AlexaVoiceDataProcessor dataProcessor;
    private String mSendKey;
    private final BlockingQueue<TaskInfo> senderQueue = new LinkedBlockingQueue();
    private final OkHttpClient okHttpClient = new OkHttpClient();

    public static class TaskInfo {
        public String fileName;
        public long totalSize;
        public String url;
    }

    public LargeDataSender(AlexaVoiceDataProcessor alexaVoiceDataProcessor) {
        this.dataProcessor = alexaVoiceDataProcessor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    private void sendOneTaskDirectly(TaskInfo taskInfo) throws Throwable {
        InputStream inputStream;
        String str = TAG;
        LogHelper.d(str, "file name : " + taskInfo.fileName + "   total size； " + taskInfo.totalSize);
        final String str2 = taskInfo.url;
        final String mD5String = Md5FileUtils.getMD5String(str2);
        final FileCache fileCache = CacheFileManager.getInstance().getFileCache(mD5String);
        ?? r2 = "download file url : " + str2 + "  md5Key : " + mD5String;
        LogHelper.d(str, new Object[]{r2});
        try {
            try {
                Response responseExecute = this.okHttpClient.newCall(new Request.Builder().url(str2).build()).execute();
                ResponseBody responseBodyBody = responseExecute.body();
                long jContentLength = responseBodyBody.contentLength();
                LogHelper.d(str, "audio size " + jContentLength + " response code : " + responseExecute.code() + " real url : " + responseExecute.header("Location"));
                fileCache.setContentLength(jContentLength);
                InputStream inputStreamByteStream = responseBodyBody.byteStream();
                try {
                    fileCache.initOutputStream();
                    final String filename = AudioSaveUtils.getFilename("alexa_voice.pcm");
                    try {
                        new PcmDecoder(inputStreamByteStream).decode(new PcmDecoder.DecodeCallback() { // from class: com.huami.watch.companion.xiaomiai.alexa.LargeDataSender.1
                            private int birate;
                            private int channel;
                            private ReSample reSample;
                            private int sampling = 0;
                            public boolean writeStatus = true;

                            @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                            public void onDecodeEnd() {
                                LargeDataSender.this.mSendKey = null;
                                this.reSample = null;
                                fileCache.setEndTag();
                            }

                            @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                            public void onDecodeFailed() {
                                LargeDataSender.this.mSendKey = null;
                                this.reSample = null;
                                fileCache.setEndTag();
                            }

                            @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                            public void onDecodeStart(int i, int i2, int i3) {
                                Log.d(LargeDataSender.TAG, "channel : " + i + " sampleRate: " + i2, new Object[0]);
                                this.reSample = new ReSample();
                                this.channel = i;
                                this.sampling = i2;
                                this.birate = i3;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("url", str2);
                                    jSONObject.put("channel", 1);
                                    jSONObject.put("size", -1);
                                    jSONObject.put("sampling", 16000);
                                    LargeDataSender.this.dataProcessor.sendProtolBuffer("media-info", jSONObject.toString());
                                } catch (JSONException e) {
                                    Log.d(LargeDataSender.TAG, "", e);
                                }
                                AudioSaveUtils.deleteFile("alexa_voice.pcm");
                                AudioSaveUtils.deleteFile("alexa_voice_encode.pcm");
                                LargeDataSender.this.mSendKey = mD5String;
                            }

                            @Override // com.huami.watch.companion.xiaomiai.PcmDecoder.DecodeCallback
                            public boolean onDecoderFrame(short[] sArr) throws Throwable {
                                if (sArr.length == 0) {
                                    Log.d(LargeDataSender.TAG, "decode pcm data length is zero ??", new Object[0]);
                                    return true;
                                }
                                byte[] byteArray = MemoryUtils.toByteArray(sArr, sArr.length);
                                int i = this.sampling;
                                if (i != 16000) {
                                    byte[] bArrReSample = this.reSample.reSample(byteArray, byteArray.length, this.channel, i);
                                    this.writeStatus = fileCache.writeCacheData(bArrReSample);
                                    if (Config.isDebug()) {
                                        AudioSaveUtils.writeWaveDataToFile(filename, bArrReSample, 0, bArrReSample.length);
                                    }
                                    return this.writeStatus;
                                }
                                if (byteArray == null || byteArray.length <= 0) {
                                    return false;
                                }
                                this.writeStatus = fileCache.writeCacheData(byteArray);
                                if (Config.isDebug()) {
                                    AudioSaveUtils.writeWaveDataToFile(filename, byteArray, 0, byteArray.length);
                                }
                                return this.writeStatus;
                            }
                        });
                    } catch (JavaLayerException e) {
                        Log.d(TAG, e.toString(), new Object[0]);
                    }
                    IOUtils.closeQuietly(inputStreamByteStream);
                } catch (MalformedURLException e2) {
                    e = e2;
                    inputStream = inputStreamByteStream;
                    String str3 = TAG;
                    Log.d(str3, e.toString(), new Object[0]);
                    if (fileCache != null) {
                        fileCache.setEndTag();
                    }
                    String jsonMessage = new NewAvsController.ErrorMsg(6, e.toString()).getJsonMessage();
                    LogHelper.d(str3, "error content :" + jsonMessage);
                    this.dataProcessor.sendProtolBuffer("error", jsonMessage);
                    IOUtils.closeQuietly(inputStream);
                } catch (IOException e3) {
                    e = e3;
                    inputStream = inputStreamByteStream;
                    String str4 = TAG;
                    Log.d(str4, e.toString(), new Object[0]);
                    if (fileCache != null) {
                        fileCache.setEndTag();
                    }
                    String jsonMessage2 = new NewAvsController.ErrorMsg(6, e.toString()).getJsonMessage();
                    LogHelper.d(str4, "error content :" + jsonMessage2);
                    this.dataProcessor.sendProtolBuffer("error", jsonMessage2);
                    IOUtils.closeQuietly(inputStream);
                } catch (Throwable th) {
                    th = th;
                    r2 = inputStreamByteStream;
                    IOUtils.closeQuietly((Closeable) r2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MalformedURLException e4) {
            e = e4;
            inputStream = null;
        } catch (IOException e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r2 = 0;
        }
        LogHelper.d(TAG, "===================== download complete file url : " + str2);
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        while (true) {
            try {
                sendOneTaskDirectly(this.senderQueue.take());
            } catch (InterruptedException e) {
                LogHelper.d(TAG, "", e);
            }
        }
    }

    public void submitDownloadTask(TaskInfo taskInfo) {
        String mD5String = MD5FileUtils.getMD5String(taskInfo.url);
        Log.d(TAG, "create cache file key : " + mD5String, new Object[0]);
        FileCache fileCache = new FileCache(mD5String, AudioSaveUtils.getFilename(mD5String + FileManagerFragment.FILE_TYPE_MUSIC));
        CacheFileManager.getInstance().addFileCache(fileCache.getFileKey(), fileCache);
        this.senderQueue.add(taskInfo);
    }
}
