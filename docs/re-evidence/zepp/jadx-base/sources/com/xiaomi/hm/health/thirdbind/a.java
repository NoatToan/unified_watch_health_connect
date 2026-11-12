package com.xiaomi.hm.health.thirdbind;

import android.content.Context;
import com.huami.account.HMLoginManager;
import com.huami.thirdparty.webauth.ThirdBind;
import com.huami.thirdparty.webauth.TokenInfo;
import com.huami.watch.companion.BuildConfig;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportXiaoAiKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
class a {
    public static final String b = "weixin";
    public static final String c = "qq";
    public static final String d = "google_fit";
    public static final String e = "alipay";
    public static final String f = "strava";
    public static final String g = "lvmi";
    public static final String h = "alexa";
    public static final String i = "miui";
    public static final String j = "relive";
    private Context a;

    public a(Context mContext) {
        this.a = mContext;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163  */
    /* JADX WARN: Code duplicated, block: B:60:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee A[SYNTHETIC] */
    public ArrayList<ThirdAppItem> a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean zNeedShowMiAi;
        boolean z4;
        boolean z5;
        ArrayList<ThirdAppItem> arrayList = new ArrayList<>();
        boolean zIsBuildMidong = GlobalConfig.get().isBuildMidong();
        boolean z6 = false;
        boolean z7 = true;
        if (!GlobalConfig.get().isBuildPlay()) {
            if (HMLoginManager.isUnknown() || HMLoginManager.isInMainland()) {
                z = true;
                z2 = true;
                z3 = false;
            }
            zNeedShowMiAi = CheckDeviceSupportXiaoAiKt.needShowMiAi(this.a);
            if (DeviceUtil.isSupportLvMi(this.a)) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (zIsBuildMidong) {
                z = false;
            }
            if (GlobalConfig.get().isBuildAmazfit()) {
                z2 = false;
            }
            arrayList.add(new ThirdAppItem("weixin", this.a.getString(R.string.bind_weixin), R.drawable.ico_wechat));
            if (z) {
                arrayList.add(new ThirdAppItem("qq", this.a.getString(R.string.bind_qq), R.drawable.ico_qq));
            }
            if (z2) {
                arrayList.add(new ThirdAppItem("alipay", this.a.getString(R.string.bind_alipay), R.drawable.ico_alipay));
            }
            if (z3) {
                arrayList.add(new ThirdAppItem(d, this.a.getString(R.string.bind_google_fit), R.drawable.ico_google));
            }
            if (zNeedShowMiAi) {
                arrayList.add(new ThirdAppItem("miui", this.a.getString(R.string.mi_account), R.drawable.ic_third_party_mi));
            }
            if (HMLoginManager.isMainlandUser()) {
                z5 = false;
                for (TokenInfo tokenInfo : ThirdBind.INSTANCE.getTokenList(BuildConfig.STRAVA_THIRD_NAME, com.xiaomi.hm.health.BuildConfig.RELIVE_THIRD_NAME)) {
                    if (tokenInfo.getThirdName().equals(BuildConfig.STRAVA_THIRD_NAME)) {
                        z6 = true;
                    } else if (tokenInfo.getThirdName().equals(com.xiaomi.hm.health.BuildConfig.RELIVE_THIRD_NAME)) {
                        z5 = true;
                    }
                }
                z7 = z6;
            } else {
                z5 = true;
            }
            if (z7) {
                arrayList.add(new ThirdAppItem(f, this.a.getString(R.string.sync_data_3th_party_strava), R.drawable.ic_strava));
            }
            if (z5) {
                arrayList.add(new ThirdAppItem(j, this.a.getString(R.string.relive), R.drawable.icon_circle_relive));
            }
            if (z4) {
                arrayList.add(new ThirdAppItem(g, this.a.getString(R.string.lvmi_str), R.drawable.ic_lvmi));
            }
            if (CheckDeviceSupportAlexaKt.isDeviceSupportAlexa(this.a)) {
                arrayList.add(new ThirdAppItem(h, this.a.getString(R.string.third_part_amazon_name), R.drawable.third_party_logo_alexa_round));
            }
            return arrayList;
        }
        if (!HMLoginManager.isUnknown() && !HMLoginManager.isInNonContinental()) {
            z = true;
            z2 = true;
        }
        z3 = true;
        zNeedShowMiAi = CheckDeviceSupportXiaoAiKt.needShowMiAi(this.a);
        if (DeviceUtil.isSupportLvMi(this.a) || zIsBuildMidong) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (zIsBuildMidong) {
            z = false;
        }
        if (GlobalConfig.get().isBuildAmazfit()) {
            z2 = false;
        }
        arrayList.add(new ThirdAppItem("weixin", this.a.getString(R.string.bind_weixin), R.drawable.ico_wechat));
        if (z) {
            arrayList.add(new ThirdAppItem("qq", this.a.getString(R.string.bind_qq), R.drawable.ico_qq));
        }
        if (z2) {
            arrayList.add(new ThirdAppItem("alipay", this.a.getString(R.string.bind_alipay), R.drawable.ico_alipay));
        }
        if (z3) {
            arrayList.add(new ThirdAppItem(d, this.a.getString(R.string.bind_google_fit), R.drawable.ico_google));
        }
        if (zNeedShowMiAi) {
            arrayList.add(new ThirdAppItem("miui", this.a.getString(R.string.mi_account), R.drawable.ic_third_party_mi));
        }
        if (HMLoginManager.isMainlandUser()) {
            z5 = true;
        } else {
            z5 = false;
            while (r1.hasNext()) {
                if (tokenInfo.getThirdName().equals(BuildConfig.STRAVA_THIRD_NAME)) {
                    z6 = true;
                } else if (tokenInfo.getThirdName().equals(com.xiaomi.hm.health.BuildConfig.RELIVE_THIRD_NAME)) {
                    z5 = true;
                }
            }
            z7 = z6;
        }
        if (z7) {
            arrayList.add(new ThirdAppItem(f, this.a.getString(R.string.sync_data_3th_party_strava), R.drawable.ic_strava));
        }
        if (z5) {
            arrayList.add(new ThirdAppItem(j, this.a.getString(R.string.relive), R.drawable.icon_circle_relive));
        }
        if (z4) {
            arrayList.add(new ThirdAppItem(g, this.a.getString(R.string.lvmi_str), R.drawable.ic_lvmi));
        }
        if (CheckDeviceSupportAlexaKt.isDeviceSupportAlexa(this.a)) {
            arrayList.add(new ThirdAppItem(h, this.a.getString(R.string.third_part_amazon_name), R.drawable.third_party_logo_alexa_round));
        }
        return arrayList;
        z = false;
        z2 = false;
        z3 = true;
        zNeedShowMiAi = CheckDeviceSupportXiaoAiKt.needShowMiAi(this.a);
        if (DeviceUtil.isSupportLvMi(this.a)) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (zIsBuildMidong) {
            z = false;
        }
        if (GlobalConfig.get().isBuildAmazfit()) {
            z2 = false;
        }
        arrayList.add(new ThirdAppItem("weixin", this.a.getString(R.string.bind_weixin), R.drawable.ico_wechat));
        if (z) {
            arrayList.add(new ThirdAppItem("qq", this.a.getString(R.string.bind_qq), R.drawable.ico_qq));
        }
        if (z2) {
            arrayList.add(new ThirdAppItem("alipay", this.a.getString(R.string.bind_alipay), R.drawable.ico_alipay));
        }
        if (z3) {
            arrayList.add(new ThirdAppItem(d, this.a.getString(R.string.bind_google_fit), R.drawable.ico_google));
        }
        if (zNeedShowMiAi) {
            arrayList.add(new ThirdAppItem("miui", this.a.getString(R.string.mi_account), R.drawable.ic_third_party_mi));
        }
        if (HMLoginManager.isMainlandUser()) {
            z5 = true;
        } else {
            z5 = false;
            while (r1.hasNext()) {
                if (tokenInfo.getThirdName().equals(BuildConfig.STRAVA_THIRD_NAME)) {
                    z6 = true;
                } else if (tokenInfo.getThirdName().equals(com.xiaomi.hm.health.BuildConfig.RELIVE_THIRD_NAME)) {
                    z5 = true;
                }
            }
            z7 = z6;
        }
        if (z7) {
            arrayList.add(new ThirdAppItem(f, this.a.getString(R.string.sync_data_3th_party_strava), R.drawable.ic_strava));
        }
        if (z5) {
            arrayList.add(new ThirdAppItem(j, this.a.getString(R.string.relive), R.drawable.icon_circle_relive));
        }
        if (z4) {
            arrayList.add(new ThirdAppItem(g, this.a.getString(R.string.lvmi_str), R.drawable.ic_lvmi));
        }
        if (CheckDeviceSupportAlexaKt.isDeviceSupportAlexa(this.a)) {
            arrayList.add(new ThirdAppItem(h, this.a.getString(R.string.third_part_amazon_name), R.drawable.third_party_logo_alexa_round));
        }
        return arrayList;
    }
}
