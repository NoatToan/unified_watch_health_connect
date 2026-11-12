package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ObservableInputStream extends ProxyInputStream {
    private final List<Observer> observers;

    public static abstract class Observer {
        public void closed() {
        }

        public void data(int i14) {
        }

        public void data(byte[] bArr, int i14, int i15) {
        }

        public void error(IOException iOException) throws IOException {
            throw iOException;
        }

        public void finished() {
        }
    }

    public ObservableInputStream(InputStream inputStream) {
        super(inputStream);
        this.observers = new ArrayList();
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            e = null;
        } catch (IOException e4) {
            e = e4;
        }
        if (e == null) {
            noteClosed();
        } else {
            noteError(e);
        }
    }

    public void consume() {
        while (read(new byte[8192]) != -1) {
        }
    }

    public List<Observer> getObservers() {
        return this.observers;
    }

    public void noteClosed() {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().closed();
        }
    }

    public void noteDataByte(int i14) {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(i14);
        }
    }

    public void noteDataBytes(byte[] bArr, int i14, int i15) {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(bArr, i14, i15);
        }
    }

    public void noteError(IOException iOException) throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().error(iOException);
        }
    }

    public void noteFinished() {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().finished();
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i14;
        try {
            i14 = super.read(bArr);
            e = null;
        } catch (IOException e4) {
            e = e4;
            i14 = 0;
        }
        if (e != null) {
            noteError(e);
        } else if (i14 == -1) {
            noteFinished();
        } else if (i14 > 0) {
            noteDataBytes(bArr, 0, i14);
        }
        return i14;
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void removeAllObservers() {
        this.observers.clear();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i14;
        try {
            i14 = super.read();
            e = null;
        } catch (IOException e4) {
            e = e4;
            i14 = 0;
        }
        if (e != null) {
            noteError(e);
        } else if (i14 == -1) {
            noteFinished();
        } else {
            noteDataByte(i14);
        }
        return i14;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        int i16;
        try {
            i16 = super.read(bArr, i14, i15);
            e = null;
        } catch (IOException e4) {
            e = e4;
            i16 = 0;
        }
        if (e != null) {
            noteError(e);
        } else if (i16 == -1) {
            noteFinished();
        } else if (i16 > 0) {
            noteDataBytes(bArr, i14, i16);
        }
        return i16;
    }
}
