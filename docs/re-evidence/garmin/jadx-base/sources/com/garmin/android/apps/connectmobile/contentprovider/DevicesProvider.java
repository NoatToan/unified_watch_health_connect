package com.garmin.android.apps.connectmobile.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.provider.BaseColumns;
import com.garmin.android.apps.connectmobile.l;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import gh2.i;
import im.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import p005kotlin.jvm.internal.s;
import p20.b;
import qd2.a;
import rd2.d;
import rd2.j;
import sd2.e;
import sd2.f;
import zb0.t;

/* JADX INFO: loaded from: classes7.dex */
public class DevicesProvider extends ContentProvider implements BaseColumns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UriMatcher f32752a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f32752a = uriMatcher;
        uriMatcher.addURI("com.garmin.android.apps.connectmobile.contentprovider.devices", "devices/product_nbrs/*", 1);
        uriMatcher.addURI("com.garmin.android.apps.connectmobile.contentprovider.devices", "devices", 2);
        uriMatcher.addURI("com.garmin.android.apps.connectmobile.contentprovider.devices.sdk", "devices/product_nbrs/*", 3);
    }

    public static b a(ArrayList arrayList, boolean z14) {
        String strQ;
        int i14;
        if (arrayList == null) {
            return new b(Collections.EMPTY_LIST);
        }
        d dVarF = ConnectDatabase.g().f();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            for (e eVar : dVarF.a(fVar.getUnitID())) {
                if (fVar.d0() != null && eVar.f158647b.equalsIgnoreCase(fVar.d0())) {
                    strQ = fVar.d0();
                    i14 = 1;
                } else if (fVar.Q() != null && eVar.f158647b.equalsIgnoreCase(fVar.Q())) {
                    strQ = fVar.Q();
                    i14 = 2;
                }
                arrayList2.add(new p20.d(fVar.getUnitID(), strQ, fVar.getPartNumber(), fVar.getProductNumber(), fVar.getSoftwareVersion(), t.d(fVar), fVar.getDisplayName(), fVar.getProductDisplayName(), eVar.f158648c, i14, z14 ? fVar.getGbleLongTermKey() : null, z14 ? fVar.getGbleEdiv() : null, z14 ? fVar.getGbleRand() : null, fVar.getApplicationKey()));
            }
        }
        return new b(arrayList2);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        a.e(getContext());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x004b A[DONT_INVERT, EDGE_INSN: B:14:0x004b->B:61:0x014d BREAK  A[LOOP:0: B:5:0x0035->B:9:0x0042]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb A[Catch: all -> 0x010c, SQLException -> 0x0114, TRY_LEAVE, TryCatch #0 {SQLException -> 0x0114, blocks: (B:35:0x00e5, B:37:0x00eb), top: B:62:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0101 A[Catch: all -> 0x010c, SQLException -> 0x010f, TRY_LEAVE, TryCatch #3 {SQLException -> 0x010f, blocks: (B:38:0x00f4, B:39:0x00fb, B:41:0x0101), top: B:67:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00b4 A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        boolean z14;
        String lastPathSegment;
        String[] strArr3;
        StringBuilder sb3;
        ArrayList arrayList;
        Cursor cursorQuery;
        int iMatch = f32752a.match(uri);
        Cursor cursor = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        cursor = null;
        int i14 = 0;
        if (iMatch == 3) {
            if (iMatch != 1) {
                z14 = true;
            } else {
                if (iMatch != 2) {
                    rd2.f.a().f152045a.getClass();
                    return a(j.d(), true);
                }
                if (iMatch == 3) {
                    break;
                }
                z14 = false;
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                break;
            }
            strArr3 = (String[]) Arrays.stream(lastPathSegment.split(",")).filter(new c(6)).toArray(new p20.c());
            rd2.f.a().f152045a.getClass();
            sb3 = new StringBuilder("product_nbr");
            if (strArr3.length == 1) {
                sb3.append("='");
                sb3.append(strArr3[0]);
                sb3.append("'");
            } else {
                sb3.append(" IN(");
                while (i14 < strArr3.length) {
                    sb3.append("'");
                    sb3.append(strArr3[i14]);
                    sb3.append("'");
                    i14++;
                    if (i14 < strArr3.length) {
                        sb3.append(",");
                    }
                }
                sb3.append(")");
            }
            cursorQuery = rd2.a.b().query("devices", null, sb3.toString(), null, null, null, "is_connected desc, last_connected_timestamp desc");
            if (cursorQuery != null) {
                if (cursorQuery.moveToFirst()) {
                    arrayList = new ArrayList(cursorQuery.getCount());
                    arrayList.add(sd2.d.b(cursorQuery));
                    while (!cursorQuery.isLast()) {
                        cursorQuery.moveToNext();
                        arrayList.add(sd2.d.b(cursorQuery));
                    }
                    arrayList2 = arrayList;
                }
            }
            rd2.a.a(cursorQuery);
            return a(sd2.d.a(arrayList2), z14);
        }
        p20.a aVar = p20.a.f134983a;
        String callingPackage = getCallingPackage();
        aVar.getClass();
        l.g().getClass();
        JSONArray jSONArray = new JSONArray(i.f77458c.a().f77477b.h("content_provider_consuming_apps_whitelist"));
        int length = jSONArray.length();
        for (int i15 = 0; i15 < length; i15++) {
            if (s.g(callingPackage, jSONArray.getString(i15))) {
                if (iMatch != 1) {
                    z14 = true;
                } else {
                    if (iMatch != 2) {
                        rd2.f.a().f152045a.getClass();
                        return a(j.d(), true);
                    }
                    if (iMatch == 3) {
                        break;
                    }
                    z14 = false;
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    break;
                }
                strArr3 = (String[]) Arrays.stream(lastPathSegment.split(",")).filter(new c(6)).toArray(new p20.c());
                rd2.f.a().f152045a.getClass();
                sb3 = new StringBuilder("product_nbr");
                if (strArr3.length == 1) {
                    sb3.append("='");
                    sb3.append(strArr3[0]);
                    sb3.append("'");
                } else {
                    sb3.append(" IN(");
                    while (i14 < strArr3.length) {
                        sb3.append("'");
                        sb3.append(strArr3[i14]);
                        sb3.append("'");
                        i14++;
                        if (i14 < strArr3.length) {
                            sb3.append(",");
                        }
                    }
                    sb3.append(")");
                }
                try {
                    try {
                        cursorQuery = rd2.a.b().query("devices", null, sb3.toString(), null, null, null, "is_connected desc, last_connected_timestamp desc");
                        if (cursorQuery != null) {
                            try {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        arrayList = new ArrayList(cursorQuery.getCount());
                                        try {
                                            arrayList.add(sd2.d.b(cursorQuery));
                                            while (!cursorQuery.isLast()) {
                                                cursorQuery.moveToNext();
                                                arrayList.add(sd2.d.b(cursorQuery));
                                            }
                                            arrayList2 = arrayList;
                                        } catch (SQLException e4) {
                                            e = e4;
                                            cursor = cursorQuery;
                                            j.f152077a.error("findByProductNumbers(" + Arrays.toString(strArr3) + ")", (Throwable) e);
                                            rd2.a.a(cursor);
                                            arrayList2 = arrayList;
                                        }
                                    }
                                } catch (SQLException e14) {
                                    e = e14;
                                    arrayList = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = cursorQuery;
                                rd2.a.a(cursor);
                                throw th;
                            }
                        }
                        rd2.a.a(cursorQuery);
                    } catch (SQLException e15) {
                        e = e15;
                        arrayList = null;
                    }
                    return a(sd2.d.a(arrayList2), z14);
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
