package defpackage;

import android.content.Context;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class cwn implements UserInfoMedia {
    private static cwn e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31444a;

    private cwn(Context context) {
        this.f31444a = context;
    }

    public static cwn c(Context context) {
        cwn cwnVar;
        synchronized (cwn.class) {
            if (e == null) {
                e = new cwn(context);
            }
            cwnVar = e;
        }
        return cwnVar;
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia
    public UserInfoMedia.UserInfoReader obtainReader() {
        return new cwu(this.f31444a);
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia
    public UserInfoMedia.UserInfoWriter obtainWriter() {
        return new cws(this.f31444a);
    }

    public UserInfoMedia.UserInfoWriter a(int i) {
        if (i == 1) {
            cws cwsVar = new cws(this.f31444a);
            cwsVar.a(268435456);
            return cwsVar;
        }
        if (i == 2) {
            cws cwsVar2 = new cws(this.f31444a);
            cwsVar2.a(536870912);
            return cwsVar2;
        }
        LogUtil.j("HiHealthMedia", "obtainCustomeWriter only support two types");
        return null;
    }
}
