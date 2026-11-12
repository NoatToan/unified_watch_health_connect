package com.huami.assistant.model.bean;

import android.util.SparseArray;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.huami.watch.companion.device.config.Features;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
@Table(name = "updates")
public class Update extends Model implements Cloneable {
    public static final SparseArray<String> ALL_TYPES = new a();
    public static final String COLUMN_DATA = "data";
    public static final String COLUMN_DATA1 = "data1";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_END_TIME = "end_time";
    public static final String COLUMN_START_TIME = "start_time";
    public static final String COLUMN_STATE = "state";
    public static final String COLUMN_SYNC_ID = "sync_id";
    public static final String COLUMN_SYNC_STATE = "sync_state";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_TYPE = "type";
    public static final int STATE_DELETED = 4;
    public static final int STATE_NEED_DELETE = 3;
    public static final int STATE_NEED_DELETE_FROM_SERVER = 6;
    public static final int STATE_NEED_SYNC = 1;
    public static final int STATE_NEED_SYNC_TO_SERVER = 5;
    public static final int STATE_SYNCED = 2;
    public static final int TYPE_ALARM = 1;
    public static final int TYPE_EVENT = 2;
    public static final int TYPE_EVENT_OCR = 201;
    public static final int TYPE_EVENT_OCR_TRAIN = 202;
    public static final int TYPE_EXPRESS = 6;
    public static final int TYPE_FLIGHT = 5;
    public static final int TYPE_MESSAGE = 3;
    public static final int TYPE_MSG_CINEMA_TICKET = 301;
    public static final int TYPE_MSG_DIDI = 302;
    public static final int TYPE_MSG_FLIGHT = 304;
    public static final int TYPE_MSG_TRAIN = 303;
    public static final int TYPE_NOTE = 4;

    @Column(name = "state")
    private int a;

    @Column(name = "data")
    public String data;

    @Column(name = COLUMN_DATA1)
    public String data1;

    @Column(name = "description")
    public String description;

    @Column(name = "end_time")
    public long endTime;

    @Column(name = "start_time")
    public long startTime;

    @Column(name = COLUMN_SYNC_ID)
    public String syncId;

    @Column(name = COLUMN_SYNC_STATE)
    public int syncState;

    @Column(name = "title")
    public String title;

    @Column(name = "type")
    public int type;

    public class a extends SparseArray<String> {
        public a() {
            append(1, Features.ALARM);
            append(2, "Event");
            append(301, "Cinema");
            append(302, "Didi");
            append(303, "Train");
            append(304, "Flight");
        }
    }

    @Override // com.activeandroid.Model
    public boolean equals(Object obj) {
        return (obj == null || !(obj instanceof Update)) ? super.equals(obj) : toString().equals(obj.toString());
    }

    public boolean hasPin() {
        return this.a == 1;
    }

    public void setPin(boolean z) {
        this.a = z ? 1 : 0;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "<Id: " + getId() + ", type: " + this.type + ", title: '" + this.title + "', description: '" + this.description + "', startTime: " + this.startTime + ", endTime: " + this.endTime + ", data: '" + this.data + "', data1: '" + this.data1 + "', syncId: '" + this.syncId + "', syncState: " + this.syncState + ", state: " + this.a + Typography.greater;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Update m3325clone() throws CloneNotSupportedException {
        return (Update) super.clone();
    }
}
