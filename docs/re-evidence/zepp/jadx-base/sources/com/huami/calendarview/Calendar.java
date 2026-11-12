package com.huami.calendarview;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Calendar implements Serializable, Comparable<Calendar> {
    private static final long serialVersionUID = 141315161718191143L;
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;
    private List<Scheme> n;
    private boolean o;
    private int p;
    private Calendar q;

    public static final class Scheme implements Serializable {
        private int a;
        private int b;
        private String c;
        private String d;
        private Object e;

        public Scheme() {
        }

        public Object getObj() {
            return this.e;
        }

        public String getOther() {
            return this.d;
        }

        public String getScheme() {
            return this.c;
        }

        public int getShcemeColor() {
            return this.b;
        }

        public int getType() {
            return this.a;
        }

        public void setObj(Object obj) {
            this.e = obj;
        }

        public void setOther(String str) {
            this.d = str;
        }

        public void setScheme(String str) {
            this.c = str;
        }

        public void setShcemeColor(int i) {
            this.b = i;
        }

        public void setType(int i) {
            this.a = i;
        }

        public Scheme(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }

        public Scheme(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public Scheme(int i, String str) {
            this.b = i;
            this.c = str;
        }

        public Scheme(int i, String str, String str2) {
            this.b = i;
            this.c = str;
            this.d = str2;
        }
    }

    public final void a() {
        setScheme("");
        setSchemeColor(0);
        setSchemes(null);
    }

    public void addScheme(Scheme scheme) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(scheme);
    }

    public final void b(Calendar calendar, String str) {
        if (calendar == null) {
            return;
        }
        if (!TextUtils.isEmpty(calendar.getScheme())) {
            str = calendar.getScheme();
        }
        setScheme(str);
        setSchemeColor(calendar.getSchemeColor());
        setSchemes(calendar.getSchemes());
    }

    public final int differ(Calendar calendar) {
        return b.b(this, calendar);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Calendar)) {
            Calendar calendar = (Calendar) obj;
            if (calendar.getYear() == this.a && calendar.getMonth() == this.b && calendar.getDay() == this.d) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public int getDay() {
        return this.d;
    }

    public String getGregorianFestival() {
        return this.j;
    }

    public int getLeapMonth() {
        return this.c;
    }

    public String getLunar() {
        return this.h;
    }

    public Calendar getLunarCalendar() {
        return this.q;
    }

    public int getMonth() {
        return this.b;
    }

    public String getScheme() {
        return this.l;
    }

    public int getSchemeColor() {
        return this.m;
    }

    public List<Scheme> getSchemes() {
        return this.n;
    }

    public String getSolarTerm() {
        return this.i;
    }

    public long getTimeInMillis() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1, this.a);
        calendar.set(2, this.b - 1);
        calendar.set(5, this.d);
        return calendar.getTimeInMillis();
    }

    public String getTraditionFestival() {
        return this.k;
    }

    public int getWeek() {
        return this.p;
    }

    public int getYear() {
        return this.a;
    }

    public boolean hasScheme() {
        List<Scheme> list = this.n;
        return ((list == null || list.size() == 0) && TextUtils.isEmpty(this.l)) ? false : true;
    }

    public boolean isAvailable() {
        int i = this.a;
        boolean z = i > 0;
        int i2 = this.b;
        boolean z2 = z & (i2 > 0);
        int i3 = this.d;
        return z2 & (i3 > 0) & (i3 <= 31) & (i2 <= 12) & (i >= 1900) & (i <= 2099);
    }

    public boolean isCurrentDay() {
        return this.g;
    }

    public boolean isCurrentMonth() {
        return this.f;
    }

    public boolean isLeapYear() {
        return this.e;
    }

    public boolean isSameMonth(Calendar calendar) {
        return this.a == calendar.getYear() && this.b == calendar.getMonth();
    }

    public boolean isWeekend() {
        return this.o;
    }

    public void setCurrentDay(boolean z) {
        this.g = z;
    }

    public void setCurrentMonth(boolean z) {
        this.f = z;
    }

    public void setDay(int i) {
        this.d = i;
    }

    public void setGregorianFestival(String str) {
        this.j = str;
    }

    public void setLeapMonth(int i) {
        this.c = i;
    }

    public void setLeapYear(boolean z) {
        this.e = z;
    }

    public void setLunar(String str) {
        this.h = str;
    }

    public void setLunarCalendar(Calendar calendar) {
        this.q = calendar;
    }

    public void setMonth(int i) {
        this.b = i;
    }

    public void setScheme(String str) {
        this.l = str;
    }

    public void setSchemeColor(int i) {
        this.m = i;
    }

    public void setSchemes(List<Scheme> list) {
        this.n = list;
    }

    public void setSolarTerm(String str) {
        this.i = str;
    }

    public void setTraditionFestival(String str) {
        this.k = str;
    }

    public void setWeek(int i) {
        this.p = i;
    }

    public void setWeekend(boolean z) {
        this.o = z;
    }

    public void setYear(int i) {
        this.a = i;
    }

    public String toString() {
        Object objValueOf;
        Object objValueOf2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("");
        int i = this.b;
        if (i < 10) {
            objValueOf = "0" + this.b;
        } else {
            objValueOf = Integer.valueOf(i);
        }
        sb.append(objValueOf);
        sb.append("");
        int i2 = this.d;
        if (i2 < 10) {
            objValueOf2 = "0" + this.d;
        } else {
            objValueOf2 = Integer.valueOf(i2);
        }
        sb.append(objValueOf2);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Calendar calendar) {
        if (calendar == null) {
            return 1;
        }
        return toString().compareTo(calendar.toString());
    }

    public void addScheme(int i, String str) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(new Scheme(i, str));
    }

    public void addScheme(int i, int i2, String str) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(new Scheme(i, i2, str));
    }

    public void addScheme(int i, int i2, String str, String str2) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(new Scheme(i, i2, str, str2));
    }

    public void addScheme(int i, String str, String str2) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(new Scheme(i, str, str2));
    }
}
