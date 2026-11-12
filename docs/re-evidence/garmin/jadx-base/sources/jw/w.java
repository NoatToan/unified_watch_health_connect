package jw;

import android.database.Cursor;
import android.telephony.PhoneNumberUtils;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljw/w;", "", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f101315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f101316b;

    static {
        new a(null);
        f101315a = new String[]{"contact_id", "lookup", "mimetype", "is_primary", "data1", "data2", "data3", "data5"};
        f101316b = new String[]{"vnd.android.cursor.item/name", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2"};
    }

    public static void a(LinkedHashMap linkedHashMap, Cursor cursor, int i14, int i15, int i16, int i17, int i18, int i19) {
        l20.k kVar;
        l20.k kVar2;
        if (cursor.isNull(i16)) {
            return;
        }
        long j8 = cursor.getLong(i14);
        l20.n nVar = (l20.n) linkedHashMap.get(Long.valueOf(j8));
        if (nVar != null) {
            Set<l20.j> set = nVar.f109032f;
            if (set.size() < i19) {
                String string = cursor.getString(i16);
                string.getClass();
                int i24 = cursor.getInt(i17);
                l20.k[] kVarArrValues = l20.k.values();
                int length = kVarArrValues.length;
                int i25 = 0;
                while (true) {
                    if (i25 >= length) {
                        kVar2 = null;
                        break;
                    }
                    l20.k kVar3 = kVarArrValues[i25];
                    if (kVar3.f109014c == i24) {
                        kVar2 = kVar3;
                        break;
                    }
                    i25++;
                }
                if (kVar2 == null) {
                    kVar2 = l20.k.OTHER;
                }
                set.add(new l20.j(string, kVar2, cursor.getInt(i18) != 0));
                return;
            }
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string2 = cursor.getString(i16);
        string2.getClass();
        int i26 = cursor.getInt(i17);
        l20.k[] kVarArrValues2 = l20.k.values();
        int length2 = kVarArrValues2.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length2) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues2[i27];
            if (kVar.f109014c == i26) {
                break;
            } else {
                i27++;
            }
        }
        if (kVar == null) {
            kVar = l20.k.OTHER;
        }
        linkedHashSet.add(new l20.j(string2, kVar, cursor.getInt(i18) != 0));
        String string3 = !cursor.isNull(i15) ? cursor.getString(i15) : "";
        Long lValueOf = Long.valueOf(j8);
        string3.getClass();
        linkedHashMap.put(lValueOf, new l20.n(j8, string3, null, null, null, linkedHashSet, 28, null));
    }

    public static void b(LinkedHashMap linkedHashMap, Cursor cursor, int i14, int i15, int i16, int i17, int i18, int i19) {
        l20.p pVar;
        l20.p pVar2;
        if (cursor.isNull(i16)) {
            return;
        }
        long j8 = cursor.getLong(i14);
        l20.n nVar = (l20.n) linkedHashMap.get(Long.valueOf(j8));
        String strStripSeparators = PhoneNumberUtils.stripSeparators(cursor.getString(i16));
        if (nVar != null) {
            Set<l20.o> set = nVar.f109031e;
            if (set.size() < i19) {
                strStripSeparators.getClass();
                int i24 = cursor.getInt(i17);
                l20.p[] pVarArrValues = l20.p.values();
                int length = pVarArrValues.length;
                int i25 = 0;
                while (true) {
                    if (i25 >= length) {
                        pVar2 = null;
                        break;
                    }
                    l20.p pVar3 = pVarArrValues[i25];
                    if (pVar3.f109042c == i24) {
                        pVar2 = pVar3;
                        break;
                    }
                    i25++;
                }
                if (pVar2 == null) {
                    pVar2 = l20.p.OTHER;
                }
                set.add(new l20.o(strStripSeparators, pVar2, cursor.getInt(i18) != 0));
                return;
            }
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        strStripSeparators.getClass();
        int i26 = cursor.getInt(i17);
        l20.p[] pVarArrValues2 = l20.p.values();
        int length2 = pVarArrValues2.length;
        int i27 = 0;
        while (true) {
            if (i27 >= length2) {
                pVar = null;
                break;
            }
            pVar = pVarArrValues2[i27];
            if (pVar.f109042c == i26) {
                break;
            } else {
                i27++;
            }
        }
        if (pVar == null) {
            pVar = l20.p.OTHER;
        }
        linkedHashSet.add(new l20.o(strStripSeparators, pVar, cursor.getInt(i18) != 0));
        String string = !cursor.isNull(i15) ? cursor.getString(i15) : "";
        Long lValueOf = Long.valueOf(j8);
        string.getClass();
        linkedHashMap.put(lValueOf, new l20.n(j8, string, null, null, linkedHashSet, null, 44, null));
    }

    public static void c(LinkedHashMap linkedHashMap, Cursor cursor, int i14, int i15, int i16, int i17, int i18) {
        long j8 = cursor.getLong(i14);
        l20.n nVar = (l20.n) linkedHashMap.get(Long.valueOf(j8));
        String string = !cursor.isNull(i16) ? cursor.getString(i16) : "";
        String string2 = !cursor.isNull(i18) ? cursor.getString(i18) : "";
        String string3 = !cursor.isNull(i17) ? cursor.getString(i17) : "";
        if (nVar != null) {
            String string4 = d53.w.i0(string + StringUtils.SPACE + string3).toString();
            string4.getClass();
            nVar.f109029c = d53.w.i0(string4).toString();
            string2.getClass();
            nVar.f109030d = d53.w.i0(string2).toString();
            return;
        }
        string.getClass();
        if (d53.w.J(string)) {
            string3.getClass();
            if (d53.w.J(string3)) {
                string2.getClass();
                if (d53.w.J(string2)) {
                    return;
                }
            }
        }
        String string5 = cursor.isNull(i15) ? "" : cursor.getString(i15);
        Long lValueOf = Long.valueOf(j8);
        string5.getClass();
        String string6 = d53.w.i0(string + StringUtils.SPACE + string3).toString();
        string2.getClass();
        linkedHashMap.put(lValueOf, new l20.n(j8, string5, string6, string2, null, null, 48, null));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Ljw/w$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CONTACTS_MAX_PHONE_NUMBER_COUNT", "I", "CONTACTS_MAX_EMAIL_ADDRESS_COUNT", "", "PROJECTION", "[Ljava/lang/String;", "SELECTION", "SELECTION_ARGS", "SORT_ORDER", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
