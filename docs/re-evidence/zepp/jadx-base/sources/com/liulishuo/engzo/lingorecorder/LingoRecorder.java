package com.liulishuo.engzo.lingorecorder;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.liulishuo.engzo.lingorecorder.processor.AudioProcessor;
import com.liulishuo.engzo.lingorecorder.processor.WavProcessor;
import com.liulishuo.engzo.lingorecorder.recorder.AndroidRecorder;
import com.liulishuo.engzo.lingorecorder.recorder.IRecorder;
import com.liulishuo.engzo.lingorecorder.recorder.WavFileRecorder;
import com.liulishuo.engzo.lingorecorder.utils.LOG;
import com.liulishuo.engzo.lingorecorder.utils.RecorderProperty;
import com.liulishuo.engzo.lingorecorder.utils.WrapBuffer;
import com.liulishuo.engzo.lingorecorder.volume.DefaultVolumeCalculator;
import com.liulishuo.engzo.lingorecorder.volume.IVolumeCalculator;
import com.liulishuo.engzo.lingorecorder.volume.OnVolumeListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
public class LingoRecorder {
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 4;
    private static final String n = "duration";
    private static final String o = "filePath";
    private a b;
    private OnRecordStopListener c;
    private OnProcessStopListener d;
    private OnVolumeListener e;
    private IVolumeCalculator f;
    private String j;
    private Map<String, AudioProcessor> a = new HashMap();
    private boolean g = true;
    private boolean h = false;
    private final RecorderProperty i = new RecorderProperty();

    public static class CancelProcessingException extends RuntimeException {
        public CancelProcessingException() {
            super("cancel processing");
        }

        public CancelProcessingException(Throwable th) {
            super(th);
        }
    }

    public interface OnProcessStopListener {
        void onProcessStop(Throwable th, Map<String, AudioProcessor> map);
    }

    public interface OnRecordStopListener {

        public static class Result {
            private long a;
            private String b;

            public long getDurationInMills() {
                return this.a;
            }

            public String getOutputFilePath() {
                return this.b;
            }
        }

        void onRecordStop(Throwable th, Result result);
    }

    public static class RecordErrorCancelProcessingException extends CancelProcessingException {
        public RecordErrorCancelProcessingException(Throwable th) {
            super(th);
        }
    }

    public static class a implements Runnable {
        private volatile boolean a;
        private volatile boolean b;
        private volatile Throwable c;
        private Thread d = new Thread(this);
        private IRecorder e;
        private Collection<AudioProcessor> f;
        private Handler g;
        private String h;
        private IVolumeCalculator i;

        /* JADX INFO: renamed from: com.liulishuo.engzo.lingorecorder.LingoRecorder$a$a, reason: collision with other inner class name */
        public class C0732a extends Thread {
            private LinkedBlockingQueue<Object> a;

            public C0732a(a aVar) {
                this(new LinkedBlockingQueue());
            }

