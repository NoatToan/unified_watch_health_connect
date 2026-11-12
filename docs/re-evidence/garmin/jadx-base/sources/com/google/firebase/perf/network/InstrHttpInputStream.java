package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class InstrHttpInputStream extends InputStream {
    private final InputStream inputStream;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private long timeToResponseInitiated;
    private final Timer timer;
    private long bytesRead = -1;
    private long timeToResponseLastRead = -1;

    public InstrHttpInputStream(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.timer = timer;
        this.inputStream = inputStream;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timeToResponseInitiated = networkRequestMetricBuilder.getTimeToResponseInitiatedMicros();
    }

    private void incrementBytesRead(long j8) {
        long j14 = this.bytesRead;
        if (j14 == -1) {
            this.bytesRead = j8;
        } else {
            this.bytesRead = j14 + j8;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.inputStream.available();
        } catch (IOException e4) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e4;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long durationMicros = this.timer.getDurationMicros();
        if (this.timeToResponseLastRead == -1) {
            this.timeToResponseLastRead = durationMicros;
        }
        try {
            this.inputStream.close();
            long j8 = this.bytesRead;
            if (j8 != -1) {
                this.networkMetricBuilder.setResponsePayloadBytes(j8);
            }
            long j14 = this.timeToResponseInitiated;
            if (j14 != -1) {
                this.networkMetricBuilder.setTimeToResponseInitiatedMicros(j14);
            }
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timeToResponseLastRead);
            this.networkMetricBuilder.build();
        } catch (IOException e4) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i14) {
        this.inputStream.mark(i14);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.inputStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i14 = this.inputStream.read();
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (i14 != -1 || this.timeToResponseLastRead != -1) {
                incrementBytesRead(1L);
                this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
                return i14;
            }
            this.timeToResponseLastRead = durationMicros;
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
            this.networkMetricBuilder.build();
            return i14;
        } catch (IOException e4) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.inputStream.reset();
        } catch (IOException e4) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        try {
            long jSkip = this.inputStream.skip(j8);
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (jSkip == 0 && j8 != 0 && this.timeToResponseLastRead == -1) {
                this.timeToResponseLastRead = durationMicros;
                this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
                return jSkip;
            }
            incrementBytesRead(jSkip);
            this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
            return jSkip;
        } catch (IOException e4) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        try {
            int i16 = this.inputStream.read(bArr, i14, i15);
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (i16 == -1 && this.timeToResponseLastRead == -1) {
                this.timeToResponseLastRead = durationMicros;
                this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
                this.networkMetricBuilder.build();
                return i16;
            }
            incrementBytesRead(i16);
            this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
            return i16;
        } catch (IOException e4) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i14 = this.inputStream.read(bArr);
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (i14 == -1 && this.timeToResponseLastRead == -1) {
                this.timeToResponseLastRead = durationMicros;
                this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
                this.networkMetricBuilder.build();
                return i14;
            }
            incrementBytesRead(i14);
            this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
            return i14;
        } catch (IOException e4) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e4;
        }
    }
}
