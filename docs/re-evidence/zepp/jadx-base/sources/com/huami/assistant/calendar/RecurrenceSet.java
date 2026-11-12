package com.huami.assistant.calendar;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import android.util.TimeFormatException;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.material.datepicker.UtcDates;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class RecurrenceSet {
    private static final String a = "RecurrenceSet";
    private static final String b = "\n";
    private static final String c = "\n ";
    private static final Pattern d = Pattern.compile("(?:\\r\\n?|\\n)[ \t]");
    private static final Pattern e = Pattern.compile(".{75}");
    public EventRecurrence[] rrules = null;
    public long[] rdates = null;
    public EventRecurrence[] exrules = null;
    public long[] exdates = null;

    public RecurrenceSet(ContentValues values) throws EventRecurrence.InvalidFormatException {
        e(values.getAsString("rrule"), values.getAsString("rdate"), values.getAsString("exrule"), values.getAsString("exdate"));
    }

    private static String a(Time start, ICalendar.Component component) {
        ICalendar.Property firstProperty = component.getFirstProperty(ICalendar.Property.DURATION);
        if (firstProperty != null) {
            return firstProperty.getValue();
        }
        ICalendar.Property firstProperty2 = component.getFirstProperty(ICalendar.Property.DTEND);
        if (firstProperty2 == null) {
            return "+P0S";
        }
        ICalendar.Parameter firstParameter = firstProperty2.getFirstParameter("TZID");
        Time time = new Time(firstParameter == null ? start.timezone : firstParameter.value);
        time.parse(firstProperty2.getValue());
        long millis = (time.toMillis(false) - start.toMillis(false)) / 1000;
        if (start.allDay && millis % 86400 == 0) {
            return "P" + (millis / 86400) + LogUtil.D;
        }
        return "P" + millis + ExifInterface.LATITUDE_SOUTH;
    }

    public static void addPropertiesForRuleStr(ICalendar.Component component, String propertyName, String ruleStr) {
        if (TextUtils.isEmpty(ruleStr)) {
            return;
        }
        for (String str : d(ruleStr)) {
            ICalendar.Property property = new ICalendar.Property(propertyName);
            property.setValue(str);
            component.addProperty(property);
        }
    }

    public static void addPropertyForDateStr(ICalendar.Component component, String propertyName, String dateStr) {
        if (TextUtils.isEmpty(dateStr)) {
            return;
        }
        ICalendar.Property property = new ICalendar.Property(propertyName);
        String strSubstring = null;
        int iIndexOf = dateStr.indexOf(";");
        if (iIndexOf != -1) {
            strSubstring = dateStr.substring(0, iIndexOf);
            dateStr = dateStr.substring(iIndexOf + 1);
        }
        if (!TextUtils.isEmpty(strSubstring)) {
            property.addParameter(new ICalendar.Parameter("TZID", strSubstring));
        }
        property.setValue(dateStr);
        component.addProperty(property);
    }

    private static String b(ICalendar.Property recurrence) {
        if (recurrence == null) {
            return null;
        }
        ICalendar.Parameter firstParameter = recurrence.getFirstParameter("TZID");
        if (firstParameter == null) {
            return recurrence.getValue();
        }
        return firstParameter.value + ";" + recurrence.getValue();
    }

    private static String c(ICalendar.Component component, String name) {
        List<ICalendar.Property> properties = component.getProperties(name);
        if (properties == null || properties.isEmpty()) {
            return null;
        }
        boolean z = true;
        if (properties.size() == 1) {
            return properties.get(0).getValue();
        }
        StringBuilder sb = new StringBuilder();
        for (ICalendar.Property property : component.getProperties(name)) {
            if (z) {
                z = false;
            } else {
                sb.append("\n");
            }
            sb.append(property.getValue());
        }
        return sb.toString();
    }

    private static String[] d(String ruleStr) {
        if (ruleStr == null) {
            return new String[0];
        }
        String[] strArrSplit = unfold(ruleStr).split("\n");
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            strArrSplit[i] = fold(strArrSplit[i]);
        }
        return strArrSplit;
    }

    private void e(String rruleStr, String rdateStr, String exruleStr, String exdateStr) throws EventRecurrence.InvalidFormatException {
        if (TextUtils.isEmpty(rruleStr) && TextUtils.isEmpty(rdateStr)) {
            return;
        }
        if (!TextUtils.isEmpty(rruleStr)) {
            String[] strArrSplit = rruleStr.split("\n");
            this.rrules = new EventRecurrence[strArrSplit.length];
            for (int i = 0; i < strArrSplit.length; i++) {
                EventRecurrence eventRecurrence = new EventRecurrence();
                eventRecurrence.parse(strArrSplit[i]);
                this.rrules[i] = eventRecurrence;
            }
        }
        if (!TextUtils.isEmpty(rdateStr)) {
            this.rdates = parseRecurrenceDates(rdateStr);
        }
        if (!TextUtils.isEmpty(exruleStr)) {
            String[] strArrSplit2 = exruleStr.split("\n");
            this.exrules = new EventRecurrence[strArrSplit2.length];
            for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                EventRecurrence eventRecurrence2 = new EventRecurrence();
                eventRecurrence2.parse(exruleStr);
                this.exrules[i2] = eventRecurrence2;
            }
        }
        if (TextUtils.isEmpty(exdateStr)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit3 = exdateStr.split("\n");
        for (String str : strArrSplit3) {
            for (long j : parseRecurrenceDates(str)) {
                arrayList.add(Long.valueOf(j));
            }
        }
        this.exdates = new long[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.exdates[i3] = ((Long) arrayList.get(i3)).longValue();
        }
    }

    public static String fold(String unfoldedIcalContent) {
        return e.matcher(unfoldedIcalContent).replaceAll("$0\r\n ");
    }

    public static long[] parseRecurrenceDates(String recurrence) throws EventRecurrence.InvalidFormatException {
        String strSubstring;
        int iIndexOf = recurrence.indexOf(";");
        if (iIndexOf != -1) {
            strSubstring = recurrence.substring(0, iIndexOf);
            recurrence = recurrence.substring(iIndexOf + 1);
        } else {
            strSubstring = UtcDates.UTC;
        }
        Time time = new Time(strSubstring);
        String[] strArrSplit = recurrence.split(",");
        int length = strArrSplit.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                time.parse(strArrSplit[i]);
                jArr[i] = time.toMillis(false);
                time.timezone = strSubstring;
            } catch (TimeFormatException unused) {
                throw new EventRecurrence.InvalidFormatException("TimeFormatException thrown when parsing time " + strArrSplit[i] + " in recurrence " + recurrence);
            }
        }
        return jArr;
    }

    public static boolean populateComponent(Cursor cursor, ICalendar.Component component) {
        Time time;
        int columnIndex = cursor.getColumnIndex("dtstart");
        int columnIndex2 = cursor.getColumnIndex("duration");
        int columnIndex3 = cursor.getColumnIndex("eventTimezone");
        int columnIndex4 = cursor.getColumnIndex("rrule");
        int columnIndex5 = cursor.getColumnIndex("rdate");
        int columnIndex6 = cursor.getColumnIndex("exrule");
        int columnIndex7 = cursor.getColumnIndex("exdate");
        int columnIndex8 = cursor.getColumnIndex("allDay");
        long j = !cursor.isNull(columnIndex) ? cursor.getLong(columnIndex) : -1L;
        String string = cursor.getString(columnIndex2);
        String string2 = cursor.getString(columnIndex3);
        String string3 = cursor.getString(columnIndex4);
        String string4 = cursor.getString(columnIndex5);
        String string5 = cursor.getString(columnIndex6);
        String string6 = cursor.getString(columnIndex7);
        boolean z = cursor.getInt(columnIndex8) == 1;
        if (j == -1 || TextUtils.isEmpty(string) || (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4))) {
            return false;
        }
        ICalendar.Property property = new ICalendar.Property(ICalendar.Property.DTSTART);
        if (TextUtils.isEmpty(string2)) {
            time = new Time(UtcDates.UTC);
        } else {
            if (!z) {
                property.addParameter(new ICalendar.Parameter("TZID", string2));
            }
            time = new Time(string2);
        }
        time.set(j);
        if (z) {
            property.addParameter(new ICalendar.Parameter("VALUE", "DATE"));
            time.allDay = true;
            time.hour = 0;
            time.minute = 0;
            time.second = 0;
        }
        property.setValue(time.format2445());
        component.addProperty(property);
        ICalendar.Property property2 = new ICalendar.Property(ICalendar.Property.DURATION);
        property2.setValue(string);
        component.addProperty(property2);
        addPropertiesForRuleStr(component, ICalendar.Property.RRULE, string3);
        addPropertyForDateStr(component, ICalendar.Property.RDATE, string4);
        addPropertiesForRuleStr(component, ICalendar.Property.EXRULE, string5);
        addPropertyForDateStr(component, ICalendar.Property.EXDATE, string6);
        return true;
    }

    public static boolean populateContentValues(ICalendar.Component component, ContentValues values) {
        try {
            ICalendar.Property firstProperty = component.getFirstProperty(ICalendar.Property.DTSTART);
            String value = firstProperty.getValue();
            ICalendar.Parameter firstParameter = firstProperty.getFirstParameter("TZID");
            String str = firstParameter == null ? null : firstParameter.value;
            Time time = new Time(firstParameter == null ? UtcDates.UTC : str);
            boolean z = time.parse(value);
            boolean z2 = time.allDay;
            if (z || z2) {
                str = UtcDates.UTC;
            }
            String strA = a(time, component);
            String strC = c(component, ICalendar.Property.RRULE);
            String strB = b(component.getFirstProperty(ICalendar.Property.RDATE));
            String strC2 = c(component, ICalendar.Property.EXRULE);
            String strB2 = b(component.getFirstProperty(ICalendar.Property.EXDATE));
            if (!TextUtils.isEmpty(value) && !TextUtils.isEmpty(strA) && (!TextUtils.isEmpty(strC) || !TextUtils.isEmpty(strB))) {
                if (z2) {
                    time.timezone = UtcDates.UTC;
                }
                long millis = time.toMillis(false);
                values.put("dtstart", Long.valueOf(millis));
                if (millis == -1) {
                    return false;
                }
                values.put("rrule", strC);
                values.put("rdate", strB);
                values.put("exrule", strC2);
                values.put("exdate", strB2);
                values.put("eventTimezone", str);
                values.put("duration", strA);
                values.put("allDay", Integer.valueOf(z2 ? 1 : 0));
                return true;
            }
            return false;
        } catch (TimeFormatException unused) {
            Log.i(a, "Failed to parse event: " + component.toString());
            return false;
        }
    }

    public static String unfold(String foldedIcalContent) {
        return d.matcher(foldedIcalContent).replaceAll("");
    }

    public boolean hasRecurrence() {
        return (this.rrules == null && this.rdates == null) ? false : true;
    }

    public RecurrenceSet(Cursor cursor) throws EventRecurrence.InvalidFormatException {
        e(cursor.getString(cursor.getColumnIndex("rrule")), cursor.getString(cursor.getColumnIndex("rdate")), cursor.getString(cursor.getColumnIndex("exrule")), cursor.getString(cursor.getColumnIndex("exdate")));
    }

    public RecurrenceSet(String rruleStr, String rdateStr, String exruleStr, String exdateStr) throws EventRecurrence.InvalidFormatException {
        e(rruleStr, rdateStr, exruleStr, exdateStr);
    }

    public static boolean populateComponent(ContentValues values, ICalendar.Component component) {
        Time time;
        long jLongValue = values.containsKey("dtstart") ? values.getAsLong("dtstart").longValue() : -1L;
        String asString = values.getAsString("duration");
        String asString2 = values.getAsString("eventTimezone");
        String asString3 = values.getAsString("rrule");
        String asString4 = values.getAsString("rdate");
        String asString5 = values.getAsString("exrule");
        String asString6 = values.getAsString("exdate");
        Integer asInteger = values.getAsInteger("allDay");
        boolean z = asInteger != null && asInteger.intValue() == 1;
        if (jLongValue == -1 || TextUtils.isEmpty(asString) || (TextUtils.isEmpty(asString3) && TextUtils.isEmpty(asString4))) {
            return false;
        }
        ICalendar.Property property = new ICalendar.Property(ICalendar.Property.DTSTART);
        if (!TextUtils.isEmpty(asString2)) {
            if (!z) {
                property.addParameter(new ICalendar.Parameter("TZID", asString2));
            }
            time = new Time(asString2);
        } else {
            time = new Time(UtcDates.UTC);
        }
        time.set(jLongValue);
        if (z) {
            property.addParameter(new ICalendar.Parameter("VALUE", "DATE"));
            time.allDay = true;
            time.hour = 0;
            time.minute = 0;
            time.second = 0;
        }
        property.setValue(time.format2445());
        component.addProperty(property);
        ICalendar.Property property2 = new ICalendar.Property(ICalendar.Property.DURATION);
        property2.setValue(asString);
        component.addProperty(property2);
        addPropertiesForRuleStr(component, ICalendar.Property.RRULE, asString3);
        addPropertyForDateStr(component, ICalendar.Property.RDATE, asString4);
        addPropertiesForRuleStr(component, ICalendar.Property.EXRULE, asString5);
        addPropertyForDateStr(component, ICalendar.Property.EXDATE, asString6);
        return true;
    }
}
