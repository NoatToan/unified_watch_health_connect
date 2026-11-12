package com.amazon.identity.auth.device.datastore;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import com.amazon.identity.auth.device.dataobject.AbstractDataObject;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AESEncryptionHelper<T extends AbstractDataObject> extends DataEncryptionUpgradeHelper {
    public static final boolean IS_QUALIFIED_PLATFORM;
    public static final String SEPARATOR = "|";
    private static final String TAG = "AESEncryptionHelper";
    public static final String VERSION = "AES_00";
    private String mTable_Namespace;

    static {
        IS_QUALIFIED_PLATFORM = Build.VERSION.SDK_INT >= 18;
    }

    public AESEncryptionHelper(Context context, String str) {
        super(context, VERSION);
        this.mTable_Namespace = str;
    }

    public static String encryptString(String str, Context context) throws EncryptionException {
        boolean z = IS_QUALIFIED_PLATFORM;
        if (z && context != null) {
            try {
                return AESEncryptor.getInstance(context).encryptData(str);
            } catch (Exception e) {
                MAPLog.e(TAG, "Unable to encrypt data", e);
                throw new EncryptionException(e);
            }
        }
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("No need to encrypt data. IS_QUALIFIED_PLATFORM : ");
        sb.append(z);
        sb.append(", Context is null: ");
        sb.append(context == null);
        MAPLog.d(str2, sb.toString());
        return str;
    }

    public String decryptString(String str) {
        if (!str.startsWith("AES_00|") || !IS_QUALIFIED_PLATFORM) {
            return str;
        }
        try {
            return AESEncryptor.getInstance(this.mContext).decryptData(str);
        } catch (Exception e) {
            MAPLog.e(TAG, "Unable to decrypt data, return null", e);
            return null;
        }
    }

    @Override // com.amazon.identity.auth.device.datastore.DataEncryptionUpgradeHelper
    public void onDowngrade(String str, AbstractDataSource abstractDataSource) {
        MAPLog.i(TAG, "onDowngrade called");
    }

    @Override // com.amazon.identity.auth.device.datastore.DataEncryptionUpgradeHelper
    public void onUpgrade(AbstractDataSource abstractDataSource) {
        String storedVersion = getStoredVersion(this.mTable_Namespace);
        if (VERSION.equals(storedVersion) || !IS_QUALIFIED_PLATFORM) {
            MAPLog.d(TAG, "No need to upgrade.");
            return;
        }
        if (storedVersion != null && !DataEncryptionUpgradeHelper.EXISTED_VERSIONS.contains(storedVersion)) {
            MAPLog.e(TAG, "Encryption version is not recognized.");
            storeEncryptionVersion(this.mTable_Namespace);
            return;
        }
        try {
            MAPLog.i(TAG, "onUpgrade called, updating the table...");
            List listFindAllRows = abstractDataSource.findAllRows(null, null);
            ContentValues[] contentValuesArr = new ContentValues[listFindAllRows.size()];
            for (int i = 0; i < listFindAllRows.size(); i++) {
                contentValuesArr[i] = ((AbstractDataObject) listFindAllRows.get(i)).getValuesForInsert(this.mContext);
            }
            boolean zUpdateRow = true;
            for (int i2 = 0; i2 < listFindAllRows.size(); i2++) {
                zUpdateRow &= abstractDataSource.updateRow(((AbstractDataObject) listFindAllRows.get(i2)).getRowId(), contentValuesArr[i2]);
            }
            if (zUpdateRow) {
                storeEncryptionVersion(this.mTable_Namespace);
            } else {
                MAPLog.w(TAG, "Fail to insert updated data to db");
            }
        } catch (EncryptionException e) {
            MAPLog.e(TAG, "Unable to complete the upgrading, abort.", e);
        }
    }
}
