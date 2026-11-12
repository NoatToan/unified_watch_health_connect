package linc.com.amplituda;

import android.content.Context;
import android.webkit.URLUtil;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;
import linc.com.amplituda.exceptions.AmplitudaException;
import linc.com.amplituda.exceptions.io.FileNotFoundException;
import linc.com.amplituda.exceptions.io.InvalidAudioByteArrayException;
import linc.com.amplituda.exceptions.io.InvalidAudioInputStreamException;
import linc.com.amplituda.exceptions.io.InvalidAudioUrlException;
import linc.com.amplituda.exceptions.io.InvalidRawResourceException;

/* JADX INFO: loaded from: classes3.dex */
public final class Amplituda {
    private final FileManager fileManager;

    static {
        System.loadLibrary("amplituda-native-lib");
    }

    public Amplituda(Context context) {
        this.fileManager = new FileManager(context);
    }

    private AmplitudaResultJNI amplitudesFromCache(File file) {
        try {
            String file2 = this.fileManager.readFile(file);
            if (file2 != null && !file2.isEmpty()) {
                int iIndexOf = file2.indexOf("=");
                int iIndexOf2 = file2.indexOf(System.lineSeparator());
                String strSubstring = file2.substring(0, iIndexOf2).substring(iIndexOf + 1, iIndexOf2);
                String strSubstring2 = file2.substring(iIndexOf2 + 1);
                AmplitudaResultJNI amplitudaResultJNI = new AmplitudaResultJNI();
                amplitudaResultJNI.setDuration(Double.parseDouble(strSubstring));
                amplitudaResultJNI.setAmplitudes(strSubstring2);
                return amplitudaResultJNI;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private synchronized <T> AmplitudaProcessingOutput<T> errorOutput(AmplitudaException amplitudaException, InputAudio<T> inputAudio, AmplitudaProgressListener amplitudaProgressListener) {
        stopProgress(amplitudaProgressListener);
        return new AmplitudaProcessingOutput<>(amplitudaException, inputAudio);
    }

    private synchronized <T> AmplitudaResultJNI processFileJNI(File file, InputAudio<T> inputAudio, Compress compress, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        AmplitudaResultJNI amplitudaResultJNIAmplitudesFromCache;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            updateProgressOperation(amplitudaProgressListener, ProgressOperation.PROCESSING);
            File cacheFile = this.fileManager.getCacheFile(String.valueOf(file.hashCode()), cache.getKey());
            amplitudaResultJNIAmplitudesFromCache = cache.getState() == 2 ? amplitudesFromCache(cacheFile) : null;
            if (amplitudaResultJNIAmplitudesFromCache == null) {
                AmplitudaLogger.log("Process audio " + file.getPath());
                amplitudaResultJNIAmplitudesFromCache = amplitudesFromAudioJNI(file.getPath(), compress.getType(), compress.getPreferredSamplesPerSecond(), cacheFile.getPath(), cache.isEnabled(), amplitudaProgressListener);
            } else {
                Locale locale = Locale.US;
                AmplitudaLogger.log("Found cache data \"" + cacheFile.getName() + "\" for audio \"" + file.getName() + "\"");
            }
            inputAudio.setDuration(amplitudaResultJNIAmplitudesFromCache.getDurationMillis());
            AmplitudaLogger.logOperationTime("Processing", jCurrentTimeMillis);
            stopProgress(amplitudaProgressListener);
        } catch (Throwable th3) {
            throw th3;
        }
        return amplitudaResultJNIAmplitudesFromCache;
    }

    private synchronized void startProgress(AmplitudaProgressListener amplitudaProgressListener) {
        if (amplitudaProgressListener != null) {
            amplitudaProgressListener.onStartProgress();
        }
    }

    private synchronized void stopProgress(AmplitudaProgressListener amplitudaProgressListener) {
        if (amplitudaProgressListener != null) {
            amplitudaProgressListener.onStopProgress();
        }
    }

    private synchronized void updateProgressOperation(AmplitudaProgressListener amplitudaProgressListener, ProgressOperation progressOperation) {
        if (amplitudaProgressListener != null) {
            amplitudaProgressListener.onOperationChanged(progressOperation);
        }
    }

    public native AmplitudaResultJNI amplitudesFromAudioJNI(String str, int i14, int i15, String str2, boolean z14, AmplitudaProgressListener amplitudaProgressListener);

    public Amplituda clearCache(String str, boolean z14) {
        FileManager fileManager = this.fileManager;
        if (!z14) {
            str = String.valueOf(str.hashCode());
        }
        fileManager.clearCache(str);
        return this;
    }

    public AmplitudaProcessingOutput<String> processAudio(String str, Compress compress, Cache cache, AmplitudaProgressListener amplitudaProgressListener) throws Throwable {
        startProgress(amplitudaProgressListener);
        InputAudio inputAudio = new InputAudio(str);
        try {
            try {
                if (!URLUtil.isValidUrl(str)) {
                    inputAudio.setType(InputAudio.Type.PATH);
                    return new AmplitudaProcessingOutput<>(processFileJNI(new File(str), inputAudio, compress, cache, amplitudaProgressListener), inputAudio);
                }
                inputAudio.setType(InputAudio.Type.URL);
                long jCurrentTimeMillis = System.currentTimeMillis();
                updateProgressOperation(amplitudaProgressListener, ProgressOperation.DOWNLOADING);
                File urlFile = this.fileManager.getUrlFile(str, amplitudaProgressListener);
                if (urlFile == null) {
                    return errorOutput(new InvalidAudioUrlException(), inputAudio, amplitudaProgressListener);
                }
                AmplitudaLogger.logOperationTime("Preparing", jCurrentTimeMillis);
                AmplitudaResultJNI amplitudaResultJNIProcessFileJNI = processFileJNI(urlFile, inputAudio, compress, cache, amplitudaProgressListener);
                this.fileManager.deleteFile(urlFile);
                return new AmplitudaProcessingOutput<>(amplitudaResultJNIProcessFileJNI, inputAudio);
            } catch (AmplitudaException e4) {
                e = e4;
            }
        } catch (AmplitudaException e14) {
            e = e14;
        }
        return errorOutput(e, inputAudio, amplitudaProgressListener);
    }

    public Amplituda setLogConfig(int i14, boolean z14) {
        AmplitudaLogger.enable(z14);
        AmplitudaLogger.priority(i14);
        return this;
    }

    public Amplituda clearCache(File file) {
        clearCache(String.valueOf(file.hashCode()), true);
        return this;
    }

    public Amplituda clearCache() {
        this.fileManager.clearAllCacheFiles();
        return this;
    }

    public Amplituda clearCache(int i14) {
        clearCache(String.valueOf(i14), true);
        return this;
    }

    public Amplituda clearCache(InputStream inputStream) {
        clearCache(this.fileManager.getInputStreamHashString(inputStream), true);
        return this;
    }

    public Amplituda clearCache(byte[] bArr) {
        clearCache(String.valueOf(Arrays.hashCode(bArr)), true);
        return this;
    }

    public AmplitudaProcessingOutput<String> processAudio(String str) {
        return processAudio(str, Compress.getDefault(), Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14) {
        return processAudio(i14, Compress.getDefault(), Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream) {
        return processAudio(inputStream, Compress.getDefault(), Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr) {
        return processAudio(bArr, Compress.getDefault(), Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<File> processAudio(File file, Compress compress) {
        return processAudio(file, compress, Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<String> processAudio(String str, Compress compress) {
        return processAudio(str, compress, Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14, Compress compress) {
        return processAudio(i14, compress, Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream, Compress compress) {
        return processAudio(inputStream, compress, Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr, Compress compress) {
        return processAudio(bArr, compress, Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<File> processAudio(File file, Cache cache) {
        return processAudio(file, Compress.getDefault(), cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<String> processAudio(String str, Cache cache) {
        return processAudio(str, Compress.getDefault(), cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14, Cache cache) {
        return processAudio(i14, Compress.getDefault(), cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream, Cache cache) {
        return processAudio(inputStream, Compress.getDefault(), cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr, Cache cache) {
        return processAudio(bArr, Compress.getDefault(), cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<File> processAudio(File file, Compress compress, Cache cache) {
        return processAudio(file, compress, cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<String> processAudio(String str, Compress compress, Cache cache) {
        return processAudio(str, compress, cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14, Compress compress, Cache cache) {
        return processAudio(i14, compress, cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream, Compress compress, Cache cache) {
        return processAudio(inputStream, compress, cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr, Compress compress, Cache cache) {
        return processAudio(bArr, compress, cache, (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<File> processAudio(File file, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(file, Compress.getDefault(), Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<String> processAudio(String str, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(str, Compress.getDefault(), Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(i14, Compress.getDefault(), Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(inputStream, Compress.getDefault(), Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(bArr, Compress.getDefault(), Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<File> processAudio(File file, Compress compress, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(file, compress, Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<String> processAudio(String str, Compress compress, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(str, compress, Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14, Compress compress, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(i14, compress, Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream, Compress compress, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(inputStream, compress, Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr, Compress compress, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(bArr, compress, Cache.getDefault(), amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<File> processAudio(File file, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(file, Compress.getDefault(), cache, amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<String> processAudio(String str, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(str, Compress.getDefault(), cache, amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(i14, Compress.getDefault(), cache, amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(inputStream, Compress.getDefault(), cache, amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        return processAudio(bArr, Compress.getDefault(), cache, amplitudaProgressListener);
    }

    public AmplitudaProcessingOutput<File> processAudio(File file, Compress compress, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        AmplitudaProgressListener amplitudaProgressListener2;
        startProgress(amplitudaProgressListener);
        InputAudio inputAudio = new InputAudio(file, InputAudio.Type.FILE);
        try {
            amplitudaProgressListener2 = amplitudaProgressListener;
            try {
                return new AmplitudaProcessingOutput<>(processFileJNI(file, inputAudio, compress, cache, amplitudaProgressListener2), inputAudio);
            } catch (AmplitudaException e4) {
                e = e4;
                return errorOutput(e, inputAudio, amplitudaProgressListener2);
            }
        } catch (AmplitudaException e14) {
            e = e14;
            amplitudaProgressListener2 = amplitudaProgressListener;
        }
    }

    public AmplitudaProcessingOutput<File> processAudio(File file) {
        return processAudio(file, Compress.getDefault(), Cache.getDefault(), (AmplitudaProgressListener) null);
    }

    public AmplitudaProcessingOutput<Integer> processAudio(int i14, Compress compress, Cache cache, AmplitudaProgressListener amplitudaProgressListener) throws Throwable {
        startProgress(amplitudaProgressListener);
        InputAudio inputAudio = new InputAudio(Integer.valueOf(i14), InputAudio.Type.RESOURCE);
        long jCurrentTimeMillis = System.currentTimeMillis();
        updateProgressOperation(amplitudaProgressListener, ProgressOperation.DECODING);
        File rawFile = this.fileManager.getRawFile(i14, amplitudaProgressListener);
        if (rawFile == null) {
            return errorOutput(new InvalidRawResourceException(), inputAudio, amplitudaProgressListener);
        }
        AmplitudaLogger.logOperationTime("Preparing", jCurrentTimeMillis);
        try {
            AmplitudaResultJNI amplitudaResultJNIProcessFileJNI = processFileJNI(rawFile, inputAudio, compress, cache, amplitudaProgressListener);
            this.fileManager.deleteFile(rawFile);
            return new AmplitudaProcessingOutput<>(amplitudaResultJNIProcessFileJNI, inputAudio);
        } catch (AmplitudaException e4) {
            return errorOutput(e4, inputAudio, amplitudaProgressListener);
        }
    }

    public AmplitudaProcessingOutput<InputStream> processAudio(InputStream inputStream, Compress compress, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        AmplitudaProgressListener amplitudaProgressListener2;
        AmplitudaException amplitudaException;
        startProgress(amplitudaProgressListener);
        InputAudio inputAudio = new InputAudio(inputStream, InputAudio.Type.INPUT_STREAM);
        try {
            updateProgressOperation(amplitudaProgressListener, ProgressOperation.DECODING);
            File inputStreamFile = this.fileManager.getInputStreamFile(inputStream, amplitudaProgressListener);
            if (inputStreamFile == null) {
                try {
                    return errorOutput(new InvalidAudioInputStreamException(), inputAudio, amplitudaProgressListener);
                } catch (AmplitudaException e4) {
                    amplitudaException = e4;
                    amplitudaProgressListener2 = amplitudaProgressListener;
                }
            } else {
                amplitudaProgressListener2 = amplitudaProgressListener;
                try {
                    AmplitudaProcessingOutput<InputStream> amplitudaProcessingOutput = new AmplitudaProcessingOutput<>(processFileJNI(inputStreamFile, inputAudio, compress, cache, amplitudaProgressListener2), (InputAudio<InputStream>) inputAudio);
                    this.fileManager.deleteFile(inputStreamFile);
                    return amplitudaProcessingOutput;
                } catch (AmplitudaException e14) {
                    e = e14;
                }
            }
        } catch (AmplitudaException e15) {
            e = e15;
            amplitudaProgressListener2 = amplitudaProgressListener;
        }
        amplitudaException = e;
        return errorOutput(amplitudaException, inputAudio, amplitudaProgressListener2);
    }

    public AmplitudaProcessingOutput<byte[]> processAudio(byte[] bArr, Compress compress, Cache cache, AmplitudaProgressListener amplitudaProgressListener) {
        AmplitudaProgressListener amplitudaProgressListener2;
        AmplitudaException amplitudaException;
        startProgress(amplitudaProgressListener);
        InputAudio inputAudio = new InputAudio(bArr, InputAudio.Type.BYTE_ARRAY);
        try {
            updateProgressOperation(amplitudaProgressListener, ProgressOperation.DECODING);
            File byteArrayFile = this.fileManager.getByteArrayFile(bArr, amplitudaProgressListener);
            if (byteArrayFile == null) {
                try {
                    return errorOutput(new InvalidAudioByteArrayException(), inputAudio, amplitudaProgressListener);
                } catch (AmplitudaException e4) {
                    amplitudaException = e4;
                    amplitudaProgressListener2 = amplitudaProgressListener;
                }
            } else {
                amplitudaProgressListener2 = amplitudaProgressListener;
                try {
                    AmplitudaProcessingOutput<byte[]> amplitudaProcessingOutput = new AmplitudaProcessingOutput<>(processFileJNI(byteArrayFile, inputAudio, compress, cache, amplitudaProgressListener2), (InputAudio<byte[]>) inputAudio);
                    this.fileManager.deleteFile(byteArrayFile);
                    return amplitudaProcessingOutput;
                } catch (AmplitudaException e14) {
                    e = e14;
                }
            }
        } catch (AmplitudaException e15) {
            e = e15;
            amplitudaProgressListener2 = amplitudaProgressListener;
        }
        amplitudaException = e;
        return errorOutput(amplitudaException, inputAudio, amplitudaProgressListener2);
    }
}
