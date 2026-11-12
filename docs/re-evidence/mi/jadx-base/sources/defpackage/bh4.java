package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class bh4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f4202b = new a();
    public static final List<String> c = new b();
    public static final List<String> d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f4203a;

    public static class a extends ArrayList<String> {
        public a() {
            add("_id");
            add("contact_id");
            add("raw_contact_id");
            add("lookup");
            add("mimetype");
            add("display_name");
            add("photo_uri");
            add("data1");
            add("data2");
            add("data5");
            add("data3");
            add("data4");
            add("data6");
            add("data1");
            add("data2");
            add("data3");
            add("data1");
            add("data1");
            add("data2");
            add("data3");
            add("data1");
            add("data4");
            add("data5");
            add("data1");
            add("data2");
            add("data3");
            add("data4");
            add("data5");
            add("data6");
            add("data7");
            add("data8");
            add("data9");
            add("data10");
            add("data1");
            add("data2");
        }
    }

    public static class b extends ArrayList<String> {
        public b() {
            addAll(bh4.f4202b);
        }
    }

    public static class c extends ArrayList<String> {
        public c() {
            add("photo_uri");
        }
    }

    public bh4(ContentResolver contentResolver) {
        this.f4203a = contentResolver;
    }

    public WritableMap b(String str) {
        ContentResolver contentResolver = this.f4203a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = c;
        Cursor cursorQuery = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "contact_id = ?", new String[]{str}, null);
        try {
            Map<String, d> mapG = g(cursorQuery);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (mapG.values().size() > 0) {
                return mapG.values().iterator().next().s();
            }
            return null;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public WritableMap c(String str) {
        int columnIndex;
        Cursor cursorQuery = this.f4203a.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"contact_id"}, "_id= ?", new String[]{str}, null);
        cursorQuery.getCount();
        String string = (!cursorQuery.moveToNext() || (columnIndex = cursorQuery.getColumnIndex("contact_id")) == -1) ? null : cursorQuery.getString(columnIndex);
        cursorQuery.close();
        return b(string);
    }

    public WritableArray d() {
        ContentResolver contentResolver = this.f4203a;
        Uri uriWithAppendedPath = Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data");
        List<String> list = f4202b;
        Cursor cursorQuery = contentResolver.query(uriWithAppendedPath, (String[]) list.toArray(new String[list.size()]), null, null, null);
        try {
            Map<String, d> mapG = g(cursorQuery);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            ContentResolver contentResolver2 = this.f4203a;
            Uri uri = ContactsContract.Data.CONTENT_URI;
            List<String> list2 = c;
            Cursor cursorQuery2 = contentResolver2.query(uri, (String[]) list2.toArray(new String[list2.size()]), "mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=?", new String[]{"vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/contact_event"}, null);
            try {
                Map<String, d> mapG2 = g(cursorQuery2);
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                WritableArray writableArrayCreateArray = Arguments.createArray();
                Iterator<d> it = mapG.values().iterator();
                while (it.hasNext()) {
                    writableArrayCreateArray.pushMap(it.next().s());
                }
                Iterator<d> it2 = mapG2.values().iterator();
                while (it2.hasNext()) {
                    writableArrayCreateArray.pushMap(it2.next().s());
                }
                return writableArrayCreateArray;
            } catch (Throwable th) {
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public WritableArray e(String str) {
        ContentResolver contentResolver = this.f4203a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = c;
        Cursor cursorQuery = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "display_name LIKE ?", new String[]{"%" + str + "%"}, null);
        try {
            Map<String, d> mapG = g(cursorQuery);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<d> it = mapG.values().iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap(it.next().s());
            }
            return writableArrayCreateArray;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public String f(String str) {
        ContentResolver contentResolver = this.f4203a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = d;
        Cursor cursorQuery = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "contact_id = ?", new String[]{str}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("photo_uri"));
                    if (!TextUtils.isEmpty(string)) {
                        cursorQuery.close();
                        return string;
                    }
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    public final Map<String, d> g(Cursor cursor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor != null && cursor.moveToNext()) {
            int columnIndex = cursor.getColumnIndex("contact_id");
            int columnIndex2 = cursor.getColumnIndex("_id");
            int columnIndex3 = cursor.getColumnIndex("raw_contact_id");
            String string = columnIndex != -1 ? cursor.getString(columnIndex) : String.valueOf(-1);
            String string2 = columnIndex2 != -1 ? cursor.getString(columnIndex2) : String.valueOf(-1);
            String string3 = columnIndex3 != -1 ? cursor.getString(columnIndex3) : String.valueOf(-1);
            if (!linkedHashMap.containsKey(string)) {
                linkedHashMap.put(string, new d(string));
            }
            d dVar = (d) linkedHashMap.get(string);
            String string4 = cursor.getString(cursor.getColumnIndex("mimetype"));
            String string5 = cursor.getString(cursor.getColumnIndex("display_name"));
            dVar.f4205b = string3;
            if (!TextUtils.isEmpty(string5) && TextUtils.isEmpty(dVar.c)) {
                dVar.c = string5;
            }
            if (TextUtils.isEmpty(dVar.m)) {
                String string6 = cursor.getString(cursor.getColumnIndex("photo_uri"));
                if (!TextUtils.isEmpty(string6)) {
                    dVar.m = string6;
                    dVar.l = true;
                }
            }
            if (string4.equals("vnd.android.cursor.item/name")) {
                dVar.d = cursor.getString(cursor.getColumnIndex("data2"));
                dVar.e = cursor.getString(cursor.getColumnIndex("data5"));
                dVar.f = cursor.getString(cursor.getColumnIndex("data3"));
                dVar.g = cursor.getString(cursor.getColumnIndex("data4"));
                dVar.h = cursor.getString(cursor.getColumnIndex("data6"));
            } else {
                String lowerCase = "home";
                if (string4.equals("vnd.android.cursor.item/phone_v2")) {
                    String string7 = cursor.getString(cursor.getColumnIndex("data1"));
                    int i = cursor.getInt(cursor.getColumnIndex("data2"));
                    if (!TextUtils.isEmpty(string7)) {
                        if (i != 1) {
                            if (i != 2) {
                                lowerCase = i != 3 ? "other" : "work";
                            } else {
                                lowerCase = "mobile";
                            }
                        }
                        dVar.o.add(new d.b(lowerCase, string7, string2));
                    }
                } else if (string4.equals("vnd.android.cursor.item/email_v2")) {
                    String string8 = cursor.getString(cursor.getColumnIndex("data1"));
                    int i2 = cursor.getInt(cursor.getColumnIndex("data2"));
                    if (!TextUtils.isEmpty(string8)) {
                        if (i2 == 0) {
                            lowerCase = cursor.getString(cursor.getColumnIndex("data3")) != null ? cursor.getString(cursor.getColumnIndex("data3")).toLowerCase() : "";
                        } else if (i2 != 1) {
                            if (i2 != 2) {
                                lowerCase = i2 != 4 ? "other" : "mobile";
                            } else {
                                lowerCase = "work";
                            }
                        }
                        dVar.n.add(new d.b(lowerCase, string8, string2));
                    }
                } else if (string4.equals("vnd.android.cursor.item/organization")) {
                    dVar.i = cursor.getString(cursor.getColumnIndex("data1"));
                    dVar.j = cursor.getString(cursor.getColumnIndex("data4"));
                    dVar.f4206k = cursor.getString(cursor.getColumnIndex("data5"));
                } else if (string4.equals("vnd.android.cursor.item/postal-address_v2")) {
                    dVar.p.add(new d.c(cursor));
                } else if (string4.equals("vnd.android.cursor.item/contact_event") && cursor.getInt(cursor.getColumnIndex("data2")) == 3) {
                    try {
                        List listAsList = Arrays.asList(cursor.getString(cursor.getColumnIndex("data1")).replace("--", "").split("-"));
                        if (listAsList.size() == 2) {
                            int i3 = Integer.parseInt((String) listAsList.get(0));
                            int i4 = Integer.parseInt((String) listAsList.get(1));
                            if (i3 >= 1 && i3 <= 12 && i4 >= 1 && i4 <= 31) {
                                dVar.q = new d.a(i3, i4);
                            }
                        } else if (listAsList.size() == 3) {
                            int i5 = Integer.parseInt((String) listAsList.get(0));
                            int i6 = Integer.parseInt((String) listAsList.get(1));
                            int i7 = Integer.parseInt((String) listAsList.get(2));
                            if (i5 > 0 && i6 >= 1 && i6 <= 12 && i7 >= 1 && i7 <= 31) {
                                dVar.q = new d.a(i5, i6, i7);
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e = e;
                        e.toString();
                    } catch (NumberFormatException e2) {
                        e = e2;
                        e.toString();
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f4205b;
        public String c;
        public String m;
        public a q;
        public String d = "";
        public String e = "";
        public String f = "";
        public String g = "";
        public String h = "";
        public String i = "";
        public String j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f4206k = "";
        public boolean l = false;
        public List<b> n = new ArrayList();
        public List<b> o = new ArrayList();
        public List<c> p = new ArrayList();

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f4209a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f4210b;
            public String c;

            public b(String str, String str2, String str3) {
                this.c = str3;
                this.f4209a = str;
                this.f4210b = str2;
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WritableMap f4211a;

            public c(Cursor cursor) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                this.f4211a = writableMapCreateMap;
                writableMapCreateMap.putString("label", a(cursor));
                b(cursor, "formattedAddress", "data1");
                b(cursor, "street", "data4");
                b(cursor, "pobox", "data5");
                b(cursor, "neighborhood", "data6");
                b(cursor, "city", "data7");
                b(cursor, "region", "data8");
                b(cursor, "state", "data8");
                b(cursor, "postCode", "data9");
                b(cursor, "country", "data10");
            }

            public static String a(Cursor cursor) {
                int i = cursor.getInt(cursor.getColumnIndex("data2"));
                if (i == 0) {
                    String string = cursor.getString(cursor.getColumnIndex("data3"));
                    return string != null ? string : "";
                }
                if (i != 1) {
                    return i != 2 ? "other" : "work";
                }
                return "home";
            }

            public final void b(Cursor cursor, String str, String str2) {
                String string = cursor.getString(cursor.getColumnIndex(str2));
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                this.f4211a.putString(str, string);
            }
        }

        public d(String str) {
            this.f4204a = str;
        }

        public WritableMap s() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("recordID", this.f4204a);
            writableMapCreateMap.putString("rawContactId", this.f4205b);
            writableMapCreateMap.putString("givenName", TextUtils.isEmpty(this.d) ? this.c : this.d);
            writableMapCreateMap.putString("middleName", this.e);
            writableMapCreateMap.putString("familyName", this.f);
            writableMapCreateMap.putString("prefix", this.g);
            writableMapCreateMap.putString("suffix", this.h);
            writableMapCreateMap.putString("company", this.i);
            writableMapCreateMap.putString("jobTitle", this.j);
            writableMapCreateMap.putString("department", this.f4206k);
            writableMapCreateMap.putBoolean("hasThumbnail", this.l);
            String str = this.m;
            if (str == null) {
                str = "";
            }
            writableMapCreateMap.putString("thumbnailPath", str);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (b bVar : this.o) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString(RealNameWebViewActivity.NUMBER, bVar.f4210b);
                writableMapCreateMap2.putString("label", bVar.f4209a);
                writableMapCreateMap2.putString("id", bVar.c);
                writableArrayCreateArray.pushMap(writableMapCreateMap2);
            }
            writableMapCreateMap.putArray("phoneNumbers", writableArrayCreateArray);
            WritableArray writableArrayCreateArray2 = Arguments.createArray();
            for (b bVar2 : this.n) {
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putString("email", bVar2.f4210b);
                writableMapCreateMap3.putString("label", bVar2.f4209a);
                writableMapCreateMap3.putString("id", bVar2.c);
                writableArrayCreateArray2.pushMap(writableMapCreateMap3);
            }
            writableMapCreateMap.putArray("emailAddresses", writableArrayCreateArray2);
            WritableArray writableArrayCreateArray3 = Arguments.createArray();
            Iterator<c> it = this.p.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray3.pushMap(it.next().f4211a);
            }
            writableMapCreateMap.putArray("postalAddresses", writableArrayCreateArray3);
            WritableMap writableMapCreateMap4 = Arguments.createMap();
            a aVar = this.q;
            if (aVar != null) {
                int i = aVar.f4207a;
                if (i > 0) {
                    writableMapCreateMap4.putInt("year", i);
                }
                writableMapCreateMap4.putInt("month", this.q.f4208b);
                writableMapCreateMap4.putInt("day", this.q.c);
                writableMapCreateMap.putMap("birthday", writableMapCreateMap4);
            }
            return writableMapCreateMap;
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4207a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4208b;
            public int c;

            public a(int i, int i2, int i3) {
                this.f4207a = i;
                this.f4208b = i2;
                this.c = i3;
            }

            public a(int i, int i2) {
                this.f4207a = 0;
                this.f4208b = i;
                this.c = i2;
            }
        }
    }
}
