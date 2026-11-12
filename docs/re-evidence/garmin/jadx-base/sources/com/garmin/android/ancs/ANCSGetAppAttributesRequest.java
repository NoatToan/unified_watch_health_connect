package com.garmin.android.ancs;

import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import ih2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSGetAppAttributesRequest extends ANCSCommandMessage {
    private static final int ATTRIBUTE_ID_LENGTH = 1;
    public final String appIdentifier;
    public final List<ANCSAppAttribute> attributes;

    /* JADX INFO: renamed from: com.garmin.android.ancs.ANCSGetAppAttributesRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$AppAttributeID;

        static {
            int[] iArr = new int[ANCSMessageBase.AppAttributeID.values().length];
            $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$AppAttributeID = iArr;
            try {
                iArr[ANCSMessageBase.AppAttributeID.DISPLAY_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ANCSGetAppAttributesRequest(byte[] bArr) throws ANCSInvalidParameterException, ANCSInvalidCommandException, ANCSInvalidFormatException {
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
        int i14 = 1;
        while (i14 < bArr.length) {
            int i15 = i14 + 1;
            if (ANCSMessageBase.getByte(bArr, i14) == 0) {
                i14 = i15;
                break;
            }
            i14 = i15;
        }
        ArrayList arrayList = new ArrayList();
        while (i14 < bArr.length) {
            ANCSMessageBase.AppAttributeID appAttributeIDFromId = ANCSMessageBase.AppAttributeID.fromId(ANCSMessageBase.getByte(bArr, i14));
            i14++;
            int i16 = AnonymousClass1.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$AppAttributeID[appAttributeIDFromId.ordinal()];
            arrayList.add(new ANCSAppAttribute(appAttributeIDFromId));
        }
        return arrayList;
    }

    @Override // com.garmin.android.ancs.ANCSCommandMessage
    public void dump() {
        StringBuilder sb3 = new StringBuilder("ANCSGetAppAttributesRequest\n    AppIdentifier: ");
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
        Iterator<ANCSAppAttribute> it = this.attributes.iterator();
        while (it.hasNext()) {
            ANCSMessageBase.putByte(bArr, iPutString, it.next().appAttributeId.f28616id);
            iPutString++;
        }
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        return this.attributes.size() + this.appIdentifier.getBytes().length + 2;
    }

    public ANCSGetAppAttributesRequest(String str, List<ANCSAppAttribute> list) {
        super(ANCSMessageBase.CommandID.GET_APP_ATTRIBUTES);
        this.appIdentifier = str;
        this.attributes = Collections.unmodifiableList(list);
    }
}
