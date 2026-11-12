package com.ximalaya.ting.android.opensdk.model.live.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.live.program.Program;

/* JADX INFO: loaded from: classes22.dex */
public class Schedule extends PlayableModel implements Parcelable {
    public static final Parcelable.Creator<Schedule> CREATOR = new Parcelable.Creator<Schedule>() { // from class: com.ximalaya.ting.android.opensdk.model.live.schedule.Schedule.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Schedule createFromParcel(Parcel parcel) {
            Schedule schedule = new Schedule();
            schedule.readFromParcel(parcel);
            return schedule;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Schedule[] newArray(int i) {
            return new Schedule[i];
        }
    };

    @SerializedName("end_time")
    private String endTime;

    @SerializedName("listen_back_url")
    private String listenBackUrl;

    @SerializedName("radio_id")
    private long radioId;
    private String radioName;
    private int radioPlayCount;

    @SerializedName("related_program")
    private Program relatedProgram;

    @SerializedName("start_time")
    private String startTime;

    @SerializedName("update_at")
    private long updateAt;

    @Override // com.ximalaya.ting.android.opensdk.model.PlayableModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getListenBackUrl() {
        return this.listenBackUrl;
    }

    public long getRadioId() {
        return this.radioId;
    }

    public String getRadioName() {
        return this.radioName;
    }

    public int getRadioPlayCount() {
        return this.radioPlayCount;
    }

    public String getRealBeginTime() {
        int length;
        return (TextUtils.isEmpty(this.startTime) || (length = this.startTime.split(":").length) <= 2) ? this.startTime : this.startTime.split(":", length - 1)[length - 2];
    }

    public String getRealOverTime() {
        int length;
        return (TextUtils.isEmpty(this.endTime) || (length = this.endTime.split(":").length) <= 2) ? this.endTime : this.endTime.split(":", length - 1)[length - 2];
    }

    public Program getRelatedProgram() {
        return this.relatedProgram;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public long getUpdateAt() {
        return this.updateAt;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.PlayableModel
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        setStartTime(parcel.readString());
        setEndTime(parcel.readString());
        setRadioId(parcel.readLong());
        setRelatedProgram((Program) parcel.readParcelable(Schedule.class.getClassLoader()));
        setRadioName(parcel.readString());
        setRadioPlayCount(parcel.readInt());
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setListenBackUrl(String str) {
        this.listenBackUrl = str;
    }

    public void setRadioId(long j) {
        this.radioId = j;
    }

    public void setRadioName(String str) {
        this.radioName = str;
    }

    public void setRadioPlayCount(int i) {
        this.radioPlayCount = i;
    }

    public void setRelatedProgram(Program program) {
        this.relatedProgram = program;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setUpdateAt(long j) {
        this.updateAt = j;
    }

    @Override // com.ximalaya.ting.android.opensdk.model.PlayableModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeLong(this.radioId);
        parcel.writeParcelable(this.relatedProgram, 0);
        parcel.writeString(this.radioName);
        parcel.writeInt(this.radioPlayCount);
    }
}
