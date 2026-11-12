package com.github.tamir7.contacts;

import android.database.Cursor;
import android.os.Build;
import com.huami.assistant.model.bean.Update;

/* JADX INFO: loaded from: classes2.dex */
class a {
    private final Cursor a;

    public a(Cursor cursor) {
        this.a = cursor;
    }

    private Integer j(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(columnIndex));
    }

    private Long k(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return Long.valueOf(cursor.getLong(columnIndex));
    }

    private String p(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    public Address a() {
        String strP = p(this.a, Update.COLUMN_DATA1);
        if (strP == null) {
            return null;
        }
        Integer numJ = j(this.a, "data2");
        Address.Type typeA = numJ == null ? Address.Type.UNKNOWN : Address.Type.a(numJ.intValue());
        String strP2 = p(this.a, "data4");
        String strP3 = p(this.a, "data7");
        String strP4 = p(this.a, "data8");
        String strP5 = p(this.a, "data9");
        String strP6 = p(this.a, "data10");
        return !typeA.equals(Address.Type.CUSTOM) ? new Address(strP, strP2, strP3, strP4, strP5, strP6, typeA) : new Address(strP, strP2, strP3, strP4, strP5, strP6, p(this.a, "data3"));
    }

    public String b() {
        return p(this.a, Update.COLUMN_DATA1);
    }

    public String c() {
        return p(this.a, "data4");
    }

    public Long d() {
        return k(this.a, "contact_id");
    }

    public String e() {
        return p(this.a, "display_name");
    }

    public Email f() {
        String strP = p(this.a, Update.COLUMN_DATA1);
        if (strP == null) {
            return null;
        }
        Integer numJ = j(this.a, "data2");
        Email.Type typeA = numJ == null ? Email.Type.UNKNOWN : Email.Type.a(numJ.intValue());
        return !typeA.equals(Email.Type.CUSTOM) ? new Email(strP, typeA) : new Email(strP, p(this.a, "data3"));
    }

    public Event g() {
        String strP = p(this.a, Update.COLUMN_DATA1);
        if (strP == null) {
            return null;
        }
        Integer numJ = j(this.a, "data2");
        Event.Type typeA = numJ == null ? Event.Type.UNKNOWN : Event.Type.a(numJ.intValue());
        return !typeA.equals(Event.Type.CUSTOM) ? new Event(strP, typeA) : new Event(strP, p(this.a, "data3"));
    }

    public String h() {
        return p(this.a, "data3");
    }

    public String i() {
        return p(this.a, "data2");
    }

    public String l() {
        return p(this.a, "mimetype");
    }

    public String m() {
        return p(this.a, Update.COLUMN_DATA1);
    }

    public PhoneNumber n() {
        String strP = p(this.a, Update.COLUMN_DATA1);
        if (strP == null) {
            return null;
        }
        String strP2 = Build.VERSION.SDK_INT >= 16 ? p(this.a, "data4") : null;
        Integer numJ = j(this.a, "data2");
        PhoneNumber.Type typeA = numJ == null ? PhoneNumber.Type.UNKNOWN : PhoneNumber.Type.a(numJ.intValue());
        return !typeA.equals(PhoneNumber.Type.CUSTOM) ? new PhoneNumber(strP, typeA, strP2) : new PhoneNumber(strP, p(this.a, "data3"), strP2);
    }

    public String o() {
        return p(this.a, "photo_uri");
    }

    public String q() {
        return p(this.a, Update.COLUMN_DATA1);
    }
}
