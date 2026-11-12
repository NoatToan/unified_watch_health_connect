package com.github.tamir7.contacts;

import com.huami.assistant.model.bean.Update;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Contact {
    private Long a;
    private String b;
    private String c;
    private String d;
    private String f;
    private String i;
    private String j;
    private String m;
    private final Set<PhoneNumber> e = new HashSet();
    private final Set<Email> g = new HashSet();
    private final Set<Event> h = new HashSet();
    private final Set<String> k = new HashSet();
    private final Set<Address> l = new HashSet();

    public enum Field implements a {
        ContactId(null, "contact_id"),
        DisplayName(null, "display_name"),
        GivenName("vnd.android.cursor.item/name", "data2"),
        FamilyName("vnd.android.cursor.item/name", "data3"),
        PhoneNumber("vnd.android.cursor.item/phone_v2", Update.COLUMN_DATA1),
        PhoneType("vnd.android.cursor.item/phone_v2", "data2"),
        PhoneLabel("vnd.android.cursor.item/phone_v2", "data3"),
        PhoneNormalizedNumber("vnd.android.cursor.item/phone_v2", "data4"),
        Email("vnd.android.cursor.item/email_v2", Update.COLUMN_DATA1),
        EmailType("vnd.android.cursor.item/email_v2", "data2"),
        EmailLabel("vnd.android.cursor.item/email_v2", "data3"),
        PhotoUri(null, "photo_uri"),
        EventStartDate("vnd.android.cursor.item/contact_event", Update.COLUMN_DATA1),
        EventType("vnd.android.cursor.item/contact_event", "data2"),
        EventLabel("vnd.android.cursor.item/contact_event", "data3"),
        CompanyName("vnd.android.cursor.item/organization", Update.COLUMN_DATA1),
        CompanyTitle("vnd.android.cursor.item/organization", "data4"),
        Website("vnd.android.cursor.item/website", Update.COLUMN_DATA1),
        Note("vnd.android.cursor.item/note", Update.COLUMN_DATA1),
        Address("vnd.android.cursor.item/postal-address_v2", Update.COLUMN_DATA1),
        AddressType("vnd.android.cursor.item/postal-address_v2", "data2"),
        AddressStreet("vnd.android.cursor.item/postal-address_v2", "data4"),
        AddressCity("vnd.android.cursor.item/postal-address_v2", "data7"),
        AddressRegion("vnd.android.cursor.item/postal-address_v2", "data8"),
        AddressPostcode("vnd.android.cursor.item/postal-address_v2", "data9"),
        AddressCountry("vnd.android.cursor.item/postal-address_v2", "data10"),
        AddressLabel("vnd.android.cursor.item/postal-address_v2", "data3");

        private final String column;
        private final String mimeType;

        Field(String str, String str2) {
            this.mimeType = str;
            this.column = str2;
        }

        @Override // com.github.tamir7.contacts.Contact.a
        public String getColumn() {
            return this.column;
        }

        @Override // com.github.tamir7.contacts.Contact.a
        public String getMimeType() {
            return this.mimeType;
        }
    }

    public interface a {
        String getColumn();

        String getMimeType();
    }

    public enum b implements a {
        MimeType(null, "mimetype");

        private final String column;
        private final String mimeType;

        b(String str, String str2) {
            this.mimeType = str;
            this.column = str2;
        }

        @Override // com.github.tamir7.contacts.Contact.a
        public String getColumn() {
            return this.column;
        }

        @Override // com.github.tamir7.contacts.Contact.a
        public String getMimeType() {
            return this.mimeType;
        }
    }

    private Event m(Event.Type type) {
        for (Event event : this.h) {
            if (type.equals(event.getType())) {
                return event;
            }
        }
        return null;
    }

    public Contact a(Address address) {
        this.l.add(address);
        return this;
    }

    public Contact b(String str) {
        this.i = str;
        return this;
    }

    public Contact c(String str) {
        this.j = str;
        return this;
    }

    public Contact d(String str) {
        this.b = str;
        return this;
    }

    public Contact e(Email email) {
        this.g.add(email);
        return this;
    }

    public Contact f(Event event) {
        this.h.add(event);
        return this;
    }

    public Contact g(String str) {
        this.d = str;
        return this;
    }

    public List<Address> getAddresses() {
        Set<Address> set = this.l;
        return Arrays.asList(set.toArray(new Address[set.size()]));
    }

    public Event getAnniversary() {
        return m(Event.Type.ANNIVERSARY);
    }

    public Event getBirthday() {
        return m(Event.Type.BIRTHDAY);
    }

    public String getCompanyName() {
        return this.i;
    }

    public String getCompanyTitle() {
        return this.j;
    }

    public String getDisplayName() {
        return this.b;
    }

    public List<Email> getEmails() {
        Set<Email> set = this.g;
        return Arrays.asList(set.toArray(new Email[set.size()]));
    }

    public List<Event> getEvents() {
        Set<Event> set = this.h;
        return Arrays.asList(set.toArray(new Event[set.size()]));
    }

    public String getFamilyName() {
        return this.d;
    }

    public String getGivenName() {
        return this.c;
    }

    public Long getId() {
        return this.a;
    }

    public String getNote() {
        return this.m;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        Set<PhoneNumber> set = this.e;
        return Arrays.asList(set.toArray(new PhoneNumber[set.size()]));
    }

    public String getPhotoUri() {
        return this.f;
    }

    public List<String> getWebsites() {
        Set<String> set = this.k;
        return Arrays.asList(set.toArray(new String[set.size()]));
    }

    public Contact h(String str) {
        this.c = str;
        return this;
    }

    public Contact i(String str) {
        this.m = str;
        return this;
    }

    public Contact j(PhoneNumber phoneNumber) {
        this.e.add(phoneNumber);
        return this;
    }

    public Contact k(String str) {
        this.f = str;
        return this;
    }

    public Contact l(String str) {
        this.k.add(str);
        return this;
    }

    public void n(Long l) {
        this.a = l;
    }
}
