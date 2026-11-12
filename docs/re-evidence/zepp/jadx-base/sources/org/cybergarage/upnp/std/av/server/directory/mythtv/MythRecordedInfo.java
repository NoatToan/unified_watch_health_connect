package org.cybergarage.upnp.std.av.server.directory.mythtv;

import java.io.File;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class MythRecordedInfo {
    private static final String NUV_FILE_DATE_FORMAT = "yyyyMMddHHmmss";
    private static final String NUV_FILE_EXT = "nuv";
    private String category;
    private int chanID;
    private String description;
    private long endTime;
    private String fname;
    private long fsize;
    private String recGroup;
    private String recordFilePrefix;
    private int recordID;
    private long startTime;
    private String subTitle;
    private String title;

    public String getCategory() {
        return this.category;
    }

    public int getChanID() {
        return this.chanID;
    }

    public String getDescription() {
        return this.description;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public File getFile() {
        return new File(getRecordFilePrefix() + getFileName());
    }

    public String getFileName() {
        return this.fname;
    }

    public long getFileSize() {
        return this.fsize;
    }

    public String getRecGroup() {
        return this.recGroup;
    }

    public String getRecordFilePrefix() {
        return this.recordFilePrefix;
    }

    public int getRecordID() {
        return this.recordID;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void print() {
        Debug.message("title = " + getTitle());
        Debug.message("subTitle = " + getSubTitle());
        Debug.message("file = " + getFile());
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setChanID(int i) {
        this.chanID = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setFileName(String str) {
        this.fname = str;
    }

    public void setFileSize(long j) {
        this.fsize = j;
    }

    public void setRecGroup(String str) {
        this.recGroup = str;
    }

    public void setRecordFilePrefix(String str) {
        this.recordFilePrefix = str;
    }

    public void setRecordID(int i) {
        this.recordID = i;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
