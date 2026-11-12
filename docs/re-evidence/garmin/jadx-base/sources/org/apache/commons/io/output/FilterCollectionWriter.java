package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOExceptionList;
import org.apache.commons.io.IOIndexedException;

/* JADX INFO: loaded from: classes3.dex */
public class FilterCollectionWriter extends Writer {
    protected final Collection<Writer> EMPTY_WRITERS;
    protected final Collection<Writer> writers;

    public FilterCollectionWriter(Writer... writerArr) {
        List list = Collections.EMPTY_LIST;
        this.EMPTY_WRITERS = list;
        this.writers = writerArr != null ? Arrays.asList(writerArr) : list;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c14) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(c14);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i14, e4));
                }
            }
            i14++;
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        throw new IOExceptionList(arrayList);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i14, e4));
                }
            }
            i14++;
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.flush();
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i14, e4));
                }
            }
            i14++;
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i14, int i15) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr, i14, i15);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i16, e4));
                }
            }
            i16++;
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    public FilterCollectionWriter(Collection<Writer> collection) {
        List list = Collections.EMPTY_LIST;
        this.EMPTY_WRITERS = list;
        this.writers = collection == null ? list : collection;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i14, e4));
                }
            }
            i14++;
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i14, e4));
                }
            }
            i14++;
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        throw new IOExceptionList(arrayList);
    }

    @Override // java.io.Writer
    public void write(int i14) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(i14);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i15, e4));
                }
            }
            i15++;
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i14, int i15) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence, i14, i15);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i16, e4));
                }
            }
            i16++;
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        throw new IOExceptionList(arrayList);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i14, e4));
                }
            }
            i14++;
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i14, int i15) throws IOExceptionList {
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str, i14, i15);
                } catch (IOException e4) {
                    arrayList.add(new IOIndexedException(i16, e4));
                }
            }
            i16++;
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }
}
