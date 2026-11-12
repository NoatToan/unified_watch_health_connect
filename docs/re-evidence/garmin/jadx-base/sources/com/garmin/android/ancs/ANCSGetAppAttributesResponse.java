package com.garmin.android.ancs;

import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import ih2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSGetAppAttributesResponse extends ANCSCommandMessage {
    private static final int ATTRIBUTE_ID_LENGTH = 1;
    private static final int ATTRIBUTE_MAX_LEN_LENGTH = 2;
    public final String appIdentifier;
    public final List<ANCSAppAttribute> attributes;

    /* JADX WARN: Illegal instructions before constructor call */
    public ANCSGetAppAttributesResponse(byte[] bArr) throws ANCSInvalidParameterException, ANCSInvalidCommandException, ANCSInvalidFormatException {
        ANCSMessageBase.CommandID commandID = ANCSMessageBase.CommandID.GET_APP_ATTRIBUTES;
        super(commandID);
        if (ANCSMessageBase.getByte(bArr, 0) != commandID.f28618id) {
            throw new ANCSInvalidCommandException(ANCSMessageBase.getByte(bArr, 0));
        }
        try {
            String string = ANCSMessageBase.getString(bArr, 1);
            this.appIdentifier = string;
            if (string.isEmpty()) {
                throw new ANCSInvalidParameterException("Application identifier is empty");
            }
            try {
                List<ANCSAppAttribute> listUnmodifiableList = Collections.unmodifiableList(parseAttributes(bArr));
                this.attributes = listUnmodifiableList;
                if (listUnmodifiableList.isEmpty()) {
                    throw new ANCSInvalidParameterException("No attributes specified");
                }
            } catch (Exception e4) {
                throw new ANCSInvalidFormatException("Failed to parse attributes", e4);
            }
        } catch (Exception e14) {
            throw new ANCSInvalidFormatException("Failed to parse application identifier", e14);
        }
    }

    private static List<ANCSAppAttribute> parseAttributes(byte[] bArr) {
        int length = 1;
        while (length < bArr.length) {
            int i14 = length + 1;
            if (ANCSMessageBase.getByte(bArr, length) == 0) {
                length = i14;
                break;
            }
            length = i14;
        }
        ArrayList arrayList = new ArrayList();
        while (length < bArr.length) {
            ANCSMessageBase.AppAttributeID appAttributeIDFromId = ANCSMessageBase.AppAttributeID.fromId(ANCSMessageBase.getByte(bArr, length));
            short s8 = ANCSMessageBase.getShort(bArr, length + 1);
            int i15 = length + 3;
            byte[] bytes = ANCSMessageBase.getBytes(bArr, i15, s8);
            length = i15 + bytes.length;
            arrayList.add(new ANCSAppAttribute(appAttributeIDFromId, bytes));
        }
        return arrayList;
    }

    @Override // com.garmin.android.ancs.ANCSCommandMessage
    public void dump() {
        StringBuilder sb3 = new StringBuilder("ANCSGetAppAttributesResponse\n    AppIdentifier: ");
        sb3.append(this.appIdentifier);
        sb3.append('\n');
        if (SmartNotificationsConfig.getInstance().isVerboseLoggingEnabled()) {
            sb3.append("    Attributes >>>\n");
            for (ANCSAppAttribute aNCSAppAttribute : this.attributes) {
                sb3.append("        ID: ");
                sb3.append(aNCSAppAttribute.appAttributeId);
                sb3.append("\n        MaxLength: ");
                sb3.append(aNCSAppAttribute.maxLength);
                sb3.append('\n');
            }
        }
        b.b(sb3.toString());
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        ANCSMessageBase.putByte(bArr, 0, this.commandId.f28618id);
        int iPutString = ANCSMessageBase.putString(bArr, 1, this.appIdentifier) + 1;
        for (ANCSAppAttribute aNCSAppAttribute : this.attributes) {
            ANCSMessageBase.putByte(bArr, iPutString, aNCSAppAttribute.appAttributeId.f28616id);
            ANCSMessageBase.putShort(bArr, iPutString + 1, (short) aNCSAppAttribute.getValueLength());
            int i14 = iPutString + 3;
            ANCSMessageBase.putBytes(bArr, i14, aNCSAppAttribute.getValue());
            iPutString = i14 + aNCSAppAttribute.getValueLength();
        }
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        int length = this.appIdentifier.getBytes().length + 2;
        Iterator<ANCSAppAttribute> it = this.attributes.iterator();
        while (it.hasNext()) {
            length = length + 3 + it.next().getValueLength();
        }
        return length;
    }

    public ANCSGetAppAttributesResponse(String str, List<ANCSAppAttribute> list) {
        super(ANCSMessageBase.CommandID.GET_APP_ATTRIBUTES);
        this.appIdentifier = str;
        this.attributes = Collections.unmodifiableList(list);
    }
}
