package ro1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lro1/g;", "", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    FACEBOOK("com.facebook.katana"),
    MESSENGER("com.facebook.orca"),
    INSTAGRAM("com.instagram.android"),
    LINE("jp.naver.line.android"),
    WECHAT("com.tencent.mm"),
    QQ_FRIEND("com.tencent.mobileqq"),
    WEIBO("com.sina.weibo"),
    QQ_ZONE("com.qzone"),
    KAKAO_TALK("com.kakao.talk"),
    KAKAO_STORY("com.kakao.story"),
    NAVER_BLOG("com.nhn.android.blog"),
    NAVER_BAND("com.nhn.android.band"),
    WHATSAPP("com.whatsapp"),
    ZALO("com.zing.zalo");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153956a;

    g(String str) {
        this.f153956a = str;
    }
}
