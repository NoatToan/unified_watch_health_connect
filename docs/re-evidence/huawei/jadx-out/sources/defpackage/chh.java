package defpackage;

import com.huawei.hihealth.HiUserInfo;
import com.huawei.up.model.UserInfomation;

/* JADX INFO: loaded from: classes4.dex */
public class chh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f1602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1603c;
    private float d;
    private int e;

    private float a(float f) {
        if (f <= 0.0f) {
            return 60.0f;
        }
        if (f < 30.0f) {
            return 30.0f;
        }
        if (f > 250.0f) {
            return 250.0f;
        }
        return f;
    }

    private int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return (i == -1 || i == 2) ? -1 : 1;
    }

    private float d(float f) {
        if (f <= 0.0f) {
            return 1.7f;
        }
        if (f > 0.0f && f < 0.5f) {
            return 0.5f;
        }
        if (f > 2.5f) {
            return 2.5f;
        }
        return f;
    }

    public chh(c cVar) {
        this.f1603c = b(cVar.d);
        this.f1602b = d(cVar.f1606c);
        this.d = a(cVar.f1605b);
        this.f1601a = a(cVar.f1604a);
        this.e = cVar.e;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f1605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1606c;
        private int d;
        private int e;

        public c c(int i) {
            this.d = i;
            return this;
        }

        public c c(float f) {
            this.f1605b = f;
            return this;
        }

        public c e(float f) {
            this.f1606c = f;
            return this;
        }

        public c b(int i) {
            this.f1604a = i;
            return this;
        }

        public chh c() {
            return new chh(this);
        }
    }

    public int b() {
        return b(this.f1603c);
    }

    public float e() {
        return a(this.d);
    }

    public float d() {
        return d(this.f1602b);
    }

    public int a() {
        return a(this.f1601a);
    }

    public int c() {
        return this.e;
    }

    public static chh a(UserInfomation userInfomation) {
        c cVar = new c();
        if (userInfomation != null) {
            int gender = 1;
            if (userInfomation.getGender() != 0) {
                gender = userInfomation.getGender() == 1 ? 0 : userInfomation.getGender();
            }
            cVar.c(userInfomation.getAge()).e(userInfomation.getHeight() / 100.0f).c(userInfomation.getWeight()).b(gender);
        }
        return cVar.c();
    }

    private int b(int i) {
        if (i <= 0) {
            return new HiUserInfo().getAgeOrDefaultValue();
        }
        if (i < 16) {
            return 16;
        }
        return Math.min(i, 80);
    }
}
