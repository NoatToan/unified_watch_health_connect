package com.github.tamir7.contacts;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Query {
    private final Context a;
    private final Map<String, b> b = new HashMap();
    private b c = null;
    private Set<Contact.Field> d;
    private List<Query> e;

    public Query(Context context) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.a = context;
        hashSet.addAll(Arrays.asList(Contact.Field.values()));
    }

    private void a(Contact.Field field, b bVar) {
        if (field.getMimeType() == null) {
            this.c = b(this.c, bVar);
        } else {
            this.b.put(field.getMimeType(), b(this.b.get(field.getMimeType()), bVar));
        }
    }

    private b b(b bVar, b bVar2) {
        return bVar == null ? bVar2 : bVar.a(bVar2);
    }

    private String[] c() {
        HashSet hashSet = new HashSet();
        for (Contact.b bVar : Contact.b.values()) {
            hashSet.add(bVar.getColumn());
        }
        Iterator<Contact.Field> it2 = this.d.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getColumn());
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private b d() {
        HashSet hashSet = new HashSet();
        for (Contact.Field field : this.d) {
            if (field.getMimeType() != null) {
                hashSet.add(field.getMimeType());
            }
        }
        return b.i("mimetype", new ArrayList(hashSet));
    }

    private List<Contact> e(List<Long> list) {
        b bVarI;
        if (list == null) {
            bVarI = this.c;
        } else {
            if (list.isEmpty()) {
                return new ArrayList();
            }
            bVarI = b.i("contact_id", new ArrayList(list));
        }
        Cursor cursorQuery = this.a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, c(), b(bVarI, d()).toString(), null, "display_name");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                a aVar = new a(cursorQuery);
                Long lD = aVar.d();
                Contact contact = (Contact) linkedHashMap.get(lD);
                if (contact == null) {
                    contact = new Contact();
                    linkedHashMap.put(lD, contact);
                }
                contact.n(lD);
                h(contact, aVar);
            }
            cursorQuery.close();
        }
        return new ArrayList(linkedHashMap.values());
    }

    private List<Long> f(List<Long> list, String str, b bVar) {
        String[] strArr = {"contact_id"};
        b bVarB = b(b.e("mimetype", str), bVar);
        if (!list.isEmpty()) {
            bVarB = b(bVarB, b.i("contact_id", new ArrayList(list)));
        }
        Cursor cursorQuery = this.a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, strArr, bVarB.toString(), null, "contact_id");
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                arrayList.add(new a(cursorQuery).d());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    private List<Long> g() {
        List<Long> arrayList = new ArrayList<>();
        if (this.b.isEmpty()) {
            Cursor cursorQuery = this.a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id"}, this.c.toString(), null, "contact_id");
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new a(cursorQuery).d());
                }
                cursorQuery.close();
            }
        } else {
            for (Map.Entry<String, b> entry : this.b.entrySet()) {
                arrayList = f(arrayList, entry.getKey(), entry.getValue());
            }
        }
        return arrayList;
    }

    private void h(Contact contact, a aVar) {
        String strE = aVar.e();
        if (strE != null) {
            contact.d(strE);
        }
        String strO = aVar.o();
        if (strO != null) {
            contact.k(strO);
        }
        String strL = aVar.l();
        strL.hashCode();
        switch (strL) {
            case "vnd.android.cursor.item/email_v2":
                Email emailF = aVar.f();
                if (emailF != null) {
                    contact.e(emailF);
                    break;
                }
                break;
            case "vnd.android.cursor.item/contact_event":
                Event eventG = aVar.g();
                if (eventG != null) {
                    contact.f(eventG);
                    break;
                }
                break;
            case "vnd.android.cursor.item/name":
                String strI = aVar.i();
                if (strI != null) {
                    contact.h(strI);
                }
                String strH = aVar.h();
                if (strH != null) {
                    contact.g(strH);
                    break;
                }
                break;
            case "vnd.android.cursor.item/note":
                String strM = aVar.m();
                if (strM != null) {
                    contact.i(strM);
                    break;
                }
                break;
            case "vnd.android.cursor.item/postal-address_v2":
                Address addressA = aVar.a();
                if (addressA != null) {
                    contact.a(addressA);
                    break;
                }
                break;
            case "vnd.android.cursor.item/website":
                String strQ = aVar.q();
                if (strQ != null) {
                    contact.l(strQ);
                    break;
                }
                break;
            case "vnd.android.cursor.item/phone_v2":
                PhoneNumber phoneNumberN = aVar.n();
                if (phoneNumberN != null) {
                    contact.j(phoneNumberN);
                    break;
                }
                break;
            case "vnd.android.cursor.item/organization":
                String strB = aVar.b();
                if (strB != null) {
                    contact.b(strB);
                }
                String strC = aVar.c();
                if (strC != null) {
                    contact.c(strC);
                    break;
                }
                break;
        }
    }

    public List<Contact> find() {
        List<Long> arrayList = new ArrayList<>();
        List<Query> list = this.e;
        if (list != null) {
            Iterator<Query> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().g());
            }
        } else {
            if (this.b.isEmpty()) {
                return e(null);
            }
            for (Map.Entry<String, b> entry : this.b.entrySet()) {
                arrayList = f(arrayList, entry.getKey(), entry.getValue());
            }
        }
        return e(arrayList);
    }

    public Query hasPhoneNumber() {
        this.c = b(this.c, b.n("has_phone_number", 0));
        return this;
    }

    public Query include(Contact.Field... fieldArr) {
        this.d.clear();
        this.d.addAll(Arrays.asList(fieldArr));
        return this;
    }

    public Query or(List<Query> list) {
        this.e = list;
        return this;
    }

    public Query whereContains(Contact.Field field, Object obj) {
        a(field, b.b(field.getColumn(), obj));
        return this;
    }

    public Query whereEqualTo(Contact.Field field, Object obj) {
        a(field, b.e(field.getColumn(), obj));
        return this;
    }

    public Query whereNotEqualTo(Contact.Field field, Object obj) {
        a(field, b.n(field.getColumn(), obj));
        return this;
    }

    public Query whereStartsWith(Contact.Field field, Object obj) {
        a(field, b.q(field.getColumn(), obj));
        return this;
    }
}
