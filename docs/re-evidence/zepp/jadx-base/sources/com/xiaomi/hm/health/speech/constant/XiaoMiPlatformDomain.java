package com.xiaomi.hm.health.speech.constant;

import androidx.core.app.NotificationCompat;
import com.huami.sky.lib.constant.WebConstant;

/* JADX INFO: loaded from: classes21.dex */
public enum XiaoMiPlatformDomain {
    DEFAULT("default"),
    NOSENSE("nosense"),
    Music(WebConstant.QueryParam.TYPE_MUSIC),
    SOUNDBOXCONTROL("soundboxcontrol"),
    MICHAT("michat"),
    PHONECALL("phonecall"),
    MOBILEAPP("mobileapp"),
    STATION("station"),
    WEATHER("weather"),
    ALARM("alarm"),
    REMINDER(NotificationCompat.CATEGORY_REMINDER),
    VOICE("voice"),
    TIME("time"),
    QABOT("qabot"),
    SEARCH("search"),
    MOBILECONTROL("mobilecontrol"),
    SONGLIST("songlist"),
    Arith("arith"),
    TRANSLATION("translation"),
    JOKE("joke"),
    SHOPPING("shopping"),
    STOCK("stock"),
    EXCHRATE("exchrate"),
    RESTRICTDRIVING("restrictDriving"),
    BAIKE("baike"),
    MOBILEVIDEO("mobilevideo"),
    SMARTMIOT("smartMiot"),
    INTERNALPLATFORM("internal-platform"),
    CONSTELLATION("constellation"),
    ANCIENTPOEM("ancientPoem"),
    LBS("lbs"),
    PERSON(NotificationCompat.MessagingStyle.Message.KEY_PERSON);

    private String domainDesc;

    XiaoMiPlatformDomain(String domainDesc) {
        this.domainDesc = domainDesc;
    }

    public static XiaoMiPlatformDomain findCorrespondDomainByDomainDesc(String domainDesc) {
        XiaoMiPlatformDomain xiaoMiPlatformDomain = DEFAULT;
        for (XiaoMiPlatformDomain xiaoMiPlatformDomain2 : values()) {
            if (domainDesc.equals(xiaoMiPlatformDomain2.getDomainDesc())) {
                xiaoMiPlatformDomain = xiaoMiPlatformDomain2;
            }
        }
        return xiaoMiPlatformDomain;
    }

    public String getDomainDesc() {
        return this.domainDesc;
    }
}
