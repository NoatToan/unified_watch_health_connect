package com.huawei.datatype;

import com.google.gson.annotations.SerializedName;
import defpackage.cop;
import defpackage.lst;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Contact implements Serializable {

    @SerializedName("icon_index")
    private String iconIndex;
    private int index;
    private String name;
    private String note;
    private List<PhoneNumber> phoneNumbers;

    public Contact() {
        this.index = 1;
        this.note = "";
        this.iconIndex = "-1";
    }

    public Contact(String str, String str2, List<PhoneNumber> list) {
        this.index = 1;
        this.note = "";
        this.iconIndex = "-1";
        this.name = (String) lst.d(str2);
        this.phoneNumbers = (List) lst.d(list);
        this.iconIndex = (String) lst.d(str);
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String getName() {
        return (String) lst.d(this.name);
    }

    public void setName(String str) {
        this.name = (String) lst.d(str);
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return (List) lst.d(this.phoneNumbers);
    }

    public void setPhoneNumbers(List<PhoneNumber> list) {
        this.phoneNumbers = (List) lst.d(list);
    }

    public String getNote() {
        return (String) lst.d(this.note);
    }

    public String getIconIndex() {
        return (String) lst.d(this.iconIndex);
    }

    public void setIconIndex(String str) {
        this.iconIndex = (String) lst.d(str);
    }

    public String toString() {
        return "[Contact: name = " + cop.e(this.name) + ", note = " + this.note + ", icon_index = " + this.iconIndex + ", phoneNumbers = " + this.phoneNumbers + "]";
    }
}
