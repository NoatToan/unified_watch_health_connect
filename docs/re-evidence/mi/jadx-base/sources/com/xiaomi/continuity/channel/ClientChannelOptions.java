package com.xiaomi.continuity.channel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ClientChannelOptions implements Parcelable {
    public static final Parcelable.Creator<ClientChannelOptions> CREATOR = new a();
    private int connectMediumType;
    private int protocolType;
    private int timeout;
    private int trustLevel;

    public class a implements Parcelable.Creator<ClientChannelOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClientChannelOptions createFromParcel(Parcel parcel) {
            return new ClientChannelOptions(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClientChannelOptions[] newArray(int i) {
            return new ClientChannelOptions[i];
        }
    }

    public ClientChannelOptions() {
    }

    private ClientChannelOptions(Parcel parcel) {
        this.connectMediumType = parcel.readInt();
        this.trustLevel = parcel.readInt();
        this.timeout = parcel.readInt();
        this.protocolType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnectMediumType() {
        return this.connectMediumType;
    }

    public int getProtocolType() {
        return this.protocolType;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public int getTrustLevel() {
        return this.trustLevel;
    }

    public void setConnectMediumType(int i) {
        this.connectMediumType = i;
    }

    public void setProtocolType(int i) {
        this.protocolType = i;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public void setTrustLevel(int i) {
        this.trustLevel = i;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ChannelOptions{, connectMediumType=");
        sbA.append(this.connectMediumType);
        sbA.append(", trustLevel=");
        sbA.append(this.trustLevel);
        sbA.append(", timeout=");
        sbA.append(this.timeout);
        sbA.append(", protocolType=");
        sbA.append(this.protocolType);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.connectMediumType);
        parcel.writeInt(this.trustLevel);
        parcel.writeInt(this.timeout);
        parcel.writeInt(this.protocolType);
    }

    public /* synthetic */ ClientChannelOptions(Parcel parcel, a aVar) {
        this(parcel);
    }
}
