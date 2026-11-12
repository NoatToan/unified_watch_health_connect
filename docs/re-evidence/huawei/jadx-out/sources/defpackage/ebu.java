package defpackage;

import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ebu extends ebl {
    private static final long serialVersionUID = 6242432055193497137L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<c> f32696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f32697c;
    private String d;
    private String e;

    public String d() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public e e() {
        return this.f32697c;
    }

    public void d(e eVar) {
        this.f32697c = eVar;
    }

    public String c() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public void b(List<c> list) {
        this.f32696b = list;
    }

    public static class e implements Serializable {
        private static final long serialVersionUID = -563906258663973150L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32702c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private Integer i;
        private String j;
        private String l;

        public String e() {
            return this.f;
        }

        public void f(String str) {
            this.f = str;
        }

        public void g(String str) {
            this.g = str;
        }

        public String d() {
            return this.d;
        }

        public void d(String str) {
            this.d = str;
        }

        public String b() {
            return this.j;
        }

        public void i(String str) {
            this.j = str;
        }

        public String a() {
            return this.h;
        }

        public void j(String str) {
            this.h = str;
        }

        public void a(String str) {
            this.f32700a = str;
        }

        public String c() {
            return this.f32701b;
        }

        public void c(String str) {
            this.f32701b = str;
        }

        public void e(String str) {
            this.e = str;
        }

        public void b(String str) {
            this.f32702c = str;
        }

        public void h(String str) {
            this.l = str;
        }

        public void d(Integer num) {
            this.i = num;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("DevInfo{sn =");
            String str = this.f;
            Object obj = Constants.NULL;
            stringBuffer.append(str == null ? Constants.NULL : dyg.b(str)).append("'model =");
            String str2 = this.g;
            if (str2 == null) {
                str2 = Constants.NULL;
            }
            stringBuffer.append(str2).append("'devType =");
            String str3 = this.d;
            if (str3 == null) {
                str3 = Constants.NULL;
            }
            stringBuffer.append(str3).append("'prodId =");
            String str4 = this.j;
            stringBuffer.append(str4 == null ? Constants.NULL : dyg.b(str4)).append("'hiv =");
            String str5 = this.f32700a;
            if (str5 == null) {
                str5 = Constants.NULL;
            }
            stringBuffer.append(str5).append("'mac =");
            String str6 = this.f32701b;
            stringBuffer.append(str6 == null ? Constants.NULL : dyg.b(str6)).append("'fwv =");
            String str7 = this.e;
            if (str7 == null) {
                str7 = Constants.NULL;
            }
            stringBuffer.append(str7).append("'hwv =");
            String str8 = this.f32702c;
            if (str8 == null) {
                str8 = Constants.NULL;
            }
            stringBuffer.append(str8).append("'swv =");
            String str9 = this.l;
            if (str9 == null) {
                str9 = Constants.NULL;
            }
            stringBuffer.append(str9).append("'protType =");
            Integer num = this.i;
            if (num != null) {
                obj = num;
            }
            stringBuffer.append(obj).append("'}");
            return stringBuffer.toString();
        }
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 2699365370799290470L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32699b;

        public void d(String str) {
            this.f32698a = str;
        }

        public void c(String str) {
            this.f32699b = str;
        }
    }

    @Override // defpackage.ebl
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CoapDiscoverDeviceEntityModel{errorCode =");
        stringBuffer.append(a());
        StringBuffer stringBufferAppend = stringBuffer.append("devInfo =");
        Object obj = this.f32697c;
        Object obj2 = Constants.NULL;
        if (obj == null) {
            obj = Constants.NULL;
        }
        stringBufferAppend.append(obj).append("'mode =");
        stringBuffer.append(this.f32695a).append("'services =");
        List<c> list = this.f32696b;
        if (list != null) {
            obj2 = list;
        }
        stringBuffer.append(obj2).append("'}");
        return stringBuffer.toString();
    }
}
