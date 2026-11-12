package m20;

import android.provider.ContactsContract;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Ll20/n;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo$getPhoneContacts$2", f = "ContactsRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends l20.n>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f116010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f116011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f116012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, int i14, int i15, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f116010a = zVar;
        this.f116011b = i14;
        this.f116012c = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f116010a, this.f116011b, this.f116012c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends l20.n>>> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Throwable th3;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r24;
        ?? r110;
        List listN0;
        int i14;
        int i15;
        int i16;
        LinkedHashMap linkedHashMap;
        String str;
        ?? r111;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        jw.w wVar = this.f116010a.f116057c;
        int i17 = this.f116011b;
        int i18 = this.f116012c;
        wVar.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ?? Query = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a().getContentResolver().query(ContactsContract.Data.CONTENT_URI, jw.w.f101315a, "mimetype = ? OR mimetype = ? OR mimetype = ?", jw.w.f101316b, "contact_id");
        String str2 = "PhoneContactsProvider";
        if (Query == 0) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "PhoneContactsProvider", "ContactsProvider query failed, cursor is null.");
            listN0 = p13.j0.f134944a;
        } else {
            Closeable closeable = (Closeable) Query;
            try {
                try {
                    try {
                        int columnIndexOrThrow = Query.getColumnIndexOrThrow("contact_id");
                        int columnIndexOrThrow2 = Query.getColumnIndexOrThrow("lookup");
                        int columnIndexOrThrow3 = Query.getColumnIndexOrThrow("mimetype");
                        int columnIndexOrThrow4 = Query.getColumnIndexOrThrow("is_primary");
                        int columnIndexOrThrow5 = Query.getColumnIndexOrThrow("data1");
                        int columnIndexOrThrow6 = Query.getColumnIndexOrThrow("data2");
                        int columnIndexOrThrow7 = Query.getColumnIndexOrThrow("data3");
                        int columnIndexOrThrow8 = Query.getColumnIndexOrThrow("data5");
                        try {
                            if (Query.moveToFirst()) {
                                while (true) {
                                    String string = Query.getString(columnIndexOrThrow3);
                                    if (string != null) {
                                        int iHashCode = string.hashCode();
                                        if (iHashCode == -1569536764) {
                                            i14 = columnIndexOrThrow7;
                                            i15 = columnIndexOrThrow8;
                                            if (string.equals("vnd.android.cursor.item/email_v2")) {
                                                int i19 = i18;
                                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                                str = str2;
                                                ?? r112 = Query;
                                                jw.w.a(linkedHashMap3, r112, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow4, i19 == true ? 1 : 0);
                                                linkedHashMap = linkedHashMap3;
                                                r111 = r112;
                                                i16 = i19;
                                            } else {
                                                i16 = i18;
                                                linkedHashMap = linkedHashMap2;
                                                str = str2;
                                                ?? r113 = Query;
                                                String str3 = "Cannot handle mimetype: " + r113.getString(columnIndexOrThrow3);
                                                i2.a aVar3 = i2.f36769a;
                                                a2 a2Var2 = a2.GENERAL;
                                                aVar3.getClass();
                                                i2.a.f(a2Var2, str, str3);
                                                r111 = r113;
                                            }
                                        } else if (iHashCode != -1079224304) {
                                            if (iHashCode == 684173810) {
                                                try {
                                                    if (string.equals("vnd.android.cursor.item/phone_v2")) {
                                                        jw.w.b(linkedHashMap2, Query, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow5, columnIndexOrThrow6, columnIndexOrThrow4, i17);
                                                        i14 = columnIndexOrThrow7;
                                                        i15 = columnIndexOrThrow8;
                                                        i16 = i18;
                                                        linkedHashMap = linkedHashMap2;
                                                        str = str2;
                                                        r111 = Query;
                                                    }
                                                } catch (Throwable th4) {
                                                    th3 = th4;
                                                    r14 = closeable;
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th5) {
                                                        jg.b.l(r14, th3);
                                                        throw th5;
                                                    }
                                                }
                                            }
                                            i14 = columnIndexOrThrow7;
                                            i15 = columnIndexOrThrow8;
                                            i16 = i18;
                                            linkedHashMap = linkedHashMap2;
                                            str = str2;
                                            ?? r114 = Query;
                                            String str4 = "Cannot handle mimetype: " + r114.getString(columnIndexOrThrow3);
                                            i2.a aVar4 = i2.f36769a;
                                            a2 a2Var3 = a2.GENERAL;
                                            aVar4.getClass();
                                            i2.a.f(a2Var3, str, str4);
                                            r111 = r114;
                                        } else {
                                            if (string.equals("vnd.android.cursor.item/name")) {
                                                i14 = columnIndexOrThrow7;
                                                i15 = columnIndexOrThrow8;
                                                jw.w.c(linkedHashMap2, Query, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow6, i15, i14);
                                                i16 = i18;
                                                linkedHashMap = linkedHashMap2;
                                                str = str2;
                                                r111 = Query;
                                            }
                                            i14 = columnIndexOrThrow7;
                                            i15 = columnIndexOrThrow8;
                                            i16 = i18;
                                            linkedHashMap = linkedHashMap2;
                                            str = str2;
                                            ?? r115 = Query;
                                            String str5 = "Cannot handle mimetype: " + r115.getString(columnIndexOrThrow3);
                                            i2.a aVar5 = i2.f36769a;
                                            a2 a2Var4 = a2.GENERAL;
                                            aVar5.getClass();
                                            i2.a.f(a2Var4, str, str5);
                                            r111 = r115;
                                        }
                                    } else {
                                        i14 = columnIndexOrThrow7;
                                        i15 = columnIndexOrThrow8;
                                        i16 = i18;
                                        linkedHashMap = linkedHashMap2;
                                        str = str2;
                                        ?? r116 = Query;
                                        String str6 = "Cannot handle mimetype: " + r116.getString(columnIndexOrThrow3);
                                        i2.a aVar6 = i2.f36769a;
                                        a2 a2Var5 = a2.GENERAL;
                                        aVar6.getClass();
                                        i2.a.f(a2Var5, str, str6);
                                        r111 = r116;
                                    }
                                    if (!r111.moveToNext()) {
                                        break;
                                    }
                                    closeable = closeable;
                                    columnIndexOrThrow7 = i14;
                                    Query = r111;
                                    str2 = str;
                                    linkedHashMap2 = linkedHashMap;
                                    i18 = i16;
                                    columnIndexOrThrow8 = i15;
                                }
                                Query = closeable;
                                r110 = linkedHashMap;
                            } else {
                                r110 = linkedHashMap2;
                                Query = closeable;
                                i2.a aVar7 = i2.f36769a;
                                a2 a2Var6 = a2.GENERAL;
                                aVar7.getClass();
                                i2.a.p(a2Var6, "PhoneContactsProvider", "Empty cursor, user has no contacts :(.");
                            }
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            r19 = linkedHashMap2;
                            r24 = Query;
                            r18 = i18;
                            String str7 = e.getMessage() + " - column doesn't exist in Cursor.";
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var7 = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.f(a2Var7, r19, str7);
                            Query = r24;
                            r110 = r18;
                        } catch (Exception e14) {
                            e = e14;
                            r16 = linkedHashMap2;
                            r17 = Query;
                            r15 = i18;
                            i2.a aVar9 = i2.f36769a;
                            a2 a2Var8 = a2.GENERAL;
                            aVar9.getClass();
                            i2.a.g(a2Var8, r16, e);
                            Query = r17;
                            r110 = r15;
                        }
                    } catch (IllegalArgumentException e15) {
                        e = e15;
                        r18 = linkedHashMap2;
                        r19 = str2;
                        r24 = closeable;
                    } catch (Exception e16) {
                        e = e16;
                        r15 = linkedHashMap2;
                        r16 = str2;
                        r17 = closeable;
                    }
                    Unit unit = Unit.INSTANCE;
                    Query.close();
                    listN0 = p13.h0.N0(p13.h0.d1(r110.values()), new jw.x());
                } catch (Throwable th6) {
                    th = th6;
                    th3 = th;
                    r14 = Query;
                    throw th3;
                }
            } catch (Throwable th7) {
                th = th7;
                Query = closeable;
                th3 = th;
                r14 = Query;
                throw th3;
            }
        }
        List list = listN0;
        return list.isEmpty() ? new v2.a(new Exception("Empty Phone Contacts"), null, null, 6, null) : new v2.b(list, 200, null, null, 12, null);
    }
}
