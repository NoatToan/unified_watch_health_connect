package com.garmin.device.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f50883b = LoggerFactory.getLogger("PAY#NFC#NfcTlv");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50884a;

    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF1' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f50885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f50886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f50887d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50888a;

        /* JADX INFO: Fake field, exist only in values array */
        b EF1;

        static {
            b bVar = new b("REQUESTED_NOTHING", 0, 0, Collections.EMPTY_LIST);
            f50885b = bVar;
            c cVar = c.TAG_ISSUER_NAME;
            b bVar2 = new b("REQUESTED_TAG_ISSUER_NAME", 1, 3, Collections.singletonList(cVar));
            c cVar2 = c.TAG_DESCRIPTION;
            b bVar3 = new b("REQUESTED_TAG_DESCRIPTION", 2, 4, Collections.singletonList(cVar2));
            c cVar3 = c.TAG_PAN;
            b bVar4 = new b("REQUESTED_TAG_PAN", 3, 5, Collections.singletonList(cVar3));
            c cVar4 = c.TAG_EXP_MONTH;
            b bVar5 = new b("REQUESTED_TAG_EXP_MONTH", 4, 6, Collections.singletonList(cVar4));
            c cVar5 = c.TAG_EXP_YEAR;
            b bVar6 = new b("REQUESTED_TAG_EXP_YEAR", 5, 7, Collections.singletonList(cVar5));
            c cVar6 = c.TAG_TOP_OF_WALLET_APDU;
            b bVar7 = new b("REQUESTED_TAG_TOP_OF_WALLET_APDU", 6, 8, Collections.singletonList(cVar6));
            c cVar7 = c.TAG_CARD_IMAGE_UNCOMPRESSED_SIZE;
            b bVar8 = new b("REQUESTED_TAG_CARD_IMAGE_UNCOMPRESSED_SIZE", 7, 9, Collections.singletonList(cVar7));
            c cVar8 = c.TAG_CARD_ACTIVE;
            b bVar9 = new b("REQUESTED_TAG_CARD_ACTIVE", 8, 13, Collections.singletonList(cVar8));
            b bVar10 = new b("REQUESTED_TAG_ALL", 9, 255, Arrays.asList(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8));
            f50886c = bVar10;
            f50887d = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        }

        private b(String str, int i14, int i15, List list) {
            super(str, i14);
            this.f50888a = i15;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(c.TAG_CREDIT_CARD_ID, c.TAG_CREDIT_CARD_HASH, c.TAG_CARD_IMAGE_HASH, c.TAG_CARD_TYPE));
            arrayList.addAll(list);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f50887d.clone();
        }
    }

    public enum c {
        TAG_CARD_IMAGE(1),
        TAG_CARD_TYPE(2),
        TAG_ISSUER_NAME(3),
        TAG_DESCRIPTION(4),
        TAG_PAN(5),
        TAG_EXP_MONTH(6),
        TAG_EXP_YEAR(7),
        TAG_TOP_OF_WALLET_APDU(8),
        TAG_CARD_IMAGE_UNCOMPRESSED_SIZE(9),
        TAG_CARD_IMAGE_HASH(10),
        TAG_CREDIT_CARD_HASH(11),
        TAG_CREDIT_CARD_ID(12),
        TAG_CARD_ACTIVE(13),
        /* JADX INFO: Fake field, exist only in values array */
        TAG_ACTIVATE_CARD_APDU_LIST(14),
        TAG_USER_ID(15),
        TAG_SERVER_ENVIRONMENT(16),
        TAG_BALANCE_NOTIFICATION_THRESHOLD(17),
        /* JADX INFO: Fake field, exist only in values array */
        TAG_PRIMARY_CARD(18),
        /* JADX INFO: Fake field, exist only in values array */
        TAG_DEACTIVATE_CARD_APDU_LIST(20),
        /* JADX INFO: Fake field, exist only in values array */
        APDU_COMMAND(21),
        /* JADX INFO: Fake field, exist only in values array */
        TAG_DELETE_CARD_APDU_LIST(22);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50906a;

        c(int i14) {
            this.f50906a = i14;
        }

        public static c a(int i14) {
            for (c cVar : values()) {
                if (cVar.f50906a == i14) {
                    return cVar;
                }
            }
            vb.h.s(androidx.core.view.j.f(i14, " is not valid TlvTag value"));
            return null;
        }
    }

    public h(c cVar, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 5];
        this.f50884a = bArr2;
        bArr2[0] = (byte) cVar.f50906a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(length);
        byte[] bArrArray = byteBufferAllocate.array();
        System.arraycopy(bArrArray, 0, this.f50884a, 1, bArrArray.length);
        System.arraycopy(bArr, 0, this.f50884a, 5, length);
    }

    public static byte[] b(h[] hVarArr, int i14) {
        byte[] bArrArray;
        byte[] bArr;
        byte[] bArr2;
        if (hVarArr != null) {
            int length = 0;
            for (h hVar : hVarArr) {
                if (hVar != null && (bArr2 = hVar.f50884a) != null) {
                    length += bArr2.length;
                }
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 2);
            byteBufferAllocate.put((byte) (i14 | (-128)));
            byteBufferAllocate.put((byte) 4);
            for (h hVar2 : hVarArr) {
                if (hVar2 != null && (bArr = hVar2.f50884a) != null) {
                    byteBufferAllocate.put(bArr, 0, bArr.length);
                }
            }
            bArrArray = byteBufferAllocate.array();
        } else {
            bArrArray = null;
        }
        f50883b.debug(j.a(bArrArray));
        return bArrArray;
    }

    public static byte[] f(String str, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        h[] hVarArr = {i(bArr), h(str), new h(c.TAG_BALANCE_NOTIFICATION_THRESHOLD, bArr2)};
        int length = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            h hVar = hVarArr[i14];
            if (hVar != null && (bArr4 = hVar.f50884a) != null) {
                length += bArr4.length;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 2);
        byteBufferAllocate.put((byte) (((byte) NfcCommandHandler.e.SET_EXPRESS_TRANSIT_CARD.f50841a) | UnsignedBytes.MAX_POWER_OF_TWO));
        byteBufferAllocate.put((byte) 4);
        for (int i15 = 0; i15 < 3; i15++) {
            h hVar2 = hVarArr[i15];
            if (hVar2 != null && (bArr3 = hVar2.f50884a) != null) {
                byteBufferAllocate.put(bArr3, 0, bArr3.length);
            }
        }
        return byteBufferAllocate.array();
    }

    public static h g(int i14) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i14);
        return new h(c.TAG_CARD_IMAGE_UNCOMPRESSED_SIZE, byteBufferAllocate.array());
    }

    public static h h(String str) {
        return new h(c.TAG_CARD_TYPE, str.getBytes());
    }

    public static h i(byte[] bArr) {
        return new h(c.TAG_CREDIT_CARD_ID, bArr);
    }

    public static h[] j(long j8, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putLong(j8);
        h hVar = new h(c.TAG_USER_ID, byteBufferAllocate.array());
        if (str.length() > 7) {
            str = str.substring(0, 7);
        }
        return new h[]{hVar, new h(c.TAG_SERVER_ENVIRONMENT, str.getBytes())};
    }

    public final byte[] d() {
        byte[] bArr = new byte[4];
        System.arraycopy(this.f50884a, 1, bArr, 0, 4);
        int i14 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        z.i("NfcTlv length = ", i14, f50883b);
        if (i14 < 0) {
            return null;
        }
        byte[] bArr2 = new byte[i14];
        System.arraycopy(this.f50884a, 5, bArr2, 0, i14);
        return bArr2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f50884a.length);
        parcel.writeByteArray(this.f50884a);
    }

    public h(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f50884a = bArr;
        parcel.readByteArray(bArr);
    }
}
