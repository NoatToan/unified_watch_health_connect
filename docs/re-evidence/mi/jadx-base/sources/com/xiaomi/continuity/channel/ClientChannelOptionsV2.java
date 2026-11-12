package com.xiaomi.continuity.channel;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h64;
import defpackage.j3s;
import defpackage.mkh;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ClientChannelOptionsV2 implements Parcelable {
    public static final Parcelable.Creator<ClientChannelOptionsV2> CREATOR = new a();
    private static final int localVer = 0;
    private int connectMediumType;
    private Bundle optionalValues;
    private int protocolType;
    private int timeout;
    private int trustLevel;
    private String userData;

    public class a implements Parcelable.Creator<ClientChannelOptionsV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClientChannelOptionsV2 createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int iDataPosition = parcel.dataPosition();
            ClientChannelOptionsV2 clientChannelOptionsV2 = new ClientChannelOptionsV2(parcel, parcel.readInt());
            parcel.setDataPosition(iDataPosition + i);
            return clientChannelOptionsV2;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClientChannelOptionsV2[] newArray(int i) {
            return new ClientChannelOptionsV2[i];
        }
    }

    public ClientChannelOptionsV2() {
    }

    public ClientChannelOptionsV2(Parcel parcel, int i) {
        this.connectMediumType = parcel.readInt();
        this.trustLevel = parcel.readInt();
        this.timeout = parcel.readInt();
        this.protocolType = parcel.readInt();
        this.userData = parcel.readString();
        this.optionalValues = parcel.readBundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$writeToParcel$0(Parcel parcel, Parcel parcel2, int i) {
        parcel.writeInt(0);
        parcel.writeInt(this.connectMediumType);
        parcel.writeInt(this.trustLevel);
        parcel.writeInt(this.timeout);
        parcel.writeInt(this.protocolType);
        parcel.writeString(this.userData);
        parcel.writeBundle(this.optionalValues);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnectMediumType() {
        return this.connectMediumType;
    }

    public Bundle getOptionalValues() {
        return this.optionalValues;
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

    public String getUserData() {
        return this.userData;
    }

    public ClientChannelOptionsV2 setConnectMediumType(int i) {
        this.connectMediumType = i;
        return this;
    }

    public ClientChannelOptionsV2 setOptionalValues(Bundle bundle) {
        this.optionalValues = bundle;
        return this;
    }

    public ClientChannelOptionsV2 setProtocolType(int i) {
        this.protocolType = i;
        return this;
    }

    public ClientChannelOptionsV2 setTimeout(int i) {
        this.timeout = i;
        return this;
    }

    public ClientChannelOptionsV2 setTrustLevel(int i) {
        this.trustLevel = i;
        return this;
    }

    public ClientChannelOptionsV2 setUserData(String str) {
        this.userData = str;
        return this;
    }

    public ClientChannelOptions toClientChannelOptions() {
        ClientChannelOptions clientChannelOptions = new ClientChannelOptions();
        clientChannelOptions.setConnectMediumType(this.connectMediumType);
        clientChannelOptions.setTrustLevel(this.trustLevel);
        clientChannelOptions.setTimeout(this.timeout);
        clientChannelOptions.setProtocolType(this.protocolType);
        return clientChannelOptions;
    }

    public String toString() {
        String string;
        StringBuilder sbA = j3s.a("ChannelOptions{connectMediumType=");
        sbA.append(this.connectMediumType);
        sbA.append(", trustLevel=");
        sbA.append(this.trustLevel);
        sbA.append(", timeout=");
        sbA.append(this.timeout);
        sbA.append(", protocolType=");
        sbA.append(this.protocolType);
        String string2 = "";
        if (this.userData != null) {
            StringBuilder sbA2 = j3s.a(", userData=");
            sbA2.append(this.userData);
            string = sbA2.toString();
        } else {
            string = "";
        }
        sbA.append(string);
        if (this.optionalValues != null) {
            StringBuilder sbA3 = j3s.a(", optionalValues=");
            sbA3.append(this.optionalValues.size());
            string2 = sbA3.toString();
        }
        sbA.append(string2);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(final Parcel parcel, int i) {
        mkh.a(parcel, i, new h64() { // from class: z04
            @Override // defpackage.h64
            public final void a(Parcel parcel2, int i2) {
                this.f40738a.lambda$writeToParcel$0(parcel, parcel2, i2);
            }
        });
    }

    public ClientChannelOptionsV2(ClientChannelOptions clientChannelOptions) {
        this.connectMediumType = clientChannelOptions.getConnectMediumType();
        this.trustLevel = clientChannelOptions.getTrustLevel();
        this.timeout = clientChannelOptions.getTimeout();
        this.protocolType = clientChannelOptions.getProtocolType();
        this.userData = null;
        this.optionalValues = null;
    }
}
