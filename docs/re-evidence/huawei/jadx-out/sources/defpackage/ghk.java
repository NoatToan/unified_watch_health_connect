package defpackage;

import com.huawei.basefitnessadvice.model.intplan.UserProfile;
import com.huawei.health.plan.model.intplan.UserProfileBean;

/* JADX INFO: loaded from: classes29.dex */
public class ghk implements UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f35121c;
    private int d;
    private int e;

    @Override // com.huawei.basefitnessadvice.model.intplan.UserProfile
    public int getGender() {
        return this.e;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.UserProfile
    public int getAge() {
        return this.d;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.UserProfile
    public int getHeight() {
        return this.f35120b;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.UserProfile
    public float getWeight() {
        return this.f35121c;
    }

    @Override // com.huawei.basefitnessadvice.model.intplan.UserProfile
    public float getBfr() {
        return this.f35119a;
    }

    public void a(int i) {
        this.e = i;
    }

    public void c(int i) {
        this.d = i;
    }

    public void b(int i) {
        this.f35120b = i;
    }

    public void b(float f) {
        this.f35121c = f;
    }

    public void c(float f) {
        this.f35119a = f;
    }

    public ghk d(UserProfileBean userProfileBean) {
        if (userProfileBean != null) {
            c(userProfileBean.getAge());
            c(userProfileBean.getBfr());
            a(userProfileBean.getGender());
            b(userProfileBean.getHeight());
            b(userProfileBean.getWeight());
        }
        return this;
    }
}
