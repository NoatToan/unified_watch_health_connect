package com.garmin.device.sharing.management.dtos;

import android.os.Parcel;
import android.os.Parcelable;
import o13.l;
import o13.m;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\t\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001d\u0010\"\u001a\u0004\u0018\u00010\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001d\u0010%\u001a\u0004\u0018\u00010\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\u0004\u0018\u00010\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018¨\u0006/"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/SimpleDeviceDto;", "Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "", "applicationKey$delegate", "Lo13/l;", "getApplicationKey", "()Ljava/lang/String;", "applicationKey", "partNumber$delegate", "getPartNumber", "partNumber", "partNumberPartial$delegate", "getPartNumberPartial", "partNumberPartial", "productDisplayName$delegate", "getProductDisplayName", "productDisplayName", "imageUrl$delegate", "getImageUrl", "imageUrl", "", "deviceId$delegate", "getDeviceId", "()J", "deviceId", "displayName$delegate", "getDisplayName", "displayName", "CREATOR", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SimpleDeviceDto implements IRegisteredDeviceDto {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: applicationKey$delegate, reason: from kotlin metadata */
    private final l applicationKey;

    /* JADX INFO: renamed from: deviceId$delegate, reason: from kotlin metadata */
    private final l deviceId;

    /* JADX INFO: renamed from: displayName$delegate, reason: from kotlin metadata */
    private final l displayName;

    /* JADX INFO: renamed from: imageUrl$delegate, reason: from kotlin metadata */
    private final l imageUrl;
    private final JSONObject json;

    /* JADX INFO: renamed from: partNumber$delegate, reason: from kotlin metadata */
    private final l partNumber;

    /* JADX INFO: renamed from: partNumberPartial$delegate, reason: from kotlin metadata */
    private final l partNumberPartial;

    /* JADX INFO: renamed from: productDisplayName$delegate, reason: from kotlin metadata */
    private final l productDisplayName;

    public SimpleDeviceDto(JSONObject jSONObject) {
        jSONObject.getClass();
        this.json = jSONObject;
        this.applicationKey = m.b(new SimpleDeviceDto$applicationKey$2(this));
        this.partNumber = m.b(new SimpleDeviceDto$partNumber$2(this));
        this.partNumberPartial = m.b(new SimpleDeviceDto$partNumberPartial$2(this));
        this.productDisplayName = m.b(new SimpleDeviceDto$productDisplayName$2(this));
        this.imageUrl = m.b(new SimpleDeviceDto$imageUrl$2(this));
        this.deviceId = m.b(new SimpleDeviceDto$deviceId$2(this));
        this.displayName = m.b(new SimpleDeviceDto$displayName$2(this));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public String getApplicationKey() {
        return (String) this.applicationKey.getValue();
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    /* JADX INFO: renamed from: getDeviceId */
    public long getDeviceUnitId() {
        return ((Number) this.deviceId.getValue()).longValue();
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public String getDisplayName() {
        return (String) this.displayName.getValue();
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public String getImageUrl() {
        return (String) this.imageUrl.getValue();
    }

    public final JSONObject getJson() {
        return this.json;
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public String getPartNumber() {
        return (String) this.partNumber.getValue();
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public String getPartNumberPartial() {
        return (String) this.partNumberPartial.getValue();
    }

    @Override // com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public String getProductDisplayName() {
        return (String) this.productDisplayName.getValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.json.toString());
    }

    /* JADX INFO: renamed from: com.garmin.device.sharing.management.dtos.SimpleDeviceDto$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/SimpleDeviceDto$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/device/sharing/management/dtos/SimpleDeviceDto;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/garmin/device/sharing/management/dtos/SimpleDeviceDto;", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SimpleDeviceDto> {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SimpleDeviceDto createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SimpleDeviceDto(parcel);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SimpleDeviceDto[] newArray(int size) {
            return new SimpleDeviceDto[size];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SimpleDeviceDto(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        this(new JSONObject(string == null ? "" : string));
    }
}
