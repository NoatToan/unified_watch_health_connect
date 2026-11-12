package com.amazon.identity.auth.device.dataobject;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.amazon.identity.auth.device.datastore.EncryptionException;
import com.amazon.identity.auth.device.datastore.ProfileDataSource;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Profile extends AbstractDataObject {
    public static final String[] ALL_COLUMNS = {"Id", "ExpirationTime", "AppId", "Data"};
    private static final int EXPIRATION_TIME = 3600000;
    private static final String LOG_TAG = "com.amazon.identity.auth.device.dataobject.Profile";
    public String mAppFamilyId;
    public String mData;
    public Date mExpirationTime;

    public enum COL_INDEX {
        ID(0),
        EXPIRATION_TIME(1),
        APP_ID(2),
        DATA(3);

        public final int colId;

        COL_INDEX(int i) {
            this.colId = i;
        }
    }

    public Profile() {
    }

    private boolean dataEquals(Profile profile) {
        try {
            JSONObject jSONObject = new JSONObject(this.mData);
            JSONObject jSONObject2 = new JSONObject(profile.getData());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.getString(next).equals(jSONObject2.getString(next))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return TextUtils.equals(this.mData, profile.getData());
        }
    }

    private Bundle getDataFromJSON() throws AuthError {
        Bundle bundle = new Bundle();
        if (this.mData != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.mData);
                try {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        bundle.putString(next, jSONObject.getString(next));
                    }
                } catch (JSONException e) {
                    MAPLog.e(LOG_TAG, "Unable to parse profile data in database " + e.getMessage());
                }
            } catch (JSONException e2) {
                MAPLog.e(LOG_TAG, "JSONException while parsing profile information in database", e2);
                throw new AuthError("JSONException while parsing profile information in database", e2, AuthError.ERROR_TYPE.ERROR_JSON);
            }
        }
        return bundle;
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Profile)) {
            try {
                Profile profile = (Profile) obj;
                return TextUtils.equals(this.mAppFamilyId, profile.getAppFamilyId()) && areObjectsEqual(this.mExpirationTime, profile.getExpirationTime()) && dataEquals(profile);
            } catch (NullPointerException e) {
                MAPLog.e(LOG_TAG, "" + e.toString());
            }
        }
        return false;
    }

    public String getAppFamilyId() {
        return this.mAppFamilyId;
    }

    public String getData() {
        return this.mData;
    }

    public Bundle getDataAsBundle() throws AuthError {
        return getDataFromJSON();
    }

    public Date getExpirationTime() {
        return this.mExpirationTime;
    }

    public long getId() {
        return getRowId();
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public ContentValues getValuesForInsert(Context context) throws EncryptionException {
        ContentValues contentValues = new ContentValues();
        String[] strArr = ALL_COLUMNS;
        contentValues.put(strArr[COL_INDEX.APP_ID.colId], this.mAppFamilyId);
        if (this.mExpirationTime != null) {
            contentValues.put(strArr[COL_INDEX.EXPIRATION_TIME.colId], DatabaseHelper.getDateFormat().format(this.mExpirationTime));
        } else {
            contentValues.put(strArr[COL_INDEX.EXPIRATION_TIME.colId], (String) null);
        }
        contentValues.put(strArr[COL_INDEX.DATA.colId], AESEncryptionHelper.encryptString(this.mData, context));
        return contentValues;
    }

    public boolean hasExpired() {
        Date date = this.mExpirationTime;
        if (date != null) {
            return date.before(Calendar.getInstance().getTime());
        }
        return true;
    }

    public void setAppId(String str) {
        this.mAppFamilyId = str;
    }

    public void setData(String str) {
        this.mData = str;
    }

    public void setExpirationTime(Date date) {
        this.mExpirationTime = DatabaseHelper.truncateFractionalSeconds(date);
    }

    public void setId(long j) {
        setRowId(j);
    }

    public String toLogString() {
        return "{ rowid=" + getId() + ", appId=" + this.mAppFamilyId + ", expirationTime=" + DatabaseHelper.getDateFormat().format(this.mExpirationTime) + ", data=" + this.mData + " }";
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public String toString() {
        return toLogString();
    }

    public Profile(String str, String str2) {
        this(str, str2, new Date(Calendar.getInstance().getTime().getTime() + 3600000));
    }

    @Override // com.amazon.identity.auth.device.dataobject.AbstractDataObject
    public ProfileDataSource getDataSource(Context context) {
        return ProfileDataSource.getInstance(context);
    }

    public Profile(String str, String str2, Date date) {
        this.mAppFamilyId = str;
        this.mData = str2;
        this.mExpirationTime = date;
    }
}
