package com.huawei.health.threeCircle.remind.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceEventData implements Parcelable {
    public static final Parcelable.Creator<DeviceEventData> CREATOR = new Parcelable.Creator<DeviceEventData>() { // from class: com.huawei.health.threeCircle.remind.model.DeviceEventData.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceEventData createFromParcel(Parcel parcel) {
            return new DeviceEventData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceEventData[] newArray(int i) {
            return new DeviceEventData[i];
        }
    };
    private static final int DEFAULT_VALUE = 255;
    private int mAchieveNum;
    private int mAvgActiveCalorie;
    private int mAvgActiveHour;
    private int mAvgStrengthTime;
    private int mCompletedDayNum;
    private int mEventId;
    private int mGoalType;
    private int mNoCompletedDayNum;
    private int mSmartActiveCalorieGoal;
    private long mTimeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceEventData(Parcel parcel) {
        this.mTimeStamp = parcel.readLong();
        this.mEventId = parcel.readInt();
        this.mGoalType = parcel.readInt();
        this.mAchieveNum = parcel.readInt();
        this.mAvgActiveCalorie = parcel.readInt();
        this.mAvgStrengthTime = parcel.readInt();
        this.mAvgActiveHour = parcel.readInt();
        this.mCompletedDayNum = parcel.readInt();
        this.mNoCompletedDayNum = parcel.readInt();
        this.mSmartActiveCalorieGoal = parcel.readInt();
    }

    private DeviceEventData(c cVar) {
        this.mTimeStamp = cVar.h;
        this.mEventId = cVar.j;
        this.mGoalType = cVar.g;
        this.mAchieveNum = cVar.f10240b;
        this.mAvgActiveCalorie = cVar.f10241c;
        this.mAvgStrengthTime = cVar.e;
        this.mAvgActiveHour = cVar.d;
        this.mCompletedDayNum = cVar.f10239a;
        this.mNoCompletedDayNum = cVar.f;
        this.mSmartActiveCalorieGoal = cVar.i;
    }

    public static final class c {
        private int g;
        private long h;
        private int j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10240b = 255;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10241c = Integer.MAX_VALUE;
        private int e = Integer.MAX_VALUE;
        private int d = 255;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10239a = 255;
        private int f = 255;
        private int i = Integer.MAX_VALUE;

        public DeviceEventData a() {
            return new DeviceEventData(this);
        }

        public c e(long j) {
            this.h = j;
            return this;
        }

        public c h(int i) {
            this.j = i;
            return this;
        }

        public c g(int i) {
            this.g = i;
            return this;
        }

        public c b(int i) {
            this.f10240b = i;
            return this;
        }

        public c d(int i) {
            this.f10241c = i;
            return this;
        }

        public c e(int i) {
            this.e = i;
            return this;
        }

        public c c(int i) {
            this.d = i;
            return this;
        }

        public c a(int i) {
            this.f10239a = i;
            return this;
        }

        public c j(int i) {
            this.f = i;
            return this;
        }

        public c f(int i) {
            this.i = i;
            return this;
        }
    }

    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    public int getEventId() {
        return this.mEventId;
    }

    public int getGoalType() {
        return this.mGoalType;
    }

    public int getAchieveNum() {
        return this.mAchieveNum;
    }

    public int getAvgActiveCalorie() {
        return this.mAvgActiveCalorie;
    }

    public int getAvgStrengthTime() {
        return this.mAvgStrengthTime;
    }

    public int getAvgActiveHour() {
        return this.mAvgActiveHour;
    }

    public int getSmartActiveCalorieGoal() {
        return this.mSmartActiveCalorieGoal;
    }

    public int getCompletedDayNum() {
        return this.mCompletedDayNum;
    }

    public int getNoCompletedDayNum() {
        return this.mNoCompletedDayNum;
    }

    public byte[] getBytes() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt((int) this.mTimeStamp);
        byteBufferAllocate.put((byte) this.mEventId);
        byteBufferAllocate.put((byte) this.mGoalType);
        byteBufferAllocate.put((byte) this.mAchieveNum);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putInt(this.mAvgActiveCalorie);
        byteBufferAllocate.putInt(this.mAvgStrengthTime);
        byteBufferAllocate.put((byte) this.mAvgActiveHour);
        byteBufferAllocate.put((byte) this.mCompletedDayNum);
        byteBufferAllocate.put((byte) this.mNoCompletedDayNum);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putInt(this.mSmartActiveCalorieGoal);
        byteBufferAllocate.flip();
        return byteBufferAllocate.array();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mTimeStamp);
        parcel.writeInt(this.mEventId);
        parcel.writeInt(this.mGoalType);
        parcel.writeInt(this.mAchieveNum);
        parcel.writeInt(this.mAvgActiveCalorie);
        parcel.writeInt(this.mAvgStrengthTime);
        parcel.writeInt(this.mAvgActiveHour);
        parcel.writeInt(this.mCompletedDayNum);
        parcel.writeInt(this.mNoCompletedDayNum);
        parcel.writeInt(this.mSmartActiveCalorieGoal);
    }
}
