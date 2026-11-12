package yi2;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.provider.CalendarContract;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class j extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f197418c = {"_id", "organizer", "title", "eventLocation", "description", "allDay", "begin", TtmlNode.END, "calendar_id"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f197419d = {"attendeeName", "attendeeStatus"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f197420b;

    public j(Context context) {
        super(context.getContentResolver());
        this.f197420b = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:73:0x013c  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f  */
    /* JADX WARN: Code duplicated, block: B:79:0x016e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0189 A[SYNTHETIC] */
    public final ArrayList d(Cursor cursor, int i14, int i15) throws Throwable {
        Long lC;
        Long lC2;
        long jLongValue;
        long jLongValue2;
        Long l14;
        Cursor cursorQuery;
        Integer numValueOf;
        n.a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; cursor.moveToNext() && i16 < i14; i16++) {
            i.a aVar2 = new i.a();
            aVar2.f197409b = o.b(cursor, "organizer");
            aVar2.f197408a = o.b(cursor, "title");
            aVar2.f197411d = o.b(cursor, "eventLocation");
            aVar2.f197410c = o.b(cursor, "description");
            aVar2.f197415h = o.c(cursor, "_id");
            aVar2.f197416i = o.c(cursor, "calendar_id");
            Cursor cursor2 = null;
            Integer numValueOf2 = null;
            cursor2 = null;
            if (i15 >= 0 && (l14 = aVar2.f197415h) != null) {
                long jLongValue3 = l14.longValue();
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        cursorQuery = this.f197434a.query(CalendarContract.Attendees.CONTENT_URI, f197419d, "event_id = ?", new String[]{String.valueOf(jLongValue3)}, null);
                        int length = 0;
                        while (cursorQuery != null) {
                            try {
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    n.b bVar = new n.b();
                                    String strB = o.b(cursorQuery, "attendeeName");
                                    bVar.f197432a = strB;
                                    length += strB.getBytes(StandardCharsets.UTF_8).length;
                                    try {
                                        numValueOf = Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("attendeeStatus")));
                                    } catch (IllegalArgumentException unused) {
                                        numValueOf = null;
                                    }
                                    if (numValueOf != null) {
                                        int iIntValue = numValueOf.intValue();
                                        if (iIntValue == 1) {
                                            aVar = n.a.ACCEPTED;
                                        } else if (iIntValue != 2) {
                                            aVar = iIntValue != 4 ? n.a.PENDING : n.a.TENTATIVE;
                                        } else {
                                            aVar = n.a.DECLINED;
                                        }
                                        bVar.f197433b = aVar;
                                        length += Integer.toString(numValueOf.intValue()).getBytes().length;
                                    }
                                    if (i15 != 0 && length > i15) {
                                        break;
                                    }
                                    arrayList2.add(new n(bVar.f197432a, bVar.f197433b));
                                } catch (SQLException e4) {
                                    e = e4;
                                    e.printStackTrace();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursorQuery;
                                o.a(cursor2);
                                throw th;
                            }
                        }
                    } catch (SQLException e14) {
                        e = e14;
                        cursorQuery = null;
                        e.printStackTrace();
                        o.a(cursorQuery);
                        aVar2.f197417j = arrayList2;
                        numValueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("allDay")));
                        if (numValueOf2 != null) {
                            aVar2.f197414g = Boolean.valueOf(numValueOf2.intValue() > 0);
                        }
                        lC = o.c(cursor, "begin");
                        if (lC != null) {
                            jLongValue2 = lC.longValue() / 1000;
                            if (Boolean.TRUE.equals(aVar2.f197414g)) {
                                jLongValue2 -= (long) (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000);
                            }
                            aVar2.f197412e = Long.valueOf(jLongValue2);
                        }
                        lC2 = o.c(cursor, TtmlNode.END);
                        if (lC2 != null) {
                            jLongValue = lC2.longValue() / 1000;
                            if (Boolean.TRUE.equals(aVar2.f197414g)) {
                                jLongValue -= (long) (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000);
                            }
                            aVar2.f197413f = Long.valueOf(jLongValue);
                        }
                        arrayList.add(new i(aVar2.f197408a, aVar2.f197409b, aVar2.f197410c, aVar2.f197411d, aVar2.f197412e, aVar2.f197413f, aVar2.f197414g, aVar2.f197415h, aVar2.f197416i, aVar2.f197417j));
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (SQLException e15) {
                    e = e15;
                } catch (Throwable th5) {
                    th = th5;
                }
                o.a(cursorQuery);
                aVar2.f197417j = arrayList2;
            }
            try {
                numValueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("allDay")));
            } catch (IllegalArgumentException unused2) {
            }
            if (numValueOf2 != null) {
                aVar2.f197414g = Boolean.valueOf(numValueOf2.intValue() > 0);
            }
            lC = o.c(cursor, "begin");
            if (lC != null) {
                jLongValue2 = lC.longValue() / 1000;
                if (Boolean.TRUE.equals(aVar2.f197414g)) {
                    jLongValue2 -= (long) (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000);
                }
                aVar2.f197412e = Long.valueOf(jLongValue2);
            }
            lC2 = o.c(cursor, TtmlNode.END);
            if (lC2 != null) {
                jLongValue = lC2.longValue() / 1000;
                if (Boolean.TRUE.equals(aVar2.f197414g)) {
                    jLongValue -= (long) (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000);
                }
                aVar2.f197413f = Long.valueOf(jLongValue);
            }
            arrayList.add(new i(aVar2.f197408a, aVar2.f197409b, aVar2.f197410c, aVar2.f197411d, aVar2.f197412e, aVar2.f197413f, aVar2.f197414g, aVar2.f197415h, aVar2.f197416i, aVar2.f197417j));
        }
        arrayList.trimToSize();
        Collections.sort(arrayList);
        return arrayList;
    }

    public final p e(int i14, int i15, long j8, long j14) {
        if (j14 < j8) {
            return new p("INVALID_DATE_RANGE");
        }
        if (a7.b.checkSelfPermission(this.f197420b, "android.permission.READ_CALENDAR") != 0) {
            return new p("PERMISSION_DENIED_READ_CALENDAR");
        }
        byte b14 = (byte) 0;
        synchronized (b14) {
            try {
                try {
                    Cursor cursorQuery = CalendarContract.Instances.query(this.f197434a, f197418c, j8, j14);
                    if (cursorQuery != null) {
                        p pVar = new p(d(cursorQuery, i14, i15));
                        o.a(cursorQuery);
                        return pVar;
                    }
                    p pVar2 = new p("DATABASE_CURSOR_NULL");
                    o.a(cursorQuery);
                    return pVar2;
                } catch (SecurityException e4) {
                    String message = e4.getMessage();
                    Objects.requireNonNull(message);
                    p pVar3 = new p("SECURITY_EXCEPTION", message);
                    o.a(null);
                    return pVar3;
                } catch (RuntimeException e14) {
                    String message2 = e14.getMessage();
                    Objects.requireNonNull(message2);
                    p pVar4 = new p("SQL_EXCEPTION", message2);
                    o.a(null);
                    return pVar4;
                }
            } catch (Throwable th3) {
                o.a(null);
                throw th3;
            }
        }
    }
}
