package com.huawei.health.h5pro.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProCommand implements Parcelable {
    public static final int CMD_LOAD = 2;
    public static final Parcelable.Creator<H5ProCommand> CREATOR = new Parcelable.Creator<H5ProCommand>() { // from class: com.huawei.health.h5pro.core.H5ProCommand.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public H5ProCommand createFromParcel(Parcel parcel) {
            H5ProCommand h5ProCommand = new H5ProCommand();
            h5ProCommand.command = parcel.readInt();
            h5ProCommand.packageName = parcel.readString();
            h5ProCommand.url = parcel.readString();
            h5ProCommand.launchOption = (H5ProLaunchOption) parcel.readParcelable(getClass().getClassLoader());
            h5ProCommand.isEmbedded = parcel.readByte() != 0;
            return h5ProCommand;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public H5ProCommand[] newArray(int i) {
            return new H5ProCommand[i];
        }
    };
    private int command;
    private boolean isEmbedded;
    private H5ProLaunchOption launchOption;
    private String packageName;
    private String url;

    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6729b;
        private String d;
        private H5ProLaunchOption e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6728a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6730c = false;

        public H5ProCommand build() {
            return new H5ProCommand(this);
        }

        public int getCommand() {
            return this.f6728a;
        }

        public H5ProLaunchOption getLaunchOption() {
            return this.e;
        }

        public String getPackageName() {
            return this.d;
        }

        public String getUrl() {
            return this.f6729b;
        }

        public boolean isEmbedded() {
            return this.f6730c;
        }

        public Builder setEmbedded() {
            this.f6730c = true;
            return this;
        }

        public Builder setLaunchOption(H5ProLaunchOption h5ProLaunchOption) {
            this.e = h5ProLaunchOption;
            return this;
        }

        public Builder setPackageName(String str) {
            this.d = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.f6729b = str;
            return this;
        }

        public Builder setupLoad() {
            this.f6728a = 2;
            return this;
        }
    }

    public H5ProCommand() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCommand() {
        return this.command;
    }

    public H5ProLaunchOption getLaunchOption() {
        return this.launchOption;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isEmbedded() {
        return this.isEmbedded;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.command);
        parcel.writeString(this.packageName);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.launchOption, i);
        parcel.writeByte(this.isEmbedded ? (byte) 1 : (byte) 0);
    }

    public H5ProCommand(Builder builder) {
        this.command = builder.getCommand();
        this.packageName = builder.getPackageName();
        this.url = builder.getUrl();
        this.launchOption = builder.getLaunchOption();
        this.isEmbedded = builder.f6730c;
    }
}
