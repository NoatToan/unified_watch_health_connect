package com.xiaomi.smarthome.core.entity.externalload;

import java.io.File;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class LoadInfo {
    private File file;
    private float progress;
    private int status;

    public LoadInfo(int i) {
        this.status = i;
    }

    public File getFile() {
        return this.file;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getStatus() {
        return this.status;
    }

    public LoadInfo setFile(File file) {
        this.file = file;
        return this;
    }

    public LoadInfo setProgress(float f) {
        this.progress = f;
        return this;
    }

    public LoadInfo setStatus(int i) {
        this.status = i;
        return this;
    }

    public String toString() {
        return "LoadInfo{status=" + this.status + ", file=" + this.file + ", progress=" + this.progress + AbstractJsonLexerKt.END_OBJ;
    }
}
