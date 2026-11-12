package com.amazon.identity.auth.device.dataobject;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.Time;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.amazon.identity.auth.device.datastore.AuthorizationTokenDataSource;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.amazon.identity.auth.device.datastore.EncryptionException;
import com.amazon.identity.auth.map.device.AccountManagerConstants;
import com.amazon.identity.auth.map.device.token.AbstractToken;
import com.amazon.identity.auth.map.device.token.Token;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthorizationToken extends AbstractDataObject implements Token {
    public static final String[] ALL_COLUMNS = {"Id", "AppId", "Token", "CreationTime", "ExpirationTime", DatabaseHelper.authorizationToken_MiscData, "type", DatabaseHelper.authorizationToken_DirectedId};
    private static final int DEFAULT_MINIMUM_TOKEN_LIFETIME = 300;
    private static final String LOG_TAG = "com.amazon.identity.auth.device.dataobject.AuthorizationToken";
    public String mAppFamilyId;
    public Date mCreationTime;
    private String mDirectedId;
    public Date mExpirationTime;
    public byte[] mMiscData;
    public String mTokenValue;
    public AUTHZ_TOKEN_TYPE mType;

    public enum AUTHZ_TOKEN_TYPE {
        ACCESS(AccountManagerConstants.ACCESS_TOKEN_TYPE_PREFIX),
        REFRESH(AccountManagerConstants.REFRESH_TOKEN_TYPE_PREFIX);

        private final String mType;

        AUTHZ_TOKEN_TYPE(String str) {
            this.mType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mType;
        }
    }

    public enum COL_INDEX {
        ID(0),
        APP_FAMILY_ID(1),
        TOKEN(2),
        CREATION_TIME(3),
        EXPIRATION_TIME(4),
        MISC_DATA(5),
        TYPE(6),
        DIRECTED_ID(7);

        public final int colId;

        COL_INDEX(int i) {
            this.colId = i;
        }
    }

    public AuthorizationToken(String str, String str2, String str3, Date date, Date date2, byte[] bArr, AUTHZ_TOKEN_TYPE authz_token_type) {
        this.mAppFamilyId = str;
        this.mTokenValue = str3;
        this.mCreationTime = DatabaseHelper.truncateFractionalSeconds(date);
        this.mExpirationTime = DatabaseHelper.truncateFractionalSeconds(date2);
        this.mMiscData = bArr;
        this.mType = authz_token_type;
        this.mDirectedId = str2;
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AuthorizationToken)) {
            try {
                AuthorizationToken authorizationToken = (AuthorizationToken) obj;
                return TextUtils.equals(this.mAppFamilyId, authorizationToken.getAppFamilyId()) && TextUtils.equals(this.mTokenValue, authorizationToken.getTokenValue()) && areObjectsEqual(this.mCreationTime, authorizationToken.getCreationTime()) && areObjectsEqual(this.mExpirationTime, authorizationToken.getExpirationTime()) && TextUtils.equals(getType(), authorizationToken.getType()) && TextUtils.equals(this.mDirectedId, authorizationToken.getDirectedId());
            } catch (NullPointerException e) {
                MAPLog.e(LOG_TAG, "" + e.toString());
            }
        }
        return false;
    }

    public String getAppFamilyId() {
        return this.mAppFamilyId;
    }

    public Date getCreationTime() {
        return this.mCreationTime;
    }

    @Override // com.amazon.identity.auth.map.device.token.Token
    public Map<String, String> getData() {
        String str;
        HashMap map = new HashMap();
        try {
            str = new String(this.mMiscData, UrlUtils.UTF8);
        } catch (UnsupportedEncodingException unused) {
            MAPLog.i(LOG_TAG, "unable to parse misc data");
            str = null;
        }
        if (str != null) {
            String[] strArrSplit = str.split(",");
            int length = strArrSplit.length;
            if (length % 2 == 0) {
                for (int i = 0; i < length; i += 2) {
                    map.put(strArrSplit[i], strArrSplit[i + 1]);
                }
            } else {
                MAPLog.i(LOG_TAG, "unable to parse misc data, key/value pairs do not match");
            }
        }
        return map;
    }

    @Override // com.amazon.identity.auth.map.device.token.Token
    public String getDirectedId() {
        return this.mDirectedId;
    }

    public Date getExpirationTime() {
        return this.mExpirationTime;
    }

    public long getId() {
        return getRowId();
    }

    @Override // com.amazon.identity.auth.map.device.token.Token
    public Time getLocalTimestamp() {
        Time time = new Time();
        time.set(this.mCreationTime.getTime());
        return time;
    }

    public byte[] getMiscData() {
        return this.mMiscData;
    }

    public String getTokenValue() {
        return this.mTokenValue;
    }

    @Override // com.amazon.identity.auth.map.device.token.Token
    public String getType() {
        return this.mType.toString();
    }

    public AUTHZ_TOKEN_TYPE getTypeAsEnum() {
        return this.mType;
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public ContentValues getValuesForInsert(Context context) throws EncryptionException {
        ContentValues contentValues = new ContentValues();
        SimpleDateFormat dateFormat = DatabaseHelper.getDateFormat();
        String[] strArr = ALL_COLUMNS;
        contentValues.put(strArr[COL_INDEX.APP_FAMILY_ID.colId], this.mAppFamilyId);
        contentValues.put(strArr[COL_INDEX.TOKEN.colId], AESEncryptionHelper.encryptString(this.mTokenValue, context));
        contentValues.put(strArr[COL_INDEX.CREATION_TIME.colId], dateFormat.format(this.mCreationTime));
        contentValues.put(strArr[COL_INDEX.EXPIRATION_TIME.colId], dateFormat.format(this.mExpirationTime));
        contentValues.put(strArr[COL_INDEX.MISC_DATA.colId], this.mMiscData);
        contentValues.put(strArr[COL_INDEX.TYPE.colId], Integer.valueOf(this.mType.ordinal()));
        contentValues.put(strArr[COL_INDEX.DIRECTED_ID.colId], this.mDirectedId);
        return contentValues;
    }

    public boolean isRemainingLifeAcceptable() {
        return isRemainingLifeAcceptable(300);
    }

    public void setAppFamilyId(String str) {
        this.mAppFamilyId = str;
    }

    public void setCreationTime(Date date) {
        this.mCreationTime = DatabaseHelper.truncateFractionalSeconds(date);
    }

    public void setDirectedId(String str) {
        this.mDirectedId = str;
    }

    public void setExpirationTime(Date date) {
        this.mExpirationTime = DatabaseHelper.truncateFractionalSeconds(date);
    }

    public void setId(long j) {
        setRowId(j);
    }

    public void setMiscData(byte[] bArr) {
        this.mMiscData = bArr;
    }

    public void setTokenValue(String str) {
        this.mTokenValue = str;
    }

    public String toLogString() {
        SimpleDateFormat dateFormat = DatabaseHelper.getDateFormat();
        return "{ rowid=" + getId() + ", appId=" + this.mAppFamilyId + ", token=" + this.mTokenValue + ", creationTime=" + dateFormat.format(this.mCreationTime) + ", expirationTime=" + dateFormat.format(this.mExpirationTime) + ", type=" + this.mType.toString() + ", directedId=<obscured> }";
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public String toString() {
        return this.mTokenValue;
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public AuthorizationTokenDataSource getDataSource(Context context) {
        return AuthorizationTokenDataSource.getInstance(context);
    }

    public boolean isRemainingLifeAcceptable(int i) {
        return this.mExpirationTime.getTime() - Calendar.getInstance().getTimeInMillis() >= AbstractToken.secsToMillis((long) i);
    }

    public AuthorizationToken() {
    }
}
