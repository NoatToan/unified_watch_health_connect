package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.mqk;
import java.io.File;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MultiFileResource extends MultiResource {
    private static final long serialVersionUID = 1;

    public MultiFileResource(Collection<File> collection) {
        super(new mqk[0]);
        add(collection);
    }

    @Override // cn.hutool.core.io.resource.MultiResource, defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public MultiFileResource add(File... fileArr) {
        for (File file : fileArr) {
            add((mqk) new FileResource(file));
        }
        return this;
    }

    public MultiFileResource(File... fileArr) {
        super(new mqk[0]);
        add(fileArr);
    }

    public MultiFileResource add(Collection<File> collection) {
        Iterator<File> it = collection.iterator();
        while (it.hasNext()) {
            add((mqk) new FileResource(it.next()));
        }
        return this;
    }

    @Override // cn.hutool.core.io.resource.MultiResource
    public MultiFileResource add(mqk mqkVar) {
        return (MultiFileResource) super.add(mqkVar);
    }
}
