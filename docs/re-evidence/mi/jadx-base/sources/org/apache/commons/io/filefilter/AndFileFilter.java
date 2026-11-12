package org.apache.commons.io.filefilter;

import defpackage.r00;
import defpackage.yuc;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class AndFileFilter extends r00 implements Serializable {
    private final List<yuc> fileFilters;

    public AndFileFilter() {
        this.fileFilters = new ArrayList();
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FileFilter
    public boolean accept(File file) {
        if (this.fileFilters.isEmpty()) {
            return false;
        }
        Iterator<yuc> it = this.fileFilters.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file)) {
                return false;
            }
        }
        return true;
    }

    public void addFileFilter(yuc yucVar) {
        this.fileFilters.add(yucVar);
    }

    public List<yuc> getFileFilters() {
        return Collections.unmodifiableList(this.fileFilters);
    }

    public boolean removeFileFilter(yuc yucVar) {
        return this.fileFilters.remove(yucVar);
    }

    public void setFileFilters(List<yuc> list) {
        this.fileFilters.clear();
        this.fileFilters.addAll(list);
    }

    @Override // defpackage.r00
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.fileFilters != null) {
            for (int i = 0; i < this.fileFilters.size(); i++) {
                if (i > 0) {
                    sb.append(",");
                }
                yuc yucVar = this.fileFilters.get(i);
                sb.append(yucVar == null ? AbstractJsonLexerKt.NULL : yucVar.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public AndFileFilter(List<yuc> list) {
        if (list == null) {
            this.fileFilters = new ArrayList();
        } else {
            this.fileFilters = new ArrayList(list);
        }
    }

    @Override // defpackage.r00, defpackage.yuc, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (this.fileFilters.isEmpty()) {
            return false;
        }
        Iterator<yuc> it = this.fileFilters.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    public AndFileFilter(yuc yucVar, yuc yucVar2) {
        if (yucVar != null && yucVar2 != null) {
            this.fileFilters = new ArrayList(2);
            addFileFilter(yucVar);
            addFileFilter(yucVar2);
            return;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }
}
