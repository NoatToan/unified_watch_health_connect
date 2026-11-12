package defpackage;

import android.content.Context;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.featureuserprofile.media.account.AccountReader;

/* JADX INFO: loaded from: classes23.dex */
public class cwo implements UserInfoMedia {
    private static cwo e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31445a;

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia
    public UserInfoMedia.UserInfoWriter obtainWriter() {
        return null;
    }

    private cwo(Context context) {
        this.f31445a = context;
    }

    public static cwo c(Context context) {
        cwo cwoVar;
        synchronized (cwo.class) {
            if (e == null) {
                e = new cwo(context);
            }
            cwoVar = e;
        }
        return cwoVar;
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia
    public UserInfoMedia.UserInfoReader obtainReader() {
        return new AccountReader(this.f31445a);
    }
}
