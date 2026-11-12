package com.tekartik.sqflite;

import android.util.Log;
import com.tekartik.sqflite.dev.Debug;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class SqlCommand {
    private final String a;
    private final List<Object> b;

    public SqlCommand(String str, List<Object> list) {
        this.a = str;
        this.b = list == null ? new ArrayList<>() : list;
    }

    private static Map<String, Object> a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            map2.put(e(entry.getKey()), value instanceof Map ? a((Map) value) : e(value));
        }
        return map2;
    }

    private String[] b(List<Object> list) {
        return (String[]) d(list).toArray(new String[0]);
    }

    private Object[] c(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(f(it2.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private List<String> d(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(e(it2.next()));
            }
        }
        return arrayList;
    }

    private static String e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? a((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b));
        }
        return arrayList.toString();
    }

    private static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Debug.EXTRA_LOGV) {
            Log.d(Constant.TAG, "arg " + obj.getClass().getCanonicalName() + " " + e(obj));
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i = 0; i < list.size(); i++) {
                bArr[i] = (byte) ((Integer) list.get(i)).intValue();
            }
            obj = bArr;
        }
        if (Debug.EXTRA_LOGV) {
            Log.d(Constant.TAG, "arg " + obj.getClass().getCanonicalName() + " " + e(obj));
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SqlCommand)) {
            return false;
        }
        SqlCommand sqlCommand = (SqlCommand) obj;
        String str = this.a;
        if (str != null) {
            if (!str.equals(sqlCommand.a)) {
                return false;
            }
        } else if (sqlCommand.a != null) {
            return false;
        }
        if (this.b.size() != sqlCommand.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if ((this.b.get(i) instanceof byte[]) && (sqlCommand.b.get(i) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.b.get(i), (byte[]) sqlCommand.b.get(i))) {
                    return false;
                }
            } else if (!this.b.get(i).equals(sqlCommand.b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String[] getQuerySqlArguments() {
        return b(this.b);
    }

    public List<Object> getRawSqlArguments() {
        return this.b;
    }

    public String getSql() {
        return this.a;
    }

    public Object[] getSqlArguments() {
        return c(this.b);
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public SqlCommand sanitizeForQuery() {
        if (this.b.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = this.a.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = this.a.charAt(i3);
            if (cCharAt != '?') {
                sb.append(cCharAt);
            } else {
                int i4 = i3 + 1;
                if (i4 < length && Character.isDigit(this.a.charAt(i4))) {
                    return this;
                }
                i++;
                if (i2 >= this.b.size()) {
                    return this;
                }
                int i5 = i2 + 1;
                Object obj = this.b.get(i2);
                if ((obj instanceof Integer) || (obj instanceof Long)) {
                    sb.append(obj.toString());
                    i2 = i5;
                } else {
                    arrayList.add(obj);
                    i2 = i5;
                    sb.append(cCharAt);
                }
            }
        }
        return i != this.b.size() ? this : new SqlCommand(sb.toString(), arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        List<Object> list = this.b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + d(this.b);
        }
        sb.append(str);
        return sb.toString();
    }
}
