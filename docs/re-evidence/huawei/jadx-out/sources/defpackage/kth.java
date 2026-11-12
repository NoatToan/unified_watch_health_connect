package defpackage;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes10.dex */
public class kth {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ContentValues f39419a;

    public boolean e(int i) {
        return i == -1 || i == -2;
    }

    public kth(ContentValues contentValues) {
        this.f39419a = contentValues;
    }

    public boolean i() {
        return this.f39419a.getAsBoolean("needCheckAppAuth").booleanValue();
    }

    public String j() {
        return this.f39419a.getAsString("packageName");
    }

    public String b() {
        return this.f39419a.getAsString("dataFilter");
    }

    public boolean f() {
        return a("withoutDefaultZero");
    }

    public String g() {
        return this.f39419a.getAsString("metadataFilter");
    }

    public String d() {
        return this.f39419a.getAsString("deleteDeviceUuid");
    }

    public int a() {
        return e("deleteType");
    }

    public int c() {
        return e("deleteLevel");
    }

    public int e() {
        return e("deleteInterval");
    }

    public int h() {
        return e("sequenceDataType");
    }

    public boolean k() {
        return a("lastDayDetail");
    }

    public boolean o() {
        return a("isGroupByTime");
    }

    private int e(String str) {
        if (!this.f39419a.containsKey(str)) {
            return -1;
        }
        if (this.f39419a.getAsInteger(str) == null) {
            return -2;
        }
        return this.f39419a.getAsInteger(str).intValue();
    }

    private boolean a(String str) {
        ContentValues contentValues = this.f39419a;
        if (contentValues == null || !contentValues.containsKey(str) || this.f39419a.getAsBoolean(str) == null) {
            return false;
        }
        return this.f39419a.getAsBoolean(str).booleanValue();
    }

    public static a b(boolean z) {
        return new a(z);
    }

    public static class a {
        private ContentValues e;

        private a(boolean z) {
            c().put("needCheckAppAuth", Boolean.valueOf(z));
        }

        public a d(String str) {
            c().put("packageName", str);
            return this;
        }

        public a b(String str) {
            c().put("dataFilter", str);
            return this;
        }

        public a d(boolean z) {
            c().put("withoutDefaultZero", Boolean.valueOf(z));
            return this;
        }

        public a a(String str) {
            c().put("metadataFilter", str);
            return this;
        }

        public a d(Integer num) {
            c().put("deleteType", num);
            return this;
        }

        public a e(String str) {
            c().put("deleteDeviceUuid", str);
            return this;
        }

        public a c(Integer num) {
            c().put("deleteLevel", num);
            return this;
        }

        public a e(Integer num) {
            c().put("deleteInterval", num);
            return this;
        }

        public a a(Integer num) {
            c().put("sequenceDataType", num);
            return this;
        }

        public a c(boolean z) {
            c().put("lastDayDetail", Boolean.valueOf(z));
            return this;
        }

        public a b(boolean z) {
            c().put("isGroupByTime", Boolean.valueOf(z));
            return this;
        }

        public kth d() {
            return new kth(this.e);
        }

        private ContentValues c() {
            if (this.e == null) {
                this.e = new ContentValues();
            }
            return this.e;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HiDataReadOp{");
        stringBuffer.append(this.f39419a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
