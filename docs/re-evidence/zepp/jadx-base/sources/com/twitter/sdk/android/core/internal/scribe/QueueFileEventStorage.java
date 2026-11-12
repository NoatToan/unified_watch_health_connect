package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class QueueFileEventStorage implements EventsStorage {
    private final Context a;
    private final File b;
    private final String c;
    private final File d;
    private QueueFile e;
    private File f;

    public QueueFileEventStorage(Context context, File file, String str, String str2) throws IOException {
        this.a = context;
        this.b = file;
        this.c = str2;
        File file2 = new File(file, str);
        this.d = file2;
        this.e = new QueueFile(file2);
        a();
    }

    private void a() {
        File file = new File(this.b, this.c);
        this.f = file;
        if (file.exists()) {
            return;
        }
        this.f.mkdirs();
    }

    private void b(File file, File file2) throws Throwable {
        OutputStream outputStream;
        FileInputStream fileInputStream = null;
        OutputStream moveOutputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                moveOutputStream = getMoveOutputStream(file2);
                CommonUtils.copyStream(fileInputStream2, moveOutputStream, new byte[1024]);
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close file input stream");
                CommonUtils.closeOrLog(moveOutputStream, "Failed to close output stream");
                file.delete();
            } catch (Throwable th) {
                th = th;
                outputStream = moveOutputStream;
                fileInputStream = fileInputStream2;
                CommonUtils.closeOrLog(fileInputStream, "Failed to close file input stream");
                CommonUtils.closeOrLog(outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public void add(byte[] bArr) throws IOException {
        this.e.add(bArr);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public boolean canWorkingFileStore(int i, int i2) {
        return this.e.hasSpaceFor(i, i2);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public void deleteFilesInRollOverDirectory(List<File> list) {
        for (File file : list) {
            CommonUtils.logControlled(this.a, String.format("deleting sent analytics file %s", file.getName()));
            file.delete();
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public void deleteWorkingFile() {
        try {
            this.e.close();
        } catch (IOException unused) {
        }
        this.d.delete();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public List<File> getAllFilesInRollOverDirectory() {
        return Arrays.asList(this.f.listFiles());
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public List<File> getBatchOfFilesToSend(int i) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    public OutputStream getMoveOutputStream(File file) throws IOException {
        return new FileOutputStream(file);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public File getRollOverDirectory() {
        return this.f;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public File getWorkingDirectory() {
        return this.b;
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public int getWorkingFileUsedSizeInBytes() {
        return this.e.usedBytes();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public boolean isWorkingFileEmpty() {
        return this.e.isEmpty();
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.EventsStorage
    public void rollOver(String str) throws Throwable {
        this.e.close();
        b(this.d, new File(this.f, str));
        this.e = new QueueFile(this.d);
    }
}
