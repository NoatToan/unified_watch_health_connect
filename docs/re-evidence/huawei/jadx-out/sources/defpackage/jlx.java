package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes10.dex */
public class jlx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gxt f38712b;
    private Activity d;

    public jlx(Activity activity) {
        this.d = activity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    public void c(String str, int i, String str2, Uri uri) {
        byte b2;
        gxt gxtVar = new gxt(8);
        this.f38712b = gxtVar;
        gxtVar.h(str);
        int i2 = 1;
        this.f38712b.d(1);
        if (i == 264 || i == 258) {
            this.f38712b.d(6);
        }
        this.f38712b.e((String) null);
        this.f38712b.b((String) null);
        this.f38712b.f((String) null);
        str2.hashCode();
        switch (str2) {
            case "shareWeBo":
                b2 = 0;
                break;
            case "shareXHS":
                b2 = 1;
                break;
            case "shareDouYin":
                b2 = 2;
                break;
            case "shareWeChatFriend":
                b2 = 3;
                break;
            case "shareSystem":
                b2 = 4;
                break;
            case "shareWeChat":
                b2 = 5;
                break;
            case "sharefamily":
                b2 = 6;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            i2 = 3;
        } else if (b2 == 1) {
            i2 = 10;
        } else if (b2 == 2) {
            i2 = 11;
        } else if (b2 != 3) {
            if (b2 != 4) {
                i2 = b2 != 6 ? 2 : 6;
            } else {
                i2 = 5;
            }
        }
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(this.d, i2, this.f38712b);
    }
}
