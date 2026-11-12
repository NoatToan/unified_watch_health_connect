package defpackage;

import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.up.model.UserInfomation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class dac {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<UserInfoMedia.UserInfoReader.Callback> f31570b = new ArrayList();

    public void b(UserInfoMedia.UserInfoReader.Callback callback) {
        synchronized (e) {
            this.f31570b.add(callback);
        }
    }

    private void a(int i, UserInfomation userInfomation) {
        synchronized (e) {
            for (UserInfoMedia.UserInfoReader.Callback callback : this.f31570b) {
                if (i == 0) {
                    callback.onSuccess(userInfomation);
                } else {
                    callback.onFail(i);
                }
            }
            this.f31570b.clear();
        }
    }

    public void d() {
        synchronized (e) {
            Iterator<UserInfoMedia.UserInfoReader.Callback> it = this.f31570b.iterator();
            while (it.hasNext()) {
                it.next().onFail(-1);
            }
            this.f31570b.clear();
        }
    }

    public void c(int i, UserInfomation userInfomation) {
        synchronized (e) {
            a(i, userInfomation);
        }
    }
}
