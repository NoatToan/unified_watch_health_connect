package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.SyncHelper;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class msm {
    public static List<Bean> c() {
        String[] strArrA = a(0L);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        e(strArrA, (Map<String, mtc>) concurrentHashMap, false);
        List<Bean> listC = c(concurrentHashMap, strArrA);
        LogUtil.a("ContactBuilder", "getAllContacts: contacts list size: ", Integer.valueOf(listC.size()));
        return a(listC);
    }

    public static List<Bean> d() {
        String[] strArrE = e(0L);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        a(strArrE, concurrentHashMap);
        List<Bean> listA = a(concurrentHashMap, strArrE);
        LogUtil.a("ContactBuilder", "getAllContactsSport: contacts list size: ", Integer.valueOf(listA.size()));
        return a(listA);
    }

    public static List<Bean> c(long j) {
        String[] strArrA = a(j);
        if (strArrA.length == 0) {
            LogUtil.j("ContactBuilder", "getChangedContacts: raw contact id arrays is empty");
            return new ArrayList(0);
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        e(strArrA, (Map<String, mtc>) concurrentHashMap, false);
        List<Bean> listC = c(concurrentHashMap, strArrA);
        LogUtil.a("ContactBuilder", "getChangedContacts: changed contacts size: ", Integer.valueOf(listC.size()));
        return listC;
    }

    public static List<Bean> b(long j) {
        String[] strArrE = e(j);
        if (strArrE.length == 0) {
            LogUtil.j("ContactBuilder", "getChangedContactsSport: raw contact id arrays is empty");
            return new ArrayList(0);
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        a(strArrE, concurrentHashMap);
        List<Bean> listA = a(concurrentHashMap, strArrE);
        ReleaseLogUtil.c("R_ContactBuilder", "getChangedContactsSport: changed contacts size: ", listA.size() + " lastSyncedTime: " + j);
        return listA;
    }

    public static List<String> b(boolean z, long j) {
        LogUtil.a("ContactBuilder", "getContactIdList: start,isProfile,lastSyncedTime ", Boolean.valueOf(z), Long.valueOf(j));
        final ArrayList arrayList = new ArrayList(10);
        ContactsDatabaseUtils.a(new ContactsDatabaseUtils.e().e(z ? ContactsContract.Profile.CONTENT_URI : ContactsContract.Contacts.CONTENT_URI).a(new String[]{"_id"}).d(z ? null : mtp.c()).e(z ? null : new String[]{String.valueOf(j)}).c("_id"), new ContactsDatabaseUtils.ResultCallback() { // from class: msr
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                msm.a(arrayList, (Cursor) obj);
            }
        });
        ReleaseLogUtil.c("R_ContactBuilder", "getContactIdList: contact id list size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    static /* synthetic */ void a(List list, Cursor cursor) {
        Objects.requireNonNull(list);
        ContactsDatabaseUtils.c(cursor, 0, new msj(list));
    }

    public static List<String> c(List<String> list, boolean z) {
        final ArrayList arrayList = new ArrayList(10);
        String strA = mtz.a(list, ",", "");
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("ContactBuilder", "getRawContactIdList: contactIds is null or empty. isProfile: ", Boolean.valueOf(z));
            return arrayList;
        }
        ContactsDatabaseUtils.a(new ContactsDatabaseUtils.e().e(z ? ContactsContract.Profile.CONTENT_RAW_CONTACTS_URI : ContactsContract.RawContacts.CONTENT_URI).a(new String[]{"_id"}).d(z ? null : mtp.a(strA)).c("_id"), new ContactsDatabaseUtils.ResultCallback() { // from class: msk
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                msm.c(arrayList, (Cursor) obj);
            }
        });
        LogUtil.a("ContactBuilder", "getRawContactIdList raw contact id list size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    static /* synthetic */ void c(List list, Cursor cursor) {
        Objects.requireNonNull(list);
        ContactsDatabaseUtils.c(cursor, 0, new msj(list));
    }

    public static List<String> b(List<String> list, boolean z) {
        final ArrayList arrayList = new ArrayList(10);
        String strA = mtz.a(list, ",", "");
        LogUtil.a("ContactBuilder", "getRawContactIdListSport contactIds is : ", strA);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("ContactBuilder", "getRawContactIdListSport: contactIds is null or empty. isProfile: ", Boolean.valueOf(z));
            return arrayList;
        }
        ContactsDatabaseUtils.a(new ContactsDatabaseUtils.e().e(z ? ContactsContract.Profile.CONTENT_RAW_CONTACTS_URI : ContactsContract.RawContacts.CONTENT_URI).a(new String[]{"_id", "contact_id"}).d(z ? null : mtp.d(strA)).c("contact_id"), new ContactsDatabaseUtils.ResultCallback() { // from class: msi
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                msm.b(arrayList, (Cursor) obj);
            }
        });
        ReleaseLogUtil.c("R_ContactBuilder", "getRawContactIdListSport raw contact id list size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    static /* synthetic */ void b(List list, Cursor cursor) {
        Objects.requireNonNull(list);
        ContactsDatabaseUtils.a(cursor, 0, new msj(list));
    }

    public static void e(String[] strArr, Map<String, mtc> map, boolean z) {
        if (map == null) {
            LogUtil.j("ContactBuilder", "buildLocalContact: context or idBeanMap is null.");
            return;
        }
        String strE = mtz.e(strArr, ",");
        a(strE, map, z);
        e(strE, map, z);
    }

    public static void a(String[] strArr, Map<String, mtc> map) {
        if (strArr == null || strArr.length == 0) {
            LogUtil.j("ContactBuilder", "buildLocalContactSport: context or ids is null.");
            return;
        }
        String strE = mtz.e(strArr, ",");
        d(strE, map);
        e(strE, map);
    }

    public static List<Bean> c(Map<String, mtc> map, String[] strArr) {
        if (map == null || map.size() == 0) {
            return new ArrayList(0);
        }
        boolean z = strArr == null || strArr.length == 0;
        ArrayList arrayList = new ArrayList(10);
        if (z) {
            Iterator<Map.Entry<String, mtc>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
        } else {
            for (String str : strArr) {
                mtc mtcVar = map.get(str);
                if (mtcVar != null) {
                    arrayList.add(mtcVar);
                }
            }
        }
        return arrayList;
    }

    public static List<Bean> a(Map<String, mtc> map, String[] strArr) {
        if (map == null || map.isEmpty()) {
            return new ArrayList(0);
        }
        boolean z = strArr == null || strArr.length == 0;
        ArrayList arrayList = new ArrayList(10);
        if (z) {
            Iterator<Map.Entry<String, mtc>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
        } else {
            for (String str : strArr) {
                mtc mtcVar = map.get(str);
                if (mtcVar == null || mtj.d().equals(mtcVar.d())) {
                    LogUtil.a("ContactBuilder", "getHiCallAccountType is true: ");
                } else {
                    arrayList.add(mtcVar);
                }
            }
        }
        return arrayList;
    }

    private static String[] a(long j) {
        List<String> listC = c(b(false, j), false);
        LogUtil.a("ContactBuilder", "getRawContactIds: raw raw contact id array length: ", Integer.valueOf(listC.size()));
        return (String[]) listC.toArray(new String[0]);
    }

    private static String[] e(long j) {
        List<String> listB = b(false, j);
        LogUtil.a("ContactBuilder", "getRawContactIdsSport contactIdList is : ", Integer.valueOf(listB.size()));
        List<String> listB2 = b(listB, false);
        LogUtil.a("ContactBuilder", "getRawContactIdsSport: raw raw contact id array length: ", Integer.valueOf(listB2.size()));
        return (String[]) listB2.toArray(new String[0]);
    }

    private static void a(String str, final Map<String, mtc> map, boolean z) {
        ContactsDatabaseUtils.a(new ContactsDatabaseUtils.e().e(z ? ContactsContract.Profile.CONTENT_RAW_CONTACTS_URI : ContactsContract.RawContacts.CONTENT_URI).a(mtd.c()).d(z ? null : mtp.b(str)).c("_id"), new ContactsDatabaseUtils.ResultCallback() { // from class: msl
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                Cursor cursor = (Cursor) obj;
                ContactsDatabaseUtils.c(cursor, 0, new ContactsDatabaseUtils.ResultCallback() { // from class: msq
                    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
                    public final void onResult(Object obj2) {
                        String str2 = (String) obj2;
                        msm.e(str2, (Map<String, mtc>) map, cursor);
                    }
                });
            }
        });
        LogUtil.a("buildWithRawContact: idBean Map size:  ", Integer.valueOf(map.size()));
    }

    private static void d(String str, final Map<String, mtc> map) {
        ContactsDatabaseUtils.a(new ContactsDatabaseUtils.e().e(ContactsContract.RawContacts.CONTENT_URI).a(mtd.e()).d(mtp.b(str)).c("sort_key ASC"), new ContactsDatabaseUtils.ResultCallback() { // from class: mso
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                Cursor cursor = (Cursor) obj;
                ContactsDatabaseUtils.c(cursor, 0, new ContactsDatabaseUtils.ResultCallback() { // from class: msn
                    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
                    public final void onResult(Object obj2) {
                        String str2 = (String) obj2;
                        msm.b(str2, (Map<String, mtc>) map, cursor);
                    }
                });
            }
        });
        LogUtil.a("buildWithRawContactSport: idBean Map size:  ", Integer.valueOf(map.size()));
    }

    private static void e(String str, final Map<String, mtc> map, final boolean z) {
        ContactsDatabaseUtils.a(new ContactsDatabaseUtils.e().e(z ? Uri.parse("content://com.android.contacts/profile/data") : ContactsContract.Data.CONTENT_URI).a(mtd.b()).d(z ? null : mtp.c(str)).c("raw_contact_id"), new ContactsDatabaseUtils.ResultCallback() { // from class: msp
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                msm.c(map, z, (Cursor) obj);
            }
        });
        LogUtil.a("buildWithData: ridBeanMap Map size:  ", Integer.valueOf(map.size()));
    }

    private static void e(String str, final Map<String, mtc> map) {
        ContactsDatabaseUtils.a(new ContactsDatabaseUtils.e().e(ContactsContract.Data.CONTENT_URI).a(mtd.b()).d(mtp.c(str)).c("raw_contact_id"), new ContactsDatabaseUtils.ResultCallback() { // from class: mss
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
            public final void onResult(Object obj) {
                msm.b((Map<String, mtc>) map, (Cursor) obj);
            }
        });
        LogUtil.a("buildWithDataSport: ridBeanMap Map size:  ", Integer.valueOf(map.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, Map<String, mtc> map, Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("ContactBuilder", "parseRawContactBeanPart1: cursor is null.");
            return;
        }
        mtc mtcVar = map.get(str);
        if (mtcVar == null) {
            mtcVar = new mtc();
            mtcVar.setId(str);
            map.put(str, mtcVar);
        }
        mty.c(cursor, mtcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Map<String, mtc> map, Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("ContactBuilder", "parseRawContactBeanPartSport: cursor is null.");
            return;
        }
        mtc mtcVar = map.get(str);
        if (mtcVar == null) {
            mtcVar = new mtc();
            mtcVar.setId(str);
            map.put(str, mtcVar);
        }
        mty.a(cursor, mtcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Map<String, mtc> map, boolean z, Cursor cursor) {
        if (ContactsDatabaseUtils.d(cursor)) {
            LogUtil.a("ContactBuilder", "parseRawContactBeanPart2: invalid cursor.");
            return;
        }
        String str = "";
        mtc mtcVar = null;
        while (true) {
            String string = cursor.getString(0);
            if (!str.contentEquals(string)) {
                mtcVar = map.get(string);
            }
            if (mtcVar != null) {
                mty.d(cursor, mtcVar);
                mty.a(cursor, mtcVar, z);
            }
            if (!cursor.moveToNext()) {
                return;
            } else {
                str = string;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Map<String, mtc> map, Cursor cursor) {
        if (ContactsDatabaseUtils.d(cursor)) {
            LogUtil.a("ContactBuilder", "parseRawContactBeanPartSport: invalid cursor.");
            return;
        }
        String str = "";
        mtc mtcVar = null;
        while (true) {
            String string = cursor.getString(0);
            if (!str.contentEquals(string)) {
                mtcVar = map.get(string);
            }
            if (mtcVar != null) {
                mty.b(cursor, mtcVar);
            }
            if (!cursor.moveToNext()) {
                return;
            } else {
                str = string;
            }
        }
    }

    private static List<Bean> a(List<Bean> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("ContactBuilder", "list is null or empty.");
            return Collections.EMPTY_LIST;
        }
        for (Bean bean : list) {
            if (TextUtils.isEmpty(bean.getUid())) {
                bean.setUid(SyncHelper.e());
            }
        }
        return list;
    }
}
