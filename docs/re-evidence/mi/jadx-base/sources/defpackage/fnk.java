package defpackage;

import com.permissionx.guolindev.request.BaseTask;

/* JADX INFO: loaded from: classes6.dex */
public class fnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseTask f17961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseTask f17962b;

    public void a(BaseTask baseTask) {
        if (this.f17961a == null) {
            this.f17961a = baseTask;
        }
        BaseTask baseTask2 = this.f17962b;
        if (baseTask2 != null) {
            baseTask2.next = baseTask;
        }
        this.f17962b = baseTask;
    }

    public void b() {
        this.f17961a.request();
    }
}
