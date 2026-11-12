package com.huawei.ui.device.activity.selectcontact.selectmvp;

import defpackage.qzr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public interface ContactSelectActivityPresenter {
    void contactsSort(List<qzr> list);

    String formatNumbers(String str);

    List<qzr> getContacts();

    List<qzr> getContactsByInputType(int i, String str);

    int getInputType(String str);

    void getResultList();

    int getSelectedCount();

    void initData();

    void itemSelectDataChange(int i, List<qzr> list);

    void itemSelected(int i);

    void onEditTextInputChange(String str);

    int optionalQuantity();

    void saveDataToContactList(String str, String str2, String str3, String str4);

    void selectAll();

    void selectAllDataChange(List<qzr> list);

    void setContactData(Map<String, qzr> map, Map<String, qzr> map2);

    void setContactSortData(qzr qzrVar);

    void setIsSelectAll(boolean z);

    void setMaxSelectCount(int i);

    void setOldContactList(ArrayList<String> arrayList);
}
