package com.huami.watch.companion.xiaomiai.alexa;

import com.amazon.alexa.avs.log.LogHelper;
import com.huami.watch.companion.util.Md5FileUtils;
import com.huami.watch.companion.xiaomiai.AudioBufferManager;
import com.huami.watch.companion.xiaomiai.AudioSaveUtils;
import com.huami.watch.companion.xiaomiai.FileTransfer;
import com.huami.watch.opus.OpusCodecEncoder;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class TransThreadManager {
    public static final String TAG = "TransThreadManager";
    private static TransThreadManager sInstance;
    private AlexaVoiceDataProcessor dataProcessor;
    private String mEncodeFileName = AudioSaveUtils.getFilename("alexa_voice_encode.pcm");
    private ArrayList<Task> mTasks = new ArrayList<>();

    public class Task extends Thread {
        private volatile boolean block;
        private volatile boolean exit;
        private Object lock = new Object();
        private boolean mCanInterrupt;
        private String mFileUrl;
        private FileTransfer mTransfer;
        private ArrayList<byte[]> result;

        public Task(FileTransfer fileTransfer, String str, boolean z) {
            this.mTransfer = fileTransfer;
            this.mFileUrl = str;
            this.mCanInterrupt = z;
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

        public void block() {
            this.block = true;
        }

        public String getFileUrl() {
            return this.mFileUrl;
        }

        public boolean isBlock() {
            return this.block;
        }

        public void putToEncodeSize(OpusCodecEncoder opusCodecEncoder, int i, byte[] bArr, String str, boolean z) {
            if (this.result == null) {
                this.result = new ArrayList<>();
            }
            if (z) {
                ArrayList<byte[]> arrayList = this.result;
                if (arrayList == null || arrayList.size() <= 0) {
                    Log.e(TransThreadManager.TAG, " over send pcm data but is null", new Object[0]);
                    return;
                }
                byte[] bArrByteCombineAll = byteCombineAll(this.result);
                AudioBufferManager audioBufferManager = new AudioBufferManager();
                TransThreadManager.this.dataProcessor.opusCode(opusCodecEncoder, bArrByteCombineAll, audioBufferManager, i);
                TransThreadManager.this.dataProcessor.sendData(TransThreadManager.this.dataProcessor.protobufferVoice("media", str, audioBufferManager.getAudioBuffer()));
                this.result.clear();
                return;
            }
            if (bArr != null && bArr.length > 0) {
                this.result.add(bArr);
            }
            if (this.result.size() == 10) {
                byte[] bArrByteCombineAll2 = byteCombineAll(this.result);
                AudioBufferManager audioBufferManager2 = new AudioBufferManager();
                TransThreadManager.this.dataProcessor.opusCode(opusCodecEncoder, bArrByteCombineAll2, audioBufferManager2, i);
                TransThreadManager.this.dataProcessor.sendData(TransThreadManager.this.dataProcessor.protobufferVoice("media", str, audioBufferManager2.getAudioBuffer()));
                this.result.clear();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int cacheData;
            super.run();
            String mD5String = Md5FileUtils.getMD5String(this.mFileUrl);
            FileCache fileCache = CacheFileManager.getInstance().getFileCache(mD5String);
            if (fileCache == null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", mD5String);
                    TransThreadManager.this.dataProcessor.sendProtolBuffer("media_end", jSONObject.toString());
                    return;
                } catch (JSONException e) {
                    Log.d(TransThreadManager.TAG, e.toString(), new Object[0]);
                    return;
                }
            }
            byte[] bArr = new byte[3072];
            fileCache.initInputStream();
            OpusCodecEncoder opusEncoder = TransThreadManager.this.dataProcessor.getOpusEncoder(16000, 1);
            Log.e(TransThreadManager.TAG, "begin send data file key: " + mD5String + "  task : " + toString(), new Object[0]);
            int i = 0;
            while (!this.exit && (cacheData = fileCache.readCacheData(bArr, i, 0, 3072)) != -1) {
                if (this.mCanInterrupt) {
                    synchronized (this.lock) {
                        if (this.block) {
                            LogHelper.e(TransThreadManager.TAG, "block send data: " + mD5String);
                            try {
                                this.lock.wait();
                            } catch (InterruptedException unused) {
                                if (this.exit) {
                                    Log.e(TransThreadManager.TAG, "exit send data thread", new Object[0]);
                                    putToEncodeSize(opusEncoder, 16000, null, mD5String, true);
                                    TransThreadManager.this.mTasks.remove(this);
                                    Log.e(TransThreadManager.TAG, "end send data file key: " + mD5String + "  task : " + toString(), new Object[0]);
                                    TransThreadManager.this.dataProcessor.destoryOpusEncoder(opusEncoder);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("key", mD5String);
                                    jSONObject2.put("exit", this.exit);
                                    TransThreadManager.this.dataProcessor.sendProtolBuffer("media_end", jSONObject2.toString());
                                    fileCache.destroy();
                                }
                            }
                        }
                    }
                }
                try {
                    Thread.sleep(20L);
                } catch (InterruptedException e2) {
                    Log.d(TransThreadManager.TAG, "InterruptedException : " + e2.toString(), new Object[0]);
                }
                byte[] bArr2 = new byte[cacheData];
                System.arraycopy(bArr, 0, bArr2, 0, cacheData);
                putToEncodeSize(opusEncoder, 16000, bArr2, mD5String, false);
                i += cacheData;
            }
            putToEncodeSize(opusEncoder, 16000, null, mD5String, true);
            TransThreadManager.this.mTasks.remove(this);
            Log.e(TransThreadManager.TAG, "end send data file key: " + mD5String + "  task : " + toString(), new Object[0]);
            TransThreadManager.this.dataProcessor.destoryOpusEncoder(opusEncoder);
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("key", mD5String);
                jSONObject3.put("exit", this.exit);
                TransThreadManager.this.dataProcessor.sendProtolBuffer("media_end", jSONObject3.toString());
            } catch (JSONException e3) {
                Log.d(TransThreadManager.TAG, e3.toString(), new Object[0]);
            }
            fileCache.destroy();
        }

        public void unblock() {
            this.block = false;
            synchronized (this.lock) {
                this.lock.notify();
            }
        }
    }

    public TransThreadManager(AlexaVoiceDataProcessor alexaVoiceDataProcessor) {
        this.dataProcessor = alexaVoiceDataProcessor;
    }

    public void clearAll() {
        for (Task task : this.mTasks) {
            task.exit = true;
            task.interrupt();
        }
        this.mTasks.clear();
    }

    public void clearSend(String str) {
        for (Task task : this.mTasks) {
            if (task.getFileUrl().equals(str)) {
                Log.e(TAG, "clear trans to block file Url : " + str + "  task : " + task.toString(), new Object[0]);
                task.exit = true;
                task.interrupt();
            }
        }
    }

    public void sendData(FileTransfer fileTransfer, String str, boolean z) {
        Task task = null;
        for (Task task2 : this.mTasks) {
            if (task2.getFileUrl().equals(str)) {
                task = task2;
            }
        }
        if (task != null) {
            Log.e(TAG, "unblock task file url : " + str + "  task : " + task.toString(), new Object[0]);
            task.unblock();
            return;
        }
        Task task3 = new Task(fileTransfer, str, z);
        Log.e(TAG, "create new task file url : " + str + "  task : " + task3.toString(), new Object[0]);
        this.mTasks.add(task3);
        task3.start();
    }

    public void stopSend(String str) {
        for (Task task : this.mTasks) {
            if (task.getFileUrl().equals(str)) {
                Log.e(TAG, "stop trans to block file Url : " + str + "  task : " + task.toString(), new Object[0]);
                task.block();
            }
        }
    }
}
