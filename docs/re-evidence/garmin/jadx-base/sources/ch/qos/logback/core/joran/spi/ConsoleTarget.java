package ch.qos.logback.core.joran.spi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public enum ConsoleTarget {
    SystemOut("System.out", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.1
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.out.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i14) {
            System.out.write(i14);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i14, int i15) {
            System.out.write(bArr, i14, i15);
        }
    }),
    SystemErr("System.err", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.2
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.err.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i14) {
            System.err.write(i14);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.err.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i14, int i15) {
            System.err.write(bArr, i14, i15);
        }
    });

    private final String name;
    private final OutputStream stream;

    ConsoleTarget(String str, OutputStream outputStream) {
        this.name = str;
        this.stream = outputStream;
    }

    public static ConsoleTarget findByName(String str) {
        for (ConsoleTarget consoleTarget : values()) {
            if (consoleTarget.name.equalsIgnoreCase(str)) {
                return consoleTarget;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public OutputStream getStream() {
        return this.stream;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
