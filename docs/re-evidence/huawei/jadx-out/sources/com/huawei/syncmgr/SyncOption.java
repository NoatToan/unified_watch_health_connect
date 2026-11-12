package com.huawei.syncmgr;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class SyncOption implements Parcelable {
    public static final Parcelable.Creator<SyncOption> CREATOR = new Parcelable.Creator<SyncOption>() { // from class: com.huawei.syncmgr.SyncOption.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SyncOption createFromParcel(Parcel parcel) {
            return new SyncOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SyncOption[] newArray(int i) {
            return new SyncOption[i];
        }
    };
    private static final String END_TIME = "endTime";
    private static final String IS_MANUAL_SYNC = "isManualSync";
    private static final String IS_NIGHT_CHECK = "isNightCheck";
    private static final String IS_TEMPERATURE_CHECK = "isTemperatureCheck";
    private static final String MODE = "mode";
    private static final String START_TIME = "startTime";
    private final ContentValues mValueHolder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected SyncOption(Parcel parcel) {
        this.mValueHolder = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
    }

    private SyncOption(ContentValues contentValues) {
        this.mValueHolder = contentValues;
    }

    public boolean isManualSync() {
        return getBooleanValue(IS_MANUAL_SYNC);
    }

    public boolean isNightCheck() {
        return getBooleanValue(IS_NIGHT_CHECK);
    }

    public boolean isTemperatureCheck() {
        return getBooleanValue(IS_TEMPERATURE_CHECK);
    }

    public int getMode(int i) {
        ContentValues contentValues = this.mValueHolder;
        return (contentValues == null || !contentValues.containsKey("mode") || this.mValueHolder.getAsInteger("mode") == null) ? i : this.mValueHolder.getAsInteger("mode").intValue();
    }

    public long getStartTime() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null || !contentValues.containsKey("startTime") || this.mValueHolder.getAsLong("startTime") == null) {
            return 0L;
        }
        return this.mValueHolder.getAsLong("startTime").longValue();
    }

    public long getEndTime() {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null || !contentValues.containsKey("endTime")) {
            return System.currentTimeMillis();
        }
        if (this.mValueHolder.getAsLong("endTime") == null) {
            return System.currentTimeMillis();
        }
        return this.mValueHolder.getAsLong("endTime").longValue();
    }

    public String getCustomParameter(String str) {
        return getString(str);
    }

    private boolean getBooleanValue(String str) {
        ContentValues contentValues = this.mValueHolder;
        if (contentValues == null || !contentValues.containsKey(str) || this.mValueHolder.getAsBoolean(str) == null) {
            return false;
        }
        return this.mValueHolder.getAsBoolean(str).booleanValue();
    }

    public String getString(String str) {
        return this.mValueHolder.getAsString(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mValueHolder, i);
    }

    public static b builder() {
        return new b();
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ContentValues f23172c;

        public SyncOption c() {
            return new SyncOption(e());
        }

        public b d(boolean z) {
            e().put(SyncOption.IS_MANUAL_SYNC, Boolean.valueOf(z));
            return this;
        }

        public b c(boolean z) {
            e().put(SyncOption.IS_NIGHT_CHECK, Boolean.valueOf(z));
            return this;
        }

        public b a(boolean z) {
            e().put(SyncOption.IS_TEMPERATURE_CHECK, Boolean.valueOf(z));
            return this;
        }

        public b c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        private ContentValues e() {
            if (this.f23172c == null) {
                this.f23172c = new ContentValues();
            }
            return this.f23172c;
        }
    }

    public String toString() {
        return "CoreSleepSyncOption {mValueHolder = " + this.mValueHolder + '}';
    }
}
