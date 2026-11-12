package com.garmin.android.ancs;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSAppAttribute extends ANCSAttribute {
    public final ANCSMessageBase.AppAttributeID appAttributeId;

    public ANCSAppAttribute(ANCSMessageBase.AppAttributeID appAttributeID, byte[] bArr) {
        super(bArr == null ? 0 : bArr.length, bArr);
        this.appAttributeId = appAttributeID;
    }

    public ANCSAppAttribute(ANCSMessageBase.AppAttributeID appAttributeID) {
        this(appAttributeID, null);
    }
}
