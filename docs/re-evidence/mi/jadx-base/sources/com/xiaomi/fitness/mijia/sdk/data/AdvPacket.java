package com.xiaomi.fitness.mijia.sdk.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\\]^_`B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010=\u001a\u00020\bH\u0016J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0089\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0006\u0010R\u001a\u00020\u0005J\u0013\u0010S\u001a\u00020?2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020\u0005HÖ\u0001J\u0016\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b>\u0010@R\u0011\u0010A\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0011\u0010B\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0011\u0010C\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\bC\u0010@R\u0011\u0010D\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bE\u0010\u001c¨\u0006a"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "Landroid/os/Parcelable;", "frameControl", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$FrameControl;", "productId", "", "frameCounter", "mac", "", DevInfoKeys.CAPABILITY, "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Capability;", "comboKey", "ioCapability", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$IoCapability;", "event", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Event;", "extendedFrameCounter", "", "messageIntegrityCheck", "mesh", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Mesh;", "<init>", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$FrameControl;IILjava/lang/String;Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Capability;Ljava/lang/String;Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$IoCapability;Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Event;[I[ILcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Mesh;)V", "getFrameControl", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$FrameControl;", "setFrameControl", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$FrameControl;)V", "getProductId", "()I", "setProductId", "(I)V", "getFrameCounter", "setFrameCounter", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "getCapability", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Capability;", "setCapability", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Capability;)V", "getComboKey", "setComboKey", "getIoCapability", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$IoCapability;", "setIoCapability", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$IoCapability;)V", "getEvent", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Event;", "setEvent", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Event;)V", "getExtendedFrameCounter", "()[I", "setExtendedFrameCounter", "([I)V", "getMessageIntegrityCheck", "setMessageIntegrityCheck", "getMesh", "()Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Mesh;", "setMesh", "(Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Mesh;)V", "toString", "isComboPacket", "", "()Z", "isRegistered", "isBondNew", "isBinding", "authMode", "getAuthMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FrameControl", "Capability", "IoCapability", "Event", "Mesh", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AdvPacket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdvPacket> CREATOR = new Creator();

    @Nullable
    private Capability capability;

    @Nullable
    private String comboKey;

    @Nullable
    private Event event;

    @Nullable
    private int[] extendedFrameCounter;

    @Nullable
    private FrameControl frameControl;
    private int frameCounter;

    @Nullable
    private IoCapability ioCapability;

    @Nullable
    private String mac;

    @Nullable
    private Mesh mesh;

    @Nullable
    private int[] messageIntegrityCheck;
    private int productId;

    @Parcelize
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u0007J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Capability;", "Landroid/os/Parcelable;", "connectable", "", "centralable", "encryptable", "bindable", "", "ioCapabilityable", "<init>", "(ZZZIZ)V", "getConnectable", "()Z", "setConnectable", "(Z)V", "getCentralable", "setCentralable", "getEncryptable", "setEncryptable", "getBindable", "()I", "setBindable", "(I)V", "getIoCapabilityable", "setIoCapabilityable", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Capability implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Capability> CREATOR = new Creator();
        private int bindable;
        private boolean centralable;
        private boolean connectable;
        private boolean encryptable;
        private boolean ioCapabilityable;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Capability> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Capability createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Capability(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Capability[] newArray(int i) {
                return new Capability[i];
            }
        }

        public Capability() {
            this(false, false, false, 0, false, 31, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getBindable() {
            return this.bindable;
        }

        public final boolean getCentralable() {
            return this.centralable;
        }

        public final boolean getConnectable() {
            return this.connectable;
        }

        public final boolean getEncryptable() {
            return this.encryptable;
        }

        public final boolean getIoCapabilityable() {
            return this.ioCapabilityable;
        }

        public final void setBindable(int i) {
            this.bindable = i;
        }

        public final void setCentralable(boolean z) {
            this.centralable = z;
        }

        public final void setConnectable(boolean z) {
            this.connectable = z;
        }

        public final void setEncryptable(boolean z) {
            this.encryptable = z;
        }

        public final void setIoCapabilityable(boolean z) {
            this.ioCapabilityable = z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.connectable ? 1 : 0);
            dest.writeInt(this.centralable ? 1 : 0);
            dest.writeInt(this.encryptable ? 1 : 0);
            dest.writeInt(this.bindable);
            dest.writeInt(this.ioCapabilityable ? 1 : 0);
        }

        public Capability(boolean z, boolean z2, boolean z3, int i, boolean z4) {
            this.connectable = z;
            this.centralable = z2;
            this.encryptable = z3;
            this.bindable = i;
            this.ioCapabilityable = z4;
        }

        public /* synthetic */ Capability(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z4);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvPacket> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvPacket createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvPacket(parcel.readInt() == 0 ? null : FrameControl.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Capability.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : IoCapability.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Event.CREATOR.createFromParcel(parcel), parcel.createIntArray(), parcel.createIntArray(), parcel.readInt() != 0 ? Mesh.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvPacket[] newArray(int i) {
            return new AdvPacket[i];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Event;", "Landroid/os/Parcelable;", "eventId", "", "eventLength", "<init>", "(II)V", "getEventId", "()I", "setEventId", "(I)V", "getEventLength", "setEventLength", "toString", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Event implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Event> CREATOR = new Creator();
        private int eventId;
        private int eventLength;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Event> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Event createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Event(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Event[] newArray(int i) {
                return new Event[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Event() {
            int i = 0;
            this(i, i, 3, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getEventId() {
            return this.eventId;
        }

        public final int getEventLength() {
            return this.eventLength;
        }

        public final void setEventId(int i) {
            this.eventId = i;
        }

        public final void setEventLength(int i) {
            this.eventLength = i;
        }

        @NotNull
        public String toString() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("eventId=0x%x", Arrays.copyOf(new Object[]{Integer.valueOf(this.eventId)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str + ", eventLength=" + this.eventLength;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.eventId);
            dest.writeInt(this.eventLength);
        }

        public Event(int i, int i2) {
            this.eventId = i;
            this.eventLength = i2;
        }

        public /* synthetic */ Event(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u0001:\u00010Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010(\u001a\u00020)H\u0016J\u0006\u0010*\u001a\u00020\fJ\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$FrameControl;", "Landroid/os/Parcelable;", "bondNew", "", "encrypted", "withMac", "withCapability", "withEvent", "withMesh", "registered", "bindingCfm", "authMode", "", "version", "<init>", "(ZZZZZZZZII)V", "getBondNew", "()Z", "setBondNew", "(Z)V", "getEncrypted", "setEncrypted", "getWithMac", "setWithMac", "getWithCapability", "setWithCapability", "getWithEvent", "setWithEvent", "getWithMesh", "setWithMesh", "getRegistered", "setRegistered", "getBindingCfm", "setBindingCfm", "getAuthMode", "()I", "setAuthMode", "(I)V", "getVersion", "setVersion", "toString", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FrameControl implements Parcelable {
        public static final int RC4_AUTH_MODE = 0;
        public static final int SECURE_AUTH_MODE = 1;
        public static final int STANDARD_AUTH_MODE = 2;
        private int authMode;
        private boolean bindingCfm;
        private boolean bondNew;
        private boolean encrypted;
        private boolean registered;
        private int version;
        private boolean withCapability;
        private boolean withEvent;
        private boolean withMac;
        private boolean withMesh;

        @NotNull
        public static final Parcelable.Creator<FrameControl> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FrameControl> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FrameControl createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FrameControl(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FrameControl[] newArray(int i) {
                return new FrameControl[i];
            }
        }

        public FrameControl() {
            this(false, false, false, false, false, false, false, false, 0, 0, 1023, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getAuthMode() {
            return this.authMode;
        }

        public final boolean getBindingCfm() {
            return this.bindingCfm;
        }

        public final boolean getBondNew() {
            return this.bondNew;
        }

        public final boolean getEncrypted() {
            return this.encrypted;
        }

        public final boolean getRegistered() {
            return this.registered;
        }

        public final int getVersion() {
            return this.version;
        }

        public final boolean getWithCapability() {
            return this.withCapability;
        }

        public final boolean getWithEvent() {
            return this.withEvent;
        }

        public final boolean getWithMac() {
            return this.withMac;
        }

        public final boolean getWithMesh() {
            return this.withMesh;
        }

        public final void setAuthMode(int i) {
            this.authMode = i;
        }

        public final void setBindingCfm(boolean z) {
            this.bindingCfm = z;
        }

        public final void setBondNew(boolean z) {
            this.bondNew = z;
        }

        public final void setEncrypted(boolean z) {
            this.encrypted = z;
        }

        public final void setRegistered(boolean z) {
            this.registered = z;
        }

        public final void setVersion(int i) {
            this.version = i;
        }

        public final void setWithCapability(boolean z) {
            this.withCapability = z;
        }

        public final void setWithEvent(boolean z) {
            this.withEvent = z;
        }

        public final void setWithMac(boolean z) {
            this.withMac = z;
        }

        public final void setWithMesh(boolean z) {
            this.withMesh = z;
        }

        @NotNull
        public String toString() {
            return "encrypted=" + this.encrypted + ", withMac=" + this.withMac + ", withCapability=" + this.withCapability + ", withEvent=" + this.withEvent + ", withMesh=" + this.withMesh + ", registered=" + this.registered + ", bindingCfm=" + this.bindingCfm + ", authMode=" + this.authMode + ", version=" + this.version + ", bondNew=" + this.bondNew;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.bondNew ? 1 : 0);
            dest.writeInt(this.encrypted ? 1 : 0);
            dest.writeInt(this.withMac ? 1 : 0);
            dest.writeInt(this.withCapability ? 1 : 0);
            dest.writeInt(this.withEvent ? 1 : 0);
            dest.writeInt(this.withMesh ? 1 : 0);
            dest.writeInt(this.registered ? 1 : 0);
            dest.writeInt(this.bindingCfm ? 1 : 0);
            dest.writeInt(this.authMode);
            dest.writeInt(this.version);
        }

        public FrameControl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2) {
            this.bondNew = z;
            this.encrypted = z2;
            this.withMac = z3;
            this.withCapability = z4;
            this.withEvent = z5;
            this.withMesh = z6;
            this.registered = z7;
            this.bindingCfm = z8;
            this.authMode = i;
            this.version = i2;
        }

        public /* synthetic */ FrameControl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? false : z6, (i3 & 64) != 0 ? false : z7, (i3 & 128) != 0 ? false : z8, (i3 & 256) != 0 ? 0 : i, (i3 & 512) == 0 ? i2 : 0);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$IoCapability;", "Landroid/os/Parcelable;", "inputCapability", "", "outputCapability", "<init>", "(II)V", "getInputCapability", "()I", "setInputCapability", "(I)V", "getOutputCapability", "setOutputCapability", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IoCapability implements Parcelable {
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
        private int inputCapability;
        private int outputCapability;

        @NotNull
        public static final Parcelable.Creator<IoCapability> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IoCapability> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IoCapability createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IoCapability(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IoCapability[] newArray(int i) {
                return new IoCapability[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IoCapability() {
            int i = 0;
            this(i, i, 3, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getInputCapability() {
            return this.inputCapability;
        }

        public final int getOutputCapability() {
            return this.outputCapability;
        }

        public final void setInputCapability(int i) {
            this.inputCapability = i;
        }

        public final void setOutputCapability(int i) {
            this.outputCapability = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.inputCapability);
            dest.writeInt(this.outputCapability);
        }

        public IoCapability(int i, int i2) {
            this.inputCapability = i;
            this.outputCapability = i2;
        }

        public /* synthetic */ IoCapability(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0003J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket$Mesh;", "Landroid/os/Parcelable;", "pbType", "", "state", "version", "<init>", "(III)V", "getPbType", "()I", "setPbType", "(I)V", "getState", "setState", "getVersion", "setVersion", "toString", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mesh implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Mesh> CREATOR = new Creator();
        private int pbType;
        private int state;
        private int version;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Mesh> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mesh createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Mesh(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mesh[] newArray(int i) {
                return new Mesh[i];
            }
        }

        public Mesh() {
            this(0, 0, 0, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getPbType() {
            return this.pbType;
        }

        public final int getState() {
            return this.state;
        }

        public final int getVersion() {
            return this.version;
        }

        public final void setPbType(int i) {
            this.pbType = i;
        }

        public final void setState(int i) {
            this.state = i;
        }

        public final void setVersion(int i) {
            this.version = i;
        }

        @NotNull
        public String toString() {
            return "pbType=" + this.pbType + ", state=" + this.state + ", version=" + this.version;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.pbType);
            dest.writeInt(this.state);
            dest.writeInt(this.version);
        }

        public Mesh(int i, int i2, int i3) {
            this.pbType = i;
            this.state = i2;
            this.version = i3;
        }

        public /* synthetic */ Mesh(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    public AdvPacket() {
        this(null, 0, 0, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FrameControl getFrameControl() {
        return this.frameControl;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int[] getMessageIntegrityCheck() {
        return this.messageIntegrityCheck;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Mesh getMesh() {
        return this.mesh;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrameCounter() {
        return this.frameCounter;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Capability getCapability() {
        return this.capability;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getComboKey() {
        return this.comboKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final IoCapability getIoCapability() {
        return this.ioCapability;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int[] getExtendedFrameCounter() {
        return this.extendedFrameCounter;
    }

    @NotNull
    public final AdvPacket copy(@Nullable FrameControl frameControl, int productId, int frameCounter, @Nullable String mac, @Nullable Capability capability, @Nullable String comboKey, @Nullable IoCapability ioCapability, @Nullable Event event, @Nullable int[] extendedFrameCounter, @Nullable int[] messageIntegrityCheck, @Nullable Mesh mesh) {
        return new AdvPacket(frameControl, productId, frameCounter, mac, capability, comboKey, ioCapability, event, extendedFrameCounter, messageIntegrityCheck, mesh);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvPacket)) {
            return false;
        }
        AdvPacket advPacket = (AdvPacket) other;
        return Intrinsics.areEqual(this.frameControl, advPacket.frameControl) && this.productId == advPacket.productId && this.frameCounter == advPacket.frameCounter && Intrinsics.areEqual(this.mac, advPacket.mac) && Intrinsics.areEqual(this.capability, advPacket.capability) && Intrinsics.areEqual(this.comboKey, advPacket.comboKey) && Intrinsics.areEqual(this.ioCapability, advPacket.ioCapability) && Intrinsics.areEqual(this.event, advPacket.event) && Intrinsics.areEqual(this.extendedFrameCounter, advPacket.extendedFrameCounter) && Intrinsics.areEqual(this.messageIntegrityCheck, advPacket.messageIntegrityCheck) && Intrinsics.areEqual(this.mesh, advPacket.mesh);
    }

    public final int getAuthMode() {
        FrameControl frameControl = this.frameControl;
        if (frameControl == null) {
            return 0;
        }
        Intrinsics.checkNotNull(frameControl);
        return frameControl.getAuthMode();
    }

    @Nullable
    public final Capability getCapability() {
        return this.capability;
    }

    @Nullable
    public final String getComboKey() {
        return this.comboKey;
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    public final int[] getExtendedFrameCounter() {
        return this.extendedFrameCounter;
    }

    @Nullable
    public final FrameControl getFrameControl() {
        return this.frameControl;
    }

    public final int getFrameCounter() {
        return this.frameCounter;
    }

    @Nullable
    public final IoCapability getIoCapability() {
        return this.ioCapability;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final Mesh getMesh() {
        return this.mesh;
    }

    @Nullable
    public final int[] getMessageIntegrityCheck() {
        return this.messageIntegrityCheck;
    }

    public final int getProductId() {
        return this.productId;
    }

    public int hashCode() {
        FrameControl frameControl = this.frameControl;
        int iHashCode = (((((frameControl == null ? 0 : frameControl.hashCode()) * 31) + Integer.hashCode(this.productId)) * 31) + Integer.hashCode(this.frameCounter)) * 31;
        String str = this.mac;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Capability capability = this.capability;
        int iHashCode3 = (iHashCode2 + (capability == null ? 0 : capability.hashCode())) * 31;
        String str2 = this.comboKey;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IoCapability ioCapability = this.ioCapability;
        int iHashCode5 = (iHashCode4 + (ioCapability == null ? 0 : ioCapability.hashCode())) * 31;
        Event event = this.event;
        int iHashCode6 = (iHashCode5 + (event == null ? 0 : event.hashCode())) * 31;
        int[] iArr = this.extendedFrameCounter;
        int iHashCode7 = (iHashCode6 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.messageIntegrityCheck;
        int iHashCode8 = (iHashCode7 + (iArr2 == null ? 0 : Arrays.hashCode(iArr2))) * 31;
        Mesh mesh = this.mesh;
        return iHashCode8 + (mesh != null ? mesh.hashCode() : 0);
    }

    public final boolean isBinding() {
        FrameControl frameControl = this.frameControl;
        if (frameControl != null) {
            Intrinsics.checkNotNull(frameControl);
            if (frameControl.getBindingCfm()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isBondNew() {
        FrameControl frameControl = this.frameControl;
        if (frameControl != null) {
            Intrinsics.checkNotNull(frameControl);
            if (frameControl.getBondNew()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isComboPacket() {
        FrameControl frameControl;
        Capability capability = this.capability;
        if (capability != null) {
            Intrinsics.checkNotNull(capability);
            if (capability.getBindable() == 3 && (frameControl = this.frameControl) != null) {
                Intrinsics.checkNotNull(frameControl);
                if (frameControl.getVersion() >= 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isRegistered() {
        FrameControl frameControl = this.frameControl;
        if (frameControl != null) {
            Intrinsics.checkNotNull(frameControl);
            if (frameControl.getRegistered()) {
                return true;
            }
        }
        return false;
    }

    public final void setCapability(@Nullable Capability capability) {
        this.capability = capability;
    }

    public final void setComboKey(@Nullable String str) {
        this.comboKey = str;
    }

    public final void setEvent(@Nullable Event event) {
        this.event = event;
    }

    public final void setExtendedFrameCounter(@Nullable int[] iArr) {
        this.extendedFrameCounter = iArr;
    }

    public final void setFrameControl(@Nullable FrameControl frameControl) {
        this.frameControl = frameControl;
    }

    public final void setFrameCounter(int i) {
        this.frameCounter = i;
    }

    public final void setIoCapability(@Nullable IoCapability ioCapability) {
        this.ioCapability = ioCapability;
    }

    public final void setMac(@Nullable String str) {
        this.mac = str;
    }

    public final void setMesh(@Nullable Mesh mesh) {
        this.mesh = mesh;
    }

    public final void setMessageIntegrityCheck(@Nullable int[] iArr) {
        this.messageIntegrityCheck = iArr;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("productId=0x%2x(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(this.productId), Integer.valueOf(this.productId)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        sb.append(str);
        sb.append(", ");
        String str2 = String.format("frameCounter=%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.frameCounter)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        sb.append(str2);
        sb.append(", ");
        String str3 = String.format("mac=%s", Arrays.copyOf(new Object[]{this.mac}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        sb.append(str3);
        if (this.frameControl != null) {
            sb.append("\n");
            sb.append("FrameControl:");
            sb.append(String.valueOf(this.frameControl));
        }
        if (this.capability != null) {
            sb.append("\n");
            sb.append("Capability:");
            sb.append(String.valueOf(this.capability));
        }
        if (this.event != null) {
            sb.append("\n");
            sb.append("Event:");
            sb.append(String.valueOf(this.event));
        }
        if (this.ioCapability != null) {
            sb.append("\n");
            sb.append("IoCapability:");
            sb.append(String.valueOf(this.ioCapability));
        }
        if (this.mesh != null) {
            sb.append("\n");
            sb.append("Mesh:");
            sb.append(String.valueOf(this.mesh));
        }
        if (!TextUtils.isEmpty(this.comboKey)) {
            sb.append("\n");
            String str4 = String.format("comboKey:%s", Arrays.copyOf(new Object[]{this.comboKey}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            sb.append(str4);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        FrameControl frameControl = this.frameControl;
        if (frameControl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            frameControl.writeToParcel(dest, flags);
        }
        dest.writeInt(this.productId);
        dest.writeInt(this.frameCounter);
        dest.writeString(this.mac);
        Capability capability = this.capability;
        if (capability == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            capability.writeToParcel(dest, flags);
        }
        dest.writeString(this.comboKey);
        IoCapability ioCapability = this.ioCapability;
        if (ioCapability == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ioCapability.writeToParcel(dest, flags);
        }
        Event event = this.event;
        if (event == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            event.writeToParcel(dest, flags);
        }
        dest.writeIntArray(this.extendedFrameCounter);
        dest.writeIntArray(this.messageIntegrityCheck);
        Mesh mesh = this.mesh;
        if (mesh == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mesh.writeToParcel(dest, flags);
        }
    }

    public AdvPacket(@Nullable FrameControl frameControl, int i, int i2, @Nullable String str, @Nullable Capability capability, @Nullable String str2, @Nullable IoCapability ioCapability, @Nullable Event event, @Nullable int[] iArr, @Nullable int[] iArr2, @Nullable Mesh mesh) {
        this.frameControl = frameControl;
        this.productId = i;
        this.frameCounter = i2;
        this.mac = str;
        this.capability = capability;
        this.comboKey = str2;
        this.ioCapability = ioCapability;
        this.event = event;
        this.extendedFrameCounter = iArr;
        this.messageIntegrityCheck = iArr2;
        this.mesh = mesh;
    }

    public /* synthetic */ AdvPacket(FrameControl frameControl, int i, int i2, String str, Capability capability, String str2, IoCapability ioCapability, Event event, int[] iArr, int[] iArr2, Mesh mesh, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : frameControl, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : capability, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : ioCapability, (i3 & 128) != 0 ? null : event, (i3 & 256) != 0 ? null : iArr, (i3 & 512) != 0 ? null : iArr2, (i3 & 1024) == 0 ? mesh : null);
    }
}
