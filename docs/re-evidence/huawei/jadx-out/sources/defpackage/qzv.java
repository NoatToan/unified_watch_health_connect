package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.datatype.Contact;
import com.huawei.datatype.PhoneNumber;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter;
import com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView;
import health.compact.a.IoUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qzv extends tvu<ContactSelectActivityView> implements ContactSelectActivityPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<qzr> f47038a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47040c;
    private boolean d;
    private int e;
    private ArrayList<String> f;
    private File g;
    private List<qzr> j;
    private List<Contact> i = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f47039b = new Handler() { // from class: qzv.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 200 || qzv.this.e() == null) {
                return;
            }
            qzv.this.e().setAdapter(qzv.this.f47038a);
        }
    };

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public List<qzr> getContacts() {
        LogUtil.a("ContactSelectActivityPresenterImpl", "getContacts enter");
        ArrayList arrayList = new ArrayList(10);
        if (e() == null) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "getContacts getView is null");
            return arrayList;
        }
        HashMap map = new HashMap(10);
        HashMap map2 = new HashMap(10);
        setContactData(map, map2);
        arrayList.addAll(map.values());
        try {
            contactsSort(arrayList);
        } catch (IllegalArgumentException unused) {
            LogUtil.c("ContactSelectActivityPresenterImpl", "getContacts IllegalArgumentException");
        }
        arrayList.addAll(map2.values());
        a(arrayList);
        return arrayList;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void contactsSort(List<qzr> list) {
        LogUtil.a("ContactSelectActivityPresenterImpl", "contactsSort enter");
        if (list == null || list.isEmpty()) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "contactsSort contactDataList is null or empty");
        } else {
            Collections.sort(list, new Comparator<qzr>() { // from class: qzv.5
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(qzr qzrVar, qzr qzrVar2) {
                    if (qzrVar == null && qzrVar2 == null) {
                        return 0;
                    }
                    if (qzrVar == null) {
                        return 1;
                    }
                    if (qzrVar2 == null) {
                        return -1;
                    }
                    if (qzrVar.g().contains("#")) {
                        return 1;
                    }
                    if (qzrVar2.g().contains("#")) {
                        return -1;
                    }
                    return qzrVar.g().compareTo(qzrVar2.g());
                }
            });
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void setContactSortData(qzr qzrVar) {
        LogUtil.a("ContactSelectActivityPresenterImpl", "setContactSortData enter");
        if (qzrVar == null) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "setContactSortData contactData is null");
            return;
        }
        try {
            String upperCase = aji.b(qzrVar.b(), "").toUpperCase(Locale.ENGLISH);
            LogUtil.a("ContactSelectActivityPresenterImpl", "setContactSortData sortName is", cop.e(upperCase));
            if (TextUtils.isEmpty(upperCase)) {
                LogUtil.d("ContactSelectActivityPresenterImpl", "setContactSortData sortName is empty");
                qzrVar.j("#");
                qzrVar.i("#");
                return;
            }
            String strSubstring = upperCase.substring(0, 1);
            if (strSubstring.matches("[A-Z]")) {
                qzrVar.j(strSubstring);
                qzrVar.i(upperCase);
            } else {
                qzrVar.j("#");
                qzrVar.i("#");
            }
        } catch (Exception unused) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "exception Pinyin.toPinyin,", cop.e(qzrVar.b()));
            qzrVar.j("#");
            qzrVar.i("#");
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void initData() {
        LogUtil.a("ContactSelectActivityPresenterImpl", "initData enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: qzv.1
            @Override // java.lang.Runnable
            public void run() {
                qzv qzvVar = qzv.this;
                qzvVar.f47038a = qzvVar.getContacts();
                qzv.this.f47039b.sendEmptyMessage(200);
            }
        });
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void itemSelected(int i) {
        if (this.f47040c) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "itemSelected mIsSearch");
            itemSelectDataChange(i, this.j);
        } else {
            LogUtil.a("ContactSelectActivityPresenterImpl", "itemSelected not mIsSearch");
            itemSelectDataChange(i, this.f47038a);
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void selectAll() {
        if (this.f47040c) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "selectAll mIsSearch");
            selectAllDataChange(this.j);
        } else {
            LogUtil.a("ContactSelectActivityPresenterImpl", "selectAll not mIsSearch");
            selectAllDataChange(this.f47038a);
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void selectAllDataChange(List<qzr> list) {
        if (list == null || list.isEmpty() || e() == null) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "selectAllDataChange dataList is empty");
            return;
        }
        int i = 0;
        if (this.d) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "selectAllDataChange delete all");
            for (qzr qzrVar : list) {
                if (qzrVar.j()) {
                    qzrVar.b(false);
                }
            }
            e().changeHealthToolBarState(false);
        } else {
            LogUtil.a("ContactSelectActivityPresenterImpl", "selectAllDataChange all");
            int iOptionalQuantity = optionalQuantity();
            for (qzr qzrVar2 : list) {
                if (!qzrVar2.j()) {
                    if (iOptionalQuantity == 0) {
                        break;
                    }
                    qzrVar2.b(true);
                    i++;
                    if (i >= iOptionalQuantity) {
                        break;
                    }
                }
            }
            e().changeHealthToolBarState(true);
        }
        e().setCustomTitleBar(getSelectedCount());
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public int optionalQuantity() {
        int selectedCount = this.e - getSelectedCount();
        LogUtil.a("ContactSelectActivityPresenterImpl", "optionalQuantity selectCount : ", Integer.valueOf(selectedCount), "optionalQuantity mMaxSelectCount : ", Integer.valueOf(this.e), " getSelectedCount : ", Integer.valueOf(getSelectedCount()));
        return selectedCount;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public int getSelectedCount() {
        int i = 0;
        if (njy.e(this.f47038a)) {
            ReleaseLogUtil.e("DEVMGR_ContactSelectActivityPresenterImpl", "getSelectedCount mContactDataList is empty");
            return 0;
        }
        Iterator<qzr> it = this.f47038a.iterator();
        while (it.hasNext()) {
            if (it.next().j()) {
                i++;
            }
        }
        return i;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public int getInputType(String str) {
        LogUtil.a("ContactSelectActivityPresenterImpl", "getInputType enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "getInputType intPutType is INPUT_TYPE_ERR");
            return -1;
        }
        LogUtil.a("ContactSelectActivityPresenterImpl", "getInputType inputString : ", str);
        if (StringUtils.a(str)) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "getInputType intPutType is INPUT_TYPE_NUMBER");
            return 0;
        }
        if (StringUtils.c(str)) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "getInputType intPutType is INPUT_TYPE_ENGLISH");
            return 1;
        }
        if (!StringUtils.e(str)) {
            return 3;
        }
        LogUtil.a("ContactSelectActivityPresenterImpl", "getInputType intPutType is INPUT_TYPE_CHINESE");
        return 2;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void onEditTextInputChange(String str) {
        LogUtil.a("ContactSelectActivityPresenterImpl", "onEditTextInputChange input is ", str);
        if (e() == null) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "getView is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("ContactSelectActivityPresenterImpl", "onEditTextInputChange input is empty");
            e().setAdapter(this.f47038a);
            this.f47040c = false;
        } else {
            this.j = getContactsByInputType(getInputType(str), str);
            e().setAdapter(this.j);
            this.f47040c = true;
        }
        if (optionalQuantity() < 1) {
            e().changeHealthToolBarState(true);
        } else {
            e().changeHealthToolBarState(false);
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public List<qzr> getContactsByInputType(int i, String str) {
        LogUtil.a("ContactSelectActivityPresenterImpl", "getContactsByInputType inputString : ", str, " inputType : ", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(this.f47038a)) {
            ReleaseLogUtil.e("DEVMGR_ContactSelectActivityPresenterImpl", "getContactsByInputType mContactDataList is empty");
            return arrayList;
        }
        for (qzr qzrVar : this.f47038a) {
            if (qzrVar.d() != null) {
                if (i == 0) {
                    if (qzrVar.d().replaceAll(" ", "").trim().contains(str.trim()) || qzrVar.b().contains(str)) {
                        arrayList.add(qzrVar);
                    }
                } else if (i == 1) {
                    if (qzrVar.g().contains(str.trim().toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(qzrVar);
                    }
                } else if (i == 2) {
                    if (qzrVar.b().toUpperCase(Locale.ENGLISH).contains(str.trim().toUpperCase(Locale.ENGLISH))) {
                        arrayList.add(qzrVar);
                    }
                } else if (i == 3) {
                    String upperCase = qzrVar.b().toUpperCase(Locale.ENGLISH);
                    String upperCase2 = str.trim().toUpperCase(Locale.ENGLISH);
                    if (upperCase.contains(upperCase2)) {
                        arrayList.add(qzrVar);
                    } else if (qzrVar.g().contains(upperCase2)) {
                        arrayList.add(qzrVar);
                    } else {
                        LogUtil.d("ContactSelectActivityPresenterImpl", "no contact to be found");
                    }
                } else {
                    LogUtil.d("ContactSelectActivityPresenterImpl", "other type");
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void setIsSelectAll(boolean z) {
        this.d = z;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void itemSelectDataChange(int i, List<qzr> list) {
        LogUtil.a("ContactSelectActivityPresenterImpl", "itemSelectDataChange position : ", Integer.valueOf(i));
        if (list == null || list.isEmpty() || e() == null) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "itemSelectDataChange dataList is empty");
            return;
        }
        if (i >= list.size()) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "itemSelectDataChange position out of list size");
            return;
        }
        int selectedCount = getSelectedCount();
        if (list.get(i).j()) {
            list.get(i).b(false);
            selectedCount--;
        } else if (selectedCount < this.e) {
            list.get(i).b(true);
            selectedCount++;
        } else {
            e().showUpperLimitMessage(this.e);
        }
        e().setCustomTitleBar(selectedCount);
        if (optionalQuantity() < 1 || (this.f47038a != null && getSelectedCount() == this.f47038a.size())) {
            e().changeHealthToolBarState(true);
        } else {
            e().changeHealthToolBarState(false);
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void saveDataToContactList(String str, String str2, String str3, String str4) {
        com.huawei.hwlogsmodel.LogUtil.a("ContactSelectActivityPresenterImpl", "saveDataToContactList enter");
        PhoneNumber phoneNumber = new PhoneNumber(str4, str3);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(phoneNumber);
        this.i.add(new Contact(str2, str, arrayList));
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void getResultList() {
        this.i = new ArrayList(10);
        if (!njy.e(this.f47038a)) {
            for (qzr qzrVar : this.f47038a) {
                if (qzrVar.j()) {
                    saveDataToContactList(qzrVar.b(), qzrVar.e(), qzrVar.d(), TypedValues.Custom.NAME);
                }
            }
        }
        if (e() != null) {
            e().finishSelect(this.i);
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void setMaxSelectCount(int i) {
        this.e = i;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void setOldContactList(ArrayList<String> arrayList) {
        this.f = arrayList;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public void setContactData(Map<String, qzr> map, Map<String, qzr> map2) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e().getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        e(map, map2, cursorQuery);
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLException unused) {
                LogUtil.c("ContactSelectActivityPresenterImpl", "setContactData exception");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    private void e(Map<String, qzr> map, Map<String, qzr> map2, Cursor cursor) {
        String str;
        String string;
        String string2 = cursor.getString(cursor.getColumnIndex("data1"));
        if (TextUtils.isEmpty(string2)) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "setContactData phoneNumber is empty");
            return;
        }
        qzr qzrVar = new qzr();
        String numbers = formatNumbers(string2);
        qzrVar.d(numbers);
        String string3 = cursor.getString(cursor.getColumnIndex("display_name"));
        if (string3 == null) {
            str = numbers;
        } else {
            str = string3 + numbers;
        }
        if (c(str) || map.containsKey(str)) {
            LogUtil.e("ContactSelectActivityPresenterImpl", "setContactData key:", str);
            return;
        }
        qzrVar.e(cursor.getString(cursor.getColumnIndex("contact_id")));
        int i = cursor.getInt(cursor.getColumnIndex("data2"));
        if (i == 0) {
            string = cursor.getString(cursor.getColumnIndex("data3"));
        } else {
            string = (e() == null || !(ContactsContract.CommonDataKinds.Phone.getTypeLabel(e().getContext().getResources(), i, "") instanceof String)) ? "" : (String) ContactsContract.CommonDataKinds.Phone.getTypeLabel(e().getContext().getResources(), i, "");
        }
        qzrVar.b(string);
        if (string3 == null) {
            qzrVar.a(numbers);
            qzrVar.j("#");
            qzrVar.i("#");
            map2.put(str, qzrVar);
            return;
        }
        qzrVar.a(string3);
        setContactSortData(qzrVar);
        if ("#".equals(qzrVar.g()) && "#".equals(qzrVar.f())) {
            map2.put(str, qzrVar);
        } else {
            map.put(str, qzrVar);
        }
    }

    private void a(List<qzr> list) {
        LogUtil.a("ContactSelectActivityPresenterImpl", "setContactPhoto enter");
        try {
            File file = new File(BaseApplication.b().getFilesDir().getCanonicalPath() + File.separator + "contactPhoto" + File.separator);
            this.g = file;
            if (!file.exists()) {
                LogUtil.a("ContactSelectActivityPresenterImpl", "setContactData isMkdirs：", Boolean.valueOf(this.g.mkdirs()));
            }
        } catch (IOException e) {
            ReleaseLogUtil.a("DEVMGR_ContactSelectActivityPresenterImpl", "setContactData IOException:", ExceptionUtils.c(e));
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = e().getContext().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data15"}, "mimetype='vnd.android.cursor.item/photo'", new String[0], null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    do {
                        c(list, cursorQuery);
                    } while (cursorQuery.moveToNext());
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLException unused) {
            LogUtil.c("ContactSelectActivityPresenterImpl", "setContactData exception");
        }
    }

    private void c(List<qzr> list, Cursor cursor) throws Throwable {
        String canonicalPath;
        FileOutputStream fileOutputStream;
        String string = cursor.getString(cursor.getColumnIndex("contact_id"));
        for (qzr qzrVar : list) {
            String strE = qzrVar.e();
            if (!TextUtils.isEmpty(strE) && strE.equals(string)) {
                byte[] blob = cursor.getBlob(cursor.getColumnIndex("data15"));
                if (blob != null) {
                    FileOutputStream fileOutputStream2 = null;
                    try {
                        try {
                            File fileD = FileUtils.d(this.g, strE + ".png");
                            fileOutputStream = new FileOutputStream(fileD);
                            try {
                                fileOutputStream.write(blob);
                                fileOutputStream.flush();
                                canonicalPath = fileD.getCanonicalPath();
                                IoUtils.c(fileOutputStream);
                            } catch (FileNotFoundException e) {
                                e = e;
                                fileOutputStream2 = fileOutputStream;
                                ReleaseLogUtil.a("DEVMGR_ContactSelectActivityPresenterImpl", "setContactPhotoPath FileNotFoundException:", ExceptionUtils.c(e));
                                IoUtils.c(fileOutputStream2);
                                canonicalPath = "";
                            } catch (IOException e2) {
                                e = e2;
                                fileOutputStream2 = fileOutputStream;
                                ReleaseLogUtil.a("DEVMGR_ContactSelectActivityPresenterImpl", "setContactPhotoPath IOException:", ExceptionUtils.c(e));
                                IoUtils.c(fileOutputStream2);
                                canonicalPath = "";
                            } catch (Throwable th) {
                                th = th;
                                IoUtils.c(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                        }
                    } catch (FileNotFoundException e3) {
                        e = e3;
                    } catch (IOException e4) {
                        e = e4;
                    }
                } else {
                    canonicalPath = "";
                }
                qzrVar.c(canonicalPath);
                return;
            }
        }
    }

    private boolean c(String str) {
        for (int i = 0; i < this.f.size(); i++) {
            if (this.f.get(i).contains(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityPresenter
    public String formatNumbers(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("ContactSelectActivityPresenterImpl", "formatNumbers number is empty");
            return "";
        }
        String number = PhoneNumberUtils.formatNumber(str, Locale.getDefault().getCountry());
        return TextUtils.isEmpty(number) ? str : number;
    }
}
