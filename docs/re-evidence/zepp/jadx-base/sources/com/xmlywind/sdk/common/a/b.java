package com.xmlywind.sdk.common.a;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class b {
    private static Map<String, String> a;

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: com.xmlywind.sdk.common.a.b$a$a, reason: collision with other inner class name */
        public static class C1070a {
            private String a = null;
            private Map<String, String> b = null;
            private Map<String, String> c = null;
            private boolean d;

            public C1070a a(String str) {
                this.a = str;
                return this;
            }

            public C1070a a(String str, String str2) {
                if (this.b == null) {
                    this.b = new HashMap();
                }
                this.b.put(str, str2);
                return this;
            }

            public C1070a a(Map<String, String> map) {
                this.c = map;
                return this;
            }

            public a a() {
                StringBuilder sb = new StringBuilder("create table if not exists ");
                sb.append(this.a);
                sb.append(" ( ");
                List listB = b.b(this.b);
                if (listB.size() > 1) {
                    Iterator it2 = b.b(this.c).iterator();
                    while (it2.hasNext()) {
                        sb.append((String) it2.next());
                        sb.append(" ,");
                    }
                    sb.append(" primary key ( ");
                    Iterator<String> it3 = this.b.keySet().iterator();
                    while (it3.hasNext()) {
                        sb.append(it3.next());
                        if (it3.hasNext()) {
                            sb.append(" ,");
                        } else {
                            sb.append(" )");
                        }
                    }
                } else {
                    sb.append(this.d ? String.format("id integer primary key AUTOINCREMENT", new Object[0]) : String.format("%s primary key ", listB.get(0)));
                    this.c.remove(this.b.keySet().iterator().next());
                    for (String str : b.b(this.c)) {
                        sb.append(" ,");
                        sb.append(str);
                        sb.append(" ");
                    }
                }
                sb.append(" ); ");
                a aVar = new a();
                aVar.b = sb.toString();
                aVar.a = this.a;
                return aVar;
            }
        }
    }

    /* JADX INFO: renamed from: com.xmlywind.sdk.common.a.b$b, reason: collision with other inner class name */
    public static class C1071b {
        public String a;
        public String b;
        public Map<String, Object> c;
        public List<Object> d;

        /* JADX INFO: renamed from: com.xmlywind.sdk.common.a.b$b$a */
        public static class a {
            private String a = null;
            private Map<String, Object> b = null;

            public C1071b a() {
                List<Object> listAsList = Arrays.asList(this.b.keySet().toArray());
                StringBuilder sb = new StringBuilder("insert or replace into ");
                sb.append(this.a);
                StringBuilder sb2 = new StringBuilder("(");
                StringBuilder sb3 = new StringBuilder("(");
                int i = 0;
                while (i < listAsList.size()) {
                    sb2.append(listAsList.get(i));
                    sb3.append("?");
                    i++;
                    if (i < listAsList.size()) {
                        sb2.append(", ");
                        sb3.append(", ");
                    }
                }
                sb2.append(")");
                sb3.append(")");
                sb.append((CharSequence) sb2);
                sb.append(" values ");
                sb.append((CharSequence) sb3);
                C1071b c1071b = new C1071b();
                c1071b.a = this.a;
                c1071b.d = listAsList;
                c1071b.c = this.b;
                c1071b.b = sb.toString();
                return c1071b;
            }

            public void a(String str) {
                this.a = str;
            }

            public void a(Map<String, Object> map) {
                this.b = map;
            }
        }
    }

    public static class c {
        public String a;
        public String b;
        public Map<String, Object> c;
        public String d;

        public static class a {
            private String a = null;
            private Map<String, Object> b = null;
            private String c = null;

            public c a() {
                StringBuilder sb = new StringBuilder("update ");
                sb.append(this.a);
                sb.append(" set ");
                Iterator<String> it2 = this.b.keySet().iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    sb.append(next + " = " + this.b.get(next));
                    if (it2.hasNext()) {
                        sb.append(", ");
                    }
                }
                if (!TextUtils.isEmpty(this.c)) {
                    sb.append(" " + this.c);
                }
                c cVar = new c();
                cVar.a = this.a;
                cVar.c = this.b;
                cVar.d = this.c;
                cVar.b = sb.toString();
                return cVar;
            }

            public void a(String str) {
                this.a = str;
            }

            public void a(Map<String, Object> map) {
                this.b = map;
            }

            public void b(String str) {
                this.c = str;
            }
        }

        public String a() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> b(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            String lowerCase = map.get(str).toLowerCase();
            lowerCase.hashCode();
            String str2 = "text";
            switch (lowerCase) {
                case "int":
                case "long":
                    str2 = TypedValues.Custom.S_INT;
                    break;
                case "text":
                case "java.lang.string":
                    break;
                default:
                    str2 = "blob";
                    break;
            }
            arrayList.add(String.format("%s %s ", str, str2));
        }
        return arrayList;
    }
}
