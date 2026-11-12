package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.util.Arrays;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.util.Strings;
import com.xiaomi.smarthome.framework.api.UserConfig;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1UTCTime extends ASN1Primitive {
    private byte[] time;

    public ASN1UTCTime(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    public static ASN1UTCTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1UTCTime) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return Arrays.areEqual(this.time, ((ASN1UTCTime) aSN1Primitive).time);
        }
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.write(23);
        int length = this.time.length;
        aSN1OutputStream.writeLength(length);
        for (int i = 0; i != length; i++) {
            aSN1OutputStream.write(this.time[i]);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        int length = this.time.length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(getAdjustedTime());
    }

    public String getAdjustedTime() {
        String time = getTime();
        if (time.charAt(0) < '5') {
            return UserConfig.KEY_CAMERA_LIST_SORT_ORDER + time;
        }
        return "19" + time;
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat("yyMMddHHmmssz").parse(getTime());
    }

    public String getTime() {
        String strFromByteArray = Strings.fromByteArray(this.time);
        if (strFromByteArray.indexOf(45) < 0 && strFromByteArray.indexOf(43) < 0) {
            if (strFromByteArray.length() == 11) {
                return strFromByteArray.substring(0, 10) + "00GMT+00:00";
            }
            return strFromByteArray.substring(0, 12) + "GMT+00:00";
        }
        int iIndexOf = strFromByteArray.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strFromByteArray.indexOf(43);
        }
        if (iIndexOf == strFromByteArray.length() - 3) {
            strFromByteArray = strFromByteArray + "00";
        }
        if (iIndexOf == 10) {
            return strFromByteArray.substring(0, 10) + "00GMT" + strFromByteArray.substring(10, 13) + ":" + strFromByteArray.substring(13, 15);
        }
        return strFromByteArray.substring(0, 12) + "GMT" + strFromByteArray.substring(12, 15) + ":" + strFromByteArray.substring(15, 17);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive, com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return Strings.fromByteArray(this.time);
    }

    public ASN1UTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof ASN1UTCTime)) {
            return new ASN1UTCTime(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }

    public ASN1UTCTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(byte[] bArr) {
        this.time = bArr;
    }
}
