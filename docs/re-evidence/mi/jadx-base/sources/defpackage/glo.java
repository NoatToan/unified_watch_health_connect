package defpackage;

import java.lang.reflect.Modifier;
import kotlin.text.Typography;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public class glo {
    public static glo j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static glo f19117k;
    public static glo l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19118a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19119b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;
    public int i;

    static {
        glo gloVar = new glo();
        j = gloVar;
        gloVar.f19118a = true;
        gloVar.f19119b = false;
        gloVar.c = false;
        gloVar.d = false;
        gloVar.e = true;
        gloVar.f = false;
        gloVar.g = false;
        gloVar.i = 0;
        glo gloVar2 = new glo();
        f19117k = gloVar2;
        gloVar2.f19118a = true;
        gloVar2.f19119b = true;
        gloVar2.c = false;
        gloVar2.d = false;
        gloVar2.e = false;
        j.i = 1;
        glo gloVar3 = new glo();
        l = gloVar3;
        gloVar3.f19118a = false;
        gloVar3.f19119b = true;
        gloVar3.c = false;
        gloVar3.d = true;
        gloVar3.e = false;
        gloVar3.h = false;
        gloVar3.i = 2;
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (this.f19119b) {
            stringBuffer.append("(");
            c(stringBuffer, clsArr);
            stringBuffer.append(")");
        } else if (clsArr.length == 0) {
            stringBuffer.append("()");
        } else {
            stringBuffer.append("(..)");
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i]));
        }
    }

    public String d(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public String e(int i) {
        if (!this.d) {
            return "";
        }
        String string = Modifier.toString(i);
        if (string.length() == 0) {
            return "";
        }
        return string + " ";
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f19118a);
    }

    public String h(Class cls, String str, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z ? i(str).replace(Typography.dollar, '.') : str.replace(Typography.dollar, '.');
        }
        Class<?> componentType = cls.getComponentType();
        return h(componentType, componentType.getName(), z) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public String i(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }
}
