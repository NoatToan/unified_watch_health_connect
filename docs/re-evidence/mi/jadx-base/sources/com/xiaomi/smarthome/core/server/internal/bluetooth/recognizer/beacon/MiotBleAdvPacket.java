package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class MiotBleAdvPacket implements Parcelable {
    public static final Parcelable.Creator<MiotBleAdvPacket> CREATOR = new Parcelable.Creator<MiotBleAdvPacket>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiotBleAdvPacket createFromParcel(Parcel parcel) {
            return new MiotBleAdvPacket(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiotBleAdvPacket[] newArray(int i) {
            return new MiotBleAdvPacket[i];
        }
    };
    public Capability capability;
    public String comboKey;
    public Event event;
    public int[] extendedFrameCounter;
    public FrameControl frameControl;
    public int frameCounter;
    public IoCapability ioCapability;
    public String mac;
    public Mesh mesh;
    public int[] messageIntegrityCheck;
    public int productId;

    public static class Capability implements Parcelable {
        public static final Parcelable.Creator<Capability> CREATOR = new Parcelable.Creator<Capability>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket.Capability.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Capability createFromParcel(Parcel parcel) {
                return new Capability(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Capability[] newArray(int i) {
                return new Capability[i];
            }
        };
        public int bindable;
        public boolean centralable;
        public boolean connectable;
        public boolean encryptable;
        public boolean ioCapabilityable;
        public int netStatus;

        public Capability() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("connectable = " + this.connectable);
            sb.append("\n");
            sb.append("centralable = " + this.centralable);
            sb.append("\n");
            sb.append("encryptable = " + this.encryptable);
            sb.append("\n");
            sb.append("bindable = " + this.bindable);
            sb.append("\n");
            sb.append("ioCapabilityable = " + this.ioCapabilityable);
            sb.append("\n");
            sb.append("netStatus = " + this.netStatus);
            sb.append("\n");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.connectable ? 1 : 0);
            parcel.writeInt(this.centralable ? 1 : 0);
            parcel.writeInt(this.encryptable ? 1 : 0);
            parcel.writeInt(this.bindable);
            parcel.writeInt(this.ioCapabilityable ? 1 : 0);
            parcel.writeInt(this.netStatus);
        }

        public Capability(Parcel parcel) {
            this.connectable = parcel.readByte() != 0;
            this.centralable = parcel.readByte() != 0;
            this.encryptable = parcel.readByte() != 0;
            this.bindable = parcel.readInt();
            this.ioCapabilityable = parcel.readByte() != 0;
            this.netStatus = parcel.readInt();
        }
    }

    public static class Event implements Parcelable {
        public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket.Event.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event createFromParcel(Parcel parcel) {
                return new Event(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event[] newArray(int i) {
                return new Event[i];
            }
        };
        public int eventId;
        public int eventLength;
        public String eventStr;

        public Event() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("");
            sb.append(String.format("eventId = 0x%x", Integer.valueOf(this.eventId)));
            sb.append("\n");
            sb.append("eventLength = " + this.eventLength);
            sb.append("eventStr = " + this.eventStr);
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.eventId);
            parcel.writeInt(this.eventLength);
            parcel.writeString(this.eventStr);
        }

        public Event(Parcel parcel) {
            this.eventId = parcel.readInt();
            this.eventLength = parcel.readInt();
            this.eventStr = parcel.readString();
        }
    }

    public static class FrameControl implements Parcelable {
        public static final Parcelable.Creator<FrameControl> CREATOR = new Parcelable.Creator<FrameControl>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket.FrameControl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public FrameControl createFromParcel(Parcel parcel) {
                return new FrameControl(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public FrameControl[] newArray(int i) {
                return new FrameControl[i];
            }
        };
        public static final int RC4_AUTH_MODE = 0;
        public static final int SECURE_AUTH_MODE = 1;
        public static final int STANDARD_AUTH_MODE = 2;
        public int authMode;
        public boolean bindingCfm;
        public boolean encrypted;
        public boolean registered;
        public int version;
        public boolean withCapability;
        public boolean withEvent;
        public boolean withMac;
        public boolean withMesh;

        public FrameControl() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("");
            sb.append("encrypted = " + this.encrypted);
            sb.append("\n");
            sb.append("withMac = " + this.withMac);
            sb.append("\n");
            sb.append("withCapability = " + this.withCapability);
            sb.append("\n");
            sb.append("withEvent = " + this.withEvent);
            sb.append("\n");
            sb.append("withMesh = " + this.withMesh);
            sb.append("\n");
            sb.append("registered = " + this.registered);
            sb.append("\n");
            sb.append("bindingCfm = " + this.bindingCfm);
            sb.append("\n");
            sb.append("authMode = " + this.authMode);
            sb.append("\n");
            sb.append("version = " + this.version);
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.encrypted ? 1 : 0);
            parcel.writeInt(this.withMac ? 1 : 0);
            parcel.writeInt(this.withCapability ? 1 : 0);
            parcel.writeInt(this.withEvent ? 1 : 0);
            parcel.writeInt(this.withMesh ? 1 : 0);
            parcel.writeInt(this.registered ? 1 : 0);
            parcel.writeInt(this.bindingCfm ? 1 : 0);
            parcel.writeInt(this.authMode);
            parcel.writeInt(this.version);
        }

        public FrameControl(Parcel parcel) {
            this.encrypted = parcel.readByte() != 0;
            this.withMac = parcel.readByte() != 0;
            this.withCapability = parcel.readByte() != 0;
            this.withEvent = parcel.readByte() != 0;
            this.withMesh = parcel.readByte() != 0;
            this.registered = parcel.readByte() != 0;
            this.bindingCfm = parcel.readByte() != 0;
            this.authMode = parcel.readInt();
            this.version = parcel.readInt();
        }
    }

    public static class IoCapability implements Parcelable {
        public static final Parcelable.Creator<IoCapability> CREATOR = new Parcelable.Creator<IoCapability>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket.IoCapability.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IoCapability createFromParcel(Parcel parcel) {
                return new IoCapability(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public IoCapability[] newArray(int i) {
                return new IoCapability[i];
            }
        };
        public static final int INPUT_CAPABILITY_NFC_TAG = 4;
        public static final int INPUT_CAPABILITY_NONE = 0;
        public static final int INPUT_CAPABILITY_QR_CODE = 8;
        public static final int INPUT_CAPABILITY_SIX_CHAR = 2;
        public static final int INPUT_CAPABILITY_SIX_NUMBER = 1;
        public static final int OUTPUT_CAPABILITY_NFC_TAG = 4;
        public static final int OUTPUT_CAPABILITY_NONE = 0;
        public static final int OUTPUT_CAPABILITY_QR_CODE = 8;
        public static final int OUTPUT_CAPABILITY_SIX_CHAR = 2;
        public static final int OUTPUT_CAPABILITY_SIX_NUMBER = 1;
        public int inputCapability;
        public int outputCapability;

        public IoCapability() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("inputCapability = " + this.inputCapability);
            sb.append("\n");
            sb.append("outputCapability = " + this.outputCapability);
            sb.append("\n");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.inputCapability);
            parcel.writeInt(this.outputCapability);
        }

        public IoCapability(Parcel parcel) {
            this.inputCapability = parcel.readInt();
            this.outputCapability = parcel.readInt();
        }
    }

    public static class Mesh implements Parcelable {
        public static final Parcelable.Creator<Mesh> CREATOR = new Parcelable.Creator<Mesh>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.beacon.MiotBleAdvPacket.Mesh.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Mesh createFromParcel(Parcel parcel) {
                return new Mesh(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Mesh[] newArray(int i) {
                return new Mesh[i];
            }
        };
        public static final int STATE_CONFIG_COMPLETE = 3;
        public static final int STATE_UNAUTHENTICATE = 0;
        public int pbType;
        public int state;
        public int version;

        public Mesh() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("pbType = " + this.pbType);
            sb.append("\n");
            sb.append("state = " + this.state);
            sb.append("\n");
            sb.append("version = " + this.version);
            sb.append("\n");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.pbType);
            parcel.writeInt(this.state);
            parcel.writeInt(this.version);
        }

        public Mesh(Parcel parcel) {
            this.pbType = parcel.readInt();
            this.state = parcel.readInt();
            this.version = parcel.readInt();
        }
    }

    public MiotBleAdvPacket() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isBinding() {
        FrameControl frameControl = this.frameControl;
        return frameControl != null && frameControl.bindingCfm;
    }

    public boolean isComboPacket() {
        FrameControl frameControl;
        Capability capability = this.capability;
        return capability != null && capability.bindable == 3 && (frameControl = this.frameControl) != null && frameControl.version >= 3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("productId = 0x%2x", Integer.valueOf(this.productId)));
        sb.append("\n");
        sb.append(String.format("frameCounter = %d", Integer.valueOf(this.frameCounter)));
        sb.append("\n");
        sb.append(String.format("mac = %s", this.mac));
        sb.append("\n");
        if (this.frameControl != null) {
            sb.append("\n");
            sb.append("FrameControl: ");
            sb.append("\n");
            sb.append(this.frameControl.toString());
            sb.append("\n");
        }
        if (this.capability != null) {
            sb.append("\n");
            sb.append("Capability: ");
            sb.append("\n");
            sb.append(this.capability.toString());
            sb.append("\n");
        }
        if (this.event != null) {
            sb.append("\n");
            sb.append("Event: ");
            sb.append("\n");
            sb.append(this.event.toString());
            sb.append("\n");
        }
        if (this.ioCapability != null) {
            sb.append("\n");
            sb.append("IoCapability: ");
            sb.append("\n");
            sb.append(this.ioCapability.toString());
            sb.append("\n");
        }
        if (this.mesh != null) {
            sb.append("\n");
            sb.append("Mesh: ");
            sb.append("\n");
            sb.append(this.mesh.toString());
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.comboKey)) {
            sb.append("\n");
            sb.append(String.format("comboKey: %s", this.comboKey));
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Capability capability;
        try {
            parcel.writeParcelable(this.frameControl, 0);
            parcel.writeInt(this.productId);
            parcel.writeInt(this.frameCounter);
            FrameControl frameControl = this.frameControl;
            if (frameControl != null) {
                if (frameControl.withMac) {
                    parcel.writeString(this.mac);
                }
                if (this.frameControl.withCapability) {
                    parcel.writeParcelable(this.capability, 0);
                }
                if (isComboPacket()) {
                    parcel.writeString(this.comboKey);
                }
                if (this.frameControl.withCapability && (capability = this.capability) != null && capability.ioCapabilityable) {
                    parcel.writeParcelable(this.ioCapability, 0);
                }
                if (this.frameControl.withEvent) {
                    parcel.writeParcelable(this.event, 0);
                }
                if (this.frameControl.encrypted) {
                    parcel.writeIntArray(this.extendedFrameCounter);
                    parcel.writeIntArray(this.messageIntegrityCheck);
                }
                if (this.frameControl.withMesh) {
                    parcel.writeParcelable(this.mesh, 0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MiotBleAdvPacket(Parcel parcel) {
        Capability capability;
        try {
            this.frameControl = (FrameControl) parcel.readParcelable(FrameControl.class.getClassLoader());
            this.productId = parcel.readInt();
            this.frameCounter = parcel.readInt();
            FrameControl frameControl = this.frameControl;
            if (frameControl != null) {
                if (frameControl.withMac) {
                    this.mac = parcel.readString();
                }
                if (this.frameControl.withCapability) {
                    this.capability = (Capability) parcel.readParcelable(Capability.class.getClassLoader());
                }
                if (isComboPacket()) {
                    this.comboKey = parcel.readString();
                }
                if (this.frameControl.withCapability && (capability = this.capability) != null && capability.ioCapabilityable) {
                    this.ioCapability = (IoCapability) parcel.readParcelable(IoCapability.class.getClassLoader());
                }
                if (this.frameControl.withEvent) {
                    this.event = (Event) parcel.readParcelable(Event.class.getClassLoader());
                }
                if (this.frameControl.encrypted) {
                    int[] iArr = new int[3];
                    this.extendedFrameCounter = iArr;
                    parcel.readIntArray(iArr);
                    if (this.frameControl.version >= 4) {
                        this.messageIntegrityCheck = new int[4];
                    } else {
                        this.messageIntegrityCheck = new int[1];
                    }
                    parcel.readIntArray(this.messageIntegrityCheck);
                }
                if (this.frameControl.withMesh) {
                    this.mesh = (Mesh) parcel.readParcelable(Mesh.class.getClassLoader());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
