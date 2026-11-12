package com.miui.tsmclient.entity;

import android.content.Context;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MifareTag implements Parcelable {
    private static final int AUTHENTICATE_SUCCESS = 1;
    private static final int MAX_RETRY_COUNT = 5;
    private static final int MIFARE_MAX_KEY_COUNT = 32;
    private static final int MIFARE_TYPE_ENCRYPTED = 1;
    private static final int MIFARE_TYPE_NORMAL = 0;
    private static final int MIFARE_TYPE_UNKNOWN = 2;
    private static final String MI_CARD = "5849414F4D492E504159";
    public static final int MORE_CONTENT_TYPE_JSON = 2;
    public static final int MORE_CONTENT_TYPE_STRING = 1;
    private static final int NUMBER_INVALID = -1;
    private static final int READ_SECTOR_SUCCESS = 2;
    private String mAtqa;
    private List<Integer> mAuthFailedSectorsId;
    private String mBlockContent;
    private int mConsumedTime;
    private int mEncryptedSectorCount;
    private List<Integer> mEncryptionSectorsId;
    private List<Integer> mKeyBSectorsId;
    private int mMifareType;
    private String mSak;
    private String mSectorData;
    private int mSize;
    private String mUid;
    private List<Integer> mUnknownKeyAEncryptedSectorsId;
    private static final ByteArray DEFAULT_KEYA = ByteArray.wrap(new byte[]{-1, -1, -1, -1, -1, -1});
    private static final ByteArray DEFAULT_KEYB = ByteArray.wrap(new byte[]{-1, -1, -1, -1, -1, -1});
    private static final String DEFAULT_SECTOR_DATA = new String(new char[128]).replace("\u0000", "0");
    public static final Parcelable.Creator<MifareTag> CREATOR = new Parcelable.Creator<MifareTag>() { // from class: com.miui.tsmclient.entity.MifareTag.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MifareTag createFromParcel(Parcel parcel) {
            return new MifareTag(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MifareTag[] newArray(int i) {
            return new MifareTag[i];
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [android.nfc.tech.MifareClassic] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private static boolean authenticateWithRetry(MifareClassic mifareClassic, int i, byte[] bArr, boolean z) throws TagLostException {
        int i2 = 3;
        ?? AuthenticateSectorWithKeyA = mifareClassic;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return false;
            }
            try {
                AuthenticateSectorWithKeyA = z ? AuthenticateSectorWithKeyA.authenticateSectorWithKeyA(i, bArr) : AuthenticateSectorWithKeyA.authenticateSectorWithKeyB(i, bArr);
                return AuthenticateSectorWithKeyA;
            } catch (TagLostException e) {
                throw e;
            } catch (IOException unused) {
                LogUtils.e("failed to auth sector key, is keyA = " + z);
                i2 = i3;
                AuthenticateSectorWithKeyA = AuthenticateSectorWithKeyA;
            }
        }
    }

    private JSONArray buildSectors() {
        if (TextUtils.isEmpty(this.mBlockContent)) {
            return new JSONArray();
        }
        ByteArray byteArrayWrap = ByteArray.wrap(Coder.hexStringToBytes(this.mBlockContent));
        ArrayList arrayList = new ArrayList(16);
        int i = 0;
        while (i < 16) {
            int i2 = i * 64;
            if (byteArrayWrap.length() < i2 + 64) {
                break;
            }
            ArrayList arrayList2 = new ArrayList(4);
            ByteArray byteArrayCopy = byteArrayWrap.copy(i2, 64);
            if (i > 0) {
                ByteArray byteArrayCopy2 = byteArrayCopy.copy(0, 16);
                if (!ByteArray.equals(byteArrayCopy2, Block.BLANK)) {
                    arrayList2.add(new Block(0, byteArrayCopy2.toString()));
                }
            }
            ByteArray byteArrayCopy3 = byteArrayCopy.copy(16, 16);
            ByteArray byteArray = Block.BLANK;
            if (!ByteArray.equals(byteArrayCopy3, byteArray)) {
                arrayList2.add(new Block(1, byteArrayCopy3.toString()));
            }
            ByteArray byteArrayCopy4 = byteArrayCopy.copy(32, 16);
            if (!ByteArray.equals(byteArrayCopy4, byteArray)) {
                arrayList2.add(new Block(2, byteArrayCopy4.toString()));
            }
            String str = DEFAULT_KEYA.toString() + byteArrayCopy.copy(54, 4).toString() + DEFAULT_KEYB.toString();
            if (!str.equals(byteArray.toString())) {
                arrayList2.add(new Block(3, str));
            }
            if (arrayList2.size() != 0) {
                arrayList.add(new Sector(i, arrayList2));
                i++;
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jSONArray.put(((Sector) arrayList.get(i3)).serialize());
        }
        return jSONArray;
    }

    private static void formatSak(MifareTag mifareTag) {
        StringBuilder sb = new StringBuilder();
        int i = Integer.parseInt(mifareTag.getSak());
        if (i < 10) {
            sb.append("0");
        }
        sb.append(i);
        mifareTag.setSak(sb.toString());
    }

    public static MifareTag parseTag(Tag tag, int i) throws IOException {
        if (tag == null) {
            return null;
        }
        try {
            NfcA nfcA = NfcA.get(tag);
            if (nfcA == null) {
                IOUtils.closeQuietly(nfcA);
                return null;
            }
            IOUtils.closeQuietly(nfcA);
            MifareTag mifareTag = new MifareTag();
            mifareTag.setUid(Coder.bytesToHexString(tag.getId()));
            MifareClassic mifareClassic = MifareClassic.get(tag);
            if (mifareClassic != null) {
                LogUtils.d("read a mifare card");
                if (i == 2) {
                    mifareTag.setUid(String.valueOf(Coder.bytesToInt(tag.getId())));
                    mifareTag.setSak(Coder.bytesToHexString(Coder.shortToByte(nfcA.getSak())));
                    mifareTag.setAtqa(Coder.bytesToHexString(nfcA.getAtqa()));
                    formatSak(mifareTag);
                }
                readMoreContentForTag(mifareClassic, mifareTag);
            } else {
                LogUtils.d("read a other card");
                mifareTag.setMifareType(2);
            }
            return mifareTag;
        } catch (Throwable th) {
            IOUtils.closeQuietly((Closeable) null);
            throw th;
        }
    }

    private static boolean processAuthenticate(MifareClassic mifareClassic, int i, byte[] bArr, int i2, boolean z) throws IOException {
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return false;
            }
            if (z) {
                try {
                    if (mifareClassic.authenticateSectorWithKeyA(i, bArr)) {
                        return true;
                    }
                    LogUtils.t("failed to authenticate sector");
                } catch (TagLostException e) {
                    throw e;
                } catch (IOException unused) {
                    LogUtils.t("error occurred when read mifare sector");
                }
            } else {
                if (mifareClassic.authenticateSectorWithKeyB(i, bArr)) {
                    return true;
                }
                LogUtils.t("failed to authenticate sector");
            }
            i2 = i3;
        }
    }

    private void readFromParcel(Parcel parcel) {
        this.mUid = parcel.readString();
        this.mAtqa = parcel.readString();
        this.mSak = parcel.readString();
        this.mSize = parcel.readInt();
        this.mBlockContent = parcel.readString();
        this.mSectorData = parcel.readString();
        parcel.readList(this.mEncryptionSectorsId, Integer.class.getClassLoader());
        parcel.readList(this.mKeyBSectorsId, Integer.class.getClassLoader());
        parcel.readList(this.mUnknownKeyAEncryptedSectorsId, Integer.class.getClassLoader());
        this.mConsumedTime = parcel.readInt();
        this.mMifareType = parcel.readInt();
    }

    private static void readMoreContentForTag(MifareClassic mifareClassic, MifareTag mifareTag) throws IOException {
        if (mifareClassic != null) {
            mifareTag.setSize(mifareClassic.getSize());
            try {
                mifareClassic.connect();
                int sectorCount = mifareClassic.getSectorCount();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < sectorCount; i++) {
                    int iProcessAuthenticate = processAuthenticate(mifareClassic, sb, i, 5, true);
                    if ((iProcessAuthenticate & 1) == 0) {
                        mifareTag.mUnknownKeyAEncryptedSectorsId.add(Integer.valueOf(i));
                        mifareTag.mEncryptionSectorsId.add(Integer.valueOf(i));
                        iProcessAuthenticate = processAuthenticate(mifareClassic, sb, i, 5, false);
                        if ((iProcessAuthenticate & 1) == 1) {
                            mifareTag.mKeyBSectorsId.add(Integer.valueOf(i));
                        } else {
                            LogUtils.t("no default key, sector: " + i);
                        }
                    }
                    if ((iProcessAuthenticate & 2) == 0) {
                        LogUtils.d("encryption sector: " + i);
                        mifareTag.setMifareType(1);
                        sb.append(DEFAULT_SECTOR_DATA);
                    }
                    LogUtils.t("m1 content: " + sb.toString());
                    mifareTag.setBlockContent(sb.toString());
                }
            } finally {
                IOUtils.closeQuietly(mifareClassic);
            }
        }
    }

    private static String readSector(MifareClassic mifareClassic, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i2 = i * 4;
        for (int i3 = i2; i3 < i2 + 4; i3++) {
            byte[] block = mifareClassic.readBlock(i3);
            if (block == null || block.length <= 0) {
                return null;
            }
            sb.append(Coder.bytesToHexString(block));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAtqa() {
        return this.mAtqa;
    }

    public List<Integer> getAuthFailedSectorsId() {
        return this.mAuthFailedSectorsId;
    }

    public String getBlockContent() {
        return this.mBlockContent;
    }

    public int getConsumedTime() {
        return this.mConsumedTime;
    }

    public int getEncryptionSectorCount() {
        int i = this.mEncryptedSectorCount;
        return i == -1 ? this.mEncryptionSectorsId.size() : i;
    }

    public List<Integer> getKeyBSectorsId() {
        return this.mKeyBSectorsId;
    }

    public int getKnownKeyCount() {
        int i = 0;
        for (Integer num : this.mUnknownKeyAEncryptedSectorsId) {
            num.intValue();
            i = !this.mKeyBSectorsId.contains(num) ? i + 2 : i + 1;
        }
        return 32 - i;
    }

    public int getMifareType() {
        return this.mMifareType;
    }

    public String getSak() {
        return this.mSak;
    }

    public String getSectorData() {
        return this.mSectorData;
    }

    public int getSize() {
        return this.mSize;
    }

    public String getUid() {
        return this.mUid;
    }

    public List<Integer> getUnknownKeyAEncryptedSectorsId() {
        return this.mUnknownKeyAEncryptedSectorsId;
    }

    public boolean hasEncryptionSector() {
        return getEncryptionSectorCount() > 0;
    }

    public CheckMifareIssuedResponse isIssued(Context context) throws AuthApiException {
        return new TSMAuthManager().checkMifareIssued(context, this);
    }

    public boolean isLessThan1k() {
        return this.mSize <= 1024;
    }

    public void setAtqa(String str) {
        this.mAtqa = str;
    }

    public void setBlockContent(String str) {
        this.mBlockContent = str;
    }

    public void setConsumedTime(int i) {
        this.mConsumedTime = i;
    }

    public void setMifareType(int i) {
        this.mMifareType = i;
    }

    public void setSak(String str) {
        this.mSak = str;
    }

    public void setSectorData(String str) {
        this.mSectorData = str;
    }

    public void setSize(int i) {
        this.mSize = i;
    }

    public void setUid(String str) {
        this.mUid = str;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.EXTRA_MIFARE_TAG, this);
        return bundle;
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("atqa", getAtqa());
            jSONObject.put("sak", getSak());
            jSONObject.put("uid", getUid());
            jSONObject.put(MediaStoreUtil.MediaInfo.SIZE, getSize());
            jSONObject.put("sectors", buildSectors());
        } catch (JSONException unused) {
            LogUtils.e("mifareTag parse failed !");
        }
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUid);
        parcel.writeString(this.mAtqa);
        parcel.writeString(this.mSak);
        parcel.writeInt(this.mSize);
        parcel.writeString(this.mBlockContent);
        parcel.writeString(this.mSectorData);
        parcel.writeList(this.mEncryptionSectorsId);
        parcel.writeList(this.mKeyBSectorsId);
        parcel.writeList(this.mUnknownKeyAEncryptedSectorsId);
        parcel.writeInt(this.mConsumedTime);
        parcel.writeInt(this.mMifareType);
    }

    public MifareTag() {
        this.mMifareType = 0;
        this.mEncryptionSectorsId = new ArrayList();
        this.mKeyBSectorsId = new ArrayList();
        this.mUnknownKeyAEncryptedSectorsId = new ArrayList();
        this.mAuthFailedSectorsId = new ArrayList();
        this.mEncryptedSectorCount = -1;
        this.mAtqa = "0400";
        this.mSak = "08";
    }

    private static int processAuthenticate(MifareClassic mifareClassic, StringBuilder sb, int i, int i2, boolean z) throws TagLostException {
        IOException e;
        int i3;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            try {
                try {
                    if (authenticateWithRetry(mifareClassic, i, MifareClassic.KEY_DEFAULT, z)) {
                        i3 = 1;
                        try {
                            String sector = readSector(mifareClassic, i);
                            if (!TextUtils.isEmpty(sector)) {
                                sb.append(sector);
                                return 3;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            LogUtils.e("error occurred when read mifare sector use isKeyA:" + z, e);
                        }
                        i4 = i3;
                    } else {
                        LogUtils.d("failed to authenticate sector with default isKeyA:" + z);
                    }
                } catch (TagLostException e3) {
                    throw e3;
                }
            } catch (IOException e4) {
                int i6 = i4;
                e = e4;
                i3 = i6;
            }
            i2 = i5;
        }
    }

    private MifareTag(Parcel parcel) {
        this.mMifareType = 0;
        this.mEncryptionSectorsId = new ArrayList();
        this.mKeyBSectorsId = new ArrayList();
        this.mUnknownKeyAEncryptedSectorsId = new ArrayList();
        this.mAuthFailedSectorsId = new ArrayList();
        this.mEncryptedSectorCount = -1;
        readFromParcel(parcel);
    }

    public static MifareTag parseTag(Tag tag, List<SectorKey> list) throws IOException {
        if (tag == null) {
            return null;
        }
        try {
            NfcA nfcA = NfcA.get(tag);
            if (nfcA == null) {
                IOUtils.closeQuietly(nfcA);
                return null;
            }
            IOUtils.closeQuietly(nfcA);
            MifareTag mifareTag = new MifareTag();
            mifareTag.setUid(Coder.bytesToHexString(tag.getId()));
            MifareClassic mifareClassic = MifareClassic.get(tag);
            if (mifareClassic != null) {
                LogUtils.t("read a mifare card");
                mifareTag.setMifareType(1);
                readMoreContentForTag(mifareClassic, mifareTag, list);
            } else {
                LogUtils.t("read a other card");
                mifareTag.setMifareType(2);
            }
            return mifareTag;
        } catch (Throwable th) {
            IOUtils.closeQuietly((Closeable) null);
            throw th;
        }
    }

    private static void readMoreContentForTag(MifareClassic mifareClassic, MifareTag mifareTag, List<SectorKey> list) throws IOException {
        MifareClassic mifareClassic2 = mifareClassic;
        mifareTag.mEncryptedSectorCount = list.size();
        if (mifareClassic2 != null) {
            mifareTag.setSize(mifareClassic.getSize());
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                mifareClassic.connect();
                mifareTag.mAuthFailedSectorsId.clear();
                ArrayList arrayList = new ArrayList();
                if (!ObjectUtils.isCollectionEmpty(list)) {
                    int i = 0;
                    while (i < list.size()) {
                        SectorKey sectorKey = list.get(i);
                        Iterator<String> it = sectorKey.getKeyList().iterator();
                        int i2 = 0;
                        boolean z = false;
                        while (it.hasNext()) {
                            String next = it.next();
                            i2++;
                            boolean zProcessAuthenticate = processAuthenticate(mifareClassic2, sectorKey.getSectorId(), Coder.hexStringToBytes(next), 5, true);
                            if (zProcessAuthenticate) {
                                LogUtils.t("authenticateSectorWithKey success sectorId : " + sectorKey.getSectorId());
                                int sectorId = sectorKey.getSectorId();
                                ArrayList arrayList2 = new ArrayList();
                                int i3 = sectorId * 4;
                                int i4 = i3;
                                int i5 = 0;
                                while (i4 < i3 + 4) {
                                    byte[] block = mifareClassic2.readBlock(i4);
                                    if (block == null || block.length <= 0) {
                                        zProcessAuthenticate = zProcessAuthenticate;
                                    } else {
                                        String strBytesToHexString = Coder.bytesToHexString(block);
                                        if (i5 == 3) {
                                            strBytesToHexString = new StringBuilder(strBytesToHexString).replace(0, 12, next).toString();
                                        }
                                        Block block2 = new Block(i5, strBytesToHexString);
                                        LogUtils.t("sector id : " + sectorId + " block id: " + i4 + " block : " + strBytesToHexString);
                                        arrayList2.add(block2);
                                        i5++;
                                    }
                                    i4++;
                                    mifareClassic2 = mifareClassic;
                                    zProcessAuthenticate = zProcessAuthenticate;
                                    next = next;
                                }
                                Sector sector = new Sector(sectorId, arrayList2);
                                sector.setCountOfVerifiedKey(i2);
                                arrayList.add(sector);
                                z = zProcessAuthenticate;
                                break;
                            }
                            mifareClassic2 = mifareClassic;
                            z = zProcessAuthenticate;
                        }
                        if (!z) {
                            mifareTag.mAuthFailedSectorsId.add(Integer.valueOf(sectorKey.getSectorId()));
                        }
                        i++;
                        mifareClassic2 = mifareClassic;
                    }
                }
                String json = new Gson().toJson(arrayList);
                LogUtils.t("m1 encrypt content: " + json);
                mifareTag.setBlockContent(json);
            } finally {
                mifareTag.setConsumedTime(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis).intValue());
                IOUtils.closeQuietly(mifareClassic);
            }
        }
    }

    public MifareTag(List<Integer> list, List<Integer> list2, List<Integer> list3) {
        this.mMifareType = 0;
        this.mEncryptionSectorsId = new ArrayList();
        this.mKeyBSectorsId = new ArrayList();
        this.mUnknownKeyAEncryptedSectorsId = new ArrayList();
        this.mAuthFailedSectorsId = new ArrayList();
        this.mEncryptedSectorCount = -1;
        this.mEncryptionSectorsId = list;
        this.mKeyBSectorsId = list2;
        this.mUnknownKeyAEncryptedSectorsId = list3;
    }
}
