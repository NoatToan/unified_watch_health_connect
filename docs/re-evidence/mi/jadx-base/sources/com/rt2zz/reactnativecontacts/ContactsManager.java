package com.rt2zz.reactnativecontacts;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.provider.ContactsContract;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.bh4;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes6.dex */
public class ContactsManager extends ReactContextBaseJavaModule {
    private static final String PERMISSION_AUTHORIZED = "authorized";
    private static final String PERMISSION_DENIED = "denied";
    private static final String PERMISSION_READ_CONTACTS = "android.permission.READ_CONTACTS";
    private static final int PERMISSION_REQUEST_CODE = 888;
    private static Callback requestCallback;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f10592a;

        public a(Callback callback) {
            this.f10592a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10592a.invoke(null, new bh4(ContactsManager.this.getReactApplicationContext().getContentResolver()).d());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f10595b;

        public b(String str, Callback callback) {
            this.f10594a = str;
            this.f10595b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10595b.invoke(null, new bh4(ContactsManager.this.getReactApplicationContext().getContentResolver()).e(this.f10594a));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f10597b;

        public c(String str, Callback callback) {
            this.f10596a = str;
            this.f10597b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10597b.invoke(null, new bh4(ContactsManager.this.getReactApplicationContext().getContentResolver()).f(this.f10596a));
        }
    }

    public ContactsManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void getAllContacts(Callback callback) {
        AsyncTask.execute(new a(callback));
    }

    private void getAllContactsMatchingString(String str, Callback callback) {
        AsyncTask.execute(new b(str, callback));
    }

    private String isPermissionGranted() {
        return getReactApplicationContext().checkCallingOrSelfPermission(PERMISSION_READ_CONTACTS) == 0 ? PERMISSION_AUTHORIZED : "denied";
    }

    private int mapStringToEmailType(String str) {
        str.hashCode();
        switch (str) {
            case "mobile":
                return 4;
            case "home":
                return 1;
            case "work":
                return 2;
            default:
                return 3;
        }
    }

    private int mapStringToPhoneType(String str) {
        str.hashCode();
        switch (str) {
            case "mobile":
                return 2;
            case "home":
                return 1;
            case "work":
                return 3;
            default:
                return 7;
        }
    }

    private int mapStringToPostalAddressType(String str) {
        str.hashCode();
        if (str.equals("home")) {
            return 1;
        }
        return !str.equals("work") ? 3 : 2;
    }

    public static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Callback callback = requestCallback;
        if (callback == null) {
            return;
        }
        if (i != PERMISSION_REQUEST_CODE) {
            callback.invoke(null, "denied");
            return;
        }
        Hashtable hashtable = new Hashtable();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            hashtable.put(strArr[i2], Boolean.valueOf(iArr[i2] == 0));
        }
        if (hashtable.containsKey(PERMISSION_READ_CONTACTS) && ((Boolean) hashtable.get(PERMISSION_READ_CONTACTS)).booleanValue()) {
            requestCallback.invoke(null, PERMISSION_AUTHORIZED);
        } else {
            requestCallback.invoke(null, "denied");
        }
        requestCallback = null;
    }

    private void requestReadContactsPermission(Callback callback) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(null, "denied");
        } else if (isPermissionGranted().equals(PERMISSION_AUTHORIZED)) {
            callback.invoke(null, PERMISSION_AUTHORIZED);
        } else {
            requestCallback = callback;
            androidx.core.app.a.v(currentActivity, new String[]{PERMISSION_READ_CONTACTS}, PERMISSION_REQUEST_CODE);
        }
    }

    @ReactMethod
    public void addContact(ReadableMap readableMap, Callback callback) {
        String str;
        Integer[] numArr;
        String[] strArr;
        int i;
        String[] strArr2;
        Integer[] numArr2;
        int i2;
        String[] strArr3;
        ContactsManager contactsManager;
        Callback callback2;
        Bitmap bitmapDecodeFile;
        String string = readableMap.hasKey("givenName") ? readableMap.getString("givenName") : null;
        String string2 = readableMap.hasKey("middleName") ? readableMap.getString("middleName") : null;
        String string3 = readableMap.hasKey("familyName") ? readableMap.getString("familyName") : null;
        String string4 = readableMap.hasKey("prefix") ? readableMap.getString("prefix") : null;
        String string5 = readableMap.hasKey("suffix") ? readableMap.getString("suffix") : null;
        String string6 = readableMap.hasKey("company") ? readableMap.getString("company") : null;
        String string7 = readableMap.hasKey("jobTitle") ? readableMap.getString("jobTitle") : null;
        String string8 = readableMap.hasKey("department") ? readableMap.getString("department") : null;
        String string9 = readableMap.hasKey("thumbnailPath") ? readableMap.getString("thumbnailPath") : null;
        ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
        if (array != null) {
            int size = array.size();
            strArr = new String[size];
            numArr = new Integer[size];
            int i3 = 0;
            while (i3 < size) {
                strArr[i3] = array.getMap(i3).getString(RealNameWebViewActivity.NUMBER);
                numArr[i3] = Integer.valueOf(mapStringToPhoneType(array.getMap(i3).getString("label")));
                i3++;
                size = size;
                string8 = string8;
            }
            str = string8;
            i = size;
        } else {
            str = string8;
            numArr = null;
            strArr = null;
            i = 0;
        }
        ReadableArray array2 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        if (array2 != null) {
            int size2 = array2.size();
            strArr3 = new String[size2];
            numArr2 = new Integer[size2];
            int i4 = 0;
            while (i4 < size2) {
                strArr3[i4] = array2.getMap(i4).getString("email");
                numArr2[i4] = Integer.valueOf(mapStringToEmailType(array2.getMap(i4).getString("label")));
                i4++;
                size2 = size2;
                strArr = strArr;
            }
            strArr2 = strArr;
            i2 = size2;
        } else {
            strArr2 = strArr;
            numArr2 = null;
            i2 = 0;
            strArr3 = null;
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        Integer[] numArr3 = numArr2;
        arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", string).withValue("data5", string2).withValue("data3", string3).withValue("data4", string4).withValue("data6", string5).build());
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", string6).withValue("data4", string7).withValue("data5", str);
        arrayList.add(builderWithValue.build());
        builderWithValue.withYieldAllowed(true);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", strArr2[i5]).withValue("data2", numArr[i5]).build());
        }
        for (int i6 = 0; i6 < i2; i6++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", strArr3[i6]).withValue("data2", numArr3[i6]).build());
        }
        if (string9 == 0 || string9.isEmpty() || (bitmapDecodeFile = BitmapFactory.decodeFile(string9)) == null) {
            contactsManager = this;
        } else {
            contactsManager = this;
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", contactsManager.toByteArray(bitmapDecodeFile)).build());
        }
        ReadableArray array3 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array3 != null) {
            for (int i7 = 0; i7 < array3.size(); i7++) {
                ReadableMap map = array3.getMap(i7);
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data2", Integer.valueOf(contactsManager.mapStringToPostalAddressType(map.getString("label")))).withValue("data4", map.getString("street")).withValue("data7", map.getString("city")).withValue("data8", map.getString("state")).withValue("data9", map.getString("postCode")).withValue("data10", map.getString("country")).build());
            }
        }
        try {
            ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
            ContentProviderResult[] contentProviderResultArrApplyBatch = contentResolver.applyBatch(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, arrayList);
            if (contentProviderResultArrApplyBatch == null || contentProviderResultArrApplyBatch.length <= 0) {
                return;
            }
            Object[] objArr = {null, new bh4(contentResolver).c(String.valueOf(ContentUris.parseId(contentProviderResultArrApplyBatch[0].uri)))};
            callback2 = callback;
            try {
                callback2.invoke(objArr);
                return;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            callback2 = callback;
        }
        callback2.invoke(e.toString());
    }

    @ReactMethod
    public void checkPermission(Callback callback) {
        callback.invoke(null, isPermissionGranted());
    }

    @ReactMethod
    public void deleteContact(ReadableMap readableMap, Callback callback) {
        String string = readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null;
        try {
            if (getReactApplicationContext().getContentResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, string), null, null) > 0) {
                callback.invoke(null, string);
            } else {
                callback.invoke(null, null);
            }
        } catch (Exception e) {
            callback.invoke(e.toString(), null);
        }
    }

    @ReactMethod
    public void getAll(Callback callback) {
        getAllContacts(callback);
    }

    @ReactMethod
    public void getAllWithoutPhotos(Callback callback) {
        getAllContacts(callback);
    }

    @ReactMethod
    public void getContactsMatchingString(String str, Callback callback) {
        getAllContactsMatchingString(str, callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Contacts";
    }

    @ReactMethod
    public void getPhotoForId(String str, Callback callback) {
        AsyncTask.execute(new c(str, callback));
    }

    @ReactMethod
    public void openContactForm(ReadableMap readableMap, Callback callback) {
        String str;
        String[] strArr;
        Integer[] numArr;
        int size;
        int i;
        Integer[] numArr2;
        int size2;
        String[] strArr2;
        String str2;
        String[] strArr3;
        String[] strArr4;
        int size3;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String string = readableMap.hasKey("givenName") ? readableMap.getString("givenName") : null;
        String string2 = readableMap.hasKey("middleName") ? readableMap.getString("middleName") : null;
        String string3 = readableMap.hasKey(MediaStoreUtil.MediaInfo.DISPLAY_NAME) ? readableMap.getString(MediaStoreUtil.MediaInfo.DISPLAY_NAME) : null;
        String string4 = readableMap.hasKey("familyName") ? readableMap.getString("familyName") : null;
        String string5 = readableMap.hasKey("prefix") ? readableMap.getString("prefix") : null;
        String string6 = readableMap.hasKey("suffix") ? readableMap.getString("suffix") : null;
        String string7 = readableMap.hasKey("company") ? readableMap.getString("company") : null;
        String string8 = readableMap.hasKey("jobTitle") ? readableMap.getString("jobTitle") : null;
        String string9 = readableMap.hasKey("department") ? readableMap.getString("department") : null;
        ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
        if (array != null) {
            size = array.size();
            strArr = new String[size];
            numArr = new Integer[size];
            int i2 = 0;
            while (i2 < size) {
                strArr[i2] = array.getMap(i2).getString(RealNameWebViewActivity.NUMBER);
                numArr[i2] = Integer.valueOf(mapStringToPhoneType(array.getMap(i2).getString("label")));
                i2++;
                size = size;
                string9 = string9;
            }
            str = string9;
        } else {
            str = string9;
            strArr = null;
            numArr = null;
            size = 0;
        }
        ReadableArray array2 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        if (array2 != null) {
            size2 = array2.size();
            strArr2 = new String[size2];
            numArr2 = new Integer[size2];
            int i3 = 0;
            while (true) {
                int i4 = size2;
                if (i3 >= size2) {
                    break;
                }
                strArr2[i3] = array2.getMap(i3).getString("email");
                numArr2[i3] = Integer.valueOf(mapStringToEmailType(array2.getMap(i3).getString("label")));
                i3++;
                size2 = i4;
                size = size;
            }
            i = size;
        } else {
            i = size;
            numArr2 = null;
            size2 = 0;
            strArr2 = null;
        }
        ReadableArray array3 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array3 != null) {
            size3 = array3.size();
            String[] strArr8 = new String[size3];
            strArr7 = new String[size3];
            String[] strArr9 = new String[size3];
            String[] strArr10 = new String[size3];
            strArr6 = new String[size3];
            strArr5 = new String[size3];
            Integer[] numArr3 = new Integer[size3];
            int i5 = 0;
            while (true) {
                int i6 = size3;
                if (i5 >= size3) {
                    break;
                }
                strArr8[i5] = array3.getMap(i5).getString("street");
                strArr7[i5] = array3.getMap(i5).getString("city");
                strArr9[i5] = array3.getMap(i5).getString("state");
                strArr10[i5] = array3.getMap(i5).getString("region");
                strArr6[i5] = array3.getMap(i5).getString("postCode");
                strArr5[i5] = array3.getMap(i5).getString("country");
                numArr3[i5] = Integer.valueOf(mapStringToPostalAddressType(array3.getMap(i5).getString("label")));
                i5++;
                size3 = i6;
                string5 = string5;
            }
            str2 = string5;
            strArr3 = strArr10;
            strArr4 = strArr8;
        } else {
            str2 = string5;
            strArr3 = null;
            strArr4 = null;
            size3 = 0;
            strArr5 = null;
            strArr6 = null;
            strArr7 = null;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/identity");
        contentValues.put("data2", string);
        contentValues.put("data3", string4);
        contentValues.put("data5", string2);
        contentValues.put("data4", str2);
        contentValues.put("data6", string6);
        arrayList.add(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("mimetype", "vnd.android.cursor.item/organization");
        contentValues2.put("data1", string7);
        contentValues2.put("data4", string8);
        contentValues2.put("data5", str);
        arrayList.add(contentValues2);
        int i7 = size2;
        for (int i8 = 0; i8 < i7; i8++) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/email_v2");
            contentValues3.put("data2", numArr2[i8]);
            contentValues3.put("data1", strArr2[i8]);
            arrayList.add(contentValues3);
        }
        int i9 = i;
        for (int i10 = 0; i10 < i9; i10++) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("mimetype", "vnd.android.cursor.item/phone_v2");
            contentValues4.put("data2", numArr[i10]);
            contentValues4.put("data1", strArr[i10]);
            arrayList.add(contentValues4);
        }
        for (int i11 = 0; i11 < size3; i11++) {
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
            contentValues5.put("data4", strArr4[i11]);
            contentValues5.put("data7", strArr7[i11]);
            contentValues5.put("data8", strArr3[i11]);
            contentValues5.put("data10", strArr5[i11]);
            contentValues5.put("data9", strArr6[i11]);
            arrayList.add(contentValues5);
        }
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", string3);
        intent.putParcelableArrayListExtra("data", arrayList);
        intent.setFlags(268435456);
        getReactApplicationContext().startActivity(intent);
    }

    @ReactMethod
    public void requestPermission(Callback callback) {
        requestReadContactsPermission(callback);
    }

    public byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactMethod
    public void updateContact(ReadableMap readableMap, Callback callback) {
        String str;
        Object[] objArr;
        String[] strArr;
        Object[] objArr2;
        int size;
        String[] strArr2;
        int size2;
        Integer[] numArr;
        String[] strArr3;
        int i;
        ContactsManager contactsManager;
        Callback callback2;
        Bitmap bitmapDecodeFile;
        String string = readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null;
        String string2 = readableMap.hasKey("rawContactId") ? readableMap.getString("rawContactId") : null;
        String string3 = readableMap.hasKey("givenName") ? readableMap.getString("givenName") : null;
        String string4 = readableMap.hasKey("middleName") ? readableMap.getString("middleName") : null;
        String string5 = readableMap.hasKey("familyName") ? readableMap.getString("familyName") : null;
        String string6 = readableMap.hasKey("prefix") ? readableMap.getString("prefix") : null;
        String string7 = readableMap.hasKey("suffix") ? readableMap.getString("suffix") : null;
        String string8 = readableMap.hasKey("company") ? readableMap.getString("company") : null;
        String string9 = readableMap.hasKey("jobTitle") ? readableMap.getString("jobTitle") : null;
        String string10 = readableMap.hasKey("department") ? readableMap.getString("department") : null;
        String string11 = readableMap.hasKey("thumbnailPath") ? readableMap.getString("thumbnailPath") : null;
        ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
        String str2 = string11;
        if (array != null) {
            size = array.size();
            objArr = new String[size];
            objArr2 = new Integer[size];
            strArr = new String[size];
            int i2 = 0;
            while (i2 < size) {
                int i3 = size;
                ReadableMap map = array.getMap(i2);
                ReadableArray readableArray = array;
                Object string12 = map.getString(RealNameWebViewActivity.NUMBER);
                String str3 = string7;
                String string13 = map.getString("label");
                String string14 = map.hasKey("id") ? map.getString("id") : null;
                objArr[i2] = string12;
                objArr2[i2] = Integer.valueOf(mapStringToPhoneType(string13));
                strArr[i2] = string14;
                i2++;
                size = i3;
                array = readableArray;
                string7 = str3;
            }
            str = string7;
        } else {
            str = string7;
            objArr = null;
            strArr = null;
            objArr2 = null;
            size = 0;
        }
        ReadableArray array2 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        if (array2 != null) {
            size2 = array2.size();
            strArr3 = new String[size2];
            strArr2 = new String[size2];
            numArr = new Integer[size2];
            int i4 = 0;
            while (true) {
                int i5 = size2;
                if (i4 >= size2) {
                    break;
                }
                ReadableMap map2 = array2.getMap(i4);
                ReadableArray readableArray2 = array2;
                strArr3[i4] = map2.getString("email");
                numArr[i4] = Integer.valueOf(mapStringToEmailType(map2.getString("label")));
                strArr2[i4] = map2.hasKey("id") ? map2.getString("id") : null;
                i4++;
                size2 = i5;
                array2 = readableArray2;
            }
        } else {
            strArr2 = null;
            size2 = 0;
            numArr = null;
            strArr3 = null;
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id=?", new String[]{String.valueOf(string)}).withValue("account_type", null).withValue("account_name", null).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("contact_id=?", new String[]{String.valueOf(string)}).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", string3).withValue("data5", string4).withValue("data3", string5).withValue("data4", string6).withValue("data6", str).build());
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newUpdate(uri).withSelection("contact_id=? AND mimetype = ?", new String[]{String.valueOf(string), "vnd.android.cursor.item/organization"}).withValue("data1", string8).withValue("data4", string9).withValue("data5", string10);
        arrayList.add(builderWithValue.build());
        builderWithValue.withYieldAllowed(true);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add((strArr[i6] == null ? ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", String.valueOf(string2)).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", objArr[i6]).withValue("data2", objArr2[i6]) : ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("_id=?", new String[]{String.valueOf(strArr[i6])}).withValue("data1", objArr[i6]).withValue("data2", objArr2[i6])).build());
        }
        for (int i7 = 0; i7 < size2; i7++) {
            arrayList.add((strArr2[i7] == null ? ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", String.valueOf(string2)).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", strArr3[i7]).withValue("data2", numArr[i7]) : ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("_id=?", new String[]{String.valueOf(strArr2[i7])}).withValue("data1", strArr3[i7]).withValue("data2", numArr[i7])).build());
        }
        if (str2 == null || str2.isEmpty() || (bitmapDecodeFile = BitmapFactory.decodeFile(str2)) == null) {
            i = 0;
            contactsManager = this;
        } else {
            i = 0;
            contactsManager = this;
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", contactsManager.toByteArray(bitmapDecodeFile)).build());
        }
        ReadableArray array3 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array3 != null) {
            for (int i8 = i; i8 < array3.size(); i8++) {
                ReadableMap map3 = array3.getMap(i8);
                arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype = ?", new String[]{String.valueOf(string), "vnd.android.cursor.item/postal-address_v2"}).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data2", Integer.valueOf(contactsManager.mapStringToPostalAddressType(map3.getString("label")))).withValue("data4", map3.getString("street")).withValue("data7", map3.getString("city")).withValue("data8", map3.getString("state")).withValue("data9", map3.getString("postCode")).withValue("data10", map3.getString("country")).build());
            }
        }
        try {
            ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
            ContentProviderResult[] contentProviderResultArrApplyBatch = contentResolver.applyBatch(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, arrayList);
            if (contentProviderResultArrApplyBatch == null || contentProviderResultArrApplyBatch.length <= 0) {
                return;
            }
            callback2 = callback;
            try {
                callback2.invoke(null, new bh4(contentResolver).b(string));
                return;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            callback2 = callback;
        }
        callback2.invoke(e.toString());
    }
}