            public void a(boolean z) {
                try {
                    this.a.put("end");
                    if (z) {
                        interrupt();
                    }
                    join();
                    LOG.d("processorThread end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            public void b(@NonNull byte[] bArr, int i) throws InterruptedException {
                WrapBuffer wrapBuffer = new WrapBuffer();
                wrapBuffer.setBytes(Arrays.copyOf(bArr, bArr.length));
                wrapBuffer.setSize(i);
                this.a.put(wrapBuffer);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                boolean z = 0;
                try {
                    try {
                        for (AudioProcessor audioProcessor : a.this.f) {
                            a.this.e();
                            audioProcessor.start();
                        }
                        while (true) {
                            Object objTake = this.a.take();
                            if (objTake == null || !(objTake instanceof WrapBuffer)) {
                                break;
                            }
                            for (AudioProcessor audioProcessor2 : a.this.f) {
                                a.this.e();
                                WrapBuffer wrapBuffer = (WrapBuffer) objTake;
                                audioProcessor2.flow(wrapBuffer.getBytes(), wrapBuffer.getSize());
                            }
                            for (AudioProcessor audioProcessor3 : a.this.f) {
                                a.this.e();
                                if (audioProcessor3.needExit()) {
                                    LOG.d(String.format("exit because %s", audioProcessor3));
                                    a.this.a = false;
                                    break;
                                }
                            }
                        }
                        for (AudioProcessor audioProcessor4 : a.this.f) {
                            a.this.e();
                            audioProcessor4.end();
                        }
                        a.this.a = false;
                        Iterator it2 = a.this.f.iterator();
                        while (it2.hasNext()) {
                            ((AudioProcessor) it2.next()).release();
                        }
                    } catch (Throwable th) {
                        a.this.a = z;
                        Iterator it3 = a.this.f.iterator();
                        while (it3.hasNext()) {
                            ((AudioProcessor) it3.next()).release();
                        }
                        throw th;
                    }
                } catch (InterruptedException e) {
                    a.this.c = new CancelProcessingException(e);
                    a.this.a = false;
                    Iterator it4 = a.this.f.iterator();
                    while (true) {
                        boolean zHasNext = it4.hasNext();
                        z = it4;
                        if (!zHasNext) {
                            break;
                        } else {
                            ((AudioProcessor) it4.next()).release();
                        }
                    }
                } catch (Throwable th2) {
                    a.this.c = th2;
                    LOG.e(th2);
                    a.this.a = false;
                    Iterator it5 = a.this.f.iterator();
                    while (true) {
                        boolean zHasNext2 = it5.hasNext();
                        z = it5;
                        if (!zHasNext2) {
                            break;
                        } else {
                            ((AudioProcessor) it5.next()).release();
                        }
                    }
                }
            }

            public C0732a(LinkedBlockingQueue<Object> linkedBlockingQueue) {
                super("processThread");
                this.a = linkedBlockingQueue;
            }
        }

        public a(IRecorder iRecorder, String str, Collection<AudioProcessor> collection, Handler handler, IVolumeCalculator iVolumeCalculator) {
            this.f = collection;
            this.g = handler;
            this.e = iRecorder;
            this.h = str;
            this.i = iVolumeCalculator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            if (this.b) {
                throw new CancelProcessingException();
            }
        }

        public void cancel() {
            this.a = false;
            this.b = true;
        }

        public void f() {
            this.a = false;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0108  */
        /* JADX WARN: Code duplicated, block: B:40:0x0137  */
        @Override // java.lang.Runnable
        public void run() {
            C0732a c0732a;
            WavProcessor wavProcessor;
            Message messageObtain;
            this.a = true;
            try {
                int bufferSize = this.e.getBufferSize();
                byte[] bArr = new byte[bufferSize];
                c0732a = new C0732a(this);
                try {
                    c0732a.start();
                    this.e.startRecording();
                    String str = this.h;
                    if (str != null) {
                        wavProcessor = new WavProcessor(str, this.e.getRecordProperty());
                        try {
                            wavProcessor.start();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                LOG.e(th);
                                this.a = false;
                                if (wavProcessor != null) {
                                    wavProcessor.release();
                                }
                                this.e.release();
                                Message messageObtain2 = Message.obtain();
                                messageObtain2.what = 1;
                                Bundle bundle = new Bundle();
                                bundle.putLong("duration", this.e.getDurationInMills());
                                bundle.putString(LingoRecorder.o, this.h);
                                messageObtain2.setData(bundle);
                                messageObtain2.obj = th;
                                this.g.sendMessage(messageObtain2);
                                this.b = true;
                                if (c0732a != null) {
                                    c0732a.a(this.b);
                                }
                                messageObtain = Message.obtain();
                                messageObtain.what = 2;
                                messageObtain.obj = new RecordErrorCancelProcessingException(this.c);
                            } catch (Throwable th2) {
                                this.a = false;
                                if (wavProcessor != null) {
                                    wavProcessor.release();
                                }
                                this.e.release();
                                Message messageObtain3 = Message.obtain();
                                messageObtain3.what = 1;
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("duration", this.e.getDurationInMills());
                                bundle2.putString(LingoRecorder.o, this.h);
                                messageObtain3.setData(bundle2);
                                messageObtain3.obj = null;
                                this.g.sendMessage(messageObtain3);
                                if (c0732a != null) {
                                    c0732a.a(this.b);
                                }
                                Message messageObtain4 = Message.obtain();
                                messageObtain4.what = 2;
                                messageObtain4.obj = this.c;
                                this.g.sendMessage(messageObtain4);
                                throw th2;
                            }
                        }
                    } else {
                        wavProcessor = null;
                    }
                    while (this.a) {
                        int i = this.e.read(bArr, bufferSize);
                        LOG.d("read buffer result = " + i);
                        if (i > 0) {
                            if (this.i != null) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                double dOnAudioChunk = this.i.onAudioChunk(bArr, i, this.e.getRecordProperty().getBitsPerSample());
                                LOG.d("duration of calculating chunk volume: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                Handler handler = this.g;
                                handler.sendMessage(handler.obtainMessage(4, Double.valueOf(dOnAudioChunk)));
                            }
                            c0732a.b(bArr, i);
                            if (wavProcessor != null) {
                                wavProcessor.flow(bArr, i);
                            }
                        } else if (i < 0) {
                            LOG.d("exit read from recorder result = " + i);
                            this.a = false;
                            break;
                        }
                    }
                    if (wavProcessor != null) {
                        wavProcessor.end();
                    }
                    this.a = false;
                    if (wavProcessor != null) {
                        wavProcessor.release();
                    }
                    this.e.release();
                    Message messageObtain5 = Message.obtain();
                    messageObtain5.what = 1;
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("duration", this.e.getDurationInMills());
                    bundle3.putString(LingoRecorder.o, this.h);
                    messageObtain5.setData(bundle3);
                    messageObtain5.obj = null;
                    this.g.sendMessage(messageObtain5);
                    c0732a.a(this.b);
                    messageObtain = Message.obtain();
                    messageObtain.what = 2;
                    messageObtain.obj = this.c;
                } catch (Throwable th3) {
                    th = th3;
                    wavProcessor = null;
                    LOG.e(th);
                    this.a = false;
                    if (wavProcessor != null) {
                        wavProcessor.release();
                    }
                    this.e.release();
                    Message messageObtain6 = Message.obtain();
                    messageObtain6.what = 1;
                    Bundle bundle4 = new Bundle();
                    bundle4.putLong("duration", this.e.getDurationInMills());
                    bundle4.putString(LingoRecorder.o, this.h);
                    messageObtain6.setData(bundle4);
                    messageObtain6.obj = th;
                    this.g.sendMessage(messageObtain6);
                    this.b = true;
                    if (c0732a != null) {
                        c0732a.a(this.b);
                    }
                    messageObtain = Message.obtain();
                    messageObtain.what = 2;
                    messageObtain.obj = new RecordErrorCancelProcessingException(this.c);
                    this.g.sendMessage(messageObtain);
                }
            } catch (Throwable th4) {
                th = th4;
                c0732a = null;
            }
            this.g.sendMessage(messageObtain);
        }

        public void start() {
            this.d.start();
        }
    }

