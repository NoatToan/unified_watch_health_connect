package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ConnectionModel {
    public static final String CURRENT_OFFSET = "currentOffset";
    public static final String END_OFFSET = "endOffset";
    public static final String ID = "id";
    public static final String INDEX = "connectionIndex";
    public static final String START_OFFSET = "startOffset";
    private int a;
    private int b;
    private long c;
    private long d;
    private long e;

    public static long getTotalOffset(List<ConnectionModel> list) {
        long currentOffset = 0;
        for (ConnectionModel connectionModel : list) {
            currentOffset += connectionModel.getCurrentOffset() - connectionModel.getStartOffset();
        }
        return currentOffset;
    }

    public long getCurrentOffset() {
        return this.d;
    }

    public long getEndOffset() {
        return this.e;
    }

    public int getId() {
        return this.a;
    }

    public int getIndex() {
        return this.b;
    }

    public long getStartOffset() {
        return this.c;
    }

    public void setCurrentOffset(long j) {
        this.d = j;
    }

    public void setEndOffset(long j) {
        this.e = j;
    }

    public void setId(int i) {
        this.a = i;
    }

    public void setIndex(int i) {
        this.b = i;
    }

    public void setStartOffset(long j) {
        this.c = j;
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(this.a));
        contentValues.put(INDEX, Integer.valueOf(this.b));
        contentValues.put(START_OFFSET, Long.valueOf(this.c));
        contentValues.put(CURRENT_OFFSET, Long.valueOf(this.d));
        contentValues.put(END_OFFSET, Long.valueOf(this.e));
        return contentValues;
    }

    public String toString() {
        return FileDownloadUtils.formatString("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.e), Long.valueOf(this.d));
    }
}
