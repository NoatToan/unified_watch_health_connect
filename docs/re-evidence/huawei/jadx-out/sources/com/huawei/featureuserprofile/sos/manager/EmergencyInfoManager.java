package com.huawei.featureuserprofile.sos.manager;

import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.interf.ContactInfoChangeListener;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.networkclient.ResultCallback;
import defpackage.cxy;
import defpackage.cxz;
import defpackage.cyb;
import defpackage.inv;
import defpackage.iod;
import defpackage.iof;
import defpackage.lsg;
import defpackage.ltg;
import defpackage.lua;
import defpackage.njy;
import defpackage.qqf;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class EmergencyInfoManager extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static EmergencyInfoManager f5692c;
    private ContactInfoChangeListener f;
    private ContentObserver g;
    private HashMap h;
    private CountDownTimer i;
    private Context j;
    private EmergencyContactChangeReceiver k;
    private List<iod> l;
    private BroadcastReceiver m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5690a = "content://" + BaseApplication.getAppPackage() + ".sos.provider";
    private static final Object d = new Object();
    private static final String[] e = {"android.permission.READ_CONTACTS"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f5691b = Uri.parse("content://com.android.emergency.EmergencyInfoProvider");

    private EmergencyInfoManager(Context context) {
        super(context);
        this.l = new ArrayList(10);
        this.h = null;
        this.g = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.5
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return super.deliverSelfNotifications();
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                LogUtil.a("EmergencyInfoManager", "contactObserver onChange");
                EmergencyInfoManager.this.i.cancel();
                EmergencyInfoManager.this.i.start();
            }
        };
        this.m = new BroadcastReceiver() { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                    LogUtil.d("EmergencyInfoManager", "mImageInfoReceiver intent is null");
                    return;
                }
                if ("image_info_sync".equals(intent.getAction())) {
                    Serializable serializableExtra = intent.getSerializableExtra("image_info");
                    if (serializableExtra instanceof HashMap) {
                        EmergencyInfoManager.this.h = (HashMap) serializableExtra;
                    } else {
                        LogUtil.a("EmergencyInfoManager", "image is null");
                    }
                }
            }
        };
        LogUtil.a("EmergencyInfoManager", "EmergencyInfoManager init");
        d(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("image_info_sync");
        BroadcastManagerUtil.d(context, this.m, intentFilter);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager$3] */
    private void d(Context context) {
        this.j = context.getApplicationContext();
        if (!s()) {
            new HandlerThread("EmergencyInfoManager") { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.3
                @Override // android.os.HandlerThread
                protected void onLooperPrepared() {
                    EmergencyInfoManager.this.r();
                }
            }.start();
        } else {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.i = new CountDownTimer(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, 1000L) { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.4
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                EmergencyInfoManager.this.x();
                LogUtil.a("EmergencyInfoManager", "UPDATE_CONTACT");
            }
        };
    }

    private boolean s() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1030;
    }

    public static EmergencyInfoManager a() {
        EmergencyInfoManager emergencyInfoManager;
        synchronized (d) {
            if (f5692c == null) {
                f5692c = new EmergencyInfoManager(BaseApplication.getContext());
            }
            emergencyInfoManager = f5692c;
        }
        return emergencyInfoManager;
    }

    public void c(ContactInfoChangeListener contactInfoChangeListener) {
        if (contactInfoChangeListener == null) {
            LogUtil.d("EmergencyInfoManager", "setContactInfoChangeListener contactChangeListener is null");
        } else {
            this.f = contactInfoChangeListener;
            LogUtil.a("EmergencyInfoManager", "setContactInfoChangeListener");
        }
    }

    public void m() {
        LogUtil.a("EmergencyInfoManager", "removeContactInfoChangeListener");
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        List<iod> listB = b(this.j);
        boolean z = this.l.size() != listB.size();
        for (iod iodVar : this.l) {
            if (iodVar == null) {
                LogUtil.d("EmergencyInfoManager", "onUpdatingContact contactInfo is null");
            } else {
                if (z) {
                    LogUtil.a("EmergencyInfoManager", "break in mEmergencyContactsUris");
                    break;
                }
                for (iod iodVar2 : listB) {
                    if (iodVar2 == null) {
                        LogUtil.d("EmergencyInfoManager", "onUpdatingContact newInfo is null");
                    } else if (iodVar.a() == null || iodVar2.a() == null) {
                        LogUtil.d("EmergencyInfoManager", "refreshUi getUri() is null");
                    } else if (iodVar.d() == null || iodVar2.d() == null) {
                        LogUtil.d("EmergencyInfoManager", "refreshUi getContactVersion() is null");
                    } else if (iodVar.a().equals(iodVar2.a()) && !iodVar.d().equals(iodVar2.d())) {
                        LogUtil.a("EmergencyInfoManager", "break in updateContactsUris");
                        z = true;
                        break;
                    }
                }
            }
        }
        LogUtil.a("EmergencyInfoManager", "onUpdatingContact isContactInfoChanged:", Boolean.valueOf(z));
        if (z) {
            c(listB, true);
            ContactInfoChangeListener contactInfoChangeListener = this.f;
            if (contactInfoChangeListener != null) {
                contactInfoChangeListener.onContactInfoChange();
            }
        }
        this.l = listB;
    }

    public void n() {
        if (this.k == null) {
            ReleaseLogUtil.d("R_EmergencyInfoManager", "Enter registerEmergencyContactChange()");
            this.k = new EmergencyContactChangeReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.emergency.action.EMERGENCY_INFO_CHANGED");
            BroadcastManagerUtil.a(this.j, this.k, intentFilter);
        }
    }

    public void t() {
        if (this.k != null) {
            ReleaseLogUtil.d("R_EmergencyInfoManager", "Enter unregisterEmergencyContactChange");
            try {
                this.j.unregisterReceiver(this.k);
            } catch (IllegalArgumentException e2) {
                ReleaseLogUtil.a("R_EmergencyInfoManager", "unregisterEmergencyContactChange illegalArgumentException ", LogAnonymous.b(e2));
            }
            this.k = null;
        }
    }

    public boolean h() {
        return lsg.d(this.j, e);
    }

    public void k() {
        if (h()) {
            try {
                ReleaseLogUtil.d("R_EmergencyInfoManager", "registerContactChangeObserver");
                this.j.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, this.g);
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EmergencyInfoManager.this.j()) {
                            EmergencyInfoManager.this.n();
                        }
                    }
                });
                LogUtil.a("EmergencyInfoManager", "registerContactChangeObserver");
                return;
            } catch (SecurityException unused) {
                ReleaseLogUtil.a("R_EmergencyInfoManager", "registerContactChangeObserver securityException");
                return;
            }
        }
        ReleaseLogUtil.d("R_EmergencyInfoManager", "no READ_CONTACTS permission");
    }

    public void o() {
        this.j.getContentResolver().unregisterContentObserver(this.g);
        t();
        LogUtil.a("EmergencyInfoManager", "unRegisterContactChangeObserver");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[Catch: SQLiteException | SecurityException -> 0x00b6, SYNTHETIC, TRY_LEAVE, TryCatch #6 {SQLiteException | SecurityException -> 0x00b6, blocks: (B:42:0x00b5, B:41:0x00b2, B:37:0x00ac), top: B:60:0x00ac, inners: #0 }] */
    public e d(Uri uri) {
        long j;
        Bitmap bitmapE;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j2;
        String string;
        String string2;
        String string3;
        Throwable th;
        Context context = this.j;
        if (context == null || uri == null) {
            LogUtil.a("EmergencyInfoManager", "getContact context or contactUri is null");
            return null;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"display_name", "data1", "data2", "data3", "photo_id", "raw_contact_id"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (!cursorQuery.moveToNext() || cursorQuery.getColumnCount() == 0) {
                        j = 0;
                        bitmapE = null;
                        string = null;
                        string2 = null;
                        string3 = null;
                    } else {
                        string = cursorQuery.getString(0);
                        try {
                            string2 = cursorQuery.getString(1);
                            try {
                                string3 = ContactsContract.CommonDataKinds.Phone.getTypeLabel(this.j.getResources(), cursorQuery.getInt(2), cursorQuery.getString(3)).toString();
                                try {
                                    long j3 = cursorQuery.getLong(4);
                                    Long lValueOf = Long.valueOf(j3);
                                    long j4 = cursorQuery.getLong(5);
                                    try {
                                        lValueOf.getClass();
                                        bitmapE = j3 > 0 ? e(lValueOf) : null;
                                        j = j4;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str3 = string3;
                                        j = j4;
                                        str2 = string2;
                                        str = string;
                                        th = th;
                                        if (cursorQuery != null) {
                                            throw th;
                                        }
                                        try {
                                            try {
                                                cursorQuery.close();
                                                throw th;
                                            } catch (Throwable th3) {
                                                th.addSuppressed(th3);
                                                throw th;
                                            }
                                        } catch (SQLiteException | SecurityException unused) {
                                            bitmapE = null;
                                            LogUtil.c("EmergencyInfoManager", "getContact catch Exception");
                                            str4 = str3;
                                            str5 = str2;
                                            str6 = str;
                                            if (str6 != null) {
                                            }
                                            e eVar = new e(ContactsContract.Contacts.getLookupUri(this.j.getContentResolver(), uri), uri, str6, str5, str4);
                                            eVar.a(j);
                                            eVar.b(bitmapE);
                                            return eVar;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j2 = 0;
                                    str3 = string3;
                                    j = j2;
                                    str2 = string2;
                                    str = string;
                                    th = th;
                                    if (cursorQuery != null) {
                                        throw th;
                                    }
                                    cursorQuery.close();
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j2 = 0;
                                string3 = null;
                                str3 = string3;
                                j = j2;
                                str2 = string2;
                                str = string;
                                th = th;
                                if (cursorQuery != null) {
                                    throw th;
                                }
                                cursorQuery.close();
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            j2 = 0;
                            string2 = null;
                            string3 = null;
                            str3 = string3;
                            j = j2;
                            str2 = string2;
                            str = string;
                            th = th;
                            if (cursorQuery != null) {
                                throw th;
                            }
                            cursorQuery.close();
                            throw th;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    j2 = 0;
                    string = null;
                }
            } else {
                j = 0;
                bitmapE = null;
                string = null;
                string2 = null;
                string3 = null;
            }
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (SQLiteException | SecurityException unused2) {
                    str3 = string3;
                    str2 = string2;
                    str = string;
                    LogUtil.c("EmergencyInfoManager", "getContact catch Exception");
                    str4 = str3;
                    str5 = str2;
                    str6 = str;
                }
            }
            str5 = string2;
            str4 = string3;
            str6 = string;
        } catch (SQLiteException | SecurityException unused3) {
            j = 0;
            bitmapE = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        if (str6 != null && str5 == null) {
            return null;
        }
        e eVar2 = new e(ContactsContract.Contacts.getLookupUri(this.j.getContentResolver(), uri), uri, str6, str5, str4);
        eVar2.a(j);
        eVar2.b(bitmapE);
        return eVar2;
    }

    private Bitmap e(Long l) {
        Cursor cursorQuery = this.j.getContentResolver().query(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, l.longValue()), new String[]{"data15"}, null, null, null);
        Bitmap bitmapDecodeStream = null;
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    byte[] blob = cursorQuery.getBlob(0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    a(options);
                    bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(blob), null, options);
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return bitmapDecodeStream;
    }

    private void a(BitmapFactory.Options options) {
        HashMap map = this.h;
        if (map != null) {
            Object obj = map.get("image_color_type_tag");
            if (obj instanceof String) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int iV = CommonUtil.v(str);
                if (iV == 0) {
                    options.inPreferredConfig = Bitmap.Config.ALPHA_8;
                } else if (iV == 1) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                } else {
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
            }
        }
    }

    private void b(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public boolean d(Context context, Uri uri) {
        return (context == null || uri == null || !c(context, uri)) ? false : true;
    }

    private boolean c(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    b(cursorQuery);
                    return true;
                }
            } catch (SQLiteException | SecurityException unused) {
                LogUtil.c("EmergencyInfoManager", "contactExists catch Exception");
            }
            return false;
        } finally {
            b(cursorQuery);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    public void c(String str, String str2) {
        if (str == null || str2 == null) {
            LogUtil.d("EmergencyInfoManager", "updateEmergencyInfo key or value is null");
            return;
        }
        try {
            iof iofVar = (iof) new Gson().fromJson(i(), iof.class);
            if (iofVar == null) {
                iofVar = new iof();
            }
            if (!TextUtils.isEmpty(str)) {
                switch (str) {
                    case "name":
                        iofVar.c(str2);
                        break;
                    case "address":
                        iofVar.a(str2);
                        break;
                    case "blood_type":
                        iofVar.a(cxz.e(this.j, str2));
                        break;
                    case "allergies":
                        iofVar.d(str2);
                        break;
                    case "medications":
                        iofVar.b(str2);
                        break;
                    case "medical_conditions":
                        iofVar.e(str2);
                        break;
                    case "organ_donor":
                        iofVar.b(cxz.c(this.j, str2));
                        break;
                    case "emergency_contacts":
                        ReleaseLogUtil.d("R_EmergencyInfoManager", "setEmergencyInfoContactList");
                        e(iofVar);
                        break;
                    default:
                        Object[] objArr = new Object[1];
                        objArr[0] = "updateEmergencyInfo default";
                        LogUtil.a("EmergencyInfoManager", objArr);
                        break;
                }
            }
            b(str, iofVar);
        } catch (JsonSyntaxException unused) {
            LogUtil.c("EmergencyInfoManager", "updateEmergencyInfo JsonSyntaxException");
        }
    }

    public void c() {
        ReleaseLogUtil.d("R_EmergencyInfoManager", "enter deleteEmergencyInfo");
        for (String str : inv.b()) {
            if (str.equals("blood_type")) {
                setSharedPreference(cxz.a() + str, this.j.getResources().getString(R.string.IDS_unknown_blood_type), new StorageParams(1));
            } else if (str.equals("organ_donor")) {
                setSharedPreference(cxz.a() + str, this.j.getResources().getString(R.string.IDS_unknown_organ_donor), new StorageParams(1));
            } else {
                setSharedPreference(cxz.a() + str, "", new StorageParams(1));
            }
        }
        PreferenceManager.getDefaultSharedPreferences(this.j).edit().remove(cxz.a() + "emergency_contacts").apply();
        lua.d(String.valueOf(1030), "emergency_contacts");
        setSharedPreference(cxz.a() + "_basic", "", new StorageParams(1));
        d("key_clear_all_emergency", q());
    }

    public String i() {
        return getSharedPreference(cxz.a() + "_basic");
    }

    private void e(iof iofVar) {
        iofVar.e(e(cxz.e("emergency_contacts", this.j, cxz.b(this.j))));
    }

    private void b(String str, iof iofVar) {
        try {
            setSharedPreference(cxz.a() + "_basic", new Gson().toJson(iofVar), new StorageParams(1));
            d(str, iofVar);
        } catch (JsonIOException unused) {
            LogUtil.a("EmergencyInfoManager", "saveAndCallBack catch JsonIOException");
        }
    }

    private void d(String str, iof iofVar) {
        Intent intent = new Intent();
        intent.setAction("emergency_info_change");
        intent.putExtra("emergency_info_key", str);
        intent.putExtra("emergency_info_value", iofVar);
        BroadcastManagerUtil.a(this.j, intent, LocalBroadcast.f36595c, true);
    }

    private ArrayList<iof.b> e(List<iod> list) {
        ArrayList<iof.b> arrayList = new ArrayList<>(10);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                iod iodVar = list.get(i);
                if (iodVar != null) {
                    String strA = iodVar.a();
                    if (TextUtils.isEmpty(strA)) {
                        LogUtil.a("EmergencyInfoManager", "contactInfo.getUri() is null");
                    } else {
                        Uri uri = Uri.parse(strA);
                        if (uri == null) {
                            LogUtil.a("EmergencyInfoManager", "updateEmergencyContacts contactUri is null ");
                        } else if (d(this.j, uri)) {
                            e eVarD = d(uri);
                            if (eVarD != null) {
                                iof.b bVar = new iof.b();
                                bVar.b(i);
                                bVar.b(eVarD.c());
                                bVar.a(eVarD.d());
                                a(eVarD, bVar);
                                arrayList.add(bVar);
                            }
                        } else {
                            iof.b bVar2 = new iof.b();
                            bVar2.b(i);
                            bVar2.b(iodVar.e());
                            bVar2.a(iodVar.b());
                            arrayList.add(bVar2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(e eVar, iof.b bVar) {
        Bitmap bitmapE = eVar.e();
        if (bitmapE != null) {
            LogUtil.a("EmergencyInfoManager", "bitmap:", Integer.valueOf(bitmapE.getByteCount()), "with:", Integer.valueOf(bitmapE.getWidth()), "height", Integer.valueOf(bitmapE.getHeight()));
            HashMap map = this.h;
            if (map == null) {
                c(bVar, bitmapE);
                return;
            }
            Object obj = map.get("image_size_tag");
            if (!(obj instanceof String)) {
                c(bVar, bitmapE);
                return;
            }
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                c(bVar, bitmapE);
                return;
            }
            String strB = HEXUtils.b(str);
            if (TextUtils.isEmpty(strB)) {
                c(bVar, bitmapE);
                return;
            }
            try {
                int i = Integer.parseInt(strB);
                LogUtil.a("EmergencyInfoManager", "newImageSize:", Integer.valueOf(i));
                if (i > 0) {
                    c(bVar, qqf.c(bitmapE, i, i));
                } else {
                    c(bVar, bitmapE);
                }
                return;
            } catch (NumberFormatException unused) {
                LogUtil.c("EmergencyInfoManager", "updateContacts contact catch NumberFormatException");
                c(bVar, bitmapE);
                return;
            }
        }
        LogUtil.a("EmergencyInfoManager", "updateContacts contact photo is null");
        bVar.c(new byte[0]);
    }

    private void c(iof.b bVar, Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        LogUtil.a("EmergencyInfoManager", "setPhotoByte size = ", Integer.valueOf(byteArray.length));
        if (byteArray.length > 15360) {
            byteArray = qqf.c(bitmap, 15);
        }
        bVar.c(byteArray);
        ltg.b(byteArrayOutputStream);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f5698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f5699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5700c;
        private long d;
        private String e;
        private Bitmap f;
        private String i;

        public e(Uri uri, Uri uri2, String str, String str2, String str3) {
            this.f5699b = uri;
            this.f5698a = uri2;
            this.f5700c = str;
            this.e = str2;
            this.i = str3;
        }

        public e(Uri uri, String str, String str2) {
            this.f5698a = uri;
            this.f5700c = str;
            this.e = str2;
        }

        public Uri b() {
            return this.f5698a;
        }

        public String c() {
            return this.f5700c;
        }

        public String d() {
            return this.e;
        }

        public Bitmap e() {
            return this.f;
        }

        public long a() {
            return this.d;
        }

        public void b(Bitmap bitmap) {
            this.f = bitmap;
        }

        public void a(long j) {
            this.d = j;
        }
    }

    public Long d(Context context, Long l) {
        long j = 0;
        if (context == null) {
            LogUtil.c("EmergencyInfoManager", "getContactsVersion context is null.");
            return 0L;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, null, "_id=?", new String[]{String.valueOf(l)}, null);
                while (cursorQuery != null && cursorQuery.moveToNext()) {
                    j = cursorQuery.getLong(cursorQuery.getColumnIndex("version"));
                }
                b(cursorQuery);
                return Long.valueOf(j);
            } catch (SQLiteException | SecurityException unused) {
                LogUtil.c("EmergencyInfoManager", "getContactVersion catch Exception");
                b(cursorQuery);
                return 0L;
            }
        } catch (Throwable th) {
            b(cursorQuery);
            throw th;
        }
    }

    public List<iod> b(Context context) {
        if (context == null) {
            LogUtil.c("EmergencyInfoManager", "getEmergencyContactInfo context is null.");
            return Collections.EMPTY_LIST;
        }
        return cxz.e("emergency_contacts", context, cxz.b(context));
    }

    public void c(List<iod> list, boolean z) {
        String strA = cxz.a(list, this.j);
        boolean zE = njy.e(list);
        if (zE || !TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_EmergencyInfoManager", "updateEmergencyContact to sp ,isEmptyList:", Boolean.valueOf(zE));
            lua.c(String.valueOf(1030), "emergency_contacts", strA, null);
        }
        ReleaseLogUtil.d("R_EmergencyInfoManager", "updateContact method updateEmergencyContact. isSynDevice ", Boolean.valueOf(z));
        if (z) {
            c("emergency_contacts", strA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[PHI: r3 r10
      0x006e: PHI (r3v6 android.database.Cursor) = (r3v5 android.database.Cursor), (r3v20 android.database.Cursor) binds: [B:20:0x006c, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r10v3 android.os.Bundle) = (r10v8 android.os.Bundle), (r10v7 android.os.Bundle) binds: [B:20:0x006c, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[Catch: JsonSyntaxException -> 0x00b9, TRY_ENTER, TryCatch #5 {JsonSyntaxException -> 0x00b9, blocks: (B:31:0x00a1, B:32:0x00af), top: B:49:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00af A[Catch: JsonSyntaxException -> 0x00b9, TRY_LEAVE, TryCatch #5 {JsonSyntaxException -> 0x00b9, blocks: (B:31:0x00a1, B:32:0x00af), top: B:49:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public iof b() throws Throwable {
        Exception e2;
        Cursor cursorQuery;
        Object[] objArr;
        iof iofVarQ;
        ReleaseLogUtil.d("R_EmergencyInfoManager", "enter getEmergencyInfo");
        iof iofVarQ2 = q();
        if (this.j == null) {
            ReleaseLogUtil.e("R_EmergencyInfoManager", "getEmergencyInfo context is null");
            return iofVarQ2;
        }
        Cursor cursor = null;
        extras = null;
        extras = null;
        Bundle extras = null;
        try {
            cursorQuery = this.j.getContentResolver().query(Uri.parse(f5690a + "/getString"), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        extras = cursorQuery.getExtras();
                    } catch (Exception e3) {
                        e2 = e3;
                        ReleaseLogUtil.a("R_EmergencyInfoManager", "getEmergencyInfo exception:", e2.getClass().getSimpleName());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            objArr = false;
                        }
                        if (objArr == true) {
                            ReleaseLogUtil.e("R_EmergencyInfoManager", "getEmergencyInfo cursor is null");
                            return iofVarQ2;
                        }
                        if (extras == null) {
                            ReleaseLogUtil.e("R_EmergencyInfoManager", "getEmergencyInfo bundle is null");
                            return iofVarQ2;
                        }
                        try {
                            iofVarQ = (iof) new Gson().fromJson(extras.getString("value"), iof.class);
                            try {
                                if (iofVarQ == null) {
                                    ReleaseLogUtil.e("R_EmergencyInfoManager", "getEmergencyInfo from json info is null");
                                    iofVarQ = q();
                                } else {
                                    ReleaseLogUtil.d("R_EmergencyInfoManager", "getEmergencyInfo success");
                                }
                                return iofVarQ;
                            } catch (JsonSyntaxException unused) {
                                iofVarQ2 = iofVarQ;
                                ReleaseLogUtil.a("R_EmergencyInfoManager", "getEmergencyInfo catch JsonSyntaxException");
                                return iofVarQ2;
                            }
                        } catch (JsonSyntaxException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
                objArr = false;
            } else {
                objArr = true;
            }
        } catch (Exception e4) {
            e2 = e4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (objArr == true) {
            ReleaseLogUtil.e("R_EmergencyInfoManager", "getEmergencyInfo cursor is null");
            return iofVarQ2;
        }
        if (extras == null) {
            ReleaseLogUtil.e("R_EmergencyInfoManager", "getEmergencyInfo bundle is null");
            return iofVarQ2;
        }
        iofVarQ = (iof) new Gson().fromJson(extras.getString("value"), iof.class);
        if (iofVarQ == null) {
            ReleaseLogUtil.e("R_EmergencyInfoManager", "getEmergencyInfo from json info is null");
            iofVarQ = q();
        } else {
            ReleaseLogUtil.d("R_EmergencyInfoManager", "getEmergencyInfo success");
        }
        return iofVarQ;
    }

    private iof q() {
        LogUtil.a("EmergencyInfoManager", "create default emergencyInfo");
        iof iofVar = new iof();
        iofVar.c("");
        iofVar.a("");
        iofVar.a(0);
        iofVar.d("");
        iofVar.b(0);
        iofVar.b("");
        iofVar.e("");
        iofVar.e(new ArrayList<>(10));
        return iofVar;
    }

    public iod b(Uri uri) {
        iod iodVar = new iod();
        if (uri == null) {
            LogUtil.d("EmergencyInfoManager", "getContactInfoByUri uri is null");
            return iodVar;
        }
        e eVarD = d(uri);
        if (eVarD == null) {
            LogUtil.d("EmergencyInfoManager", "getContactInfoByUri contact is null");
            return iodVar;
        }
        Long lD = d(this.j, Long.valueOf(eVarD.a()));
        iodVar.b(uri.toString());
        iodVar.c(String.valueOf(lD));
        return iodVar;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public class EmergencyContactChangeReceiver extends BroadcastReceiver {
        public EmergencyContactChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws Throwable {
            if (intent == null || context == null) {
                LogUtil.d("EmergencyInfoManager", "getContact context or contactUri is null");
                return;
            }
            String action = intent.getAction();
            ReleaseLogUtil.d("R_EmergencyInfoManager", "EmergencyContactChangeReceiver action : ", action);
            if ("com.huawei.emergency.action.EMERGENCY_INFO_CHANGED".equals(action)) {
                EmergencyInfoManager.this.c(true);
                if (Utils.o()) {
                    return;
                }
                EmergencyInfoManager.this.l();
            }
        }
    }

    public void p() {
        iof iofVarQ;
        String strI = a().i();
        Gson gson = new Gson();
        if (!TextUtils.isEmpty(strI)) {
            try {
                iofVarQ = (iof) gson.fromJson(strI, iof.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.c("EmergencyInfoManager", "updateEmergencyInfoProvider JsonSyntaxException");
                iofVarQ = null;
            }
            if (iofVarQ != null) {
                iofVarQ.e(e(b(this.j)));
            } else {
                iofVarQ = q();
            }
        } else {
            iofVarQ = q();
        }
        setSharedPreference(cxz.a() + "_basic", gson.toJson(iofVarQ), new StorageParams(1));
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0103: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:36:0x0103 */
    public void c(boolean z) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        ContentProviderClient contentProviderClient;
        iof iofVarQ = q();
        Context context = this.j;
        if (context == null) {
            LogUtil.d("EmergencyInfoManager", "requestEmergencyInfoProvider context is null");
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            LogUtil.d("EmergencyInfoManager", "requestEmergencyInfoProvider contentResolver is null");
            return;
        }
        ContentProviderClient contentProviderClient2 = null;
        Bundle bundleCall = null;
        try {
            try {
                Uri uri = f5691b;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        LogUtil.d("EmergencyInfoManager", "emergencyInfoProviderClient is null");
                        e(contentProviderClientAcquireUnstableContentProviderClient);
                        return;
                    }
                    bundleCall = contentResolver.call(uri, "QUERY_EMERGENCY_INFO", (String) null, (Bundle) null);
                    e(contentProviderClientAcquireUnstableContentProviderClient);
                    if (bundleCall == null) {
                        LogUtil.d("EmergencyInfoManager", "requestEmergencyInfoProvider bundle is null");
                        return;
                    }
                    iofVarQ.c(bundleCall.getString("name"));
                    iofVarQ.a(bundleCall.getString("address"));
                    iofVarQ.a(cxz.e(this.j, bundleCall.getString("blood_type")));
                    iofVarQ.d(bundleCall.getString("allergies"));
                    iofVarQ.b(bundleCall.getString("medications"));
                    iofVarQ.b(cxz.c(this.j, bundleCall.getString("organ_donor")));
                    iofVarQ.e(bundleCall.getString("medical_conditions"));
                    List<iod> listC = cxz.c("emergency_contacts", this.j, bundleCall.getString("emergency_contacts"), false);
                    iofVarQ.e(e(listC));
                    c(listC, false);
                    if (z) {
                        b("key_update_all_emergency", iofVarQ);
                    } else {
                        setSharedPreference(cxz.a() + "_basic", new Gson().toJson(iofVarQ), new StorageParams(1));
                    }
                    LogUtil.a("EmergencyInfoManager", "requestEmergencyInfoProvider end");
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    LogUtil.c("EmergencyInfoManager", "requestEmergencyInfoProvider getContentResolver call ", LogAnonymous.b(e));
                }
            } catch (Throwable th) {
                th = th;
                contentProviderClient2 = contentProviderClient;
                e(contentProviderClient2);
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
            e(contentProviderClient2);
            throw th;
        }
    }

    public void l() {
        if (!j()) {
            LogUtil.a("EmergencyInfoManager", "hasEmergencyInfoProvider return false");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.7
                @Override // java.lang.Runnable
                public void run() {
                    cyb.a(new ResultCallback<cxy>() { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.7.4
                        @Override // com.huawei.networkclient.ResultCallback
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(cxy cxyVar) throws Throwable {
                            if (cxyVar.getResultCode().intValue() == 0 && !njy.e(cxyVar.e()) && !njy.e(cxyVar.a()) && cxyVar.e().size() == cxyVar.a().size()) {
                                EmergencyInfoManager.this.b(cxyVar);
                            } else {
                                LogUtil.a("EmergencyInfoManager", "queryFollowUsers failure, resultCode = ", cxyVar.getResultCode());
                            }
                        }

                        @Override // com.huawei.networkclient.ResultCallback
                        public void onFailure(Throwable th) {
                            LogUtil.c("EmergencyInfoManager", "queryFollowUsers failure");
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(cxy cxyVar) throws Throwable {
        List<iod> listF = f();
        ArrayList arrayList = new ArrayList();
        if (njy.e(listF)) {
            b(cxyVar, arrayList);
        } else {
            LogUtil.a("EmergencyInfoManager", "delete server some data");
            e(cxyVar, listF, arrayList);
        }
        a(arrayList);
    }

    private void b(cxy cxyVar, List<Long> list) {
        for (cxy.e eVar : cxyVar.a()) {
            if (!TextUtils.isEmpty(eVar.d()) && !TextUtils.isEmpty(eVar.c())) {
                list.add(Long.valueOf(eVar.b()));
            } else {
                LogUtil.a("EmergencyInfoManager", "huid:", Long.valueOf(eVar.b()), " name or phoneNum is null");
            }
        }
    }

    private void e(cxy cxyVar, List<iod> list, List<Long> list2) {
        for (cxy.e eVar : cxyVar.a()) {
            if (TextUtils.isEmpty(eVar.d()) || TextUtils.isEmpty(eVar.c())) {
                LogUtil.a("EmergencyInfoManager", "familyCareRelation name or phoneNum is null,contactInfo:", Long.valueOf(eVar.b()));
            } else {
                b(list, list2, eVar);
            }
        }
    }

    private void b(List<iod> list, List<Long> list2, cxy.e eVar) {
        for (iod iodVar : list) {
            if (eVar.d().equals(iodVar.e()) && eVar.c().equals(iodVar.b())) {
                LogUtil.a("EmergencyInfoManager", "server and local is both exist,contactInfo:", Long.valueOf(eVar.b()));
                return;
            }
        }
        list2.add(Long.valueOf(eVar.b()));
    }

    private void a(List<Long> list) {
        if (njy.e(list)) {
            LogUtil.a("EmergencyInfoManager", "deleteFamilyCareUsers,delEmergencyList is empty");
        } else {
            cyb.d(list, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager.6
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                    LogUtil.a("EmergencyInfoManager", "deleteFamilyCareUsers successful");
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.c("EmergencyInfoManager", "deleteFamilyCareUsers failure");
                }
            });
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0081: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:37:0x0081 */
    public boolean j() throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        ContentProviderClient contentProviderClient;
        if (!CommonUtil.at()) {
            LogUtil.a("EmergencyInfoManager", "hasEmergencyInfoProvider emui version less than 10.0.0");
            return false;
        }
        Context context = this.j;
        if (context == null) {
            LogUtil.d("EmergencyInfoManager", "hasEmergencyInfoProvider context is null");
            return false;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            LogUtil.d("EmergencyInfoManager", "hasEmergencyInfoProvider contentResolver is null");
            return false;
        }
        ContentProviderClient contentProviderClient2 = null;
        bundleCall = null;
        Bundle bundleCall = null;
        try {
            try {
                Uri uri = f5691b;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        LogUtil.d("EmergencyInfoManager", "emergencyInfoProviderClient is null");
                        e(contentProviderClientAcquireUnstableContentProviderClient);
                        return false;
                    }
                    bundleCall = contentResolver.call(uri, "QUERY_EMERGENCY_INFO", (String) null, (Bundle) null);
                    e(contentProviderClientAcquireUnstableContentProviderClient);
                    if (bundleCall == null) {
                        return false;
                    }
                    LogUtil.a("EmergencyInfoManager", "hasEmergencyInfoProvider bundle is not null");
                    return true;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    LogUtil.c("EmergencyInfoManager", "hasEmergencyInfoProvider getContentResolver call ", LogAnonymous.b(e));
                } catch (SecurityException unused) {
                    LogUtil.c("EmergencyInfoManager", "hasEmergencyInfoProvider securityException");
                }
            } catch (Throwable th) {
                th = th;
                contentProviderClient2 = contentProviderClient;
                e(contentProviderClient2);
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (SecurityException unused2) {
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
            e(contentProviderClient2);
            throw th;
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.m;
        if (broadcastReceiver != null) {
            BroadcastManagerUtil.d(this.j, broadcastReceiver);
        }
    }

    public boolean a(iod iodVar) {
        List<iod> listE = cxz.e("emergency_contacts", BaseApplication.getContext(), cxz.b(BaseApplication.getContext()));
        ReleaseLogUtil.d("R_EmergencyInfoManager", "saveAppEmergencyContacts: ", Integer.valueOf(listE.size()));
        if (listE.contains(iodVar)) {
            return false;
        }
        listE.add(iodVar);
        ReleaseLogUtil.d("R_EmergencyInfoManager", "Add to first size: ", Integer.valueOf(listE.size()));
        a().c(listE, true);
        return true;
    }

    public List<iod> d() {
        List<iod> listE = cxz.e("emergency_contacts", BaseApplication.getContext(), cxz.b(BaseApplication.getContext()));
        LogUtil.a("EmergencyInfoManager", "exceedEmergencyContact: ", Integer.valueOf(listE.size()));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listE.size(); i++) {
            arrayList.add(e(listE.get(i)));
            LogUtil.a("EmergencyInfoManager", "redContactInfo: ", Integer.valueOf(arrayList.size()));
        }
        return arrayList;
    }

    private iod e(iod iodVar) {
        e eVarD;
        if (iodVar != null && iodVar.c() && (eVarD = a().d(Uri.parse(iodVar.a()))) != null) {
            iodVar.d(eVarD.d());
            iodVar.e(eVarD.c());
        }
        return iodVar;
    }

    public List<iod> f() throws Throwable {
        List<String> listG = g();
        ArrayList arrayList = new ArrayList();
        if (listG.size() > 0) {
            for (int i = 0; i < listG.size(); i++) {
                Uri uri = Uri.parse(listG.get(i));
                if (a().d(BaseApplication.getContext(), uri) && arrayList.size() < 3) {
                    e eVarD = a().d(uri);
                    iod iodVarB = a().b(uri);
                    if (eVarD != null) {
                        iodVarB.e(eVarD.c());
                        iodVarB.d(eVarD.d());
                        arrayList.add(iodVarB);
                    } else {
                        LogUtil.a("EmergencyInfoManager", "contact empty");
                    }
                }
                LogUtil.a("EmergencyInfoManager", "filteredEmergencyContacts", Integer.valueOf(arrayList.size()));
            }
            return arrayList;
        }
        LogUtil.a("EmergencyInfoManager", "emergencyContactsArray", Integer.valueOf(listG.size()));
        return arrayList;
    }

    public List<iod> e() {
        if (j()) {
            return f();
        }
        return d();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0098: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:32:0x0098 */
    public List<String> g() throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        ContentProviderClient contentProviderClient;
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        if (contentResolver == null) {
            LogUtil.d("EmergencyInfoManager", "hasEmergencyInfoProvider contentResolver is null");
            return new ArrayList();
        }
        ContentProviderClient contentProviderClient2 = null;
        bundleCall = null;
        Bundle bundleCall = null;
        try {
            try {
                Uri uri = f5691b;
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        LogUtil.d("EmergencyInfoManager", "emergencyInfoProviderClient is null");
                        ArrayList arrayList = new ArrayList();
                        e(contentProviderClientAcquireUnstableContentProviderClient);
                        return arrayList;
                    }
                    bundleCall = contentResolver.call(uri, "QUERY_EMERGENCY_INFO", (String) null, (Bundle) null);
                    e(contentProviderClientAcquireUnstableContentProviderClient);
                    if (bundleCall != null) {
                        String string = bundleCall.getString("emergency_contacts");
                        if (!TextUtils.isEmpty(string)) {
                            List<String> listAsList = Arrays.asList(string.split(Pattern.quote("|")));
                            LogUtil.a("EmergencyInfoManager", "emergencyContactsList: ", Integer.valueOf(listAsList.size()));
                            return listAsList;
                        }
                    }
                    return new ArrayList();
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    LogUtil.c("EmergencyInfoManager", "hasEmergencyInfoProvider getContentResolver call ", LogAnonymous.b(e));
                } catch (SecurityException unused) {
                    LogUtil.c("EmergencyInfoManager", "hasEmergencyInfoProvider securityException");
                }
            } catch (Throwable th) {
                th = th;
                contentProviderClient2 = contentProviderClient;
                e(contentProviderClient2);
                throw th;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (SecurityException unused2) {
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th2) {
            th = th2;
            e(contentProviderClient2);
            throw th;
        }
    }

    private static void e(ContentProviderClient contentProviderClient) {
        if (contentProviderClient == null) {
            return;
        }
        try {
            contentProviderClient.close();
        } catch (Exception e2) {
            LogUtil.c("EmergencyInfoManager", "release providerClient failed with exception: ", LogAnonymous.b(e2));
        }
    }
}
