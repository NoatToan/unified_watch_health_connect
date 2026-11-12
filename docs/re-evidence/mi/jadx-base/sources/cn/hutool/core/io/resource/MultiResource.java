package cn.hutool.core.io.resource;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.IORuntimeException;
import defpackage.mqk;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MultiResource implements mqk, Iterable<mqk>, Iterator<mqk>, Serializable {
    private static final long serialVersionUID = 1;
    private int cursor;
    private final List<mqk> resources;

    public MultiResource(mqk... mqkVarArr) {
        this(CollUtil.p(mqkVarArr));
    }

    public MultiResource add(mqk mqkVar) {
        this.resources.add(mqkVar);
        return this;
    }

    @Override // defpackage.mqk
    public String getName() {
        return this.resources.get(this.cursor).getName();
    }

    @Override // defpackage.mqk
    public BufferedReader getReader(Charset charset) {
        return this.resources.get(this.cursor).getReader(charset);
    }

    @Override // defpackage.mqk
    public InputStream getStream() {
        return this.resources.get(this.cursor).getStream();
    }

    @Override // defpackage.mqk
    public URL getUrl() {
        return this.resources.get(this.cursor).getUrl();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.cursor < this.resources.size();
    }

    @Override // java.lang.Iterable
    public Iterator<mqk> iterator() {
        return this.resources.iterator();
    }

    @Override // java.util.Iterator
    public synchronized mqk next() {
        if (this.cursor >= this.resources.size()) {
            throw new ConcurrentModificationException();
        }
        this.cursor++;
        return this;
    }

    @Override // defpackage.mqk
    public byte[] readBytes() throws IORuntimeException {
        return this.resources.get(this.cursor).readBytes();
    }

    @Override // defpackage.mqk
    public String readStr(Charset charset) throws IORuntimeException {
        return this.resources.get(this.cursor).readStr(charset);
    }

    @Override // defpackage.mqk
    public String readUtf8Str() throws IORuntimeException {
        return this.resources.get(this.cursor).readUtf8Str();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.resources.remove(this.cursor);
    }

    public synchronized void reset() {
        this.cursor = 0;
    }

    @Override // defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public MultiResource(Collection<mqk> collection) {
        if (collection instanceof List) {
            this.resources = (List) collection;
        } else {
            this.resources = CollUtil.n(collection);
        }
    }
}