    public static class b extends Handler {
        private LingoRecorder a;
        private Map<String, AudioProcessor> b;

        public b(LingoRecorder lingoRecorder, Map<String, AudioProcessor> map) {
            super(Looper.getMainLooper());
            this.a = lingoRecorder;
            this.b = map;
        }

        private void a(Message message) {
            if (this.a.d != null) {
                this.a.d.onProcessStop((Throwable) message.obj, this.b);
            }
            LOG.d("process end");
        }

        private void b(Message message) {
            long j = message.getData().getLong("duration", -1L);
            String string = message.getData().getString(LingoRecorder.o);
            if (this.a.c != null) {
                OnRecordStopListener.Result result = new OnRecordStopListener.Result();
                result.a = j;
                result.b = string;
                this.a.c.onRecordStop((Throwable) message.obj, result);
            }
            LOG.d("record end");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                this.a.b = null;
                b(message);
            } else if (i == 2) {
                this.a.g = true;
                this.a.h = false;
                a(message);
            } else if (i == 4 && this.a.e != null) {
                this.a.e.onVolume(((Double) message.obj).doubleValue());
            }
        }
    }

    public LingoRecorder bitsPerSample(int i) {
        this.i.setBitsPerSample(i);
        return this;
    }

    public void cancel() {
        a aVar = this.b;
        if (aVar != null) {
            this.g = false;
            aVar.cancel();
            this.b = null;
        }
    }

    public LingoRecorder channels(int i) {
        this.i.setChannels(i);
        return this;
    }

    public RecorderProperty getRecorderProperty() {
        return this.i;
    }

    @Deprecated
    public boolean isAvailable() {
        return this.g;
    }

    public boolean isProcessing() {
        return this.h;
    }

    public boolean isRecording() {
        return this.b != null;
    }

    public void put(String str, AudioProcessor audioProcessor) {
        this.a.put(str, audioProcessor);
    }

    public AudioProcessor remove(String str) {
        return this.a.remove(str);
    }

    public LingoRecorder sampleRate(int i) {
        this.i.setSampleRate(i);
        return this;
    }

    public void setDebugEnable(boolean z) {
        LOG.isEnable = z;
    }

    public void setOnProcessStopListener(OnProcessStopListener onProcessStopListener) {
        this.d = onProcessStopListener;
    }

    public void setOnRecordStopListener(OnRecordStopListener onRecordStopListener) {
        this.c = onRecordStopListener;
    }

    public void setOnVolumeListener(OnVolumeListener onVolumeListener) {
        setOnVolumeListener(onVolumeListener, new DefaultVolumeCalculator());
    }

    public boolean start() {
        return start(null);
    }

    public void stop() {
        if (this.b != null) {
            LOG.d("end record");
            this.g = false;
            LOG.d("record unavailable now");
            this.b.f();
            this.b = null;
        }
    }

    public LingoRecorder wavFile(String str) {
        this.j = str;
        return this;
    }

    public void setOnVolumeListener(OnVolumeListener onVolumeListener, IVolumeCalculator iVolumeCalculator) {
        this.e = onVolumeListener;
        this.f = iVolumeCalculator;
    }

    public boolean start(String str) {
        IRecorder androidRecorder;
        a aVar = this.b;
        if (aVar != null || this.h) {
            if (aVar != null) {
                LOG.e("start fail recorder is recording");
            } else {
                LOG.e("start fail recorder is processing");
            }
            return false;
        }
        LOG.d("start record");
        String str2 = this.j;
        if (str2 != null) {
            androidRecorder = new WavFileRecorder(str2, this.i);
            this.g = false;
        } else {
            androidRecorder = new AndroidRecorder(this.i);
        }
        IRecorder iRecorder = androidRecorder;
        HashMap map = new HashMap(this.a.size());
        for (String str3 : this.a.keySet()) {
            AudioProcessor audioProcessor = this.a.get(str3);
            if (audioProcessor != null) {
                map.put(str3, audioProcessor);
            }
        }
        a aVar2 = new a(iRecorder, str, map.values(), new b(this, map), this.f);
        this.b = aVar2;
        this.h = true;
        aVar2.start();
        return true;
    }
}
