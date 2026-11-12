package com.xiaomi.ai.domain.phonecall.common;

import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.ai.domain.phonecall.contact.PhoneType;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ContactRet implements Comparable<ContactRet> {
    private Contact contact;
    private transient List<PhoneItem> phoneItems;
    private double score;
    private String showName;
    private String showQuery;

    public ContactRet(Contact contact, double d, String str, String str2) {
        this.contact = contact;
        this.score = d;
        this.showName = str;
        this.showQuery = str2;
        this.phoneItems = new ArrayList();
    }

    public ContactRet filterPhoneItems(String str) {
        if (str.isEmpty()) {
            this.phoneItems.addAll(this.contact.getPhoneItems());
        } else {
            for (PhoneItem phoneItem : this.contact.getPhoneItems()) {
                if (PhoneType.isEqual(str, phoneItem.getTag())) {
                    this.phoneItems.add(phoneItem);
                }
            }
        }
        return this;
    }

    public Contact getContact() {
        return this.contact;
    }

    public List<PhoneItem> getPhoneItems() {
        return this.phoneItems;
    }

    public double getScore() {
        return this.score;
    }

    public String getShowName() {
        return this.showName;
    }

    public String getShowQuery() {
        return this.showQuery;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public ContactRet setContact2(Contact contact) {
        this.contact = contact;
        return this;
    }

    public void setScore(double d) {
        this.score = d;
    }

    public void setShowName(String str) {
        this.showName = str;
    }

    public void setShowQuery(String str) {
        this.showQuery = str;
    }

    public String toString() {
        return "ContactRet{contact=" + this.contact + ", score=" + this.score + ", showName='" + this.showName + "', showQuery='" + this.showQuery + "', phoneItems=" + this.phoneItems + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.lang.Comparable
    public int compareTo(ContactRet contactRet) {
        if (Double.compare(this.score, contactRet.score) != 0) {
            return -Double.compare(this.score, contactRet.score);
        }
        return this.phoneItems.size() != contactRet.phoneItems.size() ? -Integer.compare(this.phoneItems.size(), contactRet.phoneItems.size()) : this.contact.getName().compareTo(contactRet.contact.getName());
    }

    public ContactRet(Contact contact, List<PhoneItem> list, double d, String str, String str2) {
        this.contact = contact;
        this.score = d;
        this.showName = str;
        this.showQuery = str2;
        this.phoneItems = list;
    }

    public ContactRet(ContactRet contactRet) {
        this.contact = contactRet.contact;
        this.score = contactRet.score;
        this.showName = contactRet.showName;
        this.showQuery = contactRet.showQuery;
        this.phoneItems = contactRet.phoneItems;
    }

    public ContactRet() {
        this.contact = new Contact();
        this.showName = "";
        this.showQuery = "";
        this.phoneItems = new ArrayList();
    }
}
